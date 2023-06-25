package p040c.p200q.p201a.p219b.p250l0.p251k;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p250l0.C3035e;
import p040c.p200q.p201a.p219b.p250l0.C3038g;
import p040c.p200q.p201a.p219b.p250l0.C3039h;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.l0.k.e */
/* compiled from: CeaDecoder */
public abstract class C3050e implements C3035e {

    /* renamed from: a */
    public final ArrayDeque<C3052b> f5433a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<C3039h> f5434b;

    /* renamed from: c */
    public final PriorityQueue<C3052b> f5435c;

    /* renamed from: d */
    public C3052b f5436d;

    /* renamed from: e */
    public long f5437e;

    /* renamed from: f */
    public long f5438f;

    /* renamed from: c.q.a.b.l0.k.e$b */
    /* compiled from: CeaDecoder */
    public static final class C3052b extends C3038g implements Comparable<C3052b> {

        /* renamed from: q */
        public long f5439q;

        public C3052b() {
        }

        /* renamed from: z */
        public int compareTo(@NonNull C3052b bVar) {
            if (mo18390n() == bVar.mo18390n()) {
                long j = this.f3308n - bVar.f3308n;
                if (j == 0) {
                    j = this.f5439q - bVar.f5439q;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
                return -1;
            } else if (mo18390n()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: c.q.a.b.l0.k.e$c */
    /* compiled from: CeaDecoder */
    public final class C3053c extends C3039h {
        public C3053c() {
        }

        /* renamed from: r */
        public final void mo18409r() {
            C3050e.this.mo19697l(this);
        }
    }

    public C3050e() {
        for (int i = 0; i < 10; i++) {
            this.f5433a.add(new C3052b());
        }
        this.f5434b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f5434b.add(new C3053c());
        }
        this.f5435c = new PriorityQueue<>();
    }

    /* renamed from: a */
    public void mo19612a(long j) {
        this.f5437e = j;
    }

    /* renamed from: e */
    public abstract C3034d mo19637e();

    /* renamed from: f */
    public abstract void mo19638f(C3038g gVar);

    public void flush() {
        this.f5438f = 0;
        this.f5437e = 0;
        while (!this.f5435c.isEmpty()) {
            mo19696k(this.f5435c.poll());
        }
        C3052b bVar = this.f5436d;
        if (bVar != null) {
            mo19696k(bVar);
            this.f5436d = null;
        }
    }

    /* renamed from: g */
    public C3038g mo18399c() {
        C3151e.m7759g(this.f5436d == null);
        if (this.f5433a.isEmpty()) {
            return null;
        }
        C3052b pollFirst = this.f5433a.pollFirst();
        this.f5436d = pollFirst;
        return pollFirst;
    }

    /* renamed from: h */
    public C3039h mo18398b() {
        if (this.f5434b.isEmpty()) {
            return null;
        }
        while (!this.f5435c.isEmpty() && this.f5435c.peek().f3308n <= this.f5437e) {
            C3052b poll = this.f5435c.poll();
            if (poll.mo18390n()) {
                C3039h pollFirst = this.f5434b.pollFirst();
                pollFirst.mo18385h(4);
                mo19696k(poll);
                return pollFirst;
            }
            mo19638f(poll);
            if (mo19639i()) {
                C3034d e = mo19637e();
                if (!poll.mo18389m()) {
                    C3039h pollFirst2 = this.f5434b.pollFirst();
                    pollFirst2.mo19624t(poll.f3308n, e, Long.MAX_VALUE);
                    mo19696k(poll);
                    return pollFirst2;
                }
            }
            mo19696k(poll);
        }
        return null;
    }

    /* renamed from: i */
    public abstract boolean mo19639i();

    /* renamed from: j */
    public void mo18400d(C3038g gVar) {
        C3151e.m7753a(gVar == this.f5436d);
        if (gVar.mo18389m()) {
            mo19696k(this.f5436d);
        } else {
            C3052b bVar = this.f5436d;
            long j = this.f5438f;
            this.f5438f = 1 + j;
            long unused = bVar.f5439q = j;
            this.f5435c.add(this.f5436d);
        }
        this.f5436d = null;
    }

    /* renamed from: k */
    public final void mo19696k(C3052b bVar) {
        bVar.mo18386i();
        this.f5433a.add(bVar);
    }

    /* renamed from: l */
    public void mo19697l(C3039h hVar) {
        hVar.mo18386i();
        this.f5434b.add(hVar);
    }

    public void release() {
    }
}
