package com.hisense.connect_life.hismart.room;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/room/NotiTitle;", "", "title", "", "select", "", "(Ljava/lang/String;I)V", "getSelect", "()I", "setSelect", "(I)V", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotiTitle.kt */
public final class NotiTitle {
    public int select;
    @Nullable
    public final String title;

    public NotiTitle(@Nullable String str, int i) {
        this.title = str;
        this.select = i;
    }

    public static /* synthetic */ NotiTitle copy$default(NotiTitle notiTitle, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notiTitle.title;
        }
        if ((i2 & 2) != 0) {
            i = notiTitle.select;
        }
        return notiTitle.copy(str, i);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.select;
    }

    @NotNull
    public final NotiTitle copy(@Nullable String str, int i) {
        return new NotiTitle(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotiTitle)) {
            return false;
        }
        NotiTitle notiTitle = (NotiTitle) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) notiTitle.title) && this.select == notiTitle.select;
    }

    public final int getSelect() {
        return this.select;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.select);
    }

    public final void setSelect(int i) {
        this.select = i;
    }

    @NotNull
    public String toString() {
        return "NotiTitle(title=" + this.title + ", select=" + this.select + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotiTitle(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
