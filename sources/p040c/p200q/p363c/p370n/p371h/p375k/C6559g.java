package p040c.p200q.p363c.p370n.p371h.p375k;

import android.support.p025v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.q.c.n.h.k.g */
/* compiled from: QueueFile */
public class C6559g implements Closeable {

    /* renamed from: q */
    public static final Logger f12370q = Logger.getLogger(C6559g.class.getName());

    /* renamed from: e */
    public final RandomAccessFile f12371e;

    /* renamed from: l */
    public int f12372l;

    /* renamed from: m */
    public int f12373m;

    /* renamed from: n */
    public C6561b f12374n;

    /* renamed from: o */
    public C6561b f12375o;

    /* renamed from: p */
    public final byte[] f12376p = new byte[16];

    /* renamed from: c.q.c.n.h.k.g$a */
    /* compiled from: QueueFile */
    public class C6560a implements C6563d {

        /* renamed from: a */
        public boolean f12377a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f12378b;

        public C6560a(StringBuilder sb) {
            this.f12378b = sb;
        }

        /* renamed from: a */
        public void mo30869a(InputStream inputStream, int i) {
            if (this.f12377a) {
                this.f12377a = false;
            } else {
                this.f12378b.append(", ");
            }
            this.f12378b.append(i);
        }
    }

    /* renamed from: c.q.c.n.h.k.g$b */
    /* compiled from: QueueFile */
    public static class C6561b {

        /* renamed from: c */
        public static final C6561b f12380c = new C6561b(0, 0);

        /* renamed from: a */
        public final int f12381a;

        /* renamed from: b */
        public final int f12382b;

        public C6561b(int i, int i2) {
            this.f12381a = i;
            this.f12382b = i2;
        }

        public String toString() {
            return C6561b.class.getSimpleName() + "[position = " + this.f12381a + ", length = " + this.f12382b + "]";
        }
    }

    /* renamed from: c.q.c.n.h.k.g$c */
    /* compiled from: QueueFile */
    public final class C6562c extends InputStream {

        /* renamed from: e */
        public int f12383e;

        /* renamed from: l */
        public int f12384l;

        public /* synthetic */ C6562c(C6559g gVar, C6561b bVar, C6560a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C6559g.m18462n(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f12384l;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C6559g.this.mo30866x(this.f12383e, bArr, i, i2);
            this.f12383e = C6559g.this.mo30852B(this.f12383e + i2);
            this.f12384l -= i2;
            return i2;
        }

        public C6562c(C6561b bVar) {
            this.f12383e = C6559g.this.mo30852B(bVar.f12381a + 4);
            this.f12384l = bVar.f12382b;
        }

        public int read() {
            if (this.f12384l == 0) {
                return -1;
            }
            C6559g.this.f12371e.seek((long) this.f12383e);
            int read = C6559g.this.f12371e.read();
            this.f12383e = C6559g.this.mo30852B(this.f12383e + 1);
            this.f12384l--;
            return read;
        }
    }

    /* renamed from: c.q.c.n.h.k.g$d */
    /* compiled from: QueueFile */
    public interface C6563d {
        /* renamed from: a */
        void mo30869a(InputStream inputStream, int i);
    }

    public C6559g(File file) {
        if (!file.exists()) {
            m18461j(file);
        }
        this.f12371e = m18463o(file);
        mo30862r();
    }

