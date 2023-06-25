package com.hisense.connect_life.hismart.networks.request.message;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageResponse;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageSwitchResponse;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9950f;
import p692o.p698x.C9958n;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\rH'¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageApi;", "", "getMessageChannel", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageResponse;", "params", "", "", "getMessageSwitch", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageSwitchResponse;", "updateMessageSwitch", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "Lokhttp3/RequestBody;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageApi.kt */
public interface MessageApi {
    @NotNull
    @C9950f("msg/get_msg_and_channels")
    C9185c<HiResult<MessageResponse>> getMessageChannel(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("msg/get_msg_switch")
    C9185c<HiResult<MessageSwitchResponse>> getMessageSwitch(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("msg/update_msg_switch")
    C9185c<HiResult<HiResponse>> updateMessageSwitch(@NotNull @C9945a RequestBody requestBody);
}
