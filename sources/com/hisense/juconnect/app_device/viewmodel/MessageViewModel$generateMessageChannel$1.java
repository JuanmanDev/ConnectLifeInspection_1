package com.hisense.juconnect.app_device.viewmodel;

import com.google.gson.Gson;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.message.IMessageService;
import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.room.Notification;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.MessageViewModel$generateMessageChannel$1", mo48701f = "MessageViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: MessageViewModel.kt */
public final class MessageViewModel$generateMessageChannel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $context;
    public int label;
    public final /* synthetic */ MessageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageViewModel$generateMessageChannel$1(MessageViewModel messageViewModel, String str, Continuation<? super MessageViewModel$generateMessageChannel$1> continuation) {
        super(2, continuation);
        this.this$0 = messageViewModel;
        this.$context = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MessageViewModel$generateMessageChannel$1(this.this$0, this.$context, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MessageViewModel$generateMessageChannel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IMessageService messageService = HiSmart.Companion.getInstance().messageService();
            final MessageViewModel messageViewModel = this.this$0;
            final String str = this.$context;
            messageService.generateMessageChannel(true, new Function1<List<? extends PushMessage>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<PushMessage>) (List) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<PushMessage> list) {
                    String str;
                    List<PushMessage> list2 = list;
                    Intrinsics.checkNotNullParameter(list2, LanguageConstKt.f15954it);
                    if (list.isEmpty() || !SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH)) {
                        LoggerUtil.Companion.mo39146e("generateMessageChannel === it is empty");
                        messageViewModel.getUnReadMessageLiveData().postValue(null);
                        return;
                    }
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("generateMessageChannel === ", list2));
                    ArrayList arrayList = new ArrayList();
                    String str2 = str;
                    for (PushMessage pushMessage : list) {
                        Object fromJson = new Gson().fromJson(pushMessage.getContent(), AlarmMessage.class);
                        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(it.conte…AlarmMessage::class.java)");
                        AlarmMessage alarmMessage = (AlarmMessage) fromJson;
                        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("generateMessageChannel alarmMessage ", alarmMessage));
                        alarmMessage.setMsgId(pushMessage.getMsgId());
                        alarmMessage.setMsgLevel(pushMessage.getMsgLevel());
                        alarmMessage.setExpireTime(pushMessage.getExpireTime());
                        alarmMessage.setStartTime(pushMessage.getStartTime());
                        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("generateMessageChannel alarmMessage ", alarmMessage));
                        List<Notification> findExist = NotificationRoom.Companion.notificationProvider().findExist(pushMessage.getMsgId());
                        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("generateMessageChannel msgList ", findExist == null ? null : findExist.toString()));
                        if (findExist == null || findExist.isEmpty()) {
                            Notification notification = r4;
                            str = str2;
                            Notification notification2 = new Notification((Integer) null, SPManagerKt.getCustomerId(), alarmMessage.getDeviceId(), pushMessage.getFormatId(), alarmMessage.getWarning(), str2, alarmMessage.getMsgLevel(), KeyConst.MSG_ALARM, pushMessage.getStartTime(), false, pushMessage.getStartTime(), pushMessage.getExpireTime(), alarmMessage.getMsgId(), "1", 0);
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("generateMessageChannel notification ", notification.toString()));
                            Notification notification3 = notification;
                            NotificationRoom.Companion.notificationProvider().insert(notification3);
                            arrayList.add(notification3);
                        } else {
                            str = str2;
                        }
                        str2 = str;
                    }
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("generateMessageChannel filter ", arrayList.toString()));
                    if (arrayList.isEmpty()) {
                        messageViewModel.getUnReadMessageLiveData().postValue(null);
                    } else {
                        messageViewModel.getUnReadMessageLiveData().postValue(arrayList);
                    }
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
