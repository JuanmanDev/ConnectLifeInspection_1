package p001a.p007c.p015f;

import androidx.core.util.Predicate;

/* renamed from: a.c.f.a */
/* compiled from: lambda */
public final /* synthetic */ class C0054a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f82a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f83b;

    public /* synthetic */ C0054a(Predicate predicate, Predicate predicate2) {
        this.f82a = predicate;
        this.f83b = predicate2;
    }

    public final boolean test(Object obj) {
        return Predicate.m72d(this.f82a, this.f83b, obj);
    }
}
