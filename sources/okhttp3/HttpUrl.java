package okhttp3;

import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 W:\u0002XWBc\b\u0000\u0012\u0006\u0010?\u001a\u00020\u0001\u0012\u0006\u0010M\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010)\u001a\u00020\u0018\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0010\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010F\u001a\u00020\u0001¢\u0006\u0004\bU\u0010VJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0003J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010!J\u000f\u0010#\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010\u0003J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b$\u0010\u000bJ\u000f\u0010'\u001a\u00020\u0018H\u0007¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010)\u001a\u00020\u0018H\u0007¢\u0006\u0004\b(\u0010\u001aJ\u0011\u0010+\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010-\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0018¢\u0006\u0004\b0\u00101J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u000102H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010/\u001a\u00020\u0018¢\u0006\u0004\b6\u00101J\u001d\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010,\u001a\u00020\u0001¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u00020\u0018H\u0007¢\u0006\u0004\b9\u0010\u001aJ\r\u0010;\u001a\u00020\u0001¢\u0006\u0004\b;\u0010\u0003J\u0017\u0010<\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020\u0001H\u0007¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010@\u001a\u00020\u0001H\u0016¢\u0006\u0004\b@\u0010\u0003J\u000f\u0010D\u001a\u00020AH\u0007¢\u0006\u0004\bB\u0010CJ\u000f\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bJ\u0010CJ\u000f\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bK\u0010GJ\u000f\u0010M\u001a\u00020\u0001H\u0007¢\u0006\u0004\bL\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003R\u0013\u0010\u0006\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003R\u0013\u0010\b\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0003R\u0013\u0010\u0010\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\b\u0017\u0010\u0003R\u0019\u0010\u001c\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\b\u001c\u0010\u0003R\u0019\u0010O\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u0019\u0010#\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b#\u0010N\u001a\u0004\b#\u0010\u0003R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0007@\u0006¢\u0006\f\n\u0004\b%\u0010R\u001a\u0004\b%\u0010\u000bR\u0013\u0010'\u001a\u00020\u00188G@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0019\u0010)\u001a\u00020\u00188\u0007@\u0006¢\u0006\f\n\u0004\b)\u0010S\u001a\u0004\b)\u0010\u001aR\u0015\u0010+\u001a\u0004\u0018\u00010\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010\u0003R \u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u0019\u00105\u001a\b\u0012\u0004\u0012\u00020\u0001028G@\u0006¢\u0006\u0006\u001a\u0004\b5\u00104R\u0013\u0010:\u001a\u00020\u00188G@\u0006¢\u0006\u0006\u001a\u0004\b:\u0010\u001aR\u0019\u0010?\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b?\u0010N\u001a\u0004\b?\u0010\u0003R\u0016\u0010F\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010NR\u0019\u0010M\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010\u0003¨\u0006Y"}, mo47991d2 = {"Lokhttp3/HttpUrl;", "", "-deprecated_encodedFragment", "()Ljava/lang/String;", "encodedFragment", "-deprecated_encodedPassword", "encodedPassword", "-deprecated_encodedPath", "encodedPath", "", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_encodedUsername", "encodedUsername", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "-deprecated_fragment", "fragment", "", "hashCode", "()I", "-deprecated_host", "host", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "link", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "-deprecated_password", "password", "-deprecated_pathSegments", "pathSegments", "-deprecated_pathSize", "pathSize", "-deprecated_port", "port", "-deprecated_query", "query", "name", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", "index", "queryParameterName", "(I)Ljava/lang/String;", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "queryParameterValue", "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", "-deprecated_querySize", "querySize", "redact", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "-deprecated_scheme", "scheme", "toString", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "toUri", "Ljava/net/URL;", "url", "()Ljava/net/URL;", "toUrl", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "username", "Ljava/lang/String;", "isHttps", "Z", "()Z", "Ljava/util/List;", "I", "queryNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: HttpUrl.kt */
public final class HttpUrl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @Nullable
    public final String fragment;
    @NotNull
    public final String host;
    public final boolean isHttps;
    @NotNull
    public final String password;
    @NotNull
    public final List<String> pathSegments;
    public final int port;
    public final List<String> queryNamesAndValues;
    @NotNull
    public final String scheme;
    public final String url;
    @NotNull
    public final String username;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0010!\n\u0002\b\u0014\u0018\u0000 d:\u0001dB\u0007¢\u0006\u0004\bc\u0010-J\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u0004J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u0004J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010\u0004J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0001H\u0002¢\u0006\u0004\b%\u0010$J!\u0010)\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u0001H\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0001¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0018¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b5\u0010\u0004J\u000f\u00108\u001a\u00020\u0000H\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020+2\u0006\u00109\u001a\u00020\u0001H\u0002¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b<\u0010\u0004J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b=\u0010\u0004J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0018¢\u0006\u0004\b?\u0010/J'\u0010A\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0018H\u0002¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0001¢\u0006\u0004\bC\u0010\u0004J\u001d\u0010D\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bF\u0010\nJ\u001d\u0010G\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\bG\u0010EJ\u001f\u0010H\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010\nJ\u000f\u0010I\u001a\u00020\u0001H\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0001¢\u0006\u0004\bK\u0010\u0004R$\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010L\u001a\u0004\bM\u0010J\"\u0004\bN\u0010;R\"\u0010\u001c\u001a\u00020\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010L\u001a\u0004\bO\u0010J\"\u0004\bP\u0010;R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010Q8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bS\u0010TR,\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010Q8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bU\u0010R\u001a\u0004\bV\u0010T\"\u0004\bW\u0010XR\"\u0010\u001f\u001a\u00020\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010L\u001a\u0004\bY\u0010J\"\u0004\bZ\u0010;R$\u0010!\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010L\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010;R\"\u0010.\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010]\u001a\u0004\b^\u0010\u001a\"\u0004\b_\u0010`R$\u0010C\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bC\u0010L\u001a\u0004\ba\u0010J\"\u0004\bb\u0010;¨\u0006e"}, mo47991d2 = {"Lokhttp3/HttpUrl$Builder;", "", "encodedPathSegment", "addEncodedPathSegment", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedPathSegments", "addEncodedPathSegments", "encodedName", "encodedValue", "addEncodedQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "", "alreadyEncoded", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "name", "value", "addQueryParameter", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "", "effectivePort", "()I", "encodedFragment", "encodedPassword", "encodedPath", "encodedQuery", "encodedUsername", "fragment", "host", "input", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "password", "", "pop", "()V", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pos", "limit", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "query", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "canonicalName", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "index", "removePathSegment", "startPos", "resolvePath", "(Ljava/lang/String;II)V", "scheme", "setEncodedPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", "()Ljava/lang/String;", "username", "Ljava/lang/String;", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "getScheme$okhttp", "setScheme$okhttp", "<init>", "Companion", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: HttpUrl.kt */
    public static final class Builder {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";
        @Nullable
        public String encodedFragment;
        @NotNull
        public String encodedPassword = "";
        @NotNull
        public final List<String> encodedPathSegments;
        @Nullable
        public List<String> encodedQueryNamesAndValues;
        @NotNull
        public String encodedUsername = "";
        @Nullable
        public String host;
        public int port = -1;
        @Nullable
        public String scheme;

        @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0007J#\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo47991d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "input", "", "pos", "limit", "parsePort", "(Ljava/lang/String;II)I", "portColonOffset", "schemeDelimiterOffset", "slashCount", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
        /* compiled from: HttpUrl.kt */
        public static final class Companion {
            public Companion() {
            }

            /* access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) == ']');
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int slashCount(@NotNull String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return Intrinsics.areEqual((Object) str, (Object) MAPCookie.DOT) || StringsKt__StringsJVMKt.equals(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) "..") || StringsKt__StringsJVMKt.equals(str, "%2e.", true) || StringsKt__StringsJVMKt.equals(str, ".%2e", true) || StringsKt__StringsJVMKt.equals(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            IntProgression step = RangesKt___RangesKt.step(RangesKt___RangesKt.downTo(list.size() - 2, 0), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                if (Intrinsics.areEqual((Object) str, (Object) list2.get(first))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    if (list3 == null) {
                        Intrinsics.throwNpe();
                    }
                    list3.remove(first + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    if (list4 == null) {
                        Intrinsics.throwNpe();
                    }
                    list4.remove(first);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    if (list5 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (first != last) {
                    first += step2;
                } else {
                    return;
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r11, (java.lang.String) r12, (int) r6, (int) r13)
                if (r12 >= r13) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String str) {
            push(str, 0, str.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String str) {
            return addPathSegments(str, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null) : null);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String str) {
            push(str, 0, str.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String str) {
            return addPathSegments(str, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String str, @Nullable String str2) {
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str != null) {
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedUsername, 0, 0, false, 7, (Object) null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedPassword, 0, 0, false, 7, (Object) null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (String percentDecode$okhttp$default3 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, percentDecode$okhttp$default3, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    String str3 = null;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (String str4 : list2) {
                            arrayList3.add(str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, true, 3, (Object) null) : null);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.encodedFragment;
                    if (str5 != null) {
                        str3 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, false, 7, (Object) null);
                    }
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str3, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, (Charset) null, 179, (Object) null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String str) {
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String str) {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, (Object) null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.Companion, r13, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (java.nio.charset.Charset) null, 211, (java.lang.Object) null);
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.HttpUrl.Builder encodedQuery(@org.jetbrains.annotations.Nullable java.lang.String r13) {
            /*
                r12 = this;
                if (r13 == 0) goto L_0x001e
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 == 0) goto L_0x001e
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.util.List r13 = r0.toQueryNamesAndValues$okhttp(r13)
                goto L_0x001f
            L_0x001e:
                r13 = 0
            L_0x001f:
                r12.encodedQueryNamesAndValues = r13
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String str) {
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null) : null;
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String str) {
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, (Object) null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String str) {
            int i;
            int delimiterOffset;
            int i2;
            String str2;
            String str3;
            int i3;
            boolean z;
            int i4;
            boolean z2;
            boolean z3;
            String str4 = str;
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, (Object) null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, indexOfFirstNonAsciiWhitespace$default, 0, 2, (Object) null);
            int access$schemeDelimiterOffset = Companion.schemeDelimiterOffset(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            boolean z4 = true;
            if (access$schemeDelimiterOffset != -1) {
                if (StringsKt__StringsJVMKt.startsWith(str4, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (StringsKt__StringsJVMKt.startsWith(str4, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, access$schemeDelimiterOffset);
                    Intrinsics.checkExpressionValueIsNotNull(substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int access$slashCount = Companion.slashCount(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = RunnerArgs.METHOD_SEPARATOR;
            if (access$slashCount >= 2 || httpUrl == null || (!Intrinsics.areEqual((Object) httpUrl.scheme(), (Object) this.scheme))) {
                int i5 = indexOfFirstNonAsciiWhitespace$default + access$slashCount;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str4, "@/\\?#", i5, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str4.charAt(delimiterOffset) : c;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        boolean z7 = z4;
                        String str6 = str5;
                        i = indexOfLastNonAsciiWhitespace$default;
                        int i6 = delimiterOffset;
                        int access$portColonOffset = Companion.portColonOffset(str4, i5, i6);
                        int i7 = access$portColonOffset + 1;
                    } else {
                        if (charAt != '@') {
                            z = z4;
                            str3 = str5;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                        } else {
                            if (!z5) {
                                int delimiterOffset2 = Util.delimiterOffset(str4, ':', i5, delimiterOffset);
                                String str7 = "%40";
                                int i8 = delimiterOffset;
                                int i9 = delimiterOffset2;
                                z = z4;
                                i3 = indexOfLastNonAsciiWhitespace$default;
                                String str8 = str5;
                                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z6) {
                                    canonicalize$okhttp$default = this.encodedUsername + str7 + canonicalize$okhttp$default;
                                }
                                this.encodedUsername = canonicalize$okhttp$default;
                                int i10 = i8;
                                int i11 = i9;
                                if (i11 != i10) {
                                    this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z3 = z;
                                } else {
                                    z3 = z5;
                                }
                                z5 = z3;
                                str3 = str8;
                                z2 = z;
                                i4 = i10;
                            } else {
                                z = z4;
                                i3 = indexOfLastNonAsciiWhitespace$default;
                                String str9 = str5;
                                int i12 = delimiterOffset;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.encodedPassword);
                                sb2.append("%40");
                                StringBuilder sb3 = sb2;
                                str3 = str9;
                                i4 = i12;
                                sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.encodedPassword = sb3.toString();
                                z2 = z6;
                            }
                            i5 = i4 + 1;
                            z6 = z2;
                        }
                        z4 = z;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        str5 = str3;
                        c3 = RunnerArgs.METHOD_SEPARATOR;
                        c2 = '?';
                        c = 65535;
                    }
                }
                boolean z72 = z4;
                String str62 = str5;
                i = indexOfLastNonAsciiWhitespace$default;
                int i62 = delimiterOffset;
                int access$portColonOffset2 = Companion.portColonOffset(str4, i5, i62);
                int i72 = access$portColonOffset2 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, access$portColonOffset2, false, 4, (Object) null));
                    int access$parsePort = Companion.parsePort(str4, i72, i62);
                    this.port = access$parsePort;
                    if (access$parsePort != -1 ? z72 : false) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        Intrinsics.checkExpressionValueIsNotNull(substring2, str62);
                        sb4.append(substring2);
                        sb4.append(Typography.quote);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i2, access$portColonOffset2, false, 4, (Object) null));
                    Companion companion = HttpUrl.Companion;
                    String str10 = this.scheme;
                    if (str10 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.port = companion.defaultPort(str10);
                }
                if (this.host != null ? z72 : false) {
                    indexOfFirstNonAsciiWhitespace$default = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, access$portColonOffset2);
                    Intrinsics.checkExpressionValueIsNotNull(substring3, str2);
                    sb5.append(substring3);
                    sb5.append(Typography.quote);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str4.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i13 = i;
            int delimiterOffset3 = Util.delimiterOffset(str4, "?#", indexOfFirstNonAsciiWhitespace$default, i13);
            resolvePath(str4, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str4, (char) RunnerArgs.METHOD_SEPARATOR, delimiterOffset3, i13);
                Companion companion2 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion2.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 208, (Object) null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i13, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String str) {
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        @NotNull
        public final Builder port(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.Companion, r13, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, false, false, true, false, (java.nio.charset.Charset) null, 219, (java.lang.Object) null);
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.HttpUrl.Builder query(@org.jetbrains.annotations.Nullable java.lang.String r13) {
            /*
                r12 = this;
                if (r13 == 0) goto L_0x001e
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r1 = r13
                java.lang.String r13 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 == 0) goto L_0x001e
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.util.List r13 = r0.toQueryNamesAndValues$okhttp(r13)
                goto L_0x001f
            L_0x001e:
                r13 = 0
            L_0x001f:
                r12.encodedQueryNamesAndValues = r13
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            String str2 = null;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace((CharSequence) str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    list2.set(i2, str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.encodedFragment;
            if (str4 != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.encodedFragment = str2;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String str) {
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String str) {
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String str) {
            if (StringsKt__StringsJVMKt.equals(str, "http", true)) {
                this.scheme = "http";
            } else if (StringsKt__StringsJVMKt.equals(str, "https", true)) {
                this.scheme = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i, @NotNull String str) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, (Charset) null, 243, (Object) null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i, @NotNull String str) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, (Charset) null, 251, (Object) null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String str, @Nullable String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r6.encodedPassword.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
            if (r1 != r3.defaultPort(r2)) goto L_0x0097;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0023
                r1 = r2
                goto L_0x0024
            L_0x0023:
                r1 = r3
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r2
                goto L_0x0033
            L_0x0032:
                r1 = r3
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r2 = r3
            L_0x0044:
                if (r2 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L_0x0079
                if (r1 != 0) goto L_0x005c
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x005c:
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r1, (char) r4, (boolean) r3, (int) r2, (java.lang.Object) r5)
                if (r1 == 0) goto L_0x0074
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0079
            L_0x0074:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L_0x0079:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L_0x0082
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L_0x009d
            L_0x0082:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L_0x0097
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                if (r2 != 0) goto L_0x0091
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0091:
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L_0x009d
            L_0x0097:
                r0.append(r4)
                r0.append(r1)
            L_0x009d:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r1 = r6.encodedQueryNamesAndValues
                if (r1 == 0) goto L_0x00b9
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 != 0) goto L_0x00b6
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00b6:
                r1.toQueryString$okhttp(r2, r0)
            L_0x00b9:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto L_0x00c7
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            L_0x00c7:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @NotNull
        public final Builder username(@NotNull String str) {
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\r\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJc\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\b*\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010%\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010%\u001a\u0004\u0018\u00010\b*\u00020\fH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010%\u001a\u0004\u0018\u00010\b*\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ%\u0010-\u001a\u00020**\b\u0012\u0004\u0012\u00020\u00010&2\n\u0010)\u001a\u00060'j\u0002`(H\u0000¢\u0006\u0004\b+\u0010,J\u001b\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010.*\u00020\u0001H\u0000¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&2\n\u0010)\u001a\u00060'j\u0002`(H\u0000¢\u0006\u0004\b2\u0010,J]\u00106\u001a\u00020**\u0002042\u0006\u00105\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b6\u00107J3\u00109\u001a\u00020**\u0002042\u0006\u00108\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010C\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010D\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bD\u0010<R\u0016\u0010E\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bE\u0010<R\u0016\u0010F\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bF\u0010<R\u0016\u0010G\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bG\u0010<R\u0016\u0010H\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bH\u0010<R\u0016\u0010I\u001a\u00020\u00018\u0000@\u0000XT¢\u0006\u0006\n\u0004\bI\u0010<¨\u0006L"}, mo47991d2 = {"Lokhttp3/HttpUrl$Companion;", "", "scheme", "", "defaultPort", "(Ljava/lang/String;)I", "Ljava/net/URI;", "uri", "Lokhttp3/HttpUrl;", "-deprecated_get", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "get", "Ljava/net/URL;", "url", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "-deprecated_parse", "parse", "pos", "limit", "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "isPercentEncoded", "(Ljava/lang/String;II)Z", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "toHttpUrl", "toHttpUrlOrNull", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "toQueryString$okhttp", "toQueryString", "Lokio/Buffer;", "input", "writeCanonicalized", "(Lokio/Buffer;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "encoded", "writePercentDecoded", "(Lokio/Buffer;Ljava/lang/String;IIZ)V", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: HttpUrl.kt */
    public static final class Companion {
        public Companion() {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(@NotNull String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || Util.parseHexDigit(str.charAt(i + 1)) == -1 || Util.parseHexDigit(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
            if (isPercentEncoded(r1, r5, r2) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void writeCanonicalized(@org.jetbrains.annotations.NotNull okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00c5
                if (r1 == 0) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002b
                r8 = 9
                if (r7 == r8) goto L_0x0026
                r8 = 10
                if (r7 == r8) goto L_0x0026
                r8 = 12
                if (r7 == r8) goto L_0x0026
                r8 = 13
                if (r7 == r8) goto L_0x0026
                goto L_0x002b
            L_0x0026:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x002b:
                r8 = 43
                if (r7 != r8) goto L_0x003c
                if (r22 == 0) goto L_0x003c
                if (r20 == 0) goto L_0x0036
                java.lang.String r8 = "+"
                goto L_0x0038
            L_0x0036:
                java.lang.String r8 = "%2B"
            L_0x0038:
                r15.writeUtf8((java.lang.String) r8)
                goto L_0x0026
            L_0x003c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004c
                if (r23 == 0) goto L_0x006c
            L_0x004c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r12, (char) r8, (boolean) r10, (int) r11, (java.lang.Object) r4)
                if (r8 != 0) goto L_0x006a
                if (r7 != r9) goto L_0x0065
                if (r20 == 0) goto L_0x006a
                if (r21 == 0) goto L_0x0065
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L_0x0066
                goto L_0x006f
            L_0x0065:
                r8 = r14
            L_0x0066:
                r15.writeUtf8CodePoint((int) r7)
                goto L_0x00b5
            L_0x006a:
                r8 = r14
                goto L_0x006f
            L_0x006c:
                r8 = r14
                r12 = r19
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.writeString((java.lang.String) r1, (int) r5, (int) r10, (java.nio.charset.Charset) r3)
                goto L_0x008d
            L_0x008a:
                r6.writeUtf8CodePoint((int) r7)
            L_0x008d:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte((int) r9)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte((int) r11)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte((int) r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00c5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(@NotNull Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt == 37 && (i3 = i + 2) < i2) {
                        int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                        int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                        if (!(parseHexDigit == -1 || parseHexDigit2 == -1)) {
                            buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                            i = Character.charCount(codePointAt) + i3;
                        }
                    } else if (codePointAt == 43 && z) {
                        buffer.writeByte(32);
                        i++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m28921deprecated_get(@NotNull String str) {
            return get(str);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        @JvmName(name = "-deprecated_parse")
        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m28924deprecated_parse(@NotNull String str) {
            return parse(str);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            String str3 = str;
            int i3 = i2;
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && !z4)) {
                    String str4 = str2;
                } else {
                    if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (char) codePointAt, false, 2, (Object) null)) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!isPercentEncoded(str, i4, i3)) {
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i4 += Character.charCount(codePointAt);
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i4 += Character.charCount(codePointAt);
                    }
                }
                Buffer buffer = new Buffer();
                int i5 = i;
                buffer.writeUtf8(str, i, i4);
                writeCanonicalized(buffer, str, i4, i2, str2, z, z2, z3, z4, charset);
                return buffer.readUtf8();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @JvmStatic
        public final int defaultPort(@NotNull String str) {
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        @JvmStatic
        @NotNull
        @JvmName(name = "get")
        public final HttpUrl get(@NotNull String str) {
            return new Builder().parse$okhttp((HttpUrl) null, str).build();
        }

        @JvmStatic
        @Nullable
        @JvmName(name = "parse")
        public final HttpUrl parse(@NotNull String str) {
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String str, int i, int i2, boolean z) {
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, (char) Typography.amp, i, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = str.length();
                }
                int i2 = indexOf$default;
                int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i2) {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, indexOf$default2);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(indexOf$default2 + 1, i2);
                    Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            IntProgression step = RangesKt___RangesKt.step((IntProgression) RangesKt___RangesKt.until(0, list.size()), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first != last) {
                    first += step2;
                } else {
                    return;
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m28923deprecated_get(@NotNull URL url) {
            return get(url);
        }

        @JvmStatic
        @Nullable
        @JvmName(name = "get")
        public final HttpUrl get(@NotNull URL url) {
            String url2 = url.toString();
            Intrinsics.checkExpressionValueIsNotNull(url2, "toString()");
            return parse(url2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m28922deprecated_get(@NotNull URI uri) {
            return get(uri);
        }

        @JvmStatic
        @Nullable
        @JvmName(name = "get")
        public final HttpUrl get(@NotNull URI uri) {
            String uri2 = uri.toString();
            Intrinsics.checkExpressionValueIsNotNull(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = Intrinsics.areEqual((Object) str, (Object) "https");
    }

    @JvmStatic
    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @JvmStatic
    @NotNull
    @JvmName(name = "get")
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @JvmStatic
    @Nullable
    @JvmName(name = "get")
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @JvmStatic
    @Nullable
    @JvmName(name = "get")
    public static final HttpUrl get(@NotNull URL url2) {
        return Companion.get(url2);
    }

    @JvmStatic
    @Nullable
    @JvmName(name = "parse")
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_encodedFragment")
    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m28902deprecated_encodedFragment() {
        return encodedFragment();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @JvmName(name = "-deprecated_encodedPassword")
    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m28903deprecated_encodedPassword() {
        return encodedPassword();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @JvmName(name = "-deprecated_encodedPath")
    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m28904deprecated_encodedPath() {
        return encodedPath();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @JvmName(name = "-deprecated_encodedPathSegments")
    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m28905deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_encodedQuery")
    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m28906deprecated_encodedQuery() {
        return encodedQuery();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @JvmName(name = "-deprecated_encodedUsername")
    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m28907deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_fragment")
    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m28908deprecated_fragment() {
        return this.fragment;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @JvmName(name = "-deprecated_host")
    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m28909deprecated_host() {
        return this.host;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}))
    @JvmName(name = "-deprecated_password")
    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m28910deprecated_password() {
        return this.password;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @JvmName(name = "-deprecated_pathSegments")
    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m28911deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    @JvmName(name = "-deprecated_pathSize")
    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m28912deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    @JvmName(name = "-deprecated_port")
    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m28913deprecated_port() {
        return this.port;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "query", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_query")
    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m28914deprecated_query() {
        return query();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @JvmName(name = "-deprecated_queryParameterNames")
    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m28915deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    @JvmName(name = "-deprecated_querySize")
    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m28916deprecated_querySize() {
        return querySize();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m28917deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @JvmName(name = "-deprecated_uri")
    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m28918deprecated_uri() {
        return uri();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @JvmName(name = "-deprecated_url")
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m28919deprecated_url() {
        return url();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "username", imports = {}))
    @JvmName(name = "-deprecated_username")
    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m28920deprecated_username() {
        return this.username;
    }

    @Nullable
    @JvmName(name = "encodedFragment")
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, (char) RunnerArgs.METHOD_SEPARATOR, 0, false, 6, (Object) null) + 1;
        String str = this.url;
        if (str != null) {
            String substring = str.substring(indexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @JvmName(name = "encodedPassword")
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1;
        int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null);
        String str = this.url;
        if (str != null) {
            String substring = str.substring(indexOf$default, indexOf$default2);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @JvmName(name = "encodedPath")
    public final String encodedPath() {
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(indexOf$default, delimiterOffset);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @JvmName(name = "encodedPathSegments")
    public final List<String> encodedPathSegments() {
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i = indexOf$default + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String str2 = this.url;
            if (str2 != null) {
                String substring = str2.substring(i, delimiterOffset2);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                indexOf$default = delimiterOffset2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    @Nullable
    @JvmName(name = "encodedQuery")
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, (char) RunnerArgs.METHOD_SEPARATOR, indexOf$default, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(indexOf$default, delimiterOffset);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @JvmName(name = "encodedUsername")
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(length, delimiterOffset);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.areEqual((Object) ((HttpUrl) obj).url, (Object) this.url);
    }

    @Nullable
    @JvmName(name = "fragment")
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    @JvmName(name = "host")
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @NotNull
    @JvmName(name = "password")
    public final String password() {
        return this.password;
    }

    @NotNull
    @JvmName(name = "pathSegments")
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @JvmName(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @JvmName(name = "port")
    public final int port() {
        return this.port;
    }

    @Nullable
    @JvmName(name = "query")
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression step = RangesKt___RangesKt.step((IntProgression) RangesKt___RangesKt.until(0, list.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (!Intrinsics.areEqual((Object) str, (Object) this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            if (str == null) {
                Intrinsics.throwNpe();
            }
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    @JvmName(name = "queryParameterNames")
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return SetsKt__SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression step = RangesKt___RangesKt.step((IntProgression) RangesKt___RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String str) {
        if (this.queryNamesAndValues == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression step = RangesKt___RangesKt.step((IntProgression) RangesKt___RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (true) {
                if (Intrinsics.areEqual((Object) str, (Object) this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    @JvmName(name = "querySize")
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        if (newBuilder == null) {
            Intrinsics.throwNpe();
        }
        return newBuilder.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @NotNull
    @JvmName(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @NotNull
    @JvmName(name = "uri")
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace((CharSequence) builder, ""));
                Intrinsics.checkExpressionValueIsNotNull(create, "URI.create(stripped)");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    @JvmName(name = "url")
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    @JvmName(name = "username")
    public final String username() {
        return this.username;
    }

    @Nullable
    public final Builder newBuilder(@NotNull String str) {
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
