package com.juconnect.connect_life.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006$"}, mo47991d2 = {"Lcom/juconnect/connect_life/model/ChannelResponse;", "T", "", "data", "resultCode", "", "errorCode", "errorDesc", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "getResultCode", "setResultCode", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Lcom/juconnect/connect_life/model/ChannelResponse;", "equals", "", "other", "hashCode", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChannelResponse.kt */
public final class ChannelResponse<T> {
    @Nullable
    public T data;
    public int errorCode;
    @NotNull
    public String errorDesc;
    public int resultCode;

    public ChannelResponse(@Nullable T t, int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.data = t;
        this.resultCode = i;
        this.errorCode = i2;
        this.errorDesc = str;
    }

    public static /* synthetic */ ChannelResponse copy$default(ChannelResponse channelResponse, T t, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            t = channelResponse.data;
        }
        if ((i3 & 2) != 0) {
            i = channelResponse.resultCode;
        }
        if ((i3 & 4) != 0) {
            i2 = channelResponse.errorCode;
        }
        if ((i3 & 8) != 0) {
            str = channelResponse.errorDesc;
        }
        return channelResponse.copy(t, i, i2, str);
    }

    @Nullable
    public final T component1() {
        return this.data;
    }

    public final int component2() {
        return this.resultCode;
    }

    public final int component3() {
        return this.errorCode;
    }

    @NotNull
    public final String component4() {
        return this.errorDesc;
    }

    @NotNull
    public final ChannelResponse<T> copy(@Nullable T t, int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        return new ChannelResponse<>(t, i, i2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelResponse)) {
            return false;
        }
        ChannelResponse channelResponse = (ChannelResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) channelResponse.data) && this.resultCode == channelResponse.resultCode && this.errorCode == channelResponse.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) channelResponse.errorDesc);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        T t = this.data;
        return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.resultCode)) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorDesc.hashCode();
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "ChannelResponse(data=" + this.data + ", resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelResponse(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? "" : str);
    }
}
