package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, mo47991d2 = {}, mo47992k = 4, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
public final class Okio {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) {
        return Okio__JvmOkioKt.appendingSink(file);
    }

    @NotNull
    @JvmName(name = "blackhole")
    public static final Sink blackhole() {
        return Okio__OkioKt.blackhole();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        return Okio__OkioKt.buffer(sink);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        return Okio__JvmOkioKt.isAndroidGetsocknameError(assertionError);
    }

    @NotNull
    @JvmOverloads
    public static final Sink sink(@NotNull File file) {
        return Okio__JvmOkioKt.sink$default(file, false, 1, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public static final Sink sink(@NotNull File file, boolean z) {
        return Okio__JvmOkioKt.sink(file, z);
    }

    @NotNull
    public static final Source source(@NotNull File file) {
        return Okio__JvmOkioKt.source(file);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        return Okio__OkioKt.buffer(source);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        return Okio__JvmOkioKt.sink(outputStream);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        return Okio__JvmOkioKt.source(inputStream);
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) {
        return Okio__JvmOkioKt.sink(socket);
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) {
        return Okio__JvmOkioKt.source(socket);
    }

    @NotNull
    public static final Sink sink(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        return Okio__JvmOkioKt.sink(path, openOptionArr);
    }

    @NotNull
    public static final Source source(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        return Okio__JvmOkioKt.source(path, openOptionArr);
    }
}
