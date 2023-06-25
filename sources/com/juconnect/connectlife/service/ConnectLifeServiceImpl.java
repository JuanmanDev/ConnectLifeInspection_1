package com.juconnect.connectlife.service;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.juconnect.connectlife.api.WineInventoryApi;
import com.juconnect.connectlife.global.UrlConstKt;
import com.juconnect.connectlife.model.AddWineBean;
import com.juconnect.connectlife.model.ConlManual;
import com.juconnect.connectlife.model.InsTicketResult;
import com.juconnect.connectlife.model.LastChangeBean;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.model.TicketRequestBean;
import com.juconnect.connectlife.model.TokenBean;
import com.juconnect.connectlife.model.VivinoUsageBean;
import com.juconnect.connectlife.model.WineFavoriteBean;
import com.juconnect.connectlife.model.WineGroupBean;
import com.juconnect.connectlife.model.WineInventoryBean;
import com.juconnect.connectlife.utils.LoggerUtil;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p301y.p302b.p518e.C7745a;
import p040c.p301y.p302b.p518e.C7746a0;
import p040c.p301y.p302b.p518e.C7747b;
import p040c.p301y.p302b.p518e.C7748b0;
import p040c.p301y.p302b.p518e.C7749c;
import p040c.p301y.p302b.p518e.C7750c0;
import p040c.p301y.p302b.p518e.C7751d;
import p040c.p301y.p302b.p518e.C7752d0;
import p040c.p301y.p302b.p518e.C7753e;
import p040c.p301y.p302b.p518e.C7754f;
import p040c.p301y.p302b.p518e.C7755g;
import p040c.p301y.p302b.p518e.C7756h;
import p040c.p301y.p302b.p518e.C7757i;
import p040c.p301y.p302b.p518e.C7758j;
import p040c.p301y.p302b.p518e.C7759k;
import p040c.p301y.p302b.p518e.C7760l;
import p040c.p301y.p302b.p518e.C7761m;
import p040c.p301y.p302b.p518e.C7762n;
import p040c.p301y.p302b.p518e.C7763o;
import p040c.p301y.p302b.p518e.C7764p;
import p040c.p301y.p302b.p518e.C7765q;
import p040c.p301y.p302b.p518e.C7766r;
import p040c.p301y.p302b.p518e.C7767s;
import p040c.p301y.p302b.p518e.C7768t;
import p040c.p301y.p302b.p518e.C7769u;
import p040c.p301y.p302b.p518e.C7770v;
import p040c.p301y.p302b.p518e.C7771w;
import p040c.p301y.p302b.p518e.C7772x;
import p040c.p301y.p302b.p518e.C7773y;
import p040c.p301y.p302b.p518e.C7774z;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jb\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J`\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JZ\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001b2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JD\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JJ\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JD\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J<\u0010#\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JP\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JB\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JD\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JJ\u0010/\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u00100\u001a\u00020\u001eH\u0016JJ\u00101\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JP\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JJ\u00103\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00104\u001a\u0002052\u0006\u0010\u001d\u001a\u0002062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016JD\u00107\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00108\u001a\u0002092\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006:"}, mo47991d2 = {"Lcom/juconnect/connectlife/service/ConnectLifeServiceImpl;", "Lcom/juconnect/connectlife/service/IConnectLifeService;", "()V", "wineInventoryApi", "Lcom/juconnect/connectlife/api/WineInventoryApi;", "getWineInventoryApi", "()Lcom/juconnect/connectlife/api/WineInventoryApi;", "wineInventoryApi$delegate", "Lkotlin/Lazy;", "addWine", "Lio/reactivex/disposables/Disposable;", "token", "", "image", "imageFormat", "wineBean", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "count", "", "success", "Lkotlin/Function1;", "", "", "error", "", "wineGroups", "Lcom/juconnect/connectlife/model/WineGroupBean;", "Lorg/json/JSONArray;", "deleteWine", "inventoryID", "", "inventoryIDs", "insertTicket", "ticketRequestBean", "Lcom/juconnect/connectlife/model/TicketRequestBean;", "queryLastChange", "Lcom/juconnect/connectlife/model/LastChangeBean;", "queryManual", "auid", "lang", "Lcom/juconnect/connectlife/model/ConlManual;", "queryTicket", "Lcom/juconnect/connectlife/model/TicketBean;", "queryToken", "userName", "password", "Lcom/juconnect/connectlife/model/TokenBean;", "queryWines", "returnRemoved", "updateFavorite", "updateWine", "updateWineImage", "uploadedFile", "Ljava/io/File;", "", "vivinoLog", "vivinoUsageBean", "Lcom/juconnect/connectlife/model/VivinoUsageBean;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeServiceImpl.kt */
public final class ConnectLifeServiceImpl implements IConnectLifeService {
    @NotNull
    public final Lazy wineInventoryApi$delegate = LazyKt__LazyJVMKt.lazy(ConnectLifeServiceImpl$wineInventoryApi$2.INSTANCE);

    /* renamed from: addWine$lambda-16  reason: not valid java name */
    public static final void m27254addWine$lambda16(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(list);
    }

    /* renamed from: addWine$lambda-17  reason: not valid java name */
    public static final void m27255addWine$lambda17(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: addWine$lambda-18  reason: not valid java name */
    public static final void m27256addWine$lambda18(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(list);
    }

    /* renamed from: addWine$lambda-19  reason: not valid java name */
    public static final void m27257addWine$lambda19(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: addWine$lambda-21  reason: not valid java name */
    public static final void m27258addWine$lambda21(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(list);
    }

    /* renamed from: addWine$lambda-22  reason: not valid java name */
    public static final void m27259addWine$lambda22(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: deleteWine$lambda-10  reason: not valid java name */
    public static final void m27260deleteWine$lambda10(Function1 function1, Boolean bool) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(bool);
    }

    /* renamed from: deleteWine$lambda-11  reason: not valid java name */
    public static final void m27261deleteWine$lambda11(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: deleteWine$lambda-8  reason: not valid java name */
    public static final void m27262deleteWine$lambda8(Function1 function1, Boolean bool) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(bool);
    }

    /* renamed from: deleteWine$lambda-9  reason: not valid java name */
    public static final void m27263deleteWine$lambda9(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    private final WineInventoryApi getWineInventoryApi() {
        Object value = this.wineInventoryApi$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-wineInventoryApi>(...)");
        return (WineInventoryApi) value;
    }

    /* renamed from: insertTicket$lambda-27  reason: not valid java name */
    public static final void m27264insertTicket$lambda27(Function1 function1, InsTicketResult insTicketResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("result = ", insTicketResult));
        boolean z = false;
        if (insTicketResult != null && insTicketResult.getClaimId() == 0) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: insertTicket$lambda-28  reason: not valid java name */
    public static final void m27265insertTicket$lambda28(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("throwable = ", th));
        function1.invoke(th);
    }

    /* renamed from: queryLastChange$lambda-4  reason: not valid java name */
    public static final void m27266queryLastChange$lambda4(Function1 function1, LastChangeBean lastChangeBean) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(lastChangeBean);
    }

    /* renamed from: queryLastChange$lambda-5  reason: not valid java name */
    public static final void m27267queryLastChange$lambda5(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: queryManual$lambda-2  reason: not valid java name */
    public static final void m27268queryManual$lambda2(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        function1.invoke(list);
    }

    /* renamed from: queryManual$lambda-3  reason: not valid java name */
    public static final void m27269queryManual$lambda3(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: queryTicket$lambda-25  reason: not valid java name */
    public static final void m27270queryTicket$lambda25(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(list);
    }

    /* renamed from: queryTicket$lambda-26  reason: not valid java name */
    public static final void m27271queryTicket$lambda26(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: queryToken$lambda-0  reason: not valid java name */
    public static final void m27272queryToken$lambda0(Function1 function1, TokenBean tokenBean) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(tokenBean);
    }

    /* renamed from: queryToken$lambda-1  reason: not valid java name */
    public static final void m27273queryToken$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: queryWines$lambda-6  reason: not valid java name */
    public static final void m27274queryWines$lambda6(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(list);
    }

    /* renamed from: queryWines$lambda-7  reason: not valid java name */
    public static final void m27275queryWines$lambda7(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: updateFavorite$lambda-14  reason: not valid java name */
    public static final void m27276updateFavorite$lambda14(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("updateFavorite - success: ", list));
        function1.invoke(list);
    }

    /* renamed from: updateFavorite$lambda-15  reason: not valid java name */
    public static final void m27277updateFavorite$lambda15(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("updateFavorite - error: ", th));
        function1.invoke(th);
    }

    /* renamed from: updateWine$lambda-12  reason: not valid java name */
    public static final void m27278updateWine$lambda12(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(list);
    }

    /* renamed from: updateWine$lambda-13  reason: not valid java name */
    public static final void m27279updateWine$lambda13(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: updateWineImage$lambda-23  reason: not valid java name */
    public static final void m27280updateWineImage$lambda23(Function1 function1, WineInventoryBean wineInventoryBean) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullExpressionValue(wineInventoryBean, LanguageConstKt.f15954it);
        function1.invoke(wineInventoryBean);
    }

    /* renamed from: updateWineImage$lambda-24  reason: not valid java name */
    public static final void m27281updateWineImage$lambda24(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    /* renamed from: vivinoLog$lambda-29  reason: not valid java name */
    public static final void m27282vivinoLog$lambda29(Function1 function1, Boolean bool) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(bool);
    }

    /* renamed from: vivinoLog$lambda-30  reason: not valid java name */
    public static final void m27283vivinoLog$lambda30(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    @NotNull
    public C9207b addWine(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull WineInventoryBean wineInventoryBean, int i, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str2, "image");
        Intrinsics.checkNotNullParameter(str3, "imageFormat");
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wineBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().insertWine(str, "1.0", RequestBody.Companion.create(MediaType.Companion.parse("application/json"), new Gson().toJson((Object) new AddWineBean(str2, str3, CollectionsKt__CollectionsJVMKt.listOf(new WineGroupBean(wineInventoryBean, i))), (Type) AddWineBean.class).toString())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7758j(function1), new C7749c(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.insertW…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b deleteWine(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str2, "inventoryID");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().deleteWine(str, "1.0", str2).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7755g(function1), new C7771w(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.deleteW…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b insertTicket(@NotNull String str, @NotNull TicketRequestBean ticketRequestBean, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(ticketRequestBean, "ticketRequestBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().insertTicket(str, "1.0", RequestBody.Companion.create(MediaType.Companion.parse("application/json"), new Gson().toJson((Object) ticketRequestBean).toString())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7773y(function1), new C7753e(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.insertT…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b queryLastChange(@NotNull String str, @NotNull Function1<? super LastChangeBean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().queryLastChange("1.0", str).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7763o(function1), new C7759k(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.queryLa…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b queryManual(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super List<ConlManual>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "lang");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().queryManual(str, str2, str3).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7750c0(function1), new C7756h(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.queryMa… error(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b queryTicket(@NotNull String str, @NotNull Function1<? super List<TicketBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().queryTicket(str, "1.0").mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7770v(function1), new C7762n(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.queryTi…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b queryToken(@NotNull String str, @NotNull String str2, @NotNull Function1<? super TokenBean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().queryToken(UrlConstKt.URL_CONNECT_LIFE_TOKEN, "password", str, str2).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7760l(function1), new C7745a(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.queryTo…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b queryWines(@NotNull String str, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().queryWine(str, "1.0", z).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7772x(function1), new C7746a0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.queryWi…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b updateFavorite(@NotNull String str, @NotNull WineInventoryBean wineInventoryBean, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wineBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        String json = new Gson().toJson((Object) new WineFavoriteBean(wineInventoryBean.isFavorite(), wineInventoryBean.getName(), wineInventoryBean.getVintage(), wineInventoryBean.getWinery()));
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("updateFavorite - data: ", json));
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType parse = MediaType.Companion.parse("application/json");
        Intrinsics.checkNotNullExpressionValue(json, "beanJson");
        RequestBody create = companion.create(parse, json);
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("updateFavorite - body: ", create));
        C9207b s = getWineInventoryApi().changeFavoriteState(str, "1.0", create).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7761m(function1), new C7767s(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.changeF…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b updateWine(@NotNull String str, @NotNull List<WineInventoryBean> list, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(list, "wineBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        String json = new Gson().toJson((Object) list);
        LoggerUtil.Companion.mo45314e(Intrinsics.stringPlus("addWine - data: ", json));
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType parse = MediaType.Companion.parse("application/json");
        Intrinsics.checkNotNullExpressionValue(json, "beanJson");
        C9207b s = getWineInventoryApi().updateWine(str, "1.0", companion.create(parse, json)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7774z(function1), new C7752d0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.updateW…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b updateWineImage(@NotNull String str, @NotNull File file, long j, @NotNull Function1<? super WineInventoryBean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(file, "uploadedFile");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().updateWineImage(str, "1.0", j, RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7764p(function1), new C7748b0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.updateW…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b vivinoLog(@NotNull String str, @NotNull VivinoUsageBean vivinoUsageBean, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(vivinoUsageBean, "vivinoUsageBean");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        String json = new Gson().toJson((Object) vivinoUsageBean, (Type) VivinoUsageBean.class);
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType parse = MediaType.Companion.parse("application/json; charset=utf-8");
        Intrinsics.checkNotNullExpressionValue(json, "beanJson");
        C9207b s = getWineInventoryApi().vivinoLog(str, "1.0", companion.create(parse, json)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7765q(function1), new C7747b(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.vivinoL…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b deleteWine(@NotNull String str, @NotNull List<String> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(list, "inventoryIDs");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().deleteWineBulk(str, "1.0", RequestBody.Companion.create(MediaType.Companion.parse("application/json"), new Gson().toJson((Object) list).toString())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7754f(function1), new C7769u(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.deleteW…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b addWine(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<WineGroupBean> list, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str2, "image");
        Intrinsics.checkNotNullParameter(str3, "imageFormat");
        Intrinsics.checkNotNullParameter(list, "wineGroups");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = getWineInventoryApi().insertWine(str, "1.0", RequestBody.Companion.create(MediaType.Companion.parse("application/json"), new Gson().toJson((Object) new AddWineBean(str2, str3, list), (Type) AddWineBean.class).toString())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7751d(function1), new C7768t(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.insertW…          }\n            )");
        return s;
    }

    @NotNull
    public C9207b addWine(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JSONArray jSONArray, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str2, "image");
        Intrinsics.checkNotNullParameter(str3, "imageFormat");
        Intrinsics.checkNotNullParameter(jSONArray, "wineGroups");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("image", str2);
        jSONObject.put("imageFormat", str3);
        jSONObject.put("itemGroups", jSONArray);
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType parse = MediaType.Companion.parse("application/json");
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
        C9207b s = getWineInventoryApi().insertWine(str, "1.0", companion.create(parse, jSONObject2)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7766r(function1), new C7757i(function12));
        Intrinsics.checkNotNullExpressionValue(s, "wineInventoryApi.insertW…          }\n            )");
        return s;
    }
}
