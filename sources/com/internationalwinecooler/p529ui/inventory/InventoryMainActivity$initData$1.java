package com.internationalwinecooler.p529ui.inventory;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "it", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$initData$1 */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity$initData$1 extends Lambda implements Function1<List<? extends DeviceInfo>, Unit> {
    public static final InventoryMainActivity$initData$1 INSTANCE = new InventoryMainActivity$initData$1();

    public InventoryMainActivity$initData$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<DeviceInfo>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
    }
}
