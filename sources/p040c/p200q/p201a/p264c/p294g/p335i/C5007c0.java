package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: c.q.a.c.g.i.c0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5007c0 implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ C5118j f9839e;

    /* renamed from: l */
    public final /* synthetic */ C5215p4 f9840l;

    public C5007c0(C5118j jVar, C5215p4 p4Var) {
        this.f9839e = jVar;
        this.f9840l = p4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5225q qVar = (C5225q) obj;
        C5225q qVar2 = (C5225q) obj2;
        C5118j jVar = this.f9839e;
        C5215p4 p4Var = this.f9840l;
        if (qVar instanceof C5300v) {
            return !(qVar2 instanceof C5300v) ? 1 : 0;
        }
        if (qVar2 instanceof C5300v) {
            return -1;
        }
        if (jVar == null) {
            return qVar.mo27208f().compareTo(qVar2.mo27208f());
        }
        return (int) C5216p5.m14631a(jVar.mo27025a(p4Var, Arrays.asList(new C5225q[]{qVar, qVar2})).mo27206e().doubleValue());
    }
}
