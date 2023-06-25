package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceNetStatus;", "", "mainOnline", "", "subOnline", "(II)V", "getMainOnline", "()I", "getSubOnline", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SimpleDeviceNetStatus.kt */
public final class SimpleDeviceNetStatus {
    public final int mainOnline;
    public final int subOnline;

    public SimpleDeviceNetStatus(int i, int i2) {
        this.mainOnline = i;
        this.subOnline = i2;
    }

    public static /* synthetic */ SimpleDeviceNetStatus copy$default(SimpleDeviceNetStatus simpleDeviceNetStatus, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = simpleDeviceNetStatus.mainOnline;
        }
        if ((i3 & 2) != 0) {
            i2 = simpleDeviceNetStatus.subOnline;
        }
        return simpleDeviceNetStatus.copy(i, i2);
    }

    public final int component1() {
        return this.mainOnline;
    }

    public final int component2() {
        return this.subOnline;
    }

    @NotNull
    public final SimpleDeviceNetStatus copy(int i, int i2) {
        return new SimpleDeviceNetStatus(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDeviceNetStatus)) {
            return false;
        }
        SimpleDeviceNetStatus simpleDeviceNetStatus = (SimpleDeviceNetStatus) obj;
        return this.mainOnline == simpleDeviceNetStatus.mainOnline && this.subOnline == simpleDeviceNetStatus.subOnline;
    }

    public final int getMainOnline() {
        return this.mainOnline;
    }

    public final int getSubOnline() {
        return this.subOnline;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mainOnline) * 31) + Integer.hashCode(this.subOnline);
    }

    @NotNull
    public String toString() {
        return "SimpleDeviceNetStatus(mainOnline=" + this.mainOnline + ", subOnline=" + this.subOnline + ')';
    }
}
