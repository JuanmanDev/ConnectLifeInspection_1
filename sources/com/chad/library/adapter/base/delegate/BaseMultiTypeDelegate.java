package com.chad.library.adapter.base.delegate;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001B\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\b\u0001\u0010\b\u001a\u00020\u0007\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006\""}, mo47991d2 = {"Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "T", "", "type", "layoutResId", "addItemType", "(II)Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "", "layoutResIds", "addItemTypeAutoIncrease", "([I)Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "", "mode", "", "checkMode", "(Z)V", "", "data", "position", "getItemType", "(Ljava/util/List;I)I", "viewType", "getLayoutId", "(I)I", "registerItemType", "(II)V", "autoMode", "Z", "Landroid/util/SparseIntArray;", "layouts", "Landroid/util/SparseIntArray;", "selfMode", "<init>", "(Landroid/util/SparseIntArray;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseMultiTypeDelegate.kt */
public abstract class BaseMultiTypeDelegate<T> {
    public boolean autoMode;
    public SparseIntArray layouts;
    public boolean selfMode;

    public BaseMultiTypeDelegate() {
        this((SparseIntArray) null, 1, (DefaultConstructorMarker) null);
    }

    public BaseMultiTypeDelegate(@NotNull SparseIntArray sparseIntArray) {
        this.layouts = sparseIntArray;
    }

    private final void checkMode(boolean z) {
        if (!(!z)) {
            throw new IllegalArgumentException("Don't mess two register mode".toString());
        }
    }

    private final void registerItemType(int i, @LayoutRes int i2) {
        this.layouts.put(i, i2);
    }

    @NotNull
    public final BaseMultiTypeDelegate<T> addItemType(int i, @LayoutRes int i2) {
        this.selfMode = true;
        checkMode(this.autoMode);
        registerItemType(i, i2);
        return this;
    }

    @NotNull
    public final BaseMultiTypeDelegate<T> addItemTypeAutoIncrease(@NotNull @LayoutRes int... iArr) {
        this.autoMode = true;
        checkMode(this.selfMode);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            registerItemType(i, iArr[i]);
        }
        return this;
    }

    public abstract int getItemType(@NotNull List<? extends T> list, int i);

    public final int getLayoutId(int i) {
        int i2 = this.layouts.get(i);
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(("ViewType: " + i + " found layoutResId，please use registerItemType() first!").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseMultiTypeDelegate(SparseIntArray sparseIntArray, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SparseIntArray() : sparseIntArray);
    }
}
