package p040c.p200q.p363c.p370n.p371h.p382q;

/* renamed from: c.q.c.n.h.q.a */
/* compiled from: MiddleOutFallbackStrategy */
public class C6700a implements C6703d {

    /* renamed from: a */
    public final int f12830a;

    /* renamed from: b */
    public final C6703d[] f12831b;

    /* renamed from: c */
    public final C6701b f12832c;

    public C6700a(int i, C6703d... dVarArr) {
        this.f12830a = i;
        this.f12831b = dVarArr;
        this.f12832c = new C6701b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo31333a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f12830a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C6703d dVar : this.f12831b) {
            if (stackTraceElementArr2.length <= this.f12830a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo31333a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f12830a ? this.f12832c.mo31333a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
