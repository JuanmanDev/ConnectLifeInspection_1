package com.hisense.connect_life.app_account.widget;

import android.view.View;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.widget.IconFontView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0006H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0014\u0010\u0010\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/DeleteAccountDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "emailStr", "", "(Ljava/lang/String;)V", "REQUEST_CODE", "", "getEmailStr", "()Ljava/lang/String;", "setEmailStr", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "bindLayout", "initSelecter", "", "onStart", "setIItemCallback", "setListeners", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeleteAccountDialog.kt */
public final class DeleteAccountDialog extends BaseDialogFragment {
    public final int REQUEST_CODE = 1000;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String emailStr;
    @Nullable
    public IItemCallback<? super String> iItemCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteAccountDialog(@NotNull String str) {
        super(0, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "emailStr");
        this.emailStr = str;
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
        return R$layout.delete_account_dialog_layout;
    }

    @NotNull
    public final String getEmailStr() {
        return this.emailStr;
    }

    public void initSelecter() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        ((TextView) _$_findCachedViewById(R$id.forget_password)).getPaint().setFlags(8);
    }

    public final void setEmailStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.emailStr = str;
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super String> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.show_hide_password_delete_user);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "show_hide_password_delete_user");
        JuConnectExtKt.singleClickListener(iconFontView, new DeleteAccountDialog$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.forget_password);
        Intrinsics.checkNotNullExpressionValue(textView, "forget_password");
        JuConnectExtKt.singleClickListener(textView, new DeleteAccountDialog$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "confirm");
        JuConnectExtKt.singleClickListener(textView2, new DeleteAccountDialog$setListeners$3(this));
    }
}
