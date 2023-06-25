package p553f.p594c.p602s.p614i;

import java.util.concurrent.atomic.AtomicReference;
import p630io.reactivex.exceptions.CompositeException;

/* renamed from: f.c.s.i.c */
/* compiled from: ExceptionHelper */
public final class C9315c {

    /* renamed from: a */
    public static final Throwable f18266a = new C9316a();

    /* renamed from: f.c.s.i.c$a */
    /* compiled from: ExceptionHelper */
    public static final class C9316a extends Throwable {
        public static final long serialVersionUID = -4649703670690200604L;

        public C9316a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m25138a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f18266a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m25139b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f18266a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: c */
    public static <E extends Throwable> Exception m25140c(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: d */
    public static RuntimeException m25141d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
