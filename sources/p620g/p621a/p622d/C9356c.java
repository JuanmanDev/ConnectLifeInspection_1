package p620g.p621a.p622d;

import java.lang.Thread;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import p620g.p621a.p622d.C9346b;

/* renamed from: g.a.d.c */
/* compiled from: ForkJoinWorkerThread */
public class C9356c extends Thread {

    /* renamed from: e */
    public final C9346b f18361e;

    /* renamed from: l */
    public final C9346b.C9355g f18362l;

    /* renamed from: g.a.d.c$a */
    /* compiled from: ForkJoinWorkerThread */
    public static final class C9357a extends C9356c {

        /* renamed from: m */
        public static final ThreadGroup f18363m = ((ThreadGroup) AccessController.doPrivileged(new C9358a()));

        /* renamed from: n */
        public static final AccessControlContext f18364n = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain((CodeSource) null, (PermissionCollection) null)});

        /* renamed from: g.a.d.c$a$a */
        /* compiled from: ForkJoinWorkerThread */
        public static class C9358a implements PrivilegedAction<ThreadGroup> {
            /* renamed from: a */
            public ThreadGroup run() {
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                while (true) {
                    ThreadGroup parent = threadGroup.getParent();
                    if (parent == null) {
                        return new ThreadGroup(threadGroup, "InnocuousForkJoinWorkerThreadGroup");
                    }
                    threadGroup = parent;
                }
            }
        }

        public C9357a(C9346b bVar) {
            super(bVar, ClassLoader.getSystemClassLoader(), f18363m, f18364n);
        }

        /* renamed from: a */
        public void mo47267a() {
            C9360e.m25277b(this);
        }

        public void setContextClassLoader(ClassLoader classLoader) {
            if (classLoader != null && ClassLoader.getSystemClassLoader() != classLoader) {
                throw new SecurityException("setContextClassLoader");
            }
        }

        public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }
    }

    public C9356c(C9346b bVar, ClassLoader classLoader) {
        super("aForkJoinWorkerThread");
        C9360e.m25290o(this, classLoader);
        this.f18361e = bVar;
        this.f18362l = bVar.mo47207B(this);
    }

    /* renamed from: a */
    public void mo47267a() {
    }

    /* renamed from: b */
    public void mo47268b() {
    }

    /* renamed from: c */
    public void mo47269c(Throwable th) {
    }

    public void run() {
        if (this.f18362l.f18358h == null) {
            Throwable th = null;
            try {
                mo47268b();
                this.f18361e.mo47208C(this.f18362l);
                try {
                    mo47269c((Throwable) null);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable unused) {
            }
            this.f18361e.mo47222h(this, th);
        }
    }

    public C9356c(C9346b bVar, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aForkJoinWorkerThread");
        super.setContextClassLoader(classLoader);
        C9360e.m25291p(this, accessControlContext);
        C9360e.m25277b(this);
        this.f18361e = bVar;
        this.f18362l = bVar.mo47207B(this);
    }
}
