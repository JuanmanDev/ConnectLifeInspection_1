package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

@TargetApi(17)
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: r */
    public static final int[] f7945r = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: e */
    public final Handler f7946e;

    /* renamed from: l */
    public final int[] f7947l;
    @Nullable

    /* renamed from: m */
    public final C4064b f7948m;
    @Nullable

    /* renamed from: n */
    public EGLDisplay f7949n;
    @Nullable

    /* renamed from: o */
    public EGLContext f7950o;
    @Nullable

    /* renamed from: p */
    public EGLSurface f7951p;
    @Nullable

    /* renamed from: q */
    public SurfaceTexture f7952q;

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.util.EGLSurfaceTexture$b */
    public interface C4064b {
        /* renamed from: a */
        void mo24293a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, (C4064b) null);
    }

    /* renamed from: a */
    public static EGLConfig m10696a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f7945r, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new GlException(C3152e0.m7819s("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: b */
    public static EGLContext m10697b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    /* renamed from: c */
    public static EGLSurface m10698c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    /* renamed from: e */
    public static void m10699e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new GlException("glGenTextures failed. Error: " + Integer.toHexString(glGetError));
        }
    }

    /* renamed from: f */
    public static EGLDisplay m10700f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new GlException("eglInitialize failed");
        }
        throw new GlException("eglGetDisplay failed");
    }

    /* renamed from: d */
    public final void mo24287d() {
        C4064b bVar = this.f7948m;
        if (bVar != null) {
            bVar.mo24293a();
        }
    }

    /* renamed from: g */
    public SurfaceTexture mo24288g() {
        SurfaceTexture surfaceTexture = this.f7952q;
        C3151e.m7757e(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: h */
    public void mo24289h(int i) {
        EGLDisplay f = m10700f();
        this.f7949n = f;
        EGLConfig a = m10696a(f);
        EGLContext b = m10697b(this.f7949n, a, i);
        this.f7950o = b;
        this.f7951p = m10698c(this.f7949n, a, b, i);
        m10699e(this.f7947l);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7947l[0]);
        this.f7952q = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void mo24290i() {
        this.f7946e.removeCallbacks(this);
        try {
            if (this.f7952q != null) {
                this.f7952q.release();
                GLES20.glDeleteTextures(1, this.f7947l, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f7949n;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f7949n;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f7951p;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f7949n, this.f7951p);
            }
            EGLContext eGLContext = this.f7950o;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f7949n, eGLContext);
            }
            if (C3152e0.f5819a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f7949n;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f7949n);
            }
            this.f7949n = null;
            this.f7950o = null;
            this.f7951p = null;
            this.f7952q = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7946e.post(this);
    }

    public void run() {
        mo24287d();
        SurfaceTexture surfaceTexture = this.f7952q;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, @Nullable C4064b bVar) {
        this.f7946e = handler;
        this.f7948m = bVar;
        this.f7947l = new int[1];
    }
}
