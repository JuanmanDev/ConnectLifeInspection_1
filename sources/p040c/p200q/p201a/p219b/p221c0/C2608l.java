package p040c.p200q.p201a.p219b.p221c0;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p222d0.C2633d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.c0.l */
/* compiled from: AudioRendererEventListener */
public interface C2608l {

    /* renamed from: c.q.a.b.c0.l$a */
    /* compiled from: AudioRendererEventListener */
    public static final class C2609a {
        @Nullable

        /* renamed from: a */
        public final Handler f3130a;
        @Nullable

        /* renamed from: b */
        public final C2608l f3131b;

        public C2609a(@Nullable Handler handler, @Nullable C2608l lVar) {
            Handler handler2;
            if (lVar != null) {
                C3151e.m7757e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f3130a = handler2;
            this.f3131b = lVar;
        }

        /* renamed from: a */
        public void mo18257a(int i) {
            if (this.f3131b != null) {
                this.f3130a.post(new C2593d(this, i));
            }
        }

        /* renamed from: b */
        public void mo18258b(int i, long j, long j2) {
            if (this.f3131b != null) {
                this.f3130a.post(new C2595f(this, i, j, j2));
            }
        }

        /* renamed from: c */
        public void mo18259c(String str, long j, long j2) {
            if (this.f3131b != null) {
                this.f3130a.post(new C2591b(this, str, j, j2));
            }
        }

        /* renamed from: d */
        public void mo18260d(C2633d dVar) {
            if (this.f3131b != null) {
                this.f3130a.post(new C2594e(this, dVar));
            }
        }

        /* renamed from: e */
        public void mo18261e(C2633d dVar) {
            if (this.f3131b != null) {
                this.f3130a.post(new C2592c(this, dVar));
            }
        }

        /* renamed from: f */
        public void mo18262f(Format format) {
            if (this.f3131b != null) {
                this.f3130a.post(new C2590a(this, format));
            }
        }

        /* renamed from: g */
        public /* synthetic */ void mo18263g(int i) {
            this.f3131b.mo18111a(i);
        }

        /* renamed from: h */
        public /* synthetic */ void mo18264h(int i, long j, long j2) {
            this.f3131b.mo18095I(i, j, j2);
        }

        /* renamed from: i */
        public /* synthetic */ void mo18265i(String str, long j, long j2) {
            this.f3131b.mo18130s(str, j, j2);
        }

        /* renamed from: j */
        public /* synthetic */ void mo18266j(C2633d dVar) {
            dVar.mo18403a();
            this.f3131b.mo18116f(dVar);
        }

        /* renamed from: k */
        public /* synthetic */ void mo18267k(C2633d dVar) {
            this.f3131b.mo18117g(dVar);
        }

        /* renamed from: l */
        public /* synthetic */ void mo18268l(Format format) {
            this.f3131b.mo18093G(format);
        }
    }

    /* renamed from: G */
    void mo18093G(Format format) {
    }

    /* renamed from: I */
    void mo18095I(int i, long j, long j2) {
    }

    /* renamed from: a */
    void mo18111a(int i) {
    }

    /* renamed from: f */
    void mo18116f(C2633d dVar) {
    }

    /* renamed from: g */
    void mo18117g(C2633d dVar) {
    }

    /* renamed from: s */
    void mo18130s(String str, long j, long j2) {
    }
}
