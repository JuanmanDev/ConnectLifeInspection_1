package p001a.p007c.p011c;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: a.c.c.b */
/* compiled from: lambda */
public final /* synthetic */ class C0033b implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Consumer f38e;

    /* renamed from: l */
    public final /* synthetic */ Location f39l;

    public /* synthetic */ C0033b(Consumer consumer, Location location) {
        this.f38e = consumer;
        this.f39l = location;
    }

    public final void run() {
        this.f38e.accept(this.f39l);
    }
}
