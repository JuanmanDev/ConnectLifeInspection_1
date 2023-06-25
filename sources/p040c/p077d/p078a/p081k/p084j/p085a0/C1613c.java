package p040c.p077d.p078a.p081k.p084j.p085a0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.a0.c */
/* compiled from: DiskCacheWriteLocker */
public final class C1613c {

    /* renamed from: a */
    public final Map<String, C1614a> f973a = new HashMap();

    /* renamed from: b */
    public final C1615b f974b = new C1615b();

    /* renamed from: c.d.a.k.j.a0.c$a */
    /* compiled from: DiskCacheWriteLocker */
    public static class C1614a {

        /* renamed from: a */
        public final Lock f975a = new ReentrantLock();

        /* renamed from: b */
        public int f976b;
    }

    /* renamed from: c.d.a.k.j.a0.c$b */
    /* compiled from: DiskCacheWriteLocker */
    public static class C1615b {

        /* renamed from: a */
        public final Queue<C1614a> f977a = new ArrayDeque();

        /* renamed from: a */
        public C1614a mo15698a() {
            C1614a poll;
            synchronized (this.f977a) {
                poll = this.f977a.poll();
            }
            return poll == null ? new C1614a() : poll;
        }

        /* renamed from: b */
        public void mo15699b(C1614a aVar) {
            synchronized (this.f977a) {
                if (this.f977a.size() < 10) {
                    this.f977a.offer(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15696a(String str) {
        C1614a aVar;
        synchronized (this) {
            aVar = this.f973a.get(str);
            if (aVar == null) {
                aVar = this.f974b.mo15698a();
                this.f973a.put(str, aVar);
            }
            aVar.f976b++;
        }
        aVar.f975a.lock();
    }

    /* renamed from: b */
    public void mo15697b(String str) {
        C1614a aVar;
        synchronized (this) {
            C1614a aVar2 = this.f973a.get(str);
            C1949i.m2563d(aVar2);
            aVar = aVar2;
            if (aVar.f976b >= 1) {
                int i = aVar.f976b - 1;
                aVar.f976b = i;
                if (i == 0) {
                    C1614a remove = this.f973a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f974b.mo15699b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f976b);
            }
        }
        aVar.f975a.unlock();
    }
}
