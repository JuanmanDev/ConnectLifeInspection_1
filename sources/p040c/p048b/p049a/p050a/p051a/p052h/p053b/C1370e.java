package p040c.p048b.p049a.p050a.p051a.p052h.p053b;

import org.json.JSONObject;

/* renamed from: c.b.a.a.a.h.b.e */
/* compiled from: ScopeFactory */
public final class C1370e {

    /* renamed from: c.b.a.a.a.h.b.e$a */
    /* compiled from: ScopeFactory */
    public static final class C1371a implements C1369d {

        /* renamed from: a */
        public final String f403a;

        /* renamed from: b */
        public final JSONObject f404b;

        public C1371a(String str) {
            this(str, (JSONObject) null);
        }

        /* renamed from: a */
        public JSONObject mo15080a() {
            return this.f404b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1371a.class != obj.getClass()) {
                return false;
            }
            C1371a aVar = (C1371a) obj;
            String str = this.f403a;
            if (str == null) {
                if (aVar.f403a != null) {
                    return false;
                }
            } else if (!str.equals(aVar.f403a)) {
                return false;
            }
            JSONObject jSONObject = this.f404b;
            if (jSONObject == null) {
                if (aVar.f404b != null) {
                    return false;
                }
            } else if (!jSONObject.equals(aVar.f404b)) {
                return false;
            }
            return true;
        }

        public String getName() {
            return this.f403a;
        }

        public int hashCode() {
            String str = this.f403a;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            JSONObject jSONObject = this.f404b;
            if (jSONObject != null) {
                i = jSONObject.hashCode();
            }
            return hashCode + i;
        }

        public C1371a(String str, JSONObject jSONObject) {
            if (str != null) {
                this.f403a = str;
                this.f404b = jSONObject;
                return;
            }
            throw new IllegalArgumentException("Scope must have a name");
        }
    }

    /* renamed from: a */
    public static C1369d m323a(String str) {
        return new C1371a(str);
    }
}
