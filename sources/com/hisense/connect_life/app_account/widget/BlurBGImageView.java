package com.hisense.connect_life.app_account.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J \u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006#"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/BlurBGImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "overlay", "Landroid/graphics/Bitmap;", "getOverlay", "()Landroid/graphics/Bitmap;", "setOverlay", "(Landroid/graphics/Bitmap;)V", "radius", "getRadius", "()I", "setRadius", "(I)V", "scaleFactor", "getScaleFactor", "setScaleFactor", "blur", "image", "", "", "bkg", "view", "getBitmap", "Landroid/view/View;", "refreshBG", "bgView", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* compiled from: BlurBGImageView.kt */
public final class BlurBGImageView extends ImageView {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public Bitmap overlay;
    public int radius = 8;
    public int scaleFactor;

    public BlurBGImageView(@Nullable Context context) {
        super(context);
    }

    private final void blur(Bitmap bitmap, ImageView imageView, float f) {
        Bitmap bitmap2 = this.overlay;
        if (bitmap2 != null) {
            Intrinsics.checkNotNull(bitmap2);
            bitmap2.recycle();
        }
        this.overlay = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / this.scaleFactor, bitmap.getHeight() / this.scaleFactor, false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Bitmap blur = blur(context, this.overlay, f);
        this.overlay = blur;
        imageView.setImageBitmap(blur);
    }

    private final Bitmap getBitmap(View view) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return drawingCache;
        }
        int width = getWidth();
        int height = getHeight();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        return Bitmap.createBitmap(drawingCache, iArr[0] - iArr2[0], iArr[1] - iArr2[1], width, height);
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

    @Nullable
    public final Bitmap getOverlay() {
        return this.overlay;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final int getScaleFactor() {
        return this.scaleFactor;
    }

    public final void refreshBG(@NotNull View view) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(view, "bgView");
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        try {
            bitmap = getBitmap(view);
        } catch (Exception e) {
            e.printStackTrace();
            bitmap = null;
        }
        if (bitmap != null) {
            blur(bitmap, (ImageView) this, (float) this.radius);
            bitmap.recycle();
        }
        view.setDrawingCacheEnabled(false);
    }

    public final void setOverlay(@Nullable Bitmap bitmap) {
        this.overlay = bitmap;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final void setScaleFactor(int i) {
        this.scaleFactor = i;
    }

    public BlurBGImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlurBGImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private final Bitmap blur(Context context, Bitmap bitmap, float f) {
        RenderScript create = RenderScript.create(context);
        Intrinsics.checkNotNull(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        bitmap.recycle();
        create.destroy();
        Intrinsics.checkNotNullExpressionValue(createBitmap, "outputBitmap");
        return createBitmap;
    }
}
