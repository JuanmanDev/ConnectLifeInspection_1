package com.hisense.connect_life.hismart.networks.request.message;

import com.hisense.connect_life.hismart.networks.request.message.model.MessageSwitchResponse;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J0\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0005H&JH\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/IMessageService;", "", "generateMessageChannel", "", "callback", "Lkotlin/Function1;", "", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "isSocket", "", "getMessageSwitch", "Lio/reactivex/disposables/Disposable;", "success", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageSwitchResponse;", "failure", "", "updateMessageSwitch", "wifiId", "", "deviceId", "needPush", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IMessageService.kt */
public interface IMessageService {
    void generateMessageChannel(@NotNull Function1<? super List<PushMessage>, Unit> function1);

    void generateMessageChannel(boolean z, @NotNull Function1<? super List<PushMessage>, Unit> function1);

    @NotNull
    C9207b getMessageSwitch(@NotNull Function1<? super MessageSwitchResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateMessageSwitch(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
