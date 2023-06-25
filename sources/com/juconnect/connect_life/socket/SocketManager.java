package com.juconnect.connect_life.socket;

import android.annotation.SuppressLint;
import android.text.format.DateFormat;
import android.util.Base64;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.juconnect.connect_life.global.MessageChannel;
import com.juconnect.connect_life.model.EventMessageModel;
import com.juconnect.connect_life.util.LogFileUtils;
import java.net.URI;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p508a.p513w.C7733a;
import p040c.p301y.p508a.p513w.C7734b;
import p040c.p301y.p508a.p513w.C7735c;
import p553f.p594c.C9185c;
import p553f.p594c.p595n.p597b.C9200a;

@Metadata(mo47990d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\u0010H\u0003J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, mo47991d2 = {"Lcom/juconnect/connect_life/socket/SocketManager;", "", "()V", "lastEvent", "Lcom/juconnect/connect_life/model/EventMessageModel;", "mClient", "Lokhttp3/OkHttpClient;", "mExampleClient", "Lcom/juconnect/connect_life/socket/ExampleClient;", "mPath", "", "mPingInterval", "", "mWebSocket", "Lokhttp3/WebSocket;", "checkIsAlive", "", "closeSocket", "connect", "getDecodeMsg", "msg", "initSocket", "path", "pingInterval", "reconnect", "sendConnectEvent", "isConnected", "", "sendEvent", "typeCode", "data", "Lcom/google/gson/JsonObject;", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SocketManager.kt */
public final class SocketManager {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static SocketManager instance;
    @Nullable
    public EventMessageModel lastEvent;
    @Nullable
    public OkHttpClient mClient;
    @Nullable
    public C7735c mExampleClient;
    @NotNull
    public String mPath;
    public int mPingInterval;
    @Nullable
    public WebSocket mWebSocket;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo47991d2 = {"Lcom/juconnect/connect_life/socket/SocketManager$Companion;", "", "()V", "instance", "Lcom/juconnect/connect_life/socket/SocketManager;", "getInstance", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: SocketManager.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SocketManager getInstance() {
            if (SocketManager.instance == null) {
                synchronized (SocketManager.class) {
                    if (SocketManager.instance == null) {
                        Companion companion = SocketManager.Companion;
                        SocketManager.instance = new SocketManager((DefaultConstructorMarker) null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            SocketManager access$getInstance$cp = SocketManager.instance;
            Intrinsics.checkNotNull(access$getInstance$cp);
            return access$getInstance$cp;
        }
    }

    public SocketManager() {
        this.mPath = "";
        this.mPingInterval = 40;
    }

    public /* synthetic */ SocketManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void connect() {
        if (!(this.mPath.length() == 0)) {
            C7735c cVar = this.mExampleClient;
            if (cVar != null) {
                if (cVar != null) {
                    cVar.mo50388H();
                }
                this.mExampleClient = null;
            }
            C7735c cVar2 = new C7735c(new URI(this.mPath));
            this.mExampleClient = cVar2;
            if (cVar2 != null) {
                cVar2.mo50390J();
            }
            C7735c cVar3 = this.mExampleClient;
            if (cVar3 != null) {
                cVar3.setOnStatusChangeListener(new SocketManager$connect$1(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public final String getDecodeMsg(String str) {
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(bytes, 1);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(msg.toByteArray(), Base64.NO_PADDING)");
            return new String(decode, Charsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void reconnect() {
        LogFileUtils.Companion.get().upLog("长链接", Intrinsics.stringPlus("Android_", SPManagerKt.getCustomerId()), "长链接5秒后重连");
        DateFormat.format("yyyy-MM-dd HH:mm:SS", new Date());
        C9185c.m24908y(5, TimeUnit.SECONDS).mo46989r(new C7734b(this));
    }

    /* renamed from: reconnect$lambda-0  reason: not valid java name */
    public static final void m27244reconnect$lambda0(SocketManager socketManager, Long l) {
        Intrinsics.checkNotNullParameter(socketManager, "this$0");
        socketManager.connect();
    }

    /* access modifiers changed from: private */
    public final void sendConnectEvent(boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("isConnected", (Number) Integer.valueOf(z ^ true ? 1 : 0));
        sendEvent(2, jsonObject);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void sendEvent(int i, JsonObject jsonObject) {
        EventMessageModel eventMessageModel = new EventMessageModel(i, jsonObject);
        if (!Intrinsics.areEqual((Object) this.lastEvent, (Object) eventMessageModel)) {
            C9185c.m24907j(eventMessageModel).mo46983l(C9200a.m24953a()).mo46989r(new C7733a(this, eventMessageModel));
        }
    }

    /* renamed from: sendEvent$lambda-1  reason: not valid java name */
    public static final void m27245sendEvent$lambda1(SocketManager socketManager, EventMessageModel eventMessageModel, EventMessageModel eventMessageModel2) {
        Intrinsics.checkNotNullParameter(socketManager, "this$0");
        Intrinsics.checkNotNullParameter(eventMessageModel, "$event");
        socketManager.lastEvent = eventMessageModel2;
        MessageChannel.Companion.getInstance().sendMessage(eventMessageModel);
    }

    public final void checkIsAlive() {
        Boolean bool;
        C7735c cVar = this.mExampleClient;
        if (cVar != null) {
            if (cVar == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cVar.mo50395O());
            }
            Intrinsics.checkNotNull(bool);
            if (!bool.booleanValue()) {
                connect();
                LogFileUtils.Companion.get().upLog("长链接", Intrinsics.stringPlus("Android_", SPManagerKt.getCustomerId()), "checkIsAlive 心跳监测 长链接废了");
                return;
            }
            return;
        }
        connect();
        if (this.mPath.length() > 0) {
            LogFileUtils.Companion.get().upLog("长链接", Intrinsics.stringPlus("Android_", SPManagerKt.getCustomerId()), "checkIsAlive mWebSocket=null");
        }
    }

    public final void closeSocket() {
        DateFormat.format("yyyy-MM-dd HH:mm:SS", new Date());
        C7735c cVar = this.mExampleClient;
        if (cVar != null) {
            Intrinsics.checkNotNull(cVar);
            cVar.mo50389I(1000, "");
            this.mExampleClient = null;
        }
    }

    public final void initSocket(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        this.mPath = str;
        this.mPingInterval = i;
        connect();
    }
}
