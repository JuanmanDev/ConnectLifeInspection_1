package p553f.p594c.p602s.p604b;

import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: f.c.s.b.a */
/* compiled from: Functions */
public final class C9222a {

    /* renamed from: a */
    public static final Runnable f18006a = new C9225c();

    /* renamed from: b */
    public static final C9213a f18007b = new C9223a();

    /* renamed from: c */
    public static final C9217e<Object> f18008c = new C9224b();

    /* renamed from: d */
    public static final C9217e<Throwable> f18009d = new C9226d();

    /* renamed from: f.c.s.b.a$a */
    /* compiled from: Functions */
    public static final class C9223a implements C9213a {
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: f.c.s.b.a$b */
    /* compiled from: Functions */
    public static final class C9224b implements C9217e<Object> {
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: f.c.s.b.a$c */
    /* compiled from: Functions */
    public static final class C9225c implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: f.c.s.b.a$d */
    /* compiled from: Functions */
    public static final class C9226d implements C9217e<Throwable> {
        /* renamed from: a */
        public void accept(Throwable th) {
            C9323a.m25169p(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: a */
    public static <T> C9217e<T> m24980a() {
        return f18008c;
    }
}
