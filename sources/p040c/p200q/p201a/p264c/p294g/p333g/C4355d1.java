package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzagd;
import com.google.android.gms.internal.p527firebaseauthapi.zzage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.d1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4355d1 {

    /* renamed from: d */
    public static final C4355d1 f9160d = new C4355d1(true);

    /* renamed from: a */
    public final C4573l3 f9161a = new C4276a3(16);

    /* renamed from: b */
    public boolean f9162b;

    /* renamed from: c */
    public boolean f9163c;

    public C4355d1() {
    }

    /* renamed from: a */
    public static C4355d1 m11812a() {
        throw null;
    }

    /* renamed from: d */
    public static final void m11813d(C4328c1 c1Var, Object obj) {
        boolean z;
        zzagd a = c1Var.mo25839a();
        C4706q1.m12868e(obj);
        zzagd zzagd = zzagd.DOUBLE;
        zzage zzage = zzage.INT;
        switch (a.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzacc) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C4598m1)) {
                    return;
                }
            case 8:
                if (obj instanceof C4572l2) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(c1Var.zza()), c1Var.mo25839a().zza(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo25878b() {
        if (!this.f9162b) {
            for (int i = 0; i < this.f9161a.mo26233b(); i++) {
                Map.Entry g = this.f9161a.mo26240g(i);
                if (g.getValue() instanceof C4544k1) {
                    ((C4544k1) g.getValue()).mo26151h();
                }
            }
            this.f9161a.mo25779a();
            this.f9162b = true;
        }
    }

    /* renamed from: c */
    public final void mo25879c(C4328c1 c1Var, Object obj) {
        if (!c1Var.mo25840b()) {
            m11813d(c1Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m11813d(c1Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f9161a.put(c1Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C4355d1 d1Var = new C4355d1();
        for (int i = 0; i < this.f9161a.mo26233b(); i++) {
            Map.Entry g = this.f9161a.mo26240g(i);
            d1Var.mo25879c((C4328c1) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f9161a.mo26234c()) {
            d1Var.mo25879c((C4328c1) entry.getKey(), entry.getValue());
        }
        d1Var.f9163c = this.f9163c;
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4355d1)) {
            return false;
        }
        return this.f9161a.equals(((C4355d1) obj).f9161a);
    }

    public final int hashCode() {
        return this.f9161a.hashCode();
    }

    public C4355d1(boolean z) {
        mo25878b();
        mo25878b();
    }
}
