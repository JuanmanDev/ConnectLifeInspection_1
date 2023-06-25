package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p261o0.C3148c0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

public final class Loader implements C3136s {

    /* renamed from: d */
    public static final C4058c f7920d = m10672g(false, -9223372036854775807L);

    /* renamed from: e */
    public static final C4058c f7921e = new C4058c(2, -9223372036854775807L);

    /* renamed from: f */
    public static final C4058c f7922f = new C4058c(3, -9223372036854775807L);

    /* renamed from: a */
    public final ExecutorService f7923a;

    /* renamed from: b */
    public C4059d<? extends C4060e> f7924b;

    /* renamed from: c */
    public IOException f7925c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    public interface C4057b<T extends C4060e> {
        /* renamed from: k */
        void mo19106k(T t, long j, long j2, boolean z);

        /* renamed from: l */
        void mo19107l(T t, long j, long j2);

        /* renamed from: s */
        C4058c mo19109s(T t, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public static final class C4058c {

        /* renamed from: a */
        public final int f7926a;

        /* renamed from: b */
        public final long f7927b;

        /* renamed from: c */
        public boolean mo24277c() {
            int i = this.f7926a;
            return i == 0 || i == 1;
        }

        public C4058c(int i, long j) {
            this.f7926a = i;
            this.f7927b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.Loader$d */
    public final class C4059d<T extends C4060e> extends Handler implements Runnable {

        /* renamed from: e */
        public final int f7928e;

        /* renamed from: l */
        public final T f7929l;

        /* renamed from: m */
        public final long f7930m;
        @Nullable

        /* renamed from: n */
        public C4057b<T> f7931n;

        /* renamed from: o */
        public IOException f7932o;

        /* renamed from: p */
        public int f7933p;

        /* renamed from: q */
        public volatile Thread f7934q;

        /* renamed from: r */
        public volatile boolean f7935r;

        /* renamed from: s */
        public volatile boolean f7936s;

        public C4059d(Looper looper, T t, C4057b<T> bVar, int i, long j) {
            super(looper);
            this.f7929l = t;
            this.f7931n = bVar;
            this.f7928e = i;
            this.f7930m = j;
        }

        /* renamed from: a */
        public void mo24278a(boolean z) {
            this.f7936s = z;
            this.f7932o = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f7935r = true;
                this.f7929l.mo19121a();
                if (this.f7934q != null) {
                    this.f7934q.interrupt();
                }
            }
            if (z) {
                mo24280c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f7931n.mo19106k(this.f7929l, elapsedRealtime, elapsedRealtime - this.f7930m, true);
                this.f7931n = null;
            }
        }

        /* renamed from: b */
        public final void mo24279b() {
            this.f7932o = null;
            Loader.this.f7923a.execute(Loader.this.f7924b);
        }

        /* renamed from: c */
        public final void mo24280c() {
            C4059d unused = Loader.this.f7924b = null;
        }

        /* renamed from: d */
        public final long mo24281d() {
            return (long) Math.min((this.f7933p - 1) * 1000, 5000);
        }

        /* renamed from: e */
        public void mo24282e(int i) {
            IOException iOException = this.f7932o;
            if (iOException != null && this.f7933p > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void mo24283f(long j) {
            C3151e.m7759g(Loader.this.f7924b == null);
            C4059d unused = Loader.this.f7924b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                mo24279b();
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f7936s) {
                int i = message.what;
                if (i == 0) {
                    mo24279b();
                } else if (i != 4) {
                    mo24280c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f7930m;
                    if (this.f7935r) {
                        this.f7931n.mo19106k(this.f7929l, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        this.f7931n.mo19106k(this.f7929l, elapsedRealtime, j2, false);
                    } else if (i2 == 2) {
                        try {
                            this.f7931n.mo19107l(this.f7929l, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            C3163m.m7878d("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused = Loader.this.f7925c = new UnexpectedLoaderException(e);
                        }
                    } else if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f7932o = iOException;
                        int i3 = this.f7933p + 1;
                        this.f7933p = i3;
                        C4058c s = this.f7931n.mo19109s(this.f7929l, elapsedRealtime, j2, iOException, i3);
                        if (s.f7926a == 3) {
                            IOException unused2 = Loader.this.f7925c = this.f7932o;
                        } else if (s.f7926a != 2) {
                            if (s.f7926a == 1) {
                                this.f7933p = 1;
                            }
                            if (s.f7927b != -9223372036854775807L) {
                                j = s.f7927b;
                            } else {
                                j = mo24281d();
                            }
                            mo24283f(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f7934q = Thread.currentThread();
                if (!this.f7935r) {
                    C3148c0.m7745a("load:" + this.f7929l.getClass().getSimpleName());
                    this.f7929l.load();
                    C3148c0.m7747c();
                }
                if (!this.f7936s) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f7936s) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C3151e.m7759g(this.f7935r);
                if (!this.f7936s) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                C3163m.m7878d("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f7936s) {
                    obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                C3163m.m7878d("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f7936s) {
                    obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (Error e4) {
                C3163m.m7878d("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f7936s) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C3148c0.m7747c();
                throw th;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$e */
    public interface C4060e {
        /* renamed from: a */
        void mo19121a();

        void load();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$f */
    public interface C4061f {
        /* renamed from: h */
        void mo19104h();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$g */
    public static final class C4062g implements Runnable {

        /* renamed from: e */
        public final C4061f f7938e;

        public C4062g(C4061f fVar) {
            this.f7938e = fVar;
        }

        public void run() {
            this.f7938e.mo19104h();
        }
    }

    static {
        m10672g(true, -9223372036854775807L);
    }

    public Loader(String str) {
        this.f7923a = C3152e0.m7781U(str);
    }

    /* renamed from: g */
    public static C4058c m10672g(boolean z, long j) {
        return new C4058c(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public void mo19182a() {
        mo24273i(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void mo24271f() {
        this.f7924b.mo24278a(false);
    }

    /* renamed from: h */
    public boolean mo24272h() {
        return this.f7924b != null;
    }

    /* renamed from: i */
    public void mo24273i(int i) {
        IOException iOException = this.f7925c;
        if (iOException == null) {
            C4059d<? extends C4060e> dVar = this.f7924b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f7928e;
                }
                dVar.mo24282e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public void mo24274j() {
        mo24275k((C4061f) null);
    }

    /* renamed from: k */
    public void mo24275k(@Nullable C4061f fVar) {
        C4059d<? extends C4060e> dVar = this.f7924b;
        if (dVar != null) {
            dVar.mo24278a(true);
        }
        if (fVar != null) {
            this.f7923a.execute(new C4062g(fVar));
        }
        this.f7923a.shutdown();
    }

    /* renamed from: l */
    public <T extends C4060e> long mo24276l(T t, C4057b<T> bVar, int i) {
        Looper myLooper = Looper.myLooper();
        C3151e.m7759g(myLooper != null);
        this.f7925c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C4059d(myLooper, t, bVar, i, elapsedRealtime).mo24283f(0);
        return elapsedRealtime;
    }
}
