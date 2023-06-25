package com.hisense.connect_life.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.juconnect.vivino.global.UrlConstKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p436b.p438c.C7288a;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0014J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/core/widget/DragCustomView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "downX", "", "downY", "<set-?>", "", "isDrag", "()Z", "mHeight", "", "mWidth", "screenHeight", "screenWidth", "statusBarHeight", "getStatusBarHeight", "()I", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* compiled from: DragCustomView.kt */
public final class DragCustomView extends RelativeLayout {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public float downX;
    public float downY;
    public boolean isDrag;
    public int mHeight;
    public int mWidth;
    public int screenHeight;
    public int screenWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
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

    public final int getStatusBarHeight() {
        return getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", UrlConstKt.APP_PLATFORM));
    }

    public final boolean isDrag() {
        return this.isDrag;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.mWidth = getMeasuredWidth();
        this.mHeight = getMeasuredHeight();
        this.screenWidth = C7288a.m21422b(getContext());
        this.screenHeight = C7288a.m21421a(getContext());
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
        super.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isDrag = false;
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
        } else if (action == 1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.mWidth, this.mHeight);
            layoutParams.setMargins(getLeft(), getTop(), 0, 0);
            setLayoutParams(layoutParams);
            setPressed(false);
        } else if (action == 2) {
            float x = motionEvent.getX() - this.downX;
            float y = motionEvent.getY() - this.downY;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.isDrag = true;
                int left = (int) (((float) getLeft()) + x);
                int i2 = this.mWidth + left;
                int top2 = (int) (((float) getTop()) + y);
                int i3 = this.mHeight + top2;
                if (left < 0) {
                    i2 = this.mWidth + 0;
                    left = 0;
                } else {
                    int i4 = this.screenWidth;
                    if (i2 > i4) {
                        left = i4 - this.mWidth;
                        i2 = i4;
                    }
                }
                if (top2 < 0) {
                    i3 = this.mHeight + 0;
                } else {
                    int i5 = this.screenHeight;
                    if (i3 > i5) {
                        int i6 = this.mHeight;
                        i3 = i5 - i6;
                        i = i3 - i6;
                    } else {
                        i = top2;
                    }
                }
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
        }
        return true;
    }
}
