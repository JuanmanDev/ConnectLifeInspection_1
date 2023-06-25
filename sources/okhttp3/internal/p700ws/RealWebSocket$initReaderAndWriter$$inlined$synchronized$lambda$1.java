package okhttp3.internal.p700ws;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.p700ws.RealWebSocket;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, mo47991d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$schedule$1"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 */
/* compiled from: TaskQueue.kt */
public final class RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 extends Task {
    public final /* synthetic */ WebSocketExtensions $extensions$inlined;
    public final /* synthetic */ String $name;
    public final /* synthetic */ String $name$inlined;
    public final /* synthetic */ long $pingIntervalNanos$inlined;
    public final /* synthetic */ RealWebSocket.Streams $streams$inlined;
    public final /* synthetic */ RealWebSocket this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1(String str, String str2, long j, RealWebSocket realWebSocket, String str3, RealWebSocket.Streams streams, WebSocketExtensions webSocketExtensions) {
        super(str2, false, 2, (DefaultConstructorMarker) null);
        this.$name = str;
        this.$pingIntervalNanos$inlined = j;
        this.this$0 = realWebSocket;
        this.$name$inlined = str3;
        this.$streams$inlined = streams;
        this.$extensions$inlined = webSocketExtensions;
    }

    public long runOnce() {
        this.this$0.writePingFrame$okhttp();
        return this.$pingIntervalNanos$inlined;
    }
}
