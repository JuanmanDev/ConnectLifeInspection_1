package p307cn.bingoogolapple.qrcode.core;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import java.util.Collections;
import p034b.p035a.p036a.p037a.C1328a;
import p034b.p035a.p036a.p037a.C1329b;

/* renamed from: cn.bingoogolapple.qrcode.core.CameraPreview */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: e */
    public Camera f6747e;

    /* renamed from: l */
    public boolean f6748l = false;

    /* renamed from: m */
    public boolean f6749m = false;

    /* renamed from: n */
    public boolean f6750n = false;

    /* renamed from: o */
    public float f6751o = 1.0f;

    /* renamed from: p */
    public C1329b f6752p;

    /* renamed from: q */
    public C3728b f6753q;

    /* renamed from: cn.bingoogolapple.qrcode.core.CameraPreview$a */
    public class C3727a implements Camera.AutoFocusCallback {
        public C3727a() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (z) {
                C1328a.m171e("对焦测光成功");
            } else {
                C1328a.m174h("对焦测光失败");
            }
            CameraPreview.this.mo21088j();
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.CameraPreview$b */
    public interface C3728b {
        /* renamed from: a */
        void mo21098a();
    }

    public CameraPreview(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    /* renamed from: e */
    public static void m9340e(boolean z, Camera camera) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                int zoom = parameters.getZoom();
                if (z && zoom < parameters.getMaxZoom()) {
                    C1328a.m171e("放大");
                    zoom++;
                } else if (z || zoom <= 0) {
                    C1328a.m171e("既不放大也不缩小");
                } else {
                    C1328a.m171e("缩小");
                    zoom--;
                }
                parameters.setZoom(zoom);
                camera.setParameters(parameters);
                return;
            }
            C1328a.m171e("不支持缩放");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo21081b() {
        if (mo21082c()) {
            this.f6752p.mo14976a(this.f6747e);
        }
    }

    /* renamed from: c */
    public final boolean mo21082c() {
        return mo21084f() && getContext().getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    /* renamed from: d */
    public final void mo21083d(float f, float f2, int i, int i2) {
        boolean z;
        try {
            Camera.Parameters parameters = this.f6747e.getParameters();
            Camera.Size previewSize = parameters.getPreviewSize();
            boolean z2 = true;
            if (parameters.getMaxNumFocusAreas() > 0) {
                C1328a.m171e("支持设置对焦区域");
                Rect c = C1328a.m169c(1.0f, f, f2, i, i2, previewSize.width, previewSize.height);
                C1328a.m181o("对焦区域", c);
                parameters.setFocusAreas(Collections.singletonList(new Camera.Area(c, 1000)));
                parameters.setFocusMode("macro");
                z = true;
            } else {
                C1328a.m171e("不支持设置对焦区域");
                z = false;
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                C1328a.m171e("支持设置测光区域");
                Rect c2 = C1328a.m169c(1.5f, f, f2, i, i2, previewSize.width, previewSize.height);
                C1328a.m181o("测光区域", c2);
                parameters.setMeteringAreas(Collections.singletonList(new Camera.Area(c2, 1000)));
            } else {
                C1328a.m171e("不支持设置测光区域");
                z2 = z;
            }
            if (z2) {
                this.f6747e.cancelAutoFocus();
                this.f6747e.setParameters(parameters);
                this.f6747e.autoFocus(new C3727a());
                return;
            }
            this.f6750n = false;
        } catch (Exception e) {
            e.printStackTrace();
            C1328a.m174h("对焦测光失败：" + e.getMessage());
            mo21088j();
        }
    }

    /* renamed from: f */
    public boolean mo21084f() {
        return this.f6747e != null && this.f6748l && this.f6749m;
    }

    /* renamed from: g */
    public void mo21085g(Rect rect) {
        if (this.f6747e != null && rect != null && rect.left > 0 && rect.top > 0) {
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            int width = rect.width() / 2;
            int height = rect.height() / 2;
            C1328a.m181o("转换前", rect);
            if (C1328a.m179m(getContext())) {
                int i = centerY;
                centerY = centerX;
                centerX = i;
                int i2 = height;
                height = width;
                width = i2;
            }
            Rect rect2 = new Rect(centerX - width, centerY - height, centerX + width, centerY + height);
            C1328a.m181o("转换后", rect2);
            C1328a.m171e("扫码框发生变化触发对焦测光");
            mo21083d((float) rect2.centerX(), (float) rect2.centerY(), rect2.width(), rect2.height());
        }
    }

    /* renamed from: h */
    public void mo21086h() {
        if (mo21082c()) {
            this.f6752p.mo14981i(this.f6747e);
        }
    }

    /* renamed from: i */
    public final void mo21087i() {
        if (this.f6747e != null) {
            try {
                this.f6748l = true;
                SurfaceHolder holder = getHolder();
                holder.setKeepScreenOn(true);
                this.f6747e.setPreviewDisplay(holder);
                this.f6752p.mo14983k(this.f6747e);
                this.f6747e.startPreview();
                if (this.f6753q != null) {
                    this.f6753q.mo21098a();
                }
                mo21088j();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public final void mo21088j() {
        this.f6750n = false;
        Camera camera = this.f6747e;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("continuous-picture");
                this.f6747e.setParameters(parameters);
                this.f6747e.cancelAutoFocus();
            } catch (Exception unused) {
                C1328a.m174h("连续对焦失败");
            }
        }
    }

    /* renamed from: k */
    public void mo21089k() {
        Camera camera = this.f6747e;
        if (camera != null) {
            try {
                this.f6748l = false;
                camera.cancelAutoFocus();
                this.f6747e.setOneShotPreviewCallback((Camera.PreviewCallback) null);
                this.f6747e.stopPreview();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = SurfaceView.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = SurfaceView.getDefaultSize(getSuggestedMinimumHeight(), i2);
        C1329b bVar = this.f6752p;
        if (!(bVar == null || bVar.mo14978e() == null)) {
            Point e = this.f6752p.mo14978e();
            float f = (float) defaultSize;
            float f2 = (float) defaultSize2;
            float f3 = (float) e.x;
            float f4 = (float) e.y;
            float f5 = (f3 * 1.0f) / f4;
            if ((f * 1.0f) / f2 < f5) {
                defaultSize = (int) ((f2 / ((f4 * 1.0f) / f3)) + 0.5f);
            } else {
                defaultSize2 = (int) ((f / f5) + 0.5f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo21084f()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 1 && (motionEvent.getAction() & 255) == 1) {
            if (this.f6750n) {
                return true;
            }
            this.f6750n = true;
            C1328a.m171e("手指触摸触发对焦测光");
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (C1328a.m179m(getContext())) {
                float f = y;
                y = x;
                x = f;
            }
            int g = C1328a.m173g(getContext(), 120.0f);
            mo21083d(x, y, g, g);
        }
        if (motionEvent.getPointerCount() == 2) {
            int action = motionEvent.getAction() & 255;
            if (action == 2) {
                float b = C1328a.m168b(motionEvent);
                float f2 = this.f6751o;
                if (b > f2) {
                    m9340e(true, this.f6747e);
                } else if (b < f2) {
                    m9340e(false, this.f6747e);
                }
            } else if (action == 5) {
                this.f6751o = C1328a.m168b(motionEvent);
            }
        }
        return true;
    }

    public void setCamera(Camera camera) {
        this.f6747e = camera;
        if (camera != null) {
            C1329b bVar = new C1329b(getContext());
            this.f6752p = bVar;
            bVar.mo14980h(this.f6747e);
            if (this.f6748l) {
                requestLayout();
            } else {
                mo21087i();
            }
        }
    }

    public void setDelegate(C3728b bVar) {
        this.f6753q = bVar;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() != null) {
            mo21089k();
            mo21087i();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f6749m = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f6749m = false;
        mo21089k();
    }
}
