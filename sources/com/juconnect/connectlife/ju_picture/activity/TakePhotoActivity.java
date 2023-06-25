package com.juconnect.connectlife.ju_picture.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.support.p025v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Rational;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureConfig;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.PreviewConfig;
import androidx.camera.core.UseCase;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import com.juconnect.connectlife.ju_picture.JuPicturePlugin;
import com.juconnect.connectlife.ju_picture.R$drawable;
import com.juconnect.connectlife.ju_picture.R$id;
import com.juconnect.connectlife.ju_picture.R$layout;
import com.juconnect.connectlife.ju_picture.util.BitmapUtil;
import com.juconnect.connectlife.ju_picture.util.FileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p302b.p515c.p516a.C7738a;
import p040c.p301y.p302b.p515c.p516a.C7739b;
import p040c.p301y.p302b.p515c.p516a.C7740c;
import p040c.p301y.p302b.p515c.p516a.C7741d;
import p040c.p301y.p302b.p515c.p516a.C7742e;
import p040c.p472t.p473a.C7585u;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\rH\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\"\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0012\u00102\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020\u0018H\u0014J-\u00106\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00042\u000e\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d082\u0006\u00109\u001a\u00020:H\u0016¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\u0018H\u0014J\b\u0010=\u001a\u00020\u0018H\u0002J\b\u0010>\u001a\u00020\u0018H\u0002J\b\u0010?\u001a\u00020\u0018H\u0002J\u0012\u0010@\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010'H\u0002J\b\u0010B\u001a\u00020\u0018H\u0002J\u001a\u0010C\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006D"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/activity/TakePhotoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CODE_PERMISSION_CAMERA", "", "READ_EXTERNAL_STORAGE_REQUEST", "REQUEST_PICK", "flashView", "Landroid/widget/ImageView;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "img_back", "isFalsh", "", "isTakePhoto", "mPreview", "Landroidx/camera/core/Preview;", "rotationDegrees", "selectPhotoView", "takePhotoView", "textureView", "Landroid/view/TextureView;", "buildPreview", "compressImageAndReply", "", "file", "Ljava/io/File;", "generateImageFile", "getPath", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getPerForR", "goToSettings", "gotoPhoto", "haveStoragePermission", "imageProxyToBitmap", "Landroid/graphics/Bitmap;", "image", "Landroidx/camera/core/ImageProxy;", "initCamera", "initImageCapture", "initView", "onActivityResult", "requestCode", "resultCode", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openOrCloseFlashlight", "requestCameraPermission", "requestPermission", "saveImage", "bitmap", "updateTransform", "uriToFileQ", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TakePhotoActivity.kt */
public final class TakePhotoActivity extends AppCompatActivity {
    public final int CODE_PERMISSION_CAMERA = 1;
    public final int READ_EXTERNAL_STORAGE_REQUEST = UserProfileActivity.READ_EXTERNAL_STORAGE_REQUEST;
    public final int REQUEST_PICK = 101;
    public ImageView flashView;
    public ImageCapture imageCapture;
    public ImageView img_back;
    public boolean isFalsh;
    public boolean isTakePhoto = true;
    @Nullable
    public Preview mPreview;
    public int rotationDegrees;
    public ImageView selectPhotoView;
    public ImageView takePhotoView;
    public TextureView textureView;

    private final Preview buildPreview() {
        PreviewConfig.Builder builder = new PreviewConfig.Builder();
        builder.setLensFacing(CameraX.LensFacing.BACK);
        Preview preview = new Preview(builder.build());
        preview.setOnPreviewOutputUpdateListener(new C7741d(this));
        return preview;
    }

