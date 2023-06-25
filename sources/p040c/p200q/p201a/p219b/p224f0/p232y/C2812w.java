package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.support.p025v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import p040c.p200q.p201a.p219b.p224f0.C2661a;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.w */
/* compiled from: PsExtractor */
public final class C2812w implements C2674g {

    /* renamed from: a */
    public final C3146b0 f4339a;

    /* renamed from: b */
    public final SparseArray<C2813a> f4340b;

    /* renamed from: c */
    public final C3173t f4341c;

    /* renamed from: d */
    public final C2811v f4342d;

    /* renamed from: e */
    public boolean f4343e;

    /* renamed from: f */
    public boolean f4344f;

    /* renamed from: g */
    public boolean f4345g;

    /* renamed from: h */
    public long f4346h;

    /* renamed from: i */
    public C2808u f4347i;

    /* renamed from: j */
    public C2676i f4348j;

    /* renamed from: k */
    public boolean f4349k;

    /* renamed from: c.q.a.b.f0.y.w$a */
    /* compiled from: PsExtractor */
    public static final class C2813a {

        /* renamed from: a */
        public final C2794l f4350a;

        /* renamed from: b */
        public final C3146b0 f4351b;

        /* renamed from: c */
        public final C3172s f4352c = new C3172s(new byte[64]);

        /* renamed from: d */
        public boolean f4353d;

        /* renamed from: e */
        public boolean f4354e;

        /* renamed from: f */
        public boolean f4355f;

        /* renamed from: g */
        public int f4356g;

        /* renamed from: h */
        public long f4357h;

        public C2813a(C2794l lVar, C3146b0 b0Var) {
            this.f4350a = lVar;
            this.f4351b = b0Var;
        }

        /* renamed from: a */
        public void mo18861a(C3173t tVar) {
            tVar.mo20015h(this.f4352c.f5873a, 0, 3);
            this.f4352c.mo19991n(0);
            mo18862b();
            tVar.mo20015h(this.f4352c.f5873a, 0, this.f4356g);
            this.f4352c.mo19991n(0);
            mo18863c();
            this.f4350a.mo18770f(this.f4357h, 4);
            this.f4350a.mo18766b(tVar);
            this.f4350a.mo18768d();
        }

        /* renamed from: b */
        public final void mo18862b() {
            this.f4352c.mo19993p(8);
            this.f4353d = this.f4352c.mo19984g();
            this.f4354e = this.f4352c.mo19984g();
            this.f4352c.mo19993p(6);
            this.f4356g = this.f4352c.mo19985h(8);
        }

        /* renamed from: c */
        public final void mo18863c() {
            this.f4357h = 0;
            if (this.f4353d) {
                this.f4352c.mo19993p(4);
                this.f4352c.mo19993p(1);
                this.f4352c.mo19993p(1);
                long h = (((long) this.f4352c.mo19985h(3)) << 30) | ((long) (this.f4352c.mo19985h(15) << 15)) | ((long) this.f4352c.mo19985h(15));
                this.f4352c.mo19993p(1);
                if (!this.f4355f && this.f4354e) {
                    this.f4352c.mo19993p(4);
                    this.f4352c.mo19993p(1);
                    this.f4352c.mo19993p(1);
                    this.f4352c.mo19993p(1);
                    this.f4351b.mo19944b((((long) this.f4352c.mo19985h(3)) << 30) | ((long) (this.f4352c.mo19985h(15) << 15)) | ((long) this.f4352c.mo19985h(15)));
                    this.f4355f = true;
                }
                this.f4357h = this.f4351b.mo19944b(h);
            }
        }

        /* renamed from: d */
        public void mo18864d() {
            this.f4355f = false;
            this.f4350a.mo18767c();
        }
    }

    static {
        C2774c cVar = C2774c.f4053a;
    }

    public C2812w() {
        this(new C3146b0(0));
    }

