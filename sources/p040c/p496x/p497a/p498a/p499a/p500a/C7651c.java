package p040c.p496x.p497a.p498a.p499a.p500a;

import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7658a;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7672f;
import p040c.p496x.p497a.p498a.p499a.p500a.p505g.C7692c;
import p040c.p496x.p497a.p498a.p499a.p500a.p506h.C7695a;

/* renamed from: c.x.a.a.a.a.c */
public class C7651c {

    /* renamed from: a */
    public static volatile C7652d f14393a;

    /* renamed from: b */
    public static C7650b f14394b;

    /* renamed from: c */
    public static C7672f.C7675c f14395c;

    static {
        "HTTP1." + C7651c.class.getSimpleName();
    }

    /* renamed from: a */
    public static C7695a m21630a(C7650b bVar, C7695a aVar) {
        C7672f.C7676d dVar = new C7672f.C7676d();
        dVar.mo33178n(500);
        dVar.mo33182r(500);
        dVar.mo33180p(true);
        dVar.mo33181q(false);
        return new C7695a(dVar, aVar);
    }

    /* renamed from: b */
    public static final C7650b m21631b() {
        synchronized (C7651c.class) {
            if (f14394b == null) {
                return new C7650b();
            }
            C7650b bVar = new C7650b(f14394b);
            return bVar;
        }
    }

    /* renamed from: c */
    public static void m21632c(C7650b bVar) {
        C7695a aVar;
        C7672f.C7676d dVar = new C7672f.C7676d();
        dVar.mo33178n(bVar.mo33088d());
        dVar.mo33182r(bVar.mo33091g());
        dVar.mo33180p(bVar.mo33092h());
        dVar.mo33181q(true);
        dVar.mo33176l(bVar.mo33085a());
        if (bVar.mo33087c() > 0) {
            dVar.mo33177m(bVar.mo33086b(), bVar.mo33087c());
        }
        C7695a aVar2 = null;
        if (bVar.mo33093i()) {
            if (f14393a == null) {
                aVar = m21630a(bVar, (C7695a) null);
            } else {
                aVar = m21630a(bVar, (C7695a) f14393a.mo33083b().mo33109b());
            }
            aVar2 = aVar;
            C7692c cVar = new C7692c(new C7658a(aVar2), bVar.mo33090f(), bVar.mo33089e());
            f14395c = cVar;
            dVar.mo33179o(cVar);
        }
        f14393a = new C7649a(new C7658a(new C7695a(dVar, aVar2)));
    }

    /* renamed from: d */
    public static final C7652d m21633d(C7650b bVar) {
        C7652d dVar;
        if (bVar != null) {
            synchronized (C7651c.class) {
                C7650b bVar2 = new C7650b(bVar);
                f14394b = bVar2;
                m21632c(bVar2);
                dVar = f14393a;
            }
            return dVar;
        }
        throw new NullPointerException("HttpConfig is null! ");
    }
}
