package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\u0006\u0010\t\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\n¢\u0006\u0004\b\u0006\u0010\u000b\u001a'\u0010\u0006\u001a\u00020\u0001*\u00020\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\n¢\u0006\u0004\b\u0012\u0010\u0016\u001a'\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0017\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00060\u0018j\u0002`\u00198@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, mo47991d2 = {"Ljava/io/File;", "Lokio/Sink;", "appendingSink", "(Ljava/io/File;)Lokio/Sink;", "", "append", "sink", "(Ljava/io/File;Z)Lokio/Sink;", "Ljava/io/OutputStream;", "(Ljava/io/OutputStream;)Lokio/Sink;", "Ljava/net/Socket;", "(Ljava/net/Socket;)Lokio/Sink;", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "Lokio/Source;", "source", "(Ljava/io/File;)Lokio/Source;", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Lokio/Source;", "(Ljava/net/Socket;)Lokio/Source;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "isAndroidGetsocknameError", "(Ljava/lang/AssertionError;)Z", "okio"}, mo47992k = 5, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "okio/Okio")
/* compiled from: JvmOkio.kt */
public final /* synthetic */ class Okio__JvmOkioKt {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) {
        return Okio.sink((OutputStream) new FileOutputStream(file, true));
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
    }

    @NotNull
    @JvmOverloads
    public static final Sink sink(@NotNull File file) {
        return sink$default(file, false, 1, (Object) null);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Okio.sink(file, z);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        return new InputStreamSource(inputStream, new Timeout());
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) {
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkExpressionValueIsNotNull(outputStream, "getOutputStream()");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) {
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkExpressionValueIsNotNull(inputStream, "getInputStream()");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    @NotNull
    @JvmOverloads
    public static final Sink sink(@NotNull File file, boolean z) {
        return Okio.sink((OutputStream) new FileOutputStream(file, z));
    }

    @NotNull
    public static final Source source(@NotNull File file) {
        return Okio.source((InputStream) new FileInputStream(file));
    }

    @NotNull
    public static final Sink sink(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkExpressionValueIsNotNull(newOutputStream, "Files.newOutputStream(this, *options)");
        return Okio.sink(newOutputStream);
    }

    @NotNull
    public static final Source source(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkExpressionValueIsNotNull(newInputStream, "Files.newInputStream(this, *options)");
        return Okio.source(newInputStream);
    }
}
