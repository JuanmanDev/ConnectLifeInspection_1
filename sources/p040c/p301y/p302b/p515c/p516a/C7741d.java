package p040c.p301y.p302b.p515c.p516a;

import androidx.camera.core.Preview;
import com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity;

/* renamed from: c.y.b.c.a.d */
/* compiled from: lambda */
public final /* synthetic */ class C7741d implements Preview.OnPreviewOutputUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ TakePhotoActivity f14516a;

    public /* synthetic */ C7741d(TakePhotoActivity takePhotoActivity) {
        this.f14516a = takePhotoActivity;
    }

    public final void onUpdated(Preview.PreviewOutput previewOutput) {
        TakePhotoActivity.m27249buildPreview$lambda10(this.f14516a, previewOutput);
    }
}
