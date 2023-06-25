package com.hisense.connect_life.app_account.activity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7250v1;
import p040c.p429r.p430a.p431a.p432b.C7253w0;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0015J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/AboutActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "connetlifePrivacyPolicyUrl", "", "termsConditionsUrl", "bindLayout", "", "getJHLUserProtocol", "", "gotoAgreementWebViewActivity", "title", "url", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setListeners", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/AboutActivity")
/* compiled from: AboutActivity.kt */
public final class AboutActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @Nullable
    public String termsConditionsUrl = "";

    private final void getJHLUserProtocol() {
        showLoading();
        ((AccountViewModel) getMViewModel()).getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
    }

    /* access modifiers changed from: private */
    public final void gotoAgreementWebViewActivity(String str, String str2) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.SingleWebViewActivity);
        a.withString(KeyConst.KEY_TITLE_TEXT, str).withString(KeyConst.KEY_TARGET_URL, str2);
        a.navigation();
    }

    /* renamed from: initWidgets$lambda-0  reason: not valid java name */
    public static final void m26802initWidgets$lambda0(AboutActivity aboutActivity, View view) {
        Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        aboutActivity.onBackPressed();
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26803subscribeObservable$lambda2(AboutActivity aboutActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        aboutActivity.hideLoading();
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = aboutActivity.getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            aboutActivity.showString(string);
        } else if (pair == null) {
            aboutActivity.termsConditionsUrl = "";
            aboutActivity.connetlifePrivacyPolicyUrl = "";
        } else {
            JHLAgreementData jHLAgreementData = (JHLAgreementData) pair.getSecond();
            String str = null;
            aboutActivity.termsConditionsUrl = jHLAgreementData == null ? null : jHLAgreementData.getTosUrl();
            JHLAgreementData jHLAgreementData2 = (JHLAgreementData) pair.getSecond();
            if (jHLAgreementData2 != null) {
                str = jHLAgreementData2.getPpUrl();
            }
            aboutActivity.connetlifePrivacyPolicyUrl = str;
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
        return R$layout.activity_about;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    @SuppressLint({"SetTextI18n"})
    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.about));
        ((TextView) _$_findCachedViewById(R$id.about_version)).setText(getString(R$string.version) + ' ' + getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
        ((TextView) _$_findCachedViewById(R$id.privacty_policy)).getPaint().setFlags(8);
        ((TextView) _$_findCachedViewById(R$id.terms_of_service)).getPaint().setFlags(8);
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setOnClickListener(new C7250v1(this));
        getJHLUserProtocol();
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.privacty_policy);
        Intrinsics.checkNotNullExpressionValue(textView, "privacty_policy");
        JuConnectExtKt.singleClickListener(textView, new AboutActivity$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.terms_of_service);
        Intrinsics.checkNotNullExpressionValue(textView2, "terms_of_service");
        JuConnectExtKt.singleClickListener(textView2, new AboutActivity$setListeners$2(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7253w0(this));
    }
}
