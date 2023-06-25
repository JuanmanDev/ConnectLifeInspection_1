package p553f.p594c.p595n.p597b;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p598o.C9208c;
import p553f.p594c.p617v.C9323a;

/* renamed from: f.c.n.b.b */
/* compiled from: HandlerScheduler */
public final class C9203b extends C9194k {

    /* renamed from: a */
    public final Handler f17993a;

    /* renamed from: b */
    public final boolean f17994b;

    /* renamed from: f.c.n.b.b$a */
    /* compiled from: HandlerScheduler */
    public static final class C9204a extends C9194k.C9196b {

        /* renamed from: e */
        public final Handler f17995e;

        /* renamed from: l */
        public final boolean f17996l;

        /* renamed from: m */
        public volatile boolean f17997m;

        public C9204a(Handler handler, boolean z) {
            this.f17995e = handler;
            this.f17996l = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: c */
        public C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f17997m) {
                return C9208c.m24964a();
            } else {
                C9205b bVar = new C9205b(this.f17995e, C9323a.m25171r(runnable));
                Message obtain = Message.obtain(this.f17995e, bVar);
                obtain.obj = this;
                if (this.f17996l) {
                    obtain.setAsynchronous(true);
                }
                this.f17995e.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f17997m) {
                    return bVar;
                }
                this.f17995e.removeCallbacks(bVar);
                return C9208c.m24964a();
            }
        }

        public void dispose() {
            this.f17997m = true;
            this.f17995e.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: f.c.n.b.b$b */
    /* compiled from: HandlerScheduler */
    public static final class C9205b implements Runnable, C9207b {

        /* renamed from: e */
        public final Handler f17998e;

        /* renamed from: l */
        public final Runnable f17999l;

        /* renamed from: m */
        public volatile boolean f18000m;

        public C9205b(Handler handler, Runnable runnable) {
            this.f17998e = handler;
            this.f17999l = runnable;
        }

        public void dispose() {
            this.f17998e.removeCallbacks(this);
            this.f18000m = true;
        }

        public void run() {
            try {
                this.f17999l.run();
            } catch (Throwable th) {
                C9323a.m25169p(th);
            }
        }
    }

    public C9203b(Handler handler, boolean z) {
        this.f17993a = handler;
        this.f17994b = z;
    }

    /* renamed from: a */
    public C9194k.C9196b mo47013a() {
        return new C9204a(this.f17993a, this.f17994b);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public C9207b mo47015c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C9205b bVar = new C9205b(this.f17993a, C9323a.m25171r(runnable));
            Message obtain = Message.obtain(this.f17993a, bVar);
            if (this.f17994b) {
                obtain.setAsynchronous(true);
            }
            this.f17993a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
