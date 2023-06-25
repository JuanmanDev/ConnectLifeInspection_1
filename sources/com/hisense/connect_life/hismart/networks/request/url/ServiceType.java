package com.hisense.connect_life.hismart.networks.request.url;

import com.hisense.connect_life.hismart.networks.exception.HiNetworkException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/url/ServiceType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TESTING", "DEV", "PRESSURE_TESTING", "RELEASE", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ServiceType.kt */
public enum ServiceType {
    TESTING("testing"),
    DEV("dev"),
    PRESSURE_TESTING("pressureTesting"),
    RELEASE("release");
    
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public final String type;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/url/ServiceType$Companion;", "", "()V", "fromString", "Lcom/hisense/connect_life/hismart/networks/request/url/ServiceType;", "value", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ServiceType.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ServiceType fromString(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            if (Intrinsics.areEqual((Object) str, (Object) ServiceType.TESTING.getType())) {
                return ServiceType.TESTING;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ServiceType.PRESSURE_TESTING.getType())) {
                return ServiceType.PRESSURE_TESTING;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ServiceType.DEV.getType())) {
                return ServiceType.DEV;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ServiceType.RELEASE.getType())) {
                return ServiceType.RELEASE;
            }
            throw new HiNetworkException(Intrinsics.stringPlus("No enum constant for ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ServiceType(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
