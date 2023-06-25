package com.hisense.connect_life.hismart.networks.request.message;

import androidx.test.internal.runner.RunnerArgs;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageResponse;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageSwitchListResponse;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageSwitchResponse;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p429r.p430a.p439c.p440a.p441a.p448g.C7398a;
import p040c.p429r.p430a.p439c.p440a.p441a.p448g.C7399b;
import p040c.p429r.p430a.p439c.p440a.p441a.p448g.C7400c;
import p040c.p429r.p430a.p439c.p440a.p441a.p448g.C7401d;
import p040c.p429r.p430a.p439c.p440a.p441a.p448g.C7402e;
import p040c.p429r.p430a.p439c.p440a.p441a.p448g.C7403f;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00070\tH\u0002J0\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\tH\u0016JH\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\tH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/message/IMessageService;", "()V", "messageApi", "Lcom/hisense/connect_life/hismart/networks/request/message/MessageApi;", "kotlin.jvm.PlatformType", "generateMessageChannel", "", "callback", "Lkotlin/Function1;", "", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "isSocket", "", "generateWebSocket", "messageResponse", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageResponse;", "getMessageChannel", "Lio/reactivex/disposables/Disposable;", "getMessageSwitch", "success", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageSwitchResponse;", "failure", "", "updateMessageSwitch", "wifiId", "", "deviceId", "needPush", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageServiceImpl.kt */
public final class MessageServiceImpl implements IMessageService {
    public final MessageApi messageApi = ((MessageApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.MESSAGE)).mo51323b(MessageApi.class));

    private final void generateWebSocket(MessageResponse messageResponse) {
        String str = "ws://" + messageResponse.getPushServerIp() + RunnerArgs.CLASSPATH_SEPARATOR + messageResponse.getPushServerPort() + "/ws/" + messageResponse.getPushChannels().get(0).getPushChannel() + "?token=" + HiSmart.Companion.getInstance().getToken();
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("generateWebSocket: ", str));
        JuWebSocket.Companion.generateWebSocket(str, messageResponse.getHbInterval(), messageResponse.getHbFailTimes());
    }

    private final C9207b getMessageChannel(boolean z, Function1<? super List<PushMessage>, Unit> function1) {
        C9207b s = this.messageApi.getMessageChannel(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7401d(function1, z, this), C7402e.f14091e);
        Intrinsics.checkNotNullExpressionValue(s, "messageApi.getMessageCha… callback)\n            })");
        return s;
    }

    /* renamed from: getMessageChannel$lambda-5  reason: not valid java name */
    public static final void m27036getMessageChannel$lambda5(Function1 function1, boolean z, MessageServiceImpl messageServiceImpl, HiResult hiResult) {
        MessageResponse messageResponse;
        Intrinsics.checkNotNullParameter(function1, "$callback");
        Intrinsics.checkNotNullParameter(messageServiceImpl, "this$0");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus(" getMessageChannel success: ", hiResult));
        if (hiResult == null) {
            messageResponse = null;
        } else {
            messageResponse = (MessageResponse) hiResult.getResponse();
        }
        function1.invoke(((MessageResponse) hiResult.getResponse()).getMsgList());
        if (z && messageResponse != null) {
            messageServiceImpl.generateWebSocket(messageResponse);
        }
    }

    /* renamed from: getMessageChannel$lambda-6  reason: not valid java name */
    public static final void m27037getMessageChannel$lambda6(Throwable th) {
    }

    /* renamed from: getMessageSwitch$lambda-0  reason: not valid java name */
    public static final void m27038getMessageSwitch$lambda0(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.stringPlus("getMessageSwitch succ: ", ((MessageSwitchResponse) hiResult.getResponse()).getSwitchList());
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: getMessageSwitch$lambda-1  reason: not valid java name */
    public static final void m27039getMessageSwitch$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("getMessageSwitch fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: updateMessageSwitch$lambda-2  reason: not valid java name */
    public static final void m27040updateMessageSwitch$lambda2(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.stringPlus("updateMessageSwitch succ: ", hiResult.getResponse());
        if (hiResult == null || ((HiResponse) hiResult.getResponse()).getResultCode() != 0) {
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: updateMessageSwitch$lambda-3  reason: not valid java name */
    public static final void m27041updateMessageSwitch$lambda3(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("updateMessageSwitch fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    public void generateMessageChannel(boolean z, @NotNull Function1<? super List<PushMessage>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        getMessageChannel(z, function1);
    }

    @NotNull
    public C9207b getMessageSwitch(@NotNull Function1<? super MessageSwitchResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.messageApi.getMessageSwitch(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7398a(function1), new C7400c(function12));
        Intrinsics.checkNotNullExpressionValue(s, "messageApi.getMessageSwi…                       })");
        return s;
    }

    @NotNull
    public C9207b updateMessageSwitch(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "needPush");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        Map mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("mainSwitch", "0"));
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, mapOf, (Map) null, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("switchList", new JSONArray(CollectionsKt__CollectionsJVMKt.listOf(new JSONObject(new Gson().toJson((Object) new MessageSwitchListResponse(str, str2, str3), (Type) MessageSwitchListResponse.class)))))), 2, (Object) null);
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.messageApi.updateMessageSwitch(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7399b(function1), new C7403f(function12));
        Intrinsics.checkNotNullExpressionValue(s, "messageApi.updateMessage…                       })");
        return s;
    }

    public void generateMessageChannel(@NotNull Function1<? super List<PushMessage>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        generateMessageChannel(false, function1);
    }
}
