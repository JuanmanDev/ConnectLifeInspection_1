package com.hisense.connect_life.app_account.activity;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.TextView;
import androidx.core.app.NotificationCompatJellybean;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.app_account.widget.ExtraWebView;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.widget.IconFontView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p432b.C7221o0;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0015J\b\u0010\u0013\u001a\u00020\u0012H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/UserAgreementWebViewActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "setListeners", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/SingleWebViewActivity")
/* compiled from: UserAgreementWebViewActivity.kt */
public final class UserAgreementWebViewActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "title_text")
    public String title;
    @Autowired(name = "target_url")
    public String url;

    /* renamed from: initWidgets$lambda-0  reason: not valid java name */
    public static final void m26892initWidgets$lambda0(UserAgreementWebViewActivity userAgreementWebViewActivity) {
        Intrinsics.checkNotNullParameter(userAgreementWebViewActivity, "this$0");
        userAgreementWebViewActivity.hideLoading();
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
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void initWidgets() {
        showLoading(true);
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getTitle());
        LoggerUtil.Companion.mo39148i(Intrinsics.stringPlus("PolicyUrl:", getUrl()));
        new Handler().postDelayed(new C7221o0(this), 10000);
        WebSettings settings = ((ExtraWebView) _$_findCachedViewById(R$id.local_webView)).getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "local_webView.settings");
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        ((ExtraWebView) _$_findCachedViewById(R$id.local_webView)).setWebViewClient(new UserAgreementWebViewActivity$initWidgets$2(this));
        ((ExtraWebView) _$_findCachedViewById(R$id.local_webView)).loadUrl(getUrl() + "?v=" + ((int) (Math.random() * ((double) 200))));
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new UserAgreementWebViewActivity$setListeners$1(this));
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
