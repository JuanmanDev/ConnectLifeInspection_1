package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "CONNECTED", "OFFLINE", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: OnlineStatus.kt */
public enum OnlineStatus {
    CONNECTED(1),
    OFFLINE(2);
    
    @NotNull
    public static final Companion Companion = null;
    public final int type;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus$Companion;", "", "()V", "fromType", "Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;", "type", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: OnlineStatus.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnlineStatus fromType(int i) {
            if (i == OnlineStatus.CONNECTED.getType()) {
                return OnlineStatus.CONNECTED;
            }
            if (i == OnlineStatus.OFFLINE.getType()) {
                return OnlineStatus.OFFLINE;
            }
            return OnlineStatus.OFFLINE;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    OnlineStatus(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
