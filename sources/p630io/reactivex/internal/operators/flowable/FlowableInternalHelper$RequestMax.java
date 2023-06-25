package p630io.reactivex.internal.operators.flowable;

import p553f.p594c.p601r.C9217e;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax */
public enum FlowableInternalHelper$RequestMax implements C9217e<C9803c> {
    INSTANCE;

    public void accept(C9803c cVar) {
        cVar.request(Long.MAX_VALUE);
    }
}
