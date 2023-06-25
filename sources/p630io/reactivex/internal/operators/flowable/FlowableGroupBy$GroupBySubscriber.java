package p630io.reactivex.internal.operators.flowable;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.C9186d;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p600q.C9212a;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p607e.p608a.C9251g;
import p553f.p594c.p602s.p611f.C9288a;
import p553f.p594c.p602s.p614i.C9314b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber */
public final class FlowableGroupBy$GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<C9212a<K, V>> implements C9186d<T> {
    public static final Object NULL_KEY = new Object();
    public static final long serialVersionUID = -3688291656102519502L;
    public final int bufferSize;
    public final AtomicBoolean cancelled = new AtomicBoolean();
    public final boolean delayError;
    public boolean done;
    public final C9802b<? super C9212a<K, V>> downstream;
    public Throwable error;
    public final Queue<C9251g<K, V>> evictedGroups;
    public volatile boolean finished;
    public final AtomicInteger groupCount = new AtomicInteger(1);
    public final Map<Object, C9251g<K, V>> groups;
    public final C9218f<? super T, ? extends K> keySelector;
    public boolean outputFused;
    public final C9288a<C9212a<K, V>> queue;
    public final AtomicLong requested = new AtomicLong();
    public C9803c upstream;
    public final C9218f<? super T, ? extends V> valueSelector;

    public FlowableGroupBy$GroupBySubscriber(C9802b<? super C9212a<K, V>> bVar, C9218f<? super T, ? extends K> fVar, C9218f<? super T, ? extends V> fVar2, int i, boolean z, Map<Object, C9251g<K, V>> map, Queue<C9251g<K, V>> queue2) {
        this.downstream = bVar;
        this.keySelector = fVar;
        this.valueSelector = fVar2;
        this.bufferSize = i;
        this.delayError = z;
        this.groups = map;
        this.evictedGroups = queue2;
        this.queue = new C9288a<>(i);
    }

    private void completeEvictions() {
        if (this.evictedGroups != null) {
            int i = 0;
            while (true) {
                C9251g poll = this.evictedGroups.poll();
                if (poll == null) {
                    break;
                }
                poll.mo47076B();
                i++;
            }
            if (i != 0) {
                this.groupCount.addAndGet(-i);
            }
        }
    }

    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            completeEvictions();
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, C9802b<?> bVar, C9288a<?> aVar) {
        if (this.cancelled.get()) {
            aVar.clear();
            return true;
        } else if (this.delayError) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                bVar.onError(th);
            } else {
                bVar.onComplete();
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th2 = this.error;
            if (th2 != null) {
                aVar.clear();
                bVar.onError(th2);
                return true;
            } else if (!z2) {
                return false;
            } else {
                bVar.onComplete();
                return true;
            }
        }
    }

    public void clear() {
        this.queue.clear();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }
    }

    public void drainFused() {
        Throwable th;
        C9288a<C9212a<K, V>> aVar = this.queue;
        C9802b<? super C9212a<K, V>> bVar = this.downstream;
        int i = 1;
        while (!this.cancelled.get()) {
            boolean z = this.finished;
            if (!z || this.delayError || (th = this.error) == null) {
                bVar.onNext(null);
                if (z) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        bVar.onError(th2);
                        return;
                    } else {
                        bVar.onComplete();
                        return;
                    }
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                aVar.clear();
                bVar.onError(th);
                return;
            }
        }
        aVar.clear();
    }

    public void drainNormal() {
        int i;
        C9288a<C9212a<K, V>> aVar = this.queue;
        C9802b<? super C9212a<K, V>> bVar = this.downstream;
        int i2 = 1;
        do {
            long j = this.requested.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (i == 0) {
                    break;
                }
                boolean z = this.finished;
                C9212a poll = aVar.poll();
                boolean z2 = poll == null;
                if (!checkTerminated(z, z2, bVar, aVar)) {
                    if (z2) {
                        break;
                    }
                    bVar.onNext(poll);
                    j2++;
                } else {
                    return;
                }
            }
            if (i != 0 || !checkTerminated(this.finished, aVar.isEmpty(), bVar, aVar)) {
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    this.upstream.request(j2);
                }
                i2 = addAndGet(-i2);
            } else {
                return;
            }
        } while (i2 != 0);
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public void onComplete() {
        if (!this.done) {
            for (C9251g<K, V> B : this.groups.values()) {
                B.mo47076B();
            }
            this.groups.clear();
            Queue<C9251g<K, V>> queue2 = this.evictedGroups;
            if (queue2 != null) {
                queue2.clear();
            }
            this.done = true;
            this.finished = true;
            drain();
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C9323a.m25169p(th);
            return;
        }
        this.done = true;
        for (C9251g<K, V> C : this.groups.values()) {
            C.mo47077C(th);
        }
        this.groups.clear();
        Queue<C9251g<K, V>> queue2 = this.evictedGroups;
        if (queue2 != null) {
            queue2.clear();
        }
        this.error = th;
        this.finished = true;
        drain();
    }

    public void onNext(T t) {
        Object obj;
        if (!this.done) {
            C9288a<C9212a<K, V>> aVar = this.queue;
            try {
                Object apply = this.keySelector.apply(t);
                boolean z = false;
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                C9251g gVar = this.groups.get(obj);
                if (gVar == null) {
                    if (!this.cancelled.get()) {
                        gVar = C9251g.m25012A(apply, this.bufferSize, this, this.delayError);
                        this.groups.put(obj, gVar);
                        this.groupCount.getAndIncrement();
                        z = true;
                    } else {
                        return;
                    }
                }
                try {
                    Object apply2 = this.valueSelector.apply(t);
                    C9227b.m24985d(apply2, "The valueSelector returned null");
                    gVar.mo47078D(apply2);
                    completeEvictions();
                    if (z) {
                        aVar.offer(gVar);
                        drain();
                    }
                } catch (Throwable th) {
                    C9211a.m24971b(th);
                    this.upstream.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }
    }

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.validate(this.upstream, cVar)) {
            this.upstream = cVar;
            this.downstream.onSubscribe(this);
            cVar.request((long) this.bufferSize);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C9314b.m25135a(this.requested, j);
            drain();
        }
    }

    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    public C9212a<K, V> poll() {
        return this.queue.poll();
    }

    public void cancel(K k) {
        if (k == null) {
            k = NULL_KEY;
        }
        this.groups.remove(k);
        if (this.groupCount.decrementAndGet() == 0) {
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }
}
