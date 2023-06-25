package p040c.p200q.p201a.p264c.p294g.p300f;

import com.google.android.gms.internal.common.zzag;

/* renamed from: c.q.a.c.g.f.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3648f extends zzag {

    /* renamed from: e */
    public final transient int f6594e;

    /* renamed from: l */
    public final transient int f6595l;

    /* renamed from: m */
    public final /* synthetic */ zzag f6596m;

    public C3648f(zzag zzag, int i, int i2) {
        this.f6596m = zzag;
        this.f6594e = i;
        this.f6595l = i2;
    }

    public final Object get(int i) {
        C3659q.m9200a(i, this.f6595l, "index");
        return this.f6596m.get(i + this.f6594e);
    }

    public final int size() {
        return this.f6595l;
    }

    public final int zzb() {
        return this.f6596m.zzc() + this.f6594e + this.f6595l;
    }

    public final int zzc() {
        return this.f6596m.zzc() + this.f6594e;
    }

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.f6596m.zzg();
    }

    /* renamed from: zzh */
    public final zzag subList(int i, int i2) {
        C3659q.m9202c(i, i2, this.f6595l);
        zzag zzag = this.f6596m;
        int i3 = this.f6594e;
        return zzag.subList(i + i3, i2 + i3);
    }
}
