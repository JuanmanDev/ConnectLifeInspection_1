package com.hisense.connect_life.app_account.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
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
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1524t;
import p040c.p429r.p430a.p431a.p432b.C7163a;
import p040c.p429r.p430a.p431a.p432b.C7183e2;
import p040c.p429r.p430a.p431a.p432b.C7200j;
import p040c.p429r.p430a.p431a.p432b.C7237s0;
import p040c.p429r.p430a.p431a.p432b.C7246u1;
import p040c.p429r.p430a.p431a.p432b.C7251v2;
import p040c.p429r.p430a.p431a.p432b.C7262y1;

@Metadata(mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020\u0005H\u0014J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020/H\u0002J\b\u00101\u001a\u00020/H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\b\u00104\u001a\u00020/H\u0014J\b\u00105\u001a\u00020/H\u0014J\b\u00106\u001a\u00020/H\u0002J\b\u00107\u001a\u00020/H\u0007J\b\u00108\u001a\u00020/H\u0014J\u0010\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u00020/H\u0016J\b\u0010@\u001a\u00020/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001e\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\u001e\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\u001e\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006A"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterInputVerificationActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "TIME_COUNT_DOWN", "", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "id", "origin", "getOrigin", "setOrigin", "password", "getPassword", "setPassword", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "thirdLoginType", "getThirdLoginType", "setThirdLoginType", "thirdPlatformId", "getThirdPlatformId", "setThirdPlatformId", "token", "getToken", "setToken", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "getUserProfile", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "setUserProfile", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;)V", "verCodeTimer", "getVerCodeTimer", "()I", "setVerCodeTimer", "(I)V", "bindLayout", "gotoRegisterInputUserInfo", "", "gotoRegisterSuccess", "gotoSetPSWActivity", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onDestroy", "register", "sendMessageAtOneS", "setListeners", "setNextShow", "canClick", "", "showCodeError", "showError", "content", "subscribeObservable", "updateJHLUserRegisterProtocol", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/RegisterInputVerificationActivity")
/* compiled from: RegisterInputVerificationActivity.kt */
public final class RegisterInputVerificationActivity extends BaseVmActivity<AccountViewModel> {
    public final int TIME_COUNT_DOWN = 1;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "email")
    public String email;
    @NotNull
    public final Handler handler = new Handler(new C7163a(this));
    @NotNull

    /* renamed from: id */
    public String f15745id = "";
    @Autowired(name = "origin")
    public String origin;
    @Autowired(name = "psw")
    public String password;
    public ThirdAccountViewModel thirdLoginModel;
    @Autowired(name = "thirdLoginType")
    public String thirdLoginType;
    @Autowired(name = "thirdPlatformId")
    public String thirdPlatformId;
    @Autowired(name = "token")
    public String token;
    @Autowired(name = "userInfo")
    public UserProfile userProfile;
    public int verCodeTimer = 60;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(RegisterInputVerificationActivity registerInputVerificationActivity) {
        return (AccountViewModel) registerInputVerificationActivity.getMViewModel();
    }

    private final void gotoRegisterInputUserInfo() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getEmail()).withString(EventBusConstKt.PSW, getPassword()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.REGISTER).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        finish();
        a.navigation();
    }

    private final void gotoRegisterSuccess() {
        String firstName = getUserProfile().getFirstName();
        String lastName = getUserProfile().getLastName();
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterSuccessActivity);
        a.withString("name", ((EditText) _$_findCachedViewById(R$id.register_name)).getText().toString()).withString("email", getEmail()).withString(EventBusConstKt.PSW, SPManagerKt.getPsw()).withString("firstName", firstName).withString("lastName", lastName).withString("thirdPlatformId", getThirdPlatformId()).withString("thirdLoginType", getThirdLoginType()).withString(FirebaseMessagingService.EXTRA_TOKEN, getToken()).withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        a.navigation();
    }

    private final void gotoSetPSWActivity() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterSetPasswordActivity);
        a.withString("email", getEmail());
        a.withString(EventBusConstKt.AUTH_CODE, ((EditText) _$_findCachedViewById(R$id.edit_verification)).getText().toString());
        a.navigation();
    }

    /* renamed from: handler$lambda-0  reason: not valid java name */
    public static final boolean m26874handler$lambda0(RegisterInputVerificationActivity registerInputVerificationActivity, Message message) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        Intrinsics.checkNotNullParameter(message, LanguageConstKt.f15954it);
        if (message.what != registerInputVerificationActivity.TIME_COUNT_DOWN) {
            return false;
        }
        registerInputVerificationActivity.sendMessageAtOneS();
        return false;
    }

    private final void register() {
        String jhkSerial;
        showLoading();
        AccountViewModel accountViewModel = (AccountViewModel) getMViewModel();
        String email2 = getEmail();
        String password2 = getPassword();
        String obj = ((EditText) _$_findCachedViewById(R$id.edit_verification)).getText().toString();
        HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
        String str = "";
        if (!(hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null)) {
            str = jhkSerial;
        }
        accountViewModel.signUp(email2, password2, obj, str);
    }

    private final void setNextShow(boolean z) {
        if (z) {
            ((Button) _$_findCachedViewById(R$id.next)).setTextColor(getColor(R$color.colorWhite));
            ((Button) _$_findCachedViewById(R$id.next)).setBackgroundResource(R$drawable.button_circle_solid);
            ((Button) _$_findCachedViewById(R$id.next)).setEnabled(true);
            return;
        }
        ((Button) _$_findCachedViewById(R$id.next)).setTextColor(getColor(R$color.colorText_86));
        ((Button) _$_findCachedViewById(R$id.next)).setBackgroundResource(R$drawable.button_circle_unselect);
        ((Button) _$_findCachedViewById(R$id.next)).setEnabled(false);
    }

    /* access modifiers changed from: private */
    public final void showCodeError(boolean z, String str) {
        if (z) {
            ((TextView) _$_findCachedViewById(R$id.tv_error_code)).setText(str);
            ((LinearLayout) _$_findCachedViewById(R$id.ll_et_code_bg)).setBackgroundResource(R$drawable.edittext_background_error);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.tv_error_code)).setText("");
        ((LinearLayout) _$_findCachedViewById(R$id.ll_et_code_bg)).setBackgroundResource(R$drawable.edittext_background_white);
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26875subscribeObservable$lambda2(RegisterInputVerificationActivity registerInputVerificationActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
            registerInputVerificationActivity.register();
        } else if (((Number) pair.getSecond()).intValue() == 600933) {
            String string = registerInputVerificationActivity.getString(R$string.auth_code_expired_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.auth_code_expired_error)");
            registerInputVerificationActivity.showCodeError(true, string);
        } else {
            String string2 = registerInputVerificationActivity.getString(R$string.change_email_error_code);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.change_email_error_code)");
            registerInputVerificationActivity.showCodeError(true, string2);
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26876subscribeObservable$lambda3(RegisterInputVerificationActivity registerInputVerificationActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            int intValue = ((Number) pair.getSecond()).intValue();
            if (intValue == -1) {
                registerInputVerificationActivity.showString(R$string.network_lost);
            } else if (intValue == 1) {
                registerInputVerificationActivity.showString(R$string.wrong_email_or_password);
            }
        } else {
            registerInputVerificationActivity.verCodeTimer = 60;
            registerInputVerificationActivity.sendMessageAtOneS();
            registerInputVerificationActivity.showString(R$string.verification_code_get_success);
        }
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26877subscribeObservable$lambda5(RegisterInputVerificationActivity registerInputVerificationActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                registerInputVerificationActivity.gotoRegisterSuccess();
            } else {
                String string = registerInputVerificationActivity.getString(R$string.fail);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.fail)");
                registerInputVerificationActivity.showString(string);
            }
            ((AccountViewModel) registerInputVerificationActivity.getMViewModel()).getAddUPLiveData().setValue(null);
        }
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m26878subscribeObservable$lambda6(RegisterInputVerificationActivity registerInputVerificationActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            ((AccountViewModel) registerInputVerificationActivity.getMViewModel()).addUserProfile(registerInputVerificationActivity.getUserProfile());
            return;
        }
        registerInputVerificationActivity.hideLoading();
        String string = ((CharSequence) pair.getSecond()).length() == 0 ? registerInputVerificationActivity.getString(R$string.register_fail) : (String) pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(string, "if (it.second.isEmpty())…ster_fail) else it.second");
        registerInputVerificationActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-9  reason: not valid java name */
    public static final void m26879subscribeObservable$lambda9(RegisterInputVerificationActivity registerInputVerificationActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                registerInputVerificationActivity.showString(R$string.register_success);
                registerInputVerificationActivity.updateJHLUserRegisterProtocol();
            } else {
                registerInputVerificationActivity.showString(R$string.register_fail);
                registerInputVerificationActivity.hideLoading();
                ((EditText) registerInputVerificationActivity._$_findCachedViewById(R$id.edit_verification)).setBackgroundResource(R$drawable.edittext_background_error);
            }
        }
        ((AccountViewModel) registerInputVerificationActivity.getMViewModel()).getUpdateJHLUserRegisterProtocolLiveData().observe(registerInputVerificationActivity, new C7246u1(registerInputVerificationActivity));
    }

    /* renamed from: subscribeObservable$lambda-9$lambda-8  reason: not valid java name */
    public static final void m26880subscribeObservable$lambda9$lambda8(RegisterInputVerificationActivity registerInputVerificationActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerInputVerificationActivity, "this$0");
        registerInputVerificationActivity.hideLoading();
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            registerInputVerificationActivity.gotoRegisterInputUserInfo();
            return;
        }
        String string = registerInputVerificationActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        registerInputVerificationActivity.showString(string);
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
        return R$layout.activity_input_verification;
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
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final String getOrigin() {
        String str = this.origin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.ORIGIN);
        return null;
    }

    @NotNull
    public final String getPassword() {
        String str = this.password;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("password");
        return null;
    }

    @NotNull
    public final String getThirdLoginType() {
        String str = this.thirdLoginType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thirdLoginType");
        return null;
    }

    @NotNull
    public final String getThirdPlatformId() {
        String str = this.thirdPlatformId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thirdPlatformId");
        return null;
    }

    @NotNull
    public final String getToken() {
        String str = this.token;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FirebaseMessagingService.EXTRA_TOKEN);
        return null;
    }

    @NotNull
    public final UserProfile getUserProfile() {
        UserProfile userProfile2 = this.userProfile;
        if (userProfile2 != null) {
            return userProfile2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userProfile");
        return null;
    }

    public final int getVerCodeTimer() {
        return this.verCodeTimer;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        long h = C1524t.m1041e().mo15418h(KeyConst.VER_LAST_GET_TIME, 0);
        String j = C1524t.m1041e().mo15420j(KeyConst.VER_LAST_GET_EMAIL, "");
        long currentTimeMillis = System.currentTimeMillis() - (h / ((long) 1000));
        if (currentTimeMillis >= 60 || !Intrinsics.areEqual((Object) j, (Object) getEmail())) {
            this.verCodeTimer = 60;
        } else {
            this.verCodeTimer = (int) (((long) 60) - currentTimeMillis);
        }
        this.thirdLoginModel = new ThirdAccountViewModel();
        String string = getString(R$string.check_your_email);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check_your_email)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_check_your_email)).setText(upperCase);
        String string2 = getString(R$string.verification_code);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.verification_code)");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        ((EditText) _$_findCachedViewById(R$id.edit_verification)).setHint(upperCase2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(getString(R$string.change_email_tips_4) + 10 + getString(R$string.register_verification_tips) + 10 + getString(R$string.code_valid_tips), Arrays.copyOf(new Object[]{getEmail()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        ((TextView) _$_findCachedViewById(R$id.email_reminder)).setText(format);
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.register_title));
        sendMessageAtOneS();
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void sendMessageAtOneS() {
        if (this.verCodeTimer <= 0) {
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setTextColor(getColor(R$color.colorWhite));
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setBackgroundResource(R$drawable.button_next_select_bg);
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setEnabled(true);
            ((Button) _$_findCachedViewById(R$id.get_verification_code)).setText(getString(R$string.resend_verification_code));
            return;
        }
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setTextColor(getColor(R$color.colorText_86));
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setBackgroundResource(R$drawable.button_next_unselect_bg);
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setEnabled(false);
        this.verCodeTimer--;
        ((Button) _$_findCachedViewById(R$id.get_verification_code)).setText(getString(R$string.resend_try_again_ver, new Object[]{Integer.valueOf(this.verCodeTimer)}));
        this.handler.sendEmptyMessageDelayed(this.TIME_COUNT_DOWN, 1000);
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new RegisterInputVerificationActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new RegisterInputVerificationActivity$setListeners$2(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.get_verification_code);
        Intrinsics.checkNotNullExpressionValue(button2, "get_verification_code");
        JuConnectExtKt.singleClickListener(button2, new RegisterInputVerificationActivity$setListeners$3(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.edit_verification);
        Intrinsics.checkNotNullExpressionValue(editText, "edit_verification");
        editText.addTextChangedListener(new C8459x7f94f3ac(this));
    }

    public final void setOrigin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.origin = str;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final void setThirdLoginType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdLoginType = str;
    }

    public final void setThirdPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdPlatformId = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setUserProfile(@NotNull UserProfile userProfile2) {
        Intrinsics.checkNotNullParameter(userProfile2, "<set-?>");
        this.userProfile = userProfile2;
    }

    public final void setVerCodeTimer(int i) {
        this.verCodeTimer = i;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getCheckAuthCodeLiveData().observe(this, new C7262y1(this));
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7251v2(this));
        ((AccountViewModel) getMViewModel()).getAddUPLiveData().observe(this, new C7237s0(this));
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdRegisterLiveData().observe(this, new C7183e2(this));
        ((AccountViewModel) getMViewModel()).getSignUpLiveData().observe(this, new C7200j(this));
    }
}
