package p648m.p660d.p661f;

import androidx.test.internal.runner.RunnerArgs;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import p648m.p660d.C9643a;
import p648m.p660d.C9645b;
import p648m.p660d.C9647d;
import p648m.p660d.p662g.C9653a;
import p648m.p660d.p662g.C9654b;
import p648m.p660d.p664i.C9663f;
import p648m.p660d.p665j.C9672d;
import p648m.p660d.p665j.C9674f;
import p648m.p660d.p665j.C9676h;

/* renamed from: m.d.f.b */
/* compiled from: WebSocketClient */
public abstract class C9650b extends C9643a implements Runnable, C9645b {

    /* renamed from: A */
    public Map<String, String> f18902A;

    /* renamed from: B */
    public CountDownLatch f18903B;

    /* renamed from: C */
    public CountDownLatch f18904C;

    /* renamed from: D */
    public int f18905D;

    /* renamed from: E */
    public C9649a f18906E;

    /* renamed from: s */
    public URI f18907s;

    /* renamed from: t */
    public C9647d f18908t;

    /* renamed from: u */
    public Socket f18909u;

    /* renamed from: v */
    public SocketFactory f18910v;

    /* renamed from: w */
    public OutputStream f18911w;

    /* renamed from: x */
    public Proxy f18912x;

    /* renamed from: y */
    public Thread f18913y;

    /* renamed from: z */
    public Thread f18914z;

    /* renamed from: m.d.f.b$a */
    /* compiled from: WebSocketClient */
    public class C9651a implements C9649a {
        public C9651a(C9650b bVar) {
        }

        /* renamed from: a */
        public InetAddress mo50387a(URI uri) {
            return InetAddress.getByName(uri.getHost());
        }
    }

    /* renamed from: m.d.f.b$b */
    /* compiled from: WebSocketClient */
    public class C9652b implements Runnable {

        /* renamed from: e */
        public final C9650b f18915e;

        public C9652b(C9650b bVar) {
            this.f18915e = bVar;
        }

        /* renamed from: a */
        public final void mo50404a() {
            try {
                if (C9650b.this.f18909u != null) {
                    C9650b.this.f18909u.close();
                }
            } catch (IOException e) {
                C9650b.this.mo50384m(this.f18915e, e);
            }
        }

        /* renamed from: b */
        public final void mo50405b() {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = C9650b.this.f18908t.f18887l.take();
                    C9650b.this.f18911w.write(take.array(), 0, take.limit());
                    C9650b.this.f18911w.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : C9650b.this.f18908t.f18887l) {
                        C9650b.this.f18911w.write(byteBuffer.array(), 0, byteBuffer.limit());
                        C9650b.this.f18911w.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        public void run() {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                mo50405b();
            } catch (IOException e) {
                C9650b.this.mo50392L(e);
            } catch (Throwable th) {
                mo50404a();
                Thread unused = C9650b.this.f18913y = null;
                throw th;
            }
            mo50404a();
            Thread unused2 = C9650b.this.f18913y = null;
        }
    }

    public C9650b(URI uri) {
        this(uri, new C9654b());
    }

    /* renamed from: H */
    public void mo50388H() {
        if (this.f18913y != null) {
            this.f18908t.mo50353a(1000);
        }
    }

    /* renamed from: I */
    public void mo50389I(int i, String str) {
        this.f18908t.mo50354b(i, str);
    }

