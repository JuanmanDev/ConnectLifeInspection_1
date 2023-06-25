package com.hisense.connect_life.core.glide;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p077d.p078a.p101o.C1912f;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0006"}, mo47991d2 = {"requestOptionBuilder", "Lcom/bumptech/glide/request/RequestOptions;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "core_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GlideBuilder.kt */
public final class GlideBuilderKt {
    @NotNull
    public static final C1912f requestOptionBuilder(@NotNull Function1<? super C1912f, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "builderAction");
        C1912f fVar = new C1912f();
        function1.invoke(fVar);
        return fVar;
    }
}
