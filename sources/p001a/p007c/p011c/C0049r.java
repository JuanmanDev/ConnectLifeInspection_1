package p001a.p007c.p011c;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: a.c.c.r */
/* compiled from: lambda */
public final /* synthetic */ class C0049r implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Consumer f75e;

    /* renamed from: l */
    public final /* synthetic */ Location f76l;

    public /* synthetic */ C0049r(Consumer consumer, Location location) {
        this.f75e = consumer;
        this.f76l = location;
    }

    public final void run() {
        this.f75e.accept(this.f76l);
    }
}
