package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookResult;", "", "resultCode", "", "devInstruction", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/InstructionBookInfo;", "signatureServer", "", "(ILjava/util/List;Ljava/lang/String;)V", "getDevInstruction", "()Ljava/util/List;", "setDevInstruction", "(Ljava/util/List;)V", "getResultCode", "()I", "setResultCode", "(I)V", "getSignatureServer", "()Ljava/lang/String;", "setSignatureServer", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InstructionBookInfo.kt */
public final class InstructionBookResult {
    @NotNull
    public List<InstructionBookInfo> devInstruction;
    public int resultCode;
    @NotNull
    public String signatureServer;

    public InstructionBookResult(int i, @NotNull List<InstructionBookInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "devInstruction");
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        this.resultCode = i;
        this.devInstruction = list;
        this.signatureServer = str;
    }

    public static /* synthetic */ InstructionBookResult copy$default(InstructionBookResult instructionBookResult, int i, List<InstructionBookInfo> list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = instructionBookResult.resultCode;
        }
        if ((i2 & 2) != 0) {
            list = instructionBookResult.devInstruction;
        }
        if ((i2 & 4) != 0) {
            str = instructionBookResult.signatureServer;
        }
        return instructionBookResult.copy(i, list, str);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final List<InstructionBookInfo> component2() {
        return this.devInstruction;
    }

    @NotNull
    public final String component3() {
        return this.signatureServer;
    }

    @NotNull
    public final InstructionBookResult copy(int i, @NotNull List<InstructionBookInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "devInstruction");
        Intrinsics.checkNotNullParameter(str, "signatureServer");
        return new InstructionBookResult(i, list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionBookResult)) {
            return false;
        }
        InstructionBookResult instructionBookResult = (InstructionBookResult) obj;
        return this.resultCode == instructionBookResult.resultCode && Intrinsics.areEqual((Object) this.devInstruction, (Object) instructionBookResult.devInstruction) && Intrinsics.areEqual((Object) this.signatureServer, (Object) instructionBookResult.signatureServer);
    }

    @NotNull
    public final List<InstructionBookInfo> getDevInstruction() {
        return this.devInstruction;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getSignatureServer() {
        return this.signatureServer;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + this.devInstruction.hashCode()) * 31) + this.signatureServer.hashCode();
    }

    public final void setDevInstruction(@NotNull List<InstructionBookInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.devInstruction = list;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setSignatureServer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.signatureServer = str;
    }

    @NotNull
    public String toString() {
        return "InstructionBookResult(resultCode=" + this.resultCode + ", devInstruction=" + this.devInstruction + ", signatureServer=" + this.signatureServer + ')';
    }
}
