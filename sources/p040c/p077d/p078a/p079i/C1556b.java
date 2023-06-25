package p040c.p077d.p078a.p079i;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: c.d.a.i.b */
/* compiled from: StrictLineReader */
public class C1556b implements Closeable {

    /* renamed from: e */
    public final InputStream f858e;

    /* renamed from: l */
    public final Charset f859l;

    /* renamed from: m */
    public byte[] f860m;

    /* renamed from: n */
    public int f861n;

    /* renamed from: o */
    public int f862o;

    /* renamed from: c.d.a.i.b$a */
    /* compiled from: StrictLineReader */
    public class C1557a extends ByteArrayOutputStream {
        public C1557a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C1556b.this.f859l.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C1556b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void mo15552b() {
        InputStream inputStream = this.f858e;
        byte[] bArr = this.f860m;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f861n = 0;
            this.f862o = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean mo15553c() {
        return this.f862o == -1;
    }

    public void close() {
        synchronized (this.f858e) {
            if (this.f860m != null) {
                this.f860m = null;
                this.f858e.close();
            }
        }
    }

    /* renamed from: d */
    public String mo15555d() {
        int i;
        int i2;
        synchronized (this.f858e) {
            if (this.f860m != null) {
                if (this.f861n >= this.f862o) {
                    mo15552b();
                }
                for (int i3 = this.f861n; i3 != this.f862o; i3++) {
                    if (this.f860m[i3] == 10) {
                        if (i3 != this.f861n) {
                            i2 = i3 - 1;
                            if (this.f860m[i2] == 13) {
                                String str = new String(this.f860m, this.f861n, i2 - this.f861n, this.f859l.name());
                                this.f861n = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f860m, this.f861n, i2 - this.f861n, this.f859l.name());
                        this.f861n = i3 + 1;
                        return str2;
                    }
                }
                C1557a aVar = new C1557a((this.f862o - this.f861n) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f860m, this.f861n, this.f862o - this.f861n);
                    this.f862o = -1;
                    mo15552b();
                    i = this.f861n;
                    while (true) {
                        if (i != this.f862o) {
                            if (this.f860m[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f861n) {
                    aVar.write(this.f860m, this.f861n, i - this.f861n);
                }
                this.f861n = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C1556b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1558c.f864a)) {
            this.f858e = inputStream;
            this.f859l = charset;
            this.f860m = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
