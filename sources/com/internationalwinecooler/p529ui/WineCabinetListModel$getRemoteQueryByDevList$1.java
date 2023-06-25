package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
/* renamed from: com.internationalwinecooler.ui.WineCabinetListModel$getRemoteQueryByDevList$1 */
/* compiled from: WineCabinetListModel.kt */
public final class WineCabinetListModel$getRemoteQueryByDevList$1 extends Lambda implements Function1<HiWineCabinetResult, Unit> {
    public final /* synthetic */ List<String> $deviceIdList;
    public final /* synthetic */ FilterCondition $filterCondition;
    public final /* synthetic */ boolean $h5used;
    public final /* synthetic */ MutableLiveData<List<WineBaseInfo>> $remoteLiveDataForH5;
    public final /* synthetic */ WineCabinetListModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineCabinetListModel$getRemoteQueryByDevList$1$1", mo48701f = "WineCabinetListModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.WineCabinetListModel$getRemoteQueryByDevList$1$1 */
    /* compiled from: WineCabinetListModel.kt */
    public static final class C86531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86531(hiWineCabinetResult2, filterCondition, wineCabinetListModel, list, z, mutableLiveData, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[Catch:{ Exception -> 0x01a5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0096 A[Catch:{ Exception -> 0x01a5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff A[Catch:{ Exception -> 0x01a5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x013e A[Catch:{ Exception -> 0x01a5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x003b A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x00e0 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x011f A[SYNTHETIC] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.label
                if (r0 != 0) goto L_0x01ac
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x01a5 }
                r9.<init>()     // Catch:{ Exception -> 0x01a5 }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x01a5 }
                r0.<init>()     // Catch:{ Exception -> 0x01a5 }
                r9.element = r0     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult r0 = r5     // Catch:{ Exception -> 0x01a5 }
                java.util.List r0 = r0.getDeviceIdList()     // Catch:{ Exception -> 0x01a5 }
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0029
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x01a5 }
                if (r0 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r0 = r2
            L_0x002a:
                java.lang.String r3 = ""
                if (r0 != 0) goto L_0x017b
                com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult r0 = r5     // Catch:{ Exception -> 0x01a5 }
                java.util.List r0 = r0.getDeviceIdList()     // Catch:{ Exception -> 0x01a5 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x003b:
                boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r4 == 0) goto L_0x0082
                java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.networks.request.wine.model.DeviceZone r4 = (com.hisense.connect_life.hismart.networks.request.wine.model.DeviceZone) r4     // Catch:{ Exception -> 0x01a5 }
                java.util.List r5 = r4.getInventoryList()     // Catch:{ Exception -> 0x01a5 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ Exception -> 0x01a5 }
                if (r5 == 0) goto L_0x0059
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x01a5 }
                if (r5 == 0) goto L_0x0057
                goto L_0x0059
            L_0x0057:
                r5 = r1
                goto L_0x005a
            L_0x0059:
                r5 = r2
            L_0x005a:
                if (r5 != 0) goto L_0x003b
                java.util.List r5 = r4.getInventoryList()     // Catch:{ Exception -> 0x01a5 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x0067:
                boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r6 == 0) goto L_0x003b
                java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r6 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r6     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r7 = r4.getDeviceId()     // Catch:{ Exception -> 0x01a5 }
                r6.setDeviceId(r7)     // Catch:{ Exception -> 0x01a5 }
                T r7 = r9.element     // Catch:{ Exception -> 0x01a5 }
                java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x01a5 }
                r7.add(r6)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x0067
            L_0x0082:
                com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult r0 = r5     // Catch:{ Exception -> 0x01a5 }
                java.util.List r0 = r0.getDeviceIdList()     // Catch:{ Exception -> 0x01a5 }
                if (r0 == 0) goto L_0x0093
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x01a5 }
                if (r0 == 0) goto L_0x0091
                goto L_0x0093
            L_0x0091:
                r0 = r1
                goto L_0x0094
            L_0x0093:
                r0 = r2
            L_0x0094:
                if (r0 != 0) goto L_0x014a
                com.hisense.connect_life.hismart.networks.request.HiWineCabinetResult r0 = r5     // Catch:{ Exception -> 0x01a5 }
                java.util.List r0 = r0.getDeviceIdList()     // Catch:{ Exception -> 0x01a5 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ Exception -> 0x01a5 }
                int r0 = r0.size()     // Catch:{ Exception -> 0x01a5 }
                if (r0 <= 0) goto L_0x014a
                com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition r0 = r6     // Catch:{ Exception -> 0x01a5 }
                if (r0 != 0) goto L_0x00bb
                com.internationalwinecooler.ui.WineCabinetListModel r0 = r7     // Catch:{ Exception -> 0x01a5 }
                androidx.lifecycle.MutableLiveData r0 = r0.getRemoteLiveData()     // Catch:{ Exception -> 0x01a5 }
                kotlin.Pair r1 = new kotlin.Pair     // Catch:{ Exception -> 0x01a5 }
                T r2 = r9.element     // Catch:{ Exception -> 0x01a5 }
                r1.<init>(r3, r2)     // Catch:{ Exception -> 0x01a5 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x014a
            L_0x00bb:
                com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition r0 = r6     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r0 = r0.getDeviceId()     // Catch:{ Exception -> 0x01a5 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01a5 }
                if (r0 != 0) goto L_0x010c
                com.internationalwinecooler.ui.WineCabinetListModel r0 = r7     // Catch:{ Exception -> 0x01a5 }
                androidx.lifecycle.MutableLiveData r0 = r0.getRemoteLiveData()     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition r3 = r6     // Catch:{ Exception -> 0x01a5 }
                java.lang.String r3 = r3.getDeviceId()     // Catch:{ Exception -> 0x01a5 }
                T r4 = r9.element     // Catch:{ Exception -> 0x01a5 }
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ Exception -> 0x01a5 }
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01a5 }
                r5.<init>()     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x00e0:
                boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r6 == 0) goto L_0x0103
                java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x01a5 }
                r7 = r6
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r7 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r7     // Catch:{ Exception -> 0x01a5 }
                java.lang.Integer r7 = r7.getFiltered()     // Catch:{ Exception -> 0x01a5 }
                if (r7 != 0) goto L_0x00f4
                goto L_0x00fc
            L_0x00f4:
                int r7 = r7.intValue()     // Catch:{ Exception -> 0x01a5 }
                if (r7 != r2) goto L_0x00fc
                r7 = r2
                goto L_0x00fd
            L_0x00fc:
                r7 = r1
            L_0x00fd:
                if (r7 == 0) goto L_0x00e0
                r5.add(r6)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x00e0
            L_0x0103:
                kotlin.Pair r1 = new kotlin.Pair     // Catch:{ Exception -> 0x01a5 }
                r1.<init>(r3, r5)     // Catch:{ Exception -> 0x01a5 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x014a
            L_0x010c:
                com.internationalwinecooler.ui.WineCabinetListModel r0 = r7     // Catch:{ Exception -> 0x01a5 }
                androidx.lifecycle.MutableLiveData r0 = r0.getRemoteLiveData()     // Catch:{ Exception -> 0x01a5 }
                T r4 = r9.element     // Catch:{ Exception -> 0x01a5 }
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ Exception -> 0x01a5 }
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01a5 }
                r5.<init>()     // Catch:{ Exception -> 0x01a5 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x01a5 }
            L_0x011f:
                boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x01a5 }
                if (r6 == 0) goto L_0x0142
                java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x01a5 }
                r7 = r6
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r7 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r7     // Catch:{ Exception -> 0x01a5 }
                java.lang.Integer r7 = r7.getFiltered()     // Catch:{ Exception -> 0x01a5 }
                if (r7 != 0) goto L_0x0133
                goto L_0x013b
            L_0x0133:
                int r7 = r7.intValue()     // Catch:{ Exception -> 0x01a5 }
                if (r7 != r2) goto L_0x013b
                r7 = r2
                goto L_0x013c
            L_0x013b:
                r7 = r1
            L_0x013c:
                if (r7 == 0) goto L_0x011f
                r5.add(r6)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x011f
            L_0x0142:
                kotlin.Pair r1 = new kotlin.Pair     // Catch:{ Exception -> 0x01a5 }
                r1.<init>(r3, r5)     // Catch:{ Exception -> 0x01a5 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x01a5 }
            L_0x014a:
                com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition r0 = r6     // Catch:{ Exception -> 0x01a5 }
                if (r0 != 0) goto L_0x018b
                java.util.List<java.lang.String> r0 = r8     // Catch:{ Exception -> 0x01a5 }
                int r0 = r0.size()     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r1 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r1 = r1.getInstance()     // Catch:{ Exception -> 0x01a5 }
                java.util.List r1 = r1.getDeviceList()     // Catch:{ Exception -> 0x01a5 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x01a5 }
                if (r0 != r1) goto L_0x018b
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r0 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r0 = r0.loginUserInfoProvider()     // Catch:{ Exception -> 0x01a5 }
                r0.deleteAllWineInventoryNew()     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r0 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x01a5 }
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r0 = r0.loginUserInfoProvider()     // Catch:{ Exception -> 0x01a5 }
                T r1 = r9.element     // Catch:{ Exception -> 0x01a5 }
                java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x01a5 }
                r0.insertWineInventoryNew(r1)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x018b
            L_0x017b:
                com.internationalwinecooler.ui.WineCabinetListModel r0 = r7     // Catch:{ Exception -> 0x01a5 }
                androidx.lifecycle.MutableLiveData r0 = r0.getRemoteLiveData()     // Catch:{ Exception -> 0x01a5 }
                kotlin.Pair r1 = new kotlin.Pair     // Catch:{ Exception -> 0x01a5 }
                T r2 = r9.element     // Catch:{ Exception -> 0x01a5 }
                r1.<init>(r3, r2)     // Catch:{ Exception -> 0x01a5 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x01a5 }
            L_0x018b:
                boolean r0 = r9     // Catch:{ Exception -> 0x01a5 }
                if (r0 == 0) goto L_0x019d
                org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.getDefault()     // Catch:{ Exception -> 0x01a5 }
                com.internationalwinecooler.ui.AddWineSuccessModel r1 = new com.internationalwinecooler.ui.AddWineSuccessModel     // Catch:{ Exception -> 0x01a5 }
                r2 = 0
                r1.<init>(r2)     // Catch:{ Exception -> 0x01a5 }
                r0.post(r1)     // Catch:{ Exception -> 0x01a5 }
            L_0x019d:
                androidx.lifecycle.MutableLiveData<java.util.List<com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo>> r0 = r10     // Catch:{ Exception -> 0x01a5 }
                T r9 = r9.element     // Catch:{ Exception -> 0x01a5 }
                r0.postValue(r9)     // Catch:{ Exception -> 0x01a5 }
                goto L_0x01a9
            L_0x01a5:
                r9 = move-exception
                r9.printStackTrace()
            L_0x01a9:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L_0x01ac:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineCabinetListModel$getRemoteQueryByDevList$1.C86531.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCabinetListModel$getRemoteQueryByDevList$1(WineCabinetListModel wineCabinetListModel, MutableLiveData<List<WineBaseInfo>> mutableLiveData, FilterCondition filterCondition, List<String> list, boolean z) {
        super(1);
        this.this$0 = wineCabinetListModel;
        this.$remoteLiveDataForH5 = mutableLiveData;
        this.$filterCondition = filterCondition;
        this.$deviceIdList = list;
        this.$h5used = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiWineCabinetResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull HiWineCabinetResult hiWineCabinetResult) {
        Intrinsics.checkNotNullParameter(hiWineCabinetResult, LanguageConstKt.f15954it);
        if (TextUtils.equals(hiWineCabinetResult.getResultCode(), "0")) {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
            CoroutineDispatcher io = Dispatchers.getIO();
            final FilterCondition filterCondition = this.$filterCondition;
            final WineCabinetListModel wineCabinetListModel = this.this$0;
            final List<String> list = this.$deviceIdList;
            final boolean z = this.$h5used;
            final MutableLiveData<List<WineBaseInfo>> mutableLiveData = this.$remoteLiveDataForH5;
            final HiWineCabinetResult hiWineCabinetResult2 = hiWineCabinetResult;
            Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C86531((Continuation<? super C86531>) null), 2, (Object) null);
        } else if (!TextUtils.equals(hiWineCabinetResult.getResultCode(), "1") || !TextUtils.equals(hiWineCabinetResult.getErrorCode(), "300002")) {
            this.$remoteLiveDataForH5.postValue(CollectionsKt__CollectionsKt.emptyList());
        } else {
            this.$remoteLiveDataForH5.postValue(CollectionsKt__CollectionsKt.emptyList());
        }
        this.$remoteLiveDataForH5.postValue(CollectionsKt__CollectionsKt.emptyList());
        SPUtils.INSTANCE.put(KeyConst.SP_Query_By_Dev_List, Long.valueOf(hiWineCabinetResult.getLastUpdateTime()));
    }
}
