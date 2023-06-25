package p040c.p048b.p049a.p050a.p051a.p058k;

import android.content.ContentValues;
import android.content.Context;
import com.amazon.identity.auth.device.datastore.EncryptionException;
import p040c.p048b.p049a.p050a.p051a.p059l.C1418c;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.k.a */
/* compiled from: AbstractDataObject */
public abstract class C1413a {

    /* renamed from: e */
    public long f510e = -1;

    /* renamed from: l */
    public String f511l = C1413a.class.getSimpleName();

    /* renamed from: a */
    public boolean mo15160a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public boolean mo15161b(Context context) {
        boolean c = mo15162c(context).mo15184c(mo15163d());
        if (c) {
            mo15167h(-1);
        }
        return c;
    }

    /* renamed from: c */
    public abstract <K extends C1413a> C1418c<K> mo15162c(Context context);

    /* renamed from: d */
    public long mo15163d() {
        return this.f510e;
    }

    /* renamed from: e */
    public abstract ContentValues mo15164e(Context context);

    /* renamed from: f */
    public long mo15165f(Context context) {
        return mo15162c(context).mo15196p(this, context);
    }

    /* renamed from: g */
    public boolean mo15166g(Context context) {
        if (mo15163d() == -1) {
            return mo15165f(context) != -1;
        }
        return mo15168i(context);
    }

    /* renamed from: h */
    public void mo15167h(long j) {
        this.f510e = j;
    }

    /* renamed from: i */
    public boolean mo15168i(Context context) {
        try {
            return mo15162c(context).mo15197q(mo15163d(), mo15164e(context));
        } catch (EncryptionException e) {
            C1485a.m830c(this.f511l, "Update failed", e);
            return false;
        }
    }

    public String toString() {
        try {
            return "rowid = " + mo15163d() + "|" + mo15164e((Context) null).toString();
        } catch (EncryptionException unused) {
            return "rowid = " + mo15163d() + " | toString failed";
        }
    }
}
