package p001a.p007c.p009b;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.c */
/* compiled from: lambda */
public final /* synthetic */ class C0009c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f11a;

    public /* synthetic */ C0009c(String str) {
        this.f11a = str;
    }

    public final boolean test(Object obj) {
        return this.f11a.equals(((Uri) obj).getAuthority());
    }
}
