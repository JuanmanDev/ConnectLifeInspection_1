package p040c.p077d.p078a.p105q;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.d.a.q.b */
/* compiled from: ContentLengthInputStream */
public final class C1940b extends FilterInputStream {

    /* renamed from: e */
    public final long f1621e;

    /* renamed from: l */
    public int f1622l;

    public C1940b(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f1621e = j;
    }

    @NonNull
    /* renamed from: b */
    public static InputStream m2538b(@NonNull InputStream inputStream, long j) {
        return new C1940b(inputStream, j);
    }

    /* renamed from: a */
    public final int mo16413a(int i) {
        if (i >= 0) {
            this.f1622l += i;
        } else if (this.f1621e - ((long) this.f1622l) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f1621e + ", but read: " + this.f1622l);
        }
        return i;
    }

    public synchronized int available() {
        return (int) Math.max(this.f1621e - ((long) this.f1622l), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        mo16413a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        mo16413a(read);
        return read;
    }
}
