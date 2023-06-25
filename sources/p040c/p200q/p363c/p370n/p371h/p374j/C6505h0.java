package p040c.p200q.p363c.p370n.p371h.p374j;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p347m.C5757c;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.c.n.h.j.h0 */
/* compiled from: Utils */
public final class C6505h0 {

    /* renamed from: a */
    public static final ExecutorService f12219a = C6544x.m18398c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: c.q.c.n.h.j.h0$a */
    /* compiled from: Utils */
    public class C6506a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Callable f12220e;

        /* renamed from: l */
        public final /* synthetic */ C5773k f12221l;

        /* renamed from: c.q.c.n.h.j.h0$a$a */
        /* compiled from: Utils */
        public class C6507a implements C5757c<T, Void> {
            public C6507a() {
            }

            /* renamed from: b */
            public Void mo20377a(@NonNull C5771j<T> jVar) {
                if (jVar.mo28856q()) {
                    C6506a.this.f12221l.mo28861c(jVar.mo28852m());
                    return null;
                }
                C6506a.this.f12221l.mo28860b(jVar.mo28851l());
                return null;
            }
        }

        public C6506a(Callable callable, C5773k kVar) {
            this.f12220e = callable;
            this.f12221l = kVar;
        }

        public void run() {
            try {
                ((C5771j) this.f12220e.call()).mo28848i(new C6507a());
            } catch (Exception e) {
                this.f12221l.mo28860b(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m18191a(C5771j<T> jVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        jVar.mo28849j(f12219a, new C6500f(countDownLatch));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (jVar.mo28856q()) {
            return jVar.mo28852m();
        }
        if (jVar.mo28854o()) {
            throw new CancellationException("Task is already canceled");
        } else if (jVar.mo28855p()) {
            throw new IllegalStateException(jVar.mo28851l());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: b */
    public static boolean m18192b(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static <T> C5771j<T> m18193c(Executor executor, Callable<C5771j<T>> callable) {
        C5773k kVar = new C5773k();
        executor.execute(new C6506a(callable, kVar));
        return kVar.mo28859a();
    }

    /* renamed from: e */
    public static /* synthetic */ Void m18195e(C5773k kVar, C5771j jVar) {
        if (jVar.mo28856q()) {
            kVar.mo28863e(jVar.mo28852m());
            return null;
        }
        kVar.mo28862d((Exception) Objects.requireNonNull(jVar.mo28851l()));
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ Void m18196f(C5773k kVar, C5771j jVar) {
        if (jVar.mo28856q()) {
            kVar.mo28863e(jVar.mo28852m());
            return null;
        }
        kVar.mo28862d((Exception) Objects.requireNonNull(jVar.mo28851l()));
        return null;
    }

    /* renamed from: g */
    public static <T> C5771j<T> m18197g(C5771j<T> jVar, C5771j<T> jVar2) {
        C5773k kVar = new C5773k();
        C6496d dVar = new C6496d(kVar);
        jVar.mo28848i(dVar);
        jVar2.mo28848i(dVar);
        return kVar.mo28859a();
    }

    /* renamed from: h */
    public static <T> C5771j<T> m18198h(Executor executor, C5771j<T> jVar, C5771j<T> jVar2) {
        C5773k kVar = new C5773k();
        C6498e eVar = new C6498e(kVar);
        jVar.mo28849j(executor, eVar);
        jVar2.mo28849j(executor, eVar);
        return kVar.mo28859a();
    }
}
