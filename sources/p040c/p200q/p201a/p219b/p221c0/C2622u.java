package p040c.p200q.p201a.p219b.p221c0;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.u */
/* compiled from: SilenceSkippingAudioProcessor */
public final class C2622u implements AudioProcessor {

    /* renamed from: b */
    public int f3213b = -1;

    /* renamed from: c */
    public int f3214c = -1;

    /* renamed from: d */
    public int f3215d;

    /* renamed from: e */
    public boolean f3216e;

    /* renamed from: f */
    public ByteBuffer f3217f;

    /* renamed from: g */
    public ByteBuffer f3218g;

    /* renamed from: h */
    public boolean f3219h;

    /* renamed from: i */
    public byte[] f3220i;

    /* renamed from: j */
    public byte[] f3221j;

    /* renamed from: k */
    public int f3222k;

    /* renamed from: l */
    public int f3223l;

    /* renamed from: m */
    public int f3224m;

    /* renamed from: n */
    public boolean f3225n;

    /* renamed from: o */
    public long f3226o;

    public C2622u() {
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3217f = byteBuffer;
        this.f3218g = byteBuffer;
        byte[] bArr = C3152e0.f5824f;
        this.f3220i = bArr;
        this.f3221j = bArr;
    }

    /* renamed from: a */
    public void mo18306a() {
        this.f3216e = false;
        flush();
        this.f3217f = AudioProcessor.f7576a;
        this.f3213b = -1;
        this.f3214c = -1;
        this.f3224m = 0;
        byte[] bArr = C3152e0.f5824f;
        this.f3220i = bArr;
        this.f3221j = bArr;
    }

    /* renamed from: b */
    public boolean mo18307b() {
        return this.f3219h && this.f3218g == AudioProcessor.f7576a;
    }

    /* renamed from: c */
    public ByteBuffer mo18308c() {
        ByteBuffer byteBuffer = this.f3218g;
        this.f3218g = AudioProcessor.f7576a;
        return byteBuffer;
    }

    /* renamed from: d */
    public void mo18309d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.f3218g.hasRemaining()) {
            int i = this.f3222k;
            if (i == 0) {
                mo18354r(byteBuffer);
            } else if (i == 1) {
                mo18353q(byteBuffer);
            } else if (i == 2) {
                mo18355s(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: e */
    public int mo18310e() {
        return this.f3213b;
    }

    /* renamed from: f */
    public int mo18311f() {
        return this.f3214c;
    }

    public void flush() {
        if (isActive()) {
            int j = mo18346j(150000) * this.f3215d;
            if (this.f3220i.length != j) {
                this.f3220i = new byte[j];
            }
            int j2 = mo18346j(20000) * this.f3215d;
            this.f3224m = j2;
            if (this.f3221j.length != j2) {
                this.f3221j = new byte[j2];
            }
        }
        this.f3222k = 0;
        this.f3218g = AudioProcessor.f7576a;
        this.f3219h = false;
        this.f3226o = 0;
        this.f3223l = 0;
        this.f3225n = false;
    }

    /* renamed from: g */
    public int mo18313g() {
        return 2;
    }

    /* renamed from: h */
    public void mo18314h() {
        this.f3219h = true;
        int i = this.f3223l;
        if (i > 0) {
            mo18351o(this.f3220i, i);
        }
        if (!this.f3225n) {
            this.f3226o += (long) (this.f3224m / this.f3215d);
        }
    }

    /* renamed from: i */
    public boolean mo18315i(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
        } else if (this.f3214c == i && this.f3213b == i2) {
            return false;
        } else {
            this.f3214c = i;
            this.f3213b = i2;
            this.f3215d = i2 * 2;
            return true;
        }
    }

    public boolean isActive() {
        return this.f3214c != -1 && this.f3216e;
    }

    /* renamed from: j */
    public final int mo18346j(long j) {
        return (int) ((j * ((long) this.f3214c)) / EventLoop_commonKt.MS_TO_NS);
    }

    /* renamed from: k */
    public final int mo18347k(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs(byteBuffer.get(limit)) > 4) {
                int i = this.f3215d;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    /* renamed from: l */
    public final int mo18348l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i = this.f3215d;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: m */
    public long mo18349m() {
        return this.f3226o;
    }

    /* renamed from: n */
    public final void mo18350n(ByteBuffer byteBuffer) {
        mo18352p(byteBuffer.remaining());
        this.f3217f.put(byteBuffer);
        this.f3217f.flip();
        this.f3218g = this.f3217f;
    }

    /* renamed from: o */
    public final void mo18351o(byte[] bArr, int i) {
        mo18352p(i);
        this.f3217f.put(bArr, 0, i);
        this.f3217f.flip();
        this.f3218g = this.f3217f;
    }

    /* renamed from: p */
    public final void mo18352p(int i) {
        if (this.f3217f.capacity() < i) {
            this.f3217f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f3217f.clear();
        }
        if (i > 0) {
            this.f3225n = true;
        }
    }

    /* renamed from: q */
    public final void mo18353q(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int l = mo18348l(byteBuffer);
        int position = l - byteBuffer.position();
        byte[] bArr = this.f3220i;
        int length = bArr.length;
        int i = this.f3223l;
        int i2 = length - i;
        if (l >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f3220i, this.f3223l, min);
            int i3 = this.f3223l + min;
            this.f3223l = i3;
            byte[] bArr2 = this.f3220i;
            if (i3 == bArr2.length) {
                if (this.f3225n) {
                    mo18351o(bArr2, this.f3224m);
                    this.f3226o += (long) ((this.f3223l - (this.f3224m * 2)) / this.f3215d);
                } else {
                    this.f3226o += (long) ((i3 - this.f3224m) / this.f3215d);
                }
                mo18357u(byteBuffer, this.f3220i, this.f3223l);
                this.f3223l = 0;
                this.f3222k = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        mo18351o(bArr, i);
        this.f3223l = 0;
        this.f3222k = 0;
    }

    /* renamed from: r */
    public final void mo18354r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f3220i.length));
        int k = mo18347k(byteBuffer);
        if (k == byteBuffer.position()) {
            this.f3222k = 1;
        } else {
            byteBuffer.limit(k);
            mo18350n(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: s */
    public final void mo18355s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int l = mo18348l(byteBuffer);
        byteBuffer.limit(l);
        this.f3226o += (long) (byteBuffer.remaining() / this.f3215d);
        mo18357u(byteBuffer, this.f3221j, this.f3224m);
        if (l < limit) {
            mo18351o(this.f3221j, this.f3224m);
            this.f3222k = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: t */
    public void mo18356t(boolean z) {
        this.f3216e = z;
        flush();
    }

    /* renamed from: u */
    public final void mo18357u(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f3224m);
        int i2 = this.f3224m - min;
        System.arraycopy(bArr, i - i2, this.f3221j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f3221j, i2, min);
    }
}
