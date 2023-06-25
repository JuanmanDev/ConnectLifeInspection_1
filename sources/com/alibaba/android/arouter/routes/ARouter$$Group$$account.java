package com.alibaba.android.arouter.routes;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.app_account.activity.AboutActivity;
import com.hisense.connect_life.app_account.activity.ChangeEmailSuccessActivity;
import com.hisense.connect_life.app_account.activity.ChangePasswordActivity;
import com.hisense.connect_life.app_account.activity.ClipImageActivity;
import com.hisense.connect_life.app_account.activity.ConfigTestActivity;
import com.hisense.connect_life.app_account.activity.ConformDeleteAccount;
import com.hisense.connect_life.app_account.activity.CountryListActivity;
import com.hisense.connect_life.app_account.activity.DeleteAccount;
import com.hisense.connect_life.app_account.activity.DeleteAccountEmailCode;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;
import com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import com.hisense.connect_life.app_account.activity.LoginFirstActivity;
import com.hisense.connect_life.app_account.activity.LoginForgotPswInputEmailActivity;
import com.hisense.connect_life.app_account.activity.LoginOrRegisterActivity;
import com.hisense.connect_life.app_account.activity.LoginRedirectActivity;
import com.hisense.connect_life.app_account.activity.LoginResetFirstActivity;
import com.hisense.connect_life.app_account.activity.LoginResetPswActivity;
import com.hisense.connect_life.app_account.activity.LoginUsersActivity;
import com.hisense.connect_life.app_account.activity.PasswordActivity;
import com.hisense.connect_life.app_account.activity.PdfTestActivity;
import com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity;
import com.hisense.connect_life.app_account.activity.RegisterInputEmaliActiviy;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import com.hisense.connect_life.app_account.activity.RegisterInputVerificationActivity;
import com.hisense.connect_life.app_account.activity.RegisterSetPasswordActivity;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;
import com.hisense.connect_life.app_account.activity.RepeatPasswordActivity;
import com.hisense.connect_life.app_account.activity.UpgradeActivity;
import com.hisense.connect_life.app_account.activity.UserAgreementWebViewActivity;
import com.hisense.connect_life.app_account.activity.UserProfileActivity;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import java.util.HashMap;
import java.util.Map;

