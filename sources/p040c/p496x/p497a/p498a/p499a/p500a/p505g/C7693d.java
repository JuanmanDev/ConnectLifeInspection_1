package p040c.p496x.p497a.p498a.p499a.p500a.p505g;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.x.a.a.a.a.g.d */
public class C7693d {

    /* renamed from: b */
    public static final char[] f14462b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public final byte[] f14463a;

    public C7693d(byte[] bArr) {
        this.f14463a = bArr;
    }

    /* renamed from: a */
    public static String m21785a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            byte b = bArr[i];
            char[] cArr2 = f14462b;
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static byte[] m21786e(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4));
        }
        return bArr;
    }

    /* renamed from: b */
    public String mo33210b(String str) {
        return new String(mo33212d(2).doFinal(m21786e(str)));
    }

    /* renamed from: c */
    public String mo33211c(String str) {
        return m21785a(mo33212d(1).doFinal(str.getBytes()));
    }

    /* renamed from: d */
    public final Cipher mo33212d(int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f14463a, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec("eefd3f6980a10330".getBytes());
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, ivParameterSpec);
        return instance;
    }
}
