package p040c.p200q.p353b.p354a;

import java.util.Arrays;

/* renamed from: c.q.b.a.i */
/* compiled from: MoreObjects */
public final class C5841i {

    /* renamed from: c.q.b.a.i$b */
    /* compiled from: MoreObjects */
    public static final class C5843b {

        /* renamed from: a */
        public final String f11366a;

        /* renamed from: b */
        public final C5844a f11367b;

        /* renamed from: c */
        public C5844a f11368c;

        /* renamed from: d */
        public boolean f11369d;

        /* renamed from: c.q.b.a.i$b$a */
        /* compiled from: MoreObjects */
        public static final class C5844a {

            /* renamed from: a */
            public String f11370a;

            /* renamed from: b */
            public Object f11371b;

            /* renamed from: c */
            public C5844a f11372c;

            public C5844a() {
            }
        }

        /* renamed from: a */
        public C5843b mo28953a(String str, double d) {
            mo28959g(str, String.valueOf(d));
            return this;
        }

        /* renamed from: b */
        public C5843b mo28954b(String str, int i) {
            mo28959g(str, String.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public C5843b mo28955c(String str, long j) {
            mo28959g(str, String.valueOf(j));
            return this;
        }

        /* renamed from: d */
        public C5843b mo28956d(String str, Object obj) {
            mo28959g(str, obj);
            return this;
        }

        /* renamed from: e */
        public final C5844a mo28957e() {
            C5844a aVar = new C5844a();
            this.f11368c.f11372c = aVar;
            this.f11368c = aVar;
            return aVar;
        }

        /* renamed from: f */
        public final C5843b mo28958f(Object obj) {
            mo28957e().f11371b = obj;
            return this;
        }

        /* renamed from: g */
        public final C5843b mo28959g(String str, Object obj) {
            C5844a e = mo28957e();
            e.f11371b = obj;
            C5850m.m16594o(str);
            e.f11370a = str;
            return this;
        }

        /* renamed from: h */
        public C5843b mo28960h(Object obj) {
            mo28958f(obj);
            return this;
        }

        public String toString() {
            boolean z = this.f11369d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f11366a);
            sb.append('{');
            String str = "";
            for (C5844a aVar = this.f11367b.f11372c; aVar != null; aVar = aVar.f11372c) {
                Object obj = aVar.f11371b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f11370a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public C5843b(String str) {
            C5844a aVar = new C5844a();
            this.f11367b = aVar;
            this.f11368c = aVar;
            this.f11369d = false;
            C5850m.m16594o(str);
            this.f11366a = str;
        }
    }

    /* renamed from: a */
    public static <T> T m16566a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C5843b m16567b(Object obj) {
        return new C5843b(obj.getClass().getSimpleName());
    }
}
