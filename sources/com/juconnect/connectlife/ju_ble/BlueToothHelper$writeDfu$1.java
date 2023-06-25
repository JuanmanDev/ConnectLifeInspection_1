package com.juconnect.connectlife.ju_ble;

import android.net.Uri;
import com.clj.fastble.callback.BleWriteCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.exception.BleException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$writeDfu$1", "Lcom/clj/fastble/callback/BleWriteCallback;", "onWriteFailure", "", "exception", "Lcom/clj/fastble/exception/BleException;", "onWriteSuccess", "current", "", "total", "justWrite", "", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$writeDfu$1 extends BleWriteCallback {
    public final /* synthetic */ BleDevice $bleDevice;
    public final /* synthetic */ Uri $zipFilePath;
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$writeDfu$1(BlueToothHelper blueToothHelper, BleDevice bleDevice, Uri uri) {
        this.this$0 = blueToothHelper;
        this.$bleDevice = bleDevice;
        this.$zipFilePath = uri;
    }

    public void onWriteFailure(@Nullable BleException bleException) {
        this.this$0.logE("writeDfu , onWriteFailure");
        this.this$0.dfuError(String.valueOf(bleException));
    }

    public void onWriteSuccess(int i, int i2, @Nullable byte[] bArr) {
        this.this$0.logI("writeDfu , onWriteSuccess");
        BlueToothHelper blueToothHelper = this.this$0;
        String name = this.$bleDevice.getName();
        Intrinsics.checkNotNullExpressionValue(name, "bleDevice.name");
        blueToothHelper.scanDfu(name, this.$zipFilePath);
    }
}
