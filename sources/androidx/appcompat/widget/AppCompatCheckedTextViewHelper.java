package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppCompatCheckedTextViewHelper {
    public ColorStateList mCheckMarkTintList = null;
    public PorterDuff.Mode mCheckMarkTintMode = null;
    public boolean mHasCheckMarkTint = false;
    public boolean mHasCheckMarkTintMode = false;
    public boolean mSkipNextApply;
    @NonNull
    public final CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(@NonNull CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    public void applyCheckMarkTint() {
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
            Drawable mutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
            if (this.mHasCheckMarkTint) {
                DrawableCompat.setTintList(mutate, this.mCheckMarkTintList);
            }
            if (this.mHasCheckMarkTintMode) {
                DrawableCompat.setTintMode(mutate, this.mCheckMarkTintMode);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.mView.getDrawableState());
            }
            this.mView.setCheckMarkDrawable(mutate);
        }
    }

    public ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[SYNTHETIC, Splitter:B:12:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[Catch:{ all -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0187R.styleable.CheckedTextView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.mView
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.C0187R.styleable.CheckedTextView
            android.content.res.TypedArray r7 = r0.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.C0187R.styleable.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.hasValue(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0040
            int r11 = androidx.appcompat.C0187R.styleable.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x0092 }
            int r11 = r0.getResourceId(r11, r2)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0040
            android.widget.CheckedTextView r12 = r10.mView     // Catch:{ NotFoundException -> 0x0040 }
            android.widget.CheckedTextView r1 = r10.mView     // Catch:{ NotFoundException -> 0x0040 }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x0040 }
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch:{ NotFoundException -> 0x0040 }
            r12.setCheckMarkDrawable(r11)     // Catch:{ NotFoundException -> 0x0040 }
            r11 = 1
            goto L_0x0041
        L_0x0040:
            r11 = r2
        L_0x0041:
            if (r11 != 0) goto L_0x0062
            int r11 = androidx.appcompat.C0187R.styleable.CheckedTextView_android_checkMark     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.hasValue(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0062
            int r11 = androidx.appcompat.C0187R.styleable.CheckedTextView_android_checkMark     // Catch:{ all -> 0x0092 }
            int r11 = r0.getResourceId(r11, r2)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0062
            android.widget.CheckedTextView r12 = r10.mView     // Catch:{ all -> 0x0092 }
            android.widget.CheckedTextView r1 = r10.mView     // Catch:{ all -> 0x0092 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0092 }
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch:{ all -> 0x0092 }
            r12.setCheckMarkDrawable(r11)     // Catch:{ all -> 0x0092 }
        L_0x0062:
            int r11 = androidx.appcompat.C0187R.styleable.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.hasValue(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0075
            android.widget.CheckedTextView r11 = r10.mView     // Catch:{ all -> 0x0092 }
            int r12 = androidx.appcompat.C0187R.styleable.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x0092 }
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)     // Catch:{ all -> 0x0092 }
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r11, r12)     // Catch:{ all -> 0x0092 }
        L_0x0075:
            int r11 = androidx.appcompat.C0187R.styleable.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.hasValue(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x008e
            android.widget.CheckedTextView r11 = r10.mView     // Catch:{ all -> 0x0092 }
            int r12 = androidx.appcompat.C0187R.styleable.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x0092 }
            r1 = -1
            int r12 = r0.getInt(r12, r1)     // Catch:{ all -> 0x0092 }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r12, r1)     // Catch:{ all -> 0x0092 }
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r11, r12)     // Catch:{ all -> 0x0092 }
        L_0x008e:
            r0.recycle()
            return
        L_0x0092:
            r11 = move-exception
            r0.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextViewHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}
