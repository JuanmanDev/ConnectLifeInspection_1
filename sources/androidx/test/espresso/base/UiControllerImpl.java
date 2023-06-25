package androidx.test.espresso.base;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.test.espresso.IdlingPolicies;
import androidx.test.espresso.IdlingPolicy;
import androidx.test.espresso.InjectEventSecurityException;
import androidx.test.espresso.base.IdlingResourceRegistry;
import androidx.test.espresso.base.Interrogator;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Throwables;
import androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p625h.p626a.C9381a;

public final class UiControllerImpl implements Handler.Callback, IdlingUiController, InterruptableUiController {
    public static final Callable<Void> NO_OP = new Callable<Void>() {
        public Void call() {
            return null;
        }
    };
    public static final String TAG = UiControllerImpl.class.getSimpleName();
    public IdleNotifier<Runnable> asyncIdle;
    public IdleNotifier<Runnable> compatIdle;
    public final BitSet conditionSet;
    public Handler controllerHandler;
    public C9381a<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> dynamicIdleProvider;
    public final EventInjector eventInjector;
    public int generation = 0;
    public final IdlingResourceRegistry idlingResourceRegistry;
    public MainThreadInterrogation interrogation;
    public final ExecutorService keyEventExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("Espresso Key Event #%d").build());
    public final Looper mainLooper;

    public enum IdleCondition {
        DELAY_HAS_PAST,
        ASYNC_TASKS_HAVE_IDLED,
        COMPAT_TASKS_HAVE_IDLED,
        KEY_INJECT_HAS_COMPLETED,
        MOTION_INJECTION_HAS_COMPLETED,
        DYNAMIC_TASKS_HAVE_IDLED;

        public static BitSet createConditionSet() {
            return new BitSet(values().length);
        }

        public static boolean handleMessage(Message message, BitSet bitSet, int i) {
            IdleCondition[] values = values();
            int i2 = message.what;
            if (i2 < 0 || i2 >= values.length) {
                return false;
            }
            IdleCondition idleCondition = values[i2];
            if (message.arg1 == i) {
                idleCondition.signal(bitSet);
                return true;
            }
            String unused = UiControllerImpl.TAG;
            String valueOf = String.valueOf(idleCondition);
            int i3 = message.arg1;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90);
            sb.append("ignoring signal of: ");
            sb.append(valueOf);
            sb.append(" from previous generation: ");
            sb.append(i3);
            sb.append(" current generation: ");
            sb.append(i);
            sb.toString();
            return true;
        }

        public Message createSignal(Handler handler, int i) {
            return Message.obtain(handler, ordinal(), i, 0, (Object) null);
        }

        public boolean isSignaled(BitSet bitSet) {
            return bitSet.get(ordinal());
        }

        public void reset(BitSet bitSet) {
            bitSet.set(ordinal(), false);
        }

        public void signal(BitSet bitSet) {
            bitSet.set(ordinal());
        }
    }

    public enum InterrogationStatus {
        TIMED_OUT,
        COMPLETED,
        INTERRUPTED
    }

    public static final class MainThreadInterrogation implements Interrogator.InterrogationHandler<InterrogationStatus> {
        public final BitSet conditionSet;
        public final EnumSet<IdleCondition> conditions;
        public int execCount = 0;
        public final long giveUpAtMs;
        public InterrogationStatus status = InterrogationStatus.COMPLETED;

        public MainThreadInterrogation(EnumSet<IdleCondition> enumSet, BitSet bitSet, long j) {
            this.conditions = enumSet;
            this.conditionSet = bitSet;
            this.giveUpAtMs = j;
        }

        private boolean conditionsMet() {
            boolean z = true;
            if (InterrogationStatus.INTERRUPTED == this.status) {
                return true;
            }
            int i = this.execCount;
            boolean z2 = i > 0 && i % 100 == 0;
            Iterator it = this.conditions.iterator();
            while (it.hasNext()) {
                IdleCondition idleCondition = (IdleCondition) it.next();
                if (!idleCondition.isSignaled(this.conditionSet)) {
                    if (!z2) {
                        return false;
                    }
                    String unused = UiControllerImpl.TAG;
                    String name = idleCondition.name();
                    int i2 = this.execCount;
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 41);
                    sb.append("Waiting for: ");
                    sb.append(name);
                    sb.append(" for ");
                    sb.append(i2);
                    sb.append(" iterations.");
                    sb.toString();
                    z = false;
                }
            }
            return z;
        }

        private boolean continueOrTimeout() {
            if (InterrogationStatus.INTERRUPTED == this.status) {
                return false;
            }
            if (SystemClock.uptimeMillis() < this.giveUpAtMs) {
                return true;
            }
            this.status = InterrogationStatus.TIMED_OUT;
            return false;
        }

        public boolean barrierUp() {
            return continueOrTimeout();
        }

        public boolean beforeTaskDispatch() {
            this.execCount++;
            return continueOrTimeout();
        }

        public void interruptInterrogation() {
            this.status = InterrogationStatus.INTERRUPTED;
        }

        public boolean queueEmpty() {
            return !conditionsMet();
        }

        public void quitting() {
        }

        public boolean taskDueLong() {
            return !conditionsMet();
        }

        public boolean taskDueSoon() {
            return continueOrTimeout();
        }

        public InterrogationStatus get() {
            return this.status;
        }
    }

    public class SignalingTask<T> extends FutureTask<T> {
        public final IdleCondition condition;
        public final int myGeneration;

        public SignalingTask(Callable<T> callable, IdleCondition idleCondition, int i) {
            super(callable);
            this.condition = (IdleCondition) Preconditions.checkNotNull(idleCondition);
            this.myGeneration = i;
        }

        public void done() {
            UiControllerImpl.this.controllerHandler.sendMessage(this.condition.createSignal(UiControllerImpl.this.controllerHandler, this.myGeneration));
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, h.a.a<androidx.test.espresso.base.IdleNotifier<androidx.test.espresso.base.IdlingResourceRegistry$IdleNotificationCallback>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UiControllerImpl(androidx.test.espresso.base.EventInjector r3, @androidx.test.espresso.base.SdkAsyncTask androidx.test.espresso.base.IdleNotifier<java.lang.Runnable> r4, @androidx.test.espresso.base.CompatAsyncTask androidx.test.espresso.base.IdleNotifier<java.lang.Runnable> r5, p625h.p626a.C9381a<androidx.test.espresso.base.IdleNotifier<androidx.test.espresso.base.IdlingResourceRegistry.IdleNotificationCallback>> r6, android.os.Looper r7, androidx.test.espresso.base.IdlingResourceRegistry r8) {
        /*
            r2 = this;
            r2.<init>()
            androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder r0 = new androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder
            r0.<init>()
            java.lang.String r1 = "Espresso Key Event #%d"
            androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder r0 = r0.setNameFormat(r1)
            java.util.concurrent.ThreadFactory r0 = r0.build()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r2.keyEventExecutor = r0
            r0 = 0
            r2.generation = r0
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r3)
            androidx.test.espresso.base.EventInjector r3 = (androidx.test.espresso.base.EventInjector) r3
            r2.eventInjector = r3
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r4)
            androidx.test.espresso.base.IdleNotifier r3 = (androidx.test.espresso.base.IdleNotifier) r3
            r2.asyncIdle = r3
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r5)
            androidx.test.espresso.base.IdleNotifier r3 = (androidx.test.espresso.base.IdleNotifier) r3
            r2.compatIdle = r3
            java.util.BitSet r3 = androidx.test.espresso.base.UiControllerImpl.IdleCondition.createConditionSet()
            r2.conditionSet = r3
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r6)
            h.a.a r3 = (p625h.p626a.C9381a) r3
            r2.dynamicIdleProvider = r3
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r7)
            android.os.Looper r3 = (android.os.Looper) r3
            r2.mainLooper = r3
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r8)
            androidx.test.espresso.base.IdlingResourceRegistry r3 = (androidx.test.espresso.base.IdlingResourceRegistry) r3
            r2.idlingResourceRegistry = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.base.UiControllerImpl.<init>(androidx.test.espresso.base.EventInjector, androidx.test.espresso.base.IdleNotifier, androidx.test.espresso.base.IdleNotifier, h.a.a, android.os.Looper, androidx.test.espresso.base.IdlingResourceRegistry):void");
    }

    @SuppressLint({"InlinedApi"})
    public static KeyCharacterMap getKeyCharacterMap() {
        if (Build.VERSION.SDK_INT < 11) {
            return KeyCharacterMap.load(0);
        }
        return KeyCharacterMap.load(-1);
    }

    private void initialize() {
        if (this.controllerHandler == null) {
            this.controllerHandler = new Handler(this);
        }
    }

    private void loopUntil(IdleCondition idleCondition, IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback> idleNotifier) {
        loopUntil((EnumSet<IdleCondition>) EnumSet.of(idleCondition), idleNotifier);
    }

    public IdlingResourceRegistry getIdlingResourceRegistry() {
        return this.idlingResourceRegistry;
    }

    public boolean handleMessage(Message message) {
        if (IdleCondition.handleMessage(message, this.conditionSet, this.generation)) {
            return true;
        }
        String valueOf = String.valueOf(message);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Unknown message type: ");
        sb.append(valueOf);
        sb.toString();
        return false;
    }

    public boolean injectKeyEvent(final KeyEvent keyEvent) {
        Preconditions.checkNotNull(keyEvent);
        Preconditions.checkState(Looper.myLooper() == this.mainLooper, "Expecting to be on main thread!");
        initialize();
        loopMainThreadUntilIdle();
        SignalingTask signalingTask = new SignalingTask(new Callable<Boolean>() {
            public Boolean call() {
                return Boolean.valueOf(UiControllerImpl.this.eventInjector.injectKeyEvent(keyEvent));
            }
        }, IdleCondition.KEY_INJECT_HAS_COMPLETED, this.generation);
        this.keyEventExecutor.submit(signalingTask);
        loopUntil(IdleCondition.KEY_INJECT_HAS_COMPLETED, this.dynamicIdleProvider.get());
        try {
            Preconditions.checkState(signalingTask.isDone(), "Key injection was signaled - but it wasnt done.");
            return ((Boolean) signalingTask.get()).booleanValue();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof InjectEventSecurityException) {
                throw ((InjectEventSecurityException) e.getCause());
            }
            throw new RuntimeException(e.getCause());
        } catch (InterruptedException e2) {
            throw new RuntimeException("impossible.", e2);
        }
    }

    public boolean injectMotionEvent(final MotionEvent motionEvent) {
        Preconditions.checkNotNull(motionEvent);
        Preconditions.checkState(Looper.myLooper() == this.mainLooper, "Expecting to be on main thread!");
        initialize();
        SignalingTask signalingTask = new SignalingTask(new Callable<Boolean>() {
            public Boolean call() {
                return Boolean.valueOf(UiControllerImpl.this.eventInjector.injectMotionEvent(motionEvent));
            }
        }, IdleCondition.MOTION_INJECTION_HAS_COMPLETED, this.generation);
        this.keyEventExecutor.submit(signalingTask);
        loopUntil(IdleCondition.MOTION_INJECTION_HAS_COMPLETED, this.dynamicIdleProvider.get());
        try {
            Preconditions.checkState(signalingTask.isDone(), "Motion event injection was signaled - but it wasnt done.");
            boolean booleanValue = ((Boolean) signalingTask.get()).booleanValue();
            loopMainThreadUntilIdle();
            return booleanValue;
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof InjectEventSecurityException)) {
                Throwables.throwIfUnchecked(e.getCause() != null ? e.getCause() : e);
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                throw new RuntimeException(th);
            }
            throw ((InjectEventSecurityException) e.getCause());
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th2) {
            loopMainThreadUntilIdle();
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Iterable<android.view.MotionEvent>, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean injectMotionEventSequence(java.lang.Iterable<android.view.MotionEvent> r6) {
        /*
            r5 = this;
            androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r6)
            boolean r0 = androidx.test.espresso.core.internal.deps.guava.collect.Iterables.isEmpty(r6)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Expecting non-empty events to inject"
            androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkState(r0, r2)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = r5.mainLooper
            if (r0 != r2) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = "Expecting to be on main thread!"
            androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkState(r1, r0)
            r5.initialize()
            java.util.Iterator r0 = r6.iterator()
            r1 = 0
            java.lang.Object r6 = androidx.test.espresso.core.internal.deps.guava.collect.Iterables.getFirst(r6, r1)
            android.view.MotionEvent r6 = (android.view.MotionEvent) r6
            long r1 = r6.getEventTime()
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            androidx.test.espresso.base.UiControllerImpl$SignalingTask r6 = new androidx.test.espresso.base.UiControllerImpl$SignalingTask
            androidx.test.espresso.base.UiControllerImpl$4 r1 = new androidx.test.espresso.base.UiControllerImpl$4
            r1.<init>(r0, r3)
            androidx.test.espresso.base.UiControllerImpl$IdleCondition r0 = androidx.test.espresso.base.UiControllerImpl.IdleCondition.MOTION_INJECTION_HAS_COMPLETED
            int r2 = r5.generation
            r6.<init>(r1, r0, r2)
            java.util.concurrent.ExecutorService r0 = r5.keyEventExecutor
            r0.submit(r6)
            androidx.test.espresso.base.UiControllerImpl$IdleCondition r0 = androidx.test.espresso.base.UiControllerImpl.IdleCondition.MOTION_INJECTION_HAS_COMPLETED
            h.a.a<androidx.test.espresso.base.IdleNotifier<androidx.test.espresso.base.IdlingResourceRegistry$IdleNotificationCallback>> r1 = r5.dynamicIdleProvider
            java.lang.Object r1 = r1.get()
            androidx.test.espresso.base.IdleNotifier r1 = (androidx.test.espresso.base.IdleNotifier) r1
            r5.loopUntil((androidx.test.espresso.base.UiControllerImpl.IdleCondition) r0, (androidx.test.espresso.base.IdleNotifier<androidx.test.espresso.base.IdlingResourceRegistry.IdleNotificationCallback>) r1)
            boolean r0 = r6.isDone()     // Catch:{ ExecutionException -> 0x0074, InterruptedException -> 0x006d }
            java.lang.String r1 = "MotionEvents injection was signaled - but it wasnt done."
            androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkState(r0, r1)     // Catch:{ ExecutionException -> 0x0074, InterruptedException -> 0x006d }
            java.lang.Object r6 = r6.get()     // Catch:{ ExecutionException -> 0x0074, InterruptedException -> 0x006d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ ExecutionException -> 0x0074, InterruptedException -> 0x006d }
            boolean r6 = r6.booleanValue()     // Catch:{ ExecutionException -> 0x0074, InterruptedException -> 0x006d }
            r5.loopMainThreadUntilIdle()
            return r6
        L_0x006b:
            r6 = move-exception
            goto L_0x00a3
        L_0x006d:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x006b }
            r0.<init>(r6)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x0074:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ all -> 0x006b }
            boolean r0 = r0 instanceof androidx.test.espresso.InjectEventSecurityException     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x009c
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0088
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ all -> 0x006b }
            goto L_0x0089
        L_0x0088:
            r0 = r6
        L_0x0089:
            androidx.test.espresso.core.internal.deps.guava.base.Throwables.throwIfUnchecked(r0)     // Catch:{ all -> 0x006b }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x006b }
            java.lang.Throwable r1 = r6.getCause()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0098
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ all -> 0x006b }
        L_0x0098:
            r0.<init>(r6)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x009c:
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ all -> 0x006b }
            androidx.test.espresso.InjectEventSecurityException r6 = (androidx.test.espresso.InjectEventSecurityException) r6     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x00a3:
            r5.loopMainThreadUntilIdle()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.base.UiControllerImpl.injectMotionEventSequence(java.lang.Iterable):boolean");
    }

    public boolean injectString(String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkState(Looper.myLooper() == this.mainLooper, "Expecting to be on main thread!");
        initialize();
        if (str.isEmpty()) {
            return true;
        }
        KeyEvent[] events = getKeyCharacterMap().getEvents(str.toCharArray());
        if (events != null) {
            String.format(Locale.ROOT, "Injecting string: \"%s\"", new Object[]{str});
            int length = events.length;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                KeyEvent keyEvent = events[i];
                Preconditions.checkNotNull(keyEvent, String.format(Locale.ROOT, "Failed to get event for character (%c) with key code (%s)", new Object[]{Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getUnicodeChar())}));
                int i2 = 0;
                KeyEvent keyEvent2 = keyEvent;
                z = false;
                while (!z && i2 < 4) {
                    keyEvent2 = KeyEvent.changeTimeRepeat(keyEvent2, SystemClock.uptimeMillis(), 0);
                    z = injectKeyEvent(keyEvent2);
                    i2++;
                }
                if (!z) {
                    String.format(Locale.ROOT, "Failed to inject event for character (%c) with key code (%s)", new Object[]{Integer.valueOf(keyEvent2.getUnicodeChar()), Integer.valueOf(keyEvent2.getKeyCode())});
                    break;
                }
                i++;
            }
            return z;
        }
        throw new RuntimeException(String.format(Locale.ROOT, "Failed to get key events for string %s (i.e. current IME does not understand how to translate the string into key events). As a workaround, you can use replaceText action to set the text directly in the EditText field.", new Object[]{str}));
    }

    public void interruptEspressoTasks() {
        initialize();
        this.controllerHandler.post(new Runnable() {
            public void run() {
                if (UiControllerImpl.this.interrogation != null) {
                    UiControllerImpl.this.interrogation.interruptInterrogation();
                    UiControllerImpl.this.controllerHandler.removeCallbacksAndMessages(Integer.valueOf(UiControllerImpl.this.generation));
                }
            }
        });
    }

    public void loopMainThreadForAtLeast(long j) {
        initialize();
        boolean z = false;
        Preconditions.checkState(Looper.myLooper() == this.mainLooper, "Expecting to be on main thread!");
        Preconditions.checkState(!IdleCondition.DELAY_HAS_PAST.isSignaled(this.conditionSet), "recursion detected!");
        if (j > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.controllerHandler.postAtTime(new SignalingTask(NO_OP, IdleCondition.DELAY_HAS_PAST, this.generation), Integer.valueOf(this.generation), SystemClock.uptimeMillis() + j);
        loopUntil(IdleCondition.DELAY_HAS_PAST, this.dynamicIdleProvider.get());
        loopMainThreadUntilIdle();
    }

    /* JADX INFO: finally extract failed */
    public void loopMainThreadUntilIdle() {
        initialize();
        Preconditions.checkState(Looper.myLooper() == this.mainLooper, "Expecting to be on main thread!");
        IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback> idleNotifier = this.dynamicIdleProvider.get();
        while (true) {
            EnumSet<E> noneOf = EnumSet.noneOf(IdleCondition.class);
            if (!this.asyncIdle.isIdleNow()) {
                this.asyncIdle.registerNotificationCallback(new SignalingTask(NO_OP, IdleCondition.ASYNC_TASKS_HAVE_IDLED, this.generation));
                noneOf.add(IdleCondition.ASYNC_TASKS_HAVE_IDLED);
            }
            if (!this.compatIdle.isIdleNow()) {
                this.compatIdle.registerNotificationCallback(new SignalingTask(NO_OP, IdleCondition.COMPAT_TASKS_HAVE_IDLED, this.generation));
                noneOf.add(IdleCondition.COMPAT_TASKS_HAVE_IDLED);
            }
            if (!idleNotifier.isIdleNow()) {
                final IdlingPolicy dynamicIdlingResourceWarningPolicy = IdlingPolicies.getDynamicIdlingResourceWarningPolicy();
                final IdlingPolicy dynamicIdlingResourceErrorPolicy = IdlingPolicies.getDynamicIdlingResourceErrorPolicy();
                final SignalingTask signalingTask = new SignalingTask(NO_OP, IdleCondition.DYNAMIC_TASKS_HAVE_IDLED, this.generation);
                idleNotifier.registerNotificationCallback(new IdlingResourceRegistry.IdleNotificationCallback() {
                    public void allResourcesIdle() {
                        UiControllerImpl.this.controllerHandler.post(signalingTask);
                    }

                    public void resourcesHaveTimedOut(List<String> list) {
                        dynamicIdlingResourceErrorPolicy.handleTimeout(list, "IdlingResources have timed out!");
                        UiControllerImpl.this.controllerHandler.post(signalingTask);
                    }

                    public void resourcesStillBusyWarning(List<String> list) {
                        dynamicIdlingResourceWarningPolicy.handleTimeout(list, "IdlingResources are still busy!");
                    }
                });
                noneOf.add(IdleCondition.DYNAMIC_TASKS_HAVE_IDLED);
            }
            try {
                idleNotifier = loopUntil((EnumSet<IdleCondition>) noneOf, idleNotifier);
                this.asyncIdle.cancelCallback();
                this.compatIdle.cancelCallback();
                idleNotifier.cancelCallback();
                if (this.asyncIdle.isIdleNow() && this.compatIdle.isIdleNow() && idleNotifier.isIdleNow()) {
                    return;
                }
            } catch (Throwable th) {
                this.asyncIdle.cancelCallback();
                this.compatIdle.cancelCallback();
                idleNotifier.cancelCallback();
                throw th;
            }
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private androidx.test.espresso.base.IdleNotifier<androidx.test.espresso.base.IdlingResourceRegistry.IdleNotificationCallback> loopUntil(java.util.EnumSet<androidx.test.espresso.base.UiControllerImpl.IdleCondition> r10, androidx.test.espresso.base.IdleNotifier<androidx.test.espresso.base.IdlingResourceRegistry.IdleNotificationCallback> r11) {
        /*
            r9 = this;
            androidx.test.espresso.IdlingPolicy r0 = androidx.test.espresso.IdlingPolicies.getMasterIdlingPolicy()
            r1 = 0
            r2 = 1
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c6 }
            java.util.concurrent.TimeUnit r5 = r0.getIdleTimeoutUnit()     // Catch:{ all -> 0x00c6 }
            long r6 = r0.getIdleTimeout()     // Catch:{ all -> 0x00c6 }
            long r5 = r5.toMillis(r6)     // Catch:{ all -> 0x00c6 }
            long r3 = r3 + r5
            androidx.test.espresso.base.UiControllerImpl$MainThreadInterrogation r5 = new androidx.test.espresso.base.UiControllerImpl$MainThreadInterrogation     // Catch:{ all -> 0x00c6 }
            java.util.BitSet r6 = r9.conditionSet     // Catch:{ all -> 0x00c6 }
            r5.<init>(r10, r6, r3)     // Catch:{ all -> 0x00c6 }
            r9.interrogation = r5     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = androidx.test.espresso.base.Interrogator.loopAndInterrogate(r5)     // Catch:{ all -> 0x00c6 }
            androidx.test.espresso.base.UiControllerImpl$InterrogationStatus r3 = (androidx.test.espresso.base.UiControllerImpl.InterrogationStatus) r3     // Catch:{ all -> 0x00c6 }
            androidx.test.espresso.base.UiControllerImpl$InterrogationStatus r4 = androidx.test.espresso.base.UiControllerImpl.InterrogationStatus.COMPLETED     // Catch:{ all -> 0x00c6 }
            if (r4 != r3) goto L_0x0048
            int r0 = r9.generation
            int r0 = r0 + r2
            r9.generation = r0
            java.util.Iterator r10 = r10.iterator()
        L_0x0033:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r10.next()
            androidx.test.espresso.base.UiControllerImpl$IdleCondition r0 = (androidx.test.espresso.base.UiControllerImpl.IdleCondition) r0
            java.util.BitSet r2 = r9.conditionSet
            r0.reset(r2)
            goto L_0x0033
        L_0x0045:
            r9.interrogation = r1
            return r11
        L_0x0048:
            androidx.test.espresso.base.UiControllerImpl$InterrogationStatus r4 = androidx.test.espresso.base.UiControllerImpl.InterrogationStatus.INTERRUPTED     // Catch:{ all -> 0x00c6 }
            if (r4 == r3) goto L_0x00be
            java.util.ArrayList r3 = androidx.test.espresso.core.internal.deps.guava.collect.Lists.newArrayList()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0054:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00c6 }
            androidx.test.espresso.base.UiControllerImpl$IdleCondition r5 = (androidx.test.espresso.base.UiControllerImpl.IdleCondition) r5     // Catch:{ all -> 0x00c6 }
            java.util.BitSet r6 = r9.conditionSet     // Catch:{ all -> 0x00c6 }
            boolean r6 = r5.isSignaled(r6)     // Catch:{ all -> 0x00c6 }
            if (r6 != 0) goto L_0x0054
            java.lang.String r5 = r5.name()     // Catch:{ all -> 0x00c6 }
            r3.add(r5)     // Catch:{ all -> 0x00c6 }
            goto L_0x0054
        L_0x0070:
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "Looped for %s iterations over %s %s."
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00c6 }
            r7 = 0
            androidx.test.espresso.base.UiControllerImpl$MainThreadInterrogation r8 = r9.interrogation     // Catch:{ all -> 0x00c6 }
            int r8 = r8.execCount     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00c6 }
            r6[r7] = r8     // Catch:{ all -> 0x00c6 }
            long r7 = r0.getIdleTimeout()     // Catch:{ all -> 0x00c6 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00c6 }
            r6[r2] = r7     // Catch:{ all -> 0x00c6 }
            r7 = 2
            java.util.concurrent.TimeUnit r8 = r0.getIdleTimeoutUnit()     // Catch:{ all -> 0x00c6 }
            java.lang.String r8 = r8.name()     // Catch:{ all -> 0x00c6 }
            r6[r7] = r8     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = java.lang.String.format(r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r0.handleTimeout(r3, r4)     // Catch:{ all -> 0x00c6 }
            int r0 = r9.generation
            int r0 = r0 + r2
            r9.generation = r0
            java.util.Iterator r10 = r10.iterator()
        L_0x00a9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r10.next()
            androidx.test.espresso.base.UiControllerImpl$IdleCondition r0 = (androidx.test.espresso.base.UiControllerImpl.IdleCondition) r0
            java.util.BitSet r2 = r9.conditionSet
            r0.reset(r2)
            goto L_0x00a9
        L_0x00bb:
            r9.interrogation = r1
            return r11
        L_0x00be:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "Espresso interrogation of the main thread is interrupted"
            r11.<init>(r0)     // Catch:{ all -> 0x00c6 }
            throw r11     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r11 = move-exception
            int r0 = r9.generation
            int r0 = r0 + r2
            r9.generation = r0
            java.util.Iterator r10 = r10.iterator()
        L_0x00d0:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r10.next()
            androidx.test.espresso.base.UiControllerImpl$IdleCondition r0 = (androidx.test.espresso.base.UiControllerImpl.IdleCondition) r0
            java.util.BitSet r2 = r9.conditionSet
            r0.reset(r2)
            goto L_0x00d0
        L_0x00e2:
            r9.interrogation = r1
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.base.UiControllerImpl.loopUntil(java.util.EnumSet, androidx.test.espresso.base.IdleNotifier):androidx.test.espresso.base.IdleNotifier");
    }
}
