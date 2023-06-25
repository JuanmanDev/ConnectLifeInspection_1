package com.juconnect.connectlife.ju_dist.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.juconnect.connectlife.ju_dist.parameters.CommonParameters;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/NetworkUtils;", "", "()V", "repeatCount", "", "getRepeatCount", "()I", "setRepeatCount", "(I)V", "addHeader", "", "httpURLConnection", "Ljava/net/HttpURLConnection;", "deviceIsOnline", "netCallBack", "Lcom/juconnect/connectlife/ju_dist/utils/NetCallBack;", "softApResult", "Lcom/juconnect/connectlife/ju_dist/fbean/SoftApResult;", "context", "Landroid/content/Context;", "is2String", "", "iss", "Ljava/io/InputStream;", "openNetSetting", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
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

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deviceIsOnline(@org.jetbrains.annotations.NotNull com.juconnect.connectlife.ju_dist.utils.NetCallBack r13, @org.jetbrains.annotations.NotNull com.juconnect.connectlife.ju_dist.fbean.SoftApResult r14, @org.jetbrains.annotations.NotNull android.content.Context r15) {
        /*
            r12 = this;
            java.lang.String r0 = "Connect"
            java.lang.String r1 = "程序异常"
            java.lang.String r2 = "3"
            java.lang.String r3 = "connect"
            java.lang.String r4 = "1"
            java.lang.String r5 = "netCallBack"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r5)
            java.lang.String r5 = "softApResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r5)
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r5)
            com.juconnect.connectlife.ju_dist.fbean.SoftAp r5 = r14.getData()
            if (r5 != 0) goto L_0x0022
            r5 = 0
            goto L_0x0026
        L_0x0022:
            java.lang.String r5 = r5.getWifiId()
        L_0x0026:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r7 = "version"
            java.lang.String r8 = "2.0"
            r6.put(r7, r8)
            if (r5 != 0) goto L_0x0037
            java.lang.String r7 = ""
            goto L_0x0038
        L_0x0037:
            r7 = r5
        L_0x0038:
            java.lang.String r9 = "wifiId"
            r6.put(r9, r7)
            com.juconnect.connectlife.ju_dist.connect.ConnectParameter r7 = com.juconnect.connectlife.ju_dist.connect.ConnectParameter.INSTANCE
            java.lang.String r7 = r7.getTicket()
            java.lang.String r9 = "ticket"
            r6.put(r9, r7)
            com.juconnect.connectlife.ju_dist.parameters.RsaSignUtil$Companion r7 = com.juconnect.connectlife.ju_dist.parameters.RsaSignUtil.Companion
            java.lang.String r6 = r7.obtainSign(r6, r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.juconnect.connectlife.ju_dist.connect.ConnectParameter r9 = com.juconnect.connectlife.ju_dist.connect.ConnectParameter.INSTANCE
            java.lang.String r9 = r9.getDomain()
            r7.append(r9)
            java.lang.String r9 = "dms/get_wifi_config?version="
            r7.append(r9)
            java.lang.String r9 = "utf-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r9)
            r7.append(r8)
            java.lang.String r8 = "&ticket="
            r7.append(r8)
            com.juconnect.connectlife.ju_dist.connect.ConnectParameter r8 = com.juconnect.connectlife.ju_dist.connect.ConnectParameter.INSTANCE
            java.lang.String r8 = r8.getTicket()
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r9)
            r7.append(r8)
            java.lang.String r8 = "&wifiId="
            r7.append(r8)
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r9)
            r7.append(r5)
            java.lang.String r5 = "&sign="
            r7.append(r5)
            java.lang.String r5 = java.net.URLEncoder.encode(r6, r9)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r6 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion
            java.lang.String r7 = r14.toJson()
            java.lang.String r8 = "NetworkUtils"
            r6.saveLog(r8, r7, r15)
            r15 = 0
            r6 = r15
        L_0x00a5:
            int r7 = repeatCount
            if (r15 >= r7) goto L_0x0203
            if (r6 != 0) goto L_0x0203
            int r15 = r15 + 1
            r7 = 5000(0x1388, double:2.4703E-320)
            r9 = 1
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.net.URL r7 = new java.net.URL     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r7.<init>(r5)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r8 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r10 = "url"
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r8.debug(r0, r10)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            if (r7 == 0) goto L_0x01be
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r12.addHeader(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r8 = "GET"
            r7.setRequestMethod(r8)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r8 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r10 = "查询配网之前"
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r11 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r11 = r11.formatTime()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r11)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r8.debug(r3, r10)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r7.connect()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            int r8 = r7.getResponseCode()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r10 = 200(0xc8, float:2.8E-43)
            java.lang.String r11 = "inputStream"
            if (r8 != r10) goto L_0x0192
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r7 = r12.is2String(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r8 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r10 = "查询配网结果"
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r11 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r11 = r11.formatTime()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r11)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r8.debug(r3, r10)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r8 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r10 = "data content"
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r8.debug(r3, r10)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.utils.NetworkUtils$deviceIsOnline$resultType$1 r8 = new com.juconnect.connectlife.ju_dist.utils.NetworkUtils$deviceIsOnline$resultType$1     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r8.<init>()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.reflect.Type r8 = r8.getType()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.google.gson.Gson r10 = new com.google.gson.Gson     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r10.<init>()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.Object r7 = r10.fromJson((java.lang.String) r7, (java.lang.reflect.Type) r8)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.fbean.ResultData r7 = (com.juconnect.connectlife.ju_dist.fbean.ResultData) r7     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.fbean.ResultInfo r8 = r7.getResponse()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            if (r8 == 0) goto L_0x0171
            com.juconnect.connectlife.ju_dist.fbean.ResultInfo r8 = r7.getResponse()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.Integer r8 = r8.getResultCode()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            if (r8 != 0) goto L_0x013f
            goto L_0x0171
        L_0x013f:
            int r8 = r8.intValue()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            if (r8 != 0) goto L_0x0171
            java.lang.String r6 = "0"
            r14.setResultCode(r6)     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            com.juconnect.connectlife.ju_dist.fbean.ResultInfo r6 = r7.getResponse()     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            java.lang.Integer r6 = r6.getResultCode()     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            r14.setErrorCode(r6)     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            com.juconnect.connectlife.ju_dist.fbean.ResultInfo r6 = r7.getResponse()     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            java.lang.String r6 = r6.getData()     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            r14.setErrorDes(r6)     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            java.lang.String.valueOf(r14)     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            r13.onSuccess(r14)     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x016c }
            goto L_0x0203
        L_0x016c:
            r6 = move-exception
            goto L_0x01c9
        L_0x016e:
            r6 = move-exception
            goto L_0x01e6
        L_0x0171:
            int r8 = repeatCount     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            if (r15 < r8) goto L_0x00a5
            r14.setResultCode(r4)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.fbean.ResultInfo r7 = r7.getResponse()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.Integer r7 = r7.getResultCode()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r14.setErrorCode(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r7 = "获取不到配网信息"
            r14.setErrorDes(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r13.onFail(r14)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            goto L_0x0203
        L_0x0192:
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r7 = r12.is2String(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            com.juconnect.connectlife.ju_dist.utils.LogUtils$Companion r8 = com.juconnect.connectlife.ju_dist.utils.LogUtils.Companion     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r9 = "error content"
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r8.debug(r0, r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            int r7 = repeatCount     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            if (r15 < r7) goto L_0x00a5
            r14.setResultCode(r4)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r7 = "2"
            r14.setErrorCode(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r7 = "网络错误"
            r14.setErrorDes(r7)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            r13.onFail(r14)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            goto L_0x0203
        L_0x01be:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            java.lang.String r8 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
            throw r7     // Catch:{ InterruptedException -> 0x01e3, Exception -> 0x01c6 }
        L_0x01c6:
            r7 = move-exception
            r9 = r6
            r6 = r7
        L_0x01c9:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r7 = "exception"
            kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
            int r6 = repeatCount
            if (r15 < r6) goto L_0x0200
            r14.setResultCode(r4)
            r14.setErrorCode(r2)
            r14.setErrorDes(r1)
            r13.onFail(r14)
            goto L_0x0203
        L_0x01e3:
            r7 = move-exception
            r9 = r6
            r6 = r7
        L_0x01e6:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r7 = "InterruptedException exception"
            kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
            int r6 = repeatCount
            if (r15 < r6) goto L_0x0200
            r14.setResultCode(r4)
            r14.setErrorCode(r2)
            r14.setErrorDes(r1)
            r13.onFail(r14)
            goto L_0x0203
        L_0x0200:
            r6 = r9
            goto L_0x00a5
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.ju_dist.utils.NetworkUtils.deviceIsOnline(com.juconnect.connectlife.ju_dist.utils.NetCallBack, com.juconnect.connectlife.ju_dist.fbean.SoftApResult, android.content.Context):void");
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
