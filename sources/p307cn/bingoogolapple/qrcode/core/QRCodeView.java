package p307cn.bingoogolapple.qrcode.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner.R$id;
import p034b.p035a.p036a.p037a.C1328a;
import p034b.p035a.p036a.p037a.C1330c;
import p034b.p035a.p036a.p037a.C1332e;
import p307cn.bingoogolapple.qrcode.core.CameraPreview;

/* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView */
public abstract class QRCodeView extends RelativeLayout implements Camera.PreviewCallback {

    /* renamed from: z */
    public static final long[] f6755z = {255, 255, 255, 255};

    /* renamed from: e */
    public Camera f6756e;

    /* renamed from: l */
    public CameraPreview f6757l;

    /* renamed from: m */
    public ScanBoxView f6758m;

    /* renamed from: n */
    public C3734f f6759n;

    /* renamed from: o */
    public boolean f6760o;

    /* renamed from: p */
    public C1330c f6761p;

    /* renamed from: q */
    public int f6762q;

    /* renamed from: r */
    public PointF[] f6763r;

    /* renamed from: s */
    public Paint f6764s;

    /* renamed from: t */
    public BarcodeType f6765t;

    /* renamed from: u */
    public long f6766u;

    /* renamed from: v */
    public ValueAnimator f6767v;

    /* renamed from: w */
    public long f6768w;

    /* renamed from: x */
    public long f6769x;

    /* renamed from: y */
    public int f6770y;

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView$a */
    public class C3729a implements CameraPreview.C3728b {
        public C3729a() {
        }

