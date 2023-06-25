package com.juconnect.connectlife.ju_ble.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.juconnect.connectlife.ju_ble.parameters.CommonParameters;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001a"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/utils/NetworkUtils;", "", "()V", "repeatCount", "", "getRepeatCount", "()I", "setRepeatCount", "(I)V", "addHeader", "", "httpURLConnection", "Ljava/net/HttpURLConnection;", "deviceIsOnline", "netCallBack", "Lcom/juconnect/connectlife/ju_ble/utils/NetCallBack;", "configResult", "Lcom/juconnect/connectlife/ju_ble/model/ConfigWifiResult;", "context", "Landroid/content/Context;", "getConnectWifiSsid", "", "is2String", "iss", "Ljava/io/InputStream;", "openNetSetting", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetworkUtils.kt */
public final class NetworkUtils {
    @NotNull
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    public static int repeatCount = 15;

    private final void addHeader(HttpURLConnection httpURLConnection) {
        for (Map.Entry next : CommonParameters.INSTANCE.getHeadParameter().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    private final String is2String(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
                return StringsKt__StringsKt.trim((CharSequence) sb2).toString();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deviceIsOnline(@org.jetbrains.annotations.NotNull com.juconnect.connectlife.ju_ble.utils.NetCallBack r12, @org.jetbrains.annotations.NotNull com.juconnect.connectlife.ju_ble.model.ConfigWifiResult r13, @org.jetbrains.annotations.NotNull android.content.Context r14) {
        /*
            r11 = this;
            java.lang.String r0 = "程序异常"
            java.lang.String r1 = "3"
            java.lang.String r2 = "1"
            java.lang.String r3 = "fauksconnresult"
            java.lang.String r4 = "netCallBack"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            java.lang.String r4 = "configResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r4)
            com.juconnect.connectlife.ju_ble.model.SoftAp r4 = r13.getData()
            if (r4 != 0) goto L_0x0020
            r4 = 0
            goto L_0x0024
        L_0x0020:
            java.lang.String r4 = r4.getWifiId()
        L_0x0024:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r6 = "version"
            java.lang.String r7 = "2.0"
            r5.put(r6, r7)
            if (r4 != 0) goto L_0x0035
            java.lang.String r6 = ""
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            java.lang.String r8 = "wifiId"
            r5.put(r8, r6)
            com.juconnect.connectlife.ju_ble.connect.ConnectParameter r6 = com.juconnect.connectlife.ju_ble.connect.ConnectParameter.INSTANCE
            java.lang.String r6 = r6.getTicket()
            java.lang.String r8 = "ticket"
            r5.put(r8, r6)
            com.juconnect.connectlife.ju_ble.parameters.RsaSignUtil$Companion r6 = com.juconnect.connectlife.ju_ble.parameters.RsaSignUtil.Companion
            java.lang.String r5 = r6.obtainSign(r5, r14)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.juconnect.connectlife.ju_ble.connect.ConnectParameter r8 = com.juconnect.connectlife.ju_ble.connect.ConnectParameter.INSTANCE
            java.lang.String r8 = r8.getDomain()
            r6.append(r8)
            java.lang.String r8 = "dms/get_wifi_config?version="
            r6.append(r8)
            java.lang.String r8 = "utf-8"
            java.lang.String r7 = java.net.URLEncoder.encode(r7, r8)
            r6.append(r7)
            java.lang.String r7 = "&ticket="
            r6.append(r7)
            com.juconnect.connectlife.ju_ble.connect.ConnectParameter r7 = com.juconnect.connectlife.ju_ble.connect.ConnectParameter.INSTANCE
            java.lang.String r7 = r7.getTicket()
            java.lang.String r7 = java.net.URLEncoder.encode(r7, r8)
            r6.append(r7)
            java.lang.String r7 = "&wifiId="
            r6.append(r7)
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r8)
            r6.append(r4)
            java.lang.String r4 = "&sign="
            r6.append(r4)
            java.lang.String r4 = java.net.URLEncoder.encode(r5, r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r5 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion
            java.lang.String r6 = r13.toJson()
            java.lang.String r7 = "NetworkUtils"
            r5.saveLog(r7, r6, r14)
            r14 = 0
            r5 = r14
        L_0x00a3:
            int r6 = repeatCount
            if (r14 >= r6) goto L_0x01fa
            if (r5 != 0) goto L_0x01fa
            int r14 = r14 + 1
            r6 = 5000(0x1388, double:2.4703E-320)
            r8 = 1
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.net.URL r6 = new java.net.URL     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r6.<init>(r4)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r7 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r9 = "url"
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r7.debug(r3, r9)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            if (r6 == 0) goto L_0x01b9
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r11.addHeader(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r7 = "GET"
            r6.setRequestMethod(r7)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r7 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r9 = "查询配网之前"
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r10 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r10 = r10.formatTime()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r10)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r7.debug(r3, r9)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r6.connect()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            int r7 = r6.getResponseCode()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r9 = 200(0xc8, float:2.8E-43)
            java.lang.String r10 = "inputStream"
            if (r7 != r9) goto L_0x018d
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r6 = r11.is2String(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r7 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r9 = "查询配网结果"
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r10 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r10 = r10.formatTime()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r10)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r7.debug(r3, r9)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r7 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r9 = "data content"
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r7.debug(r3, r9)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.utils.NetworkUtils$deviceIsOnline$resultType$1 r7 = new com.juconnect.connectlife.ju_ble.utils.NetworkUtils$deviceIsOnline$resultType$1     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r7.<init>()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.reflect.Type r7 = r7.getType()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.google.gson.Gson r9 = new com.google.gson.Gson     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r9.<init>()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.Object r6 = r9.fromJson((java.lang.String) r6, (java.lang.reflect.Type) r7)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.model.ResultData r6 = (com.juconnect.connectlife.ju_ble.model.ResultData) r6     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.model.ResultInfo r7 = r6.getResponse()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            if (r7 == 0) goto L_0x016c
            com.juconnect.connectlife.ju_ble.model.ResultInfo r7 = r6.getResponse()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.Integer r7 = r7.getResultCode()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            if (r7 != 0) goto L_0x013d
            goto L_0x016c
        L_0x013d:
            int r7 = r7.intValue()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            if (r7 != 0) goto L_0x016c
            java.lang.String r5 = "0"
            r13.setResultCode(r5)     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            com.juconnect.connectlife.ju_ble.model.ResultInfo r5 = r6.getResponse()     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            java.lang.Integer r5 = r5.getResultCode()     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            r13.setErrorCode(r5)     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            com.juconnect.connectlife.ju_ble.model.ResultInfo r5 = r6.getResponse()     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            java.lang.String r5 = r5.getData()     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            r13.setErrorDes(r5)     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            r12.onSuccess(r13)     // Catch:{ InterruptedException -> 0x0169, Exception -> 0x0167 }
            goto L_0x01fa
        L_0x0167:
            r5 = move-exception
            goto L_0x01c4
        L_0x0169:
            r5 = move-exception
            goto L_0x01dd
        L_0x016c:
            int r7 = repeatCount     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            if (r14 < r7) goto L_0x00a3
            r13.setResultCode(r2)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.model.ResultInfo r6 = r6.getResponse()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.Integer r6 = r6.getResultCode()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r13.setErrorCode(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r6 = "获取不到配网信息"
            r13.setErrorDes(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r12.onFail(r13)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            goto L_0x01fa
        L_0x018d:
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r6 = r11.is2String(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            com.juconnect.connectlife.ju_ble.utils.LogUtils$Companion r7 = com.juconnect.connectlife.ju_ble.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r8 = "error content"
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r7.debug(r3, r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            int r6 = repeatCount     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            if (r14 < r6) goto L_0x00a3
            r13.setResultCode(r2)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r6 = "2"
            r13.setErrorCode(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r6 = "网络错误"
            r13.setErrorDes(r6)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            r12.onFail(r13)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            goto L_0x01fa
        L_0x01b9:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            java.lang.String r7 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
            throw r6     // Catch:{ InterruptedException -> 0x01da, Exception -> 0x01c1 }
        L_0x01c1:
            r6 = move-exception
            r8 = r5
            r5 = r6
        L_0x01c4:
            java.lang.String r6 = "exception:"
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r5)
            int r5 = repeatCount
            if (r14 < r5) goto L_0x01f7
            r13.setResultCode(r2)
            r13.setErrorCode(r1)
            r13.setErrorDes(r0)
            r12.onFail(r13)
            goto L_0x01fa
        L_0x01da:
            r6 = move-exception
            r8 = r5
            r5 = r6
        L_0x01dd:
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "InterruptedException exception"
            kotlin.jvm.internal.Intrinsics.stringPlus(r6, r5)
            int r5 = repeatCount
            if (r14 < r5) goto L_0x01f7
            r13.setResultCode(r2)
            r13.setErrorCode(r1)
            r13.setErrorDes(r0)
            r12.onFail(r13)
            goto L_0x01fa
        L_0x01f7:
            r5 = r8
            goto L_0x00a3
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_ble.utils.NetworkUtils.deviceIsOnline(com.juconnect.connectlife.ju_ble.utils.NetCallBack, com.juconnect.connectlife.ju_ble.model.ConfigWifiResult, android.content.Context):void");
    }

    @NotNull
    public final String getConnectWifiSsid(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService != null) {
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            int frequency = connectionInfo.getFrequency();
            boolean z = false;
            if (2401 <= frequency && frequency < 2500) {
                z = true;
            }
            if (!z) {
                return "";
            }
            String ssid = connectionInfo.getSSID();
            Intrinsics.checkNotNullExpressionValue(ssid, "wifiInfo.ssid");
            return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(ssid, "\"", "", false, 4, (Object) null), "\"", "", false, 4, (Object) null);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
    }

    public final int getRepeatCount() {
        return repeatCount;
    }

    public final void openNetSetting(@NotNull Context context) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT > 10) {
            intent = new Intent("android.settings.WIRELESS_SETTINGS");
        } else {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.WirelessSettings"));
            intent.setAction("android.intent.action.VIEW");
        }
        context.startActivity(intent);
    }

    public final void setRepeatCount(int i) {
        repeatCount = i;
    }
}
