package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo47991d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: TaskQueue.kt */
public final class TaskQueue$execute$1 extends Task {
    public final /* synthetic */ Function0 $block;
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(Function0 function0, String str, boolean z, String str2, boolean z2) {
        super(str2, z2);
        this.$block = function0;
        this.$name = str;
        this.$cancelable = z;
    }

    public long runOnce() {
        this.$block.invoke();
        return -1;
    }
}
