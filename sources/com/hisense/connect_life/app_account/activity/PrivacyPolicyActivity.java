package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
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
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.ThirdAccountType;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.message.JuWebSocket;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7168b;
import p040c.p429r.p430a.p431a.p432b.C7180e;
import p040c.p429r.p430a.p431a.p432b.C7195h2;
import p040c.p429r.p430a.p431a.p432b.C7225p0;
import p040c.p429r.p430a.p431a.p432b.C7239s2;
import p040c.p429r.p430a.p431a.p432b.C7240t;
import p040c.p429r.p430a.p431a.p432b.C7247u2;

@Metadata(mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0014J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u0010H\u0002J\u0018\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\b\u00107\u001a\u000200H\u0002J\b\u00108\u001a\u000200H\u0002J\b\u00109\u001a\u000200H\u0002J\b\u0010:\u001a\u000200H\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0016J\b\u0010=\u001a\u000200H\u0014J\b\u0010>\u001a\u00020\u0010H\u0002J\b\u0010?\u001a\u000200H\u0002J\"\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020.2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\b\u0010E\u001a\u000200H\u0014J\u0018\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u000200H\u0014J\b\u0010K\u001a\u000200H\u0002J\u0010\u0010L\u001a\u0002002\u0006\u0010M\u001a\u00020\u0010H\u0002J\b\u0010N\u001a\u000200H\u0014J\b\u0010O\u001a\u000200H\u0016J\b\u0010P\u001a\u000200H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u001e\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u000e\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u0010\u0010)\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\t¨\u0006Q"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/PrivacyPolicyActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "connetlifePrivacyPolicyUrl", "", "getConnetlifePrivacyPolicyUrl", "()Ljava/lang/String;", "setConnetlifePrivacyPolicyUrl", "(Ljava/lang/String;)V", "displayName", "id", "idToken", "getIdToken", "setIdToken", "isReadConditions", "", "isReadPolicy", "loginEmail", "getLoginEmail", "setLoginEmail", "loginPassWord", "getLoginPassWord", "setLoginPassWord", "origin", "getOrigin", "setOrigin", "photoUrl", "termsConditionsUrl", "getTermsConditionsUrl", "setTermsConditionsUrl", "thirdCallBackParams", "thirdId", "getThirdId", "setThirdId", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "thirdLoginType", "thirdPlatformId", "getThirdPlatformId", "setThirdPlatformId", "token", "vidaaPrivacyPolicyUrl", "getVidaaPrivacyPolicyUrl", "setVidaaPrivacyPolicyUrl", "bindLayout", "", "checkLoginNameSign", "", "email", "getUserProfile", "isShowLoading", "gotoAgreementWebViewActivity", "title", "url", "gotoMainActivity", "gotoRegisterInputUserInfo", "gotoRegisterSuccess", "gotoThirdRegister", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isAllCheckBoxChecked", "logOut", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onResume", "setAllCheckBoxChecked", "setCreateAccountBtnShow", "isSelect", "setListeners", "subscribeObservable", "updateJHLUserRegisterProtocol", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/PrivacyPolicyActivity")
/* compiled from: PrivacyPolicyActivity.kt */
public final class PrivacyPolicyActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "connetlifePrivacyPolicyUrl")
    public String connetlifePrivacyPolicyUrl;
    @Nullable
    public String displayName = "";
    @Nullable

    /* renamed from: id */
    public String f15743id = "";
    @Autowired(name = "idToken")
    public String idToken;
    public boolean isReadConditions;
    public boolean isReadPolicy;
    @Autowired(name = "email")
    public String loginEmail;
    @Autowired(name = "psw")
    public String loginPassWord;
    @Autowired(name = "origin")
    public String origin;
    @Nullable
    public String photoUrl = "";
    @Autowired(name = "termsConditionsUrl")
    public String termsConditionsUrl;
    @NotNull
    public String thirdCallBackParams = "";
    @Autowired(name = "thirdId")
    public String thirdId;
    public ThirdAccountViewModel thirdLoginModel;
    @NotNull
    public String thirdLoginType = "3";
    @Autowired(name = "thirdPlatformId")
    public String thirdPlatformId;
    @Nullable
    public String token = "";
    @Autowired(name = "vidaaPrivacyPolicyUrl")
    public String vidaaPrivacyPolicyUrl;

    /* access modifiers changed from: private */
    public final void checkLoginNameSign(String str) {
        ((AccountViewModel) getMViewModel()).checkLoginNameSign(str);
    }

    private final void getUserProfile(boolean z) {
        if (z) {
            showLoading();
        }
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
    }

    /* access modifiers changed from: private */
    public final void gotoAgreementWebViewActivity(String str, String str2) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.SingleWebViewActivity);
        a.withString(KeyConst.KEY_TITLE_TEXT, str).withString(KeyConst.KEY_TARGET_URL, str2);
        a.navigation();
    }

    private final void gotoMainActivity() {
        hideLoading();
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoRegisterInputUserInfo() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getLoginEmail()).withString(EventBusConstKt.PSW, "").withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", getThirdPlatformId()).withString("thirdLoginType", this.thirdLoginType).withString(FirebaseMessagingService.EXTRA_TOKEN, this.token).withString("id", this.f15743id).withString(FileProvider.DISPLAYNAME_FIELD, this.displayName).withString("photoUrl", this.photoUrl).withString("thirdCallBackParams", this.thirdCallBackParams);
        a.navigation();
    }

    private final void gotoRegisterSuccess() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterSuccessActivity);
        a.withString("name", "").withString("email", getLoginEmail()).withString(EventBusConstKt.PSW, "").withString("firstName", "").withString("lastName", "").withString("thirdPlatformId", getString(R$string.server_client_id)).withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, this.token);
        finish();
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoThirdRegister() {
        if (getIdToken().length() > 0) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
            a.withString("email", getLoginEmail()).withString(EventBusConstKt.PSW, getLoginPassWord()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.THIRD_REGISTER).withString("thirdPlatformId", getString(R$string.server_client_id)).withString("thirdLoginType", ThirdAccountType.GOOGLE.name()).withString(FirebaseMessagingService.EXTRA_TOKEN, getIdToken()).withString("id", getThirdId()).withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
            finish();
            a.navigation();
        }
    }

    private final boolean isAllCheckBoxChecked() {
        return Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_terms_conditions)).getText().toString(), (Object) getString(R$string.icon_checkbox_checked)) && Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).getText().toString(), (Object) getString(R$string.icon_checkbox_checked));
    }

    /* access modifiers changed from: private */
    public final void logOut() {
        ((AccountViewModel) getMViewModel()).signOut();
    }

    private final void setAllCheckBoxChecked() {
        ((IconFontView) _$_findCachedViewById(R$id.icon_terms_conditions)).setText(getString(R$string.icon_checkbox_checked));
        ((IconFontView) _$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).setText(getString(R$string.icon_checkbox_checked));
    }

    private final void setCreateAccountBtnShow(boolean z) {
        if (z) {
            ((Button) _$_findCachedViewById(R$id.create_account)).setTextColor(getColor(R$color.colorWhite));
            ((Button) _$_findCachedViewById(R$id.create_account)).setBackgroundResource(R$drawable.button_circle_solid);
            ((Button) _$_findCachedViewById(R$id.create_account)).setEnabled(true);
            return;
        }
        ((Button) _$_findCachedViewById(R$id.create_account)).setTextColor(getColor(R$color.colorText_86));
        ((Button) _$_findCachedViewById(R$id.create_account)).setBackgroundResource(R$drawable.button_circle_unselect);
        ((Button) _$_findCachedViewById(R$id.create_account)).setEnabled(false);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m26853setListeners$lambda0(PrivacyPolicyActivity privacyPolicyActivity, View view) {
        Intrinsics.checkNotNullParameter(privacyPolicyActivity, "this$0");
        if (!privacyPolicyActivity.isReadConditions) {
            privacyPolicyActivity.showString(R$string.read_condition_hint);
            return;
        }
        if (Intrinsics.areEqual((Object) ((IconFontView) privacyPolicyActivity._$_findCachedViewById(R$id.icon_terms_conditions)).getText().toString(), (Object) privacyPolicyActivity.getString(R$string.icon_checkbox_uncheck))) {
            ((IconFontView) privacyPolicyActivity._$_findCachedViewById(R$id.icon_terms_conditions)).setText(privacyPolicyActivity.getString(R$string.icon_checkbox_checked));
        } else {
            ((IconFontView) privacyPolicyActivity._$_findCachedViewById(R$id.icon_terms_conditions)).setText(privacyPolicyActivity.getString(R$string.icon_checkbox_uncheck));
        }
        privacyPolicyActivity.setCreateAccountBtnShow(privacyPolicyActivity.isAllCheckBoxChecked());
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m26854setListeners$lambda1(PrivacyPolicyActivity privacyPolicyActivity, View view) {
        Intrinsics.checkNotNullParameter(privacyPolicyActivity, "this$0");
        if (!privacyPolicyActivity.isReadPolicy) {
            privacyPolicyActivity.showString(R$string.read_policy_hint);
            return;
        }
        if (Intrinsics.areEqual((Object) ((IconFontView) privacyPolicyActivity._$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).getText().toString(), (Object) privacyPolicyActivity.getString(R$string.icon_checkbox_uncheck))) {
            ((IconFontView) privacyPolicyActivity._$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).setText(privacyPolicyActivity.getString(R$string.icon_checkbox_checked));
        } else {
            ((IconFontView) privacyPolicyActivity._$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).setText(privacyPolicyActivity.getString(R$string.icon_checkbox_uncheck));
        }
        privacyPolicyActivity.setCreateAccountBtnShow(privacyPolicyActivity.isAllCheckBoxChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r7 = r7.getJhkSerial();
     */
    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26855subscribeObservable$lambda2(com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity r7, kotlin.Pair r8) {
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
            java.lang.String r4 = r7.getLoginEmail()
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
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity.m26855subscribeObservable$lambda2(com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26856subscribeObservable$lambda3(PrivacyPolicyActivity privacyPolicyActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(privacyPolicyActivity, "this$0");
        privacyPolicyActivity.hideLoading();
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = privacyPolicyActivity.getString(R$string.access_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
            privacyPolicyActivity.showString(string);
        } else if (pair.getSecond() != null) {
            privacyPolicyActivity.gotoMainActivity();
        } else {
            privacyPolicyActivity.gotoRegisterInputUserInfo();
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26857subscribeObservable$lambda4(PrivacyPolicyActivity privacyPolicyActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(privacyPolicyActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            privacyPolicyActivity.showString(R$string.register_success);
            privacyPolicyActivity.gotoRegisterSuccess();
            return;
        }
        privacyPolicyActivity.hideLoading();
        String string = ((CharSequence) pair.getSecond()).length() == 0 ? privacyPolicyActivity.getString(R$string.register_fail) : (String) pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(string, "if (it.second.isEmpty())…ster_fail) else it.second");
        privacyPolicyActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26858subscribeObservable$lambda5(PrivacyPolicyActivity privacyPolicyActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(privacyPolicyActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            privacyPolicyActivity.getUserProfile(false);
            return;
        }
        privacyPolicyActivity.hideLoading();
        String string = privacyPolicyActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        privacyPolicyActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m26859subscribeObservable$lambda6(PrivacyPolicyActivity privacyPolicyActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(privacyPolicyActivity, "this$0");
        privacyPolicyActivity.hideLoading();
        JuWebSocket.Companion.cancelWebSocket();
        Job unused = BuildersKt__Builders_commonKt.launch$default(privacyPolicyActivity, Dispatchers.getIO(), (CoroutineStart) null, new PrivacyPolicyActivity$subscribeObservable$5$1((Continuation<? super PrivacyPolicyActivity$subscribeObservable$5$1>) null), 2, (Object) null);
        ThirdLoginForGoogleUtils.Companion.signOut(privacyPolicyActivity);
        privacyPolicyActivity.finish();
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
        return R$layout.activity_privacy_policy;
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
    public final String getIdToken() {
        String str = this.idToken;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.ID_TOKEN);
        return null;
    }

    @NotNull
    public final String getLoginEmail() {
        String str = this.loginEmail;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginEmail");
        return null;
    }

    @NotNull
    public final String getLoginPassWord() {
        String str = this.loginPassWord;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginPassWord");
        return null;
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
    public final String getTermsConditionsUrl() {
        String str = this.termsConditionsUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("termsConditionsUrl");
        return null;
    }

    @NotNull
    public final String getThirdId() {
        String str = this.thirdId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.THIRD_ID);
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
        LoginActivityManager.Companion.get().addActivity(this);
        ViewModel viewModel = ViewModelProviders.m97of((FragmentActivity) this).get(ThirdAccountViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "of(this).get(ThirdAccountViewModel::class.java)");
        this.thirdLoginModel = (ThirdAccountViewModel) viewModel;
        if (!Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_terms_conditions)).getText().toString(), (Object) getString(R$string.icon_checkbox_checked)) || !Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).getText().toString(), (Object) getString(R$string.icon_checkbox_checked))) {
            setCreateAccountBtnShow(false);
        } else {
            setCreateAccountBtnShow(true);
        }
        if (Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.LOGIN)) {
            ((Button) _$_findCachedViewById(R$id.create_account)).setText(getString(R$string.sign_in));
            ((TextView) _$_findCachedViewById(R$id.cancel)).setText(getString(R$string.sign_out));
            ((TextView) _$_findCachedViewById(R$id.cancel)).setVisibility(4);
            return;
        }
        ((Button) _$_findCachedViewById(R$id.create_account)).setText(getString(R$string.create_account));
        ((TextView) _$_findCachedViewById(R$id.cancel)).setText(getString(R$string.cancel));
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, NotificationCompat.CATEGORY_EVENT);
        return i == 4;
    }

    public void onResume() {
        super.onResume();
    }

    public final void setConnetlifePrivacyPolicyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.connetlifePrivacyPolicyUrl = str;
    }

    public final void setIdToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idToken = str;
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.create_account);
        Intrinsics.checkNotNullExpressionValue(button, "create_account");
        JuConnectExtKt.singleClickListener(button, new PrivacyPolicyActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "cancel");
        JuConnectExtKt.singleClickListener(textView, new PrivacyPolicyActivity$setListeners$2(this));
        ((TextView) _$_findCachedViewById(R$id.textview_terms_conditions)).getPaint().setFlags(8);
        ((TextView) _$_findCachedViewById(R$id.textview_terms_conditions)).getPaint().setAntiAlias(true);
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.textview_terms_conditions);
        Intrinsics.checkNotNullExpressionValue(textView2, "textview_terms_conditions");
        JuConnectExtKt.singleClickListener(textView2, new PrivacyPolicyActivity$setListeners$3(this));
        ((TextView) _$_findCachedViewById(R$id.textview_privacy_policy_connectlife)).getPaint().setFlags(8);
        ((TextView) _$_findCachedViewById(R$id.textview_privacy_policy_connectlife)).getPaint().setAntiAlias(true);
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.textview_privacy_policy_connectlife);
        Intrinsics.checkNotNullExpressionValue(textView3, "textview_privacy_policy_connectlife");
        JuConnectExtKt.singleClickListener(textView3, new PrivacyPolicyActivity$setListeners$4(this));
        ((IconFontView) _$_findCachedViewById(R$id.icon_terms_conditions)).setOnClickListener(new C7168b(this));
        ((IconFontView) _$_findCachedViewById(R$id.icon_privacy_policy_connectlife)).setOnClickListener(new C7247u2(this));
    }

    public final void setLoginEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginEmail = str;
    }

    public final void setLoginPassWord(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginPassWord = str;
    }

    public final void setOrigin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.origin = str;
    }

    public final void setTermsConditionsUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.termsConditionsUrl = str;
    }

    public final void setThirdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdId = str;
    }

    public final void setThirdPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdPlatformId = str;
    }

    public final void setVidaaPrivacyPolicyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vidaaPrivacyPolicyUrl = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7240t(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7195h2(this));
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdRegisterLiveData().observe(this, new C7225p0(this));
        ((AccountViewModel) getMViewModel()).getUpdateJHLUserRegisterProtocolLiveData().observe(this, new C7239s2(this));
        ((AccountViewModel) getMViewModel()).getSignOutLiveData().observe(this, new C7180e(this));
    }
}
