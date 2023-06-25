package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.q.a.c.g.i.x */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C5330x {

    /* renamed from: a */
    public final List f10245a = new ArrayList();

    /* renamed from: a */
    public abstract C5225q mo26909a(String str, C5215p4 p4Var, List list);

    /* renamed from: b */
    public final C5225q mo27875b(String str) {
        if (this.f10245a.contains(C5216p5.m14635e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
