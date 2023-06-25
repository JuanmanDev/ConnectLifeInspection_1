package p040c.p200q.p363c.p364k.p365a.p366c;

import android.os.Bundle;
import p040c.p200q.p201a.p264c.p340i.p341a.C5413a;

/* renamed from: c.q.c.k.a.c.e */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class C6350e implements C5413a.C5414a {

    /* renamed from: a */
    public final /* synthetic */ C6351f f12019a;

    public C6350e(C6351f fVar) {
        this.f12019a = fVar;
    }

    /* renamed from: a */
    public final void mo28376a(String str, String str2, Bundle bundle, long j) {
        if (str != null && C6347b.m17848e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f12019a.f12020a.mo30440a(3, bundle2);
        }
    }
}
