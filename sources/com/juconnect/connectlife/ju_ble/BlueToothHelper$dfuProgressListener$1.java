package com.juconnect.connectlife.ju_ble;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p691no.nordicsemi.android.dfu.DfuProgressListener;
import p691no.nordicsemi.android.dfu.DfuServiceListenerHelper;

@Metadata(mo47990d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J8\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¨\u0006\u001b"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$dfuProgressListener$1", "Lno/nordicsemi/android/dfu/DfuProgressListener;", "onDeviceConnected", "", "deviceAddress", "", "onDeviceConnecting", "onDeviceDisconnected", "onDeviceDisconnecting", "onDfuAborted", "onDfuCompleted", "onDfuProcessStarted", "onDfuProcessStarting", "onEnablingDfuMode", "onError", "error", "", "errorType", "message", "onFirmwareValidating", "onProgressChanged", "percent", "speed", "", "avgSpeed", "currentPart", "partsTotal", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$dfuProgressListener$1 implements DfuProgressListener {
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$dfuProgressListener$1(BlueToothHelper blueToothHelper) {
        this.this$0 = blueToothHelper;
    }

    public void onDeviceConnected(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDeviceConnected");
    }

    public void onDeviceConnecting(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDeviceConnecting");
    }

    public void onDeviceDisconnected(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDeviceDisconnected");
    }

    public void onDeviceDisconnecting(@Nullable String str) {
        this.this$0.logE("DFU onDeviceDisconnecting");
    }

    public void onDfuAborted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDfuAborted");
        OnDfuResultListener access$getOnDfuResultListener$p = this.this$0.onDfuResultListener;
        if (access$getOnDfuResultListener$p != null) {
            access$getOnDfuResultListener$p.onAbove(str);
        }
        Context access$getContext$p = this.this$0.context;
        Intrinsics.checkNotNull(access$getContext$p);
        DfuServiceListenerHelper.unregisterProgressListener(access$getContext$p, this);
    }

    public void onDfuCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDfuCompleted");
        this.this$0.dfuFinish();
    }

    public void onDfuProcessStarted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDfuProcessStarted");
    }

    public void onDfuProcessStarting(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onDfuProcessStarting");
    }

    public void onEnablingDfuMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logE("DFU onEnablingDfuMode");
    }

    public void onError(@NotNull String str, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        Intrinsics.checkNotNullParameter(str2, "message");
        this.this$0.logE("DFU onError: errorCode: " + i + ", errorType: " + i2 + ", errorMessage: " + str2);
        if (i == 4096) {
            boolean z = true;
            if (this.this$0.lastMac.length() > 0) {
                if (this.this$0.lastZipPath.length() <= 0) {
                    z = false;
                }
                if (z) {
                    BlueToothHelper blueToothHelper = this.this$0;
                    blueToothHelper.startDfuOta(blueToothHelper.lastMac, this.this$0.lastZipPath);
                    this.this$0.lastMac = "";
                    this.this$0.lastZipPath = "";
                    return;
                }
            }
        }
        this.this$0.dfuError(str2);
    }

    public void onFirmwareValidating(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        this.this$0.logI("DFU onFirmwareValidating");
    }

    public void onProgressChanged(@NotNull String str, int i, float f, float f2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "deviceAddress");
        BlueToothHelper blueToothHelper = this.this$0;
        blueToothHelper.logI("DFU onProgressChanged: deviceAddress: " + str + ", percent: " + i + ", speed: " + f + ", avgSpeed: " + f2 + ", currentPart: " + i2 + ", partsTotal: " + i3);
        OnDfuResultListener access$getOnDfuResultListener$p = this.this$0.onDfuResultListener;
        if (access$getOnDfuResultListener$p != null) {
            access$getOnDfuResultListener$p.onProgress(i, i2, i3);
        }
    }
}
