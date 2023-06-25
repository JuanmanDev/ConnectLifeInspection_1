package com.internationalwinecooler.p529ui;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getAllSameWinesInDevice$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getAllSameWinesInDevice$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getAllSameWinesInDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getAllSameWinesInDevice$1$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getAllSameWinesInDevice$1$1 */
    /* compiled from: WineWebViewModel.kt */
    public static final class C86541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86541(wineWebViewModel, str, list2, wineBaseInfo, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:75:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0215  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r0.label
                if (r1 != 0) goto L_0x041a
                kotlin.ResultKt.throwOnFailure(r25)
                com.internationalwinecooler.ui.WineWebViewModel r1 = r3
                r1.testLogAllWine()
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r1 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion
                com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r1 = r1.loginUserInfoProvider()
                java.lang.String r2 = r4
                java.util.List r1 = r1.getAllWineInventoryByDeviceId(r2)
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r2 = r6
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0028:
                boolean r4 = r1.hasNext()
                r5 = 1
                if (r4 == 0) goto L_0x009a
                java.lang.Object r4 = r1.next()
                r7 = r4
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r7 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r7
                java.lang.String r8 = r2.getCategoryId()
                if (r8 == 0) goto L_0x0045
                int r8 = r8.length()
                if (r8 != 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r8 = 0
                goto L_0x0046
            L_0x0045:
                r8 = r5
            L_0x0046:
                if (r8 != 0) goto L_0x0061
                java.lang.String r8 = r2.getCategoryId()
                java.lang.String r9 = "0"
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
                if (r8 != 0) goto L_0x0061
                java.lang.String r8 = r2.getCategoryId()
                java.lang.String r9 = r7.getCategoryId()
                boolean r8 = android.text.TextUtils.equals(r8, r9)
                goto L_0x0062
            L_0x0061:
                r8 = 0
            L_0x0062:
                java.lang.String r9 = r2.getVivinoId()
                if (r9 == 0) goto L_0x0071
                int r9 = r9.length()
                if (r9 != 0) goto L_0x006f
                goto L_0x0071
            L_0x006f:
                r9 = 0
                goto L_0x0072
            L_0x0071:
                r9 = r5
            L_0x0072:
                if (r9 != 0) goto L_0x008d
                java.lang.String r9 = r2.getVivinoId()
                java.lang.String r10 = "-1"
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
                if (r9 != 0) goto L_0x008d
                java.lang.String r9 = r2.getVivinoId()
                java.lang.String r7 = r7.getVivinoId()
                boolean r7 = android.text.TextUtils.equals(r9, r7)
                goto L_0x008e
            L_0x008d:
                r7 = 0
            L_0x008e:
                if (r8 != 0) goto L_0x0094
                if (r7 == 0) goto L_0x0093
                goto L_0x0094
            L_0x0093:
                r5 = 0
            L_0x0094:
                if (r5 == 0) goto L_0x0028
                r3.add(r4)
                goto L_0x0028
            L_0x009a:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r3.iterator()
            L_0x00a3:
                boolean r3 = r2.hasNext()
                java.lang.String r4 = "N"
                if (r3 == 0) goto L_0x00c1
                java.lang.Object r3 = r2.next()
                r7 = r3
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r7 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r7
                java.lang.String r7 = r7.getZoneName()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
                r4 = r4 ^ r5
                if (r4 == 0) goto L_0x00a3
                r1.add(r3)
                goto L_0x00a3
            L_0x00c1:
                com.hisense.connect_life.core.utils.LogUtilsShen$Companion r2 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion
                int r3 = r1.size()
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
                java.lang.String r7 = "getAllSameWinesInDevice  去掉无位置的数量 is"
                java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r3)
                r2.mo39140i(r3)
                com.google.gson.JsonArray r2 = new com.google.gson.JsonArray
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
                r3.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
                r7.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
                r9.<init>()
                java.util.List<kotlin.Pair<java.lang.String, java.util.List<java.lang.String>>> r10 = r5
                java.util.Iterator r10 = r10.iterator()
            L_0x00f3:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x03c3
                java.lang.Object r11 = r10.next()
                kotlin.Pair r11 = (kotlin.Pair) r11
                java.lang.Object r12 = r11.getFirst()
                r3.element = r12
                java.lang.Object r12 = r11.getSecond()
                java.util.List r12 = (java.util.List) r12
                com.google.gson.JsonObject r13 = new com.google.gson.JsonObject
                r13.<init>()
                com.google.gson.JsonArray r14 = new com.google.gson.JsonArray
                r14.<init>()
                r7.element = r14
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r15 = r1.iterator()
            L_0x0120:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x0145
                java.lang.Object r5 = r15.next()
                r16 = r5
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r16 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r16
                java.lang.String r6 = r16.getZoneName()
                r16 = r1
                java.lang.Object r1 = r11.getFirst()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x0141
                r14.add(r5)
            L_0x0141:
                r1 = r16
                r5 = 1
                goto L_0x0120
            L_0x0145:
                r16 = r1
                java.util.Iterator r1 = r12.iterator()
            L_0x014b:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x039b
                java.lang.Object r5 = r1.next()
                java.lang.String r5 = (java.lang.String) r5
                com.google.gson.JsonObject r6 = new com.google.gson.JsonObject
                r6.<init>()
                com.google.gson.JsonArray r11 = new com.google.gson.JsonArray
                r11.<init>()
                r8.element = r11
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r11 = r6
                java.util.Iterator r12 = r14.iterator()
            L_0x0169:
                boolean r15 = r12.hasNext()
                if (r15 == 0) goto L_0x0358
                java.lang.Object r15 = r12.next()
                com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r15 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r15
                int r17 = r15.getCellNum()
                r18 = r1
                java.lang.String r1 = java.lang.String.valueOf(r17)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
                if (r1 == 0) goto L_0x033a
                com.google.gson.JsonObject r1 = new com.google.gson.JsonObject
                r1.<init>()
                r9.element = r1
                com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1
                r17 = r10
                java.lang.String r10 = "isThisType"
                r19 = r12
                java.lang.String r12 = "true"
                r1.addProperty((java.lang.String) r10, (java.lang.String) r12)
                com.google.gson.Gson r10 = new com.google.gson.Gson
                r10.<init>()
                java.lang.Class<com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo> r12 = com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo.class
                com.google.gson.JsonElement r10 = r10.toJsonTree(r15, r12)
                com.google.gson.JsonObject r10 = r10.getAsJsonObject()
                int r12 = r15.getPositionNum()
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r15 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r15 = r15.getInstance()
                r20 = r14
                java.lang.String r14 = r11.getDeviceId()
                int r14 = r15.isDeviceType(r14)
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r15 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r15 = r15.getInstance()
                int r15 = r15.getBattleSingleZoneDevice()
                java.lang.String r0 = "B"
                r21 = r2
                java.lang.String r2 = "C"
                r22 = r13
                java.lang.String r13 = "F"
                r23 = r7
                r7 = 4
                if (r14 != r15) goto L_0x0285
                T r14 = r3.element
                java.lang.String r15 = "A"
                boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
                if (r14 == 0) goto L_0x024f
                java.lang.String r14 = "3"
                boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r14)
                if (r14 == 0) goto L_0x024f
                if (r12 < 0) goto L_0x01ed
                if (r12 >= r7) goto L_0x01ed
                r14 = 1
                goto L_0x01ee
            L_0x01ed:
                r14 = 0
            L_0x01ee:
                if (r14 == 0) goto L_0x01fc
                int r12 = r12 + 1
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r13, r0)
                goto L_0x0305
            L_0x01fc:
                if (r7 > r12) goto L_0x0204
                r7 = 8
                if (r12 >= r7) goto L_0x0206
                r13 = 1
                goto L_0x0207
            L_0x0204:
                r7 = 8
            L_0x0206:
                r13 = 0
            L_0x0207:
                if (r13 == 0) goto L_0x0215
                int r12 = r12 + -3
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
                goto L_0x0305
            L_0x0215:
                r0 = 11
                if (r7 > r12) goto L_0x021d
                if (r12 >= r0) goto L_0x021d
                r7 = 1
                goto L_0x021e
            L_0x021d:
                r7 = 0
            L_0x021e:
                if (r7 == 0) goto L_0x022e
                int r12 = r12 + -7
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r2 = "T"
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
                goto L_0x0305
            L_0x022e:
                if (r0 > r12) goto L_0x0236
                r0 = 14
                if (r12 >= r0) goto L_0x0236
                r0 = 1
                goto L_0x0237
            L_0x0236:
                r0 = 0
            L_0x0237:
                if (r0 == 0) goto L_0x0245
                int r12 = r12 + -10
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r0)
                goto L_0x0305
            L_0x0245:
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
                goto L_0x0305
            L_0x024f:
                if (r12 < 0) goto L_0x0255
                if (r12 >= r7) goto L_0x0255
                r14 = 1
                goto L_0x0256
            L_0x0255:
                r14 = 0
            L_0x0256:
                if (r14 == 0) goto L_0x0264
                int r12 = r12 + 1
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r13, r0)
                goto L_0x0305
            L_0x0264:
                if (r7 > r12) goto L_0x026c
                r7 = 8
                if (r12 >= r7) goto L_0x026c
                r7 = 1
                goto L_0x026d
            L_0x026c:
                r7 = 0
            L_0x026d:
                if (r7 == 0) goto L_0x027b
                int r12 = r12 + -3
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
                goto L_0x0305
            L_0x027b:
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
                goto L_0x0305
            L_0x0285:
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r14 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r14 = r14.getInstance()
                java.lang.String r15 = r11.getDeviceId()
                int r14 = r14.isDeviceType(r15)
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r15 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r15 = r15.getInstance()
                int r15 = r15.getBattleTwoZoneDevice()
                if (r14 != r15) goto L_0x02d2
                if (r12 < 0) goto L_0x02a5
                if (r12 >= r7) goto L_0x02a5
                r14 = 1
                goto L_0x02a6
            L_0x02a5:
                r14 = 0
            L_0x02a6:
                if (r14 == 0) goto L_0x02b3
                int r12 = r12 + 1
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r13, r0)
                goto L_0x0305
            L_0x02b3:
                if (r7 > r12) goto L_0x02bb
                r7 = 8
                if (r12 >= r7) goto L_0x02bb
                r7 = 1
                goto L_0x02bc
            L_0x02bb:
                r7 = 0
            L_0x02bc:
                if (r7 == 0) goto L_0x02c9
                int r12 = r12 + -3
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
                goto L_0x0305
            L_0x02c9:
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
                goto L_0x0305
            L_0x02d2:
                r7 = 7
                if (r12 < 0) goto L_0x02d9
                if (r12 >= r7) goto L_0x02d9
                r14 = 1
                goto L_0x02da
            L_0x02d9:
                r14 = 0
            L_0x02da:
                if (r14 == 0) goto L_0x02e7
                int r12 = r12 + 1
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r13, r0)
                goto L_0x0305
            L_0x02e7:
                if (r7 > r12) goto L_0x02ef
                r7 = 13
                if (r12 >= r7) goto L_0x02ef
                r7 = 1
                goto L_0x02f0
            L_0x02ef:
                r7 = 0
            L_0x02f0:
                if (r7 == 0) goto L_0x02fd
                int r12 = r12 + -6
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
                goto L_0x0305
            L_0x02fd:
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            L_0x0305:
                java.lang.String r2 = "wifiId"
                java.lang.String r7 = ""
                r10.addProperty((java.lang.String) r2, (java.lang.String) r7)
                java.lang.String r2 = "exactPosition"
                r10.addProperty((java.lang.String) r2, (java.lang.String) r0)
                T r0 = r3.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r5)
                java.lang.String r2 = "shelfPosition"
                r10.addProperty((java.lang.String) r2, (java.lang.String) r0)
                com.hisense.connect_life.core.utils.LogUtilsShen$Companion r0 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion
                java.lang.String r2 = "getAllSameWinesInDevice 返回酒信息"
                java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r10)
                r0.mo39140i(r2)
                java.lang.String r0 = "wineInventoryDtoModel"
                r1.add(r0, r10)
                T r0 = r8.element
                com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
                T r1 = r9.element
                com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
                r0.add((com.google.gson.JsonElement) r1)
                goto L_0x0346
            L_0x033a:
                r21 = r2
                r23 = r7
                r17 = r10
                r19 = r12
                r22 = r13
                r20 = r14
            L_0x0346:
                r0 = r24
                r10 = r17
                r1 = r18
                r12 = r19
                r14 = r20
                r2 = r21
                r13 = r22
                r7 = r23
                goto L_0x0169
            L_0x0358:
                r18 = r1
                r21 = r2
                r23 = r7
                r17 = r10
                r22 = r13
                r20 = r14
                T r0 = r3.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r5)
                java.lang.String r1 = "shelfName"
                r6.addProperty((java.lang.String) r1, (java.lang.String) r0)
                T r0 = r8.element
                com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
                int r0 = r0.size()
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                java.lang.String r1 = "sameTotal"
                r6.addProperty((java.lang.String) r1, (java.lang.Number) r0)
                T r0 = r8.element
                com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
                java.lang.String r1 = "wineArr"
                r6.add(r1, r0)
                r0 = r23
                T r1 = r0.element
                com.google.gson.JsonArray r1 = (com.google.gson.JsonArray) r1
                r1.add((com.google.gson.JsonElement) r6)
                r7 = r0
                r1 = r18
                r0 = r24
                goto L_0x014b
            L_0x039b:
                r21 = r2
                r0 = r7
                r17 = r10
                r22 = r13
                T r1 = r3.element
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "region"
                r5 = r22
                r5.addProperty((java.lang.String) r2, (java.lang.String) r1)
                T r1 = r0.element
                com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
                java.lang.String r2 = "shelfData"
                r5.add(r2, r1)
                r1 = r21
                r1.add((com.google.gson.JsonElement) r5)
                r2 = r1
                r1 = r16
                r5 = 1
                r0 = r24
                goto L_0x00f3
            L_0x03c3:
                r1 = r2
                com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
                r0.<init>()
                java.lang.String r2 = "regionData"
                r0.add(r2, r1)
                com.google.gson.JsonObject r1 = new com.google.gson.JsonObject
                r1.<init>()
                r2 = 0
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                java.lang.String r3 = "resultCode"
                r1.addProperty((java.lang.String) r3, (java.lang.Number) r2)
                java.lang.String r2 = "errorDesc"
                java.lang.String r3 = "获取酒架酒信息成功"
                r1.addProperty((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "data"
                r1.add(r2, r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r2 = "jsonResult.toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                com.hisense.connect_life.core.utils.LogUtilsShen$Companion r2 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion
                java.lang.String r3 = "getAllSameWinesInDevice result: "
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r0)
                r2.mo39138e(r0)
                r0 = r24
                com.internationalwinecooler.ui.WineWebViewModel r2 = r3
                kotlinx.coroutines.CoroutineScope r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r2)
                kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
                r5 = 0
                com.internationalwinecooler.ui.WineWebViewModel$getAllSameWinesInDevice$1$1$5 r6 = new com.internationalwinecooler.ui.WineWebViewModel$getAllSameWinesInDevice$1$1$5
                com.internationalwinecooler.ui.WineWebViewModel r2 = r3
                r7 = 0
                r6.<init>(r2, r1, r7)
                r7 = 2
                r8 = 0
                kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r3, r4, r5, r6, r7, r8)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L_0x041a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel$getAllSameWinesInDevice$1.C86541.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getAllSameWinesInDevice$1(String str, String str2, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getAllSameWinesInDevice$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.$deviceId = str2;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getAllSameWinesInDevice$1(this.$model, this.$deviceId, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getAllSameWinesInDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Pair pair;
        List list;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                JSONObject jSONObject = new JSONObject(this.$model).getJSONObject("wineInfo");
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                jSONObject2.remove("photo");
                LogUtilsShen.Companion companion = LogUtilsShen.Companion;
                companion.mo39138e("getAllSameWinesInDevice auid:" + this.$deviceId + ",  model:" + jSONObject2);
                final WineBaseInfo wineBaseInfo = (WineBaseInfo) new Gson().fromJson(jSONObject.toString(), WineBaseInfo.class);
                LogUtilsShen.Companion companion2 = LogUtilsShen.Companion;
                companion2.mo39138e("getAllSameWinesInDevice categoryId:" + wineBaseInfo.getCategoryId() + ",  vivino:" + wineBaseInfo.getVivinoId());
                if (Intrinsics.areEqual((Object) SPManagerKt.getZone2Use(this.$deviceId), (Object) "0")) {
                    pair = new Pair("B", CollectionsKt__CollectionsJVMKt.listOf("1"));
                } else {
                    pair = new Pair("B", CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4"));
                }
                if (DeviceCache.Companion.getInstance().isDeviceType(this.$deviceId) == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
                    list = CollectionsKt__CollectionsJVMKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4", "5", "6", "7", "8", CrashDumperPlugin.OPTION_KILL_DEFAULT)));
                } else if (DeviceCache.Companion.getInstance().isDeviceType(this.$deviceId) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
                    list = CollectionsKt__CollectionsJVMKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4", "5")));
                } else if (DeviceCache.Companion.getInstance().isDeviceType(this.$deviceId) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
                    list = CollectionsKt__CollectionsKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2")), new Pair("B", CollectionsKt__CollectionsKt.listOf("1", "2", "3")));
                } else {
                    list = CollectionsKt__CollectionsKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4")), pair, new Pair("C", CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4", "5")));
                }
                final List list2 = list;
                CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
                CoroutineDispatcher io = Dispatchers.getIO();
                final WineWebViewModel wineWebViewModel = this.this$0;
                final String str = this.$deviceId;
                Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C86541((Continuation<? super C86541>) null), 2, (Object) null);
            } catch (Throwable th) {
                LoggerUtil.Companion.mo39147e(th, "getAllSameWinesInDevice fail");
                WineWebViewModel wineWebViewModel2 = this.this$0;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                wineWebViewModel2.executeFailCallback(message, WebActionEnum.GET_ALL_SAME_WINES_IN_DEVICE_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
