package p553f.p594c.p618w;

import java.util.concurrent.Callable;
import p553f.p594c.C9194k;
import p553f.p594c.p602s.p612g.C9290b;
import p553f.p594c.p602s.p612g.C9294c;
import p553f.p594c.p602s.p612g.C9298d;
import p553f.p594c.p602s.p612g.C9303g;
import p553f.p594c.p602s.p612g.C9305h;
import p553f.p594c.p617v.C9323a;

/* renamed from: f.c.w.a */
/* compiled from: Schedulers */
public final class C9324a {

    /* renamed from: a */
    public static final C9194k f18289a = C9323a.m25158e(new C9326b());

    /* renamed from: b */
    public static final C9194k f18290b = C9323a.m25159f(new C9327c());

    /* renamed from: f.c.w.a$a */
    /* compiled from: Schedulers */
    public static final class C9325a {

        /* renamed from: a */
        public static final C9194k f18291a = new C9290b();
    }

    /* renamed from: f.c.w.a$b */
    /* compiled from: Schedulers */
    public static final class C9326b implements Callable<C9194k> {
        /* renamed from: a */
        public C9194k call() {
            return C9325a.f18291a;
        }
    }

    /* renamed from: f.c.w.a$c */
    /* compiled from: Schedulers */
    public static final class C9327c implements Callable<C9194k> {
        /* renamed from: a */
        public C9194k call() {
            return C9328d.f18292a;
        }
    }

    /* renamed from: f.c.w.a$d */
    /* compiled from: Schedulers */
    public static final class C9328d {

        /* renamed from: a */
        public static final C9194k f18292a = new C9294c();
    }

    /* renamed from: f.c.w.a$e */
    /* compiled from: Schedulers */
    public static final class C9329e {

        /* renamed from: a */
        public static final C9194k f18293a = new C9298d();
    }

    /* renamed from: f.c.w.a$f */
    /* compiled from: Schedulers */
    public static final class C9330f implements Callable<C9194k> {
        /* renamed from: a */
        public C9194k call() {
            return C9329e.f18293a;
        }
    }

    /* renamed from: f.c.w.a$g */
    /* compiled from: Schedulers */
    public static final class C9331g {

        /* renamed from: a */
        public static final C9194k f18294a = new C9303g();
    }

    /* renamed from: f.c.w.a$h */
    /* compiled from: Schedulers */
    public static final class C9332h implements Callable<C9194k> {
        /* renamed from: a */
        public C9194k call() {
            return C9331g.f18294a;
        }
    }

    static {
        C9323a.m25161h(new C9332h());
        C9305h.m25112d();
        C9323a.m25160g(new C9330f());
    }

    /* renamed from: a */
    public static C9194k m25176a() {
        return C9323a.m25168o(f18289a);
    }

    /* renamed from: b */
    public static C9194k m25177b() {
        return C9323a.m25170q(f18290b);
    }
}
