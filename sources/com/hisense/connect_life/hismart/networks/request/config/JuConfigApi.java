package com.hisense.connect_life.hismart.networks.request.config;

import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9954j;
import p692o.p698x.C9958n;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/config/JuConfigApi;", "", "cfgPars", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/config/model/ConfigParsCom;", "params", "Lokhttp3/RequestBody;", "getMac", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuConfigApi.kt */
public interface JuConfigApi {
    @C9958n("/ajax/cfgpars.json?rauth=0x04")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<ConfigParsCom> cfgPars(@NotNull @C9945a RequestBody requestBody);

    @C9958n("/ajax/cfgpars.json?rauth=0x04")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<ConfigParsCom> getMac(@NotNull @C9945a RequestBody requestBody);
}
