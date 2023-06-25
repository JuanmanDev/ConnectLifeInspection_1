package p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.x.a.a.a.a.f.h.d */
public class C7684d {

    /* renamed from: a */
    public final byte[] f14445a;

    public C7684d(byte[] bArr) {
        this.f14445a = bArr;
    }

    /* renamed from: c */
    public static byte[] m21756c(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4));
        }
        return bArr;
    }

    /* renamed from: a */
    public String mo33192a(String str) {
        return new String(mo33193b(2).doFinal(m21756c(str)));
    }

    /* renamed from: b */
    public final Cipher mo33193b(int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f14445a, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec("eefd3f6980a10330".getBytes());
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, ivParameterSpec);
        return instance;
    }
}
