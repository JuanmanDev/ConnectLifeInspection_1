package com.juconnect.connectlife.ju_dist.find;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import java.lang.reflect.InvocationTargetException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/find/UDPBroadcaster;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "getMContext", "()Landroid/content/Context;", "setMContext", "mDestPort", "", "mSocket", "Ljava/net/DatagramSocket;", "close", "", "closeUdp", "", "open", "localPort", "destPort", "recvPacket", "buffer", "", "sendPacket", "Companion", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UDPBroadcaster.kt */
public final class UDPBroadcaster {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public final String TAG;
    @NotNull
    public Context mContext;
    public int mDestPort = -1;
    @Nullable
    public DatagramSocket mSocket;

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/find/UDPBroadcaster$Companion;", "", "()V", "getBroadcastAddress", "Ljava/net/InetAddress;", "context", "Landroid/content/Context;", "isWifiApEnabled", "", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: UDPBroadcaster.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isWifiApEnabled(Context context) {
            try {
                Object systemService = context.getSystemService("wifi");
                if (systemService != null) {
                    WifiManager wifiManager = (WifiManager) systemService;
                    Object invoke = wifiManager.getClass().getMethod("isWifiApEnabled", new Class[0]).invoke(wifiManager, new Object[0]);
                    if (invoke != null) {
                        return ((Boolean) invoke).booleanValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return false;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return false;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return false;
            }
        }

        @NotNull
        public final InetAddress getBroadcastAddress(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isWifiApEnabled(context)) {
                InetAddress byName = InetAddress.getByName("192.168.43.255");
                Intrinsics.checkNotNullExpressionValue(byName, "getByName(\"192.168.43.255\")");
                return byName;
            }
            Object systemService = context.getSystemService("wifi");
            if (systemService != null) {
                DhcpInfo dhcpInfo = ((WifiManager) systemService).getDhcpInfo();
                if (dhcpInfo == null) {
                    InetAddress byName2 = InetAddress.getByName("255.255.255.255");
                    Intrinsics.checkNotNullExpressionValue(byName2, "getByName(\"255.255.255.255\")");
                    return byName2;
                }
                int i = dhcpInfo.ipAddress;
                int i2 = dhcpInfo.netmask;
                int i3 = (~i2) | (i & i2);
                byte[] bArr = new byte[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    bArr[i4] = (byte) ((i3 >> (i4 * 8)) & 255);
                }
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                Intrinsics.checkNotNullExpressionValue(byAddress, "getByAddress(quads)");
                return byAddress;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
    }

    public UDPBroadcaster(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        this.mContext = context;
        String simpleName = UDPBroadcaster.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "UDPBroadcaster::class.java.simpleName");
        this.TAG = simpleName;
    }

    public static /* synthetic */ boolean open$default(UDPBroadcaster uDPBroadcaster, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return uDPBroadcaster.open(i, i2);
    }

    public final boolean close() {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = this.mSocket;
        if (datagramSocket2 != null) {
            boolean z = false;
            if (datagramSocket2 != null && !datagramSocket2.isClosed()) {
                z = true;
            }
            if (z && (datagramSocket = this.mSocket) != null) {
                datagramSocket.close();
            }
        }
        return true;
    }

    public final void closeUdp() {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = this.mSocket;
        boolean z = false;
        if (datagramSocket2 != null && !datagramSocket2.isClosed()) {
            z = true;
        }
        if (z && (datagramSocket = this.mSocket) != null) {
            datagramSocket.close();
        }
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if ((r4 != null && r4.isClosed()) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean open(int r3, int r4) {
        /*
            r2 = this;
            r2.mDestPort = r4
            r2.close()
            java.net.DatagramSocket r4 = r2.mSocket
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0018
            if (r4 != 0) goto L_0x000f
        L_0x000d:
            r4 = r0
            goto L_0x0016
        L_0x000f:
            boolean r4 = r4.isClosed()
            if (r4 != r1) goto L_0x000d
            r4 = r1
        L_0x0016:
            if (r4 == 0) goto L_0x0041
        L_0x0018:
            r4 = -1
            if (r3 != r4) goto L_0x0021
            java.net.DatagramSocket r3 = new java.net.DatagramSocket
            r3.<init>()
            goto L_0x0027
        L_0x0021:
            java.net.DatagramSocket r4 = new java.net.DatagramSocket
            r4.<init>(r3)
            r3 = r4
        L_0x0027:
            r2.mSocket = r3
            if (r3 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r4 = 5000(0x1388, float:7.006E-42)
            r3.setSoTimeout(r4)
        L_0x0031:
            java.net.DatagramSocket r3 = r2.mSocket
            if (r3 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            r3.setBroadcast(r1)
        L_0x0039:
            java.net.DatagramSocket r3 = r2.mSocket
            if (r3 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r3.setReuseAddress(r1)
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_dist.find.UDPBroadcaster.open(int, int):boolean");
    }

    public final int recvPacket(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "buffer");
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        DatagramSocket datagramSocket = this.mSocket;
        if (datagramSocket != null) {
            datagramSocket.receive(datagramPacket);
        }
        return datagramPacket.getLength();
    }

    public final boolean sendPacket(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "buffer");
        if (this.mDestPort != -1) {
            InetAddress broadcastAddress = Companion.getBroadcastAddress(this.mContext);
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            datagramPacket.setAddress(broadcastAddress);
            datagramPacket.setPort(this.mDestPort);
            DatagramSocket datagramSocket = this.mSocket;
            if (datagramSocket == null) {
                return true;
            }
            datagramSocket.send(datagramPacket);
            return true;
        }
        throw new IllegalArgumentException("没有设置发送端口");
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }
}
