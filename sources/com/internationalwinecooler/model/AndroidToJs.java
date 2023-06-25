package com.internationalwinecooler.model;

import android.webkit.JavascriptInterface;
import androidx.core.app.NotificationCompat;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.internationalwinecooler.listener.IJsCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\b\u0010\u0016\u001a\u00020\u0005H\u0017J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0017J \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\b\u0010\u001a\u001a\u00020\u0005H\u0017J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\"\u001a\u00020\u0005H\u0017J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J \u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0007H\u0017J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0007H\u0017J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u00100\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u00101\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J \u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0017J8\u00106\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0017J\u0010\u0010:\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010<\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010=\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, mo47991d2 = {"Lcom/internationalwinecooler/model/AndroidToJs;", "Lcom/internationalwinecooler/listener/IJsCallback;", "jsCallback", "(Lcom/internationalwinecooler/listener/IJsCallback;)V", "addWine", "", "identityPage", "", "model", "addWineForBase", "gaWebOperationReport", "getAllSameWinesInDevice", "auid", "getAllWinesInDevice", "getApplianceProfile", "getBadImageAfterVivino", "getChartData", "getDeviceInfo", "getDevicePropertiesInfo", "getInventoryExistCountByVivinoId", "getLightsInfo", "getManualInfo", "getManualUrl", "getMsgSwitch", "deviceId", "getNoShelfWineNum", "getRemoveMessageStatus", "getVivinoInfo", "getWineCardInfo", "getWineCoolerList", "getWineCoolerListAndCount", "getWineDeviceList", "getWineInfo", "goAddWinePage", "goBack", "goInventoryPage", "imageUrlToBase64", "onPageFinish", "removeMulWineWithIdArray", "removeOtherWineWithIdArray", "removeWineWithIdArray", "sendCmd", "sendTemperatureCmd", "setRemoveMessageStatus", "status", "showVivinoInfo", "vivinoId", "showWineData", "takePhoto", "unpairAppliance", "updateApplianceNickName", "wifiId", "auId", "deviceNickName", "updateApplianceProfile", "purchaseDate", "warrantyEndDate", "applianceMedia", "updateFile", "updateMsgSwitch", "updateWine", "updateWineFavorite", "updateWineInfo", "totalModel", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AndroidToJs.kt */
public final class AndroidToJs implements IJsCallback {
    @NotNull
    public final IJsCallback jsCallback;

    public AndroidToJs(@NotNull IJsCallback iJsCallback) {
        Intrinsics.checkNotNullParameter(iJsCallback, "jsCallback");
        this.jsCallback = iJsCallback;
    }

    @JavascriptInterface
    public void addWine(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.addWine(str, str2);
    }

    @JavascriptInterface
    public void addWineForBase(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.addWineForBase(str, str2);
    }

    @JavascriptInterface
    public void gaWebOperationReport(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.gaWebOperationReport(str, str2);
    }

