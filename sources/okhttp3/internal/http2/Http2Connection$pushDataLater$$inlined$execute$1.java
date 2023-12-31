package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;
import okio.Buffer;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, mo47991d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "", "runOnce", "()J", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: TaskQueue.kt */
public final class Http2Connection$pushDataLater$$inlined$execute$1 extends Task {
    public final /* synthetic */ Buffer $buffer$inlined;
    public final /* synthetic */ int $byteCount$inlined;
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ boolean $inFinished$inlined;
    public final /* synthetic */ String $name;
    public final /* synthetic */ int $streamId$inlined;
    public final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushDataLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, Buffer buffer, int i2, boolean z3) {
        super(str2, z2);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$buffer$inlined = buffer;
        this.$byteCount$inlined = i2;
        this.$inFinished$inlined = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long runOnce() {
        /*
            r5 = this;
            okhttp3.internal.http2.Http2Connection r0 = r5.this$0     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.PushObserver r0 = r0.pushObserver     // Catch:{ IOException -> 0x003e }
            int r1 = r5.$streamId$inlined     // Catch:{ IOException -> 0x003e }
            okio.Buffer r2 = r5.$buffer$inlined     // Catch:{ IOException -> 0x003e }
            int r3 = r5.$byteCount$inlined     // Catch:{ IOException -> 0x003e }
            boolean r4 = r5.$inFinished$inlined     // Catch:{ IOException -> 0x003e }
            boolean r0 = r0.onData(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
            if (r0 == 0) goto L_0x0021
            okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.Http2Writer r1 = r1.getWriter()     // Catch:{ IOException -> 0x003e }
            int r2 = r5.$streamId$inlined     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x003e }
            r1.rstStream(r2, r3)     // Catch:{ IOException -> 0x003e }
        L_0x0021:
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5.$inFinished$inlined     // Catch:{ IOException -> 0x003e }
            if (r0 == 0) goto L_0x003e
        L_0x0027:
            okhttp3.internal.http2.Http2Connection r0 = r5.this$0     // Catch:{ IOException -> 0x003e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.Http2Connection r1 = r5.this$0     // Catch:{ all -> 0x003b }
            java.util.Set r1 = r1.currentPushRequests     // Catch:{ all -> 0x003b }
            int r2 = r5.$streamId$inlined     // Catch:{ all -> 0x003b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
            r1.remove(r2)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
            goto L_0x003e
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
            throw r1     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$1.runOnce():long");
    }
}
