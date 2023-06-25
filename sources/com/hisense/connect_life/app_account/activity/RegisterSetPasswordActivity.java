package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.messaging.FirebaseMessagingService;
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
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7177d0;
import p040c.p429r.p430a.p431a.p432b.C7186f1;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterSetPasswordActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "authCode", "", "getAuthCode", "()Ljava/lang/String;", "setAuthCode", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "bindLayout", "", "gotoRegisterInputUserInfo", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isContainsNumbersAndLetters", "", "str", "onDestroy", "register", "psw", "setListeners", "setNextShow", "canClick", "subscribeObservable", "updateJHLUserRegisterProtocol", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/RegisterSetPasswordActivity")
/* compiled from: RegisterSetPasswordActivity.kt */
public final class RegisterSetPasswordActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "AuthCode")
    public String authCode;
    @Autowired(name = "email")
    public String email;

    private final void gotoRegisterInputUserInfo() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getEmail()).withString(EventBusConstKt.PSW, ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.REGISTER).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        finish();
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final boolean isContainsNumbersAndLetters(String str) {
        int length = str.length();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < length) {
            int i2 = i + 1;
            if (Character.isDigit(str.charAt(i))) {
                z = true;
            } else if (Character.isLetter(str.charAt(i))) {
                z2 = true;
            }
            i = i2;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void register(String str) {
        String jhkSerial;
        showLoading();
        AccountViewModel accountViewModel = (AccountViewModel) getMViewModel();
        String email2 = getEmail();
        String authCode2 = getAuthCode();
        HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
        String str2 = "";
        if (!(hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null)) {
            str2 = jhkSerial;
        }
        accountViewModel.signUp(email2, str, authCode2, str2);
    }

    /* access modifiers changed from: private */
    public final void setNextShow(boolean z) {
        if (z) {
            ((Button) _$_findCachedViewById(R$id.next)).setTextColor(getResources().getColor(R$color.colorWhite));
            ((Button) _$_findCachedViewById(R$id.next)).setBackgroundResource(R$drawable.button_next_select_bg);
            ((Button) _$_findCachedViewById(R$id.next)).setEnabled(true);
            return;
        }
        ((Button) _$_findCachedViewById(R$id.next)).setTextColor(getResources().getColor(R$color.colorText_86));
        ((Button) _$_findCachedViewById(R$id.next)).setBackgroundResource(R$drawable.button_next_unselect_bg);
        ((Button) _$_findCachedViewById(R$id.next)).setEnabled(false);
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26881subscribeObservable$lambda2(RegisterSetPasswordActivity registerSetPasswordActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerSetPasswordActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                registerSetPasswordActivity.showString(R$string.register_success);
                registerSetPasswordActivity.updateJHLUserRegisterProtocol();
            } else {
                registerSetPasswordActivity.showString(R$string.register_fail);
                registerSetPasswordActivity.hideLoading();
                ((LinearLayout) registerSetPasswordActivity._$_findCachedViewById(R$id.password_input_layout)).setBackgroundResource(R$drawable.edittext_background_error);
                ((LinearLayout) registerSetPasswordActivity._$_findCachedViewById(R$id.password_repeat_layout)).setBackgroundResource(R$drawable.edittext_background_error);
            }
        }
        ((AccountViewModel) registerSetPasswordActivity.getMViewModel()).getUpdateJHLUserRegisterProtocolLiveData().observe(registerSetPasswordActivity, new C7177d0(registerSetPasswordActivity));
    }

    /* renamed from: subscribeObservable$lambda-2$lambda-1  reason: not valid java name */
    public static final void m26882subscribeObservable$lambda2$lambda1(RegisterSetPasswordActivity registerSetPasswordActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerSetPasswordActivity, "this$0");
        registerSetPasswordActivity.hideLoading();
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            registerSetPasswordActivity.gotoRegisterInputUserInfo();
            return;
        }
        String string = registerSetPasswordActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        registerSetPasswordActivity.showString(string);
    }

    private final void updateJHLUserRegisterProtocol() {
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("sp jhl tosVer: ", SPUtils.INSTANCE.get(KeyConst.KEY_JHL_TOSVER, "")));
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("sp jhl ppVer: ", SPUtils.INSTANCE.get(KeyConst.KEY_JHL_PPVER, "")));
        ((AccountViewModel) getMViewModel()).updateJHLUserRegisterProtocol(String.valueOf(SPUtils.INSTANCE.get(KeyConst.KEY_JHL_PPVER, "")), String.valueOf(SPUtils.INSTANCE.get(KeyConst.KEY_JHL_TOSVER, "")));
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
        return R$layout.activity_set_password;
    }

    @NotNull
    public final String getAuthCode() {
        String str = this.authCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authCode");
        return null;
    }

    @NotNull
    public final String getEmail() {
        String str = this.email;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.register_title));
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public final void setAuthCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authCode = str;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new RegisterSetPasswordActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new RegisterSetPasswordActivity$setListeners$2(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.show_hide_password_set);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "show_hide_password_set");
        JuConnectExtKt.singleClickListener(iconFontView2, new RegisterSetPasswordActivity$setListeners$3(this));
        IconFontView iconFontView3 = (IconFontView) _$_findCachedViewById(R$id.show_hide_repeat_password_set);
        Intrinsics.checkNotNullExpressionValue(iconFontView3, "show_hide_repeat_password_set");
        JuConnectExtKt.singleClickListener(iconFontView3, new RegisterSetPasswordActivity$setListeners$4(this));
        ((EditText) _$_findCachedViewById(R$id.sign_password)).addTextChangedListener(new RegisterSetPasswordActivity$setListeners$5(this));
        ((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).addTextChangedListener(new RegisterSetPasswordActivity$setListeners$6(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getSignUpLiveData().observe(this, new C7186f1(this));
    }
}
