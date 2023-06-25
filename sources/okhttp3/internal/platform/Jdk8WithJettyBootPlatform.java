package okhttp3.internal.platform;

import androidx.core.p028os.EnvironmentCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB7\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u001d"}, mo47991d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", "clientProviderClass", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "getMethod", "Ljava/lang/reflect/Method;", "putMethod", "removeMethod", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Companion", "AlpnProvider", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public final Class<?> clientProviderClass;
    public final Method getMethod;
    public final Method putMethod;
    public final Method removeMethod;
    public final Class<?> serverProviderClass;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo47991d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "", "protocols", "Ljava/util/List;", "selected", "Ljava/lang/String;", "getSelected$okhttp", "()Ljava/lang/String;", "setSelected$okhttp", "(Ljava/lang/String;)V", "", "unsupported", "Z", "getUnsupported$okhttp", "()Z", "setUnsupported$okhttp", "(Z)V", "<init>", "(Ljava/util/List;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class AlpnProvider implements InvocationHandler {
        public final List<String> protocols;
        @Nullable
        public String selected;
        public boolean unsupported;

        public AlpnProvider(@NotNull List<String> list) {
            this.protocols = list;
        }

        @Nullable
        public final String getSelected$okhttp() {
            return this.selected;
        }

        public final boolean getUnsupported$okhttp() {
            return this.unsupported;
        }

        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual((Object) name, (Object) "supports") && Intrinsics.areEqual((Object) Boolean.TYPE, (Object) returnType)) {
                return Boolean.TRUE;
            }
            if (!Intrinsics.areEqual((Object) name, (Object) "unsupported") || !Intrinsics.areEqual((Object) Void.TYPE, (Object) returnType)) {
                if (Intrinsics.areEqual((Object) name, (Object) "protocols")) {
                    if (objArr.length == 0) {
                        return this.protocols;
                    }
                }
                if ((Intrinsics.areEqual((Object) name, (Object) "selectProtocol") || Intrinsics.areEqual((Object) name, (Object) "select")) && Intrinsics.areEqual((Object) String.class, (Object) returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!this.protocols.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.selected = str;
                                        return str;
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.protocols.get(0);
                        this.selected = str2;
                        return str2;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!Intrinsics.areEqual((Object) name, (Object) "protocolSelected") && !Intrinsics.areEqual((Object) name, (Object) "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.selected = (String) obj4;
                        return null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                this.unsupported = true;
                return null;
            }
        }

        public final void setSelected$okhttp(@Nullable String str) {
            this.selected = str;
        }

        public final void setUnsupported$okhttp(boolean z) {
            this.unsupported = z;
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo47991d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "Lokhttp3/internal/platform/Platform;", "buildIfSupported", "()Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class Companion {
        public Companion() {
        }

        @Nullable
        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", EnvironmentCompat.MEDIA_UNKNOWN);
            try {
                Intrinsics.checkExpressionValueIsNotNull(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                Intrinsics.checkExpressionValueIsNotNull(method, "putMethod");
                Intrinsics.checkExpressionValueIsNotNull(method2, "getMethod");
                Intrinsics.checkExpressionValueIsNotNull(method3, "removeMethod");
                Intrinsics.checkExpressionValueIsNotNull(cls3, "clientProviderClass");
                Intrinsics.checkExpressionValueIsNotNull(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Jdk8WithJettyBootPlatform(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> cls, @NotNull Class<?> cls2) {
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    public void afterHandshake(@NotNull SSLSocket sSLSocket) {
        try {
            this.removeMethod.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends Protocol> list) {
        List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(alpnProtocolNames));
            this.putMethod.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
                if (!alpnProvider.getUnsupported$okhttp() && alpnProvider.getSelected$okhttp() == null) {
                    Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (alpnProvider.getUnsupported$okhttp()) {
                    return null;
                } else {
                    return alpnProvider.getSelected$okhttp();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
