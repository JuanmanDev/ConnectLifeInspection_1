package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.CheckUpgradeTool;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.app_account.widget.ConfirmMessageDialog;
import com.hisense.connect_life.core.base.BaseApplication;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.global.ThirdAccountType;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p429r.p430a.p431a.p432b.C7212m;
import p040c.p429r.p430a.p431a.p432b.C7238s1;
import p040c.p429r.p430a.p431a.p432b.C7244u;
import p040c.p429r.p430a.p431a.p432b.C7249v0;
import p040c.p429r.p430a.p431a.p432b.C7252w;
import p040c.p429r.p430a.p431a.p432b.C7261y0;
import p040c.p429r.p430a.p431a.p432b.C7265z0;

@Route(path = "/account/LoginEmailActivity")
@Metadata(mo47990d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0005H\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002JJ\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u00072\u0006\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u0007H\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0007H\u0002J0\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0002J\b\u00100\u001a\u00020\u001eH\u0002J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u00102\u001a\u00020\u001eH\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u0014H\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0016J\b\u00107\u001a\u00020\u001eH\u0014J\u0010\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u0007H\u0002J\"\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\b\u0010?\u001a\u00020\u001eH\u0014J\b\u0010@\u001a\u00020\u001eH\u0014J\b\u0010A\u001a\u00020\u001eH\u0014J\b\u0010B\u001a\u00020\u001eH\u0002J\u001a\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\u000f2\b\b\u0002\u0010E\u001a\u00020\u0007H\u0002J\u0018\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002J\u001a\u0010K\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\u000f2\b\b\u0002\u0010E\u001a\u00020\u0007H\u0002J\b\u0010L\u001a\u00020\u001eH\u0002J\b\u0010M\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginEmailActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "REQUEST_CODE", "", "connetlifePrivacyPolicyUrl", "", "extraFont", "Landroid/graphics/Typeface;", "getExtraFont", "()Landroid/graphics/Typeface;", "extraFont$delegate", "Lkotlin/Lazy;", "isThirdRegister", "", "jhlNeedUserAgreementCount", "Ljava/lang/Integer;", "loginType", "mGoogleSignInAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "termsConditionsUrl", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "vidaaPrivacyPolicyUrl", "bindLayout", "checkEmailFormat", "checkPasswordFormat", "password", "enableNextButton", "", "enabled", "getJHLProtocol", "getJHLUserProtocol", "getUserProfile", "gotoAgreementWebViewActivity", "title", "url", "userAgreementUrl", "privacyPolicyUrl", "from", "email", "pwd", "gotoMainActivity", "gotoPolicy", "type", "idToken", "thirdId", "gotoRegister", "gotoRegisterInputUserInfo", "gotoResetPwd", "gotoThirdRegister", "account", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isContainsNumbersAndLetters", "str", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onStart", "setListeners", "setNextShow", "showEmailError", "showError", "content", "showHidePassword", "editText", "Landroid/widget/EditText;", "iconText", "Lcom/hisense/connect_life/core/widget/IconFontView;", "showPasswordError", "showUnbindDialog", "subscribeObservable", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginEmailActivity.kt */
public final class LoginEmailActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "LoginEmailActivity";
    public final int REQUEST_CODE = 1000;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @NotNull
    public final Lazy extraFont$delegate = LazyKt__LazyJVMKt.lazy(new LoginEmailActivity$extraFont$2(this));
    public boolean isThirdRegister;
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @NotNull
    public String loginType = "app";
    @Nullable
    public GoogleSignInAccount mGoogleSignInAccount;
    @Nullable
    public String termsConditionsUrl = "";
    public ThirdAccountViewModel thirdLoginModel;
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginEmailActivity$Companion;", "", "()V", "TAG", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LoginEmailActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ AccountViewModel access$getMViewModel(LoginEmailActivity loginEmailActivity) {
        return (AccountViewModel) loginEmailActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final boolean checkEmailFormat() {
        Editable text = ((EditText) _$_findCachedViewById(R$id.sign_email)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "sign_email.text");
        return (text.length() > 0) && C1519p.m1017a(((EditText) _$_findCachedViewById(R$id.sign_email)).getText());
    }

    /* access modifiers changed from: private */
    public final boolean checkPasswordFormat(String str) {
        return isContainsNumbersAndLetters(str);
    }

    private final void enableNextButton(boolean z) {
        Button button = (Button) _$_findCachedViewById(R$id.next);
        button.setTextColor(button.getResources().getColor(z ? R$color.colorWhite : R$color.colorText_86));
        button.setBackgroundResource(z ? R$drawable.button_next_select_bg : R$drawable.button_next_unselect_bg);
        button.setEnabled(z);
    }

    private final Typeface getExtraFont() {
        return (Typeface) this.extraFont$delegate.getValue();
    }

    private final void getJHLProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLRegisterProtocol(LanguageListManager.INSTANCE.getLanguageCode());
    }

    private final void getJHLUserProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
    }

    private final void getUserProfile() {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this);
        Bundle bundle = new Bundle();
        bundle.putString("login_type", this.loginType);
        Unit unit = Unit.INSTANCE;
        instance.mo37291a("custom_profile_login", bundle);
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
    }

    private final void gotoAgreementWebViewActivity(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String U;
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.GUserAgreementWebViewActivity);
        Postcard withString = a.withString(KeyConst.KEY_TITLE_TEXT, str).withString("email", str6).withString(EventBusConstKt.PSW, str7).withString(KeyConst.KEY_TARGET_URL, str2).withString("from", str5).withString(KeyConst.USER_AGREEMENT_URL, str3).withString(KeyConst.USER_PRIVACY_POLICY, str4);
        GoogleSignInAccount googleSignInAccount = this.mGoogleSignInAccount;
        String str8 = "";
        if (!(googleSignInAccount == null || (U = googleSignInAccount.mo24423U()) == null)) {
            str8 = U;
        }
        withString.withString(EventBusConstKt.ID_TOKEN, str8);
        a.navigation();
    }

    public static /* synthetic */ void gotoAgreementWebViewActivity$default(LoginEmailActivity loginEmailActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        loginEmailActivity.gotoAgreementWebViewActivity(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    private final void gotoMainActivity() {
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoPolicy(String str) {
        gotoPolicy(str, ((EditText) _$_findCachedViewById(R$id.sign_email)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString(), "", "");
    }

    /* access modifiers changed from: private */
    public final void gotoRegister() {
        getJHLProtocol();
    }

    private final void gotoRegisterInputUserInfo(String str) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", str).withString(EventBusConstKt.PSW, ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoResetPwd() {
        ((EditText) _$_findCachedViewById(R$id.sign_password)).setText("");
        showPasswordError$default(this, false, (String) null, 2, (Object) null);
        showEmailError$default(this, false, (String) null, 2, (Object) null);
        int i = this.REQUEST_CODE;
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetFirstActivity);
        a.withString("email", ((EditText) _$_findCachedViewById(R$id.sign_email)).getText().toString());
        a.withString(EventBusConstKt.LOGIN, "false");
        a.navigation((Activity) this, i);
    }

    /* access modifiers changed from: private */
    public final void gotoThirdRegister(GoogleSignInAccount googleSignInAccount) {
        String U = googleSignInAccount.mo24423U();
        if (!(U == null || U.length() == 0)) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
            a.withString("email", googleSignInAccount.mo24419Q()).withString(EventBusConstKt.PSW, "").withString(EventBusConstKt.ORIGIN, EventBusConstKt.THIRD_REGISTER).withString("thirdPlatformId", getString(R$string.server_client_id)).withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, googleSignInAccount.mo24423U()).withString("id", googleSignInAccount.mo24422T()).withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
            finish();
            a.navigation();
        }
    }

    private final boolean isContainsNumbersAndLetters(String str) {
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
        if (!z || !z2 || str.length() < 8 || str.length() > 50) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void setNextShow() {
        enableNextButton(checkEmailFormat() && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()));
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

    public static /* synthetic */ void showEmailError$default(LoginEmailActivity loginEmailActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        loginEmailActivity.showEmailError(z, str);
    }

    /* access modifiers changed from: private */
    public final void showHidePassword(EditText editText, IconFontView iconFontView) {
        Editable text = editText.getText();
        if (TextUtils.equals(iconFontView.getText(), getString(R$string.icon_login_password_show))) {
            iconFontView.setTextSize(20.0f);
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            editText.setTypeface(getExtraFont());
            iconFontView.setText(iconFontView.getResources().getString(R$string.icon_login_password_close));
        } else {
            iconFontView.setTextSize(14.0f);
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            iconFontView.setText(iconFontView.getResources().getString(R$string.icon_login_password_show));
        }
        editText.setSelection(text.length());
    }

    /* access modifiers changed from: private */
    public final void showPasswordError(boolean z, String str) {
        if (z) {
            ((TextView) _$_findCachedViewById(R$id.tv_error_password)).setText(str);
            ((LinearLayout) _$_findCachedViewById(R$id.ll_et_password_bg)).setBackgroundResource(R$drawable.edittext_background_error);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.tv_error_password)).setText("");
        ((LinearLayout) _$_findCachedViewById(R$id.ll_et_password_bg)).setBackgroundResource(R$drawable.edittext_background_white);
    }

    public static /* synthetic */ void showPasswordError$default(LoginEmailActivity loginEmailActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        loginEmailActivity.showPasswordError(z, str);
    }

    private final void showUnbindDialog() {
        ConfirmMessageDialog confirmMessageDialog = new ConfirmMessageDialog(R$string.unbind_go_to_register, 0, 0);
        confirmMessageDialog.setIItemCallback(new LoginEmailActivity$showUnbindDialog$1(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(confirmMessageDialog, supportFragmentManager);
    }

    /* renamed from: subscribeObservable$lambda-10  reason: not valid java name */
    public static final void m26830subscribeObservable$lambda10(LoginEmailActivity loginEmailActivity, JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(loginEmailActivity, "this$0");
        loginEmailActivity.hideLoading();
        if (jHLAgreementData == null) {
            loginEmailActivity.termsConditionsUrl = "";
            loginEmailActivity.connetlifePrivacyPolicyUrl = "";
        } else {
            loginEmailActivity.termsConditionsUrl = jHLAgreementData.getTosUrl();
            loginEmailActivity.connetlifePrivacyPolicyUrl = jHLAgreementData.getPpUrl();
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_TOSVER, jHLAgreementData.getTosVersion());
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_PPVER, jHLAgreementData.getPpVersion());
        }
        if (loginEmailActivity.isThirdRegister) {
            loginEmailActivity.isThirdRegister = false;
            String string = loginEmailActivity.getString(R$string.register_privacy_policy_terms_conditions);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.regis…_policy_terms_conditions)");
            String str = loginEmailActivity.termsConditionsUrl;
            String str2 = loginEmailActivity.connetlifePrivacyPolicyUrl;
            GoogleSignInAccount googleSignInAccount = loginEmailActivity.mGoogleSignInAccount;
            loginEmailActivity.gotoAgreementWebViewActivity(string, str, str, str2, EventBusConstKt.THIRD_REGISTER, String.valueOf(googleSignInAccount == null ? null : googleSignInAccount.mo24419Q()), "");
            return;
        }
        loginEmailActivity.gotoPolicy(EventBusConstKt.REGISTER);
    }

    /* renamed from: subscribeObservable$lambda-12  reason: not valid java name */
    public static final void m26831subscribeObservable$lambda12(LoginEmailActivity loginEmailActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginEmailActivity, "this$0");
        loginEmailActivity.hideLoading();
        boolean z = false;
        ((AccountViewModel) loginEmailActivity.getMViewModel()).updateLoadingStatus(false);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (pair.getSecond() != null) {
                loginEmailActivity.gotoMainActivity();
            } else {
                String obj = ((EditText) loginEmailActivity._$_findCachedViewById(R$id.sign_email)).getText().toString();
                if (obj.length() == 0) {
                    z = true;
                }
                if (z) {
                    GoogleSignInAccount currentUser = ThirdLoginForGoogleUtils.Companion.getCurrentUser(loginEmailActivity);
                    obj = String.valueOf(currentUser == null ? null : currentUser.mo24419Q());
                }
                loginEmailActivity.gotoRegisterInputUserInfo(obj);
            }
            loginEmailActivity.finish();
            return;
        }
        String string = loginEmailActivity.getString(R$string.access_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
        loginEmailActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-14  reason: not valid java name */
    public static final void m26832subscribeObservable$lambda14(LoginEmailActivity loginEmailActivity, Pair pair) {
        ThirdAccountViewModel thirdAccountViewModel;
        String jhkSerial;
        Intrinsics.checkNotNullParameter(loginEmailActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = loginEmailActivity.getString(R$string.request_fail_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.request_fail_tips)");
            loginEmailActivity.showEmailError(true, string);
        } else if (Intrinsics.areEqual(pair.getSecond(), (Object) "1")) {
            loginEmailActivity.showLoading();
            ThirdAccountViewModel thirdAccountViewModel2 = loginEmailActivity.thirdLoginModel;
            String str = null;
            if (thirdAccountViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
                thirdAccountViewModel = null;
            } else {
                thirdAccountViewModel = thirdAccountViewModel2;
            }
            String string2 = loginEmailActivity.getString(R$string.server_client_id);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.server_client_id)");
            String name = ThirdAccountType.GOOGLE.name();
            GoogleSignInAccount googleSignInAccount = loginEmailActivity.mGoogleSignInAccount;
            String U = googleSignInAccount == null ? null : googleSignInAccount.mo24423U();
            Intrinsics.checkNotNull(U);
            Intrinsics.checkNotNullExpressionValue(U, "mGoogleSignInAccount?.idToken!!");
            GoogleSignInAccount googleSignInAccount2 = loginEmailActivity.mGoogleSignInAccount;
            if (googleSignInAccount2 != null) {
                str = googleSignInAccount2.mo24419Q();
            }
            String str2 = str;
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNullExpressionValue(str2, "mGoogleSignInAccount?.email!!");
            HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
            thirdAccountViewModel.thirdRegister(string2, name, U, str2, "", (hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null) ? "" : jhkSerial);
        } else {
            GoogleSignInAccount googleSignInAccount3 = loginEmailActivity.mGoogleSignInAccount;
            if (googleSignInAccount3 != null) {
                loginEmailActivity.gotoThirdRegister(googleSignInAccount3);
            }
        }
    }

    /* renamed from: subscribeObservable$lambda-16  reason: not valid java name */
    public static final void m26833subscribeObservable$lambda16(LoginEmailActivity loginEmailActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginEmailActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            loginEmailActivity.getJHLUserProtocol();
            return;
        }
        loginEmailActivity.hideLoading();
        CharSequence charSequence = (CharSequence) pair.getSecond();
        if (charSequence.length() == 0) {
            charSequence = loginEmailActivity.getString(R$string.bind_fail);
            Intrinsics.checkNotNullExpressionValue(charSequence, "getString(R.string.bind_fail)");
        }
        loginEmailActivity.showString((String) charSequence);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0107  */
    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26834subscribeObservable$lambda6(com.hisense.connect_life.app_account.activity.LoginEmailActivity r16, kotlin.Pair r17) {
        /*
            r0 = r16
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            if (r17 != 0) goto L_0x000b
            goto L_0x0124
        L_0x000b:
            java.lang.Object r1 = r17.getFirst()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r16.getJHLUserProtocol()
            goto L_0x0117
        L_0x001d:
            r16.hideLoading()
            com.hisense.connect_life.core.base.BaseViewModel r1 = r16.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r1 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r1
            r3 = 0
            r1.updateLoadingStatus(r3)
            r1 = 5
            java.lang.Object r4 = r17.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ":"
            r6 = 2
            boolean r7 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r3, (int) r6, (java.lang.Object) r2)
            java.lang.String r8 = "600905"
            r9 = 1
            if (r7 == 0) goto L_0x005b
            java.lang.Object r1 = r17.getSecond()
            r10 = r1
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String[] r11 = new java.lang.String[]{r5}
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            java.util.List r1 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r10, (java.lang.String[]) r11, (boolean) r12, (int) r13, (int) r14, (java.lang.Object) r15)
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            r4 = r8
        L_0x005b:
            int r5 = r4.hashCode()
            java.lang.String r7 = "600925"
            java.lang.String r10 = "600924"
            if (r5 == 0) goto L_0x00a0
            r11 = 1591789448(0x5ee0c788, float:8.0985321E18)
            if (r5 == r11) goto L_0x008a
            switch(r5) {
                case 1591789509: goto L_0x007c;
                case 1591789510: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x00a8
        L_0x006e:
            boolean r1 = r4.equals(r7)
            if (r1 != 0) goto L_0x0075
            goto L_0x00a8
        L_0x0075:
            int r1 = com.hisense.connect_life.app_account.R$string.account_locked
            java.lang.String r1 = r0.getString(r1)
            goto L_0x00b5
        L_0x007c:
            boolean r1 = r4.equals(r10)
            if (r1 != 0) goto L_0x0083
            goto L_0x00a8
        L_0x0083:
            int r1 = com.hisense.connect_life.app_account.R$string.untrusted_device
            java.lang.String r1 = r0.getString(r1)
            goto L_0x00b5
        L_0x008a:
            boolean r5 = r4.equals(r8)
            if (r5 != 0) goto L_0x0091
            goto L_0x00a8
        L_0x0091:
            int r5 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password_num
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8[r3] = r1
            java.lang.String r1 = r0.getString(r5, r8)
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x00af
        L_0x00a8:
            int r1 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r1 = r0.getString(r1)
            goto L_0x00b5
        L_0x00af:
            int r1 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r1 = r0.getString(r1)
        L_0x00b5:
            java.lang.String r5 = "when (secondStr) {\n     …rd)\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r0.showString((java.lang.String) r1)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r10)
            if (r5 == 0) goto L_0x0107
            showEmailError$default(r0, r3, r2, r6, r2)
            showPasswordError$default(r0, r3, r2, r6, r2)
            com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity$Companion r1 = com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.Companion
            int r1 = r1.getCODE_DEV_VER()
            c.a.a.a.b.a r3 = p040c.p041a.p042a.p043a.p045b.C1337a.m211c()
            java.lang.String r4 = "/account/DeviceCerVerificationActivity"
            com.alibaba.android.arouter.facade.Postcard r3 = r3.mo15011a(r4)
            int r4 = com.hisense.connect_life.app_account.R$id.sign_email
            android.view.View r4 = r0._$_findCachedViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "email"
            r3.withString(r5, r4)
            int r4 = com.hisense.connect_life.app_account.R$id.sign_password
            android.view.View r4 = r0._$_findCachedViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "psw"
            r3.withString(r5, r4)
            r3.navigation((android.app.Activity) r0, (int) r1)
            goto L_0x0117
        L_0x0107:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r3 == 0) goto L_0x0111
            r16.gotoResetPwd()
            goto L_0x0117
        L_0x0111:
            r0.showEmailError(r9, r1)
            r0.showPasswordError(r9, r1)
        L_0x0117:
            com.hisense.connect_life.core.base.BaseViewModel r0 = r16.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r0 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getSignInLiveData()
            r0.setValue(r2)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.LoginEmailActivity.m26834subscribeObservable$lambda6(com.hisense.connect_life.app_account.activity.LoginEmailActivity, kotlin.Pair):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* renamed from: subscribeObservable$lambda-8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26835subscribeObservable$lambda8(com.hisense.connect_life.app_account.activity.LoginEmailActivity r4, kotlin.Pair r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 != 0) goto L_0x0009
            goto L_0x00af
        L_0x0009:
            java.lang.Object r0 = r5.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001a
            r4.getJHLUserProtocol()
            goto L_0x00a1
        L_0x001a:
            java.lang.Object r0 = r5.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            java.lang.String r2 = "600919"
            if (r1 == 0) goto L_0x005f
            r3 = 1591789483(0x5ee0c7ab, float:8.0985513E18)
            if (r1 == r3) goto L_0x0051
            switch(r1) {
                case 1591789447: goto L_0x0041;
                case 1591789448: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0067
        L_0x0031:
            java.lang.String r1 = "600905"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003a
            goto L_0x0067
        L_0x003a:
            int r0 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0074
        L_0x0041:
            java.lang.String r1 = "600904"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004a
            goto L_0x0067
        L_0x004a:
            int r0 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0074
        L_0x0051:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            int r0 = com.hisense.connect_life.app_account.R$string.third_account_unbind
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0074
        L_0x005f:
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006e
        L_0x0067:
            int r0 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0074
        L_0x006e:
            int r0 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r0 = r4.getString(r0)
        L_0x0074:
            java.lang.String r1 = "when (it.second) {\n     …rd)\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r5 = r5.getSecond()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r2)
            if (r5 == 0) goto L_0x008a
            r5 = 1
            r4.isThirdRegister = r5
            r4.getJHLProtocol()
            goto L_0x008d
        L_0x008a:
            r4.showString((java.lang.String) r0)
        L_0x008d:
            com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils$Companion r5 = com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils.Companion
            com.hisense.connect_life.app_account.activity.LoginEmailActivity$subscribeObservable$2$1$1 r0 = com.hisense.connect_life.app_account.activity.LoginEmailActivity$subscribeObservable$2$1$1.INSTANCE
            r5.signOut(r4, r0)
            r4.hideLoading()
            com.hisense.connect_life.core.base.BaseViewModel r5 = r4.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r5 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r5
            r0 = 0
            r5.updateLoadingStatus(r0)
        L_0x00a1:
            com.hisense.connect_life.core.base.BaseViewModel r4 = r4.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r4 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r4
            androidx.lifecycle.MutableLiveData r4 = r4.getSignInLiveData()
            r5 = 0
            r4.setValue(r5)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.LoginEmailActivity.m26835subscribeObservable$lambda8(com.hisense.connect_life.app_account.activity.LoginEmailActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-9  reason: not valid java name */
    public static final void m26836subscribeObservable$lambda9(LoginEmailActivity loginEmailActivity, Pair pair) {
        String str;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(loginEmailActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str2 = "";
            if (pair.getSecond() == null) {
                loginEmailActivity.termsConditionsUrl = str2;
                loginEmailActivity.connetlifePrivacyPolicyUrl = str2;
                loginEmailActivity.jhlNeedUserAgreementCount = -1;
                return;
            }
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData = (JHLAgreementData) pair.getSecond();
            Integer num = null;
            companion.mo39138e(Intrinsics.stringPlus("jhl tosVer: ", jHLAgreementData == null ? null : jHLAgreementData.getTosVersion()));
            LogUtilsShen.Companion companion2 = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData2 = (JHLAgreementData) pair.getSecond();
            companion2.mo39138e(Intrinsics.stringPlus("jhl ppVer: ", jHLAgreementData2 == null ? null : jHLAgreementData2.getPpVersion()));
            SPUtils sPUtils = SPUtils.INSTANCE;
            JHLAgreementData jHLAgreementData3 = (JHLAgreementData) pair.getSecond();
            if (jHLAgreementData3 == null || (str = jHLAgreementData3.getTosVersion()) == null) {
                str = str2;
            }
            sPUtils.put(KeyConst.KEY_JHL_TOSVER, str);
            SPUtils sPUtils2 = SPUtils.INSTANCE;
            JHLAgreementData jHLAgreementData4 = (JHLAgreementData) pair.getSecond();
            if (!(jHLAgreementData4 == null || (ppVersion = jHLAgreementData4.getPpVersion()) == null)) {
                str2 = ppVersion;
            }
            sPUtils2.put(KeyConst.KEY_JHL_PPVER, str2);
            JHLAgreementData jHLAgreementData5 = (JHLAgreementData) pair.getSecond();
            loginEmailActivity.termsConditionsUrl = jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl();
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            loginEmailActivity.connetlifePrivacyPolicyUrl = jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl();
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                num = 0;
            } else {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                if (!(jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null)) {
                    num = Integer.valueOf(Integer.parseInt(updateCount));
                }
            }
            loginEmailActivity.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                loginEmailActivity.getUserProfile();
                return;
            }
            loginEmailActivity.hideLoading();
            String string = loginEmailActivity.getString(R$string.register_privacy_policy_terms_conditions);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.regis…_policy_terms_conditions)");
            String str3 = loginEmailActivity.termsConditionsUrl;
            gotoAgreementWebViewActivity$default(loginEmailActivity, string, str3, str3, loginEmailActivity.connetlifePrivacyPolicyUrl, EventBusConstKt.LOGIN, (String) null, (String) null, 96, (Object) null);
            return;
        }
        loginEmailActivity.hideLoading();
        String string2 = loginEmailActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.no_internet_connection)");
        loginEmailActivity.showString(string2);
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
        return R$layout.activity_login_email;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        String str;
        getWindow().getDecorView().setSystemUiVisibility(8192);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, com.hisense.connect_life.core.R$color.colorBackground_e));
        String string = getString(R$string.password);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.password)");
        String upperCase = string.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        ((TextView) _$_findCachedViewById(R$id.tv_title_password)).setText(upperCase);
        EditText editText = (EditText) _$_findCachedViewById(R$id.sign_email);
        String string2 = getString(R$string.setting_email);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.setting_email)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String lowerCase = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = lowerCase.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                str = CharsKt__CharJVMKt.titlecase(charAt, locale2);
            } else {
                str = String.valueOf(charAt);
            }
            sb.append(str);
            String substring = lowerCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            lowerCase = sb.toString();
        }
        editText.setHint(lowerCase);
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.forget_password)).getPaint().setFlags(8);
        this.thirdLoginModel = new ThirdAccountViewModel();
        setNextShow();
        ThirdLoginForGoogleUtils.Companion.initGoogleLogin(this);
        CheckUpgradeTool checkUpgradeTool = CheckUpgradeTool.INSTANCE;
        Application application = getApplication();
        if (application != null) {
            checkUpgradeTool.checkUpgrade((BaseApplication) application);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.core.base.BaseApplication");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ ApiException -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, @org.jetbrains.annotations.Nullable android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            java.lang.String r0 = ""
            r1 = 9001(0x2329, float:1.2613E-41)
            if (r4 != r1) goto L_0x00a8
            c.q.a.c.m.j r4 = p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a.m8297c(r6)
            java.lang.Class<com.google.android.gms.common.api.ApiException> r5 = com.google.android.gms.common.api.ApiException.class
            java.lang.Object r4 = r4.mo28853n(r5)     // Catch:{ ApiException -> 0x0076 }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4     // Catch:{ ApiException -> 0x0076 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ ApiException -> 0x0076 }
            r3.mGoogleSignInAccount = r4     // Catch:{ ApiException -> 0x0076 }
            java.lang.String r5 = "firebaseAuthWithGoogle:"
            java.lang.String r6 = r4.mo24423U()     // Catch:{ ApiException -> 0x0076 }
            kotlin.jvm.internal.Intrinsics.stringPlus(r5, r6)     // Catch:{ ApiException -> 0x0076 }
            java.lang.String r5 = r4.mo24423U()     // Catch:{ ApiException -> 0x0076 }
            r6 = 1
            if (r5 == 0) goto L_0x0033
            int r5 = r5.length()     // Catch:{ ApiException -> 0x0076 }
            if (r5 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5 = 0
            goto L_0x0034
        L_0x0033:
            r5 = r6
        L_0x0034:
            if (r5 != 0) goto L_0x00f5
            r3.showLoading(r6)     // Catch:{ ApiException -> 0x0076 }
            com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel r5 = r3.thirdLoginModel     // Catch:{ ApiException -> 0x0076 }
            if (r5 != 0) goto L_0x0043
            java.lang.String r5 = "thirdLoginModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ ApiException -> 0x0076 }
            r5 = 0
        L_0x0043:
            java.lang.String r6 = "GOOGLE"
            int r1 = com.hisense.connect_life.app_account.R$string.server_client_id     // Catch:{ ApiException -> 0x0076 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ ApiException -> 0x0076 }
            java.lang.String r2 = "getString(R.string.server_client_id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ ApiException -> 0x0076 }
            java.lang.String r4 = r4.mo24423U()     // Catch:{ ApiException -> 0x0076 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ ApiException -> 0x0076 }
            java.lang.String r2 = "account.idToken!!"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ ApiException -> 0x0076 }
            com.hisense.connect_life.hismart.core.HiSmart$Companion r2 = com.hisense.connect_life.hismart.core.HiSmart.Companion     // Catch:{ ApiException -> 0x0076 }
            com.hisense.connect_life.hismart.core.HiSmart r2 = r2.getInstance()     // Catch:{ ApiException -> 0x0076 }
            com.hisense.connect_life.hismart.core.HiSystemParameter r2 = r2.getHiSystemParameter()     // Catch:{ ApiException -> 0x0076 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.String r2 = r2.getJhkSerial()     // Catch:{ ApiException -> 0x0076 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            r5.thirdSignIn(r6, r1, r4, r0)     // Catch:{ ApiException -> 0x0076 }
            goto L_0x00f5
        L_0x0076:
            r4 = move-exception
            int r5 = r4.getStatusCode()
            r6 = 7
            if (r5 == r6) goto L_0x008e
            r6 = 10
            if (r5 == r6) goto L_0x0088
            int r5 = com.hisense.connect_life.app_account.R$string.third_login_failed
            r3.showString((int) r5)
            goto L_0x0093
        L_0x0088:
            int r5 = com.hisense.connect_life.app_account.R$string.invalid_account
            r3.showString((int) r5)
            goto L_0x0093
        L_0x008e:
            int r5 = com.hisense.connect_life.app_account.R$string.network_lost
            r3.showString((int) r5)
        L_0x0093:
            int r5 = r4.getStatusCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Google sign in failed"
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r5)
            com.google.android.gms.common.api.Status r4 = r4.getStatus()
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r4)
            goto L_0x00f5
        L_0x00a8:
            com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity$Companion r1 = com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.Companion
            int r1 = r1.getCODE_DEV_VER()
            if (r4 != r1) goto L_0x00f5
            r4 = -1
            if (r5 != r4) goto L_0x00f5
            if (r6 != 0) goto L_0x00b6
            goto L_0x00c0
        L_0x00b6:
            java.lang.String r4 = "AuthCode"
            java.lang.String r4 = r6.getStringExtra(r4)
            if (r4 != 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r0 = r4
        L_0x00c0:
            int r4 = com.hisense.connect_life.app_account.R$id.sign_email
            android.view.View r4 = r3._$_findCachedViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            int r5 = com.hisense.connect_life.app_account.R$id.sign_password
            android.view.View r5 = r3._$_findCachedViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            boolean r6 = p040c.p072c.p073a.p074a.C1519p.m1017a(r4)
            if (r6 == 0) goto L_0x00f5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00f5
            com.hisense.connect_life.core.base.BaseViewModel r6 = r3.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r6 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r6
            r6.signIn(r4, r5, r0)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.LoginEmailActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public void onStart() {
        super.onStart();
        if (!ThirdLoginForGoogleUtils.Companion.checkUserLogin(this)) {
            ThirdLoginForGoogleUtils.Companion.signOut(this);
        }
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.btn_cancel);
        Intrinsics.checkNotNullExpressionValue(button, "btn_cancel");
        JuConnectExtKt.singleClickListener(button, new LoginEmailActivity$setListeners$1(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button2, "next");
        JuConnectExtKt.singleClickListener(button2, new LoginEmailActivity$setListeners$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.register_account);
        Intrinsics.checkNotNullExpressionValue(textView, "register_account");
        JuConnectExtKt.singleClickListener(textView, new LoginEmailActivity$setListeners$3(this));
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.sign_in_google_button);
        Intrinsics.checkNotNullExpressionValue(imageView, "sign_in_google_button");
        JuConnectExtKt.singleClickListener(imageView, new LoginEmailActivity$setListeners$4(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.forget_password);
        Intrinsics.checkNotNullExpressionValue(textView2, "forget_password");
        JuConnectExtKt.singleClickListener(textView2, new LoginEmailActivity$setListeners$5(this));
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.show_hide_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "show_hide_password");
        JuConnectExtKt.singleClickListener(iconFontView, new LoginEmailActivity$setListeners$6(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.sign_email);
        Intrinsics.checkNotNullExpressionValue(editText, "sign_email");
        editText.addTextChangedListener(new LoginEmailActivity$setListeners$$inlined$doAfterTextChanged$1(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.sign_password);
        Intrinsics.checkNotNullExpressionValue(editText2, "sign_password");
        editText2.addTextChangedListener(new LoginEmailActivity$setListeners$$inlined$doAfterTextChanged$2(this));
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R$id.email_drop_down);
        Intrinsics.checkNotNullExpressionValue(imageView2, "email_drop_down");
        JuConnectExtKt.singleClickListener(imageView2, new LoginEmailActivity$setListeners$9(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getSignInLiveData().observe(this, new C7238s1(this));
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        ThirdAccountViewModel thirdAccountViewModel2 = null;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdLoginLiveData().observe(this, new C7249v0(this));
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7212m(this));
        ((AccountViewModel) getMViewModel()).getGetJHLRegisterProtocolLiveData().observe(this, new C7252w(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7265z0(this));
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7244u(this));
        ThirdAccountViewModel thirdAccountViewModel3 = this.thirdLoginModel;
        if (thirdAccountViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
        } else {
            thirdAccountViewModel2 = thirdAccountViewModel3;
        }
        thirdAccountViewModel2.getThirdRegisterLiveData().observe(this, new C7261y0(this));
    }

    private final void gotoPolicy(String str, String str2, String str3, String str4, String str5) {
        hideLoading();
        if (TextUtils.isEmpty(this.termsConditionsUrl) || TextUtils.isEmpty(this.connetlifePrivacyPolicyUrl)) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Intrinsics.areEqual((Object) str, (Object) EventBusConstKt.REGISTER) ? Paths.Account.RegisterInputEmaliActiviy : Paths.Account.PrivacyPolicyActivity);
        a.withString(EventBusConstKt.ORIGIN, str).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", "").withString(EventBusConstKt.ID_TOKEN, str4).withString(EventBusConstKt.THIRD_ID, str5).withString("email", str2).withString(EventBusConstKt.PSW, str3);
        a.navigation();
    }
}
