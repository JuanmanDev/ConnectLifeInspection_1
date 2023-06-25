package com.internationalwinecooler.p529ui;

import com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineCabinetListModel$updateWineCabinetRoom$1", mo48701f = "WineCabinetListModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineCabinetListModel$updateWineCabinetRoom$1 */
/* compiled from: WineCabinetListModel.kt */
public final class WineCabinetListModel$updateWineCabinetRoom$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ FavoriteModel $favoriteModel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCabinetListModel$updateWineCabinetRoom$1(FavoriteModel favoriteModel, Continuation<? super WineCabinetListModel$updateWineCabinetRoom$1> continuation) {
        super(2, continuation);
        this.$favoriteModel = favoriteModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineCabinetListModel$updateWineCabinetRoom$1(this.$favoriteModel, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineCabinetListModel$updateWineCabinetRoom$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LoginUserInfoProvider loginUserInfoProvider = LoginUserInfoRoom.Companion.loginUserInfoProvider();
            FavoriteModel favoriteModel = this.$favoriteModel;
            Intrinsics.checkNotNull(favoriteModel);
            String categoryId = favoriteModel.getCategoryId();
            Intrinsics.checkNotNull(categoryId);
            FavoriteModel favoriteModel2 = this.$favoriteModel;
            Intrinsics.checkNotNull(favoriteModel2);
            loginUserInfoProvider.updateFavoriteByCatetoryId(categoryId, favoriteModel2.getFavorite());
            EventBus.getDefault().post(new RefreshWineFragment(true));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
