package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.viewmodel.ConfigViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p432b.C7187f2;
import p040c.p429r.p430a.p431a.p432b.C7230q1;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/ConfigTestActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/ConfigViewModel;", "()V", "mConfigMac", "", "getMConfigMac", "()Ljava/lang/String;", "setMConfigMac", "(Ljava/lang/String;)V", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "onDestroy", "setListeners", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/ConfigTestActivity")
/* compiled from: ConfigTestActivity.kt */
public final class ConfigTestActivity extends BaseVmActivity<ConfigViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String mConfigMac = "";

    public static final /* synthetic */ ConfigViewModel access$getMViewModel(ConfigTestActivity configTestActivity) {
        return (ConfigViewModel) configTestActivity.getMViewModel();
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m26807subscribeObservable$lambda0(ConfigTestActivity configTestActivity, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configTestActivity, "this$0");
        configTestActivity.hideLoading();
        if (!configParsCom.getCmdArr().isEmpty()) {
            ((TextView) configTestActivity._$_findCachedViewById(R$id.tv_result)).setText(Intrinsics.stringPlus("result：success！！！！！   ", configParsCom.getFileName()));
        } else {
            ((TextView) configTestActivity._$_findCachedViewById(R$id.tv_result)).setText(Intrinsics.stringPlus("result：faile ！！！！", configParsCom.getFileName()));
        }
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26808subscribeObservable$lambda1(ConfigTestActivity configTestActivity, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configTestActivity, "this$0");
        configTestActivity.hideLoading();
        configTestActivity.mConfigMac = (String) configParsCom.getCmdArr().get(1).get(4);
        ((TextView) configTestActivity._$_findCachedViewById(R$id.tv_mac_result)).setText(Intrinsics.stringPlus("mac：", configTestActivity.mConfigMac));
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
        return R$layout.activity_config_test;
    }

    @NotNull
    public final String getMConfigMac() {
        return this.mConfigMac;
    }

    @NotNull
    public Class<ConfigViewModel> initViewModelClz() {
        return ConfigViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.config_cfgpars);
        Intrinsics.checkNotNullExpressionValue(button, "config_cfgpars");
        JuConnectExtKt.singleClickListener(button, new ConfigTestActivity$setListeners$1(this));
        Button button2 = (Button) _$_findCachedViewById(R$id.config_pair_network);
        Intrinsics.checkNotNullExpressionValue(button2, "config_pair_network");
        JuConnectExtKt.singleClickListener(button2, new ConfigTestActivity$setListeners$2(this));
    }

    public final void setMConfigMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mConfigMac = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((ConfigViewModel) getMViewModel()).getCfgParsLiveData().observe(this, new C7187f2(this));
        ((ConfigViewModel) getMViewModel()).getMacLiveData().observe(this, new C7230q1(this));
    }
}
