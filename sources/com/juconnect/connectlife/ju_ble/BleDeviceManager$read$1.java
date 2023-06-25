package com.juconnect.connectlife.ju_ble;

import com.clj.fastble.callback.BleReadCallback;
import com.clj.fastble.exception.BleException;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.juconnect.connectlife.ju_ble.BleDeviceManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BleDeviceManager$read$1", "Lcom/clj/fastble/callback/BleReadCallback;", "onReadFailure", "", "exception", "Lcom/clj/fastble/exception/BleException;", "onReadSuccess", "data", "", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BleDeviceManager.kt */
public final class BleDeviceManager$read$1 extends BleReadCallback {
    public void onReadFailure(@NotNull BleException bleException) {
        Intrinsics.checkNotNullParameter(bleException, "exception");
        BleDeviceManager.INSTANCE.getTAG();
        Intrinsics.stringPlus("读取信息失败: ", bleException);
    }

    public void onReadSuccess(@NotNull byte[] bArr) {
        BleDeviceManager.BleDeviceConnectCallBack mBleCallback;
        Intrinsics.checkNotNullParameter(bArr, "data");
        int sendIndex = BleDeviceManager.INSTANCE.getSendIndex();
        boolean z = false;
        boolean z2 = true;
        if (sendIndex == 0) {
            String access$bytesToString = BleDeviceManager.INSTANCE.bytesToString(bArr);
            BleDeviceManager.INSTANCE.getTAG();
            Intrinsics.stringPlus("ds = ", access$bytesToString);
            if (BleDeviceManager.INSTANCE.getMBleCallback() != null) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback2 = BleDeviceManager.INSTANCE.getMBleCallback();
                Intrinsics.checkNotNull(mBleCallback2);
                mBleCallback2.configRouteSuccess();
            }
            BleDeviceManager.INSTANCE.setSendIndex(3);
            BleDeviceManager.INSTANCE.write(BleDeviceManager.WRITE_CMD_GET_DEVICE_WIFI_STATE, BleDeviceManager.INSTANCE.toHumanString(BleDeviceManager.WRITE_CMD_GET_DEVICE_WIFI_STATE));
        } else if (sendIndex == 1) {
            String access$bytesToString2 = BleDeviceManager.INSTANCE.bytesToString(bArr);
            Intrinsics.stringPlus("connCallback wifiId=", access$bytesToString2);
            if (!(access$bytesToString2 == null || access$bytesToString2.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback3 = BleDeviceManager.INSTANCE.getMBleCallback();
                if (mBleCallback3 != null) {
                    mBleCallback3.errorCallback("connBleDeviceCallback", "2", Integer.parseInt("-100"), "ble_get_wifi_id", "");
                    return;
                }
                return;
            }
            if (BleDeviceManager.INSTANCE.getMBleCallback() != null) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback4 = BleDeviceManager.INSTANCE.getMBleCallback();
                Intrinsics.checkNotNull(mBleCallback4);
                mBleCallback4.getWifiId(access$bytesToString2);
            }
            BleDeviceManager.INSTANCE.setSendIndex(2);
            BleDeviceManager.INSTANCE.write(BleDeviceManager.WRITE_CMD_GET_DEVICE_ID, new String[0]);
        } else if (sendIndex == 2) {
            String access$bytesToString3 = BleDeviceManager.INSTANCE.bytesToString(bArr);
            BleDeviceManager.INSTANCE.getTAG();
            Intrinsics.stringPlus("deviceId = ", access$bytesToString3);
            if (BleDeviceManager.INSTANCE.getMBleCallback() != null) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback5 = BleDeviceManager.INSTANCE.getMBleCallback();
                Intrinsics.checkNotNull(mBleCallback5);
                mBleCallback5.getDeviceId(access$bytesToString3);
            }
            if (BleDeviceManager.INSTANCE.getMBleVersion() == 2) {
                BleDeviceManager.INSTANCE.getWifiList();
            } else if (BleDeviceManager.INSTANCE.getMBleCallback() != null) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback6 = BleDeviceManager.INSTANCE.getMBleCallback();
                Intrinsics.checkNotNull(mBleCallback6);
                mBleCallback6.showWifiPassword();
            }
        } else if (sendIndex == 3) {
            String bytesToHex = BleDeviceManager.INSTANCE.bytesToHex(bArr);
            BleDeviceManager.INSTANCE.getTAG();
            Intrinsics.stringPlus("result = ", bytesToHex);
            int access$parseDeviceStatus = BleDeviceManager.INSTANCE.parseDeviceStatus(bytesToHex);
            BleDeviceManager.INSTANCE.getTAG();
            Intrinsics.stringPlus("bleStatus = ", Integer.valueOf(access$parseDeviceStatus));
            if (access$parseDeviceStatus == 99) {
                BleDeviceManager.INSTANCE.write(BleDeviceManager.WRITE_CMD_GET_DEVICE_WIFI_STATE, BleDeviceManager.INSTANCE.toHumanString(BleDeviceManager.WRITE_CMD_GET_DEVICE_WIFI_STATE));
            } else if (access$parseDeviceStatus == 0) {
                BleDeviceManager.INSTANCE.getTAG();
                if (BleDeviceManager.INSTANCE.getMBleCallback() != null) {
                    BleDeviceManager.BleDeviceConnectCallBack mBleCallback7 = BleDeviceManager.INSTANCE.getMBleCallback();
                    Intrinsics.checkNotNull(mBleCallback7);
                    mBleCallback7.configSuccess();
                }
            } else if (access$parseDeviceStatus == 1) {
                BleDeviceManager.INSTANCE.getTAG();
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback8 = BleDeviceManager.INSTANCE.getMBleCallback();
                if (mBleCallback8 != null) {
                    mBleCallback8.errorCallback("wifiConfigCallback", "1", Integer.parseInt("1"), Intrinsics.stringPlus("密码错误", bytesToHex), bytesToHex);
                }
            } else if (access$parseDeviceStatus == 2) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback9 = BleDeviceManager.INSTANCE.getMBleCallback();
                if (mBleCallback9 != null) {
                    mBleCallback9.errorCallback("wifiConfigCallback", "1", Integer.parseInt(CrashDumperPlugin.OPTION_KILL_DEFAULT), Intrinsics.stringPlus("模块关联目标热点失败", bytesToHex), bytesToHex);
                }
            } else if (access$parseDeviceStatus != 6) {
                if (access$parseDeviceStatus != 7) {
                    if (access$parseDeviceStatus == 8) {
                        BleDeviceManager.BleDeviceConnectCallBack mBleCallback10 = BleDeviceManager.INSTANCE.getMBleCallback();
                        if (mBleCallback10 != null) {
                            mBleCallback10.errorCallback("wifiConfigCallback", "1", Integer.parseInt("2"), Intrinsics.stringPlus("目标热点，模块最终扫描失败", bytesToHex), bytesToHex);
                        }
                    } else if (access$parseDeviceStatus == 10 && (mBleCallback = BleDeviceManager.INSTANCE.getMBleCallback()) != null) {
                        mBleCallback.errorCallback("wifiConfigCallback", "1", Integer.parseInt("2"), "0407云端无响应", bytesToHex);
                    }
                } else if (BleDeviceManager.INSTANCE.getMBleVersion() == 2) {
                    BleDeviceManager.INSTANCE.write(BleDeviceManager.WRITE_CMD_GET_DEVICE_WIFI_STATE, new String[0]);
                }
            } else if (BleDeviceManager.INSTANCE.getMBleVersion() == 2) {
                BleDeviceManager.INSTANCE.write(BleDeviceManager.WRITE_CMD_GET_DEVICE_WIFI_STATE, new String[0]);
            }
        } else if (sendIndex == 4) {
            BleDeviceManager.INSTANCE.readWifiListFromBle(bArr);
        } else if (sendIndex == 5) {
            String access$bytesToString4 = BleDeviceManager.INSTANCE.bytesToString(bArr);
            if (access$bytesToString4 != null) {
                if (access$bytesToString4.length() > 0) {
                    z = true;
                }
                if (z) {
                    BleDeviceManager.INSTANCE.getWifiList();
                    return;
                }
            }
            BleDeviceManager.BleWifiListListener mBleWifiListListener = BleDeviceManager.INSTANCE.getMBleWifiListListener();
            if (mBleWifiListListener != null) {
                mBleWifiListListener.onWifiList(new ArrayList(), true);
            }
        }
    }
}
