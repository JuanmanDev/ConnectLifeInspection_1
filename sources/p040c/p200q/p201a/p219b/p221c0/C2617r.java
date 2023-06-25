package p040c.p200q.p201a.p219b.p221c0;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.r */
/* compiled from: FloatResamplingAudioProcessor */
public final class C2617r implements AudioProcessor {

    /* renamed from: h */
    public static final int f3181h = Float.floatToIntBits(Float.NaN);

    /* renamed from: b */
    public int f3182b = -1;

    /* renamed from: c */
    public int f3183c = -1;

    /* renamed from: d */
    public int f3184d = 0;

    /* renamed from: e */
    public ByteBuffer f3185e;

    /* renamed from: f */
    public ByteBuffer f3186f;

    /* renamed from: g */
    public boolean f3187g;

    public C2617r() {
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3185e = byteBuffer;
        this.f3186f = byteBuffer;
    }

    /* renamed from: j */
    public static void m4930j(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f3181h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: a */
    public void mo18306a() {
        flush();
        this.f3182b = -1;
        this.f3183c = -1;
        this.f3184d = 0;
        this.f3185e = AudioProcessor.f7576a;
    }

    /* renamed from: b */
    public boolean mo18307b() {
        return this.f3187g && this.f3186f == AudioProcessor.f7576a;
    }

    /* renamed from: c */
    public ByteBuffer mo18308c() {
        ByteBuffer byteBuffer = this.f3186f;
        this.f3186f = AudioProcessor.f7576a;
        return byteBuffer;
    }

    /* renamed from: d */
    public void mo18309d(ByteBuffer byteBuffer) {
        boolean z = this.f3184d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.f3185e.capacity() < i) {
            this.f3185e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f3185e.clear();
        }
        if (z) {
            while (position < limit) {
                m4930j((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f3185e);
                position += 4;
            }
        } else {
            while (position < limit) {
                m4930j(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f3185e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f3185e.flip();
        this.f3186f = this.f3185e;
    }

    /* renamed from: e */
    public int mo18310e() {
        return this.f3183c;
    }

    /* renamed from: f */
    public int mo18311f() {
        return this.f3182b;
    }

    public void flush() {
        this.f3186f = AudioProcessor.f7576a;
        this.f3187g = false;
    }

    /* renamed from: g */
    public int mo18313g() {
        return 4;
    }

    /* renamed from: h */
    public void mo18314h() {
        this.f3187g = true;
    }

    /* renamed from: i */
    public boolean mo18315i(int i, int i2, int i3) {
        if (!C3152e0.m7776P(i3)) {
            throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
        } else if (this.f3182b == i && this.f3183c == i2 && this.f3184d == i3) {
            return false;
        } else {
            this.f3182b = i;
            this.f3183c = i2;
            this.f3184d = i3;
            return true;
        }
    }

    public boolean isActive() {
        return C3152e0.m7776P(this.f3184d);
    }
}
