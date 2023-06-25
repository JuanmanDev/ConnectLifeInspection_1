package p040c.p200q.p201a.p219b;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.C3207s;
import p040c.p200q.p201a.p219b.C3209t;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p259m0.C3110g;
import p040c.p200q.p201a.p219b.p259m0.C3112h;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3153f;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.i */
/* compiled from: ExoPlayerImpl */
public final class C2841i extends C2582b implements C3207s {

    /* renamed from: b */
    public final C3112h f4422b;

    /* renamed from: c */
    public final C3110g f4423c;

    /* renamed from: d */
    public final Handler f4424d;

    /* renamed from: e */
    public final C2849j f4425e;

    /* renamed from: f */
    public final Handler f4426f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<C3207s.C3208a> f4427g;

    /* renamed from: h */
    public final C2578a0.C2580b f4428h;

    /* renamed from: i */
    public final ArrayDeque<C2843b> f4429i;

    /* renamed from: j */
    public boolean f4430j;

    /* renamed from: k */
    public boolean f4431k;

    /* renamed from: l */
    public int f4432l;

    /* renamed from: m */
    public boolean f4433m;

    /* renamed from: n */
    public int f4434n;

    /* renamed from: o */
    public boolean f4435o;

    /* renamed from: p */
    public boolean f4436p;

    /* renamed from: q */
    public C3206r f4437q;

    /* renamed from: r */
    public C3205q f4438r;

    /* renamed from: s */
    public int f4439s;

    /* renamed from: t */
    public int f4440t;

    /* renamed from: u */
    public long f4441u;

