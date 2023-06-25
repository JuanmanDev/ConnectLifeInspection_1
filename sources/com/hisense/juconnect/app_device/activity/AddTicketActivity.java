package com.hisense.juconnect.app_device.activity;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.R$color;
import com.hisense.juconnect.app_device.R$drawable;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.fragment.TicketDialog;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import com.juconnect.connectlife.model.ClaimError;
import com.juconnect.connectlife.model.TicketRequestBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7503k0;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0014J\b\u0010#\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0012H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/AddTicketActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "Lcom/hisense/juconnect/app_device/fragment/TicketDialog$TicketResult;", "()V", "accountViewModel", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "getAccountViewModel", "()Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "accountViewModel$delegate", "Lkotlin/Lazy;", "auid", "", "currentItem", "", "deviceId", "devicelist", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "getDevicelist", "()Ljava/util/List;", "event", "addTickets", "", "title", "description", "bindLayout", "getUserProfileInfo", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setApplianceShow", "setCurrentItem", "setEditNoInputShow", "setListeners", "subscribeObservable", "ticketResult", "deviceInfo", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/AddTicketActivity")
/* compiled from: AddTicketActivity.kt */
public final class AddTicketActivity extends BaseVmActivity<BaseViewModel> implements TicketDialog.TicketResult {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy accountViewModel$delegate = LazyKt__LazyJVMKt.lazy(new AddTicketActivity$accountViewModel$2(this));
    public String auid;
    public int currentItem;
    @NotNull
    @Autowired(name = "deviceId")
    @JvmField
    public String deviceId = "";
    @NotNull
    public final List<DeviceInfo> devicelist = DeviceCache.Companion.getInstance().getDeviceList();
    @NotNull
    @Autowired(name = "event")
    @JvmField
    public String event = "";

