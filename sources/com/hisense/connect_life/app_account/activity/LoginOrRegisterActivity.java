package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7245u0;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0012\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0011H\u0014J\b\u0010%\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginOrRegisterActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "connetlifePrivacyPolicyUrl", "", "origin", "getOrigin", "()Ljava/lang/String;", "setOrigin", "(Ljava/lang/String;)V", "termsConditionsUrl", "thirdPlatformId", "vidaaPrivacyPolicyUrl", "bindLayout", "", "downloadFile", "", "fileName", "url", "getJHLProtocol", "gotoPolicy", "initView", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "message", "", "onNewIntent", "intent", "Landroid/content/Intent;", "setListeners", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/LoginOrRegisterActivity")
/* compiled from: LoginOrRegisterActivity.kt */
public final class LoginOrRegisterActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String connetlifePrivacyPolicyUrl = "";
    @Autowired(name = "origin")
    public String origin;
    @NotNull
    public String termsConditionsUrl = "";
    @NotNull
    public String thirdPlatformId = "";
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    private final void downloadFile(String str, String str2) {
        ((AccountViewModel) getMViewModel()).downloadFileWithDynamicUrlSync(str, str2);
    }

    /* access modifiers changed from: private */
    public final void getJHLProtocol() {
        showLoading();
        ((AccountViewModel) getMViewModel()).getJHLRegisterProtocol(LanguageListManager.INSTANCE.getLanguageCode());
    }

    private final void gotoPolicy() {
        if ((TextUtils.isEmpty(this.termsConditionsUrl) || TextUtils.isEmpty(this.connetlifePrivacyPolicyUrl)) && Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.REGISTER)) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.PrivacyPolicyActivity);
        a.withString(EventBusConstKt.ORIGIN, getOrigin()).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", this.thirdPlatformId).withString("email", "").withString(EventBusConstKt.PSW, "");
        a.navigation();
    }

    private final void initView() {
        if (Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.REGISTER)) {
            ((TextView) _$_findCachedViewById(R$id.register_manually)).setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.sign_in_manually)).setVisibility(8);
            ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.register_title));
            ((TextView) _$_findCachedViewById(R$id.content_tips)).setText(getString(R$string.register_third_content));
        } else if (Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.LOGIN)) {
            ((TextView) _$_findCachedViewById(R$id.register_manually)).setVisibility(8);
            ((TextView) _$_findCachedViewById(R$id.sign_in_manually)).setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.sign_in_title));
            ((TextView) _$_findCachedViewById(R$id.content_tips)).setText(getString(R$string.login_third_content));
        }
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26840subscribeObservable$lambda1(LoginOrRegisterActivity loginOrRegisterActivity, JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(loginOrRegisterActivity, "this$0");
        loginOrRegisterActivity.hideLoading();
        if (jHLAgreementData == null) {
            loginOrRegisterActivity.termsConditionsUrl = "";
            loginOrRegisterActivity.connetlifePrivacyPolicyUrl = "";
        } else {
            loginOrRegisterActivity.termsConditionsUrl = jHLAgreementData.getTosUrl();
            loginOrRegisterActivity.connetlifePrivacyPolicyUrl = jHLAgreementData.getPpUrl();
        }
        loginOrRegisterActivity.gotoPolicy();
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
        return R$layout.activity_login_with;
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
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        initView();
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
        if (Intrinsics.areEqual(obj, (Object) 101)) {
            finish();
        } else if (Intrinsics.areEqual(obj, (Object) 100)) {
            finish();
        }
    }

    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setOrigin(String.valueOf(intent.getStringExtra(EventBusConstKt.ORIGIN)));
            initView();
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new LoginOrRegisterActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.sign_in_manually);
        Intrinsics.checkNotNullExpressionValue(textView, "sign_in_manually");
        JuConnectExtKt.singleClickListener(textView, new LoginOrRegisterActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.register_manually);
        Intrinsics.checkNotNullExpressionValue(textView2, "register_manually");
        JuConnectExtKt.singleClickListener(textView2, new LoginOrRegisterActivity$setListeners$3(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.sign_g);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "sign_g");
        JuConnectExtKt.singleClickListener(linearLayout, new LoginOrRegisterActivity$setListeners$4(this));
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.sign_f);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "sign_f");
        JuConnectExtKt.singleClickListener(linearLayout2, new LoginOrRegisterActivity$setListeners$5(this));
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.sign_m);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "sign_m");
        JuConnectExtKt.singleClickListener(linearLayout3, new LoginOrRegisterActivity$setListeners$6(this));
        LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(R$id.sign_t);
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "sign_t");
        JuConnectExtKt.singleClickListener(linearLayout4, new LoginOrRegisterActivity$setListeners$7(this));
    }

    public final void setOrigin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.origin = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getGetJHLRegisterProtocolLiveData().observe(this, new C7245u0(this));
    }
}
