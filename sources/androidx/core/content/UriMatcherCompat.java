package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;
import p001a.p007c.p009b.C0027u;

public class UriMatcherCompat {
    /* renamed from: a */
    public static /* synthetic */ boolean m38a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull UriMatcher uriMatcher) {
        return new C0027u(uriMatcher);
    }
}
