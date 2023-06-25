package com.juconnect.connectlife.service;

import com.juconnect.connectlife.model.ConlManual;
import com.juconnect.connectlife.model.LastChangeBean;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.model.TicketRequestBean;
import com.juconnect.connectlife.model.TokenBean;
import com.juconnect.connectlife.model.VivinoUsageBean;
import com.juconnect.connectlife.model.WineGroupBean;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Jb\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JZ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00142\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JD\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JJ\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JD\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&J<\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JP\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JB\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JD\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JL\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010)\u001a\u00020\u0017H&JJ\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JP\u0010+\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JJ\u0010,\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020/2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&JD\u00100\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00101\u001a\u0002022\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000f0\rH&¨\u00063"}, mo47991d2 = {"Lcom/juconnect/connectlife/service/IConnectLifeService;", "", "addWine", "Lio/reactivex/disposables/Disposable;", "token", "", "image", "imageFormat", "wineBean", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "count", "", "success", "Lkotlin/Function1;", "", "", "error", "", "wineGroups", "Lcom/juconnect/connectlife/model/WineGroupBean;", "Lorg/json/JSONArray;", "deleteWine", "inventoryID", "", "inventoryIDs", "insertTicket", "ticketRequestBean", "Lcom/juconnect/connectlife/model/TicketRequestBean;", "queryLastChange", "Lcom/juconnect/connectlife/model/LastChangeBean;", "queryManual", "auid", "lang", "Lcom/juconnect/connectlife/model/ConlManual;", "queryTicket", "Lcom/juconnect/connectlife/model/TicketBean;", "queryToken", "userName", "password", "Lcom/juconnect/connectlife/model/TokenBean;", "queryWines", "returnRemoved", "updateFavorite", "updateWine", "updateWineImage", "uploadedFile", "Ljava/io/File;", "", "vivinoLog", "vivinoUsageBean", "Lcom/juconnect/connectlife/model/VivinoUsageBean;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IConnectLifeService.kt */
public interface IConnectLifeService {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: IConnectLifeService.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ C9207b queryWines$default(IConnectLifeService iConnectLifeService, String str, Function1 function1, Function1 function12, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return iConnectLifeService.queryWines(str, function1, function12, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryWines");
        }
    }

    @NotNull
    C9207b addWine(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull WineInventoryBean wineInventoryBean, int i, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b addWine(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<WineGroupBean> list, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b addWine(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JSONArray jSONArray, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b deleteWine(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b deleteWine(@NotNull String str, @NotNull List<String> list, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b insertTicket(@NotNull String str, @NotNull TicketRequestBean ticketRequestBean, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryLastChange(@NotNull String str, @NotNull Function1<? super LastChangeBean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryManual(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super List<ConlManual>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryTicket(@NotNull String str, @NotNull Function1<? super List<TicketBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryToken(@NotNull String str, @NotNull String str2, @NotNull Function1<? super TokenBean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryWines(@NotNull String str, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, boolean z);

    @NotNull
    C9207b updateFavorite(@NotNull String str, @NotNull WineInventoryBean wineInventoryBean, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateWine(@NotNull String str, @NotNull List<WineInventoryBean> list, @NotNull Function1<? super List<WineInventoryBean>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateWineImage(@NotNull String str, @NotNull File file, long j, @NotNull Function1<? super WineInventoryBean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b vivinoLog(@NotNull String str, @NotNull VivinoUsageBean vivinoUsageBean, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
