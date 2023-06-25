package com.juconnect.connect_life.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p201a.p264c.p294g.p333g.C4514ip;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/PingUtils;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "ping", "ip", "pingBaiDuAndIp", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PingUtils.kt */
public final class PingUtils {
    @NotNull
    public static final PingUtils INSTANCE = new PingUtils();
    @NotNull
    public static String TAG = "NetWorkUtils";

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    @NotNull
    public final String ping(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, C4514ip.f9299q);
        Intrinsics.stringPlus("ping ip = ", str);
        try {
            Process exec = Runtime.getRuntime().exec(Intrinsics.stringPlus("ping -c 1 -W 2 ", str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            return exec.waitFor() == 0 ? "ok" : "failed";
        } catch (IOException e) {
            return Intrinsics.stringPlus("IOException: ", e.getMessage());
        } catch (InterruptedException unused) {
            return "InterruptedException";
        }
    }

    @NotNull
    public final String pingBaiDuAndIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, C4514ip.f9299q);
        String ping = ping("www.baidu.com");
        Intrinsics.stringPlus("ping baidu = ", ping);
        String ping2 = ping(str);
        Intrinsics.stringPlus("ping ip = ", ping2);
        return "ping baidu:" + ping + ",ping apiServer:" + ping2 + ';';
    }

    public final void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TAG = str;
    }
}
