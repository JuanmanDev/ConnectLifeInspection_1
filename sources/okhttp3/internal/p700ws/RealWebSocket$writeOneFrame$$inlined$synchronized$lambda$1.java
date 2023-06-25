package okhttp3.internal.p700ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.concurrent.Task;
import okio.ByteString;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, mo47991d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 */
/* compiled from: TaskQueue.kt */
public final class RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 extends Task {
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ Ref.ObjectRef $messageOrClose$inlined;
    public final /* synthetic */ String $name;
    public final /* synthetic */ ByteString $pong$inlined;
    public final /* synthetic */ Ref.ObjectRef $readerToClose$inlined;
    public final /* synthetic */ Ref.IntRef $receivedCloseCode$inlined;
    public final /* synthetic */ Ref.ObjectRef $receivedCloseReason$inlined;
    public final /* synthetic */ Ref.ObjectRef $streamsToClose$inlined;
    public final /* synthetic */ WebSocketWriter $writer$inlined;
    public final /* synthetic */ Ref.ObjectRef $writerToClose$inlined;
    public final /* synthetic */ RealWebSocket this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1(String str, boolean z, String str2, boolean z2, RealWebSocket realWebSocket, WebSocketWriter webSocketWriter, ByteString byteString, Ref.ObjectRef objectRef, Ref.IntRef intRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.ObjectRef objectRef5) {
        super(str2, z2);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = realWebSocket;
        this.$writer$inlined = webSocketWriter;
        this.$pong$inlined = byteString;
        this.$messageOrClose$inlined = objectRef;
        this.$receivedCloseCode$inlined = intRef;
        this.$receivedCloseReason$inlined = objectRef2;
        this.$streamsToClose$inlined = objectRef3;
        this.$readerToClose$inlined = objectRef4;
        this.$writerToClose$inlined = objectRef5;
    }

    public long runOnce() {
        this.this$0.cancel();
        return -1;
    }
}
