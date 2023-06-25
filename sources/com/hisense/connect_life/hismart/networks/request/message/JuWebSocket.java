package com.hisense.connect_life.hismart.networks.request.message;

import android.util.Base64;
import androidx.test.internal.runner.RunnerArgs;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p294g.p333g.C4514ip;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/JuWebSocket;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuWebSocket.kt */
public final class JuWebSocket {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static boolean isCancel;
    public static int mPingIntervalFail;
    @Nullable
    public static WebSocket mWebSocket;
    public static boolean pushSwitch = true;

    @Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/JuWebSocket$Companion;", "", "()V", "isCancel", "", "mPingIntervalFail", "", "mWebSocket", "Lokhttp3/WebSocket;", "pushSwitch", "getPushSwitch", "()Z", "setPushSwitch", "(Z)V", "cancelWebSocket", "", "generateWebSocket", "url", "", "pingInterval", "", "pingIntervalFail", "ip", "port", "getDecodeMsg", "msg", "processMessage", "codeMsg", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: JuWebSocket.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getDecodeMsg(String str) {
            try {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] decode = Base64.decode(bytes, 1);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(msg.toByteArray(), Base64.NO_PADDING)");
                return new String(decode, Charsets.UTF_8);
            } catch (Exception e) {
                e.printStackTrace();
                "JuWebSocket getDecodeMsg msg:" + str + ", decodeMsg fail:" + e.getMessage();
                return "";
            }
        }

        /* access modifiers changed from: private */
        public final void processMessage(String str) {
            ProcessMessageUtil.Companion.processMessage(getDecodeMsg(str));
        }

        public final void cancelWebSocket() {
            JuWebSocket.isCancel = true;
            Intrinsics.stringPlus("JuWebSocket cancelWebSocket mWebSocket:", JuWebSocket.mWebSocket);
            WebSocket access$getMWebSocket$cp = JuWebSocket.mWebSocket;
            if (access$getMWebSocket$cp != null) {
                access$getMWebSocket$cp.cancel();
                Companion companion = JuWebSocket.Companion;
                JuWebSocket.mWebSocket = null;
            }
        }

        public final void generateWebSocket(@NotNull String str, @NotNull String str2, long j, long j2) {
            Intrinsics.checkNotNullParameter(str, C4514ip.f9299q);
            Intrinsics.checkNotNullParameter(str2, "port");
            String str3 = "ws://" + str + RunnerArgs.CLASSPATH_SEPARATOR + str2;
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            generateWebSocket(str3, j, j2);
        }

        public final boolean getPushSwitch() {
            return JuWebSocket.pushSwitch;
        }

        public final void setPushSwitch(boolean z) {
            JuWebSocket.pushSwitch = z;
        }

        public final void generateWebSocket(@NotNull String str, long j, long j2) {
            Intrinsics.checkNotNullParameter(str, "url");
            "JuWebSocket generateWebSocket url:" + str + "  pingInterval:" + j + "  pingIntervalFail:" + j2;
            JuWebSocket.isCancel = false;
            OkHttpClient build = new OkHttpClient.Builder().pingInterval(j, TimeUnit.SECONDS).build();
            Request build2 = new Request.Builder().url(str).build();
            WebSocket access$getMWebSocket$cp = JuWebSocket.mWebSocket;
            if (access$getMWebSocket$cp != null) {
                Intrinsics.stringPlus("JuWebSocket generateWebSocket mWebSocket:", JuWebSocket.mWebSocket);
                if (JuWebSocket.isCancel) {
                    access$getMWebSocket$cp.cancel();
                    Companion companion = JuWebSocket.Companion;
                    JuWebSocket.mWebSocket = null;
                }
            }
            JuWebSocket.mWebSocket = build.newWebSocket(build2, new JuWebSocket$Companion$generateWebSocket$2(j2, str, j));
        }
    }
}
