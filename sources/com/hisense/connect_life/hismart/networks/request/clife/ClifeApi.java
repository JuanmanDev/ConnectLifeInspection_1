package com.hisense.connect_life.hismart.networks.request.clife;

import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.request.clife.model.DownloadUserDate;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9950f;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/clife/ClifeApi;", "", "getUserData", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/model/JuCustomResult;", "Lcom/hisense/connect_life/hismart/networks/request/clife/model/DownloadUserDate;", "params", "", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClifeApi.kt */
public interface ClifeApi {
    @NotNull
    @C9950f("clife-svc/get_user_data")
    C9185c<JuCustomResult<DownloadUserDate>> getUserData(@NotNull @C9964t Map<String, String> map);
}
