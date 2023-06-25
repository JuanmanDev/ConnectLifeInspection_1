package com.hisense.connect_life.hismart.networks.request.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageFormId;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "ELSE", "WIFI", "DEVICE_STATUS", "SELF", "ALARM", "INVENTORY", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageFormId.kt */
public enum MessageFormId {
    ELSE(1001),
    WIFI(2),
    DEVICE_STATUS(3),
    SELF(5),
    ALARM(7),
    INVENTORY(8);
    
    @NotNull
    public static final Companion Companion = null;
    public final int type;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageFormId$Companion;", "", "()V", "fromType", "Lcom/hisense/connect_life/hismart/networks/request/message/MessageFormId;", "type", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MessageFormId.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageFormId fromType(int i) {
            if (i == MessageFormId.WIFI.getType()) {
                return MessageFormId.WIFI;
            }
            if (i == MessageFormId.DEVICE_STATUS.getType()) {
                return MessageFormId.DEVICE_STATUS;
            }
            if (i == MessageFormId.SELF.getType()) {
                return MessageFormId.SELF;
            }
            if (i == MessageFormId.ALARM.getType()) {
                return MessageFormId.ALARM;
            }
            if (i == MessageFormId.INVENTORY.getType()) {
                return MessageFormId.INVENTORY;
            }
            return MessageFormId.ELSE;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    MessageFormId(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
