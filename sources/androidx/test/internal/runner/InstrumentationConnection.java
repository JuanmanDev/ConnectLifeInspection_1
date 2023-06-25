package androidx.test.internal.runner;

import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import androidx.test.internal.util.Checks;
import androidx.test.internal.util.LogUtil;
import androidx.test.internal.util.ParcelableIBinder;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.MonitoringInstrumentation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Beta
public class InstrumentationConnection {
    public static final String BROADCAST_FILTER = "androidx.test.runner.InstrumentationConnection.event";
    @VisibleForTesting
    public static final String BUNDLE_BR_NEW_BINDER = "new_instrumentation_binder";
    public static final String BUNDLE_KEY_CLIENTS = "instr_clients";
    public static final String BUNDLE_KEY_CLIENT_MESSENGER = "instr_client_msgr";
    public static final String BUNDLE_KEY_CLIENT_TYPE = "instr_client_type";
    public static final String BUNDLE_KEY_UUID = "instr_uuid";
    public static final InstrumentationConnection DEFAULT_INSTANCE = new InstrumentationConnection(InstrumentationRegistry.getInstrumentation().getTargetContext());
    @VisibleForTesting
    public static final int MSG_ADD_CLIENTS_IN_BUNDLE = 6;
    @VisibleForTesting
    public static final int MSG_ADD_INSTRUMENTATION = 4;
    public static final int MSG_HANDLE_INSTRUMENTATION_FROM_BROADCAST = 3;
    public static final int MSG_PERFORM_CLEANUP = 11;
    public static final int MSG_PERFORM_CLEANUP_FINISHED = 12;
    public static final int MSG_REG_CLIENT = 8;
    public static final int MSG_REMOTE_ADD_CLIENT = 0;
    @VisibleForTesting
    public static final int MSG_REMOTE_CLEANUP_REQUEST = 10;
    public static final int MSG_REMOTE_REMOVE_CLIENT = 1;
    public static final int MSG_REMOVE_CLIENTS_IN_BUNDLE = 7;
    public static final int MSG_REMOVE_INSTRUMENTATION = 5;
    public static final int MSG_TERMINATE = 2;
    public static final int MSG_UN_REG_CLIENT = 9;
    public static final String TAG = "InstrConnection";
    public static MonitoringInstrumentation.ActivityFinisher activityFinisher;
    public static Instrumentation instrumentation;
    public IncomingHandler incomingHandler;
    @VisibleForTesting
    public final BroadcastReceiver messengerReceiver = new MessengerReceiver();
    public Context targetContext;

    @VisibleForTesting
    public static class IncomingHandler extends Handler {
        public final Map<UUID, CountDownLatch> latches = new HashMap();
        @VisibleForTesting
        public Messenger messengerHandler = new Messenger(this);
        @VisibleForTesting
        public Set<Messenger> otherInstrumentations = new HashSet();
        @VisibleForTesting
        public Map<String, Set<Messenger>> typedClients = new HashMap();

        public IncomingHandler(Looper looper) {
            super(looper);
            if (Looper.getMainLooper() == looper || Looper.myLooper() == looper) {
                throw new IllegalStateException("This handler should not be using the main thread looper nor the instrumentation thread looper.");
            }
        }

        /* access modifiers changed from: private */
        public void associateLatch(final UUID uuid, final CountDownLatch countDownLatch) {
            runSyncTask(new Callable<Void>() {
                public Void call() {
                    IncomingHandler.this.latches.put(uuid, countDownLatch);
                    return null;
                }
            });
        }