    /* renamed from: a */
    public static /* synthetic */ C2674g[] m5957a() {
        return new C2674g[]{new C2812w()};
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        byte[] bArr = new byte[14];
        hVar.mo18531i(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.mo18525d(bArr[13] & 7);
        hVar.mo18531i(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo18860c(long j) {
        if (!this.f4349k) {
            this.f4349k = true;
            if (this.f4342d.mo18851c() != -9223372036854775807L) {
                C2808u uVar = new C2808u(this.f4342d.mo18852d(), this.f4342d.mo18851c(), j);
                this.f4347i = uVar;
                this.f4348j.mo18553c(uVar.mo18495b());
                return;
            }
            this.f4348j.mo18553c(new C2682o.C2684b(this.f4342d.mo18851c()));
        }
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        long e = hVar.mo18526e();
        int i = (e > -1 ? 1 : (e == -1 ? 0 : -1));
        if ((i != 0) && !this.f4342d.mo18853e()) {
            return this.f4342d.mo18855g(hVar, nVar);
        }
        mo18860c(e);
        C2808u uVar = this.f4347i;
        C2794l lVar = null;
        if (uVar != null && uVar.mo18497d()) {
            return this.f4347i.mo18496c(hVar, nVar, (C2661a.C2664c) null);
        }
        hVar.mo18527f();
        long c = i != 0 ? e - hVar.mo18524c() : -1;
        if ((c != -1 && c < 4) || !hVar.mo18523b(this.f4341c.f5877a, 0, 4, true)) {
            return -1;
        }
        this.f4341c.mo20006L(0);
        int j = this.f4341c.mo20017j();
        if (j == 441) {
            return -1;
        }
        if (j == 442) {
            hVar.mo18531i(this.f4341c.f5877a, 0, 10);
            this.f4341c.mo20006L(9);
            hVar.mo18528g((this.f4341c.mo20032y() & 7) + 14);
            return 0;
        } else if (j == 443) {
            hVar.mo18531i(this.f4341c.f5877a, 0, 2);
            this.f4341c.mo20006L(0);
            hVar.mo18528g(this.f4341c.mo19999E() + 6);
            return 0;
        } else if (((j & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            hVar.mo18528g(1);
            return 0;
        } else {
            int i2 = j & 255;
            C2813a aVar = this.f4340b.get(i2);
            if (!this.f4343e) {
                if (aVar == null) {
                    if (i2 == 189) {
                        lVar = new C2786f();
                        this.f4344f = true;
                        this.f4346h = hVar.getPosition();
                    } else if ((i2 & 224) == 192) {
                        lVar = new C2805r();
                        this.f4344f = true;
                        this.f4346h = hVar.getPosition();
                    } else if ((i2 & 240) == 224) {
                        lVar = new C2795m();
                        this.f4345g = true;
                        this.f4346h = hVar.getPosition();
                    }
                    if (lVar != null) {
                        lVar.mo18769e(this.f4348j, new C2781e0.C2785d(i2, 256));
                        aVar = new C2813a(lVar, this.f4339a);
                        this.f4340b.put(i2, aVar);
                    }
                }
                if (hVar.getPosition() > ((!this.f4344f || !this.f4345g) ? PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED : this.f4346h + PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
                    this.f4343e = true;
                    this.f4348j.mo18554o();
                }
            }
            hVar.mo18531i(this.f4341c.f5877a, 0, 2);
            this.f4341c.mo20006L(0);
            int E = this.f4341c.mo19999E() + 6;
            if (aVar == null) {
                hVar.mo18528g(E);
            } else {
                this.f4341c.mo20002H(E);
                hVar.readFully(this.f4341c.f5877a, 0, E);
                this.f4341c.mo20006L(6);
                aVar.mo18861a(this.f4341c);
                C3173t tVar = this.f4341c;
                tVar.mo20005K(tVar.mo20009b());
            }
            return 0;
        }
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f4348j = iVar;
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        if ((this.f4339a.mo19947e() == -9223372036854775807L) || !(this.f4339a.mo19945c() == 0 || this.f4339a.mo19945c() == j2)) {
            this.f4339a.mo19948g();
            this.f4339a.mo19949h(j2);
        }
        C2808u uVar = this.f4347i;
        if (uVar != null) {
            uVar.mo18501h(j2);
        }
        for (int i = 0; i < this.f4340b.size(); i++) {
            this.f4340b.valueAt(i).mo18864d();
        }
    }

    public void release() {
    }

    public C2812w(C3146b0 b0Var) {
        this.f4339a = b0Var;
        this.f4341c = new C3173t(4096);
        this.f4340b = new SparseArray<>();
        this.f4342d = new C2811v();
    }
}
