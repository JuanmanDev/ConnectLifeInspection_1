package com.hisense.connect_life.core.event;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/core/event/MaiDianEvent;", "", "k", "", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "getK", "()Ljava/lang/String;", "setK", "(Ljava/lang/String;)V", "getV", "setV", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MaiDianEvent.kt */
public final class MaiDianEvent {
    @NotNull

    /* renamed from: k */
    public String f15936k;
    @NotNull

    /* renamed from: v */
    public String f15937v;

    public MaiDianEvent() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public MaiDianEvent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "k");
        Intrinsics.checkNotNullParameter(str2, "v");
        this.f15936k = str;
        this.f15937v = str2;
    }

    @NotNull
    public final String getK() {
        return this.f15936k;
    }

    @NotNull
    public final String getV() {
        return this.f15937v;
    }

    public final void setK(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15936k = str;
    }

    public final void setV(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15937v = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaiDianEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
