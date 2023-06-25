package p040c.p200q.p201a.p219b.p241k0;

import android.os.Handler;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3141v;

/* renamed from: c.q.a.b.k0.u */
/* compiled from: MediaSource */
public interface C3014u {

    /* renamed from: c.q.a.b.k0.u$a */
    /* compiled from: MediaSource */
    public static final class C3015a {

        /* renamed from: a */
        public final Object f5277a;

        /* renamed from: b */
        public final int f5278b;

        /* renamed from: c */
        public final int f5279c;

        /* renamed from: d */
        public final long f5280d;

        /* renamed from: e */
        public final long f5281e;

        public C3015a(Object obj) {
            this(obj, -1);
        }

        /* renamed from: a */
        public boolean mo19513a() {
            return this.f5278b != -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3015a.class != obj.getClass()) {
                return false;
            }
            C3015a aVar = (C3015a) obj;
            if (this.f5277a.equals(aVar.f5277a) && this.f5278b == aVar.f5278b && this.f5279c == aVar.f5279c && this.f5280d == aVar.f5280d && this.f5281e == aVar.f5281e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((527 + this.f5277a.hashCode()) * 31) + this.f5278b) * 31) + this.f5279c) * 31) + ((int) this.f5280d)) * 31) + ((int) this.f5281e);
        }

        public C3015a(Object obj, long j) {
            this(obj, -1, -1, j, Long.MIN_VALUE);
        }

        public C3015a(Object obj, long j, long j2) {
            this(obj, -1, -1, j, j2);
        }

        public C3015a(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, Long.MIN_VALUE);
        }

        public C3015a(Object obj, int i, int i2, long j, long j2) {
            this.f5277a = obj;
            this.f5278b = i;
            this.f5279c = i2;
            this.f5280d = j;
            this.f5281e = j2;
        }
    }

    /* renamed from: c.q.a.b.k0.u$b */
    /* compiled from: MediaSource */
    public interface C3016b {
        /* renamed from: d */
        void mo18985d(C3014u uVar, C2578a0 a0Var, @Nullable Object obj);
    }

    /* renamed from: a */
    C3012t mo19162a(C3015a aVar, C3117d dVar, long j);

    /* renamed from: b */
    void mo19473b(C3016b bVar, @Nullable C3141v vVar);

    /* renamed from: d */
    void mo19474d(Handler handler, C3017v vVar);

    /* renamed from: e */
    void mo19475e(C3017v vVar);

    /* renamed from: g */
    void mo19476g(C3016b bVar);

    /* renamed from: h */
    void mo19163h();

    /* renamed from: i */
    void mo19164i(C3012t tVar);
}
