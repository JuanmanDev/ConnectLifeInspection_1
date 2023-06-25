package p001a.p007c.p009b;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.i */
/* compiled from: lambda */
public final /* synthetic */ class C0015i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C0015i f18a = new C0015i();

    private /* synthetic */ C0015i() {
    }

    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.m36p((Uri) obj);
    }
}
