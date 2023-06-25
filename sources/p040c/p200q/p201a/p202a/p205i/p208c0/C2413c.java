package p040c.p200q.p201a.p202a.p205i.p208c0;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p040c.p200q.p201a.p202a.C2355g;
import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.C2543u;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2445x;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p211d0.C2507a;
import p040c.p200q.p201a.p202a.p205i.p214x.C2553e;
import p040c.p200q.p201a.p202a.p205i.p214x.C2562l;

/* renamed from: c.q.a.a.i.c0.c */
/* compiled from: DefaultScheduler */
public class C2413c implements C2415e {

    /* renamed from: f */
    public static final Logger f2753f = Logger.getLogger(C2543u.class.getName());

    /* renamed from: a */
    public final C2445x f2754a;

    /* renamed from: b */
    public final Executor f2755b;

    /* renamed from: c */
    public final C2553e f2756c;

    /* renamed from: d */
    public final C2467j0 f2757d;

    /* renamed from: e */
    public final C2507a f2758e;

    public C2413c(Executor executor, C2553e eVar, C2445x xVar, C2467j0 j0Var, C2507a aVar) {
        this.f2755b = executor;
        this.f2756c = eVar;
        this.f2754a = xVar;
        this.f2757d = j0Var;
        this.f2758e = aVar;
    }

    /* renamed from: a */
    public void mo17801a(C2538q qVar, C2527j jVar, C2355g gVar) {
        this.f2755b.execute(new C2411a(this, qVar, gVar, jVar));
    }

    /* renamed from: b */
    public /* synthetic */ Object mo17802b(C2538q qVar, C2527j jVar) {
        this.f2757d.mo17875E(qVar, jVar);
        this.f2754a.mo17811a(qVar, 1);
        return null;
    }

    /* renamed from: c */
    public /* synthetic */ void mo17803c(C2538q qVar, C2355g gVar, C2527j jVar) {
        try {
            C2562l lVar = this.f2756c.get(qVar.mo17943b());
            if (lVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{qVar.mo17943b()});
                f2753f.warning(format);
                gVar.mo17663a(new IllegalArgumentException(format));
                return;
            }
            this.f2758e.mo17899b(new C2412b(this, qVar, lVar.mo17673b(jVar)));
            gVar.mo17663a((Exception) null);
        } catch (Exception e) {
            Logger logger = f2753f;
            logger.warning("Error scheduling event " + e.getMessage());
            gVar.mo17663a(e);
        }
    }
}
