package org.junit;

import p648m.p668e.C9687c;

public class ComparisonFailure extends AssertionError {
    public static final int MAX_CONTEXT_LENGTH = 20;
    public static final long serialVersionUID = 1;
    public String fActual;
    public String fExpected;

    /* renamed from: org.junit.ComparisonFailure$b */
    public static class C9978b {

        /* renamed from: a */
        public final int f19331a;

        /* renamed from: b */
        public final String f19332b;

        /* renamed from: c */
        public final String f19333c;

        /* renamed from: org.junit.ComparisonFailure$b$a */
        public class C9979a {

            /* renamed from: a */
            public final String f19334a;

            /* renamed from: b */
            public final String f19335b;

            /* renamed from: a */
            public String mo53463a() {
                return mo53467e(C9978b.this.f19333c);
            }

            /* renamed from: b */
            public String mo53464b() {
                if (this.f19334a.length() <= C9978b.this.f19331a) {
                    return this.f19334a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("...");
                String str = this.f19334a;
                sb.append(str.substring(str.length() - C9978b.this.f19331a));
                return sb.toString();
            }

            /* renamed from: c */
            public String mo53465c() {
                if (this.f19335b.length() <= C9978b.this.f19331a) {
                    return this.f19335b;
                }
                return this.f19335b.substring(0, C9978b.this.f19331a) + "...";
            }

            /* renamed from: d */
            public String mo53466d() {
                return mo53467e(C9978b.this.f19332b);
            }

            /* renamed from: e */
            public final String mo53467e(String str) {
                return "[" + str.substring(this.f19334a.length(), str.length() - this.f19335b.length()) + "]";
            }

            public C9979a() {
                String a = C9978b.this.mo53461g();
                this.f19334a = a;
                this.f19335b = C9978b.this.mo53462h(a);
            }
        }

        public C9978b(int i, String str, String str2) {
            this.f19331a = i;
            this.f19332b = str;
            this.f19333c = str2;
        }

        /* renamed from: f */
        public String mo53460f(String str) {
            String str2;
            String str3 = this.f19332b;
            if (str3 == null || (str2 = this.f19333c) == null || str3.equals(str2)) {
                return C9687c.m26155e(str, this.f19332b, this.f19333c);
            }
            C9979a aVar = new C9979a();
            String b = aVar.mo53464b();
            String c = aVar.mo53465c();
            return C9687c.m26155e(str, b + aVar.mo53466d() + c, b + aVar.mo53463a() + c);
        }

        /* renamed from: g */
        public final String mo53461g() {
            int min = Math.min(this.f19332b.length(), this.f19333c.length());
            for (int i = 0; i < min; i++) {
                if (this.f19332b.charAt(i) != this.f19333c.charAt(i)) {
                    return this.f19332b.substring(0, i);
                }
            }
            return this.f19332b.substring(0, min);
        }

        /* renamed from: h */
        public final String mo53462h(String str) {
            int min = Math.min(this.f19332b.length() - str.length(), this.f19333c.length() - str.length()) - 1;
            int i = 0;
            while (i <= min) {
                String str2 = this.f19332b;
                char charAt = str2.charAt((str2.length() - 1) - i);
                String str3 = this.f19333c;
                if (charAt != str3.charAt((str3.length() - 1) - i)) {
                    break;
                }
                i++;
            }
            String str4 = this.f19332b;
            return str4.substring(str4.length() - i);
        }
    }

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.fExpected = str2;
        this.fActual = str3;
    }

    public String getActual() {
        return this.fActual;
    }

    public String getExpected() {
        return this.fExpected;
    }

    public String getMessage() {
        return new C9978b(20, this.fExpected, this.fActual).mo53460f(super.getMessage());
    }
}
