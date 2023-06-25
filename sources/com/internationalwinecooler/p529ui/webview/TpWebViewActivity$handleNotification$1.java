package com.internationalwinecooler.p529ui.webview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.NotificationHelper;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connectlife.sql.NotificationProvider;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.TpWebViewActivity$handleNotification$1", mo48701f = "TpWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.webview.TpWebViewActivity$handleNotification$1 */
/* compiled from: TpWebViewActivity.kt */
public final class TpWebViewActivity$handleNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $count;
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ String $nameNot;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TpWebViewActivity this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.TpWebViewActivity$handleNotification$1$1", mo48701f = "TpWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.webview.TpWebViewActivity$handleNotification$1$1 */
    /* compiled from: TpWebViewActivity.kt */
    public static final class C87151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87151(tpWebViewActivity, i, str, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap decodeResource = BitmapFactory.decodeResource(tpWebViewActivity.getResources(), R.mipmap.hisense_launcher);
                Intrinsics.checkNotNullExpressionValue(decodeResource, "decodeResource(\n        …                        )");
                String access$getWineCoolerName = tpWebViewActivity.getWineCoolerName(str);
                Intrinsics.checkNotNull(access$getWineCoolerName);
                NotificationHelper.INSTANCE.publishNotification(tpWebViewActivity, (int) System.currentTimeMillis(), decodeResource, R.drawable.icon_notification_small, i + tpWebViewActivity.getString(R.string.bottls_added), access$getWineCoolerName);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TpWebViewActivity$handleNotification$1(int i, TpWebViewActivity tpWebViewActivity, String str, String str2, Continuation<? super TpWebViewActivity$handleNotification$1> continuation) {
        super(2, continuation);
        this.$count = i;
        this.this$0 = tpWebViewActivity;
        this.$deviceId = str;
        this.$nameNot = str2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TpWebViewActivity$handleNotification$1 tpWebViewActivity$handleNotification$1 = new TpWebViewActivity$handleNotification$1(this.$count, this.this$0, this.$deviceId, this.$nameNot, continuation);
        tpWebViewActivity$handleNotification$1.L$0 = obj;
        return tpWebViewActivity$handleNotification$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TpWebViewActivity$handleNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH)) {
                NotificationProvider notificationProvider = NotificationRoom.Companion.notificationProvider();
                String customerId = SPManagerKt.getCustomerId();
                Notification notification = notification2;
                Notification notification2 = new Notification(Boxing.boxInt(0), customerId, this.$deviceId, 1, this.$count + ' ' + this.this$0.getString(R.string.bottls_added), this.$nameNot, 2, KeyConst.MSG_ADD_WINE, new Date().getTime(), false, 1, 1, "", "1", 0, 16384, (DefaultConstructorMarker) null);
                notificationProvider.insert(notification);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                final TpWebViewActivity tpWebViewActivity = this.this$0;
                final int i = this.$count;
                final String str = this.$deviceId;
                Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, main, (CoroutineStart) null, new C87151((Continuation<? super C87151>) null), 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