        private void clientsRegistrationFromBundle(Bundle bundle, boolean z) {
            ArrayList<String> stringArrayList;
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "clientsRegistrationFromBundle called", new Object[0]);
            if (bundle != null && (stringArrayList = bundle.getStringArrayList(InstrumentationConnection.BUNDLE_KEY_CLIENTS)) != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Parcelable[] parcelableArray = bundle.getParcelableArray(String.valueOf(next));
                    if (parcelableArray != null) {
                        for (Parcelable parcelable : parcelableArray) {
                            if (z) {
                                registerClient(next, (Messenger) parcelable);
                            } else {
                                unregisterClient(next, (Messenger) parcelable);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public void disassociateLatch(final UUID uuid) {
            runSyncTask(new Callable<Void>() {
                public Void call() {
                    IncomingHandler.this.latches.remove(uuid);
                    return null;
                }
            });
        }

        /* access modifiers changed from: private */
        public void doDie() {
            sendMessageToOtherInstr(5, (Bundle) null);
            this.otherInstrumentations.clear();
            this.typedClients.clear();
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "quitting looper...", new Object[0]);
            getLooper().quit();
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "finishing instrumentation...", new Object[0]);
            InstrumentationConnection.instrumentation.finish(0, (Bundle) null);
            Instrumentation unused = InstrumentationConnection.instrumentation = null;
            MonitoringInstrumentation.ActivityFinisher unused2 = InstrumentationConnection.activityFinisher = null;
        }

        /* access modifiers changed from: private */
        public Set<Messenger> getClientsForType(final String str) {
            FutureTask futureTask = new FutureTask(new Callable<Set<Messenger>>() {
                public Set<Messenger> call() {
                    return IncomingHandler.this.typedClients.get(str);
                }
            });
            post(futureTask);
            try {
                return (Set) futureTask.get();
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } catch (ExecutionException e2) {
                throw new IllegalStateException(e2.getCause());
            }
        }

        private void instrBinderDied(Messenger messenger) {
            Message obtainMessage = obtainMessage(5);
            obtainMessage.replyTo = messenger;
            sendMessage(obtainMessage);
        }

        private void notifyLatch(UUID uuid) {
            if (uuid == null || !this.latches.containsKey(uuid)) {
                String valueOf = String.valueOf(uuid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append("Latch not found ");
                sb.append(valueOf);
                sb.toString();
                return;
            }
            this.latches.get(uuid).countDown();
        }

        private void registerClient(String str, Messenger messenger) {
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "registerClient called with type = [%s] client = [%s]", str, messenger);
            Checks.checkNotNull(str, "type cannot be null!");
            Checks.checkNotNull(messenger, "client cannot be null!");
            Set set = this.typedClients.get(str);
            if (set == null) {
                HashSet hashSet = new HashSet();
                hashSet.add(messenger);
                this.typedClients.put(str, hashSet);
                return;
            }
            set.add(messenger);
        }

        /* access modifiers changed from: private */
        public <T> T runSyncTask(Callable<T> callable) {
            FutureTask futureTask = new FutureTask(callable);
            post(futureTask);
            try {
                return futureTask.get();
            } catch (InterruptedException e) {
                throw new IllegalStateException(e.getCause());
            } catch (ExecutionException e2) {
                throw new IllegalStateException(e2.getCause());
            }
        }

        private void sendMessageToOtherInstr(int i, Bundle bundle) {
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "sendMessageToOtherInstr() called with: what = [%s], data = [%s]", Integer.valueOf(i), bundle);
            for (Messenger sendMessageWithReply : this.otherInstrumentations) {
                sendMessageWithReply(sendMessageWithReply, i, bundle);
            }
        }

        private void sendMessageWithReply(Messenger messenger, int i, Bundle bundle) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("sendMessageWithReply type: ");
            sb.append(i);
            sb.append(" called");
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, sb.toString(), new Object[0]);
            Message obtainMessage = obtainMessage(i);
            obtainMessage.replyTo = this.messengerHandler;
            if (bundle != null) {
                obtainMessage.setData(bundle);
            }
            if (!this.typedClients.isEmpty()) {
                Bundle data = obtainMessage.getData();
                data.putStringArrayList(InstrumentationConnection.BUNDLE_KEY_CLIENTS, new ArrayList(this.typedClients.keySet()));
                for (Map.Entry next : this.typedClients.entrySet()) {
                    data.putParcelableArray(String.valueOf(next.getKey()), (Messenger[]) ((Set) next.getValue()).toArray(new Messenger[((Set) next.getValue()).size()]));
                }
                obtainMessage.setData(data);
            }
            try {
                messenger.send(obtainMessage);
            } catch (RemoteException unused) {
                instrBinderDied(messenger);
            }
        }

