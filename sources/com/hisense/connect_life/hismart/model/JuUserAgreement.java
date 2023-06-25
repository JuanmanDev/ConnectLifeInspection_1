package com.hisense.connect_life.hismart.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/JuUserAgreement;", "", "resultCode", "", "data", "Lcom/hisense/connect_life/hismart/model/JHLAgreementData;", "(ILcom/hisense/connect_life/hismart/model/JHLAgreementData;)V", "getData", "()Lcom/hisense/connect_life/hismart/model/JHLAgreementData;", "getResultCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuUserAgreement.kt */
public final class JuUserAgreement {
    @NotNull
    public final JHLAgreementData data;
    public final int resultCode;

    public JuUserAgreement(int i, @NotNull JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(jHLAgreementData, "data");
        this.resultCode = i;
        this.data = jHLAgreementData;
    }

    public static /* synthetic */ JuUserAgreement copy$default(JuUserAgreement juUserAgreement, int i, JHLAgreementData jHLAgreementData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = juUserAgreement.resultCode;
        }
        if ((i2 & 2) != 0) {
            jHLAgreementData = juUserAgreement.data;
        }
        return juUserAgreement.copy(i, jHLAgreementData);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final JHLAgreementData component2() {
        return this.data;
    }

    @NotNull
    public final JuUserAgreement copy(int i, @NotNull JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(jHLAgreementData, "data");
        return new JuUserAgreement(i, jHLAgreementData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuUserAgreement)) {
            return false;
        }
        JuUserAgreement juUserAgreement = (JuUserAgreement) obj;
        return this.resultCode == juUserAgreement.resultCode && Intrinsics.areEqual((Object) this.data, (Object) juUserAgreement.data);
    }

    @NotNull
    public final JHLAgreementData getData() {
        return this.data;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.resultCode) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "JuUserAgreement(resultCode=" + this.resultCode + ", data=" + this.data + ')';
    }
}
