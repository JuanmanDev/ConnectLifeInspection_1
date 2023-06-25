package p040c.p496x.p497a.p498a.p499a.p500a.p502f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.x.a.a.a.a.f.b */
public class C7659b {

    /* renamed from: a */
    public final List<C7662c> f14402a;

    /* renamed from: c.x.a.a.a.a.f.b$b */
    public static final class C7661b {

        /* renamed from: a */
        public final List<C7662c> f14403a = new ArrayList();

        /* renamed from: b */
        public C7661b mo33114b(String str, String str2) {
            mo33116d(str, str2);
            this.f14403a.add(new C7662c(str, str2));
            return this;
        }

        /* renamed from: c */
        public C7659b mo33115c() {
            return new C7659b(this);
        }

        /* renamed from: d */
        public final void mo33116d(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        char charAt2 = str2.charAt(i2);
                        if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2}));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* renamed from: e */
        public C7661b mo33117e(String str) {
            Iterator<C7662c> it = this.f14403a.iterator();
            while (it.hasNext()) {
                if (it.next().f14404a.equalsIgnoreCase(str)) {
                    it.remove();
                }
            }
            return this;
        }

        /* renamed from: f */
        public C7661b mo33118f(String str, String str2) {
            mo33116d(str, str2);
            mo33117e(str);
            this.f14403a.add(new C7662c(str, str2));
            return this;
        }
    }

    /* renamed from: c.x.a.a.a.a.f.b$c */
    public static class C7662c {

        /* renamed from: a */
        public final String f14404a;

        /* renamed from: b */
        public final String f14405b;

        public C7662c(String str, String str2) {
            this.f14404a = str;
            this.f14405b = str2;
        }

        /* renamed from: a */
        public final boolean mo33119a(String str, String str2) {
            if (str == null) {
                return str2 == null;
            }
            return str.equals(str2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7662c)) {
                return false;
            }
            C7662c cVar = (C7662c) obj;
            if (!mo33119a(cVar.f14404a, this.f14404a) || !mo33119a(cVar.f14405b, this.f14405b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public String mo33110a(int i) {
        return this.f14402a.get(i).f14404a;
    }

    /* renamed from: b */
    public String mo33111b(int i) {
        return this.f14402a.get(i).f14405b;
    }

    /* renamed from: c */
    public int mo33112c() {
        return this.f14402a.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7659b)) {
            return false;
        }
        return this.f14402a.equals(((C7659b) obj).f14402a);
    }

    public C7659b(C7661b bVar) {
        this.f14402a = new ArrayList(bVar.f14403a);
    }
}
