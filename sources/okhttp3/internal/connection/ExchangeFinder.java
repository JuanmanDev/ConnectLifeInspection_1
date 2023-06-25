package okhttp3.internal.connection;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000B'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b?\u0010@J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"R\u001c\u0010$\u001a\u00020#8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00100R\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00100R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, mo47991d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RealConnection;", "connectingConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "find", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "findConnection", "(IIIIZ)Lokhttp3/internal/connection/RealConnection;", "doExtensiveHealthChecks", "findHealthyConnection", "(IIIIZZ)Lokhttp3/internal/connection/RealConnection;", "retryAfterFailure", "()Z", "retryCurrentRoute", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "Ljava/io/IOException;", "e", "", "trackFailure", "(Ljava/io/IOException;)V", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "getAddress$okhttp", "()Lokhttp3/Address;", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionShutdownCount", "I", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "Lokhttp3/Route;", "nextRouteToTry", "Lokhttp3/Route;", "otherFailureCount", "refusedStreamCount", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: ExchangeFinder.kt */
public final class ExchangeFinder {
    @NotNull
    public final Address address;
    public final RealCall call;
    public RealConnection connectingConnection;
    public final RealConnectionPool connectionPool;
    public int connectionShutdownCount;
    public final EventListener eventListener;
    public Route nextRouteToTry;
    public int otherFailureCount;
    public int refusedStreamCount;
    public RouteSelector.Selection routeSelection;
    public RouteSelector routeSelector;

