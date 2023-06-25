package p040c.p107e.p108a.p109e.p110d;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* renamed from: c.e.a.e.d.h */
/* compiled from: HttpEntityDigester */
public class C1979h implements BufferedSink {

    /* renamed from: e */
    public final MessageDigest f1670e;

    /* renamed from: l */
    public boolean f1671l;

    /* renamed from: m */
    public byte[] f1672m;

    /* renamed from: n */
    public Buffer f1673n = new Buffer();

    public C1979h(MessageDigest messageDigest) {
        this.f1670e = messageDigest;
        messageDigest.reset();
    }

    /* renamed from: b */
    public byte[] mo16497b() {
        return this.f1672m;
    }

    public Buffer buffer() {
        return this.f1673n;
    }

    public void close() {
        if (!this.f1671l) {
            this.f1671l = true;
            this.f1672m = this.f1670e.digest();
            this.f1673n.close();
        }
    }

    public BufferedSink emit() {
        return this;
    }

    public BufferedSink emitCompleteSegments() {
        return null;
    }

    public void flush() {
    }

    public Buffer getBuffer() {
        return this.f1673n;
    }

    public boolean isOpen() {
        return false;
    }

    public OutputStream outputStream() {
        return new C1980a();
    }

    public Timeout timeout() {
        return null;
    }

    public int write(ByteBuffer byteBuffer) {
        return 0;
    }

    public BufferedSink write(ByteString byteString) {
        this.f1670e.update(byteString.toByteArray());
        return this;
    }

    public BufferedSink write(ByteString byteString, int i, int i2) {
        return null;
    }

    public void write(Buffer buffer, long j) {
    }

    public long writeAll(Source source) {
        return 0;
    }

    public BufferedSink writeByte(int i) {
        return null;
    }

    public BufferedSink writeDecimalLong(long j) {
        return null;
    }

    public BufferedSink writeHexadecimalUnsignedLong(long j) {
        return null;
    }

    public BufferedSink writeInt(int i) {
        return null;
    }

    public BufferedSink writeIntLe(int i) {
        return null;
    }

    public BufferedSink writeLong(long j) {
        return null;
    }

    public BufferedSink writeLongLe(long j) {
        return null;
    }

    public BufferedSink writeShort(int i) {
        return null;
    }

    public BufferedSink writeShortLe(int i) {
        return null;
    }

    public BufferedSink writeString(String str, int i, int i2, Charset charset) {
        return null;
    }

    public BufferedSink writeString(String str, Charset charset) {
        return null;
    }

    public BufferedSink writeUtf8(String str) {
        return null;
    }

    public BufferedSink writeUtf8(String str, int i, int i2) {
        return null;
    }

    public BufferedSink writeUtf8CodePoint(int i) {
        return null;
    }

    public BufferedSink write(byte[] bArr) {
        this.f1670e.update(bArr);
        return this;
    }

    public BufferedSink write(byte[] bArr, int i, int i2) {
        this.f1670e.update(bArr, i, i2);
        return this;
    }

    /* renamed from: c.e.a.e.d.h$a */
    /* compiled from: HttpEntityDigester */
    public class C1980a extends OutputStream {
        public C1980a() {
        }

        public void close() {
            C1979h.this.close();
        }

        public void flush() {
            if (!C1979h.this.f1671l) {
                C1979h.this.flush();
            }
        }

        public String toString() {
            return C1979h.this + ".outputStream()";
        }

        public void write(int i) {
            if (!C1979h.this.f1671l) {
                C1979h.this.f1673n.writeByte((int) (byte) i);
                C1979h.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i, int i2) {
            if (!C1979h.this.f1671l) {
                C1979h.this.f1673n.write(bArr, i, i2);
                C1979h.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    public BufferedSink write(Source source, long j) {
        if (!this.f1671l) {
            return null;
        }
        throw new IOException("Stream has been already closed");
    }
}
