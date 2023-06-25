package p553f.p554a.p576f.p579c.p580a;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p040c.p200q.p363c.C6331h;

/* renamed from: f.a.f.c.a.d */
/* compiled from: lambda */
public final /* synthetic */ class C9075d implements Callable {

    /* renamed from: e */
    public final /* synthetic */ Map f17817e;

    public /* synthetic */ C9075d(Map map) {
        this.f17817e = map;
    }

    public final Object call() {
        return C6331h.m17786m((String) Objects.requireNonNull(this.f17817e.get("appName"))).mo30397D(((Boolean) Objects.requireNonNull(this.f17817e.get("enabled"))).booleanValue());
    }
}
