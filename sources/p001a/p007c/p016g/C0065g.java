package p001a.p007c.p016g;

import android.content.ClipData;
import androidx.core.util.Predicate;

/* renamed from: a.c.g.g */
/* compiled from: lambda */
public final /* synthetic */ class C0065g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ java.util.function.Predicate f100a;

    public /* synthetic */ C0065g(java.util.function.Predicate predicate) {
        this.f100a = predicate;
    }

    public final boolean test(Object obj) {
        return this.f100a.test((ClipData.Item) obj);
    }
}
