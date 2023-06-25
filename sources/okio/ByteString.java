package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001rB\u0011\b\u0000\u0012\u0006\u0010e\u001a\u00020\u0012¢\u0006\u0004\bp\u0010qJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010#\u001a\u00020\u000bH\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\bJ\u001f\u0010)\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0000H\u0010¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b-\u0010+J!\u0010/\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u000bH\u0017¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u000bH\u0007¢\u0006\u0004\b/\u00101J\u000f\u00104\u001a\u00020\u0012H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u000bH\u0010¢\u0006\u0004\b6\u0010\u001eJ!\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u000bH\u0017¢\u0006\u0004\b8\u00100J!\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u000bH\u0007¢\u0006\u0004\b8\u00101J\u000f\u00109\u001a\u00020\u0000H\u0016¢\u0006\u0004\b9\u0010:J/\u0010>\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010?J/\u0010>\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010@J\u0017\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0000H\u0016¢\u0006\u0004\bF\u0010:J\u000f\u0010G\u001a\u00020\u0000H\u0016¢\u0006\u0004\bG\u0010:J\u000f\u0010H\u001a\u00020\u0000H\u0016¢\u0006\u0004\bH\u0010:J\u000f\u0010J\u001a\u00020\u000bH\u0007¢\u0006\u0004\bI\u0010\"J\u0015\u0010L\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u0012¢\u0006\u0004\bL\u0010\u0016J\u0015\u0010L\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u0000¢\u0006\u0004\bL\u0010\u0017J\u0017\u0010O\u001a\u00020\u00062\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010S\u001a\u00020\u00002\b\b\u0002\u0010Q\u001a\u00020\u000b2\b\b\u0002\u0010R\u001a\u00020\u000bH\u0017¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0000H\u0016¢\u0006\u0004\bU\u0010:J\u000f\u0010V\u001a\u00020\u0000H\u0016¢\u0006\u0004\bV\u0010:J\u000f\u0010W\u001a\u00020\u0012H\u0016¢\u0006\u0004\bW\u00103J\u000f\u0010X\u001a\u00020\u0006H\u0016¢\u0006\u0004\bX\u0010\bJ\u000f\u0010Y\u001a\u00020\u0006H\u0016¢\u0006\u0004\bY\u0010\bJ\u0017\u0010\\\u001a\u00020C2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J'\u0010\\\u001a\u00020C2\u0006\u0010_\u001a\u00020^2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000bH\u0010¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020C2\u0006\u0010[\u001a\u00020bH\u0002¢\u0006\u0004\bc\u0010dR\u001c\u0010e\u001a\u00020\u00128\u0000@\u0000X\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u00103R\"\u0010$\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010h\u001a\u0004\bi\u0010\"\"\u0004\bj\u0010kR\u0013\u0010J\u001a\u00020\u000b8G@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010\"R$\u0010Y\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bY\u0010l\u001a\u0004\bm\u0010\b\"\u0004\bn\u0010o¨\u0006s"}, mo47991d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "Ljava/lang/Comparable;", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "", "base64", "()Ljava/lang/String;", "base64Url", "other", "", "compareTo", "(Lokio/ByteString;)I", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "", "suffix", "", "endsWith", "([B)Z", "(Lokio/ByteString;)Z", "", "equals", "(Ljava/lang/Object;)Z", "index", "", "getByte", "(I)B", "get", "-deprecated_getByte", "getSize$okio", "()I", "getSize", "hashCode", "hex", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "fromIndex", "indexOf", "([BI)I", "(Lokio/ByteString;I)I", "internalArray$okio", "()[B", "internalArray", "pos", "internalGet$okio", "internalGet", "lastIndexOf", "md5", "()Lokio/ByteString;", "offset", "otherOffset", "byteCount", "rangeEquals", "(I[BII)Z", "(ILokio/ByteString;II)Z", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "sha1", "sha256", "sha512", "-deprecated_size", "size", "prefix", "startsWith", "Ljava/nio/charset/Charset;", "charset", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "utf8", "Ljava/io/OutputStream;", "out", "write", "(Ljava/io/OutputStream;)V", "Lokio/Buffer;", "buffer", "write$okio", "(Lokio/Buffer;II)V", "Ljava/io/ObjectOutputStream;", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "data", "[B", "getData$okio", "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "Ljava/lang/String;", "getUtf8$okio", "setUtf8$okio", "(Ljava/lang/String;)V", "<init>", "([B)V", "Companion", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: ByteString.kt */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    @JvmField
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    public static final long serialVersionUID = 1;
    @NotNull
    public final byte[] data;
    public transient int hashCode;
    @Nullable
    public transient String utf8;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00032\n\u0010\u0017\u001a\u00020\u0015\"\u00020\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0018J'\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0012\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001aH\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u001d\u0010#\u001a\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u0003*\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0005J\u001b\u0010$\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010!J\u0013\u0010%\u001a\u00020\u0003*\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010%\u001a\u00020\u0003*\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0014\u0010\u001dR\u0016\u0010&\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, mo47991d2 = {"Lokio/ByteString$Companion;", "", "string", "Lokio/ByteString;", "-deprecated_decodeBase64", "(Ljava/lang/String;)Lokio/ByteString;", "decodeBase64", "-deprecated_decodeHex", "decodeHex", "Ljava/nio/charset/Charset;", "charset", "-deprecated_encodeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "encodeString", "-deprecated_encodeUtf8", "encodeUtf8", "Ljava/nio/ByteBuffer;", "buffer", "-deprecated_of", "(Ljava/nio/ByteBuffer;)Lokio/ByteString;", "of", "", "", "data", "([B)Lokio/ByteString;", "array", "", "offset", "byteCount", "([BII)Lokio/ByteString;", "Ljava/io/InputStream;", "inputstream", "-deprecated_read", "(Ljava/io/InputStream;I)Lokio/ByteString;", "read", "encode", "readByteString", "toByteString", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: ByteString.kt */
    public static final class Companion {
        public Companion() {
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = Charsets.UTF_8;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return companion.mo53085of(bArr, i, i2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @Nullable
        @JvmName(name = "-deprecated_decodeBase64")
        /* renamed from: -deprecated_decodeBase64  reason: not valid java name */
        public final ByteString m28990deprecated_decodeBase64(@NotNull String str) {
            return decodeBase64(str);
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @JvmName(name = "-deprecated_decodeHex")
        /* renamed from: -deprecated_decodeHex  reason: not valid java name */
        public final ByteString m28991deprecated_decodeHex(@NotNull String str) {
            return decodeHex(str);
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @JvmName(name = "-deprecated_encodeString")
        /* renamed from: -deprecated_encodeString  reason: not valid java name */
        public final ByteString m28992deprecated_encodeString(@NotNull String str, @NotNull Charset charset) {
            return encodeString(str, charset);
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @JvmName(name = "-deprecated_encodeUtf8")
        /* renamed from: -deprecated_encodeUtf8  reason: not valid java name */
        public final ByteString m28993deprecated_encodeUtf8(@NotNull String str) {
            return encodeUtf8(str);
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @JvmName(name = "-deprecated_of")
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m28994deprecated_of(@NotNull ByteBuffer byteBuffer) {
            return mo53083of(byteBuffer);
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @JvmName(name = "-deprecated_read")
        /* renamed from: -deprecated_read  reason: not valid java name */
        public final ByteString m28996deprecated_read(@NotNull InputStream inputStream, int i) {
            return read(inputStream, i);
        }

        @JvmStatic
        @Nullable
        public final ByteString decodeBase64(@NotNull String str) {
            byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final ByteString decodeHex(@NotNull String str) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((ByteStringKt.decodeHexDigit(str.charAt(i2)) << 4) + ByteStringKt.decodeHexDigit(str.charAt(i2 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @JvmStatic
        @NotNull
        @JvmName(name = "encodeString")
        public final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @JvmStatic
        @NotNull
        public final ByteString encodeUtf8(@NotNull String str) {
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @JvmStatic
        @NotNull
        @JvmName(name = "of")
        /* renamed from: of */
        public final ByteString mo53083of(@NotNull ByteBuffer byteBuffer) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @JvmStatic
        @NotNull
        @JvmName(name = "read")
        public final ByteString read(@NotNull InputStream inputStream, int i) {
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @JvmName(name = "-deprecated_of")
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m28995deprecated_of(@NotNull byte[] bArr, int i, int i2) {
            return mo53085of(bArr, i, i2);
        }

        @JvmStatic
        @NotNull
        /* renamed from: of */
        public final ByteString mo53084of(@NotNull byte... bArr) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        @JvmStatic
        @NotNull
        @JvmName(name = "of")
        /* renamed from: of */
        public final ByteString mo53085of(@NotNull byte[] bArr, int i, int i2) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2 + i));
        }
    }

    public ByteString(@NotNull byte[] bArr) {
        this.data = bArr;
    }

    @JvmStatic
    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return Companion.decodeBase64(str);
    }

    @JvmStatic
    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return Companion.decodeHex(str);
    }

    @JvmStatic
    @NotNull
    @JvmName(name = "encodeString")
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @JvmStatic
    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @JvmStatic
    @NotNull
    @JvmName(name = "of")
    /* renamed from: of */
    public static final ByteString m26653of(@NotNull ByteBuffer byteBuffer) {
        return Companion.mo53083of(byteBuffer);
    }

    @JvmStatic
    @NotNull
    /* renamed from: of */
    public static final ByteString m26654of(@NotNull byte... bArr) {
        return Companion.mo53084of(bArr);
    }

    @JvmStatic
    @NotNull
    @JvmName(name = "of")
    /* renamed from: of */
    public static final ByteString m26655of(@NotNull byte[] bArr, int i, int i2) {
        return Companion.mo53085of(bArr, i, i2);
    }

    @JvmStatic
    @NotNull
    @JvmName(name = "read")
    public static final ByteString read(@NotNull InputStream inputStream, int i) {
        return Companion.read(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m28988deprecated_getByte(int i) {
        return getByte(i);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m28989deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        Intrinsics.checkExpressionValueIsNotNull(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), (byte[]) null, 1, (Object) null);
    }

    @NotNull
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    @NotNull
    public ByteString digest$okio(@NotNull String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.data);
        Intrinsics.checkExpressionValueIsNotNull(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    public final boolean endsWith(@NotNull ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @JvmName(name = "getByte")
    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    @NotNull
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @Nullable
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode2 = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode2);
        return hashCode2;
    }

    @NotNull
    public String hex() {
        char[] cArr = new char[(getData$okio().length * 2)];
        int i = 0;
        for (byte b : getData$okio()) {
            int i2 = i + 1;
            cArr[i] = ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = ByteStringKt.getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public ByteString hmac$okio(@NotNull String str, @NotNull ByteString byteString) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            Intrinsics.checkExpressionValueIsNotNull(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString byteString) {
        return hmac$okio("HmacSHA1", byteString);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString byteString) {
        return hmac$okio("HmacSHA256", byteString);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString byteString) {
        return hmac$okio("HmacSHA512", byteString);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString byteString, int i) {
        return indexOf(byteString.internalArray$okio(), i);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @NotNull
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString byteString, int i) {
        return lastIndexOf(byteString.internalArray$okio(), i);
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @NotNull
    public ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, @NotNull ByteString byteString, int i2, int i3) {
        return byteString.rangeEquals(i2, getData$okio(), i, i3);
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$okio(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @NotNull
    public ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @NotNull
    public ByteString sha512() {
        return digest$okio("SHA-512");
    }

    @JvmName(name = "size")
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@NotNull ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        return new String(this.data, charset);
    }

    @NotNull
    @JvmOverloads
    public ByteString substring() {
        return substring$default(this, 0, 0, 3, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public ByteString substring(int i) {
        return substring$default(this, i, 0, 2, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public ByteString substring(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 <= getData$okio().length) {
                if (i2 - i < 0) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == getData$okio().length) {
                    return this;
                } else {
                    return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(getData$okio(), i, i2));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public String toString() {
        ByteString byteString;
        boolean z = true;
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = ByteStringKt.codePointIndexToCharIndex(getData$okio(), 64);
        if (access$codePointIndexToCharIndex != -1) {
            String utf82 = utf8();
            if (utf82 != null) {
                String substring = utf82.substring(0, access$codePointIndexToCharIndex);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (access$codePointIndexToCharIndex < utf82.length()) {
                    return "[size=" + getData$okio().length + " text=" + replace$default + "…]";
                }
                return "[text=" + replace$default + ']';
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(getData$okio().length);
            sb.append(" hex=");
            if (64 > getData$okio().length) {
                z = false;
            }
            if (z) {
                if (64 == getData$okio().length) {
                    byteString = this;
                } else {
                    byteString = new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(getData$okio(), 0, 64));
                }
                sb.append(byteString.hex());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
    }

    @NotNull
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = Platform.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(@NotNull OutputStream outputStream) {
        outputStream.write(this.data);
    }

    public void write$okio(@NotNull Buffer buffer, int i, int i2) {
        ByteStringKt.commonWrite(this, buffer, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r7 < r8) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r0 < r1) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
        /*
            r9 = this;
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x000e:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x0026
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0023
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0023:
            if (r7 >= r8) goto L_0x002d
            goto L_0x002b
        L_0x0026:
            if (r0 != r1) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            if (r0 >= r1) goto L_0x002d
        L_0x002b:
            r3 = r5
            goto L_0x002e
        L_0x002d:
            r3 = r6
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(@NotNull byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] bArr, int i) {
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] bArr, int i) {
        for (int min = Math.min(i, getData$okio().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, @NotNull byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Util.arrayRangeEquals(getData$okio(), i, bArr, i2, i3);
    }

    public final boolean startsWith(@NotNull byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }
}
