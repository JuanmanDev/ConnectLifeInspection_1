package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.event.MaiDianEvent;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.viewmodel.DeviceViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7491e0;
import p040c.p429r.p460b.p461a.p462a.C7493f0;
import p040c.p429r.p460b.p461a.p462a.C7494g;
import p040c.p429r.p460b.p461a.p462a.C7500j;
import p040c.p429r.p460b.p461a.p462a.C7507m0;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0014J\b\u0010'\u001a\u00020#H\u0016J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0012\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\f¨\u0006+"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/KeyLockActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/DeviceViewModel;", "()V", "ChildLockNot", "", "ChildLockSet", "deviceAuid", "", "getDeviceAuid", "()Ljava/lang/String;", "setDeviceAuid", "(Ljava/lang/String;)V", "deviceid", "getDeviceid", "setDeviceid", "isKeyLockOn", "isOffline", "isRemote", "isThreeZone", "msgObserverViewModel", "Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "getMsgObserverViewModel", "()Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "msgObserverViewModel$delegate", "Lkotlin/Lazy;", "soundIsOpen", "wifiId", "getWifiId", "setWifiId", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "setKeyLockState", "setKeyLockinitialState", "setListeners", "subscribeObservable", "updateProp", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/keylock")
/* compiled from: KeyLockActivity.kt */
public final class KeyLockActivity extends BaseVmActivity<DeviceViewModel> {
    @Autowired(name = "CHILDLOCKNOT")
    @JvmField
    public boolean ChildLockNot;
    @Autowired(name = "CHILDLOCKSET")
    @JvmField
    public boolean ChildLockSet;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "AUID")
    public String deviceAuid;
    @Autowired(name = "DEVICEID")
    public String deviceid;
    @Autowired(name = "LOCKON")
    @JvmField
    public boolean isKeyLockOn;
    @Autowired(name = "ISOFFLINE")
    @JvmField
    public boolean isOffline = true;
    @Autowired(name = "ISREMOTE")
    @JvmField
    public boolean isRemote = true;
    @Autowired(name = "ISTHREEZONE")
    @JvmField
    public boolean isThreeZone = true;
    @NotNull
    public final Lazy msgObserverViewModel$delegate = LazyKt__LazyJVMKt.lazy(new KeyLockActivity$msgObserverViewModel$2(this));
    @Autowired(name = "SOUNDISOPEN")
    @JvmField
    public boolean soundIsOpen;
    @Autowired(name = "WIFIID")
    public String wifiId;

    private final MsgObserverViewModel getMsgObserverViewModel() {
        return (MsgObserverViewModel) this.msgObserverViewModel$delegate.getValue();
    }

    private final void setKeyLockState() {
        if (!this.ChildLockSet) {
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setChecked(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setEnabled(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setFocusable(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setAlpha(0.3f);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setChecked(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setEnabled(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setFocusable(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setAlpha(0.3f);
        } else if (!((ToggleButton) _$_findCachedViewById(R$id.toggle_key_lock)).isChecked()) {
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setChecked(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setEnabled(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setFocusable(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setAlpha(0.3f);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setChecked(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setEnabled(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setFocusable(false);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setAlpha(0.3f);
        } else {
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setEnabled(true);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setAlpha(1.0f);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setFocusable(true);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setEnabled(true);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setAlpha(1.0f);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setFocusable(true);
        }
    }

    private final void setKeyLockinitialState() {
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_key_lock)).setChecked(this.isKeyLockOn);
        if (!this.isOffline || !this.isRemote) {
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setChecked(this.soundIsOpen);
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setChecked(this.ChildLockNot);
            setKeyLockState();
            return;
        }
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setChecked(false);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setEnabled(false);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setFocusable(false);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setAlpha(0.3f);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setChecked(false);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setEnabled(false);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setFocusable(false);
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setAlpha(0.3f);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27112setListeners$lambda0(KeyLockActivity keyLockActivity, View view) {
        Intrinsics.checkNotNullParameter(keyLockActivity, "this$0");
        keyLockActivity.finish();
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27113setListeners$lambda1(KeyLockActivity keyLockActivity, CompoundButton compoundButton, boolean z) {
        Map map;
        Intrinsics.checkNotNullParameter(keyLockActivity, "this$0");
        if (compoundButton.isPressed() && keyLockActivity.getDeviceid() != null && keyLockActivity.getWifiId() != null) {
            if (keyLockActivity.isOffline) {
                ToastUtils.m9601y(keyLockActivity.getString(R$string.appliance_offline), new Object[0]);
                ((ToggleButton) keyLockActivity._$_findCachedViewById(R$id.toggle_key_lock)).setChecked(!z);
            } else if (!keyLockActivity.isRemote) {
                ToastUtils.m9601y(keyLockActivity.getString(R$string.turn_on_the_remote), new Object[0]);
                ((ToggleButton) keyLockActivity._$_findCachedViewById(R$id.toggle_key_lock)).setChecked(!z);
            } else {
                keyLockActivity.setKeyLockState();
                MapsKt__MapsKt.emptyMap();
                String str = "0";
                if (!keyLockActivity.isThreeZone) {
                    if (z) {
                        str = "1";
                    }
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("KeyLockStatus", str));
                } else {
                    if (!z) {
                        str = "1";
                    }
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("KeyLockStatus", str));
                }
                EventBus.getDefault().post(new MaiDianEvent("", String.valueOf(z)));
                keyLockActivity.showProgressDialog(keyLockActivity, true);
                HiSmart.Companion.getInstance().deviceService().sendCommand(keyLockActivity.getDeviceid(), keyLockActivity.getWifiId(), map, new KeyLockActivity$setListeners$2$1(keyLockActivity, z), new KeyLockActivity$setListeners$2$2(keyLockActivity));
            }
        }
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27114setListeners$lambda2(KeyLockActivity keyLockActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(keyLockActivity, "this$0");
        String str = "0";
        if (!((ToggleButton) keyLockActivity._$_findCachedViewById(R$id.toggle_key_lock)).isChecked()) {
            if (keyLockActivity.getDeviceid() != null && keyLockActivity.getWifiId() != null) {
                MapsKt__MapsKt.emptyMap();
                HiSmart.Companion.getInstance().deviceService().sendCommand(keyLockActivity.getDeviceid(), keyLockActivity.getWifiId(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("ChildLockNotSting", str)), KeyLockActivity$setListeners$3$1.INSTANCE, KeyLockActivity$setListeners$3$2.INSTANCE);
            }
        } else if (compoundButton.isPressed() && keyLockActivity.getDeviceid() != null && keyLockActivity.getWifiId() != null) {
            MapsKt__MapsKt.emptyMap();
            if (z) {
                str = "1";
            }
            HiSmart.Companion.getInstance().deviceService().sendCommand(keyLockActivity.getDeviceid(), keyLockActivity.getWifiId(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("ChildLockNotSting", str)), new KeyLockActivity$setListeners$3$3(keyLockActivity), new KeyLockActivity$setListeners$3$4(keyLockActivity));
        }
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27115setListeners$lambda3(KeyLockActivity keyLockActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(keyLockActivity, "this$0");
        String str = "0";
        if (!((ToggleButton) keyLockActivity._$_findCachedViewById(R$id.toggle_key_lock)).isChecked()) {
            if (keyLockActivity.getDeviceid() != null && keyLockActivity.getWifiId() != null) {
                MapsKt__MapsKt.emptyMap();
                HiSmart.Companion.getInstance().deviceService().sendCommand(keyLockActivity.getDeviceid(), keyLockActivity.getWifiId(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("ChildLockSoundVolume", str)), KeyLockActivity$setListeners$4$1.INSTANCE, KeyLockActivity$setListeners$4$2.INSTANCE);
            }
        } else if (compoundButton.isPressed() && keyLockActivity.getDeviceid() != null && keyLockActivity.getWifiId() != null) {
            MapsKt__MapsKt.emptyMap();
            if (z) {
                str = "100";
            }
            HiSmart.Companion.getInstance().deviceService().sendCommand(keyLockActivity.getDeviceid(), keyLockActivity.getWifiId(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("ChildLockSoundVolume", str)), new KeyLockActivity$setListeners$4$3(keyLockActivity), new KeyLockActivity$setListeners$4$4(keyLockActivity));
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m27116subscribeObservable$lambda4(KeyLockActivity keyLockActivity, DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(keyLockActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(deviceStatusMessage, LanguageConstKt.f15954it);
        keyLockActivity.updateProp(deviceStatusMessage);
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
        return R$layout.activity_key_lock;
    }

    @NotNull
    public final String getDeviceAuid() {
        String str = this.deviceAuid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceAuid");
        return null;
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
        setKeyLockinitialState();
        getMsgObserverViewModel().subscribeMessage();
    }

    public final void setDeviceAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceAuid = str;
    }

    public final void setDeviceid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceid = str;
    }

    public void setListeners() {
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setOnClickListener(new C7491e0(this));
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_key_lock)).setOnCheckedChangeListener(new C7500j(this));
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setOnCheckedChangeListener(new C7493f0(this));
        ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setOnCheckedChangeListener(new C7507m0(this));
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        getMsgObserverViewModel().getStatusMsgLiveData().observe(this, new C7494g(this));
    }

    public final void updateProp(@NotNull DeviceStatusMessage deviceStatusMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
        if (Intrinsics.areEqual((Object) getDeviceAuid(), (Object) deviceStatusMessage.getDeviceid())) {
            this.isOffline = false;
            JsonObject properties = deviceStatusMessage.getProperties();
            if (properties == null || (jsonElement5 = properties.get("RemoteControlMode")) == null || (str = jsonElement5.getAsString()) == null) {
                str = "0";
            }
            this.isRemote = !Intrinsics.areEqual((Object) str, (Object) "0");
            JsonObject properties2 = deviceStatusMessage.getProperties();
            if (properties2 == null || (jsonElement4 = properties2.get("KeyLockStatus")) == null || (str2 = jsonElement4.getAsString()) == null) {
                str2 = "0";
            }
            boolean areEqual = Intrinsics.areEqual((Object) str2, (Object) "0");
            if (!this.isThreeZone) {
                areEqual = !areEqual;
            }
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_key_lock)).setChecked(areEqual);
            JsonObject properties3 = deviceStatusMessage.getProperties();
            if (properties3 == null || (jsonElement3 = properties3.get("ChildLockSoundVolume")) == null || (str3 = jsonElement3.getAsString()) == null) {
                str3 = "0";
            }
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_child_alarm_lock)).setChecked(!Intrinsics.areEqual((Object) str3, (Object) "0"));
            JsonObject properties4 = deviceStatusMessage.getProperties();
            if (properties4 == null || (jsonElement2 = properties4.get("ChildLockNotSting")) == null || (str4 = jsonElement2.getAsString()) == null) {
                str4 = "0";
            }
            ((ToggleButton) _$_findCachedViewById(R$id.toggle_door_lock)).setChecked(!Intrinsics.areEqual((Object) str4, (Object) "0"));
            JsonObject properties5 = deviceStatusMessage.getProperties();
            if (properties5 == null || (jsonElement = properties5.get("ChildLockSetting")) == null || (str5 = jsonElement.getAsString()) == null) {
                str5 = "0";
            }
            this.ChildLockSet = !Intrinsics.areEqual((Object) str5, (Object) "0");
            setKeyLockState();
        }
    }
}
