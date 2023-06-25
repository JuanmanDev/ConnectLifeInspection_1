package p034b.p035a.p036a.p037a;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import p307cn.bingoogolapple.qrcode.core.QRCodeView;

/* renamed from: b.a.a.a.c */
/* compiled from: ProcessDataTask */
public class C1330c extends AsyncTask<Void, Void, C1332e> {

    /* renamed from: g */
    public static long f303g;

    /* renamed from: a */
    public Camera f304a;

    /* renamed from: b */
    public byte[] f305b;

    /* renamed from: c */
    public boolean f306c;

    /* renamed from: d */
    public String f307d;

    /* renamed from: e */
    public Bitmap f308e;

    /* renamed from: f */
    public WeakReference<QRCodeView> f309f;

    public C1330c(Camera camera, byte[] bArr, QRCodeView qRCodeView, boolean z) {
        this.f304a = camera;
        this.f305b = bArr;
        this.f309f = new WeakReference<>(qRCodeView);
        this.f306c = z;
    }

    /* renamed from: a */
    public void mo14984a() {
        if (getStatus() != AsyncTask.Status.FINISHED) {
            cancel(true);
        }
    }

    /* renamed from: b */
    public C1332e doInBackground(Void... voidArr) {
        QRCodeView qRCodeView = (QRCodeView) this.f309f.get();
        if (qRCodeView == null) {
            return null;
        }
        String str = this.f307d;
        if (str != null) {
            return qRCodeView.mo21117o(C1328a.m175i(str));
        }
        Bitmap bitmap = this.f308e;
        if (bitmap != null) {
            C1332e o = qRCodeView.mo21117o(bitmap);
            this.f308e = null;
            return o;
        }
        if (C1328a.m178l()) {
            C1328a.m171e("两次任务执行的时间间隔：" + (System.currentTimeMillis() - f303g));
            f303g = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1332e e = mo14989e(qRCodeView);
        if (C1328a.m178l()) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (e == null || TextUtils.isEmpty(e.f317a)) {
                C1328a.m174h("识别失败时间为：" + currentTimeMillis2);
            } else {
                C1328a.m171e("识别成功时间为：" + currentTimeMillis2);
            }
        }
        return e;
    }

    /* renamed from: c */
    public void onPostExecute(C1332e eVar) {
        QRCodeView qRCodeView = (QRCodeView) this.f309f.get();
        if (qRCodeView != null) {
            if (this.f307d == null && this.f308e == null) {
                qRCodeView.mo21114l(eVar);
                return;
            }
            this.f308e = null;
            qRCodeView.mo21113k(eVar);
        }
    }

    /* renamed from: d */
    public C1330c mo14987d() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    /* renamed from: e */
    public final C1332e mo14989e(QRCodeView qRCodeView) {
        int i;
        int i2;
        Exception e;
        byte[] bArr = this.f305b;
        if (bArr == null) {
            return null;
        }
        try {
            Camera.Size previewSize = this.f304a.getParameters().getPreviewSize();
            i = previewSize.width;
            try {
                i2 = previewSize.height;
                try {
                    if (this.f306c) {
                        bArr = new byte[this.f305b.length];
                        for (int i3 = 0; i3 < i2; i3++) {
                            for (int i4 = 0; i4 < i; i4++) {
                                bArr[(((i4 * i2) + i2) - i3) - 1] = this.f305b[(i3 * i) + i4];
                            }
                        }
                        int i5 = i;
                        i = i2;
                        i2 = i5;
                    }
                    return qRCodeView.mo21120p(bArr, i, i2, false);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (!(i == 0 || i2 == 0)) {
                        try {
                            C1328a.m171e("识别失败重试");
                            return qRCodeView.mo21120p(bArr, i, i2, true);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    }
                    return null;
                }
            } catch (Exception e4) {
                Exception exc = e4;
                i2 = 0;
                e = exc;
                e.printStackTrace();
                C1328a.m171e("识别失败重试");
                return qRCodeView.mo21120p(bArr, i, i2, true);
            }
        } catch (Exception e5) {
            i = 0;
            e = e5;
            i2 = 0;
            e.printStackTrace();
            C1328a.m171e("识别失败重试");
            return qRCodeView.mo21120p(bArr, i, i2, true);
        }
    }

    public void onCancelled() {
        super.onCancelled();
        this.f309f.clear();
        this.f308e = null;
        this.f305b = null;
    }
}
