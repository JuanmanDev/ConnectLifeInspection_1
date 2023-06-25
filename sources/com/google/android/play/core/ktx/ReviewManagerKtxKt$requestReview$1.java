package com.google.android.play.core.ktx;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p348d.p349a.p350a.C5794a;

@Metadata(mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", mo48701f = "ReviewManagerKtx.kt", mo48702i = {}, mo48703l = {22}, mo48704m = "requestReview", mo48705n = {}, mo48706s = {})
/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
public final class ReviewManagerKtxKt$requestReview$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public ReviewManagerKtxKt$requestReview$1(Continuation<? super ReviewManagerKtxKt$requestReview$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ReviewManagerKtxKt.requestReview((C5794a) null, this);
    }
}
