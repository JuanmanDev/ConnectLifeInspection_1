package com.hisense.connect_life.app_account.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.hisense.connect_life.app_account.R$styleable;
import com.hisense.connect_life.app_account.util.ClipView;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u0004\u0018\u00010&J \u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0013H\u0002J\u0006\u00100\u001a\u00020\u0010J\u0018\u00101\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001c\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u00010)2\n\b\u0002\u00104\u001a\u0004\u0018\u00010,J\u0018\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00107\u001a\u000208H\u0016J\u0018\u0010;\u001a\u00020$2\u0006\u00103\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u00010,J\u0010\u0010<\u001a\u00020\u00102\u0006\u00107\u001a\u000208H\u0002J\u001e\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ClipViewLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "DRAG", "", "NONE", "ZOOM", "clipView", "Lcom/hisense/connect_life/app_account/util/ClipView;", "imageView", "Landroid/widget/ImageView;", "mHorizontalPadding", "", "mVerticalPadding", "matrix1", "Landroid/graphics/Matrix;", "matrixValues", "", "maxScale", "mid", "Landroid/graphics/PointF;", "minScale", "mode", "oldDist", "savedMatrix", "start", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "checkBorder", "", "clip", "Landroid/graphics/Bitmap;", "decodeSampledBitmap", "filePath", "Landroid/net/Uri;", "getExifOrientation", "filepath", "", "getMatrixRectF", "Landroid/graphics/RectF;", "matrix", "getScale", "init", "initSrcPic", "uri", "forceUseAbsolutePath", "midPoint", "point", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "", "setImageSrc", "spacing", "zoomBitmap", "bitmap", "w", "h", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClipViewLayout.kt */
public final class ClipViewLayout extends RelativeLayout {
    public final int DRAG = 1;
    public final int NONE;
    public final int ZOOM = 2;
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    public ClipView clipView;
    @Nullable
    public ImageView imageView;
    public float mHorizontalPadding;
    public float mVerticalPadding;
    @NotNull
    public final Matrix matrix1 = new Matrix();
    @NotNull
    public final float[] matrixValues = new float[9];
    public final float maxScale = 4.0f;
    @NotNull
    public final PointF mid = new PointF();
    public float minScale;
    public int mode = this.NONE;
    public float oldDist = 1.0f;
    @NotNull
    public final Matrix savedMatrix = new Matrix();
    @NotNull
    public final PointF start = new PointF();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipViewLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        init(context, attributeSet);
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void checkBorder() {
        float f;
        RectF matrixRectF = getMatrixRectF(this.matrix1);
        ImageView imageView2 = this.imageView;
        Intrinsics.checkNotNull(imageView2);
        int width = imageView2.getWidth();
        ImageView imageView3 = this.imageView;
        Intrinsics.checkNotNull(imageView3);
        int height = imageView3.getHeight();
        float width2 = matrixRectF.width();
        float f2 = (float) width;
        float f3 = (float) 2;
        float f4 = this.mHorizontalPadding;
        float f5 = 0.0f;
        if (width2 >= f2 - (f3 * f4)) {
            float f6 = matrixRectF.left;
            f = f6 > f4 ? (-f6) + f4 : 0.0f;
            float f7 = matrixRectF.right;
            float f8 = this.mHorizontalPadding;
            if (f7 < f2 - f8) {
                f = (f2 - f8) - f7;
            }
        } else {
            f = 0.0f;
        }
        float height2 = matrixRectF.height();
        float f9 = (float) height;
        float f10 = this.mVerticalPadding;
        if (height2 >= f9 - (f3 * f10)) {
            float f11 = matrixRectF.top;
            if (f11 > f10) {
                f5 = (-f11) + f10;
            }
            float f12 = matrixRectF.bottom;
            float f13 = this.mVerticalPadding;
            if (f12 < f9 - f13) {
                f5 = (f9 - f13) - f12;
            }
        }
        this.matrix1.postTranslate(f, f5);
    }

    private final RectF getMatrixRectF(Matrix matrix) {
        RectF rectF = new RectF();
        ImageView imageView2 = this.imageView;
        Intrinsics.checkNotNull(imageView2);
        Drawable drawable = imageView2.getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    public static /* synthetic */ void initSrcPic$default(ClipViewLayout clipViewLayout, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        clipViewLayout.initSrcPic(uri, str);
    }

    private final void midPoint(PointF pointF, MotionEvent motionEvent) {
        float y = motionEvent.getY(0) + motionEvent.getY(1);
        float f = (float) 2;
        pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / f, y / f);
    }

