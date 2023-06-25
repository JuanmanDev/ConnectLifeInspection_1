package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7174c1;
import p040c.p429r.p430a.p431a.p432b.C7184f;
import p040c.p429r.p430a.p431a.p432b.C7189g0;
import p040c.p429r.p430a.p431a.p432b.C7192h;
import p040c.p429r.p430a.p431a.p432b.C7203j2;
import p040c.p429r.p430a.p431a.p432b.C7232r;
import p040c.p429r.p430a.p431a.p432b.C7233r0;

@Route(path = "/account/DeviceCerVerificationActivity")
@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020\u0005H\u0014J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\u001a\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0007H\u0002J0\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016J\b\u00101\u001a\u00020&H\u0014J\b\u00102\u001a\u00020&H\u0014J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0014J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020&H\u0016J\b\u00109\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/DeviceCerVerificationActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "TIME_COUNT_DOWN", "", "connetlifePrivacyPolicyUrl", "", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "jhlNeedUserAgreementCount", "Ljava/lang/Integer;", "mAuthCode", "password", "getPassword", "setPassword", "termsConditionsUrl", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "getUserProfile", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "setUserProfile", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;)V", "verCodeTimer", "getVerCodeTimer", "()I", "setVerCodeTimer", "(I)V", "vidaaPrivacyPolicyUrl", "bindLayout", "getJHLUserProtocol", "", "gotoMainActivity", "gotoPolicy", "type", "pwd", "idToken", "thirdId", "gotoRegisterInputUserInfo", "gotoResetPwd", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onDestroy", "sendMessageAtOneS", "setListeners", "setNextShow", "canClick", "", "subscribeObservable", "updateJHLUserRegisterProtocol", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceCerVerificationActivity.kt */
public final class DeviceCerVerificationActivity extends BaseVmActivity<AccountViewModel> {
    public static final int CODE_DEV_VER = 2;
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public final int TIME_COUNT_DOWN = 1;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @Autowired(name = "email")
    public String email;
    @NotNull
    public final Handler handler = new Handler(new C7189g0(this));
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @NotNull
    public String mAuthCode = "";
    @Autowired(name = "psw")
    public String password;
    @Nullable
    public String termsConditionsUrl = "";
    @Autowired(name = "userInfo")
    public UserProfile userProfile;
    public int verCodeTimer = 60;
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/DeviceCerVerificationActivity$Companion;", "", "()V", "CODE_DEV_VER", "", "getCODE_DEV_VER", "()I", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceCerVerificationActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCODE_DEV_VER() {
            return DeviceCerVerificationActivity.CODE_DEV_VER;
        }
    }

    public static final /* synthetic */ AccountViewModel access$getMViewModel(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        return (AccountViewModel) deviceCerVerificationActivity.getMViewModel();
    }

    private final void getJHLUserProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
    }

    private final void gotoMainActivity() {
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoPolicy(String str) {
        gotoPolicy(str, getEmail(), "", "", "");
    }

    private final void gotoRegisterInputUserInfo() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getEmail()).withString(EventBusConstKt.PSW, getPassword()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.REGISTER).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        finish();
        a.navigation();
    }

    private final void gotoResetPwd() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
        a.withString("email", getEmail());
        a.withString(EventBusConstKt.LOGIN, "");
        a.navigation();
    }

    /* renamed from: handler$lambda-0  reason: not valid java name */
    public static final boolean m26815handler$lambda0(DeviceCerVerificationActivity deviceCerVerificationActivity, Message message) {
        Intrinsics.checkNotNullParameter(deviceCerVerificationActivity, "this$0");
        Intrinsics.checkNotNullParameter(message, LanguageConstKt.f15954it);
        if (message.what != deviceCerVerificationActivity.TIME_COUNT_DOWN) {
            return false;
        }
        deviceCerVerificationActivity.sendMessageAtOneS();
        return false;
    }

    private final void sendMessageAtOneS() {
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

    /* access modifiers changed from: private */
    public final void setNextShow(boolean z) {
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

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26816subscribeObservable$lambda2(DeviceCerVerificationActivity deviceCerVerificationActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(deviceCerVerificationActivity, "this$0");
        if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra(EventBusConstKt.AUTH_CODE, deviceCerVerificationActivity.mAuthCode);
            deviceCerVerificationActivity.setResult(-1, intent);
            deviceCerVerificationActivity.finish();
        } else if (((Number) pair.getSecond()).intValue() == 600933) {
            String string = deviceCerVerificationActivity.getString(R$string.auth_code_expired_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.auth_code_expired_error)");
            deviceCerVerificationActivity.showString(string);
        } else {
            String string2 = deviceCerVerificationActivity.getString(R$string.verification_code_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.verification_code_error)");
            deviceCerVerificationActivity.showString(string2);
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26817subscribeObservable$lambda3(DeviceCerVerificationActivity deviceCerVerificationActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(deviceCerVerificationActivity, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            int intValue = ((Number) pair.getSecond()).intValue();
            if (intValue == -1) {
                deviceCerVerificationActivity.showString(R$string.network_lost);
            } else if (intValue == 1) {
                deviceCerVerificationActivity.showString(R$string.wrong_email_or_password);
            }
        } else {
            deviceCerVerificationActivity.verCodeTimer = 60;
            deviceCerVerificationActivity.sendMessageAtOneS();
            deviceCerVerificationActivity.showString(R$string.verification_code_get_success);
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26818subscribeObservable$lambda4(DeviceCerVerificationActivity deviceCerVerificationActivity, Pair pair) {
        String str;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(deviceCerVerificationActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str2 = "";
            if (pair.getSecond() == null) {
                deviceCerVerificationActivity.termsConditionsUrl = str2;
                deviceCerVerificationActivity.connetlifePrivacyPolicyUrl = str2;
                deviceCerVerificationActivity.jhlNeedUserAgreementCount = -1;
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
            deviceCerVerificationActivity.termsConditionsUrl = jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl();
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            deviceCerVerificationActivity.connetlifePrivacyPolicyUrl = jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl();
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                num = 0;
            } else {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                if (!(jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null)) {
                    num = Integer.valueOf(Integer.parseInt(updateCount));
                }
            }
            deviceCerVerificationActivity.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                deviceCerVerificationActivity.getUserProfile();
                return;
            }
            deviceCerVerificationActivity.hideLoading();
            deviceCerVerificationActivity.gotoPolicy(EventBusConstKt.LOGIN);
            return;
        }
        deviceCerVerificationActivity.hideLoading();
        String string = deviceCerVerificationActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        deviceCerVerificationActivity.showString(string);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5  */
    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26819subscribeObservable$lambda6(com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity r14, kotlin.Pair r15) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            if (r15 != 0) goto L_0x0009
            goto L_0x00e1
        L_0x0009:
            java.lang.Object r0 = r15.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r14.getJHLUserProtocol()
            goto L_0x00d4
        L_0x001b:
            r14.hideLoading()
            com.hisense.connect_life.core.base.BaseViewModel r0 = r14.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r0 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r0
            r2 = 0
            r0.updateLoadingStatus(r2)
            r0 = 5
            java.lang.Object r3 = r15.getSecond()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            java.lang.String r5 = ":"
            boolean r4 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r5, (boolean) r2, (int) r4, (java.lang.Object) r1)
            r6 = 1
            java.lang.String r7 = "600905"
            if (r4 == 0) goto L_0x0059
            java.lang.Object r15 = r15.getSecond()
            r8 = r15
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String[] r9 = new java.lang.String[]{r5}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r15 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r8, (java.lang.String[]) r9, (boolean) r10, (int) r11, (int) r12, (java.lang.Object) r13)
            java.lang.Object r15 = r15.get(r6)
            java.lang.String r15 = (java.lang.String) r15
            int r0 = java.lang.Integer.parseInt(r15)
            r3 = r7
        L_0x0059:
            int r15 = r3.hashCode()
            java.lang.String r4 = "600925"
            if (r15 == 0) goto L_0x009e
            r5 = 1591789448(0x5ee0c788, float:8.0985321E18)
            if (r15 == r5) goto L_0x0088
            switch(r15) {
                case 1591789509: goto L_0x0078;
                case 1591789510: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x00a6
        L_0x006a:
            boolean r15 = r3.equals(r4)
            if (r15 != 0) goto L_0x0071
            goto L_0x00a6
        L_0x0071:
            int r15 = com.hisense.connect_life.app_account.R$string.account_locked
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00b3
        L_0x0078:
            java.lang.String r15 = "600924"
            boolean r15 = r3.equals(r15)
            if (r15 != 0) goto L_0x0081
            goto L_0x00a6
        L_0x0081:
            int r15 = com.hisense.connect_life.app_account.R$string.untrusted_device
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00b3
        L_0x0088:
            boolean r15 = r3.equals(r7)
            if (r15 != 0) goto L_0x008f
            goto L_0x00a6
        L_0x008f:
            int r15 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password_num
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r2] = r0
            java.lang.String r15 = r14.getString(r15, r5)
            goto L_0x00b3
        L_0x009e:
            java.lang.String r15 = ""
            boolean r15 = r3.equals(r15)
            if (r15 != 0) goto L_0x00ad
        L_0x00a6:
            int r15 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00b3
        L_0x00ad:
            int r15 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r15 = r14.getString(r15)
        L_0x00b3:
            java.lang.String r0 = "when (secondStr) {\n     …rd)\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            r14.showString((java.lang.String) r15)
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r7)
            if (r15 == 0) goto L_0x00c5
            r14.finish()
            goto L_0x00d4
        L_0x00c5:
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r15 == 0) goto L_0x00cf
            r14.gotoResetPwd()
            goto L_0x00d4
        L_0x00cf:
            int r15 = com.hisense.connect_life.app_account.R$string.login_failed
            r14.showString((int) r15)
        L_0x00d4:
            com.hisense.connect_life.core.base.BaseViewModel r14 = r14.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r14 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r14
            androidx.lifecycle.MutableLiveData r14 = r14.getSignInLiveData()
            r14.setValue(r1)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.m26819subscribeObservable$lambda6(com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-7  reason: not valid java name */
    public static final void m26820subscribeObservable$lambda7(DeviceCerVerificationActivity deviceCerVerificationActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(deviceCerVerificationActivity, "this$0");
        deviceCerVerificationActivity.hideLoading();
        ((AccountViewModel) deviceCerVerificationActivity.getMViewModel()).updateLoadingStatus(false);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (pair.getSecond() != null) {
                deviceCerVerificationActivity.gotoMainActivity();
            } else {
                deviceCerVerificationActivity.gotoRegisterInputUserInfo();
            }
            deviceCerVerificationActivity.finish();
            return;
        }
        String string = deviceCerVerificationActivity.getString(R$string.access_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
        deviceCerVerificationActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-8  reason: not valid java name */
    public static final void m26821subscribeObservable$lambda8(DeviceCerVerificationActivity deviceCerVerificationActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(deviceCerVerificationActivity, "this$0");
        deviceCerVerificationActivity.hideLoading();
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        if (bool.booleanValue()) {
            deviceCerVerificationActivity.gotoRegisterInputUserInfo();
            return;
        }
        String string = deviceCerVerificationActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        deviceCerVerificationActivity.showString(string);
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
        return R$layout.activity_device_cer_verification;
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
    public final String getPassword() {
        String str = this.password;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("password");
        return null;
    }

    @NotNull
    /* renamed from: getUserProfile  reason: collision with other method in class */
    public final UserProfile m26822getUserProfile() {
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
        ((TextView) _$_findCachedViewById(R$id.email_reminder)).setText(getString(R$string.sent_email) + ' ' + getEmail() + ' ' + getString(R$string.with_verification_code));
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.verification));
        String string = getString(R$string.verification);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.verification)");
        String upperCase = string.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        ((Button) _$_findCachedViewById(R$id.next)).setText(upperCase);
        ((AccountViewModel) getMViewModel()).getVerificationCode(getEmail(), "4");
        sendMessageAtOneS();
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new DeviceCerVerificationActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new DeviceCerVerificationActivity$setListeners$2(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.get_verification_code);
        Intrinsics.checkNotNullExpressionValue(button2, "get_verification_code");
        JuConnectExtKt.singleClickListener(button2, new DeviceCerVerificationActivity$setListeners$3(this));
        ((EditText) _$_findCachedViewById(R$id.edit_verification)).addTextChangedListener(new DeviceCerVerificationActivity$setListeners$4(this));
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
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
        ((AccountViewModel) getMViewModel()).getCheckAuthCodeLiveData().observe(this, new C7192h(this));
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7232r(this));
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7203j2(this));
        ((AccountViewModel) getMViewModel()).getSignInLiveData().observe(this, new C7184f(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7233r0(this));
        ((AccountViewModel) getMViewModel()).getUpdateJHLUserRegisterProtocolLiveData().observe(this, new C7174c1(this));
    }

    private final void getUserProfile() {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this);
        Bundle bundle = new Bundle();
        bundle.putString("login_type", "app");
        Unit unit = Unit.INSTANCE;
        instance.mo37291a("custom_profile_login", bundle);
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
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
        a.withString(EventBusConstKt.ORIGIN, str).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", "").withString(EventBusConstKt.ID_TOKEN, str4).withString("email", str2).withString(EventBusConstKt.THIRD_ID, str5).withString(EventBusConstKt.PSW, str3);
        a.navigation();
    }
}
