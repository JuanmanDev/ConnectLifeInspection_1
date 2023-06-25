package p040c.p077d.p078a.p105q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: c.d.a.q.c */
/* compiled from: ExceptionCatchingInputStream */
public class C1941c extends InputStream {

    /* renamed from: m */
    public static final Queue<C1941c> f1623m = C1950j.m2569e(0);

    /* renamed from: e */
    public InputStream f1624e;

    /* renamed from: l */
    public IOException f1625l;

    @NonNull
    /* renamed from: b */
    public static C1941c m2540b(@NonNull InputStream inputStream) {
        C1941c poll;
        synchronized (f1623m) {
            poll = f1623m.poll();
        }
        if (poll == null) {
            poll = new C1941c();
        }
        poll.mo16422d(inputStream);
        return poll;
    }

    @Nullable
    /* renamed from: a */
    public IOException mo16418a() {
        return this.f1625l;
    }

    public int available() {
        return this.f1624e.available();
    }

    /* renamed from: c */
    public void mo16420c() {
        this.f1625l = null;
        this.f1624e = null;
        synchronized (f1623m) {
            f1623m.offer(this);
        }
    }

    public void close() {
        this.f1624e.close();
    }

    /* renamed from: d */
    public void mo16422d(@NonNull InputStream inputStream) {
        this.f1624e = inputStream;
    }

    public void mark(int i) {
        this.f1624e.mark(i);
    }

    public boolean markSupported() {
        return this.f1624e.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f1624e.read(bArr);
        } catch (IOException e) {
            this.f1625l = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f1624e.reset();
    }

    public long skip(long j) {
        try {
            return this.f1624e.skip(j);
        } catch (IOException e) {
            this.f1625l = e;
            return 0;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f1624e.read(bArr, i, i2);
        } catch (IOException e) {
            this.f1625l = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f1624e.read();
        } catch (IOException e) {
            this.f1625l = e;
            return -1;
        }
    }
}
