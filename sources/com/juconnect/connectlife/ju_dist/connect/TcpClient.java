package com.juconnect.connectlife.ju_dist.connect;

import android.net.Network;
import android.text.TextUtils;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.juconnect.connectlife.ju_dist.utils.AesUtils2;
import com.juconnect.connectlife.ju_dist.utils.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p294g.p333g.C4514ip;

@Metadata(mo47990d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0003R\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/TcpClient;", "", "host", "", "port", "", "network", "Landroid/net/Network;", "(Ljava/lang/String;ILandroid/net/Network;)V", "TAG", "aesUtils", "Lcom/juconnect/connectlife/ju_dist/utils/AesUtils2;", "input", "Ljava/io/BufferedReader;", "mNetwork", "out", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", "close", "", "connect", "getNetName", "ip", "isConnected", "", "readInputStream", "", "inputStream", "Ljava/io/InputStream;", "readMessage", "sendMessage", "message", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TcpClient.kt */
public final class TcpClient {
    @NotNull
    public String TAG = "TcpClient";
    @NotNull
    public AesUtils2 aesUtils;
    @NotNull
    public String host;
    @Nullable
    public BufferedReader input;
    @Nullable
    public Network mNetwork;
    @Nullable
    public OutputStream out;
    public int port;
    @NotNull
    public Socket socket;

    public TcpClient(@NotNull String str, int i, @Nullable Network network) {
        Socket socket2;
        Intrinsics.checkNotNullParameter(str, Http2ExchangeCodec.HOST);
        LogUtils.Companion companion = LogUtils.Companion;
        companion.debug("TcpClient", "constructor time:" + LogUtils.Companion.formatTime() + 9 + str + " -- " + i);
        this.host = str;
        this.port = i;
        this.mNetwork = network;
        try {
            Intrinsics.checkNotNull(network);
            socket2 = network.getSocketFactory().createSocket(str, i);
            Intrinsics.checkNotNullExpressionValue(socket2, "{\n            Log.e(TAG,…ket(host, port)\n        }");
        } catch (Exception e) {
            e.printStackTrace();
            Intrinsics.stringPlus("constructor error =", e.getMessage());
            socket2 = new Socket();
        }
        this.socket = socket2;
        this.aesUtils = new AesUtils2();
    }

    public final void close() {
        LogUtils.Companion companion = LogUtils.Companion;
        companion.debug(this.TAG, Intrinsics.stringPlus("close time:", companion.formatTime()));
        Socket socket2 = this.socket;
        if (socket2 != null && socket2.isConnected() && !this.socket.isClosed()) {
            this.socket.close();
        }
    }

    public final void connect() {
        LogUtils.Companion companion = LogUtils.Companion;
        String str = this.TAG;
        companion.debug(str, "connect() time: " + LogUtils.Companion.formatTime() + ' ' + this.host + " -- " + this.port + " isConn=" + this.socket.isConnected());
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.host, this.port);
        if (!this.socket.isConnected()) {
            String str2 = this.host;
            String substring = str2.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) str2, MAPCookie.DOT, 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String netName = getNetName(Intrinsics.stringPlus(substring, ".1"));
            LogUtils.Companion companion2 = LogUtils.Companion;
            String str3 = this.TAG;
            companion2.debug(str3, "netName=" + netName + ",network=" + this.mNetwork);
            InetAddress inetAddress = null;
            Enumeration<InetAddress> inetAddresses = NetworkInterface.getByName(netName).getInetAddresses();
            Intrinsics.checkNotNullExpressionValue(inetAddresses, "networkInterface.inetAddresses");
            Iterator<T> it = CollectionsKt__IteratorsJVMKt.iterator(inetAddresses);
            while (it.hasNext()) {
                InetAddress inetAddress2 = (InetAddress) it.next();
                if (!inetAddress2.isLoopbackAddress() && (inetAddress2 instanceof Inet4Address)) {
                    inetAddress = inetAddress2;
                }
            }
            Socket socket2 = new Socket();
            this.socket = socket2;
            socket2.bind(new InetSocketAddress(inetAddress, 0));
            try {
                Network network = this.mNetwork;
                if (network != null) {
                    network.bindSocket(this.socket);
                }
            } catch (Exception e) {
                Intrinsics.stringPlus("allNetworksconnect1: bindSocket error=", e.getMessage());
            }
            this.socket.connect(inetSocketAddress, PathInterpolatorCompat.MAX_NUM_POINTS);
        }
        this.input = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), Charset.defaultCharset()));
        this.out = this.socket.getOutputStream();
    }

    @Nullable
    public final String getNetName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, C4514ip.f9299q);
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 instanceof Inet4Address) {
                            String hostAddress = nextElement2.getHostAddress();
                            Intrinsics.checkNotNullExpressionValue(hostAddress, "addr.getHostAddress()");
                            String hostAddress2 = nextElement2.getHostAddress();
                            Intrinsics.checkNotNullExpressionValue(hostAddress2, "addr.getHostAddress()");
                            String substring = hostAddress.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostAddress2, MAPCookie.DOT, 0, false, 6, (Object) null));
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (Intrinsics.areEqual((Object) Intrinsics.stringPlus(substring, ".1"), (Object) str)) {
                                return nextElement.getName();
                            }
                        }
                    }
                }
            }
            return "wlan0";
        } catch (SocketException e) {
            e.printStackTrace();
            return "wlan0";
        }
    }

    public final boolean isConnected() {
        return this.socket.isConnected() && !this.socket.isClosed();
    }

    @Nullable
    public final byte[] readInputStream(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @NotNull
    public final String readMessage() {
        LogUtils.Companion companion = LogUtils.Companion;
        companion.debug(this.TAG, Intrinsics.stringPlus("readMessage: 读取数据中 time:", companion.formatTime()));
        LogUtils.Companion companion2 = LogUtils.Companion;
        companion2.debug(this.TAG, Intrinsics.stringPlus("readMessage: input ", companion2.formatTime()));
        BufferedReader bufferedReader = this.input;
        String readLine = bufferedReader == null ? null : bufferedReader.readLine();
        LogUtils.Companion.debug(this.TAG, Intrinsics.stringPlus("readMessage:读取到的数据为 ", readLine));
        boolean z = false;
        if (readLine == null) {
            if (readLine != null) {
                if (readLine.length() == 0) {
                    z = true;
                }
            }
            if (z) {
                LogUtils.Companion.debug(this.TAG, "readMessage: 读取数据为空");
            }
            BufferedReader bufferedReader2 = this.input;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return "{}";
        }
        byte[] bytes = readLine.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String decrypt = this.aesUtils.decrypt(bytes, 0, bytes.length);
        if (TextUtils.isEmpty(decrypt)) {
            return "{}";
        }
        LogUtils.Companion companion3 = LogUtils.Companion;
        companion3.debug(this.TAG, Intrinsics.stringPlus("readMessage: 读取数据结束", companion3.formatTime()));
        LogUtils.Companion.debug(this.TAG, Intrinsics.stringPlus("readMessage:读取数据结束", decrypt));
        Intrinsics.checkNotNull(decrypt);
        return decrypt;
    }

    public final void sendMessage(@NotNull String str) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(str, "message");
        if (!this.socket.isConnected()) {
            LogUtils.Companion.debug(this.TAG, "socket连接未建立或已断开");
            return;
        }
        String encrypt = this.aesUtils.encrypt(str);
        LogUtils.Companion companion = LogUtils.Companion;
        String str2 = this.TAG;
        companion.debug(str2, "开始发送 time:" + LogUtils.Companion.formatTime() + ':' + str);
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            if (encrypt == null) {
                bArr = null;
            } else {
                bArr = encrypt.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
            }
            outputStream.write(bArr);
        }
        OutputStream outputStream2 = this.out;
        if (outputStream2 != null) {
            outputStream2.flush();
        }
        LogUtils.Companion companion2 = LogUtils.Companion;
        String str3 = this.TAG;
        companion2.debug(str3, "sendMessage: 发送成功 time: " + LogUtils.Companion.formatTime() + ':' + str);
    }
}
