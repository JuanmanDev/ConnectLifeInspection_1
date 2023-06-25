package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* renamed from: c.q.d.u0 */
/* compiled from: NioByteString */
public final class C6991u0 extends ByteString.C8414i {

    /* renamed from: e */
    public final ByteBuffer f13382e;

    public C6991u0(ByteBuffer byteBuffer) {
        C6999y.m20708b(byteBuffer, "buffer");
        this.f13382e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f13382e.slice());
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f13382e.asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    public byte byteAt(int i) {
        try {
            return this.f13382e.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: c */
    public boolean mo32380c(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13382e.slice());
    }

    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.f13382e.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C6991u0) {
            return this.f13382e.equals(((C6991u0) obj).f13382e);
        }
        if (obj instanceof C6893c1) {
            return obj.equals(this);
        }
        return this.f13382e.equals(byteString.asReadOnlyByteBuffer());
    }

    /* renamed from: g */
    public final ByteBuffer mo32381g(int i, int i2) {
        if (i < this.f13382e.position() || i2 > this.f13382e.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.f13382e.slice();
        slice.position(i - this.f13382e.position());
        slice.limit(i2 - this.f13382e.position());
        return slice;
    }

    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    public boolean isValidUtf8() {
        return C6969o1.m20453r(this.f13382e);
    }

    public C6937j newCodedInput() {
        return C6937j.m19965h(this.f13382e, true);
    }

    public InputStream newInput() {
        return new C6992a();
    }

    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f13382e.get(i4);
        }
        return i;
    }

    public int partialIsValidUtf8(int i, int i2, int i3) {
        return C6969o1.m20456u(i, this.f13382e, i2, i3 + i2);
    }

    public int size() {
        return this.f13382e.remaining();
    }

    public ByteString substring(int i, int i2) {
        try {
            return new C6991u0(mo32381g(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public String toStringInternal(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.f13382e.hasArray()) {
            bArr = this.f13382e.array();
            i2 = this.f13382e.arrayOffset() + this.f13382e.position();
            i = this.f13382e.remaining();
        } else {
            bArr = toByteArray();
            i2 = 0;
            i = bArr.length;
        }
        return new String(bArr, i2, i, charset);
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }

    public void writeToInternal(OutputStream outputStream, int i, int i2) {
        if (this.f13382e.hasArray()) {
            outputStream.write(this.f13382e.array(), this.f13382e.arrayOffset() + this.f13382e.position() + i, i2);
            return;
        }
        C6929h.m19929g(mo32381g(i, i2 + i), outputStream);
    }

    /* renamed from: c.q.d.u0$a */
    /* compiled from: NioByteString */
    public class C6992a extends InputStream {

        /* renamed from: e */
        public final ByteBuffer f13383e = C6991u0.this.f13382e.slice();

        public C6992a() {
        }

        public int available() {
            return this.f13383e.remaining();
        }

        public void mark(int i) {
            this.f13383e.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f13383e.hasRemaining()) {
                return -1;
            }
            return this.f13383e.get() & 255;
        }

        public void reset() {
            try {
                this.f13383e.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!this.f13383e.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f13383e.remaining());
            this.f13383e.get(bArr, i, min);
            return min;
        }
    }

    public void writeTo(C6932i iVar) {
        iVar.mo32019a(this.f13382e.slice());
    }
}
