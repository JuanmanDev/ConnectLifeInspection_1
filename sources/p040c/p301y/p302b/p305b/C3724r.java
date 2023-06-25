package p040c.p301y.p302b.p305b;

import android.util.Base64;
import java.io.PrintStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: c.y.b.b.r */
/* compiled from: AndroidDes3Utils */
public class C3724r {

    /* renamed from: a */
    public static final byte[] f6744a = {1, 2, 3, 4, 5, 6, 7, 8};

    /* renamed from: a */
    public static String m9338a(String str) {
        PrintStream printStream = System.out;
        printStream.println("secretKey.getBytes(): " + Arrays.toString("TQRFEBLW".getBytes()));
        byte[] bytes = "TQRFEBLW".getBytes();
        if (bytes.length == 8) {
            byte[] bArr = new byte[24];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            bytes = bArr;
        }
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(bytes));
            Cipher instance = Cipher.getInstance("desede/CBC/PKCS5Padding");
            instance.init(2, generateSecret, new IvParameterSpec(f6744a));
            return new String(instance.doFinal(Base64.decode(str, 1)));
        } catch (Exception unused) {
            return null;
        }
    }
}
