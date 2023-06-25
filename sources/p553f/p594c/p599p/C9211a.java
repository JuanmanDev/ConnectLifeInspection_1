package p553f.p594c.p599p;

import p553f.p594c.p602s.p614i.C9315c;

/* renamed from: f.c.p.a */
/* compiled from: Exceptions */
public final class C9211a {
    /* renamed from: a */
    public static RuntimeException m24970a(Throwable th) {
        throw C9315c.m25141d(th);
    }

    /* renamed from: b */
    public static void m24971b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
