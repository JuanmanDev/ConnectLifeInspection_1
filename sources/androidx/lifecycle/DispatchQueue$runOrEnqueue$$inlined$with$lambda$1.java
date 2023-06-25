package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo47991d2 = {"<anonymous>", "", "run", "androidx/lifecycle/DispatchQueue$runOrEnqueue$1$1"}, mo47992k = 3, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: DispatchQueue.kt */
public final class DispatchQueue$runOrEnqueue$$inlined$with$lambda$1 implements Runnable {
    public final /* synthetic */ Runnable $runnable$inlined;
    public final /* synthetic */ DispatchQueue this$0;

    public DispatchQueue$runOrEnqueue$$inlined$with$lambda$1(DispatchQueue dispatchQueue, Runnable runnable) {
        this.this$0 = dispatchQueue;
        this.$runnable$inlined = runnable;
    }

    public final void run() {
        this.this$0.enqueue(this.$runnable$inlined);
    }
}
