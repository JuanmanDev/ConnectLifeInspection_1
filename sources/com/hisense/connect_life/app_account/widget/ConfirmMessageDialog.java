package com.hisense.connect_life.app_account.widget;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010\u0016\u001a\u00020\u0014H\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/ConfirmMessageDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "confirmContent", "", "confirmButtonText", "cancelButtonText", "(III)V", "getCancelButtonText", "()I", "setCancelButtonText", "(I)V", "getConfirmButtonText", "setConfirmButtonText", "getConfirmContent", "setConfirmContent", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "", "bindLayout", "initSelecter", "", "setIItemCallback", "setListeners", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfirmMessageDialog.kt */
public final class ConfirmMessageDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int cancelButtonText;
    public int confirmButtonText;
    public int confirmContent;
    @Nullable
    public IItemCallback<? super String> iItemCallback;

    public ConfirmMessageDialog(@StringRes int i, @StringRes int i2, @StringRes int i3) {
        super(0, 1, (DefaultConstructorMarker) null);
        this.confirmContent = i;
        this.confirmButtonText = i2;
        this.cancelButtonText = i3;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.dialog_confirm_message_layout;
    }

    public final int getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final int getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final int getConfirmContent() {
        return this.confirmContent;
    }

    public void initSelecter() {
        ((TextView) _$_findCachedViewById(R$id.tv_confirm_content)).setText(getString(this.confirmContent));
        if (this.confirmButtonText != 0) {
            ((TextView) _$_findCachedViewById(R$id.tv_confirm)).setText(getString(this.confirmButtonText));
        }
        if (this.cancelButtonText != 0) {
            ((TextView) _$_findCachedViewById(R$id.tv_cancel)).setText(getString(this.cancelButtonText));
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setCancelButtonText(int i) {
        this.cancelButtonText = i;
    }

    public final void setConfirmButtonText(int i) {
        this.confirmButtonText = i;
    }

    public final void setConfirmContent(int i) {
        this.confirmContent = i;
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super String> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_cancel");
        JuConnectExtKt.singleClickListener(textView, new ConfirmMessageDialog$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_confirm");
        JuConnectExtKt.singleClickListener(textView2, new ConfirmMessageDialog$setListeners$2(this));
    }
}
