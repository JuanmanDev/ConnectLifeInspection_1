package com.juconnect.connectlife.ju_dist.find;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.juconnect.connectlife.ju_dist.utils.AesUtils2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0011R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/find/UdpClient;", "", "context", "Landroid/content/Context;", "manager", "Landroid/net/wifi/WifiManager;", "callBack", "Lcom/juconnect/connectlife/ju_dist/find/FindCallBack;", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;Lcom/juconnect/connectlife/ju_dist/find/FindCallBack;)V", "aesUtils", "Lcom/juconnect/connectlife/ju_dist/utils/AesUtils2;", "lock", "Landroid/net/wifi/WifiManager$MulticastLock;", "udpReceiveBroadcaster", "Lcom/juconnect/connectlife/ju_dist/find/UDPBroadcaster;", "udpSendBroadcaster", "close", "", "init", "listen", "onListenError", "e", "Ljava/lang/Exception;", "onSendError", "send", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UdpClient.kt */
public final class UdpClient {
    @NotNull
    public AesUtils2 aesUtils = new AesUtils2();
    @Nullable
    public FindCallBack callBack;
    @NotNull
    public Context context;
    @NotNull
    public WifiManager.MulticastLock lock;
    public UDPBroadcaster udpReceiveBroadcaster;
    public UDPBroadcaster udpSendBroadcaster;

