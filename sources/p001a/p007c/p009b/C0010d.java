package p001a.p007c.p009b;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.d */
/* compiled from: lambda */
public final /* synthetic */ class C0010d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f12a;

    public /* synthetic */ C0010d(String str) {
        this.f12a = str;
    }

    public final boolean test(Object obj) {
        return this.f12a.equals(((Uri) obj).getAuthority());
    }
}
