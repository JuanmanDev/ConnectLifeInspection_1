package p648m.p660d.p662g;

import androidx.core.view.PointerIconCompat;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.facebook.stetho.websocket.WebSocketHandler;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.internal.p700ws.WebSocketExtensions;
import okhttp3.internal.p700ws.WebSocketProtocol;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.Opcode;
import org.java_websocket.enums.ReadyState;
import org.java_websocket.enums.Role;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import p648m.p660d.C9647d;
import p648m.p660d.p663h.C9656a;
import p648m.p660d.p663h.C9657b;
import p648m.p660d.p664i.C9659b;
import p648m.p660d.p664i.C9663f;
import p648m.p660d.p664i.C9664g;
import p648m.p660d.p665j.C9669a;
import p648m.p660d.p665j.C9670b;
import p648m.p660d.p665j.C9671c;
import p648m.p660d.p665j.C9676h;
import p648m.p660d.p665j.C9677i;
import p648m.p660d.p666k.C9678a;
import p648m.p660d.p666k.C9679b;
import p648m.p660d.p667l.C9680a;
import p648m.p660d.p667l.C9683c;
import p648m.p684g.C9805b;
import p648m.p684g.C9806c;

/* renamed from: m.d.g.b */
/* compiled from: Draft_6455 */
public class C9654b extends C9653a {

    /* renamed from: b */
    public final C9805b f18918b;

    /* renamed from: c */
    public C9657b f18919c;

    /* renamed from: d */
    public List<C9657b> f18920d;

    /* renamed from: e */
    public C9678a f18921e;

    /* renamed from: f */
    public List<C9678a> f18922f;

    /* renamed from: g */
    public C9663f f18923g;

    /* renamed from: h */
    public final List<ByteBuffer> f18924h;

    /* renamed from: i */
    public ByteBuffer f18925i;

    /* renamed from: j */
    public final SecureRandom f18926j;

    /* renamed from: k */
    public int f18927k;

    /* renamed from: m.d.g.b$a */
    /* compiled from: Draft_6455 */
    public class C9655a {

        /* renamed from: a */
        public int f18928a;

        /* renamed from: b */
        public int f18929b;

        public C9655a(C9654b bVar, int i, int i2) {
            this.f18928a = i;
            this.f18929b = i2;
        }

        /* renamed from: c */
        public final int mo50458c() {
            return this.f18928a;
        }

        /* renamed from: d */
        public final int mo50459d() {
            return this.f18929b;
        }
    }

    public C9654b() {
        this(Collections.emptyList());
    }

