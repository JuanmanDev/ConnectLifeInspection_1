package com.juconnect.connectlife.ju_ble;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import androidx.appcompat.widget.TooltipCompatHandler;
import androidx.core.net.MailTo;
import androidx.lifecycle.SavedStateHandle;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.clj.fastble.BleManager;
import com.clj.fastble.callback.BleGattCallback;
import com.clj.fastble.data.BleDevice;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.juconnect.connectlife.ju_ble.model.WifiBean;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002wxB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010G\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010\u0016H\u0016J\u0014\u0010I\u001a\u0004\u0018\u00010\u00122\b\u0010H\u001a\u0004\u0018\u00010\u0016H\u0002J\u0016\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0004J\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020\u001fJ\u0016\u0010Q\u001a\u00020N2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0004J\u0006\u0010U\u001a\u00020NJ\u0006\u0010V\u001a\u00020NJ\u0006\u0010W\u001a\u00020NJ\u0010\u0010X\u001a\u0004\u0018\u00010\u00122\u0006\u0010Y\u001a\u00020\u0012J \u0010Z\u001a\u00020N2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010$2\u0006\u0010^\u001a\u000205J\u0016\u0010_\u001a\u00020\u00162\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012J\u0016\u0010b\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u0012J\"\u0010e\u001a\u00020\u00122\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00120g2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00120gJ\u0010\u0010i\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u0012H\u0002J\u0006\u0010k\u001a\u00020NJ\u000e\u0010l\u001a\u00020N2\u0006\u0010m\u001a\u00020\u0016J\u0006\u0010n\u001a\u00020NJ\u0016\u0010o\u001a\u00020N2\u0006\u0010c\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u0012J\u0016\u0010p\u001a\u00020N2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u0012J\u0006\u0010q\u001a\u00020NJ'\u0010r\u001a\u00020N2\u0006\u0010m\u001a\u00020\u00162\u0012\u0010s\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120t\"\u00020\u0012¢\u0006\u0002\u0010uJ\f\u0010v\u001a\u00020\u0012*\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X.¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u001a\u0010@\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0014\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0014\"\u0004\bF\u0010C¨\u0006y"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/BleDeviceManager;", "", "()V", "LOCAL_DEVICE_STATUS_ASSOCIATE_FAIL", "", "LOCAL_DEVICE_STATUS_CONNECT_NEED_REWRITE", "LOCAL_DEVICE_STATUS_CONNECT_SUCCESS", "LOCAL_DEVICE_STATUS_FIVE_TIMES_FAIL", "LOCAL_DEVICE_STATUS_NO_RESULT", "LOCAL_DEVICE_STATUS_ONCE_FAIL", "LOCAL_DEVICE_STATUS_WRONG_PASSWORD", "SEND_INDEX_CC_DN", "SEND_INDEX_GET_DEVICE_ID", "SEND_INDEX_GET_DEVICE_WIFI_STATE", "SEND_INDEX_GET_SUPPORT_CONNECT_WAY", "SEND_INDEX_GET_WIFI_ID", "SEND_INDEX_SETTING_WIFI", "TAG", "", "getTAG", "()Ljava/lang/String;", "WRITE_CMD_GET_DEVICE_ID", "", "WRITE_CMD_GET_DEVICE_WIFI_STATE", "WRITE_CMD_GET_WIFI_ID", "WRITE_CMD_GET_WIFI_LIST", "cacheBSSID", "cacheDataCC", "cacheDataDN", "cachePassword", "isConnect", "", "()Z", "setConnect", "(Z)V", "mBleCallback", "Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleDeviceConnectCallBack;", "getMBleCallback", "()Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleDeviceConnectCallBack;", "setMBleCallback", "(Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleDeviceConnectCallBack;)V", "mBleDevice", "Lcom/clj/fastble/data/BleDevice;", "getMBleDevice", "()Lcom/clj/fastble/data/BleDevice;", "setMBleDevice", "(Lcom/clj/fastble/data/BleDevice;)V", "mBleVersion", "getMBleVersion", "()I", "setMBleVersion", "(I)V", "mBleWifiListListener", "Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleWifiListListener;", "getMBleWifiListListener", "()Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleWifiListListener;", "setMBleWifiListListener", "(Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleWifiListListener;)V", "mWifiList", "", "Lcom/juconnect/connectlife/ju_ble/model/WifiBean;", "sendIndex", "getSendIndex", "setSendIndex", "uuid_characteristic", "getUuid_characteristic", "setUuid_characteristic", "(Ljava/lang/String;)V", "uuid_service", "getUuid_service", "setUuid_service", "bytesToHex", "bytes", "bytesToString", "circleLeftMove", "sourceByte", "move", "clearCacheData", "", "close", "needClearData", "connectDevice", "device", "Landroid/bluetooth/BluetoothDevice;", "version", "disconnect", "getRSSI", "getWifiList", "hexToString", "hex", "initBle", "application", "Landroid/app/Application;", "bleCallback", "bleWifiListListener", "jointCCAndDN", "cc", "dn", "jointSsidAndPwdData", "bssid", "password", "makeJsonObjectString", "keys", "", "values", "parseDeviceStatus", "result", "read", "readWifiListFromBle", "data", "recoveryBluetoothScene", "sendBssidAndPassword", "sendCCAndDN", "startConfig", "write", "extras", "", "([B[Ljava/lang/String;)V", "toHumanString", "BleDeviceConnectCallBack", "BleWifiListListener", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BleDeviceManager.kt */
public final class BleDeviceManager {
    @NotNull
    public static final BleDeviceManager INSTANCE = new BleDeviceManager();
    public static final int LOCAL_DEVICE_STATUS_ASSOCIATE_FAIL = 2;
    public static final int LOCAL_DEVICE_STATUS_CONNECT_NEED_REWRITE = 99;
    public static final int LOCAL_DEVICE_STATUS_CONNECT_SUCCESS = 0;
    public static final int LOCAL_DEVICE_STATUS_FIVE_TIMES_FAIL = 8;
    public static final int LOCAL_DEVICE_STATUS_NO_RESULT = 6;
    public static final int LOCAL_DEVICE_STATUS_ONCE_FAIL = 7;
    public static final int LOCAL_DEVICE_STATUS_WRONG_PASSWORD = 1;
    public static final int SEND_INDEX_CC_DN = 5;
    public static final int SEND_INDEX_GET_DEVICE_ID = 2;
    public static final int SEND_INDEX_GET_DEVICE_WIFI_STATE = 3;
    public static final int SEND_INDEX_GET_SUPPORT_CONNECT_WAY = 4;
    public static final int SEND_INDEX_GET_WIFI_ID = 1;
    public static final int SEND_INDEX_SETTING_WIFI = 0;
    @NotNull
    public static final String TAG = "BleDeviceManager";
    @NotNull
    public static final byte[] WRITE_CMD_GET_DEVICE_ID = {0, 6, 0, 1, 0};
    @NotNull
    public static final byte[] WRITE_CMD_GET_DEVICE_WIFI_STATE = {0, 3, 0, 1, 0};
    @NotNull
    public static final byte[] WRITE_CMD_GET_WIFI_ID = {0, 5, 0, 1, 0};
    @NotNull
    public static final byte[] WRITE_CMD_GET_WIFI_LIST = {0, 1, 0, 1, 0};
    @NotNull
    public static String cacheBSSID = "";
    public static int cacheDataCC;
    @NotNull
    public static String cacheDataDN = "";
    @NotNull
    public static String cachePassword = "";
    public static boolean isConnect;
    @Nullable
    public static BleDeviceConnectCallBack mBleCallback;
    @Nullable
    public static BleDevice mBleDevice;
    public static int mBleVersion;
    @Nullable
    public static BleWifiListListener mBleWifiListListener;
    public static List<WifiBean> mWifiList;
    public static int sendIndex = -1;
    @NotNull
    public static String uuid_characteristic = "00000002-0000-1000-8000-00805f9b34fb";
    @NotNull
    public static String uuid_service = "0000109b-0000-1000-8000-00805f9b34fb";

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J2\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u001c\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001b\u001a\u00020\u0003H&¨\u0006\u001c"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleDeviceConnectCallBack;", "", "configFail", "", "errorCode", "", "errorMessage", "", "result", "configRouteSuccess", "configSuccess", "errorCallback", "method", "resultCode", "data", "getDeviceId", "deviceId", "getRSSI", "rssi", "getWifiId", "wifiId", "onBluetoothDisconnected", "onConnectFail", "onConnectSuccess", "onSendCMDCallback", "name", "cmd", "showWifiPassword", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: BleDeviceManager.kt */
    public interface BleDeviceConnectCallBack {
        void configFail(int i, @Nullable String str, @Nullable String str2);

        void configRouteSuccess();

        void configSuccess();

        void errorCallback(@NotNull String str, @NotNull String str2, int i, @Nullable String str3, @NotNull String str4);

        void getDeviceId(@Nullable String str);

        void getRSSI(int i);

        void getWifiId(@NotNull String str);

        void onBluetoothDisconnected();

        void onConnectFail(int i, @Nullable String str);

        void onConnectSuccess();

        void onSendCMDCallback(@Nullable String str, @Nullable String str2);

        void showWifiPassword();
    }

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/BleDeviceManager$BleWifiListListener;", "", "onWifiList", "", "wifiList", "", "Lcom/juconnect/connectlife/ju_ble/model/WifiBean;", "end", "", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: BleDeviceManager.kt */
    public interface BleWifiListListener {
        void onWifiList(@NotNull List<WifiBean> list, boolean z);
    }

    /* access modifiers changed from: private */
    public final String bytesToString(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        byte[] bArr2 = new byte[(bArr.length - 4)];
        System.arraycopy(bArr, 4, bArr2, 0, bArr.length - 4);
        try {
            Charset forName = Charset.forName("ascii");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(\"ascii\")");
            return new String(bArr2, forName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final int parseDeviceStatus(String str) {
        try {
            String substring = str.substring(8, 10);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.stringPlus("wifiStatus = ", substring);
            String substring2 = str.substring(10, 12);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.stringPlus("cloudStatus = ", substring2);
            int hashCode = substring.hashCode();
            if (hashCode != 1540) {
                if (hashCode != 1590) {
                    switch (hashCode) {
                        case 1542:
                            if (!substring.equals("06")) {
                                break;
                            } else {
                                return 6;
                            }
                        case 1543:
                            if (!substring.equals("07")) {
                                break;
                            } else {
                                return 7;
                            }
                        case 1544:
                            if (!substring.equals("08")) {
                                break;
                            } else {
                                return 8;
                            }
                        case 1545:
                            if (!substring.equals("09")) {
                                break;
                            } else {
                                return 2;
                            }
                    }
                } else if (substring.equals("0f")) {
                    return 1;
                }
            } else if (substring.equals("04")) {
                if (Intrinsics.areEqual((Object) substring2, (Object) "07")) {
                    return 10;
                }
                if (Intrinsics.areEqual((Object) substring2, (Object) "04")) {
                    return 0;
                }
            }
            return 99;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public final String toHumanString(byte[] bArr) {
        return ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    @NotNull
    public String bytesToHex(@Nullable byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString);
            i = i2;
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    @NotNull
    public final byte[] circleLeftMove(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "sourceByte");
        int i2 = 0;
        int i3 = 8 - i;
        int i4 = bArr[0] >>> i3;
        int length = bArr.length - 1;
        while (i2 < length) {
            int i5 = i2 + 1;
            bArr[i2] = (byte) (((bArr[i2] & 255) << i) | (bArr[i5] >>> i3));
            i2 = i5;
        }
        bArr[bArr.length - 1] = (byte) ((bArr[bArr.length - 1] & 255) << i);
        bArr[bArr.length - 1] = (byte) (bArr[bArr.length - 1] | i4);
        return bArr;
    }

    public final void clearCacheData() {
        sendIndex = -1;
        cacheDataCC = 0;
        cacheDataDN = "";
        cacheBSSID = "";
        cachePassword = "";
    }

    public final void close(boolean z) {
        isConnect = false;
        if (z) {
            clearCacheData();
        }
        BleManager.getInstance().destroy();
    }

    public final void connectDevice(@NotNull BluetoothDevice bluetoothDevice, int i) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, EventBusConstKt.DEVICE);
        if (isConnect) {
            disconnect();
        }
        mBleVersion = i;
        BleManager.getInstance().connect(bluetoothDevice.getAddress(), (BleGattCallback) new BleDeviceManager$connectDevice$1(bluetoothDevice));
    }

    public final void disconnect() {
        if (mBleDevice != null) {
            isConnect = false;
            BleManager.getInstance().disconnect(mBleDevice);
        }
    }

    @Nullable
    public final BleDeviceConnectCallBack getMBleCallback() {
        return mBleCallback;
    }

    @Nullable
    public final BleDevice getMBleDevice() {
        return mBleDevice;
    }

    public final int getMBleVersion() {
        return mBleVersion;
    }

    @Nullable
    public final BleWifiListListener getMBleWifiListListener() {
        return mBleWifiListListener;
    }

    public final void getRSSI() {
        BleManager.getInstance().readRssi(mBleDevice, new BleDeviceManager$getRSSI$1());
    }

    public final int getSendIndex() {
        return sendIndex;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    @NotNull
    public final String getUuid_characteristic() {
        return uuid_characteristic;
    }

    @NotNull
    public final String getUuid_service() {
        return uuid_service;
    }

    public final void getWifiList() {
        List<WifiBean> list = mWifiList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWifiList");
            list = null;
        }
        list.clear();
        sendIndex = 4;
        if (isConnect) {
            byte[] bArr = WRITE_CMD_GET_WIFI_LIST;
            write(bArr, toHumanString(bArr));
            return;
        }
        BleDeviceConnectCallBack bleDeviceConnectCallBack = mBleCallback;
        if (bleDeviceConnectCallBack != null) {
            bleDeviceConnectCallBack.errorCallback("wifiListCallback", "1", Integer.parseInt("2301"), "ble_get_wifi_list_disconnected", "");
        }
    }

    @Nullable
    public final String hexToString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "hex");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length() - 1) {
            int i2 = i + 2;
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append((char) Integer.parseInt(substring, CharsKt__CharJVMKt.checkRadix(16)));
            i = i2;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        byte[] bytes = sb2.getBytes(Charsets.ISO_8859_1);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new String(bytes, Charsets.UTF_8);
    }

    public final void initBle(@NotNull Application application, @Nullable BleDeviceConnectCallBack bleDeviceConnectCallBack, @NotNull BleWifiListListener bleWifiListListener) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(bleWifiListListener, "bleWifiListListener");
        BleManager.getInstance().init(application);
        BleManager.getInstance().setConnectOverTime(10000).enableLog(true).setReConnectCount(5, TooltipCompatHandler.HOVER_HIDE_TIMEOUT_SHORT_MS).setOperateTimeout(5000);
        mWifiList = new ArrayList();
        mBleCallback = bleDeviceConnectCallBack;
        mBleWifiListListener = bleWifiListListener;
    }

    public final boolean isConnect() {
        return isConnect;
    }

    @NotNull
    public final byte[] jointCCAndDN(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, MailTo.f232CC);
        Intrinsics.checkNotNullParameter(str2, "dn");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length + 1 + 1 + bytes2.length + 2;
        byte[] bArr = new byte[length];
        bArr[0] = 0;
        bArr[1] = (byte) str.length();
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        bArr[bytes.length + 2] = 0;
        bArr[bytes.length + 3] = (byte) str2.length();
        System.arraycopy(bytes2, 0, bArr, bytes.length + 4, bytes2.length);
        byte[] bArr2 = new byte[(length + 4)];
        byte[] bArr3 = {0, 9, 0, 0};
        bArr3[2] = (byte) (length / 256);
        bArr3[3] = (byte) (length % 256);
        System.arraycopy(bArr3, 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, length);
        Intrinsics.stringPlus("cc&dn:sendData:", Arrays.toString(bArr2));
        return bArr2;
    }

    @NotNull
    public final byte[] jointSsidAndPwdData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "bssid");
        Intrinsics.checkNotNullParameter(str2, "password");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        Intrinsics.stringPlus("bssidByte = ", Arrays.toString(bytes));
        Intrinsics.stringPlus("passwordByte = ", Arrays.toString(bytes2));
        byte[] bArr = new byte[(bytes.length + 1 + 1 + bytes2.length)];
        bArr[0] = (byte) str.length();
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        bArr[bytes.length + 1] = (byte) str2.length();
        System.arraycopy(bytes2, 0, bArr, bytes.length + 2, bytes2.length);
        Intrinsics.stringPlus("rData = ", bArr);
        int nextDouble = (int) ((new Random().nextDouble() * ((double) 10)) % ((double) 8));
        if (nextDouble == 0) {
            nextDouble++;
        }
        Intrinsics.stringPlus("move = ", Integer.valueOf(nextDouble));
        byte[] circleLeftMove = circleLeftMove(bArr, nextDouble);
        Intrinsics.stringPlus("rData2 = ", circleLeftMove);
        int length = circleLeftMove.length + 3 + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) length;
        bArr2[1] = 0;
        bArr2[2] = (byte) nextDouble;
        Intrinsics.stringPlus("jointData: 循环左移", Integer.valueOf(nextDouble));
        System.arraycopy(circleLeftMove, 0, bArr2, 3, circleLeftMove.length);
        Intrinsics.stringPlus("aData = ", bArr2);
        int i = length - 1;
        byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            b = (byte) (bArr2[i2] ^ b);
        }
        bArr2[i] = b;
        Intrinsics.stringPlus("^= aData = ", bArr2);
        byte[] bArr3 = new byte[(length + 4)];
        byte[] bArr4 = {0, 2, 0, 0};
        bArr4[2] = (byte) (length / 256);
        bArr4[3] = (byte) (length % 256);
        Intrinsics.stringPlus("headData = ", bArr4);
        System.arraycopy(bArr4, 0, bArr3, 0, 4);
        System.arraycopy(bArr2, 0, bArr3, 4, length);
        Intrinsics.stringPlus("sendData = ", Arrays.toString(bArr3));
        Intrinsics.stringPlus("sendData:", Arrays.toString(bArr3));
        return bArr3;
    }

    @NotNull
    public final String makeJsonObjectString(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, SavedStateHandle.KEYS);
        Intrinsics.checkNotNullParameter(list2, SavedStateHandle.VALUES);
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) next;
            jSONObject.put(list.get(i), list2.get(i));
            i = i2;
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "obj.toString()");
        return jSONObject2;
    }

    public final void read() {
        BleManager.getInstance().read(mBleDevice, uuid_service, uuid_characteristic, new BleDeviceManager$read$1());
    }

    public final void readWifiListFromBle(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        if (bArr.length == 0) {
            BleWifiListListener bleWifiListListener = mBleWifiListListener;
            if (bleWifiListListener != null) {
                bleWifiListListener.onWifiList(new ArrayList(), true);
            }
            read();
            return;
        }
        String bytesToHex = bytesToHex(bArr);
        Intrinsics.stringPlus(">>>>>>>>>>获取当前wifi列表= ", bytesToHex);
        List<WifiBean> list = null;
        if (Intrinsics.areEqual((Object) "80010000", (Object) bytesToHex)) {
            BleWifiListListener bleWifiListListener2 = mBleWifiListListener;
            if (bleWifiListListener2 != null) {
                Intrinsics.checkNotNull(bleWifiListListener2);
                List<WifiBean> list2 = mWifiList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWifiList");
                } else {
                    list = list2;
                }
                bleWifiListListener2.onWifiList(list, true);
                return;
            }
            return;
        }
        String substring = bytesToHex.substring(8);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        if (substring.length() < 4) {
            Intrinsics.stringPlus(">>>>>>>>>>result.length= ", Integer.valueOf(substring.length()));
            return;
        }
        String substring2 = substring.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        Intrinsics.stringPlus(">>>>>>>>>>获取当前wifi列表总数= ", Integer.valueOf(substring2, 16));
        String substring3 = substring.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        Intrinsics.stringPlus(">>>>>>>>>>获取当前wifi列表本次总数= ", Integer.valueOf(substring3, 16));
        String substring4 = substring.substring(4);
        Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String).substring(startIndex)");
        while (substring4.length() >= 84) {
            String substring5 = substring4.substring(0, 84);
            Intrinsics.checkNotNullExpressionValue(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring6 = substring5.substring(0, 12);
            Intrinsics.checkNotNullExpressionValue(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
            String replace = new Regex("(.{2})").replace((CharSequence) substring6, "$1:");
            String substring7 = replace.substring(0, replace.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring8 = substring5.substring(12, 14);
            Intrinsics.checkNotNullExpressionValue(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
            Integer valueOf = Integer.valueOf(substring8, 16);
            String substring9 = substring5.substring(14, 16);
            Intrinsics.checkNotNullExpressionValue(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
            Integer.valueOf(substring9, 16);
            String substring10 = substring5.substring(16, 18);
            Intrinsics.checkNotNullExpressionValue(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring11 = substring5.substring(18, (Integer.valueOf(substring10, 16).intValue() * 2) + 18);
            Intrinsics.checkNotNullExpressionValue(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
            String hexToString = hexToString(substring11);
            if (!TextUtils.isEmpty(hexToString)) {
                WifiBean wifiBean = new WifiBean();
                wifiBean.bssid = substring7;
                wifiBean.rssi = String.valueOf(valueOf);
                wifiBean.ssid = hexToString;
                List<WifiBean> list3 = mWifiList;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWifiList");
                    list3 = null;
                }
                list3.add(wifiBean);
            }
            substring4 = substring4.substring(84);
            Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String).substring(startIndex)");
        }
        BleWifiListListener bleWifiListListener3 = mBleWifiListListener;
        if (bleWifiListListener3 != null) {
            Intrinsics.checkNotNull(bleWifiListListener3);
            List<WifiBean> list4 = mWifiList;
            if (list4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWifiList");
            } else {
                list = list4;
            }
            bleWifiListListener3.onWifiList(list, false);
        }
        read();
    }

    public final void recoveryBluetoothScene() {
        int i = sendIndex;
        if (i != 0) {
            if (i == 1 || i == 2) {
                startConfig();
                return;
            } else if (i != 3) {
                if (i == 4 || i == 5) {
                    sendCCAndDN(cacheDataCC, cacheDataDN);
                    return;
                }
                return;
            }
        }
        sendBssidAndPassword(cacheBSSID, cachePassword);
    }

    public final void sendBssidAndPassword(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "bssid");
        Intrinsics.checkNotNullParameter(str2, "password");
        cacheBSSID = str;
        cachePassword = str2;
        Intrinsics.stringPlus("start sendBssidAndPassword:", Boolean.valueOf(isConnect));
        sendIndex = 0;
        if (isConnect) {
            write(jointSsidAndPwdData(str, str2), str);
            return;
        }
        BleDeviceConnectCallBack bleDeviceConnectCallBack = mBleCallback;
        if (bleDeviceConnectCallBack != null) {
            bleDeviceConnectCallBack.errorCallback("connBleDeviceCallback", "1", -1, "ble_disconnected", "");
        }
    }

    public final void sendCCAndDN(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "dn");
        cacheDataCC = i;
        cacheDataDN = str;
        if (isConnect) {
            sendIndex = 5;
            write(jointCCAndDN(String.valueOf(i), str), String.valueOf(i), str);
            return;
        }
        BleDeviceConnectCallBack bleDeviceConnectCallBack = mBleCallback;
        if (bleDeviceConnectCallBack != null) {
            bleDeviceConnectCallBack.errorCallback("wifiListCallback", "1", Integer.parseInt("2301"), "", "ble_get_wifi_list_send_cc_and_dn_disconnected");
        }
    }

    public final void setConnect(boolean z) {
        isConnect = z;
    }

    public final void setMBleCallback(@Nullable BleDeviceConnectCallBack bleDeviceConnectCallBack) {
        mBleCallback = bleDeviceConnectCallBack;
    }

    public final void setMBleDevice(@Nullable BleDevice bleDevice) {
        mBleDevice = bleDevice;
    }

    public final void setMBleVersion(int i) {
        mBleVersion = i;
    }

    public final void setMBleWifiListListener(@Nullable BleWifiListListener bleWifiListListener) {
        mBleWifiListListener = bleWifiListListener;
    }

    public final void setSendIndex(int i) {
        sendIndex = i;
    }

    public final void setUuid_characteristic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        uuid_characteristic = str;
    }

    public final void setUuid_service(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        uuid_service = str;
    }

    public final void startConfig() {
        sendIndex = 1;
        if (isConnect) {
            byte[] bArr = WRITE_CMD_GET_WIFI_ID;
            write(bArr, toHumanString(bArr));
            return;
        }
        BleDeviceConnectCallBack bleDeviceConnectCallBack = mBleCallback;
        if (bleDeviceConnectCallBack != null) {
            bleDeviceConnectCallBack.errorCallback("connBleDeviceCallback", "1", -1, "ble_disconnected", "");
        }
    }

    public final synchronized void write(@NotNull byte[] bArr, @NotNull String... strArr) {
        String str;
        Intrinsics.checkNotNullParameter(bArr, "data");
        Intrinsics.checkNotNullParameter(strArr, "extras");
        int i = sendIndex;
        try {
            if (Arrays.equals(bArr, WRITE_CMD_GET_WIFI_LIST)) {
                Thread.sleep(ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
            } else {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean z = false;
        if (i == 0) {
            str = makeJsonObjectString(CollectionsKt__CollectionsJVMKt.listOf("bssid"), CollectionsKt__CollectionsJVMKt.listOf(strArr[0]));
        } else if (i == 1 || i == 3 || i == 4) {
            str = makeJsonObjectString(CollectionsKt__CollectionsJVMKt.listOf("cmd"), CollectionsKt__CollectionsJVMKt.listOf(strArr[0]));
        } else if (i != 5) {
            str = "";
        } else {
            try {
                str = makeJsonObjectString(CollectionsKt__CollectionsKt.listOf(MailTo.f232CC, "dn"), CollectionsKt__CollectionsKt.listOf(strArr[0], strArr[1]));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String str2 = i != 0 ? i != 1 ? i != 3 ? i != 4 ? i != 5 ? "" : "write_CC_DN" : "get_wifi_list" : "get_module_cloud_status" : "get_wifi_id" : "wifi_config";
        if (str.length() > 0) {
            if (str2.length() > 0) {
                z = true;
            }
            if (z) {
                BleDeviceConnectCallBack bleDeviceConnectCallBack = mBleCallback;
                if (bleDeviceConnectCallBack != null) {
                    bleDeviceConnectCallBack.onSendCMDCallback(str2, str);
                }
            }
        }
        BleManager.getInstance().write(mBleDevice, uuid_service, uuid_characteristic, bArr, false, new BleDeviceManager$write$1(i));
        return;
    }
}
