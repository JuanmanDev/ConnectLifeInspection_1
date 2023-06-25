package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.p700ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u000f\n\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo47991d2 = {"okhttp3/internal/connection/RealConnection$newWebSocketStreams$1", "okhttp3/internal/ws/RealWebSocket$Streams", "", "close", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: RealConnection.kt */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    public final /* synthetic */ Exchange $exchange;
    public final /* synthetic */ BufferedSink $sink;
    public final /* synthetic */ BufferedSource $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(Exchange exchange, BufferedSource bufferedSource, BufferedSink bufferedSink, boolean z, BufferedSource bufferedSource2, BufferedSink bufferedSink2) {
        super(z, bufferedSource2, bufferedSink2);
        this.$exchange = exchange;
        this.$source = bufferedSource;
        this.$sink = bufferedSink;
    }

    public void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
