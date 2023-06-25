package p307cn.bingoogolapple.qrcode.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner.R$id;
import p034b.p035a.p036a.p037a.C1328a;
import p034b.p035a.p036a.p037a.C1331d;
import p034b.p035a.p036a.p037a.C1332e;
import p307cn.bingoogolapple.qrcode.core.CameraPreview;

/* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew */
public abstract class QRCodeViewNew extends CameraPreview implements Camera.PreviewCallback {

    /* renamed from: D */
    public static final long[] f6781D = {255, 255, 255, 255};

    /* renamed from: A */
    public long f6782A = 0;

    /* renamed from: B */
    public long f6783B = System.currentTimeMillis();

    /* renamed from: C */
    public int f6784C = 0;

    /* renamed from: r */
    public Camera f6785r;

    /* renamed from: s */
    public C3740f f6786s;

    /* renamed from: t */
    public boolean f6787t = false;

    /* renamed from: u */
    public C1331d f6788u;

    /* renamed from: v */
    public int f6789v = 0;

    /* renamed from: w */
    public PointF[] f6790w;

    /* renamed from: x */
    public BarcodeType f6791x = BarcodeType.HIGH_FREQUENCY;

    /* renamed from: y */
    public long f6792y = 0;

    /* renamed from: z */
    public ValueAnimator f6793z;

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew$a */
    public class C3735a implements CameraPreview.C3728b {
        public C3735a() {
        }

