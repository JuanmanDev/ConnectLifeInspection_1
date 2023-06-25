package com.juconnect.connect_life;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.hisense.connect_life.core.utils.NotificationHelper;
import com.hisense.juconnect.connectlife.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.juconnect.connect_life.MainActivity$subscribeMsgObservable$1$onAlarmMessage$1", mo48701f = "MainActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: MainActivity.kt */
public final class MainActivity$subscribeMsgObservable$1$onAlarmMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<String> $content;
    public final /* synthetic */ PendingIntent $pendingIntent;
    public final /* synthetic */ Ref.ObjectRef<String> $title;
    public int label;
    public final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainActivity$subscribeMsgObservable$1$onAlarmMessage$1(MainActivity mainActivity, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, PendingIntent pendingIntent, Continuation<? super MainActivity$subscribeMsgObservable$1$onAlarmMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$title = objectRef;
        this.$content = objectRef2;
        this.$pendingIntent = pendingIntent;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainActivity$subscribeMsgObservable$1$onAlarmMessage$1(this.this$0, this.$title, this.$content, this.$pendingIntent, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MainActivity$subscribeMsgObservable$1$onAlarmMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap decodeResource = BitmapFactory.decodeResource(this.this$0.getResources(), R.mipmap.hisense_launcher);
            Intrinsics.checkNotNullExpressionValue(decodeResource, "decodeResource(resources….mipmap.hisense_launcher)");
            NotificationHelper.INSTANCE.publishNotification((Context) this.this$0, (int) System.currentTimeMillis(), decodeResource, (int) R.drawable.icon_notification_small, (String) this.$title.element, (String) this.$content.element, this.$pendingIntent);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
