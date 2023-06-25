package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;

/* renamed from: c.q.a.c.g.g.yh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4930yh extends C4544k1 implements C4599m2 {
    public static final C4930yh zzb;
    public String zzd = "";
    public zzacc zze = zzacc.zzb;
    public int zzf;

    static {
        C4930yh yhVar = new C4930yh();
        zzb = yhVar;
        C4544k1.m12255l(C4930yh.class, yhVar);
    }

    /* renamed from: E */
    public static C4904xh m13605E() {
        return (C4904xh) zzb.mo26163x();
    }

    /* renamed from: G */
    public static C4930yh m13607G() {
        return zzb;
    }

    /* renamed from: K */
    public static /* synthetic */ void m13608K(C4930yh yhVar, String str) {
        str.getClass();
        yhVar.zzd = str;
    }

    /* renamed from: H */
    public final zzoy mo26863H() {
        zzoy zzb2 = zzoy.zzb(this.zzf);
        return zzb2 == null ? zzoy.UNRECOGNIZED : zzb2;
    }

    /* renamed from: I */
    public final zzacc mo26864I() {
        return this.zze;
    }

    /* renamed from: J */
    public final String mo26865J() {
        return this.zzd;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4930yh();
        } else {
            if (i2 == 4) {
                return new C4904xh((C4878wh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