        /* renamed from: a */
        public void mo21098a() {
            QRCodeViewNew.this.mo21164x();
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew$b */
    public class C3736b implements Runnable {
        public C3736b() {
        }

        public void run() {
            QRCodeViewNew.this.mo21086h();
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew$c */
    public class C3737c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f6796e;

        /* renamed from: l */
        public final /* synthetic */ int f6797l;

        /* renamed from: m */
        public final /* synthetic */ int f6798m;

        /* renamed from: n */
        public final /* synthetic */ String f6799n;

        public C3737c(int i, int i2, int i3, String str) {
            this.f6796e = i;
            this.f6797l = i2;
            this.f6798m = i3;
            this.f6799n = str;
        }

        public void run() {
            QRCodeViewNew qRCodeViewNew = QRCodeViewNew.this;
            int i = this.f6796e;
            qRCodeViewNew.mo21166z(i, Math.min(this.f6797l + i, this.f6798m), this.f6799n);
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew$d */
    public class C3738d implements ValueAnimator.AnimatorUpdateListener {
        public C3738d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (QRCodeViewNew.this.mo21084f()) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Camera.Parameters parameters = QRCodeViewNew.this.f6785r.getParameters();
                parameters.setZoom(intValue);
                QRCodeViewNew.this.f6785r.setParameters(parameters);
            }
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew$e */
    public class C3739e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ String f6802a;

        public C3739e(String str) {
            this.f6802a = str;
        }

        public void onAnimationEnd(Animator animator) {
            QRCodeViewNew.this.mo21160t(new C1332e(this.f6802a));
        }
    }

    /* renamed from: cn.bingoogolapple.qrcode.core.QRCodeViewNew$f */
    public interface C3740f {
        void onCameraAmbientBrightnessChanged(boolean z);

        void onScanQRCodeOpenCameraError();

        void onScanQRCodeSuccess(String str);
    }

    public QRCodeViewNew(Context context) {
        super(context);
        mo21157r();
        mo21165y();
    }

    /* renamed from: A */
    public void mo21139A() {
        mo21140B(this.f6789v);
    }

    /* renamed from: B */
    public void mo21140B(int i) {
        if (this.f6785r == null && Camera.getNumberOfCameras() != 0) {
            int o = mo21152o(i);
            if (o != -1) {
                mo21141C(o);
                return;
            }
            if (i == 0) {
                o = mo21152o(1);
            } else if (i == 1) {
                o = mo21152o(0);
            }
            if (o != -1) {
                mo21141C(o);
            }
        }
    }

    /* renamed from: C */
    public final void mo21141C(int i) {
        try {
            this.f6789v = i;
            Camera open = Camera.open(i);
            this.f6785r = open;
            setCamera(open);
        } catch (Exception e) {
            e.printStackTrace();
            C3740f fVar = this.f6786s;
            if (fVar != null) {
                fVar.onScanQRCodeOpenCameraError();
            }
        }
    }

    /* renamed from: D */
    public void mo21142D() {
        this.f6787t = true;
        mo21139A();
        mo21164x();
    }

    /* renamed from: E */
    public void mo21143E() {
        try {
            mo21145G();
            if (this.f6785r != null) {
                mo21089k();
                setCamera((Camera) null);
                this.f6785r.release();
                this.f6785r = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: F */
    public void mo21144F() {
        this.f6787t = false;
        C1331d dVar = this.f6788u;
        if (dVar != null) {
            dVar.mo14992a();
            this.f6788u = null;
        }
        Camera camera = this.f6785r;
        if (camera != null) {
            try {
                camera.setOneShotPreviewCallback((Camera.PreviewCallback) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: G */
    public void mo21145G() {
        mo21144F();
    }

    /* renamed from: H */
    public final PointF mo21146H(float f, float f2, float f3, float f4, boolean z, int i, Rect rect) {
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

    /* renamed from: I */
    public boolean mo21147I(PointF[] pointFArr, Rect rect, boolean z, String str) {
        PointF[] pointFArr2 = pointFArr;
        if (!(pointFArr2 == null || pointFArr2.length == 0)) {
            try {
                Camera.Size previewSize = this.f6785r.getParameters().getPreviewSize();
                boolean z2 = this.f6789v == 1;
                int k = C1328a.m177k(getContext());
                PointF[] pointFArr3 = new PointF[pointFArr2.length];
                int i = 0;
                for (PointF pointF : pointFArr2) {
                    pointFArr3[i] = mo21146H(pointF.x, pointF.y, (float) previewSize.width, (float) previewSize.height, z2, k, rect);
                    i++;
                }
                this.f6790w = pointFArr3;
                postInvalidate();
                if (z) {
                    return mo21156q(pointFArr3, str);
                }
                return false;
            } catch (Exception e) {
                this.f6790w = null;
                e.printStackTrace();
            }
        }
        return false;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6790w != null) {
            this.f6790w = null;
            postInvalidateDelayed(ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
        }
    }

    /* renamed from: g */
    public void mo21085g(Rect rect) {
        mo21085g(rect);
    }

    public CameraPreview getCameraPreview() {
        return this;
    }

    public boolean getSpotting() {
        return this.f6787t;
    }

    /* renamed from: n */
    public void mo21151n() {
        mo21081b();
    }

    /* renamed from: o */
    public final int mo21152o(int i) {
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

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6793z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (C1328a.m178l()) {
            C1328a.m171e("两次 onPreviewFrame 时间间隔：" + (System.currentTimeMillis() - this.f6792y));
            this.f6792y = System.currentTimeMillis();
        }
        if (mo21084f()) {
            try {
                mo21155p(bArr, camera);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f6787t) {
            C1331d dVar = this.f6788u;
            if (dVar == null || !(dVar.getStatus() == AsyncTask.Status.PENDING || this.f6788u.getStatus() == AsyncTask.Status.RUNNING)) {
                C1331d dVar2 = new C1331d(camera, bArr, this, C1328a.m179m(getContext()));
                dVar2.mo14995d();
                this.f6788u = dVar2;
            }
        }
    }

    /* renamed from: p */
    public final void mo21155p(byte[] bArr, Camera camera) {
        if (mo21084f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f6783B >= 150) {
                this.f6783B = currentTimeMillis;
                long j = 0;
                long j2 = (long) (camera.getParameters().getPreviewSize().width * camera.getParameters().getPreviewSize().height);
                if (Math.abs(((float) bArr.length) - (((float) j2) * 1.5f)) < 1.0E-5f) {
                    boolean z = false;
                    for (int i = 0; ((long) i) < j2; i += 10) {
                        j += ((long) bArr[i]) & 255;
                    }
                    long j3 = j / (j2 / ((long) 10));
                    long[] jArr = f6781D;
                    int length = this.f6784C % jArr.length;
                    this.f6784C = length;
                    jArr[length] = j3;
                    this.f6784C = length + 1;
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
                    C3740f fVar = this.f6786s;
                    if (fVar != null) {
                        fVar.onCameraAmbientBrightnessChanged(z);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public final boolean mo21156q(PointF[] pointFArr, String str) {
        if (this.f6785r == null || pointFArr == null || pointFArr.length < 1) {
            return false;
        }
        ValueAnimator valueAnimator = this.f6793z;
        if ((valueAnimator != null && valueAnimator.isRunning()) || System.currentTimeMillis() - this.f6782A < 1200) {
            return true;
        }
        Camera.Parameters parameters = this.f6785r.getParameters();
        if (!parameters.isZoomSupported()) {
            return false;
        }
        float f = pointFArr[0].x;
        float f2 = pointFArr[0].y;
        float f3 = pointFArr[1].x;
        float f4 = pointFArr[1].y;
        float abs = Math.abs(f - f3);
        float abs2 = Math.abs(f2 - f4);
        Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
        int maxZoom = parameters.getMaxZoom();
        post(new C3737c(parameters.getZoom(), maxZoom / 4, maxZoom, str));
        return true;
    }

    /* renamed from: r */
    public final void mo21157r() {
        setDelegate(new C3735a());
        setId(R$id.bgaqrcode_camera_preview);
    }

    /* renamed from: s */
    public void mo21158s(C1332e eVar) {
        String str;
        if (this.f6786s != null) {
            if (eVar == null) {
                str = null;
            } else {
                str = eVar.f317a;
            }
            this.f6786s.onScanQRCodeSuccess(str);
        }
    }

    public void setDelegate(C3740f fVar) {
        this.f6786s = fVar;
    }

    /* renamed from: t */
    public void mo21160t(C1332e eVar) {
        String str;
        if (this.f6787t) {
            if (eVar == null) {
                str = null;
            } else {
                str = eVar.f317a;
            }
            if (TextUtils.isEmpty(str)) {
                try {
                    if (this.f6785r != null) {
                        this.f6785r.setOneShotPreviewCallback(this);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                this.f6787t = false;
                try {
                    if (this.f6786s != null) {
                        this.f6786s.onScanQRCodeSuccess(str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: u */
    public void mo21161u() {
        postDelayed(new C3736b(), mo21084f() ? 0 : 500);
    }

    /* renamed from: v */
    public abstract C1332e mo21162v(Bitmap bitmap);

    /* renamed from: w */
    public abstract C1332e mo21163w(byte[] bArr, int i, int i2, boolean z);

    /* renamed from: x */
    public final void mo21164x() {
        if (this.f6787t && mo21084f()) {
            try {
                this.f6785r.setOneShotPreviewCallback(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: y */
    public abstract void mo21165y();

    /* renamed from: z */
    public final void mo21166z(int i, int i2, String str) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        this.f6793z = ofInt;
        ofInt.addUpdateListener(new C3738d());
        this.f6793z.addListener(new C3739e(str));
        this.f6793z.setDuration(600);
        this.f6793z.setRepeatCount(0);
        this.f6793z.start();
        this.f6782A = System.currentTimeMillis();
    }
}