    /* renamed from: c.q.a.b.i$a */
    /* compiled from: ExoPlayerImpl */
    public class C2842a extends Handler {
        public C2842a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C2841i.this.mo18934w(message);
        }
    }

    /* renamed from: c.q.a.b.i$b */
    /* compiled from: ExoPlayerImpl */
    public static final class C2843b {

        /* renamed from: a */
        public final C3205q f4443a;

        /* renamed from: b */
        public final Set<C3207s.C3208a> f4444b;

        /* renamed from: c */
        public final C3110g f4445c;

        /* renamed from: d */
        public final boolean f4446d;

        /* renamed from: e */
        public final int f4447e;

        /* renamed from: f */
        public final int f4448f;

        /* renamed from: g */
        public final boolean f4449g;

        /* renamed from: h */
        public final boolean f4450h;

        /* renamed from: i */
        public final boolean f4451i;

        /* renamed from: j */
        public final boolean f4452j;

        /* renamed from: k */
        public final boolean f4453k;

        /* renamed from: l */
        public final boolean f4454l;

        public C2843b(C3205q qVar, C3205q qVar2, Set<C3207s.C3208a> set, C3110g gVar, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.f4443a = qVar;
            this.f4444b = set;
            this.f4445c = gVar;
            this.f4446d = z;
            this.f4447e = i;
            this.f4448f = i2;
            this.f4449g = z2;
            this.f4450h = z3;
            boolean z5 = false;
            this.f4451i = z4 || qVar2.f6020f != qVar.f6020f;
            this.f4452j = (qVar2.f6015a == qVar.f6015a && qVar2.f6016b == qVar.f6016b) ? false : true;
            this.f4453k = qVar2.f6021g != qVar.f6021g;
            this.f4454l = qVar2.f6023i != qVar.f6023i ? true : z5;
        }

        /* renamed from: a */
        public void mo18939a() {
            if (this.f4452j || this.f4448f == 0) {
                for (C3207s.C3208a B : this.f4444b) {
                    C3205q qVar = this.f4443a;
                    B.mo18088B(qVar.f6015a, qVar.f6016b, this.f4448f);
                }
            }
            if (this.f4446d) {
                for (C3207s.C3208a e : this.f4444b) {
                    e.mo18115e(this.f4447e);
                }
            }
            if (this.f4454l) {
                this.f4445c.mo19835c(this.f4443a.f6023i.f5685d);
                for (C3207s.C3208a J : this.f4444b) {
                    C3205q qVar2 = this.f4443a;
                    J.mo18096J(qVar2.f6022h, qVar2.f6023i.f5684c);
                }
            }
            if (this.f4453k) {
                for (C3207s.C3208a d : this.f4444b) {
                    d.mo18114d(this.f4443a.f6021g);
                }
            }
            if (this.f4451i) {
                for (C3207s.C3208a x : this.f4444b) {
                    x.mo18135x(this.f4450h, this.f4443a.f6020f);
                }
            }
            if (this.f4449g) {
                for (C3207s.C3208a k : this.f4444b) {
                    k.mo18121k();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C2841i(C3212u[] uVarArr, C3110g gVar, C3098m mVar, C3118e eVar, C3153f fVar, Looper looper) {
        C3212u[] uVarArr2 = uVarArr;
        C3163m.m7879e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.9.6" + "] [" + C3152e0.f5823e + "]");
        C3151e.m7759g(uVarArr2.length > 0);
        C3151e.m7757e(uVarArr);
        C3212u[] uVarArr3 = uVarArr2;
        C3151e.m7757e(gVar);
        this.f4423c = gVar;
        this.f4430j = false;
        this.f4432l = 0;
        this.f4433m = false;
        this.f4427g = new CopyOnWriteArraySet<>();
        this.f4422b = new C3112h(new C3214w[uVarArr2.length], new C3107e[uVarArr2.length], (Object) null);
        this.f4428h = new C2578a0.C2580b();
        this.f4437q = C3206r.f6028e;
        C3216y yVar = C3216y.f6049d;
        this.f4424d = new C2842a(looper);
        this.f4438r = C3205q.m8147g(0, this.f4422b);
        this.f4429i = new ArrayDeque<>();
        this.f4425e = new C2849j(uVarArr, gVar, this.f4422b, mVar, eVar, this.f4430j, this.f4432l, this.f4433m, this.f4424d, fVar);
        this.f4426f = new Handler(this.f4425e.mo19008p());
    }

    /* renamed from: A */
    public void mo18909A(C3014u uVar, boolean z, boolean z2) {
        C3205q v = mo18933v(z, z2, 2);
        this.f4435o = true;
        this.f4434n++;
        this.f4425e.mo18962H(uVar, z, z2);
        mo18914F(v, false, 4, 1, false, false);
    }

    /* renamed from: B */
    public void mo18910B() {
        C3163m.m7879e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.9.6" + "] [" + C3152e0.f5823e + "] [" + C2862k.m6235b() + "]");
        this.f4425e.mo18964J();
        this.f4424d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: C */
    public void mo18911C(boolean z, boolean z2) {
        boolean z3 = z && !z2;
        if (this.f4431k != z3) {
            this.f4431k = z3;
            this.f4425e.mo18986d0(z3);
        }
        if (this.f4430j != z) {
            this.f4430j = z;
            mo18914F(this.f4438r, false, 4, 1, false, true);
        }
    }

    /* renamed from: D */
    public void mo18912D(int i) {
        if (this.f4432l != i) {
            this.f4432l = i;
            this.f4425e.mo18992g0(i);
            Iterator<C3207s.C3208a> it = this.f4427g.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i);
            }
        }
    }

    /* renamed from: E */
    public final boolean mo18913E() {
        return this.f4438r.f6015a.mo18062q() || this.f4434n > 0;
    }

    /* renamed from: F */
    public final void mo18914F(C3205q qVar, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.f4429i.isEmpty();
        this.f4429i.addLast(new C2843b(qVar, this.f4438r, this.f4427g, this.f4423c, z, i, i2, z2, this.f4430j, z3));
        this.f4438r = qVar;
        if (!z4) {
            while (!this.f4429i.isEmpty()) {
                this.f4429i.peekFirst().mo18939a();
                this.f4429i.removeFirst();
            }
        }
    }

    /* renamed from: a */
    public long mo18915a() {
        return Math.max(0, C2627d.m5058b(this.f4438r.f6026l));
    }

    /* renamed from: b */
    public void mo18916b(int i, long j) {
        C2578a0 a0Var = this.f4438r.f6015a;
        if (i < 0 || (!a0Var.mo18062q() && i >= a0Var.mo18061p())) {
            throw new IllegalSeekPositionException(a0Var, i, j);
        }
        this.f4436p = true;
        this.f4434n++;
        if (mo18936y()) {
            C3163m.m7880f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f4424d.obtainMessage(0, 1, -1, this.f4438r).sendToTarget();
            return;
        }
        this.f4439s = i;
        if (a0Var.mo18062q()) {
            this.f4441u = j == -9223372036854775807L ? 0 : j;
            this.f4440t = 0;
        } else {
            long b = j == -9223372036854775807L ? a0Var.mo18058m(i, this.f3057a).mo18080b() : C2627d.m5057a(j);
            Pair<Object, Long> j2 = a0Var.mo18055j(this.f3057a, this.f4428h, i, b);
            this.f4441u = C2627d.m5058b(b);
            this.f4440t = a0Var.mo18047b(j2.first);
        }
        this.f4425e.mo18975U(a0Var, i, C2627d.m5057a(j));
        Iterator<C3207s.C3208a> it = this.f4427g.iterator();
        while (it.hasNext()) {
            it.next().mo18115e(1);
        }
    }

    /* renamed from: c */
    public void mo18917c(boolean z) {
        C3205q v = mo18933v(z, z, 1);
        this.f4434n++;
        this.f4425e.mo19005n0(z);
        mo18914F(v, false, 4, 1, false, false);
    }

    /* renamed from: d */
    public int mo18918d() {
        if (mo18936y()) {
            return this.f4438r.f6017c.f5279c;
        }
        return -1;
    }

    /* renamed from: e */
    public int mo18919e() {
        if (mo18913E()) {
            return this.f4439s;
        }
        C3205q qVar = this.f4438r;
        return qVar.f6015a.mo18053h(qVar.f6017c.f5277a, this.f4428h).f3046c;
    }

    /* renamed from: f */
    public long mo18920f() {
        if (!mo18936y()) {
            return mo18923i();
        }
        C3205q qVar = this.f4438r;
        qVar.f6015a.mo18053h(qVar.f6017c.f5277a, this.f4428h);
        return this.f4428h.mo18074k() + C2627d.m5058b(this.f4438r.f6019e);
    }

    /* renamed from: g */
    public int mo18921g() {
        if (mo18936y()) {
            return this.f4438r.f6017c.f5278b;
        }
        return -1;
    }

    /* renamed from: h */
    public C2578a0 mo18922h() {
        return this.f4438r.f6015a;
    }

    /* renamed from: i */
    public long mo18923i() {
        if (mo18913E()) {
            return this.f4441u;
        }
        if (this.f4438r.f6017c.mo19513a()) {
            return C2627d.m5058b(this.f4438r.f6027m);
        }
        C3205q qVar = this.f4438r;
        return mo18937z(qVar.f6017c, qVar.f6027m);
    }

    /* renamed from: m */
    public void mo18924m(C3207s.C3208a aVar) {
        this.f4427g.add(aVar);
    }

    /* renamed from: n */
    public C3209t mo18925n(C3209t.C3211b bVar) {
        return new C3209t(this.f4425e, bVar, this.f4438r.f6015a, mo18919e(), this.f4426f);
    }

    /* renamed from: o */
    public Looper mo18926o() {
        return this.f4424d.getLooper();
    }

    /* renamed from: p */
    public long mo18927p() {
        if (!mo18936y()) {
            return mo18928q();
        }
        C3205q qVar = this.f4438r;
        if (qVar.f6024j.equals(qVar.f6017c)) {
            return C2627d.m5058b(this.f4438r.f6025k);
        }
        return mo18930s();
    }

    /* renamed from: q */
    public long mo18928q() {
        if (mo18913E()) {
            return this.f4441u;
        }
        C3205q qVar = this.f4438r;
        if (qVar.f6024j.f5280d != qVar.f6017c.f5280d) {
            return qVar.f6015a.mo18058m(mo18919e(), this.f3057a).mo18081c();
        }
        long j = qVar.f6025k;
        if (this.f4438r.f6024j.mo19513a()) {
            C3205q qVar2 = this.f4438r;
            C2578a0.C2580b h = qVar2.f6015a.mo18053h(qVar2.f6024j.f5277a, this.f4428h);
            long f = h.mo18069f(this.f4438r.f6024j.f5278b);
            j = f == Long.MIN_VALUE ? h.f3047d : f;
        }
        return mo18937z(this.f4438r.f6024j, j);
    }

    /* renamed from: r */
    public int mo18929r() {
        if (mo18913E()) {
            return this.f4440t;
        }
        C3205q qVar = this.f4438r;
        return qVar.f6015a.mo18047b(qVar.f6017c.f5277a);
    }

    /* renamed from: s */
    public long mo18930s() {
        if (!mo18936y()) {
            return mo18084j();
        }
        C3205q qVar = this.f4438r;
        C3014u.C3015a aVar = qVar.f6017c;
        qVar.f6015a.mo18053h(aVar.f5277a, this.f4428h);
        return C2627d.m5058b(this.f4428h.mo18065b(aVar.f5278b, aVar.f5279c));
    }

    /* renamed from: t */
    public boolean mo18931t() {
        return this.f4430j;
    }

    /* renamed from: u */
    public int mo18932u() {
        return this.f4438r.f6020f;
    }

    /* renamed from: v */
    public final C3205q mo18933v(boolean z, boolean z2, int i) {
        long j;
        long j2 = 0;
        if (z) {
            this.f4439s = 0;
            this.f4440t = 0;
            this.f4441u = 0;
        } else {
            this.f4439s = mo18919e();
            this.f4440t = mo18929r();
            this.f4441u = mo18923i();
        }
        C3014u.C3015a h = z ? this.f4438r.mo20164h(this.f4433m, this.f3057a) : this.f4438r.f6017c;
        if (!z) {
            j2 = this.f4438r.f6027m;
        }
        long j3 = j2;
        if (z) {
            j = -9223372036854775807L;
        } else {
            j = this.f4438r.f6019e;
        }
        return new C3205q(z2 ? C2578a0.f3043a : this.f4438r.f6015a, z2 ? null : this.f4438r.f6016b, h, j3, j, i, false, z2 ? TrackGroupArray.f7829n : this.f4438r.f6022h, z2 ? this.f4422b : this.f4438r.f6023i, h, j3, 0, j3);
    }

    /* renamed from: w */
    public void mo18934w(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 0) {
            C3205q qVar = (C3205q) message.obj;
            int i2 = message.arg1;
            if (message.arg2 == -1) {
                z = false;
            }
            mo18935x(qVar, i2, z, message.arg2);
        } else if (i == 1) {
            C3206r rVar = (C3206r) message.obj;
            if (!this.f4437q.equals(rVar)) {
                this.f4437q = rVar;
                Iterator<C3207s.C3208a> it = this.f4427g.iterator();
                while (it.hasNext()) {
                    it.next().mo18113c(rVar);
                }
            }
        } else if (i == 2) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
            Iterator<C3207s.C3208a> it2 = this.f4427g.iterator();
            while (it2.hasNext()) {
                it2.next().mo18119i(exoPlaybackException);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: x */
    public final void mo18935x(C3205q qVar, int i, boolean z, int i2) {
        int i3 = this.f4434n - i;
        this.f4434n = i3;
        if (i3 == 0) {
            if (qVar.f6018d == -9223372036854775807L) {
                qVar = qVar.mo20165i(qVar.f6017c, 0, qVar.f6019e);
            }
            C3205q qVar2 = qVar;
            if ((!this.f4438r.f6015a.mo18062q() || this.f4435o) && qVar2.f6015a.mo18062q()) {
                this.f4440t = 0;
                this.f4439s = 0;
                this.f4441u = 0;
            }
            int i4 = this.f4435o ? 0 : 2;
            boolean z2 = this.f4436p;
            this.f4435o = false;
            this.f4436p = false;
            mo18914F(qVar2, z, i2, i4, z2, false);
        }
    }

    /* renamed from: y */
    public boolean mo18936y() {
        return !mo18913E() && this.f4438r.f6017c.mo19513a();
    }

    /* renamed from: z */
    public final long mo18937z(C3014u.C3015a aVar, long j) {
        long b = C2627d.m5058b(j);
        this.f4438r.f6015a.mo18053h(aVar.f5277a, this.f4428h);
        return b + this.f4428h.mo18074k();
    }
}
