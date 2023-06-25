package okhttp3.internal.p700ws;

import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0016\u0010\u0001\u001a\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo47991d2 = {"Lokio/ByteString;", "EMPTY_DEFLATE_BLOCK", "Lokio/ByteString;", "", "LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION", "I", "okhttp"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: okhttp3.internal.ws.MessageDeflaterKt */
/* compiled from: MessageDeflater.kt */
public final class MessageDeflaterKt {
    public static final ByteString EMPTY_DEFLATE_BLOCK = ByteString.Companion.decodeHex("000000ffff");
    public static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;
}
