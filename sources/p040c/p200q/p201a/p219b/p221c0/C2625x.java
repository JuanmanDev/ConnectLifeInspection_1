package p040c.p200q.p201a.p219b.p221c0;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.x */
/* compiled from: TrimmingAudioProcessor */
public final class C2625x implements AudioProcessor {

    /* renamed from: b */
    public boolean f3262b;

    /* renamed from: c */
    public int f3263c;

    /* renamed from: d */
    public int f3264d;

    /* renamed from: e */
    public int f3265e = -1;

    /* renamed from: f */
    public int f3266f = -1;

    /* renamed from: g */
    public int f3267g;

    /* renamed from: h */
    public boolean f3268h;

    /* renamed from: i */
    public int f3269i;

    /* renamed from: j */
    public ByteBuffer f3270j;

    /* renamed from: k */
    public ByteBuffer f3271k;

    /* renamed from: l */
    public byte[] f3272l = C3152e0.f5824f;

    /* renamed from: m */
    public int f3273m;

    /* renamed from: n */
    public boolean f3274n;

    /* renamed from: o */
    public long f3275o;

    public C2625x() {
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3270j = byteBuffer;
        this.f3271k = byteBuffer;
    }

    /* renamed from: a */
    public void mo18306a() {
        flush();
        this.f3270j = AudioProcessor.f7576a;
        this.f3265e = -1;
        this.f3266f = -1;
        this.f3272l = C3152e0.f5824f;
    }

    /* renamed from: b */
    public boolean mo18307b() {
        return this.f3274n && this.f3273m == 0 && this.f3271k == AudioProcessor.f7576a;
    }

    /* renamed from: c */
    public ByteBuffer mo18308c() {
        ByteBuffer byteBuffer = this.f3271k;
        if (this.f3274n && this.f3273m > 0 && byteBuffer == AudioProcessor.f7576a) {
            int capacity = this.f3270j.capacity();
            int i = this.f3273m;
            if (capacity < i) {
                this.f3270j = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f3270j.clear();
            }
            this.f3270j.put(this.f3272l, 0, this.f3273m);
            this.f3273m = 0;
            this.f3270j.flip();
            byteBuffer = this.f3270j;
        }
        this.f3271k = AudioProcessor.f7576a;
        return byteBuffer;
    }

    /* renamed from: d */
    public void mo18309d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            this.f3268h = true;
            int min = Math.min(i, this.f3269i);
            this.f3275o += (long) (min / this.f3267g);
            this.f3269i -= min;
            byteBuffer.position(position + min);
            if (this.f3269i <= 0) {
                int i2 = i - min;
                int length = (this.f3273m + i2) - this.f3272l.length;
                if (this.f3270j.capacity() < length) {
                    this.f3270j = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                } else {
                    this.f3270j.clear();
                }
                int n = C3152e0.m7813n(length, 0, this.f3273m);
                this.f3270j.put(this.f3272l, 0, n);
                int n2 = C3152e0.m7813n(length - n, 0, i2);
                byteBuffer.limit(byteBuffer.position() + n2);
                this.f3270j.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - n2;
                int i4 = this.f3273m - n;
                this.f3273m = i4;
                byte[] bArr = this.f3272l;
                System.arraycopy(bArr, n, bArr, 0, i4);
                byteBuffer.get(this.f3272l, this.f3273m, i3);
                this.f3273m += i3;
                this.f3270j.flip();
                this.f3271k = this.f3270j;
            }
        }
    }

    /* renamed from: e */
    public int mo18310e() {
        return this.f3265e;
    }

    /* renamed from: f */
    public int mo18311f() {
        return this.f3266f;
    }

    public void flush() {
        this.f3271k = AudioProcessor.f7576a;
        this.f3274n = false;
        if (this.f3268h) {
            this.f3269i = 0;
        }
        this.f3273m = 0;
    }

    /* renamed from: g */
    public int mo18313g() {
        return 2;
    }

    /* renamed from: h */
    public void mo18314h() {
        this.f3274n = true;
    }

    /* renamed from: i */
    public boolean mo18315i(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.f3273m;
            if (i4 > 0) {
                this.f3275o += (long) (i4 / this.f3267g);
            }
            this.f3265e = i2;
            this.f3266f = i;
            int J = C3152e0.m7770J(2, i2);
            this.f3267g = J;
            int i5 = this.f3264d;
            this.f3272l = new byte[(i5 * J)];
            this.f3273m = 0;
            int i6 = this.f3263c;
            this.f3269i = J * i6;
            boolean z = this.f3262b;
            boolean z2 = (i6 == 0 && i5 == 0) ? false : true;
            this.f3262b = z2;
            this.f3268h = false;
            if (z != z2) {
                return true;
            }
            return false;
        }
        throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
    }

    public boolean isActive() {
        return this.f3262b;
    }

    /* renamed from: j */
    public long mo18382j() {
        return this.f3275o;
    }

    /* renamed from: k */
    public void mo18383k() {
        this.f3275o = 0;
    }

    /* renamed from: l */
    public void mo18384l(int i, int i2) {
        this.f3263c = i;
        this.f3264d = i2;
    }
}
