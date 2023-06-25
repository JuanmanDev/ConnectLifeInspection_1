package com.juconnect.connectlife.ju_dist.fbean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/fbean/ResultInfo;", "", "()V", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "data", "getData", "setData", "resultCode", "", "getResultCode", "()Ljava/lang/Integer;", "setResultCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ResultInfo.kt */
public final class ResultInfo {
    @Nullable
    public String createTime;
    @Nullable
    public String data;
    @Nullable
    public Integer resultCode;

    @Nullable
    public final String getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final void setCreateTime(@Nullable String str) {
        this.createTime = str;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setResultCode(@Nullable Integer num) {
        this.resultCode = num;
    }
}
