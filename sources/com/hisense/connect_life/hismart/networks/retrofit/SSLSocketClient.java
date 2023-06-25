package com.hisense.connect_life.hismart.networks.retrofit;

import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p439c.p440a.p454b.C7454a;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/retrofit/SSLSocketClient;", "", "()V", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "sSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSSLSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "", "Ljavax/net/ssl/TrustManager;", "getTrustManager", "()[Ljavax/net/ssl/TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SSLSocketClient.kt */
public final class SSLSocketClient {
    @NotNull
    public static final SSLSocketClient INSTANCE = new SSLSocketClient();

    /* renamed from: _get_hostnameVerifier_$lambda-1  reason: not valid java name */
    public static final boolean m27092_get_hostnameVerifier_$lambda1(String str, SSLSession sSLSession) {
        return true;
    }

    private final TrustManager[] getTrustManager() {
        return new TrustManager[]{new SSLSocketClient$trustManager$1()};
    }

    @NotNull
    public final HostnameVerifier getHostnameVerifier() {
        return C7454a.f14143a;
    }

    @NotNull
    public final SSLSocketFactory getSSLSocketFactory() {
        try {
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, getTrustManager(), new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "{\n            val sslCon…t.socketFactory\n        }");
            return socketFactory;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public final X509TrustManager getX509TrustManager() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers:", Arrays.toString(trustManagers)).toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
