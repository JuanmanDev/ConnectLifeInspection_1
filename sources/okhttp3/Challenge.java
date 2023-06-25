package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dB%\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ\u001d\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R'\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00018G@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u0004R\u0013\u0010\t\u001a\u00020\u00068G@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0016\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001f"}, mo47991d2 = {"Lokhttp3/Challenge;", "", "", "-deprecated_authParams", "()Ljava/util/Map;", "authParams", "Ljava/nio/charset/Charset;", "-deprecated_charset", "()Ljava/nio/charset/Charset;", "charset", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "-deprecated_realm", "()Ljava/lang/String;", "realm", "-deprecated_scheme", "scheme", "toString", "withCharset", "(Ljava/nio/charset/Charset;)Lokhttp3/Challenge;", "Ljava/util/Map;", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Challenge.kt */
public final class Challenge {
    @NotNull
    public final Map<String, String> authParams;
    @NotNull
    public final String scheme;

    public Challenge(@NotNull String str, @NotNull Map<String, String> map) {
        String str2;
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "US");
                if (str3 != null) {
                    str2 = str3.toLowerCase(locale);
                    Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authParams", imports = {}))
    @JvmName(name = "-deprecated_authParams")
    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m28873deprecated_authParams() {
        return this.authParams;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "charset", imports = {}))
    @JvmName(name = "-deprecated_charset")
    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m28874deprecated_charset() {
        return charset();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "realm", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_realm")
    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m28875deprecated_realm() {
        return realm();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m28876deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    @JvmName(name = "authParams")
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @NotNull
    @JvmName(name = "charset")
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        Intrinsics.checkExpressionValueIsNotNull(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return Intrinsics.areEqual((Object) challenge.scheme, (Object) this.scheme) && Intrinsics.areEqual((Object) challenge.authParams, (Object) this.authParams);
        }
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @Nullable
    @JvmName(name = "realm")
    public final String realm() {
        return this.authParams.get("realm");
    }

    @NotNull
    @JvmName(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        Map<String, String> mutableMap = MapsKt__MapsKt.toMutableMap(this.authParams);
        String name = charset.name();
        Intrinsics.checkExpressionValueIsNotNull(name, "charset.name()");
        mutableMap.put("charset", name);
        return new Challenge(this.scheme, mutableMap);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Challenge(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "realm"
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            r1.<init>((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }
}
