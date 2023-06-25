package com.internationalwinecooler.p529ui;

import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.internationalwinecooler.model.JsResp;
import java.lang.reflect.Type;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateWineInfo$2 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$updateWineInfo$2 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ Ref.ObjectRef<WineBaseInfo> $baseInfo;
    public final /* synthetic */ Type $listType;
    public final /* synthetic */ String $model;
    public final /* synthetic */ WineWebViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$updateWineInfo$2$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateWineInfo$2$1 */
    /* compiled from: WineWebViewModel.kt */
    public static final class C87031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87031(wineWebViewModel, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                wineWebViewModel.executeFailCallback("接口报错", WebActionEnum.UPDATE_WINE_INFO_CALLBACK);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$updateWineInfo$2(Ref.ObjectRef<WineBaseInfo> objectRef, String str, Type type, WineWebViewModel wineWebViewModel) {
        super(1);
        this.$baseInfo = objectRef;
        this.$model = str;
        this.$listType = type;
        this.this$0 = wineWebViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (z) {
            LoginUserInfoRoom.Companion.loginUserInfoProvider().updateWineInventoryNew((WineBaseInfo) this.$baseInfo.element);
            this.this$0.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.UPDATE_WINE_INFO_CALLBACK, C1502i.m930j(new JsResp(new Gson().fromJson(this.$model, this.$listType), 0, (String) null, 6, (DefaultConstructorMarker) null))));
            return;
        }
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        final WineWebViewModel wineWebViewModel = this.this$0;
        Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, main, (CoroutineStart) null, new C87031((Continuation<? super C87031>) null), 2, (Object) null);
    }
}
