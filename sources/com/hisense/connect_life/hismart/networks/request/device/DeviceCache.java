package com.hisense.connect_life.hismart.networks.request.device;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u001bJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0018J\u0010\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001bJ\u0010\u0010!\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u0018J\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rJ\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006¨\u00061"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/DeviceCache;", "", "()V", "battleNull", "", "getBattleNull", "()I", "battleSingleZoneDevice", "getBattleSingleZoneDevice", "battleTwoZoneDevice", "getBattleTwoZoneDevice", "listDevice", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "singleZoneDevice", "getSingleZoneDevice", "threeZoneDevice", "getThreeZoneDevice", "addDevice", "", "deviceInfo", "getAllWineCoolerDevice", "", "getDevice", "auid", "", "getDeviceByWifiId", "wifiId", "getDeviceList", "getOneZoneFlagByFeatureCode", "deviceId", "isDeviceType", "oneZoneFlagH5", "refreshList", "list", "removeAll", "removeDevice", "subscribeDeviceChangeListener", "unsubcribeDeviceChangeListener", "updateDeviceStatus", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "updateWifiStatus", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "Companion", "Holder", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceCache.kt */
public final class DeviceCache {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public final int battleNull;
    public final int battleSingleZoneDevice;
    public final int battleTwoZoneDevice;
    @NotNull
    public final List<DeviceInfo> listDevice;
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    public final int singleZoneDevice;
    public final int threeZoneDevice;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/DeviceCache$Companion;", "", "()V", "getInstance", "Lcom/hisense/connect_life/hismart/networks/request/device/DeviceCache;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceCache.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceCache getInstance() {
            return Holder.INSTANCE.getDeviceCache();
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/DeviceCache$Holder;", "", "()V", "deviceCache", "Lcom/hisense/connect_life/hismart/networks/request/device/DeviceCache;", "getDeviceCache", "()Lcom/hisense/connect_life/hismart/networks/request/device/DeviceCache;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceCache.kt */
    public static final class Holder {
        @NotNull
        public static final Holder INSTANCE = new Holder();
        @NotNull
        public static final DeviceCache deviceCache = new DeviceCache((DefaultConstructorMarker) null);

        @NotNull
        public final DeviceCache getDeviceCache() {
            return deviceCache;
        }
    }

    public DeviceCache() {
        this.listDevice = new ArrayList();
        this.singleZoneDevice = 1;
        this.battleSingleZoneDevice = 2;
        this.battleTwoZoneDevice = 3;
        this.battleNull = 4;
    }

    public /* synthetic */ DeviceCache(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void subscribeDeviceChangeListener() {
        if (this.messageReceivedListener != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            if (instance.isSubscribe(messageReceivedListener2)) {
                return;
            }
        }
        if (!this.listDevice.isEmpty()) {
            if (this.messageReceivedListener == null) {
                this.messageReceivedListener = new DeviceCache$subscribeDeviceChangeListener$1(this);
            }
            if (this.messageReceivedListener != null) {
                MessageObserver instance2 = MessageObserver.Companion.getInstance();
                MessageReceivedListener messageReceivedListener3 = this.messageReceivedListener;
                Intrinsics.checkNotNull(messageReceivedListener3);
                instance2.subscribe(messageReceivedListener3);
                return;
            }
            return;
        }
        unsubcribeDeviceChangeListener();
    }

    private final void unsubcribeDeviceChangeListener() {
        if (this.listDevice.isEmpty() && this.messageReceivedListener != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            instance.unsubscribe(messageReceivedListener2);
            this.messageReceivedListener = null;
        }
    }

    /* access modifiers changed from: private */
    public final void updateDeviceStatus(DeviceStatusMessage deviceStatusMessage) {
        String component2 = deviceStatusMessage.component2();
        JsonObject component4 = deviceStatusMessage.component4();
        List<DeviceInfo> list = this.listDevice;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (DeviceInfo wifiId : list) {
                if (TextUtils.equals(component2, wifiId.getWifiId()) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i > 0) {
            for (DeviceInfo deviceInfo : this.listDevice) {
                if (TextUtils.equals(component2, deviceInfo.getWifiId())) {
                    JsonObject properties = deviceInfo.getProperties();
                    if (properties == null) {
                        deviceInfo.setProperties(component4);
                        return;
                    }
                    Set<String> keySet = component4.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "properties.keySet()");
                    for (String str : keySet) {
                        properties.add(str, component4.get(str));
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* access modifiers changed from: private */
    public final void updateWifiStatus(WifiMessage wifiMessage) {
        int component1 = wifiMessage.component1();
        String component2 = wifiMessage.component2();
        List<DeviceInfo> list = this.listDevice;
        ArrayList<DeviceInfo> arrayList = new ArrayList<>();
        for (T next : list) {
            if (TextUtils.equals(component2, ((DeviceInfo) next).getWifiId())) {
                arrayList.add(next);
            }
        }
        for (DeviceInfo onlineStatus : arrayList) {
            onlineStatus.setOnlineStatus(OnlineStatus.Companion.fromType(component1));
        }
    }

    public final void addDevice(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        this.listDevice.add(deviceInfo);
        subscribeDeviceChangeListener();
    }

    @NotNull
    public final List<DeviceInfo> getAllWineCoolerDevice() {
        List<DeviceInfo> deviceList = getDeviceList();
        ArrayList arrayList = new ArrayList();
        for (T next : deviceList) {
            if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getDeviceTypeCode(), (Object) "001")) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final int getBattleNull() {
        return this.battleNull;
    }

    public final int getBattleSingleZoneDevice() {
        return this.battleSingleZoneDevice;
    }

    public final int getBattleTwoZoneDevice() {
        return this.battleTwoZoneDevice;
    }

    @Nullable
    public final DeviceInfo getDevice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.stringPlus("获取设备：", str);
        for (DeviceInfo deviceId : this.listDevice) {
            Intrinsics.stringPlus("获取设备-：", deviceId.getDeviceId());
        }
        List<DeviceInfo> list = this.listDevice;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getDeviceId(), (Object) str)) {
                arrayList.add(next);
            }
        }
        Intrinsics.stringPlus("获取设备：结果", Integer.valueOf(arrayList.size()));
        if (!arrayList.isEmpty()) {
            return (DeviceInfo) arrayList.get(0);
        }
        return null;
    }

    @Nullable
    public final DeviceInfo getDeviceByWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        List<DeviceInfo> list = this.listDevice;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (Intrinsics.areEqual((Object) ((DeviceInfo) next).getWifiId(), (Object) str)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return (DeviceInfo) arrayList.get(0);
        }
        return null;
    }

    @NotNull
    public final List<DeviceInfo> getDeviceList() {
        return this.listDevice;
    }

    @NotNull
    public final String getOneZoneFlagByFeatureCode(@Nullable String str) {
        return String.valueOf(isDeviceType(str));
    }

    public final int getSingleZoneDevice() {
        return this.singleZoneDevice;
    }

    public final int getThreeZoneDevice() {
        return this.threeZoneDevice;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (android.text.TextUtils.equals(r0, "740494") != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        if (android.text.TextUtils.equals(r0, "741138") != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
        if (android.text.TextUtils.equals(r6, "741115") != false) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int isDeviceType(@org.jetbrains.annotations.Nullable java.lang.String r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0005
            int r6 = r5.threeZoneDevice
            return r6
        L_0x0005:
            int r0 = r6.length()
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            r2 = 12
            r3 = 18
            if (r0 <= r3) goto L_0x008d
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "737726"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "738663"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "738664"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "739347"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "739977"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "739978"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "740026"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "740494"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x008d
        L_0x0089:
            int r6 = r5.singleZoneDevice
            goto L_0x0155
        L_0x008d:
            int r0 = r6.length()
            if (r0 <= r3) goto L_0x00f0
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "740277"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741134"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741135"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741117"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741137"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741138"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x00f0
        L_0x00ed:
            int r6 = r5.battleSingleZoneDevice
            goto L_0x0155
        L_0x00f0:
            int r0 = r6.length()
            if (r0 <= r3) goto L_0x0153
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "740364"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741100"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741116"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741111"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "741114"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0150
            java.lang.String r6 = r6.substring(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.String r0 = "741115"
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            if (r6 == 0) goto L_0x0153
        L_0x0150:
            int r6 = r5.battleTwoZoneDevice
            goto L_0x0155
        L_0x0153:
            int r6 = r5.threeZoneDevice
        L_0x0155:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.device.DeviceCache.isDeviceType(java.lang.String):int");
    }

    @NotNull
    public final String oneZoneFlagH5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        if (getDevice(str) == null || TextUtils.isEmpty(str) || str.length() <= 18) {
            return "0";
        }
        String substring = str.substring(12, 18);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (!TextUtils.equals(substring, "737726")) {
            String substring2 = str.substring(12, 18);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!TextUtils.equals(substring2, "738663")) {
                String substring3 = str.substring(12, 18);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                if (!TextUtils.equals(substring3, "738664")) {
                    String substring4 = str.substring(12, 18);
                    Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (TextUtils.equals(substring4, "739347")) {
                        return "1";
                    }
                    return "0";
                }
            }
        }
        return "1";
    }

    public final void refreshList(@NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (!this.listDevice.isEmpty()) {
            this.listDevice.clear();
        }
        this.listDevice.addAll(list);
        subscribeDeviceChangeListener();
    }

    public final void removeAll() {
        this.listDevice.clear();
        unsubcribeDeviceChangeListener();
    }

    public final void removeDevice(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        this.listDevice.remove(deviceInfo);
        unsubcribeDeviceChangeListener();
    }
}
