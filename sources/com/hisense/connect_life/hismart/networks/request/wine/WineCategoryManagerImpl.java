package com.hisense.connect_life.hismart.networks.request.wine;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.CategoryExistsResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryByName;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryByNameResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.SearchCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineFilterConditionResult;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7414a;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7416c;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7417d;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7418e;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7420g;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7421h;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7422i;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7423j;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7424k;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7425l;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7426m;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7427n;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7428o;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7429p;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7430q;
import p040c.p429r.p430a.p439c.p440a.p441a.p451j.C7431r;
import p040c.p429r.p430a.p439c.p459d.C7480a;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016JJ\u0010\u0013\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016JB\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J@\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J2\u0010 \u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J:\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J:\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016JB\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J:\u0010/\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u00060"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/WineCategoryManagerImpl;", "Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "()V", "wineManagerApi", "Lcom/hisense/connect_life/hismart/networks/request/wine/WineManagerApi;", "getWineManagerApi", "()Lcom/hisense/connect_life/hismart/networks/request/wine/WineManagerApi;", "wineManagerApi$delegate", "Lkotlin/Lazy;", "addWineCategory", "Lio/reactivex/disposables/Disposable;", "wineBean", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategory;", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategoryResult;", "", "error", "", "deleteWineCategories", "categoryIdList", "", "", "deviceId", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "favoriteWineCategory", "categoryId", "isFavorite", "getCategoryByName", "queryCategoryByName", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryByName;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "getFilterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineFilterConditionResult;", "queryCategory", "queryCategoryCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryCondition;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "queryCategoryExist", "queryOneCategory", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryOneCategory;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/CategoryExistsResult;", "searchCategory", "categoryName", "isRemoved", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/SearchCategoryResult;", "updateWineCategory", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryManagerImpl.kt */
public final class WineCategoryManagerImpl implements IWineCategoryManager {
    @NotNull
    public final Lazy wineManagerApi$delegate = LazyKt__LazyJVMKt.lazy(WineCategoryManagerImpl$wineManagerApi$2.INSTANCE);

