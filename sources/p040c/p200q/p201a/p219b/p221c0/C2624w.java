package p040c.p200q.p201a.p219b.p221c0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.w */
/* compiled from: SonicAudioProcessor */
public final class C2624w implements AudioProcessor {

    /* renamed from: b */
    public int f3249b = -1;

    /* renamed from: c */
    public int f3250c = -1;

    /* renamed from: d */
    public float f3251d = 1.0f;

    /* renamed from: e */
    public float f3252e = 1.0f;

    /* renamed from: f */
    public int f3253f = -1;

    /* renamed from: g */
    public int f3254g;
    @Nullable

    /* renamed from: h */
    public C2623v f3255h;

    /* renamed from: i */
    public ByteBuffer f3256i;

    /* renamed from: j */
    public ShortBuffer f3257j;

    /* renamed from: k */
    public ByteBuffer f3258k;

    /* renamed from: l */
    public long f3259l;

    /* renamed from: m */
    public long f3260m;

    /* renamed from: n */
    public boolean f3261n;

    public C2624w() {
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3256i = byteBuffer;
        this.f3257j = byteBuffer.asShortBuffer();
        this.f3258k = AudioProcessor.f7576a;
        this.f3254g = -1;
    }

    /* renamed from: a */
    public void mo18306a() {
        this.f3251d = 1.0f;
        this.f3252e = 1.0f;
        this.f3249b = -1;
        this.f3250c = -1;
        this.f3253f = -1;
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3256i = byteBuffer;
        this.f3257j = byteBuffer.asShortBuffer();
        this.f3258k = AudioProcessor.f7576a;
        this.f3254g = -1;
        this.f3255h = null;
        this.f3259l = 0;
        this.f3260m = 0;
        this.f3261n = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f3255h;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18307b() {
        /*
            r1 = this;
            boolean r0 = r1.f3261n
            if (r0 == 0) goto L_0x0010
            c.q.a.b.c0.v r0 = r1.f3255h
            if (r0 == 0) goto L_0x000e
            int r0 = r0.mo18367j()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p221c0.C2624w.mo18307b():boolean");
    }

    /* renamed from: c */
    public ByteBuffer mo18308c() {
        ByteBuffer byteBuffer = this.f3258k;
        this.f3258k = AudioProcessor.f7576a;
        return byteBuffer;
    }

    /* renamed from: d */
    public void mo18309d(ByteBuffer byteBuffer) {
        C3151e.m7759g(this.f3255h != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f3259l += (long) remaining;
            this.f3255h.mo18375s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int j = this.f3255h.mo18367j() * this.f3249b * 2;
        if (j > 0) {
            if (this.f3256i.capacity() < j) {
                ByteBuffer order = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
                this.f3256i = order;
                this.f3257j = order.asShortBuffer();
            } else {
                this.f3256i.clear();
                this.f3257j.clear();
            }
            this.f3255h.mo18368k(this.f3257j);
            this.f3260m += (long) j;
            this.f3256i.limit(j);
            this.f3258k = this.f3256i;
        }
    }

    /* renamed from: e */
    public int mo18310e() {
        return this.f3249b;
    }

    /* renamed from: f */
    public int mo18311f() {
        return this.f3253f;
    }

    public void flush() {
        if (isActive()) {
            C2623v vVar = this.f3255h;
            if (vVar == null) {
                this.f3255h = new C2623v(this.f3250c, this.f3249b, this.f3251d, this.f3252e, this.f3253f);
            } else {
                vVar.mo18366i();
            }
        }
        this.f3258k = AudioProcessor.f7576a;
        this.f3259l = 0;
        this.f3260m = 0;
        this.f3261n = false;
    }

    /* renamed from: g */
    public int mo18313g() {
        return 2;
    }

    /* renamed from: h */
    public void mo18314h() {
        C3151e.m7759g(this.f3255h != null);
        this.f3255h.mo18374r();
        this.f3261n = true;
    }

    /* renamed from: i */
    public boolean mo18315i(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.f3254g;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.f3250c == i && this.f3249b == i2 && this.f3253f == i4) {
                return false;
            }
            this.f3250c = i;
            this.f3249b = i2;
            this.f3253f = i4;
            this.f3255h = null;
            return true;
        }
        throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
    }

    public boolean isActive() {
        return this.f3250c != -1 && (Math.abs(this.f3251d - 1.0f) >= 0.01f || Math.abs(this.f3252e - 1.0f) >= 0.01f || this.f3253f != this.f3250c);
    }

    /* renamed from: j */
    public long mo18379j(long j) {
        long j2 = this.f3260m;
        if (j2 < 1024) {
            return (long) (((double) this.f3251d) * ((double) j));
        }
        int i = this.f3253f;
        int i2 = this.f3250c;
        if (i == i2) {
            return C3152e0.m7792c0(j, this.f3259l, j2);
        }
        return C3152e0.m7792c0(j, this.f3259l * ((long) i), j2 * ((long) i2));
    }

    /* renamed from: k */
    public float mo18380k(float f) {
        float m = C3152e0.m7811m(f, 0.1f, 8.0f);
        if (this.f3252e != m) {
            this.f3252e = m;
            this.f3255h = null;
        }
        flush();
        return m;
    }

    /* renamed from: l */
    public float mo18381l(float f) {
        float m = C3152e0.m7811m(f, 0.1f, 8.0f);
        if (this.f3251d != m) {
            this.f3251d = m;
            this.f3255h = null;
        }
        flush();
        return m;
    }
}
