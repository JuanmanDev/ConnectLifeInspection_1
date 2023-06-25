package p040c.p200q.p405d;

import java.util.Collections;
import java.util.List;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.d0 */
/* compiled from: ListFieldSchema */
public abstract class C6899d0 {

    /* renamed from: a */
    public static final C6899d0 f13206a = new C6901b();

    /* renamed from: b */
    public static final C6899d0 f13207b = new C6902c();

    /* renamed from: c.q.d.d0$b */
    /* compiled from: ListFieldSchema */
    public static final class C6901b extends C6899d0 {

        /* renamed from: c */
        public static final Class<?> f13208c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C6901b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m19672f(Object obj, long j) {
            return (List) C6961n1.m20330E(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: c.q.d.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: c.q.d.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: c.q.d.b0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m19673g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m19672f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof p040c.p200q.p405d.C6892c0
                if (r1 == 0) goto L_0x0014
                c.q.d.b0 r0 = new c.q.d.b0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof p040c.p200q.p405d.C6998x0
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof p040c.p200q.p405d.C6999y.C7008i
                if (r1 == 0) goto L_0x0024
                c.q.d.y$i r0 = (p040c.p200q.p405d.C6999y.C7008i) r0
                c.q.d.y$i r6 = r0.mo31773q(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                p040c.p200q.p405d.C6961n1.m20345T(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f13208c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                p040c.p200q.p405d.C6961n1.m20345T(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof p040c.p200q.p405d.C6956m1
                if (r1 == 0) goto L_0x0062
                c.q.d.b0 r1 = new c.q.d.b0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                c.q.d.m1 r0 = (p040c.p200q.p405d.C6956m1) r0
                r1.addAll(r0)
                p040c.p200q.p405d.C6961n1.m20345T(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof p040c.p200q.p405d.C6998x0
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof p040c.p200q.p405d.C6999y.C7008i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                c.q.d.y$i r1 = (p040c.p200q.p405d.C6999y.C7008i) r1
                boolean r2 = r1.mo31823N()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                c.q.d.y$i r0 = r1.mo31773q(r0)
                p040c.p200q.p405d.C6961n1.m20345T(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6899d0.C6901b.m19673g(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: c */
        public void mo31879c(Object obj, long j) {
            Object obj2;
            List list = (List) C6961n1.m20330E(obj, j);
            if (list instanceof C6892c0) {
                obj2 = ((C6892c0) list).mo31761G();
            } else if (!f13208c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C6998x0) || !(list instanceof C6999y.C7008i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C6999y.C7008i iVar = (C6999y.C7008i) list;
                    if (iVar.mo31823N()) {
                        iVar.mo31828m();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C6961n1.m20345T(obj, j, obj2);
        }

        /* renamed from: d */
        public <E> void mo31880d(Object obj, Object obj2, long j) {
            List f = m19672f(obj2, j);
            List g = m19673g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C6961n1.m20345T(obj, j, f);
        }

        /* renamed from: e */
        public <L> List<L> mo31881e(Object obj, long j) {
            return m19673g(obj, j, 10);
        }
    }

    /* renamed from: c.q.d.d0$c */
    /* compiled from: ListFieldSchema */
    public static final class C6902c extends C6899d0 {
        public C6902c() {
            super();
        }

        /* renamed from: f */
        public static <E> C6999y.C7008i<E> m19677f(Object obj, long j) {
            return (C6999y.C7008i) C6961n1.m20330E(obj, j);
        }

        /* renamed from: c */
        public void mo31879c(Object obj, long j) {
            m19677f(obj, j).mo31828m();
        }

        /* renamed from: d */
        public <E> void mo31880d(Object obj, Object obj2, long j) {
            C6999y.C7008i f = m19677f(obj, j);
            C6999y.C7008i f2 = m19677f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo31823N()) {
                    f = f.mo31773q(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C6961n1.m20345T(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo31881e(Object obj, long j) {
            C6999y.C7008i f = m19677f(obj, j);
            if (f.mo31823N()) {
                return f;
            }
            int size = f.size();
            C6999y.C7008i q = f.mo31773q(size == 0 ? 10 : size * 2);
            C6961n1.m20345T(obj, j, q);
            return q;
        }
    }

    /* renamed from: a */
    public static C6899d0 m19667a() {
        return f13206a;
    }

    /* renamed from: b */
    public static C6899d0 m19668b() {
        return f13207b;
    }

    /* renamed from: c */
    public abstract void mo31879c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo31880d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo31881e(Object obj, long j);

    public C6899d0() {
    }
}
