package com.hisense.connect_life.app_account.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ClipView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "borderPaint", "Landroid/graphics/Paint;", "clipBorderWidth", "", "clipRadiusWidth", "clipType", "Lcom/hisense/connect_life/app_account/util/ClipView$ClipType;", "clipWidth", "mHorizontalPadding", "", "paint", "xfermode", "Landroid/graphics/Xfermode;", "getClipRect", "Landroid/graphics/Rect;", "getScreenWidth", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setClipBorderWidth", "setClipType", "setmHorizontalPadding", "ClipType", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClipView.kt */
public final class ClipView extends View {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @NotNull
    public final Paint borderPaint;
    public int clipBorderWidth;
    public int clipRadiusWidth;
    @NotNull
    public ClipType clipType;
    public int clipWidth;
    public float mHorizontalPadding;
    @NotNull
    public final Paint paint;
    public Xfermode xfermode;

    @Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ClipView$ClipType;", "", "(Ljava/lang/String;I)V", "CIRCLE", "RECTANGLE", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ClipView.kt */
    public enum ClipType {
        CIRCLE,
        RECTANGLE
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint();
        this.borderPaint = new Paint();
        this.clipType = ClipType.CIRCLE;
        this.paint.setAntiAlias(true);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setColor(-1);
        this.borderPaint.setStrokeWidth((float) this.clipBorderWidth);
        this.borderPaint.setAntiAlias(true);
        this.xfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this._$_findViewCache = new LinkedHashMap();
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

    @NotNull
    public final Rect getClipRect() {
        Rect rect = new Rect();
        rect.left = (getWidth() / 2) - this.clipRadiusWidth;
        rect.right = (getWidth() / 2) + this.clipRadiusWidth;
        rect.top = (getHeight() / 2) - this.clipRadiusWidth;
        rect.bottom = (getHeight() / 2) + this.clipRadiusWidth;
        return rect;
    }

    public final int getScreenWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        canvas.drawColor(Color.parseColor("#a8000000"));
        Paint paint2 = this.paint;
        Xfermode xfermode2 = this.xfermode;
        if (xfermode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xfermode");
            xfermode2 = null;
        }
        paint2.setXfermode(xfermode2);
        ClipType clipType2 = this.clipType;
        if (clipType2 == ClipType.CIRCLE) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.clipRadiusWidth, this.paint);
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.clipRadiusWidth, this.borderPaint);
        } else if (clipType2 == ClipType.RECTANGLE) {
            canvas.drawRect(this.mHorizontalPadding, (float) ((getHeight() / 2) - (this.clipWidth / 2)), ((float) getWidth()) - this.mHorizontalPadding, (float) ((getHeight() / 2) + (this.clipWidth / 2)), this.paint);
            canvas.drawRect(this.mHorizontalPadding, (float) ((getHeight() / 2) - (this.clipWidth / 2)), ((float) getWidth()) - this.mHorizontalPadding, (float) ((getHeight() / 2) + (this.clipWidth / 2)), this.borderPaint);
        }
        canvas.restore();
    }

    public final void setClipBorderWidth(int i) {
        this.clipBorderWidth = i;
        this.borderPaint.setStrokeWidth((float) i);
        invalidate();
    }

    public final void setClipType(@NotNull ClipType clipType2) {
        Intrinsics.checkNotNullParameter(clipType2, "clipType");
        this.clipType = clipType2;
    }

    public final void setmHorizontalPadding(float f) {
        this.mHorizontalPadding = f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext()");
        int screenWidth = ((int) (((float) getScreenWidth(context)) - (((float) 2) * f))) / 2;
        this.clipRadiusWidth = screenWidth;
        this.clipWidth = screenWidth * 2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
