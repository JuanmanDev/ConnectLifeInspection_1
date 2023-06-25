package okhttp3;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 -:\u0002.-BQ\b\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010'\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u0012J\u000f\u0010\"\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0007H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0003R\u0019\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b\u0004\u0010\u0003R\u0019\u0010\r\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0013\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001b\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\u001b\u0010\u0003R\u0019\u0010\u001d\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\u001d\u0010\u0003R\u0019\u0010\u001f\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010!\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b!\u0010\u0012R\u0019\u0010'\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0003¨\u0006/"}, mo47991d2 = {"Lokhttp3/Cookie;", "", "-deprecated_domain", "()Ljava/lang/String;", "domain", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "-deprecated_expiresAt", "()J", "expiresAt", "", "hashCode", "()I", "-deprecated_hostOnly", "()Z", "hostOnly", "-deprecated_httpOnly", "httpOnly", "Lokhttp3/HttpUrl;", "url", "matches", "(Lokhttp3/HttpUrl;)Z", "-deprecated_name", "name", "-deprecated_path", "path", "-deprecated_persistent", "persistent", "-deprecated_secure", "secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "-deprecated_value", "value", "Ljava/lang/String;", "J", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Companion", "Builder", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Cookie.kt */
public final class Cookie {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    @NotNull
    public final String domain;
    public final long expiresAt;
    public final boolean hostOnly;
    public final boolean httpOnly;
    @NotNull
    public final String name;
    @NotNull
    public final String path;
    public final boolean persistent;
    public final boolean secure;
    @NotNull
    public final String value;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u0000B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, mo47991d2 = {"Lokhttp3/Cookie$Builder;", "Lokhttp3/Cookie;", "build", "()Lokhttp3/Cookie;", "", "domain", "(Ljava/lang/String;)Lokhttp3/Cookie$Builder;", "", "hostOnly", "(Ljava/lang/String;Z)Lokhttp3/Cookie$Builder;", "", "expiresAt", "(J)Lokhttp3/Cookie$Builder;", "hostOnlyDomain", "httpOnly", "()Lokhttp3/Cookie$Builder;", "name", "path", "secure", "value", "Ljava/lang/String;", "J", "Z", "persistent", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Cookie.kt */
    public static final class Builder {
        public String domain;
        public long expiresAt = DatesKt.MAX_DATE;
        public boolean hostOnly;
        public boolean httpOnly;
        public String name;
        public String path = "/";
        public boolean persistent;
        public boolean secure;
        public String value;

        @NotNull
        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, (DefaultConstructorMarker) null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        @NotNull
        public final Builder domain(@NotNull String str) {
            return domain(str, false);
        }

        @NotNull
        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DatesKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String str) {
            return domain(str, true);
        }

        @NotNull
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String str) {
            if (Intrinsics.areEqual((Object) StringsKt__StringsKt.trim((CharSequence) str).toString(), (Object) str)) {
                this.name = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        @NotNull
        public final Builder path(@NotNull String str) {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, (Object) null)) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        @NotNull
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String str) {
            if (Intrinsics.areEqual((Object) StringsKt__StringsKt.trim((CharSequence) str).toString(), (Object) str)) {
                this.value = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b.\u0010/J/\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0001H\u0002¢\u0006\u0004\b%\u0010&R\u001e\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001e\u0010,\u001a\n (*\u0004\u0018\u00010'0'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001e\u0010-\u001a\n (*\u0004\u0018\u00010'0'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u00060"}, mo47991d2 = {"Lokhttp3/Cookie$Companion;", "", "input", "", "pos", "limit", "", "invert", "dateCharacterOffset", "(Ljava/lang/String;IIZ)I", "urlHost", "domain", "domainMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "currentTimeMillis", "Lokhttp3/HttpUrl;", "url", "setCookie", "Lokhttp3/Cookie;", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "parse", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", "", "parseAll", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "s", "parseDomain", "(Ljava/lang/String;)Ljava/lang/String;", "parseExpires", "(Ljava/lang/String;II)J", "parseMaxAge", "(Ljava/lang/String;)J", "path", "pathMatch", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Z", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Cookie.kt */
    public static final class Companion {
        public Companion() {
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                return true;
            }
            if (!StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || Util.canParseAsIpAddress(str)) {
                return false;
            }
            return true;
        }

        private final String parseDomain(String str) {
            if (!StringsKt__StringsJVMKt.endsWith$default(str, MAPCookie.DOT, false, 2, (Object) null)) {
                String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt__StringsKt.removePrefix(str, (CharSequence) MAPCookie.DOT));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseExpires(String str, int i, int i2) {
            String str2 = str;
            int i3 = i2;
            int dateCharacterOffset = dateCharacterOffset(str2, i, i3, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (dateCharacterOffset < i3) {
                int dateCharacterOffset2 = dateCharacterOffset(str2, dateCharacterOffset + 1, i3, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i5 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkExpressionValueIsNotNull(group, "matcher.group(1)");
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkExpressionValueIsNotNull(group2, "matcher.group(2)");
                    i8 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkExpressionValueIsNotNull(group3, "matcher.group(3)");
                    i9 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkExpressionValueIsNotNull(group4, "matcher.group(1)");
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.checkExpressionValueIsNotNull(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                    if (group5 != null) {
                        String lowerCase = group5.toLowerCase(locale);
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = Cookie.MONTH_PATTERN.pattern();
                        Intrinsics.checkExpressionValueIsNotNull(pattern, "MONTH_PATTERN.pattern()");
                        i7 = StringsKt__StringsKt.indexOf$default((CharSequence) pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i4 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkExpressionValueIsNotNull(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str2, dateCharacterOffset2 + 1, i3, false);
            }
            if (70 <= i4 && 99 >= i4) {
                i4 += 1900;
            }
            if (i4 >= 0 && 69 >= i4) {
                i4 += 2000;
            }
            if (i4 >= 1601) {
                if (i7 != -1) {
                    if (1 <= i6 && 31 >= i6) {
                        if (i5 >= 0 && 23 >= i5) {
                            if (i8 >= 0 && 59 >= i8) {
                                if (i9 >= 0 && 59 >= i9) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (!new Regex("-?\\d+").matches(str)) {
                    throw e;
                } else if (StringsKt__StringsJVMKt.startsWith$default(str, AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return Long.MAX_VALUE;
                }
            }
        }

        /* access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (Intrinsics.areEqual((Object) encodedPath, (Object) str)) {
                return true;
            }
            return StringsKt__StringsJVMKt.startsWith$default(encodedPath, str, false, 2, (Object) null) && (StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, (Object) null) || encodedPath.charAt(str.length()) == '/');
        }

        @JvmStatic
        @Nullable
        public final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L_0x00fe;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x012b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x012c  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.Cookie parse$okhttp(long r27, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r29, @org.jetbrains.annotations.NotNull java.lang.String r30) {
            /*
                r26 = this;
                r0 = r26
                r7 = r30
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r30
                int r8 = okhttp3.internal.Util.delimiterOffset$default((java.lang.String) r1, (char) r2, (int) r3, (int) r4, (int) r5, (java.lang.Object) r6)
                r2 = 61
                r5 = 2
                r4 = r8
                int r1 = okhttp3.internal.Util.delimiterOffset$default((java.lang.String) r1, (char) r2, (int) r3, (int) r4, (int) r5, (java.lang.Object) r6)
                r2 = 0
                if (r1 != r8) goto L_0x001c
                return r2
            L_0x001c:
                r3 = 0
                r4 = 1
                java.lang.String r10 = okhttp3.internal.Util.trimSubstring$default(r7, r3, r1, r4, r2)
                int r5 = r10.length()
                if (r5 != 0) goto L_0x002a
                r5 = r4
                goto L_0x002b
            L_0x002a:
                r5 = r3
            L_0x002b:
                if (r5 != 0) goto L_0x0170
                int r5 = okhttp3.internal.Util.indexOfControlOrNonAscii(r10)
                r6 = -1
                if (r5 == r6) goto L_0x0036
                goto L_0x0170
            L_0x0036:
                int r1 = r1 + r4
                java.lang.String r11 = okhttp3.internal.Util.trimSubstring(r7, r1, r8)
                int r1 = okhttp3.internal.Util.indexOfControlOrNonAscii(r11)
                if (r1 == r6) goto L_0x0042
                return r2
            L_0x0042:
                int r8 = r8 + r4
                int r1 = r30.length()
                r5 = -1
                r9 = r2
                r21 = r9
                r16 = r3
                r17 = r16
                r18 = r17
                r19 = r4
                r14 = r5
                r22 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x005a:
                if (r8 >= r1) goto L_0x00ca
                r2 = 59
                int r2 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r7, (char) r2, (int) r8, (int) r1)
                r12 = 61
                int r12 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r7, (char) r12, (int) r8, (int) r2)
                java.lang.String r8 = okhttp3.internal.Util.trimSubstring(r7, r8, r12)
                if (r12 >= r2) goto L_0x0075
                int r12 = r12 + 1
                java.lang.String r12 = okhttp3.internal.Util.trimSubstring(r7, r12, r2)
                goto L_0x0077
            L_0x0075:
                java.lang.String r12 = ""
            L_0x0077:
                java.lang.String r13 = "expires"
                boolean r13 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r13, r4)
                if (r13 == 0) goto L_0x0088
                int r8 = r12.length()     // Catch:{ IllegalArgumentException -> 0x00c6 }
                long r22 = r0.parseExpires(r12, r3, r8)     // Catch:{ IllegalArgumentException -> 0x00c6 }
                goto L_0x0094
            L_0x0088:
                java.lang.String r13 = "max-age"
                boolean r13 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r13, r4)
                if (r13 == 0) goto L_0x0097
                long r14 = r0.parseMaxAge(r12)     // Catch:{  }
            L_0x0094:
                r18 = r4
                goto L_0x00c6
            L_0x0097:
                java.lang.String r13 = "domain"
                boolean r13 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r13, r4)
                if (r13 == 0) goto L_0x00a6
                java.lang.String r9 = r0.parseDomain(r12)     // Catch:{ IllegalArgumentException -> 0x00c6 }
                r19 = r3
                goto L_0x00c6
            L_0x00a6:
                java.lang.String r13 = "path"
                boolean r13 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r13, r4)
                if (r13 == 0) goto L_0x00b1
                r21 = r12
                goto L_0x00c6
            L_0x00b1:
                java.lang.String r12 = "secure"
                boolean r12 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r12, r4)
                if (r12 == 0) goto L_0x00bc
                r16 = r4
                goto L_0x00c6
            L_0x00bc:
                java.lang.String r12 = "httponly"
                boolean r8 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r12, r4)
                if (r8 == 0) goto L_0x00c6
                r17 = r4
            L_0x00c6:
                int r8 = r2 + 1
                r2 = 0
                goto L_0x005a
            L_0x00ca:
                r1 = -9223372036854775808
                int r4 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00d2
            L_0x00d0:
                r12 = r1
                goto L_0x0102
            L_0x00d2:
                int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0100
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00e4
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r14 = r14 * r1
                goto L_0x00e9
            L_0x00e4:
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00e9:
                long r1 = r27 + r14
                int r4 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
                if (r4 < 0) goto L_0x00f9
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00d0
                goto L_0x00fe
            L_0x00f9:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x00fe:
                r12 = r4
                goto L_0x0102
            L_0x0100:
                r12 = r22
            L_0x0102:
                java.lang.String r1 = r29.host()
                if (r9 != 0) goto L_0x010b
                r14 = r1
                r2 = 0
                goto L_0x0115
            L_0x010b:
                boolean r2 = r0.domainMatch(r1, r9)
                if (r2 != 0) goto L_0x0113
                r2 = 0
                return r2
            L_0x0113:
                r2 = 0
                r14 = r9
            L_0x0115:
                int r1 = r1.length()
                int r4 = r14.length()
                if (r1 == r4) goto L_0x012c
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.get()
                java.lang.String r1 = r1.getEffectiveTldPlusOne(r14)
                if (r1 != 0) goto L_0x012c
                return r2
            L_0x012c:
                java.lang.String r1 = "/"
                r4 = r21
                if (r4 == 0) goto L_0x013c
                r5 = 2
                boolean r2 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x013a
                goto L_0x013c
            L_0x013a:
                r15 = r4
                goto L_0x0167
            L_0x013c:
                java.lang.String r2 = r29.encodedPath()
                r21 = 47
                r22 = 0
                r23 = 0
                r24 = 6
                r25 = 0
                r20 = r2
                int r4 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r20, (char) r21, (int) r22, (boolean) r23, (int) r24, (java.lang.Object) r25)
                if (r4 == 0) goto L_0x0166
                if (r2 == 0) goto L_0x015e
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                goto L_0x0166
            L_0x015e:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
                r1.<init>(r2)
                throw r1
            L_0x0166:
                r15 = r1
            L_0x0167:
                okhttp3.Cookie r1 = new okhttp3.Cookie
                r20 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)
                return r1
            L_0x0170:
                r1 = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        @JvmStatic
        @NotNull
        public final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    @JvmStatic
    @Nullable
    public static final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return Companion.parse(httpUrl, str);
    }

    @JvmStatic
    @NotNull
    public static final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "domain", imports = {}))
    @JvmName(name = "-deprecated_domain")
    /* renamed from: -deprecated_domain  reason: not valid java name */
    public final String m28881deprecated_domain() {
        return this.domain;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    @JvmName(name = "-deprecated_expiresAt")
    /* renamed from: -deprecated_expiresAt  reason: not valid java name */
    public final long m28882deprecated_expiresAt() {
        return this.expiresAt;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    @JvmName(name = "-deprecated_hostOnly")
    /* renamed from: -deprecated_hostOnly  reason: not valid java name */
    public final boolean m28883deprecated_hostOnly() {
        return this.hostOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    @JvmName(name = "-deprecated_httpOnly")
    /* renamed from: -deprecated_httpOnly  reason: not valid java name */
    public final boolean m28884deprecated_httpOnly() {
        return this.httpOnly;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @JvmName(name = "-deprecated_name")
    /* renamed from: -deprecated_name  reason: not valid java name */
    public final String m28885deprecated_name() {
        return this.name;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    @JvmName(name = "-deprecated_path")
    /* renamed from: -deprecated_path  reason: not valid java name */
    public final String m28886deprecated_path() {
        return this.path;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    @JvmName(name = "-deprecated_persistent")
    /* renamed from: -deprecated_persistent  reason: not valid java name */
    public final boolean m28887deprecated_persistent() {
        return this.persistent;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}))
    @JvmName(name = "-deprecated_secure")
    /* renamed from: -deprecated_secure  reason: not valid java name */
    public final boolean m28888deprecated_secure() {
        return this.secure;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    @JvmName(name = "-deprecated_value")
    /* renamed from: -deprecated_value  reason: not valid java name */
    public final String m28889deprecated_value() {
        return this.value;
    }

    @NotNull
    @JvmName(name = "domain")
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            return Intrinsics.areEqual((Object) cookie.name, (Object) this.name) && Intrinsics.areEqual((Object) cookie.value, (Object) this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual((Object) cookie.domain, (Object) this.domain) && Intrinsics.areEqual((Object) cookie.path, (Object) this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
        }
    }

    @JvmName(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    @JvmName(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @JvmName(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@NotNull HttpUrl httpUrl) {
        boolean z;
        if (this.hostOnly) {
            z = Intrinsics.areEqual((Object) httpUrl.host(), (Object) this.domain);
        } else {
            z = Companion.domainMatch(httpUrl.host(), this.domain);
        }
        if (!z || !Companion.pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    @NotNull
    @JvmName(name = "name")
    public final String name() {
        return this.name;
    }

    @NotNull
    @JvmName(name = "path")
    public final String path() {
        return this.path;
    }

    @JvmName(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @JvmName(name = "secure")
    public final boolean secure() {
        return this.secure;
    }

    @NotNull
    public String toString() {
        return toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(MAPCookie.DOT);
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "toString()");
        return sb2;
    }

    @NotNull
    @JvmName(name = "value")
    public final String value() {
        return this.value;
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
