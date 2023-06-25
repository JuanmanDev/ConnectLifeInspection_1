package p040c.p200q.p201a.p219b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p040c.p200q.p201a.p219b.C3207s;
import p040c.p200q.p201a.p219b.p220b0.C2583a;
import p040c.p200q.p201a.p219b.p221c0.C2599h;
import p040c.p200q.p201a.p219b.p221c0.C2603j;
import p040c.p200q.p201a.p219b.p221c0.C2607k;
import p040c.p200q.p201a.p219b.p221c0.C2608l;
import p040c.p200q.p201a.p219b.p222d0.C2633d;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2656m;
import p040c.p200q.p201a.p219b.p235h0.C2832d;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3040i;
import p040c.p200q.p201a.p219b.p259m0.C3110g;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3153f;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p262p0.C3200m;
import p040c.p200q.p201a.p219b.p262p0.C3201n;

@TargetApi(16)
/* renamed from: c.q.a.b.z */
/* compiled from: SimpleExoPlayer */
public class C3217z extends C2582b implements C3207s {

    /* renamed from: A */
    public float f6052A;
    @Nullable

    /* renamed from: B */
    public C3014u f6053B;

    /* renamed from: C */
    public List<C3031a> f6054C;

    /* renamed from: D */
    public boolean f6055D;

    /* renamed from: b */
    public final C3212u[] f6056b;

    /* renamed from: c */
    public final C2841i f6057c;

    /* renamed from: d */
    public final Handler f6058d;

    /* renamed from: e */
    public final C3219b f6059e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<C3200m> f6060f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<C2607k> f6061g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<C3040i> f6062h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C2832d> f6063i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C3201n> f6064j;

    /* renamed from: k */
    public final CopyOnWriteArraySet<C2608l> f6065k;

    /* renamed from: l */
    public final C3118e f6066l;

    /* renamed from: m */
    public final C2583a f6067m;

    /* renamed from: n */
    public final C2603j f6068n;
    @Nullable

    /* renamed from: o */
    public Format f6069o;
    @Nullable

    /* renamed from: p */
    public Format f6070p;
    @Nullable

    /* renamed from: q */
    public Surface f6071q;

    /* renamed from: r */
    public boolean f6072r;
    @Nullable

    /* renamed from: s */
    public SurfaceHolder f6073s;
    @Nullable

    /* renamed from: t */
    public TextureView f6074t;

    /* renamed from: u */
    public int f6075u;

    /* renamed from: v */
    public int f6076v;
    @Nullable

    /* renamed from: w */
    public C2633d f6077w;
    @Nullable

    /* renamed from: x */
    public C2633d f6078x;

    /* renamed from: y */
    public int f6079y;

    /* renamed from: z */
    public C2599h f6080z;

    /* renamed from: c.q.a.b.z$b */
    /* compiled from: SimpleExoPlayer */
    public final class C3219b implements C3201n, C2608l, C3040i, C2832d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C2603j.C2606c {
        public C3219b() {
        }

        /* renamed from: D */
        public void mo18090D(Format format) {
            Format unused = C3217z.this.f6069o = format;
            Iterator it = C3217z.this.f6064j.iterator();
            while (it.hasNext()) {
                ((C3201n) it.next()).mo18090D(format);
            }
        }

        /* renamed from: E */
        public void mo18091E(C2633d dVar) {
            C2633d unused = C3217z.this.f6077w = dVar;
            Iterator it = C3217z.this.f6064j.iterator();
            while (it.hasNext()) {
                ((C3201n) it.next()).mo18091E(dVar);
            }
        }

        /* renamed from: G */
        public void mo18093G(Format format) {
            Format unused = C3217z.this.f6070p = format;
            Iterator it = C3217z.this.f6065k.iterator();
            while (it.hasNext()) {
                ((C2608l) it.next()).mo18093G(format);
            }
        }

