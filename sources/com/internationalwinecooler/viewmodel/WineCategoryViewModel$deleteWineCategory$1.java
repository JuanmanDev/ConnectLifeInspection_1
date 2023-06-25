package com.internationalwinecooler.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.wine.IWineCategoryManager;
import com.internationalwinecooler.p529ui.DeleteModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.viewmodel.WineCategoryViewModel$deleteWineCategory$1", mo48701f = "WineCategoryViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: WineCategoryViewModel.kt */
public final class WineCategoryViewModel$deleteWineCategory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ List<String> $idCategoryList;
    public int label;
    public final /* synthetic */ WineCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCategoryViewModel$deleteWineCategory$1(List<String> list, WineCategoryViewModel wineCategoryViewModel, String str, Continuation<? super WineCategoryViewModel$deleteWineCategory$1> continuation) {
        super(2, continuation);
        this.$idCategoryList = list;
        this.this$0 = wineCategoryViewModel;
        this.$deviceId = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineCategoryViewModel$deleteWineCategory$1(this.$idCategoryList, this.this$0, this.$deviceId, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineCategoryViewModel$deleteWineCategory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.$idCategoryList);
                if (arrayList.isEmpty()) {
                    this.this$0.getRemoveWineSucLiveData().postValue(new Pair(Boxing.boxBoolean(true), arrayList));
                } else {
                    IWineCategoryManager wineManager = this.this$0.getWineManager();
                    String str = this.$deviceId;
                    final List<String> list = this.$idCategoryList;
                    final WineCategoryViewModel wineCategoryViewModel = this.this$0;
                    C87171 r2 = new Function1<HiResponse, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((HiResponse) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull HiResponse hiResponse) {
                            Intrinsics.checkNotNullParameter(hiResponse, LanguageConstKt.f15954it);
                            if (hiResponse.getResultCode() == 0) {
                                EventBus.getDefault().post(new DeleteModel(list, true));
                                wineCategoryViewModel.getRemoveWineSucLiveData().postValue(new Pair(Boolean.TRUE, list));
                                return;
                            }
                            wineCategoryViewModel.getRemoveWineSucLiveData().postValue(new Pair(Boolean.FALSE, list));
                        }
                    };
                    final WineCategoryViewModel wineCategoryViewModel2 = this.this$0;
                    final List<String> list2 = this.$idCategoryList;
                    wineManager.deleteWineCategories(arrayList, str, r2, new Function1<Throwable, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Throwable) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Throwable th) {
                            wineCategoryViewModel2.getRemoveWineSucLiveData().postValue(new Pair(Boolean.FALSE, list2));
                        }
                    });
                }
            } catch (JSONException e) {
                e.printStackTrace();
                this.this$0.getRemoveWineSucLiveData().postValue(new Pair(Boxing.boxBoolean(false), this.$idCategoryList));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
