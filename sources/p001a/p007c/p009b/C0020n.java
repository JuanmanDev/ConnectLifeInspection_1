package p001a.p007c.p009b;

import android.content.ComponentName;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.n */
/* compiled from: lambda */
public final /* synthetic */ class C0020n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f23a;

    public /* synthetic */ C0020n(String str) {
        this.f23a = str;
    }

    public final boolean test(Object obj) {
        return this.f23a.equals(((ComponentName) obj).getPackageName());
    }
}
