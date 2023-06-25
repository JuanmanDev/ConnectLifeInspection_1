package p648m.p649a.p650a.p652b.p653b;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p648m.p649a.p650a.p652b.C9612a;

/* renamed from: m.a.a.b.b.c */
/* compiled from: Md5Crypt */
public class C9615c {
    /* renamed from: a */
    public static String m25806a(byte[] bArr) {
        return m25807b(bArr, "$1$" + C9613a.m25803b(8));
    }

    /* renamed from: b */
    public static String m25807b(byte[] bArr, String str) {
        return m25808c(bArr, str, "$1$");
    }

    /* renamed from: c */
    public static String m25808c(byte[] bArr, String str, String str2) {
        String str3;
        int length = bArr.length;
        if (str == null) {
            str3 = C9613a.m25803b(8);
        } else {
            Matcher matcher = Pattern.compile("^" + str2.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*").matcher(str);
            if (matcher == null || !matcher.find()) {
                throw new IllegalArgumentException("Invalid salt value: " + str);
            }
            str3 = matcher.group(1);
        }
        byte[] bytes = str3.getBytes(C9612a.f18855a);
        MessageDigest b = C9614b.m25805b();
        b.update(bArr);
        b.update(str2.getBytes(C9612a.f18855a));
        b.update(bytes);
        MessageDigest b2 = C9614b.m25805b();
        b2.update(bArr);
        b2.update(bytes);
        b2.update(bArr);
        byte[] digest = b2.digest();
        int i = length;
        while (true) {
            int i2 = 16;
            if (i <= 0) {
                break;
            }
            if (i <= 16) {
                i2 = i;
            }
            b.update(digest, 0, i2);
            i -= 16;
        }
        Arrays.fill(digest, (byte) 0);
        while (length > 0) {
            if ((length & 1) == 1) {
                b.update(digest[0]);
            } else {
                b.update(bArr[0]);
            }
            length >>= 1;
        }
        StringBuilder sb = new StringBuilder(str2 + str3 + "$");
        byte[] digest2 = b.digest();
        for (int i3 = 0; i3 < 1000; i3++) {
            b2 = C9614b.m25805b();
            int i4 = i3 & 1;
            if (i4 != 0) {
                b2.update(bArr);
            } else {
                b2.update(digest2, 0, 16);
            }
            if (i3 % 3 != 0) {
                b2.update(bytes);
            }
            if (i3 % 7 != 0) {
                b2.update(bArr);
            }
            if (i4 != 0) {
                b2.update(digest2, 0, 16);
            } else {
                b2.update(bArr);
            }
            digest2 = b2.digest();
        }
        C9613a.m25802a(digest2[0], digest2[6], digest2[12], 4, sb);
        C9613a.m25802a(digest2[1], digest2[7], digest2[13], 4, sb);
        C9613a.m25802a(digest2[2], digest2[8], digest2[14], 4, sb);
        C9613a.m25802a(digest2[3], digest2[9], digest2[15], 4, sb);
        C9613a.m25802a(digest2[4], digest2[10], digest2[5], 4, sb);
        C9613a.m25802a((byte) 0, (byte) 0, digest2[11], 2, sb);
        b.reset();
        b2.reset();
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bytes, (byte) 0);
        Arrays.fill(digest2, (byte) 0);
        return sb.toString();
    }
}
