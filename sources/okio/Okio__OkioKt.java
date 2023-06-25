package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0005\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, mo47991d2 = {"Lokio/Sink;", "blackhole", "()Lokio/Sink;", "blackholeSink", "Lokio/BufferedSink;", "buffer", "(Lokio/Sink;)Lokio/BufferedSink;", "Lokio/Source;", "Lokio/BufferedSource;", "(Lokio/Source;)Lokio/BufferedSource;", "okio"}, mo47992k = 5, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "okio/Okio")
/* compiled from: Okio.kt */
public final /* synthetic */ class Okio__OkioKt {
    @NotNull
    @JvmName(name = "blackhole")
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        return new RealBufferedSource(source);
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        return new RealBufferedSink(sink);
    }
}
