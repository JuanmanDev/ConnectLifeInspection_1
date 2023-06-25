package com.internationalwinecooler.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, mo47991d2 = {"Lcom/internationalwinecooler/model/LightsInfo;", "", "lightsSwitch", "", "brightVal", "", "lightVal", "lightsTime", "", "ambientalSwitch", "ambientVal", "ambientColor", "(ZIILjava/lang/String;ZILjava/lang/String;)V", "getAmbientColor", "()Ljava/lang/String;", "getAmbientVal", "()I", "getAmbientalSwitch", "()Z", "getBrightVal", "getLightVal", "getLightsSwitch", "getLightsTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LightsInfo.kt */
public final class LightsInfo {
    @NotNull
    public final String ambientColor;
    public final int ambientVal;
    public final boolean ambientalSwitch;
    public final int brightVal;
    public final int lightVal;
    public final boolean lightsSwitch;
    @NotNull
    public final String lightsTime;

    public LightsInfo(boolean z, int i, int i2, @NotNull String str, boolean z2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "lightsTime");
        Intrinsics.checkNotNullParameter(str2, "ambientColor");
        this.lightsSwitch = z;
        this.brightVal = i;
        this.lightVal = i2;
        this.lightsTime = str;
        this.ambientalSwitch = z2;
        this.ambientVal = i3;
        this.ambientColor = str2;
    }

    public static /* synthetic */ LightsInfo copy$default(LightsInfo lightsInfo, boolean z, int i, int i2, String str, boolean z2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = lightsInfo.lightsSwitch;
        }
        if ((i4 & 2) != 0) {
            i = lightsInfo.brightVal;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = lightsInfo.lightVal;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            str = lightsInfo.lightsTime;
        }
        String str3 = str;
        if ((i4 & 16) != 0) {
            z2 = lightsInfo.ambientalSwitch;
        }
        boolean z3 = z2;
        if ((i4 & 32) != 0) {
            i3 = lightsInfo.ambientVal;
        }
        int i7 = i3;
        if ((i4 & 64) != 0) {
            str2 = lightsInfo.ambientColor;
        }
        return lightsInfo.copy(z, i5, i6, str3, z3, i7, str2);
    }

    public final boolean component1() {
        return this.lightsSwitch;
    }

    public final int component2() {
        return this.brightVal;
    }

    public final int component3() {
        return this.lightVal;
    }

    @NotNull
    public final String component4() {
        return this.lightsTime;
    }

    public final boolean component5() {
        return this.ambientalSwitch;
    }

    public final int component6() {
        return this.ambientVal;
    }

    @NotNull
    public final String component7() {
        return this.ambientColor;
    }

    @NotNull
    public final LightsInfo copy(boolean z, int i, int i2, @NotNull String str, boolean z2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "lightsTime");
        String str3 = str2;
        Intrinsics.checkNotNullParameter(str3, "ambientColor");
        return new LightsInfo(z, i, i2, str, z2, i3, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightsInfo)) {
            return false;
        }
        LightsInfo lightsInfo = (LightsInfo) obj;
        return this.lightsSwitch == lightsInfo.lightsSwitch && this.brightVal == lightsInfo.brightVal && this.lightVal == lightsInfo.lightVal && Intrinsics.areEqual((Object) this.lightsTime, (Object) lightsInfo.lightsTime) && this.ambientalSwitch == lightsInfo.ambientalSwitch && this.ambientVal == lightsInfo.ambientVal && Intrinsics.areEqual((Object) this.ambientColor, (Object) lightsInfo.ambientColor);
    }

    @NotNull
    public final String getAmbientColor() {
        return this.ambientColor;
    }

    public final int getAmbientVal() {
        return this.ambientVal;
    }

    public final boolean getAmbientalSwitch() {
        return this.ambientalSwitch;
    }

    public final int getBrightVal() {
        return this.brightVal;
    }

    public final int getLightVal() {
        return this.lightVal;
    }

    public final boolean getLightsSwitch() {
        return this.lightsSwitch;
    }

    @NotNull
    public final String getLightsTime() {
        return this.lightsTime;
    }

    public int hashCode() {
        boolean z = this.lightsSwitch;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((((z ? 1 : 0) * true) + Integer.hashCode(this.brightVal)) * 31) + Integer.hashCode(this.lightVal)) * 31) + this.lightsTime.hashCode()) * 31;
        boolean z3 = this.ambientalSwitch;
        if (!z3) {
            z2 = z3;
        }
        return ((((hashCode + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.ambientVal)) * 31) + this.ambientColor.hashCode();
    }

    @NotNull
    public String toString() {
        return "LightsInfo(lightsSwitch=" + this.lightsSwitch + ", brightVal=" + this.brightVal + ", lightVal=" + this.lightVal + ", lightsTime=" + this.lightsTime + ", ambientalSwitch=" + this.ambientalSwitch + ", ambientVal=" + this.ambientVal + ", ambientColor=" + this.ambientColor + ')';
    }
}
