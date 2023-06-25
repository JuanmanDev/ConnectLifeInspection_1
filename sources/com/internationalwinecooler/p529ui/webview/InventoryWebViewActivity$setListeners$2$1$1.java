package com.internationalwinecooler.p529ui.webview;

import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.internationalwinecooler.p529ui.DeleteModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.InventoryWebViewActivity$setListeners$2$1$1", mo48701f = "InventoryWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.webview.InventoryWebViewActivity$setListeners$2$1$1 */
/* compiled from: InventoryWebViewActivity.kt */
public final class InventoryWebViewActivity$setListeners$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Pair<List<WineBaseInfo>, Boolean> $it;
    public int label;
    public final /* synthetic */ InventoryWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWebViewActivity$setListeners$2$1$1(Pair<? extends List<WineBaseInfo>, Boolean> pair, InventoryWebViewActivity inventoryWebViewActivity, Continuation<? super InventoryWebViewActivity$setListeners$2$1$1> continuation) {
        super(2, continuation);
        this.$it = pair;
        this.this$0 = inventoryWebViewActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryWebViewActivity$setListeners$2$1$1(this.$it, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryWebViewActivity$setListeners$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (this.$it.getFirst() != null) {
                String deviceId = ((WineBaseInfo) this.$it.getFirst().get(0)).getDeviceId();
                if (deviceId != null) {
                    objectRef.element = this.this$0.getWineCoolerName(deviceId);
                }
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = new ArrayList();
                for (WineBaseInfo inventoryId : this.$it.getFirst()) {
                    ((List) objectRef2.element).add(String.valueOf(inventoryId.getInventoryId()));
                }
                EventBus.getDefault().post(new DeleteModel((List) objectRef2.element, false));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
