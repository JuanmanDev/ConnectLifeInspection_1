package p001a.p007c.p009b;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.f */
/* compiled from: lambda */
public final /* synthetic */ class C0012f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f15a;

    public /* synthetic */ C0012f(String str) {
        this.f15a = str;
    }

    public final boolean test(Object obj) {
        return this.f15a.equals(((Uri) obj).getAuthority());
    }
}