    private final float spacing(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
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

    public final int calculateInSampleSize(@NotNull BitmapFactory.Options options, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i2));
        int round2 = Math.round(((float) i4) / ((float) i));
        if (round >= round2) {
            round = round2;
        }
        if (round >= 3) {
            if (((double) round) < 6.5d) {
                return 4;
            }
            if (round < 8) {
                return 8;
            }
        }
        return round;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap clip() {
        /*
            r6 = this;
            android.widget.ImageView r0 = r6.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 1
            r0.setDrawingCacheEnabled(r1)
            android.widget.ImageView r0 = r6.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.buildDrawingCache()
            com.hisense.connect_life.app_account.util.ClipView r0 = r6.clipView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Rect r0 = r0.getClipRect()
            r1 = 0
            android.widget.ImageView r2 = r6.imageView     // Catch:{ Exception -> 0x0040 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ Exception -> 0x0040 }
            android.graphics.Bitmap r2 = r2.getDrawingCache()     // Catch:{ Exception -> 0x0040 }
            int r3 = r0.left     // Catch:{ Exception -> 0x0040 }
            int r4 = r0.top     // Catch:{ Exception -> 0x0040 }
            int r5 = r0.width()     // Catch:{ Exception -> 0x0040 }
            int r0 = r0.height()     // Catch:{ Exception -> 0x0040 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r0)     // Catch:{ Exception -> 0x0040 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ Exception -> 0x003e }
            r2 = 500(0x1f4, float:7.0E-43)
            android.graphics.Bitmap r1 = r6.zoomBitmap(r0, r2, r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0045
        L_0x003e:
            r2 = move-exception
            goto L_0x0042
        L_0x0040:
            r2 = move-exception
            r0 = r1
        L_0x0042:
            r2.printStackTrace()
        L_0x0045:
            if (r0 != 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r0.recycle()
        L_0x004b:
            android.widget.ImageView r0 = r6.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.destroyDrawingCache()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.util.ClipViewLayout.clip():android.graphics.Bitmap");
    }

    @Nullable
    public final Bitmap decodeSampledBitmap(@NotNull Uri uri, int i, int i2) {
        Intrinsics.checkNotNullParameter(uri, "filePath");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), uri);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final int getExifOrientation(@NotNull String str) {
        ExifInterface exifInterface;
        int attributeInt;
        Intrinsics.checkNotNullParameter(str, "filepath");
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e) {
            e.printStackTrace();
            exifInterface = null;
        }
        if (!(exifInterface == null || (attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, -1)) == -1)) {
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
        }
        return 0;
    }

    public final float getScale() {
        this.matrix1.getValues(this.matrixValues);
        return this.matrixValues[0];
    }

    public final void init(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClipViewLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ClipViewLayout)");
        this.mHorizontalPadding = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipViewLayout_mHorizontalPadding, (int) TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics()));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipViewLayout_clipBorderWidth, (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        int i = obtainStyledAttributes.getInt(R$styleable.ClipViewLayout_clipType, 1);
        obtainStyledAttributes.recycle();
        ClipView clipView2 = new ClipView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        this.clipView = clipView2;
        Intrinsics.checkNotNull(clipView2);
        clipView2.setClipType(i == 1 ? ClipView.ClipType.CIRCLE : ClipView.ClipType.RECTANGLE);
        ClipView clipView3 = this.clipView;
        Intrinsics.checkNotNull(clipView3);
        clipView3.setClipBorderWidth(dimensionPixelSize);
        ClipView clipView4 = this.clipView;
        Intrinsics.checkNotNull(clipView4);
        clipView4.setmHorizontalPadding(this.mHorizontalPadding);
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.imageView, layoutParams);
        addView(this.clipView, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a4, code lost:
        if (r11 < r0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cf, code lost:
        if (r11 < r0) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initSrcPic(@org.jetbrains.annotations.Nullable android.net.Uri r10, @org.jetbrains.annotations.Nullable java.lang.String r11) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "**********clip_view uri*******  "
            kotlin.jvm.internal.Intrinsics.stringPlus(r0, r10)
            if (r11 != 0) goto L_0x0019
            com.hisense.connect_life.app_account.util.FileUtil$Companion r11 = com.hisense.connect_life.app_account.util.FileUtil.Companion
            android.content.Context r0 = r9.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r11 = r11.getRealFilePathFromUri(r0, r10)
        L_0x0019:
            java.lang.String r0 = "**********clip_view path*******  "
            kotlin.jvm.internal.Intrinsics.stringPlus(r0, r11)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0025
            return
        L_0x0025:
            r0 = 720(0x2d0, float:1.009E-42)
            r1 = 1280(0x500, float:1.794E-42)
            android.graphics.Bitmap r2 = r9.decodeSampledBitmap(r10, r0, r1)
            if (r2 != 0) goto L_0x0044
            android.content.Context r10 = r9.getContext()
            android.content.res.Resources r10 = r10.getResources()
            int r11 = com.hisense.connect_life.app_account.R$string.picture_not_exist
            java.lang.String r10 = r10.getString(r11)
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            com.blankj.utilcode.util.ToastUtils.m9582A(r10, r11)
            return
        L_0x0044:
            if (r11 != 0) goto L_0x0048
            r10 = 0
            goto L_0x0050
        L_0x0048:
            int r10 = r9.getExifOrientation(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L_0x0050:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            int r10 = r10.intValue()
            float r10 = (float) r10
            r7.setRotate(r10)
            r3 = 0
            r4 = 0
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r8 = 1
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            int r11 = r10.getWidth()
            int r0 = r10.getHeight()
            if (r11 < r0) goto L_0x00a7
            android.widget.ImageView r11 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            int r11 = r11.getWidth()
            float r11 = (float) r11
            int r0 = r10.getWidth()
            float r0 = (float) r0
            float r11 = r11 / r0
            com.hisense.connect_life.app_account.util.ClipView r0 = r9.clipView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Rect r0 = r0.getClipRect()
            int r0 = r0.height()
            float r0 = (float) r0
            int r1 = r10.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            r9.minScale = r0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d2
            goto L_0x00d1
        L_0x00a7:
            android.widget.ImageView r11 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            int r11 = r11.getHeight()
            float r11 = (float) r11
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r11 = r11 / r0
            com.hisense.connect_life.app_account.util.ClipView r0 = r9.clipView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Rect r0 = r0.getClipRect()
            int r0 = r0.width()
            float r0 = (float) r0
            int r1 = r10.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            r9.minScale = r0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d2
        L_0x00d1:
            r11 = r0
        L_0x00d2:
            android.graphics.Matrix r0 = r9.matrix1
            r0.postScale(r11, r11)
            android.widget.ImageView r0 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.getWidth()
            r1 = 2
            int r0 = r0 / r1
            android.widget.ImageView r2 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.getHeight()
            int r2 = r2 / r1
            int r3 = r10.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r11
            float r1 = (float) r1
            float r3 = r3 / r1
            int r3 = (int) r3
            int r4 = r10.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r11
            float r4 = r4 / r1
            int r11 = (int) r4
            android.graphics.Matrix r1 = r9.matrix1
            int r0 = r0 - r3
            float r0 = (float) r0
            int r2 = r2 - r11
            float r11 = (float) r2
            r1.postTranslate(r0, r11)
            android.widget.ImageView r11 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r11.setScaleType(r0)
            android.widget.ImageView r11 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            android.graphics.Matrix r0 = r9.matrix1
            r11.setImageMatrix(r0)
            android.widget.ImageView r11 = r9.imageView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r11.setImageBitmap(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.util.ClipViewLayout.initSrcPic(android.net.Uri, java.lang.String):void");
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.savedMatrix.set(this.matrix1);
            this.start.set(motionEvent.getX(), motionEvent.getY());
            this.mode = this.DRAG;
            return true;
        } else if (action == 2) {
            int i = this.mode;
            if (i == this.DRAG) {
                this.matrix1.set(this.savedMatrix);
                float x = motionEvent.getX() - this.start.x;
                float y = motionEvent.getY() - this.start.y;
                ClipView clipView2 = this.clipView;
                Intrinsics.checkNotNull(clipView2);
                this.mVerticalPadding = (float) clipView2.getClipRect().top;
                this.matrix1.postTranslate(x, y);
                checkBorder();
            } else if (i == this.ZOOM) {
                float spacing = spacing(motionEvent);
                if (spacing > 10.0f) {
                    float f = spacing / this.oldDist;
                    if (f < 1.0f) {
                        if (getScale() > this.minScale) {
                            this.matrix1.set(this.savedMatrix);
                            ClipView clipView3 = this.clipView;
                            Intrinsics.checkNotNull(clipView3);
                            this.mVerticalPadding = (float) clipView3.getClipRect().top;
                            Matrix matrix = this.matrix1;
                            PointF pointF = this.mid;
                            matrix.postScale(f, f, pointF.x, pointF.y);
                            while (getScale() < this.minScale) {
                                Matrix matrix2 = this.matrix1;
                                PointF pointF2 = this.mid;
                                matrix2.postScale(1.01f, 1.01f, pointF2.x, pointF2.y);
                            }
                        }
                        checkBorder();
                    } else if (getScale() <= this.maxScale) {
                        this.matrix1.set(this.savedMatrix);
                        ClipView clipView4 = this.clipView;
                        Intrinsics.checkNotNull(clipView4);
                        this.mVerticalPadding = (float) clipView4.getClipRect().top;
                        Matrix matrix3 = this.matrix1;
                        PointF pointF3 = this.mid;
                        matrix3.postScale(f, f, pointF3.x, pointF3.y);
                    }
                }
            }
            ImageView imageView2 = this.imageView;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setImageMatrix(this.matrix1);
            return true;
        } else if (action == 5) {
            float spacing2 = spacing(motionEvent);
            this.oldDist = spacing2;
            if (spacing2 <= 10.0f) {
                return true;
            }
            this.savedMatrix.set(this.matrix1);
            midPoint(this.mid, motionEvent);
            this.mode = this.ZOOM;
            return true;
        } else if (action != 6) {
            return true;
        } else {
            this.mode = this.NONE;
            return true;
        }
    }

    public final void setImageSrc(@NotNull Uri uri, @Nullable String str) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ImageView imageView2 = this.imageView;
        Intrinsics.checkNotNull(imageView2);
        imageView2.getViewTreeObserver().addOnGlobalLayoutListener(new ClipViewLayout$setImageSrc$1(this, uri, str));
    }

    @NotNull
    public final Bitmap zoomBitmap(@NotNull Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …h, height, matrix, false)");
        return createBitmap;
    }
}
