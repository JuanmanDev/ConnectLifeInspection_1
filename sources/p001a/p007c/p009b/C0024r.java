package p001a.p007c.p009b;

import android.content.ComponentName;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* renamed from: a.c.b.r */
/* compiled from: lambda */
public final /* synthetic */ class C0024r implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C0024r f27a = new C0024r();

    private /* synthetic */ C0024r() {
    }

    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.m21a((ComponentName) obj);
    }
}