public class ARouter$$Group$$account implements IRouteGroup {

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$a */
    /* compiled from: ARouter$$Group$$account */
    public class C3744a extends HashMap<String, Integer> {
        public C3744a(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.LOGIN, 8);
            put("DELETE_ACCOUNT", 8);
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$b */
    /* compiled from: ARouter$$Group$$account */
    public class C3745b extends HashMap<String, Integer> {
        public C3745b(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.LOGIN, 8);
            put("DELETE_ACCOUNT", 8);
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$c */
    /* compiled from: ARouter$$Group$$account */
    public class C3746c extends HashMap<String, Integer> {
        public C3746c(ARouter$$Group$$account aRouter$$Group$$account) {
            put("userNum", 3);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$d */
    /* compiled from: ARouter$$Group$$account */
    public class C3747d extends HashMap<String, Integer> {
        public C3747d(ARouter$$Group$$account aRouter$$Group$$account) {
            put("firstName", 8);
            put("lastName", 8);
            put("photoUrl", 8);
            put(EventBusConstKt.USERNAME, 8);
            put("email", 8);
            put("userIconBgColor", 3);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$e */
    /* compiled from: ARouter$$Group$$account */
    public class C3748e extends HashMap<String, Integer> {
        public C3748e(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.PSW, 8);
            put(EventBusConstKt.THIRD_ID, 8);
            put(EventBusConstKt.ORIGIN, 8);
            put("vidaaPrivacyPolicyUrl", 8);
            put(EventBusConstKt.ID_TOKEN, 8);
            put("thirdPlatformId", 8);
            put("termsConditionsUrl", 8);
            put("email", 8);
            put("connetlifePrivacyPolicyUrl", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$f */
    /* compiled from: ARouter$$Group$$account */
    public class C3749f extends HashMap<String, Integer> {
        public C3749f(ARouter$$Group$$account aRouter$$Group$$account) {
            put("vidaaPrivacyPolicyUrl", 8);
            put("termsConditionsUrl", 8);
            put("connetlifePrivacyPolicyUrl", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$g */
    /* compiled from: ARouter$$Group$$account */
    public class C3750g extends HashMap<String, Integer> {
        public C3750g(ARouter$$Group$$account aRouter$$Group$$account) {
            put("photoUrl", 8);
            put(EventBusConstKt.PSW, 8);
            put(FileProvider.DISPLAYNAME_FIELD, 8);
            put(EventBusConstKt.ORIGIN, 8);
            put("thirdPlatformId", 8);
            put("thirdLoginType", 8);
            put("id", 8);
            put("thirdCallBackParams", 8);
            put("email", 8);
            put(FirebaseMessagingService.EXTRA_TOKEN, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$h */
    /* compiled from: ARouter$$Group$$account */
    public class C3751h extends HashMap<String, Integer> {
        public C3751h(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.USERINFO, 9);
            put(EventBusConstKt.PSW, 8);
            put(EventBusConstKt.ORIGIN, 8);
            put("thirdPlatformId", 8);
            put("thirdLoginType", 8);
            put("email", 8);
            put(FirebaseMessagingService.EXTRA_TOKEN, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$i */
    /* compiled from: ARouter$$Group$$account */
    public class C3752i extends HashMap<String, Integer> {
        public C3752i(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.AUTH_CODE, 8);
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$j */
    /* compiled from: ARouter$$Group$$account */
    public class C3753j extends HashMap<String, Integer> {
        public C3753j(ARouter$$Group$$account aRouter$$Group$$account) {
            put("firstName", 8);
            put("lastName", 8);
            put("photoUrl", 8);
            put(EventBusConstKt.PSW, 8);
            put(FileProvider.DISPLAYNAME_FIELD, 8);
            put("name", 8);
            put("thirdPlatformId", 8);
            put("thirdLoginType", 8);
            put("id", 8);
            put("thirdCallBackParams", 8);
            put("email", 8);
            put(FirebaseMessagingService.EXTRA_TOKEN, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$k */
    /* compiled from: ARouter$$Group$$account */
    public class C3754k extends HashMap<String, Integer> {
        public C3754k(ARouter$$Group$$account aRouter$$Group$$account) {
            put(KeyConst.LOGIN_EMAILS, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$l */
    /* compiled from: ARouter$$Group$$account */
    public class C3755l extends HashMap<String, Integer> {
        public C3755l(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.USERINFO, 10);
            put(EventBusConstKt.PSW, 8);
            put(EventBusConstKt.GPS, 9);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$m */
    /* compiled from: ARouter$$Group$$account */
    public class C3756m extends HashMap<String, Integer> {
        public C3756m(ARouter$$Group$$account aRouter$$Group$$account) {
            put(KeyConst.KEY_TARGET_URL, 8);
            put(KeyConst.KEY_TITLE_TEXT, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$n */
    /* compiled from: ARouter$$Group$$account */
    public class C3757n extends HashMap<String, Integer> {
        public C3757n(ARouter$$Group$$account aRouter$$Group$$account) {
            put("type", 8);
            put("version", 8);
            put(BrowserServiceFileProvider.CONTENT_SCHEME, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$o */
    /* compiled from: ARouter$$Group$$account */
    public class C3758o extends HashMap<String, Integer> {
        public C3758o(ARouter$$Group$$account aRouter$$Group$$account) {
            put("domain", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$p */
    /* compiled from: ARouter$$Group$$account */
    public class C3759p extends HashMap<String, Integer> {
        public C3759p(ARouter$$Group$$account aRouter$$Group$$account) {
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$q */
    /* compiled from: ARouter$$Group$$account */
    public class C3760q extends HashMap<String, Integer> {
        public C3760q(ARouter$$Group$$account aRouter$$Group$$account) {
            put("uri", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$r */
    /* compiled from: ARouter$$Group$$account */
    public class C3761r extends HashMap<String, Integer> {
        public C3761r(ARouter$$Group$$account aRouter$$Group$$account) {
            put("domain", 8);
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$s */
    /* compiled from: ARouter$$Group$$account */
    public class C3762s extends HashMap<String, Integer> {
        public C3762s(ARouter$$Group$$account aRouter$$Group$$account) {
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$t */
    /* compiled from: ARouter$$Group$$account */
    public class C3763t extends HashMap<String, Integer> {
        public C3763t(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.USERINFO, 9);
            put(EventBusConstKt.PSW, 8);
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$u */
    /* compiled from: ARouter$$Group$$account */
    public class C3764u extends HashMap<String, Integer> {
        public C3764u(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.PSW, 8);
            put(KeyConst.USER_AGREEMENT_URL, 8);
            put(KeyConst.USER_PRIVACY_POLICY, 8);
            put(KeyConst.KEY_TARGET_URL, 8);
            put(KeyConst.KEY_TITLE_TEXT, 8);
            put(EventBusConstKt.ID_TOKEN, 8);
            put("from", 8);
            put("email", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$v */
    /* compiled from: ARouter$$Group$$account */
    public class C3765v extends HashMap<String, Integer> {
        public C3765v(ARouter$$Group$$account aRouter$$Group$$account) {
            put(EventBusConstKt.ORIGIN, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$account$w */
    /* compiled from: ARouter$$Group$$account */
    public class C3766w extends HashMap<String, Integer> {
        public C3766w(ARouter$$Group$$account aRouter$$Group$$account) {
            put("email", 8);
        }
    }

    public void loadInto(Map<String, RouteMeta> map) {
        map.put(Paths.Account.AboutActivity, RouteMeta.build(RouteType.ACTIVITY, AboutActivity.class, "/account/aboutactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.ChangeEmailSuccessActivity, RouteMeta.build(RouteType.ACTIVITY, ChangeEmailSuccessActivity.class, "/account/changeemailsuccessactivity", "account", new C3754k(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.ChangePasswordActivity, RouteMeta.build(RouteType.ACTIVITY, ChangePasswordActivity.class, "/account/changepasswordactivity", "account", new C3759p(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.ClipImageActivity, RouteMeta.build(RouteType.ACTIVITY, ClipImageActivity.class, "/account/clipimageactivity", "account", new C3760q(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.ConfigTestActivity, RouteMeta.build(RouteType.ACTIVITY, ConfigTestActivity.class, "/account/configtestactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.ConformDeleteAccount, RouteMeta.build(RouteType.ACTIVITY, ConformDeleteAccount.class, "/account/conformdeleteaccount", "account", new C3761r(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.ConformDeleteEmailCode, RouteMeta.build(RouteType.ACTIVITY, DeleteAccountEmailCode.class, "/account/conformdeleteemailcode", "account", new C3762s(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.CountryListActivity, RouteMeta.build(RouteType.ACTIVITY, CountryListActivity.class, "/account/countrylistactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.DeleteAccount, RouteMeta.build(RouteType.ACTIVITY, DeleteAccount.class, "/account/deleteaccount", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.DeviceCerVerificationActivity, RouteMeta.build(RouteType.ACTIVITY, DeviceCerVerificationActivity.class, "/account/devicecerverificationactivity", "account", new C3763t(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.GUserAgreementWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, GUserAgreementWebViewActivity.class, "/account/guseragreementwebviewactivity", "account", new C3764u(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginEmailActivity, RouteMeta.build(RouteType.ACTIVITY, LoginEmailActivity.class, "/account/loginemailactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginFirstActivity, RouteMeta.build(RouteType.ACTIVITY, LoginFirstActivity.class, "/account/loginfirstactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginForgotPswInputEmailActivity, RouteMeta.build(RouteType.ACTIVITY, LoginForgotPswInputEmailActivity.class, "/account/loginforgotpswinputemailactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginOrRegisterActivity, RouteMeta.build(RouteType.ACTIVITY, LoginOrRegisterActivity.class, "/account/loginorregisteractivity", "account", new C3765v(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginRedirectActivity, RouteMeta.build(RouteType.ACTIVITY, LoginRedirectActivity.class, "/account/loginredirectactivity", "account", new C3766w(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginResetFirstActivity, RouteMeta.build(RouteType.ACTIVITY, LoginResetFirstActivity.class, "/account/loginresetfirstactivity", "account", new C3744a(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginResetPswActivity, RouteMeta.build(RouteType.ACTIVITY, LoginResetPswActivity.class, "/account/loginresetpswactivity", "account", new C3745b(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.LoginUsersActivity, RouteMeta.build(RouteType.ACTIVITY, LoginUsersActivity.class, "/account/loginusersactivity", "account", new C3746c(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.PasswordActivity, RouteMeta.build(RouteType.ACTIVITY, PasswordActivity.class, "/account/passwordactivity", "account", new C3747d(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.PdfTestActivity, RouteMeta.build(RouteType.ACTIVITY, PdfTestActivity.class, "/account/pdftestactivity", "account", (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Account.PrivacyPolicyActivity, RouteMeta.build(RouteType.ACTIVITY, PrivacyPolicyActivity.class, "/account/privacypolicyactivity", "account", new C3748e(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.RegisterInputEmaliActiviy, RouteMeta.build(RouteType.ACTIVITY, RegisterInputEmaliActiviy.class, "/account/registerinputemaliactiviy", "account", new C3749f(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.RegisterInputUserInfoActivity, RouteMeta.build(RouteType.ACTIVITY, RegisterInputUserInfoActivity.class, "/account/registerinputuserinfoactivity", "account", new C3750g(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.RegisterInputVerificationActivity, RouteMeta.build(RouteType.ACTIVITY, RegisterInputVerificationActivity.class, "/account/registerinputverificationactivity", "account", new C3751h(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.RegisterSetPasswordActivity, RouteMeta.build(RouteType.ACTIVITY, RegisterSetPasswordActivity.class, "/account/registersetpasswordactivity", "account", new C3752i(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.RegisterSuccessActivity, RouteMeta.build(RouteType.ACTIVITY, RegisterSuccessActivity.class, "/account/registersuccessactivity", "account", new C3753j(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.RepeatPasswordActivity, RouteMeta.build(RouteType.ACTIVITY, RepeatPasswordActivity.class, "/account/repeatpasswordactivity", "account", new C3755l(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.SingleWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, UserAgreementWebViewActivity.class, "/account/singlewebviewactivity", "account", new C3756m(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.UpgradeActivity, RouteMeta.build(RouteType.ACTIVITY, UpgradeActivity.class, "/account/upgradeactivity", "account", new C3757n(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Account.UserProfileActivity, RouteMeta.build(RouteType.ACTIVITY, UserProfileActivity.class, "/account/userprofileactivity", "account", new C3758o(this), -1, Integer.MIN_VALUE));
    }
}
