package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.PreviewConfig;
import androidx.core.view.MarginLayoutParamsCompat;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p436b.p438c.C7288a;
import p040c.p429r.p460b.p461a.p462a.C7526w;
import p040c.p429r.p460b.p461a.p462a.C7533z0;

@Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0014J\b\u0010'\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\"H\u0014J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0014J\b\u0010+\u001a\u00020\"H\u0002J\b\u0010,\u001a\u00020\"H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001e¨\u0006."}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WineLabelScannerActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "fileLabel", "Ljava/io/File;", "getFileLabel", "()Ljava/io/File;", "fileLabel$delegate", "Lkotlin/Lazy;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "getImageCapture", "()Landroidx/camera/core/ImageCapture;", "imageCapture$delegate", "isFlash", "", "pathLabel", "", "getPathLabel", "()Ljava/lang/String;", "pathLabel$delegate", "preview", "Landroidx/camera/core/Preview;", "getPreview", "()Landroidx/camera/core/Preview;", "setPreview", "(Landroidx/camera/core/Preview;)V", "typeScanner", "getTypeScanner", "setTypeScanner", "(Ljava/lang/String;)V", "bindLayout", "", "goBackTakePhoto", "", "file", "gotoWineLpActivity", "initCamera", "initWidgets", "onDestroy", "onResume", "openOrCloseFlashlight", "setListeners", "takePicture", "updateTransform", "Companion", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/winelabelscanner")
/* compiled from: WineLabelScannerActivity.kt */
public final class WineLabelScannerActivity extends BaseActivity {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy fileLabel$delegate = LazyKt__LazyJVMKt.lazy(new WineLabelScannerActivity$fileLabel$2(this));
    @NotNull
    public final Lazy imageCapture$delegate = LazyKt__LazyJVMKt.lazy(WineLabelScannerActivity$imageCapture$2.INSTANCE);
    public boolean isFlash;
    @NotNull
    public final Lazy pathLabel$delegate = LazyKt__LazyJVMKt.lazy(new WineLabelScannerActivity$pathLabel$2(this));
    public Preview preview;
    @Autowired(name = "wine_scanner")
    public String typeScanner;

