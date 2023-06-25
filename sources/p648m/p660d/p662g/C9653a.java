package p648m.p660d.p662g;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.test.internal.runner.RunnerArgs;
import com.facebook.stetho.websocket.WebSocketHandler;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.Role;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import p648m.p660d.C9647d;
import p648m.p660d.p664i.C9663f;
import p648m.p660d.p665j.C9669a;
import p648m.p660d.p665j.C9670b;
import p648m.p660d.p665j.C9671c;
import p648m.p660d.p665j.C9672d;
import p648m.p660d.p665j.C9673e;
import p648m.p660d.p665j.C9674f;
import p648m.p660d.p665j.C9676h;
import p648m.p660d.p665j.C9677i;
import p648m.p660d.p667l.C9683c;

/* renamed from: m.d.g.a */
/* compiled from: Draft */
public abstract class C9653a {

    /* renamed from: a */
    public Role f18917a = null;

    /* renamed from: m */
    public static ByteBuffer m25990m(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    /* renamed from: n */
    public static String m25991n(ByteBuffer byteBuffer) {
        ByteBuffer m = m25990m(byteBuffer);
        if (m == null) {
            return null;
        }
        return C9683c.m26148d(m.array(), 0, m.limit());
    }

    /* renamed from: t */
    public static C9671c m25992t(ByteBuffer byteBuffer, Role role) {
        C9671c cVar;
        String n = m25991n(byteBuffer);
        if (n != null) {
            String[] split = n.split(" ", 3);
            if (split.length == 3) {
                if (role == Role.CLIENT) {
                    cVar = m25993u(split, n);
                } else {
                    cVar = m25994v(split, n);
                }
                String n2 = m25991n(byteBuffer);
                while (n2 != null && n2.length() > 0) {
                    String[] split2 = n2.split(RunnerArgs.CLASSPATH_SEPARATOR, 2);
                    if (split2.length == 2) {
                        if (cVar.mo50501f(split2[0])) {
                            String str = split2[0];
                            cVar.mo50495c(str, cVar.mo50502j(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
                        } else {
                            cVar.mo50495c(split2[0], split2[1].replaceFirst("^ +", ""));
                        }
                        n2 = m25991n(byteBuffer);
                    } else {
                        throw new InvalidHandshakeException("not an http header");
                    }
                }
                if (n2 != null) {
                    return cVar;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    /* renamed from: u */
    public static C9671c m25993u(String[] strArr, String str) {
        if (!"101".equals(strArr[1])) {
            throw new InvalidHandshakeException(String.format("Invalid status code received: %s Status line: %s", new Object[]{strArr[1], str}));
        } else if ("HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            C9673e eVar = new C9673e();
            eVar.mo50497g(Short.parseShort(strArr[1]));
            eVar.mo50498i(strArr[2]);
            return eVar;
        } else {
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", new Object[]{strArr[0], str}));
        }
    }

    /* renamed from: v */
    public static C9671c m25994v(String[] strArr, String str) {
        if (!ShareTarget.METHOD_GET.equalsIgnoreCase(strArr[0])) {
            throw new InvalidHandshakeException(String.format("Invalid request method received: %s Status line: %s", new Object[]{strArr[0], str}));
        } else if ("HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            C9672d dVar = new C9672d();
            dVar.mo50494h(strArr[1]);
            return dVar;
        } else {
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", new Object[]{strArr[2], str}));
        }
    }

    /* renamed from: a */
    public abstract HandshakeState mo50407a(C9669a aVar, C9676h hVar);

    /* renamed from: b */
    public abstract HandshakeState mo50408b(C9669a aVar);

    /* renamed from: c */
    public boolean mo50409c(C9674f fVar) {
        return fVar.mo50502j("Upgrade").equalsIgnoreCase(WebSocketHandler.HEADER_UPGRADE_WEBSOCKET) && fVar.mo50502j(WebSocketHandler.HEADER_CONNECTION).toLowerCase(Locale.ENGLISH).contains(Http2ExchangeCodec.UPGRADE);
    }

    /* renamed from: d */
    public int mo50410d(int i) {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    /* renamed from: e */
    public abstract C9653a mo50411e();

    /* renamed from: f */
    public abstract ByteBuffer mo50412f(C9663f fVar);

    /* renamed from: g */
    public List<ByteBuffer> mo50413g(C9674f fVar) {
        return mo50414h(fVar, true);
    }

    /* renamed from: h */
    public List<ByteBuffer> mo50414h(C9674f fVar, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(100);
        if (fVar instanceof C9669a) {
            sb.append("GET ");
            sb.append(((C9669a) fVar).mo50493a());
            sb.append(" HTTP/1.1");
        } else if (fVar instanceof C9676h) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((C9676h) fVar).mo50496d());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> b = fVar.mo50499b();
        while (b.hasNext()) {
            String next = b.next();
            String j = fVar.mo50502j(next);
            sb.append(next);
            sb.append(": ");
            sb.append(j);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a = C9683c.m26145a(sb.toString());
        byte[] e = z ? fVar.mo50500e() : null;
        if (e == null) {
            i = 0;
        } else {
            i = e.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + a.length);
        allocate.put(a);
        if (e != null) {
            allocate.put(e);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    /* renamed from: i */
    public abstract CloseHandshakeType mo50415i();

    /* renamed from: j */
    public abstract C9670b mo50416j(C9670b bVar);

    /* renamed from: k */
    public abstract C9671c mo50417k(C9669a aVar, C9677i iVar);

    /* renamed from: l */
    public abstract void mo50418l(C9647d dVar, C9663f fVar);

    /* renamed from: o */
    public int mo50419o(C9674f fVar) {
        String j = fVar.mo50502j(WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION);
        if (j.length() > 0) {
            try {
                return new Integer(j.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: p */
    public abstract void mo50420p();

    /* renamed from: q */
    public void mo50421q(Role role) {
        this.f18917a = role;
    }

    /* renamed from: r */
    public abstract List<C9663f> mo50422r(ByteBuffer byteBuffer);

    /* renamed from: s */
    public C9674f mo50423s(ByteBuffer byteBuffer) {
        return m25992t(byteBuffer, this.f18917a);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
