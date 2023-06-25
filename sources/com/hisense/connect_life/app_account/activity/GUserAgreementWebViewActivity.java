package com.hisense.connect_life.app_account.activity;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
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
import com.hisense.connect_life.core.global.AppConfig;
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
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7171b2;
import p040c.p429r.p430a.p431a.p432b.C7182e1;
import p040c.p429r.p430a.p431a.p432b.C7188g;
import p040c.p429r.p430a.p431a.p432b.C7241t0;
import p040c.p429r.p430a.p431a.p432b.C7242t1;
import p040c.p429r.p430a.p431a.p432b.C7260y;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020&H\u0002J0\u0010)\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0016J\b\u00102\u001a\u00020&H\u0015J\u001a\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020&H\u0014J\b\u00108\u001a\u00020&H\u0016J\b\u00109\u001a\u00020&H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001e\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001e\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001e\u0010 \u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\t¨\u0006:"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/GUserAgreementWebViewActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "agreementUrl", "", "getAgreementUrl", "()Ljava/lang/String;", "setAgreementUrl", "(Ljava/lang/String;)V", "autoLogin", "", "from", "getFrom", "setFrom", "idToken", "getIdToken", "setIdToken", "privacyPolicyUrl", "getPrivacyPolicyUrl", "setPrivacyPolicyUrl", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "userEmail", "getUserEmail", "setUserEmail", "userPassword", "getUserPassword", "setUserPassword", "bindLayout", "", "getUserProfile", "", "isShowLoading", "getVerification", "gotoAgreementWebViewActivity", "userAgreementUrl", "gotoMainActivity", "gotoRegisterInputUserInfo", "gotoRegisterSuccess", "gotoThirdRegister", "gotoVerificationActivity", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "setListeners", "subscribeObservable", "updateJHLUserRegisterProtocol", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/GUserAgreementWebViewActivity")
/* compiled from: GUserAgreementWebViewActivity.kt */
public final class GUserAgreementWebViewActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "agreementUrl")
    public String agreementUrl;
    public boolean autoLogin;
    @Autowired(name = "from")
    public String from;
    @Autowired(name = "idToken")
    public String idToken;
    @Autowired(name = "privacyPolicy")
    public String privacyPolicyUrl;
    public ThirdAccountViewModel thirdLoginModel;
    @Autowired(name = "title_text")
    public String title;
    @Autowired(name = "target_url")
    public String url;
    @Autowired(name = "email")
    public String userEmail;
    @Autowired(name = "psw")
    public String userPassword;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(GUserAgreementWebViewActivity gUserAgreementWebViewActivity) {
        return (AccountViewModel) gUserAgreementWebViewActivity.getMViewModel();
    }

    private final void getUserProfile(boolean z) {
        if (z) {
            showLoading();
        }
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
    }

    /* access modifiers changed from: private */
    public final void getVerification() {
        ((AccountViewModel) getMViewModel()).getVerificationCode(getUserEmail(), "1");
    }

    /* access modifiers changed from: private */
    public final void gotoAgreementWebViewActivity(String str, String str2, String str3, String str4, String str5) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.GUserAgreementWebViewActivity);
        a.withString(KeyConst.KEY_TITLE_TEXT, str).withString(KeyConst.KEY_TARGET_URL, str2).withString("from", str3).withString(KeyConst.USER_AGREEMENT_URL, str4).withString(KeyConst.USER_PRIVACY_POLICY, str5).withString("email", getUserEmail()).withString(EventBusConstKt.PSW, getUserPassword()).withString(EventBusConstKt.ID_TOKEN, getIdToken());
        a.navigation();
    }

    private final void gotoMainActivity() {
        hideLoading();
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoRegisterInputUserInfo() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getUserEmail()).withString(EventBusConstKt.PSW, getUserPassword()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", "").withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, SPManagerKt.getToken());
        a.navigation();
    }

    private final void gotoRegisterSuccess() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterSuccessActivity);
        a.withString("name", "").withString("email", getUserEmail()).withString(EventBusConstKt.PSW, "").withString("firstName", "").withString("lastName", "").withString("thirdPlatformId", getString(R$string.server_client_id)).withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, SPManagerKt.getToken());
        finish();
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoThirdRegister() {
        if (getIdToken().length() > 0) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
            a.withString("email", getUserEmail()).withString(EventBusConstKt.PSW, getUserPassword()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.THIRD_REGISTER).withString("thirdPlatformId", getString(R$string.server_client_id)).withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, getIdToken()).withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
            finish();
            a.navigation();
        }
    }

    private final void gotoVerificationActivity() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputVerificationActivity);
        a.withString("email", getUserEmail()).withString(EventBusConstKt.PSW, getUserPassword()).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString(EventBusConstKt.ORIGIN, EventBusConstKt.REGISTER);
        a.navigation();
    }

    /* renamed from: initWidgets$lambda-0  reason: not valid java name */
    public static final void m26823initWidgets$lambda0(GUserAgreementWebViewActivity gUserAgreementWebViewActivity) {
        Intrinsics.checkNotNullParameter(gUserAgreementWebViewActivity, "this$0");
        gUserAgreementWebViewActivity.hideLoading();
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26824subscribeObservable$lambda1(GUserAgreementWebViewActivity gUserAgreementWebViewActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(gUserAgreementWebViewActivity, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            int intValue = ((Number) pair.getSecond()).intValue();
            if (intValue == -1) {
                gUserAgreementWebViewActivity.showString(R$string.network_lost);
            } else if (intValue == 1) {
                gUserAgreementWebViewActivity.showString(R$string.wrong_email_or_password);
            } else if (intValue == 600719) {
                gUserAgreementWebViewActivity.gotoVerificationActivity();
            }
        } else {
            gUserAgreementWebViewActivity.gotoVerificationActivity();
            gUserAgreementWebViewActivity.finish();
        }
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26825subscribeObservable$lambda2(GUserAgreementWebViewActivity gUserAgreementWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(gUserAgreementWebViewActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            gUserAgreementWebViewActivity.getUserProfile(false);
            return;
        }
        gUserAgreementWebViewActivity.hideLoading();
        String string = gUserAgreementWebViewActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        gUserAgreementWebViewActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26826subscribeObservable$lambda3(GUserAgreementWebViewActivity gUserAgreementWebViewActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(gUserAgreementWebViewActivity, "this$0");
        gUserAgreementWebViewActivity.hideLoading();
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = gUserAgreementWebViewActivity.getString(R$string.access_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
            gUserAgreementWebViewActivity.showString(string);
        } else if (pair.getSecond() != null) {
            gUserAgreementWebViewActivity.gotoMainActivity();
        } else {
            gUserAgreementWebViewActivity.gotoRegisterInputUserInfo();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r7 = r7.getJhkSerial();
     */
    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26827subscribeObservable$lambda4(com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity r7, kotlin.Pair r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r8.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r8 = r8.getSecond()
            java.lang.String r0 = "1"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            if (r8 == 0) goto L_0x005f
            com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel r8 = r7.thirdLoginModel
            if (r8 != 0) goto L_0x0027
            java.lang.String r8 = "thirdLoginModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r8 = 0
        L_0x0027:
            r0 = r8
            int r8 = com.hisense.connect_life.app_account.R$string.server_client_id
            java.lang.String r1 = r7.getString(r8)
            java.lang.String r8 = "getString(R.string.server_client_id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            com.hisense.connect_life.core.global.ThirdAccountType r8 = com.hisense.connect_life.core.global.ThirdAccountType.GOOGLE
            java.lang.String r2 = r8.name()
            java.lang.String r3 = r7.getIdToken()
            java.lang.String r4 = r7.getUserEmail()
            com.hisense.connect_life.hismart.core.HiSmart$Companion r7 = com.hisense.connect_life.hismart.core.HiSmart.Companion
            com.hisense.connect_life.hismart.core.HiSmart r7 = r7.getInstance()
            com.hisense.connect_life.hismart.core.HiSystemParameter r7 = r7.getHiSystemParameter()
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0051
        L_0x004f:
            r6 = r8
            goto L_0x0059
        L_0x0051:
            java.lang.String r7 = r7.getJhkSerial()
            if (r7 != 0) goto L_0x0058
            goto L_0x004f
        L_0x0058:
            r6 = r7
        L_0x0059:
            java.lang.String r5 = ""
            r0.thirdRegister(r1, r2, r3, r4, r5, r6)
            goto L_0x0068
        L_0x005f:
            r7.gotoThirdRegister()
            goto L_0x0068
        L_0x0063:
            int r8 = com.hisense.connect_life.app_account.R$string.register_fail
            r7.showString((int) r8)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity.m26827subscribeObservable$lambda4(com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26828subscribeObservable$lambda5(GUserAgreementWebViewActivity gUserAgreementWebViewActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(gUserAgreementWebViewActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            gUserAgreementWebViewActivity.showString(R$string.register_success);
            gUserAgreementWebViewActivity.gotoRegisterSuccess();
            return;
        }
        gUserAgreementWebViewActivity.hideLoading();
        String string = ((CharSequence) pair.getSecond()).length() == 0 ? gUserAgreementWebViewActivity.getString(R$string.register_fail) : (String) pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(string, "if (it.second.isEmpty())…ster_fail) else it.second");
        gUserAgreementWebViewActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m26829subscribeObservable$lambda6(GUserAgreementWebViewActivity gUserAgreementWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(gUserAgreementWebViewActivity, "this$0");
        gUserAgreementWebViewActivity.hideLoading();
        AccountUtils.Companion.deleteAllUserInfoFromDatabase();
        AccountUtils.Companion.clearLoginInfo();
        AppConfig.Companion.setAccessToken("");
        AppConfig.Companion.setAnonymousLoginToken("");
        HiSmart.Companion.getInstance().updateToken("");
        HiSmart.Companion.getInstance().updateToken("");
        ThirdLoginForGoogleUtils.Companion.signOut(gUserAgreementWebViewActivity);
        EventBus.getDefault().post(KeyConst.LOGIN_OUT);
    }

    /* access modifiers changed from: private */
    public final void updateJHLUserRegisterProtocol() {
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
        return R$layout.activity_user_agreement;
    }

    @NotNull
    public final String getAgreementUrl() {
        String str = this.agreementUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(KeyConst.USER_AGREEMENT_URL);
        return null;
    }

    @NotNull
    public final String getFrom() {
        String str = this.from;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("from");
        return null;
    }

    @NotNull
    public final String getIdToken() {
        String str = this.idToken;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.ID_TOKEN);
        return null;
    }

    @NotNull
    public final String getPrivacyPolicyUrl() {
        String str = this.privacyPolicyUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("privacyPolicyUrl");
        return null;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(NotificationCompatJellybean.KEY_TITLE);
        return null;
    }

    @NotNull
    public final String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("url");
        return null;
    }

    @NotNull
    public final String getUserEmail() {
        String str = this.userEmail;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userEmail");
        return null;
    }

    @NotNull
    public final String getUserPassword() {
        String str = this.userPassword;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userPassword");
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0145, code lost:
        if (r0.equals(com.hisense.connect_life.core.global.EventBusConstKt.FROM_THIRD_REGISTER_USERAGREEMENT) == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x014e, code lost:
        if (r0.equals(com.hisense.connect_life.core.global.EventBusConstKt.FROM_REGISTER_USERAGREEMENT) == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x016e, code lost:
        r0 = getPrivacyPolicyUrl() + "?v=" + ((int) (java.lang.Math.random() * ((double) 200)));
     */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initWidgets() {
        /*
            r6 = this;
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.m97of((androidx.fragment.app.FragmentActivity) r6)
            java.lang.Class<com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel> r1 = com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            java.lang.String r1 = "of(this).get(ThirdAccountViewModel::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel r0 = (com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel) r0
            r6.thirdLoginModel = r0
            r0 = 1
            r6.showLoading(r0)
            java.lang.String r1 = r6.getFrom()
            java.lang.String r2 = "autoLogin"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            java.lang.String r2 = "login"
            if (r1 == 0) goto L_0x002a
            r6.setFrom(r2)
            r6.autoLogin = r0
        L_0x002a:
            int r1 = com.hisense.connect_life.app_account.R$id.top_title
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = r6.getFrom()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "ROOT"
            if (r2 != 0) goto L_0x006e
            java.lang.String r2 = r6.getFrom()
            java.lang.String r5 = "login_userAgreement"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r2 == 0) goto L_0x004d
            goto L_0x006e
        L_0x004d:
            int r2 = com.hisense.connect_life.app_account.R$string.register
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r5 = "getString(R.string.register)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.util.Locale r5 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.lang.String r2 = r2.toLowerCase(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r2 = kotlin.text.StringsKt__StringsJVMKt.capitalize(r2, r3)
            goto L_0x008e
        L_0x006e:
            int r2 = com.hisense.connect_life.app_account.R$string.login
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r5 = "getString(R.string.login)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.util.Locale r5 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.lang.String r2 = r2.toLowerCase(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r2 = kotlin.text.StringsKt__StringsJVMKt.capitalize(r2, r3)
        L_0x008e:
            r1.setText(r2)
            int r1 = com.hisense.connect_life.app_account.R$id.tv_agree
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.hisense.connect_life.app_account.R$string.agree
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "getString(R.string.agree)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r2 = r2.toUpperCase(r3)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.setText(r2)
            int r1 = com.hisense.connect_life.app_account.R$id.tv_agree
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 8
            r1.setVisibility(r2)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            c.r.a.a.b.f0 r2 = new c.r.a.a.b.f0
            r2.<init>(r6)
            r3 = 10000(0x2710, double:4.9407E-320)
            r1.postDelayed(r2, r3)
            int r1 = com.hisense.connect_life.app_account.R$id.local_webView
            android.view.View r1 = r6._$_findCachedViewById(r1)
            com.hisense.connect_life.app_account.widget.ExtraWebView r1 = (com.hisense.connect_life.app_account.widget.ExtraWebView) r1
            android.webkit.WebSettings r1 = r1.getSettings()
            java.lang.String r2 = "local_webView.settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 2
            r1.setCacheMode(r2)
            r1.setJavaScriptEnabled(r0)
            r1.setDomStorageEnabled(r0)
            int r0 = com.hisense.connect_life.app_account.R$id.local_webView
            android.view.View r0 = r6._$_findCachedViewById(r0)
            com.hisense.connect_life.app_account.widget.ExtraWebView r0 = (com.hisense.connect_life.app_account.widget.ExtraWebView) r0
            com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity$initWidgets$2 r1 = new com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity$initWidgets$2
            r1.<init>(r6)
            r0.setWebViewClient(r1)
            java.lang.String r0 = r6.getFrom()
            int r1 = r0.hashCode()
            r2 = -902839837(0xffffffffca2fc1e3, float:-2879608.8)
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "?v="
            if (r1 == r2) goto L_0x0148
            r2 = -897648709(0xffffffffca7ef7bb, float:-4177390.8)
            if (r1 == r2) goto L_0x013f
            r2 = -690213213(0xffffffffd6dc2ea3, float:-1.21046431E14)
            if (r1 == r2) goto L_0x0118
            goto L_0x0150
        L_0x0118:
            java.lang.String r1 = "register"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0121
            goto L_0x0150
        L_0x0121:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.getUrl()
            r0.append(r1)
            r0.append(r4)
            double r1 = java.lang.Math.random()
            double r3 = (double) r3
            double r1 = r1 * r3
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x018b
        L_0x013f:
            java.lang.String r1 = "third_register_userAgreement"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016e
            goto L_0x0150
        L_0x0148:
            java.lang.String r1 = "register_userAgreement"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016e
        L_0x0150:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.getUrl()
            r0.append(r1)
            r0.append(r4)
            double r1 = java.lang.Math.random()
            double r3 = (double) r3
            double r1 = r1 * r3
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x018b
        L_0x016e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.getPrivacyPolicyUrl()
            r0.append(r1)
            r0.append(r4)
            double r1 = java.lang.Math.random()
            double r3 = (double) r3
            double r1 = r1 * r3
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x018b:
            int r1 = com.hisense.connect_life.app_account.R$id.local_webView
            android.view.View r1 = r6._$_findCachedViewById(r1)
            com.hisense.connect_life.app_account.widget.ExtraWebView r1 = (com.hisense.connect_life.app_account.widget.ExtraWebView) r1
            com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity$initWidgets$3 r2 = new com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity$initWidgets$3
            r2.<init>(r6)
            r1.setMOnScrollChangeListener(r2)
            int r1 = com.hisense.connect_life.app_account.R$id.local_webView
            android.view.View r1 = r6._$_findCachedViewById(r1)
            com.hisense.connect_life.app_account.widget.ExtraWebView r1 = (com.hisense.connect_life.app_account.widget.ExtraWebView) r1
            r1.loadUrl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity.initWidgets():void");
    }

    public boolean onKeyDown(int i, @Nullable KeyEvent keyEvent) {
        if (i != 4 || !this.autoLogin) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void setAgreementUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agreementUrl = str;
    }

    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final void setIdToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idToken = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new GUserAgreementWebViewActivity$setListeners$1(this));
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_down);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_down");
        JuConnectExtKt.singleClickListener(imageView, new GUserAgreementWebViewActivity$setListeners$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_agree);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_agree");
        JuConnectExtKt.singleClickListener(textView, new GUserAgreementWebViewActivity$setListeners$3(this));
    }

    public final void setPrivacyPolicyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privacyPolicyUrl = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setUserEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userEmail = str;
    }

    public final void setUserPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userPassword = str;
    }

    public void subscribeObservable() {
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7241t0(this));
        ((AccountViewModel) getMViewModel()).getUpdateJHLUserRegisterProtocolLiveData().observe(this, new C7242t1(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7182e1(this));
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7260y(this));
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdRegisterLiveData().observe(this, new C7171b2(this));
        ((AccountViewModel) getMViewModel()).getSignOutLiveData().observe(this, new C7188g(this));
    }
}
