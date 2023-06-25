package p553f.p554a.p576f.p586h;

import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p040c.p200q.p201a.p219b.C3207s;
import p040c.p200q.p201a.p219b.C3217z;
import p040c.p200q.p201a.p219b.p221c0.C2599h;
import p553f.p554a.p570e.p571a.C9006d;
import p553f.p554a.p589h.C9177f;

/* renamed from: f.a.f.h.e */
/* compiled from: VideoPlayer */
public final class C9142e {

    /* renamed from: a */
    public C3217z f17907a;

    /* renamed from: b */
    public Surface f17908b;

    /* renamed from: c */
    public final C9177f.C9178a f17909c;

    /* renamed from: d */
    public C9138d f17910d = new C9138d();

    /* renamed from: e */
    public final C9006d f17911e;

    /* renamed from: f */
    public boolean f17912f = false;

    /* renamed from: g */
    public final C9145f f17913g;

    /* renamed from: f.a.f.h.e$a */
    /* compiled from: VideoPlayer */
    public class C9143a implements C9006d.C9011d {
        public C9143a() {
        }

        public void onCancel(Object obj) {
            C9142e.this.f17910d.mo46866d((C9006d.C9008b) null);
        }

        public void onListen(Object obj, C9006d.C9008b bVar) {
            C9142e.this.f17910d.mo46866d(bVar);
        }
    }

    /* renamed from: f.a.f.h.e$b */
    /* compiled from: VideoPlayer */
    public class C9144b implements C3207s.C3208a {
        public C9144b() {
        }

        /* renamed from: i */
        public void mo18119i(ExoPlaybackException exoPlaybackException) {
            if (C9142e.this.f17910d != null) {
                C9138d a = C9142e.this.f17910d;
                a.error("VideoError", "Video player had error " + exoPlaybackException, (Object) null);
            }
        }

