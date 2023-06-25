package com.hisense.connect_life.hismart.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/model/LogResponse;", "", "code", "", "msg", "", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LogResponse.kt */
public final class LogResponse {
    public int code;
    @NotNull
    public final String msg;

    public LogResponse() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public LogResponse(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        this.code = i;
        this.msg = str;
    }

    public static /* synthetic */ LogResponse copy$default(LogResponse logResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = logResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = logResponse.msg;
        }
        return logResponse.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.msg;
    }

    @NotNull
    public final LogResponse copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return new LogResponse(i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogResponse)) {
            return false;
        }
        LogResponse logResponse = (LogResponse) obj;
        return this.code == logResponse.code && Intrinsics.areEqual((Object) this.msg, (Object) logResponse.msg);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.msg.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @NotNull
    public String toString() {
        return "LogResponse(code=" + this.code + ", msg=" + this.msg + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogResponse(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
