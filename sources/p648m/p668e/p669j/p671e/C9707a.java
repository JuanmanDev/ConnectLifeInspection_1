package p648m.p668e.p669j.p671e;

import p648m.p668e.p669j.p670d.C9699a;
import p648m.p668e.p677l.C9746d;
import p648m.p668e.p677l.C9749f;

/* renamed from: m.e.j.e.a */
/* compiled from: ClassRequest */
public class C9707a extends C9746d {

    /* renamed from: a */
    public final Object f18972a;

    /* renamed from: b */
    public final Class<?> f18973b;

    /* renamed from: c */
    public final boolean f18974c;

    /* renamed from: d */
    public volatile C9749f f18975d;

    public C9707a(Class<?> cls, boolean z) {
        this.f18972a = new Object();
        this.f18973b = cls;
        this.f18974c = z;
    }

    public C9749f getRunner() {
        if (this.f18975d == null) {
            synchronized (this.f18972a) {
                if (this.f18975d == null) {
                    this.f18975d = new C9699a(this.f18974c).safeRunnerForClass(this.f18973b);
                }
            }
        }
        return this.f18975d;
    }

    public C9707a(Class<?> cls) {
        this(cls, true);
    }
}
