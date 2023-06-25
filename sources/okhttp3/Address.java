package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000B{\u0012\u0006\u0010F\u001a\u000205\u0012\u0006\u0010G\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u00100\u001a\u00020-\u0012\b\u00104\u001a\u0004\u0018\u000101\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010(\u001a\u00020%\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\bH\u0010IJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0011\u0010$\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010(\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u00100\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0011\u00104\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u0010;\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b\u0004\u0010\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058G@\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b\t\u0010\bR\u0019\u0010\r\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b\r\u0010\fR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00058G@\u0006¢\u0006\f\n\u0004\b \u0010=\u001a\u0004\b \u0010\bR\u001b\u0010$\u001a\u0004\u0018\u00010!8\u0007@\u0006¢\u0006\f\n\u0004\b$\u0010@\u001a\u0004\b$\u0010#R\u0019\u0010(\u001a\u00020%8\u0007@\u0006¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b(\u0010'R\u0019\u0010,\u001a\u00020)8\u0007@\u0006¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\b,\u0010+R\u0019\u00100\u001a\u00020-8\u0007@\u0006¢\u0006\f\n\u0004\b0\u0010C\u001a\u0004\b0\u0010/R\u001b\u00104\u001a\u0004\u0018\u0001018\u0007@\u0006¢\u0006\f\n\u0004\b4\u0010D\u001a\u0004\b4\u00103R\u0019\u0010;\u001a\u0002088G@\u0006¢\u0006\f\n\u0004\b;\u0010E\u001a\u0004\b;\u0010:¨\u0006J"}, mo47991d2 = {"Lokhttp3/Address;", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "()Ljava/util/List;", "connectionSpecs", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "that", "equalsNonHost$okhttp", "(Lokhttp3/Address;)Z", "equalsNonHost", "", "hashCode", "()I", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Lokhttp3/Authenticator;", "-deprecated_proxyAuthenticator", "()Lokhttp3/Authenticator;", "proxyAuthenticator", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "toString", "()Ljava/lang/String;", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "url", "Lokhttp3/CertificatePinner;", "Ljava/util/List;", "Lokhttp3/Dns;", "Ljavax/net/ssl/HostnameVerifier;", "Ljava/net/Proxy;", "Lokhttp3/Authenticator;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/HttpUrl;", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Address.kt */
public final class Address {
    @Nullable
    public final CertificatePinner certificatePinner;
    @NotNull
    public final List<ConnectionSpec> connectionSpecs;
    @NotNull
    public final Dns dns;
    @Nullable
    public final HostnameVerifier hostnameVerifier;
    @NotNull
    public final List<Protocol> protocols;
    @Nullable
    public final Proxy proxy;
    @NotNull
    public final Authenticator proxyAuthenticator;
    @NotNull
    public final ProxySelector proxySelector;
    @NotNull
    public final SocketFactory socketFactory;
    @Nullable
    public final SSLSocketFactory sslSocketFactory;
    @NotNull
    public final HttpUrl url;

    public Address(@NotNull String str, int i, @NotNull Dns dns2, @NotNull SocketFactory socketFactory2, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier2, @Nullable CertificatePinner certificatePinner2, @NotNull Authenticator authenticator, @Nullable Proxy proxy2, @NotNull List<? extends Protocol> list, @NotNull List<ConnectionSpec> list2, @NotNull ProxySelector proxySelector2) {
        this.dns = dns2;
        this.socketFactory = socketFactory2;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier2;
        this.certificatePinner = certificatePinner2;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy2;
        this.proxySelector = proxySelector2;
        this.url = new HttpUrl.Builder().scheme(this.sslSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_certificatePinner")
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m28851deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @JvmName(name = "-deprecated_connectionSpecs")
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m28852deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @JvmName(name = "-deprecated_dns")
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m28853deprecated_dns() {
        return this.dns;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_hostnameVerifier")
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m28854deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @JvmName(name = "-deprecated_protocols")
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m28855deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_proxy")
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m28856deprecated_proxy() {
        return this.proxy;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @JvmName(name = "-deprecated_proxyAuthenticator")
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m28857deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @JvmName(name = "-deprecated_proxySelector")
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m28858deprecated_proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @JvmName(name = "-deprecated_socketFactory")
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m28859deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @Nullable
    @JvmName(name = "-deprecated_sslSocketFactory")
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m28860deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m28861deprecated_url() {
        return this.url;
    }

    @Nullable
    @JvmName(name = "certificatePinner")
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    @JvmName(name = "connectionSpecs")
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    @JvmName(name = "dns")
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return Intrinsics.areEqual((Object) this.url, (Object) address.url) && equalsNonHost$okhttp(address);
        }
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address address) {
        return Intrinsics.areEqual((Object) this.dns, (Object) address.dns) && Intrinsics.areEqual((Object) this.proxyAuthenticator, (Object) address.proxyAuthenticator) && Intrinsics.areEqual((Object) this.protocols, (Object) address.protocols) && Intrinsics.areEqual((Object) this.connectionSpecs, (Object) address.connectionSpecs) && Intrinsics.areEqual((Object) this.proxySelector, (Object) address.proxySelector) && Intrinsics.areEqual((Object) this.proxy, (Object) address.proxy) && Intrinsics.areEqual((Object) this.sslSocketFactory, (Object) address.sslSocketFactory) && Intrinsics.areEqual((Object) this.hostnameVerifier, (Object) address.hostnameVerifier) && Intrinsics.areEqual((Object) this.certificatePinner, (Object) address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @Nullable
    @JvmName(name = "hostnameVerifier")
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    @JvmName(name = "protocols")
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    @JvmName(name = "proxy")
    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    @JvmName(name = "proxyAuthenticator")
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    @JvmName(name = "proxySelector")
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    @JvmName(name = "socketFactory")
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    @JvmName(name = "sslSocketFactory")
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }

    @NotNull
    @JvmName(name = "url")
    public final HttpUrl url() {
        return this.url;
    }
}
