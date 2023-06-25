package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@DebugMetadata(mo48700c = "androidx.core.view.ViewGroupKt$descendants$1", mo48701f = "ViewGroup.kt", mo48702i = {0, 0, 0, 0, 1, 1, 1}, mo48703l = {119, 121}, mo48704m = "invokeSuspend", mo48705n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, mo48706s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
/* compiled from: ViewGroup.kt */
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, Continuation<? super ViewGroupKt$descendants$1> continuation) {
        super(2, continuation);
        this.$this_descendants = viewGroup;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, continuation);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super View> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ViewGroupKt$descendants$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r11.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
            goto L_0x0090
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0028:
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$2
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r11.L$1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r11.L$0
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
            goto L_0x0070
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
            android.view.ViewGroup r1 = r11.$this_descendants
            r4 = 0
            int r5 = r1.getChildCount()
            r6 = r11
        L_0x004c:
            if (r4 >= r5) goto L_0x009d
            android.view.View r7 = r1.getChildAt(r4)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r6.L$0 = r12
            r6.L$1 = r1
            r6.L$2 = r7
            r6.I$0 = r4
            r6.I$1 = r5
            r6.label = r3
            java.lang.Object r8 = r12.yield(r7, r6)
            if (r8 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r9 = r7
            r7 = r12
            r12 = r6
            r6 = r1
            r1 = r5
            r5 = r9
        L_0x0070:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0097
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.Sequence r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r12.L$0 = r7
            r12.L$1 = r6
            r8 = 0
            r12.L$2 = r8
            r12.I$0 = r4
            r12.I$1 = r1
            r12.label = r2
            java.lang.Object r5 = r7.yieldAll(r5, (kotlin.coroutines.Continuation<? super kotlin.Unit>) r12)
            if (r5 != r0) goto L_0x008e
            return r0
        L_0x008e:
            r5 = r6
            r6 = r7
        L_0x0090:
            r9 = r6
            r6 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
            goto L_0x009b
        L_0x0097:
            r5 = r1
            r1 = r6
            r6 = r12
            r12 = r7
        L_0x009b:
            int r4 = r4 + r3
            goto L_0x004c
        L_0x009d:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
