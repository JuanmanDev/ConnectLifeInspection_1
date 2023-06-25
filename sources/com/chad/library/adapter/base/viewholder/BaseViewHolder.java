package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u000fJ#\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J%\u0010$\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u000fJ#\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u000fJ#\u0010)\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u000fJ!\u0010+\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010\u0015J\u001f\u0010,\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u000bR\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, mo47991d2 = {"Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "androidx/recyclerview/widget/RecyclerView$ViewHolder", "Landroidx/databinding/ViewDataBinding;", "B", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroid/view/View;", "T", "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "color", "setBackgroundColor", "(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "backgroundRes", "setBackgroundResource", "", "isEnabled", "setEnabled", "(IZ)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "isGone", "setGone", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(ILandroid/graphics/Bitmap;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(ILandroid/graphics/drawable/Drawable;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "imageResId", "setImageResource", "", "value", "setText", "(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "strId", "setTextColor", "colorRes", "setTextColorRes", "isVisible", "setVisible", "findView", "Landroid/util/SparseArray;", "views", "Landroid/util/SparseArray;", "view", "<init>", "(Landroid/view/View;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@Keep
/* compiled from: BaseViewHolder.kt */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    public final SparseArray<View> views = new SparseArray<>();

    public BaseViewHolder(@NotNull View view) {
        super(view);
    }

    @Nullable
    public <T extends View> T findView(int i) {
        return this.itemView.findViewById(i);
    }

    @Deprecated(message = "Please use BaseDataBindingHolder class", replaceWith = @ReplaceWith(expression = "DataBindingUtil.getBinding(itemView)", imports = {"androidx.databinding.DataBindingUtil"}))
    @Nullable
    public <B extends ViewDataBinding> B getBinding() {
        return DataBindingUtil.getBinding(this.itemView);
    }

    @NotNull
    public <T extends View> T getView(@IdRes int i) {
        T viewOrNull = getViewOrNull(i);
        if (viewOrNull != null) {
            return viewOrNull;
        }
        throw new IllegalStateException(("No view found with id " + i).toString());
    }

    @Nullable
    public <T extends View> T getViewOrNull(@IdRes int i) {
        T findViewById;
        T t = (View) this.views.get(i);
        if (t == null && (findViewById = this.itemView.findViewById(i)) != null) {
            this.views.put(i, findViewById);
            return findViewById;
        } else if (!(t instanceof View)) {
            return null;
        } else {
            return t;
        }
    }

    @NotNull
    public BaseViewHolder setBackgroundColor(@IdRes int i, @ColorInt int i2) {
        getView(i).setBackgroundColor(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setBackgroundResource(@IdRes int i, @DrawableRes int i2) {
        getView(i).setBackgroundResource(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setEnabled(@IdRes int i, boolean z) {
        getView(i).setEnabled(z);
        return this;
    }

    @NotNull
    public BaseViewHolder setGone(@IdRes int i, boolean z) {
        getView(i).setVisibility(z ? 8 : 0);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageBitmap(@IdRes int i, @Nullable Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageDrawable(@IdRes int i, @Nullable Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageResource(@IdRes int i, @DrawableRes int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setText(@IdRes int i, @Nullable CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColor(@IdRes int i, @ColorInt int i2) {
        ((TextView) getView(i)).setTextColor(i2);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColorRes(@IdRes int i, @ColorRes int i2) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((TextView) getView(i)).setTextColor(view.getResources().getColor(i2));
        return this;
    }

    @NotNull
    public BaseViewHolder setVisible(@IdRes int i, boolean z) {
        getView(i).setVisibility(z ? 0 : 4);
        return this;
    }

    @Nullable
    public BaseViewHolder setText(@IdRes int i, @StringRes int i2) {
        ((TextView) getView(i)).setText(i2);
        return this;
    }
}
