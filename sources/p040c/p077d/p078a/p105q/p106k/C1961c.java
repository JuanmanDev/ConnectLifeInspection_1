package p040c.p077d.p078a.p105q.p106k;

import androidx.annotation.NonNull;

/* renamed from: c.d.a.q.k.c */
/* compiled from: StateVerifier */
public abstract class C1961c {

    /* renamed from: c.d.a.q.k.c$b */
    /* compiled from: StateVerifier */
    public static class C1963b extends C1961c {

        /* renamed from: a */
        public volatile boolean f1644a;

        public C1963b() {
            super();
        }

        /* renamed from: b */
        public void mo16454b(boolean z) {
            this.f1644a = z;
        }

        /* renamed from: c */
        public void mo16455c() {
            if (this.f1644a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static C1961c m2601a() {
        return new C1963b();
    }

    /* renamed from: b */
    public abstract void mo16454b(boolean z);

    /* renamed from: c */
    public abstract void mo16455c();

    public C1961c() {
    }
}
