package p040c.p200q.p201a.p219b.p241k0.p244d0;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p235h0.C2831c;
import p040c.p200q.p201a.p219b.p235h0.p236f.C2834a;
import p040c.p200q.p201a.p219b.p241k0.C3024x;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2872d;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2918b;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.k0.d0.j */
/* compiled from: PlayerEmsgHandler */
public final class C2913j implements Handler.Callback {

    /* renamed from: e */
    public final C3117d f4746e;

    /* renamed from: l */
    public final C2915b f4747l;

    /* renamed from: m */
    public final C2834a f4748m = new C2834a();

    /* renamed from: n */
    public final Handler f4749n = C3152e0.m7817q(this);

    /* renamed from: o */
    public final TreeMap<Long, Long> f4750o = new TreeMap<>();

    /* renamed from: p */
    public C2918b f4751p;

    /* renamed from: q */
    public long f4752q;

    /* renamed from: r */
    public long f4753r = -9223372036854775807L;

    /* renamed from: s */
    public long f4754s = -9223372036854775807L;

    /* renamed from: t */
    public boolean f4755t;

    /* renamed from: u */
    public boolean f4756u;

    /* renamed from: c.q.a.b.k0.d0.j$a */
    /* compiled from: PlayerEmsgHandler */
    public static final class C2914a {

        /* renamed from: a */
        public final long f4757a;

        /* renamed from: b */
        public final long f4758b;

        public C2914a(long j, long j2) {
            this.f4757a = j;
            this.f4758b = j2;
        }
    }

    /* renamed from: c.q.a.b.k0.d0.j$b */
    /* compiled from: PlayerEmsgHandler */
    public interface C2915b {
        /* renamed from: a */
        void mo19175a();

        /* renamed from: b */
        void mo19176b(long j);
    }

    /* renamed from: c.q.a.b.k0.d0.j$c */
    /* compiled from: PlayerEmsgHandler */
    public final class C2916c implements C2686q {

        /* renamed from: a */
        public final C3024x f4759a;

        /* renamed from: b */
        public final C3030l f4760b = new C3030l();

        /* renamed from: c */
        public final C2831c f4761c = new C2831c();

        public C2916c(C3024x xVar) {
            this.f4759a = xVar;
        }

        /* renamed from: a */
        public int mo18543a(C2675h hVar, int i, boolean z) {
            return this.f4759a.mo18543a(hVar, i, z);
        }

        /* renamed from: b */
        public void mo18544b(C3173t tVar, int i) {
            this.f4759a.mo18544b(tVar, i);
        }

        /* renamed from: c */
        public void mo18545c(long j, int i, int i2, int i3, @Nullable C2686q.C2687a aVar) {
            this.f4759a.mo18545c(j, i, i2, i3, aVar);
            mo19232j();
        }

        /* renamed from: d */
        public void mo18546d(Format format) {
            this.f4759a.mo18546d(format);
        }

        @Nullable
        /* renamed from: e */
        public final C2831c mo19227e() {
            this.f4761c.mo18386i();
            if (this.f4759a.mo19607z(this.f4760b, this.f4761c, false, false, 0) != -4) {
                return null;
            }
            this.f4761c.mo18406u();
            return this.f4761c;
        }

        /* renamed from: f */
        public boolean mo19228f(long j) {
            return C2913j.this.mo19219i(j);
        }

        /* renamed from: g */
        public boolean mo19229g(C2872d dVar) {
            return C2913j.this.mo19220j(dVar);
        }

        /* renamed from: h */
        public void mo19230h(C2872d dVar) {
            C2913j.this.mo19223m(dVar);
        }

        /* renamed from: i */
        public final void mo19231i(long j, long j2) {
            C2913j.this.f4749n.sendMessage(C2913j.this.f4749n.obtainMessage(1, new C2914a(j, j2)));
        }