    /* renamed from: A */
    public final ByteBuffer mo50425A(C9663f fVar) {
        ByteBuffer f = fVar.mo50473f();
        int i = 0;
        boolean z = this.f18917a == Role.CLIENT;
        int N = mo50438N(f);
        ByteBuffer allocate = ByteBuffer.allocate((N > 1 ? N + 1 : N) + 1 + (z ? 4 : 0) + f.remaining());
        byte B = (byte) (mo50426B(fVar.mo50486c()) | ((byte) (fVar.mo50488e() ? -128 : 0)));
        if (fVar.mo50484a()) {
            B = (byte) (B | mo50436L(1));
        }
        if (fVar.mo50485b()) {
            B = (byte) (B | mo50436L(2));
        }
        if (fVar.mo50487d()) {
            B = (byte) (mo50436L(3) | B);
        }
        allocate.put(B);
        byte[] V = mo50446V((long) f.remaining(), N);
        if (N == 1) {
            allocate.put((byte) (V[0] | mo50432H(z)));
        } else if (N == 2) {
            allocate.put((byte) (mo50432H(z) | 126));
            allocate.put(V);
        } else if (N == 8) {
            allocate.put((byte) (mo50432H(z) | ByteCompanionObject.MAX_VALUE));
            allocate.put(V);
        } else {
            throw new IllegalStateException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f18926j.nextInt());
            allocate.put(allocate2.array());
            while (f.hasRemaining()) {
                allocate.put((byte) (f.get() ^ allocate2.get(i % 4)));
                i++;
            }
        } else {
            allocate.put(f);
            f.flip();
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: B */
    public final byte mo50426B(Opcode opcode) {
        if (opcode == Opcode.CONTINUOUS) {
            return 0;
        }
        if (opcode == Opcode.TEXT) {
            return 1;
        }
        if (opcode == Opcode.BINARY) {
            return 2;
        }
        if (opcode == Opcode.CLOSING) {
            return 8;
        }
        if (opcode == Opcode.PING) {
            return 9;
        }
        if (opcode == Opcode.PONG) {
            return 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + opcode.toString());
    }

    /* renamed from: C */
    public final String mo50427C(String str) {
        try {
            return C9680a.m26138g(MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: D */
    public final long mo50428D() {
        long j;
        synchronized (this.f18924h) {
            j = 0;
            for (ByteBuffer limit : this.f18924h) {
                j += (long) limit.limit();
            }
        }
        return j;
    }

    /* renamed from: E */
    public C9657b mo50429E() {
        return this.f18919c;
    }

    /* renamed from: F */
    public List<C9657b> mo50430F() {
        return this.f18920d;
    }

    /* renamed from: G */
    public List<C9678a> mo50431G() {
        return this.f18922f;
    }

    /* renamed from: H */
    public final byte mo50432H(boolean z) {
        if (z) {
            return ByteCompanionObject.MIN_VALUE;
        }
        return 0;
    }

    /* renamed from: I */
    public int mo50433I() {
        return this.f18927k;
    }

    /* renamed from: J */
    public final ByteBuffer mo50434J() {
        ByteBuffer allocate;
        synchronized (this.f18924h) {
            long j = 0;
            for (ByteBuffer limit : this.f18924h) {
                j += (long) limit.limit();
            }
            mo50455x();
            allocate = ByteBuffer.allocate((int) j);
            for (ByteBuffer put : this.f18924h) {
                allocate.put(put);
            }
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: K */
    public C9678a mo50435K() {
        return this.f18921e;
    }

    /* renamed from: L */
    public final byte mo50436L(int i) {
        if (i == 1) {
            return 64;
        }
        if (i != 2) {
            return i != 3 ? (byte) 0 : 16;
        }
        return 32;
    }

    /* renamed from: M */
    public final String mo50437M() {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(MAPCookie.GMT));
        return simpleDateFormat.format(instance.getTime());
    }

    /* renamed from: N */
    public final int mo50438N(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    /* renamed from: O */
    public final void mo50439O(C9647d dVar, RuntimeException runtimeException) {
        this.f18918b.error("Runtime exception during onWebsocketMessage", runtimeException);
        dVar.mo50370s().mo50384m(dVar, runtimeException);
    }

    /* renamed from: P */
    public final void mo50440P(C9647d dVar, C9663f fVar) {
        try {
            dVar.mo50370s().mo50381d(dVar, fVar.mo50473f());
        } catch (RuntimeException e) {
            mo50439O(dVar, e);
        }
    }

    /* renamed from: Q */
    public final void mo50441Q(C9647d dVar, C9663f fVar) {
        String str;
        int i;
        if (fVar instanceof C9659b) {
            C9659b bVar = (C9659b) fVar;
            i = bVar.mo50477n();
            str = bVar.mo50478o();
        } else {
            i = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
            str = "";
        }
        if (dVar.mo50369r() == ReadyState.CLOSING) {
            dVar.mo50358g(i, str, true);
        } else if (mo50415i() == CloseHandshakeType.TWOWAY) {
            dVar.mo50355d(i, str, true);
        } else {
            dVar.mo50366o(i, str, false);
        }
    }

    /* renamed from: R */
    public final void mo50442R(C9647d dVar, C9663f fVar, Opcode opcode) {
        if (opcode != Opcode.CONTINUOUS) {
            mo50444T(fVar);
        } else if (fVar.mo50488e()) {
            mo50443S(dVar, fVar);
        } else if (this.f18923g == null) {
            this.f18918b.error("Protocol error: Continuous frame sequence was not started.");
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        if (opcode == Opcode.TEXT && !C9683c.m26146b(fVar.mo50473f())) {
            this.f18918b.error("Protocol error: Payload is not UTF8");
            throw new InvalidDataException(PointerIconCompat.TYPE_CROSSHAIR);
        } else if (opcode == Opcode.CONTINUOUS && this.f18923g != null) {
            mo50454w(fVar.mo50473f());
        }
    }

    /* renamed from: S */
    public final void mo50443S(C9647d dVar, C9663f fVar) {
        if (this.f18923g != null) {
            mo50454w(fVar.mo50473f());
            mo50455x();
            if (this.f18923g.mo50486c() == Opcode.TEXT) {
                ((C9664g) this.f18923g).mo50476j(mo50434J());
                ((C9664g) this.f18923g).mo50474h();
                try {
                    dVar.mo50370s().mo50385n(dVar, C9683c.m26149e(this.f18923g.mo50473f()));
                } catch (RuntimeException e) {
                    mo50439O(dVar, e);
                }
            } else if (this.f18923g.mo50486c() == Opcode.BINARY) {
                ((C9664g) this.f18923g).mo50476j(mo50434J());
                ((C9664g) this.f18923g).mo50474h();
                try {
                    dVar.mo50370s().mo50381d(dVar, this.f18923g.mo50473f());
                } catch (RuntimeException e2) {
                    mo50439O(dVar, e2);
                }
            }
            this.f18923g = null;
            mo50456y();
            return;
        }
        this.f18918b.trace("Protocol error: Previous continuous frame sequence not completed.");
        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
    }

    /* renamed from: T */
    public final void mo50444T(C9663f fVar) {
        if (this.f18923g == null) {
            this.f18923g = fVar;
            mo50454w(fVar.mo50473f());
            mo50455x();
            return;
        }
        this.f18918b.trace("Protocol error: Previous continuous frame sequence not completed.");
        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
    }

    /* renamed from: U */
    public final void mo50445U(C9647d dVar, C9663f fVar) {
        try {
            dVar.mo50370s().mo50385n(dVar, C9683c.m26149e(fVar.mo50473f()));
        } catch (RuntimeException e) {
            mo50439O(dVar, e);
        }
    }

    /* renamed from: V */
    public final byte[] mo50446V(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((int) (j >>> (i2 - (i3 * 8))));
        }
        return bArr;
    }

    /* renamed from: W */
    public final Opcode mo50447W(byte b) {
        if (b == 0) {
            return Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Opcode.TEXT;
        }
        if (b == 2) {
            return Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Opcode.CLOSING;
            case 9:
                return Opcode.PING;
            case 10:
                return Opcode.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((short) b));
        }
    }

    /* renamed from: X */
    public final C9663f mo50448X(ByteBuffer byteBuffer) {
        String str;
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = 2;
            mo50450Z(remaining, 2);
            byte b = byteBuffer.get();
            boolean z = (b >> 8) != 0;
            boolean z2 = (b & 64) != 0;
            boolean z3 = (b & 32) != 0;
            boolean z4 = (b & 16) != 0;
            byte b2 = byteBuffer.get();
            boolean z5 = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
            int i2 = (byte) (b2 & ByteCompanionObject.MAX_VALUE);
            Opcode W = mo50447W((byte) (b & 15));
            if (i2 < 0 || i2 > 125) {
                C9655a a0 = mo50451a0(byteBuffer, W, i2, remaining, 2);
                i2 = a0.mo50458c();
                i = a0.mo50459d();
            }
            mo50449Y((long) i2);
            mo50450Z(remaining, i + (z5 ? 4 : 0) + i2);
            mo50410d(i2);
            ByteBuffer allocate = ByteBuffer.allocate(i2);
            if (z5) {
                byte[] bArr = new byte[4];
                byteBuffer.get(bArr);
                for (int i3 = 0; i3 < i2; i3++) {
                    allocate.put((byte) (byteBuffer.get() ^ bArr[i3 % 4]));
                }
            } else {
                allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                byteBuffer.position(byteBuffer.position() + allocate.limit());
            }
            C9664g g = C9664g.m26092g(W);
            g.mo50489i(z);
            g.mo50490k(z2);
            g.mo50491l(z3);
            g.mo50492m(z4);
            allocate.flip();
            g.mo50476j(allocate);
            mo50429E().mo50467g(g);
            mo50429E().mo50463d(g);
            if (this.f18918b.isTraceEnabled()) {
                C9805b bVar = this.f18918b;
                Integer valueOf = Integer.valueOf(g.mo50473f().remaining());
                if (g.mo50473f().remaining() > 1000) {
                    str = "too big to display";
                } else {
                    str = new String(g.mo50473f().array());
                }
                bVar.trace("afterDecoding({}): {}", valueOf, str);
            }
            g.mo50474h();
            return g;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Y */
    public final void mo50449Y(long j) {
        if (j <= 2147483647L) {
            int i = this.f18927k;
            if (j > ((long) i)) {
                this.f18918b.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
                throw new LimitExceededException("Payload limit reached.", this.f18927k);
            } else if (j < 0) {
                this.f18918b.trace("Limit underflow: Payloadsize is to little...");
                throw new LimitExceededException("Payloadsize is to little...");
            }
        } else {
            this.f18918b.trace("Limit exedeed: Payloadsize is to big...");
            throw new LimitExceededException("Payloadsize is to big...");
        }
    }

    /* renamed from: Z */
    public final void mo50450Z(int i, int i2) {
        if (i < i2) {
            this.f18918b.trace("Incomplete frame: maxpacketsize < realpacketsize");
            throw new IncompleteException(i2);
        }
    }

    /* renamed from: a */
    public HandshakeState mo50407a(C9669a aVar, C9676h hVar) {
        if (!mo50409c(hVar)) {
            this.f18918b.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return HandshakeState.NOT_MATCHED;
        } else if (!aVar.mo50501f(WebSocketHandler.HEADER_SEC_WEBSOCKET_KEY) || !hVar.mo50501f(WebSocketHandler.HEADER_SEC_WEBSOCKET_ACCEPT)) {
            this.f18918b.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return HandshakeState.NOT_MATCHED;
        } else {
            if (!mo50427C(aVar.mo50502j(WebSocketHandler.HEADER_SEC_WEBSOCKET_KEY)).equals(hVar.mo50502j(WebSocketHandler.HEADER_SEC_WEBSOCKET_ACCEPT))) {
                this.f18918b.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return HandshakeState.NOT_MATCHED;
            }
            HandshakeState handshakeState = HandshakeState.NOT_MATCHED;
            String j = hVar.mo50502j(WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION);
            Iterator<C9657b> it = this.f18920d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9657b next = it.next();
                if (next.mo50464e(j)) {
                    this.f18919c = next;
                    handshakeState = HandshakeState.MATCHED;
                    this.f18918b.trace("acceptHandshakeAsClient - Matching extension found: {}", (Object) next);
                    break;
                }
            }
            HandshakeState z = mo50457z(hVar.mo50502j(WebSocketHandler.HEADER_SEC_WEBSOCKET_PROTOCOL));
            HandshakeState handshakeState2 = HandshakeState.MATCHED;
            if (z == handshakeState2 && handshakeState == handshakeState2) {
                return handshakeState2;
            }
            this.f18918b.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
            return HandshakeState.NOT_MATCHED;
        }
    }

    /* renamed from: a0 */
    public final C9655a mo50451a0(ByteBuffer byteBuffer, Opcode opcode, int i, int i2, int i3) {
        int i4;
        int i5;
        if (opcode == Opcode.PING || opcode == Opcode.PONG || opcode == Opcode.CLOSING) {
            this.f18918b.trace("Invalid frame: more than 125 octets");
            throw new InvalidFrameException("more than 125 octets");
        }
        if (i == 126) {
            i4 = i3 + 2;
            mo50450Z(i2, i4);
            byte[] bArr = new byte[3];
            bArr[1] = byteBuffer.get();
            bArr[2] = byteBuffer.get();
            i5 = new BigInteger(bArr).intValue();
        } else {
            i4 = i3 + 8;
            mo50450Z(i2, i4);
            byte[] bArr2 = new byte[8];
            for (int i6 = 0; i6 < 8; i6++) {
                bArr2[i6] = byteBuffer.get();
            }
            long longValue = new BigInteger(bArr2).longValue();
            mo50449Y(longValue);
            i5 = (int) longValue;
        }
        return new C9655a(this, i5, i4);
    }

    /* renamed from: b */
    public HandshakeState mo50408b(C9669a aVar) {
        if (mo50419o(aVar) != 13) {
            this.f18918b.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return HandshakeState.NOT_MATCHED;
        }
        HandshakeState handshakeState = HandshakeState.NOT_MATCHED;
        String j = aVar.mo50502j(WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION);
        Iterator<C9657b> it = this.f18920d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9657b next = it.next();
            if (next.mo50462c(j)) {
                this.f18919c = next;
                handshakeState = HandshakeState.MATCHED;
                this.f18918b.trace("acceptHandshakeAsServer - Matching extension found: {}", (Object) next);
                break;
            }
        }
        HandshakeState z = mo50457z(aVar.mo50502j(WebSocketHandler.HEADER_SEC_WEBSOCKET_PROTOCOL));
        HandshakeState handshakeState2 = HandshakeState.MATCHED;
        if (z == handshakeState2 && handshakeState == handshakeState2) {
            return handshakeState2;
        }
        this.f18918b.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return HandshakeState.NOT_MATCHED;
    }

    /* renamed from: e */
    public C9653a mo50411e() {
        ArrayList arrayList = new ArrayList();
        for (C9657b b : mo50430F()) {
            arrayList.add(b.mo50461b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (C9678a b2 : mo50431G()) {
            arrayList2.add(b2.mo50504b());
        }
        return new C9654b(arrayList, arrayList2, this.f18927k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9654b.class != obj.getClass()) {
            return false;
        }
        C9654b bVar = (C9654b) obj;
        if (this.f18927k != bVar.mo50433I()) {
            return false;
        }
        C9657b bVar2 = this.f18919c;
        if (bVar2 == null ? bVar.mo50429E() != null : !bVar2.equals(bVar.mo50429E())) {
            return false;
        }
        C9678a aVar = this.f18921e;
        C9678a K = bVar.mo50435K();
        if (aVar != null) {
            return aVar.equals(K);
        }
        if (K == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo50412f(C9663f fVar) {
        String str;
        mo50429E().mo50466f(fVar);
        if (this.f18918b.isTraceEnabled()) {
            C9805b bVar = this.f18918b;
            Integer valueOf = Integer.valueOf(fVar.mo50473f().remaining());
            if (fVar.mo50473f().remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(fVar.mo50473f().array());
            }
            bVar.trace("afterEnconding({}): {}", valueOf, str);
        }
        return mo50425A(fVar);
    }

    public int hashCode() {
        C9657b bVar = this.f18919c;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C9678a aVar = this.f18921e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i2 = this.f18927k;
        return ((hashCode + i) * 31) + (i2 ^ (i2 >>> 32));
    }

    /* renamed from: i */
    public CloseHandshakeType mo50415i() {
        return CloseHandshakeType.TWOWAY;
    }

    /* renamed from: j */
    public C9670b mo50416j(C9670b bVar) {
        bVar.mo50495c("Upgrade", WebSocketHandler.HEADER_UPGRADE_WEBSOCKET);
        bVar.mo50495c(WebSocketHandler.HEADER_CONNECTION, "Upgrade");
        byte[] bArr = new byte[16];
        this.f18926j.nextBytes(bArr);
        bVar.mo50495c(WebSocketHandler.HEADER_SEC_WEBSOCKET_KEY, C9680a.m26138g(bArr));
        bVar.mo50495c(WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION, WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13);
        StringBuilder sb = new StringBuilder();
        for (C9657b next : this.f18920d) {
            if (!(next.mo50468h() == null || next.mo50468h().length() == 0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(next.mo50468h());
            }
        }
        if (sb.length() != 0) {
            bVar.mo50495c(WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (C9678a next2 : this.f18922f) {
            if (next2.mo50503a().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(next2.mo50503a());
            }
        }
        if (sb2.length() != 0) {
            bVar.mo50495c(WebSocketHandler.HEADER_SEC_WEBSOCKET_PROTOCOL, sb2.toString());
        }
        return bVar;
    }

    /* renamed from: k */
    public C9671c mo50417k(C9669a aVar, C9677i iVar) {
        iVar.mo50495c("Upgrade", WebSocketHandler.HEADER_UPGRADE_WEBSOCKET);
        iVar.mo50495c(WebSocketHandler.HEADER_CONNECTION, aVar.mo50502j(WebSocketHandler.HEADER_CONNECTION));
        String j = aVar.mo50502j(WebSocketHandler.HEADER_SEC_WEBSOCKET_KEY);
        if (j == null || "".equals(j)) {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        }
        iVar.mo50495c(WebSocketHandler.HEADER_SEC_WEBSOCKET_ACCEPT, mo50427C(j));
        if (mo50429E().mo50470i().length() != 0) {
            iVar.mo50495c(WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, mo50429E().mo50470i());
        }
        if (!(mo50435K() == null || mo50435K().mo50503a().length() == 0)) {
            iVar.mo50495c(WebSocketHandler.HEADER_SEC_WEBSOCKET_PROTOCOL, mo50435K().mo50503a());
        }
        iVar.mo50498i("Web Socket Protocol Handshake");
        iVar.mo50495c("Server", "TooTallNate Java-WebSocket");
        iVar.mo50495c("Date", mo50437M());
        return iVar;
    }

    /* renamed from: l */
    public void mo50418l(C9647d dVar, C9663f fVar) {
        Opcode c = fVar.mo50486c();
        if (c == Opcode.CLOSING) {
            mo50441Q(dVar, fVar);
        } else if (c == Opcode.PING) {
            dVar.mo50370s().mo50349l(dVar, fVar);
        } else if (c == Opcode.PONG) {
            dVar.mo50350A();
            dVar.mo50370s().mo50348k(dVar, fVar);
        } else if (!fVar.mo50488e() || c == Opcode.CONTINUOUS) {
            mo50442R(dVar, fVar, c);
        } else if (this.f18923g != null) {
            this.f18918b.error("Protocol error: Continuous frame sequence not completed.");
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        } else if (c == Opcode.TEXT) {
            mo50445U(dVar, fVar);
        } else if (c == Opcode.BINARY) {
            mo50440P(dVar, fVar);
        } else {
            this.f18918b.error("non control or continious frame expected");
            throw new InvalidDataException(1002, "non control or continious frame expected");
        }
    }

    /* renamed from: p */
    public void mo50420p() {
        this.f18925i = null;
        C9657b bVar = this.f18919c;
        if (bVar != null) {
            bVar.mo50460a();
        }
        this.f18919c = new C9656a();
        this.f18921e = null;
    }

    /* renamed from: r */
    public List<C9663f> mo50422r(ByteBuffer byteBuffer) {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f18925i == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f18925i.remaining();
                if (remaining2 > remaining) {
                    this.f18925i.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f18925i.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(mo50448X((ByteBuffer) this.f18925i.duplicate().position(0)));
                this.f18925i = null;
            } catch (IncompleteException e) {
                int preferredSize = e.getPreferredSize();
                mo50410d(preferredSize);
                ByteBuffer allocate = ByteBuffer.allocate(preferredSize);
                this.f18925i.rewind();
                allocate.put(this.f18925i);
                this.f18925i = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(mo50448X(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                int preferredSize2 = e2.getPreferredSize();
                mo50410d(preferredSize2);
                ByteBuffer allocate2 = ByteBuffer.allocate(preferredSize2);
                this.f18925i = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public String toString() {
        String aVar = super.toString();
        if (mo50429E() != null) {
            aVar = aVar + " extension: " + mo50429E().toString();
        }
        if (mo50435K() != null) {
            aVar = aVar + " protocol: " + mo50435K().toString();
        }
        return aVar + " max frame size: " + this.f18927k;
    }

    /* renamed from: w */
    public final void mo50454w(ByteBuffer byteBuffer) {
        synchronized (this.f18924h) {
            this.f18924h.add(byteBuffer);
        }
    }

    /* renamed from: x */
    public final void mo50455x() {
        long D = mo50428D();
        if (D > ((long) this.f18927k)) {
            mo50456y();
            this.f18918b.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f18927k), Long.valueOf(D));
            throw new LimitExceededException(this.f18927k);
        }
    }

    /* renamed from: y */
    public final void mo50456y() {
        synchronized (this.f18924h) {
            this.f18924h.clear();
        }
    }

    /* renamed from: z */
    public final HandshakeState mo50457z(String str) {
        for (C9678a next : this.f18922f) {
            if (next.mo50505c(str)) {
                this.f18921e = next;
                this.f18918b.trace("acceptHandshake - Matching protocol found: {}", (Object) next);
                return HandshakeState.MATCHED;
            }
        }
        return HandshakeState.NOT_MATCHED;
    }

    public C9654b(List<C9657b> list) {
        this(list, Collections.singletonList(new C9679b("")));
    }

    public C9654b(List<C9657b> list, List<C9678a> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public C9654b(List<C9657b> list, List<C9678a> list2, int i) {
        this.f18918b = C9806c.m26345i(C9654b.class);
        this.f18919c = new C9656a();
        this.f18926j = new SecureRandom();
        if (list == null || list2 == null || i < 1) {
            throw new IllegalArgumentException();
        }
        this.f18920d = new ArrayList(list.size());
        this.f18922f = new ArrayList(list2.size());
        boolean z = false;
        this.f18924h = new ArrayList();
        for (C9657b bVar : list) {
            if (bVar.getClass().equals(C9656a.class)) {
                z = true;
            }
        }
        this.f18920d.addAll(list);
        if (!z) {
            List<C9657b> list3 = this.f18920d;
            list3.add(list3.size(), this.f18919c);
        }
        this.f18922f.addAll(list2);
        this.f18927k = i;
    }
}
