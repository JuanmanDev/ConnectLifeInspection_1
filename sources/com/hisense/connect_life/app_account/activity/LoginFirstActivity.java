package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.R$color;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7213m0;
import p040c.p472t.p473a.C7585u;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\fH\u0014J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0014J\b\u0010\u001d\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginFirstActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "CODE_LOCATION", "", "connetlifePrivacyPolicyUrl", "", "termsConditionsUrl", "vidaaPrivacyPolicyUrl", "bindLayout", "checkLocationPerm", "", "getJHLProtocol", "gotoLogin", "gotoPolicy", "gotoRegister", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "message", "", "setListeners", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/LoginFirstActivity")
/* compiled from: LoginFirstActivity.kt */
public final class LoginFirstActivity extends BaseVmActivity<AccountViewModel> {
    public final int CODE_LOCATION = 1;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @Nullable
    public String termsConditionsUrl = "";
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    /* access modifiers changed from: private */
    public final void checkLocationPerm() {
        if (C7585u.m21554c(this, CollectionsKt__CollectionsKt.listOf(PermissionConstKt.PERMISSION_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"))) {
            gotoRegister();
            return;
        }
        C7585u l = C7585u.m21560l(this);
        l.mo33042g(PermissionConstKt.PERMISSION_LOCATION);
        l.mo33042g("android.permission.ACCESS_COARSE_LOCATION");
        l.mo33043h(new LoginFirstActivity$checkLocationPerm$1(this));
    }

    private final void getJHLProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLRegisterProtocol(LanguageListManager.INSTANCE.getLanguageCode());
    }

    /* access modifiers changed from: private */
    public final void gotoLogin() {
        JuConnectExtKt.navigation(Paths.Account.LoginEmailActivity);
    }

    private final void gotoPolicy() {
        if (TextUtils.isEmpty(this.termsConditionsUrl) || TextUtils.isEmpty(this.connetlifePrivacyPolicyUrl)) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputEmaliActiviy);
        a.withString(EventBusConstKt.ORIGIN, EventBusConstKt.REGISTER).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", "").withString("email", "").withString(EventBusConstKt.PSW, "");
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoRegister() {
        getJHLProtocol();
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m26837subscribeObservable$lambda0(LoginFirstActivity loginFirstActivity, JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(loginFirstActivity, "this$0");
        loginFirstActivity.hideLoading();
        if (jHLAgreementData == null) {
            loginFirstActivity.termsConditionsUrl = "";
            loginFirstActivity.connetlifePrivacyPolicyUrl = "";
        } else {
            loginFirstActivity.termsConditionsUrl = jHLAgreementData.getTosUrl();
            loginFirstActivity.connetlifePrivacyPolicyUrl = jHLAgreementData.getPpUrl();
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_TOSVER, jHLAgreementData.getTosVersion());
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_PPVER, jHLAgreementData.getPpVersion());
        }
        loginFirstActivity.gotoPolicy();
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
        return R$layout.activity_login_first;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(9216);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(getResources().getColor(R$color.transparent));
        }
    }

    public void onBackPressed() {
        Paths.Jump.INSTANCE.exitApp(this, new LoginFirstActivity$onBackPressed$1(this));
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
        if (Intrinsics.areEqual(obj, (Object) 100)) {
            finish();
        }
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.sign_in);
        Intrinsics.checkNotNullExpressionValue(textView, "sign_in");
        JuConnectExtKt.singleClickListener(textView, new LoginFirstActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.get_started);
        Intrinsics.checkNotNullExpressionValue(button, "get_started");
        JuConnectExtKt.singleClickListener(button, new LoginFirstActivity$setListeners$2(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getGetJHLRegisterProtocolLiveData().observe(this, new C7213m0(this));
    }
}
