package p040c.p077d.p078a.p081k.p091l.p096g;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;
import p040c.p077d.p078a.C1546g;
import p040c.p077d.p078a.p080j.C1559a;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1657j;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p101o.C1912f;
import p040c.p077d.p078a.p101o.p102j.C1923f;
import p040c.p077d.p078a.p101o.p103k.C1931b;
import p040c.p077d.p078a.p104p.C1936c;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.g.f */
/* compiled from: GifFrameLoader */
public class C1858f {

    /* renamed from: a */
    public final C1559a f1447a;

    /* renamed from: b */
    public final Handler f1448b;

    /* renamed from: c */
    public final List<C1860b> f1449c;

    /* renamed from: d */
    public final C1546g f1450d;

    /* renamed from: e */
    public final C1697e f1451e;

    /* renamed from: f */
    public boolean f1452f;

    /* renamed from: g */
    public boolean f1453g;

    /* renamed from: h */
    public boolean f1454h;

    /* renamed from: i */
    public C1544f<Bitmap> f1455i;

    /* renamed from: j */
    public C1859a f1456j;

    /* renamed from: k */
    public boolean f1457k;

    /* renamed from: l */
    public C1859a f1458l;

    /* renamed from: m */
    public Bitmap f1459m;

    /* renamed from: n */
    public C1859a f1460n;
    @Nullable

    /* renamed from: o */
    public C1862d f1461o;

    @VisibleForTesting
    /* renamed from: c.d.a.k.l.g.f$a */
    /* compiled from: GifFrameLoader */
    public static class C1859a extends C1923f<Bitmap> {

        /* renamed from: d */
        public final Handler f1462d;

        /* renamed from: e */
        public final int f1463e;

        /* renamed from: f */
        public final long f1464f;

        /* renamed from: g */
        public Bitmap f1465g;

        public C1859a(Handler handler, int i, long j) {
            this.f1462d = handler;
            this.f1463e = i;
            this.f1464f = j;
        }

        /* renamed from: i */
        public Bitmap mo16180i() {
            return this.f1465g;
        }

        /* renamed from: j */
        public void mo16179b(@NonNull Bitmap bitmap, @Nullable C1931b<? super Bitmap> bVar) {
            this.f1465g = bitmap;
            this.f1462d.sendMessageAtTime(this.f1462d.obtainMessage(1, this), this.f1464f);
        }
    }

    /* renamed from: c.d.a.k.l.g.f$b */
    /* compiled from: GifFrameLoader */
    public interface C1860b {
        /* renamed from: a */
        void mo16182a();
    }

