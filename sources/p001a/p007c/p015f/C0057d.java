package p001a.p007c.p015f;

import androidx.core.util.Predicate;

/* renamed from: a.c.f.d */
/* compiled from: lambda */
public final /* synthetic */ class C0057d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f86a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f87b;

    public /* synthetic */ C0057d(Predicate predicate, Predicate predicate2) {
        this.f86a = predicate;
        this.f87b = predicate2;
    }

    public final boolean test(Object obj) {
        return Predicate.m71c(this.f86a, this.f87b, obj);
    }
}