    @JavascriptInterface
    public void getAllSameWinesInDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        this.jsCallback.getAllSameWinesInDevice(str, str2, str3);
    }

    @JavascriptInterface
    public void getAllWinesInDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        this.jsCallback.getAllWinesInDevice(str, str2, str3);
    }

    @JavascriptInterface
    public void getApplianceProfile(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getApplianceProfile(str, str2);
    }

    @JavascriptInterface
    public void getBadImageAfterVivino(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.getBadImageAfterVivino(str);
    }

    @JavascriptInterface
    public void getChartData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        this.jsCallback.getChartData(str, str2, str3);
    }

    @JavascriptInterface
    public void getDeviceInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getDeviceInfo(str, str2);
    }

    @JavascriptInterface
    public void getDevicePropertiesInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getDevicePropertiesInfo(str, str2);
    }

    @JavascriptInterface
    public void getInventoryExistCountByVivinoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        this.jsCallback.getInventoryExistCountByVivinoId(str);
    }

    @JavascriptInterface
    public void getLightsInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getLightsInfo(str, str2);
    }

    @JavascriptInterface
    public void getManualInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getManualInfo(str, str2);
    }

    @JavascriptInterface
    public void getManualUrl() {
        this.jsCallback.getManualUrl();
    }

    @JavascriptInterface
    public void getMsgSwitch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        this.jsCallback.getMsgSwitch(str);
    }

    @JavascriptInterface
    public void getNoShelfWineNum(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        this.jsCallback.getNoShelfWineNum(str, str2, str3);
    }

    @JavascriptInterface
    public void getRemoveMessageStatus() {
        this.jsCallback.getRemoveMessageStatus();
    }

    @JavascriptInterface
    public void getVivinoInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        this.jsCallback.getVivinoInfo(str);
    }

    @JavascriptInterface
    public void getWineCardInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.getWineCardInfo(str);
    }

    @JavascriptInterface
    public void getWineCoolerList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.getWineCoolerList(str);
    }

    @JavascriptInterface
    public void getWineCoolerListAndCount(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getWineCoolerListAndCount(str, str2);
    }

    @JavascriptInterface
    public void getWineDeviceList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.getWineDeviceList(str);
    }

    @JavascriptInterface
    public void getWineInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.getWineInfo(str, str2);
    }

    @JavascriptInterface
    public void goAddWinePage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.goAddWinePage(str);
    }

    @JavascriptInterface
    public void goBack() {
        this.jsCallback.goBack();
    }

    @JavascriptInterface
    public void goInventoryPage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.goInventoryPage(str);
    }

    @JavascriptInterface
    public void imageUrlToBase64(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.imageUrlToBase64(str, str2);
    }

    @JavascriptInterface
    public void onPageFinish(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.onPageFinish(str);
    }

    @JavascriptInterface
    public void removeMulWineWithIdArray(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.removeMulWineWithIdArray(str, str2);
    }

    @JavascriptInterface
    public void removeOtherWineWithIdArray(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.removeOtherWineWithIdArray(str, str2);
    }

    @JavascriptInterface
    public void removeWineWithIdArray(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.removeWineWithIdArray(str, str2);
    }

    @JavascriptInterface
    public void sendCmd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        this.jsCallback.sendCmd(str, str2, str3);
    }

    @JavascriptInterface
    public void sendTemperatureCmd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.sendTemperatureCmd(str, str2);
    }

    @JavascriptInterface
    public void setRemoveMessageStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        this.jsCallback.setRemoveMessageStatus(str);
    }

    @JavascriptInterface
    public void showVivinoInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_VIVINO_ID);
        this.jsCallback.showVivinoInfo(str);
    }

    @JavascriptInterface
    public void showWineData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        this.jsCallback.showWineData(str);
    }

    @JavascriptInterface
    public void takePhoto(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.takePhoto(str, str2);
    }

    @JavascriptInterface
    public void unpairAppliance(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.unpairAppliance(str, str2);
    }

    @JavascriptInterface
    public void updateApplianceNickName(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "auId");
        Intrinsics.checkNotNullParameter(str3, "deviceNickName");
        this.jsCallback.updateApplianceNickName(str, str2, str3);
    }

    @JavascriptInterface
    public void updateApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str3, "auId");
        Intrinsics.checkNotNullParameter(str4, "purchaseDate");
        Intrinsics.checkNotNullParameter(str5, "warrantyEndDate");
        Intrinsics.checkNotNullParameter(str6, "applianceMedia");
        this.jsCallback.updateApplianceProfile(str, str2, str3, str4, str5, str6);
    }

    @JavascriptInterface
    public void updateFile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        this.jsCallback.updateFile(str);
    }

    @JavascriptInterface
    public void updateMsgSwitch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        this.jsCallback.updateMsgSwitch(str);
    }

    @JavascriptInterface
    public void updateWine(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.updateWine(str, str2);
    }

    @JavascriptInterface
    public void updateWineFavorite(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        this.jsCallback.updateWineFavorite(str, str2);
    }

    @JavascriptInterface
    public void updateWineInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "model");
        Intrinsics.checkNotNullParameter(str2, "totalModel");
        this.jsCallback.updateWineInfo(str, str2);
    }
}
