package com.hisense.juconnect.app_device.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p462a.C7504l;

@Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u001fH\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016J\b\u0010'\u001a\u00020\u001fH\u0014J\b\u0010(\u001a\u00020\u001fH\u0014J\b\u0010)\u001a\u00020\u001fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u0012\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ReportTicketActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "accountViewModel", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "getAccountViewModel", "()Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "accountViewModel$delegate", "Lkotlin/Lazy;", "auid", "", "deviceId", "event", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "formatId", "getFormatId", "setFormatId", "msgId", "getMsgId", "setMsgId", "msgLevel", "getMsgLevel", "setMsgLevel", "noid", "", "time", "addTickets", "", "title", "description", "bindLayout", "", "getUserProfileInfo", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ReportTicketActivity")
/* compiled from: ReportTicketActivity.kt */
public final class ReportTicketActivity extends BaseVmActivity<BaseViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy accountViewModel$delegate = LazyKt__LazyJVMKt.lazy(new ReportTicketActivity$accountViewModel$2(this));
    @NotNull
    @Autowired(name = "auid")
    @JvmField
    public String auid = "";
    @NotNull
    @Autowired(name = "deviceId")
    @JvmField
    public String deviceId = "";
    @Autowired(name = "event")
    public String event;
    @Autowired(name = "formatId")
    public String formatId;
    @Autowired(name = "msgId")
    public String msgId;
    @Autowired(name = "msgLevel")
    public String msgLevel;
    @Autowired(name = "noid")
    @JvmField
    public long noid;
    @Autowired(name = "time")
    @JvmField
    public long time;

    private final void addTickets(String str, String str2) {
        TicketRequestBean ticketRequestBean = new TicketRequestBean(this.auid, String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new Date())), new ClaimError(str, str2, "0", "asfdasdf"), String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new Date())), (Boolean) null, (String) null, 48, (DefaultConstructorMarker) null);
        String.valueOf(ticketRequestBean);
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().addTicket(ticketRequestBean, new ReportTicketActivity$addTickets$1(this), new ReportTicketActivity$addTickets$2(this));
    }

    private final AccountViewModel getAccountViewModel() {
        return (AccountViewModel) this.accountViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void getUserProfileInfo() {
        showLoading();
        getAccountViewModel().getUserProfile(false);
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m27124subscribeObservable$lambda3(ReportTicketActivity reportTicketActivity, Pair pair) {
        String userProfile;
        List<UpAddress> addresses;
        Intrinsics.checkNotNullParameter(reportTicketActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            reportTicketActivity.hideLoading();
            String string = reportTicketActivity.getString(R$string.post_ticket_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.post_ticket_error)");
            reportTicketActivity.showString(string);
        } else if (pair.getSecond() == null) {
            reportTicketActivity.hideLoading();
            String string2 = reportTicketActivity.getString(R$string.post_ticket_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.post_ticket_error)");
            reportTicketActivity.showString(string2);
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
                            reportTicketActivity.hideLoading();
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
                        reportTicketActivity.addTickets(reportTicketActivity.deviceId, reportTicketActivity.getEvent());
                        return;
                    }
                }
            }
            reportTicketActivity.hideLoading();
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
        return R$layout.activity_report_ticket;
    }

    @NotNull
    public final String getEvent() {
        String str = this.event;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_EVENT);
        return null;
    }

    @NotNull
    public final String getFormatId() {
        String str = this.formatId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatId");
        return null;
    }

    @NotNull
    public final String getMsgId() {
        String str = this.msgId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("msgId");
        return null;
    }

    @NotNull
    public final String getMsgLevel() {
        String str = this.msgLevel;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("msgLevel");
        return null;
    }

    @NotNull
    public Class<BaseViewModel> initViewModelClz() {
        return BaseViewModel.class;
    }

    public void initWidgets() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_title);
        Intrinsics.checkNotNullExpressionValue(textView, "top_title");
        textView.setVisibility(8);
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_close));
        ((TextView) _$_findCachedViewById(R$id.time_text)).setText(new SimpleDateFormat("dd/MM/yyyy,HH:mm").format(new Date(this.time)));
        if (DeviceCache.Companion.getInstance().getDevice(this.deviceId) == null) {
            ((TextView) _$_findCachedViewById(R$id.appliance_text)).setText(this.deviceId);
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(R$id.appliance_text);
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(this.deviceId);
            textView2.setText(device == null ? null : device.getDeviceNickName());
        }
        ((TextView) _$_findCachedViewById(R$id.event_text)).setText(getEvent());
        if (!Intrinsics.areEqual((Object) "7", (Object) getFormatId()) || !Intrinsics.areEqual((Object) "1", (Object) getMsgLevel())) {
            ((TextView) _$_findCachedViewById(R$id.report_ticket)).setVisibility(8);
        } else {
            ((TextView) _$_findCachedViewById(R$id.report_ticket)).setVisibility(0);
        }
    }

    public final void setEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event = str;
    }

    public final void setFormatId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formatId = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ReportTicketActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.delete);
        Intrinsics.checkNotNullExpressionValue(textView, "delete");
        JuConnectExtKt.singleClickListener(textView, new ReportTicketActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.report_ticket);
        Intrinsics.checkNotNullExpressionValue(textView2, "report_ticket");
        JuConnectExtKt.singleClickListener(textView2, new ReportTicketActivity$setListeners$3(this));
    }

    public final void setMsgId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msgId = str;
    }

    public final void setMsgLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msgLevel = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        getAccountViewModel().getQueryUpLiveData().observe(this, new C7504l(this));
    }
}
