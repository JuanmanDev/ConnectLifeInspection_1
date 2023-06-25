package p553f.p554a.p556d.p557a;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: f.a.d.a.f */
/* compiled from: MotionEventTracker */
public final class C8912f {

    /* renamed from: c */
    public static C8912f f17460c;

    /* renamed from: a */
    public final LongSparseArray<MotionEvent> f17461a = new LongSparseArray<>();

    /* renamed from: b */
    public final PriorityQueue<Long> f17462b = new PriorityQueue<>();

    /* renamed from: f.a.d.a.f$a */
    /* compiled from: MotionEventTracker */
    public static class C8913a {

        /* renamed from: b */
        public static final AtomicLong f17463b = new AtomicLong(0);

        /* renamed from: a */
        public final long f17464a;

        public C8913a(long j) {
            this.f17464a = j;
        }

        /* renamed from: b */
        public static C8913a m24124b() {
            return m24125c(f17463b.incrementAndGet());
        }

        /* renamed from: c */
        public static C8913a m24125c(long j) {
            return new C8913a(j);
        }

        /* renamed from: d */
        public long mo46366d() {
            return this.f17464a;
        }
    }

    /* renamed from: a */
    public static C8912f m24120a() {
        if (f17460c == null) {
            f17460c = new C8912f();
        }
        return f17460c;
    }

    @Nullable
    /* renamed from: b */
    public MotionEvent mo46364b(C8913a aVar) {
        while (!this.f17462b.isEmpty() && this.f17462b.peek().longValue() < aVar.f17464a) {
            this.f17461a.remove(this.f17462b.poll().longValue());
        }
        if (!this.f17462b.isEmpty() && this.f17462b.peek().longValue() == aVar.f17464a) {
            this.f17462b.poll();
        }
        MotionEvent motionEvent = this.f17461a.get(aVar.f17464a);
        this.f17461a.remove(aVar.f17464a);
        return motionEvent;
    }

    /* renamed from: c */
    public C8913a mo46365c(MotionEvent motionEvent) {
        C8913a b = C8913a.m24124b();
        this.f17461a.put(b.f17464a, MotionEvent.obtain(motionEvent));
        this.f17462b.add(Long.valueOf(b.f17464a));
        return b;
    }
}