    /* renamed from: c.d.a.k.l.g.f$c */
    /* compiled from: GifFrameLoader */
    public class C1861c implements Handler.Callback {
        public C1861c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C1858f.this.mo16171n((C1859a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C1858f.this.f1450d.mo15502l((C1859a) message.obj);
                return false;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.l.g.f$d */
    /* compiled from: GifFrameLoader */
    public interface C1862d {
        /* renamed from: a */
        void mo16184a();
    }

    public C1858f(C1541c cVar, C1559a aVar, int i, int i2, C1574h<Bitmap> hVar, Bitmap bitmap) {
        this(cVar.mo15451g(), C1541c.m1099u(cVar.mo15453i()), aVar, (Handler) null, m2196j(C1541c.m1099u(cVar.mo15453i()), i, i2), hVar, bitmap);
    }

    /* renamed from: g */
    public static C1567c m2195g() {
        return new C1936c(Double.valueOf(Math.random()));
    }

    /* renamed from: j */
    public static C1544f<Bitmap> m2196j(C1546g gVar, int i, int i2) {
        return gVar.mo15500j().mo15488a(((C1912f) ((C1912f) C1912f.m2416u0(C1657j.f1108b).mo16314r0(true)).mo16305m0(true)).mo16283b0(i, i2));
    }

    /* renamed from: a */
    public void mo16160a() {
        this.f1449c.clear();
        mo16172o();
        mo16175r();
        C1859a aVar = this.f1456j;
        if (aVar != null) {
            this.f1450d.mo15502l(aVar);
            this.f1456j = null;
        }
        C1859a aVar2 = this.f1458l;
        if (aVar2 != null) {
            this.f1450d.mo15502l(aVar2);
            this.f1458l = null;
        }
        C1859a aVar3 = this.f1460n;
        if (aVar3 != null) {
            this.f1450d.mo15502l(aVar3);
            this.f1460n = null;
        }
        this.f1447a.clear();
        this.f1457k = true;
    }

    /* renamed from: b */
    public ByteBuffer mo16161b() {
        return this.f1447a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap mo16162c() {
        C1859a aVar = this.f1456j;
        return aVar != null ? aVar.mo16180i() : this.f1459m;
    }

    /* renamed from: d */
    public int mo16163d() {
        C1859a aVar = this.f1456j;
        if (aVar != null) {
            return aVar.f1463e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap mo16164e() {
        return this.f1459m;
    }

    /* renamed from: f */
    public int mo16165f() {
        return this.f1447a.mo15559c();
    }

    /* renamed from: h */
    public final int mo16166h() {
        return C1950j.m2570f(mo16162c().getWidth(), mo16162c().getHeight(), mo16162c().getConfig());
    }

    /* renamed from: i */
    public int mo16167i() {
        return mo16162c().getHeight();
    }

    /* renamed from: k */
    public int mo16168k() {
        return this.f1447a.mo15566h() + mo16166h();
    }

    /* renamed from: l */
    public int mo16169l() {
        return mo16162c().getWidth();
    }

    /* renamed from: m */
    public final void mo16170m() {
        if (this.f1452f && !this.f1453g) {
            if (this.f1454h) {
                C1949i.m2560a(this.f1460n == null, "Pending target must be null when starting from the first frame");
                this.f1447a.mo15563f();
                this.f1454h = false;
            }
            C1859a aVar = this.f1460n;
            if (aVar != null) {
                this.f1460n = null;
                mo16171n(aVar);
                return;
            }
            this.f1453g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f1447a.mo15561d());
            this.f1447a.mo15558b();
            this.f1458l = new C1859a(this.f1448b, this.f1447a.mo15564g(), uptimeMillis);
            C1544f<Bitmap> t0 = this.f1455i.mo15488a(C1912f.m2417v0(m2195g()));
            t0.mo15483I0(this.f1447a);
            t0.mo15475A0(this.f1458l);
        }
    }

    @VisibleForTesting
    /* renamed from: n */
    public void mo16171n(C1859a aVar) {
        C1862d dVar = this.f1461o;
        if (dVar != null) {
            dVar.mo16184a();
        }
        this.f1453g = false;
        if (this.f1457k) {
            this.f1448b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f1452f) {
            this.f1460n = aVar;
        } else {
            if (aVar.mo16180i() != null) {
                mo16172o();
                C1859a aVar2 = this.f1456j;
                this.f1456j = aVar;
                for (int size = this.f1449c.size() - 1; size >= 0; size--) {
                    this.f1449c.get(size).mo16182a();
                }
                if (aVar2 != null) {
                    this.f1448b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo16170m();
        }
    }

    /* renamed from: o */
    public final void mo16172o() {
        Bitmap bitmap = this.f1459m;
        if (bitmap != null) {
            this.f1451e.mo15922c(bitmap);
            this.f1459m = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, c.d.a.k.h, c.d.a.k.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16173p(p040c.p077d.p078a.p081k.C1574h<android.graphics.Bitmap> r2, android.graphics.Bitmap r3) {
        /*
            r1 = this;
            p040c.p077d.p078a.p105q.C1949i.m2563d(r2)
            r0 = r2
            c.d.a.k.h r0 = (p040c.p077d.p078a.p081k.C1574h) r0
            p040c.p077d.p078a.p105q.C1949i.m2563d(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r1.f1459m = r3
            c.d.a.f<android.graphics.Bitmap> r3 = r1.f1455i
            c.d.a.o.f r0 = new c.d.a.o.f
            r0.<init>()
            c.d.a.o.a r2 = r0.mo16307n0(r2)
            c.d.a.f r2 = r3.mo15488a(r2)
            r1.f1455i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p091l.p096g.C1858f.mo16173p(c.d.a.k.h, android.graphics.Bitmap):void");
    }

    /* renamed from: q */
    public final void mo16174q() {
        if (!this.f1452f) {
            this.f1452f = true;
            this.f1457k = false;
            mo16170m();
        }
    }

    /* renamed from: r */
    public final void mo16175r() {
        this.f1452f = false;
    }

    /* renamed from: s */
    public void mo16176s(C1860b bVar) {
        if (this.f1457k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f1449c.contains(bVar)) {
            boolean isEmpty = this.f1449c.isEmpty();
            this.f1449c.add(bVar);
            if (isEmpty) {
                mo16174q();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    @VisibleForTesting
    public void setOnEveryFrameReadyListener(@Nullable C1862d dVar) {
        this.f1461o = dVar;
    }

    /* renamed from: t */
    public void mo16178t(C1860b bVar) {
        this.f1449c.remove(bVar);
        if (this.f1449c.isEmpty()) {
            mo16175r();
        }
    }

    public C1858f(C1697e eVar, C1546g gVar, C1559a aVar, Handler handler, C1544f<Bitmap> fVar, C1574h<Bitmap> hVar, Bitmap bitmap) {
        this.f1449c = new ArrayList();
        this.f1450d = gVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C1861c()) : handler;
        this.f1451e = eVar;
        this.f1448b = handler;
        this.f1455i = fVar;
        this.f1447a = aVar;
        mo16173p(hVar, bitmap);
    }
}
