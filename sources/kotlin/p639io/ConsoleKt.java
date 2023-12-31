package kotlin.p639io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\b\u001a\t\u0010\r\u001a\u00020\u0001H\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0012"}, mo47991d2 = {"print", "", "message", "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "readln", "readlnOrNull", "kotlin-stdlib"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@JvmName(name = "ConsoleKt")
/* renamed from: kotlin.io.ConsoleKt */
/* compiled from: Console.kt */
public final class ConsoleKt {
    @InlineOnly
    public static final void print(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    public static final void println(Object obj) {
        System.out.println(obj);
    }

    @Nullable
    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream inputStream = System.in;
        Intrinsics.checkNotNullExpressionValue(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
        return lineReader.readLine(inputStream, defaultCharset);
    }

    @NotNull
    @SinceKotlin(version = "1.6")
    public static final String readln() {
        String readlnOrNull = readlnOrNull();
        if (readlnOrNull != null) {
            return readlnOrNull;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @SinceKotlin(version = "1.6")
    @Nullable
    public static final String readlnOrNull() {
        return readLine();
    }

    @InlineOnly
    public static final void print(int i) {
        System.out.print(i);
    }

    @InlineOnly
    public static final void println(int i) {
        System.out.println(i);
    }

    @InlineOnly
    public static final void print(long j) {
        System.out.print(j);
    }

    @InlineOnly
    public static final void println(long j) {
        System.out.println(j);
    }

    @InlineOnly
    public static final void print(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @InlineOnly
    public static final void println(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @InlineOnly
    public static final void print(short s) {
        System.out.print(Short.valueOf(s));
    }

    @InlineOnly
    public static final void println(short s) {
        System.out.println(Short.valueOf(s));
    }

    @InlineOnly
    public static final void print(char c) {
        System.out.print(c);
    }

    @InlineOnly
    public static final void println(char c) {
        System.out.println(c);
    }

    @InlineOnly
    public static final void print(boolean z) {
        System.out.print(z);
    }

    @InlineOnly
    public static final void println(boolean z) {
        System.out.println(z);
    }

    @InlineOnly
    public static final void print(float f) {
        System.out.print(f);
    }

    @InlineOnly
    public static final void println(float f) {
        System.out.println(f);
    }

    @InlineOnly
    public static final void print(double d) {
        System.out.print(d);
    }

    @InlineOnly
    public static final void println(double d) {
        System.out.println(d);
    }

    @InlineOnly
    public static final void print(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "message");
        System.out.print(cArr);
    }

    @InlineOnly
    public static final void println(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "message");
        System.out.println(cArr);
    }

    @InlineOnly
    public static final void println() {
        System.out.println();
    }
}
