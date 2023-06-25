package p034b.p035a.p036a.p037a;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import p307cn.bingoogolapple.qrcode.core.QRCodeViewNew;

/* renamed from: b.a.a.a.d */
/* compiled from: ProcessDataTaskNew */
public class C1331d extends AsyncTask<Void, Void, C1332e> {

    /* renamed from: g */
    public static long f310g;

    /* renamed from: a */
    public Camera f311a;

    /* renamed from: b */
    public byte[] f312b;

    /* renamed from: c */
    public boolean f313c;

    /* renamed from: d */
    public String f314d;

    /* renamed from: e */
    public Bitmap f315e;

    /* renamed from: f */
    public WeakReference<QRCodeViewNew> f316f;

    public C1331d(Camera camera, byte[] bArr, QRCodeViewNew qRCodeViewNew, boolean z) {
        this.f311a = camera;
        this.f312b = bArr;
        this.f316f = new WeakReference<>(qRCodeViewNew);
        this.f313c = z;
    }

    /* renamed from: a */
    public void mo14992a() {
        if (getStatus() != AsyncTask.Status.FINISHED) {
            cancel(true);
        }
    }

    /* renamed from: b */
    public C1332e doInBackground(Void... voidArr) {
        QRCodeViewNew qRCodeViewNew = (QRCodeViewNew) this.f316f.get();
        if (qRCodeViewNew == null) {
            return null;
        }
        String str = this.f314d;
        if (str != null) {
            return qRCodeViewNew.mo21162v(C1328a.m175i(str));
        }
        Bitmap bitmap = this.f315e;
        if (bitmap != null) {
            C1332e v = qRCodeViewNew.mo21162v(bitmap);
            this.f315e = null;
            return v;
        }
        if (C1328a.m178l()) {
            C1328a.m171e("两次任务执行的时间间隔：" + (System.currentTimeMillis() - f310g));
            f310g = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1332e e = mo14997e(qRCodeViewNew);
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
        QRCodeViewNew qRCodeViewNew = (QRCodeViewNew) this.f316f.get();
        if (qRCodeViewNew != null) {
            if (this.f314d == null && this.f315e == null) {
                qRCodeViewNew.mo21160t(eVar);
                return;
            }
            this.f315e = null;
            qRCodeViewNew.mo21158s(eVar);
        }
    }

    /* renamed from: d */
    public C1331d mo14995d() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    /* renamed from: e */
    public final C1332e mo14997e(QRCodeViewNew qRCodeViewNew) {
        int i;
        int i2;
        Exception e;
        byte[] bArr = this.f312b;
        if (bArr == null) {
            return null;
        }
        try {
            Camera.Size previewSize = this.f311a.getParameters().getPreviewSize();
            i = previewSize.width;
            try {
                i2 = previewSize.height;
                try {
                    if (this.f313c) {
                        bArr = new byte[this.f312b.length];
                        for (int i3 = 0; i3 < i2; i3++) {
                            for (int i4 = 0; i4 < i; i4++) {
                                bArr[(((i4 * i2) + i2) - i3) - 1] = this.f312b[(i3 * i) + i4];
                            }
                        }
                        int i5 = i;
                        i = i2;
                        i2 = i5;
                    }
                    return qRCodeViewNew.mo21163w(bArr, i, i2, false);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (!(i == 0 || i2 == 0)) {
                        try {
                            C1328a.m171e("识别失败重试");
                            return qRCodeViewNew.mo21163w(bArr, i, i2, true);
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
                return qRCodeViewNew.mo21163w(bArr, i, i2, true);
            }
        } catch (Exception e5) {
            i = 0;
            e = e5;
            i2 = 0;
            e.printStackTrace();
            C1328a.m171e("识别失败重试");
            return qRCodeViewNew.mo21163w(bArr, i, i2, true);
        }
    }

    public void onCancelled() {
        super.onCancelled();
        this.f316f.clear();
        this.f315e = null;
        this.f312b = null;
    }
}
