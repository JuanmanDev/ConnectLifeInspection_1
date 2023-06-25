package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceDetail;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceInfo;", "properties", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceProperty;", "(Ljava/util/List;)V", "getProperties", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SimpleDeviceDetail.kt */
public final class SimpleDeviceDetail extends SimpleDeviceInfo {
    @NotNull
    public final List<SimpleDeviceProperty> properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleDeviceDetail(@NotNull List<SimpleDeviceProperty> list) {
        super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "properties");
        this.properties = list;
    }

    public static /* synthetic */ SimpleDeviceDetail copy$default(SimpleDeviceDetail simpleDeviceDetail, List<SimpleDeviceProperty> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simpleDeviceDetail.properties;
        }
        return simpleDeviceDetail.copy(list);
    }

    @NotNull
    public final List<SimpleDeviceProperty> component1() {
        return this.properties;
    }

    @NotNull
    public final SimpleDeviceDetail copy(@NotNull List<SimpleDeviceProperty> list) {
        Intrinsics.checkNotNullParameter(list, "properties");
        return new SimpleDeviceDetail(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleDeviceDetail) && Intrinsics.areEqual((Object) this.properties, (Object) ((SimpleDeviceDetail) obj).properties);
    }

    @NotNull
    public final List<SimpleDeviceProperty> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @NotNull
    public String toString() {
        return "SimpleDeviceDetail(properties=" + this.properties + ')';
    }
}
