package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.concurrent.Callable;
import p040c.p200q.p201a.p264c.p294g.p335i.C5114ib;

/* renamed from: c.q.a.c.i.b.f4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C5480f4 implements Callable {

    /* renamed from: e */
    public final /* synthetic */ C5552l4 f10457e;

    /* renamed from: l */
    public final /* synthetic */ String f10458l;

    public /* synthetic */ C5480f4(C5552l4 l4Var, String str) {
        this.f10457e = l4Var;
        this.f10458l = str;
    }

    public final Object call() {
        return new C5114ib("internal.remoteConfig", new C5540k4(this.f10457e, this.f10458l));
    }
}
