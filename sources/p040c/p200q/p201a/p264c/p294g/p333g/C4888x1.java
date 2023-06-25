package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.List;

/* renamed from: c.q.a.c.g.g.x1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4888x1 extends C4940z1 {
    public /* synthetic */ C4888x1(C4862w1 w1Var) {
        super((C4914y1) null);
    }

    /* renamed from: a */
    public final List mo26761a(Object obj, long j) {
        C4679p1 p1Var = (C4679p1) C4916y3.m13555k(obj, j);
        if (p1Var.mo26497b()) {
            return p1Var;
        }
        int size = p1Var.size();
        C4679p1 i = p1Var.mo25771i(size == 0 ? 10 : size + size);
        C4916y3.m13568x(obj, j, i);
        return i;
    }

    /* renamed from: b */
    public final void mo26762b(Object obj, long j) {
        ((C4679p1) C4916y3.m13555k(obj, j)).mo26496a();
    }

    /* renamed from: c */
    public final void mo26763c(Object obj, Object obj2, long j) {
        C4679p1 p1Var = (C4679p1) C4916y3.m13555k(obj, j);
        C4679p1 p1Var2 = (C4679p1) C4916y3.m13555k(obj2, j);
        int size = p1Var.size();
        int size2 = p1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!p1Var.mo26497b()) {
                p1Var = p1Var.mo25771i(size2 + size);
            }
            p1Var.addAll(p1Var2);
        }
        if (size > 0) {
            p1Var2 = p1Var;
        }
        C4916y3.m13568x(obj, j, p1Var2);
    }
}
