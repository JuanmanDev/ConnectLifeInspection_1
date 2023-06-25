package p040c.p077d.p078a.p105q;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: c.d.a.q.g */
/* compiled from: MarkEnforcingInputStream */
public class C1947g extends FilterInputStream {

    /* renamed from: e */
    public int f1633e = Integer.MIN_VALUE;

    public C1947g(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final long mo16439a(long j) {
        int i = this.f1633e;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    public int available() {
        int i = this.f1633e;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void mo16441b(long j) {
        int i = this.f1633e;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f1633e = (int) (((long) i) - j);
        }
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f1633e = i;
    }

    public int read() {
        if (mo16439a(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo16441b(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f1633e = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long a = mo16439a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        mo16441b(skip);
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int a = (int) mo16439a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        mo16441b((long) read);
        return read;
    }
}
