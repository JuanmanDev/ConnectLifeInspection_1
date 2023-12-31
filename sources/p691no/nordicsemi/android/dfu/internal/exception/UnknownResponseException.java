package p691no.nordicsemi.android.dfu.internal.exception;

import java.util.Locale;

/* renamed from: no.nordicsemi.android.dfu.internal.exception.UnknownResponseException */
public class UnknownResponseException extends Exception {
    public static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final long serialVersionUID = -8716125467309979289L;
    public final int mExpectedOpCode;
    public final int mExpectedReturnCode;
    public final byte[] mResponse;

    public UnknownResponseException(String str, byte[] bArr, int i, int i2) {
        super(str);
        this.mResponse = bArr == null ? new byte[0] : bArr;
        this.mExpectedReturnCode = i;
        this.mExpectedOpCode = i2;
    }

    public static String bytesToHex(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length <= i || i2 <= 0) {
            return "";
        }
        int min = Math.min(i2, bArr.length - i);
        char[] cArr = new char[(min * 2)];
        for (int i3 = 0; i3 < min; i3++) {
            byte b = bArr[i + i3] & 255;
            int i4 = i3 * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i4] = cArr2[b >>> 4];
            cArr[i4 + 1] = cArr2[b & 15];
        }
        return "0x" + new String(cArr);
    }

    public String getMessage() {
        Locale locale = Locale.US;
        byte[] bArr = this.mResponse;
        return String.format(locale, "%s (response: %s, expected: 0x%02X%02X..)", new Object[]{super.getMessage(), bytesToHex(bArr, 0, bArr.length), Integer.valueOf(this.mExpectedReturnCode), Integer.valueOf(this.mExpectedOpCode)});
    }
}
