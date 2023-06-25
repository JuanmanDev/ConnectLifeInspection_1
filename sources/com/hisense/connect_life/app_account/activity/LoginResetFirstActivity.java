package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.widget.IconFontView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p429r.p430a.p431a.p432b.C7259x2;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginResetFirstActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "deleteAccountTag", "", "getDeleteAccountTag", "()Ljava/lang/String;", "setDeleteAccountTag", "(Ljava/lang/String;)V", "emailStr", "getEmailStr", "setEmailStr", "isLogin", "setLogin", "bindLayout", "", "checkEmailFormat", "", "enableNextButton", "", "enabled", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onDestroy", "setListeners", "showEmailError", "showError", "content", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/LoginResetFirstActivity")
/* compiled from: LoginResetFirstActivity.kt */
public final class LoginResetFirstActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "DELETE_ACCOUNT")
    public String deleteAccountTag;
    @Autowired(name = "email")
    public String emailStr;
    @Autowired(name = "login")
    public String isLogin;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(LoginResetFirstActivity loginResetFirstActivity) {
        return (AccountViewModel) loginResetFirstActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final boolean checkEmailFormat() {
        Editable text = ((EditText) _$_findCachedViewById(R$id.sign_email)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "sign_email.text");
        return (text.length() > 0) && C1519p.m1017a(((EditText) _$_findCachedViewById(R$id.sign_email)).getText());
    }

    /* access modifiers changed from: private */
    public final void enableNextButton(boolean z) {
        Button button = (Button) _$_findCachedViewById(R$id.next);
        button.setTextColor(button.getResources().getColor(z ? R$color.colorWhite : R$color.colorText_86));
        button.setBackgroundResource(z ? R$drawable.button_next_select_bg : R$drawable.button_next_unselect_bg);
        button.setEnabled(z);
    }

    /* access modifiers changed from: private */
    public final void showEmailError(boolean z, String str) {
        if (z) {
            ((TextView) _$_findCachedViewById(R$id.tv_error_email)).setText(str);
            ((LinearLayout) _$_findCachedViewById(R$id.ll_et_email_bg)).setBackgroundResource(R$drawable.edittext_background_error);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.tv_error_email)).setText("");
        ((LinearLayout) _$_findCachedViewById(R$id.ll_et_email_bg)).setBackgroundResource(R$drawable.edittext_background_white);
    }

    public static /* synthetic */ void showEmailError$default(LoginResetFirstActivity loginResetFirstActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        loginResetFirstActivity.showEmailError(z, str);
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26841subscribeObservable$lambda2(LoginResetFirstActivity loginResetFirstActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginResetFirstActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str = (String) pair.getSecond();
            if (Intrinsics.areEqual((Object) str, (Object) "0")) {
                String string = loginResetFirstActivity.getString(R$string.unregistered_email_tips);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.unregistered_email_tips)");
                loginResetFirstActivity.showEmailError(true, string);
            } else if (Intrinsics.areEqual((Object) str, (Object) "1")) {
                ((AccountViewModel) loginResetFirstActivity.getMViewModel()).getVerificationCode(((EditText) loginResetFirstActivity._$_findCachedViewById(R$id.sign_email)).getText().toString(), "2");
                Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
                a.withString("email", ((EditText) loginResetFirstActivity._$_findCachedViewById(R$id.sign_email)).getText().toString());
                a.withString(EventBusConstKt.LOGIN, "false");
                a.navigation();
            }
        } else {
            String string2 = loginResetFirstActivity.getString(R$string.request_fail_tips);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.request_fail_tips)");
            loginResetFirstActivity.showEmailError(true, string2);
        }
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
        return R$layout.activity_login_reset_psw_first;
    }

    @NotNull
    public final String getDeleteAccountTag() {
        String str = this.deleteAccountTag;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteAccountTag");
        return null;
    }

    @NotNull
    public final String getEmailStr() {
        String str = this.emailStr;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emailStr");
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.reset_password_s));
        boolean z = true;
        if (getEmailStr().length() > 0) {
            ((EditText) _$_findCachedViewById(R$id.sign_email)).setText(getEmailStr());
            EditText editText = (EditText) _$_findCachedViewById(R$id.sign_email);
            if (!(isLogin().length() > 0) || Intrinsics.areEqual((Object) isLogin(), (Object) "true")) {
                z = false;
            }
            editText.setEnabled(z);
        }
        enableNextButton(checkEmailFormat());
    }

    @NotNull
    public final String isLogin() {
        String str = this.isLogin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("isLogin");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public final void setDeleteAccountTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deleteAccountTag = str;
    }

    public final void setEmailStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.emailStr = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new LoginResetFirstActivity$setListeners$1(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.sign_email);
        Intrinsics.checkNotNullExpressionValue(editText, "sign_email");
        editText.addTextChangedListener(new C8447x695a5a64(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new LoginResetFirstActivity$setListeners$3(this));
    }

    public final void setLogin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isLogin = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7259x2(this));
    }
}
