package com.juconnect.connectlife.api;

import com.juconnect.connectlife.model.ConlManual;
import com.juconnect.connectlife.model.InsTicketResult;
import com.juconnect.connectlife.model.LastChangeBean;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.model.TokenBean;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9946b;
import p692o.p698x.C9947c;
import p692o.p698x.C9949e;
import p692o.p698x.C9950f;
import p692o.p698x.C9952h;
import p692o.p698x.C9953i;
import p692o.p698x.C9954j;
import p692o.p698x.C9955k;
import p692o.p698x.C9958n;
import p692o.p698x.C9959o;
import p692o.p698x.C9960p;
import p692o.p698x.C9962r;
import p692o.p698x.C9963s;
import p692o.p698x.C9967w;

@Metadata(mo47990d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\nH'J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\nH'J2\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\nH'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0007H'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H'J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u00072\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020\u0007H'J2\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\"\u001a\u00020\fH'J2\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\nH'J6\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020%2\b\b\u0001\u0010&\u001a\u00020\nH'J,\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\nH'¨\u0006("}, mo47991d2 = {"Lcom/juconnect/connectlife/api/WineInventoryApi;", "", "changeFavoriteState", "Lio/reactivex/Flowable;", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "token", "", "version", "request", "Lokhttp3/RequestBody;", "deleteWine", "", "inventoryID", "deleteWineBulk", "body", "insertTicket", "Lcom/juconnect/connectlife/model/InsTicketResult;", "insertWine", "queryLastChange", "Lcom/juconnect/connectlife/model/LastChangeBean;", "queryManual", "Lcom/juconnect/connectlife/model/ConlManual;", "brand", "lang", "queryTicket", "Lcom/juconnect/connectlife/model/TicketBean;", "queryToken", "Lcom/juconnect/connectlife/model/TokenBean;", "url", "grantType", "username", "password", "queryWine", "returnRemoved", "updateWine", "updateWineImage", "", "uploadedFile", "vivinoLog", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryApi.kt */
public interface WineInventoryApi {
    @C9959o("/api/v{version}/wine-cooler/inventory/favorite/bulk")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<List<WineInventoryBean>> changeFavoriteState(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9946b("/api/v{version}/wine-cooler/inventory/{inventoryID}")
    C9185c<Boolean> deleteWine(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9962r("inventoryID") String str3);

    @NotNull
    @C9952h(hasBody = true, method = "DELETE", path = "/api/v{version}/wine-cooler/inventory/delete/bulk")
    C9185c<Boolean> deleteWineBulk(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9945a RequestBody requestBody);

    @C9958n("/api/v{version}/ticket")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<InsTicketResult> insertTicket(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/api/v{version}/wine-cooler/inventory/bulk")
    C9185c<List<WineInventoryBean>> insertWine(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("/api/v{version}/wine-cooler/inventory/lastchange")
    C9185c<LastChangeBean> queryLastChange(@NotNull @C9962r("version") String str, @NotNull @C9953i("JuhaokanToken") String str2);

    @NotNull
    @C9950f("/api/v1/manuals/{auids}/{lang}")
    C9185c<List<ConlManual>> queryManual(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("auids") String str2, @NotNull @C9962r("lang") String str3);

    @NotNull
    @C9950f("/api/v{version}/ticket")
    C9185c<List<TicketBean>> queryTicket(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2);

    @C9949e
    @C9958n
    @NotNull
    C9185c<TokenBean> queryToken(@C9967w @NotNull String str, @C9947c("grant_type") @NotNull String str2, @C9947c("username") @NotNull String str3, @C9947c("password") @NotNull String str4);

    @C9950f("/api/v{version}/wine-cooler/inventory")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<List<WineInventoryBean>> queryWine(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @C9963s("returnRemoved") boolean z);

    @C9959o("/api/v{version}/wine-cooler/inventory/bulk")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<List<WineInventoryBean>> updateWine(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9945a RequestBody requestBody);

    @C9958n("/api/v{version}/wine-cooler/inventory/{inventoryID}/image")
    @C9955k
    @NotNull
    C9185c<WineInventoryBean> updateWineImage(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @C9962r("inventoryID") long j, @NotNull @C9960p("uploadedFile") RequestBody requestBody);

    @NotNull
    @C9958n("/api/v{version}/wine-cooler/vivino/log")
    C9185c<Boolean> vivinoLog(@NotNull @C9953i("JuhaokanToken") String str, @NotNull @C9962r("version") String str2, @NotNull @C9945a RequestBody requestBody);
}
