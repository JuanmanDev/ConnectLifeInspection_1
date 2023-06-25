package androidx.test.espresso.base;

import android.os.Binder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Throwables;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Interrogator {
    public static final int LOOKAHEAD_MILLIS = 15;
    public static final String TAG = "Interrogator";
    public static final ThreadLocal<Boolean> interrogating = new ThreadLocal<Boolean>() {
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    public static final Field messageQueueHeadField;
    public static final Method messageQueueNextMethod;
    public static final Method recycleUncheckedMethod;

    public interface InterrogationHandler<R> extends QueueInterrogationHandler<R> {
        boolean beforeTaskDispatch();

        void quitting();
    }

    public interface QueueInterrogationHandler<R> {
        boolean barrierUp();

        R get();

        boolean queueEmpty();

        boolean taskDueLong();

        boolean taskDueSoon();
    }

    static {
        try {
            Method declaredMethod = MessageQueue.class.getDeclaredMethod("next", new Class[0]);
            messageQueueNextMethod = declaredMethod;
            declaredMethod.setAccessible(true);
            Field declaredField = MessageQueue.class.getDeclaredField("mMessages");
            messageQueueHeadField = declaredField;
            declaredField.setAccessible(true);
            Method method = null;
            try {
                method = Message.class.getDeclaredMethod("recycleUnchecked", new Class[0]);
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            recycleUncheckedMethod = method;
        } catch (IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Could not initialize interrogator!", e);
        }
    }

    public static void checkSanity() {
        Preconditions.checkState(Looper.myLooper() != null, "Calling non-looper thread!");
        Preconditions.checkState(Boolean.FALSE.equals(interrogating.get()), "Already interrogating!");
    }

    public static Message getNextMessage() {
        try {
            return (Message) messageQueueNextMethod.invoke(Looper.myQueue(), new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException e) {
            Throwables.throwIfUnchecked(e);
            throw new RuntimeException(e);
        }
    }

    public static boolean interrogateQueueState(MessageQueue messageQueue, QueueInterrogationHandler<?> queueInterrogationHandler) {
        synchronized (messageQueue) {
            try {
                Message message = (Message) messageQueueHeadField.get(messageQueue);
                if (message == null) {
                    boolean queueEmpty = queueInterrogationHandler.queueEmpty();
                    return queueEmpty;
                } else if (message.getTarget() == null) {
                    boolean isLoggable = Log.isLoggable(TAG, 3);
                    boolean barrierUp = queueInterrogationHandler.barrierUp();
                    return barrierUp;
                } else {
                    long when = message.getWhen();
                    long uptimeMillis = SystemClock.uptimeMillis() + 15;
                    if (Log.isLoggable(TAG, 3)) {
                        boolean z = uptimeMillis < when;
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("headWhen: ");
                        sb.append(when);
                        sb.append(" nowFuz: ");
                        sb.append(uptimeMillis);
                        sb.append(" due long: ");
                        sb.append(z);
                        sb.toString();
                    }
                    if (uptimeMillis > when) {
                        boolean taskDueSoon = queueInterrogationHandler.taskDueSoon();
                        return taskDueSoon;
                    }
                    boolean taskDueLong = queueInterrogationHandler.taskDueLong();
                    return taskDueLong;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <R> R loopAndInterrogate(InterrogationHandler<R> interrogationHandler) {
        checkSanity();
        interrogating.set(Boolean.TRUE);
        MessageQueue myQueue = Looper.myQueue();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            long clearCallingIdentity2 = Binder.clearCallingIdentity();
            boolean z = true;
            while (z) {
                z = interrogateQueueState(myQueue, interrogationHandler);
                if (z) {
                    Message nextMessage = getNextMessage();
                    if (nextMessage == null) {
                        interrogationHandler.quitting();
                        return interrogationHandler.get();
                    }
                    boolean beforeTaskDispatch = interrogationHandler.beforeTaskDispatch();
                    nextMessage.getTarget().dispatchMessage(nextMessage);
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    if (clearCallingIdentity3 != clearCallingIdentity2) {
                        String hexString = Long.toHexString(clearCallingIdentity2);
                        String hexString2 = Long.toHexString(clearCallingIdentity3);
                        String name = nextMessage.getTarget().getClass().getName();
                        String valueOf = String.valueOf(nextMessage.getCallback());
                        int i = nextMessage.what;
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 77 + String.valueOf(hexString2).length() + String.valueOf(name).length() + String.valueOf(valueOf).length());
                        sb.append("Thread identity changed from 0x");
                        sb.append(hexString);
                        sb.append(" to 0x");
                        sb.append(hexString2);
                        sb.append(" while dispatching to ");
                        sb.append(name);
                        sb.append(" ");
                        sb.append(valueOf);
                        sb.append(" what=");
                        sb.append(i);
                        Log.wtf(TAG, sb.toString());
                    }
                    recycle(nextMessage);
                    z = beforeTaskDispatch;
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            interrogating.set(Boolean.FALSE);
            return interrogationHandler.get();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            interrogating.set(Boolean.FALSE);
        }
    }

    public static <R> R peekAtQueueState(MessageQueue messageQueue, QueueInterrogationHandler<R> queueInterrogationHandler) {
        Preconditions.checkNotNull(messageQueue);
        Preconditions.checkNotNull(queueInterrogationHandler);
        Preconditions.checkState(!interrogateQueueState(messageQueue, queueInterrogationHandler), "It is expected that %s would stop interrogation after a single peak at the queue.", (Object) queueInterrogationHandler);
        return queueInterrogationHandler.get();
    }

    public static void recycle(Message message) {
        Method method = recycleUncheckedMethod;
        if (method != null) {
            try {
                method.invoke(message, new Object[0]);
            } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
                Throwables.throwIfUnchecked(e);
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() != null) {
                    Throwables.throwIfUnchecked(e2.getCause());
                    throw new RuntimeException(e2.getCause());
                }
                throw new RuntimeException(e2);
            }
        } else {
            message.recycle();
        }
    }
}
