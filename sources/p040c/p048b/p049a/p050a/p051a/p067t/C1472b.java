package p040c.p048b.p049a.p050a.p051a.p067t;

import android.util.Base64;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.t.b */
/* compiled from: JWTDecoder */
public class C1472b {

    /* renamed from: a */
    public static final String f648a = "c.b.a.a.a.t.b";

    /* renamed from: c.b.a.a.a.t.b$a */
    /* compiled from: JWTDecoder */
    public enum C1473a {
        HEADER,
        PAYLOAD,
        SIGNATURE
    }

    /* renamed from: a */
    public JSONObject mo15339a(String str) {
        if (str == null) {
            return null;
        }
        try {
            String[] d = mo15342d(str.trim());
            mo15343e(d);
            return new JSONObject(mo15341c(d[C1473a.PAYLOAD.ordinal()]));
        } catch (UnsupportedEncodingException e) {
            String str2 = f648a;
            C1485a.m838k(str2, "Failed to decode: " + e.getMessage());
            return null;
        } catch (JSONException e2) {
            String str3 = f648a;
            C1485a.m838k(str3, "Failed to decode: " + e2.getMessage());
            return null;
        } catch (InvalidKeyException e3) {
            String str4 = f648a;
            C1485a.m838k(str4, "Failed to decode: " + e3.getMessage());
            return null;
        } catch (NoSuchProviderException e4) {
            String str5 = f648a;
            C1485a.m838k(str5, "Failed to decode: " + e4.getMessage());
            return null;
        } catch (SignatureException e5) {
            String str6 = f648a;
            C1485a.m838k(str6, "Failed to decode: " + e5.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e6) {
            String str7 = f648a;
            C1485a.m838k(str7, "Failed to decode: " + e6.getMessage());
            return null;
        } catch (CertificateException e7) {
            String str8 = f648a;
            C1485a.m838k(str8, "Failed to decode: " + e7.getMessage());
            return null;
        } catch (IOException e8) {
            String str9 = f648a;
            C1485a.m838k(str9, "Failed to decode: " + e8.getMessage());
            return null;
        } catch (SecurityException e9) {
            String str10 = f648a;
            C1485a.m838k(str10, "Failed to decode: " + e9.getMessage());
            return null;
        } catch (IllegalArgumentException e10) {
            String str11 = f648a;
            C1485a.m838k(str11, "Failed to decode: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final byte[] mo15340b(String str) {
        return Base64.decode(str.trim().getBytes("UTF-8"), 0);
    }

    /* renamed from: c */
    public final String mo15341c(String str) {
        return new String(mo15340b(str), "UTF-8");
    }

    /* renamed from: d */
    public final String[] mo15342d(String str) {
        String[] split = str.split("[.]");
        if (split.length == 3) {
            return split;
        }
        throw new IllegalArgumentException("Invalid JWT format");
    }

    /* renamed from: e */
    public final void mo15343e(String[] strArr) {
        if (mo15344f(mo15340b(strArr[C1473a.SIGNATURE.ordinal()]), (strArr[C1473a.HEADER.ordinal()].trim() + MAPCookie.DOT + strArr[C1473a.PAYLOAD.ordinal()].trim()).getBytes("UTF-8"), C1480i.m818a())) {
            C1485a.m832e(f648a, "Signature match!");
            return;
        }
        throw new SecurityException("Decoding fails: signature mismatch!");
    }

    /* renamed from: f */
    public final boolean mo15344f(byte[] bArr, byte[] bArr2, Certificate certificate) {
        Signature instance = Signature.getInstance("SHA256withRSA");
        instance.initVerify(certificate);
        instance.update(bArr2);
        return instance.verify(bArr);
    }
}