    /* renamed from: D */
    public static void m18455D(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: F */
    public static void m18456F(byte[] bArr, int... iArr) {
        int i = 0;
        for (int D : iArr) {
            m18455D(bArr, i, D);
            i += 4;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public static void m18461j(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile o = m18463o(file2);
        try {
            o.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            o.seek(0);
            byte[] bArr = new byte[16];
            m18456F(bArr, 4096, 0, 0, 0);
            o.write(bArr);
            o.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    /* renamed from: n */
    public static <T> T m18462n(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: o */
    public static RandomAccessFile m18463o(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: s */
    public static int m18464s(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: A */
    public int mo30851A() {
        if (this.f12373m == 0) {
            return 16;
        }
        C6561b bVar = this.f12375o;
        int i = bVar.f12381a;
        int i2 = this.f12374n.f12381a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f12382b + 16;
        }
        return (((i + 4) + bVar.f12382b) + this.f12372l) - i2;
    }

    /* renamed from: B */
    public final int mo30852B(int i) {
        int i2 = this.f12372l;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: C */
    public final void mo30853C(int i, int i2, int i3, int i4) {
        m18456F(this.f12376p, i, i2, i3, i4);
        this.f12371e.seek(0);
        this.f12371e.write(this.f12376p);
    }

    public synchronized void close() {
        this.f12371e.close();
    }

    /* renamed from: e */
    public void mo30855e(byte[] bArr) {
        mo30856f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public synchronized void mo30856f(byte[] bArr, int i, int i2) {
        int i3;
        m18462n(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        mo30858h(i2);
        boolean m = mo30860m();
        if (m) {
            i3 = 16;
        } else {
            i3 = mo30852B(this.f12375o.f12381a + 4 + this.f12375o.f12382b);
        }
        C6561b bVar = new C6561b(i3, i2);
        m18455D(this.f12376p, 0, i2);
        mo30867y(bVar.f12381a, this.f12376p, 0, 4);
        mo30867y(bVar.f12381a + 4, bArr, i, i2);
        mo30853C(this.f12372l, this.f12373m + 1, m ? bVar.f12381a : this.f12374n.f12381a, bVar.f12381a);
        this.f12375o = bVar;
        this.f12373m++;
        if (m) {
            this.f12374n = bVar;
        }
    }

    /* renamed from: g */
    public synchronized void mo30857g() {
        mo30853C(4096, 0, 0, 0);
        this.f12373m = 0;
        this.f12374n = C6561b.f12380c;
        this.f12375o = C6561b.f12380c;
        if (this.f12372l > 4096) {
            mo30868z(4096);
        }
        this.f12372l = 4096;
    }

    /* renamed from: h */
    public final void mo30858h(int i) {
        int i2 = i + 4;
        int u = mo30864u();
        if (u < i2) {
            int i3 = this.f12372l;
            do {
                u += i3;
                i3 <<= 1;
            } while (u < i2);
            mo30868z(i3);
            C6561b bVar = this.f12375o;
            int B = mo30852B(bVar.f12381a + 4 + bVar.f12382b);
            if (B < this.f12374n.f12381a) {
                FileChannel channel = this.f12371e.getChannel();
                channel.position((long) this.f12372l);
                long j = (long) (B - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f12375o.f12381a;
            int i5 = this.f12374n.f12381a;
            if (i4 < i5) {
                int i6 = (this.f12372l + i4) - 16;
                mo30853C(i3, this.f12373m, i5, i6);
                this.f12375o = new C6561b(i6, this.f12375o.f12382b);
            } else {
                mo30853C(i3, this.f12373m, i5, i4);
            }
            this.f12372l = i3;
        }
    }

    /* renamed from: i */
    public synchronized void mo30859i(C6563d dVar) {
        int i = this.f12374n.f12381a;
        for (int i2 = 0; i2 < this.f12373m; i2++) {
            C6561b q = mo30861q(i);
            dVar.mo30869a(new C6562c(this, q, (C6560a) null), q.f12382b);
            i = mo30852B(q.f12381a + 4 + q.f12382b);
        }
    }

    /* renamed from: m */
    public synchronized boolean mo30860m() {
        return this.f12373m == 0;
    }

    /* renamed from: q */
    public final C6561b mo30861q(int i) {
        if (i == 0) {
            return C6561b.f12380c;
        }
        this.f12371e.seek((long) i);
        return new C6561b(i, this.f12371e.readInt());
    }

    /* renamed from: r */
    public final void mo30862r() {
        this.f12371e.seek(0);
        this.f12371e.readFully(this.f12376p);
        int s = m18464s(this.f12376p, 0);
        this.f12372l = s;
        if (((long) s) <= this.f12371e.length()) {
            this.f12373m = m18464s(this.f12376p, 4);
            int s2 = m18464s(this.f12376p, 8);
            int s3 = m18464s(this.f12376p, 12);
            this.f12374n = mo30861q(s2);
            this.f12375o = mo30861q(s3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f12372l + ", Actual length: " + this.f12371e.length());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6559g.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f12372l);
        sb.append(", size=");
        sb.append(this.f12373m);
        sb.append(", first=");
        sb.append(this.f12374n);
        sb.append(", last=");
        sb.append(this.f12375o);
        sb.append(", element lengths=[");
        try {
            mo30859i(new C6560a(sb));
        } catch (IOException e) {
            f12370q.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: u */
    public final int mo30864u() {
        return this.f12372l - mo30851A();
    }

    /* renamed from: w */
    public synchronized void mo30865w() {
        if (mo30860m()) {
            throw new NoSuchElementException();
        } else if (this.f12373m == 1) {
            mo30857g();
        } else {
            int B = mo30852B(this.f12374n.f12381a + 4 + this.f12374n.f12382b);
            mo30866x(B, this.f12376p, 0, 4);
            int s = m18464s(this.f12376p, 0);
            mo30853C(this.f12372l, this.f12373m - 1, B, this.f12375o.f12381a);
            this.f12373m--;
            this.f12374n = new C6561b(B, s);
        }
    }

    /* renamed from: x */
    public final void mo30866x(int i, byte[] bArr, int i2, int i3) {
        int B = mo30852B(i);
        int i4 = B + i3;
        int i5 = this.f12372l;
        if (i4 <= i5) {
            this.f12371e.seek((long) B);
            this.f12371e.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - B;
        this.f12371e.seek((long) B);
        this.f12371e.readFully(bArr, i2, i6);
        this.f12371e.seek(16);
        this.f12371e.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: y */
    public final void mo30867y(int i, byte[] bArr, int i2, int i3) {
        int B = mo30852B(i);
        int i4 = B + i3;
        int i5 = this.f12372l;
        if (i4 <= i5) {
            this.f12371e.seek((long) B);
            this.f12371e.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - B;
        this.f12371e.seek((long) B);
        this.f12371e.write(bArr, i2, i6);
        this.f12371e.seek(16);
        this.f12371e.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: z */
    public final void mo30868z(int i) {
        this.f12371e.setLength((long) i);
        this.f12371e.getChannel().force(true);
    }
}
