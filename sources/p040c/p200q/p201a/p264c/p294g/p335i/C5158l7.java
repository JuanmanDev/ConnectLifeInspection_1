package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.i.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5158l7 extends C5188n7 {

    /* renamed from: e */
    public int f9987e = 0;

    /* renamed from: l */
    public final int f9988l = this.f9989m.zzd();

    /* renamed from: m */
    public final /* synthetic */ zzje f9989m;

    public C5158l7(zzje zzje) {
        this.f9989m = zzje;
    }

    public final boolean hasNext() {
        return this.f9987e < this.f9988l;
    }

    public final byte zza() {
        int i = this.f9987e;
        if (i < this.f9988l) {
            this.f9987e = i + 1;
            return this.f9989m.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
