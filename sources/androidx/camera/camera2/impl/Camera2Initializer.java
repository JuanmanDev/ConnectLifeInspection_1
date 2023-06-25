package androidx.camera.camera2.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.Camera2AppConfig;
import androidx.camera.core.CameraX;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Camera2Initializer extends ContentProvider {
    public static final String TAG = "Camera2Initializer";

    public int delete(Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        CameraX.init(getContext(), Camera2AppConfig.create(getContext()));
        return false;
    }

    @Nullable
    public Cursor query(Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    public int update(Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
