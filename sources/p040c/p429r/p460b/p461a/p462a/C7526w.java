package p040c.p429r.p460b.p461a.p462a;

import androidx.camera.core.Preview;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;

/* renamed from: c.r.b.a.a.w */
/* compiled from: lambda */
public final /* synthetic */ class C7526w implements Preview.OnPreviewOutputUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ WineLabelScannerActivity f14224a;

    public /* synthetic */ C7526w(WineLabelScannerActivity wineLabelScannerActivity) {
        this.f14224a = wineLabelScannerActivity;
    }

    public final void onUpdated(Preview.PreviewOutput previewOutput) {
        WineLabelScannerActivity.m27143initCamera$lambda2(this.f14224a, previewOutput);
    }
}
