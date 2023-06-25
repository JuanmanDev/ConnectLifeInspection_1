package p040c.p151o.p152a.p153a.p158l;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import com.gigya.android.sdk.encryption.EncryptionException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import p040c.p151o.p152a.p153a.p166o.C2153a;
import p040c.p151o.p152a.p153a.p170r.C2181c;
import p040c.p151o.p152a.p153a.p174u.C2202c;

@RequiresApi(api = 18)
/* renamed from: c.o.a.a.l.b */
/* compiled from: SessionKey */
public class C2133b implements C2132a {

    /* renamed from: a */
    public String f2101a;

    /* renamed from: b */
    public final Context f2102b;

    /* renamed from: c */
    public final C2153a f2103c;

    /* renamed from: a */
    public final void mo16938a() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", this.f2101a);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar instance2 = Calendar.getInstance(timeZone);
        Calendar instance3 = Calendar.getInstance(timeZone);
        instance3.add(1, 25);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            instance.initialize(new KeyGenParameterSpec.Builder(mo16939b(), 3).setDigests(new String[]{"SHA-256", "SHA-512"}).setBlockModes(new String[]{"ECB"}).setEncryptionPaddings(new String[]{"PKCS1Padding"}).setKeyValidityStart(instance2.getTime()).setKeyValidityEnd(instance3.getTime()).build());
            instance.generateKeyPair();
        } else if (i >= 19) {
            instance.initialize(new KeyPairGeneratorSpec.Builder(this.f2102b).setAlias(mo16939b()).setKeySize(2048).setEndDate(instance3.getTime()).setStartDate(instance2.getTime()).setSerialNumber(BigInteger.ONE).setSubject(new X500Principal("CN = Secured Preference Store, O = Devliving Online")).build());
            instance.generateKeyPair();
        } else {
            instance.initialize(new KeyPairGeneratorSpec.Builder(this.f2102b).setAlias(mo16939b()).setEndDate(instance3.getTime()).setStartDate(instance2.getTime()).setSerialNumber(BigInteger.ONE).setSubject(new X500Principal("CN = Secured Preference Store, O = Devliving Online")).build());
            instance.generateKeyPair();
        }
    }

    /* renamed from: b */
    public String mo16939b() {
        return "GS_ALIAS";
    }

    /* renamed from: c */
    public Cipher mo16940c(Key key) {
        try {
            Cipher instance = Cipher.getInstance(mo16942e());
            instance.init(2, key);
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            C2181c.m3296b().mo17013a("5.1.5", "core", "getDecryptionCipher error");
            throw new EncryptionException("getDecryptionCipher: exception" + e.getMessage(), e.getCause());
        }
    }

    /* renamed from: d */
    public Cipher mo16941d(Key key) {
        try {
            Cipher instance = Cipher.getInstance(mo16942e());
            instance.init(1, key);
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            C2181c.m3296b().mo17013a("5.1.5", "core", "getDecryptionCipher error");
            throw new EncryptionException("getDecryptionCipher: exception" + e.getMessage(), e.getCause());
        }
    }

    /* renamed from: e */
    public String mo16942e() {
        return "RSA/ECB/PKCS1Padding";
    }

    public SecretKey getKey() {
        try {
            KeyStore instance = KeyStore.getInstance(this.f2101a);
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!instance.containsAlias(mo16939b())) {
                mo16938a();
                PublicKey publicKey = instance.getCertificate(mo16939b()).getPublicKey();
                KeyGenerator instance2 = KeyGenerator.getInstance("AES");
                instance2.init(128);
                SecretKey generateKey = instance2.generateKey();
                this.f2103c.mo16970i("GS_PREFA", C2202c.m3347a(mo16941d(publicKey).doFinal(generateKey.getEncoded())));
                return generateKey;
            } else if (!instance.entryInstanceOf(mo16939b(), KeyStore.PrivateKeyEntry.class)) {
                instance.deleteEntry(mo16939b());
                return getKey();
            } else {
                String h = this.f2103c.mo16969h("GS_PREFA", (String) null);
                if (h == null || !instance.containsAlias(mo16939b()) || !instance.entryInstanceOf(mo16939b(), KeyStore.PrivateKeyEntry.class)) {
                    return null;
                }
                byte[] doFinal = mo16940c((PrivateKey) instance.getKey(mo16939b(), (char[]) null)).doFinal(C2202c.m3348b(h));
                return new SecretKeySpec(doFinal, 0, doFinal.length, "AES");
            }
        } catch (Exception e) {
            e.printStackTrace();
            C2181c.m3296b().mo17013a("5.1.5", "core", "EncryptionException: unable to get/generate encryption key");
            throw new EncryptionException("GetKey: exception" + e.getMessage(), e.getCause());
        }
    }
}
