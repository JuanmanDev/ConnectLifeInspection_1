package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import com.amazon.identity.auth.device.datastore.EncryptionException;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.a */
/* compiled from: AESEncryptionHelper */
public class C1416a<T extends C1413a> extends C1422g {

    /* renamed from: f */
    public static final String f513f = "a";

    /* renamed from: g */
    public static final boolean f514g = (Build.VERSION.SDK_INT >= 18);

    /* renamed from: e */
    public String f515e;

    public C1416a(Context context, String str) {
        super(context, "AES_00");
        this.f515e = str;
    }

    /* renamed from: h */
    public static String m503h(String str, Context context) {
        if (!f514g || context == null) {
            String str2 = f513f;
            StringBuilder sb = new StringBuilder();
            sb.append("No need to encrypt data. IS_QUALIFIED_PLATFORM : ");
            sb.append(f514g);
            sb.append(", Context is null: ");
            sb.append(context == null);
            C1485a.m828a(str2, sb.toString());
            return str;
        }
        try {
            return C1417b.m507k(context).mo15177f(str);
        } catch (Exception e) {
            C1485a.m830c(f513f, "Unable to encrypt data", e);
            throw new EncryptionException((Throwable) e);
        }
    }

    /* renamed from: g */
    public String mo15170g(String str) {
        if (!str.startsWith("AES_00|") || !f514g) {
            return str;
        }
        try {
            return C1417b.m507k(this.f538b).mo15175d(str);
        } catch (Exception e) {
            C1485a.m830c(f513f, "Unable to decrypt data, return null", e);
            return null;
        }
    }

    /* renamed from: i */
    public void mo15171i(C1418c cVar) {
        String d = mo15202d(this.f515e);
        if ("AES_00".equals(d) || !f514g) {
            C1485a.m828a(f513f, "No need to upgrade.");
        } else if (d == null || C1422g.f536d.contains(d)) {
            try {
                C1485a.m832e(f513f, "onUpgrade called, updating the table...");
                List f = cVar.mo15187f((String[]) null, (String[]) null);
                ContentValues[] contentValuesArr = new ContentValues[f.size()];
                for (int i = 0; i < f.size(); i++) {
                    contentValuesArr[i] = ((C1413a) f.get(i)).mo15164e(this.f538b);
                }
                boolean z = true;
                for (int i2 = 0; i2 < f.size(); i2++) {
                    z &= cVar.mo15197q(((C1413a) f.get(i2)).mo15163d(), contentValuesArr[i2]);
                }
                if (!z) {
                    C1485a.m838k(f513f, "Fail to insert updated data to db");
                } else {
                    mo15203f(this.f515e);
                }
            } catch (EncryptionException e) {
                C1485a.m830c(f513f, "Unable to complete the upgrading, abort.", e);
            }
        } else {
            C1485a.m829b(f513f, "Encryption version is not recognized.");
            mo15203f(this.f515e);
        }
    }
}
