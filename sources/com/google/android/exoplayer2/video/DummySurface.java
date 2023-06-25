package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.material.internal.ManufacturerUtils;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

@TargetApi(17)
public final class DummySurface extends Surface {

    /* renamed from: m */
    public static int f7958m;

    /* renamed from: n */
    public static boolean f7959n;

    /* renamed from: e */
    public final C4067b f7960e;

    /* renamed from: l */
    public boolean f7961l;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$b */
    public static class C4067b extends HandlerThread implements Handler.Callback {

        /* renamed from: e */
        public EGLSurfaceTexture f7962e;

        /* renamed from: l */
        public Handler f7963l;
        @Nullable

        /* renamed from: m */
        public Error f7964m;
        @Nullable

        /* renamed from: n */
        public RuntimeException f7965n;
        @Nullable

        /* renamed from: o */
        public DummySurface f7966o;

        public C4067b() {
            super("dummySurface");
        }

        /* renamed from: a */
        public DummySurface mo24306a(int i) {
            boolean z;
            start();
            this.f7963l = new Handler(getLooper(), this);
            this.f7962e = new EGLSurfaceTexture(this.f7963l);
            synchronized (this) {
                z = false;
                this.f7963l.obtainMessage(1, i, 0).sendToTarget();
                while (this.f7966o == null && this.f7965n == null && this.f7964m == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f7965n;
            if (runtimeException == null) {
                Error error = this.f7964m;
                if (error == null) {
                    DummySurface dummySurface = this.f7966o;
                    C3151e.m7757e(dummySurface);
                    return dummySurface;
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: b */
        public final void mo24307b(int i) {
            C3151e.m7757e(this.f7962e);
            this.f7962e.mo24289h(i);
            this.f7966o = new DummySurface(this, this.f7962e.mo24288g(), i != 0);
        }

        /* renamed from: c */
        public void mo24308c() {
            C3151e.m7757e(this.f7963l);
            this.f7963l.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void mo24309d() {
            C3151e.m7757e(this.f7962e);
            this.f7962e.mo24290i();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    mo24307b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    C3163m.m7878d("DummySurface", "Failed to initialize dummy surface", e);
                    this.f7965n = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        C3163m.m7878d("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f7964m = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    mo24309d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    /* renamed from: a */
    public static void m10710a() {
        if (C3152e0.f5819a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    /* renamed from: b */
    public static int m10711b(Context context) {
        String eglQueryString;
        if (C3152e0.f5819a < 26 && (ManufacturerUtils.SAMSUNG.equals(C3152e0.f5821c) || "XT1650".equals(C3152e0.f5822d))) {
            return 0;
        }
        if ((C3152e0.f5819a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: c */
    public static synchronized boolean m10712c(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!f7959n) {
                f7958m = C3152e0.f5819a < 24 ? 0 : m10711b(context);
                f7959n = true;
            }
            if (f7958m == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static DummySurface m10713d(Context context, boolean z) {
        m10710a();
        int i = 0;
        C3151e.m7759g(!z || m10712c(context));
        C4067b bVar = new C4067b();
        if (z) {
            i = f7958m;
        }
        return bVar.mo24306a(i);
    }

    public void release() {
        super.release();
        synchronized (this.f7960e) {
            if (!this.f7961l) {
                this.f7960e.mo24308c();
                this.f7961l = true;
            }
        }
    }

    public DummySurface(C4067b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f7960e = bVar;
    }
}
