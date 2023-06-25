package p040c.p200q.p201a.p219b.p241k0;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.v */
/* compiled from: MediaSourceEventListener */
public interface C3017v {

    /* renamed from: c.q.a.b.k0.v$a */
    /* compiled from: MediaSourceEventListener */
    public static final class C3018a {

        /* renamed from: a */
        public final int f5282a;
        @Nullable

        /* renamed from: b */
        public final C3014u.C3015a f5283b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C3019a> f5284c;

        /* renamed from: d */
        public final long f5285d;

        /* renamed from: c.q.a.b.k0.v$a$a */
        /* compiled from: MediaSourceEventListener */
        public static final class C3019a {

            /* renamed from: a */
            public final Handler f5286a;

            /* renamed from: b */
            public final C3017v f5287b;

            public C3019a(Handler handler, C3017v vVar) {
                this.f5286a = handler;
                this.f5287b = vVar;
            }
        }

        public C3018a() {
            this(new CopyOnWriteArrayList(), 0, (C3014u.C3015a) null, 0);
        }

        /* renamed from: A */
        public void mo19516A() {
            C3014u.C3015a aVar = this.f5283b;
            C3151e.m7757e(aVar);
            C3014u.C3015a aVar2 = aVar;
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2994j(this, next.f5287b, aVar2));
            }
        }

        /* renamed from: B */
        public final void mo19517B(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: C */
        public void mo19518C() {
            C3014u.C3015a aVar = this.f5283b;
            C3151e.m7757e(aVar);
            C3014u.C3015a aVar2 = aVar;
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2992h(this, next.f5287b, aVar2));
            }
        }

        /* renamed from: D */
        public void mo19519D(C3017v vVar) {
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                if (next.f5287b == vVar) {
                    this.f5284c.remove(next);
                }
            }
        }

        /* renamed from: E */
        public void mo19520E(int i, long j, long j2) {
            long j3 = j;
            mo19521F(new C3021c(1, i, (Format) null, 3, (Object) null, mo19524b(j), mo19524b(j2)));
        }

        /* renamed from: F */
        public void mo19521F(C3021c cVar) {
            C3014u.C3015a aVar = this.f5283b;
            C3151e.m7757e(aVar);
            C3014u.C3015a aVar2 = aVar;
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2888d(this, next.f5287b, aVar2, cVar));
            }
        }

        @CheckResult
        /* renamed from: G */
        public C3018a mo19522G(int i, @Nullable C3014u.C3015a aVar, long j) {
            return new C3018a(this.f5284c, i, aVar, j);
        }

        /* renamed from: a */
        public void mo19523a(Handler handler, C3017v vVar) {
            C3151e.m7753a((handler == null || vVar == null) ? false : true);
            this.f5284c.add(new C3019a(handler, vVar));
        }

        /* renamed from: b */
        public final long mo19524b(long j) {
            long b = C2627d.m5058b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f5285d + b;
        }

        /* renamed from: c */
        public void mo19525c(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
            mo19526d(new C3021c(1, i, format, i2, obj, mo19524b(j), -9223372036854775807L));
        }

        /* renamed from: d */
        public void mo19526d(C3021c cVar) {
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2939e(this, next.f5287b, cVar));
            }
        }

        /* renamed from: e */
        public /* synthetic */ void mo19527e(C3017v vVar, C3021c cVar) {
            vVar.mo18100N(this.f5282a, this.f5283b, cVar);
        }

        /* renamed from: f */
        public /* synthetic */ void mo19528f(C3017v vVar, C3020b bVar, C3021c cVar) {
            vVar.mo18125o(this.f5282a, this.f5283b, bVar, cVar);
        }

        /* renamed from: g */
        public /* synthetic */ void mo19529g(C3017v vVar, C3020b bVar, C3021c cVar) {
            vVar.mo18120j(this.f5282a, this.f5283b, bVar, cVar);
        }

        /* renamed from: h */
        public /* synthetic */ void mo19530h(C3017v vVar, C3020b bVar, C3021c cVar, IOException iOException, boolean z) {
            vVar.mo18087A(this.f5282a, this.f5283b, bVar, cVar, iOException, z);
        }

        /* renamed from: i */
        public /* synthetic */ void mo19531i(C3017v vVar, C3020b bVar, C3021c cVar) {
            vVar.mo18136y(this.f5282a, this.f5283b, bVar, cVar);
        }

        /* renamed from: j */
        public /* synthetic */ void mo19532j(C3017v vVar, C3014u.C3015a aVar) {
            vVar.mo18094H(this.f5282a, aVar);
        }

        /* renamed from: k */
        public /* synthetic */ void mo19533k(C3017v vVar, C3014u.C3015a aVar) {
            vVar.mo18092F(this.f5282a, aVar);
        }

        /* renamed from: l */
        public /* synthetic */ void mo19534l(C3017v vVar, C3014u.C3015a aVar) {
            vVar.mo18124n(this.f5282a, aVar);
        }

        /* renamed from: m */
        public /* synthetic */ void mo19535m(C3017v vVar, C3014u.C3015a aVar, C3021c cVar) {
            vVar.mo18134w(this.f5282a, aVar, cVar);
        }

        /* renamed from: n */
        public void mo19536n(C3020b bVar, C3021c cVar) {
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2868c(this, next.f5287b, bVar, cVar));
            }
        }

        /* renamed from: o */
        public void mo19537o(C3125j jVar, Uri uri, Map<String, List<String>> map, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            mo19536n(new C3020b(jVar, uri, map, j3, j4, j5), new C3021c(i, i2, format, i3, obj, mo19524b(j), mo19524b(j2)));
        }

        /* renamed from: p */
        public void mo19538p(C3125j jVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            mo19537o(jVar, uri, map, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: q */
        public void mo19539q(C3020b bVar, C3021c cVar) {
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2976f(this, next.f5287b, bVar, cVar));
            }
        }

        /* renamed from: r */
        public void mo19540r(C3125j jVar, Uri uri, Map<String, List<String>> map, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            mo19539q(new C3020b(jVar, uri, map, j3, j4, j5), new C3021c(i, i2, format, i3, obj, mo19524b(j), mo19524b(j2)));
        }

        /* renamed from: s */
        public void mo19541s(C3125j jVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            mo19540r(jVar, uri, map, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: t */
        public void mo19542t(C3020b bVar, C3021c cVar, IOException iOException, boolean z) {
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2865b(this, next.f5287b, bVar, cVar, iOException, z));
            }
        }

        /* renamed from: u */
        public void mo19543u(C3125j jVar, Uri uri, Map<String, List<String>> map, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            mo19542t(new C3020b(jVar, uri, map, j3, j4, j5), new C3021c(i, i2, format, i3, obj, mo19524b(j), mo19524b(j2)), iOException, z);
        }

        /* renamed from: v */
        public void mo19544v(C3125j jVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            mo19543u(jVar, uri, map, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        /* renamed from: w */
        public void mo19545w(C3020b bVar, C3021c cVar) {
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2993i(this, next.f5287b, bVar, cVar));
            }
        }

        /* renamed from: x */
        public void mo19546x(C3125j jVar, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
            C3125j jVar2 = jVar;
            mo19545w(new C3020b(jVar2, jVar2.f5720a, Collections.emptyMap(), j3, 0, 0), new C3021c(i, i2, format, i3, obj, mo19524b(j), mo19524b(j2)));
        }

        /* renamed from: y */
        public void mo19547y(C3125j jVar, int i, long j) {
            mo19546x(jVar, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        /* renamed from: z */
        public void mo19548z() {
            C3014u.C3015a aVar = this.f5283b;
            C3151e.m7757e(aVar);
            C3014u.C3015a aVar2 = aVar;
            Iterator<C3019a> it = this.f5284c.iterator();
            while (it.hasNext()) {
                C3019a next = it.next();
                mo19517B(next.f5286a, new C2991g(this, next.f5287b, aVar2));
            }
        }

        public C3018a(CopyOnWriteArrayList<C3019a> copyOnWriteArrayList, int i, @Nullable C3014u.C3015a aVar, long j) {
            this.f5284c = copyOnWriteArrayList;
            this.f5282a = i;
            this.f5283b = aVar;
            this.f5285d = j;
        }
    }

    /* renamed from: c.q.a.b.k0.v$b */
    /* compiled from: MediaSourceEventListener */
    public static final class C3020b {

        /* renamed from: a */
        public final Uri f5288a;

        public C3020b(C3125j jVar, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.f5288a = uri;
        }
    }

    /* renamed from: c.q.a.b.k0.v$c */
    /* compiled from: MediaSourceEventListener */
    public static final class C3021c {
        @Nullable

        /* renamed from: a */
        public final Format f5289a;
        @Nullable

        /* renamed from: b */
        public final Object f5290b;

        public C3021c(int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            this.f5289a = format;
            this.f5290b = obj;
        }
    }

    /* renamed from: A */
    void mo18087A(int i, @Nullable C3014u.C3015a aVar, C3020b bVar, C3021c cVar, IOException iOException, boolean z);

    /* renamed from: F */
    void mo18092F(int i, C3014u.C3015a aVar);

    /* renamed from: H */
    void mo18094H(int i, C3014u.C3015a aVar);

    /* renamed from: N */
    void mo18100N(int i, @Nullable C3014u.C3015a aVar, C3021c cVar);

    /* renamed from: j */
    void mo18120j(int i, @Nullable C3014u.C3015a aVar, C3020b bVar, C3021c cVar);

    /* renamed from: n */
    void mo18124n(int i, C3014u.C3015a aVar);

    /* renamed from: o */
    void mo18125o(int i, @Nullable C3014u.C3015a aVar, C3020b bVar, C3021c cVar);

    /* renamed from: w */
    void mo18134w(int i, C3014u.C3015a aVar, C3021c cVar);

    /* renamed from: y */
    void mo18136y(int i, @Nullable C3014u.C3015a aVar, C3020b bVar, C3021c cVar);
}
