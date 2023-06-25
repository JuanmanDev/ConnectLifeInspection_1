package p553f.p554a.p576f.p579c.p581b;

import androidx.core.app.Person;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p040c.p200q.p363c.p370n.C6467g;

/* renamed from: f.a.f.c.b.h */
/* compiled from: lambda */
public final /* synthetic */ class C9089h implements Callable {

    /* renamed from: e */
    public final /* synthetic */ Map f17836e;

    public /* synthetic */ C9089h(Map map) {
        this.f17836e = map;
    }

    public final Object call() {
        return C6467g.m18085d().mo30621k((String) Objects.requireNonNull(this.f17836e.get(Person.KEY_KEY)), (String) Objects.requireNonNull(this.f17836e.get("value")));
    }
}