    /* renamed from: J */
    public void mo50390J() {
        if (this.f18914z == null) {
            Thread thread = new Thread(this);
            this.f18914z = thread;
            thread.setName("WebSocketConnectReadThread-" + this.f18914z.getId());
            this.f18914z.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    /* renamed from: K */
    public final int mo50391K() {
        int port = this.f18907s.getPort();
        String scheme = this.f18907s.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
            return port;
        } else if (!"ws".equals(scheme)) {
            throw new IllegalArgumentException("unknown scheme: " + scheme);
        } else if (port == -1) {
            return 80;
        } else {
            return port;
        }
    }

    /* renamed from: L */
    public final void mo50392L(IOException iOException) {
        if (iOException instanceof SSLException) {
            mo33241S(iOException);
        }
        this.f18908t.mo50365n();
    }

    /* renamed from: M */
    public boolean mo50393M() {
        return this.f18908t.mo50371t();
    }

    /* renamed from: N */
    public boolean mo50394N() {
        return this.f18908t.mo50373u();
    }

    /* renamed from: O */
    public boolean mo50395O() {
        return this.f18908t.mo50374v();
    }

    /* renamed from: P */
    public abstract void mo33240P(int i, String str, boolean z);

    /* renamed from: Q */
    public void mo50396Q(int i, String str) {
    }

    /* renamed from: R */
    public void mo50397R(int i, String str, boolean z) {
    }

    /* renamed from: S */
    public abstract void mo33241S(Exception exc);

    /* renamed from: T */
    public abstract void mo33242T(String str);

    /* renamed from: U */
    public void mo50398U(ByteBuffer byteBuffer) {
    }

    /* renamed from: V */
    public abstract void mo33243V(C9676h hVar);

    /* renamed from: W */
    public void mo50399W(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    /* renamed from: X */
    public final boolean mo50400X() {
        if (this.f18912x != Proxy.NO_PROXY) {
            this.f18909u = new Socket(this.f18912x);
            return true;
        }
        SocketFactory socketFactory = this.f18910v;
        if (socketFactory != null) {
            this.f18909u = socketFactory.createSocket();
        } else {
            Socket socket = this.f18909u;
            if (socket == null) {
                this.f18909u = new Socket(this.f18912x);
                return true;
            } else if (socket.isClosed()) {
                throw new IOException();
            }
        }
        return false;
    }

    /* renamed from: Y */
    public final void mo50401Y() {
        String str;
        String rawPath = this.f18907s.getRawPath();
        String rawQuery = this.f18907s.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int K = mo50391K();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18907s.getHost());
        if (K == 80 || K == 443) {
            str = "";
        } else {
            str = RunnerArgs.CLASSPATH_SEPARATOR + K;
        }
        sb.append(str);
        String sb2 = sb.toString();
        C9672d dVar = new C9672d();
        dVar.mo50494h(rawPath);
        dVar.mo50495c("Host", sb2);
        Map<String, String> map = this.f18902A;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                dVar.mo50495c((String) next.getKey(), (String) next.getValue());
            }
        }
        this.f18908t.mo50378z(dVar);
    }

    /* renamed from: Z */
    public final void mo50402Z() {
        SSLSocketFactory sSLSocketFactory;
        SocketFactory socketFactory = this.f18910v;
        if (socketFactory instanceof SSLSocketFactory) {
            sSLSocketFactory = (SSLSocketFactory) socketFactory;
        } else {
            SSLContext instance = SSLContext.getInstance("TLSv1.2");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            sSLSocketFactory = instance.getSocketFactory();
        }
        this.f18909u = sSLSocketFactory.createSocket(this.f18909u, this.f18907s.getHost(), mo50391K(), true);
    }

    /* renamed from: a */
    public final void mo50379a(C9645b bVar, C9674f fVar) {
        mo50332A();
        mo33243V((C9676h) fVar);
        this.f18903B.countDown();
    }

    /* renamed from: b */
    public void mo50380b(C9645b bVar, int i, String str, boolean z) {
        mo50397R(i, str, z);
    }

    /* renamed from: c */
    public void mo50343c(C9663f fVar) {
        this.f18908t.mo50343c(fVar);
    }

    /* renamed from: d */
    public final void mo50381d(C9645b bVar, ByteBuffer byteBuffer) {
        mo50398U(byteBuffer);
    }

    /* renamed from: e */
    public final void mo50382e(C9645b bVar) {
    }

    /* renamed from: h */
    public void mo50383h(C9645b bVar, int i, String str) {
        mo50396Q(i, str);
    }

    /* renamed from: m */
    public final void mo50384m(C9645b bVar, Exception exc) {
        mo33241S(exc);
    }

    /* renamed from: n */
    public final void mo50385n(C9645b bVar, String str) {
        mo33242T(str);
    }

    /* renamed from: o */
    public final void mo50386o(C9645b bVar, int i, String str, boolean z) {
        mo50333B();
        Thread thread = this.f18913y;
        if (thread != null) {
            thread.interrupt();
        }
        mo33240P(i, str, z);
        this.f18903B.countDown();
        this.f18904C.countDown();
    }

    public void run() {
        int read;
        try {
            boolean X = mo50400X();
            this.f18909u.setTcpNoDelay(mo50338w());
            this.f18909u.setReuseAddress(mo50337v());
            if (!this.f18909u.isConnected()) {
                this.f18909u.connect(new InetSocketAddress(this.f18906E.mo50387a(this.f18907s), mo50391K()), this.f18905D);
            }
            if (X && "wss".equals(this.f18907s.getScheme())) {
                mo50402Z();
            }
            if (this.f18909u instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) this.f18909u;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                mo50399W(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.f18909u.getInputStream();
            this.f18911w = this.f18909u.getOutputStream();
            mo50401Y();
            Thread thread = new Thread(new C9652b(this));
            this.f18913y = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!mo50394N() && !mo50393M() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.f18908t.mo50362k(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    mo50392L(e);
                } catch (RuntimeException e2) {
                    mo33241S(e2);
                    this.f18908t.mo50357f(1006, e2.getMessage());
                }
            }
            this.f18908t.mo50365n();
            this.f18914z = null;
        } catch (Exception e3) {
            mo50384m(this.f18908t, e3);
            this.f18908t.mo50357f(-1, e3.getMessage());
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            mo50384m(this.f18908t, iOException);
            this.f18908t.mo50357f(-1, iOException.getMessage());
        }
    }

    /* renamed from: u */
    public Collection<C9645b> mo50336u() {
        return Collections.singletonList(this.f18908t);
    }

    public C9650b(URI uri, C9653a aVar) {
        this(uri, aVar, (Map<String, String>) null, 0);
    }

    public C9650b(URI uri, C9653a aVar, Map<String, String> map, int i) {
        this.f18907s = null;
        this.f18908t = null;
        this.f18909u = null;
        this.f18910v = null;
        this.f18912x = Proxy.NO_PROXY;
        this.f18903B = new CountDownLatch(1);
        this.f18904C = new CountDownLatch(1);
        this.f18905D = 0;
        this.f18906E = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (aVar != null) {
            this.f18907s = uri;
            this.f18906E = new C9651a(this);
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.f18902A = treeMap;
                treeMap.putAll(map);
            }
            this.f18905D = i;
            mo50341z(false);
            mo50340y(false);
            this.f18908t = new C9647d(this, aVar);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }
}
