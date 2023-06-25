package p040c.p200q.p201a.p219b.p221c0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.c0.p */
/* compiled from: ChannelMappingAudioProcessor */
public final class C2615p implements AudioProcessor {

    /* renamed from: b */
    public int f3170b = -1;

    /* renamed from: c */
    public int f3171c = -1;
    @Nullable

    /* renamed from: d */
    public int[] f3172d;

    /* renamed from: e */
    public boolean f3173e;
    @Nullable

    /* renamed from: f */
    public int[] f3174f;

    /* renamed from: g */
    public ByteBuffer f3175g;

    /* renamed from: h */
    public ByteBuffer f3176h;

    /* renamed from: i */
    public boolean f3177i;

    public C2615p() {
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3175g = byteBuffer;
        this.f3176h = byteBuffer;
    }

    /* renamed from: a */
    public void mo18306a() {
        flush();
        this.f3175g = AudioProcessor.f7576a;
        this.f3170b = -1;
        this.f3171c = -1;
        this.f3174f = null;
        this.f3172d = null;
        this.f3173e = false;
    }

    /* renamed from: b */
    public boolean mo18307b() {
        return this.f3177i && this.f3176h == AudioProcessor.f7576a;
    }

    /* renamed from: c */
    public ByteBuffer mo18308c() {
        ByteBuffer byteBuffer = this.f3176h;
        this.f3176h = AudioProcessor.f7576a;
        return byteBuffer;
    }

    /* renamed from: d */
    public void mo18309d(ByteBuffer byteBuffer) {
        C3151e.m7759g(this.f3174f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f3170b * 2)) * this.f3174f.length * 2;
        if (this.f3175g.capacity() < length) {
            this.f3175g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f3175g.clear();
        }
        while (position < limit) {
            for (int i : this.f3174f) {
                this.f3175g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f3170b * 2;
        }
        byteBuffer.position(limit);
        this.f3175g.flip();
        this.f3176h = this.f3175g;
    }

    /* renamed from: e */
    public int mo18310e() {
        int[] iArr = this.f3174f;
        return iArr == null ? this.f3170b : iArr.length;
    }

    /* renamed from: f */
    public int mo18311f() {
        return this.f3171c;
    }

    public void flush() {
        this.f3176h = AudioProcessor.f7576a;
        this.f3177i = false;
    }

    /* renamed from: g */
    public int mo18313g() {
        return 2;
    }

    /* renamed from: h */
    public void mo18314h() {
        this.f3177i = true;
    }

    /* renamed from: i */
    public boolean mo18315i(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f3172d, this.f3174f);
        int[] iArr = this.f3172d;
        this.f3174f = iArr;
        if (iArr == null) {
            this.f3173e = false;
            return z;
        } else if (i3 != 2) {
            throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
        } else if (!z && this.f3171c == i && this.f3170b == i2) {
            return false;
        } else {
            this.f3171c = i;
            this.f3170b = i2;
            this.f3173e = i2 != this.f3174f.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f3174f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f3173e = (i5 != i4) | this.f3173e;
                    i4++;
                } else {
                    throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
                }
            }
        }
    }

    public boolean isActive() {
        return this.f3173e;
    }

    /* renamed from: j */
    public void mo18317j(@Nullable int[] iArr) {
        this.f3172d = iArr;
    }
}
