package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 $:\u0002%$Bs\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u0004\u0010\u0003R\u0019\u0010\u001f\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0003R\u0019\u0010 \u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0003R\u0019\u0010\b\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0007R\u0019\u0010\n\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\f\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u000e\u0010\u0003R\u0019\u0010\u0010\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0010\u0010\u0003R\u0019\u0010\u0012\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0012\u0010\u0003R\u0019\u0010\u0014\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0014\u0010\u0003R\u0019\u0010\u0016\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0016\u0010\u0003R\u0019\u0010\u0018\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0018\u0010\u0007¨\u0006&"}, mo47991d2 = {"Lokhttp3/CacheControl;", "", "-deprecated_immutable", "()Z", "immutable", "", "-deprecated_maxAgeSeconds", "()I", "maxAgeSeconds", "-deprecated_maxStaleSeconds", "maxStaleSeconds", "-deprecated_minFreshSeconds", "minFreshSeconds", "-deprecated_mustRevalidate", "mustRevalidate", "-deprecated_noCache", "noCache", "-deprecated_noStore", "noStore", "-deprecated_noTransform", "noTransform", "-deprecated_onlyIfCached", "onlyIfCached", "-deprecated_sMaxAgeSeconds", "sMaxAgeSeconds", "", "toString", "()Ljava/lang/String;", "headerValue", "Ljava/lang/String;", "Z", "isPrivate", "isPublic", "I", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "Companion", "Builder", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: CacheControl.kt */
public final class CacheControl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    @JvmField
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    @NotNull
    @JvmField
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public String headerValue;
    public final boolean immutable;
    public final boolean isPrivate;
    public final boolean isPublic;
    public final int maxAgeSeconds;
    public final int maxStaleSeconds;
    public final int minFreshSeconds;
    public final boolean mustRevalidate;
    public final boolean noCache;
    public final boolean noStore;
    public final boolean noTransform;
    public final boolean onlyIfCached;
    public final int sMaxAgeSeconds;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0012\u001a\u00020\u0006*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u001c"}, mo47991d2 = {"Lokhttp3/CacheControl$Builder;", "Lokhttp3/CacheControl;", "build", "()Lokhttp3/CacheControl;", "immutable", "()Lokhttp3/CacheControl$Builder;", "", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/CacheControl$Builder;", "maxStale", "minFresh", "noCache", "noStore", "noTransform", "onlyIfCached", "", "clampToInt", "(J)I", "", "Z", "maxAgeSeconds", "I", "maxStaleSeconds", "minFreshSeconds", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: CacheControl.kt */
    public static final class Builder {
        public boolean immutable;
        public int maxAgeSeconds = -1;
        public int maxStaleSeconds = -1;
        public int minFreshSeconds = -1;
        public boolean noCache;
        public boolean noStore;
        public boolean noTransform;
        public boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @NotNull
        public final Builder maxAge(int i, @NotNull TimeUnit timeUnit) {
            if (i >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        @NotNull
        public final Builder maxStale(int i, @NotNull TimeUnit timeUnit) {
            if (i >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        @NotNull
        public final Builder minFresh(int i, @NotNull TimeUnit timeUnit) {
            if (i >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        @NotNull
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, mo47991d2 = {"Lokhttp3/CacheControl$Companion;", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "parse", "(Lokhttp3/Headers;)Lokhttp3/CacheControl;", "", "characters", "", "startIndex", "indexOfElement", "(Ljava/lang/String;Ljava/lang/String;I)I", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: CacheControl.kt */
    public static final class Companion {
        public Companion() {
        }

        private final int indexOfElement(@NotNull String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3  */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r33) {
            /*
                r32 = this;
                r0 = r32
                r1 = r33
                int r2 = r33.size()
                r6 = 1
                r8 = r6
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x001e:
                if (r7 >= r2) goto L_0x01a1
                java.lang.String r3 = r1.name(r7)
                java.lang.String r5 = r1.value(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.text.StringsKt__StringsJVMKt.equals(r3, r4, r6)
                if (r4 == 0) goto L_0x0035
                if (r9 == 0) goto L_0x0033
                goto L_0x003d
            L_0x0033:
                r9 = r5
                goto L_0x003e
            L_0x0035:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.text.StringsKt__StringsJVMKt.equals(r3, r4, r6)
                if (r3 == 0) goto L_0x0196
            L_0x003d:
                r8 = 0
            L_0x003e:
                r3 = 0
            L_0x003f:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x018f
                java.lang.String r4 = "=,;"
                int r4 = r0.indexOfElement(r5, r4, r3)
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
                if (r5 == 0) goto L_0x0189
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
                r29 = r2
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x0183
                java.lang.CharSequence r3 = kotlin.text.StringsKt__StringsKt.trim((java.lang.CharSequence) r3)
                java.lang.String r3 = r3.toString()
                r30 = r8
                int r8 = r5.length()
                if (r4 == r8) goto L_0x00e0
                char r8 = r5.charAt(r4)
                r31 = r9
                r9 = 44
                if (r8 == r9) goto L_0x00e2
                char r8 = r5.charAt(r4)
                r9 = 59
                if (r8 != r9) goto L_0x0081
                goto L_0x00e2
            L_0x0081:
                int r4 = r4 + 1
                int r4 = okhttp3.internal.Util.indexOfNonWhitespace(r5, r4)
                int r8 = r5.length()
                if (r4 >= r8) goto L_0x00b9
                char r8 = r5.charAt(r4)
                r9 = 34
                if (r8 != r9) goto L_0x00b9
                int r4 = r4 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r4
                int r2 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r23, (char) r24, (int) r25, (boolean) r26, (int) r27, (java.lang.Object) r28)
                if (r5 == 0) goto L_0x00b3
                java.lang.String r4 = r5.substring(r4, r2)
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r1)
                r1 = 1
                int r2 = r2 + r1
                goto L_0x00e6
            L_0x00b3:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x00b9:
                java.lang.String r8 = ",;"
                int r8 = r0.indexOfElement(r5, r8, r4)
                if (r5 == 0) goto L_0x00da
                java.lang.String r4 = r5.substring(r4, r8)
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r1)
                if (r4 == 0) goto L_0x00d4
                java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.trim((java.lang.CharSequence) r4)
                java.lang.String r4 = r1.toString()
                r2 = r8
                goto L_0x00e6
            L_0x00d4:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r2)
                throw r1
            L_0x00da:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x00e0:
                r31 = r9
            L_0x00e2:
                int r4 = r4 + 1
                r2 = r4
                r4 = 0
            L_0x00e6:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x00f3
                r10 = r6
            L_0x00f0:
                r1 = -1
                goto L_0x0178
            L_0x00f3:
                java.lang.String r1 = "no-store"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x00fd
                r11 = r6
                goto L_0x00f0
            L_0x00fd:
                java.lang.String r1 = "max-age"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x010c
                r1 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x0178
            L_0x010c:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = kotlin.text.StringsKt__StringsJVMKt.equals(r8, r3, r6)
                if (r8 == 0) goto L_0x011a
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x0178
            L_0x011a:
                java.lang.String r1 = "private"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x0124
                r14 = r6
                goto L_0x00f0
            L_0x0124:
                java.lang.String r1 = "public"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x012e
                r15 = r6
                goto L_0x00f0
            L_0x012e:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x0139
                r16 = r6
                goto L_0x00f0
            L_0x0139:
                java.lang.String r1 = "max-stale"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x0149
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x00f0
            L_0x0149:
                java.lang.String r1 = "min-fresh"
                boolean r1 = kotlin.text.StringsKt__StringsJVMKt.equals(r1, r3, r6)
                if (r1 == 0) goto L_0x0157
                r1 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x0178
            L_0x0157:
                r1 = -1
                java.lang.String r4 = "only-if-cached"
                boolean r4 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r3, r6)
                if (r4 == 0) goto L_0x0163
                r19 = r6
                goto L_0x0178
            L_0x0163:
                java.lang.String r4 = "no-transform"
                boolean r4 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r3, r6)
                if (r4 == 0) goto L_0x016e
                r20 = r6
                goto L_0x0178
            L_0x016e:
                java.lang.String r4 = "immutable"
                boolean r3 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r3, r6)
                if (r3 == 0) goto L_0x0178
                r21 = r6
            L_0x0178:
                r1 = r33
                r3 = r2
                r2 = r29
                r8 = r30
                r9 = r31
                goto L_0x003f
            L_0x0183:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r2)
                throw r1
            L_0x0189:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x018f:
                r29 = r2
                r30 = r8
                r31 = r9
                goto L_0x0198
            L_0x0196:
                r29 = r2
            L_0x0198:
                r1 = -1
                int r7 = r7 + 1
                r1 = r33
                r2 = r29
                goto L_0x001e
            L_0x01a1:
                if (r8 != 0) goto L_0x01a6
                r22 = 0
                goto L_0x01a8
            L_0x01a6:
                r22 = r9
            L_0x01a8:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    @JvmStatic
    @NotNull
    public static final CacheControl parse(@NotNull Headers headers) {
        return Companion.parse(headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    @JvmName(name = "-deprecated_immutable")
    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m28863deprecated_immutable() {
        return this.immutable;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxAgeSeconds")
    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m28864deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxStaleSeconds")
    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m28865deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @JvmName(name = "-deprecated_minFreshSeconds")
    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m28866deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    @JvmName(name = "-deprecated_mustRevalidate")
    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m28867deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    @JvmName(name = "-deprecated_noCache")
    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m28868deprecated_noCache() {
        return this.noCache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    @JvmName(name = "-deprecated_noStore")
    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m28869deprecated_noStore() {
        return this.noStore;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    @JvmName(name = "-deprecated_noTransform")
    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m28870deprecated_noTransform() {
        return this.noTransform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    @JvmName(name = "-deprecated_onlyIfCached")
    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m28871deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_sMaxAgeSeconds")
    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m28872deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @JvmName(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @JvmName(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @JvmName(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @JvmName(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @NotNull
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
