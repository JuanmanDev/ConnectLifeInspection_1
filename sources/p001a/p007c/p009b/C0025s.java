package p001a.p007c.p009b;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.s */
/* compiled from: lambda */
public final /* synthetic */ class C0025s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f28a;

    public /* synthetic */ C0025s(String str) {
        this.f28a = str;
    }

    public final boolean test(Object obj) {
        return this.f28a.equals(((Uri) obj).getAuthority());
    }
}
