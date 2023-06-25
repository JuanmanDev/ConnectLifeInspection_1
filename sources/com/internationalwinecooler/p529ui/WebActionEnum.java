package com.internationalwinecooler.p529ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\b\u0001\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001<B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;¨\u0006="}, mo47991d2 = {"Lcom/internationalwinecooler/ui/WebActionEnum;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "NONE", "GO_BACK", "TAKE_PHOTO", "ADD_WINE_CALLBACK", "GET_BAD_IMAGE_AFTER_VIVINO_CALLBACK", "SHOW_WINE_DATA_CALLBACK", "TAKE_PHOTO_CALLBACK", "GET_WINE_COOLER_LIST_CALLBACK", "GET_WINE_COOLER_LIST_AND_COUNT_CALLBACK", "GET_WINE_LIST_CALL_BACK", "UPDATE_WINE_INFO_CALLBACK", "UPDATE_WINE_FAVORITE_CALLBACK", "GET_WINE_DEVICE_LIST_CALLBACK", "GET_DEVICE_INFO_CALLBACK", "SEND_TEMPERATURE_CMD_CALLBACK", "GET_LIGHT_CALLBACK", "GET_DEVICE_PROPERTIES_INFO_CALLBACK", "SEND_CMD_CALLBACK", "GET_MANUAL_INFO_CALLBACK", "GET_WINE_COUNT_IN_INVENTORY_CALLBACK", "GET_ALL_WINES_IN_DEVICE_CALLBACK", "GET_ALL_SAME_WINES_IN_DEVICE_CALLBACK", "GET_CHART_DATA_CALLBACK", "GET_WINE_DATA_CALLBACK", "GET_WINE_SHELF_BY_VIVINO_CALLBACK", "GET_WINE_INFO_CALLBACK", "IMAGE_URL_TO_BASE64_CALLBACK", "REMOVE_WINE_WITH_ID_ARRAY_CALLBACK", "REMOVE_OTHER_WINE_WITH_ID_ARRAY_CALLBACK", "GET_NO_SHELF_WINE_NUM_CALLBACK", "GET_WINE_CARD_INFO_CALLBACK", "GET_INVENTORY_EXIST_COUNT_BY_VIVINOID_CALLBACK", "GET_VIVINO_INFO_CALLBACK", "GET_MANUAL_URL_CALLBACK", "UPDATE_FILE_CALLBACK", "GET_MSG_SWITCH_CALLBACK", "UPDATE_MSG_SWITCH_CALLBACK", "GET_REMOVE_MSG_STATUS_CALLBACK", "SET_REMOVE_MSG_STATUS_CALLBACK", "ON_BACKPRESSED_CALLBACK", "ADD_WINE_VIVINO_CALLBACK", "ADD_WINE_INVENTORY_CALLBACK", "CHANGE_WINE_FAVORITE_CALLBACK", "DELETE_WINE_IN_INVENTORY_CALLBACK", "GET_SHELF_WINE_CALLBACK", "GET_APPLIANCE_PROFILE_CALLBACK", "UNPAIR_APPLIANCE_CALLBACK", "UPDATE_APPLIANCE_PROFILE_CALLBACK", "UPDATE_APPLIANCE_NICKNAME_CALLBACK", "IN_INVENTORY_CALLBACK", "WINE_SETTING_CALL_BACK", "GET_TEMPERATURE_CALL_BACK", "GET_HUMIDITY_CALL_BACK", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WebActionEnum */
/* compiled from: WebActionEnum.kt */
public enum WebActionEnum {
    NONE("none"),
    GO_BACK("goBack"),
    TAKE_PHOTO("takePhoto"),
    ADD_WINE_CALLBACK("addWineCallback"),
    GET_BAD_IMAGE_AFTER_VIVINO_CALLBACK("getBadImageAfterVivinoCallback"),
    SHOW_WINE_DATA_CALLBACK("showWineDataCallback"),
    TAKE_PHOTO_CALLBACK("takePhotoCallback"),
    GET_WINE_COOLER_LIST_CALLBACK("getWineCoolerListCallback"),
    GET_WINE_COOLER_LIST_AND_COUNT_CALLBACK("getWineCoolerListAndCountCallback"),
    GET_WINE_LIST_CALL_BACK("getWineListCallback"),
    UPDATE_WINE_INFO_CALLBACK("updateWineInfoCallback"),
    UPDATE_WINE_FAVORITE_CALLBACK("updateWineFavoriteCallback"),
    GET_WINE_DEVICE_LIST_CALLBACK("getWineDeviceListCallback"),
    GET_DEVICE_INFO_CALLBACK("getDeviceInfoCallback"),
    SEND_TEMPERATURE_CMD_CALLBACK("sendTemperatureCmdCallback"),
    GET_LIGHT_CALLBACK("getLightsCallback"),
    GET_DEVICE_PROPERTIES_INFO_CALLBACK("getDevicePropertiesInfoCallback"),
    SEND_CMD_CALLBACK("sendCmdCallback"),
    GET_MANUAL_INFO_CALLBACK("getManualInfoCallback"),
    GET_WINE_COUNT_IN_INVENTORY_CALLBACK("getWineCountInInventoryCallback"),
    GET_ALL_WINES_IN_DEVICE_CALLBACK("getAllWinesInDeviceCallback"),
    GET_ALL_SAME_WINES_IN_DEVICE_CALLBACK("getAllSameWinesInDeviceCallback"),
    GET_CHART_DATA_CALLBACK("getChartDataCallback"),
    GET_WINE_DATA_CALLBACK("getWineDataCallback"),
    GET_WINE_SHELF_BY_VIVINO_CALLBACK("getWineShelfByVivinoCallback"),
    GET_WINE_INFO_CALLBACK("getWineInfoCallback"),
    IMAGE_URL_TO_BASE64_CALLBACK("imageUrlToBase64Callback"),
    REMOVE_WINE_WITH_ID_ARRAY_CALLBACK("removeWineWithIdArrayCallback"),
    REMOVE_OTHER_WINE_WITH_ID_ARRAY_CALLBACK("removeOtherWineWithIdArrayCallback"),
    GET_NO_SHELF_WINE_NUM_CALLBACK("getNoShelfWineNumCallback"),
    GET_WINE_CARD_INFO_CALLBACK("getWineCardInfoCallback"),
    GET_INVENTORY_EXIST_COUNT_BY_VIVINOID_CALLBACK("getInventoryExistCountByVivinoIdCallback"),
    GET_VIVINO_INFO_CALLBACK("getVivinoInfoCallback"),
    GET_MANUAL_URL_CALLBACK("getManualUrlCallback"),
    UPDATE_FILE_CALLBACK("updateFileCallback"),
    GET_MSG_SWITCH_CALLBACK("getMsgSwitchCallback"),
    UPDATE_MSG_SWITCH_CALLBACK("updateMsgSwitchCallback"),
    GET_REMOVE_MSG_STATUS_CALLBACK("getRemoveMessageStatusCallback"),
    SET_REMOVE_MSG_STATUS_CALLBACK("setRemoveMessageStatusCallback"),
    ON_BACKPRESSED_CALLBACK("onBackPressedCallback"),
    ADD_WINE_VIVINO_CALLBACK("addWineVivinoCallback"),
    ADD_WINE_INVENTORY_CALLBACK("addWineInventoryCallback"),
    CHANGE_WINE_FAVORITE_CALLBACK("changeWineFavoriteCallback"),
    DELETE_WINE_IN_INVENTORY_CALLBACK("deleteWineInInventoryCallback"),
    GET_SHELF_WINE_CALLBACK("getShelfWineCallback"),
    GET_APPLIANCE_PROFILE_CALLBACK("getApplianceProfileCallback"),
    UNPAIR_APPLIANCE_CALLBACK("unpairApplianceCallback"),
    UPDATE_APPLIANCE_PROFILE_CALLBACK("updateApplianceProfileCallback"),
    UPDATE_APPLIANCE_NICKNAME_CALLBACK("updateApplianceNickNameCallback"),
    IN_INVENTORY_CALLBACK("inInventoryCallback"),
    WINE_SETTING_CALL_BACK("wineSettingsCallback"),
    GET_TEMPERATURE_CALL_BACK("getTemperatureCallback"),
    GET_HUMIDITY_CALL_BACK("getHumidityCallback");
    
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public final String type;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/WebActionEnum$Companion;", "", "()V", "fromString", "Lcom/internationalwinecooler/ui/WebActionEnum;", "type", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.WebActionEnum$Companion */
    /* compiled from: WebActionEnum.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WebActionEnum fromString(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "type");
            if (Intrinsics.areEqual((Object) str, (Object) WebActionEnum.GO_BACK.getType())) {
                return WebActionEnum.GO_BACK;
            }
            if (Intrinsics.areEqual((Object) str, (Object) WebActionEnum.GET_LIGHT_CALLBACK.getType())) {
                return WebActionEnum.GET_LIGHT_CALLBACK;
            }
            return WebActionEnum.NONE;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    WebActionEnum(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