        /* renamed from: I */
        public void mo18095I(int i, long j, long j2) {
            Iterator it = C3217z.this.f6065k.iterator();
            while (it.hasNext()) {
                ((C2608l) it.next()).mo18095I(i, j, j2);
            }
        }

        /* renamed from: K */
        public void mo18097K(C2633d dVar) {
            Iterator it = C3217z.this.f6064j.iterator();
            while (it.hasNext()) {
                ((C3201n) it.next()).mo18097K(dVar);
            }
            Format unused = C3217z.this.f6069o = null;
            C2633d unused2 = C3217z.this.f6077w = null;
        }

        /* renamed from: a */
        public void mo18111a(int i) {
            if (C3217z.this.f6079y != i) {
                int unused = C3217z.this.f6079y = i;
                Iterator it = C3217z.this.f6061g.iterator();
                while (it.hasNext()) {
                    C2607k kVar = (C2607k) it.next();
                    if (!C3217z.this.f6065k.contains(kVar)) {
                        kVar.mo18111a(i);
                    }
                }
                Iterator it2 = C3217z.this.f6065k.iterator();
                while (it2.hasNext()) {
                    ((C2608l) it2.next()).mo18111a(i);
                }
            }
        }

        /* renamed from: b */
        public void mo18112b(int i, int i2, int i3, float f) {
            Iterator it = C3217z.this.f6060f.iterator();
            while (it.hasNext()) {
                C3200m mVar = (C3200m) it.next();
                if (!C3217z.this.f6064j.contains(mVar)) {
                    mVar.mo18112b(i, i2, i3, f);
                }
            }
            Iterator it2 = C3217z.this.f6064j.iterator();
            while (it2.hasNext()) {
                ((C3201n) it2.next()).mo18112b(i, i2, i3, f);
            }
        }

        /* renamed from: c */
        public void mo18255c(float f) {
            C3217z.this.mo20201R();
        }

        /* renamed from: d */
        public void mo18256d(int i) {
            C3217z zVar = C3217z.this;
            zVar.mo20210a0(zVar.mo20193J(), i);
        }

        /* renamed from: e */
        public void mo19625e(List<C3031a> list) {
            List unused = C3217z.this.f6054C = list;
            Iterator it = C3217z.this.f6062h.iterator();
            while (it.hasNext()) {
                ((C3040i) it.next()).mo19625e(list);
            }
        }

        /* renamed from: f */
        public void mo18116f(C2633d dVar) {
            Iterator it = C3217z.this.f6065k.iterator();
            while (it.hasNext()) {
                ((C2608l) it.next()).mo18116f(dVar);
            }
            Format unused = C3217z.this.f6070p = null;
            C2633d unused2 = C3217z.this.f6078x = null;
            int unused3 = C3217z.this.f6079y = 0;
        }

        /* renamed from: g */
        public void mo18117g(C2633d dVar) {
            C2633d unused = C3217z.this.f6078x = dVar;
            Iterator it = C3217z.this.f6065k.iterator();
            while (it.hasNext()) {
                ((C2608l) it.next()).mo18117g(dVar);
            }
        }

