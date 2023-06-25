package com.chad.library.adapter.base.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo47991d2 = {"Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder;", "T", "Landroidx/databinding/ViewDataBinding;", "DB", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateDataBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/databinding/ViewDataBinding;", "Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder;", "<init>", "()V", "BinderDataBindingHolder", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: QuickDataBindingItemBinder.kt */
public abstract class QuickDataBindingItemBinder<T, DB extends ViewDataBinding> extends BaseItemBinder<T, BinderDataBindingHolder<DB>> {

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u00028\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo47991d2 = {"Lcom/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder;", "Landroidx/databinding/ViewDataBinding;", "DB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "<init>", "(Landroidx/databinding/ViewDataBinding;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: QuickDataBindingItemBinder.kt */
    public static final class BinderDataBindingHolder<DB extends ViewDataBinding> extends BaseViewHolder {
        @NotNull
        public final DB dataBinding;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public BinderDataBindingHolder(@org.jetbrains.annotations.NotNull DB r3) {
            /*
                r2 = this;
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "dataBinding.root"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r2.<init>(r0)
                r2.dataBinding = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.binder.QuickDataBindingItemBinder.BinderDataBindingHolder.<init>(androidx.databinding.ViewDataBinding):void");
        }

        @NotNull
        public final DB getDataBinding() {
            return this.dataBinding;
        }
    }

    @NotNull
    public abstract DB onCreateDataBinding(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, int i);

    @NotNull
    public BinderDataBindingHolder<DB> onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(parent.context)");
        return new BinderDataBindingHolder<>(onCreateDataBinding(from, viewGroup, i));
    }
}
