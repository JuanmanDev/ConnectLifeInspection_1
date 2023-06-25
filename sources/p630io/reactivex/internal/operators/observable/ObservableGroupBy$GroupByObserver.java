package p630io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p607e.p610c.C9279b;
import p553f.p594c.p615t.C9321a;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver */
public final class ObservableGroupBy$GroupByObserver<T, K, V> extends AtomicInteger implements C9193j<T>, C9207b {
    public static final Object NULL_KEY = new Object();
    public static final long serialVersionUID = -3688291656102519502L;
    public final int bufferSize;
    public final AtomicBoolean cancelled = new AtomicBoolean();
    public final boolean delayError;
    public final C9193j<? super C9321a<K, V>> downstream;
    public final Map<Object, C9279b<K, V>> groups;
    public final C9218f<? super T, ? extends K> keySelector;
    public C9207b upstream;
    public final C9218f<? super T, ? extends V> valueSelector;

    public ObservableGroupBy$GroupByObserver(C9193j<? super C9321a<K, V>> jVar, C9218f<? super T, ? extends K> fVar, C9218f<? super T, ? extends V> fVar2, int i, boolean z) {
        this.downstream = jVar;
        this.keySelector = fVar;
        this.valueSelector = fVar2;
        this.bufferSize = i;
        this.delayError = z;
        this.groups = new ConcurrentHashMap();
        lazySet(1);
    }

    public void cancel(K k) {
        if (k == null) {
            k = NULL_KEY;
        }
        this.groups.remove(k);
        if (decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    public boolean isDisposed() {
        return this.cancelled.get();
    }

    public void onComplete() {
        ArrayList<C9279b> arrayList = new ArrayList<>(this.groups.values());
        this.groups.clear();
        for (C9279b i : arrayList) {
            i.mo47101i();
        }
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        ArrayList<C9279b> arrayList = new ArrayList<>(this.groups.values());
        this.groups.clear();
        for (C9279b j : arrayList) {
            j.mo47102j(th);
        }
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        Object obj;
        try {
            Object apply = this.keySelector.apply(t);
            if (apply != null) {
                obj = apply;
            } else {
                obj = NULL_KEY;
            }
            C9279b bVar = this.groups.get(obj);
            if (bVar == null) {
                if (!this.cancelled.get()) {
                    bVar = C9279b.m25049h(apply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, bVar);
                    getAndIncrement();
                    this.downstream.onNext(bVar);
                } else {
                    return;
                }
            }
            try {
                Object apply2 = this.valueSelector.apply(t);
                C9227b.m24985d(apply2, "The value supplied is null");
                bVar.mo47103k(apply2);
            } catch (Throwable th) {
                C9211a.m24971b(th);
                this.upstream.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            C9211a.m24971b(th2);
            this.upstream.dispose();
            onError(th2);
        }
    }

    public void onSubscribe(C9207b bVar) {
        if (DisposableHelper.validate(this.upstream, bVar)) {
            this.upstream = bVar;
            this.downstream.onSubscribe(this);
        }
    }
}
