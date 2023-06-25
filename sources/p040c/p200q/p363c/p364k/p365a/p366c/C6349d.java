package p040c.p200q.p363c.p364k.p365a.p366c;

import java.util.HashSet;
import java.util.Set;
import p040c.p200q.p201a.p264c.p340i.p341a.C5413a;
import p040c.p200q.p363c.p364k.p365a.C6341a;

/* renamed from: c.q.c.k.a.c.d */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class C6349d {

    /* renamed from: a */
    public final Set f12015a = new HashSet();

    /* renamed from: b */
    public final C6341a.C6343b f12016b;

    /* renamed from: c */
    public final C5413a f12017c;

    /* renamed from: d */
    public final C6348c f12018d;

    public C6349d(C5413a aVar, C6341a.C6343b bVar) {
        this.f12016b = bVar;
        this.f12017c = aVar;
        C6348c cVar = new C6348c(this);
        this.f12018d = cVar;
        this.f12017c.registerOnMeasurementEventListener(cVar);
    }
}
