package com.example.javatest.encoding;

import android.util.Base64;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/example/javatest/encoding/AesUtils;", "", "()V", "ivParameterSpec", "Ljavax/crypto/spec/IvParameterSpec;", "password", "", "secretKeySpec", "Ljavax/crypto/spec/SecretKeySpec;", "decrypt", "content", "", "offset", "", "length", "encrypt", "initIv", "initSecretKeySpec", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AesUtils.kt */
public final class AesUtils {
    public IvParameterSpec ivParameterSpec;
    @NotNull
    public String password = "hisconnect";
    public SecretKeySpec secretKeySpec;

    public AesUtils() {
        initSecretKeySpec();
        initIv();
    }

    private final IvParameterSpec initIv() {
        if (this.ivParameterSpec == null) {
            byte[] bytes = "205681D89D731A8F".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            this.ivParameterSpec = new IvParameterSpec(bytes);
        }
        IvParameterSpec ivParameterSpec2 = this.ivParameterSpec;
        if (ivParameterSpec2 != null) {
            return ivParameterSpec2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivParameterSpec");
        return null;
    }

    private final SecretKeySpec initSecretKeySpec() {
        if (this.secretKeySpec == null) {
            byte[] bytes = this.password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArr = new byte[16];
            ArraysKt___ArraysJvmKt.copyInto$default(bytes, bArr, 0, 0, 0, 14, (Object) null);
            if (bytes.length < 16) {
                for (int length = bytes.length; length < 16; length++) {
                    bArr[length] = 0;
                }
            }
            this.secretKeySpec = new SecretKeySpec(bArr, "AES");
        }
        SecretKeySpec secretKeySpec2 = this.secretKeySpec;
        if (secretKeySpec2 != null) {
            return secretKeySpec2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("secretKeySpec");
        return null;
    }

    @Nullable
    public final String decrypt(@Nullable byte[] bArr, int i, int i2) {
        try {
            byte[] decode = Base64.decode(bArr, i, i2, 0);
            byte[] bytes = this.password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArr2 = new byte[16];
            ArraysKt___ArraysJvmKt.copyInto$default(bytes, bArr2, 0, 0, 0, 14, (Object) null);
            if (bytes.length < 16) {
                for (int length = bytes.length; length < 16; length++) {
                    bArr2[length] = 0;
                }
            }
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            byte[] bytes2 = "205681D89D731A8F".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            instance.init(2, secretKeySpec2, new IvParameterSpec(bytes2));
            byte[] doFinal = instance.doFinal(decode);
            Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal");
            return new String(doFinal, Charsets.UTF_8);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            return "";
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            return "";
        } catch (IllegalBlockSizeException e4) {
            e4.printStackTrace();
            return "";
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    @Nullable
    public final String encrypt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BrowserServiceFileProvider.CONTENT_SCHEME);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            Charset forName = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec2 = this.secretKeySpec;
            if (secretKeySpec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("secretKeySpec");
                secretKeySpec2 = null;
            }
            IvParameterSpec ivParameterSpec2 = this.ivParameterSpec;
            if (ivParameterSpec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivParameterSpec");
                ivParameterSpec2 = null;
            }
            instance.init(1, secretKeySpec2, ivParameterSpec2);
            return Base64.encodeToString(instance.doFinal(bytes), 0);
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e5) {
            e5.printStackTrace();
            return null;
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
