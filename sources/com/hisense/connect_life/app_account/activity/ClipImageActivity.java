package com.hisense.connect_life.app_account.activity;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.ClipViewLayout;
import com.hisense.connect_life.app_account.util.FileSizeUtil;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/ClipImageActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "uri", "Landroid/net/Uri;", "uriString", "", "getUriString", "()Ljava/lang/String;", "setUriString", "(Ljava/lang/String;)V", "bindLayout", "", "generateUriAndReturn", "", "getFilePathFromContentUri", "selectedVideoUri", "contentResolver", "Landroid/content/ContentResolver;", "initWidgets", "onResume", "setListeners", "writeFileByBitmap", "bitmap", "Landroid/graphics/Bitmap;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/ClipImageActivity")
/* compiled from: ClipImageActivity.kt */
public final class ClipImageActivity extends BaseActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public Uri uri;
    @Autowired(name = "uri")
    public String uriString;

    /* access modifiers changed from: private */
    public final void generateUriAndReturn() {
        Bitmap clip = ((ClipViewLayout) _$_findCachedViewById(R$id.clipViewLayout1)).clip();
        if (clip != null) {
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("bitmapSize: ", Integer.valueOf(FileSizeUtil.Companion.getBitmapSize(clip))));
            File cacheDir = getCacheDir();
            Uri fromFile = Uri.fromFile(new File(cacheDir, "cropped_" + System.currentTimeMillis() + ".jpg"));
            if (fromFile != null) {
                OutputStream outputStream = null;
                try {
                    OutputStream openOutputStream = getContentResolver().openOutputStream(fromFile);
                    if (openOutputStream != null) {
                        clip.compress(Bitmap.CompressFormat.JPEG, 60, openOutputStream);
                    }
                    if (openOutputStream != null) {
                        try {
                            openOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException unused) {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
                Intent intent = new Intent();
                intent.setData(fromFile);
                setResult(-1, intent);
                finish();
            }
        }
    }

    private final void writeFileByBitmap(Bitmap bitmap) {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath());
        File file2 = new File(file, "cropped_head_portrait.jpg");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 60, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
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
        return R$layout.activity_clip_image;
    }

    @NotNull
    public final String getFilePathFromContentUri(@NotNull Uri uri2, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri2, "selectedVideoUri");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        String[] strArr = {"_data"};
        Cursor query = contentResolver.query(uri2, strArr, (String) null, (String[]) null, (String) null);
        Intrinsics.checkNotNull(query);
        Intrinsics.checkNotNullExpressionValue(query, "contentResolver.query(se…lumn, null, null, null)!!");
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex(strArr[0]));
        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(columnIndex)");
        query.close();
        return string;
    }

    @NotNull
    public final String getUriString() {
        String str = this.uriString;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uriString");
        return null;
    }

    public void initWidgets() {
        if (getUriString() != null) {
            Uri parse = Uri.parse(getUriString());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(uriString)");
            this.uri = parse;
        }
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.image_crop));
    }

    public void onResume() {
        super.onResume();
        ((ClipViewLayout) _$_findCachedViewById(R$id.clipViewLayout1)).setVisibility(0);
        ((ClipViewLayout) _$_findCachedViewById(R$id.clipViewLayout2)).setVisibility(8);
        Uri uri2 = this.uri;
        String str = null;
        if (uri2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uri");
            uri2 = null;
        }
        ClipViewLayout clipViewLayout = (ClipViewLayout) _$_findCachedViewById(R$id.clipViewLayout1);
        StringBuilder sb = new StringBuilder();
        File externalCacheDir = getExternalCacheDir();
        if (externalCacheDir != null) {
            str = externalCacheDir.getAbsolutePath();
        }
        sb.append(str);
        sb.append(File.separator);
        sb.append("pic.jpg");
        clipViewLayout.setImageSrc(uri2, sb.toString());
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ClipImageActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.btn_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "btn_cancel");
        JuConnectExtKt.singleClickListener(textView, new ClipImageActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.bt_ok);
        Intrinsics.checkNotNullExpressionValue(textView2, "bt_ok");
        JuConnectExtKt.singleClickListener(textView2, new ClipImageActivity$setListeners$3(this));
    }

    public final void setUriString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uriString = str;
    }
}