    public ExchangeFinder(@NotNull RealConnectionPool realConnectionPool, @NotNull Address address2, @NotNull RealCall realCall, @NotNull EventListener eventListener2) {
        this.connectionPool = realConnectionPool;
        this.address = address2;
        this.call = realCall;
        this.eventListener = eventListener2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final okhttp3.internal.connection.RealConnection findConnection(int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.RealCall r3 = r1.call     // Catch:{ all -> 0x01e2 }
            boolean r3 = r3.isCanceled()     // Catch:{ all -> 0x01e2 }
            if (r3 != 0) goto L_0x01da
            okhttp3.internal.connection.RealCall r3 = r1.call     // Catch:{ all -> 0x01e2 }
            okhttp3.internal.connection.RealConnection r3 = r3.getConnection()     // Catch:{ all -> 0x01e2 }
            r0.element = r3     // Catch:{ all -> 0x01e2 }
            r4 = 0
            if (r3 == 0) goto L_0x003c
            boolean r5 = r3.getNoNewExchanges()     // Catch:{ all -> 0x01e2 }
            if (r5 != 0) goto L_0x0035
            okhttp3.Route r3 = r3.route()     // Catch:{ all -> 0x01e2 }
            okhttp3.Address r3 = r3.address()     // Catch:{ all -> 0x01e2 }
            okhttp3.HttpUrl r3 = r3.url()     // Catch:{ all -> 0x01e2 }
            boolean r3 = r1.sameHostAndPort(r3)     // Catch:{ all -> 0x01e2 }
            if (r3 != 0) goto L_0x003c
        L_0x0035:
            okhttp3.internal.connection.RealCall r3 = r1.call     // Catch:{ all -> 0x01e2 }
            java.net.Socket r3 = r3.releaseConnectionNoEvents$okhttp()     // Catch:{ all -> 0x01e2 }
            goto L_0x003d
        L_0x003c:
            r3 = r4
        L_0x003d:
            okhttp3.internal.connection.RealCall r5 = r1.call     // Catch:{ all -> 0x01e2 }
            okhttp3.internal.connection.RealConnection r5 = r5.getConnection()     // Catch:{ all -> 0x01e2 }
            if (r5 == 0) goto L_0x004e
            okhttp3.internal.connection.RealCall r5 = r1.call     // Catch:{ all -> 0x01e2 }
            okhttp3.internal.connection.RealConnection r5 = r5.getConnection()     // Catch:{ all -> 0x01e2 }
            r0.element = r4     // Catch:{ all -> 0x01e2 }
            goto L_0x004f
        L_0x004e:
            r5 = r4
        L_0x004f:
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0077
            r1.refusedStreamCount = r7     // Catch:{ all -> 0x01e2 }
            r1.connectionShutdownCount = r7     // Catch:{ all -> 0x01e2 }
            r1.otherFailureCount = r7     // Catch:{ all -> 0x01e2 }
            okhttp3.internal.connection.RealConnectionPool r8 = r1.connectionPool     // Catch:{ all -> 0x01e2 }
            okhttp3.Address r9 = r1.address     // Catch:{ all -> 0x01e2 }
            okhttp3.internal.connection.RealCall r10 = r1.call     // Catch:{ all -> 0x01e2 }
            boolean r8 = r8.callAcquirePooledConnection(r9, r10, r4, r7)     // Catch:{ all -> 0x01e2 }
            if (r8 == 0) goto L_0x006e
            okhttp3.internal.connection.RealCall r5 = r1.call     // Catch:{ all -> 0x01e2 }
            okhttp3.internal.connection.RealConnection r5 = r5.getConnection()     // Catch:{ all -> 0x01e2 }
            r8 = r4
            r9 = r6
            goto L_0x0079
        L_0x006e:
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch:{ all -> 0x01e2 }
            if (r8 == 0) goto L_0x0077
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch:{ all -> 0x01e2 }
            r1.nextRouteToTry = r4     // Catch:{ all -> 0x01e2 }
            goto L_0x0078
        L_0x0077:
            r8 = r4
        L_0x0078:
            r9 = r7
        L_0x0079:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01e2 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0081
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r3)
        L_0x0081:
            T r0 = r0.element
            r2 = r0
            okhttp3.internal.connection.RealConnection r2 = (okhttp3.internal.connection.RealConnection) r2
            if (r2 == 0) goto L_0x0096
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            if (r0 != 0) goto L_0x0093
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0093:
            r2.connectionReleased(r3, r0)
        L_0x0096:
            if (r9 == 0) goto L_0x00a4
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r2 = r1.call
            if (r5 != 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a1:
            r0.connectionAcquired(r2, r5)
        L_0x00a4:
            if (r5 == 0) goto L_0x00ac
            if (r5 != 0) goto L_0x00ab
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ab:
            return r5
        L_0x00ac:
            if (r8 != 0) goto L_0x00e0
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection
            if (r0 == 0) goto L_0x00bd
            if (r0 != 0) goto L_0x00b7
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00b7:
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x00e0
        L_0x00bd:
            okhttp3.internal.connection.RouteSelector r0 = r1.routeSelector
            if (r0 != 0) goto L_0x00d8
            okhttp3.internal.connection.RouteSelector r0 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r2 = r1.address
            okhttp3.internal.connection.RealCall r3 = r1.call
            okhttp3.OkHttpClient r3 = r3.getClient()
            okhttp3.internal.connection.RouteDatabase r3 = r3.getRouteDatabase()
            okhttp3.internal.connection.RealCall r10 = r1.call
            okhttp3.EventListener r11 = r1.eventListener
            r0.<init>(r2, r3, r10, r11)
            r1.routeSelector = r0
        L_0x00d8:
            okhttp3.internal.connection.RouteSelector$Selection r0 = r0.next()
            r1.routeSelection = r0
            r0 = r6
            goto L_0x00e1
        L_0x00e0:
            r0 = r7
        L_0x00e1:
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.RealCall r3 = r1.call     // Catch:{ all -> 0x01d7 }
            boolean r3 = r3.isCanceled()     // Catch:{ all -> 0x01d7 }
            if (r3 != 0) goto L_0x01cf
            if (r0 == 0) goto L_0x010d
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x00f5
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01d7 }
        L_0x00f5:
            java.util.List r0 = r0.getRoutes()     // Catch:{ all -> 0x01d7 }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01d7 }
            okhttp3.Address r10 = r1.address     // Catch:{ all -> 0x01d7 }
            okhttp3.internal.connection.RealCall r11 = r1.call     // Catch:{ all -> 0x01d7 }
            boolean r3 = r3.callAcquirePooledConnection(r10, r11, r0, r7)     // Catch:{ all -> 0x01d7 }
            if (r3 == 0) goto L_0x010e
            okhttp3.internal.connection.RealCall r3 = r1.call     // Catch:{ all -> 0x01d7 }
            okhttp3.internal.connection.RealConnection r5 = r3.getConnection()     // Catch:{ all -> 0x01d7 }
            r9 = r6
            goto L_0x010e
        L_0x010d:
            r0 = r4
        L_0x010e:
            if (r9 != 0) goto L_0x012b
            if (r8 != 0) goto L_0x011d
            okhttp3.internal.connection.RouteSelector$Selection r3 = r1.routeSelection     // Catch:{ all -> 0x01d7 }
            if (r3 != 0) goto L_0x0119
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01d7 }
        L_0x0119:
            okhttp3.Route r8 = r3.next()     // Catch:{ all -> 0x01d7 }
        L_0x011d:
            okhttp3.internal.connection.RealConnection r5 = new okhttp3.internal.connection.RealConnection     // Catch:{ all -> 0x01d7 }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01d7 }
            if (r8 != 0) goto L_0x0126
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01d7 }
        L_0x0126:
            r5.<init>(r3, r8)     // Catch:{ all -> 0x01d7 }
            r1.connectingConnection = r5     // Catch:{ all -> 0x01d7 }
        L_0x012b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01d7 }
            monitor-exit(r2)
            if (r9 == 0) goto L_0x0142
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r2 = r1.call
            if (r5 != 0) goto L_0x0139
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0139:
            r0.connectionAcquired(r2, r5)
            if (r5 != 0) goto L_0x0141
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0141:
            return r5
        L_0x0142:
            if (r5 != 0) goto L_0x0147
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0147:
            okhttp3.internal.connection.RealCall r2 = r1.call
            okhttp3.EventListener r3 = r1.eventListener
            r10 = r5
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r2
            r17 = r3
            r10.connect(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.RealCall r2 = r1.call
            okhttp3.OkHttpClient r2 = r2.getClient()
            okhttp3.internal.connection.RouteDatabase r2 = r2.getRouteDatabase()
            if (r5 != 0) goto L_0x016c
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x016c:
            okhttp3.Route r3 = r5.route()
            r2.connected(r3)
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            r1.connectingConnection = r4     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01cc }
            okhttp3.Address r7 = r1.address     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealCall r9 = r1.call     // Catch:{ all -> 0x01cc }
            boolean r0 = r3.callAcquirePooledConnection(r7, r9, r0, r6)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019e
            if (r5 != 0) goto L_0x0189
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01cc }
        L_0x0189:
            r5.setNoNewExchanges(r6)     // Catch:{ all -> 0x01cc }
            if (r5 != 0) goto L_0x0191
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01cc }
        L_0x0191:
            java.net.Socket r4 = r5.socket()     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealConnection r5 = r0.getConnection()     // Catch:{ all -> 0x01cc }
            r1.nextRouteToTry = r8     // Catch:{ all -> 0x01cc }
            goto L_0x01b2
        L_0x019e:
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch:{ all -> 0x01cc }
            if (r5 != 0) goto L_0x01a5
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01cc }
        L_0x01a5:
            r0.put(r5)     // Catch:{ all -> 0x01cc }
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch:{ all -> 0x01cc }
            if (r5 != 0) goto L_0x01af
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01cc }
        L_0x01af:
            r0.acquireConnectionNoEvents(r5)     // Catch:{ all -> 0x01cc }
        L_0x01b2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01cc }
            monitor-exit(r2)
            if (r4 == 0) goto L_0x01ba
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r4)
        L_0x01ba:
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r2 = r1.call
            if (r5 != 0) goto L_0x01c3
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01c3:
            r0.connectionAcquired(r2, r5)
            if (r5 != 0) goto L_0x01cb
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01cb:
            return r5
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01cf:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01d7 }
            throw r0     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01da:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01e2 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01e2 }
            throw r0     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            RealConnection findConnection = findConnection(i, i2, i3, i4, z);
            if (findConnection.isHealthy(z2)) {
                return findConnection;
            }
            findConnection.noNewExchanges();
            synchronized (this.connectionPool) {
                if (this.nextRouteToTry == null) {
                    RouteSelector.Selection selection = this.routeSelection;
                    boolean z3 = true;
                    if (!(selection != null ? selection.hasNext() : true)) {
                        RouteSelector routeSelector2 = this.routeSelector;
                        if (routeSelector2 != null) {
                            z3 = routeSelector2.hasNext();
                        }
                        if (!z3) {
                            throw new IOException("exhausted all routes");
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private final boolean retryCurrentRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null || connection.getRouteFailureCount$okhttp() != 0 || !Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
            return false;
        }
        return true;
    }

    @Nullable
    public final RealConnection connectingConnection() {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnectionPool)) {
            return this.connectingConnection;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnectionPool);
        throw new AssertionError(sb.toString());
    }

    @NotNull
    public final ExchangeCodec find(@NotNull OkHttpClient okHttpClient, @NotNull RealInterceptorChain realInterceptorChain) {
        try {
            return findHealthyConnection(realInterceptorChain.getConnectTimeoutMillis$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), realInterceptorChain.getWriteTimeoutMillis$okhttp(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), !Intrinsics.areEqual((Object) realInterceptorChain.getRequest$okhttp().method(), (Object) ShareTarget.METHOD_GET)).newCodec$okhttp(okHttpClient, realInterceptorChain);
        } catch (RouteException e) {
            trackFailure(e.getLastConnectException());
            throw e;
        } catch (IOException e2) {
            trackFailure(e2);
            throw new RouteException(e2);
        }
    }

    @NotNull
    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        synchronized (this.connectionPool) {
            if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
                return false;
            }
            if (this.nextRouteToTry != null) {
                return true;
            }
            if (retryCurrentRoute()) {
                RealConnection connection = this.call.getConnection();
                if (connection == null) {
                    Intrinsics.throwNpe();
                }
                this.nextRouteToTry = connection.route();
                return true;
            }
            RouteSelector.Selection selection = this.routeSelection;
            if (selection != null && selection.hasNext()) {
                return true;
            }
            RouteSelector routeSelector2 = this.routeSelector;
            if (routeSelector2 == null) {
                return true;
            }
            boolean hasNext = routeSelector2.hasNext();
            return hasNext;
        }
    }

    public final boolean sameHostAndPort(@NotNull HttpUrl httpUrl) {
        HttpUrl url = this.address.url();
        return httpUrl.port() == url.port() && Intrinsics.areEqual((Object) httpUrl.host(), (Object) url.host());
    }

    public final void trackFailure(@NotNull IOException iOException) {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (!Util.assertionsEnabled || !Thread.holdsLock(realConnectionPool)) {
            synchronized (this.connectionPool) {
                this.nextRouteToTry = null;
                if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    this.refusedStreamCount++;
                } else if (iOException instanceof ConnectionShutdownException) {
                    this.connectionShutdownCount++;
                } else {
                    this.otherFailureCount++;
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(realConnectionPool);
        throw new AssertionError(sb.toString());
    }
}
