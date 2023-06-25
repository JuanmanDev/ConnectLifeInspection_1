package com.juconnect.connectlife.ju_ble;

import android.net.Uri;
import com.clj.fastble.callback.BleIndicateCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.exception.BleException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$indicate$1", "Lcom/clj/fastble/callback/BleIndicateCallback;", "onCharacteristicChanged", "", "data", "", "onIndicateFailure", "exception", "Lcom/clj/fastble/exception/BleException;", "onIndicateSuccess", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$indicate$1 extends BleIndicateCallback {
    public final /* synthetic */ BleDevice $bleDevice;
    public final /* synthetic */ Uri $zipFilePath;
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$indicate$1(BlueToothHelper blueToothHelper, BleDevice bleDevice, Uri uri) {
        this.this$0 = blueToothHelper;
        this.$bleDevice = bleDevice;
        this.$zipFilePath = uri;
    }

    public void onCharacteristicChanged(@Nullable byte[] bArr) {
        this.this$0.logI("indicate , onCharacteristicChanged");
    }

    public void onIndicateFailure(@Nullable BleException bleException) {
        this.this$0.logE("indicate , onIndicateFailure");
    }

    public void onIndicateSuccess() {
        this.this$0.logI("indicate , onIndicateSuccess");
        this.this$0.writeDfu(this.$bleDevice, this.$zipFilePath);
    }
}
