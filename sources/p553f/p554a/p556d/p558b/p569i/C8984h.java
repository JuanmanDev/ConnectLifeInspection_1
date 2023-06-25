package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9033n;

/* renamed from: f.a.d.b.i.h */
/* compiled from: PlatformViewsChannel */
public class C8984h {

    /* renamed from: a */
    public final C9017j f17627a;

    /* renamed from: b */
    public C8990e f17628b;

    /* renamed from: c */
    public final C9017j.C9021c f17629c = new C8985a();

    /* renamed from: f.a.d.b.i.h$a */
    /* compiled from: PlatformViewsChannel */
    public class C8985a implements C9017j.C9021c {

        /* renamed from: f.a.d.b.i.h$a$a */
        /* compiled from: PlatformViewsChannel */
        public class C8986a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ C9017j.C9022d f17631e;

            public C8986a(C8985a aVar, C9017j.C9022d dVar) {
                this.f17631e = dVar;
            }

            public void run() {
                this.f17631e.success((Object) null);
            }
        }

        public C8985a() {
        }

        /* renamed from: a */
        public final void mo46532a(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            try {
                C8984h.this.f17628b.mo46545g(((Integer) iVar.mo46572b()).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C8984h.m24339c(e), (Object) null);
            }
        }

        /* renamed from: b */
        public final void mo46533b(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            double d;
            C9017j.C9022d dVar2 = dVar;
            Map map = (Map) iVar.mo46572b();
            boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            double d2 = 0.0d;
            if (z) {
                d = 0.0d;
            } else {
                d = ((Double) map.get("width")).doubleValue();
            }
            if (!z) {
                d2 = ((Double) map.get("height")).doubleValue();
            }
            C8987b bVar = new C8987b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), d, d2, ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null);
            if (z) {
                try {
                    C8984h.this.f17628b.mo46543e(bVar);
                    dVar2.success((Object) null);
                } catch (IllegalStateException e) {
                    dVar2.error("error", C8984h.m24339c(e), (Object) null);
                }
            } else {
                dVar2.success(Long.valueOf(C8984h.this.f17628b.mo46541c(bVar)));
            }
        }

        /* renamed from: c */
        public final void mo46534c(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            Map map = (Map) iVar.mo46572b();
            int intValue = ((Integer) map.get("id")).intValue();
            if (map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue()) {
                try {
                    C8984h.this.f17628b.mo46539a(intValue);
                } catch (IllegalStateException e) {
                    dVar.error("error", C8984h.m24339c(e), (Object) null);
                    return;
                }
            } else {
                C8984h.this.f17628b.mo46542d(intValue);
            }
            dVar.success((Object) null);
        }

        /* renamed from: d */
        public final void mo46535d(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            Map map = (Map) iVar.mo46572b();
            try {
                C8984h.this.f17628b.mo46544f(new C8988c(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new C8986a(this, dVar));
            } catch (IllegalStateException e) {
                dVar.error("error", C8984h.m24339c(e), (Object) null);
            }
        }

        /* renamed from: e */
        public final void mo46536e(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            Map map = (Map) iVar.mo46572b();
            try {
                C8984h.this.f17628b.mo46540b(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.success((Object) null);
            } catch (IllegalStateException e) {
                dVar.error("error", C8984h.m24339c(e), (Object) null);
            }
        }

        /* renamed from: f */
        public final void mo46537f(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            C9017j.C9022d dVar2;
            C9017j.C9022d dVar3 = dVar;
            List list = (List) iVar.mo46572b();
            C8989d dVar4 = r2;
            C8989d dVar5 = dVar4;
            C8989d dVar6 = new C8989d(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                C8984h.this.f17628b.mo46546h(dVar4);
                dVar2 = dVar;
                try {
                    dVar2.success((Object) null);
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2 = dVar;
                dVar2.error("error", C8984h.m24339c(e), (Object) null);
            }
        }

        public void onMethodCall(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            if (C8984h.this.f17628b != null) {
                C8896b.m24032d("PlatformViewsChannel", "Received '" + iVar.f17687a + "' message.");
                String str = iVar.f17687a;
                char c = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    mo46533b(iVar, dVar);
                } else if (c == 1) {
                    mo46534c(iVar, dVar);
                } else if (c == 2) {
                    mo46535d(iVar, dVar);
                } else if (c == 3) {
                    mo46537f(iVar, dVar);
                } else if (c == 4) {
                    mo46536e(iVar, dVar);
                } else if (c != 5) {
                    dVar.notImplemented();
                } else {
                    mo46532a(iVar, dVar);
                }
            }
        }
    }

    /* renamed from: f.a.d.b.i.h$b */
    /* compiled from: PlatformViewsChannel */
    public static class C8987b {

        /* renamed from: a */
        public final int f17632a;
        @NonNull

        /* renamed from: b */
        public final String f17633b;

        /* renamed from: c */
        public final double f17634c;

        /* renamed from: d */
        public final double f17635d;

        /* renamed from: e */
        public final int f17636e;
        @Nullable

        /* renamed from: f */
        public final ByteBuffer f17637f;

        public C8987b(int i, @NonNull String str, double d, double d2, int i2, @Nullable ByteBuffer byteBuffer) {
            this.f17632a = i;
            this.f17633b = str;
            this.f17634c = d;
            this.f17635d = d2;
            this.f17636e = i2;
            this.f17637f = byteBuffer;
        }
    }

    /* renamed from: f.a.d.b.i.h$c */
    /* compiled from: PlatformViewsChannel */
    public static class C8988c {

        /* renamed from: a */
        public final int f17638a;

        /* renamed from: b */
        public final double f17639b;

        /* renamed from: c */
        public final double f17640c;

        public C8988c(int i, double d, double d2) {
            this.f17638a = i;
            this.f17639b = d;
            this.f17640c = d2;
        }
    }

    /* renamed from: f.a.d.b.i.h$d */
    /* compiled from: PlatformViewsChannel */
    public static class C8989d {

        /* renamed from: a */
        public final int f17641a;
        @NonNull

        /* renamed from: b */
        public final Number f17642b;
        @NonNull

        /* renamed from: c */
        public final Number f17643c;

        /* renamed from: d */
        public final int f17644d;

        /* renamed from: e */
        public final int f17645e;
        @NonNull

        /* renamed from: f */
        public final Object f17646f;
        @NonNull

        /* renamed from: g */
        public final Object f17647g;

        /* renamed from: h */
        public final int f17648h;

        /* renamed from: i */
        public final int f17649i;

        /* renamed from: j */
        public final float f17650j;

        /* renamed from: k */
        public final float f17651k;

        /* renamed from: l */
        public final int f17652l;

        /* renamed from: m */
        public final int f17653m;

        /* renamed from: n */
        public final int f17654n;

        /* renamed from: o */
        public final int f17655o;

        /* renamed from: p */
        public final long f17656p;

        public C8989d(int i, @NonNull Number number, @NonNull Number number2, int i2, int i3, @NonNull Object obj, @NonNull Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f17641a = i;
            this.f17642b = number;
            this.f17643c = number2;
            this.f17644d = i2;
            this.f17645e = i3;
            this.f17646f = obj;
            this.f17647g = obj2;
            this.f17648h = i4;
            this.f17649i = i5;
            this.f17650j = f;
            this.f17651k = f2;
            this.f17652l = i6;
            this.f17653m = i7;
            this.f17654n = i8;
            this.f17655o = i9;
            this.f17656p = j;
        }
    }

    /* renamed from: f.a.d.b.i.h$e */
    /* compiled from: PlatformViewsChannel */
    public interface C8990e {
        /* renamed from: a */
        void mo46539a(int i);

        /* renamed from: b */
        void mo46540b(int i, int i2);

        /* renamed from: c */
        long mo46541c(@NonNull C8987b bVar);

        /* renamed from: d */
        void mo46542d(int i);

        /* renamed from: e */
        void mo46543e(@NonNull C8987b bVar);

        /* renamed from: f */
        void mo46544f(@NonNull C8988c cVar, @NonNull Runnable runnable);

        /* renamed from: g */
        void mo46545g(int i);

        /* renamed from: h */
        void mo46546h(@NonNull C8989d dVar);
    }

    public C8984h(@NonNull C8928a aVar) {
        C9017j jVar = new C9017j(aVar, "flutter/platform_views", C9033n.f17701b);
        this.f17627a = jVar;
        jVar.mo46575e(this.f17629c);
    }

    /* renamed from: c */
    public static String m24339c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public void mo46530d(int i) {
        C9017j jVar = this.f17627a;
        if (jVar != null) {
            jVar.mo46573c("viewFocused", Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public void mo46531e(@Nullable C8990e eVar) {
        this.f17628b = eVar;
    }
}
