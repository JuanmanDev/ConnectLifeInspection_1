package com.juconnect.connectlife.ju_picture.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.exifinterface.media.ExifInterface;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/util/BitmapUtil;", "", "()V", "PHOTO_FILE_NAME", "", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "compressImage", "uri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "filePath", "savePath", "createCircleImage", "Landroid/graphics/Bitmap;", "source", "getRotateAngle", "getSmallBitmap", "rotaingImageView", "angle", "", "bitmap", "setRotateAngle", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BitmapUtil.kt */
public final class BitmapUtil {
    @NotNull
    public static final BitmapUtil INSTANCE = new BitmapUtil();
    @NotNull
    public static final String PHOTO_FILE_NAME = "PMSManagerPhoto";

    public final int calculateInSampleSize(@NotNull BitmapFactory.Options options, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i2));
        int round2 = Math.round(((float) i4) / ((float) i));
        return round < round2 ? round : round2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[SYNTHETIC, Splitter:B:19:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC, Splitter:B:29:0x0072] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String compressImage(@org.jetbrains.annotations.NotNull android.net.Uri r6, @org.jetbrains.annotations.NotNull android.content.Context r7) {
        /*
            r5 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.ContentResolver r0 = r7.getContentResolver()
            android.graphics.Bitmap r6 = android.provider.MediaStore.Images.Media.getBitmap(r0, r6)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r7.getCacheDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "warranty_"
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r3 = ".jpg"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r1 = 0
            if (r0 == 0) goto L_0x007e
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            java.io.OutputStream r7 = r7.openOutputStream(r0)     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            if (r7 == 0) goto L_0x0050
            if (r6 != 0) goto L_0x0049
            goto L_0x0050
        L_0x0049:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0070, all -> 0x0060 }
            r3 = 80
            r6.compress(r2, r3, r7)     // Catch:{ IOException -> 0x0070, all -> 0x0060 }
        L_0x0050:
            if (r7 == 0) goto L_0x005e
            r7.close()     // Catch:{ IOException -> 0x005a }
            java.lang.String r6 = r0.getPath()     // Catch:{ IOException -> 0x005a }
            return r6
        L_0x005a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x005e:
            return r1
        L_0x005f:
            r7 = r1
        L_0x0060:
            if (r7 == 0) goto L_0x006e
            r7.close()     // Catch:{ IOException -> 0x006a }
            java.lang.String r6 = r0.getPath()     // Catch:{ IOException -> 0x006a }
            return r6
        L_0x006a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x006e:
            return r1
        L_0x006f:
            r7 = r1
        L_0x0070:
            if (r7 == 0) goto L_0x007e
            r7.close()     // Catch:{ IOException -> 0x007a }
            java.lang.String r6 = r0.getPath()     // Catch:{ IOException -> 0x007a }
            return r6
        L_0x007a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_picture.util.BitmapUtil.compressImage(android.net.Uri, android.content.Context):java.lang.String");
    }

    @NotNull
    public final Bitmap createCircleImage(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "source");
        int width = bitmap.getWidth() < bitmap.getHeight() ? bitmap.getWidth() : bitmap.getHeight();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = ((float) width) / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Intrinsics.checkNotNullExpressionValue(createBitmap, AnimatedVectorDrawableCompat.TARGET);
        return createBitmap;
    }

    public final int getRotateAngle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return BottomAppBarTopEdgeTreatment.ANGLE_UP;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @NotNull
    public final Bitmap getSmallBitmap(@Nullable String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, 480, 800);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        Intrinsics.checkNotNullExpressionValue(decodeFile, "decodeFile(filePath, options)");
        return decodeFile;
    }

    @NotNull
    public final Bitmap rotaingImageView(float f, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …etHeight(), matrix, true)");
        if (!Intrinsics.areEqual((Object) createBitmap, (Object) bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    @Nullable
    public final Bitmap setRotateAngle(int i, @Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @Nullable
    public final String compressImage(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        Intrinsics.checkNotNullParameter(str2, "savePath");
        File file = new File(str);
        Bitmap smallBitmap = getSmallBitmap(str);
        int rotateAngle = getRotateAngle(str);
        if (rotateAngle != 0) {
            smallBitmap = setRotateAngle(rotateAngle, smallBitmap);
        }
        File file2 = new File(str2, file.getName());
        try {
            if (!file2.exists()) {
                file2.getParentFile().mkdirs();
            } else {
                file2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            Intrinsics.checkNotNull(smallBitmap);
            smallBitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.close();
            return file2.getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
