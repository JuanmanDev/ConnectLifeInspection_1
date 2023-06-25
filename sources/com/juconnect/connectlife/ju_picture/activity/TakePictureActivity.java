package com.juconnect.connectlife.ju_picture.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.support.p025v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import com.juconnect.connectlife.ju_picture.JuPicturePlugin;
import com.juconnect.connectlife.ju_picture.util.BitmapUtil;
import com.juconnect.connectlife.ju_picture.util.FileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p472t.p473a.C7585u;

@Metadata(mo47990d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J-\u0010!\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00042\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0#2\u0006\u0010$\u001a\u00020%H\u0016¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\rH\u0014J\b\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\rH\u0002J\b\u0010*\u001a\u00020\rH\u0002J\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/activity/TakePictureActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "READ_EXTERNAL_STORAGE_REQUEST", "", "REQUEST_CAPTURE", "REQUEST_PICK", "bitMap", "Landroid/graphics/Bitmap;", "contentUri", "Landroid/net/Uri;", "whereTogo", "compressImageAndReply", "", "filePath", "", "getPath", "context", "Landroid/content/Context;", "uri", "goToSettings", "gotoCamera", "gotoPhoto", "haveStoragePermission", "", "onActivityResult", "requestCode", "resultCode", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "requestCameraPermission", "requestPermission", "requestStoragePermission", "uriToFileQ", "Ljava/io/File;", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TakePictureActivity.kt */
public final class TakePictureActivity extends AppCompatActivity {
    public final int READ_EXTERNAL_STORAGE_REQUEST = UserProfileActivity.READ_EXTERNAL_STORAGE_REQUEST;
    public final int REQUEST_CAPTURE = 100;
    public final int REQUEST_PICK = 101;
    public Bitmap bitMap;
    @Nullable
    public Uri contentUri;
    public int whereTogo;

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
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_picture.activity.TakePictureActivity.getPath(android.content.Context, android.net.Uri):java.lang.String");
    }

    private final void goToSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(Intrinsics.stringPlus("package:", getPackageName())));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    public final void gotoCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("_display_name", "winecooler_user_head_image.jpg");
        contentValues.put("mime_type", "image/jpeg");
        Uri insert = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        this.contentUri = insert;
        intent.putExtra("output", insert);
        startActivityForResult(intent, this.REQUEST_CAPTURE);
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

    private final void requestCameraPermission() {
        if (C7585u.m21554c(this, CollectionsKt__CollectionsJVMKt.listOf("android.permission.CAMERA"))) {
            gotoCamera();
            return;
        }
        C7585u l = C7585u.m21560l(this);
        l.mo33042g("android.permission.CAMERA");
        l.mo33043h(new TakePictureActivity$requestCameraPermission$1(this));
    }

    private final void requestPermission() {
        if (!haveStoragePermission()) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.READ_EXTERNAL_STORAGE_REQUEST);
        }
    }

    private final void requestStoragePermission() {
        if (Build.VERSION.SDK_INT > 28) {
            gotoPhoto();
        } else if (haveStoragePermission()) {
            gotoPhoto();
        } else {
            requestPermission();
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

    public final void compressImageAndReply(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        File file = new File(str);
        long length = file.length();
        "文件压缩之前大小" + length + " kb";
        while (true) {
            long j = (long) 1024;
            if (length / j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                break;
            }
            BitmapUtil bitmapUtil = BitmapUtil.INSTANCE;
            String absolutePath = getApplication().getCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "application.cacheDir.absolutePath");
            String compressImage = bitmapUtil.compressImage(str, absolutePath);
            if (compressImage != null) {
                file = new File(compressImage);
                length = file.length();
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
            String absolutePath2 = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "file.absolutePath");
            juPicturePlugin2.takePhotoResult(absolutePath2);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Uri uri;
        String path;
        super.onActivityResult(i, i2, intent);
        Intrinsics.stringPlus("selece photo onActivityResult，resultCode：", Integer.valueOf(i2));
        String str = "";
        if (this.REQUEST_CAPTURE == i) {
            if (-1 == i2) {
                finish();
                JuPicturePlugin juPicturePlugin = JuPicturePlugin.Companion.getJuPicturePlugin();
                if (juPicturePlugin != null) {
                    Uri uri2 = this.contentUri;
                    if (!(uri2 == null || (path = getPath(this, uri2)) == null)) {
                        str = path;
                    }
                    juPicturePlugin.takePhotoResult(str);
                }
            }
        } else if (this.REQUEST_PICK != i) {
        } else {
            if (-1 == i2) {
                finish();
                if (intent == null) {
                    uri = null;
                } else {
                    uri = intent.getData();
                }
                if (uri != null) {
                    String realFilePathFromUri = FileUtil.Companion.getRealFilePathFromUri(this, uri);
                    if (realFilePathFromUri == null) {
                        realFilePathFromUri = str;
                    }
                    if (TextUtils.isEmpty(realFilePathFromUri)) {
                        JuPicturePlugin juPicturePlugin2 = JuPicturePlugin.Companion.getJuPicturePlugin();
                        if (juPicturePlugin2 != null) {
                            juPicturePlugin2.takePhotoError("没有获取到文件路径");
                            return;
                        }
                        return;
                    }
                    Intrinsics.stringPlus("REQUEST_PICK path: ", uri);
                    String compressImage = BitmapUtil.INSTANCE.compressImage(uri, (Context) this);
                    JuPicturePlugin juPicturePlugin3 = JuPicturePlugin.Companion.getJuPicturePlugin();
                    if (juPicturePlugin3 != null) {
                        if (compressImage != null) {
                            str = compressImage;
                        }
                        juPicturePlugin3.takePhotoResult(str);
                    }
                    finish();
                    return;
                }
                return;
            }
            finish();
            JuPicturePlugin juPicturePlugin4 = JuPicturePlugin.Companion.getJuPicturePlugin();
            if (juPicturePlugin4 != null) {
                juPicturePlugin4.takePhotoError("未选取照片");
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.whereTogo = extras.getInt("whereToGo", 0);
        }
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.READ_EXTERNAL_STORAGE_REQUEST) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                gotoPhoto();
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                Toast.makeText(this, "Permission request failed!", 0).show();
            } else {
                goToSettings();
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.whereTogo == 0) {
            requestCameraPermission();
        } else {
            requestStoragePermission();
        }
    }
}
