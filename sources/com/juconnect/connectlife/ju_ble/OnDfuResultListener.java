package com.juconnect.connectlife.ju_ble;

import com.clj.fastble.data.BleDevice;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/OnDfuResultListener;", "", "onAbove", "", "error", "", "onError", "onProgress", "progress", "", "currentPart", "partsTotal", "onScanFinish", "bleList", "", "Lcom/clj/fastble/data/BleDevice;", "onSuccess", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public interface OnDfuResultListener {
    void onAbove(@NotNull String str);

    void onError(@NotNull String str);

    void onProgress(int i, int i2, int i3);

    void onScanFinish(@Nullable List<BleDevice> list);

    void onSuccess();
}
