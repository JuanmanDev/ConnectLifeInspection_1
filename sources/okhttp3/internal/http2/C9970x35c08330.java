package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, mo47991d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 */
/* compiled from: TaskQueue.kt */
public final class C9970x35c08330 extends Task {
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ boolean $clearPrevious$inlined;
    public final /* synthetic */ Ref.LongRef $delta$inlined;
    public final /* synthetic */ String $name;
    public final /* synthetic */ Ref.ObjectRef $newPeerSettings$inlined;
    public final /* synthetic */ Settings $settings$inlined;
    public final /* synthetic */ Ref.ObjectRef $streamsToNotify$inlined;
    public final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9970x35c08330(String str, boolean z, String str2, boolean z2, Http2Connection.ReaderRunnable readerRunnable, boolean z3, Ref.ObjectRef objectRef, Settings settings, Ref.LongRef longRef, Ref.ObjectRef objectRef2) {
        super(str2, z2);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = readerRunnable;
        this.$clearPrevious$inlined = z3;
        this.$newPeerSettings$inlined = objectRef;
        this.$settings$inlined = settings;
        this.$delta$inlined = longRef;
        this.$streamsToNotify$inlined = objectRef2;
    }

    public long runOnce() {
        Http2Connection.this.getListener$okhttp().onSettings(Http2Connection.this, (Settings) this.$newPeerSettings$inlined.element);
        return -1;
    }
}