        /* renamed from: x */
        public void mo18135x(boolean z, int i) {
            if (i == 2) {
                C9142e.this.mo46873l();
            } else if (i == 3) {
                if (!C9142e.this.f17912f) {
                    boolean unused = C9142e.this.f17912f = true;
                    C9142e.this.mo46874m();
                }
            } else if (i == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put(NotificationCompat.CATEGORY_EVENT, "completed");
                C9142e.this.f17910d.success(hashMap);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: c.q.a.b.n0.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: c.q.a.b.n0.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: c.q.a.b.n0.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: c.q.a.b.n0.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9142e(android.content.Context r7, p553f.p554a.p570e.p571a.C9006d r8, p553f.p554a.p589h.C9177f.C9178a r9, java.lang.String r10, java.lang.String r11, p553f.p554a.p576f.p586h.C9145f r12) {
        /*
            r6 = this;
            r6.<init>()
            f.a.f.h.d r0 = new f.a.f.h.d
            r0.<init>()
            r6.f17910d = r0
            r0 = 0
            r6.f17912f = r0
            r6.f17911e = r8
            r6.f17909c = r9
            r6.f17913g = r12
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r12 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
            r12.<init>()
            c.q.a.b.z r12 = p040c.p200q.p201a.p219b.C2827h.m6039g(r7, r12)
            r6.f17907a = r12
            android.net.Uri r10 = android.net.Uri.parse(r10)
            boolean r12 = m24779h(r10)
            if (r12 == 0) goto L_0x0037
            c.q.a.b.n0.p r12 = new c.q.a.b.n0.p
            r2 = 0
            r3 = 8000(0x1f40, float:1.121E-41)
            r4 = 8000(0x1f40, float:1.121E-41)
            r5 = 1
            java.lang.String r1 = "ExoPlayer"
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x003e
        L_0x0037:
            c.q.a.b.n0.n r12 = new c.q.a.b.n0.n
            java.lang.String r0 = "ExoPlayer"
            r12.<init>(r7, r0)
        L_0x003e:
            c.q.a.b.k0.u r7 = r6.mo46867e(r10, r12, r11, r7)
            c.q.a.b.z r10 = r6.f17907a
            r10.mo20197N(r7)
            r6.mo46877q(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p586h.C9142e.<init>(android.content.Context, f.a.e.a.d, f.a.h.f$a, java.lang.String, java.lang.String, f.a.f.h.f):void");
    }

    /* renamed from: h */
    public static boolean m24779h(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme.equals("http") || scheme.equals("https")) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static void m24780n(C3217z zVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2599h.C2601b bVar = new C2599h.C2601b();
            bVar.mo18233b(3);
            zVar.mo20203T(bVar.mo18232a(), !z);
            return;
        }
        zVar.mo20204U(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p219b.p241k0.C3014u mo46867e(android.net.Uri r8, p040c.p200q.p201a.p219b.p260n0.C3122h.C3123a r9, java.lang.String r10, android.content.Context r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r10 != 0) goto L_0x0011
            java.lang.String r10 = r8.getLastPathSegment()
            int r0 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7774N(r10)
            goto L_0x0061
        L_0x0011:
            int r5 = r10.hashCode()
            r6 = 3680(0xe60, float:5.157E-42)
            if (r5 == r6) goto L_0x0047
            r6 = 103407(0x193ef, float:1.44904E-40)
            if (r5 == r6) goto L_0x003d
            r6 = 3075986(0x2eef92, float:4.310374E-39)
            if (r5 == r6) goto L_0x0033
            r6 = 106069776(0x6527f10, float:3.958996E-35)
            if (r5 == r6) goto L_0x0029
            goto L_0x0051
        L_0x0029:
            java.lang.String r5 = "other"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0051
            r10 = r2
            goto L_0x0052
        L_0x0033:
            java.lang.String r5 = "dash"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0051
            r10 = r4
            goto L_0x0052
        L_0x003d:
            java.lang.String r5 = "hls"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0051
            r10 = r3
            goto L_0x0052
        L_0x0047:
            java.lang.String r5 = "ss"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0051
            r10 = r0
            goto L_0x0052
        L_0x0051:
            r10 = r1
        L_0x0052:
            if (r10 == 0) goto L_0x0060
            if (r10 == r4) goto L_0x0061
            if (r10 == r3) goto L_0x005e
            if (r10 == r2) goto L_0x005c
            r0 = r1
            goto L_0x0061
        L_0x005c:
            r0 = r2
            goto L_0x0061
        L_0x005e:
            r0 = r3
            goto L_0x0061
        L_0x0060:
            r0 = r4
        L_0x0061:
            r10 = 0
            if (r0 == 0) goto L_0x00b1
            if (r0 == r4) goto L_0x009d
            if (r0 == r3) goto L_0x0093
            if (r0 != r2) goto L_0x007c
            c.q.a.b.k0.s$b r10 = new c.q.a.b.k0.s$b
            r10.<init>(r9)
            c.q.a.b.f0.e r9 = new c.q.a.b.f0.e
            r9.<init>()
            r10.mo19512b(r9)
            c.q.a.b.k0.s r8 = r10.mo19511a(r8)
            return r8
        L_0x007c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unsupported type: "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0093:
            c.q.a.b.k0.e0.l$b r10 = new c.q.a.b.k0.e0.l$b
            r10.<init>((p040c.p200q.p201a.p219b.p260n0.C3122h.C3123a) r9)
            c.q.a.b.k0.e0.l r8 = r10.mo19356a(r8)
            return r8
        L_0x009d:
            c.q.a.b.k0.f0.e$b r0 = new c.q.a.b.k0.f0.e$b
            c.q.a.b.k0.f0.b$a r1 = new c.q.a.b.k0.f0.b$a
            r1.<init>(r9)
            c.q.a.b.n0.n r2 = new c.q.a.b.n0.n
            r2.<init>((android.content.Context) r11, (p040c.p200q.p201a.p219b.p260n0.C3141v) r10, (p040c.p200q.p201a.p219b.p260n0.C3122h.C3123a) r9)
            r0.<init>(r1, r2)
            c.q.a.b.k0.f0.e r8 = r0.mo19461a(r8)
            return r8
        L_0x00b1:
            c.q.a.b.k0.d0.e$d r0 = new c.q.a.b.k0.d0.e$d
            c.q.a.b.k0.d0.h$a r1 = new c.q.a.b.k0.d0.h$a
            r1.<init>(r9)
            c.q.a.b.n0.n r2 = new c.q.a.b.n0.n
            r2.<init>((android.content.Context) r11, (p040c.p200q.p201a.p219b.p260n0.C3141v) r10, (p040c.p200q.p201a.p219b.p260n0.C3122h.C3123a) r9)
            r0.<init>(r1, r2)
            c.q.a.b.k0.d0.e r8 = r0.mo19177a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p586h.C9142e.mo46867e(android.net.Uri, c.q.a.b.n0.h$a, java.lang.String, android.content.Context):c.q.a.b.k0.u");
    }

    /* renamed from: f */
    public void mo46868f() {
        if (this.f17912f) {
            this.f17907a.mo18086l();
        }
        this.f17909c.release();
        this.f17911e.mo46556d((C9006d.C9011d) null);
        Surface surface = this.f17908b;
        if (surface != null) {
            surface.release();
        }
        C3217z zVar = this.f17907a;
        if (zVar != null) {
            zVar.mo20199P();
        }
    }

    /* renamed from: g */
    public long mo46869g() {
        return this.f17907a.mo18923i();
    }

    /* renamed from: i */
    public void mo46870i() {
        this.f17907a.mo20205V(false);
    }

    /* renamed from: j */
    public void mo46871j() {
        this.f17907a.mo20205V(true);
    }

    /* renamed from: k */
    public void mo46872k(int i) {
        this.f17907a.mo18085k((long) i);
    }

    /* renamed from: l */
    public void mo46873l() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "bufferingUpdate");
        hashMap.put(SavedStateHandle.VALUES, Collections.singletonList(Arrays.asList(new Number[]{0, Long.valueOf(this.f17907a.mo20191H())})));
        this.f17910d.success(hashMap);
    }

    /* renamed from: m */
    public final void mo46874m() {
        if (this.f17912f) {
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.CATEGORY_EVENT, "initialized");
            hashMap.put("duration", Long.valueOf(this.f17907a.mo20192I()));
            if (this.f17907a.mo20195L() != null) {
                Format L = this.f17907a.mo20195L();
                int i = L.f7571v;
                int i2 = L.f7572w;
                int i3 = L.f7574y;
                if (i3 == 90 || i3 == 270) {
                    i = this.f17907a.mo20195L().f7572w;
                    i2 = this.f17907a.mo20195L().f7571v;
                }
                hashMap.put("width", Integer.valueOf(i));
                hashMap.put("height", Integer.valueOf(i2));
            }
            this.f17910d.success(hashMap);
        }
    }

    /* renamed from: o */
    public void mo46875o(boolean z) {
        this.f17907a.mo20206W(z ? 2 : 0);
    }

    /* renamed from: p */
    public void mo46876p(double d) {
        this.f17907a.mo20209Z((float) Math.max(0.0d, Math.min(1.0d, d)));
    }

    /* renamed from: q */
    public final void mo46877q(C9006d dVar, C9177f.C9178a aVar) {
        dVar.mo46556d(new C9143a());
        Surface surface = new Surface(aVar.mo46495a());
        this.f17908b = surface;
        this.f17907a.mo20207X(surface);
        m24780n(this.f17907a, this.f17913g.f17916a);
        this.f17907a.mo20188E(new C9144b());
    }
}
