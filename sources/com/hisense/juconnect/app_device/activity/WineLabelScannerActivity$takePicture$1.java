package com.hisense.juconnect.app_device.activity;

import androidx.camera.core.CameraX;
import androidx.camera.core.ImageCapture;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p525z.p526a.C7820f;

@Metadata(mo47990d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/WineLabelScannerActivity$takePicture$1", "Landroidx/camera/core/ImageCapture$OnImageCapturedListener;", "Landroidx/camera/core/ImageCapture$OnImageSavedListener;", "onCaptureSuccess", "", "image", "Landroidx/camera/core/ImageProxy;", "rotationDegrees", "", "onError", "useCaseError", "Landroidx/camera/core/ImageCapture$UseCaseError;", "message", "", "cause", "", "onImageSaved", "file", "Ljava/io/File;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineLabelScannerActivity.kt */
public final class WineLabelScannerActivity$takePicture$1 extends ImageCapture.OnImageCapturedListener implements ImageCapture.OnImageSavedListener {
    public final /* synthetic */ WineLabelScannerActivity this$0;

    public WineLabelScannerActivity$takePicture$1(WineLabelScannerActivity wineLabelScannerActivity) {
        this.this$0 = wineLabelScannerActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        kotlin.jdk7.AutoCloseableKt.closeFinally(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureSuccess(@org.jetbrains.annotations.NotNull androidx.camera.core.ImageProxy r2, int r3) {
        /*
            r1 = this;
            java.lang.String r3 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x000c }
            r3 = 0
            kotlin.jdk7.AutoCloseableKt.closeFinally(r2, r3)
            return
        L_0x000c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x000e }
        L_0x000e:
            r0 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.activity.WineLabelScannerActivity$takePicture$1.onCaptureSuccess(androidx.camera.core.ImageProxy, int):void");
    }

    public void onError(@NotNull ImageCapture.UseCaseError useCaseError, @NotNull String str, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(useCaseError, "useCaseError");
        Intrinsics.checkNotNullParameter(str, "message");
        CameraX.unbindAll();
        this.this$0.initCamera();
    }

    public void onImageSaved(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        StringBuilder sb = new StringBuilder();
        sb.append("图片的的原始大小is ");
        File fileLabel = this.this$0.getFileLabel();
        sb.append((fileLabel == null ? null : Long.valueOf(fileLabel.length())).longValue() / ((long) 1024));
        sb.append(" k");
        C7820f.m21850d(sb.toString(), new Object[0]);
        C7820f.m21850d(Intrinsics.stringPlus("图片的位置is ", file.getAbsolutePath()), new Object[0]);
        this.this$0.gotoWineLpActivity();
    }
}