        /* renamed from: h */
        public void mo18118h(String str, long j, long j2) {
            Iterator it = C3217z.this.f6064j.iterator();
            while (it.hasNext()) {
                ((C3201n) it.next()).mo18118h(str, j, j2);
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C3217z.this.mo20208Y(new Surface(surfaceTexture), true);
            C3217z.this.mo20196M(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C3217z.this.mo20208Y((Surface) null, true);
            C3217z.this.mo20196M(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C3217z.this.mo20196M(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* renamed from: q */
        public void mo18128q(Surface surface) {
            if (C3217z.this.f6071q == surface) {
                Iterator it = C3217z.this.f6060f.iterator();
                while (it.hasNext()) {
                    ((C3200m) it.next()).mo18089C();
                }
            }
            Iterator it2 = C3217z.this.f6064j.iterator();
            while (it2.hasNext()) {
                ((C3201n) it2.next()).mo18128q(surface);
            }
        }

        /* renamed from: s */
        public void mo18130s(String str, long j, long j2) {
            Iterator it = C3217z.this.f6065k.iterator();
            while (it.hasNext()) {
                ((C2608l) it.next()).mo18130s(str, j, j2);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C3217z.this.mo20196M(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C3217z.this.mo20208Y(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C3217z.this.mo20208Y((Surface) null, false);
            C3217z.this.mo20196M(0, 0);
        }

        /* renamed from: t */
        public void mo18131t(Metadata metadata) {
            Iterator it = C3217z.this.f6063i.iterator();
            while (it.hasNext()) {
                ((C2832d) it.next()).mo18131t(metadata);
            }
        }

        /* renamed from: v */
        public void mo18133v(int i, long j) {
            Iterator it = C3217z.this.f6064j.iterator();
            while (it.hasNext()) {
                ((C3201n) it.next()).mo18133v(i, j);
            }
        }
    }

    public C3217z(Context context, C3215x xVar, C3110g gVar, C3098m mVar, @Nullable C2650i<C2656m> iVar, C3118e eVar, C2583a.C2584a aVar, Looper looper) {
        this(context, xVar, gVar, mVar, iVar, eVar, aVar, C3153f.f5828a, looper);
    }

    /* renamed from: E */
    public void mo20188E(C3207s.C3208a aVar) {
        mo20211b0();
        this.f6057c.mo18924m(aVar);
    }

    /* renamed from: F */
    public void mo20189F(C2832d dVar) {
        this.f6063i.add(dVar);
    }

    /* renamed from: G */
    public Looper mo20190G() {
        return this.f6057c.mo18926o();
    }

    /* renamed from: H */
    public long mo20191H() {
        mo20211b0();
        return this.f6057c.mo18927p();
    }

    /* renamed from: I */
    public long mo20192I() {
        mo20211b0();
        return this.f6057c.mo18930s();
    }

    /* renamed from: J */
    public boolean mo20193J() {
        mo20211b0();
        return this.f6057c.mo18931t();
    }

    /* renamed from: K */
    public int mo20194K() {
        mo20211b0();
        return this.f6057c.mo18932u();
    }

    @Nullable
    /* renamed from: L */
    public Format mo20195L() {
        return this.f6069o;
    }

    /* renamed from: M */
    public final void mo20196M(int i, int i2) {
        if (i != this.f6075u || i2 != this.f6076v) {
            this.f6075u = i;
            this.f6076v = i2;
            Iterator<C3200m> it = this.f6060f.iterator();
            while (it.hasNext()) {
                it.next().mo18098L(i, i2);
            }
        }
    }

    /* renamed from: N */
    public void mo20197N(C3014u uVar) {
        mo20198O(uVar, true, true);
    }

    /* renamed from: O */
    public void mo20198O(C3014u uVar, boolean z, boolean z2) {
        mo20211b0();
        C3014u uVar2 = this.f6053B;
        if (uVar2 != null) {
            uVar2.mo19475e(this.f6067m);
            this.f6067m.mo18110X();
        }
        this.f6053B = uVar;
        uVar.mo19474d(this.f6058d, this.f6067m);
        mo20210a0(mo20193J(), this.f6068n.mo18246o(mo20193J()));
        this.f6057c.mo18909A(uVar, z, z2);
    }

    /* renamed from: P */
    public void mo20199P() {
        this.f6068n.mo18248q();
        this.f6057c.mo18910B();
        mo20200Q();
        Surface surface = this.f6071q;
        if (surface != null) {
            if (this.f6072r) {
                surface.release();
            }
            this.f6071q = null;
        }
        C3014u uVar = this.f6053B;
        if (uVar != null) {
            uVar.mo19475e(this.f6067m);
            this.f6053B = null;
        }
        this.f6066l.mo19877d(this.f6067m);
        Collections.emptyList();
    }

    /* renamed from: Q */
    public final void mo20200Q() {
        TextureView textureView = this.f6074t;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f6059e) {
                C3163m.m7880f("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f6074t.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f6074t = null;
        }
        SurfaceHolder surfaceHolder = this.f6073s;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f6059e);
            this.f6073s = null;
        }
    }

    /* renamed from: R */
    public final void mo20201R() {
        float m = this.f6052A * this.f6068n.mo18244m();
        for (C3212u uVar : this.f6056b) {
            if (uVar.mo18204h() == 1) {
                C3209t n = this.f6057c.mo18925n(uVar);
                n.mo20182n(2);
                n.mo20181m(Float.valueOf(m));
                n.mo20180l();
            }
        }
    }

    /* renamed from: S */
    public void mo20202S(C2599h hVar) {
        mo20203T(hVar, false);
    }

    /* renamed from: T */
    public void mo20203T(C2599h hVar, boolean z) {
        mo20211b0();
        if (!C3152e0.m7789b(this.f6080z, hVar)) {
            this.f6080z = hVar;
            for (C3212u uVar : this.f6056b) {
                if (uVar.mo18204h() == 1) {
                    C3209t n = this.f6057c.mo18925n(uVar);
                    n.mo20182n(3);
                    n.mo20181m(hVar);
                    n.mo20180l();
                }
            }
            Iterator<C2607k> it = this.f6061g.iterator();
            while (it.hasNext()) {
                it.next().mo18137z(hVar);
            }
        }
        C2603j jVar = this.f6068n;
        if (!z) {
            hVar = null;
        }
        mo20210a0(mo20193J(), jVar.mo18252u(hVar, mo20193J(), mo20194K()));
    }

    @Deprecated
    /* renamed from: U */
    public void mo20204U(int i) {
        int x = C3152e0.m7824x(i);
        int v = C3152e0.m7822v(i);
        C2599h.C2601b bVar = new C2599h.C2601b();
        bVar.mo18234c(x);
        bVar.mo18233b(v);
        mo20202S(bVar.mo18232a());
    }

    /* renamed from: V */
    public void mo20205V(boolean z) {
        mo20211b0();
        mo20210a0(z, this.f6068n.mo18247p(z, mo20194K()));
    }

    /* renamed from: W */
    public void mo20206W(int i) {
        mo20211b0();
        this.f6057c.mo18912D(i);
    }

    /* renamed from: X */
    public void mo20207X(@Nullable Surface surface) {
        mo20211b0();
        mo20200Q();
        int i = 0;
        mo20208Y(surface, false);
        if (surface != null) {
            i = -1;
        }
        mo20196M(i, i);
    }

    /* renamed from: Y */
    public final void mo20208Y(@Nullable Surface surface, boolean z) {
        ArrayList<C3209t> arrayList = new ArrayList<>();
        for (C3212u uVar : this.f6056b) {
            if (uVar.mo18204h() == 2) {
                C3209t n = this.f6057c.mo18925n(uVar);
                n.mo20182n(1);
                n.mo20181m(surface);
                n.mo20180l();
                arrayList.add(n);
            }
        }
        Surface surface2 = this.f6071q;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (C3209t a : arrayList) {
                    a.mo20169a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f6072r) {
                this.f6071q.release();
            }
        }
        this.f6071q = surface;
        this.f6072r = z;
    }

    /* renamed from: Z */
    public void mo20209Z(float f) {
        mo20211b0();
        float m = C3152e0.m7811m(f, 0.0f, 1.0f);
        if (this.f6052A != m) {
            this.f6052A = m;
            mo20201R();
            Iterator<C2607k> it = this.f6061g.iterator();
            while (it.hasNext()) {
                it.next().mo18123m(m);
            }
        }
    }

    /* renamed from: a */
    public long mo18915a() {
        mo20211b0();
        return this.f6057c.mo18915a();
    }

    /* renamed from: a0 */
    public final void mo20210a0(boolean z, int i) {
        C2841i iVar = this.f6057c;
        boolean z2 = false;
        boolean z3 = z && i != -1;
        if (i != 1) {
            z2 = true;
        }
        iVar.mo18911C(z3, z2);
    }

    /* renamed from: b */
    public void mo18916b(int i, long j) {
        mo20211b0();
        this.f6067m.mo18109W();
        this.f6057c.mo18916b(i, j);
    }

    /* renamed from: b0 */
    public final void mo20211b0() {
        if (Looper.myLooper() != mo20190G()) {
            C3163m.m7881g("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.f6055D ? null : new IllegalStateException());
            this.f6055D = true;
        }
    }

    /* renamed from: c */
    public void mo18917c(boolean z) {
        mo20211b0();
        this.f6057c.mo18917c(z);
        C3014u uVar = this.f6053B;
        if (uVar != null) {
            uVar.mo19475e(this.f6067m);
            this.f6067m.mo18110X();
            if (z) {
                this.f6053B = null;
            }
        }
        this.f6068n.mo18248q();
        Collections.emptyList();
    }

    /* renamed from: d */
    public int mo18918d() {
        mo20211b0();
        return this.f6057c.mo18918d();
    }

    /* renamed from: e */
    public int mo18919e() {
        mo20211b0();
        return this.f6057c.mo18919e();
    }

    /* renamed from: f */
    public long mo18920f() {
        mo20211b0();
        return this.f6057c.mo18920f();
    }

    /* renamed from: g */
    public int mo18921g() {
        mo20211b0();
        return this.f6057c.mo18921g();
    }

    /* renamed from: h */
    public C2578a0 mo18922h() {
        mo20211b0();
        return this.f6057c.mo18922h();
    }

    /* renamed from: i */
    public long mo18923i() {
        mo20211b0();
        return this.f6057c.mo18923i();
    }

    public C3217z(Context context, C3215x xVar, C3110g gVar, C3098m mVar, @Nullable C2650i<C2656m> iVar, C3118e eVar, C2583a.C2584a aVar, C3153f fVar, Looper looper) {
        C2650i<C2656m> iVar2 = iVar;
        C3118e eVar2 = eVar;
        this.f6066l = eVar2;
        this.f6059e = new C3219b();
        this.f6060f = new CopyOnWriteArraySet<>();
        this.f6061g = new CopyOnWriteArraySet<>();
        this.f6062h = new CopyOnWriteArraySet<>();
        this.f6063i = new CopyOnWriteArraySet<>();
        this.f6064j = new CopyOnWriteArraySet<>();
        this.f6065k = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(looper);
        this.f6058d = handler;
        C3219b bVar = this.f6059e;
        this.f6056b = xVar.mo18876a(handler, bVar, bVar, bVar, bVar, iVar);
        this.f6052A = 1.0f;
        this.f6079y = 0;
        this.f6080z = C2599h.f3109e;
        Collections.emptyList();
        C2841i iVar3 = new C2841i(this.f6056b, gVar, mVar, eVar, fVar, looper);
        this.f6057c = iVar3;
        C2583a a = aVar.mo18138a(iVar3, fVar);
        this.f6067m = a;
        mo20188E(a);
        this.f6064j.add(this.f6067m);
        this.f6060f.add(this.f6067m);
        this.f6065k.add(this.f6067m);
        this.f6061g.add(this.f6067m);
        mo20189F(this.f6067m);
        eVar2.mo19879g(this.f6058d, this.f6067m);
        if (iVar2 instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) iVar2).mo23979h(this.f6058d, this.f6067m);
        }
        Context context2 = context;
        this.f6068n = new C2603j(context, this.f6059e);
    }
}
