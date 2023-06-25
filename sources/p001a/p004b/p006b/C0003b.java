package p001a.p004b.p006b;

import androidx.browser.trusted.TokenContents;
import java.util.Comparator;

/* renamed from: a.b.b.b */
/* compiled from: lambda */
public final /* synthetic */ class C0003b implements Comparator {

    /* renamed from: e */
    public static final /* synthetic */ C0003b f4e = new C0003b();

    private /* synthetic */ C0003b() {
    }

    public final int compare(Object obj, Object obj2) {
        return TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
    }
}
