package com.hisense.connect_life.core.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/LogUtilsShen;", "", "()V", "Companion", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LogUtilsShen.kt */
public final class LogUtilsShen {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG_SHEN = "shensq";
    public static final boolean isShowLog = false;

    @Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/LogUtilsShen$Companion;", "", "()V", "TAG_SHEN", "", "isShowLog", "", "d", "", "message", "e", "throwable", "", "i", "v", "w", "wtf", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LogUtilsShen.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void mo39137d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        /* renamed from: e */
        public final void mo39138e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        /* renamed from: e */
        public final void mo39139e(@NotNull String str, @NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(th, "throwable");
        }

        /* renamed from: i */
        public final void mo39140i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        /* renamed from: v */
        public final void mo39141v(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        /* renamed from: w */
        public final void mo39142w(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        public final void wtf(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }
    }
}