        private void unregisterClient(String str, Messenger messenger) {
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "unregisterClient called with type = [%s] client = [%s]", str, messenger);
            Checks.checkNotNull(str, "type cannot be null!");
            Checks.checkNotNull(messenger, "client cannot be null!");
            if (!this.typedClients.containsKey(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "There are no registered clients for type: ".concat(valueOf);
                } else {
                    new String("There are no registered clients for type: ");
                }
            } else {
                Set set = this.typedClients.get(str);
                if (!set.contains(messenger)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Could not unregister client for type ");
                    sb.append(str);
                    sb.append(" because it doesn't seem to be registered");
                    sb.toString();
                    return;
                }
                set.remove(messenger);
                if (set.isEmpty()) {
                    this.typedClients.remove(str);
                }
            }
        }

        public void handleMessage(Message message) {
            int i = message.what;
            switch (i) {
                case 0:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_REMOTE_ADD_CLIENT)", new Object[0]);
                    registerClient(message.getData().getString(InstrumentationConnection.BUNDLE_KEY_CLIENT_TYPE), (Messenger) message.getData().getParcelable(InstrumentationConnection.BUNDLE_KEY_CLIENT_MESSENGER));
                    return;
                case 1:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_REMOTE_REMOVE_CLIENT)", new Object[0]);
                    unregisterClient(message.getData().getString(InstrumentationConnection.BUNDLE_KEY_CLIENT_TYPE), message.replyTo);
                    return;
                case 2:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_TERMINATE)", new Object[0]);
                    doDie();
                    return;
                case 3:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_HANDLE_INSTRUMENTATION_FROM_BROADCAST)", new Object[0]);
                    if (this.otherInstrumentations.add(message.replyTo)) {
                        sendMessageWithReply(message.replyTo, 4, (Bundle) null);
                        return;
                    }
                    return;
                case 4:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_ADD_INSTRUMENTATION)", new Object[0]);
                    if (this.otherInstrumentations.add(message.replyTo)) {
                        if (!this.typedClients.isEmpty()) {
                            sendMessageWithReply(message.replyTo, 6, (Bundle) null);
                        }
                        clientsRegistrationFromBundle(message.getData(), true);
                        return;
                    }
                    return;
                case 5:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_REMOVE_INSTRUMENTATION)", new Object[0]);
                    boolean remove = this.otherInstrumentations.remove(message.replyTo);
                    return;
                case 6:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_ADD_CLIENTS_IN_BUNDLE)", new Object[0]);
                    clientsRegistrationFromBundle(message.getData(), true);
                    return;
                case 7:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_REMOVE_CLIENTS_IN_BUNDLE)", new Object[0]);
                    clientsRegistrationFromBundle(message.getData(), false);
                    return;
                case 8:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_REG_CLIENT)", new Object[0]);
                    registerClient(message.getData().getString(InstrumentationConnection.BUNDLE_KEY_CLIENT_TYPE), (Messenger) message.getData().getParcelable(InstrumentationConnection.BUNDLE_KEY_CLIENT_MESSENGER));
                    sendMessageToOtherInstr(0, message.getData());
                    return;
                case 9:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_UN_REG_CLIENT)", new Object[0]);
                    unregisterClient(message.getData().getString(InstrumentationConnection.BUNDLE_KEY_CLIENT_TYPE), (Messenger) message.getData().getParcelable(InstrumentationConnection.BUNDLE_KEY_CLIENT_MESSENGER));
                    sendMessageToOtherInstr(1, message.getData());
                    return;
                case 10:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_REMOTE_CLEANUP_REQUEST)", new Object[0]);
                    if (this.otherInstrumentations.isEmpty()) {
                        Message obtainMessage = obtainMessage(12);
                        obtainMessage.setData(message.getData());
                        sendMessage(obtainMessage);
                        return;
                    }
                    sendMessageToOtherInstr(11, message.getData());
                    return;
                case 11:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_PERFORM_CLEANUP)", new Object[0]);
                    InstrumentationConnection.instrumentation.runOnMainSync(InstrumentationConnection.activityFinisher);
                    sendMessageWithReply(message.replyTo, 12, message.getData());
                    return;
                case 12:
                    LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "handleMessage(MSG_PERFORM_CLEANUP_FINISHED)", new Object[0]);
                    notifyLatch((UUID) message.getData().getSerializable(InstrumentationConnection.BUNDLE_KEY_UUID));
                    return;
                default:
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Unknown message code received: ");
                    sb.append(i);
                    sb.toString();
                    super.handleMessage(message);
                    return;
            }
        }
    }

    @VisibleForTesting
    public class MessengerReceiver extends BroadcastReceiver {
        public MessengerReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            ParcelableIBinder parcelableIBinder;
            LogUtil.logDebugWithProcess(InstrumentationConnection.TAG, "Broadcast received", new Object[0]);
            Bundle bundleExtra = intent.getBundleExtra(InstrumentationConnection.BUNDLE_BR_NEW_BINDER);
            if (bundleExtra != null && (parcelableIBinder = (ParcelableIBinder) bundleExtra.getParcelable(InstrumentationConnection.BUNDLE_BR_NEW_BINDER)) != null) {
                Messenger messenger = new Messenger(parcelableIBinder.getIBinder());
                Message obtainMessage = InstrumentationConnection.this.incomingHandler.obtainMessage(3);
                obtainMessage.replyTo = messenger;
                InstrumentationConnection.this.incomingHandler.sendMessage(obtainMessage);
            }
        }
    }

    @VisibleForTesting
    public InstrumentationConnection(@NonNull Context context) {
        this.targetContext = (Context) Checks.checkNotNull(context, "Context can't be null");
    }

    public static InstrumentationConnection getInstance() {
        return DEFAULT_INSTANCE;
    }

    public synchronized Set<Messenger> getClientsForType(String str) {
        return this.incomingHandler.getClientsForType(str);
    }

    public synchronized void init(Instrumentation instrumentation2, MonitoringInstrumentation.ActivityFinisher activityFinisher2) {
        LogUtil.logDebugWithProcess(TAG, "init", new Object[0]);
        if (this.incomingHandler == null) {
            instrumentation = instrumentation2;
            activityFinisher = activityFinisher2;
            HandlerThread handlerThread = new HandlerThread("InstrumentationConnectionThread");
            handlerThread.start();
            this.incomingHandler = new IncomingHandler(handlerThread.getLooper());
            Intent intent = new Intent(BROADCAST_FILTER);
            Bundle bundle = new Bundle();
            bundle.putParcelable(BUNDLE_BR_NEW_BINDER, new ParcelableIBinder(this.incomingHandler.messengerHandler.getBinder()));
            intent.putExtra(BUNDLE_BR_NEW_BINDER, bundle);
            try {
                this.targetContext.sendBroadcast(intent);
                this.targetContext.registerReceiver(this.messengerReceiver, new IntentFilter(BROADCAST_FILTER));
            } catch (SecurityException unused) {
            }
        }
    }

    public synchronized void registerClient(String str, Messenger messenger) {
        Checks.checkState(this.incomingHandler != null, "Instrumentation Connection in not yet initialized");
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Register client of type: ".concat(valueOf);
        } else {
            new String("Register client of type: ");
        }
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_KEY_CLIENT_TYPE, str);
        bundle.putParcelable(BUNDLE_KEY_CLIENT_MESSENGER, messenger);
        Message obtainMessage = this.incomingHandler.obtainMessage(8);
        obtainMessage.setData(bundle);
        this.incomingHandler.sendMessage(obtainMessage);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = java.lang.String.valueOf(r0);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 61);
        r3.append("Interrupted while waiting for response from message with id: ");
        r3.append(r1);
        r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r5.incomingHandler;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        androidx.test.internal.runner.InstrumentationConnection.IncomingHandler.access$300(r5.incomingHandler, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void requestRemoteInstancesActivityCleanup() {
        /*
            r5 = this;
            monitor-enter(r5)
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r0 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            java.lang.String r2 = "Instrumentation Connection in not yet initialized"
            androidx.test.internal.util.Checks.checkState(r0, r2)     // Catch:{ all -> 0x0094 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0094 }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0094 }
            r2.<init>(r1)     // Catch:{ all -> 0x0094 }
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r1 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            r1.associateLatch(r0, r2)     // Catch:{ all -> 0x0094 }
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r1 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            r3 = 10
            android.os.Message r1 = r1.obtainMessage(r3)     // Catch:{ all -> 0x0094 }
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r3 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            android.os.Messenger r3 = r3.messengerHandler     // Catch:{ all -> 0x0094 }
            r1.replyTo = r3     // Catch:{ all -> 0x0094 }
            android.os.Bundle r3 = r1.getData()     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = "instr_uuid"
            r3.putSerializable(r4, r0)     // Catch:{ all -> 0x0094 }
            r1.setData(r3)     // Catch:{ all -> 0x0094 }
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r3 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            r3.sendMessage(r1)     // Catch:{ all -> 0x0094 }
            r3 = 2
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x006b }
            boolean r1 = r2.await(r3, r1)     // Catch:{ InterruptedException -> 0x006b }
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ InterruptedException -> 0x006b }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ InterruptedException -> 0x006b }
            int r2 = r2.length()     // Catch:{ InterruptedException -> 0x006b }
            int r2 = r2 + 60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x006b }
            r3.<init>(r2)     // Catch:{ InterruptedException -> 0x006b }
            java.lang.String r2 = "Timed out while attempting to perform activity clean up for "
            r3.append(r2)     // Catch:{ InterruptedException -> 0x006b }
            r3.append(r1)     // Catch:{ InterruptedException -> 0x006b }
            r3.toString()     // Catch:{ InterruptedException -> 0x006b }
        L_0x0063:
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r1 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
        L_0x0065:
            r1.disassociateLatch(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x008c
        L_0x0069:
            r1 = move-exception
            goto L_0x008e
        L_0x006b:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0069 }
            int r2 = r2.length()     // Catch:{ all -> 0x0069 }
            int r2 = r2 + 61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r3.<init>(r2)     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = "Interrupted while waiting for response from message with id: "
            r3.append(r2)     // Catch:{ all -> 0x0069 }
            r3.append(r1)     // Catch:{ all -> 0x0069 }
            r3.toString()     // Catch:{ all -> 0x0069 }
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r1 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            goto L_0x0065
        L_0x008c:
            monitor-exit(r5)
            return
        L_0x008e:
            androidx.test.internal.runner.InstrumentationConnection$IncomingHandler r2 = r5.incomingHandler     // Catch:{ all -> 0x0094 }
            r2.disassociateLatch(r0)     // Catch:{ all -> 0x0094 }
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.InstrumentationConnection.requestRemoteInstancesActivityCleanup():void");
    }

    public synchronized void terminate() {
        LogUtil.logDebugWithProcess(TAG, "Terminate is called", new Object[0]);
        if (this.incomingHandler != null) {
            Object unused = this.incomingHandler.runSyncTask(new Callable<Void>() {
                public Void call() {
                    InstrumentationConnection.this.incomingHandler.doDie();
                    return null;
                }
            });
            this.targetContext.unregisterReceiver(this.messengerReceiver);
            this.incomingHandler = null;
        }
    }

    public synchronized void unregisterClient(String str, Messenger messenger) {
        Checks.checkState(this.incomingHandler != null, "Instrumentation Connection in not yet initialized");
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Unregister client of type: ".concat(valueOf);
        } else {
            new String("Unregister client of type: ");
        }
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_KEY_CLIENT_TYPE, str);
        bundle.putParcelable(BUNDLE_KEY_CLIENT_MESSENGER, messenger);
        Message obtainMessage = this.incomingHandler.obtainMessage(9);
        obtainMessage.setData(bundle);
        this.incomingHandler.sendMessage(obtainMessage);
    }
}
