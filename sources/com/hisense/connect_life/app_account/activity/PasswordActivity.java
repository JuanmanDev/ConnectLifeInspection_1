package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.messaging.FirebaseMessagingService;
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
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.networks.request.device.model.JHKUserAgreementBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;
import p040c.p429r.p430a.p431a.p432b.C7191g2;
import p040c.p429r.p430a.p431a.p432b.C7194h1;
import p040c.p429r.p430a.p431a.p432b.C7218n1;
import p040c.p429r.p430a.p431a.p432b.C7235r2;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u0005H\u0014J\b\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0016J\b\u0010*\u001a\u00020 H\u0014J\"\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020 H\u0014J\b\u00101\u001a\u00020 H\u0014J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u001e\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/PasswordActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "REQUEST_CODE", "", "connetlifePrivacyPolicyUrl", "", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "jhlNeedUserAgreementCount", "Ljava/lang/Integer;", "lastName", "getLastName", "setLastName", "photoUrl", "getPhotoUrl", "setPhotoUrl", "termsConditionsUrl", "userIconBgColor", "userName", "getUserName", "setUserName", "vidaaPrivacyPolicyUrl", "bindLayout", "getJHLUserProtocol", "", "getSpellName", "getUserProfile", "gotoLoginActivity", "gotoMainActivity", "gotoPolicy", "gotoRegisterInputUserInfo", "gotoResetPwd", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "setListeners", "setUserPhotoShow", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/PasswordActivity")
/* compiled from: PasswordActivity.kt */
public final class PasswordActivity extends BaseVmActivity<AccountViewModel> {
    public final int REQUEST_CODE = 1000;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @Autowired(name = "email")
    public String email;
    @Autowired(name = "firstName")
    public String firstName;
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @Autowired(name = "lastName")
    public String lastName;
    @Autowired(name = "photoUrl")
    public String photoUrl;
    @Nullable
    public String termsConditionsUrl = "";
    @Autowired(name = "userIconBgColor")
    @JvmField
    public int userIconBgColor;
    @Autowired(name = "userName")
    public String userName;
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    public static final /* synthetic */ AccountViewModel access$getMViewModel(PasswordActivity passwordActivity) {
        return (AccountViewModel) passwordActivity.getMViewModel();
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

    /* access modifiers changed from: private */
    public final void gotoLoginActivity() {
        hideLoading();
        JuConnectExtKt.navigation(Paths.Account.LoginEmailActivity);
    }

    private final void gotoMainActivity() {
        hideLoading();
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoPolicy() {
        if (TextUtils.isEmpty(this.termsConditionsUrl) || TextUtils.isEmpty(this.connetlifePrivacyPolicyUrl)) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.PrivacyPolicyActivity);
        a.withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", "").withString("email", getEmail()).withString(EventBusConstKt.PSW, ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString());
        a.navigation();
    }

    private final void gotoRegisterInputUserInfo() {
        hideLoading();
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        a.withString("email", getEmail()).withString(EventBusConstKt.PSW, ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", "").withString("thirdLoginType", "").withString(FirebaseMessagingService.EXTRA_TOKEN, "").withString("id", "").withString(FileProvider.DISPLAYNAME_FIELD, "").withString("photoUrl", "").withString("thirdCallBackParams", "");
        a.navigation();
    }

    private final void gotoResetPwd() {
        int i = this.REQUEST_CODE;
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
        a.withString("email", getEmail());
        a.withString(EventBusConstKt.LOGIN, "");
        a.navigation((Activity) this, i);
    }

    private final void setUserPhotoShow() {
        if (this.photoUrl == null) {
            ((CardView) _$_findCachedViewById(R$id.user_card_view)).setCardBackgroundColor(ContextCompat.getColor(this, this.userIconBgColor));
            ImageView imageView = (ImageView) _$_findCachedViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView, "user_image");
            imageView.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView, "user_text");
            textView.setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.user_text)).setText(getSpellName(getFirstName(), getLastName()));
        } else if (TextUtils.isEmpty(getPhotoUrl()) || Intrinsics.areEqual((Object) getPhotoUrl(), (Object) "null")) {
            ((CardView) _$_findCachedViewById(R$id.user_card_view)).setCardBackgroundColor(ContextCompat.getColor(this, this.userIconBgColor));
            ImageView imageView2 = (ImageView) _$_findCachedViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView2, "user_image");
            imageView2.setVisibility(8);
            TextView textView2 = (TextView) _$_findCachedViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView2, "user_text");
            textView2.setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.user_text)).setText(getSpellName(getFirstName(), getLastName()));
        } else {
            ImageView imageView3 = (ImageView) _$_findCachedViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView3, "user_image");
            imageView3.setVisibility(0);
            TextView textView3 = (TextView) _$_findCachedViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView3, "user_text");
            textView3.setVisibility(8);
            ((C1544f) C1541c.m1101w(this).mo15512s(getPhotoUrl()).mo16283b0(((CardView) _$_findCachedViewById(R$id.user_card_view)).getWidth(), ((CardView) _$_findCachedViewById(R$id.user_card_view)).getHeight())).mo15478D0((ImageView) _$_findCachedViewById(R$id.user_image));
        }
        if (TextUtils.isEmpty(getFirstName()) || TextUtils.isEmpty(getLastName()) || Intrinsics.areEqual((Object) getFirstName(), (Object) "null") || Intrinsics.areEqual((Object) getLastName(), (Object) "null")) {
            ((TextView) _$_findCachedViewById(R$id.user_name)).setText(getEmail());
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.user_name)).setText(getFirstName() + ' ' + getLastName());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0100  */
    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26849subscribeObservable$lambda2(com.hisense.connect_life.app_account.activity.PasswordActivity r14, kotlin.Pair r15) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            if (r15 != 0) goto L_0x0009
            goto L_0x0122
        L_0x0009:
            java.lang.Object r0 = r15.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r14.getJHLUserProtocol()
            goto L_0x0115
        L_0x001b:
            r14.hideLoading()
            com.hisense.connect_life.core.base.BaseViewModel r0 = r14.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r0 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r0
            r2 = 0
            r0.updateLoadingStatus(r2)
            int r0 = com.hisense.connect_life.app_account.R$id.password_input_layout
            android.view.View r0 = r14._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r3 = com.hisense.connect_life.app_account.R$drawable.edittext_background_error
            r0.setBackgroundResource(r3)
            r0 = 5
            java.lang.Object r3 = r15.getSecond()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            java.lang.String r5 = ":"
            boolean r4 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r5, (boolean) r2, (int) r4, (java.lang.Object) r1)
            java.lang.String r6 = "600905"
            r7 = 1
            if (r4 == 0) goto L_0x0066
            java.lang.Object r15 = r15.getSecond()
            r8 = r15
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String[] r9 = new java.lang.String[]{r5}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r15 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r8, (java.lang.String[]) r9, (boolean) r10, (int) r11, (int) r12, (java.lang.Object) r13)
            java.lang.Object r15 = r15.get(r7)
            java.lang.String r15 = (java.lang.String) r15
            int r0 = java.lang.Integer.parseInt(r15)
            r3 = r6
        L_0x0066:
            int r15 = r3.hashCode()
            java.lang.String r4 = "600925"
            java.lang.String r5 = "600924"
            if (r15 == 0) goto L_0x00ab
            r8 = 1591789448(0x5ee0c788, float:8.0985321E18)
            if (r15 == r8) goto L_0x0095
            switch(r15) {
                case 1591789509: goto L_0x0087;
                case 1591789510: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00b3
        L_0x0079:
            boolean r15 = r3.equals(r4)
            if (r15 != 0) goto L_0x0080
            goto L_0x00b3
        L_0x0080:
            int r15 = com.hisense.connect_life.app_account.R$string.account_locked
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00c0
        L_0x0087:
            boolean r15 = r3.equals(r5)
            if (r15 != 0) goto L_0x008e
            goto L_0x00b3
        L_0x008e:
            int r15 = com.hisense.connect_life.app_account.R$string.untrusted_device
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00c0
        L_0x0095:
            boolean r15 = r3.equals(r6)
            if (r15 != 0) goto L_0x009c
            goto L_0x00b3
        L_0x009c:
            int r15 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password_num
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r2] = r0
            java.lang.String r15 = r14.getString(r15, r6)
            goto L_0x00c0
        L_0x00ab:
            java.lang.String r15 = ""
            boolean r15 = r3.equals(r15)
            if (r15 != 0) goto L_0x00ba
        L_0x00b3:
            int r15 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00c0
        L_0x00ba:
            int r15 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r15 = r14.getString(r15)
        L_0x00c0:
            java.lang.String r0 = "when (secondStr) {\n     …rd)\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            r14.showString((java.lang.String) r15)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x0100
            com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity$Companion r15 = com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.Companion
            int r15 = r15.getCODE_DEV_VER()
            c.a.a.a.b.a r0 = p040c.p041a.p042a.p043a.p045b.C1337a.m211c()
            java.lang.String r2 = "/account/DeviceCerVerificationActivity"
            com.alibaba.android.arouter.facade.Postcard r0 = r0.mo15011a(r2)
            java.lang.String r2 = r14.getEmail()
            java.lang.String r3 = "email"
            r0.withString(r3, r2)
            int r2 = com.hisense.connect_life.app_account.R$id.sign_password
            android.view.View r2 = r14._$_findCachedViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "psw"
            r0.withString(r3, r2)
            r0.navigation((android.app.Activity) r14, (int) r15)
            goto L_0x0115
        L_0x0100:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x010a
            r14.gotoResetPwd()
            goto L_0x0115
        L_0x010a:
            int r0 = com.hisense.connect_life.app_account.R$id.til_password_pw
            android.view.View r0 = r14._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            r0.setError(r15)
        L_0x0115:
            com.hisense.connect_life.core.base.BaseViewModel r14 = r14.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r14 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r14
            androidx.lifecycle.MutableLiveData r14 = r14.getSignInLiveData()
            r14.setValue(r1)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.PasswordActivity.m26849subscribeObservable$lambda2(com.hisense.connect_life.app_account.activity.PasswordActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26850subscribeObservable$lambda3(PasswordActivity passwordActivity, Pair pair) {
        String str;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(passwordActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str2 = "";
            if (pair == null) {
                passwordActivity.termsConditionsUrl = str2;
                passwordActivity.connetlifePrivacyPolicyUrl = str2;
                passwordActivity.jhlNeedUserAgreementCount = 0;
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
            passwordActivity.termsConditionsUrl = jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl();
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            passwordActivity.connetlifePrivacyPolicyUrl = jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl();
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                num = 0;
            } else {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                if (!(jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null)) {
                    num = Integer.valueOf(Integer.parseInt(updateCount));
                }
            }
            passwordActivity.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                passwordActivity.getUserProfile();
                return;
            }
            passwordActivity.hideLoading();
            passwordActivity.gotoPolicy();
            return;
        }
        passwordActivity.hideLoading();
        String string = passwordActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        passwordActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26851subscribeObservable$lambda4(PasswordActivity passwordActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(passwordActivity, "this$0");
        passwordActivity.hideLoading();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            JHKUserAgreementBean jHKUserAgreementBean = (JHKUserAgreementBean) pair.getSecond();
            String str = null;
            if (!TextUtils.isEmpty(jHKUserAgreementBean == null ? null : jHKUserAgreementBean.getPpUrl())) {
                JHKUserAgreementBean jHKUserAgreementBean2 = (JHKUserAgreementBean) pair.getSecond();
                if (jHKUserAgreementBean2 != null) {
                    str = jHKUserAgreementBean2.getPpUrl();
                }
                passwordActivity.vidaaPrivacyPolicyUrl = str;
                passwordActivity.gotoPolicy();
                return;
            }
            String string = passwordActivity.getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            passwordActivity.showString(string);
            return;
        }
        String string2 = passwordActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.no_internet_connection)");
        passwordActivity.showString(string2);
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26852subscribeObservable$lambda5(PasswordActivity passwordActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(passwordActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            passwordActivity.hideLoading();
            ((AccountViewModel) passwordActivity.getMViewModel()).updateLoadingStatus(false);
            String string = passwordActivity.getString(R$string.access_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
            passwordActivity.showString(string);
        } else if (pair.getSecond() != null) {
            passwordActivity.gotoMainActivity();
        } else {
            passwordActivity.gotoRegisterInputUserInfo();
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
        return R$layout.activity_login_password;
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
    public final String getLastName() {
        String str = this.lastName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastName");
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
    public final String getUserName() {
        String str = this.userName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.USERNAME);
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.forget_password_user)).getPaint().setFlags(8);
        ((TextView) _$_findCachedViewById(R$id.password_for_email)).setText(getString(R$string.your_password_for) + ' ' + getEmail());
        boolean z = true;
        if (getFirstName().length() > 0) {
            if (getLastName().length() <= 0) {
                z = false;
            }
            if (z && !Intrinsics.areEqual((Object) getFirstName(), (Object) "null") && !Intrinsics.areEqual((Object) getLastName(), (Object) "null")) {
                ((TextView) _$_findCachedViewById(R$id.user_name)).setText(getFirstName() + "  " + getLastName());
                setUserPhotoShow();
            }
        }
        ((TextView) _$_findCachedViewById(R$id.user_name)).setText(getEmail());
        setUserPhotoShow();
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == DeviceCerVerificationActivity.Companion.getCODE_DEV_VER() && i2 == -1) {
            String str = "";
            if (!(intent == null || (stringExtra = intent.getStringExtra(EventBusConstKt.AUTH_CODE)) == null)) {
                str = stringExtra;
            }
            String obj = ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString();
            if (C1519p.m1017a(getEmail()) && !TextUtils.isEmpty(obj)) {
                ((AccountViewModel) getMViewModel()).signIn(getEmail(), obj, str);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.sign_with);
        Intrinsics.checkNotNullExpressionValue(textView, "sign_with");
        JuConnectExtKt.singleClickListener(textView, new PasswordActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.login);
        Intrinsics.checkNotNullExpressionValue(button, EventBusConstKt.LOGIN);
        JuConnectExtKt.singleClickListener(button, new PasswordActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.forget_password_user);
        Intrinsics.checkNotNullExpressionValue(textView2, "forget_password_user");
        JuConnectExtKt.singleClickListener(textView2, new PasswordActivity$setListeners$3(this));
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.show_hide_password_user);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "show_hide_password_user");
        JuConnectExtKt.singleClickListener(iconFontView, new PasswordActivity$setListeners$4(this));
        ((EditText) _$_findCachedViewById(R$id.sign_password)).addTextChangedListener(new PasswordActivity$setListeners$5(this));
    }

    public final void setPhotoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photoUrl = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getSignInLiveData().observe(this, new C7191g2(this));
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7235r2(this));
        ((AccountViewModel) getMViewModel()).getGetJHKRegisterProtocolLiveData().observe(this, new C7194h1(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7218n1(this));
    }
}
