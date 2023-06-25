package p040c.p200q.p201a.p219b.p221c0;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: c.q.a.b.c0.t */
/* compiled from: ResamplingAudioProcessor */
public final class C2621t implements AudioProcessor {

    /* renamed from: b */
    public int f3207b = -1;

    /* renamed from: c */
    public int f3208c = -1;

    /* renamed from: d */
    public int f3209d = 0;

    /* renamed from: e */
    public ByteBuffer f3210e;

    /* renamed from: f */
    public ByteBuffer f3211f;

    /* renamed from: g */
    public boolean f3212g;

    public C2621t() {
        ByteBuffer byteBuffer = AudioProcessor.f7576a;
        this.f3210e = byteBuffer;
        this.f3211f = byteBuffer;
    }

    /* renamed from: a */
    public void mo18306a() {
        flush();
        this.f3207b = -1;
        this.f3208c = -1;
        this.f3209d = 0;
        this.f3210e = AudioProcessor.f7576a;
    }

    /* renamed from: b */
    public boolean mo18307b() {
        return this.f3212g && this.f3211f == AudioProcessor.f7576a;
    }

    /* renamed from: c */
    public ByteBuffer mo18308c() {
        ByteBuffer byteBuffer = this.f3211f;
        this.f3211f = AudioProcessor.f7576a;
        return byteBuffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18309d(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f3209d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f3210e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f3210e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f3210e
            r2.clear()
        L_0x003f:
            int r2 = r7.f3209d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f3210e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f3210e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f3210e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f3210e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f3210e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f3210e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f3210e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f3210e
            r7.f3211f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p221c0.C2621t.mo18309d(java.nio.ByteBuffer):void");
    }

    /* renamed from: e */
    public int mo18310e() {
        return this.f3208c;
    }

    /* renamed from: f */
    public int mo18311f() {
        return this.f3207b;
    }

    public void flush() {
        this.f3211f = AudioProcessor.f7576a;
        this.f3212g = false;
    }

    /* renamed from: g */
    public int mo18313g() {
        return 2;
    }

    /* renamed from: h */
    public void mo18314h() {
        this.f3212g = true;
    }

    /* renamed from: i */
    public boolean mo18315i(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
        } else if (this.f3207b == i && this.f3208c == i2 && this.f3209d == i3) {
            return false;
        } else {
            this.f3207b = i;
            this.f3208c = i2;
            this.f3209d = i3;
            return true;
        }
    }

    public boolean isActive() {
        int i = this.f3209d;
        return (i == 0 || i == 2) ? false : true;
    }
}
