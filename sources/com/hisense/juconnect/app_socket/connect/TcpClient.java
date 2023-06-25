package com.hisense.juconnect.app_socket.connect;

import android.text.TextUtils;
import com.hisense.juconnect.app_socket.utils.AesUtils2;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/connect/TcpClient;", "", "host", "", "port", "", "(Ljava/lang/String;I)V", "TAG", "aesUtils", "Lcom/hisense/juconnect/app_socket/utils/AesUtils2;", "input", "Ljava/io/BufferedReader;", "out", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", "close", "", "connect", "readInputStream", "", "inputStream", "Ljava/io/InputStream;", "readMessage", "sendMessage", "message", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TcpClient.kt */
public final class TcpClient {
    @NotNull
    public String TAG = "TcpClient";
    @NotNull
    public AesUtils2 aesUtils;
    @NotNull
    public String host;
    public BufferedReader input;
    public OutputStream out;
    public int port;
    @NotNull
    public Socket socket;

    public TcpClient(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, Http2ExchangeCodec.HOST);
        LogUtils.Companion companion = LogUtils.Companion;
        companion.debug("TcpClient", "constructor time:" + LogUtils.Companion.formatTime() + 9 + str + " -- " + i);
        this.host = str;
        this.port = i;
        this.socket = new Socket();
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
        companion.debug(str, "connect() time: " + LogUtils.Companion.formatTime() + " \t" + this.host + " -- " + this.port);
        try {
            this.socket.connect(new InetSocketAddress(this.host, this.port));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.input = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), Charset.defaultCharset()));
        OutputStream outputStream = this.socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "socket.getOutputStream()");
        this.out = outputStream;
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
        BufferedReader bufferedReader2 = null;
        if (bufferedReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("input");
            bufferedReader = null;
        }
        String readLine = bufferedReader.readLine();
        LogUtils.Companion.debug(this.TAG, Intrinsics.stringPlus("readMessage:读取到的数据为 ", readLine));
        boolean z = false;
        if (readLine == null) {
            Intrinsics.checkNotNullExpressionValue(readLine, "readLine");
            if (readLine.length() == 0) {
                z = true;
            }
            if (z) {
                LogUtils.Companion.debug(this.TAG, "readMessage: 读取数据为空");
            }
            BufferedReader bufferedReader3 = this.input;
            if (bufferedReader3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("input");
            } else {
                bufferedReader2 = bufferedReader3;
            }
            bufferedReader2.close();
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
        LogUtils.Companion.debug(this.TAG, "开始发送 time:" + LogUtils.Companion.formatTime() + " \t" + str);
        OutputStream outputStream = this.out;
        OutputStream outputStream2 = null;
        if (outputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("out");
            outputStream = null;
        }
        if (encrypt == null) {
            bArr = null;
        } else {
            bArr = encrypt.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
        }
        outputStream.write(bArr);
        OutputStream outputStream3 = this.out;
        if (outputStream3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("out");
        } else {
            outputStream2 = outputStream3;
        }
        outputStream2.flush();
        LogUtils.Companion.debug(this.TAG, "sendMessage: 发送成功 time: " + LogUtils.Companion.formatTime() + " \t" + str);
    }
}
