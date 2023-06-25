package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;
import p040c.p077d.p078a.p105q.C1946f;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.k.m */
/* compiled from: ModelCache */
public class C1753m<A, B> {

    /* renamed from: a */
    public final C1946f<C1755b<A>, B> f1303a;

    /* renamed from: c.d.a.k.k.m$a */
    /* compiled from: ModelCache */
    public class C1754a extends C1946f<C1755b<A>, B> {
        public C1754a(C1753m mVar, long j) {
            super(j);
        }

        /* renamed from: n */
        public void mo15707j(@NonNull C1755b<A> bVar, @Nullable B b) {
            bVar.mo16027c();
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.k.m$b */
    /* compiled from: ModelCache */
    public static final class C1755b<A> {

        /* renamed from: d */
        public static final Queue<C1755b<?>> f1304d = C1950j.m2569e(0);

        /* renamed from: a */
        public int f1305a;

        /* renamed from: b */
        public int f1306b;

        /* renamed from: c */
        public A f1307c;

        /* renamed from: a */
        public static <A> C1755b<A> m1863a(A a, int i, int i2) {
            C1755b<A> poll;
            synchronized (f1304d) {
                poll = f1304d.poll();
            }
            if (poll == null) {
                poll = new C1755b<>();
            }
            poll.mo16026b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        public final void mo16026b(A a, int i, int i2) {
            this.f1307c = a;
            this.f1306b = i;
            this.f1305a = i2;
        }

        /* renamed from: c */
        public void mo16027c() {
            synchronized (f1304d) {
                f1304d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1755b)) {
                return false;
            }
            C1755b bVar = (C1755b) obj;
            if (this.f1306b == bVar.f1306b && this.f1305a == bVar.f1305a && this.f1307c.equals(bVar.f1307c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f1305a * 31) + this.f1306b) * 31) + this.f1307c.hashCode();
        }
    }

    public C1753m(long j) {
        this.f1303a = new C1754a(this, j);
    }

    @Nullable
    /* renamed from: a */
    public B mo16023a(A a, int i, int i2) {
        C1755b a2 = C1755b.m1863a(a, i, i2);
        B g = this.f1303a.mo16434g(a2);
        a2.mo16027c();
        return g;
    }

    /* renamed from: b */
    public void mo16024b(A a, int i, int i2, B b) {
        this.f1303a.mo16436k(C1755b.m1863a(a, i, i2), b);
    }
}
