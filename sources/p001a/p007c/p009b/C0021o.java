package p001a.p007c.p009b;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.o */
/* compiled from: lambda */
public final /* synthetic */ class C0021o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C0021o f24a = new C0021o();

    private /* synthetic */ C0021o() {
    }

    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.m31k((Uri) obj);
    }
}
