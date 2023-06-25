package com.juconnect.connectlife.ju_ble.utils;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/utils/AesUtils2;", "", "()V", "TAG", "", "ivParameterSpec", "Ljavax/crypto/spec/IvParameterSpec;", "password", "secretKeySpec", "Ljavax/crypto/spec/SecretKeySpec;", "decrypt", "content", "", "offset", "", "length", "encrypt", "initSecretKeySpec", "throwException", "", "e", "Ljava/lang/Exception;", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AesUtils2.kt */
public final class AesUtils2 {
    @NotNull
    public String TAG = "TcpClient";
    public IvParameterSpec ivParameterSpec;
    @NotNull
    public String password = "HisenseOverSeasIOTSetUpProtocal;";
    public SecretKeySpec secretKeySpec;

    public AesUtils2() {
        initSecretKeySpec();
    }

    private final SecretKeySpec initSecretKeySpec() {
        if (this.secretKeySpec == null) {
            byte[] bytes = this.password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            this.secretKeySpec = new SecretKeySpec(bytes, "AES");
        }
        SecretKeySpec secretKeySpec2 = this.secretKeySpec;
        if (secretKeySpec2 != null) {
            return secretKeySpec2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("secretKeySpec");
        return null;
    }

    private final void throwException(Exception exc) {
        throw exc;
    }

    @Nullable
    public final String decrypt(@Nullable byte[] bArr, int i, int i2) {
        try {
            byte[] decode = Base64.decode(bArr, i, i2, 0);
            Intrinsics.stringPlus("base解析的数据:", decode);
            byte[] bytes = this.password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bytes, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
            instance.init(2, secretKeySpec2);
            byte[] doFinal = instance.doFinal(decode);
            Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal");
            return new String(doFinal, Charsets.UTF_8);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throwException(e);
            return null;
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            throwException(e2);
            return null;
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            throwException(e3);
            return null;
        } catch (IllegalBlockSizeException e4) {
            e4.printStackTrace();
            throwException(e4);
            return null;
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            throwException(e5);
            return null;
        } catch (Exception e6) {
            e6.printStackTrace();
            throwException(e6);
            return null;
        }
    }

    @Nullable
    public final String encrypt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BrowserServiceFileProvider.CONTENT_SCHEME);
        try {
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
            Charset forName = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec2 = this.secretKeySpec;
            if (secretKeySpec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("secretKeySpec");
                secretKeySpec2 = null;
            }
            instance.init(1, secretKeySpec2);
            return Base64.encodeToString(instance.doFinal(bytes), 0);
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            Intrinsics.stringPlus("加密失败:", e.getMessage());
            throwException(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            Intrinsics.stringPlus("加密失败:", e2.getMessage());
            throwException(e2);
            return null;
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
            Intrinsics.stringPlus("加密失败:", e3.getMessage());
            throwException(e3);
            return null;
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            Intrinsics.stringPlus("加密失败:", e4.getMessage());
            throwException(e4);
            return null;
        } catch (IllegalBlockSizeException e5) {
            e5.printStackTrace();
            Intrinsics.stringPlus("加密失败:", e5.getMessage());
            throwException(e5);
            return null;
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            Intrinsics.stringPlus("加密失败:", e6.getMessage());
            throwException(e6);
            return null;
        }
    }
}
