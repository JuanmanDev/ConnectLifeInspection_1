package p040c.p200q.p363c.p370n.p371h.p382q;

/* renamed from: c.q.c.n.h.q.b */
/* compiled from: MiddleOutStrategy */
public class C6701b implements C6703d {

    /* renamed from: a */
    public final int f12833a;

    public C6701b(int i) {
        this.f12833a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo31333a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f12833a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
