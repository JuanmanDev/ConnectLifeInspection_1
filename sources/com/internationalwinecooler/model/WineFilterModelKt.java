package com.internationalwinecooler.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"COMMON_FORMAT", "", "dateToMs", "", "_data", "toFilterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "Lcom/internationalwinecooler/model/WineFilterModel;", "context", "Landroid/content/Context;", "app_aab"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineFilterModel.kt */
public final class WineFilterModelKt {
    @NotNull
    public static final String COMMON_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final long dateToMs(@Nullable String str) {
        try {
            Date parse = new SimpleDateFormat(COMMON_FORMAT, Locale.getDefault()).parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "format.parse(_data)");
            return parse.getTime();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[SYNTHETIC, Splitter:B:15:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014c  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition toFilterCondition(@org.jetbrains.annotations.NotNull com.internationalwinecooler.model.WineFilterModel r27, @org.jetbrains.annotations.NotNull android.content.Context r28) {
        /*
            r0 = r28
            java.lang.String r1 = "-01-01 00:00:00"
            java.lang.String r2 = "<this>"
            r3 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r4 = r27.getVintage()
            java.lang.String r2 = "-"
            r10 = 0
            r11 = 1
            r12 = 0
            if (r4 != 0) goto L_0x0020
            r18 = r12
            r19 = r18
            goto L_0x004f
        L_0x0020:
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0049 }
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r4 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r4, (java.lang.String[]) r5, (boolean) r6, (int) r7, (int) r8, (java.lang.Object) r9)     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r5 = r4.get(r10)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0049 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r4 = r4.get(r11)     // Catch:{ Exception -> 0x004a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x004a }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x004a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x004a }
            goto L_0x004b
        L_0x0049:
            r5 = r12
        L_0x004a:
            r4 = r12
        L_0x004b:
            r19 = r4
            r18 = r5
        L_0x004f:
            java.lang.String r4 = r27.getBestToServe()
            if (r4 != 0) goto L_0x005b
            r20 = r12
            r21 = r20
            goto L_0x00cc
        L_0x005b:
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x00c6 }
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r2 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r4, (java.lang.String[]) r5, (boolean) r6, (int) r7, (int) r8, (java.lang.Object) r9)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r4 = r2.get(r10)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00c6 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c6 }
            r5 = 4
            if (r4 != r5) goto L_0x00a7
            java.lang.Object r4 = r2.get(r11)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00c6 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c6 }
            if (r4 != r5) goto L_0x00a7
            java.lang.Object r4 = r2.get(r11)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r1)     // Catch:{ Exception -> 0x00c6 }
            long r4 = dateToMs(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)     // Catch:{ Exception -> 0x00a5 }
            long r1 = dateToMs(r1)     // Catch:{ Exception -> 0x00a5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00c8
        L_0x00a5:
            r1 = r12
            goto L_0x00c8
        L_0x00a7:
            java.lang.Object r1 = r2.get(r10)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00c6 }
            long r4 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00c4 }
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00c4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r4 = r12
            goto L_0x00c8
        L_0x00c6:
            r1 = r12
            r4 = r1
        L_0x00c8:
            r20 = r1
            r21 = r4
        L_0x00cc:
            java.lang.Boolean r1 = r27.isFavourite()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            java.lang.Boolean r2 = r27.getShowDeletedItems()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            java.lang.Boolean r4 = r27.isInInventory()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            r4 = r4 ^ r11
            java.util.List r5 = r27.getWineType()
            if (r5 != 0) goto L_0x00f3
            r14 = r12
            goto L_0x011a
        L_0x00f3:
            java.util.Iterator r5 = r5.iterator()
            r6 = r12
        L_0x00f8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0119
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            com.internationalwinecooler.utils.WineUtils$Companion r8 = com.internationalwinecooler.utils.WineUtils.Companion
            int r7 = r8.wineNameToType(r7, r0)
            if (r6 != 0) goto L_0x0111
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0111:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.add(r7)
            goto L_0x00f8
        L_0x0119:
            r14 = r6
        L_0x011a:
            java.util.List r15 = r27.getRegion()
            java.util.List r16 = r27.getCountry()
            java.util.List r0 = r27.getGrapeType()
            if (r0 == 0) goto L_0x012e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x012f
        L_0x012e:
            r10 = r11
        L_0x012f:
            if (r10 == 0) goto L_0x0134
            r17 = r12
            goto L_0x013d
        L_0x0134:
            java.util.List r0 = r27.getGrapeType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r17 = r0
        L_0x013d:
            java.lang.String r23 = r27.getAuid()
            long r5 = r27.getExpried()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x014c
            goto L_0x0154
        L_0x014c:
            long r5 = r27.getExpried()
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
        L_0x0154:
            r25 = r12
            com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition r0 = new com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.model.WineFilterModelKt.toFilterCondition(com.internationalwinecooler.model.WineFilterModel, android.content.Context):com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition");
    }
}
