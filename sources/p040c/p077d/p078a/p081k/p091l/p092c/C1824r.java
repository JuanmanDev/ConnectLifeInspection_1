package p040c.p077d.p078a.p081k.p091l.p092c;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

/* renamed from: c.d.a.k.l.c.r */
/* compiled from: RecyclableBufferedInputStream */
public class C1824r extends FilterInputStream {

    /* renamed from: e */
    public volatile byte[] f1403e;

    /* renamed from: l */
    public int f1404l;

    /* renamed from: m */
    public int f1405m;

    /* renamed from: n */
    public int f1406n;

    /* renamed from: o */
    public int f1407o;

    /* renamed from: p */
    public final C1692b f1408p;

    /* renamed from: c.d.a.k.l.c.r$a */
    /* compiled from: RecyclableBufferedInputStream */
    public static class C1825a extends IOException {
        public static final long serialVersionUID = -4338378848813561757L;

        public C1825a(String str) {
            super(str);
        }
    }

    public C1824r(@NonNull InputStream inputStream, @NonNull C1692b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: d */
    public static IOException m2077d() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int mo16109a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f1406n;
        if (i2 == -1 || this.f1407o - i2 >= (i = this.f1405m)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f1406n = -1;
                this.f1407o = 0;
                this.f1404l = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f1404l == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f1408p.mo15901d(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f1403e = bArr2;
            this.f1408p.put(bArr);
            bArr = bArr2;
        } else {
            int i3 = this.f1406n;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        int i4 = this.f1407o - this.f1406n;
        this.f1407o = i4;
        this.f1406n = 0;
        this.f1404l = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.f1407o;
        if (read2 > 0) {
            i5 += read2;
        }
        this.f1404l = i5;
        return read2;
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f1403e == null || inputStream == null) {
            m2077d();
            throw null;
        }
        return (this.f1404l - this.f1407o) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo16111b() {
        this.f1405m = this.f1403e.length;
    }

    /* renamed from: c */
    public synchronized void mo16112c() {
        if (this.f1403e != null) {
            this.f1408p.put(this.f1403e);
            this.f1403e = null;
        }
    }

    public void close() {
        if (this.f1403e != null) {
            this.f1408p.put(this.f1403e);
            this.f1403e = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f1405m = Math.max(this.f1405m, i);
        this.f1406n = this.f1407o;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f1403e     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f1407o     // Catch:{ all -> 0x003f }
            int r4 = r6.f1404l     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.mo16109a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f1403e     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f1403e     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m2077d()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f1404l     // Catch:{ all -> 0x003f }
            int r2 = r6.f1407o     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f1407o     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f1407o = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            m2077d()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p091l.p092c.C1824r.read():int");
    }

    public synchronized void reset() {
        if (this.f1403e == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f1406n) {
            this.f1407o = this.f1406n;
        } else {
            throw new C1825a("Mark has been invalidated, pos: " + this.f1407o + " markLimit: " + this.f1405m);
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f1403e;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                m2077d();
                throw null;
            } else if (((long) (this.f1404l - this.f1407o)) >= j) {
                this.f1407o = (int) (((long) this.f1407o) + j);
                return j;
            } else {
                long j2 = ((long) this.f1404l) - ((long) this.f1407o);
                this.f1407o = this.f1404l;
                if (this.f1406n == -1 || j > ((long) this.f1405m)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (mo16109a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f1404l - this.f1407o)) >= j - j2) {
                        this.f1407o = (int) ((((long) this.f1407o) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f1404l)) - ((long) this.f1407o);
                    this.f1407o = this.f1404l;
                    return j3;
                }
            }
        } else {
            m2077d();
            throw null;
        }
    }

    @VisibleForTesting
    public C1824r(@NonNull InputStream inputStream, @NonNull C1692b bVar, int i) {
        super(inputStream);
        this.f1406n = -1;
        this.f1408p = bVar;
        this.f1403e = (byte[]) bVar.mo15901d(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@androidx.annotation.NonNull byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f1403e     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r4 = r6.f1404l     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f1404l     // Catch:{ all -> 0x009c }
            int r4 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f1404l     // Catch:{ all -> 0x009c }
            int r4 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f1407o     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f1407o = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f1406n     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.mo16109a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.f1403e     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.f1403e     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            m2077d()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f1404l     // Catch:{ all -> 0x009c }
            int r5 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f1404l     // Catch:{ all -> 0x009c }
            int r5 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f1407o     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f1407o     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f1407o = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            m2077d()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            m2077d()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p091l.p092c.C1824r.read(byte[], int, int):int");
    }
}
