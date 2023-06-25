package p040c.p200q.p201a.p264c.p294g.p300f;

import com.google.android.gms.internal.common.zzag;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: c.q.a.c.g.f.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3650h extends zzag {

    /* renamed from: m */
    public static final zzag f6597m = new C3650h(new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f6598e;

    /* renamed from: l */
    public final transient int f6599l;

    public C3650h(Object[] objArr, int i) {
        this.f6598e = objArr;
        this.f6599l = i;
    }

    public final Object get(int i) {
        C3659q.m9200a(i, this.f6599l, "index");
        Object obj = this.f6598e[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f6599l;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f6598e, 0, objArr, 0, this.f6599l);
        return this.f6599l;
    }

    public final int zzb() {
        return this.f6599l;
    }

    public final int zzc() {
        return 0;
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.f6598e;
    }
}
