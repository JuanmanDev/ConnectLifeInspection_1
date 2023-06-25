package p040c.p200q.p201a.p219b.p262p0;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p222d0.C2633d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.p0.n */
/* compiled from: VideoRendererEventListener */
public interface C3201n {

    /* renamed from: c.q.a.b.p0.n$a */
    /* compiled from: VideoRendererEventListener */
    public static final class C3202a {
        @Nullable

        /* renamed from: a */
        public final Handler f6006a;
        @Nullable

        /* renamed from: b */
        public final C3201n f6007b;

        public C3202a(@Nullable Handler handler, @Nullable C3201n nVar) {
            Handler handler2;
            if (nVar != null) {
                C3151e.m7757e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f6006a = handler2;
            this.f6007b = nVar;
        }

        /* renamed from: a */
        public void mo20140a(String str, long j, long j2) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3186d(this, str, j, j2));
            }
        }

        /* renamed from: b */
        public void mo20141b(C2633d dVar) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3188f(this, dVar));
            }
        }

        /* renamed from: c */
        public void mo20142c(int i, long j) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3189g(this, i, j));
            }
        }

        /* renamed from: d */
        public void mo20143d(C2633d dVar) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3187e(this, dVar));
            }
        }

        /* renamed from: e */
        public void mo20144e(Format format) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3183a(this, format));
            }
        }

        /* renamed from: f */
        public /* synthetic */ void mo20145f(String str, long j, long j2) {
            this.f6007b.mo18118h(str, j, j2);
        }

        /* renamed from: g */
        public /* synthetic */ void mo20146g(C2633d dVar) {
            dVar.mo18403a();
            this.f6007b.mo18097K(dVar);
        }

        /* renamed from: h */
        public /* synthetic */ void mo20147h(int i, long j) {
            this.f6007b.mo18133v(i, j);
        }

        /* renamed from: i */
        public /* synthetic */ void mo20148i(C2633d dVar) {
            this.f6007b.mo18091E(dVar);
        }

        /* renamed from: j */
        public /* synthetic */ void mo20149j(Format format) {
            this.f6007b.mo18090D(format);
        }

        /* renamed from: k */
        public /* synthetic */ void mo20150k(@Nullable Surface surface) {
            this.f6007b.mo18128q(surface);
        }

        /* renamed from: l */
        public /* synthetic */ void mo20151l(int i, int i2, int i3, float f) {
            this.f6007b.mo18112b(i, i2, i3, f);
        }

        /* renamed from: m */
        public void mo20152m(@Nullable Surface surface) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3184b(this, surface));
            }
        }

        /* renamed from: n */
        public void mo20153n(int i, int i2, int i3, float f) {
            if (this.f6007b != null) {
                this.f6006a.post(new C3185c(this, i, i2, i3, f));
            }
        }
    }

    /* renamed from: D */
    void mo18090D(Format format) {
    }

    /* renamed from: E */
    void mo18091E(C2633d dVar) {
    }

    /* renamed from: K */
    void mo18097K(C2633d dVar) {
    }

    /* renamed from: b */
    void mo18112b(int i, int i2, int i3, float f) {
    }

    /* renamed from: h */
    void mo18118h(String str, long j, long j2) {
    }

    /* renamed from: q */
    void mo18128q(@Nullable Surface surface) {
    }

    /* renamed from: v */
    void mo18133v(int i, long j) {
    }
}
