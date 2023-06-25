package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p040c.p048b.p049a.p050a.p051a.C1360g;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.g */
/* compiled from: DataEncryptionUpgradeHelper */
public abstract class C1422g {

    /* renamed from: c */
    public static final String f535c = C1423h.class.getSimpleName();

    /* renamed from: d */
    public static final Set<String> f536d = new HashSet(Arrays.asList(new String[]{"AES_00"}));

    /* renamed from: a */
    public String f537a;

    /* renamed from: b */
    public Context f538b;

    public C1422g(Context context, String str) {
        this.f538b = context;
        this.f537a = str;
    }

    /* renamed from: a */
    public static String m556a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: b */
    public static String m557b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1485a.m830c(f535c, "UTF-8 unsupported from byte to String! Just return null", e);
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m558c(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 2);
    }

    /* renamed from: e */
    public static byte[] m559e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            C1485a.m833f(f535c, "UTF-8 unsupported from string to byte! Just return null", e);
            return null;
        }
    }

    /* renamed from: d */
    public String mo15202d(String str) {
        return C1360g.m286d(this.f538b, str + "encryptVersion");
    }

    /* renamed from: f */
    public void mo15203f(String str) {
        C1360g.m290h(this.f538b, str + "encryptVersion", this.f537a);
    }
}
