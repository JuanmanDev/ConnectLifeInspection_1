package p630io.reactivex.internal.util;

import java.io.Serializable;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p604b.C9227b;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.util.NotificationLite */
public enum NotificationLite {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.NotificationLite$a */
    public static final class C9467a implements Serializable {
        public static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: e */
        public final C9207b f18754e;

        public C9467a(C9207b bVar) {
            this.f18754e = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f18754e + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$b */
    public static final class C9468b implements Serializable {
        public static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        public final Throwable f18755e;

        public C9468b(Throwable th) {
            this.f18755e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9468b) {
                return C9227b.m24984c(this.f18755e, ((C9468b) obj).f18755e);
            }
            return false;
        }

        public int hashCode() {
            return this.f18755e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f18755e + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$c */
    public static final class C9469c implements Serializable {
        public static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: e */
        public final C9803c f18756e;

        public C9469c(C9803c cVar) {
            this.f18756e = cVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f18756e + "]";
        }
    }

    public static <T> boolean accept(Object obj, C9802b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof C9468b) {
            bVar.onError(((C9468b) obj).f18755e);
            return true;
        } else {
            bVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C9802b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof C9468b) {
            bVar.onError(((C9468b) obj).f18755e);
            return true;
        } else if (obj instanceof C9469c) {
            bVar.onSubscribe(((C9469c) obj).f18756e);
            return false;
        } else {
            bVar.onNext(obj);
            return false;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(C9207b bVar) {
        return new C9467a(bVar);
    }

    public static Object error(Throwable th) {
        return new C9468b(th);
    }

    public static C9207b getDisposable(Object obj) {
        return ((C9467a) obj).f18754e;
    }

    public static Throwable getError(Object obj) {
        return ((C9468b) obj).f18755e;
    }

    public static C9803c getSubscription(Object obj) {
        return ((C9469c) obj).f18756e;
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C9467a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C9468b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C9469c;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(C9803c cVar) {
        return new C9469c(cVar);
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, C9193j<? super T> jVar) {
        if (obj == COMPLETE) {
            jVar.onComplete();
            return true;
        } else if (obj instanceof C9468b) {
            jVar.onError(((C9468b) obj).f18755e);
            return true;
        } else {
            jVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C9193j<? super T> jVar) {
        if (obj == COMPLETE) {
            jVar.onComplete();
            return true;
        } else if (obj instanceof C9468b) {
            jVar.onError(((C9468b) obj).f18755e);
            return true;
        } else if (obj instanceof C9467a) {
            jVar.onSubscribe(((C9467a) obj).f18754e);
            return false;
        } else {
            jVar.onNext(obj);
            return false;
        }
    }
}
