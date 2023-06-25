package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001f\n\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, mo47991d2 = {"com/chad/library/adapter/base/diff/BrvahAsyncDiffer$submitList$1$result$1", "androidx/recyclerview/widget/DiffUtil$Callback", "", "oldItemPosition", "newItemPosition", "", "areContentsTheSame", "(II)Z", "areItemsTheSame", "", "getChangePayload", "(II)Ljava/lang/Object;", "getNewListSize", "()I", "getOldListSize", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BrvahAsyncDiffer.kt */
public final class BrvahAsyncDiffer$submitList$1$result$1 extends DiffUtil.Callback {
    public final /* synthetic */ BrvahAsyncDiffer$submitList$1 this$0;

    public BrvahAsyncDiffer$submitList$1$result$1(BrvahAsyncDiffer$submitList$1 brvahAsyncDiffer$submitList$1) {
        this.this$0 = brvahAsyncDiffer$submitList$1;
    }

    public boolean areContentsTheSame(int i, int i2) {
        Object obj = this.this$0.$oldList.get(i);
        Object obj2 = this.this$0.$newList.get(i2);
        if (obj != null && obj2 != null) {
            return this.this$0.this$0.config.getDiffCallback().areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean areItemsTheSame(int i, int i2) {
        Object obj = this.this$0.$oldList.get(i);
        Object obj2 = this.this$0.$newList.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return this.this$0.this$0.config.getDiffCallback().areItemsTheSame(obj, obj2);
    }

    @Nullable
    public Object getChangePayload(int i, int i2) {
        Object obj = this.this$0.$oldList.get(i);
        Object obj2 = this.this$0.$newList.get(i2);
        if (obj != null && obj2 != null) {
            return this.this$0.this$0.config.getDiffCallback().getChangePayload(obj, obj2);
        }
        throw new AssertionError();
    }

    public int getNewListSize() {
        return this.this$0.$newList.size();
    }

    public int getOldListSize() {
        return this.this$0.$oldList.size();
    }
}
