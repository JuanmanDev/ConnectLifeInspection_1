package com.hisense.connect_life.hismart.networks.parameters;

import android.content.Context;
import android.util.Base64;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.HiSystemSetting;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Locale;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/RsaPasswordUtils;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RsaPasswordUtils.kt */
public final class RsaPasswordUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String RSA = "RSA";

    @Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\tH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/RsaPasswordUtils$Companion;", "", "()V", "RSA", "", "getRSA", "()Ljava/lang/String;", "enCodePwd", "data", "", "pwd", "encryptData", "publicKey", "Ljava/security/PublicKey;", "loadPublicKey", "publicKeySteam", "Ljava/io/InputStream;", "publicKeyStr", "loadPwdPubKey", "context", "Landroid/content/Context;", "md5", "str", "readKey", "inSteam", "toHex", "byteArray", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RsaPasswordUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String readKey(InputStream inputStream) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    Intrinsics.checkNotNull(readLine);
                    if (readLine.charAt(0) != '-') {
                        sb.append(readLine);
                    }
                } else {
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                    return sb2;
                }
            }
        }

        private final String toHex(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                byte b = bArr[i];
                i++;
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                    sb.append(hexString);
                } else {
                    sb.append(hexString);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "with(StringBuilder()) {\n… toString()\n            }");
            return sb2;
        }

        @NotNull
        public final String enCodePwd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "pwd");
            String md5 = md5(str);
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String upperCase = md5.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            Charset defaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
            byte[] bytes = upperCase.getBytes(defaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return enCodePwd(bytes);
        }

        @NotNull
        public final byte[] encryptData(@NotNull byte[] bArr, @NotNull PublicKey publicKey) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
            instance.init(1, publicKey);
            byte[] doFinal = instance.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
            return doFinal;
        }

        @NotNull
        public final String getRSA() {
            return RsaPasswordUtils.RSA;
        }

        @NotNull
        public final PublicKey loadPublicKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "publicKeyStr");
            try {
                byte[] decode = Base64.decode(str, 2);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(publicKeyStr ,Base64.NO_WRAP)");
                KeyFactory instance = KeyFactory.getInstance(getRSA());
                Intrinsics.checkNotNullExpressionValue(instance, "getInstance(RSA)");
                PublicKey generatePublic = instance.generatePublic(new X509EncodedKeySpec(decode));
                if (generatePublic != null) {
                    return (RSAPublicKey) generatePublic;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
            } catch (NoSuchAlgorithmException unused) {
                throw new Exception("无此算法");
            } catch (InvalidKeySpecException unused2) {
                throw new Exception("公钥非法");
            } catch (NullPointerException unused3) {
                throw new Exception("公钥数据为空");
            }
        }

        @NotNull
        public final PublicKey loadPwdPubKey(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            InputStream open = context.getAssets().open("rsa_account_public_key.key");
            Intrinsics.checkNotNullExpressionValue(open, "context.getAssets().open…_account_public_key.key\")");
            return loadPublicKey(open);
        }

        @NotNull
        public final String md5(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = instance.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, BundleJUnitUtils.KEY_RESULT);
            return toHex(digest);
        }

        @NotNull
        public final String enCodePwd(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            PublicKey loadPwdPubKey = loadPwdPubKey();
            if (loadPwdPubKey == null) {
                return "";
            }
            String encodeToString = Base64.encodeToString(encryptData(bArr, loadPwdPubKey), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(encryptDa… pubKey), Base64.NO_WRAP)");
            return encodeToString;
        }

        @Nullable
        public final PublicKey loadPwdPubKey() {
            HiSystemSetting hiSystemSetting = HiNetWorks.Companion.getInstance().getHiSystemSetting();
            Context context = hiSystemSetting == null ? null : hiSystemSetting.getContext();
            if (context == null) {
                return null;
            }
            return loadPwdPubKey(context);
        }

        @NotNull
        public final PublicKey loadPublicKey(@NotNull InputStream inputStream) {
            Intrinsics.checkNotNullParameter(inputStream, "publicKeySteam");
            return loadPublicKey(readKey(inputStream));
        }
    }
}
