package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.g9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5080g9 extends C5128j9 {
    public /* synthetic */ C5080g9(C5064f9 f9Var) {
        super((C5096h9) null);
    }

    /* renamed from: a */
    public final void mo27191a(Object obj, long j) {
        ((C5354y8) C5082gb.m14155k(obj, j)).mo27229a();
    }

    /* renamed from: b */
    public final void mo27192b(Object obj, Object obj2, long j) {
        C5354y8 y8Var = (C5354y8) C5082gb.m14155k(obj, j);
        C5354y8 y8Var2 = (C5354y8) C5082gb.m14155k(obj2, j);
        int size = y8Var.size();
        int size2 = y8Var2.size();
        if (size > 0 && size2 > 0) {
            if (!y8Var.mo27230b()) {
                y8Var = y8Var.mo27013i(size2 + size);
            }
            y8Var.addAll(y8Var2);
        }
        if (size > 0) {
            y8Var2 = y8Var;
        }
        C5082gb.m14168x(obj, j, y8Var2);
    }
}
