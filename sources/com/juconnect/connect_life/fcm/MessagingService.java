package com.juconnect.connect_life.fcm;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.MainActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1502i;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nH\u0002¨\u0006\u0013"}, mo47991d2 = {"Lcom/juconnect/connect_life/fcm/MessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onCreate", "", "onMessageReceived", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "p0", "", "processMessage", "msg", "data", "", "sendNotification", "messageBody", "sendRegistrationToServer", "token", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessagingService.kt */
public final class MessagingService extends FirebaseMessagingService {
    private final void processMessage(String str, Map<String, String> map) {
        Object d = C1502i.m924d(C1502i.m930j(map), PushMessage.class);
        Intrinsics.checkNotNullExpressionValue(d, "fromJson(toJson, PushMessage::class.java)");
        "FCM processMessage msg: " + str + ", data: " + map;
        MessageObserver.Companion.getInstance().dispatcher((PushMessage) d);
    }

    private final void sendNotification(String str) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        String string = getString(R.string.default_notification_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.defau…_notification_channel_id)");
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder((Context) this, string).setContentTitle("ConnectLife").setContentText(str).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(activity);
        Intrinsics.checkNotNullExpressionValue(contentIntent, "Builder(this, channelId)…tentIntent(pendingIntent)");
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(string, "Channel human readable title", 3));
            }
            notificationManager.notify(0, contentIntent.build());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    private final void sendRegistrationToServer(String str) {
        if (SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH)) {
            AppConfig.Companion.setFcmToken(str);
            HiSmart.Companion.getInstance().pushMessageService().subscribePush(AppConfig.Companion.getFcmToken(), AppConfig.Companion.getJhkDeviceId(), MessagingService$sendRegistrationToServer$1.INSTANCE, MessagingService$sendRegistrationToServer$2.INSTANCE);
        }
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "message");
        super.onMessageReceived(remoteMessage);
        Intrinsics.stringPlus("onMessageReceived:", remoteMessage.mo37476P());
        Map<String, String> P = remoteMessage.mo37476P();
        Intrinsics.checkNotNullExpressionValue(P, "message.data");
        String str = remoteMessage.mo37476P().get(BrowserServiceFileProvider.CONTENT_SCHEME);
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && !P.isEmpty() && SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH)) {
            processMessage(str, P);
        }
    }

    public void onNewToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "p0");
        super.onNewToken(str);
        Intrinsics.stringPlus("Token: ", str);
        sendRegistrationToServer(SPManagerKt.getToken());
    }
}
