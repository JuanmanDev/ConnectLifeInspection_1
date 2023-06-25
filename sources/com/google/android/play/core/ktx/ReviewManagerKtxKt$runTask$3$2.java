package com.google.android.play.core.ktx;

import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import p040c.p200q.p201a.p264c.p347m.C5765g;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo47991d2 = {"<anonymous>", "", "T", "result", "kotlin.jvm.PlatformType", "onSuccess", "(Ljava/lang/Object;)V"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
public final class ReviewManagerKtxKt$runTask$3$2<TResult> implements C5765g {
    public final /* synthetic */ CancellableContinuation<T> $continuation;

    public ReviewManagerKtxKt$runTask$3$2(CancellableContinuation<? super T> cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    public final void onSuccess(T t) {
        this.$continuation.resumeWith(Result.m27299constructorimpl(t));
    }
}