    /* renamed from: buildPreview$lambda-10  reason: not valid java name */
    public static final void m27249buildPreview$lambda10(TakePhotoActivity takePhotoActivity, Preview.PreviewOutput previewOutput) {
        Intrinsics.checkNotNullParameter(takePhotoActivity, "this$0");
        TextureView textureView2 = takePhotoActivity.textureView;
        TextureView textureView3 = null;
        if (textureView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureView");
            textureView2 = null;
        }
        ViewParent parent = textureView2.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            TextureView textureView4 = takePhotoActivity.textureView;
            if (textureView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
                textureView4 = null;
            }
            viewGroup.removeView(textureView4);
            TextureView textureView5 = takePhotoActivity.textureView;
            if (textureView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
                textureView5 = null;
            }
            viewGroup.addView(textureView5, 0);
            TextureView textureView6 = takePhotoActivity.textureView;
            if (textureView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
            } else {
                textureView3 = textureView6;
            }
            textureView3.setSurfaceTexture(previewOutput.getSurfaceTexture());
            takePhotoActivity.updateTransform();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = r3.getAbsolutePath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getPath(android.content.Context r3, android.net.Uri r4) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L_0x000d
            com.juconnect.connectlife.ju_picture.util.FileUtil$Companion r0 = com.juconnect.connectlife.ju_picture.util.FileUtil.Companion
            java.lang.String r3 = r0.getRealFilePathFromUri(r3, r4)
            return r3
        L_0x000d:
            java.io.File r3 = r2.uriToFileQ(r3, r4)
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.String r3 = r3.getAbsolutePath()
            if (r3 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r4 = r3
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity.getPath(android.content.Context, android.net.Uri):java.lang.String");
    }

    private final void getPerForR() {
        if (C7585u.m21554c(this, CollectionsKt__CollectionsJVMKt.listOf("android.permission.CAMERA"))) {
            initCamera();
            return;
        }
        C7585u l = C7585u.m21560l(this);
        l.mo33042g("android.permission.CAMERA");
        l.mo33043h(new TakePhotoActivity$getPerForR$1(this));
    }

    private final void goToSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(Intrinsics.stringPlus("package:", getPackageName())));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        startActivity(intent);
    }

    private final void gotoPhoto() {
        try {
            Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            startActivityForResult(intent, this.REQUEST_PICK);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final boolean haveStoragePermission() {
        return ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* access modifiers changed from: private */
    public final Bitmap imageProxyToBitmap(ImageProxy imageProxy) {
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "image.planes[0].buffer");
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
        Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(bytes, 0, bytes.size)");
        return decodeByteArray;
    }

    /* access modifiers changed from: private */
    public final void initCamera() {
        if (this.mPreview == null) {
            this.mPreview = buildPreview();
        }
        initImageCapture();
        UseCase[] useCaseArr = new UseCase[2];
        useCaseArr[0] = this.mPreview;
        ImageCapture imageCapture2 = this.imageCapture;
        if (imageCapture2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
            imageCapture2 = null;
        }
        useCaseArr[1] = imageCapture2;
        CameraX.bindToLifecycle(this, useCaseArr);
    }

    private final void initImageCapture() {
        ImageCaptureConfig build = new ImageCaptureConfig.Builder().setTargetAspectRatio(new Rational(9, 16)).setCaptureMode(ImageCapture.CaptureMode.MIN_LATENCY).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…NCY)\n            .build()");
        this.imageCapture = new ImageCapture(build);
        ImageView imageView = this.takePhotoView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("takePhotoView");
            imageView = null;
        }
        imageView.setOnClickListener(new C7742e(this));
    }

    /* renamed from: initImageCapture$lambda-5  reason: not valid java name */
    public static final void m27250initImageCapture$lambda5(TakePhotoActivity takePhotoActivity, View view) {
        Preview preview;
        Intrinsics.checkNotNullParameter(takePhotoActivity, "this$0");
        boolean z = takePhotoActivity.isFalsh;
        if (z && (preview = takePhotoActivity.mPreview) != null) {
            preview.enableTorch(z);
        }
        takePhotoActivity.generateImageFile();
        ImageCapture imageCapture2 = takePhotoActivity.imageCapture;
        if (imageCapture2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
            imageCapture2 = null;
        }
        imageCapture2.takePicture(new TakePhotoActivity$initImageCapture$1$1(takePhotoActivity));
    }

    private final void initView() {
        View findViewById = findViewById(R$id.texture_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.texture_view)");
        this.textureView = (TextureView) findViewById;
        View findViewById2 = findViewById(R$id.iv_take_photo);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.iv_take_photo)");
        this.takePhotoView = (ImageView) findViewById2;
        View findViewById3 = findViewById(R$id.iv_select_photo);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.iv_select_photo)");
        this.selectPhotoView = (ImageView) findViewById3;
        View findViewById4 = findViewById(R$id.iv_flash);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.iv_flash)");
        this.flashView = (ImageView) findViewById4;
        View findViewById5 = findViewById(R$id.img_back);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.img_back)");
        this.img_back = (ImageView) findViewById5;
        ImageView imageView = this.selectPhotoView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectPhotoView");
            imageView = null;
        }
        imageView.setOnClickListener(new C7740c(this));
        ImageView imageView3 = this.flashView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashView");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new C7739b(this));
        ImageView imageView4 = this.img_back;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("img_back");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setOnClickListener(new C7738a(this));
    }

    /* renamed from: initView$lambda-0  reason: not valid java name */
    public static final void m27251initView$lambda0(TakePhotoActivity takePhotoActivity, View view) {
        Intrinsics.checkNotNullParameter(takePhotoActivity, "this$0");
        takePhotoActivity.isTakePhoto = false;
        takePhotoActivity.requestCameraPermission();
    }

    /* renamed from: initView$lambda-1  reason: not valid java name */
    public static final void m27252initView$lambda1(TakePhotoActivity takePhotoActivity, View view) {
        Intrinsics.checkNotNullParameter(takePhotoActivity, "this$0");
        takePhotoActivity.openOrCloseFlashlight();
    }

    /* renamed from: initView$lambda-2  reason: not valid java name */
    public static final void m27253initView$lambda2(TakePhotoActivity takePhotoActivity, View view) {
        Intrinsics.checkNotNullParameter(takePhotoActivity, "this$0");
        takePhotoActivity.finish();
    }

    private final void openOrCloseFlashlight() {
        ImageView imageView = null;
        if (!this.isFalsh) {
            ImageView imageView2 = this.flashView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flashView");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(R$drawable.ic_baseline_flash_on_24);
            this.isFalsh = true;
            return;
        }
        ImageView imageView3 = this.flashView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashView");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(R$drawable.ic_baseline_flash_off_24);
        this.isFalsh = false;
    }

    private final void requestCameraPermission() {
        if (Build.VERSION.SDK_INT <= 28) {
            if (!haveStoragePermission()) {
                requestPermission();
            } else if (this.isTakePhoto) {
                getPerForR();
            } else {
                gotoPhoto();
            }
        } else if (this.isTakePhoto) {
            getPerForR();
        } else {
            gotoPhoto();
        }
    }

    private final void requestPermission() {
        if (!haveStoragePermission()) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.READ_EXTERNAL_STORAGE_REQUEST);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveImage(android.graphics.Bitmap r6) {
        /*
            r5 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = "image/png"
            r0.put(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "connect_life__picture_"
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r2 = ".png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "_display_name"
            r0.put(r2, r1)
            android.content.ContentResolver r1 = r5.getContentResolver()
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r0 = r1.insert(r2, r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x004e
        L_0x0038:
            android.content.ContentResolver r1 = r5.getContentResolver()
            java.io.OutputStream r1 = r1.openOutputStream(r0)
            r2 = 0
            if (r6 != 0) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x005f }
            r4 = 20
            r6.compress(r3, r4, r1)     // Catch:{ all -> 0x005f }
        L_0x004b:
            kotlin.p639io.CloseableKt.closeFinally(r1, r2)
        L_0x004e:
            com.juconnect.connectlife.ju_picture.JuPicturePlugin$Companion r6 = com.juconnect.connectlife.ju_picture.JuPicturePlugin.Companion
            com.juconnect.connectlife.ju_picture.JuPicturePlugin r6 = r6.getJuPicturePlugin()
            if (r6 != 0) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.takePhotoResult(r0)
        L_0x005e:
            return
        L_0x005f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity.saveImage(android.graphics.Bitmap):void");
    }

    private final void updateTransform() {
        int i;
        TextureView textureView2 = this.textureView;
        TextureView textureView3 = null;
        if (textureView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureView");
            textureView2 = null;
        }
        if (textureView2.getDisplay() != null) {
            Matrix matrix = new Matrix();
            TextureView textureView4 = this.textureView;
            if (textureView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
                textureView4 = null;
            }
            float width = ((float) textureView4.getWidth()) / 2.0f;
            TextureView textureView5 = this.textureView;
            if (textureView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
                textureView5 = null;
            }
            float height = ((float) textureView5.getHeight()) / 2.0f;
            TextureView textureView6 = this.textureView;
            if (textureView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
                textureView6 = null;
            }
            int rotation = textureView6.getDisplay().getRotation();
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
            this.rotationDegrees = i;
            matrix.postRotate(-((float) i), width, height);
            TextureView textureView7 = this.textureView;
            if (textureView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureView");
            } else {
                textureView3 = textureView7;
            }
            textureView3.setTransform(matrix);
        }
    }

    @RequiresApi(29)
    private final File uriToFileQ(Context context, Uri uri) {
        if (Intrinsics.areEqual((Object) uri.getScheme(), (Object) "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!Intrinsics.areEqual((Object) uri.getScheme(), (Object) BrowserServiceFileProvider.CONTENT_SCHEME)) {
            return null;
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            String str = System.currentTimeMillis() + Random.Default.nextInt(0, 9999) + '.' + MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            File file = new File(context.getCacheDir().getAbsolutePath() + '/' + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileUtils.copy(openInputStream, fileOutputStream);
            fileOutputStream.close();
            openInputStream.close();
            return file;
        }
    }

    public final void compressImageAndReply(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        long length = file.length();
        "文件压缩之前大小" + length + " kb";
        while (true) {
            long j = (long) 1024;
            if (length / j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                break;
            }
            BitmapUtil bitmapUtil = BitmapUtil.INSTANCE;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            String absolutePath2 = getApplication().getCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "application.cacheDir.absolutePath");
            String compressImage = bitmapUtil.compressImage(absolutePath, absolutePath2);
            if (compressImage != null) {
                length = new File(compressImage).length();
                "文件压缩之前大小" + (length / j) + " kb";
            } else {
                JuPicturePlugin juPicturePlugin = JuPicturePlugin.Companion.getJuPicturePlugin();
                if (juPicturePlugin != null) {
                    juPicturePlugin.takePhotoError("压错图片错误");
                }
            }
        }
        JuPicturePlugin juPicturePlugin2 = JuPicturePlugin.Companion.getJuPicturePlugin();
        if (juPicturePlugin2 != null) {
            String absolutePath3 = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath3, "file.absolutePath");
            juPicturePlugin2.takePhotoResult(absolutePath3);
        }
    }

    @NotNull
    public final File generateImageFile() {
        File file;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mime_type", "image/png");
        contentValues.put("_display_name", "connect_life__picture_" + System.currentTimeMillis() + ".jpg");
        Uri insert = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        String str = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (insert != null) {
                str = insert.getPath();
            }
            if (str == null) {
                str = "relative_pathconnect_life__picture_" + System.currentTimeMillis() + ".jpg";
            }
            file = new File(str);
        } else {
            if (insert != null) {
                str = insert.getPath();
            }
            file = new File(str);
        }
        return file;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        Intrinsics.stringPlus("selece photo onActivityResult，resultCode：", Integer.valueOf(i2));
        if (this.REQUEST_PICK != i) {
            return;
        }
        if (-1 == i2) {
            if (intent == null) {
                uri = null;
            } else {
                uri = intent.getData();
            }
            if (uri != null) {
                String realFilePathFromUri = FileUtil.Companion.getRealFilePathFromUri(this, uri);
                if (realFilePathFromUri == null) {
                    realFilePathFromUri = "";
                }
                if (TextUtils.isEmpty(realFilePathFromUri)) {
                    JuPicturePlugin juPicturePlugin = JuPicturePlugin.Companion.getJuPicturePlugin();
                    if (juPicturePlugin != null) {
                        juPicturePlugin.takePhotoError("没有获取到文件路径");
                    }
                } else {
                    String compressImage = BitmapUtil.INSTANCE.compressImage(uri, (Context) this);
                    if (compressImage != null) {
                        JuPicturePlugin juPicturePlugin2 = JuPicturePlugin.Companion.getJuPicturePlugin();
                        if (juPicturePlugin2 != null) {
                            juPicturePlugin2.takePhotoResult(compressImage);
                        }
                    } else {
                        JuPicturePlugin juPicturePlugin3 = JuPicturePlugin.Companion.getJuPicturePlugin();
                        if (juPicturePlugin3 != null) {
                            juPicturePlugin3.takePhotoError("文件路径解析失败！");
                        }
                    }
                    finish();
                }
            }
            finish();
            return;
        }
        finish();
        JuPicturePlugin juPicturePlugin4 = JuPicturePlugin.Companion.getJuPicturePlugin();
        if (juPicturePlugin4 != null) {
            juPicturePlugin4.takePhotoError("未选择图片！");
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_take_photo);
        initView();
        requestCameraPermission();
    }

    public void onDestroy() {
        super.onDestroy();
        CameraX.unbindAll();
        Preview preview = this.mPreview;
        if (preview != null) {
            preview.isTorchOn();
            Preview preview2 = this.mPreview;
            if (preview2 != null) {
                preview2.enableTorch(false);
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.READ_EXTERNAL_STORAGE_REQUEST) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    Toast.makeText(this, "Permission request failed!", 0).show();
                } else {
                    goToSettings();
                }
            } else if (this.isTakePhoto) {
                getPerForR();
            } else {
                gotoPhoto();
            }
        }
    }

    public void onResume() {
        super.onResume();
        try {
            if (this.mPreview != null) {
                Preview preview = this.mPreview;
                Boolean valueOf = preview == null ? null : Boolean.valueOf(preview.isTorchOn());
                Intrinsics.checkNotNull(valueOf);
                if (valueOf.booleanValue()) {
                    Preview preview2 = this.mPreview;
                    if (preview2 != null) {
                        preview2.enableTorch(false);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