        /* renamed from: a */
        public void mo21098a() {
            QRCodeView.this.mo21121q();
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView$b */
    public class C3730b implements Runnable {
        public C3730b() {
        }

        public void run() {
            QRCodeView.this.f6757l.mo21086h();
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView$c */
    public class C3731c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f6773e;

        /* renamed from: l */
        public final /* synthetic */ int f6774l;

        /* renamed from: m */
        public final /* synthetic */ int f6775m;

        /* renamed from: n */
        public final /* synthetic */ String f6776n;

        public C3731c(int i, int i2, int i3, String str) {
            this.f6773e = i;
            this.f6774l = i2;
            this.f6775m = i3;
            this.f6776n = str;
        }

        public void run() {
            QRCodeView qRCodeView = QRCodeView.this;
            int i = this.f6773e;
            qRCodeView.mo21123s(i, Math.min(this.f6774l + i, this.f6775m), this.f6776n);
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView$d */
    public class C3732d implements ValueAnimator.AnimatorUpdateListener {
        public C3732d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CameraPreview cameraPreview = QRCodeView.this.f6757l;
            if (cameraPreview != null && cameraPreview.mo21084f()) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Camera.Parameters parameters = QRCodeView.this.f6756e.getParameters();
                parameters.setZoom(intValue);
                QRCodeView.this.f6756e.setParameters(parameters);
            }
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView$e */
    public class C3733e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ String f6779a;

        public C3733e(String str) {
            this.f6779a = str;
        }

        public void onAnimationEnd(Animator animator) {
            QRCodeView.this.mo21114l(new C1332e(this.f6779a));
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeView$f */
    public interface C3734f {
        void onCameraAmbientBrightnessChanged(boolean z);

        void onScanQRCodeOpenCameraError();

        void onScanQRCodeSuccess(String str);
    }

    public QRCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    public final PointF mo21099A(float f, float f2, float f3, float f4, boolean z, int i, Rect rect) {
        PointF pointF;
        int width = getWidth();
        int height = getHeight();
        if (C1328a.m179m(getContext())) {
            float f5 = (float) width;
            float f6 = (float) height;
            pointF = new PointF((f4 - f) * (f5 / f4), (f3 - f2) * (f6 / f3));
            float f7 = f6 - pointF.y;
            pointF.y = f7;
            pointF.x = f5 - pointF.x;
            if (rect == null) {
                pointF.y = f7 + ((float) i);
            }
        } else {
            float f8 = (float) width;
            pointF = new PointF(f * (f8 / f3), f2 * (((float) height) / f4));
            if (z) {
                pointF.x = f8 - pointF.x;
            }
        }
        if (rect != null) {
            pointF.y += (float) rect.top;
            pointF.x += (float) rect.left;
        }
        return pointF;
    }

    /* renamed from: B */
    public boolean mo21100B(PointF[] pointFArr, Rect rect, boolean z, String str) {
        PointF[] pointFArr2 = pointFArr;
        if (!(pointFArr2 == null || pointFArr2.length == 0)) {
            try {
                Camera.Size previewSize = this.f6756e.getParameters().getPreviewSize();
                boolean z2 = this.f6762q == 1;
                int k = C1328a.m177k(getContext());
                PointF[] pointFArr3 = new PointF[pointFArr2.length];
                int i = 0;
                for (PointF pointF : pointFArr2) {
                    pointFArr3[i] = mo21099A(pointF.x, pointF.y, (float) previewSize.width, (float) previewSize.height, z2, k, rect);
                    i++;
                }
                this.f6763r = pointFArr3;
                postInvalidate();
                if (z) {
                    return mo21105f(pointFArr3, str);
                }
                return false;
            } catch (Exception e) {
                this.f6763r = null;
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo21101c() {
        this.f6757l.mo21081b();
    }

    /* renamed from: d */
    public final int mo21102d(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = 0;
        while (i2 < Camera.getNumberOfCameras()) {
            try {
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == i) {
                    return i2;
                }
                i2++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public void dispatchDraw(Canvas canvas) {
        PointF[] pointFArr;
        super.dispatchDraw(canvas);
        if (mo21112j() && (pointFArr = this.f6763r) != null) {
            for (PointF pointF : pointFArr) {
                canvas.drawCircle(pointF.x, pointF.y, 10.0f, this.f6764s);
            }
            this.f6763r = null;
            postInvalidateDelayed(ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
        }
    }

    /* renamed from: e */
    public final void mo21104e(byte[] bArr, Camera camera) {
        CameraPreview cameraPreview = this.f6757l;
        if (cameraPreview != null && cameraPreview.mo21084f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f6769x >= 150) {
                this.f6769x = currentTimeMillis;
                long j = 0;
                long j2 = (long) (camera.getParameters().getPreviewSize().width * camera.getParameters().getPreviewSize().height);
                if (Math.abs(((float) bArr.length) - (((float) j2) * 1.5f)) < 1.0E-5f) {
                    boolean z = false;
                    for (int i = 0; ((long) i) < j2; i += 10) {
                        j += ((long) bArr[i]) & 255;
                    }
                    long j3 = j / (j2 / ((long) 10));
                    long[] jArr = f6755z;
                    int length = this.f6770y % jArr.length;
                    this.f6770y = length;
                    jArr[length] = j3;
                    this.f6770y = length + 1;
                    int length2 = jArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z = true;
                            break;
                        } else if (jArr[i2] > 60) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    C1328a.m171e("摄像头环境亮度为：" + j3);
                    C3734f fVar = this.f6759n;
                    if (fVar != null) {
                        fVar.onCameraAmbientBrightnessChanged(z);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo21105f(PointF[] pointFArr, String str) {
        if (this.f6756e == null || this.f6758m == null || pointFArr == null || pointFArr.length < 1) {
            return false;
        }
        ValueAnimator valueAnimator = this.f6767v;
        if ((valueAnimator != null && valueAnimator.isRunning()) || System.currentTimeMillis() - this.f6768w < 1200) {
            return true;
        }
        Camera.Parameters parameters = this.f6756e.getParameters();
        if (!parameters.isZoomSupported()) {
            return false;
        }
        float f = pointFArr[0].x;
        float f2 = pointFArr[0].y;
        float f3 = pointFArr[1].x;
        float f4 = pointFArr[1].y;
        float abs = Math.abs(f - f3);
        float abs2 = Math.abs(f2 - f4);
        if (((int) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) > this.f6758m.getRectWidth() / 4) {
            return false;
        }
        int maxZoom = parameters.getMaxZoom();
        post(new C3731c(parameters.getZoom(), maxZoom / 4, maxZoom, str));
        return true;
    }

    /* renamed from: g */
    public void mo21106g() {
        ScanBoxView scanBoxView = this.f6758m;
        if (scanBoxView != null) {
            scanBoxView.setVisibility(8);
        }
    }

    public CameraPreview getCameraPreview() {
        return this.f6757l;
    }

    public boolean getIsScanBarcodeStyle() {
        return this.f6758m.getIsBarcode();
    }

    public ScanBoxView getScanBoxView() {
        return this.f6758m;
    }

    /* renamed from: h */
    public final void mo21110h(Context context, AttributeSet attributeSet) {
        CameraPreview cameraPreview = new CameraPreview(context);
        this.f6757l = cameraPreview;
        cameraPreview.setDelegate(new C3729a());
        ScanBoxView scanBoxView = new ScanBoxView(context);
        this.f6758m = scanBoxView;
        scanBoxView.mo21211i(this, attributeSet);
        this.f6757l.setId(R$id.bgaqrcode_camera_preview);
        addView(this.f6757l);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context, attributeSet);
        layoutParams.addRule(6, this.f6757l.getId());
        layoutParams.addRule(8, this.f6757l.getId());
        addView(this.f6758m, layoutParams);
        Paint paint = new Paint();
        this.f6764s = paint;
        paint.setColor(getScanBoxView().getCornerColor());
        this.f6764s.setStyle(Paint.Style.FILL);
    }

    /* renamed from: i */
    public boolean mo21111i() {
        ScanBoxView scanBoxView = this.f6758m;
        return scanBoxView != null && scanBoxView.mo21213k();
    }

    /* renamed from: j */
    public boolean mo21112j() {
        ScanBoxView scanBoxView = this.f6758m;
        return scanBoxView != null && scanBoxView.mo21215m();
    }

    /* renamed from: k */
    public void mo21113k(C1332e eVar) {
        String str;
        if (this.f6759n != null) {
            if (eVar == null) {
                str = null;
            } else {
                str = eVar.f317a;
            }
            this.f6759n.onScanQRCodeSuccess(str);
        }
    }

    /* renamed from: l */
    public void mo21114l(C1332e eVar) {
        String str;
        if (this.f6760o) {
            if (eVar == null) {
                str = null;
            } else {
                str = eVar.f317a;
            }
            if (TextUtils.isEmpty(str)) {
                try {
                    if (this.f6756e != null) {
                        this.f6756e.setOneShotPreviewCallback(this);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                this.f6760o = false;
                try {
                    if (this.f6759n != null) {
                        this.f6759n.onScanQRCodeSuccess(str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: m */
    public void mo21115m(Rect rect) {
        this.f6757l.mo21085g(rect);
    }

    /* renamed from: n */
    public void mo21116n() {
        postDelayed(new C3730b(), this.f6757l.mo21084f() ? 0 : 500);
    }

    /* renamed from: o */
    public abstract C1332e mo21117o(Bitmap bitmap);

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6767v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (C1328a.m178l()) {
            C1328a.m171e("两次 onPreviewFrame 时间间隔：" + (System.currentTimeMillis() - this.f6766u));
            this.f6766u = System.currentTimeMillis();
        }
        CameraPreview cameraPreview = this.f6757l;
        if (cameraPreview != null && cameraPreview.mo21084f()) {
            try {
                mo21104e(bArr, camera);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f6760o) {
            C1330c cVar = this.f6761p;
            if (cVar == null || !(cVar.getStatus() == AsyncTask.Status.PENDING || this.f6761p.getStatus() == AsyncTask.Status.RUNNING)) {
                C1330c cVar2 = new C1330c(camera, bArr, this, C1328a.m179m(getContext()));
                cVar2.mo14987d();
                this.f6761p = cVar2;
            }
        }
    }

    /* renamed from: p */
    public abstract C1332e mo21120p(byte[] bArr, int i, int i2, boolean z);

    /* renamed from: q */
    public final void mo21121q() {
        if (this.f6760o && this.f6757l.mo21084f()) {
            try {
                this.f6756e.setOneShotPreviewCallback(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: r */
    public abstract void mo21122r();

    /* renamed from: s */
    public final void mo21123s(int i, int i2, String str) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        this.f6767v = ofInt;
        ofInt.addUpdateListener(new C3732d());
        this.f6767v.addListener(new C3733e(str));
        this.f6767v.setDuration(600);
        this.f6767v.setRepeatCount(0);
        this.f6767v.start();
        this.f6768w = System.currentTimeMillis();
    }

    public void setDelegate(C3734f fVar) {
        this.f6759n = fVar;
    }

    /* renamed from: t */
    public void mo21125t() {
        mo21126u(this.f6762q);
    }

    /* renamed from: u */
    public void mo21126u(int i) {
        if (this.f6756e == null && Camera.getNumberOfCameras() != 0) {
            int d = mo21102d(i);
            if (d != -1) {
                mo21127v(d);
                return;
            }
            if (i == 0) {
                d = mo21102d(1);
            } else if (i == 1) {
                d = mo21102d(0);
            }
            if (d != -1) {
                mo21127v(d);
            }
        }
    }

    /* renamed from: v */
    public final void mo21127v(int i) {
        try {
            this.f6762q = i;
            Camera open = Camera.open(i);
            this.f6756e = open;
            this.f6757l.setCamera(open);
        } catch (Exception e) {
            e.printStackTrace();
            C3734f fVar = this.f6759n;
            if (fVar != null) {
                fVar.onScanQRCodeOpenCameraError();
            }
        }
    }

    /* renamed from: w */
    public void mo21128w() {
        this.f6760o = true;
        mo21125t();
        mo21121q();
    }

    /* renamed from: x */
    public void mo21129x() {
        try {
            mo21131z();
            if (this.f6756e != null) {
                this.f6757l.mo21089k();
                this.f6757l.setCamera((Camera) null);
                this.f6756e.release();
                this.f6756e = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    public void mo21130y() {
        this.f6760o = false;
        C1330c cVar = this.f6761p;
        if (cVar != null) {
            cVar.mo14984a();
            this.f6761p = null;
        }
        Camera camera = this.f6756e;
        if (camera != null) {
            try {
                camera.setOneShotPreviewCallback((Camera.PreviewCallback) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: z */
    public void mo21131z() {
        mo21130y();
        mo21106g();
    }

    public QRCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6760o = false;
        this.f6762q = 0;
        this.f6765t = BarcodeType.HIGH_FREQUENCY;
        this.f6766u = 0;
        this.f6768w = 0;
        this.f6769x = System.currentTimeMillis();
        this.f6770y = 0;
        mo21110h(context, attributeSet);
        mo21122r();
    }
}
