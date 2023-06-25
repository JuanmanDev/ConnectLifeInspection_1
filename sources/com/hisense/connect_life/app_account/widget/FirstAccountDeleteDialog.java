package com.hisense.connect_life.app_account.widget;

import android.view.View;
import android.widget.TextView;
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
import p040c.p429r.p430a.p431a.p435e.C7280k;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\b\u0010\u0013\u001a\u00020\u0011H\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/FirstAccountDeleteDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "domain", "", "userEmail", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "iItemCallback", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "getUserEmail", "setUserEmail", "bindLayout", "", "initSelecter", "", "setIItemCallback", "setListeners", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FirstAccountDeleteDialog.kt */
public final class FirstAccountDeleteDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String domain;
    @Nullable
    public IItemCallback<? super String> iItemCallback;
    @NotNull
    public String userEmail;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirstAccountDeleteDialog(@NotNull String str, @NotNull String str2) {
        super(0, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "domain");
        Intrinsics.checkNotNullParameter(str2, "userEmail");
        this.domain = str;
        this.userEmail = str2;
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
        return R$layout.first_delete_account;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getUserEmail() {
        return this.userEmail;
    }

    public void initSelecter() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public final void setIItemCallback(@NotNull IItemCallback<? super String> iItemCallback2) {
        Intrinsics.checkNotNullParameter(iItemCallback2, "iItemCallback");
        this.iItemCallback = iItemCallback2;
    }

    public void setListeners() {
        String a = C7280k.m21420a(((TextView) _$_findCachedViewById(R$id.tv_certain)).getText().toString());
        Intrinsics.checkNotNullExpressionValue(a, "stringToUpper(tv_certain.text.toString())");
        ((TextView) _$_findCachedViewById(R$id.tv_certain)).setText(a);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_cancel");
        JuConnectExtKt.singleClickListener(textView, new FirstAccountDeleteDialog$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_certain);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_certain");
        JuConnectExtKt.singleClickListener(textView2, new FirstAccountDeleteDialog$setListeners$2(this));
    }

    public final void setUserEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userEmail = str;
    }
}
