package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.hismart.networks.request.message.JuWebSocket;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
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
import p040c.p429r.p460b.p461a.p464c.C7551q;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/MoreFragment;", "Lcom/hisense/connect_life/core/base/BaseVmFragment;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "firstName", "", "lastName", "photoUrl", "bindLayout", "", "getUserInfo", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "view", "Landroid/view/View;", "logOut", "logoutSuccessGoto", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MoreFragment.kt */
public final class MoreFragment extends BaseVmFragment<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String firstName = "";
    @NotNull
    public String lastName = "";
    @Nullable
    public String photoUrl = "";

    private final void getUserInfo() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new MoreFragment$getUserInfo$1(AccountUtils.Companion.getUserInfo(), this, (Continuation<? super MoreFragment$getUserInfo$1>) null), 2, (Object) null);
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
    public static final void m27157subscribeObservable$lambda0(MoreFragment moreFragment, Boolean bool) {
        Intrinsics.checkNotNullParameter(moreFragment, "this$0");
        JuWebSocket.Companion.cancelWebSocket();
        Job unused = BuildersKt__Builders_commonKt.launch$default(moreFragment, Dispatchers.getIO(), (CoroutineStart) null, new MoreFragment$subscribeObservable$1$1(moreFragment, (Continuation<? super MoreFragment$subscribeObservable$1$1>) null), 2, (Object) null);
        ThirdLoginForGoogleUtils.Companion companion = ThirdLoginForGoogleUtils.Companion;
        FragmentActivity requireActivity = moreFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        companion.signOut(requireActivity);
        FragmentActivity activity = moreFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.fragment_more;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getUserInfo();
    }

    public final void logOut() {
        ((AccountViewModel) getMViewModel()).signOut();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void setListeners() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_appliance_manager);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_appliance_manager");
        JuConnectExtKt.singleClickListener(linearLayout, MoreFragment$setListeners$1.INSTANCE);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_delete);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_delete");
        JuConnectExtKt.singleClickListener(linearLayout2, MoreFragment$setListeners$2.INSTANCE);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_user_profile);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_user_profile");
        JuConnectExtKt.singleClickListener(linearLayout3, new MoreFragment$setListeners$3(this));
        LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(R$id.ll_application_settings);
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "ll_application_settings");
        JuConnectExtKt.singleClickListener(linearLayout4, MoreFragment$setListeners$4.INSTANCE);
        LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(R$id.ll_log_out);
        Intrinsics.checkNotNullExpressionValue(linearLayout5, "ll_log_out");
        JuConnectExtKt.singleClickListener(linearLayout5, new MoreFragment$setListeners$5(this));
        LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(R$id.ll_firmware_update);
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "ll_firmware_update");
        JuConnectExtKt.singleClickListener(linearLayout6, new MoreFragment$setListeners$6(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getSignOutLiveData().observe(this, new C7551q(this));
    }
}
