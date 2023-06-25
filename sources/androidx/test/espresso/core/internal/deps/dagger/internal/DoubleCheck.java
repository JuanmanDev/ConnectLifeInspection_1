package androidx.test.espresso.core.internal.deps.dagger.internal;

import p625h.p626a.C9381a;

public final class DoubleCheck<T> implements C9381a<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Object UNINITIALIZED = new Object();
    public volatile Object instance = UNINITIALIZED;
    public volatile C9381a<T> provider;

    public DoubleCheck(C9381a<T> aVar) {
        this.provider = aVar;
    }

    public static <P extends C9381a<T>, T> C9381a<T> provider(P p) {
        Preconditions.checkNotNull(p);
        if (p instanceof DoubleCheck) {
            return p;
        }
        return new DoubleCheck(p);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (!(obj != UNINITIALIZED && !(obj instanceof MemoizedSentinel)) || obj == obj2) {
            return obj2;
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(valueOf);
        sb.append(" & ");
        sb.append(valueOf2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    public T get() {
        T t = this.instance;
        if (t == UNINITIALIZED) {
            synchronized (this) {
                t = this.instance;
                if (t == UNINITIALIZED) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            }
        }
        return t;
    }
}
