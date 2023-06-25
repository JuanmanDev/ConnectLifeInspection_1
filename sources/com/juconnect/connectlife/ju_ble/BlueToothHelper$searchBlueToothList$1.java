package com.juconnect.connectlife.ju_ble;

import com.clj.fastble.callback.BleScanCallback;
import com.clj.fastble.data.BleDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$searchBlueToothList$1", "Lcom/clj/fastble/callback/BleScanCallback;", "onScanFinished", "", "scanResultList", "", "Lcom/clj/fastble/data/BleDevice;", "onScanStarted", "success", "", "onScanning", "bleDevice", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$searchBlueToothList$1 extends BleScanCallback {
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$searchBlueToothList$1(BlueToothHelper blueToothHelper) {
        this.this$0 = blueToothHelper;
    }

    public void onScanFinished(@Nullable List<BleDevice> list) {
        this.this$0.logI(Intrinsics.stringPlus("searchBlueToothList onScanFinished, bleDevice is ", list));
        OnDfuResultListener access$getOnDfuResultListener$p = this.this$0.onDfuResultListener;
        if (access$getOnDfuResultListener$p != null) {
            access$getOnDfuResultListener$p.onScanFinish(list);
        }
    }

    public void onScanStarted(boolean z) {
        this.this$0.logI(Intrinsics.stringPlus("searchBlueToothList onScanStarted, success is ", Boolean.valueOf(z)));
    }

    public void onScanning(@Nullable BleDevice bleDevice) {
        this.this$0.logI(Intrinsics.stringPlus("searchBlueToothList onScanning, bleDevice is ", bleDevice));
    }
}
