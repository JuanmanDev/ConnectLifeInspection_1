package com.juconnect.connectlife.utils;

import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p525z.p526a.C7820f;
import p040c.p525z.p526a.C7822h;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/utils/LoggerUtil;", "", "()V", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoggerUtil.kt */
public final class LoggerUtil {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007¨\u0006\u0015"}, mo47991d2 = {"Lcom/juconnect/connectlife/utils/LoggerUtil$Companion;", "", "()V", "d", "", "any", "message", "", "e", "throwable", "", "i", "initLog", "isLogEnable", "", "tag", "json", "v", "w", "wtf", "xml", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LoggerUtil.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void mo45312d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "any");
            C7820f.m21848b(obj);
        }

        /* renamed from: e */
        public final void mo45314e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21850d(str, new Object[0]);
        }

        /* renamed from: i */
        public final void mo45316i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21852f(str, new Object[0]);
        }

        public final void initLog(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
            C7822h.C7824b j = C7822h.m21875j();
            j.mo33338d(false);
            j.mo33336b(1);
            j.mo33337c(1);
            j.mo33339e(str);
            C7822h a = j.mo33335a();
            Intrinsics.checkNotNullExpressionValue(a, "newBuilder()\n           …\n                .build()");
            C7820f.m21847a(new LoggerUtil$Companion$initLog$1(a, z));
        }

        public final void json(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "json");
            C7820f.m21853g(str);
        }

        /* renamed from: v */
        public final void mo45319v(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21855i(str, new Object[0]);
        }

        /* renamed from: w */
        public final void mo45320w(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21856j(str, new Object[0]);
        }

        public final void wtf(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21857k(str, new Object[0]);
        }

        public final void xml(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "xml");
            C7820f.m21858l(str);
        }

        /* renamed from: d */
        public final void mo45313d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21849c(str, new Object[0]);
        }

        /* renamed from: e */
        public final void mo45315e(@NotNull Throwable th, @NotNull String str) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            Intrinsics.checkNotNullParameter(str, "message");
            C7820f.m21851e(th, str, new Object[0]);
        }
    }
}
