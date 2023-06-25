package p040c.p200q.p201a.p219b.p222d0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.d0.b */
/* compiled from: CryptoInfo */
public final class C2629b {

    /* renamed from: a */
    public byte[] f3285a;

    /* renamed from: b */
    public byte[] f3286b;

    /* renamed from: c */
    public int f3287c;

    /* renamed from: d */
    public int[] f3288d;

    /* renamed from: e */
    public int[] f3289e;

    /* renamed from: f */
    public int f3290f;

    /* renamed from: g */
    public int f3291g;

    /* renamed from: h */
    public int f3292h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f3293i;

    /* renamed from: j */
    public final C2631b f3294j;

    @TargetApi(24)
    /* renamed from: c.q.a.b.d0.b$b */
    /* compiled from: CryptoInfo */
    public static final class C2631b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f3295a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f3296b;

        /* renamed from: b */
        public final void mo18397b(int i, int i2) {
            this.f3296b.set(i, i2);
            this.f3295a.setPattern(this.f3296b);
        }

        public C2631b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f3295a = cryptoInfo;
            this.f3296b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C2629b() {
        C2631b bVar = null;
        MediaCodec.CryptoInfo b = C3152e0.f5819a >= 16 ? mo18394b() : null;
        this.f3293i = b;
        this.f3294j = C3152e0.f5819a >= 24 ? new C2631b(b) : bVar;
    }

    @TargetApi(16)
    /* renamed from: a */
    public MediaCodec.CryptoInfo mo18393a() {
        return this.f3293i;
    }

    @TargetApi(16)
    /* renamed from: b */
    public final MediaCodec.CryptoInfo mo18394b() {
        return new MediaCodec.CryptoInfo();
    }

    /* renamed from: c */
    public void mo18395c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f3290f = i;
        this.f3288d = iArr;
        this.f3289e = iArr2;
        this.f3286b = bArr;
        this.f3285a = bArr2;
        this.f3287c = i2;
        this.f3291g = i3;
        this.f3292h = i4;
        if (C3152e0.f5819a >= 16) {
            mo18396d();
        }
    }

    @TargetApi(16)
    /* renamed from: d */
    public final void mo18396d() {
        MediaCodec.CryptoInfo cryptoInfo = this.f3293i;
        cryptoInfo.numSubSamples = this.f3290f;
        cryptoInfo.numBytesOfClearData = this.f3288d;
        cryptoInfo.numBytesOfEncryptedData = this.f3289e;
        cryptoInfo.key = this.f3286b;
        cryptoInfo.iv = this.f3285a;
        cryptoInfo.mode = this.f3287c;
        if (C3152e0.f5819a >= 24) {
            this.f3294j.mo18397b(this.f3291g, this.f3292h);
        }
    }
}
