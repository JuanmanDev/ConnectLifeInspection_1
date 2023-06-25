package p001a.p007c.p011c;

import android.location.Location;
import java.util.function.Consumer;

/* renamed from: a.c.c.a */
/* compiled from: lambda */
public final /* synthetic */ class C0032a implements Consumer {

    /* renamed from: e */
    public final /* synthetic */ androidx.core.util.Consumer f37e;

    public /* synthetic */ C0032a(androidx.core.util.Consumer consumer) {
        this.f37e = consumer;
    }

    public final void accept(Object obj) {
        this.f37e.accept((Location) obj);
    }
}
