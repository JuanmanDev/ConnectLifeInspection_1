package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.CheckUpgradeTool;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.app_account.widget.ConfirmMessageDialog;
import com.hisense.connect_life.core.R$color;
import com.hisense.connect_life.core.base.BaseApplication;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.global.ThirdAccountType;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p429r.p430a.p431a.p432b.C7164a0;
import p040c.p429r.p430a.p431a.p432b.C7178d1;
import p040c.p429r.p430a.p431a.p432b.C7199i2;
import p040c.p429r.p430a.p431a.p432b.C7222o1;
import p040c.p429r.p430a.p431a.p432b.C7229q0;
import p040c.p429r.p430a.p431a.p432b.C7243t2;

@Route(path = "/account/RegisterInputEmaliActiviy")
@Metadata(mo47990d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001XB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u0011H\u0014J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0005H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002JD\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u0005H\u0002J\b\u00102\u001a\u00020 H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u0005H\u0002J0\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020 2\u0006\u00100\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u00020 H\u0002J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020\u0014H\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0016J\b\u0010=\u001a\u00020 H\u0014J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u0005H\u0002J\"\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00112\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\b\u0010E\u001a\u00020 H\u0014J\b\u0010F\u001a\u00020 H\u0014J\b\u0010G\u001a\u00020 H\u0014J\b\u0010H\u001a\u00020 H\u0002J\u001a\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\u0005H\u0002J\u0018\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0002J*\u0010Q\u001a\u00020 2\u0006\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\u00052\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020 H\u0002J\b\u0010W\u001a\u00020 H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006Y"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterInputEmaliActiviy;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "connetlifePrivacyPolicyUrl", "", "getConnetlifePrivacyPolicyUrl", "()Ljava/lang/String;", "setConnetlifePrivacyPolicyUrl", "(Ljava/lang/String;)V", "extraFont", "Landroid/graphics/Typeface;", "getExtraFont", "()Landroid/graphics/Typeface;", "extraFont$delegate", "Lkotlin/Lazy;", "jhlNeedUserAgreementCount", "", "Ljava/lang/Integer;", "mGoogleSignInAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "registerType", "termsConditionsUrl", "getTermsConditionsUrl", "setTermsConditionsUrl", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "vidaaPrivacyPolicyUrl", "getVidaaPrivacyPolicyUrl", "setVidaaPrivacyPolicyUrl", "bindLayout", "changeStatusBarColor", "", "checkEmailFormat", "", "checkPasswordFormat", "password", "checkPasswordSame", "enableNextButton", "enabled", "getJHLUserProtocol", "getUserProfile", "gotoAgreementWebViewActivity", "title", "url", "userAgreementUrl", "privacyPolicyUrl", "from", "email", "pwd", "gotoMainActivity", "gotoPolicy", "type", "idToken", "thirdId", "gotoRegisterInputUserInfo", "gotoRegisterSuccess", "gotoThirdRegister", "account", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isContainsNumbersAndLetters", "str", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onStart", "setListeners", "setNextShow", "showEmailError", "showError", "content", "showHidePassword", "editText", "Landroid/widget/EditText;", "iconText", "Lcom/hisense/connect_life/core/widget/IconFontView;", "showPasswordError", "tvError", "Landroid/widget/TextView;", "pwdRoot", "Landroid/widget/LinearLayout;", "showUnbindDialog", "subscribeObservable", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterInputEmaliActiviy.kt */
public final class RegisterInputEmaliActiviy extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = RegisterInputEmaliActiviy.class.getSimpleName();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "connetlifePrivacyPolicyUrl")
    public String connetlifePrivacyPolicyUrl;
    @NotNull
    public final Lazy extraFont$delegate = LazyKt__LazyJVMKt.lazy(new RegisterInputEmaliActiviy$extraFont$2(this));
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @Nullable
    public GoogleSignInAccount mGoogleSignInAccount;
    @NotNull
    public String registerType = EventBusConstKt.REGISTER;
    @Autowired(name = "termsConditionsUrl")
    public String termsConditionsUrl;
    public ThirdAccountViewModel thirdLoginModel;
    @Autowired(name = "vidaaPrivacyPolicyUrl")
    public String vidaaPrivacyPolicyUrl;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterInputEmaliActiviy$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RegisterInputEmaliActiviy.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return RegisterInputEmaliActiviy.TAG;
        }
    }

    public static final /* synthetic */ AccountViewModel access$getMViewModel(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        return (AccountViewModel) registerInputEmaliActiviy.getMViewModel();
    }

    private final void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R$color.colorBackground_e));
        }
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

    /* access modifiers changed from: private */
    public final boolean checkPasswordSame() {
        return Intrinsics.areEqual((Object) ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString(), (Object) ((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).getText().toString());
    }

    private final void enableNextButton(boolean z) {
        Button button = (Button) _$_findCachedViewById(R$id.next);
        button.setTextColor(button.getResources().getColor(z ? com.hisense.connect_life.app_account.R$color.colorWhite : com.hisense.connect_life.app_account.R$color.colorText_86));
        button.setBackgroundResource(z ? R$drawable.button_next_select_bg : R$drawable.button_next_unselect_bg);
        button.setEnabled(z);
    }

    private final Typeface getExtraFont() {
        return (Typeface) this.extraFont$delegate.getValue();
    }

    private final void getJHLUserProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
    }

    private final void getUserProfile() {
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

    public static /* synthetic */ void gotoAgreementWebViewActivity$default(RegisterInputEmaliActiviy registerInputEmaliActiviy, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        registerInputEmaliActiviy.gotoAgreementWebViewActivity(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    private final void gotoMainActivity() {
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoPolicy(String str) {
        gotoPolicy(str, ((EditText) _$_findCachedViewById(R$id.sign_email)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString(), "", "");
    }

    private final void gotoRegisterInputUserInfo(String str) {
        if (!(str.length() == 0)) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
            a.withString("email", str).withString(EventBusConstKt.PSW, ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
            a.navigation();
        }
    }

    private final void gotoRegisterSuccess() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterSuccessActivity);
        a.withString("name", "").withString("email", SPManagerKt.getEmail()).withString(EventBusConstKt.PSW, SPManagerKt.getPsw()).withString("firstName", "").withString("lastName", "").withString("thirdPlatformId", getString(R$string.server_client_id)).withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, SPManagerKt.getToken());
        a.navigation();
    }

    private final void gotoThirdRegister(GoogleSignInAccount googleSignInAccount) {
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
        enableNextButton(checkEmailFormat() && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()) && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).getText().toString()) && checkPasswordSame());
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

    public static /* synthetic */ void showEmailError$default(RegisterInputEmaliActiviy registerInputEmaliActiviy, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        registerInputEmaliActiviy.showEmailError(z, str);
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
    public final void showPasswordError(boolean z, String str, TextView textView, LinearLayout linearLayout) {
        if (!z) {
            str = "";
        }
        textView.setText(str);
        linearLayout.setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_white);
    }

    public static /* synthetic */ void showPasswordError$default(RegisterInputEmaliActiviy registerInputEmaliActiviy, boolean z, String str, TextView textView, LinearLayout linearLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        registerInputEmaliActiviy.showPasswordError(z, str, textView, linearLayout);
    }

    private final void showUnbindDialog() {
        ConfirmMessageDialog confirmMessageDialog = new ConfirmMessageDialog(R$string.account_already_register, R$string.f15677OK, R$string.change);
        confirmMessageDialog.setIItemCallback(new RegisterInputEmaliActiviy$showUnbindDialog$1(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(confirmMessageDialog, supportFragmentManager);
    }

    /* renamed from: subscribeObservable$lambda-10  reason: not valid java name */
    public static final void m26860subscribeObservable$lambda10(RegisterInputEmaliActiviy registerInputEmaliActiviy, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputEmaliActiviy, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            registerInputEmaliActiviy.showString(R$string.register_success);
            registerInputEmaliActiviy.gotoRegisterSuccess();
            return;
        }
        registerInputEmaliActiviy.hideLoading();
        String string = ((CharSequence) pair.getSecond()).length() == 0 ? registerInputEmaliActiviy.getString(R$string.register_fail) : (String) pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(string, "if (it.second.isEmpty())…ster_fail) else it.second");
        registerInputEmaliActiviy.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26861subscribeObservable$lambda4(RegisterInputEmaliActiviy registerInputEmaliActiviy, Pair pair) {
        ThirdAccountViewModel thirdAccountViewModel;
        String jhkSerial;
        Intrinsics.checkNotNullParameter(registerInputEmaliActiviy, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = registerInputEmaliActiviy.getString(R$string.request_fail_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.request_fail_tips)");
            registerInputEmaliActiviy.showEmailError(true, string);
        } else if (Intrinsics.areEqual((Object) registerInputEmaliActiviy.registerType, (Object) EventBusConstKt.THIRD_REGISTER)) {
            if (Intrinsics.areEqual(pair.getSecond(), (Object) "1")) {
                ThirdAccountViewModel thirdAccountViewModel2 = registerInputEmaliActiviy.thirdLoginModel;
                String str = null;
                if (thirdAccountViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
                    thirdAccountViewModel = null;
                } else {
                    thirdAccountViewModel = thirdAccountViewModel2;
                }
                String string2 = registerInputEmaliActiviy.getString(R$string.server_client_id);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.server_client_id)");
                String name = ThirdAccountType.GOOGLE.name();
                GoogleSignInAccount googleSignInAccount = registerInputEmaliActiviy.mGoogleSignInAccount;
                String U = googleSignInAccount == null ? null : googleSignInAccount.mo24423U();
                Intrinsics.checkNotNull(U);
                Intrinsics.checkNotNullExpressionValue(U, "mGoogleSignInAccount?.idToken!!");
                GoogleSignInAccount googleSignInAccount2 = registerInputEmaliActiviy.mGoogleSignInAccount;
                if (googleSignInAccount2 != null) {
                    str = googleSignInAccount2.mo24419Q();
                }
                String str2 = str;
                Intrinsics.checkNotNull(str2);
                Intrinsics.checkNotNullExpressionValue(str2, "mGoogleSignInAccount?.email!!");
                HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
                thirdAccountViewModel.thirdRegister(string2, name, U, str2, "", (hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null) ? "" : jhkSerial);
                return;
            }
            GoogleSignInAccount googleSignInAccount3 = registerInputEmaliActiviy.mGoogleSignInAccount;
            if (googleSignInAccount3 != null) {
                registerInputEmaliActiviy.gotoThirdRegister(googleSignInAccount3);
            }
        } else if (Intrinsics.areEqual(pair.getSecond(), (Object) "1")) {
            String string3 = registerInputEmaliActiviy.getString(R$string.email_has_registered_tips);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.email_has_registered_tips)");
            registerInputEmaliActiviy.showEmailError(true, string3);
        } else {
            String string4 = registerInputEmaliActiviy.getString(R$string.register_privacy_policy_terms_conditions);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.regis…_policy_terms_conditions)");
            registerInputEmaliActiviy.gotoAgreementWebViewActivity(string4, registerInputEmaliActiviy.getTermsConditionsUrl(), registerInputEmaliActiviy.getTermsConditionsUrl(), registerInputEmaliActiviy.getConnetlifePrivacyPolicyUrl(), EventBusConstKt.REGISTER, ((EditText) registerInputEmaliActiviy._$_findCachedViewById(R$id.sign_email)).getText().toString(), ((EditText) registerInputEmaliActiviy._$_findCachedViewById(R$id.sign_password)).getText().toString());
        }
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26862subscribeObservable$lambda5(RegisterInputEmaliActiviy registerInputEmaliActiviy, Pair pair) {
        String str;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(registerInputEmaliActiviy, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str2 = "";
            if (pair == null) {
                registerInputEmaliActiviy.setTermsConditionsUrl(str2);
                registerInputEmaliActiviy.setConnetlifePrivacyPolicyUrl(str2);
                registerInputEmaliActiviy.jhlNeedUserAgreementCount = 0;
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
            registerInputEmaliActiviy.setTermsConditionsUrl(String.valueOf(jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl()));
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            registerInputEmaliActiviy.setConnetlifePrivacyPolicyUrl(String.valueOf(jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl()));
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                num = 0;
            } else {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                if (!(jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null)) {
                    num = Integer.valueOf(Integer.parseInt(updateCount));
                }
            }
            registerInputEmaliActiviy.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                registerInputEmaliActiviy.getUserProfile();
                return;
            }
            registerInputEmaliActiviy.hideLoading();
            registerInputEmaliActiviy.gotoPolicy(EventBusConstKt.LOGIN);
            return;
        }
        registerInputEmaliActiviy.hideLoading();
        String string = registerInputEmaliActiviy.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        registerInputEmaliActiviy.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m26863subscribeObservable$lambda6(RegisterInputEmaliActiviy registerInputEmaliActiviy, JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(registerInputEmaliActiviy, "this$0");
        registerInputEmaliActiviy.hideLoading();
        if (jHLAgreementData == null) {
            registerInputEmaliActiviy.setTermsConditionsUrl("");
            registerInputEmaliActiviy.setConnetlifePrivacyPolicyUrl("");
        } else {
            registerInputEmaliActiviy.setTermsConditionsUrl(jHLAgreementData.getTosUrl());
            registerInputEmaliActiviy.setConnetlifePrivacyPolicyUrl(jHLAgreementData.getPpUrl());
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_TOSVER, jHLAgreementData.getTosVersion());
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_PPVER, jHLAgreementData.getPpVersion());
        }
        registerInputEmaliActiviy.gotoPolicy(EventBusConstKt.REGISTER);
    }

    /* renamed from: subscribeObservable$lambda-7  reason: not valid java name */
    public static final void m26864subscribeObservable$lambda7(RegisterInputEmaliActiviy registerInputEmaliActiviy, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputEmaliActiviy, "this$0");
        registerInputEmaliActiviy.hideLoading();
        ((AccountViewModel) registerInputEmaliActiviy.getMViewModel()).updateLoadingStatus(false);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (pair.getSecond() != null) {
                registerInputEmaliActiviy.gotoMainActivity();
            } else {
                GoogleSignInAccount currentUser = ThirdLoginForGoogleUtils.Companion.getCurrentUser(registerInputEmaliActiviy);
                registerInputEmaliActiviy.gotoRegisterInputUserInfo(String.valueOf(currentUser == null ? null : currentUser.mo24419Q()));
            }
            registerInputEmaliActiviy.finish();
            return;
        }
        String string = registerInputEmaliActiviy.getString(R$string.access_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
        registerInputEmaliActiviy.showString(string);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* renamed from: subscribeObservable$lambda-9  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26865subscribeObservable$lambda9(com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy r10, kotlin.Pair r11) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r11 != 0) goto L_0x0009
            goto L_0x00cf
        L_0x0009:
            java.lang.Object r0 = r11.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r10.getJHLUserProtocol()
            goto L_0x00c2
        L_0x001b:
            java.lang.Object r0 = r11.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            java.lang.String r3 = "600919"
            if (r2 == 0) goto L_0x0060
            r4 = 1591789483(0x5ee0c7ab, float:8.0985513E18)
            if (r2 == r4) goto L_0x0052
            switch(r2) {
                case 1591789447: goto L_0x0042;
                case 1591789448: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0068
        L_0x0032:
            java.lang.String r2 = "600905"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003b
            goto L_0x0068
        L_0x003b:
            int r0 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r0 = r10.getString(r0)
            goto L_0x0075
        L_0x0042:
            java.lang.String r2 = "600904"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004b
            goto L_0x0068
        L_0x004b:
            int r0 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r0 = r10.getString(r0)
            goto L_0x0075
        L_0x0052:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0059
            goto L_0x0068
        L_0x0059:
            int r0 = com.hisense.connect_life.app_account.R$string.third_account_unbind
            java.lang.String r0 = r10.getString(r0)
            goto L_0x0075
        L_0x0060:
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x006f
        L_0x0068:
            int r0 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r0 = r10.getString(r0)
            goto L_0x0075
        L_0x006f:
            int r0 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r0 = r10.getString(r0)
        L_0x0075:
            java.lang.String r2 = "when (it.second) {\n     …rd)\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.Object r11 = r11.getSecond()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r3)
            if (r11 == 0) goto L_0x00b2
            int r11 = com.hisense.connect_life.app_account.R$string.register_privacy_policy_terms_conditions
            java.lang.String r3 = r10.getString(r11)
            java.lang.String r11 = "getString(R.string.regis…_policy_terms_conditions)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
            java.lang.String r4 = r10.getTermsConditionsUrl()
            java.lang.String r5 = r10.getTermsConditionsUrl()
            java.lang.String r6 = r10.getConnetlifePrivacyPolicyUrl()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r11 = r10.mGoogleSignInAccount
            if (r11 != 0) goto L_0x00a1
            r11 = r1
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r11 = r11.mo24419Q()
        L_0x00a5:
            java.lang.String r8 = java.lang.String.valueOf(r11)
            java.lang.String r7 = "thirdRegister"
            java.lang.String r9 = ""
            r2 = r10
            r2.gotoAgreementWebViewActivity(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00b5
        L_0x00b2:
            r10.showString((java.lang.String) r0)
        L_0x00b5:
            r10.hideLoading()
            com.hisense.connect_life.core.base.BaseViewModel r11 = r10.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r11 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r11
            r0 = 0
            r11.updateLoadingStatus(r0)
        L_0x00c2:
            com.hisense.connect_life.core.base.BaseViewModel r10 = r10.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r10 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r10
            androidx.lifecycle.MutableLiveData r10 = r10.getSignInLiveData()
            r10.setValue(r1)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy.m26865subscribeObservable$lambda9(com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy, kotlin.Pair):void");
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
        return R$layout.activity_input_email;
    }

    @NotNull
    public final String getConnetlifePrivacyPolicyUrl() {
        String str = this.connetlifePrivacyPolicyUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("connetlifePrivacyPolicyUrl");
        return null;
    }

    @NotNull
    public final String getTermsConditionsUrl() {
        String str = this.termsConditionsUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("termsConditionsUrl");
        return null;
    }

    @NotNull
    public final String getVidaaPrivacyPolicyUrl() {
        String str = this.vidaaPrivacyPolicyUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vidaaPrivacyPolicyUrl");
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        changeStatusBarColor();
        String string = getString(R$string.password);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.password)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_password)).setText(upperCase);
        String string2 = getString(R$string.repeat_password);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.repeat_password)");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_repeat_password)).setText(upperCase2);
        ViewModel viewModel = ViewModelProviders.m97of((FragmentActivity) this).get(ThirdAccountViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "of(this).get(ThirdAccountViewModel::class.java)");
        this.thirdLoginModel = (ThirdAccountViewModel) viewModel;
        LoginActivityManager.Companion.get().addActivity(this);
        ThirdLoginForGoogleUtils.Companion.initGoogleLogin(this);
        setNextShow();
        CheckUpgradeTool checkUpgradeTool = CheckUpgradeTool.INSTANCE;
        Application application = getApplication();
        if (application != null) {
            checkUpgradeTool.checkUpgrade((BaseApplication) application);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.core.base.BaseApplication");
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            try {
                GoogleSignInAccount n = C3253a.m8297c(intent).mo28853n(ApiException.class);
                Intrinsics.checkNotNull(n);
                GoogleSignInAccount googleSignInAccount = n;
                this.mGoogleSignInAccount = googleSignInAccount;
                Intrinsics.stringPlus("firebaseAuthWithGoogle:", googleSignInAccount.mo24423U());
                showLoading();
                ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
                if (thirdAccountViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
                    thirdAccountViewModel = null;
                }
                String string = getString(R$string.server_client_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_client_id)");
                String U = googleSignInAccount.mo24423U();
                Intrinsics.checkNotNull(U);
                Intrinsics.checkNotNullExpressionValue(U, "account.idToken!!");
                HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
                String str = "";
                if (hiSystemParameter != null) {
                    String jhkSerial = hiSystemParameter.getJhkSerial();
                    if (jhkSerial != null) {
                        str = jhkSerial;
                    }
                }
                thirdAccountViewModel.thirdSignIn(ThirdLoginForGoogleUtils.thirdType, string, U, str);
            } catch (ApiException e) {
                int statusCode = e.getStatusCode();
                if (statusCode == 7) {
                    showString(R$string.network_lost);
                } else if (statusCode != 10) {
                    showString(R$string.third_login_failed);
                } else {
                    showString(R$string.invalid_account);
                }
                Intrinsics.stringPlus("Google sign in failed", Integer.valueOf(e.getStatusCode()));
                Intrinsics.stringPlus("Google sign in failed", e.getStatus());
            }
        }
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

    public final void setConnetlifePrivacyPolicyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.connetlifePrivacyPolicyUrl = str;
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.btn_cancel);
        Intrinsics.checkNotNullExpressionValue(button, "btn_cancel");
        JuConnectExtKt.singleClickListener(button, new RegisterInputEmaliActiviy$setListeners$1(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button2, "next");
        JuConnectExtKt.singleClickListener(button2, new RegisterInputEmaliActiviy$setListeners$2(this));
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.show_hide_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "show_hide_password");
        JuConnectExtKt.singleClickListener(iconFontView, new RegisterInputEmaliActiviy$setListeners$3(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.show_hide_repeat_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "show_hide_repeat_password");
        JuConnectExtKt.singleClickListener(iconFontView2, new RegisterInputEmaliActiviy$setListeners$4(this));
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.sign_in_google_button);
        Intrinsics.checkNotNullExpressionValue(imageView, "sign_in_google_button");
        JuConnectExtKt.singleClickListener(imageView, new RegisterInputEmaliActiviy$setListeners$5(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.sign_email);
        Intrinsics.checkNotNullExpressionValue(editText, "sign_email");
        editText.addTextChangedListener(new C8453x9cabadbd(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.sign_password);
        Intrinsics.checkNotNullExpressionValue(editText2, "sign_password");
        editText2.addTextChangedListener(new C8454x9cabadbe(this));
        EditText editText3 = (EditText) _$_findCachedViewById(R$id.sign_repeat_password);
        Intrinsics.checkNotNullExpressionValue(editText3, "sign_repeat_password");
        editText3.addTextChangedListener(new C8455x9cabadbf(this));
    }

    public final void setTermsConditionsUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.termsConditionsUrl = str;
    }

    public final void setVidaaPrivacyPolicyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vidaaPrivacyPolicyUrl = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7222o1(this));
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7178d1(this));
        ((AccountViewModel) getMViewModel()).getGetJHLRegisterProtocolLiveData().observe(this, new C7199i2(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7243t2(this));
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        ThirdAccountViewModel thirdAccountViewModel2 = null;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdLoginLiveData().observe(this, new C7229q0(this));
        ThirdAccountViewModel thirdAccountViewModel3 = this.thirdLoginModel;
        if (thirdAccountViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
        } else {
            thirdAccountViewModel2 = thirdAccountViewModel3;
        }
        thirdAccountViewModel2.getThirdRegisterLiveData().observe(this, new C7164a0(this));
    }

    private final void gotoPolicy(String str, String str2, String str3, String str4, String str5) {
        hideLoading();
        if (TextUtils.isEmpty(getTermsConditionsUrl()) || TextUtils.isEmpty(getConnetlifePrivacyPolicyUrl())) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Intrinsics.areEqual((Object) str, (Object) EventBusConstKt.REGISTER) ? Paths.Account.RegisterInputEmaliActiviy : Paths.Account.PrivacyPolicyActivity);
        a.withString(EventBusConstKt.ORIGIN, str).withString("termsConditionsUrl", getTermsConditionsUrl()).withString("vidaaPrivacyPolicyUrl", getVidaaPrivacyPolicyUrl()).withString("connetlifePrivacyPolicyUrl", getConnetlifePrivacyPolicyUrl()).withString("thirdPlatformId", "").withString(EventBusConstKt.ID_TOKEN, str4).withString("email", str2).withString(EventBusConstKt.THIRD_ID, str5).withString(EventBusConstKt.PSW, str3);
        a.navigation();
    }
}
