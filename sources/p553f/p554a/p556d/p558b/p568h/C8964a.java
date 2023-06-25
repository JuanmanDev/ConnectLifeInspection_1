package p553f.p554a.p556d.p558b.p568h;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import p553f.p554a.C8896b;
import p553f.p554a.p589h.C9177f;
import p630io.flutter.embedding.engine.FlutterJNI;

@TargetApi(16)
/* renamed from: f.a.d.b.h.a */
/* compiled from: FlutterRenderer */
public class C8964a implements C9177f {
    @NonNull

    /* renamed from: e */
    public final FlutterJNI f17571e;
    @NonNull

    /* renamed from: l */
    public final AtomicLong f17572l = new AtomicLong(0);
    @Nullable

    /* renamed from: m */
    public Surface f17573m;

    /* renamed from: n */
    public boolean f17574n = false;
    @NonNull

    /* renamed from: o */
    public final C8969b f17575o;

    /* renamed from: f.a.d.b.h.a$a */
    /* compiled from: FlutterRenderer */
    public class C8965a implements C8969b {
        public C8965a() {
        }

        /* renamed from: a */
        public void mo46342a() {
            boolean unused = C8964a.this.f17574n = false;
        }

        /* renamed from: b */
        public void mo46343b() {
            boolean unused = C8964a.this.f17574n = true;
        }
    }

    /* renamed from: f.a.d.b.h.a$b */
    /* compiled from: FlutterRenderer */
    public final class C8966b implements C9177f.C9178a {

        /* renamed from: a */
        public final long f17577a;
        @NonNull

        /* renamed from: b */
        public final SurfaceTexture f17578b;

        /* renamed from: c */
        public boolean f17579c;

        /* renamed from: d */
        public SurfaceTexture.OnFrameAvailableListener f17580d;

        /* renamed from: f.a.d.b.h.a$b$a */
        /* compiled from: FlutterRenderer */
        public class C8967a implements SurfaceTexture.OnFrameAvailableListener {
            public C8967a() {
            }

            public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
                if (!C8966b.this.f17579c && C8964a.this.f17571e.isAttached()) {
                    C8966b bVar = C8966b.this;
                    C8964a.this.mo46485j(bVar.f17577a);
                }
            }
        }

        public C8966b(long j, @NonNull SurfaceTexture surfaceTexture) {
            C8967a aVar = new C8967a();
            this.f17580d = aVar;
            this.f17577a = j;
            this.f17578b = surfaceTexture;
            if (Build.VERSION.SDK_INT >= 21) {
                surfaceTexture.setOnFrameAvailableListener(aVar, new Handler());
            } else {
                surfaceTexture.setOnFrameAvailableListener(aVar);
            }
        }

        @NonNull
        /* renamed from: a */
        public SurfaceTexture mo46495a() {
            return this.f17578b;
        }

        /* renamed from: id */
        public long mo46496id() {
            return this.f17577a;
        }

