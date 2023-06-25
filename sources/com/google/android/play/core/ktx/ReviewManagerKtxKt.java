package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.play.core.review.ReviewInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p348d.p349a.p350a.C5794a;

@Metadata(mo47990d1 = {"\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\tH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00142\u0006\u0010\u0015\u001a\u0002H\u0013H\u0000¢\u0006\u0002\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo47991d2 = {"runTask", "T", "task", "Lcom/google/android/gms/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchReview", "Lcom/google/android/play/core/review/ReviewManager;", "activity", "Landroid/app/Activity;", "reviewInfo", "Lcom/google/android/play/core/review/ReviewInfo;", "(Lcom/google/android/play/core/review/ReviewManager;Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReview", "(Lcom/google/android/play/core/review/ReviewManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryOffer", "", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_review_ktx"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
public final class ReviewManagerKtxKt {
    @Nullable
    public static final Object launchReview(@NotNull C5794a aVar, @NotNull Activity activity, @NotNull ReviewInfo reviewInfo, @NotNull Continuation<? super Unit> continuation) {
        C5771j<Void> a = aVar.mo28885a(activity, reviewInfo);
        Intrinsics.checkNotNullExpressionValue(a, "launchReviewFlow(activity, reviewInfo)");
        Object runTask$default = runTask$default(a, (Function0) null, continuation, 2, (Object) null);
        return runTask$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runTask$default : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object requestReview(@org.jetbrains.annotations.NotNull p040c.p200q.p201a.p348d.p349a.p350a.C5794a r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.google.android.play.core.review.ReviewInfo> r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r0 = (com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r0 = new com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0048
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r5)
            c.q.a.c.m.j r4 = r4.mo28886b()
            java.lang.String r5 = "requestReviewFlow()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = 2
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = runTask$default(r4, r2, r0, r5, r2)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            java.lang.String r4 = "runTask(requestReviewFlow())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.ReviewManagerKtxKt.requestReview(c.q.a.d.a.a.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final <T> Object runTask(@NotNull C5771j<T> jVar, @NotNull Function0<Unit> function0, @NotNull Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new ReviewManagerKtxKt$runTask$3$1(function0));
        if (!jVar.mo28855p()) {
            jVar.mo28846g(new ReviewManagerKtxKt$runTask$3$2(cancellableContinuationImpl));
            jVar.mo28844e(new ReviewManagerKtxKt$runTask$3$3(cancellableContinuationImpl));
        } else if (jVar.mo28856q()) {
            cancellableContinuationImpl.resumeWith(Result.m27299constructorimpl(jVar.mo28852m()));
        } else {
            Exception l = jVar.mo28851l();
            Intrinsics.checkNotNull(l);
            cancellableContinuationImpl.resumeWith(Result.m27299constructorimpl(ResultKt.createFailure(l)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(C5771j jVar, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = ReviewManagerKtxKt$runTask$2.INSTANCE;
        }
        return runTask(jVar, function0, continuation);
    }

    public static final <E> boolean tryOffer(@NotNull SendChannel<? super E> sendChannel, E e) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m28804isSuccessimpl(sendChannel.m28816trySendJP2dKIU(e));
    }
}
