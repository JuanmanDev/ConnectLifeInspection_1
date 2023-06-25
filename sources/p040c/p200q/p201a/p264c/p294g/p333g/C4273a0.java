package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.NoSuchElementException;

/* renamed from: c.q.a.c.g.g.a0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4273a0 extends C4327c0 {

    /* renamed from: e */
    public int f9107e = 0;

    /* renamed from: l */
    public final int f9108l = this.f9109m.zzd();

    /* renamed from: m */
    public final /* synthetic */ zzacc f9109m;

    public C4273a0(zzacc zzacc) {
        this.f9109m = zzacc;
    }

    public final boolean hasNext() {
        return this.f9107e < this.f9108l;
    }

    public final byte zza() {
        int i = this.f9107e;
        if (i < this.f9108l) {
            this.f9107e = i + 1;
            return this.f9109m.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
