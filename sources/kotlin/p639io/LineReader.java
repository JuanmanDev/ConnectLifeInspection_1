package kotlin.p639io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo47991d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* renamed from: kotlin.io.LineReader */
/* compiled from: Console.kt */
public final class LineReader {
    public static final int BUFFER_SIZE = 32;
    @NotNull
    public static final LineReader INSTANCE = new LineReader();
    @NotNull
    public static final ByteBuffer byteBuf;
    @NotNull
    public static final byte[] bytes;
    @NotNull
    public static final CharBuffer charBuf;
    @NotNull
    public static final char[] chars = new char[32];
    public static CharsetDecoder decoder;
    public static boolean directEOL;
    @NotNull

    /* renamed from: sb */
    public static final StringBuilder f18800sb = new StringBuilder();

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(bytes)");
        byteBuf = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(chars);
        Intrinsics.checkNotNullExpressionValue(wrap2, "wrap(chars)");
        charBuf = wrap2;
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int decode(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            CoderResult decode = charsetDecoder.decode(byteBuf, charBuf, z);
            Intrinsics.checkNotNullExpressionValue(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                resetAll();
                decode.throwException();
            }
            int position = charBuf.position();
            if (!decode.isOverflow()) {
                return position;
            }
            int i = position - 1;
            f18800sb.append(chars, 0, i);
            charBuf.position(0);
            charBuf.limit(32);
            charBuf.put(chars[i]);
        }
    }

    private final int decodeEndOfInput(int i, int i2) {
        byteBuf.limit(i);
        charBuf.position(i2);
        int decode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        return decode;
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        f18800sb.setLength(0);
    }

    private final void trimStringBuilder() {
        f18800sb.setLength(32);
        f18800sb.trimToSize();
    }

    private final void updateCharset(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "charset.newDecoder()");
        decoder = newDecoder;
        byteBuf.clear();
        charBuf.clear();
        byteBuf.put((byte) 10);
        byteBuf.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuf, charBuf, false);
        if (charBuf.position() == 1 && charBuf.get(0) == 10) {
            z = true;
        }
        directEOL = z;
        resetAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (f18800sb.length() != 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r11 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r0 != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11 = decodeEndOfInput(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0.charset(), (java.lang.Object) r12) == false) goto L_0x0024;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String readLine(@org.jetbrains.annotations.NotNull java.io.InputStream r11, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch:{ all -> 0x00d7 }
            java.nio.charset.CharsetDecoder r0 = decoder     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.nio.charset.CharsetDecoder r0 = decoder     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ all -> 0x00d7 }
            r0 = r1
        L_0x001a:
            java.nio.charset.Charset r0 = r0.charset()     // Catch:{ all -> 0x00d7 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x0027
        L_0x0024:
            r10.updateCharset(r12)     // Catch:{ all -> 0x00d7 }
        L_0x0027:
            r12 = 0
            r0 = r12
            r2 = r0
        L_0x002a:
            int r3 = r11.read()     // Catch:{ all -> 0x00d7 }
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L_0x004e
            java.lang.StringBuilder r11 = f18800sb     // Catch:{ all -> 0x00d7 }
            int r11 = r11.length()     // Catch:{ all -> 0x00d7 }
            if (r11 != 0) goto L_0x0040
            r11 = r7
            goto L_0x0041
        L_0x0040:
            r11 = r12
        L_0x0041:
            if (r11 == 0) goto L_0x0049
            if (r0 != 0) goto L_0x0049
            if (r2 != 0) goto L_0x0049
            monitor-exit(r10)
            return r1
        L_0x0049:
            int r11 = r10.decodeEndOfInput(r0, r2)     // Catch:{ all -> 0x00d7 }
            goto L_0x007e
        L_0x004e:
            byte[] r6 = bytes     // Catch:{ all -> 0x00d7 }
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch:{ all -> 0x00d7 }
            r6[r0] = r9     // Catch:{ all -> 0x00d7 }
            if (r3 == r5) goto L_0x0060
            if (r8 == r4) goto L_0x0060
            boolean r0 = directEOL     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r0 = r8
            goto L_0x002a
        L_0x0060:
            java.nio.ByteBuffer r0 = byteBuf     // Catch:{ all -> 0x00d7 }
            r0.limit(r8)     // Catch:{ all -> 0x00d7 }
            java.nio.CharBuffer r0 = charBuf     // Catch:{ all -> 0x00d7 }
            r0.position(r2)     // Catch:{ all -> 0x00d7 }
            int r2 = r10.decode(r12)     // Catch:{ all -> 0x00d7 }
            if (r2 <= 0) goto L_0x00d1
            char[] r0 = chars     // Catch:{ all -> 0x00d7 }
            int r3 = r2 + -1
            char r0 = r0[r3]     // Catch:{ all -> 0x00d7 }
            if (r0 != r5) goto L_0x00d1
            java.nio.ByteBuffer r11 = byteBuf     // Catch:{ all -> 0x00d7 }
            r11.position(r12)     // Catch:{ all -> 0x00d7 }
            r11 = r2
        L_0x007e:
            if (r11 <= 0) goto L_0x0098
            char[] r0 = chars     // Catch:{ all -> 0x00d7 }
            int r1 = r11 + -1
            char r0 = r0[r1]     // Catch:{ all -> 0x00d7 }
            if (r0 != r5) goto L_0x0098
            int r11 = r11 + -1
            if (r11 <= 0) goto L_0x0098
            char[] r0 = chars     // Catch:{ all -> 0x00d7 }
            int r1 = r11 + -1
            char r0 = r0[r1]     // Catch:{ all -> 0x00d7 }
            r1 = 13
            if (r0 != r1) goto L_0x0098
            int r11 = r11 + -1
        L_0x0098:
            java.lang.StringBuilder r0 = f18800sb     // Catch:{ all -> 0x00d7 }
            int r0 = r0.length()     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r7 = r12
        L_0x00a2:
            if (r7 == 0) goto L_0x00ad
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00d7 }
            char[] r1 = chars     // Catch:{ all -> 0x00d7 }
            r0.<init>(r1, r12, r11)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r10)
            return r0
        L_0x00ad:
            java.lang.StringBuilder r0 = f18800sb     // Catch:{ all -> 0x00d7 }
            char[] r1 = chars     // Catch:{ all -> 0x00d7 }
            r0.append(r1, r12, r11)     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r11 = f18800sb     // Catch:{ all -> 0x00d7 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r0 = f18800sb     // Catch:{ all -> 0x00d7 }
            int r0 = r0.length()     // Catch:{ all -> 0x00d7 }
            if (r0 <= r4) goto L_0x00ca
            r10.trimStringBuilder()     // Catch:{ all -> 0x00d7 }
        L_0x00ca:
            java.lang.StringBuilder r0 = f18800sb     // Catch:{ all -> 0x00d7 }
            r0.setLength(r12)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r10)
            return r11
        L_0x00d1:
            int r0 = r10.compactBytes()     // Catch:{ all -> 0x00d7 }
            goto L_0x002a
        L_0x00d7:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p639io.LineReader.readLine(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
