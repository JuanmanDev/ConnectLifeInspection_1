package p040c.p200q.p201a.p219b.p222d0;

import java.nio.ByteBuffer;

/* renamed from: c.q.a.b.d0.e */
/* compiled from: DecoderInputBuffer */
public class C2634e extends C2628a {

    /* renamed from: l */
    public final C2629b f3306l = new C2629b();

    /* renamed from: m */
    public ByteBuffer f3307m;

    /* renamed from: n */
    public long f3308n;

    /* renamed from: o */
    public final int f3309o;

    public C2634e(int i) {
        this.f3309o = i;
    }

    /* renamed from: x */
    public static C2634e m5077x() {
        return new C2634e(0);
    }

    /* renamed from: i */
    public void mo18386i() {
        super.mo18386i();
        ByteBuffer byteBuffer = this.f3307m;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: r */
    public final ByteBuffer mo18404r(int i) {
        int i2 = this.f3309o;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f3307m;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    /* renamed from: t */
    public void mo18405t(int i) {
        ByteBuffer byteBuffer = this.f3307m;
        if (byteBuffer == null) {
            this.f3307m = mo18404r(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f3307m.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer r = mo18404r(i2);
            if (position > 0) {
                this.f3307m.position(0);
                this.f3307m.limit(position);
                r.put(this.f3307m);
            }
            this.f3307m = r;
        }
    }

    /* renamed from: u */
    public final void mo18406u() {
        this.f3307m.flip();
    }

    /* renamed from: v */
    public final boolean mo18407v() {
        return mo18388k(1073741824);
    }

    /* renamed from: w */
    public final boolean mo18408w() {
        return this.f3307m == null && this.f3309o == 0;
    }
}
