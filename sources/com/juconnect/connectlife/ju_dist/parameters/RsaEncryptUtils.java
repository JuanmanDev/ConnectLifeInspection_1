package com.juconnect.connectlife.ju_dist.parameters;

import androidx.core.app.Person;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¨\u0006\u0010"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/parameters/RsaEncryptUtils;", "", "()V", "getPrivateKey", "Ljava/security/PrivateKey;", "privateKeyBytes", "", "getPublicKey", "Ljava/security/PublicKey;", "publicKeyBytes", "rsaDecryptByPrivateKey", "data", "key", "rsaDecryptByPublicKey", "rsaEncryptByPrivateKey", "rsaEncryptByPublicKey", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RsaEncryptUtils.kt */
public final class RsaEncryptUtils {
    @NotNull
    public static final RsaEncryptUtils INSTANCE = new RsaEncryptUtils();

    @NotNull
    public final PrivateKey getPrivateKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "privateKeyBytes");
        PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
        Intrinsics.checkNotNullExpressionValue(generatePrivate, "keyFactory.generatePriva…KeySpec(privateKeyBytes))");
        return generatePrivate;
    }

    @NotNull
    public final PublicKey getPublicKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "publicKeyBytes");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "keyFactory.generatePubli…dKeySpec(publicKeyBytes))");
        return generatePublic;
    }

    @NotNull
    public final byte[] rsaDecryptByPrivateKey(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        Intrinsics.checkNotNullParameter(bArr2, Person.KEY_KEY);
        PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
        Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
        instance.init(2, generatePrivate);
        byte[] doFinal = instance.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
        return doFinal;
    }

    @NotNull
    public final byte[] rsaDecryptByPublicKey(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        Intrinsics.checkNotNullParameter(bArr2, Person.KEY_KEY);
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
        Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
        instance.init(2, generatePublic);
        byte[] doFinal = instance.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
        return doFinal;
    }

    @NotNull
    public final byte[] rsaEncryptByPrivateKey(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        Intrinsics.checkNotNullParameter(bArr2, Person.KEY_KEY);
        PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
        Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
        instance.init(1, generatePrivate);
        byte[] doFinal = instance.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
        return doFinal;
    }

    @NotNull
    public final byte[] rsaEncryptByPublicKey(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        Intrinsics.checkNotNullParameter(bArr2, Person.KEY_KEY);
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
        Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
        instance.init(1, generatePublic);
        byte[] doFinal = instance.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
        return doFinal;
    }
}
