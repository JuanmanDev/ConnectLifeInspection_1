package com.hisense.juconnect.app_device.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/HiWineCabinetResult;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$getRemoteQueryByDevList$1 extends Lambda implements Function1<HiWineCabinetResult, Unit> {
    public final /* synthetic */ List<String> $deviceIdList;
    public final /* synthetic */ FilterCondition $filterCondition;
    public final /* synthetic */ DeviceViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$getRemoteQueryByDevList$1$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$getRemoteQueryByDevList$1$1 */
    /* compiled from: DeviceViewModel.kt */
    public static final class C86231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86231(hiWineCabinetResult, filterCondition, list, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[Catch:{ Exception -> 0x00b6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[Catch:{ Exception -> 0x00b6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0039 A[SYNTHETIC] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r7.label
                if (r0 != 0) goto L_0x00bd
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x00b6 }
                r8.<init>()     // Catch:{ Exception -> 0x00b6 }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b6 }
                r0.<init>()     // Catch:{ Exception -> 0x00b6 }
                r8.element = r0     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult r0 = r8     // Catch:{ Exception -> 0x00b6 }
                java.util.List r0 = r0.getDeviceIdList()     // Catch:{ Exception -> 0x00b6 }
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0029
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00b6 }
                if (r0 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r0 = r2
            L_0x002a:
                if (r0 != 0) goto L_0x00ba
                com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult r0 = r8     // Catch:{ Exception -> 0x00b6 }
                java.util.List r0 = r0.getDeviceIdList()     // Catch:{ Exception -> 0x00b6 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ Exception -> 0x00b6 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b6 }
            L_0x0039:
                boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x00b6 }
                if (r3 == 0) goto L_0x0080
                java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.networks.request.wine.model.DeviceZone r3 = (com.hisense.connect_life.hismart.networks.request.wine.model.DeviceZone) r3     // Catch:{ Exception -> 0x00b6 }
                java.util.List r4 = r3.getInventoryList()     // Catch:{ Exception -> 0x00b6 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ Exception -> 0x00b6 }
                if (r4 == 0) goto L_0x0057
                boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x00b6 }
                if (r4 == 0) goto L_0x0055
                goto L_0x0057
            L_0x0055:
                r4 = r1
                goto L_0x0058
            L_0x0057:
                r4 = r2
            L_0x0058:
                if (r4 != 0) goto L_0x0039
                java.util.List r4 = r3.getInventoryList()     // Catch:{ Exception -> 0x00b6 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ Exception -> 0x00b6 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00b6 }
            L_0x0065:
                boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00b6 }
                if (r5 == 0) goto L_0x0039
                java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r5 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r5     // Catch:{ Exception -> 0x00b6 }
                java.lang.String r6 = r3.getDeviceId()     // Catch:{ Exception -> 0x00b6 }
                r5.setDeviceId(r6)     // Catch:{ Exception -> 0x00b6 }
                T r6 = r8.element     // Catch:{ Exception -> 0x00b6 }
                java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x00b6 }
                r6.add(r5)     // Catch:{ Exception -> 0x00b6 }
                goto L_0x0065
            L_0x0080:
                com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition r0 = r0     // Catch:{ Exception -> 0x00b6 }
                if (r0 != 0) goto L_0x00ba
                java.util.List<java.lang.String> r0 = r5     // Catch:{ Exception -> 0x00b6 }
                int r0 = r0.size()     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()     // Catch:{ Exception -> 0x00b6 }
                java.util.List r1 = r1.getDeviceList()     // Catch:{ Exception -> 0x00b6 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x00b6 }
                if (r0 != r1) goto L_0x00ba
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r0 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r0 = r0.loginUserInfoProvider()     // Catch:{ Exception -> 0x00b6 }
                r0.deleteAllWineInventoryNew()     // Catch:{ Exception -> 0x00b6 }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r0 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x00b1 }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r0 = r0.loginUserInfoProvider()     // Catch:{ Exception -> 0x00b1 }
                T r8 = r8.element     // Catch:{ Exception -> 0x00b1 }
                java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00b1 }
                r0.insertWineInventoryNew(r8)     // Catch:{ Exception -> 0x00b1 }
                goto L_0x00ba
            L_0x00b1:
                r8 = move-exception
                r8.toString()     // Catch:{ Exception -> 0x00b6 }
                goto L_0x00ba
            L_0x00b6:
                r8 = move-exception
                r8.printStackTrace()
            L_0x00ba:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L_0x00bd:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$getRemoteQueryByDevList$1.C86231.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$getRemoteQueryByDevList$1(DeviceViewModel deviceViewModel, FilterCondition filterCondition, List<String> list) {
        super(1);
        this.this$0 = deviceViewModel;
        this.$filterCondition = filterCondition;
        this.$deviceIdList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiWineCabinetResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final HiWineCabinetResult hiWineCabinetResult) {
        Intrinsics.checkNotNullParameter(hiWineCabinetResult, LanguageConstKt.f15954it);
        if (TextUtils.equals(hiWineCabinetResult.getResultCode(), "0")) {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
            CoroutineDispatcher io = Dispatchers.getIO();
            final FilterCondition filterCondition = this.$filterCondition;
            final List<String> list = this.$deviceIdList;
            Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C86231((Continuation<? super C86231>) null), 2, (Object) null);
        }
    }
}
