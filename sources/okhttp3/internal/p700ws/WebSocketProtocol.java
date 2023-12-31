package okhttp3.internal.p700ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0011\bÆ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0016\u0010 \u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0016\u0010!\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0016\u0010\"\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0016\u0010#\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010$\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u0016\u0010%\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0016\u0010&\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0016\u0010'\u001a\u00020\u001c8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010(\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u0016\u0010)\u001a\u00020\u00058\u0000@\u0000XT¢\u0006\u0006\n\u0004\b)\u0010\u0014R\u0016\u0010*\u001a\u00020\u001c8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b*\u0010\u001e¨\u0006-"}, mo47991d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "key", "acceptHeader", "(Ljava/lang/String;)Ljava/lang/String;", "", "code", "closeCodeExceptionMessage", "(I)Ljava/lang/String;", "Lokio/Buffer$UnsafeCursor;", "cursor", "", "", "toggleMask", "(Lokio/Buffer$UnsafeCursor;[B)V", "validateCloseCode", "(I)V", "ACCEPT_MAGIC", "Ljava/lang/String;", "B0_FLAG_FIN", "I", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "B0_FLAG_RSV3", "B0_MASK_OPCODE", "B1_FLAG_MASK", "B1_MASK_LENGTH", "CLOSE_CLIENT_GOING_AWAY", "", "CLOSE_MESSAGE_MAX", "J", "CLOSE_NO_STATUS_CODE", "OPCODE_BINARY", "OPCODE_CONTINUATION", "OPCODE_CONTROL_CLOSE", "OPCODE_CONTROL_PING", "OPCODE_CONTROL_PONG", "OPCODE_FLAG_CONTROL", "OPCODE_TEXT", "PAYLOAD_BYTE_MAX", "PAYLOAD_LONG", "PAYLOAD_SHORT", "PAYLOAD_SHORT_MAX", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.ws.WebSocketProtocol */
/* compiled from: WebSocketProtocol.kt */
public final class WebSocketProtocol {
    @NotNull
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    @NotNull
    public final String acceptHeader(@NotNull String str) {
        ByteString.Companion companion = ByteString.Companion;
        return companion.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    @Nullable
    public final String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    public final void toggleMask(@NotNull Buffer.UnsafeCursor unsafeCursor, @NotNull byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i2 = unsafeCursor.start;
            int i3 = unsafeCursor.end;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (unsafeCursor.next() != -1);
    }

    public final void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (!(closeCodeExceptionMessage == null)) {
            if (closeCodeExceptionMessage == null) {
                Intrinsics.throwNpe();
            }
            throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
        }
    }
}
