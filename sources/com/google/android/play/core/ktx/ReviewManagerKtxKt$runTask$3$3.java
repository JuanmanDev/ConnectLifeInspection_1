package com.google.android.play.core.ktx;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p201a.p264c.p347m.C5763f;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "T", "exception", "Ljava/lang/Exception;", "onFailure"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
public final class ReviewManagerKtxKt$runTask$3$3 implements C5763f {
    public final /* synthetic */ CancellableContinuation<T> $continuation;

    public ReviewManagerKtxKt$runTask$3$3(CancellableContinuation<? super T> cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    public final void onFailure(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "exception");
        this.$continuation.resumeWith(Result.m27299constructorimpl(ResultKt.createFailure(exc)));
    }
}
