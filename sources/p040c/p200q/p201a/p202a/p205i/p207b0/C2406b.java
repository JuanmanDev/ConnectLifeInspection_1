package p040c.p200q.p201a.p202a.p205i.p207b0;

/* renamed from: c.q.a.a.i.b0.b */
/* compiled from: Retries */
public final class C2406b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m4229a(int i, TInput tinput, C2405a<TInput, TResult, TException> aVar, C2407c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo17664a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo17664a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
