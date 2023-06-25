package com.hisense.juconnect.app_device.activity;

import com.google.gson.Gson;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.wine.inventory.manager.WineInventoryService;
import com.juconnect.vivino.Vivino;
import com.juconnect.vivino.model.HiVintage;
import java.io.File;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
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
import p040c.p525z.p526a.C7820f;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.VivinoViewModel$scanLabel$1", mo48701f = "VivinoViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: VivinoViewModel.kt */
public final class VivinoViewModel$scanLabel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ File $file;
    public int label;
    public final /* synthetic */ VivinoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VivinoViewModel$scanLabel$1(File file, VivinoViewModel vivinoViewModel, Continuation<? super VivinoViewModel$scanLabel$1> continuation) {
        super(2, continuation);
        this.$file = file;
        this.this$0 = vivinoViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VivinoViewModel$scanLabel$1(this.$file, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((VivinoViewModel$scanLabel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Vivino.Companion companion = Vivino.Companion;
            File file = this.$file;
            final VivinoViewModel vivinoViewModel = this.this$0;
            C85981 r1 = new Function1<HiVintage, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiVintage) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable HiVintage hiVintage) {
                    int i = 0;
                    if (hiVintage != null) {
                        C7820f.m21850d(Intrinsics.stringPlus("labelScan success: ", new Gson().toJson((Object) hiVintage, (Type) HiVintage.class)), new Object[0]);
                        vivinoViewModel.getVivinoScanLiveData().postValue(new Pair(Boolean.TRUE, hiVintage));
                    } else {
                        vivinoViewModel.getVivinoScanLiveData().postValue(new Pair(Boolean.FALSE, null));
                    }
                    WineInventoryService wineWineInventoryManagerSerivce = HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce();
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    if (hiVintage == null) {
                        i = 1;
                    }
                    wineWineInventoryManagerSerivce.vivinoInvoke(uuid, 2, i, C85991.INSTANCE, C86002.INSTANCE);
                }
            };
            final VivinoViewModel vivinoViewModel2 = this.this$0;
            companion.scanLabel(file, r1, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Throwable th) {
                    C7820f.m21850d(Intrinsics.stringPlus("labelScan error: ", th), new Object[0]);
                    vivinoViewModel2.getVivinoScanLiveData().postValue(new Pair(Boolean.FALSE, null));
                    WineInventoryService wineWineInventoryManagerSerivce = HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce();
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    wineWineInventoryManagerSerivce.vivinoInvoke(uuid, 2, 1, C86021.INSTANCE, C86032.INSTANCE);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
