package com.hisense.connect_life.hismart.networks.request.message;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.InventoryMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/ProcessMessageUtil;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ProcessMessageUtil.kt */
public final class ProcessMessageUtil {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/ProcessMessageUtil$Companion;", "", "()V", "processMessage", "", "msg", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ProcessMessageUtil.kt */
    public static final class Companion {

        @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
        /* compiled from: ProcessMessageUtil.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageFormId.values().length];
                iArr[MessageFormId.WIFI.ordinal()] = 1;
                iArr[MessageFormId.DEVICE_STATUS.ordinal()] = 2;
                iArr[MessageFormId.SELF.ordinal()] = 3;
                iArr[MessageFormId.ALARM.ordinal()] = 4;
                iArr[MessageFormId.INVENTORY.ordinal()] = 5;
                iArr[MessageFormId.ELSE.ordinal()] = 6;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void processMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("formatId");
                String string = jSONObject.getString(BrowserServiceFileProvider.CONTENT_SCHEME);
                int i2 = WhenMappings.$EnumSwitchMapping$0[MessageFormId.Companion.fromType(i).ordinal()];
                if (i2 == 1) {
                    WifiMessage wifiMessage = (WifiMessage) new Gson().fromJson(string, WifiMessage.class);
                    MessageObserver instance = MessageObserver.Companion.getInstance();
                    Intrinsics.checkNotNullExpressionValue(wifiMessage, "wifiMessage");
                    instance.dispatcher(wifiMessage);
                } else if (i2 == 2) {
                    DeviceStatusMessage deviceStatusMessage = (DeviceStatusMessage) new Gson().fromJson(string, DeviceStatusMessage.class);
                    MessageObserver instance2 = MessageObserver.Companion.getInstance();
                    Intrinsics.checkNotNullExpressionValue(deviceStatusMessage, "deviceStatusMessage");
                    instance2.dispatcher(deviceStatusMessage);
                } else if (i2 == 3) {
                    SelfMessage selfMessage = (SelfMessage) new Gson().fromJson(string, SelfMessage.class);
                    MessageObserver instance3 = MessageObserver.Companion.getInstance();
                    Intrinsics.checkNotNullExpressionValue(selfMessage, "selfMessage");
                    instance3.dispatcher(selfMessage);
                } else if (i2 == 4) {
                    PushMessage pushMessage = (PushMessage) new Gson().fromJson(string, PushMessage.class);
                    MessageObserver instance4 = MessageObserver.Companion.getInstance();
                    Intrinsics.checkNotNullExpressionValue(pushMessage, "alarmMessage");
                    instance4.dispatcher(pushMessage);
                } else if (i2 == 5) {
                    MessageObserver.Companion.getInstance().dispatcher(new InventoryMessage(""));
                }
            } catch (JsonSyntaxException e) {
                LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("processMessage: ", e.getMessage()));
            }
        }
    }
}
