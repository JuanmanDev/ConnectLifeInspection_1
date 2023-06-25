package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import p040c.p200q.p405d.C6893c1;
import p040c.p200q.p405d.C6898d;
import p040c.p200q.p405d.C6932i;
import p040c.p200q.p405d.C6934i1;
import p040c.p200q.p405d.C6937j;
import p040c.p200q.p405d.C6969o1;
import p040c.p200q.p405d.C6991u0;
import p040c.p200q.p405d.C6999y;

public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new C8415j(C6999y.f13393b);
    public static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    public static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    public static final int UNSIGNED_BYTE_MASK = 255;
    public static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new C8407b();
    public static final C8411f byteArrayCopier = (C6898d.m19666c() ? new C8417l((C8406a) null) : new C8409d((C8406a) null));
    public int hash = 0;

    /* renamed from: com.google.protobuf.ByteString$a */
    public class C8406a extends C8408c {

        /* renamed from: e */
        public int f15495e = 0;

        /* renamed from: l */
        public final int f15496l = ByteString.this.size();

        public C8406a() {
        }

        public boolean hasNext() {
            return this.f15495e < this.f15496l;
        }

        public byte nextByte() {
            int i = this.f15495e;
            if (i < this.f15496l) {
                this.f15495e = i + 1;
                return ByteString.this.internalByteAt(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$b */
    public static class C8407b implements Comparator<ByteString> {
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            C8412g it = byteString.iterator();
            C8412g it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(ByteString.toInt(it.nextByte()), ByteString.toInt(it2.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    /* renamed from: com.google.protobuf.ByteString$c */
    public static abstract class C8408c implements C8412g {
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$d */
    public static final class C8409d implements C8411f {
        public C8409d() {
        }

        /* renamed from: a */
        public byte[] mo37892a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C8409d(C8406a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$e */
    public static final class C8410e extends C8415j {
        public static final long serialVersionUID = 1;

        /* renamed from: l */
        public final int f15498l;

        /* renamed from: m */
        public final int f15499m;

        public C8410e(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.f15498l = i;
            this.f15499m = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.f15502e[this.f15498l + i];
        }

        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f15502e, mo37893f() + i, bArr, i2, i3);
        }

        /* renamed from: f */
        public int mo37893f() {
            return this.f15498l;
        }

        public byte internalByteAt(int i) {
            return this.f15502e[this.f15498l + i];
        }

        public int size() {
            return this.f15499m;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    /* renamed from: com.google.protobuf.ByteString$f */
    public interface C8411f {
        /* renamed from: a */
        byte[] mo37892a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.ByteString$g */
    public interface C8412g extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: com.google.protobuf.ByteString$h */
    public static final class C8413h {

        /* renamed from: a */
        public final CodedOutputStream f15500a;

        /* renamed from: b */
        public final byte[] f15501b;

        public /* synthetic */ C8413h(int i, C8406a aVar) {
            this(i);
        }

        /* renamed from: a */
        public ByteString mo37895a() {
            this.f15500a.mo37928d();
            return new C8415j(this.f15501b);
        }

        /* renamed from: b */
        public CodedOutputStream mo37896b() {
            return this.f15500a;
        }

        public C8413h(int i) {
            byte[] bArr = new byte[i];
            this.f15501b = bArr;
            this.f15500a = CodedOutputStream.m23122e0(bArr);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$i */
    public static abstract class C8414i extends ByteString {
        /* renamed from: c */
        public abstract boolean mo32380c(ByteString byteString, int i, int i2);

        public final int getTreeDepth() {
            return 0;
        }

        public final boolean isBalanced() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }

        public void writeToReverse(C6932i iVar) {
            writeTo(iVar);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$j */
    public static class C8415j extends C8414i {
        public static final long serialVersionUID = 1;

        /* renamed from: e */
        public final byte[] f15502e;

        public C8415j(byte[] bArr) {
            if (bArr != null) {
                this.f15502e = bArr;
                return;
            }
            throw null;
        }

        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f15502e, mo37893f(), size()).asReadOnlyBuffer();
        }

        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        public byte byteAt(int i) {
            return this.f15502e[i];
        }

        /* renamed from: c */
        public final boolean mo32380c(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
                } else if (!(byteString instanceof C8415j)) {
                    return byteString.substring(i, i3).equals(substring(0, i2));
                } else {
                    C8415j jVar = (C8415j) byteString;
                    byte[] bArr = this.f15502e;
                    byte[] bArr2 = jVar.f15502e;
                    int f = mo37893f() + i2;
                    int f2 = mo37893f();
                    int f3 = jVar.mo37893f() + i;
                    while (f2 < f) {
                        if (bArr[f2] != bArr2[f3]) {
                            return false;
                        }
                        f2++;
                        f3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f15502e, mo37893f(), size());
        }

        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f15502e, i, bArr, i2, i3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C8415j)) {
                return obj.equals(this);
            }
            C8415j jVar = (C8415j) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = jVar.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return mo32380c(jVar, 0, size());
            }
            return false;
        }

        /* renamed from: f */
        public int mo37893f() {
            return 0;
        }

        public byte internalByteAt(int i) {
            return this.f15502e[i];
        }

        public final boolean isValidUtf8() {
            int f = mo37893f();
            return C6969o1.m20455t(this.f15502e, f, size() + f);
        }

        public final C6937j newCodedInput() {
            return C6937j.m19968k(this.f15502e, mo37893f(), size(), true);
        }

        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f15502e, mo37893f(), size());
        }

        public final int partialHash(int i, int i2, int i3) {
            return C6999y.m20715i(i, this.f15502e, mo37893f() + i2, i3);
        }

        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int f = mo37893f() + i2;
            return C6969o1.m20457v(i, this.f15502e, f, i3 + f);
        }

        public int size() {
            return this.f15502e.length;
        }

        public final ByteString substring(int i, int i2) {
            int checkRange = ByteString.checkRange(i, i2, size());
            if (checkRange == 0) {
                return ByteString.EMPTY;
            }
            return new C8410e(this.f15502e, mo37893f() + i, checkRange);
        }

        public final String toStringInternal(Charset charset) {
            return new String(this.f15502e, mo37893f(), size(), charset);
        }

        public final void writeTo(OutputStream outputStream) {
            outputStream.write(toByteArray());
        }

        public final void writeToInternal(OutputStream outputStream, int i, int i2) {
            outputStream.write(this.f15502e, mo37893f() + i, i2);
        }

        public final void writeTo(C6932i iVar) {
            iVar.mo32020b(this.f15502e, mo37893f(), size());
        }
    }

    /* renamed from: com.google.protobuf.ByteString$l */
    public static final class C8417l implements C8411f {
        public C8417l() {
        }

        /* renamed from: a */
        public byte[] mo37892a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C8417l(C8406a aVar) {
            this();
        }
    }

    public static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
        }
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new C8415j(byteArrayCopier.mo37892a(bArr, i, i2));
    }

    public static ByteString copyFromUtf8(String str) {
        return new C8415j(str.getBytes(C6999y.f13392a));
    }

    public static C8413h newCodedBuilder(int i) {
        return new C8413h(i, (C8406a) null);
    }

    public static C8416k newOutput(int i) {
        return new C8416k(i);
    }

    public static ByteString readChunk(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static ByteString readFrom(InputStream inputStream) {
        return readFrom(inputStream, 256, 8192);
    }

    public static int toInt(byte b) {
        return b & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return C6934i1.m19956a(this);
        }
        return C6934i1.m19956a(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C6991u0(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return C6893c1.m19648g(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract C6937j newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C6999y.f13393b;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(C6999y.f13392a);
    }

    public abstract void writeTo(C6932i iVar);

    public abstract void writeTo(OutputStream outputStream);

    public final void writeTo(OutputStream outputStream, int i, int i2) {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2);

    public abstract void writeToReverse(C6932i iVar);

    public static C8416k newOutput() {
        return new C8416k(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i) {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public C8412g iterator() {
        return new C8406a();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i);
            if (readChunk == null) {
                return copyFrom((Iterable<ByteString>) arrayList);
            }
            arrayList.add(readChunk);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$k */
    public static final class C8416k extends OutputStream {

        /* renamed from: e */
        public final int f15503e;

        /* renamed from: l */
        public final ArrayList<ByteString> f15504l;

        /* renamed from: m */
        public int f15505m;

        /* renamed from: n */
        public byte[] f15506n;

        /* renamed from: o */
        public int f15507o;

        public C8416k(int i) {
            if (i >= 0) {
                this.f15503e = i;
                this.f15504l = new ArrayList<>();
                this.f15506n = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final void mo37897a(int i) {
            this.f15504l.add(new C8415j(this.f15506n));
            int length = this.f15505m + this.f15506n.length;
            this.f15505m = length;
            this.f15506n = new byte[Math.max(this.f15503e, Math.max(i, length >>> 1))];
            this.f15507o = 0;
        }

        /* renamed from: b */
        public synchronized int mo37898b() {
            return this.f15505m + this.f15507o;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo37898b())});
        }

        public synchronized void write(int i) {
            if (this.f15507o == this.f15506n.length) {
                mo37897a(1);
            }
            byte[] bArr = this.f15506n;
            int i2 = this.f15507o;
            this.f15507o = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.f15506n.length - this.f15507o) {
                System.arraycopy(bArr, i, this.f15506n, this.f15507o, i2);
                this.f15507o += i2;
            } else {
                int length = this.f15506n.length - this.f15507o;
                System.arraycopy(bArr, i, this.f15506n, this.f15507o, length);
                int i3 = i2 - length;
                mo37897a(i3);
                System.arraycopy(bArr, i + length, this.f15506n, 0, i3);
                this.f15507o = i3;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C8415j(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new C8415j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new C8410e(bArr, i, i2);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay()});
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) {
        return new C8415j(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new C8415j(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), i);
    }
}
