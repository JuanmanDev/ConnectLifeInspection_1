package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, mo47991d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 176)
/* compiled from: SafeCollector.common.kt */
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1 implements Flow<T> {
    public final /* synthetic */ Function2 $predicate$inlined;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(Flow flow, Function2 function2) {
        this.$this_unsafeTransform$inlined = flow;
        this.$predicate$inlined = function2;
    }

    @Nullable
    public Object collect(@NotNull final FlowCollector flowCollector, @NotNull Continuation continuation) {
        Flow flow = this.$this_unsafeTransform$inlined;
        final Function2 function2 = this.$predicate$inlined;
        Object collect = flow.collect(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @org.jetbrains.annotations.Nullable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.C95412.C95421
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.C95412.C95421) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x006c
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$1
                    kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                    java.lang.Object r2 = r0.L$0
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x0056
                L_0x003e:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r4
                    kotlin.jvm.functions.Function2 r2 = r2
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L_0x0056:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L_0x006c
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L_0x006c
                    return r1
                L_0x006c:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.C95412.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Nullable
            public final Object emit$$forInline(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new ContinuationImpl(this, continuation) {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;
                    public final /* synthetic */ C95412 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                };
                InlineMarker.mark(5);
                FlowCollector flowCollector = r4;
                if (((Boolean) r2.invoke(obj, continuation)).booleanValue()) {
                    InlineMarker.mark(0);
                    flowCollector.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public Object collect$$forInline(@NotNull final FlowCollector flowCollector, @NotNull Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(this, continuation) {
            public int label;
            public /* synthetic */ Object result;
            public final /* synthetic */ FlowKt__TransformKt$filter$$inlined$unsafeTransform$1 this$0;

            {
                this.this$0 = r1;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((FlowCollector) null, this);
            }
        };
        InlineMarker.mark(5);
        Flow flow = this.$this_unsafeTransform$inlined;
        final Function2 function2 = this.$predicate$inlined;
        C95412 r1 = new FlowCollector() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.C95412.C95421
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.C95412.C95421) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x006c
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$1
                    kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                    java.lang.Object r2 = r0.L$0
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x0056
                L_0x003e:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r4
                    kotlin.jvm.functions.Function2 r2 = r2
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L_0x0056:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L_0x006c
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L_0x006c
                    return r1
                L_0x006c:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.C95412.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Nullable
            public final Object emit$$forInline(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new ContinuationImpl(this, continuation) {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;
                    public final /* synthetic */ C95412 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                };
                InlineMarker.mark(5);
                FlowCollector flowCollector = flowCollector;
                if (((Boolean) function2.invoke(obj, continuation)).booleanValue()) {
                    InlineMarker.mark(0);
                    flowCollector.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }
        };
        InlineMarker.mark(0);
        flow.collect(r1, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}