package p040c.p200q.p201a.p264c.p276d.p281j.p283v;

import android.content.Context;
import com.google.android.gms.common.internal.TelemetryData;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3345c;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3408q;
import p040c.p200q.p201a.p264c.p276d.p281j.C3507s;
import p040c.p200q.p201a.p264c.p276d.p281j.C3510t;
import p040c.p200q.p201a.p264c.p294g.p298d.C3634d;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.q.a.c.d.j.v.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3521d extends C3345c<C3510t> implements C3507s {

    /* renamed from: k */
    public static final C3334a.C3343g<C3522e> f6521k = new C3334a.C3343g<>();

    /* renamed from: l */
    public static final C3334a.C3335a<C3522e, C3510t> f6522l;

    /* renamed from: m */
    public static final C3334a<C3510t> f6523m;

    /* renamed from: n */
    public static final /* synthetic */ int f6524n = 0;

    static {
        C3520c cVar = new C3520c();
        f6522l = cVar;
        f6523m = new C3334a<>("ClientTelemetry.API", cVar, f6521k);
    }

    public C3521d(Context context, C3510t tVar) {
        super(context, f6523m, tVar, C3345c.C3346a.f6231c);
    }

    /* renamed from: a */
    public final C5771j<Void> mo20782a(TelemetryData telemetryData) {
        C3408q.C3409a a = C3408q.m8689a();
        a.mo20606d(C3634d.f6582a);
        a.mo20605c(false);
        a.mo20604b(new C3519b(telemetryData));
        return mo20437e(a.mo20603a());
    }
}
