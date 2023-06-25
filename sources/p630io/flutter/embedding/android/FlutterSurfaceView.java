package p630io.flutter.embedding.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p568h.C8969b;
import p553f.p554a.p556d.p558b.p568h.C8970c;

/* renamed from: io.flutter.embedding.android.FlutterSurfaceView */
public class FlutterSurfaceView extends SurfaceView implements C8970c {

    /* renamed from: e */
    public final boolean f18468e;

    /* renamed from: l */
    public boolean f18469l;

    /* renamed from: m */
    public boolean f18470m;
    @Nullable

    /* renamed from: n */
    public C8964a f18471n;

    /* renamed from: o */
    public final SurfaceHolder.Callback f18472o;

    /* renamed from: p */
    public final C8969b f18473p;

    /* renamed from: io.flutter.embedding.android.FlutterSurfaceView$a */
    public class C9407a implements SurfaceHolder.Callback {
        public C9407a() {
        }

        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C8896b.m24032d("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (FlutterSurfaceView.this.f18470m) {
                FlutterSurfaceView.this.mo47409i(i2, i3);
            }
        }

        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            C8896b.m24032d("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = FlutterSurfaceView.this.f18469l = true;
            if (FlutterSurfaceView.this.f18470m) {
                FlutterSurfaceView.this.mo47410j();
            }
        }

        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            C8896b.m24032d("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = FlutterSurfaceView.this.f18469l = false;
            if (FlutterSurfaceView.this.f18470m) {
                FlutterSurfaceView.this.mo47411k();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSurfaceView$b */
    public class C9408b implements C8969b {
        public C9408b() {
        }

        /* renamed from: a */
        public void mo46342a() {
        }

        /* renamed from: b */
        public void mo46343b() {
            C8896b.m24032d("FlutterSurfaceView", "onFlutterUiDisplayed()");
            FlutterSurfaceView.this.setAlpha(1.0f);
            if (FlutterSurfaceView.this.f18471n != null) {
                FlutterSurfaceView.this.f18471n.mo46487l(this);
            }
        }
    }

    public FlutterSurfaceView(@NonNull Context context) {
        this(context, (AttributeSet) null, false);
    }

    /* renamed from: a */
    public void mo46499a(@NonNull C8964a aVar) {
        C8896b.m24032d("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f18471n != null) {
            C8896b.m24032d("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f18471n.mo46491p();
            this.f18471n.mo46487l(this.f18473p);
        }
        this.f18471n = aVar;
        this.f18470m = true;
        aVar.mo46481f(this.f18473p);
        if (this.f18469l) {
            C8896b.m24032d("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            mo47410j();
        }
    }

    /* renamed from: b */
    public void mo46500b() {
        if (this.f18471n != null) {
            if (getWindowToken() != null) {
                C8896b.m24032d("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                mo47411k();
            }
            setAlpha(0.0f);
            this.f18471n.mo46487l(this.f18473p);
            this.f18471n = null;
            this.f18470m = false;
            return;
        }
        C8896b.m24033e("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Nullable
    public C8964a getAttachedRenderer() {
        return this.f18471n;
    }

    /* renamed from: i */
    public final void mo47409i(int i, int i2) {
        if (this.f18471n != null) {
            C8896b.m24032d("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f18471n.mo46492q(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: j */
    public final void mo47410j() {
        if (this.f18471n == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f18471n.mo46490o(getHolder().getSurface());
    }

    /* renamed from: k */
    public final void mo47411k() {
        C8964a aVar = this.f18471n;
        if (aVar != null) {
            aVar.mo46491p();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: l */
    public final void mo47412l() {
        if (this.f18468e) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f18472o);
        setAlpha(0.0f);
    }

    public void pause() {
        if (this.f18471n != null) {
            this.f18471n = null;
            this.f18470m = false;
            return;
        }
        C8896b.m24033e("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public FlutterSurfaceView(@NonNull Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    public FlutterSurfaceView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    public FlutterSurfaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f18469l = false;
        this.f18470m = false;
        this.f18472o = new C9407a();
        this.f18473p = new C9408b();
        this.f18468e = z;
        mo47412l();
    }
}
