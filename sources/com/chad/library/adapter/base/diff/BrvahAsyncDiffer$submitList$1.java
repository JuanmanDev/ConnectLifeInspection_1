package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "", "T", "run"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BrvahAsyncDiffer.kt */
public final class BrvahAsyncDiffer$submitList$1 implements Runnable {
    public final /* synthetic */ Runnable $commitCallback;
    public final /* synthetic */ List $newList;
    public final /* synthetic */ List $oldList;
    public final /* synthetic */ int $runGeneration;
    public final /* synthetic */ BrvahAsyncDiffer this$0;

    public BrvahAsyncDiffer$submitList$1(BrvahAsyncDiffer brvahAsyncDiffer, List list, List list2, int i, Runnable runnable) {
        this.this$0 = brvahAsyncDiffer;
        this.$oldList = list;
        this.$newList = list2;
        this.$runGeneration = i;
        this.$commitCallback = runnable;
    }

    public final void run() {
        final DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new BrvahAsyncDiffer$submitList$1$result$1(this));
        Intrinsics.checkExpressionValueIsNotNull(calculateDiff, "DiffUtil.calculateDiff(o…         }\n            })");
        this.this$0.mMainThreadExecutor.execute(new Runnable(this) {
            public final /* synthetic */ BrvahAsyncDiffer$submitList$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                int access$getMMaxScheduledGeneration$p = this.this$0.this$0.mMaxScheduledGeneration;
                BrvahAsyncDiffer$submitList$1 brvahAsyncDiffer$submitList$1 = this.this$0;
                if (access$getMMaxScheduledGeneration$p == brvahAsyncDiffer$submitList$1.$runGeneration) {
                    brvahAsyncDiffer$submitList$1.this$0.latchList(brvahAsyncDiffer$submitList$1.$newList, calculateDiff, brvahAsyncDiffer$submitList$1.$commitCallback);
                }
            }
        });
    }
}
