package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/DeleteAccount;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "setListeners", "setNextShow", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/DeleteAccount")
/* compiled from: DeleteAccount.kt */
public final class DeleteAccount extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public static final /* synthetic */ AccountViewModel access$getMViewModel(DeleteAccount deleteAccount) {
        return (AccountViewModel) deleteAccount.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final void setNextShow() {
        if (((EditText) _$_findCachedViewById(R$id.forget_email)).getText().toString().length() > 0) {
            ((Button) _$_findCachedViewById(R$id.next)).setTextColor(getResources().getColor(R$color.colorWhite));
            ((Button) _$_findCachedViewById(R$id.next)).setBackgroundResource(R$drawable.button_next_select_bg);
            ((Button) _$_findCachedViewById(R$id.next)).setEnabled(true);
            return;
        }
        ((Button) _$_findCachedViewById(R$id.next)).setTextColor(getResources().getColor(R$color.colorText_86));
        ((Button) _$_findCachedViewById(R$id.next)).setBackgroundResource(R$drawable.button_next_unselect_bg);
        ((Button) _$_findCachedViewById(R$id.next)).setEnabled(false);
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

    public int bindLayout() {
        return R$layout.activity_delete_account;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new DeleteAccount$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new DeleteAccount$setListeners$2(this));
        ((EditText) _$_findCachedViewById(R$id.forget_email)).addTextChangedListener(new DeleteAccount$setListeners$3(this));
    }
}
