package com.juconnect.connectlife.ju_ble.parameters;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/parameters/Sha256Util;", "", "()V", "byte2Hex", "", "bytes", "", "getSHA256StrJava", "str", "string2Sha256ByteJava", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Sha256Util.kt */
public final class Sha256Util {
    @NotNull
    public static final Sha256Util INSTANCE = new Sha256Util();

    private final String byte2Hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "stringBuffer.toString()");
        return stringBuffer2;
    }

    @NotNull
    public final String getSHA256StrJava(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance(\"SHA-256\")");
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] digest = instance.digest();
            Intrinsics.checkNotNullExpressionValue(digest, "messageDigest.digest()");
            return byte2Hex(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @NotNull
    public final byte[] string2Sha256ByteJava(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        instance.update(bytes);
        byte[] digest = instance.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "messageDigest.digest()");
        return digest;
    }
}
