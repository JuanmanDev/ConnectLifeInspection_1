package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.textfield.TextInputLayout;
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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7263y2;
import p040c.p429r.p430a.p431a.p432b.C7264z;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0014J\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\bH\u0014J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0014J\b\u0010\u0016\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginForgotPswInputEmailActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "REQUEST_CODE", "", "bindLayout", "checkLoginNameSign", "", "getVerification", "gotoLoginResetPswActivity", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "setGetVerificationBtnShow", "setListeners", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/LoginForgotPswInputEmailActivity")
/* compiled from: LoginForgotPswInputEmailActivity.kt */
public final class LoginForgotPswInputEmailActivity extends BaseVmActivity<AccountViewModel> {
    public final int REQUEST_CODE = 1000;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* access modifiers changed from: private */
    public final void checkLoginNameSign() {
        ((AccountViewModel) getMViewModel()).checkLoginNameSign(StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.forget_email)).getText().toString()).toString());
    }

    private final void getVerification() {
        ((AccountViewModel) getMViewModel()).getVerificationCode(StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.forget_email)).getText().toString()).toString(), "2");
    }

    private final void gotoLoginResetPswActivity() {
        int i = this.REQUEST_CODE;
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
        a.withString("email", ((EditText) _$_findCachedViewById(R$id.forget_email)).getText().toString());
        a.withString(EventBusConstKt.LOGIN, "false");
        a.navigation((Activity) this, i);
    }

    /* access modifiers changed from: private */
    public final void setGetVerificationBtnShow() {
        if (((EditText) _$_findCachedViewById(R$id.forget_email)).getText().toString().length() > 0) {
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setTextColor(getResources().getColor(R$color.colorWhite));
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setBackgroundResource(R$drawable.button_circle_solid);
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setEnabled(true);
            return;
        }
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setTextColor(getResources().getColor(R$color.colorText_86));
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setBackgroundResource(R$drawable.button_circle_unselect);
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setEnabled(false);
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m26838subscribeObservable$lambda0(LoginForgotPswInputEmailActivity loginForgotPswInputEmailActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginForgotPswInputEmailActivity, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            ((EditText) loginForgotPswInputEmailActivity._$_findCachedViewById(R$id.forget_email)).setBackgroundResource(R$drawable.edittext_background_contour);
            int intValue = ((Number) pair.getSecond()).intValue();
            if (intValue == -1) {
                loginForgotPswInputEmailActivity.showString(R$string.network_lost);
            } else if (intValue == 1) {
                loginForgotPswInputEmailActivity.showString(R$string.wrong_email_or_password);
            }
        } else {
            loginForgotPswInputEmailActivity.gotoLoginResetPswActivity();
        }
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26839subscribeObservable$lambda1(LoginForgotPswInputEmailActivity loginForgotPswInputEmailActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginForgotPswInputEmailActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            ((TextInputLayout) loginForgotPswInputEmailActivity._$_findCachedViewById(R$id.tv_error_email)).setError(loginForgotPswInputEmailActivity.getString(R$string.request_fail_tips));
        } else if (Intrinsics.areEqual(pair.getSecond(), (Object) "2")) {
            ((TextInputLayout) loginForgotPswInputEmailActivity._$_findCachedViewById(R$id.tv_error_email)).setErrorEnabled(true);
            ((TextInputLayout) loginForgotPswInputEmailActivity._$_findCachedViewById(R$id.tv_error_email)).setError(loginForgotPswInputEmailActivity.getString(R$string.email_has_not_registered_tips));
        } else {
            loginForgotPswInputEmailActivity.getVerification();
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
        return R$layout.activity_login_forgot_input_email;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.sign_in_title));
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new LoginForgotPswInputEmailActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.get_verification_code);
        Intrinsics.checkNotNullExpressionValue(button, "get_verification_code");
        JuConnectExtKt.singleClickListener(button, new LoginForgotPswInputEmailActivity$setListeners$2(this));
        ((EditText) _$_findCachedViewById(R$id.forget_email)).addTextChangedListener(new LoginForgotPswInputEmailActivity$setListeners$3(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7264z(this));
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7263y2(this));
    }
}
