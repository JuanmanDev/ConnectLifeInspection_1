package com.internationalwinecooler.p529ui;

import com.google.gson.Gson;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.internationalwinecooler.model.AddWineData;
import com.internationalwinecooler.model.JsResp;
import com.juconnect.vivino.VivinoCache;
import com.juconnect.vivino.model.HiVintage;
import com.juconnect.vivino.model.HiWine;
import com.juconnect.vivino.model.WineImage;
import com.juconnect.vivino.model.WineRank;
import com.juconnect.vivino.model.WineStatistic;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$showWineDataExe$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$showWineDataExe$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$showWineDataExe$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $imageBase64;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$showWineDataExe$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$showWineDataExe$1> continuation) {
        super(2, continuation);
        this.$imageBase64 = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$showWineDataExe$1(this.$imageBase64, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$showWineDataExe$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JsResp jsResp;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LoggerUtil.Companion.mo39146e("showWineDataExe   imageBase64压缩图片");
            HiVintage cache = VivinoCache.Companion.getCache();
            if (cache != null) {
                LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("showWineDataExe   hiVintage ", cache));
                jsResp = new JsResp(new AddWineData(cache, this.$imageBase64), 0, (String) null, 6, (DefaultConstructorMarker) null);
            } else {
                jsResp = new JsResp(new AddWineData(new HiVintage(0, (String) null, (String) null, (String) null, (WineStatistic) null, (WineImage) null, (HiWine) null, (String) null, (List) null, (Map) null, (WineRank) null, 2047, (DefaultConstructorMarker) null), this.$imageBase64), -1, (String) null, 4, (DefaultConstructorMarker) null);
            }
            String json = new Gson().toJson((Object) jsResp);
            if (json == null) {
                json = "";
            }
            this.this$0.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.SHOW_WINE_DATA_CALLBACK, json));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
