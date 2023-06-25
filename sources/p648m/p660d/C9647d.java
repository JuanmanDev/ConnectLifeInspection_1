package p648m.p660d;

import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.ReadyState;
import org.java_websocket.enums.Role;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import p648m.p660d.p662g.C9653a;
import p648m.p660d.p664i.C9663f;
import p648m.p660d.p664i.C9666h;
import p648m.p660d.p665j.C9669a;
import p648m.p660d.p665j.C9670b;
import p648m.p660d.p665j.C9674f;
import p648m.p660d.p665j.C9676h;
import p648m.p660d.p665j.C9677i;
import p648m.p660d.p667l.C9683c;
import p648m.p684g.C9805b;
import p648m.p684g.C9806c;

/* renamed from: m.d.d */
/* compiled from: WebSocketImpl */
public class C9647d implements C9645b {

    /* renamed from: A */
    public long f18884A = System.nanoTime();

    /* renamed from: B */
    public final Object f18885B = new Object();

    /* renamed from: e */
    public final C9805b f18886e = C9806c.m26345i(C9647d.class);

    /* renamed from: l */
    public final BlockingQueue<ByteBuffer> f18887l;

    /* renamed from: m */
    public final C9648e f18888m;

    /* renamed from: n */
    public SelectionKey f18889n;

    /* renamed from: o */
    public ByteChannel f18890o;

    /* renamed from: p */
    public boolean f18891p = false;

    /* renamed from: q */
    public volatile ReadyState f18892q = ReadyState.NOT_YET_CONNECTED;

    /* renamed from: r */
    public List<C9653a> f18893r;

    /* renamed from: s */
    public C9653a f18894s = null;

    /* renamed from: t */
    public Role f18895t;

    /* renamed from: u */
    public ByteBuffer f18896u = ByteBuffer.allocate(0);

    /* renamed from: v */
    public C9669a f18897v = null;

    /* renamed from: w */
    public String f18898w = null;

    /* renamed from: x */
    public Integer f18899x = null;

    /* renamed from: y */
    public Boolean f18900y = null;

    /* renamed from: z */
    public String f18901z = null;

