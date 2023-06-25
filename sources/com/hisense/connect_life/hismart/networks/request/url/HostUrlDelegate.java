package com.hisense.connect_life.hismart.networks.request.url;

import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.exception.HostUrlException;
import com.hisense.connect_life.hismart.networks.request.HiSmartHostKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u001f\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H\u0002R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R&\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000R&\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/url/HostUrlDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "", "", "cloudService", "Lcom/hisense/connect_life/hismart/networks/request/url/CloudService;", "serLocation", "serType", "(Lcom/hisense/connect_life/hismart/networks/request/url/CloudService;Ljava/lang/String;Ljava/lang/String;)V", "accountHost", "", "Lcom/hisense/connect_life/hismart/networks/request/url/ServiceLocation;", "", "Lcom/hisense/connect_life/hismart/networks/request/url/ServiceType;", "accountJhkHost", "appHost", "basicServiceHost", "deviceHost", "deviceInteractiveHost", "homeHost", "languageHost", "messageHost", "pushHost", "sceneHost", "getSerLocation", "()Ljava/lang/String;", "getSerType", "statisticHost", "userDName", "wineManagerHost", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HostUrlDelegate.kt */
public final class HostUrlDelegate implements ReadOnlyProperty<Object, String> {
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> accountHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> accountJhkHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> appHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> basicServiceHost = new LinkedHashMap();
    @NotNull
    public final CloudService cloudService;
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> deviceHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> deviceInteractiveHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> homeHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> languageHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> messageHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> pushHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> sceneHost = new LinkedHashMap();
    @NotNull
    public final String serLocation;
    @NotNull
    public final String serType;
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> statisticHost = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> userDName = new LinkedHashMap();
    @NotNull
    public final Map<ServiceLocation, Map<ServiceType, String>> wineManagerHost = new LinkedHashMap();

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HostUrlDelegate.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CloudService.values().length];
            iArr[CloudService.ACCOUNT.ordinal()] = 1;
            iArr[CloudService.ACCOUNT_JHK.ordinal()] = 2;
            iArr[CloudService.HOME.ordinal()] = 3;
            iArr[CloudService.DEVICE.ordinal()] = 4;
            iArr[CloudService.DEVICE_INTERACTIVE.ordinal()] = 5;
            iArr[CloudService.SCENE.ordinal()] = 6;
            iArr[CloudService.MESSAGE.ordinal()] = 7;
            iArr[CloudService.APP.ordinal()] = 8;
            iArr[CloudService.PUSH.ordinal()] = 9;
            iArr[CloudService.STATISTIC.ordinal()] = 10;
            iArr[CloudService.LANGUAGE.ordinal()] = 11;
            iArr[CloudService.BASICSERVICE.ordinal()] = 12;
            iArr[CloudService.WINE_MANAGER.ordinal()] = 13;
            iArr[CloudService.USER_DNAME.ordinal()] = 14;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HostUrlDelegate(@NotNull CloudService cloudService2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(cloudService2, "cloudService");
        Intrinsics.checkNotNullParameter(str, "serLocation");
        Intrinsics.checkNotNullParameter(str2, "serType");
        this.cloudService = cloudService2;
        this.serLocation = str;
        this.serType = str2;
        Map<ServiceLocation, Map<ServiceType, String>> map = this.accountJhkHost;
        map.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-tmp-aaa-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "http://34.211.243.177"), TuplesKt.m25743to(ServiceType.RELEASE, "https://account.hijuconn.com")));
        map.put(ServiceLocation.USA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.DEV, "https://clife-auth-na.vidaahub.com"), TuplesKt.m25743to(ServiceType.RELEASE, "https://clife-auth-na.vidaahub.com"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com")));
        Map put = map.put(ServiceLocation.EUROPE, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.DEV, "https://clife-auth-eu.vidaahub.com"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.RELEASE, "https://clife-auth-eu.vidaahub.com")));
        Map put2 = this.accountHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-auth-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-auth-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.RELEASE, "https://auth-gateway.hijuconn.com")));
        Map put3 = this.statisticHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-auth-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-auth-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.RELEASE, "https://auth-gateway.hijuconn.com/")));
        Map put4 = this.homeHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com")));
        Map put5 = this.deviceHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, HiSmartHostKt.DEVICE_HOST), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com")));
        Map put6 = this.deviceInteractiveHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-shadow-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com/")));
        Map put7 = this.messageHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-msg-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com")));
        Map put8 = this.pushHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-msg-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com/")));
        Map put9 = this.basicServiceHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "https://dev-bas-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com/")));
        Map put10 = this.sceneHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, HiSmartHostKt.SCENE_HOST), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com")));
        Map put11 = this.appHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-app-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, HiSmartHostKt.APP_HOST), TuplesKt.m25743to(ServiceType.RELEASE, "https://bas-gateway.hijuconn.com")));
        Map put12 = this.languageHost.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://test-clife-eu-gateway.hijuconn.com/"), TuplesKt.m25743to(ServiceType.PRESSURE_TESTING, "https://testbrench-apigateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "http://dev-msg-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.RELEASE, "http://bas-gateway.hijuconn.com")));
        Map<ServiceLocation, Map<ServiceType, String>> map2 = this.wineManagerHost;
        String wineHost = HiSmart.Companion.getInstance().getWineHost();
        Map put13 = map2.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, wineHost), TuplesKt.m25743to(ServiceType.DEV, wineHost), TuplesKt.m25743to(ServiceType.RELEASE, wineHost)));
        Map put14 = this.userDName.put(ServiceLocation.CHINA, MapsKt__MapsKt.mapOf(TuplesKt.m25743to(ServiceType.TESTING, "https://bas-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.DEV, "http://bas-gateway.hijuconn.com"), TuplesKt.m25743to(ServiceType.RELEASE, "http://bas-gateway.hijuconn.com")));
    }

    @NotNull
    public final String getSerLocation() {
        return this.serLocation;
    }

    @NotNull
    public final String getSerType() {
        return this.serType;
    }

    @NotNull
    public String getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        Map<ServiceLocation, Map<ServiceType, String>> map;
        Intrinsics.checkNotNullParameter(kProperty, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[this.cloudService.ordinal()]) {
            case 1:
                map = this.accountHost;
                break;
            case 2:
                map = this.accountJhkHost;
                break;
            case 3:
                map = this.homeHost;
                break;
            case 4:
                map = this.deviceHost;
                break;
            case 5:
                map = this.deviceInteractiveHost;
                break;
            case 6:
                map = this.sceneHost;
                break;
            case 7:
                map = this.messageHost;
                break;
            case 8:
                map = this.appHost;
                break;
            case 9:
                map = this.pushHost;
                break;
            case 10:
                map = this.statisticHost;
                break;
            case 11:
                map = this.languageHost;
                break;
            case 12:
                map = this.basicServiceHost;
                break;
            case 13:
                map = this.wineManagerHost;
                break;
            case 14:
                map = this.userDName;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ServiceLocation fromString = ServiceLocation.Companion.fromString(this.serLocation);
        Map map2 = map.get(fromString);
        if (map2 != null) {
            ServiceType fromString2 = ServiceType.Companion.fromString(this.serType);
            String str = (String) map2.get(fromString2);
            if (str != null) {
                return str;
            }
            throw new HostUrlException("The url for " + fromString2 + " isn't existed!");
        }
        throw new HostUrlException("The url for " + fromString + " isn't existed!");
    }
}
