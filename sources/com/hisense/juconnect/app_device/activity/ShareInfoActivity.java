package com.hisense.juconnect.app_device.activity;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.model.ShareDeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.UserInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.UserShareResult;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.fragment.ShareDialog;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import com.hisensehitachi.oversea.himit2.home.adapter.ShareInfoAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p429r.p460b.p461a.p462a.C7486c;
import p040c.p429r.p460b.p461a.p462a.C7489d0;
import p040c.p429r.p460b.p461a.p462a.C7496h;
import p040c.p429r.p460b.p461a.p462a.C7511o0;
import p040c.p429r.p460b.p461a.p462a.C7523u0;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0014J\b\u0010$\u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006%"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ShareInfoActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "deviceid", "", "getDeviceid", "()Ljava/lang/String;", "setDeviceid", "(Ljava/lang/String;)V", "dialog", "Lcom/hisense/juconnect/app_device/fragment/ShareDialog;", "mShareInfoAdapter", "Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter;", "getMShareInfoAdapter", "()Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter;", "mShareInfoAdapter$delegate", "Lkotlin/Lazy;", "shareList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserInfo;", "Lkotlin/collections/ArrayList;", "wifiId", "getWifiId", "setWifiId", "bindLayout", "", "checkEmailFormat", "", "userBox", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "notifyShareList", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ShareInfoActivity")
/* compiled from: ShareInfoActivity.kt */
public final class ShareInfoActivity extends BaseVmActivity<DeviceViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "deviceId")
    public String deviceid;
    @NotNull
    public final ShareDialog dialog = new ShareDialog();
    @NotNull
    public final Lazy mShareInfoAdapter$delegate = LazyKt__LazyJVMKt.lazy(new ShareInfoActivity$mShareInfoAdapter$2(this));
    @NotNull
    public ArrayList<UserInfo> shareList = new ArrayList<>();
    @Autowired(name = "wifiId")
    public String wifiId;

    public static final /* synthetic */ DeviceViewModel access$getMViewModel(ShareInfoActivity shareInfoActivity) {
        return (DeviceViewModel) shareInfoActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final boolean checkEmailFormat(String str) {
        return (str.length() > 0) && C1519p.m1017a(str);
    }

    private final ShareInfoAdapter getMShareInfoAdapter() {
        return (ShareInfoAdapter) this.mShareInfoAdapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void notifyShareList() {
        if (!this.shareList.isEmpty()) {
            Intrinsics.stringPlus("添加后的", this.shareList);
            ((LinearLayoutCompat) _$_findCachedViewById(R$id.empty_view)).setVisibility(8);
            ((RecyclerView) _$_findCachedViewById(R$id.user_share_list)).setVisibility(0);
            getMShareInfoAdapter().notifyDataSetChanged();
            return;
        }
        ((LinearLayoutCompat) _$_findCachedViewById(R$id.empty_view)).setVisibility(0);
        ((RecyclerView) _$_findCachedViewById(R$id.user_share_list)).setVisibility(8);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27128setListeners$lambda0(ShareInfoActivity shareInfoActivity, View view) {
        Intrinsics.checkNotNullParameter(shareInfoActivity, "this$0");
        shareInfoActivity.finish();
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27129setListeners$lambda1(ShareInfoActivity shareInfoActivity, View view) {
        Intrinsics.checkNotNullParameter(shareInfoActivity, "this$0");
        ShareDialog shareDialog = shareInfoActivity.dialog;
        FragmentManager supportFragmentManager = shareInfoActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "this.supportFragmentManager");
        JuConnectExtKt.displayDialog(shareDialog, supportFragmentManager);
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m27130subscribeObservable$lambda2(ShareInfoActivity shareInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(shareInfoActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            shareInfoActivity.dialog.dismiss();
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m27131subscribeObservable$lambda4(ShareInfoActivity shareInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(shareInfoActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            Intrinsics.stringPlus("添加前的", shareInfoActivity.shareList);
            for (ShareDeviceInfo shareDeviceInfo : ((UserShareResult) pair.getSecond()).getShareDeviceList()) {
                shareInfoActivity.shareList.clear();
                if (Intrinsics.areEqual((Object) shareDeviceInfo.getWifiId(), (Object) shareInfoActivity.getWifiId()) && Intrinsics.areEqual((Object) shareDeviceInfo.getDeviceId(), (Object) shareInfoActivity.getDeviceid())) {
                    shareInfoActivity.shareList.addAll(shareDeviceInfo.getUserList());
                }
            }
            shareInfoActivity.notifyShareList();
        }
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m27132subscribeObservable$lambda5(ShareInfoActivity shareInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(shareInfoActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            shareInfoActivity.notifyShareList();
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
        return R$layout.activity_share_info;
    }

    @NotNull
    public final String getDeviceid() {
        String str = this.deviceid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceid");
        return null;
    }

    @NotNull
    public final String getWifiId() {
        String str = this.wifiId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.WIFIID);
        return null;
    }

    @NotNull
    public Class<DeviceViewModel> initViewModelClz() {
        return DeviceViewModel.class;
    }

    public void initWidgets() {
        ((DeviceViewModel) getMViewModel()).getShareList();
        ((RecyclerView) _$_findCachedViewById(R$id.user_share_list)).setAdapter(getMShareInfoAdapter());
        ((RecyclerView) _$_findCachedViewById(R$id.user_share_list)).setLayoutManager(new LinearLayoutManager(this));
        getMShareInfoAdapter().setDeleteCallback(new ShareInfoActivity$initWidgets$1(this));
    }

    public final void setDeviceid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceid = str;
    }

    public void setListeners() {
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setOnClickListener(new C7489d0(this));
        ((IconFontView) _$_findCachedViewById(R$id.top_add)).setOnClickListener(new C7511o0(this));
        this.dialog.setOnSendCallback(new ShareInfoActivity$setListeners$3(this));
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((DeviceViewModel) getMViewModel()).getShareDeviceLiveData().observe(this, new C7486c(this));
        ((DeviceViewModel) getMViewModel()).getShareDeviceListLiveData().observe(this, new C7496h(this));
        ((DeviceViewModel) getMViewModel()).getCancelShareLiveData().observe(this, new C7523u0(this));
    }
}
