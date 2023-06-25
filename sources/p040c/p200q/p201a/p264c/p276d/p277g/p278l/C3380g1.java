package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.g1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3380g1 {

    /* renamed from: a */
    public final ArrayMap<C3362b<?>, ConnectionResult> f6296a;

    /* renamed from: b */
    public final ArrayMap<C3362b<?>, String> f6297b;

    /* renamed from: c */
    public final C5773k<Map<C3362b<?>, String>> f6298c;

    /* renamed from: d */
    public int f6299d;

    /* renamed from: e */
    public boolean f6300e;

    /* renamed from: a */
    public final Set<C3362b<?>> mo20553a() {
        return this.f6296a.keySet();
    }

    /* renamed from: b */
    public final void mo20554b(C3362b<?> bVar, ConnectionResult connectionResult, @Nullable String str) {
        this.f6296a.put(bVar, connectionResult);
        this.f6297b.put(bVar, str);
        this.f6299d--;
        if (!connectionResult.mo24487T()) {
            this.f6300e = true;
        }
        if (this.f6299d != 0) {
            return;
        }
        if (this.f6300e) {
            this.f6298c.mo28860b(new AvailabilityException(this.f6296a));
            return;
        }
        this.f6298c.mo28861c(this.f6297b);
    }
}