    private final void addTickets(String str, String str2) {
        TicketRequestBean ticketRequestBean = new TicketRequestBean(this.deviceId, String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new Date())), new ClaimError(str, str2, "0", "asfdasdf"), String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new Date())), (Boolean) null, (String) null, 48, (DefaultConstructorMarker) null);
        String.valueOf(ticketRequestBean);
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().addTicket(ticketRequestBean, new AddTicketActivity$addTickets$1(this), new AddTicketActivity$addTickets$2(this));
    }

    private final AccountViewModel getAccountViewModel() {
        return (AccountViewModel) this.accountViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void getUserProfileInfo() {
        showLoading();
        getAccountViewModel().getUserProfile(false);
    }

    private final void setApplianceShow() {
        if (!this.devicelist.isEmpty()) {
            DeviceInfo deviceInfo = (DeviceInfo) CollectionsKt___CollectionsKt.first(this.devicelist);
            ((TextView) _$_findCachedViewById(R$id.ticket_device_name)).setText(deviceInfo.getDeviceNickName());
            this.auid = deviceInfo.getDeviceId();
        }
    }

    private final void setCurrentItem() {
        List<DeviceInfo> list = this.devicelist;
        if (list != null) {
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DeviceInfo deviceInfo = (DeviceInfo) next;
                String str = this.auid;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(KeyConst.KEY_AUIT);
                    str = null;
                }
                if (Intrinsics.areEqual((Object) str, (Object) deviceInfo.getDeviceId())) {
                    this.currentItem = i;
                }
                i = i2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setEditNoInputShow() {
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.description_image);
        Intrinsics.checkNotNullExpressionValue(imageView, "description_image");
        Editable text = ((EditText) _$_findCachedViewById(R$id.ticket_body)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "ticket_body.text");
        imageView.setVisibility(text.length() == 0 ? 0 : 8);
        CharSequence text2 = ((TextView) _$_findCachedViewById(R$id.ticket_device_name)).getText();
        Intrinsics.checkNotNullExpressionValue(text2, "ticket_device_name.text");
        if (text2.length() > 0) {
            Editable text3 = ((EditText) _$_findCachedViewById(R$id.ticket_title)).getText();
            Intrinsics.checkNotNullExpressionValue(text3, "ticket_title.text");
            if (text3.length() > 0) {
                Editable text4 = ((EditText) _$_findCachedViewById(R$id.ticket_body)).getText();
                Intrinsics.checkNotNullExpressionValue(text4, "ticket_body.text");
                if (text4.length() > 0) {
                    ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setBackgroundResource(R$drawable.button_next_select_bg);
                    ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setTextColor(getResources().getColor(R$color.colorWhite));
                    ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setEnabled(true);
                    return;
                }
            }
        }
        ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setBackgroundResource(R$drawable.button_next_unselect_bg);
        ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setTextColor(getResources().getColor(R$color.colorText_86));
        ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setEnabled(false);
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m27094subscribeObservable$lambda6(AddTicketActivity addTicketActivity, Pair pair) {
        String userProfile;
        List<UpAddress> addresses;
        Intrinsics.checkNotNullParameter(addTicketActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            addTicketActivity.hideLoading();
            String string = addTicketActivity.getString(R$string.post_ticket_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.post_ticket_error)");
            addTicketActivity.showString(string);
        } else if (pair.getSecond() == null) {
            addTicketActivity.hideLoading();
            String string2 = addTicketActivity.getString(R$string.post_ticket_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.post_ticket_error)");
            addTicketActivity.showString(string2);
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
                            addTicketActivity.hideLoading();
                            Postcard a = C1337a.m211c().mo15011a(Paths.Account.UserProfileActivity);
                            UserProfile userProfile6 = (UserProfile) pair.getSecond();
                            a.withString("photoUrl", userProfile6 == null ? null : userProfile6.getPhotoUrl());
                            UserProfile userProfile7 = (UserProfile) pair.getSecond();
                            a.withString("firstName", userProfile7 == null ? null : userProfile7.getFirstName());
                            UserProfile userProfile8 = (UserProfile) pair.getSecond();
                            if (userProfile8 != null) {
                                str = userProfile8.getLastName();
                            }
                            a.withString("lastName", str);
                            a.withBoolean("isShowAddressRequiredInputSign", true);
                            a.navigation();
                            return;
                        }
                        addTicketActivity.addTickets(((EditText) addTicketActivity._$_findCachedViewById(R$id.ticket_title)).getText().toString(), ((EditText) addTicketActivity._$_findCachedViewById(R$id.ticket_body)).getText().toString());
                        return;
                    }
                }
            }
            addTicketActivity.hideLoading();
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            UserProfile userProfile9 = (UserProfile) pair.getSecond();
            String str2 = "";
            if (!(userProfile9 == null || (userProfile = userProfile9.toString()) == null)) {
                str2 = userProfile;
            }
            companion.mo39140i(str2);
            Postcard a2 = C1337a.m211c().mo15011a(Paths.Account.UserProfileActivity);
            UserProfile userProfile10 = (UserProfile) pair.getSecond();
            a2.withString("photoUrl", userProfile10 == null ? null : userProfile10.getPhotoUrl());
            UserProfile userProfile11 = (UserProfile) pair.getSecond();
            a2.withString("firstName", userProfile11 == null ? null : userProfile11.getFirstName());
            UserProfile userProfile12 = (UserProfile) pair.getSecond();
            if (userProfile12 != null) {
                str = userProfile12.getLastName();
            }
            a2.withString("lastName", str);
            a2.withBoolean("isShowAddressRequiredInputSign", true);
            a2.navigation();
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
        return R$layout.activity_add_ticket;
    }

    @NotNull
    public final List<DeviceInfo> getDevicelist() {
        return this.devicelist;
    }

    @NotNull
    public Class<BaseViewModel> initViewModelClz() {
        return BaseViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.add_new_ticket));
        if (this.event.length() > 0) {
            ((EditText) _$_findCachedViewById(R$id.ticket_body)).setText(this.event);
        }
        setEditNoInputShow();
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new AddTicketActivity$setListeners$1(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.selected_parent);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "selected_parent");
        JuConnectExtKt.singleClickListener(linearLayout, new AddTicketActivity$setListeners$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.add_ticket_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "add_ticket_cancel");
        JuConnectExtKt.singleClickListener(textView, new AddTicketActivity$setListeners$3(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.add_ticket_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "add_ticket_confirm");
        JuConnectExtKt.singleClickListener(textView2, new AddTicketActivity$setListeners$4(this));
        ((EditText) _$_findCachedViewById(R$id.ticket_title)).addTextChangedListener(new AddTicketActivity$setListeners$5(this));
        ((EditText) _$_findCachedViewById(R$id.ticket_body)).addTextChangedListener(new AddTicketActivity$setListeners$6(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        getAccountViewModel().getQueryUpLiveData().observe(this, new C7503k0(this));
    }

    public void ticketResult(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        ((TextView) _$_findCachedViewById(R$id.ticket_device_name)).setText(deviceInfo.getDeviceNickName());
        this.auid = deviceInfo.getDeviceId();
        this.deviceId = deviceInfo.getDeviceId();
        setCurrentItem();
    }
}
