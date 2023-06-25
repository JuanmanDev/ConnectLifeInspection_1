package p692o;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* renamed from: o.j */
/* compiled from: OkHttpCall */
public final class C9879j<T> implements C9855b<T> {

    /* renamed from: e */
    public final C9907o f19145e;

    /* renamed from: l */
    public final Object[] f19146l;

    /* renamed from: m */
    public final Call.Factory f19147m;

    /* renamed from: n */
    public final C9866f<ResponseBody, T> f19148n;

    /* renamed from: o */
    public volatile boolean f19149o;

    /* renamed from: p */
    public Call f19150p;

    /* renamed from: q */
    public Throwable f19151q;

    /* renamed from: r */
    public boolean f19152r;

    /* renamed from: o.j$a */
    /* compiled from: OkHttpCall */
    public class C9880a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ C9858d f19153a;

        public C9880a(C9858d dVar) {
            this.f19153a = dVar;
        }

        /* renamed from: a */
        public final void mo51276a(Throwable th) {
            try {
                this.f19153a.onFailure(C9879j.this, th);
            } catch (Throwable th2) {
                C9916u.m26598t(th2);
                th2.printStackTrace();
            }
        }

        public void onFailure(Call call, IOException iOException) {
            mo51276a(iOException);
        }

        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f19153a.onResponse(C9879j.this, C9879j.this.mo51275c(response));
                } catch (Throwable th) {
                    C9916u.m26598t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C9916u.m26598t(th2);
                mo51276a(th2);
            }
        }
    }

    /* renamed from: o.j$b */
    /* compiled from: OkHttpCall */
    public static final class C9881b extends ResponseBody {

        /* renamed from: e */
        public final ResponseBody f19155e;

        /* renamed from: l */
        public final BufferedSource f19156l;

        /* renamed from: m */
        public IOException f19157m;

        /* renamed from: o.j$b$a */
        /* compiled from: OkHttpCall */
        public class C9882a extends ForwardingSource {
            public C9882a(Source source) {
                super(source);
            }

            public long read(Buffer buffer, long j) {
                try {
                    return super.read(buffer, j);
                } catch (IOException e) {
                    C9881b.this.f19157m = e;
                    throw e;
                }
            }
        }

        public C9881b(ResponseBody responseBody) {
            this.f19155e = responseBody;
            this.f19156l = Okio.buffer((Source) new C9882a(responseBody.source()));
        }

        /* renamed from: a */
        public void mo51277a() {
            IOException iOException = this.f19157m;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f19155e.close();
        }

        public long contentLength() {
            return this.f19155e.contentLength();
        }

        public MediaType contentType() {
            return this.f19155e.contentType();
        }

        public BufferedSource source() {
            return this.f19156l;
        }
    }

    /* renamed from: o.j$c */
    /* compiled from: OkHttpCall */
    public static final class C9883c extends ResponseBody {

        /* renamed from: e */
        public final MediaType f19159e;

        /* renamed from: l */
        public final long f19160l;

        public C9883c(MediaType mediaType, long j) {
            this.f19159e = mediaType;
            this.f19160l = j;
        }

        public long contentLength() {
            return this.f19160l;
        }

        public MediaType contentType() {
            return this.f19159e;
        }

        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C9879j(C9907o oVar, Object[] objArr, Call.Factory factory, C9866f<ResponseBody, T> fVar) {
        this.f19145e = oVar;
        this.f19146l = objArr;
        this.f19147m = factory;
        this.f19148n = fVar;
    }

    /* renamed from: a */
    public C9879j<T> clone() {
        return new C9879j<>(this.f19145e, this.f19146l, this.f19147m, this.f19148n);
    }

    /* renamed from: b */
    public final Call mo51274b() {
        Call newCall = this.f19147m.newCall(this.f19145e.mo51308a(this.f19146l));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: c */
    public C9909p<T> mo51275c(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C9883c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return C9909p.m26553c(C9916u.m26579a(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return C9909p.m26554f(null, build);
        } else {
            C9881b bVar = new C9881b(body);
            try {
                return C9909p.m26554f(this.f19148n.mo51243a(bVar), build);
            } catch (RuntimeException e) {
                bVar.mo51277a();
                throw e;
            }
        }
    }

    public void cancel() {
        Call call;
        this.f19149o = true;
        synchronized (this) {
            call = this.f19150p;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public C9909p<T> execute() {
        Call call;
        synchronized (this) {
            if (!this.f19152r) {
                this.f19152r = true;
                if (this.f19151q == null) {
                    call = this.f19150p;
                    if (call == null) {
                        try {
                            call = mo51274b();
                            this.f19150p = call;
                        } catch (IOException | Error | RuntimeException e) {
                            C9916u.m26598t(e);
                            this.f19151q = e;
                            throw e;
                        }
                    }
                } else if (this.f19151q instanceof IOException) {
                    throw ((IOException) this.f19151q);
                } else if (this.f19151q instanceof RuntimeException) {
                    throw ((RuntimeException) this.f19151q);
                } else {
                    throw ((Error) this.f19151q);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f19149o) {
            call.cancel();
        }
        return mo51275c(call.execute());
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.f19149o) {
            return true;
        }
        synchronized (this) {
            if (this.f19150p == null || !this.f19150p.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized Request request() {
        Call call = this.f19150p;
        if (call != null) {
            return call.request();
        } else if (this.f19151q == null) {
            try {
                Call b = mo51274b();
                this.f19150p = b;
                return b.request();
            } catch (RuntimeException e) {
                e = e;
                C9916u.m26598t(e);
                this.f19151q = e;
                throw e;
            } catch (Error e2) {
                e = e2;
                C9916u.m26598t(e);
                this.f19151q = e;
                throw e;
            } catch (IOException e3) {
                this.f19151q = e3;
                throw new RuntimeException("Unable to create request.", e3);
            }
        } else if (this.f19151q instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.f19151q);
        } else if (this.f19151q instanceof RuntimeException) {
            throw ((RuntimeException) this.f19151q);
        } else {
            throw ((Error) this.f19151q);
        }
    }

    /* renamed from: x */
    public void mo51255x(C9858d<T> dVar) {
        Call call;
        Throwable th;
        C9916u.m26580b(dVar, "callback == null");
        synchronized (this) {
            if (!this.f19152r) {
                this.f19152r = true;
                call = this.f19150p;
                th = this.f19151q;
                if (call == null && th == null) {
                    try {
                        Call b = mo51274b();
                        this.f19150p = b;
                        call = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C9916u.m26598t(th);
                        this.f19151q = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f19149o) {
            call.cancel();
        }
        call.enqueue(new C9880a(dVar));
    }
}
