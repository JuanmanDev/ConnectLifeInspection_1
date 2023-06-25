package p040c.p200q.p201a.p219b.p224f0;

import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.f0.o */
/* compiled from: SeekMap */
public interface C2682o {

    /* renamed from: c.q.a.b.f0.o$a */
    /* compiled from: SeekMap */
    public static final class C2683a {

        /* renamed from: a */
        public final C2685p f3444a;

        /* renamed from: b */
        public final C2685p f3445b;

        public C2683a(C2685p pVar) {
            this(pVar, pVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2683a.class != obj.getClass()) {
                return false;
            }
            C2683a aVar = (C2683a) obj;
            if (!this.f3444a.equals(aVar.f3444a) || !this.f3445b.equals(aVar.f3445b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3444a.hashCode() * 31) + this.f3445b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f3444a);
            if (this.f3444a.equals(this.f3445b)) {
                str = "";
            } else {
                str = ", " + this.f3445b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C2683a(C2685p pVar, C2685p pVar2) {
            C3151e.m7757e(pVar);
            this.f3444a = pVar;
            C3151e.m7757e(pVar2);
            this.f3445b = pVar2;
        }
    }

    /* renamed from: c.q.a.b.f0.o$b */
    /* compiled from: SeekMap */
    public static final class C2684b implements C2682o {

        /* renamed from: a */
        public final long f3446a;

        /* renamed from: b */
        public final C2683a f3447b;

        public C2684b(long j) {
            this(j, 0);
        }

        /* renamed from: d */
        public boolean mo18503d() {
            return false;
        }

        /* renamed from: h */
        public C2683a mo18504h(long j) {
            return this.f3447b;
        }

        /* renamed from: i */
        public long mo18505i() {
            return this.f3446a;
        }

        public C2684b(long j, long j2) {
            this.f3446a = j;
            this.f3447b = new C2683a(j2 == 0 ? C2685p.f3448c : new C2685p(0, j2));
        }
    }

    /* renamed from: d */
    boolean mo18503d();

    /* renamed from: h */
    C2683a mo18504h(long j);

    /* renamed from: i */
    long mo18505i();
}
