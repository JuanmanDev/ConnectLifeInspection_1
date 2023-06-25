package com.hisense.juconnect.app_device.activity;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.fragment.AddTicketDialog;
import com.hisense.juconnect.app_device.fragment.ClosedTicketsFragment;
import com.hisense.juconnect.app_device.fragment.OpenedTicketsFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7483a1;
import p040c.p429r.p460b.p461a.p462a.C7484b;
import p040c.p429r.p460b.p461a.p462a.C7513p0;

@Metadata(mo47990d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\"\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0015H\u0014J \u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ServiceActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "accountViewModel", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "getAccountViewModel", "()Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "accountViewModel$delegate", "Lkotlin/Lazy;", "closedTicketsFragment", "Lcom/hisense/juconnect/app_device/fragment/ClosedTicketsFragment;", "currentFragment", "Landroidx/fragment/app/Fragment;", "dialog", "Lcom/hisense/juconnect/app_device/fragment/AddTicketDialog;", "openedTicketsFragment", "Lcom/hisense/juconnect/app_device/fragment/OpenedTicketsFragment;", "bindLayout", "", "getTickets", "", "getUserProfileInfo", "gotoAddTicket", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setListeners", "showDialog", "photoUrl", "", "firstName", "lastName", "subscribeObservable", "switchFragment", "fragment", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ServiceActivity")
/* compiled from: ServiceActivity.kt */
public final class ServiceActivity extends BaseVmActivity<BaseViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy accountViewModel$delegate = LazyKt__LazyJVMKt.lazy(new ServiceActivity$accountViewModel$2(this));
    @NotNull
    public ClosedTicketsFragment closedTicketsFragment = new ClosedTicketsFragment();
    @Nullable
    public Fragment currentFragment;
    @NotNull
    public final AddTicketDialog dialog = new AddTicketDialog();
    @NotNull
    public OpenedTicketsFragment openedTicketsFragment = new OpenedTicketsFragment();

    private final AccountViewModel getAccountViewModel() {
        return (AccountViewModel) this.accountViewModel$delegate.getValue();
    }

    private final void getTickets() {
        Fragment fragment = this.currentFragment;
        Intrinsics.checkNotNull(fragment);
        if (fragment.isAdded()) {
            Fragment fragment2 = this.currentFragment;
            if (Intrinsics.areEqual((Object) fragment2, (Object) this.openedTicketsFragment)) {
                this.openedTicketsFragment.getTickets(false);
            } else if (Intrinsics.areEqual((Object) fragment2, (Object) this.closedTicketsFragment)) {
                this.closedTicketsFragment.getTickets(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getUserProfileInfo() {
        showLoading();
        getAccountViewModel().getUserProfile(false);
    }

    private final void gotoAddTicket() {
        if (DeviceCache.Companion.getInstance().getDeviceList().size() > 0) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Device.AddTicketActivity);
            a.withString("deviceId", DeviceCache.Companion.getInstance().getDeviceList().get(0).getDeviceId()).withString(NotificationCompat.CATEGORY_EVENT, "");
            a.navigation((Activity) this, 2);
        }
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27125setListeners$lambda0(ServiceActivity serviceActivity, View view) {
        Intrinsics.checkNotNullParameter(serviceActivity, "this$0");
        serviceActivity.currentFragment = serviceActivity.openedTicketsFragment;
        serviceActivity.getSupportFragmentManager().beginTransaction().hide(serviceActivity.closedTicketsFragment).show(serviceActivity.openedTicketsFragment).commit();
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27126setListeners$lambda1(ServiceActivity serviceActivity, View view) {
        Intrinsics.checkNotNullParameter(serviceActivity, "this$0");
        ClosedTicketsFragment closedTicketsFragment2 = serviceActivity.closedTicketsFragment;
        serviceActivity.currentFragment = closedTicketsFragment2;
        if (!closedTicketsFragment2.isAdded()) {
            serviceActivity.getSupportFragmentManager().beginTransaction().add(R$id.service_fl, (Fragment) serviceActivity.closedTicketsFragment).commit();
        }
        serviceActivity.getSupportFragmentManager().beginTransaction().hide(serviceActivity.openedTicketsFragment).show(serviceActivity.closedTicketsFragment).commit();
    }

    private final void showDialog(String str, String str2, String str3) {
        AddTicketDialog addTicketDialog = this.dialog;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "this.supportFragmentManager");
        JuConnectExtKt.displayDialog(addTicketDialog, supportFragmentManager);
        this.dialog.setMessage(str, str2, str3);
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m27127subscribeObservable$lambda6(ServiceActivity serviceActivity, Pair pair) {
        String userProfile;
        List<UpAddress> addresses;
        Intrinsics.checkNotNullParameter(serviceActivity, "this$0");
        serviceActivity.hideLoading();
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            serviceActivity.hideLoading();
            String string = serviceActivity.getString(R$string.post_ticket_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.post_ticket_error)");
            serviceActivity.showString(string);
        } else if (pair.getSecond() == null) {
            serviceActivity.hideLoading();
            String string2 = serviceActivity.getString(R$string.post_ticket_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.post_ticket_error)");
            serviceActivity.showString(string2);
        } else {
            UserProfile userProfile2 = (UserProfile) pair.getSecond();
            String str = null;
            if ((userProfile2 == null ? null : userProfile2.getAddresses()) != null) {
                UserProfile userProfile3 = (UserProfile) pair.getSecond();
                List<UpAddress> addresses2 = userProfile3 == null ? null : userProfile3.getAddresses();
                Intrinsics.checkNotNull(addresses2);
                if (!addresses2.isEmpty()) {
                    UserProfile userProfile4 = (UserProfile) pair.getSecond();
                    List<UpPhone> phoneNumbers = userProfile4 == null ? null : userProfile4.getPhoneNumbers();
                    if (!(phoneNumbers == null || phoneNumbers.isEmpty())) {
                        UserProfile userProfile5 = (UserProfile) pair.getSecond();
                        UpAddress upAddress = (userProfile5 == null || (addresses = userProfile5.getAddresses()) == null) ? null : (UpAddress) CollectionsKt___CollectionsKt.first(addresses);
                        Intrinsics.checkNotNull(upAddress);
                        if (TextUtils.isEmpty(upAddress.getStreet()) || TextUtils.isEmpty(upAddress.getHouseNumber()) || TextUtils.isEmpty(upAddress.getPostalCode()) || TextUtils.isEmpty(upAddress.getCity())) {
                            serviceActivity.hideLoading();
                            UserProfile userProfile6 = (UserProfile) pair.getSecond();
                            String valueOf = String.valueOf(userProfile6 == null ? null : userProfile6.getPhotoUrl());
                            UserProfile userProfile7 = (UserProfile) pair.getSecond();
                            String valueOf2 = String.valueOf(userProfile7 == null ? null : userProfile7.getFirstName());
                            UserProfile userProfile8 = (UserProfile) pair.getSecond();
                            if (userProfile8 != null) {
                                str = userProfile8.getLastName();
                            }
                            serviceActivity.showDialog(valueOf, valueOf2, String.valueOf(str));
                            return;
                        }
                        serviceActivity.gotoAddTicket();
                        return;
                    }
                }
            }
            serviceActivity.hideLoading();
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            UserProfile userProfile9 = (UserProfile) pair.getSecond();
            String str2 = "";
            if (!(userProfile9 == null || (userProfile = userProfile9.toString()) == null)) {
                str2 = userProfile;
            }
            companion.mo39140i(str2);
            Postcard a = C1337a.m211c().mo15011a(Paths.Account.UserProfileActivity);
            UserProfile userProfile10 = (UserProfile) pair.getSecond();
            a.withString("photoUrl", userProfile10 == null ? null : userProfile10.getPhotoUrl());
            UserProfile userProfile11 = (UserProfile) pair.getSecond();
            a.withString("firstName", userProfile11 == null ? null : userProfile11.getFirstName());
            UserProfile userProfile12 = (UserProfile) pair.getSecond();
            if (userProfile12 != null) {
                str = userProfile12.getLastName();
            }
            a.withString("lastName", str);
            a.withBoolean("isShowAddressRequiredInputSign", true);
            a.navigation();
        }
    }

    private final void switchFragment(Fragment fragment) {
        if (this.currentFragment != fragment) {
            if (!fragment.isAdded()) {
                Fragment fragment2 = this.currentFragment;
                if (fragment2 != null) {
                    getSupportFragmentManager().beginTransaction().hide(fragment2).add(R$id.service_fl, fragment).commit();
                }
            } else {
                Fragment fragment3 = this.currentFragment;
                if (fragment3 != null) {
                    getSupportFragmentManager().beginTransaction().hide(fragment3).show(fragment).commit();
                }
            }
            this.currentFragment = fragment;
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
        return R$layout.activity_service;
    }

    @NotNull
    public Class<BaseViewModel> initViewModelClz() {
        return BaseViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.support_tickets));
        ((IconFontView) _$_findCachedViewById(R$id.top_ic)).setText(getString(R$string.btn_main_add));
        ((RadioButton) _$_findCachedViewById(R$id.opened_tickets)).setChecked(true);
        getSupportFragmentManager().beginTransaction().add(R$id.service_fl, (Fragment) this.openedTicketsFragment).commit();
        this.currentFragment = this.openedTicketsFragment;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            getTickets();
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ServiceActivity$setListeners$1(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.top_ic);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "top_ic");
        JuConnectExtKt.singleClickListener(iconFontView2, new ServiceActivity$setListeners$2(this));
        ((RadioButton) _$_findCachedViewById(R$id.opened_tickets)).setOnClickListener(new C7484b(this));
        ((RadioButton) _$_findCachedViewById(R$id.closed_tickets)).setOnClickListener(new C7483a1(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        getAccountViewModel().getQueryUpLiveData().observe(this, new C7513p0(this));
    }
}
