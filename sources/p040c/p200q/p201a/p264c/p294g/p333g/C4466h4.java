package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzal;

/* renamed from: c.q.a.c.g.g.h4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4466h4 extends zzal {

    /* renamed from: e */
    public final transient int f9266e;

    /* renamed from: l */
    public final transient int f9267l;

    /* renamed from: m */
    public final /* synthetic */ zzal f9268m;

    public C4466h4(zzal zzal, int i, int i2) {
        this.f9268m = zzal;
        this.f9266e = i;
        this.f9267l = i2;
    }

    public final Object get(int i) {
        C4540jo.m12243a(i, this.f9267l, "index");
        return this.f9268m.get(i + this.f9266e);
    }

    public final int size() {
        return this.f9267l;
    }

    public final int zzb() {
        return this.f9268m.zzc() + this.f9266e + this.f9267l;
    }

    public final int zzc() {
        return this.f9268m.zzc() + this.f9266e;
    }

    public final Object[] zze() {
        return this.f9268m.zze();
    }

    /* renamed from: zzf */
    public final zzal subList(int i, int i2) {
        C4540jo.m12245c(i, i2, this.f9267l);
        zzal zzal = this.f9268m;
        int i3 = this.f9266e;
        return zzal.subList(i + i3, i2 + i3);
    }
}
