package okhttp3.internal.http2;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u0000:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo47991d2 = {"Lokhttp3/internal/http2/Hpack;", "Lokio/ByteString;", "name", "checkLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "", "", "nameToFirstIndex", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "PREFIX_4_BITS", "I", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "<init>", "()V", "Reader", "Writer", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Hpack.kt */
public final class Hpack {
    public static final Hpack INSTANCE;
    @NotNull
    public static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    public static final int PREFIX_4_BITS = 15;
    public static final int PREFIX_5_BITS = 31;
    public static final int PREFIX_6_BITS = 63;
    public static final int PREFIX_7_BITS = 127;
    public static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    public static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    @NotNull
    public static final Header[] STATIC_HEADER_TABLE = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, (String) ShareTarget.METHOD_GET), new Header(Header.TARGET_METHOD, (String) ShareTarget.METHOD_POST), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header((String) Http2ExchangeCodec.HOST, ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header((String) Http2ExchangeCodec.TRANSFER_ENCODING, ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int length = STATIC_HEADER_TABLE.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(STATIC_HEADER_TABLE[i].name)) {
                linkedHashMap.put(STATIC_HEADER_TABLE[i].name, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    @NotNull
    public final ByteString checkLowercase(@NotNull ByteString byteString) {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte b3 = byteString.getByte(i);
            if (b <= b3 && b2 >= b3) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    @NotNull
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000B#\b\u0007\u0012\u0006\u00105\u001a\u000207\u0012\u0006\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u000f\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0001H\u0002¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b(\u0010\u0003R\u001e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0)8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\f0/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, mo47991d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "", "index", "dynamicTableIndex", "(I)I", "bytesToRecover", "evictToRecoverBytes", "", "Lokhttp3/internal/http2/Header;", "getAndResetHeaderList", "()Ljava/util/List;", "Lokio/ByteString;", "getName", "(I)Lokio/ByteString;", "entry", "insertIntoDynamicTable", "(ILokhttp3/internal/http2/Header;)V", "", "isStaticHeader", "(I)Z", "maxDynamicTableByteCount", "()I", "readByte", "readByteString", "()Lokio/ByteString;", "readHeaders", "readIndexedHeader", "(I)V", "firstByte", "prefixMask", "readInt", "(II)I", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "I", "headerCount", "", "headerList", "Ljava/util/List;", "headerTableSizeSetting", "nextHeaderIndex", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "Lokio/Source;", "<init>", "(Lokio/Source;II)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Hpack.kt */
    public static final class Reader {
        @NotNull
        @JvmField
        public Header[] dynamicTable;
        @JvmField
        public int dynamicTableByteCount;
        @JvmField
        public int headerCount;
        public final List<Header> headerList;
        public final int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        public int nextHeaderIndex;
        public final BufferedSource source;

        @JvmOverloads
        public Reader(@NotNull Source source2, int i) {
            this(source2, i, 0, 4, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Reader(@NotNull Source source2, int i, int i2) {
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = Okio.buffer(source2);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            ArraysKt___ArraysJvmKt.fill$default((Object[]) this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        int i3 = this.nextHeaderIndex;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i2, this.headerCount);
                        this.nextHeaderIndex += i2;
                    } else {
                        Header header = this.dynamicTable[length];
                        if (header == null) {
                            Intrinsics.throwNpe();
                        }
                        int i4 = header.hpackSize;
                        i -= i4;
                        this.dynamicTableByteCount -= i4;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr2 = this.dynamicTable;
                int i32 = this.nextHeaderIndex;
                System.arraycopy(headerArr2, i32 + 1, headerArr2, i32 + 1 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final ByteString getName(int i) {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    if (header == null) {
                        Intrinsics.throwNpe();
                    }
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                if (header2 == null) {
                    Intrinsics.throwNpe();
                }
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    if (header == null) {
                        Intrinsics.throwNpe();
                    }
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        @NotNull
        public final List<Header> getAndResetHeaderList() {
            List<Header> list = CollectionsKt___CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @NotNull
        public final ByteString readByteString() {
            int readByte = readByte();
            boolean z = (readByte & 128) == 128;
            long readInt = (long) readInt(readByte, 127);
            if (!z) {
                return this.source.readByteString(readInt);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(this.source, readInt, buffer);
            return buffer.readByteString();
        }

        public final void readHeaders() {
            while (!this.source.exhausted()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                } else if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reader(Source source2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(source2, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000B%\b\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010&\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010,\u001a\u00020\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010$¨\u0006/"}, mo47991d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "(I)I", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(Lokhttp3/internal/http2/Header;)V", "headerTableSizeSetting", "resizeHeaderTable", "(I)V", "Lokio/ByteString;", "data", "writeByteString", "(Lokio/ByteString;)V", "", "headerBlock", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "I", "", "emitDynamicTableSizeUpdate", "Z", "headerCount", "maxDynamicTableByteCount", "nextHeaderIndex", "Lokio/Buffer;", "out", "Lokio/Buffer;", "smallestHeaderTableSizeSetting", "useCompression", "<init>", "(IZLokio/Buffer;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Hpack.kt */
    public static final class Writer {
        @NotNull
        @JvmField
        public Header[] dynamicTable;
        @JvmField
        public int dynamicTableByteCount;
        public boolean emitDynamicTableSizeUpdate;
        @JvmField
        public int headerCount;
        @JvmField
        public int headerTableSizeSetting;
        @JvmField
        public int maxDynamicTableByteCount;
        public int nextHeaderIndex;
        public final Buffer out;
        public int smallestHeaderTableSizeSetting;
        public final boolean useCompression;

        @JvmOverloads
        public Writer(int i, @NotNull Buffer buffer) {
            this(i, false, buffer, 2, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public Writer(int i, boolean z, @NotNull Buffer buffer) {
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = buffer;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        @JvmOverloads
        public Writer(@NotNull Buffer buffer) {
            this(0, false, buffer, 3, (DefaultConstructorMarker) null);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            ArraysKt___ArraysJvmKt.fill$default((Object[]) this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        int i3 = this.nextHeaderIndex;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i2, this.headerCount);
                        Header[] headerArr2 = this.dynamicTable;
                        int i4 = this.nextHeaderIndex;
                        Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                        this.nextHeaderIndex += i2;
                    } else {
                        Header header = this.dynamicTable[length];
                        if (header == null) {
                            Intrinsics.throwNpe();
                        }
                        i -= header.hpackSize;
                        int i5 = this.dynamicTableByteCount;
                        Header header2 = this.dynamicTable[length];
                        if (header2 == null) {
                            Intrinsics.throwNpe();
                        }
                        this.dynamicTableByteCount = i5 - header2.hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr3 = this.dynamicTable;
                int i32 = this.nextHeaderIndex;
                System.arraycopy(headerArr3, i32 + 1, headerArr3, i32 + 1 + i2, this.headerCount);
                Header[] headerArr22 = this.dynamicTable;
                int i42 = this.nextHeaderIndex;
                Arrays.fill(headerArr22, i42 + 1, i42 + 1 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != min) {
                if (min < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        public final void writeByteString(@NotNull ByteString byteString) {
            if (!this.useCompression || Huffman.INSTANCE.encodedLength(byteString) >= byteString.size()) {
                writeInt(byteString.size(), 127, 0);
                this.out.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.encode(byteString, buffer);
            ByteString readByteString = buffer.readByteString();
            writeInt(readByteString.size(), 127, 128);
            this.out.write(readByteString);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r14) {
            /*
                r13 = this;
                boolean r0 = r13.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r13.smallestHeaderTableSizeSetting
                int r2 = r13.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r13.writeInt(r0, r4, r3)
            L_0x0012:
                r13.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.smallestHeaderTableSizeSetting = r0
                int r0 = r13.maxDynamicTableByteCount
                r13.writeInt(r0, r4, r3)
            L_0x001e:
                int r0 = r14.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x010e
                java.lang.Object r3 = r14.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                okio.ByteString r4 = r3.name
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.value
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r6 = r6.getNAME_TO_FIRST_INDEX()
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x007b
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x004d
                goto L_0x0078
            L_0x004d:
                if (r8 < r6) goto L_0x0078
                okhttp3.internal.http2.Hpack r8 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r8 = r8.getSTATIC_HEADER_TABLE()
                int r9 = r6 + -1
                r8 = r8[r9]
                okio.ByteString r8 = r8.value
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r5)
                if (r8 == 0) goto L_0x0062
                goto L_0x007c
            L_0x0062:
                okhttp3.internal.http2.Hpack r8 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r8 = r8.getSTATIC_HEADER_TABLE()
                r8 = r8[r6]
                okio.ByteString r8 = r8.value
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r5)
                if (r8 == 0) goto L_0x0078
                int r8 = r6 + 1
                r12 = r8
                r8 = r6
                r6 = r12
                goto L_0x007d
            L_0x0078:
                r8 = r6
                r6 = r7
                goto L_0x007d
            L_0x007b:
                r6 = r7
            L_0x007c:
                r8 = r6
            L_0x007d:
                if (r6 != r7) goto L_0x00c7
                int r9 = r13.nextHeaderIndex
                int r9 = r9 + 1
                okhttp3.internal.http2.Header[] r10 = r13.dynamicTable
                int r10 = r10.length
            L_0x0086:
                if (r9 >= r10) goto L_0x00c7
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r9]
                if (r11 != 0) goto L_0x0091
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0091:
                okio.ByteString r11 = r11.name
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r4)
                if (r11 == 0) goto L_0x00c4
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r9]
                if (r11 != 0) goto L_0x00a2
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00a2:
                okio.ByteString r11 = r11.value
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r5)
                if (r11 == 0) goto L_0x00b6
                int r6 = r13.nextHeaderIndex
                int r9 = r9 - r6
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r6 = r6.getSTATIC_HEADER_TABLE()
                int r6 = r6.length
                int r6 = r6 + r9
                goto L_0x00c7
            L_0x00b6:
                if (r8 != r7) goto L_0x00c4
                int r8 = r13.nextHeaderIndex
                int r8 = r9 - r8
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r11 = r11.getSTATIC_HEADER_TABLE()
                int r11 = r11.length
                int r8 = r8 + r11
            L_0x00c4:
                int r9 = r9 + 1
                goto L_0x0086
            L_0x00c7:
                if (r6 == r7) goto L_0x00d1
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.writeInt(r6, r3, r4)
                goto L_0x010a
            L_0x00d1:
                r6 = 64
                if (r8 != r7) goto L_0x00e4
                okio.Buffer r7 = r13.out
                r7.writeByte((int) r6)
                r13.writeByteString(r4)
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
                goto L_0x010a
            L_0x00e4:
                okio.ByteString r7 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r7 = r4.startsWith((okio.ByteString) r7)
                if (r7 == 0) goto L_0x00ff
                okio.ByteString r7 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00ff
                r3 = 15
                r13.writeInt(r8, r3, r1)
                r13.writeByteString(r5)
                goto L_0x010a
            L_0x00ff:
                r4 = 63
                r13.writeInt(r8, r4, r6)
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
            L_0x010a:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x010e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.writeByte(i | i3);
                return;
            }
            this.out.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.writeByte(i4);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Writer(int i, boolean z, Buffer buffer, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }
    }
}