    @Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/WineLabelScannerActivity$Companion;", "", "()V", "gotoWLabScanner", "", "activity", "Landroid/app/Activity;", "typeScanner", "", "gotoWLabScannerForResult", "requestCode", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WineLabelScannerActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void gotoWLabScanner(@NotNull Activity activity, @NotNull String str) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            Intrinsics.checkNotNullParameter(str, "typeScanner");
            Intent intent = new Intent(activity, WineLabelScannerActivity.class);
            intent.putExtra(KeyConst.KEY_WINE_SCANNER, str);
            activity.startActivity(intent);
        }

        public final void gotoWLabScannerForResult(@NotNull Activity activity, @NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            Intrinsics.checkNotNullParameter(str, "typeScanner");
            Intent intent = new Intent(activity, WineLabelScannerActivity.class);
            intent.putExtra(KeyConst.KEY_WINE_SCANNER, str);
            activity.startActivityForResult(intent, i);
        }
    }

    private final ImageCapture getImageCapture() {
        return (ImageCapture) this.imageCapture$delegate.getValue();
    }

    private final void goBackTakePhoto(File file) {
        String path = file.getPath();
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("path", path);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void gotoWineLpActivity() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.WineLabelPictureActivity);
        a.withString("path", getPathLabel());
        a.withString(KeyConst.KEY_WINE_SCANNER, getTypeScanner());
        a.navigation();
        finish();
    }

    /* access modifiers changed from: private */
    public final void initCamera() {
        float b = (float) C7288a.m21422b(this);
        View _$_findCachedViewById = _$_findCachedViewById(R$id.view_camera);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_camera");
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
        int marginStart = (int) (((b - (((float) (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0)) * 2.0f)) / ((float) 3)) * ((float) 4));
        StringBuilder sb = new StringBuilder();
        sb.append("START---");
        View _$_findCachedViewById2 = _$_findCachedViewById(R$id.view_camera);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "view_camera");
        ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById2.getLayoutParams();
        sb.append(layoutParams2 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams2) : 0);
        sb.append("-----");
        sb.append(marginStart);
        sb.toString();
        ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(R$id.view_camera).getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = marginStart;
            _$_findCachedViewById(R$id.view_camera).setLayoutParams(layoutParams3);
            PreviewConfig.Builder builder = new PreviewConfig.Builder();
            builder.setLensFacing(CameraX.LensFacing.BACK);
            builder.setTargetResolution(new Size(((TextureView) _$_findCachedViewById(R$id.texture_view)).getWidth(), ((TextureView) _$_findCachedViewById(R$id.texture_view)).getHeight()));
            setPreview(new Preview(builder.build()));
            getPreview().setOnPreviewOutputUpdateListener(new C7526w(this));
            CameraX.bindToLifecycle(this, getPreview(), getImageCapture());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: initCamera$lambda-2  reason: not valid java name */
    public static final void m27143initCamera$lambda2(WineLabelScannerActivity wineLabelScannerActivity, Preview.PreviewOutput previewOutput) {
        Intrinsics.checkNotNullParameter(wineLabelScannerActivity, "this$0");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("setOnPreviewOutputUpdateListener : ", previewOutput.getTextureSize()));
        ViewParent parent = ((TextureView) wineLabelScannerActivity._$_findCachedViewById(R$id.texture_view)).getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView((TextureView) wineLabelScannerActivity._$_findCachedViewById(R$id.texture_view));
            viewGroup.addView((TextureView) wineLabelScannerActivity._$_findCachedViewById(R$id.texture_view), 0);
            ((TextureView) wineLabelScannerActivity._$_findCachedViewById(R$id.texture_view)).setSurfaceTexture(previewOutput.getSurfaceTexture());
            wineLabelScannerActivity.updateTransform();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: private */
    public final void openOrCloseFlashlight() {
        if (!this.isFlash) {
            ((IconFontView) _$_findCachedViewById(R$id.flash_text)).setText(R$string.icon_apliances_lightning_on);
            this.isFlash = true;
            return;
        }
        ((IconFontView) _$_findCachedViewById(R$id.flash_text)).setText(R$string.icon_apliances_lightning);
        this.isFlash = false;
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27144setListeners$lambda0(WineLabelScannerActivity wineLabelScannerActivity, View view) {
        Intrinsics.checkNotNullParameter(wineLabelScannerActivity, "this$0");
        wineLabelScannerActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void takePicture() {
        getImageCapture().takePicture(getFileLabel(), new WineLabelScannerActivity$takePicture$1(this));
    }

    private final void updateTransform() {
        int i;
        if (((TextureView) _$_findCachedViewById(R$id.texture_view)).getDisplay() != null) {
            Matrix matrix = new Matrix();
            float width = ((float) ((TextureView) _$_findCachedViewById(R$id.texture_view)).getWidth()) / 2.0f;
            float height = ((float) ((TextureView) _$_findCachedViewById(R$id.texture_view)).getHeight()) / 2.0f;
            int rotation = ((TextureView) _$_findCachedViewById(R$id.texture_view)).getDisplay().getRotation();
            if (rotation == 0) {
                i = 0;
            } else if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = BottomAppBarTopEdgeTreatment.ANGLE_UP;
            } else {
                return;
            }
            matrix.postRotate(-((float) i), width, height);
            ((TextureView) _$_findCachedViewById(R$id.texture_view)).setTransform(matrix);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.activity_wine_label_scanner;
    }

    @NotNull
    public final File getFileLabel() {
        Object value = this.fileLabel$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-fileLabel>(...)");
        return (File) value;
    }

    @NotNull
    public final String getPathLabel() {
        Object value = this.pathLabel$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-pathLabel>(...)");
        return (String) value;
    }

    @NotNull
    public final Preview getPreview() {
        Preview preview2 = this.preview;
        if (preview2 != null) {
            return preview2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preview");
        return null;
    }

    @NotNull
    public final String getTypeScanner() {
        String str = this.typeScanner;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("typeScanner");
        return null;
    }

    public void initWidgets() {
        initCamera();
    }

    public void onDestroy() {
        super.onDestroy();
        if (getPreview().isTorchOn()) {
            getPreview().enableTorch(false);
        }
        CameraX.unbindAll();
    }

    public void onResume() {
        super.onResume();
        if (getPreview().isTorchOn()) {
            getPreview().enableTorch(false);
        }
    }

    public void setListeners() {
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setOnClickListener(new C7533z0(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.cancel_text);
        Intrinsics.checkNotNullExpressionValue(textView, "cancel_text");
        JuConnectExtKt.singleClickListener(textView, new WineLabelScannerActivity$setListeners$2(this));
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.camera_text);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "camera_text");
        JuConnectExtKt.singleClickListener(iconFontView, new WineLabelScannerActivity$setListeners$3(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.flash_text);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "flash_text");
        JuConnectExtKt.singleClickListener(iconFontView2, new WineLabelScannerActivity$setListeners$4(this));
    }

    public final void setPreview(@NotNull Preview preview2) {
        Intrinsics.checkNotNullParameter(preview2, "<set-?>");
        this.preview = preview2;
    }

    public final void setTypeScanner(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.typeScanner = str;
    }
}
