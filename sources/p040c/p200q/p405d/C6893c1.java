package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: c.q.d.c1 */
/* compiled from: RopeByteString */
public final class C6893c1 extends ByteString {

    /* renamed from: p */
    public static final int[] f13185p = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public static final long serialVersionUID = 1;

    /* renamed from: e */
    public final int f13186e;

    /* renamed from: l */
    public final ByteString f13187l;

    /* renamed from: m */
    public final ByteString f13188m;

    /* renamed from: n */
    public final int f13189n;

    /* renamed from: o */
    public final int f13190o;

    /* renamed from: c.q.d.c1$a */
    /* compiled from: RopeByteString */
    public class C6894a extends ByteString.C8408c {

        /* renamed from: e */
        public final C6896c f13191e = new C6896c(C6893c1.this, (C6894a) null);

        /* renamed from: l */
        public ByteString.C8412g f13192l = mo31856b();

        public C6894a() {
        }

        /* renamed from: b */
        public final ByteString.C8412g mo31856b() {
            if (this.f13191e.hasNext()) {
                return this.f13191e.next().iterator();
            }
            return null;
        }

        public boolean hasNext() {
            return this.f13192l != null;
        }

        public byte nextByte() {
            ByteString.C8412g gVar = this.f13192l;
            if (gVar != null) {
                byte nextByte = gVar.nextByte();
                if (!this.f13192l.hasNext()) {
                    this.f13192l = mo31856b();
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c.q.d.c1$c */
    /* compiled from: RopeByteString */
    public static final class C6896c implements Iterator<ByteString.C8414i> {

        /* renamed from: e */
        public final ArrayDeque<C6893c1> f13195e;

        /* renamed from: l */
        public ByteString.C8414i f13196l;

        public /* synthetic */ C6896c(ByteString byteString, C6894a aVar) {
            this(byteString);
        }

        /* renamed from: a */
        public final ByteString.C8414i mo31863a(ByteString byteString) {
            while (byteString instanceof C6893c1) {
                C6893c1 c1Var = (C6893c1) byteString;
                this.f13195e.push(c1Var);
                byteString = c1Var.f13187l;
            }
            return (ByteString.C8414i) byteString;
        }

        /* renamed from: b */
        public final ByteString.C8414i mo31864b() {
            ByteString.C8414i a;
            do {
                ArrayDeque<C6893c1> arrayDeque = this.f13195e;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a = mo31863a(this.f13195e.pop().f13188m);
            } while (a.isEmpty());
            return a;
        }

        /* renamed from: c */
        public ByteString.C8414i next() {
            ByteString.C8414i iVar = this.f13196l;
            if (iVar != null) {
                this.f13196l = mo31864b();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f13196l != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C6896c(ByteString byteString) {
            if (byteString instanceof C6893c1) {
                C6893c1 c1Var = (C6893c1) byteString;
                ArrayDeque<C6893c1> arrayDeque = new ArrayDeque<>(c1Var.getTreeDepth());
                this.f13195e = arrayDeque;
                arrayDeque.push(c1Var);
                this.f13196l = mo31863a(c1Var.f13187l);
                return;
            }
            this.f13195e = null;
            this.f13196l = (ByteString.C8414i) byteString;
        }
    }

    public /* synthetic */ C6893c1(ByteString byteString, ByteString byteString2, C6894a aVar) {
        this(byteString, byteString2);
    }

    /* renamed from: g */
    public static ByteString m19648g(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m19649l(byteString, byteString2);
        }
        if (byteString instanceof C6893c1) {
            C6893c1 c1Var = (C6893c1) byteString;
            if (c1Var.f13188m.size() + byteString2.size() < 128) {
                return new C6893c1(c1Var.f13187l, m19649l(c1Var.f13188m, byteString2));
            } else if (c1Var.f13187l.getTreeDepth() > c1Var.f13188m.getTreeDepth() && c1Var.getTreeDepth() > byteString2.getTreeDepth()) {
                return new C6893c1(c1Var.f13187l, new C6893c1(c1Var.f13188m, byteString2));
            }
        }
        if (size >= m19650p(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new C6893c1(byteString, byteString2);
        }
        return new C6895b((C6894a) null).mo31859b(byteString, byteString2);
    }

    /* renamed from: l */
    public static ByteString m19649l(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    /* renamed from: p */
    public static int m19650p(int i) {
        int[] iArr = f13185p;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C6896c cVar = new C6896c(this, (C6894a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.f13186e);
        return internalByteAt(i);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        this.f13187l.copyTo(byteBuffer);
        this.f13188m.copyTo(byteBuffer);
    }

    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f13189n;
        if (i4 <= i5) {
            this.f13187l.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f13188m.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f13187l.copyToInternal(bArr, i, i2, i6);
            this.f13188m.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f13186e != byteString.size()) {
            return false;
        }
        if (this.f13186e == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return mo31845o(byteString);
        }
        return false;
    }

    public int getTreeDepth() {
        return this.f13190o;
    }

    public byte internalByteAt(int i) {
        int i2 = this.f13189n;
        if (i < i2) {
            return this.f13187l.internalByteAt(i);
        }
        return this.f13188m.internalByteAt(i - i2);
    }

    public boolean isBalanced() {
        return this.f13186e >= m19650p(this.f13190o);
    }

    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.f13187l.partialIsValidUtf8(0, 0, this.f13189n);
        ByteString byteString = this.f13188m;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    public C6937j newCodedInput() {
        return C6937j.m19963f(new C6897d());
    }

    public InputStream newInput() {
        return new C6897d();
    }

    /* renamed from: o */
    public final boolean mo31845o(ByteString byteString) {
        boolean z;
        C6896c cVar = new C6896c(this, (C6894a) null);
        ByteString.C8414i iVar = (ByteString.C8414i) cVar.next();
        C6896c cVar2 = new C6896c(byteString, (C6894a) null);
        ByteString.C8414i iVar2 = (ByteString.C8414i) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = iVar.size() - i;
            int size2 = iVar2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = iVar.mo32380c(iVar2, i2, min);
            } else {
                z = iVar2.mo32380c(iVar, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f13186e;
            if (i3 < i4) {
                if (min == size) {
                    iVar = (ByteString.C8414i) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    iVar2 = (ByteString.C8414i) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f13189n;
        if (i4 <= i5) {
            return this.f13187l.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f13188m.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f13188m.partialHash(this.f13187l.partialHash(i, i2, i6), 0, i3 - i6);
    }

    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f13189n;
        if (i4 <= i5) {
            return this.f13187l.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f13188m.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f13188m.partialIsValidUtf8(this.f13187l.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    public int size() {
        return this.f13186e;
    }

    public ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, this.f13186e);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.f13186e) {
            return this;
        }
        int i3 = this.f13189n;
        if (i2 <= i3) {
            return this.f13187l.substring(i, i2);
        }
        if (i >= i3) {
            return this.f13188m.substring(i - i3, i2 - i3);
        }
        return new C6893c1(this.f13187l.substring(i), this.f13188m.substring(0, i2 - this.f13189n));
    }

    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    public void writeTo(OutputStream outputStream) {
        this.f13187l.writeTo(outputStream);
        this.f13188m.writeTo(outputStream);
    }

    public void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f13189n;
        if (i3 <= i4) {
            this.f13187l.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.f13188m.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f13187l.writeToInternal(outputStream, i, i5);
            this.f13188m.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    public void writeToReverse(C6932i iVar) {
        this.f13188m.writeToReverse(iVar);
        this.f13187l.writeToReverse(iVar);
    }

    /* renamed from: c.q.d.c1$b */
    /* compiled from: RopeByteString */
    public static class C6895b {

        /* renamed from: a */
        public final ArrayDeque<ByteString> f13194a;

        public C6895b() {
            this.f13194a = new ArrayDeque<>();
        }

        /* renamed from: b */
        public final ByteString mo31859b(ByteString byteString, ByteString byteString2) {
            mo31860c(byteString);
            mo31860c(byteString2);
            ByteString pop = this.f13194a.pop();
            while (!this.f13194a.isEmpty()) {
                pop = new C6893c1(this.f13194a.pop(), pop, (C6894a) null);
            }
            return pop;
        }

        /* renamed from: c */
        public final void mo31860c(ByteString byteString) {
            if (byteString.isBalanced()) {
                mo31862e(byteString);
            } else if (byteString instanceof C6893c1) {
                C6893c1 c1Var = (C6893c1) byteString;
                mo31860c(c1Var.f13187l);
                mo31860c(c1Var.f13188m);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        public final int mo31861d(int i) {
            int binarySearch = Arrays.binarySearch(C6893c1.f13185p, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        public final void mo31862e(ByteString byteString) {
            int d = mo31861d(byteString.size());
            int p = C6893c1.m19650p(d + 1);
            if (this.f13194a.isEmpty() || this.f13194a.peek().size() >= p) {
                this.f13194a.push(byteString);
                return;
            }
            int p2 = C6893c1.m19650p(d);
            ByteString pop = this.f13194a.pop();
            while (!this.f13194a.isEmpty() && this.f13194a.peek().size() < p2) {
                pop = new C6893c1(this.f13194a.pop(), pop, (C6894a) null);
            }
            C6893c1 c1Var = new C6893c1(pop, byteString, (C6894a) null);
            while (!this.f13194a.isEmpty() && this.f13194a.peek().size() < C6893c1.m19650p(mo31861d(c1Var.size()) + 1)) {
                c1Var = new C6893c1(this.f13194a.pop(), c1Var, (C6894a) null);
            }
            this.f13194a.push(c1Var);
        }

        public /* synthetic */ C6895b(C6894a aVar) {
            this();
        }
    }

    public C6893c1(ByteString byteString, ByteString byteString2) {
        this.f13187l = byteString;
        this.f13188m = byteString2;
        int size = byteString.size();
        this.f13189n = size;
        this.f13186e = size + byteString2.size();
        this.f13190o = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public ByteString.C8412g iterator() {
        return new C6894a();
    }

    public void writeTo(C6932i iVar) {
        this.f13187l.writeTo(iVar);
        this.f13188m.writeTo(iVar);
    }

    /* renamed from: c.q.d.c1$d */
    /* compiled from: RopeByteString */
    public class C6897d extends InputStream {

        /* renamed from: e */
        public C6896c f13197e;

        /* renamed from: l */
        public ByteString.C8414i f13198l;

        /* renamed from: m */
        public int f13199m;

        /* renamed from: n */
        public int f13200n;

        /* renamed from: o */
        public int f13201o;

        /* renamed from: p */
        public int f13202p;

        public C6897d() {
            mo31871b();
        }

        /* renamed from: a */
        public final void mo31869a() {
            int i;
            if (this.f13198l != null && this.f13200n == (i = this.f13199m)) {
                this.f13201o += i;
                this.f13200n = 0;
                if (this.f13197e.hasNext()) {
                    ByteString.C8414i c = this.f13197e.next();
                    this.f13198l = c;
                    this.f13199m = c.size();
                    return;
                }
                this.f13198l = null;
                this.f13199m = 0;
            }
        }

        public int available() {
            return C6893c1.this.size() - (this.f13201o + this.f13200n);
        }

        /* renamed from: b */
        public final void mo31871b() {
            C6896c cVar = new C6896c(C6893c1.this, (C6894a) null);
            this.f13197e = cVar;
            ByteString.C8414i c = cVar.next();
            this.f13198l = c;
            this.f13199m = c.size();
            this.f13200n = 0;
            this.f13201o = 0;
        }

        /* renamed from: c */
        public final int mo31872c(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                mo31869a();
                if (this.f13198l == null) {
                    break;
                }
                int min = Math.min(this.f13199m - this.f13200n, i3);
                if (bArr != null) {
                    this.f13198l.copyTo(bArr, this.f13200n, i, min);
                    i += min;
                }
                this.f13200n += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        public void mark(int i) {
            this.f13202p = this.f13201o + this.f13200n;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw null;
            } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            } else {
                int c = mo31872c(bArr, i, i2);
                if (c == 0) {
                    return -1;
                }
                return c;
            }
        }

        public synchronized void reset() {
            mo31871b();
            mo31872c((byte[]) null, 0, this.f13202p);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) mo31872c((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() {
            mo31869a();
            ByteString.C8414i iVar = this.f13198l;
            if (iVar == null) {
                return -1;
            }
            int i = this.f13200n;
            this.f13200n = i + 1;
            return iVar.byteAt(i) & 255;
        }
    }
}
