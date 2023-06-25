package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.List;
import p040c.p200q.p201a.p264c.p294g.p335i.C5021ce;

/* renamed from: c.q.a.c.i.b.j4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5528j4 implements C5021ce {

    /* renamed from: a */
    public final /* synthetic */ C5552l4 f10587a;

    public C5528j4(C5552l4 l4Var) {
        this.f10587a = l4Var;
    }

    /* renamed from: a */
    public final void mo27136a(int i, String str, List list, boolean z, boolean z2) {
        C5491g3 g3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            g3Var = this.f10587a.f10699a.mo28487b().mo28338q();
        } else if (i2 != 1) {
            if (i2 == 3) {
                g3Var = this.f10587a.f10699a.mo28487b().mo28343v();
            } else if (i2 != 4) {
                g3Var = this.f10587a.f10699a.mo28487b().mo28342u();
            } else if (z) {
                g3Var = this.f10587a.f10699a.mo28487b().mo28346y();
            } else if (!z2) {
                g3Var = this.f10587a.f10699a.mo28487b().mo28345x();
            } else {
                g3Var = this.f10587a.f10699a.mo28487b().mo28344w();
            }
        } else if (z) {
            g3Var = this.f10587a.f10699a.mo28487b().mo28341t();
        } else if (!z2) {
            g3Var = this.f10587a.f10699a.mo28487b().mo28340s();
        } else {
            g3Var = this.f10587a.f10699a.mo28487b().mo28339r();
        }
        int size = list.size();
        if (size == 1) {
            g3Var.mo28260b(str, list.get(0));
        } else if (size == 2) {
            g3Var.mo28261c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            g3Var.mo28259a(str);
        } else {
            g3Var.mo28262d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
