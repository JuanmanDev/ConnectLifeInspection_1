package p040c.p200q.p363c.p400x;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: c.q.c.x.c0 */
/* compiled from: ByteStreams */
public final class C6808c0 {
    /* renamed from: a */
    public static byte[] m19314a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m19315b(InputStream inputStream, long j) {
        return new C6809a(inputStream, j);
    }

    /* renamed from: c */
    public static int m19316c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static byte[] m19317d(InputStream inputStream) {
        return m19318e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m19318e(InputStream inputStream, Queue<byte[]> queue, int i) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, kotlin.collections.ArrayDeque.maxArraySize - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m19314a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = m19316c(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m19314a(queue, kotlin.collections.ArrayDeque.maxArraySize);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: c.q.c.x.c0$a */
    /* compiled from: ByteStreams */
    public static final class C6809a extends FilterInputStream {

        /* renamed from: e */
        public long f13040e;

        /* renamed from: l */
        public long f13041l = -1;

        public C6809a(InputStream inputStream, long j) {
            super(inputStream);
            this.f13040e = j;
        }

        public int available() {
            return (int) Math.min((long) this.in.available(), this.f13040e);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f13041l = this.f13040e;
        }

        public int read() {
            if (this.f13040e == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f13040e--;
            }
            return read;
        }

        public synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f13041l != -1) {
                this.in.reset();
                this.f13040e = this.f13041l;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) {
            long skip = this.in.skip(Math.min(j, this.f13040e));
            this.f13040e -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) {
            long j = this.f13040e;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f13040e -= (long) read;
            }
            return read;
        }
    }
}
