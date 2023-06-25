package com.juconnect.connectlife.ju_ble;

import com.clj.fastble.callback.BleWriteCallback;
import com.clj.fastble.exception.BleException;
import com.juconnect.connectlife.ju_ble.BleDeviceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BleDeviceManager$write$1", "Lcom/clj/fastble/callback/BleWriteCallback;", "onWriteFailure", "", "exception", "Lcom/clj/fastble/exception/BleException;", "onWriteSuccess", "current", "", "total", "justWrite", "", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BleDeviceManager.kt */
public final class BleDeviceManager$write$1 extends BleWriteCallback {
    public final /* synthetic */ int $writeSendIndex;

    public BleDeviceManager$write$1(int i) {
        this.$writeSendIndex = i;
    }

    public void onWriteFailure(@Nullable BleException bleException) {
        BleDeviceManager.BleDeviceConnectCallBack mBleCallback;
        BleDeviceManager.BleDeviceConnectCallBack mBleCallback2;
        BleDeviceManager.INSTANCE.getTAG();
        Intrinsics.checkNotNull(bleException);
        Intrinsics.stringPlus("写入信息失败: ", bleException);
        if (bleException.getCode() == 102) {
            String description = bleException.getDescription();
            Intrinsics.checkNotNullExpressionValue(description, "exception.description");
            if (StringsKt__StringsKt.contains$default((CharSequence) description, (CharSequence) "not connect", false, 2, (Object) null) && (mBleCallback2 = BleDeviceManager.INSTANCE.getMBleCallback()) != null) {
                mBleCallback2.onBluetoothDisconnected();
            }
        }
        int i = this.$writeSendIndex;
        if (i == 0 || i == 3) {
            BleDeviceManager.BleDeviceConnectCallBack mBleCallback3 = BleDeviceManager.INSTANCE.getMBleCallback();
            if (mBleCallback3 != null) {
                mBleCallback3.errorCallback("talkToBleDeviceCallback", "1", Integer.parseInt("2402"), "ble_zero_setting_write_error", "");
            }
        } else if ((i == 4 || i == 5) && (mBleCallback = BleDeviceManager.INSTANCE.getMBleCallback()) != null) {
            mBleCallback.errorCallback("talkToBleDeviceCallback", "1", Integer.parseInt("2302"), "ble_read_error", "");
        }
    }

    public void onWriteSuccess(int i, int i2, @Nullable byte[] bArr) {
        int i3 = this.$writeSendIndex;
        if (i3 == 0) {
            BleDeviceManager.INSTANCE.getTAG();
        } else if (i3 == 1) {
            BleDeviceManager.INSTANCE.getTAG();
        } else if (i3 == 2) {
            BleDeviceManager.INSTANCE.getTAG();
        } else if (i3 == 3) {
            BleDeviceManager.INSTANCE.getTAG();
        }
        BleDeviceManager.INSTANCE.read();
    }
}