    public C9647d(C9648e eVar, C9653a aVar) {
        if (eVar == null || (aVar == null && this.f18895t == Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f18887l = new LinkedBlockingQueue();
        new LinkedBlockingQueue();
        this.f18888m = eVar;
        this.f18895t = Role.CLIENT;
        if (aVar != null) {
            this.f18894s = aVar.mo50411e();
        }
    }

    /* renamed from: A */
    public void mo50350A() {
        this.f18884A = System.nanoTime();
    }

    /* renamed from: B */
    public final void mo50351B(ByteBuffer byteBuffer) {
        this.f18886e.trace("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        this.f18887l.add(byteBuffer);
        this.f18888m.mo50382e(this);
    }

    /* renamed from: C */
    public final void mo50352C(List<ByteBuffer> list) {
        synchronized (this.f18885B) {
            for (ByteBuffer B : list) {
                mo50351B(B);
            }
        }
    }

    /* renamed from: a */
    public void mo50353a(int i) {
        mo50355d(i, "", false);
    }

    /* renamed from: b */
    public void mo50354b(int i, String str) {
        mo50355d(i, str, false);
    }

    /* renamed from: c */
    public void mo50343c(C9663f fVar) {
        mo50376x(Collections.singletonList(fVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo50355d(int r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            org.java_websocket.enums.ReadyState r0 = r5.f18892q     // Catch:{ all -> 0x0086 }
            org.java_websocket.enums.ReadyState r1 = org.java_websocket.enums.ReadyState.CLOSING     // Catch:{ all -> 0x0086 }
            if (r0 == r1) goto L_0x0084
            org.java_websocket.enums.ReadyState r0 = r5.f18892q     // Catch:{ all -> 0x0086 }
            org.java_websocket.enums.ReadyState r1 = org.java_websocket.enums.ReadyState.CLOSED     // Catch:{ all -> 0x0086 }
            if (r0 == r1) goto L_0x0084
            org.java_websocket.enums.ReadyState r0 = r5.f18892q     // Catch:{ all -> 0x0086 }
            org.java_websocket.enums.ReadyState r1 = org.java_websocket.enums.ReadyState.OPEN     // Catch:{ all -> 0x0086 }
            r2 = 0
            if (r0 != r1) goto L_0x0067
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r6 != r0) goto L_0x0021
            org.java_websocket.enums.ReadyState r8 = org.java_websocket.enums.ReadyState.CLOSING     // Catch:{ all -> 0x0086 }
            r5.f18892q = r8     // Catch:{ all -> 0x0086 }
            r5.mo50366o(r6, r7, r2)     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)
            return
        L_0x0021:
            m.d.g.a r1 = r5.f18894s     // Catch:{ all -> 0x0086 }
            org.java_websocket.enums.CloseHandshakeType r1 = r1.mo50415i()     // Catch:{ all -> 0x0086 }
            org.java_websocket.enums.CloseHandshakeType r3 = org.java_websocket.enums.CloseHandshakeType.NONE     // Catch:{ all -> 0x0086 }
            if (r1 == r3) goto L_0x0063
            if (r8 != 0) goto L_0x0039
            m.d.e r1 = r5.f18888m     // Catch:{ RuntimeException -> 0x0033 }
            r1.mo50383h(r5, r6, r7)     // Catch:{ RuntimeException -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r1 = move-exception
            m.d.e r3 = r5.f18888m     // Catch:{ InvalidDataException -> 0x0051 }
            r3.mo50384m(r5, r1)     // Catch:{ InvalidDataException -> 0x0051 }
        L_0x0039:
            boolean r1 = r5.mo50374v()     // Catch:{ InvalidDataException -> 0x0051 }
            if (r1 == 0) goto L_0x0063
            m.d.i.b r1 = new m.d.i.b     // Catch:{ InvalidDataException -> 0x0051 }
            r1.<init>()     // Catch:{ InvalidDataException -> 0x0051 }
            r1.mo50480q(r7)     // Catch:{ InvalidDataException -> 0x0051 }
            r1.mo50479p(r6)     // Catch:{ InvalidDataException -> 0x0051 }
            r1.mo50474h()     // Catch:{ InvalidDataException -> 0x0051 }
            r5.mo50343c(r1)     // Catch:{ InvalidDataException -> 0x0051 }
            goto L_0x0063
        L_0x0051:
            r1 = move-exception
            m.g.b r3 = r5.f18886e     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "generated frame is invalid"
            r3.error(r4, r1)     // Catch:{ all -> 0x0086 }
            m.d.e r3 = r5.f18888m     // Catch:{ all -> 0x0086 }
            r3.mo50384m(r5, r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "generated frame is invalid"
            r5.mo50366o(r0, r1, r2)     // Catch:{ all -> 0x0086 }
        L_0x0063:
            r5.mo50366o(r6, r7, r8)     // Catch:{ all -> 0x0086 }
            goto L_0x007b
        L_0x0067:
            r0 = -3
            if (r6 != r0) goto L_0x006f
            r6 = 1
            r5.mo50366o(r0, r7, r6)     // Catch:{ all -> 0x0086 }
            goto L_0x007b
        L_0x006f:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r6 != r0) goto L_0x0077
            r5.mo50366o(r6, r7, r8)     // Catch:{ all -> 0x0086 }
            goto L_0x007b
        L_0x0077:
            r6 = -1
            r5.mo50366o(r6, r7, r2)     // Catch:{ all -> 0x0086 }
        L_0x007b:
            org.java_websocket.enums.ReadyState r6 = org.java_websocket.enums.ReadyState.CLOSING     // Catch:{ all -> 0x0086 }
            r5.f18892q = r6     // Catch:{ all -> 0x0086 }
            r6 = 0
            r5.f18896u = r6     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)
            return
        L_0x0084:
            monitor-exit(r5)
            return
        L_0x0086:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p648m.p660d.C9647d.mo50355d(int, java.lang.String, boolean):void");
    }

    /* renamed from: e */
    public void mo50356e(InvalidDataException invalidDataException) {
        mo50355d(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    /* renamed from: f */
    public void mo50357f(int i, String str) {
        mo50358g(i, str, false);
    }

    /* renamed from: g */
    public synchronized void mo50358g(int i, String str, boolean z) {
        if (this.f18892q != ReadyState.CLOSED) {
            if (this.f18892q == ReadyState.OPEN && i == 1006) {
                this.f18892q = ReadyState.CLOSING;
            }
            if (this.f18889n != null) {
                this.f18889n.cancel();
            }
            if (this.f18890o != null) {
                try {
                    this.f18890o.close();
                } catch (IOException e) {
                    if (e.getMessage() == null || !e.getMessage().equals("Broken pipe")) {
                        this.f18886e.error("Exception during channel.close()", e);
                        this.f18888m.mo50384m(this, e);
                    } else {
                        this.f18886e.trace("Caught IOException: Broken pipe during closeConnection()", (Throwable) e);
                    }
                }
            }
            try {
                this.f18888m.mo50386o(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f18888m.mo50384m(this, e2);
            }
            if (this.f18894s != null) {
                this.f18894s.mo50420p();
            }
            this.f18897v = null;
            this.f18892q = ReadyState.CLOSED;
        }
    }

    /* renamed from: h */
    public void mo50359h(int i, boolean z) {
        mo50358g(i, "", z);
    }

    /* renamed from: i */
    public final void mo50360i(RuntimeException runtimeException) {
        mo50351B(mo50367p(500));
        mo50366o(-1, runtimeException.getMessage(), false);
    }

    /* renamed from: j */
    public final void mo50361j(InvalidDataException invalidDataException) {
        mo50351B(mo50367p(HttpStatus.HTTP_NOT_FOUND));
        mo50366o(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    /* renamed from: k */
    public void mo50362k(ByteBuffer byteBuffer) {
        String str;
        C9805b bVar = this.f18886e;
        Integer valueOf = Integer.valueOf(byteBuffer.remaining());
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        bVar.trace("process({}): ({})", valueOf, str);
        if (this.f18892q != ReadyState.NOT_YET_CONNECTED) {
            if (this.f18892q == ReadyState.OPEN) {
                mo50363l(byteBuffer);
            }
        } else if (mo50364m(byteBuffer) && !mo50373u() && !mo50371t()) {
            if (byteBuffer.hasRemaining()) {
                mo50363l(byteBuffer);
            } else if (this.f18896u.hasRemaining()) {
                mo50363l(this.f18896u);
            }
        }
    }

    /* renamed from: l */
    public final void mo50363l(ByteBuffer byteBuffer) {
        try {
            for (C9663f next : this.f18894s.mo50422r(byteBuffer)) {
                this.f18886e.trace("matched frame: {}", (Object) next);
                this.f18894s.mo50418l(this, next);
            }
        } catch (LimitExceededException e) {
            if (e.getLimit() == Integer.MAX_VALUE) {
                this.f18886e.error("Closing due to invalid size of frame", e);
                this.f18888m.mo50384m(this, e);
            }
            mo50356e(e);
        } catch (InvalidDataException e2) {
            this.f18886e.error("Closing due to invalid data in frame", e2);
            this.f18888m.mo50384m(this, e2);
            mo50356e(e2);
        }
    }

    /* renamed from: m */
    public final boolean mo50364m(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.f18896u.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f18896u.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f18896u.capacity() + byteBuffer.remaining());
                this.f18896u.flip();
                allocate.put(this.f18896u);
                this.f18896u = allocate;
            }
            this.f18896u.put(byteBuffer);
            this.f18896u.flip();
            byteBuffer2 = this.f18896u;
        }
        byteBuffer2.mark();
        try {
            if (this.f18895t != Role.SERVER) {
                if (this.f18895t == Role.CLIENT) {
                    this.f18894s.mo50421q(this.f18895t);
                    C9674f s = this.f18894s.mo50423s(byteBuffer2);
                    if (!(s instanceof C9676h)) {
                        this.f18886e.trace("Closing due to protocol error: wrong http function");
                        mo50366o(1002, "wrong http function", false);
                        return false;
                    }
                    C9676h hVar = (C9676h) s;
                    if (this.f18894s.mo50407a(this.f18897v, hVar) == HandshakeState.MATCHED) {
                        try {
                            this.f18888m.mo50346i(this, this.f18897v, hVar);
                            mo50375w(hVar);
                            return true;
                        } catch (InvalidDataException e) {
                            this.f18886e.trace("Closing due to invalid data exception. Possible handshake rejection", (Throwable) e);
                            mo50366o(e.getCloseCode(), e.getMessage(), false);
                            return false;
                        } catch (RuntimeException e2) {
                            this.f18886e.error("Closing since client was never connected", e2);
                            this.f18888m.mo50384m(this, e2);
                            mo50366o(-1, e2.getMessage(), false);
                            return false;
                        }
                    } else {
                        this.f18886e.trace("Closing due to protocol error: draft {} refuses handshake", (Object) this.f18894s);
                        mo50354b(1002, "draft " + this.f18894s + " refuses handshake");
                    }
                }
                return false;
            } else if (this.f18894s == null) {
                for (C9653a e3 : this.f18893r) {
                    C9653a e4 = e3.mo50411e();
                    try {
                        e4.mo50421q(this.f18895t);
                        byteBuffer2.reset();
                        C9674f s2 = e4.mo50423s(byteBuffer2);
                        if (!(s2 instanceof C9669a)) {
                            this.f18886e.trace("Closing due to wrong handshake");
                            mo50361j(new InvalidDataException(1002, "wrong http function"));
                            return false;
                        }
                        C9669a aVar = (C9669a) s2;
                        if (e4.mo50408b(aVar) == HandshakeState.MATCHED) {
                            this.f18901z = aVar.mo50493a();
                            try {
                                C9677i g = this.f18888m.mo50345g(this, e4, aVar);
                                e4.mo50417k(aVar, g);
                                mo50352C(e4.mo50413g(g));
                                this.f18894s = e4;
                                mo50375w(aVar);
                                return true;
                            } catch (InvalidDataException e5) {
                                this.f18886e.trace("Closing due to wrong handshake. Possible handshake rejection", (Throwable) e5);
                                mo50361j(e5);
                                return false;
                            } catch (RuntimeException e6) {
                                this.f18886e.error("Closing due to internal server error", e6);
                                this.f18888m.mo50384m(this, e6);
                                mo50360i(e6);
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } catch (InvalidHandshakeException unused) {
                    }
                }
                if (this.f18894s == null) {
                    this.f18886e.trace("Closing due to protocol error: no draft matches");
                    mo50361j(new InvalidDataException(1002, "no draft matches"));
                }
                return false;
            } else {
                C9674f s3 = this.f18894s.mo50423s(byteBuffer2);
                if (!(s3 instanceof C9669a)) {
                    this.f18886e.trace("Closing due to protocol error: wrong http function");
                    mo50366o(1002, "wrong http function", false);
                    return false;
                }
                C9669a aVar2 = (C9669a) s3;
                if (this.f18894s.mo50408b(aVar2) == HandshakeState.MATCHED) {
                    mo50375w(aVar2);
                    return true;
                }
                this.f18886e.trace("Closing due to protocol error: the handshake did finally not match");
                mo50354b(1002, "the handshake did finally not match");
                return false;
            }
        } catch (InvalidHandshakeException e7) {
            try {
                this.f18886e.trace("Closing due to invalid handshake", (Throwable) e7);
                mo50356e(e7);
            } catch (IncompleteHandshakeException e8) {
                if (this.f18896u.capacity() == 0) {
                    byteBuffer2.reset();
                    int preferredSize = e8.getPreferredSize();
                    if (preferredSize == 0) {
                        preferredSize = byteBuffer2.capacity() + 16;
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(preferredSize);
                    this.f18896u = allocate2;
                    allocate2.put(byteBuffer);
                } else {
                    ByteBuffer byteBuffer3 = this.f18896u;
                    byteBuffer3.position(byteBuffer3.limit());
                    ByteBuffer byteBuffer4 = this.f18896u;
                    byteBuffer4.limit(byteBuffer4.capacity());
                }
            }
        }
    }

    /* renamed from: n */
    public void mo50365n() {
        if (this.f18892q == ReadyState.NOT_YET_CONNECTED) {
            mo50359h(-1, true);
        } else if (this.f18891p) {
            mo50358g(this.f18899x.intValue(), this.f18898w, this.f18900y.booleanValue());
        } else if (this.f18894s.mo50415i() == CloseHandshakeType.NONE) {
            mo50359h(1000, true);
        } else if (this.f18894s.mo50415i() != CloseHandshakeType.ONEWAY) {
            mo50359h(1006, true);
        } else if (this.f18895t == Role.SERVER) {
            mo50359h(1006, true);
        } else {
            mo50359h(1000, true);
        }
    }

    /* renamed from: o */
    public synchronized void mo50366o(int i, String str, boolean z) {
        if (!this.f18891p) {
            this.f18899x = Integer.valueOf(i);
            this.f18898w = str;
            this.f18900y = Boolean.valueOf(z);
            this.f18891p = true;
            this.f18888m.mo50382e(this);
            try {
                this.f18888m.mo50380b(this, i, str, z);
            } catch (RuntimeException e) {
                this.f18886e.error("Exception in onWebsocketClosing", e);
                this.f18888m.mo50384m(this, e);
            }
            if (this.f18894s != null) {
                this.f18894s.mo50420p();
            }
            this.f18897v = null;
        }
    }

    /* renamed from: p */
    public final ByteBuffer mo50367p(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(C9683c.m26145a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    /* renamed from: q */
    public long mo50368q() {
        return this.f18884A;
    }

    /* renamed from: r */
    public ReadyState mo50369r() {
        return this.f18892q;
    }

    /* renamed from: s */
    public C9648e mo50370s() {
        return this.f18888m;
    }

    /* renamed from: t */
    public boolean mo50371t() {
        return this.f18892q == ReadyState.CLOSED;
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public boolean mo50373u() {
        return this.f18892q == ReadyState.CLOSING;
    }

    /* renamed from: v */
    public boolean mo50374v() {
        return this.f18892q == ReadyState.OPEN;
    }

    /* renamed from: w */
    public final void mo50375w(C9674f fVar) {
        this.f18886e.trace("open using draft: {}", (Object) this.f18894s);
        this.f18892q = ReadyState.OPEN;
        try {
            this.f18888m.mo50379a(this, fVar);
        } catch (RuntimeException e) {
            this.f18888m.mo50384m(this, e);
        }
    }

    /* renamed from: x */
    public final void mo50376x(Collection<C9663f> collection) {
        if (!mo50374v()) {
            throw new WebsocketNotConnectedException();
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (C9663f next : collection) {
                this.f18886e.trace("send frame: {}", (Object) next);
                arrayList.add(this.f18894s.mo50412f(next));
            }
            mo50352C(arrayList);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: y */
    public void mo50377y() {
        C9666h f = this.f18888m.mo50344f(this);
        if (f != null) {
            mo50343c(f);
            return;
        }
        throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
    }

    /* renamed from: z */
    public void mo50378z(C9670b bVar) {
        this.f18894s.mo50416j(bVar);
        this.f18897v = bVar;
        this.f18901z = bVar.mo50493a();
        try {
            this.f18888m.mo50347j(this, this.f18897v);
            mo50352C(this.f18894s.mo50413g(this.f18897v));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.f18886e.error("Exception in startHandshake", e);
            this.f18888m.mo50384m(this, e);
            throw new InvalidHandshakeException("rejected because of " + e);
        }
    }
}
