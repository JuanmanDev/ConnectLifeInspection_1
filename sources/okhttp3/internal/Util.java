package okhttp3.internal;

import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000Æ\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001e\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00182\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\"\u00028\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001d\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'\u001a&\u0010(\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\b¢\u0006\u0004\b(\u0010)\u001a'\u0010-\u001a\u00020\f\"\u0004\b\u0000\u0010**\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010,\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001c\u00101\u001a\u00020\u0006*\u00020/2\u0006\u00100\u001a\u00020\u0006H\u0004¢\u0006\u0004\b1\u00102\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00062\u0006\u00100\u001a\u00020\u0002H\u0004¢\u0006\u0004\b1\u00103\u001a\u001c\u00101\u001a\u00020\u0006*\u0002042\u0006\u00100\u001a\u00020\u0006H\u0004¢\u0006\u0004\b1\u00105\u001a\u0011\u00108\u001a\u000207*\u000206¢\u0006\u0004\b8\u00109\u001a\u0014\u0010:\u001a\u00020\f*\u00020\u0011H\b¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\f*\u00020\u0011H\b¢\u0006\u0004\b<\u0010;\u001a\u0011\u0010=\u001a\u00020#*\u00020\u0000¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010A\u001a\u00020#*\u00020?2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010D\u001a\u00020\f*\u00020C¢\u0006\u0004\bD\u0010E\u001a\u0011\u0010D\u001a\u00020\f*\u00020F¢\u0006\u0004\bD\u0010G\u001a\u0011\u0010D\u001a\u00020\f*\u00020H¢\u0006\u0004\bD\u0010I\u001a%\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010*\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010J\u001a\u00020\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010Q\u001a\u00020\u0006*\u00020\u00002\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010R\u001a-\u0010Q\u001a\u00020\u0006*\u00020\u00002\u0006\u0010S\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010T\u001a!\u0010X\u001a\u00020#*\u00020U2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0004¢\u0006\u0004\bX\u0010Y\u001a?\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000Z2\u0017\u0010]\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0[¢\u0006\u0002\b\\H\b¢\u0006\u0004\b^\u0010_\u001a7\u0010b\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00000\u00102\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00102\u000e\u0010a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00000`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010e\u001a\u00020\u0002*\u00020d¢\u0006\u0004\be\u0010f\u001a-\u0010g\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010J\u001a\u00020\u00002\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000`¢\u0006\u0004\bg\u0010h\u001a\u0011\u0010i\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bi\u0010j\u001a%\u0010k\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0006¢\u0006\u0004\bk\u0010l\u001a%\u0010m\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0006¢\u0006\u0004\bm\u0010l\u001a\u001b\u0010n\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\u0006¢\u0006\u0004\bn\u0010o\u001a;\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010*\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u000e\u0010a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00000`¢\u0006\u0004\bp\u0010q\u001a\u0019\u0010u\u001a\u00020#*\u00020r2\u0006\u0010t\u001a\u00020s¢\u0006\u0004\bu\u0010v\u001a\u0019\u0010y\u001a\u00020#*\u00020H2\u0006\u0010x\u001a\u00020w¢\u0006\u0004\by\u0010z\u001a\u0014\u0010{\u001a\u00020\f*\u00020\u0011H\b¢\u0006\u0004\b{\u0010;\u001a\u0014\u0010|\u001a\u00020\f*\u00020\u0011H\b¢\u0006\u0004\b|\u0010;\u001a\u0011\u0010}\u001a\u00020\u0006*\u00020M¢\u0006\u0004\b}\u0010~\u001a\u0012\u0010\u001a\u00020\u0000*\u00020H¢\u0006\u0005\b\u0010\u0001\u001a\u001f\u0010\u0001\u001a\u00030\u0001*\u00020w2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0014\u0010\u0001\u001a\u00020\u0006*\u00020w¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u001e\u0010\u0001\u001a\u00020\u0006*\u00030\u00012\u0007\u0010\u0001\u001a\u00020/¢\u0006\u0006\b\u0001\u0010\u0001\u001a#\u0010\u0001\u001a\u00020#*\u00020U2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0004¢\u0006\u0005\b\u0001\u0010Y\u001a\u001c\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u001a*\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u001c\u0010\u0001\u001a\u00030\u0001*\t\u0012\u0005\u0012\u00030\u00010\u001a¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0006¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u001f\u0010\u0001\u001a\u00020\u0000*\u00020?2\t\b\u0002\u0010\u0001\u001a\u00020#¢\u0006\u0006\b\u0001\u0010\u0001\u001a&\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0006\b\u0001\u0010\u0001\u001a<\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001\"\u0005\b\u0000\u0010\u0001\"\u0005\b\u0001\u0010\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u001d\u0010\u0001\u001a\u00020\u0002*\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0002¢\u0006\u0006\b\u0001\u0010 \u0001\u001a\u001e\u0010¡\u0001\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\u0007\u0010\u0001\u001a\u00020\u0006¢\u0006\u0005\b¡\u0001\u0010o\u001a(\u0010¢\u0001\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0006¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u0016\u0010¤\u0001\u001a\u00020\f*\u00020\u0011H\b¢\u0006\u0005\b¤\u0001\u0010;\u001a0\u0010©\u0001\u001a\u00030¨\u0001*\b0¥\u0001j\u0003`¦\u00012\u0013\u0010§\u0001\u001a\u000e\u0012\n\u0012\b0¥\u0001j\u0003`¦\u00010\u001a¢\u0006\u0006\b©\u0001\u0010ª\u0001\u001a\u001e\u0010­\u0001\u001a\u00020\f*\u00030«\u00012\u0007\u0010¬\u0001\u001a\u00020\u0006¢\u0006\u0006\b­\u0001\u0010®\u0001\"\u001a\u0010°\u0001\u001a\u00030¯\u00018\u0006@\u0007X\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001\"\u001a\u0010²\u0001\u001a\u00030\u00018\u0006@\u0007X\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001\"\u001a\u0010µ\u0001\u001a\u00030´\u00018\u0006@\u0007X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001\"\u001a\u0010¸\u0001\u001a\u00030·\u00018\u0006@\u0007X\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001\"\u001a\u0010»\u0001\u001a\u00030º\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001\"\u001a\u0010¾\u0001\u001a\u00030½\u00018\u0006@\u0007X\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001\"\u001a\u0010Á\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001\"\u0019\u0010Ã\u0001\u001a\u00020#8\u0000@\u0001X\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001\"\u0019\u0010Å\u0001\u001a\u00020\u00008\u0000@\u0001X\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001\"\u0019\u0010Ç\u0001\u001a\u00020\u00008\u0006@\u0006XT¢\u0006\b\n\u0006\bÇ\u0001\u0010Æ\u0001¨\u0006È\u0001"}, mo47991d2 = {"", "name", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "arrayLength", "offset", "count", "", "checkOffsetAndCount", "(JJJ)V", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Lkotlin/Function0;)V", "T", "elements", "", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "threadName", "(Ljava/lang/String;Lkotlin/Function0;)V", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "", "mask", "and", "(BI)I", "(IJ)J", "", "(SI)I", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "assertThreadDoesntHoldLock", "(Ljava/lang/Object;)V", "assertThreadHoldsLock", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "Lokhttp3/HttpUrl;", "other", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Ljava/io/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "value", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "", "delimiter", "startIndex", "endIndex", "delimiterOffset", "(Ljava/lang/String;CII)I", "delimiters", "(Ljava/lang/String;Ljava/lang/String;II)I", "Lokio/Source;", "timeout", "timeUnit", "discard", "(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "predicate", "filterList", "(Ljava/lang/Iterable;Lkotlin/Function1;)Ljava/util/List;", "Ljava/util/Comparator;", "comparator", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "Lokio/BufferedSource;", "source", "isHealthy", "(Ljava/net/Socket;Lokio/BufferedSource;)Z", "notify", "notifyAll", "parseHexDigit", "(C)I", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "readMedium", "(Lokio/BufferedSource;)I", "Lokio/Buffer;", "b", "skipAll", "(Lokio/Buffer;B)I", "Lokhttp3/Headers;", "Lokhttp3/internal/http2/Header;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHexString", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "wait", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "Lokio/BufferedSink;", "medium", "writeMedium", "(Lokio/BufferedSink;I)V", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokio/Options;", "UNICODE_BOMS", "Lokio/Options;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@JvmName(name = "Util")
/* compiled from: Util.kt */
public final class Util {
    @NotNull
    @JvmField
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    @NotNull
    @JvmField
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo51739of(new String[0]);
    @NotNull
    @JvmField
    public static final RequestBody EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, EMPTY_BYTE_ARRAY, (MediaType) null, 0, 0, 7, (Object) null);
    @NotNull
    @JvmField
    public static final ResponseBody EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, EMPTY_BYTE_ARRAY, (MediaType) null, 1, (Object) null);
    public static final Options UNICODE_BOMS = Options.Companion.mo53133of(ByteString.Companion.decodeHex("efbbbf"), ByteString.Companion.decodeHex("feff"), ByteString.Companion.decodeHex("fffe"), ByteString.Companion.decodeHex("0000ffff"), ByteString.Companion.decodeHex("ffff0000"));
    @NotNull
    @JvmField
    public static final TimeZone UTC;
    public static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    @JvmField
    public static final boolean assertionsEnabled = OkHttpClient.class.desiredAssertionStatus();
    @NotNull
    @JvmField
    public static final String okHttpName;
    @NotNull
    public static final String userAgent = "okhttp/4.7.2";

    static {
        TimeZone timeZone = TimeZone.getTimeZone(MAPCookie.GMT);
        if (timeZone == null) {
            Intrinsics.throwNpe();
        }
        UTC = timeZone;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final <E> void addIfAbsent(@NotNull List<E> list, E e) {
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull EventListener eventListener) {
        return new Util$asFactory$1(eventListener);
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object obj) {
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object obj) {
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl httpUrl, @NotNull HttpUrl httpUrl2) {
        return Intrinsics.areEqual((Object) httpUrl.host(), (Object) httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && Intrinsics.areEqual((Object) httpUrl.scheme(), (Object) httpUrl2.scheme());
    }

    public static final int checkDuration(@NotNull String str, long j, @Nullable TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] strArr, @NotNull String str) {
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt___ArraysKt.getLastIndex((T[]) strArr2)] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    public static final int delimiterOffset(@NotNull String str, @NotNull String str2, int i, int i2) {
        while (i < i2) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(@NotNull Source source, int i, @NotNull TimeUnit timeUnit) {
        try {
            return skipAll(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        List<T> emptyList = CollectionsKt__CollectionsKt.emptyList();
        for (Object next : iterable) {
            if (function1.invoke(next).booleanValue()) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                if (emptyList != null) {
                    TypeIntrinsics.asMutableList(emptyList).add(next);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
                }
            }
        }
        return emptyList;
    }

    @NotNull
    public static final String format(@NotNull String str, @NotNull Object... objArr) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@NotNull Response response) {
        String str = response.headers().get(HttpHeaders.CONTENT_LENGTH);
        if (str != null) {
            return toLongOrDefault(str, -1);
        }
        return -1;
    }

    public static final void ignoreIoExceptions(@NotNull Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (IOException unused) {
        }
    }

    @NotNull
    @SafeVarargs
    public static final <T> List<T> immutableListOf(@NotNull T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(@NotNull String str, int i) {
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r0, (java.lang.Throwable) null);
        r3.delete(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isCivilized(@org.jetbrains.annotations.NotNull okhttp3.internal.p699io.FileSystem r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
        /*
            okio.Sink r0 = r3.sink(r4)
            r1 = 0
            r3.delete(r4)     // Catch:{  }
            r2 = 1
            kotlin.p639io.CloseableKt.closeFinally(r0, r1)     // Catch:{ IOException -> 0x000f }
            return r2
        L_0x000d:
            r3 = move-exception
            goto L_0x0019
        L_0x000f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x000d }
            kotlin.p639io.CloseableKt.closeFinally(r0, r1)
            r3.delete(r4)
            r3 = 0
            return r3
        L_0x0019:
            throw r3     // Catch:{ all -> 0x001a }
        L_0x001a:
            r4 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.isCivilized(okhttp3.internal.io.FileSystem, java.io.File):boolean");
    }

    public static final boolean isHealthy(@NotNull Socket socket, @NotNull BufferedSource bufferedSource) {
        int soTimeout;
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !bufferedSource.exhausted();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final void notify(@NotNull Object obj) {
        obj.notify();
    }

    public static final void notifyAll(@NotNull Object obj) {
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final String peerName(@NotNull Socket socket) {
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        Intrinsics.checkExpressionValueIsNotNull(hostName, "address.hostName");
        return hostName;
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull BufferedSource bufferedSource, @NotNull Charset charset) {
        int select = bufferedSource.select(UNICODE_BOMS);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.checkExpressionValueIsNotNull(charset2, "UTF_8");
            return charset2;
        } else if (select == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Intrinsics.checkExpressionValueIsNotNull(charset3, "UTF_16BE");
            return charset3;
        } else if (select == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Intrinsics.checkExpressionValueIsNotNull(charset4, "UTF_16LE");
            return charset4;
        } else if (select == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        } else {
            if (select == 4) {
                return Charsets.INSTANCE.UTF32_LE();
            }
            throw new AssertionError();
        }
    }

    @Nullable
    public static final <T> T readFieldOrNull(@NotNull Object obj, @NotNull Class<T> cls, @NotNull String str) {
        Object readFieldOrNull;
        Class<Object> cls2 = Object.class;
        Class cls3 = obj.getClass();
        while (!Intrinsics.areEqual((Object) cls3, (Object) cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                Intrinsics.checkExpressionValueIsNotNull(cls3, "c.superclass");
            }
        }
        if (!(!Intrinsics.areEqual((Object) str, (Object) "delegate")) || (readFieldOrNull = readFieldOrNull(obj, cls2, "delegate")) == null) {
            return null;
        }
        return readFieldOrNull(readFieldOrNull, cls, str);
    }

    public static final int readMedium(@NotNull BufferedSource bufferedSource) {
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean skipAll(@org.jetbrains.annotations.NotNull okio.Source r11, int r12, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r13) {
        /*
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x001d
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L_0x001e
        L_0x001d:
            r5 = r3
        L_0x001e:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        L_0x0034:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0044
            r12.clear()     // Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
            goto L_0x0034
        L_0x0044:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0051
        L_0x0049:
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0076
        L_0x0051:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L_0x0076
        L_0x005a:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0067
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x006f
        L_0x0067:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x006f:
            throw r12
        L_0x0070:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0051
            goto L_0x0049
        L_0x0076:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull String str, boolean z) {
        return new Util$threadFactory$1(str, z);
    }

    public static final void threadName(@NotNull String str, @NotNull Function0<Unit> function0) {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            currentThread.setName(name);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers headers) {
        IntRange until = RangesKt___RangesKt.until(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(next.component1().utf8(), next.component2().utf8());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        Intrinsics.checkExpressionValueIsNotNull(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl httpUrl, boolean z) {
        String str;
        if (StringsKt__StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) RunnerArgs.CLASSPATH_SEPARATOR, false, 2, (Object) null)) {
            str = '[' + httpUrl.host() + ']';
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList(list));
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        if (map.isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String str, int i, int i2) {
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(@NotNull Object obj) {
        obj.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception addSuppressed : list) {
            exc.addSuppressed(addSuppressed);
        }
        return exc;
    }

    public static final void writeMedium(@NotNull BufferedSink bufferedSink, int i) {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public static final int delimiterOffset(@NotNull String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    @NotNull
    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(@NotNull Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket serverSocket) {
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@NotNull Buffer buffer, byte b) {
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }
}
