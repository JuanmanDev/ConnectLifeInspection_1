package com.juconnect.connectlife.ju_picture.activity;

import androidx.camera.core.ImageCapture;
import com.juconnect.connectlife.ju_picture.JuPicturePlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, mo47991d2 = {"com/juconnect/connectlife/ju_picture/activity/TakePhotoActivity$initImageCapture$1$1", "Landroidx/camera/core/ImageCapture$OnImageCapturedListener;", "onCaptureSuccess", "", "image", "Landroidx/camera/core/ImageProxy;", "rotationDegrees", "", "onError", "useCaseError", "Landroidx/camera/core/ImageCapture$UseCaseError;", "message", "", "cause", "", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TakePhotoActivity.kt */
public final class TakePhotoActivity$initImageCapture$1$1 extends ImageCapture.OnImageCapturedListener {
    public final /* synthetic */ TakePhotoActivity this$0;

    public TakePhotoActivity$initImageCapture$1$1(TakePhotoActivity takePhotoActivity) {
        this.this$0 = takePhotoActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        kotlin.jdk7.AutoCloseableKt.closeFinally(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureSuccess(@org.jetbrains.annotations.NotNull androidx.camera.core.ImageProxy r4, int r5) {
        /*
            r3 = this;
            java.lang.String r5 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity r5 = r3.this$0
            android.graphics.Bitmap r0 = r5.imageProxyToBitmap(r4)     // Catch:{ all -> 0x0022 }
            com.juconnect.connectlife.ju_picture.util.BitmapUtil r1 = com.juconnect.connectlife.ju_picture.util.BitmapUtil.INSTANCE     // Catch:{ all -> 0x0022 }
            r2 = 1119092736(0x42b40000, float:90.0)
            android.graphics.Bitmap r0 = r1.rotaingImageView(r2, r0)     // Catch:{ all -> 0x0022 }
            r5.saveImage(r0)     // Catch:{ all -> 0x0022 }
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0022 }
            r5 = 0
            kotlin.jdk7.AutoCloseableKt.closeFinally(r4, r5)
            com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity r4 = r3.this$0
            r4.finish()
            return
        L_0x0022:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity$initImageCapture$1$1.onCaptureSuccess(androidx.camera.core.ImageProxy, int):void");
    }

    public void onError(@NotNull ImageCapture.UseCaseError useCaseError, @NotNull String str, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(useCaseError, "useCaseError");
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.stringPlus("文件错误", str);
        this.this$0.finish();
        JuPicturePlugin juPicturePlugin = JuPicturePlugin.Companion.getJuPicturePlugin();
        if (juPicturePlugin != null) {
            juPicturePlugin.takePhotoError(str);
        }
    }
}
