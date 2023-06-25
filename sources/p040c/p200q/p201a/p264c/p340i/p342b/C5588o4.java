package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.o4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5588o4 extends FutureTask implements Comparable {

    /* renamed from: e */
    public final long f10712e;

    /* renamed from: l */
    public final boolean f10713l;

    /* renamed from: m */
    public final String f10714m;

    /* renamed from: n */
    public final /* synthetic */ C5612q4 f10715n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5588o4(C5612q4 q4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f10715n = q4Var;
        C3495o.m8908j(str);
        long andIncrement = C5612q4.f10765l.getAndIncrement();
        this.f10712e = andIncrement;
        this.f10714m = str;
        this.f10713l = z;
        if (andIncrement == Long.MAX_VALUE) {
            q4Var.f10699a.mo28487b().mo28339r().mo28259a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        C5588o4 o4Var = (C5588o4) obj;
        boolean z = this.f10713l;
        if (z != o4Var.f10713l) {
            return !z ? 1 : -1;
        }
        int i = (this.f10712e > o4Var.f10712e ? 1 : (this.f10712e == o4Var.f10712e ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f10715n.f10699a.mo28487b().mo28341t().mo28260b("Two tasks share the same index. index", Long.valueOf(this.f10712e));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f10715n.f10699a.mo28487b().mo28339r().mo28260b(this.f10714m, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5588o4(C5612q4 q4Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f10715n = q4Var;
        C3495o.m8908j("Task exception on worker thread");
        long andIncrement = C5612q4.f10765l.getAndIncrement();
        this.f10712e = andIncrement;
        this.f10714m = "Task exception on worker thread";
        this.f10713l = z;
        if (andIncrement == Long.MAX_VALUE) {
            q4Var.f10699a.mo28487b().mo28339r().mo28259a("Tasks index overflow");
        }
    }
}
