package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Collections;
import java.util.List;

/* renamed from: c.q.a.c.g.i.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5048e9 extends C5128j9 {

    /* renamed from: c */
    public static final Class f9876c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C5048e9(C5032d9 d9Var) {
        super((C5096h9) null);
    }

    /* renamed from: a */
    public final void mo27191a(Object obj, long j) {
        Object obj2;
        List list = (List) C5082gb.m14155k(obj, j);
        if (list instanceof C5016c9) {
            obj2 = ((C5016c9) list).mo27009d();
        } else if (!f9876c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C5001ba) || !(list instanceof C5354y8)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C5354y8 y8Var = (C5354y8) list;
                if (y8Var.mo27230b()) {
                    y8Var.mo27229a();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C5082gb.m14168x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: c.q.a.c.g.i.b9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: c.q.a.c.g.i.b9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: c.q.a.c.g.i.b9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27192b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5016c9
            if (r2 == 0) goto L_0x0020
            c.q.a.c.g.i.b9 r1 = new c.q.a.c.g.i.b9
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5001ba
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5354y8
            if (r2 == 0) goto L_0x0030
            c.q.a.c.g.i.y8 r1 = (p040c.p200q.p201a.p264c.p294g.p335i.C5354y8) r1
            c.q.a.c.g.i.y8 r0 = r1.mo27013i(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14168x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class r2 = f9876c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14168x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5002bb
            if (r2 == 0) goto L_0x0072
            c.q.a.c.g.i.b9 r2 = new c.q.a.c.g.i.b9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            c.q.a.c.g.i.bb r1 = (p040c.p200q.p201a.p264c.p294g.p335i.C5002bb) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14168x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5001ba
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5354y8
            if (r2 == 0) goto L_0x008f
            r2 = r1
            c.q.a.c.g.i.y8 r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5354y8) r2
            boolean r3 = r2.mo27230b()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            c.q.a.c.g.i.y8 r1 = r2.mo27013i(r1)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14168x(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14168x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5048e9.mo27192b(java.lang.Object, java.lang.Object, long):void");
    }
}
