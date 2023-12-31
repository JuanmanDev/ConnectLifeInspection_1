package okhttp3;

import kotlin.Metadata;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo47991d2 = {"okhttp3/RequestBody$Companion$toRequestBody$2", "Lokhttp3/RequestBody;", "", "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    public final /* synthetic */ int $byteCount;
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ int $offset;
    public final /* synthetic */ byte[] $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$2(byte[] bArr, MediaType mediaType, int i, int i2) {
        this.$this_toRequestBody = bArr;
        this.$contentType = mediaType;
        this.$byteCount = i;
        this.$offset = i2;
    }

    public long contentLength() {
        return (long) this.$byteCount;
    }

    @Nullable
    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(@NotNull BufferedSink bufferedSink) {
        bufferedSink.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
    }
}
