package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;

/* renamed from: c.q.a.c.g.g.b5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4305b5 {

    /* renamed from: a */
    public final C4930yh f9133a;

    public C4305b5(C4930yh yhVar) {
        this.f9133a = yhVar;
    }

    /* renamed from: e */
    public static C4305b5 m11706e(String str, byte[] bArr, int i) {
        C4904xh E = C4930yh.m13605E();
        E.mo26826m(str);
        E.mo26827p(zzacc.zzn(bArr));
        int i2 = i - 1;
        E.mo26825l(i2 != 0 ? i2 != 1 ? i2 != 2 ? zzoy.CRUNCHY : zzoy.RAW : zzoy.LEGACY : zzoy.TINK);
        return new C4305b5((C4930yh) E.mo26052e());
    }

    /* renamed from: a */
    public final C4930yh mo25809a() {
        return this.f9133a;
    }

    /* renamed from: b */
    public final String mo25810b() {
        return this.f9133a.mo26865J();
    }

    /* renamed from: c */
    public final byte[] mo25811c() {
        return this.f9133a.mo26864I().zzt();
    }

    /* renamed from: d */
    public final int mo25812d() {
        zzoy H = this.f9133a.mo26863H();
        zzoy zzoy = zzoy.UNKNOWN_PREFIX;
        int ordinal = H.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
