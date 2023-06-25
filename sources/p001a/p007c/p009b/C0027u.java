package p001a.p007c.p009b;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.u */
/* compiled from: lambda */
public final /* synthetic */ class C0027u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ UriMatcher f30a;

    public /* synthetic */ C0027u(UriMatcher uriMatcher) {
        this.f30a = uriMatcher;
    }

    public final boolean test(Object obj) {
        return UriMatcherCompat.m38a(this.f30a, (Uri) obj);
    }
}
