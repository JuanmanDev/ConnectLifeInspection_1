package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.global.ThirdAccountType;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7175c2;
import p040c.p429r.p430a.p431a.p432b.C7181e0;
import p040c.p429r.p430a.p431a.p432b.C7193h0;
import p040c.p429r.p430a.p431a.p432b.C7204k;
import p040c.p429r.p430a.p431a.p432b.C7211l2;
import p040c.p429r.p430a.p431a.p432b.C7215m2;

@Route(path = "/account/RegisterSuccessActivity")
@Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0003J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u0015H\u0014J\b\u00106\u001a\u000204H\u0002J\u0018\u00107\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u000204H\u0002J\b\u00109\u001a\u000204H\u0002J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\u0005H\u0002J\b\u0010<\u001a\u000204H\u0002J\b\u0010=\u001a\u000204H\u0002J\b\u0010>\u001a\u000204H\u0002J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0016J\b\u0010A\u001a\u000204H\u0014J\"\u0010B\u001a\u0002042\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00152\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\b\u0010G\u001a\u000204H\u0016J\b\u0010H\u001a\u000204H\u0014J\b\u0010I\u001a\u000204H\u0014J\b\u0010J\u001a\u000204H\u0002J\b\u0010K\u001a\u000204H\u0016J\b\u0010L\u001a\u000204H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001e\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001e\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001e\u0010 \u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u0010\u0010#\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001e\u0010,\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\u001e\u0010/\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\u0010\u00102\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterSuccessActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "connetlifePrivacyPolicyUrl", "", "displayName", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "firstName", "getFirstName", "setFirstName", "id", "getId", "setId", "jhlNeedUserAgreementCount", "", "Ljava/lang/Integer;", "lastName", "getLastName", "setLastName", "name", "getName", "setName", "photoUrl", "getPhotoUrl", "setPhotoUrl", "psw", "getPsw", "setPsw", "termsConditionsUrl", "thirdCallBackParams", "getThirdCallBackParams", "setThirdCallBackParams", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "thirdLoginType", "getThirdLoginType", "setThirdLoginType", "thirdPlatformId", "getThirdPlatformId", "setThirdPlatformId", "token", "getToken", "setToken", "vidaaPrivacyPolicyUrl", "JHKThirdSign", "", "bindLayout", "getJHLUserProtocol", "getSpellName", "getUserProfile", "gotoMainActivity", "gotoPolicy", "type", "gotoRegisterInputUserInfo", "gotoResetPwd", "initUserIconShow", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onDestroy", "setListeners", "signIn", "subscribeObservable", "updateJHLUserRegisterProtocol", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterSuccessActivity.kt */
public final class RegisterSuccessActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG = "RegisterSuccessActivity";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @Autowired(name = "displayName")
    public String displayName;
    @Autowired(name = "email")
    public String email;
    @Autowired(name = "firstName")
    public String firstName;
    @Autowired(name = "id")

    /* renamed from: id */
    public String f15746id;
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @Autowired(name = "lastName")
    public String lastName;
    @Autowired(name = "name")
    public String name;
    @Autowired(name = "photoUrl")
    public String photoUrl;
    @Autowired(name = "psw")
    public String psw;
    @Nullable
    public String termsConditionsUrl = "";
    @Autowired(name = "thirdCallBackParams")
    public String thirdCallBackParams;
    public ThirdAccountViewModel thirdLoginModel;
    @Autowired(name = "thirdLoginType")
    public String thirdLoginType;
    @Autowired(name = "thirdPlatformId")
    public String thirdPlatformId;
    @Autowired(name = "token")
    public String token;
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterSuccessActivity$Companion;", "", "()V", "TAG", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RegisterSuccessActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void JHKThirdSign() {
        String U;
        if (ThirdLoginForGoogleUtils.Companion.checkUserLogin(this)) {
            GoogleSignInAccount currentUser = ThirdLoginForGoogleUtils.Companion.getCurrentUser(this);
            showLoading(true);
            ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
            if (thirdAccountViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
                thirdAccountViewModel = null;
            }
            String name2 = ThirdAccountType.GOOGLE.name();
            String string = getString(R$string.server_client_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_client_id)");
            String str = "";
            if (!(currentUser == null || (U = currentUser.mo24423U()) == null)) {
                str = U;
            }
            thirdAccountViewModel.thirdSignIn(name2, string, str, HiSmart.Companion.getInstance().getJhkSerial());
            return;
        }
        ThirdLoginForGoogleUtils.Companion.thirdLogin(this);
    }

    private final void getJHLUserProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
    }

    private final String getSpellName(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Intrinsics.areEqual((Object) str, (Object) "null") || Intrinsics.areEqual((Object) str2, (Object) "null")) {
            return "UN";
        }
        char charAt = str.charAt(0);
        return Intrinsics.stringPlus(charAt + "", Character.valueOf(str2.charAt(0)));
    }

    private final void getUserProfile() {
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
    }

    private final void gotoMainActivity() {
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoPolicy(String str) {
        hideLoading();
        if (TextUtils.isEmpty(this.termsConditionsUrl) || TextUtils.isEmpty(this.connetlifePrivacyPolicyUrl)) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Intrinsics.areEqual((Object) str, (Object) EventBusConstKt.REGISTER) ? Paths.Account.RegisterInputEmaliActiviy : Paths.Account.PrivacyPolicyActivity);
        a.withString(EventBusConstKt.ORIGIN, str).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", "").withString("email", getEmail()).withString(EventBusConstKt.PSW, getPsw());
        a.navigation();
    }

    private final void gotoRegisterInputUserInfo() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getEmail()).withString(EventBusConstKt.PSW, getPsw()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        a.navigation();
    }

    private final void gotoResetPwd() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
        a.withString("email", getEmail());
        a.withString(EventBusConstKt.LOGIN, "");
        a.navigation();
    }

    private final void initUserIconShow() {
        ((TextView) _$_findCachedViewById(R$id.user_icon)).setText(getSpellName(getFirstName(), getLastName()));
    }

    /* access modifiers changed from: private */
    public final void signIn() {
        ((AccountViewModel) getMViewModel()).signIn(getEmail(), getPsw());
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26883subscribeObservable$lambda1(RegisterSuccessActivity registerSuccessActivity, Pair pair) {
        String str;
        Intrinsics.checkNotNullParameter(registerSuccessActivity, "this$0");
        if (pair != null) {
            if (((Boolean) pair.getFirst()).booleanValue()) {
                registerSuccessActivity.updateJHLUserRegisterProtocol();
            } else {
                String str2 = (String) pair.getSecond();
                int hashCode = str2.hashCode();
                if (hashCode != 0) {
                    if (hashCode != 1591789448) {
                        if (hashCode == 1591789483 && str2.equals("600919")) {
                            str = registerSuccessActivity.getString(R$string.third_account_unbind);
                            Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                            registerSuccessActivity.showString(str);
                            ThirdLoginForGoogleUtils.Companion.signOut(registerSuccessActivity, RegisterSuccessActivity$subscribeObservable$1$1$1.INSTANCE);
                            registerSuccessActivity.hideLoading();
                            ((AccountViewModel) registerSuccessActivity.getMViewModel()).updateLoadingStatus(false);
                        }
                    } else if (str2.equals("600905")) {
                        str = registerSuccessActivity.getString(R$string.wrong_email_or_password);
                        Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                        registerSuccessActivity.showString(str);
                        ThirdLoginForGoogleUtils.Companion.signOut(registerSuccessActivity, RegisterSuccessActivity$subscribeObservable$1$1$1.INSTANCE);
                        registerSuccessActivity.hideLoading();
                        ((AccountViewModel) registerSuccessActivity.getMViewModel()).updateLoadingStatus(false);
                    }
                } else if (str2.equals("")) {
                    str = registerSuccessActivity.getString(R$string.network_lost);
                    Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                    registerSuccessActivity.showString(str);
                    ThirdLoginForGoogleUtils.Companion.signOut(registerSuccessActivity, RegisterSuccessActivity$subscribeObservable$1$1$1.INSTANCE);
                    registerSuccessActivity.hideLoading();
                    ((AccountViewModel) registerSuccessActivity.getMViewModel()).updateLoadingStatus(false);
                }
                str = registerSuccessActivity.getString(R$string.wrong_email_or_password);
                Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                registerSuccessActivity.showString(str);
                ThirdLoginForGoogleUtils.Companion.signOut(registerSuccessActivity, RegisterSuccessActivity$subscribeObservable$1$1$1.INSTANCE);
                registerSuccessActivity.hideLoading();
                ((AccountViewModel) registerSuccessActivity.getMViewModel()).updateLoadingStatus(false);
            }
            ((AccountViewModel) registerSuccessActivity.getMViewModel()).getSignInLiveData().setValue(null);
        }
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26884subscribeObservable$lambda2(RegisterSuccessActivity registerSuccessActivity, Pair pair) {
        String str;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(registerSuccessActivity, "this$0");
        Integer num = 0;
        String str2 = "";
        if (pair == null) {
            registerSuccessActivity.termsConditionsUrl = str2;
            registerSuccessActivity.connetlifePrivacyPolicyUrl = str2;
            registerSuccessActivity.jhlNeedUserAgreementCount = num;
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData = (JHLAgreementData) pair.getSecond();
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
            registerSuccessActivity.termsConditionsUrl = jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl();
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            registerSuccessActivity.connetlifePrivacyPolicyUrl = jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl();
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (!TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                num = (jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null) ? null : Integer.valueOf(Integer.parseInt(updateCount));
            }
            registerSuccessActivity.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                registerSuccessActivity.getUserProfile();
                return;
            }
            registerSuccessActivity.hideLoading();
            registerSuccessActivity.gotoPolicy(EventBusConstKt.LOGIN);
            return;
        }
        registerSuccessActivity.hideLoading();
        String string = registerSuccessActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        registerSuccessActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26885subscribeObservable$lambda3(RegisterSuccessActivity registerSuccessActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerSuccessActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            registerSuccessActivity.getUserProfile();
            return;
        }
        registerSuccessActivity.hideLoading();
        String string = registerSuccessActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        registerSuccessActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26886subscribeObservable$lambda4(RegisterSuccessActivity registerSuccessActivity, JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(registerSuccessActivity, "this$0");
        registerSuccessActivity.hideLoading();
        if (jHLAgreementData == null) {
            registerSuccessActivity.termsConditionsUrl = "";
            registerSuccessActivity.connetlifePrivacyPolicyUrl = "";
        } else {
            registerSuccessActivity.termsConditionsUrl = jHLAgreementData.getTosUrl();
            registerSuccessActivity.connetlifePrivacyPolicyUrl = jHLAgreementData.getPpUrl();
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_TOSVER, jHLAgreementData.getTosVersion());
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_PPVER, jHLAgreementData.getPpVersion());
        }
        registerSuccessActivity.gotoPolicy(EventBusConstKt.REGISTER);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db  */
    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26887subscribeObservable$lambda6(com.hisense.connect_life.app_account.activity.RegisterSuccessActivity r13, kotlin.Pair r14) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            if (r14 != 0) goto L_0x000a
            r1 = r0
            goto L_0x0010
        L_0x000a:
            java.lang.Object r1 = r14.getFirst()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0010:
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.Object r1 = r14.getFirst()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0024
            r13.getUserProfile()
            goto L_0x00ea
        L_0x0024:
            r1 = 5
            java.lang.Object r2 = r14.getSecond()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            java.lang.String r4 = ":"
            r5 = 0
            boolean r0 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) r4, (boolean) r5, (int) r3, (java.lang.Object) r0)
            java.lang.String r3 = "600905"
            r6 = 1
            if (r0 == 0) goto L_0x0056
            java.lang.Object r14 = r14.getSecond()
            r7 = r14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String[] r8 = new java.lang.String[]{r4}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r14 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r7, (java.lang.String[]) r8, (boolean) r9, (int) r10, (int) r11, (java.lang.Object) r12)
            java.lang.Object r14 = r14.get(r6)
            java.lang.String r14 = (java.lang.String) r14
            int r1 = java.lang.Integer.parseInt(r14)
            r2 = r3
        L_0x0056:
            int r14 = r2.hashCode()
            java.lang.String r0 = "600925"
            java.lang.String r4 = "600924"
            if (r14 == 0) goto L_0x009b
            r7 = 1591789448(0x5ee0c788, float:8.0985321E18)
            if (r14 == r7) goto L_0x0085
            switch(r14) {
                case 1591789509: goto L_0x0077;
                case 1591789510: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x00a3
        L_0x0069:
            boolean r14 = r2.equals(r0)
            if (r14 != 0) goto L_0x0070
            goto L_0x00a3
        L_0x0070:
            int r14 = com.hisense.connect_life.app_account.R$string.account_locked
            java.lang.String r14 = r13.getString(r14)
            goto L_0x00b0
        L_0x0077:
            boolean r14 = r2.equals(r4)
            if (r14 != 0) goto L_0x007e
            goto L_0x00a3
        L_0x007e:
            int r14 = com.hisense.connect_life.app_account.R$string.untrusted_device
            java.lang.String r14 = r13.getString(r14)
            goto L_0x00b0
        L_0x0085:
            boolean r14 = r2.equals(r3)
            if (r14 != 0) goto L_0x008c
            goto L_0x00a3
        L_0x008c:
            int r14 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password_num
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r5] = r1
            java.lang.String r14 = r13.getString(r14, r3)
            goto L_0x00b0
        L_0x009b:
            java.lang.String r14 = ""
            boolean r14 = r2.equals(r14)
            if (r14 != 0) goto L_0x00aa
        L_0x00a3:
            int r14 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r14 = r13.getString(r14)
            goto L_0x00b0
        L_0x00aa:
            int r14 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r14 = r13.getString(r14)
        L_0x00b0:
            java.lang.String r1 = "when (secondStr) {\n     …ssword)\n                }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
            r13.showString((java.lang.String) r14)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r14 == 0) goto L_0x00db
            com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity$Companion r14 = com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.Companion
            int r14 = r14.getCODE_DEV_VER()
            c.a.a.a.b.a r0 = p040c.p041a.p042a.p043a.p045b.C1337a.m211c()
            java.lang.String r1 = "/account/DeviceCerVerificationActivity"
            com.alibaba.android.arouter.facade.Postcard r0 = r0.mo15011a(r1)
            java.lang.String r1 = r13.getEmail()
            java.lang.String r2 = "email"
            r0.withString(r2, r1)
            r0.navigation((android.app.Activity) r13, (int) r14)
            goto L_0x00ea
        L_0x00db:
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r14 == 0) goto L_0x00e5
            r13.gotoResetPwd()
            goto L_0x00ea
        L_0x00e5:
            int r14 = com.hisense.connect_life.app_account.R$string.login_failed
            r13.showString((int) r14)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.RegisterSuccessActivity.m26887subscribeObservable$lambda6(com.hisense.connect_life.app_account.activity.RegisterSuccessActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-7  reason: not valid java name */
    public static final void m26888subscribeObservable$lambda7(RegisterSuccessActivity registerSuccessActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerSuccessActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = registerSuccessActivity.getString(R$string.access_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
            registerSuccessActivity.showString(string);
        } else if (pair.getSecond() != null) {
            registerSuccessActivity.gotoMainActivity();
        } else {
            registerSuccessActivity.gotoRegisterInputUserInfo();
        }
    }

    private final void updateJHLUserRegisterProtocol() {
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
        return R$layout.activity_register_success;
    }

    @NotNull
    public final String getDisplayName() {
        String str = this.displayName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FileProvider.DISPLAYNAME_FIELD);
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
    public final String getFirstName() {
        String str = this.firstName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firstName");
        return null;
    }

    @NotNull
    public final String getId() {
        String str = this.f15746id;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("id");
        return null;
    }

    @NotNull
    public final String getLastName() {
        String str = this.lastName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastName");
        return null;
    }

    @NotNull
    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        return null;
    }

    @NotNull
    public final String getPhotoUrl() {
        String str = this.photoUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("photoUrl");
        return null;
    }

    @NotNull
    public final String getPsw() {
        String str = this.psw;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.PSW);
        return null;
    }

    @NotNull
    public final String getThirdCallBackParams() {
        String str = this.thirdCallBackParams;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thirdCallBackParams");
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
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        String str;
        LoginActivityManager.Companion.get().addActivity(this);
        this.thirdLoginModel = new ThirdAccountViewModel();
        ThirdLoginForGoogleUtils.Companion.initGoogleLogin(this);
        if (this.firstName == null || this.lastName == null) {
            str = getName();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R$string.register_hi));
            sb.append(", ");
            String firstName2 = getFirstName();
            if (firstName2 == null) {
                firstName2 = "";
            }
            sb.append(firstName2);
            str = sb.toString();
        }
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.register_title));
        ((TextView) _$_findCachedViewById(R$id.text_name)).setText(str);
        initUserIconShow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ ApiException -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, @org.jetbrains.annotations.Nullable android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            java.lang.String r5 = ""
            r0 = 9001(0x2329, float:1.2613E-41)
            if (r4 != r0) goto L_0x00a6
            c.q.a.c.m.j r4 = p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a.m8297c(r6)
            java.lang.Class<com.google.android.gms.common.api.ApiException> r6 = com.google.android.gms.common.api.ApiException.class
            java.lang.Object r4 = r4.mo28853n(r6)     // Catch:{ ApiException -> 0x0074 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ ApiException -> 0x0074 }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4     // Catch:{ ApiException -> 0x0074 }
            java.lang.String r6 = "firebaseAuthWithGoogle:"
            java.lang.String r0 = r4.mo24423U()     // Catch:{ ApiException -> 0x0074 }
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r0)     // Catch:{ ApiException -> 0x0074 }
            java.lang.String r6 = r4.mo24423U()     // Catch:{ ApiException -> 0x0074 }
            r0 = 1
            if (r6 == 0) goto L_0x0031
            int r6 = r6.length()     // Catch:{ ApiException -> 0x0074 }
            if (r6 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r6 = 0
            goto L_0x0032
        L_0x0031:
            r6 = r0
        L_0x0032:
            if (r6 != 0) goto L_0x00e8
            r3.showLoading(r0)     // Catch:{ ApiException -> 0x0074 }
            com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel r6 = r3.thirdLoginModel     // Catch:{ ApiException -> 0x0074 }
            if (r6 != 0) goto L_0x0041
            java.lang.String r6 = "thirdLoginModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch:{ ApiException -> 0x0074 }
            r6 = 0
        L_0x0041:
            java.lang.String r0 = "GOOGLE"
            int r1 = com.hisense.connect_life.app_account.R$string.server_client_id     // Catch:{ ApiException -> 0x0074 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ ApiException -> 0x0074 }
            java.lang.String r2 = "getString(R.string.server_client_id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ ApiException -> 0x0074 }
            java.lang.String r4 = r4.mo24423U()     // Catch:{ ApiException -> 0x0074 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ ApiException -> 0x0074 }
            java.lang.String r2 = "account.idToken!!"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ ApiException -> 0x0074 }
            com.hisense.connect_life.hismart.core.HiSmart$Companion r2 = com.hisense.connect_life.hismart.core.HiSmart.Companion     // Catch:{ ApiException -> 0x0074 }
            com.hisense.connect_life.hismart.core.HiSmart r2 = r2.getInstance()     // Catch:{ ApiException -> 0x0074 }
            com.hisense.connect_life.hismart.core.HiSystemParameter r2 = r2.getHiSystemParameter()     // Catch:{ ApiException -> 0x0074 }
            if (r2 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.lang.String r2 = r2.getJhkSerial()     // Catch:{ ApiException -> 0x0074 }
            if (r2 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r5 = r2
        L_0x006f:
            r6.thirdSignIn(r0, r1, r4, r5)     // Catch:{ ApiException -> 0x0074 }
            goto L_0x00e8
        L_0x0074:
            r4 = move-exception
            int r5 = r4.getStatusCode()
            r6 = 7
            if (r5 == r6) goto L_0x008c
            r6 = 10
            if (r5 == r6) goto L_0x0086
            int r5 = com.hisense.connect_life.app_account.R$string.third_login_failed
            r3.showString((int) r5)
            goto L_0x0091
        L_0x0086:
            int r5 = com.hisense.connect_life.app_account.R$string.invalid_account
            r3.showString((int) r5)
            goto L_0x0091
        L_0x008c:
            int r5 = com.hisense.connect_life.app_account.R$string.network_lost
            r3.showString((int) r5)
        L_0x0091:
            int r5 = r4.getStatusCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Google sign in failed"
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r5)
            com.google.android.gms.common.api.Status r4 = r4.getStatus()
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r4)
            goto L_0x00e8
        L_0x00a6:
            com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity$Companion r0 = com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.Companion
            int r0 = r0.getCODE_DEV_VER()
            if (r4 != r0) goto L_0x00e8
            if (r6 != 0) goto L_0x00b1
            goto L_0x00bb
        L_0x00b1:
            java.lang.String r4 = "AuthCode"
            java.lang.String r4 = r6.getStringExtra(r4)
            if (r4 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r5 = r4
        L_0x00bb:
            int r4 = com.hisense.connect_life.app_account.R$id.sign_password
            android.view.View r4 = r3._$_findCachedViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = r3.getEmail()
            boolean r6 = p040c.p072c.p073a.p074a.C1519p.m1017a(r6)
            if (r6 == 0) goto L_0x00e8
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00e8
            com.hisense.connect_life.core.base.BaseViewModel r6 = r3.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r6 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r6
            java.lang.String r0 = r3.getEmail()
            r6.signIn(r0, r4, r5)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.RegisterSuccessActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        int i;
        try {
            ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
            i = (all == null ? null : Integer.valueOf(all.size())).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        String str = Paths.Account.LoginEmailActivity;
        if (i == 0) {
            if (AccountUtils.Companion.userEmails().isEmpty()) {
                str = Paths.Account.LoginFirstActivity;
            }
            Postcard a = C1337a.m211c().mo15011a(str);
            a.withFlags(268468224);
            a.navigation();
        } else {
            Postcard a2 = C1337a.m211c().mo15011a(str);
            a2.withFlags(268468224);
            a2.navigation();
        }
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public final void setDisplayName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayName = str;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15746id = str;
    }

    public final void setLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new RegisterSuccessActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.sign_in);
        Intrinsics.checkNotNullExpressionValue(button, "sign_in");
        JuConnectExtKt.singleClickListener(button, new RegisterSuccessActivity$setListeners$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.sign_in_another);
        Intrinsics.checkNotNullExpressionValue(textView, "sign_in_another");
        JuConnectExtKt.singleClickListener(textView, RegisterSuccessActivity$setListeners$3.INSTANCE);
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPhotoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photoUrl = str;
    }

    public final void setPsw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.psw = str;
    }

    public final void setThirdCallBackParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdCallBackParams = str;
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

    public void subscribeObservable() {
        super.subscribeObservable();
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdLoginLiveData().observe(this, new C7193h0(this));
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7215m2(this));
        ((AccountViewModel) getMViewModel()).getUpdateJHLUserRegisterProtocolLiveData().observe(this, new C7204k(this));
        ((AccountViewModel) getMViewModel()).getGetJHLRegisterProtocolLiveData().observe(this, new C7211l2(this));
        ((AccountViewModel) getMViewModel()).getSignInLiveData().observe(this, new C7181e0(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7175c2(this));
    }
}
