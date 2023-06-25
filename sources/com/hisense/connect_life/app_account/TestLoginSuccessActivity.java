package com.hisense.connect_life.app_account;

import android.view.View;
import android.widget.Button;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.C7162a;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\r"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/TestLoginSuccessActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "logoutSuccessGoto", "setListeners", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TestLoginSuccessActivity.kt */
public final class TestLoginSuccessActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public static final /* synthetic */ AccountViewModel access$getMViewModel(TestLoginSuccessActivity testLoginSuccessActivity) {
        return (AccountViewModel) testLoginSuccessActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final void logoutSuccessGoto() {
        int i;
        boolean z = false;
        try {
            ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
            i = (all == null ? null : Integer.valueOf(all.size())).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i == 0) {
            z = true;
        }
        if (z) {
            JuConnectExtKt.navigation(Paths.Account.LoginFirstActivity);
        } else if (!z) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginEmailActivity);
            a.withInt("userNum", i);
            a.navigation();
        }
    }

    /* renamed from: subscribeObservable$lambda-0  reason: not valid java name */
    public static final void m26801subscribeObservable$lambda0(TestLoginSuccessActivity testLoginSuccessActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(testLoginSuccessActivity, "this$0");
        testLoginSuccessActivity.hideLoading();
        Job unused = BuildersKt__Builders_commonKt.launch$default(testLoginSuccessActivity, Dispatchers.getIO(), (CoroutineStart) null, new TestLoginSuccessActivity$subscribeObservable$1$1(testLoginSuccessActivity, (Continuation<? super TestLoginSuccessActivity$subscribeObservable$1$1>) null), 2, (Object) null);
        ThirdLoginForGoogleUtils.Companion.signOut(testLoginSuccessActivity);
        testLoginSuccessActivity.finish();
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
        return R$layout.activity_login_success;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
    }

    public void setListeners() {
        Button button = (Button) _$_findCachedViewById(R$id.buttonPanel);
        Intrinsics.checkNotNullExpressionValue(button, "buttonPanel");
        JuConnectExtKt.singleClickListener(button, TestLoginSuccessActivity$setListeners$1.INSTANCE);
        Button button2 = (Button) _$_findCachedViewById(R$id.buttonPane2);
        Intrinsics.checkNotNullExpressionValue(button2, "buttonPane2");
        JuConnectExtKt.singleClickListener(button2, new TestLoginSuccessActivity$setListeners$2(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getSignOutLiveData().observe(this, new C7162a(this));
    }
}
