package p039be.appmire.flutterkeychain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.core.app.Person;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo47991d2 = {"Lbe/appmire/flutterkeychain/RsaKeyStoreKeyWrapper;", "Lbe/appmire/flutterkeychain/KeyWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "KEYSTORE_PROVIDER_ANDROID", "", "TYPE_RSA", "keyAlias", "createKeys", "", "createRSAKeysIfNeeded", "decrypt", "", "input", "encrypt", "getEntry", "Ljava/security/KeyStore$PrivateKeyEntry;", "getRSACipher", "Ljavax/crypto/Cipher;", "unwrap", "Ljava/security/Key;", "wrappedKey", "algorithm", "wrap", "key", "flutter_keychain_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: be.appmire.flutterkeychain.RsaKeyStoreKeyWrapper */
/* compiled from: FlutterKeychainPlugin.kt */
public final class RsaKeyStoreKeyWrapper implements KeyWrapper {
    @NotNull
    public final String KEYSTORE_PROVIDER_ANDROID = "AndroidKeyStore";
    @NotNull
    public final String TYPE_RSA = "RSA";
    @NotNull
    public final Context context;
    @NotNull
    public final String keyAlias;

    public RsaKeyStoreKeyWrapper(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.keyAlias = Intrinsics.stringPlus(context2.getPackageName(), ".FlutterKeychain");
        this.context = context2;
        createRSAKeysIfNeeded();
    }

    @SuppressLint({"NewApi"})
    private final void createKeys() {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(1, 25);
        KeyPairGenerator instance3 = KeyPairGenerator.getInstance(this.TYPE_RSA, this.KEYSTORE_PROVIDER_ANDROID);
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(this.keyAlias, 3).setCertificateSubject(new X500Principal(Intrinsics.stringPlus("CN=", this.keyAlias))).setDigests(new String[]{"SHA-256"}).setEncryptionPaddings(new String[]{"PKCS1Padding"}).setUserAuthenticationRequired(false).setCertificateSerialNumber(BigInteger.valueOf(1)).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(keyAlias, KeyPro…\n                .build()");
        instance3.initialize(build);
        instance3.generateKeyPair();
    }

    private final void createRSAKeysIfNeeded() {
        KeyStore.Entry entry;
        KeyStore instance = KeyStore.getInstance(this.KEYSTORE_PROVIDER_ANDROID);
        instance.load((KeyStore.LoadStoreParameter) null);
        int i = 1;
        while (true) {
            if (i >= 6) {
                entry = null;
                break;
            }
            i++;
            try {
                entry = instance.getEntry(this.keyAlias, (KeyStore.ProtectionParameter) null);
                break;
            } catch (Exception unused) {
            }
        }
        if (entry == null) {
            createKeys();
            try {
                entry = instance.getEntry(this.keyAlias, (KeyStore.ProtectionParameter) null);
            } catch (Exception unused2) {
                instance.deleteEntry(this.keyAlias);
            }
            if (entry == null) {
                createKeys();
            }
        }
    }

    private final KeyStore.PrivateKeyEntry getEntry() {
        KeyStore instance = KeyStore.getInstance(this.KEYSTORE_PROVIDER_ANDROID);
        KeyStore.PrivateKeyEntry privateKeyEntry = null;
        instance.load((KeyStore.LoadStoreParameter) null);
        KeyStore.Entry entry = instance.getEntry(this.keyAlias, (KeyStore.ProtectionParameter) null);
        if (entry != null) {
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            }
            if (privateKeyEntry != null) {
                return privateKeyEntry;
            }
            throw new Exception("Not an instance of a PrivateKeyEntry");
        }
        throw new Exception(Intrinsics.stringPlus("No key found under alias: ", this.keyAlias));
    }

    private final Cipher getRSACipher() {
        if (Build.VERSION.SDK_INT < 23) {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
            Intrinsics.checkNotNullExpressionValue(instance, "{\n            Cipher.get…e or public key\n        }");
            return instance;
        }
        Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
        Intrinsics.checkNotNullExpressionValue(instance2, "{\n            Cipher.get…oreBCWorkaround\n        }");
        return instance2;
    }

    @NotNull
    public final byte[] decrypt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "input");
        PrivateKey privateKey = getEntry().getPrivateKey();
        Cipher rSACipher = getRSACipher();
        rSACipher.init(2, privateKey);
        byte[] doFinal = rSACipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(input)");
        return doFinal;
    }

    @NotNull
    public final byte[] encrypt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "input");
        PublicKey publicKey = getEntry().getCertificate().getPublicKey();
        Cipher rSACipher = getRSACipher();
        rSACipher.init(1, publicKey);
        byte[] doFinal = rSACipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(input)");
        return doFinal;
    }

    @NotNull
    public Key unwrap(@NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bArr, "wrappedKey");
        Intrinsics.checkNotNullParameter(str, "algorithm");
        PrivateKey privateKey = getEntry().getPrivateKey();
        Cipher rSACipher = getRSACipher();
        rSACipher.init(4, privateKey);
        Key unwrap = rSACipher.unwrap(bArr, str, 3);
        Intrinsics.checkNotNullExpressionValue(unwrap, "cipher.unwrap(wrappedKey…rithm, Cipher.SECRET_KEY)");
        return unwrap;
    }

    @NotNull
    public byte[] wrap(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, Person.KEY_KEY);
        PublicKey publicKey = getEntry().getCertificate().getPublicKey();
        Cipher rSACipher = getRSACipher();
        rSACipher.init(3, publicKey);
        byte[] wrap = rSACipher.wrap(key);
        Intrinsics.checkNotNullExpressionValue(wrap, "cipher.wrap(key)");
        return wrap;
    }
}