    /* renamed from: addWineCategory$lambda-2  reason: not valid java name */
    public static final void m27052addWineCategory$lambda2(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: addWineCategory$lambda-3  reason: not valid java name */
    public static final void m27053addWineCategory$lambda3(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: deleteWineCategories$lambda-8  reason: not valid java name */
    public static final void m27054deleteWineCategories$lambda8(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: deleteWineCategories$lambda-9  reason: not valid java name */
    public static final void m27055deleteWineCategories$lambda9(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: favoriteWineCategory$lambda-10  reason: not valid java name */
    public static final void m27056favoriteWineCategory$lambda10(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: favoriteWineCategory$lambda-11  reason: not valid java name */
    public static final void m27057favoriteWineCategory$lambda11(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: getCategoryByName$lambda-20  reason: not valid java name */
    public static final void m27058getCategoryByName$lambda20(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(((QueryCategoryByNameResult) hiResult.getResponse()).getCategoryList());
    }

    /* renamed from: getCategoryByName$lambda-21  reason: not valid java name */
    public static final void m27059getCategoryByName$lambda21(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: getFilterCondition$lambda-14  reason: not valid java name */
    public static final void m27060getFilterCondition$lambda14(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: getFilterCondition$lambda-15  reason: not valid java name */
    public static final void m27061getFilterCondition$lambda15(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    private final WineManagerApi getWineManagerApi() {
        Object value = this.wineManagerApi$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-wineManagerApi>(...)");
        return (WineManagerApi) value;
    }

    /* renamed from: queryCategory$lambda-12  reason: not valid java name */
    public static final void m27062queryCategory$lambda12(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: queryCategory$lambda-13  reason: not valid java name */
    public static final void m27063queryCategory$lambda13(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: queryCategoryExist$lambda-16  reason: not valid java name */
    public static final void m27064queryCategoryExist$lambda16(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: queryCategoryExist$lambda-17  reason: not valid java name */
    public static final void m27065queryCategoryExist$lambda17(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: searchCategory$lambda-18  reason: not valid java name */
    public static final void m27066searchCategory$lambda18(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: searchCategory$lambda-19  reason: not valid java name */
    public static final void m27067searchCategory$lambda19(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: updateWineCategory$lambda-6  reason: not valid java name */
    public static final void m27068updateWineCategory$lambda6(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: updateWineCategory$lambda-7  reason: not valid java name */
    public static final void m27069updateWineCategory$lambda7(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    @NotNull
    public C9207b addWineCategory(@NotNull AddWineCategory addWineCategory, @NotNull Function1<? super AddWineCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(addWineCategory, "wineBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        File photo = addWineCategory.getPhoto();
        MultipartBody.Part part = null;
        addWineCategory.setPhoto((File) null);
        if (photo != null) {
            part = MultipartBody.Part.Companion.createFormData("photo", photo.getName(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), photo));
        }
        Map<String, String> a = C7480a.m21439a(new JSONObject(new Gson().toJson((Object) addWineCategory, (Type) AddWineCategory.class)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a.containsKey(KeyConst.KEY_VIVINO_ID) && (Intrinsics.areEqual((Object) a.get(KeyConst.KEY_VIVINO_ID), (Object) "-1") || Intrinsics.areEqual((Object) a.get(KeyConst.KEY_VIVINO_ID), (Object) ""))) {
            if (a != null) {
                ((HashMap) a).remove(KeyConst.KEY_VIVINO_ID);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.HashMap<@[FlexibleNullability] kotlin.String?, @[FlexibleNullability] kotlin.String?>");
            }
        }
        ParameterUtils.Companion companion = ParameterUtils.Companion;
        Intrinsics.checkNotNullExpressionValue(a, "mapValue");
        for (Map.Entry next : companion.createParamMap(a).entrySet()) {
            linkedHashMap.put(next.getKey(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), (String) next.getValue()));
        }
        C9207b s = getWineManagerApi().addWineCategory(part, linkedHashMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7429p(function1), new C7424k(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.addWineCa…or(it)\n                })");
        return s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[Catch:{ Exception -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[Catch:{ Exception -> 0x0052 }] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p553f.p594c.p598o.C9207b deleteWineCategories(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.hisense.connect_life.hismart.networks.request.HiResponse, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r10) {
        /*
            r6 = this;
            java.lang.String r0 = "categoryIdList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r1 = "success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.String r7 = r1.toJson((java.lang.Object) r7)
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0052 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0052 }
            kotlin.Pair r7 = kotlin.TuplesKt.m25743to(r0, r1)     // Catch:{ Exception -> 0x0052 }
            java.util.Map r3 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(r7)     // Catch:{ Exception -> 0x0052 }
            if (r8 == 0) goto L_0x0030
            int r7 = r8.length()     // Catch:{ Exception -> 0x0052 }
            if (r7 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r7 = 0
            goto L_0x0031
        L_0x0030:
            r7 = 1
        L_0x0031:
            if (r7 == 0) goto L_0x003e
            com.hisense.connect_life.hismart.networks.parameters.ParameterUtils$Companion r0 = com.hisense.connect_life.hismart.networks.parameters.ParameterUtils.Companion     // Catch:{ Exception -> 0x0052 }
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            okhttp3.RequestBody r7 = com.hisense.connect_life.hismart.networks.parameters.ParameterUtils.Companion.createParamBodySpec$default(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0052 }
            goto L_0x005d
        L_0x003e:
            com.hisense.connect_life.hismart.networks.parameters.ParameterUtils$Companion r0 = com.hisense.connect_life.hismart.networks.parameters.ParameterUtils.Companion     // Catch:{ Exception -> 0x0052 }
            java.lang.String r7 = "deviceId"
            kotlin.Pair r7 = kotlin.TuplesKt.m25743to(r7, r8)     // Catch:{ Exception -> 0x0052 }
            java.util.Map r1 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(r7)     // Catch:{ Exception -> 0x0052 }
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.RequestBody r7 = com.hisense.connect_life.hismart.networks.parameters.ParameterUtils.Companion.createParamBodySpec$default(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0052 }
            goto L_0x005d
        L_0x0052:
            com.hisense.connect_life.hismart.networks.parameters.ParameterUtils$Companion r0 = com.hisense.connect_life.hismart.networks.parameters.ParameterUtils.Companion
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            okhttp3.RequestBody r7 = com.hisense.connect_life.hismart.networks.parameters.ParameterUtils.Companion.createParamBodySpec$default(r0, r1, r2, r3, r4, r5)
        L_0x005d:
            com.hisense.connect_life.hismart.networks.request.wine.WineManagerApi r8 = r6.getWineManagerApi()
            f.c.c r7 = r8.deleteWineCategory(r7)
            f.c.k r8 = p553f.p594c.p618w.C9324a.m25177b()
            f.c.c r7 = r7.mo46994w(r8)
            f.c.k r8 = p553f.p594c.p595n.p597b.C9200a.m24953a()
            f.c.c r7 = r7.mo46983l(r8)
            c.r.a.c.a.a.j.f r8 = new c.r.a.c.a.a.j.f
            r8.<init>(r9)
            c.r.a.c.a.a.j.b r9 = new c.r.a.c.a.a.j.b
            r9.<init>(r10)
            f.c.o.b r7 = r7.mo46990s(r8, r9)
            java.lang.String r8 = "wineManagerApi.deleteWin…or(it)\n                })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.wine.WineCategoryManagerImpl.deleteWineCategories(java.util.List, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):f.c.o.b");
    }

    @NotNull
    public C9207b favoriteWineCategory(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(str, "categoryId");
        Intrinsics.checkNotNullParameter(str2, "isFavorite");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        try {
            requestBody = ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("categoryId", str), TuplesKt.m25743to("favorite", str2)));
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = getWineManagerApi().favoriteWineCategory(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7422i(function1), new C7428o(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.favoriteW…or(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b getCategoryByName(@NotNull QueryCategoryByName queryCategoryByName, @NotNull Function1<? super List<WineCategoryInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(queryCategoryByName, "queryCategoryByName");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        JSONObject jSONObject = new JSONObject(new Gson().toJson((Object) queryCategoryByName.getSortCondition()));
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.m25743to("queryName", queryCategoryByName.getQueryName());
        pairArr[1] = TuplesKt.m25743to("isRemoved", queryCategoryByName.isRemoved() == 1 ? "1" : "0");
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, MapsKt__MapsKt.mapOf(pairArr), MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("sortCondition", jSONObject)), (Map) null, 4, (Object) null);
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = getWineManagerApi().getWineCategoryByName(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7425l(function1), new C7414a(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.getWineCa…or(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b getFilterCondition(@NotNull Function1<? super WineFilterConditionResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineManagerApi().getFilterCondition(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7426m(function1), new C7430q(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.getFilter…or(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b queryCategory(@NotNull QueryCategoryCondition queryCategoryCondition, @NotNull Function1<? super QueryCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        String l;
        Intrinsics.checkNotNullParameter(queryCategoryCondition, "queryCategoryCondition");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        String json = new Gson().toJson((Object) queryCategoryCondition);
        System.out.println(Intrinsics.stringPlus("查询酒品类数据 is  ", json));
        JSONObject jSONObject = new JSONObject(json);
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = jSONObject.has("filterCondition") ? jSONObject.getJSONObject("filterCondition") : null;
        if (jSONObject.has("sortCondition")) {
            jSONObject2 = jSONObject.getJSONObject("sortCondition");
        }
        Long lastUpdateTime = queryCategoryCondition.getLastUpdateTime();
        String str = "0";
        if (!(lastUpdateTime == null || (l = lastUpdateTime.toString()) == null)) {
            str = l;
        }
        System.out.println(Intrinsics.stringPlus("查询酒品类数据2 filterConditionis  ", jSONObject3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject3 != null) {
            linkedHashMap.put("filterCondition", jSONObject3);
        }
        if (jSONObject2 != null) {
            linkedHashMap.put("sortCondition", jSONObject2);
        }
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("lastUpdateTime", str)), linkedHashMap, (Map) null, 4, (Object) null);
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        System.out.println(Intrinsics.stringPlus("查询酒品类数据2 is  ", requestBody));
        C9207b s = getWineManagerApi().queryCategory(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7416c(function1), new C7420g(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.queryCate…or(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b queryCategoryExist(@NotNull QueryOneCategory queryOneCategory, @NotNull Function1<? super CategoryExistsResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(queryOneCategory, "queryOneCategory");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        JSONObject jSONObject = new JSONObject(new Gson().toJson((Object) queryOneCategory));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (jSONObject.has("grapes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("grapes");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonQuery.getJSONArray(\"grapes\")");
            linkedHashMap2.put("grapes", jSONArray);
            jSONObject.remove("grapes");
        }
        Map<String, String> a = C7480a.m21439a(jSONObject);
        Intrinsics.checkNotNullExpressionValue(a, "jsonToMapDirect(jsonQuery)");
        linkedHashMap.putAll(a);
        try {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, linkedHashMap, (Map) null, linkedHashMap2, 2, (Object) null);
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = getWineManagerApi().queryCategoryExists(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7417d(function1), new C7427n(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.queryCate…or(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b searchCategory(@NotNull String str, int i, @NotNull Function1<? super SearchCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(str, "categoryName");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        try {
            requestBody = ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("categoryName", str), TuplesKt.m25743to("isRemoved", String.valueOf(i))));
        } catch (Exception unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = getWineManagerApi().queryWineCategory(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7423j(function1), new C7421h(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.queryWine…or(it)\n                })");
        return s;
    }

    @NotNull
    public C9207b updateWineCategory(@NotNull AddWineCategory addWineCategory, @NotNull Function1<? super AddWineCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(addWineCategory, "wineBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        File photo = addWineCategory.getPhoto();
        MultipartBody.Part part = null;
        addWineCategory.setPhoto((File) null);
        if (photo != null) {
            part = MultipartBody.Part.Companion.createFormData("photo", photo.getName(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), photo));
        }
        Map<String, String> a = C7480a.m21439a(new JSONObject(new Gson().toJson((Object) addWineCategory, (Type) AddWineCategory.class)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a.containsKey(KeyConst.KEY_VIVINO_ID) && (Intrinsics.areEqual((Object) a.get(KeyConst.KEY_VIVINO_ID), (Object) "-1") || Intrinsics.areEqual((Object) a.get(KeyConst.KEY_VIVINO_ID), (Object) ""))) {
            if (a != null) {
                ((HashMap) a).remove(KeyConst.KEY_VIVINO_ID);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.HashMap<@[FlexibleNullability] kotlin.String?, @[FlexibleNullability] kotlin.String?>");
            }
        }
        ParameterUtils.Companion companion = ParameterUtils.Companion;
        Intrinsics.checkNotNullExpressionValue(a, "mapValue");
        for (Map.Entry next : companion.createParamMap(a).entrySet()) {
            linkedHashMap.put(next.getKey(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), (String) next.getValue()));
        }
        C9207b s = getWineManagerApi().updateWineCategory(part, linkedHashMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7431r(function1), new C7418e(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineManagerApi.updateWin…or(it)\n                })");
        return s;
    }
}
