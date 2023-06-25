package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.u3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5289u3 extends C5279t8 implements C5310v9 {
    public static final C5289u3 zza;
    public int zzd;
    public long zze;
    public String zzf = "";
    public int zzg;
    public C5354y8 zzh = C5279t8.m14958n();
    public C5354y8 zzi = C5279t8.m14958n();
    public C5354y8 zzj = C5279t8.m14958n();
    public String zzk = "";
    public boolean zzl;
    public C5354y8 zzm = C5279t8.m14958n();
    public C5354y8 zzn = C5279t8.m14958n();
    public String zzo = "";

    static {
        C5289u3 u3Var = new C5289u3();
        zza = u3Var;
        C5279t8.m14962u(C5289u3.class, u3Var);
    }

    /* renamed from: H */
    public static C5274t3 m15007H() {
        return (C5274t3) zza.mo27726y();
    }

    /* renamed from: J */
    public static C5289u3 m15009J() {
        return zza;
    }

    /* renamed from: R */
    public static /* synthetic */ void m15010R(C5289u3 u3Var, int i, C5259s3 s3Var) {
        s3Var.getClass();
        C5354y8 y8Var = u3Var.zzi;
        if (!y8Var.mo27230b()) {
            u3Var.zzi = C5279t8.m14959p(y8Var);
        }
        u3Var.zzi.set(i, s3Var);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C5349y3.class, "zzi", C5259s3.class, "zzj", C5348y2.class, "zzk", "zzl", "zzm", C5124j5.class, "zzn", C5229q3.class, "zzo"});
        } else if (i2 == 3) {
            return new C5289u3();
        } else {
            if (i2 == 4) {
                return new C5274t3((C5184n3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27760D() {
        return this.zzm.size();
    }

    /* renamed from: E */
    public final int mo27761E() {
        return this.zzi.size();
    }

    /* renamed from: F */
    public final long mo27762F() {
        return this.zze;
    }

    /* renamed from: G */
    public final C5259s3 mo27763G(int i) {
        return (C5259s3) this.zzi.get(i);
    }

    /* renamed from: K */
    public final String mo27764K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final String mo27765L() {
        return this.zzo;
    }

    /* renamed from: M */
    public final List mo27766M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final List mo27767N() {
        return this.zzn;
    }

    /* renamed from: P */
    public final List mo27768P() {
        return this.zzm;
    }

    /* renamed from: Q */
    public final List mo27769Q() {
        return this.zzh;
    }

    /* renamed from: T */
    public final boolean mo27770T() {
        return this.zzl;
    }

    /* renamed from: U */
    public final boolean mo27771U() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: V */
    public final boolean mo27772V() {
        return (this.zzd & 1) != 0;
    }
}
