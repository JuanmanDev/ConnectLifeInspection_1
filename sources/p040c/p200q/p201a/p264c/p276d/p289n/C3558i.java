package p040c.p200q.p201a.p264c.p276d.p289n;

import androidx.annotation.NonNull;

/* renamed from: c.q.a.c.d.n.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3558i {

    /* renamed from: a */
    public static final char[] f6544a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f6545b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    /* renamed from: a */
    public static String m9074a(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f6545b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    /* renamed from: b */
    public static String m9075b(@NonNull byte[] bArr) {
        return m9076c(bArr, false);
    }

    @NonNull
    /* renamed from: c */
    public static String m9076c(@NonNull byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            sb.append(f6544a[(bArr[i] & 240) >>> 4]);
            sb.append(f6544a[bArr[i] & 15]);
            i++;
        }
        return sb.toString();
    }
}
