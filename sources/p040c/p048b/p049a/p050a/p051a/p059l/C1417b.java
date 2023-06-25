package p040c.p048b.p049a.p050a.p051a.p059l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import p040c.p048b.p049a.p050a.p051a.C1360g;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.b */
/* compiled from: AESEncryptor */
public final class C1417b {

    /* renamed from: e */
    public static C1417b f516e = null;

    /* renamed from: f */
    public static final String f517f = "b";

    /* renamed from: a */
    public final Context f518a;

    /* renamed from: b */
    public final byte[] f519b;

    /* renamed from: c */
    public final SecretKeySpec f520c;

    /* renamed from: d */
    public KeyStore f521d;

    public C1417b(Context context) {
        if (context != null) {
            this.f518a = context;
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f521d = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
            mo15178h(context);
            this.f519b = mo15180j();
            this.f520c = mo15181l();
            return;
        }
        throw new IllegalArgumentException("Context can not be null");
    }

    /* renamed from: g */
    public static byte[] m506g() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: k */
    public static synchronized C1417b m507k(Context context) {
        C1417b bVar;
        synchronized (C1417b.class) {
            if (f516e == null) {
                C1485a.m828a(f517f, "Creating AESEncryptor for encrypting data");
                f516e = new C1417b(context);
            }
            bVar = f516e;
        }
        return bVar;
    }

    /* renamed from: m */
    public static byte[] m508m(Cipher cipher, byte[] bArr, int i, int i2) {
        if (cipher == null) {
            return null;
        }
        return cipher.doFinal(bArr, i, i2);
    }

    /* renamed from: n */
    public static byte[] m509n(Cipher cipher, byte[] bArr) {
        if (cipher == null) {
            return null;
        }
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    public String mo15172a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return "AES_00|" + C1422g.m556a(bArr3);
    }

    /* renamed from: b */
    public final Cipher mo15173b(int i, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        Cipher instance = Cipher.getInstance(str);
        instance.init(i, this.f520c, algorithmParameterSpec);
        return instance;
    }

    /* renamed from: c */
    public final Cipher mo15174c(int i, String str, Key key) {
        Cipher instance = Cipher.getInstance(str);
        instance.init(i, key);
        return instance;
    }

    /* renamed from: d */
    public String mo15175d(String str) {
        C1485a.m828a(f517f, "Decrypting data with AES key");
        if (str != null) {
            byte[] c = C1422g.m558c(str.substring(7));
            return C1422g.m557b(m508m(mo15173b(2, "AES/CBC/PKCS5Padding", new IvParameterSpec(c, 0, 16)), c, 16, c.length - 16));
        }
        throw new IllegalArgumentException("cipherText is null!");
    }

    /* renamed from: e */
    public String mo15176e(byte[] bArr) {
        C1485a.m828a(f517f, "Encrypting AES encryption key with RSA public key");
        return C1422g.m556a(m509n(mo15174c(1, "RSA/ECB/PKCS1Padding", this.f521d.getCertificate("LWA_KEYSTORE_ALIAS").getPublicKey()), bArr));
    }

    /* renamed from: f */
    public String mo15177f(String str) {
        C1485a.m828a(f517f, "Encrypting data with AES key");
        if (str != null) {
            byte[] g = m506g();
            byte[] e = C1422g.m559e(str);
            return mo15172a(g, m508m(mo15173b(1, "AES/CBC/PKCS5Padding", new IvParameterSpec(g)), e, 0, e.length));
        }
        throw new IllegalArgumentException("The data to be encrypted is null!");
    }

    @TargetApi(18)
    /* renamed from: h */
    public void mo15178h(Context context) {
        KeyPairGeneratorSpec keyPairGeneratorSpec;
        KeyStore keyStore = this.f521d;
        if (keyStore == null) {
            throw new IllegalArgumentException("Keystore is null!");
        } else if (keyStore.containsAlias("LWA_KEYSTORE_ALIAS")) {
            C1485a.m832e(f517f, "RSA keypair is already generated, returning");
        } else {
            C1485a.m832e(f517f, "Generating RSA keypair...");
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 30);
            if (Build.VERSION.SDK_INT >= 19) {
                keyPairGeneratorSpec = new KeyPairGeneratorSpec.Builder(context).setAlias("LWA_KEYSTORE_ALIAS").setSubject(new X500Principal("CN=LWA_KEYSTORE_ALIAS")).setSerialNumber(BigInteger.TEN).setKeySize(2048).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
            } else {
                keyPairGeneratorSpec = new KeyPairGeneratorSpec.Builder(context).setAlias("LWA_KEYSTORE_ALIAS").setSubject(new X500Principal("CN=LWA_KEYSTORE_ALIAS")).setSerialNumber(BigInteger.TEN).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
            }
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance3.initialize(keyPairGeneratorSpec);
            instance3.generateKeyPair();
        }
    }

    /* renamed from: i */
    public byte[] mo15179i(String str) {
        C1485a.m828a(f517f, "Decrypting AES key with RSA private key");
        return m509n(mo15174c(2, "RSA/ECB/PKCS1Padding", (PrivateKey) this.f521d.getKey("LWA_KEYSTORE_ALIAS", (char[]) null)), C1422g.m558c(str));
    }

    /* renamed from: j */
    public byte[] mo15180j() {
        String a = C1360g.m283a(this.f518a);
        if (a != null) {
            return mo15179i(a);
        }
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        byte[] encoded = instance.generateKey().getEncoded();
        C1360g.m289g(this.f518a, mo15176e(encoded));
        return encoded;
    }

    /* renamed from: l */
    public SecretKeySpec mo15181l() {
        if (this.f519b != null) {
            C1485a.m828a(f517f, "Generate keyspec with given encryption key");
            return new SecretKeySpec(this.f519b, "AES");
        }
        throw new IllegalArgumentException("Encryption key is null!");
    }
}
