package p040c.p200q.p363c.p370n.p371h.p382q;

/* renamed from: c.q.c.n.h.q.e */
/* compiled from: TrimmedThrowableData */
public class C6704e {

    /* renamed from: a */
    public final String f12835a;

    /* renamed from: b */
    public final String f12836b;

    /* renamed from: c */
    public final StackTraceElement[] f12837c;

    /* renamed from: d */
    public final C6704e f12838d;

    public C6704e(Throwable th, C6703d dVar) {
        this.f12835a = th.getLocalizedMessage();
        this.f12836b = th.getClass().getName();
        this.f12837c = dVar.mo31333a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f12838d = cause != null ? new C6704e(cause, dVar) : null;
    }
}
