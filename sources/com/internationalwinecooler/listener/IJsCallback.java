package com.internationalwinecooler.listener;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0005H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0005H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H&J8\u00104\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H&J\u0010\u00108\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u00109\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010:\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005H&¨\u0006>"}, mo47991d2 = {"Lcom/internationalwinecooler/listener/IJsCallback;", "", "addWine", "", "identityPage", "", "model", "addWineForBase", "gaWebOperationReport", "getAllSameWinesInDevice", "auid", "getAllWinesInDevice", "getApplianceProfile", "getBadImageAfterVivino", "getChartData", "getDeviceInfo", "getDevicePropertiesInfo", "getInventoryExistCountByVivinoId", "getLightsInfo", "getManualInfo", "getManualUrl", "getMsgSwitch", "deviceId", "getNoShelfWineNum", "getRemoveMessageStatus", "getVivinoInfo", "getWineCardInfo", "getWineCoolerList", "getWineCoolerListAndCount", "getWineDeviceList", "getWineInfo", "goAddWinePage", "goBack", "goInventoryPage", "imageUrlToBase64", "onPageFinish", "removeMulWineWithIdArray", "removeOtherWineWithIdArray", "removeWineWithIdArray", "sendCmd", "sendTemperatureCmd", "setRemoveMessageStatus", "status", "showVivinoInfo", "vivinoId", "showWineData", "takePhoto", "unpairAppliance", "updateApplianceNickName", "wifiId", "auId", "deviceNickName", "updateApplianceProfile", "purchaseDate", "warrantyEndDate", "applianceMedia", "updateFile", "updateMsgSwitch", "updateWine", "updateWineFavorite", "updateWineInfo", "totalModel", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IJsCallback.kt */
public interface IJsCallback {
    void addWine(@NotNull String str, @NotNull String str2);

    void addWineForBase(@NotNull String str, @NotNull String str2);

    void gaWebOperationReport(@NotNull String str, @NotNull String str2);

    void getAllSameWinesInDevice(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void getAllWinesInDevice(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void getApplianceProfile(@NotNull String str, @NotNull String str2);

    void getBadImageAfterVivino(@NotNull String str);

    void getChartData(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void getDeviceInfo(@NotNull String str, @NotNull String str2);

    void getDevicePropertiesInfo(@NotNull String str, @NotNull String str2);

    void getInventoryExistCountByVivinoId(@NotNull String str);

    void getLightsInfo(@NotNull String str, @NotNull String str2);

    void getManualInfo(@NotNull String str, @NotNull String str2);

    void getManualUrl();

    void getMsgSwitch(@NotNull String str);

    void getNoShelfWineNum(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void getRemoveMessageStatus();

    void getVivinoInfo(@NotNull String str);

    void getWineCardInfo(@NotNull String str);

    void getWineCoolerList(@NotNull String str);

    void getWineCoolerListAndCount(@NotNull String str, @NotNull String str2);

    void getWineDeviceList(@NotNull String str);

    void getWineInfo(@NotNull String str, @NotNull String str2);

    void goAddWinePage(@NotNull String str);

    void goBack();

    void goInventoryPage(@NotNull String str);

    void imageUrlToBase64(@NotNull String str, @NotNull String str2);

    void onPageFinish(@NotNull String str);

    void removeMulWineWithIdArray(@NotNull String str, @NotNull String str2);

    void removeOtherWineWithIdArray(@NotNull String str, @NotNull String str2);

    void removeWineWithIdArray(@NotNull String str, @NotNull String str2);

    void sendCmd(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void sendTemperatureCmd(@NotNull String str, @NotNull String str2);

    void setRemoveMessageStatus(@NotNull String str);

    void showVivinoInfo(@NotNull String str);

    void showWineData(@NotNull String str);

    void takePhoto(@NotNull String str, @NotNull String str2);

    void unpairAppliance(@NotNull String str, @NotNull String str2);

    void updateApplianceNickName(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void updateApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6);

    void updateFile(@NotNull String str);

    void updateMsgSwitch(@NotNull String str);

    void updateWine(@NotNull String str, @NotNull String str2);

    void updateWineFavorite(@NotNull String str, @NotNull String str2);

    void updateWineInfo(@NotNull String str, @NotNull String str2);
}
