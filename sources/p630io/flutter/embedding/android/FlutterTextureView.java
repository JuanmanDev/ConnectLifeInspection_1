package p630io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p568h.C8970c;

/* renamed from: io.flutter.embedding.android.FlutterTextureView */
public class FlutterTextureView extends TextureView implements C8970c {

    /* renamed from: e */
    public boolean f18476e;

    /* renamed from: l */
    public boolean f18477l;
    @Nullable

    /* renamed from: m */
    public C8964a f18478m;
    @Nullable

    /* renamed from: n */
    public Surface f18479n;

    /* renamed from: o */
    public final TextureView.SurfaceTextureListener f18480o;

    /* renamed from: io.flutter.embedding.android.FlutterTextureView$a */
    public class C9409a implements TextureView.SurfaceTextureListener {
        public C9409a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C8896b.m24032d("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = FlutterTextureView.this.f18476e = true;
            if (FlutterTextureView.this.f18477l) {
                FlutterTextureView.this.mo47417i();
            }
        }

        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            C8896b.m24032d("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = FlutterTextureView.this.f18476e = false;
            if (!FlutterTextureView.this.f18477l) {
                return true;
            }
            FlutterTextureView.this.mo47418j();
            return true;
        }

        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            C8896b.m24032d("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (FlutterTextureView.this.f18477l) {
                FlutterTextureView.this.mo47416h(i, i2);
            }
        }

        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        }
    }

    public FlutterTextureView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo46499a(@NonNull C8964a aVar) {
        C8896b.m24032d("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f18478m != null) {
            C8896b.m24032d("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f18478m.mo46491p();
        }
        this.f18478m = aVar;
        this.f18477l = true;
        if (this.f18476e) {
            C8896b.m24032d("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            mo47417i();
        }
    }

    /* renamed from: b */
    public void mo46500b() {
        if (this.f18478m != null) {
            if (getWindowToken() != null) {
                C8896b.m24032d("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                mo47418j();
            }
            this.f18478m = null;
            this.f18477l = false;
            return;
        }
        C8896b.m24033e("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Nullable
    public C8964a getAttachedRenderer() {
        return this.f18478m;
    }

    /* renamed from: h */
    public final void mo47416h(int i, int i2) {
        if (this.f18478m != null) {
            C8896b.m24032d("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f18478m.mo46492q(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: i */
    public final void mo47417i() {
        if (this.f18478m == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = new Surface(getSurfaceTexture());
        this.f18479n = surface;
        this.f18478m.mo46490o(surface);
    }

    /* renamed from: j */
    public final void mo47418j() {
        C8964a aVar = this.f18478m;
        if (aVar != null) {
            aVar.mo46491p();
            Surface surface = this.f18479n;
            if (surface != null) {
                surface.release();
                this.f18479n = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: k */
    public final void mo47419k() {
        setSurfaceTextureListener(this.f18480o);
    }

    public void pause() {
        if (this.f18478m != null) {
            this.f18478m = null;
            this.f18477l = false;
            return;
        }
        C8896b.m24033e("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public FlutterTextureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18476e = false;
        this.f18477l = false;
        this.f18480o = new C9409a();
        mo47419k();
    }
}
