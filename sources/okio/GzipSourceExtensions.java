package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\b¢\u0006\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00008\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\u00008\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0016\u0010\f\u001a\u00020\u00008\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0016\u0010\r\u001a\u00020\u00008\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\n\"\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, mo47991d2 = {"", "bit", "", "getBit", "(II)Z", "Lokio/Source;", "Lokio/GzipSource;", "gzip", "(Lokio/Source;)Lokio/GzipSource;", "FCOMMENT", "I", "FEXTRA", "FHCRC", "FNAME", "", "SECTION_BODY", "B", "SECTION_DONE", "SECTION_HEADER", "SECTION_TRAILER", "okio"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@JvmName(name = "-GzipSourceExtensions")
/* renamed from: okio.-GzipSourceExtensions  reason: invalid class name */
/* compiled from: GzipSource.kt */
public final class GzipSourceExtensions {
    public static final int FCOMMENT = 4;
    public static final int FEXTRA = 2;
    public static final int FHCRC = 1;
    public static final int FNAME = 3;
    public static final byte SECTION_BODY = 1;
    public static final byte SECTION_DONE = 3;
    public static final byte SECTION_HEADER = 0;
    public static final byte SECTION_TRAILER = 2;

    public static final boolean getBit(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    @NotNull
    public static final GzipSource gzip(@NotNull Source source) {
        return new GzipSource(source);
    }
}
