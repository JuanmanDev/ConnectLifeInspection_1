package p553f.p554a.p576f.p579c.p580a;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p040c.p200q.p363c.C6331h;

/* renamed from: f.a.f.c.a.e */
/* compiled from: lambda */
public final /* synthetic */ class C9076e implements Callable {

    /* renamed from: e */
    public final /* synthetic */ Map f17818e;

    public /* synthetic */ C9076e(Map map) {
        this.f17818e = map;
    }

    public final Object call() {
        return C6331h.m17786m((String) Objects.requireNonNull(this.f17818e.get("appName"))).mo30395B(((Boolean) Objects.requireNonNull(this.f17818e.get("enabled"))).booleanValue());
    }
}
