package com.juconnect.connect_life;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.NotificationCompatJellybean;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.networks.request.message.listener.SimpleMessageReceived;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.juconnect.connect_life.application.MainApplication;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p040c.p072c.p073a.p074a.C1502i;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/juconnect/connect_life/MainActivity$subscribeMsgObservable$1", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/SimpleMessageReceived;", "onAlarmMessage", "", "alarmMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$subscribeMsgObservable$1 extends SimpleMessageReceived {
    public final /* synthetic */ MainApplication $mainApplication;
    public final /* synthetic */ MainActivity this$0;

    public MainActivity$subscribeMsgObservable$1(MainApplication mainApplication, MainActivity mainActivity) {
        this.$mainApplication = mainApplication;
        this.this$0 = mainActivity;
    }

    public void onAlarmMessage(@NotNull PushMessage pushMessage) {
        int i;
        Intrinsics.checkNotNullParameter(pushMessage, "alarmMessage");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("subscribeMsgObservable alarmMessage: ", pushMessage));
        if (this.$mainApplication.isApplicationBackground()) {
            Intrinsics.stringPlus("subscribeMsgObservable alarmMessage: ", pushMessage);
            String content = pushMessage.getContent();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            JSONObject jSONObject = new JSONObject(content);
            ArrayList arrayList = null;
            if (StringsKt__StringsKt.contains$default((CharSequence) pushMessage.getMsgTypeCode(), (CharSequence) AppConfig.AIR_SCENES_TYPE, false, 2, (Object) null)) {
                T optString = jSONObject.optString(NotificationCompatJellybean.KEY_TITLE);
                Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"title\")");
                objectRef.element = optString;
                T optString2 = jSONObject.optString("text");
                Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"text\")");
                objectRef2.element = optString2;
            } else if (pushMessage.getFormatId() == 7) {
                T optString3 = jSONObject.optString("warning");
                Intrinsics.checkNotNullExpressionValue(optString3, "jsonObject.optString(\"warning\")");
                objectRef2.element = optString3;
            }
            double random = Math.random();
            double d = (double) 5000;
            while (true) {
                i = (int) (random * d);
                ArrayList access$getTags$p = this.this$0.tags;
                if (access$getTags$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tags");
                    access$getTags$p = null;
                }
                if (!access$getTags$p.contains(Integer.valueOf(i))) {
                    break;
                }
                random = Math.random();
            }
            ArrayList access$getTags$p2 = this.this$0.tags;
            if (access$getTags$p2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tags");
            } else {
                arrayList = access$getTags$p2;
            }
            arrayList.add(Integer.valueOf(i));
            Intent intent = new Intent(this.this$0.getApplicationContext(), MainActivity.class);
            C1502i.m930j(pushMessage);
            intent.addFlags(67108864);
            intent.putExtra(AppConfig.NOTIFY_MSG_CONTENT, C1502i.m930j(pushMessage));
            Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), (CoroutineStart) null, new MainActivity$subscribeMsgObservable$1$onAlarmMessage$1(this.this$0, objectRef, objectRef2, PendingIntent.getActivity(this.this$0.getApplicationContext(), i, intent, 67108864), (Continuation<? super MainActivity$subscribeMsgObservable$1$onAlarmMessage$1>) null), 2, (Object) null);
        }
    }
}
