package com.hisense.connect_life.hismart.networks.request.pushmessage;

import com.hisense.connect_life.hismart.model.JuResult;
import com.hisense.connect_life.hismart.model.LogResponse;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9954j;
import p692o.p698x.C9958n;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/pushmessage/PushMessageApi;", "", "clearDeviceToken", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/model/JuResult;", "params", "Lokhttp3/RequestBody;", "registerDeviceToken", "upLog", "Lcom/hisense/connect_life/hismart/model/LogResponse;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PushMessageApi.kt */
public interface PushMessageApi {
    @C9958n("push/clear_devicetoken")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<JuResult> clearDeviceToken(@NotNull @C9945a RequestBody requestBody);

    @C9958n("push/register_devicetoken")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<JuResult> registerDeviceToken(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("api/systemLog")
    C9185c<LogResponse> upLog(@NotNull @C9945a RequestBody requestBody);
}
