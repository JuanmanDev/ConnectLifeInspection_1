package p001a.p007c.p009b;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.e */
/* compiled from: lambda */
public final /* synthetic */ class C0011e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Class f13a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f14b;

    public /* synthetic */ C0011e(Class cls, Predicate predicate) {
        this.f13a = cls;
        this.f14b = predicate;
    }

    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.m26f(this.f13a, this.f14b, obj);
    }
}
