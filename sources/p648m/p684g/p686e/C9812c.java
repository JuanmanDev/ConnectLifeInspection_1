package p648m.p684g.p686e;

import androidx.test.internal.runner.RunnerArgs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.helpers.NOPLogger;
import p648m.p684g.C9805b;
import p648m.p684g.p685d.C9807a;
import p648m.p684g.p685d.C9808b;
import p648m.p684g.p685d.C9809c;

/* renamed from: m.g.e.c */
/* compiled from: SubstituteLogger */
public class C9812c implements C9805b {

    /* renamed from: e */
    public final String f19073e;

    /* renamed from: l */
    public volatile C9805b f19074l;

    /* renamed from: m */
    public Boolean f19075m;

    /* renamed from: n */
    public Method f19076n;

    /* renamed from: o */
    public C9807a f19077o;

    /* renamed from: p */
    public Queue<C9809c> f19078p;

    /* renamed from: q */
    public final boolean f19079q;

    public C9812c(String str, Queue<C9809c> queue, boolean z) {
        this.f19073e = str;
        this.f19078p = queue;
        this.f19079q = z;
    }

    /* renamed from: a */
    public C9805b mo50721a() {
        if (this.f19074l != null) {
            return this.f19074l;
        }
        if (this.f19079q) {
            return NOPLogger.NOP_LOGGER;
        }
        return mo50722b();
    }

    /* renamed from: b */
    public final C9805b mo50722b() {
        if (this.f19077o == null) {
            this.f19077o = new C9807a(this, this.f19078p);
        }
        return this.f19077o;
    }

    /* renamed from: c */
    public boolean mo50723c() {
        Boolean bool = this.f19075m;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f19076n = this.f19074l.getClass().getMethod(RunnerArgs.ARGUMENT_LOG_ONLY, new Class[]{C9808b.class});
            this.f19075m = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f19075m = Boolean.FALSE;
        }
        return this.f19075m.booleanValue();
    }

    /* renamed from: d */
    public boolean mo50724d() {
        return this.f19074l instanceof NOPLogger;
    }

    /* renamed from: e */
    public boolean mo50725e() {
        return this.f19074l == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9812c.class == obj.getClass() && this.f19073e.equals(((C9812c) obj).f19073e);
    }

    public void error(String str) {
        mo50721a().error(str);
    }

    /* renamed from: f */
    public void mo50727f(C9808b bVar) {
        if (mo50723c()) {
            try {
                this.f19076n.invoke(this.f19074l, new Object[]{bVar});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: g */
    public void mo50728g(C9805b bVar) {
        this.f19074l = bVar;
    }

    public String getName() {
        return this.f19073e;
    }

    public int hashCode() {
        return this.f19073e.hashCode();
    }

    public boolean isTraceEnabled() {
        return mo50721a().isTraceEnabled();
    }

    public void trace(String str) {
        mo50721a().trace(str);
    }

    public void error(String str, Throwable th) {
        mo50721a().error(str, th);
    }

    public void trace(String str, Object obj) {
        mo50721a().trace(str, obj);
    }

    public void trace(String str, Object obj, Object obj2) {
        mo50721a().trace(str, obj, obj2);
    }

    public void trace(String str, Throwable th) {
        mo50721a().trace(str, th);
    }
}
