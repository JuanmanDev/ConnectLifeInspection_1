package com.internationalwinecooler.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo47991d2 = {"Lcom/internationalwinecooler/model/JsResp;", "T", "", "data", "resultCode", "", "errorDesc", "", "(Ljava/lang/Object;ILjava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorDesc", "()Ljava/lang/String;", "getResultCode", "()I", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;ILjava/lang/String;)Lcom/internationalwinecooler/model/JsResp;", "equals", "", "other", "hashCode", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JsResp.kt */
public final class JsResp<T> {
    @Nullable
    public final T data;
    @NotNull
    public final String errorDesc;
    public final int resultCode;

    public JsResp(@Nullable T t, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.data = t;
        this.resultCode = i;
        this.errorDesc = str;
    }

    public static /* synthetic */ JsResp copy$default(JsResp jsResp, T t, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            t = jsResp.data;
        }
        if ((i2 & 2) != 0) {
            i = jsResp.resultCode;
        }
        if ((i2 & 4) != 0) {
            str = jsResp.errorDesc;
        }
        return jsResp.copy(t, i, str);
    }

    @Nullable
    public final T component1() {
        return this.data;
    }

    public final int component2() {
        return this.resultCode;
    }

    @NotNull
    public final String component3() {
        return this.errorDesc;
    }

    @NotNull
    public final JsResp<T> copy(@Nullable T t, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        return new JsResp<>(t, i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsResp)) {
            return false;
        }
        JsResp jsResp = (JsResp) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) jsResp.data) && this.resultCode == jsResp.resultCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) jsResp.errorDesc);
    }

    @Nullable
    public final T getData() {
        return this.data;
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
        return ((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.resultCode)) * 31) + this.errorDesc.hashCode();
    }

    @NotNull
    public String toString() {
        return "JsResp(data=" + this.data + ", resultCode=" + this.resultCode + ", errorDesc=" + this.errorDesc + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsResp(Object obj, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }
}
