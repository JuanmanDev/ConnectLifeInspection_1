package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -:\u0001-B;\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0)¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0010J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\u0004\u0010\u0003R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8G@\u0006X\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0019\u0010\u001d\u001a\u00020\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010(\u001a\u00020\u001e*\u00020\u000e8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, mo47991d2 = {"Lokhttp3/Handshake;", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "cipherSuite", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ljava/security/cert/Certificate;", "-deprecated_localCertificates", "()Ljava/util/List;", "localCertificates", "Ljava/security/Principal;", "-deprecated_localPrincipal", "()Ljava/security/Principal;", "localPrincipal", "-deprecated_peerCertificates", "peerCertificates", "-deprecated_peerPrincipal", "peerPrincipal", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "tlsVersion", "", "toString", "()Ljava/lang/String;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lkotlin/Lazy;", "Lokhttp3/TlsVersion;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Companion", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Handshake.kt */
public final class Handshake {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public final CipherSuite cipherSuite;
    @NotNull
    public final List<Certificate> localCertificates;
    @NotNull
    public final Lazy peerCertificates$delegate;
    @NotNull
    public final TlsVersion tlsVersion;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u0006\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0003*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo47991d2 = {"Lokhttp3/Handshake$Companion;", "Ljavax/net/ssl/SSLSession;", "sslSession", "Lokhttp3/Handshake;", "-deprecated_get", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;", "get", "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "peerCertificates", "localCertificates", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)Lokhttp3/Handshake;", "handshake", "", "toImmutableList", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Handshake.kt */
    public static final class Companion {
        public Companion() {
        }

        private final List<Certificate> toImmutableList(@Nullable Certificate[] certificateArr) {
            if (certificateArr != null) {
                return Util.immutableListOf((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @NotNull
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m28898deprecated_get(@NotNull SSLSession sSLSession) {
            return get(sSLSession);
        }

        @JvmStatic
        @NotNull
        @JvmName(name = "get")
        public final Handshake get(@NotNull SSLSession sSLSession) {
            List<Certificate> list;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!Intrinsics.areEqual((Object) "NONE", (Object) protocol)) {
                    TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                    try {
                        list = toImmutableList(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = CollectionsKt__CollectionsKt.emptyList();
                    }
                    return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    public Handshake(@NotNull TlsVersion tlsVersion2, @NotNull CipherSuite cipherSuite2, @NotNull List<? extends Certificate> list, @NotNull Function0<? extends List<? extends Certificate>> function0) {
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.localCertificates = list;
        this.peerCertificates$delegate = LazyKt__LazyJVMKt.lazy(new Handshake$peerCertificates$2(function0));
    }

    @JvmStatic
    @NotNull
    @JvmName(name = "get")
    public static final Handshake get(@NotNull SSLSession sSLSession) {
        return Companion.get(sSLSession);
    }

    @JvmStatic
    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion2, @NotNull CipherSuite cipherSuite2, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return Companion.get(tlsVersion2, cipherSuite2, list, list2);
    }

    private final String getName(@NotNull Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "type");
        return type;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuite", imports = {}))
    @JvmName(name = "-deprecated_cipherSuite")
    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m28892deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "localCertificates", imports = {}))
    @JvmName(name = "-deprecated_localCertificates")
    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m28893deprecated_localCertificates() {
        return this.localCertificates;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "localPrincipal", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_localPrincipal")
    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m28894deprecated_localPrincipal() {
        return localPrincipal();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "peerCertificates", imports = {}))
    @JvmName(name = "-deprecated_peerCertificates")
    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m28895deprecated_peerCertificates() {
        return peerCertificates();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "peerPrincipal", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_peerPrincipal")
    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m28896deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersion", imports = {}))
    @JvmName(name = "-deprecated_tlsVersion")
    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m28897deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    @JvmName(name = "cipherSuite")
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.tlsVersion == this.tlsVersion && Intrinsics.areEqual((Object) handshake.cipherSuite, (Object) this.cipherSuite) && Intrinsics.areEqual((Object) handshake.peerCertificates(), (Object) peerCertificates()) && Intrinsics.areEqual((Object) handshake.localCertificates, (Object) this.localCertificates);
        }
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @NotNull
    @JvmName(name = "localCertificates")
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    @JvmName(name = "localPrincipal")
    public final Principal localPrincipal() {
        Object firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(this.localCertificates);
        if (!(firstOrNull instanceof X509Certificate)) {
            firstOrNull = null;
        }
        X509Certificate x509Certificate = (X509Certificate) firstOrNull;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    @JvmName(name = "peerCertificates")
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @Nullable
    @JvmName(name = "peerPrincipal")
    public final Principal peerPrincipal() {
        Object firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(peerCertificates());
        if (!(firstOrNull instanceof X509Certificate)) {
            firstOrNull = null;
        }
        X509Certificate x509Certificate = (X509Certificate) firstOrNull;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    @JvmName(name = "tlsVersion")
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(peerCertificates, 10));
        for (Certificate name : peerCertificates) {
            arrayList.add(getName(name));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Certificate name2 : list) {
            arrayList2.add(getName(name2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
