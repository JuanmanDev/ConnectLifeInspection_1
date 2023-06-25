package p039be.appmire.flutterkeychain;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo47991d2 = {"Lbe/appmire/flutterkeychain/AesStringEncryptor;", "Lbe/appmire/flutterkeychain/StringEncryptor;", "preferences", "Landroid/content/SharedPreferences;", "keyWrapper", "Lbe/appmire/flutterkeychain/KeyWrapper;", "(Landroid/content/SharedPreferences;Lbe/appmire/flutterkeychain/KeyWrapper;)V", "KEY_ALGORITHM", "", "WRAPPED_AES_KEY_ITEM", "charset", "Ljava/nio/charset/Charset;", "cipher", "Ljavax/crypto/Cipher;", "ivSize", "", "keySize", "secretKey", "Ljava/security/Key;", "secureRandom", "Ljava/security/SecureRandom;", "createKey", "decrypt", "input", "encrypt", "flutter_keychain_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: be.appmire.flutterkeychain.AesStringEncryptor */
/* compiled from: FlutterKeychainPlugin.kt */
public final class AesStringEncryptor implements StringEncryptor {
    @NotNull
    public final String KEY_ALGORITHM = "AES";
    @NotNull
    public final String WRAPPED_AES_KEY_ITEM = "W0n5hlJtrAH0K8mIreDGxtG";
    @NotNull
    public final Charset charset;
    @NotNull
    public final Cipher cipher;
    public final int ivSize = 16;
    public final int keySize = 16;
    @NotNull
    public Key secretKey;
    @NotNull
    public final SecureRandom secureRandom;

    public AesStringEncryptor(@NotNull SharedPreferences sharedPreferences, @NotNull KeyWrapper keyWrapper) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "preferences");
        Intrinsics.checkNotNullParameter(keyWrapper, "keyWrapper");
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        this.charset = forName;
        this.secureRandom = new SecureRandom();
        String string = sharedPreferences.getString(this.WRAPPED_AES_KEY_ITEM, (String) null);
        if (string == null) {
            this.secretKey = createKey(sharedPreferences, keyWrapper);
        } else {
            byte[] decode = Base64.decode(string, 0);
            try {
                Intrinsics.checkNotNullExpressionValue(decode, "encrypted");
                this.secretKey = keyWrapper.unwrap(decode, this.KEY_ALGORITHM);
            } catch (Exception unused) {
                this.secretKey = createKey(sharedPreferences, keyWrapper);
            }
        }
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(\"AES/CBC/PKCS7Padding\")");
        this.cipher = instance;
    }

    @NotNull
    public final Key createKey(@NotNull SharedPreferences sharedPreferences, @NotNull KeyWrapper keyWrapper) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "preferences");
        Intrinsics.checkNotNullParameter(keyWrapper, "keyWrapper");
        byte[] bArr = new byte[this.keySize];
        this.secureRandom.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.KEY_ALGORITHM);
        sharedPreferences.edit().putString(this.WRAPPED_AES_KEY_ITEM, Base64.encodeToString(keyWrapper.wrap(secretKeySpec), 0)).commit();
        return secretKeySpec;
    }

    @Nullable
    public String decrypt(@Nullable String str) {
        if (str == null) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        int i = this.ivSize;
        byte[] bArr = new byte[i];
        System.arraycopy(decode, 0, bArr, 0, i);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        int length = decode.length - this.ivSize;
        byte[] bArr2 = new byte[length];
        System.arraycopy(decode, i, bArr2, 0, length);
        this.cipher.init(2, this.secretKey, ivParameterSpec);
        byte[] doFinal = this.cipher.doFinal(bArr2);
        Intrinsics.checkNotNullExpressionValue(doFinal, "outputBytes");
        return new String(doFinal, this.charset);
    }

    @Nullable
    public String encrypt(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int i = this.ivSize;
        byte[] bArr = new byte[i];
        this.secureRandom.nextBytes(bArr);
        this.cipher.init(1, this.secretKey, new IvParameterSpec(bArr));
        Cipher cipher2 = this.cipher;
        byte[] bytes = str.getBytes(this.charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] doFinal = cipher2.doFinal(bytes);
        byte[] bArr2 = new byte[(doFinal.length + i)];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(doFinal, 0, bArr2, i, doFinal.length);
        return Base64.encodeToString(bArr2, 0);
    }
}