        public void release() {
            if (!this.f17579c) {
                C8896b.m24032d("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f17577a + ").");
                this.f17578b.release();
                C8964a.this.mo46494s(this.f17577a);
                this.f17579c = true;
            }
        }
    }

    /* renamed from: f.a.d.b.h.a$c */
    /* compiled from: FlutterRenderer */
    public static final class C8968c {

        /* renamed from: a */
        public float f17583a = 1.0f;

        /* renamed from: b */
        public int f17584b = 0;

        /* renamed from: c */
        public int f17585c = 0;

        /* renamed from: d */
        public int f17586d = 0;

        /* renamed from: e */
        public int f17587e = 0;

        /* renamed from: f */
        public int f17588f = 0;

        /* renamed from: g */
        public int f17589g = 0;

        /* renamed from: h */
        public int f17590h = 0;

        /* renamed from: i */
        public int f17591i = 0;

        /* renamed from: j */
        public int f17592j = 0;

        /* renamed from: k */
        public int f17593k = 0;

        /* renamed from: l */
        public int f17594l = 0;

        /* renamed from: m */
        public int f17595m = 0;

        /* renamed from: n */
        public int f17596n = 0;

        /* renamed from: o */
        public int f17597o = 0;
    }

    public C8964a(@NonNull FlutterJNI flutterJNI) {
        C8965a aVar = new C8965a();
        this.f17575o = aVar;
        this.f17571e = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* renamed from: e */
    public C9177f.C9178a mo46480e() {
        C8896b.m24032d("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        C8966b bVar = new C8966b(this.f17572l.getAndIncrement(), surfaceTexture);
        C8896b.m24032d("FlutterRenderer", "New SurfaceTexture ID: " + bVar.mo46496id());
        mo46486k(bVar.mo46496id(), surfaceTexture);
        return bVar;
    }

    /* renamed from: f */
    public void mo46481f(@NonNull C8969b bVar) {
        this.f17571e.addIsDisplayingFlutterUiListener(bVar);
        if (this.f17574n) {
            bVar.mo46343b();
        }
    }

    /* renamed from: g */
    public void mo46482g(@NonNull ByteBuffer byteBuffer, int i) {
        this.f17571e.dispatchPointerDataPacket(byteBuffer, i);
    }

    /* renamed from: h */
    public boolean mo46483h() {
        return this.f17574n;
    }

    /* renamed from: i */
    public boolean mo46484i() {
        return this.f17571e.getIsSoftwareRenderingEnabled();
    }

    /* renamed from: j */
    public final void mo46485j(long j) {
        this.f17571e.markTextureFrameAvailable(j);
    }

    /* renamed from: k */
    public final void mo46486k(long j, @NonNull SurfaceTexture surfaceTexture) {
        this.f17571e.registerTexture(j, surfaceTexture);
    }

    /* renamed from: l */
    public void mo46487l(@NonNull C8969b bVar) {
        this.f17571e.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* renamed from: m */
    public void mo46488m(boolean z) {
        this.f17571e.setSemanticsEnabled(z);
    }

    /* renamed from: n */
    public void mo46489n(@NonNull C8968c cVar) {
        C8968c cVar2 = cVar;
        C8896b.m24032d("FlutterRenderer", "Setting viewport metrics\nSize: " + cVar2.f17584b + " x " + cVar2.f17585c + "\nPadding - L: " + cVar2.f17589g + ", T: " + cVar2.f17586d + ", R: " + cVar2.f17587e + ", B: " + cVar2.f17588f + "\nInsets - L: " + cVar2.f17593k + ", T: " + cVar2.f17590h + ", R: " + cVar2.f17591i + ", B: " + cVar2.f17592j + "\nSystem Gesture Insets - L: " + cVar2.f17597o + ", T: " + cVar2.f17594l + ", R: " + cVar2.f17595m + ", B: " + cVar2.f17592j);
        this.f17571e.setViewportMetrics(cVar2.f17583a, cVar2.f17584b, cVar2.f17585c, cVar2.f17586d, cVar2.f17587e, cVar2.f17588f, cVar2.f17589g, cVar2.f17590h, cVar2.f17591i, cVar2.f17592j, cVar2.f17593k, cVar2.f17594l, cVar2.f17595m, cVar2.f17596n, cVar2.f17597o);
    }

    /* renamed from: o */
    public void mo46490o(@NonNull Surface surface) {
        if (this.f17573m != null) {
            mo46491p();
        }
        this.f17573m = surface;
        this.f17571e.onSurfaceCreated(surface);
    }

    /* renamed from: p */
    public void mo46491p() {
        this.f17571e.onSurfaceDestroyed();
        this.f17573m = null;
        if (this.f17574n) {
            this.f17575o.mo46342a();
        }
        this.f17574n = false;
    }

    /* renamed from: q */
    public void mo46492q(int i, int i2) {
        this.f17571e.onSurfaceChanged(i, i2);
    }

    /* renamed from: r */
    public void mo46493r(@NonNull Surface surface) {
        this.f17573m = surface;
        this.f17571e.onSurfaceWindowChanged(surface);
    }

    /* renamed from: s */
    public final void mo46494s(long j) {
        this.f17571e.unregisterTexture(j);
    }
}
