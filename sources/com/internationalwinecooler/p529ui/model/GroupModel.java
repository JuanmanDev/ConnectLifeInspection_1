package com.internationalwinecooler.p529ui.model;

import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/model/GroupModel;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.model.GroupModel */
/* compiled from: GroupModel.kt */
public final class GroupModel {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002JB\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0004j\b\u0012\u0004\u0012\u00020\u000f`\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0013JJ\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0004j\b\u0012\u0004\u0012\u00020\u000f`\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0013J0\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0004j\b\u0012\u0004\u0012\u00020\u000f`\u00062\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0004j\b\u0012\u0004\u0012\u00020\u000f`\u0006H\u0002¨\u0006\u0018"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/model/GroupModel$Companion;", "", "()V", "getChildren", "Ljava/util/ArrayList;", "Lcom/internationalwinecooler/ui/model/ChildEntity;", "Lkotlin/collections/ArrayList;", "auid", "", "mapValueList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "childrenCount", "", "getExactExpandableGroups", "Lcom/internationalwinecooler/ui/model/ExpandableGroupEntity;", "isExpand", "", "auidMap", "", "getGenericExpandableGroups", "groupCount", "getSortGroupList", "groups", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.model.GroupModel$Companion */
    /* compiled from: GroupModel.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:252:0x024e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:269:0x0427 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.ArrayList<com.internationalwinecooler.p529ui.model.ChildEntity> getChildren(java.lang.String r44, java.util.List<com.juconnect.connectlife.model.WineInventoryBean> r45, int r46) {
            /*
                r43 = this;
                r0 = r44
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
                r12.<init>()
                java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
                r13.<init>()
                java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
                r14.<init>()
                java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
                r15.<init>()
                java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
                r11.<init>()
                java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
                r10.<init>()
                java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
                r9.<init>()
                java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
                r8.<init>()
                com.hisense.connect_life.core.utils.SPUtils r2 = com.hisense.connect_life.core.utils.SPUtils.INSTANCE
                r7 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                java.lang.String r4 = "key_wine_inventory_type"
                java.lang.Object r2 = r2.get(r4, r3)
                if (r2 == 0) goto L_0x0712
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r6 = 1
                if (r2 != r6) goto L_0x004a
                r16 = r6
                goto L_0x004c
            L_0x004a:
                r16 = r7
            L_0x004c:
                r5 = r46
                r2 = r7
            L_0x004f:
                if (r2 >= r5) goto L_0x0710
                int r17 = r2 + 1
                r12.clear()
                r14.clear()
                r15.clear()
                r11.clear()
                r9.clear()
                r8.clear()
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>()
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>()
                r20 = r1
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                r21 = r8
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r22 = r45.iterator()
            L_0x0095:
                boolean r23 = r22.hasNext()
                if (r23 == 0) goto L_0x00ab
                java.lang.Object r23 = r22.next()
                r24 = r9
                r9 = r23
                com.juconnect.connectlife.model.WineInventoryBean r9 = (com.juconnect.connectlife.model.WineInventoryBean) r9
                r8.add(r9)
                r9 = r24
                goto L_0x0095
            L_0x00ab:
                r24 = r9
                java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x00b6:
                boolean r22 = r8.hasNext()
                if (r22 == 0) goto L_0x00ef
                r22 = r10
                java.lang.Object r10 = r8.next()
                r23 = r10
                com.juconnect.connectlife.model.WineInventoryBean r23 = (com.juconnect.connectlife.model.WineInventoryBean) r23
                r25 = r8
                java.lang.String r8 = r23.getShelfPosition()
                java.lang.Object r23 = r9.get(r8)
                if (r23 != 0) goto L_0x00df
                r26 = r11
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r9.put(r8, r11)
                r23 = r11
                goto L_0x00e1
            L_0x00df:
                r26 = r11
            L_0x00e1:
                r8 = r23
                java.util.List r8 = (java.util.List) r8
                r8.add(r10)
                r10 = r22
                r8 = r25
                r11 = r26
                goto L_0x00b6
            L_0x00ef:
                r22 = r10
                r26 = r11
                java.util.List r8 = kotlin.collections.MapsKt___MapsKt.toList(r9)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$1 r9 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$1
                r9.<init>()
                java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r8, r9)
                java.util.Map r8 = kotlin.collections.MapsKt__MapsKt.toMap(r8)
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r9 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r9 = r9.getInstance()
                int r9 = r9.isDeviceType(r0)
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r10 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r10 = r10.getInstance()
                int r10 = r10.getSingleZoneDevice()
                java.lang.String r11 = "A"
                r23 = r15
                java.lang.String r15 = "N"
                r25 = r14
                java.lang.String r14 = "A0"
                r27 = r13
                r13 = 2
                if (r9 != r10) goto L_0x019b
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x012f:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0194
                java.lang.Object r9 = r8.next()
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                java.lang.Object r10 = r9.getKey()
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                if (r10 != 0) goto L_0x0180
                java.lang.Object r10 = r9.getKey()
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r14)
                if (r10 != 0) goto L_0x0180
                java.lang.Object r10 = r9.getKey()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                r30 = r6
                r29 = r8
                r6 = 0
                r8 = 0
                boolean r10 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r15, (boolean) r6, (int) r13, (java.lang.Object) r8)
                if (r10 == 0) goto L_0x0167
                goto L_0x0184
            L_0x0167:
                java.lang.Object r10 = r9.getKey()
                java.lang.String r10 = (java.lang.String) r10
                if (r10 != 0) goto L_0x0170
                goto L_0x018f
            L_0x0170:
                boolean r31 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r11, (boolean) r6, (int) r13, (java.lang.Object) r8)
                if (r31 == 0) goto L_0x017d
                java.lang.Object r6 = r9.getValue()
                r2.put(r10, r6)
            L_0x017d:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                goto L_0x018f
            L_0x0180:
                r30 = r6
                r29 = r8
            L_0x0184:
                java.lang.Object r6 = r9.getKey()
                java.lang.Object r8 = r9.getValue()
                r12.put(r6, r8)
            L_0x018f:
                r8 = r29
                r6 = r30
                goto L_0x012f
            L_0x0194:
                r33 = r2
                r9 = r4
                r2 = r6
            L_0x0198:
                r0 = 0
                goto L_0x04d1
            L_0x019b:
                r30 = r6
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r6 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r6 = r6.getInstance()
                int r6 = r6.isDeviceType(r0)
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r9 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r9 = r9.getInstance()
                int r9 = r9.getBattleTwoZoneDevice()
                java.lang.String r10 = "B"
                if (r6 != r9) goto L_0x02c1
                java.util.Set r6 = r8.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x01bd:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x02ba
                java.lang.Object r8 = r6.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r9 = r8.getKey()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 != 0) goto L_0x02a1
                java.lang.Object r9 = r8.getKey()
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r14)
                if (r9 != 0) goto L_0x02a1
                java.lang.Object r9 = r8.getKey()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r33 = r2
                r32 = r6
                r2 = 0
                r6 = 2
                r13 = 0
                boolean r9 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r15, (boolean) r2, (int) r6, (java.lang.Object) r13)
                if (r9 == 0) goto L_0x01f9
                r34 = r4
                goto L_0x02a7
            L_0x01f9:
                java.lang.Object r2 = r8.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L_0x0205
                r34 = r4
                goto L_0x02b2
            L_0x0205:
                if (r16 == 0) goto L_0x027e
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.lang.Object r9 = r8.getValue()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L_0x0216:
                boolean r13 = r9.hasNext()
                if (r13 == 0) goto L_0x0253
                java.lang.Object r13 = r9.next()
                com.juconnect.connectlife.model.WineInventoryBean r13 = (com.juconnect.connectlife.model.WineInventoryBean) r13
                java.lang.String r34 = r13.getExactPosition()
                boolean r34 = android.text.TextUtils.isEmpty(r34)
                if (r34 != 0) goto L_0x0247
                java.lang.String r34 = r13.getExactPosition()
                if (r34 != 0) goto L_0x0238
                r34 = r4
                r35 = r9
            L_0x0236:
                r4 = 0
                goto L_0x0244
            L_0x0238:
                r35 = r9
                int r9 = java.lang.Integer.parseInt(r34)
                r34 = r4
                r4 = -1
                if (r9 != r4) goto L_0x0236
                r4 = 1
            L_0x0244:
                if (r4 == 0) goto L_0x024e
                goto L_0x024b
            L_0x0247:
                r34 = r4
                r35 = r9
            L_0x024b:
                r6.add(r13)
            L_0x024e:
                r4 = r34
                r9 = r35
                goto L_0x0216
            L_0x0253:
                r34 = r4
                boolean r4 = r6.isEmpty()
                r9 = 1
                r4 = r4 ^ r9
                if (r4 == 0) goto L_0x0280
                java.lang.Object r4 = r8.getKey()
                r12.put(r4, r6)
                java.util.Iterator r4 = r6.iterator()
            L_0x0268:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0280
                java.lang.Object r6 = r4.next()
                com.juconnect.connectlife.model.WineInventoryBean r6 = (com.juconnect.connectlife.model.WineInventoryBean) r6
                java.lang.Object r9 = r8.getValue()
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                r9.remove(r6)
                goto L_0x0268
            L_0x027e:
                r34 = r4
            L_0x0280:
                r4 = 0
                r6 = 2
                r9 = 0
                boolean r13 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) r11, (boolean) r9, (int) r6, (java.lang.Object) r4)
                if (r13 == 0) goto L_0x0291
                java.lang.Object r8 = r8.getValue()
                r5.put(r2, r8)
                goto L_0x029e
            L_0x0291:
                boolean r13 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) r10, (boolean) r9, (int) r6, (java.lang.Object) r4)
                if (r13 == 0) goto L_0x029e
                java.lang.Object r4 = r8.getValue()
                r1.put(r2, r4)
            L_0x029e:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                goto L_0x02b2
            L_0x02a1:
                r33 = r2
                r34 = r4
                r32 = r6
            L_0x02a7:
                java.lang.Object r2 = r8.getKey()
                java.lang.Object r4 = r8.getValue()
                r12.put(r2, r4)
            L_0x02b2:
                r6 = r32
                r2 = r33
                r4 = r34
                goto L_0x01bd
            L_0x02ba:
                r33 = r2
                r9 = r4
                r2 = r30
                goto L_0x0198
            L_0x02c1:
                r33 = r2
                r34 = r4
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r2 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r2 = r2.getInstance()
                int r2 = r2.isDeviceType(r0)
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache$Companion r4 = com.hisense.connect_life.hismart.networks.request.device.DeviceCache.Companion
                com.hisense.connect_life.hismart.networks.request.device.DeviceCache r4 = r4.getInstance()
                int r4 = r4.getBattleSingleZoneDevice()
                if (r2 != r4) goto L_0x03aa
                java.util.Set r2 = r8.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x02e3:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x04cb
                java.lang.Object r4 = r2.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r6 = r4.getKey()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x039d
                java.lang.Object r6 = r4.getKey()
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r14)
                if (r6 != 0) goto L_0x039d
                java.lang.Object r6 = r4.getKey()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r8 = 0
                r9 = 2
                r10 = 0
                boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r15, (boolean) r10, (int) r9, (java.lang.Object) r8)
                if (r6 == 0) goto L_0x0319
                goto L_0x039d
            L_0x0319:
                if (r16 == 0) goto L_0x037f
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.lang.Object r8 = r4.getValue()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x032a:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0356
                java.lang.Object r9 = r8.next()
                com.juconnect.connectlife.model.WineInventoryBean r9 = (com.juconnect.connectlife.model.WineInventoryBean) r9
                java.lang.String r10 = r9.getExactPosition()
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                if (r10 != 0) goto L_0x0352
                java.lang.String r10 = r9.getExactPosition()
                if (r10 != 0) goto L_0x0348
            L_0x0346:
                r10 = 0
                goto L_0x0350
            L_0x0348:
                int r10 = java.lang.Integer.parseInt(r10)
                r13 = -1
                if (r10 != r13) goto L_0x0346
                r10 = 1
            L_0x0350:
                if (r10 == 0) goto L_0x032a
            L_0x0352:
                r6.add(r9)
                goto L_0x032a
            L_0x0356:
                boolean r8 = r6.isEmpty()
                r9 = 1
                r8 = r8 ^ r9
                if (r8 == 0) goto L_0x037f
                java.lang.Object r8 = r4.getKey()
                r12.put(r8, r6)
                java.util.Iterator r6 = r6.iterator()
            L_0x0369:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x037f
                java.lang.Object r8 = r6.next()
                com.juconnect.connectlife.model.WineInventoryBean r8 = (com.juconnect.connectlife.model.WineInventoryBean) r8
                java.lang.Object r9 = r4.getValue()
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                r9.remove(r8)
                goto L_0x0369
            L_0x037f:
                java.lang.Object r6 = r4.getKey()
                java.lang.String r6 = (java.lang.String) r6
                if (r6 != 0) goto L_0x0389
                goto L_0x02e3
            L_0x0389:
                r8 = 0
                r9 = 2
                r10 = 0
                boolean r13 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r11, (boolean) r10, (int) r9, (java.lang.Object) r8)
                if (r13 == 0) goto L_0x0399
                java.lang.Object r4 = r4.getValue()
                r7.put(r6, r4)
            L_0x0399:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                goto L_0x02e3
            L_0x039d:
                java.lang.Object r6 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                r12.put(r6, r4)
                goto L_0x02e3
            L_0x03aa:
                java.util.Set r2 = r8.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x03b2:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x04cb
                java.lang.Object r4 = r2.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r6 = r4.getKey()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x04ad
                java.lang.Object r6 = r4.getKey()
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r14)
                if (r6 != 0) goto L_0x04ad
                java.lang.Object r6 = r4.getKey()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r8 = 0
                r9 = 2
                r13 = 0
                boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r15, (boolean) r13, (int) r9, (java.lang.Object) r8)
                if (r6 == 0) goto L_0x03e8
                goto L_0x04ad
            L_0x03e8:
                if (r16 == 0) goto L_0x0454
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.lang.Object r8 = r4.getValue()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x03f9:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x042a
                java.lang.Object r9 = r8.next()
                com.juconnect.connectlife.model.WineInventoryBean r9 = (com.juconnect.connectlife.model.WineInventoryBean) r9
                java.lang.String r13 = r9.getExactPosition()
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x0423
                java.lang.String r13 = r9.getExactPosition()
                if (r13 != 0) goto L_0x0418
                r0 = -1
            L_0x0416:
                r13 = 0
                goto L_0x0420
            L_0x0418:
                int r13 = java.lang.Integer.parseInt(r13)
                r0 = -1
                if (r13 != r0) goto L_0x0416
                r13 = 1
            L_0x0420:
                if (r13 == 0) goto L_0x0427
                goto L_0x0424
            L_0x0423:
                r0 = -1
            L_0x0424:
                r6.add(r9)
            L_0x0427:
                r0 = r44
                goto L_0x03f9
            L_0x042a:
                r0 = -1
                boolean r8 = r6.isEmpty()
                r9 = 1
                r8 = r8 ^ r9
                if (r8 == 0) goto L_0x0456
                java.lang.Object r8 = r4.getKey()
                r12.put(r8, r6)
                java.util.Iterator r6 = r6.iterator()
            L_0x043e:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x0456
                java.lang.Object r8 = r6.next()
                com.juconnect.connectlife.model.WineInventoryBean r8 = (com.juconnect.connectlife.model.WineInventoryBean) r8
                java.lang.Object r13 = r4.getValue()
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                r13.remove(r8)
                goto L_0x043e
            L_0x0454:
                r0 = -1
                r9 = 1
            L_0x0456:
                java.lang.Object r6 = r4.getKey()
                java.lang.String r6 = (java.lang.String) r6
                if (r6 != 0) goto L_0x0468
                r19 = r2
                r4 = r30
                r9 = r34
                r0 = 0
                r8 = 0
                r13 = 2
                goto L_0x04ab
            L_0x0468:
                r0 = 0
                r8 = 0
                r13 = 2
                boolean r18 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r11, (boolean) r0, (int) r13, (java.lang.Object) r8)
                if (r18 == 0) goto L_0x047f
                java.lang.Object r4 = r4.getValue()
                r3.put(r6, r4)
                r19 = r2
                r4 = r30
                r9 = r34
                goto L_0x04a9
            L_0x047f:
                boolean r18 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r10, (boolean) r0, (int) r13, (java.lang.Object) r8)
                if (r18 == 0) goto L_0x0491
                java.lang.Object r4 = r4.getValue()
                r9 = r34
                r9.put(r6, r4)
                r19 = r2
                goto L_0x04a7
            L_0x0491:
                r19 = r2
                r9 = r34
                java.lang.String r2 = "C"
                boolean r2 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r2, (boolean) r0, (int) r13, (java.lang.Object) r8)
                if (r2 == 0) goto L_0x04a7
                java.lang.Object r2 = r4.getValue()
                r4 = r30
                r4.put(r6, r2)
                goto L_0x04a9
            L_0x04a7:
                r4 = r30
            L_0x04a9:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
            L_0x04ab:
                r2 = r4
                goto L_0x04c1
            L_0x04ad:
                r19 = r2
                r2 = r30
                r9 = r34
                r0 = 0
                r8 = 0
                r13 = 2
                java.lang.Object r6 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                r12.put(r6, r4)
            L_0x04c1:
                r0 = r44
                r30 = r2
                r34 = r9
                r2 = r19
                goto L_0x03b2
            L_0x04cb:
                r2 = r30
                r9 = r34
                goto L_0x0198
            L_0x04d1:
                java.lang.String r34 = "A1"
                java.lang.String r35 = "A2"
                java.lang.String r36 = "A3"
                java.lang.String r37 = "A4"
                java.lang.String r38 = "A5"
                java.lang.String r39 = "A6"
                java.lang.String r40 = "A7"
                java.lang.String r41 = "A8"
                java.lang.String r42 = "A9"
                java.lang.String[] r4 = new java.lang.String[]{r34, r35, r36, r37, r38, r39, r40, r41, r42}
                java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r4)
                java.util.Iterator r4 = r4.iterator()
            L_0x04ef:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x050d
                java.lang.Object r6 = r4.next()
                java.lang.String r6 = (java.lang.String) r6
                r8 = r33
                boolean r10 = r8.containsKey(r6)
                if (r10 != 0) goto L_0x050a
                java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r8.put(r6, r10)
            L_0x050a:
                r33 = r8
                goto L_0x04ef
            L_0x050d:
                r8 = r33
                java.lang.String r4 = "A1"
                java.lang.String r6 = "A2"
                java.lang.String r10 = "A3"
                java.lang.String r11 = "A4"
                java.lang.String[] r13 = new java.lang.String[]{r4, r6, r10, r11}
                java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r13)
                java.util.Iterator r13 = r13.iterator()
            L_0x0523:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x053d
                java.lang.Object r14 = r13.next()
                java.lang.String r14 = (java.lang.String) r14
                boolean r15 = r3.containsKey(r14)
                if (r15 != 0) goto L_0x0523
                java.util.List r15 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r3.put(r14, r15)
                goto L_0x0523
            L_0x053d:
                java.lang.String r13 = com.hisense.connect_life.core.global.SPManagerKt.getZone2Use(r44)
                java.lang.String r14 = "0"
                boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
                java.lang.String r14 = "B3"
                java.lang.String r15 = "B2"
                java.lang.String r0 = "B1"
                if (r13 == 0) goto L_0x055f
                boolean r13 = r9.containsKey(r0)
                if (r13 != 0) goto L_0x055c
                java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r9.put(r0, r13)
            L_0x055c:
                r28 = r12
                goto L_0x0594
            L_0x055f:
                java.lang.String r13 = "B4"
                java.lang.String[] r13 = new java.lang.String[]{r0, r15, r14, r13}
                java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r13)
                java.util.Iterator r13 = r13.iterator()
            L_0x056d:
                boolean r28 = r13.hasNext()
                if (r28 == 0) goto L_0x055c
                java.lang.Object r28 = r13.next()
                r29 = r13
                r13 = r28
                java.lang.String r13 = (java.lang.String) r13
                boolean r28 = r9.containsKey(r13)
                if (r28 != 0) goto L_0x058d
                r28 = r12
                java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r9.put(r13, r12)
                goto L_0x058f
            L_0x058d:
                r28 = r12
            L_0x058f:
                r12 = r28
                r13 = r29
                goto L_0x056d
            L_0x0594:
                java.lang.String r12 = "C1"
                java.lang.String r13 = "C2"
                r34 = r9
                java.lang.String r9 = "C3"
                r29 = r3
                java.lang.String r3 = "C4"
                r33 = r8
                java.lang.String r8 = "C5"
                java.lang.String[] r3 = new java.lang.String[]{r12, r13, r9, r3, r8}
                java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r3)
                java.util.Iterator r3 = r3.iterator()
            L_0x05b0:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x05ca
                java.lang.Object r8 = r3.next()
                java.lang.String r8 = (java.lang.String) r8
                boolean r9 = r2.containsKey(r8)
                if (r9 != 0) goto L_0x05b0
                java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r2.put(r8, r9)
                goto L_0x05b0
            L_0x05ca:
                java.lang.String[] r3 = new java.lang.String[]{r4, r6}
                java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r3)
                java.util.Iterator r3 = r3.iterator()
            L_0x05d6:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x05f0
                java.lang.Object r8 = r3.next()
                java.lang.String r8 = (java.lang.String) r8
                boolean r9 = r5.containsKey(r8)
                if (r9 != 0) goto L_0x05d6
                java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r5.put(r8, r9)
                goto L_0x05d6
            L_0x05f0:
                java.lang.String[] r0 = new java.lang.String[]{r0, r15, r14}
                java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L_0x05fc:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0616
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r8 = r1.containsKey(r3)
                if (r8 != 0) goto L_0x05fc
                java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r1.put(r3, r8)
                goto L_0x05fc
            L_0x0616:
                java.lang.String r0 = "A5"
                java.lang.String[] r0 = new java.lang.String[]{r4, r6, r10, r11, r0}
                java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.listOf(r0)
                java.util.Iterator r0 = r0.iterator()
            L_0x0624:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x063e
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r4 = r7.containsKey(r3)
                if (r4 != 0) goto L_0x0624
                java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
                r7.put(r3, r4)
                goto L_0x0624
            L_0x063e:
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r33)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$2 r3 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$2
                r3.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r3)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r12 = r27
                r12.putAll(r0)
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r29)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$3 r3 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$3
                r3.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r3)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r13 = r25
                r13.putAll(r0)
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r34)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$4 r3 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$4
                r3.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r3)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r14 = r23
                r14.putAll(r0)
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r2)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$5 r2 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$5
                r2.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r2)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r11 = r26
                r11.putAll(r0)
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r7)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$6 r2 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$6
                r2.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r2)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r10 = r22
                r10.putAll(r0)
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r5)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$7 r2 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$7
                r2.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r2)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r9 = r24
                r9.putAll(r0)
                java.util.List r0 = kotlin.collections.MapsKt___MapsKt.toList(r1)
                com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$8 r1 = new com.internationalwinecooler.ui.model.GroupModel$Companion$getChildren$$inlined$sortedBy$8
                r1.<init>()
                java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r0, r1)
                java.util.Map r0 = kotlin.collections.MapsKt__MapsKt.toMap(r0)
                r1 = r21
                r1.putAll(r0)
                com.internationalwinecooler.ui.model.ChildEntity r0 = new com.internationalwinecooler.ui.model.ChildEntity
                r2 = r0
                r3 = r45
                r4 = r28
                r5 = r12
                r15 = 1
                r6 = r13
                r18 = 0
                r7 = r14
                r8 = r11
                r19 = r9
                r9 = r10
                r21 = r10
                r10 = r19
                r22 = r11
                r11 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r2 = r20
                r2.add(r0)
                r0 = r44
                r5 = r46
                r8 = r1
                r1 = r2
                r6 = r15
                r2 = r17
                r7 = r18
                r9 = r19
                r10 = r21
                r11 = r22
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r28
                goto L_0x004f
            L_0x0710:
                r2 = r1
                return r2
            L_0x0712:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.model.GroupModel.Companion.getChildren(java.lang.String, java.util.List, int):java.util.ArrayList");
        }

        private final ArrayList<ExpandableGroupEntity> getSortGroupList(ArrayList<ExpandableGroupEntity> arrayList) {
            ArrayList<ExpandableGroupEntity> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!(arrayList == null || arrayList.isEmpty())) {
                for (ExpandableGroupEntity expandableGroupEntity : arrayList) {
                    DeviceCache instance = DeviceCache.Companion.getInstance();
                    String auid = expandableGroupEntity.getAuid();
                    Intrinsics.checkNotNull(auid);
                    if (instance.isDeviceType(auid) == DeviceCache.Companion.getInstance().getSingleZoneDevice()) {
                        arrayList4.add(expandableGroupEntity);
                    } else {
                        arrayList3.add(expandableGroupEntity);
                    }
                }
            }
            arrayList2.addAll(arrayList3);
            arrayList2.addAll(arrayList4);
            return arrayList2;
        }

        @NotNull
        public final ArrayList<ExpandableGroupEntity> getExactExpandableGroups(boolean z, int i, @NotNull Map<String, ? extends List<WineInventoryBean>> map) {
            int i2;
            Intrinsics.checkNotNullParameter(map, "auidMap");
            ArrayList arrayList = new ArrayList();
            ArrayList<WineInventoryBean> arrayList2 = new ArrayList<>();
            Iterator<Map.Entry<String, ? extends List<WineInventoryBean>>> it = map.entrySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                arrayList2.clear();
                for (WineInventoryBean add : (Iterable) next.getValue()) {
                    arrayList2.add(add);
                }
                for (WineInventoryBean isFilteredOut : arrayList2) {
                    if (!isFilteredOut.isFilteredOut()) {
                        i2++;
                    }
                }
                String valueOf = String.valueOf(arrayList2.size());
                String valueOf2 = String.valueOf(i2);
                String str = (String) next.getKey();
                Companion companion = GroupModel.Companion;
                String str2 = (String) next.getKey();
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new ExpandableGroupEntity(z, valueOf, valueOf2, str, companion.getChildren(str2, (List) next.getValue(), i)));
            }
            ArrayList<ExpandableGroupEntity> sortGroupList = getSortGroupList(arrayList);
            if (sortGroupList.size() > 0 && !z) {
                Iterator<T> it2 = sortGroupList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    DeviceCache instance = DeviceCache.Companion.getInstance();
                    String auid = ((ExpandableGroupEntity) next2).getAuid();
                    Intrinsics.checkNotNull(auid);
                    if (instance.isDeviceType(auid) == DeviceCache.Companion.getInstance().getThreeZoneDevice()) {
                        sortGroupList.get(i2).setExpand(true);
                        break;
                    }
                    i2 = i3;
                }
            }
            return sortGroupList;
        }

        @NotNull
        public final ArrayList<ExpandableGroupEntity> getGenericExpandableGroups(boolean z, int i, int i2, @NotNull Map<String, ? extends List<WineInventoryBean>> map) {
            Intrinsics.checkNotNullParameter(map, "auidMap");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : map.entrySet()) {
                arrayList2.clear();
                for (WineInventoryBean add : (Iterable) next.getValue()) {
                    arrayList2.add(add);
                }
                String valueOf = String.valueOf(arrayList2.size());
                String str = (String) next.getKey();
                Companion companion = GroupModel.Companion;
                String str2 = (String) next.getKey();
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new ExpandableGroupEntity(z, valueOf, "0", str, companion.getChildren(str2, (List) next.getValue(), i2)));
            }
            ArrayList<ExpandableGroupEntity> sortGroupList = getSortGroupList(arrayList);
            if (sortGroupList.size() > 0 && !z) {
                sortGroupList.get(0).setExpand(true);
            }
            return sortGroupList;
        }
    }
}