    public UdpClient(@NotNull Context context2, @NotNull WifiManager wifiManager, @Nullable FindCallBack findCallBack) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(wifiManager, "manager");
        this.context = context2;
        WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("softAp");
        Intrinsics.checkNotNullExpressionValue(createMulticastLock, "manager.createMulticastLock(\"softAp\")");
        this.lock = createMulticastLock;
        createMulticastLock.setReferenceCounted(false);
        this.callBack = findCallBack;
        init();
    }

    private final void init() {
        this.udpReceiveBroadcaster = new UDPBroadcaster(this.context);
        this.udpSendBroadcaster = new UDPBroadcaster(this.context);
    }

    private final void onListenError(Exception exc) {
        exc.printStackTrace();
        FindCallBack findCallBack = this.callBack;
        if (findCallBack != null) {
            findCallBack.onListenError(exc);
        }
    }

    private final void onSendError(Exception exc) {
        exc.printStackTrace();
        FindCallBack findCallBack = this.callBack;
        if (findCallBack != null) {
            findCallBack.onSendError(exc);
        }
    }

    public final void close() {
        UDPBroadcaster uDPBroadcaster = this.udpReceiveBroadcaster;
        UDPBroadcaster uDPBroadcaster2 = null;
        if (uDPBroadcaster == null) {
            Intrinsics.throwUninitializedPropertyAccessException("udpReceiveBroadcaster");
            uDPBroadcaster = null;
        }
        uDPBroadcaster.close();
        UDPBroadcaster uDPBroadcaster3 = this.udpSendBroadcaster;
        if (uDPBroadcaster3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("udpSendBroadcaster");
        } else {
            uDPBroadcaster2 = uDPBroadcaster3;
        }
        uDPBroadcaster2.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r2 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r2 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("udpReceiveBroadcaster");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r2 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        if (r2 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        if (r2 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void listen() {
        /*
            r6 = this;
            java.lang.String r0 = "udpReceiveBroadcaster"
            r1 = 0
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r2 = r6.udpReceiveBroadcaster     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            if (r2 != 0) goto L_0x000b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            r2 = r1
        L_0x000b:
            r3 = 5010(0x1392, float:7.02E-42)
            r4 = 2
            r5 = 0
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster.open$default(r2, r3, r5, r4, r1)     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            android.net.wifi.WifiManager$MulticastLock r3 = r6.lock     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            r3.acquire()     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r3 = r6.udpReceiveBroadcaster     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            if (r3 != 0) goto L_0x0023
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            r3 = r1
        L_0x0023:
            int r3 = r3.recvPacket(r2)     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            if (r3 <= 0) goto L_0x0055
            com.juconnect.connectlife.ju_dist.utils.AesUtils2 r4 = r6.aesUtils     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            java.lang.String r2 = r4.decrypt(r2, r5, r3)     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            if (r2 != 0) goto L_0x0032
            goto L_0x0055
        L_0x0032:
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch:{ Exception -> 0x004f }
            r3.<init>()     // Catch:{ Exception -> 0x004f }
            java.lang.Class<com.juconnect.connectlife.ju_dist.find.BcWifiMessage> r4 = com.juconnect.connectlife.ju_dist.find.BcWifiMessage.class
            java.lang.Object r2 = r3.fromJson((java.lang.String) r2, r4)     // Catch:{ Exception -> 0x004f }
            com.juconnect.connectlife.ju_dist.find.BcWifiMessage r2 = (com.juconnect.connectlife.ju_dist.find.BcWifiMessage) r2     // Catch:{ Exception -> 0x004f }
            com.juconnect.connectlife.ju_dist.find.FindCallBack r3 = r6.callBack     // Catch:{ Exception -> 0x004f }
            if (r3 != 0) goto L_0x0044
            goto L_0x0055
        L_0x0044:
            java.lang.String r4 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch:{ Exception -> 0x004f }
            r3.onListenSuccess(r2)     // Catch:{ Exception -> 0x004f }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x004f }
            goto L_0x0055
        L_0x004f:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ UnknownHostException -> 0x0093, SocketException -> 0x0085, IOException -> 0x0077, Exception -> 0x0061 }
        L_0x0055:
            android.net.wifi.WifiManager$MulticastLock r2 = r6.lock
            r2.release()
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r2 = r6.udpReceiveBroadcaster
            if (r2 != 0) goto L_0x0072
            goto L_0x006e
        L_0x005f:
            r2 = move-exception
            goto L_0x00a2
        L_0x0061:
            r2 = move-exception
            r6.onListenError(r2)     // Catch:{ all -> 0x005f }
            android.net.wifi.WifiManager$MulticastLock r2 = r6.lock
            r2.release()
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r2 = r6.udpReceiveBroadcaster
            if (r2 != 0) goto L_0x0072
        L_0x006e:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            r1.close()
            goto L_0x00a1
        L_0x0077:
            r2 = move-exception
            r6.onListenError(r2)     // Catch:{ all -> 0x005f }
            android.net.wifi.WifiManager$MulticastLock r2 = r6.lock
            r2.release()
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r2 = r6.udpReceiveBroadcaster
            if (r2 != 0) goto L_0x0072
            goto L_0x006e
        L_0x0085:
            r2 = move-exception
            r6.onListenError(r2)     // Catch:{ all -> 0x005f }
            android.net.wifi.WifiManager$MulticastLock r2 = r6.lock
            r2.release()
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r2 = r6.udpReceiveBroadcaster
            if (r2 != 0) goto L_0x0072
            goto L_0x006e
        L_0x0093:
            r2 = move-exception
            r6.onListenError(r2)     // Catch:{ all -> 0x005f }
            android.net.wifi.WifiManager$MulticastLock r2 = r6.lock
            r2.release()
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r2 = r6.udpReceiveBroadcaster
            if (r2 != 0) goto L_0x0072
            goto L_0x006e
        L_0x00a1:
            return
        L_0x00a2:
            android.net.wifi.WifiManager$MulticastLock r3 = r6.lock
            r3.release()
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r3 = r6.udpReceiveBroadcaster
            if (r3 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x00b0
        L_0x00af:
            r1 = r3
        L_0x00b0:
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_dist.find.UdpClient.listen():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("udpSendBroadcaster");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void send() {
        /*
            r6 = this;
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r0 = r6.udpSendBroadcaster
            java.lang.String r1 = "udpSendBroadcaster"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x000b:
            r3 = 0
            r4 = 5030(0x13a6, float:7.049E-42)
            r5 = 1
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster.open$default(r0, r3, r4, r5, r2)
            com.juconnect.connectlife.ju_dist.find.BCPhoneMsg r0 = new com.juconnect.connectlife.ju_dist.find.BCPhoneMsg
            r0.<init>()
            java.lang.String r0 = r0.toJson()
            com.juconnect.connectlife.ju_dist.utils.AesUtils2 r3 = r6.aesUtils
            java.lang.String r3 = r3.encrypt(r0)
            if (r3 != 0) goto L_0x0025
            r3 = r2
            goto L_0x0030
        L_0x0025:
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L_0x0030:
            if (r3 != 0) goto L_0x0033
            goto L_0x0046
        L_0x0033:
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r4 = r6.udpSendBroadcaster     // Catch:{ UnknownHostException -> 0x0070, SocketException -> 0x0067, IOException -> 0x005e, Exception -> 0x0055 }
            if (r4 != 0) goto L_0x003b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ UnknownHostException -> 0x0070, SocketException -> 0x0067, IOException -> 0x005e, Exception -> 0x0055 }
            r4 = r2
        L_0x003b:
            r4.sendPacket(r3)     // Catch:{ UnknownHostException -> 0x0070, SocketException -> 0x0067, IOException -> 0x005e, Exception -> 0x0055 }
            com.juconnect.connectlife.ju_dist.find.FindCallBack r3 = r6.callBack     // Catch:{ UnknownHostException -> 0x0070, SocketException -> 0x0067, IOException -> 0x005e, Exception -> 0x0055 }
            if (r3 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r3.onSendSuccess(r0)     // Catch:{ UnknownHostException -> 0x0070, SocketException -> 0x0067, IOException -> 0x005e, Exception -> 0x0055 }
        L_0x0046:
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r0 = r6.udpSendBroadcaster
            if (r0 != 0) goto L_0x004e
        L_0x004a:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x004f
        L_0x004e:
            r2 = r0
        L_0x004f:
            r2.close()
            goto L_0x0079
        L_0x0053:
            r0 = move-exception
            goto L_0x007a
        L_0x0055:
            r0 = move-exception
            r6.onSendError(r0)     // Catch:{ all -> 0x0053 }
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r0 = r6.udpSendBroadcaster
            if (r0 != 0) goto L_0x004e
            goto L_0x004a
        L_0x005e:
            r0 = move-exception
            r6.onSendError(r0)     // Catch:{ all -> 0x0053 }
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r0 = r6.udpSendBroadcaster
            if (r0 != 0) goto L_0x004e
            goto L_0x004a
        L_0x0067:
            r0 = move-exception
            r6.onSendError(r0)     // Catch:{ all -> 0x0053 }
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r0 = r6.udpSendBroadcaster
            if (r0 != 0) goto L_0x004e
            goto L_0x004a
        L_0x0070:
            r0 = move-exception
            r6.onSendError(r0)     // Catch:{ all -> 0x0053 }
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r0 = r6.udpSendBroadcaster
            if (r0 != 0) goto L_0x004e
            goto L_0x004a
        L_0x0079:
            return
        L_0x007a:
            com.juconnect.connectlife.ju_dist.find.UDPBroadcaster r3 = r6.udpSendBroadcaster
            if (r3 != 0) goto L_0x0082
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0083
        L_0x0082:
            r2 = r3
        L_0x0083:
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_dist.find.UdpClient.send():void");
    }
}
