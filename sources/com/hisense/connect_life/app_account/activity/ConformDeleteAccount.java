package com.hisense.connect_life.app_account.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.third_account.util.RefreshTokenUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p432b.C7169b0;
import p040c.p429r.p430a.p431a.p432b.C7202j1;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/ConformDeleteAccount;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "domain", "", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "emailStr", "getEmailStr", "setEmailStr", "bindLayout", "", "initData", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setListeners", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/ConformDeleteAccount")
/* compiled from: ConformDeleteAccount.kt */
public final class ConformDeleteAccount extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "domain")
    public String domain;
    @Autowired(name = "email")
    public String emailStr;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(ConformDeleteAccount conformDeleteAccount) {
        return (AccountViewModel) conformDeleteAccount.getMViewModel();
    }

    /* renamed from: initData$lambda-0  reason: not valid java name */
    public static final void m26809initData$lambda0(ConformDeleteAccount conformDeleteAccount, Pair pair) {
        Intrinsics.checkNotNullParameter(conformDeleteAccount, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            FirebaseAnalytics.getInstance(conformDeleteAccount).mo37291a("custom_account_delete", new Bundle());
            AppConfig.Companion.setFcmToken("");
            HiSmart.Companion.getInstance().updateToken("");
            AppConfig.Companion.setAnonymousLoginToken("");
            Intrinsics.stringPlus("DeleteAccount:", SPManagerKt.getCustomerId());
            conformDeleteAccount.showString(R$string.delete_account_success_hint);
            RefreshTokenUtils.Companion.getInstance().stopTimer();
            EventBus.getDefault().post(KeyConst.DeleteAccount);
            conformDeleteAccount.finish();
        } else if (((Number) pair.getSecond()).intValue() == -1) {
            conformDeleteAccount.showString(R$string.network_lost);
        } else {
            conformDeleteAccount.showString(R$string.delete_account_fail);
        }
    }

    /* renamed from: initData$lambda-1  reason: not valid java name */
    public static final void m26810initData$lambda1(ConformDeleteAccount conformDeleteAccount, String str) {
        Intrinsics.checkNotNullParameter(conformDeleteAccount, "this$0");
        if (str != null) {
            if (str.length() > 0) {
                try {
                    String.valueOf(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    Uri parse = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(it)");
                    intent.setData(parse);
                    conformDeleteAccount.startActivity(Intent.createChooser(intent, "please select browser"));
                } catch (Exception e) {
                    String.valueOf(e.getMessage());
                }
            }
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
        return R$layout.activity_conform_delete_account;
    }

    @NotNull
    public final String getDomain() {
        String str = this.domain;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("domain");
        return null;
    }

    @NotNull
    public final String getEmailStr() {
        String str = this.emailStr;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emailStr");
        return null;
    }

    public void initData() {
        super.initData();
        ((AccountViewModel) getMViewModel()).getDeleteAccountLiveData().observe(this, new C7169b0(this));
        ((AccountViewModel) getMViewModel()).getUserDataLiveData().observe(this, new C7202j1(this));
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public final void setEmailStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.emailStr = str;
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_back);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_back");
        JuConnectExtKt.singleClickListener(textView, new ConformDeleteAccount$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_delete_cancel);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_delete_cancel");
        JuConnectExtKt.singleClickListener(textView2, new ConformDeleteAccount$setListeners$2(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.tv_delete_sure);
        Intrinsics.checkNotNullExpressionValue(textView3, "tv_delete_sure");
        JuConnectExtKt.singleClickListener(textView3, new ConformDeleteAccount$setListeners$3(this));
        TextView textView4 = (TextView) _$_findCachedViewById(R$id.tv_delete_download);
        Intrinsics.checkNotNullExpressionValue(textView4, "tv_delete_download");
        JuConnectExtKt.singleClickListener(textView4, new ConformDeleteAccount$setListeners$4(this));
    }
}
