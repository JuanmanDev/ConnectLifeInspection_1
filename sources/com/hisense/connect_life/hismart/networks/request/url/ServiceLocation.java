package com.hisense.connect_life.hismart.networks.request.url;

import com.hisense.connect_life.hismart.networks.exception.HiNetworkException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/url/ServiceLocation;", "", "location", "", "(Ljava/lang/String;ILjava/lang/String;)V", "CHINA", "USA", "EUROPE", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ServiceLocation.kt */
public enum ServiceLocation {
    CHINA("cn"),
    USA("usa"),
    EUROPE("eu");
    
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public final String location;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/url/ServiceLocation$Companion;", "", "()V", "fromString", "Lcom/hisense/connect_life/hismart/networks/request/url/ServiceLocation;", "value", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ServiceLocation.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ServiceLocation fromString(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            if (Intrinsics.areEqual((Object) str, (Object) ServiceLocation.CHINA.location)) {
                return ServiceLocation.CHINA;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ServiceLocation.USA.location)) {
                return ServiceLocation.USA;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ServiceLocation.EUROPE.location)) {
                return ServiceLocation.EUROPE;
            }
            throw new HiNetworkException(Intrinsics.stringPlus("No enum constant for ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ServiceLocation(String str) {
        this.location = str;
    }
}