        /* renamed from: j */
        public final void mo19232j() {
            while (this.f4759a.mo19602u()) {
                C2831c e = mo19227e();
                if (e != null) {
                    long j = e.f3308n;
                    EventMessage eventMessage = (EventMessage) C2913j.this.f4748m.mo18898a(e).mo24052a(0);
                    if (C2913j.m6479g(eventMessage.f7732e, eventMessage.f7733l)) {
                        mo19233k(j, eventMessage);
                    }
                }
            }
            this.f4759a.mo19594l();
        }

        /* renamed from: k */
        public final void mo19233k(long j, EventMessage eventMessage) {
            long b = C2913j.m6478e(eventMessage);
            if (b != -9223372036854775807L) {
                mo19231i(j, b);
            }
        }

        /* renamed from: l */
        public void mo19234l() {
            this.f4759a.mo19579D();
        }
    }

    public C2913j(C2918b bVar, C2915b bVar2, C3117d dVar) {
        this.f4751p = bVar;
        this.f4747l = bVar2;
        this.f4746e = dVar;
    }

    /* renamed from: e */
    public static long m6478e(EventMessage eventMessage) {
        try {
            return C3152e0.m7784X(C3152e0.m7820t(eventMessage.f7736o));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: g */
    public static boolean m6479g(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    @Nullable
    /* renamed from: d */
    public final Map.Entry<Long, Long> mo19215d(long j) {
        return this.f4750o.ceilingEntry(Long.valueOf(j));
    }

    /* renamed from: f */
    public final void mo19216f(long j, long j2) {
        Long l = this.f4750o.get(Long.valueOf(j2));
        if (l == null) {
            this.f4750o.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f4750o.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* renamed from: h */
    public final void mo19217h() {
        long j = this.f4754s;
        if (j == -9223372036854775807L || j != this.f4753r) {
            this.f4755t = true;
            this.f4754s = this.f4753r;
            this.f4747l.mo19175a();
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f4756u) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C2914a aVar = (C2914a) message.obj;
        mo19216f(aVar.f4757a, aVar.f4758b);
        return true;
    }

    /* renamed from: i */
    public boolean mo19219i(long j) {
        C2918b bVar = this.f4751p;
        boolean z = false;
        if (!bVar.f4771d) {
            return false;
        }
        if (this.f4755t) {
            return true;
        }
        Map.Entry<Long, Long> d = mo19215d(bVar.f4775h);
        if (d != null && d.getValue().longValue() < j) {
            this.f4752q = d.getKey().longValue();
            mo19222l();
            z = true;
        }
        if (z) {
            mo19217h();
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo19220j(C2872d dVar) {
        if (!this.f4751p.f4771d) {
            return false;
        }
        if (this.f4755t) {
            return true;
        }
        long j = this.f4753r;
        if (!(j != -9223372036854775807L && j < dVar.f4558f)) {
            return false;
        }
        mo19217h();
        return true;
    }

    /* renamed from: k */
    public C2916c mo19221k() {
        return new C2916c(new C3024x(this.f4746e));
    }

    /* renamed from: l */
    public final void mo19222l() {
        this.f4747l.mo19176b(this.f4752q);
    }

    /* renamed from: m */
    public void mo19223m(C2872d dVar) {
        long j = this.f4753r;
        if (j != -9223372036854775807L || dVar.f4559g > j) {
            this.f4753r = dVar.f4559g;
        }
    }

    /* renamed from: n */
    public void mo19224n() {
        this.f4756u = true;
        this.f4749n.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: o */
    public final void mo19225o() {
        Iterator<Map.Entry<Long, Long>> it = this.f4750o.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.f4751p.f4775h) {
                it.remove();
            }
        }
    }

    /* renamed from: p */
    public void mo19226p(C2918b bVar) {
        this.f4755t = false;
        this.f4752q = -9223372036854775807L;
        this.f4751p = bVar;
        mo19225o();
    }
}
