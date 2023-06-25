package com.hisense.juconnect.app_device.fragment;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.p028os.BundleKt;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.listener.IItemIndexedCallback;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.juconnect.connectlife.model.ClaimError;
import com.juconnect.connectlife.model.ClaimProduct;
import com.juconnect.connectlife.model.TicketBean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/juconnect/app_device/fragment/TicketsBaseFragment$setListeners$1", "Lcom/hisense/connect_life/core/listener/IItemIndexedCallback;", "Lcom/juconnect/connectlife/model/TicketBean;", "accept", "", "index", "", "item", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketsBaseFragment.kt */
public final class TicketsBaseFragment$setListeners$1 implements IItemIndexedCallback<TicketBean> {
    public void accept(int i, @NotNull TicketBean ticketBean) {
        Intrinsics.checkNotNullParameter(ticketBean, "item");
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.TicketDetailActivity);
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("claim_id", ticketBean.getClaimId());
        DeviceCache instance = DeviceCache.Companion.getInstance();
        ClaimProduct product = ticketBean.getProduct();
        Intrinsics.checkNotNull(product);
        String auid = product.getAuid();
        Intrinsics.checkNotNull(auid);
        DeviceInfo device = instance.getDevice(auid);
        pairArr[1] = new Pair("deviceName", device == null ? null : device.getDeviceNickName());
        pairArr[2] = new Pair(NotificationCompat.CATEGORY_STATUS, ticketBean.getStatus());
        ClaimError error = ticketBean.getError();
        Intrinsics.checkNotNull(error);
        pairArr[3] = new Pair(NotificationCompatJellybean.KEY_TITLE, error.getTitle());
        pairArr[4] = new Pair("dateClaim", ticketBean.getDateOfClaim());
        pairArr[5] = new Pair("dateRepair", ticketBean.getDateOfRepair());
        ClaimError error2 = ticketBean.getError();
        Intrinsics.checkNotNull(error2);
        pairArr[6] = new Pair(BundleJUnitUtils.KEY_DESCRIPTION, error2.getDescription());
        ClaimError error3 = ticketBean.getError();
        Intrinsics.checkNotNull(error3);
        pairArr[7] = new Pair("connected_appliances", error3.getErrorCodeConnectedAppliances());
        ClaimProduct product2 = ticketBean.getProduct();
        Intrinsics.checkNotNull(product2);
        pairArr[8] = new Pair("deviceId", product2.getAuid());
        pairArr[9] = new Pair("sag_claim_id", ticketBean.getSagClaimId());
        pairArr[10] = new Pair("service_order_id", ticketBean.getServiceOrderId());
        a.withBundle("ticket_detail", BundleKt.bundleOf(pairArr));
        a.navigation();
    }
}
