package p040c.p200q.p353b.p356c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.c.c */
/* compiled from: AbstractStreamingHasher */
public abstract class C6211c extends C6210b {

    /* renamed from: a */
    public final ByteBuffer f11823a;

    /* renamed from: b */
    public final int f11824b;

    public C6211c(int i) {
        this(i, i);
    }

    /* renamed from: b */
    public final C6216e mo30176b() {
        mo30178d();
        this.f11823a.flip();
        if (this.f11823a.remaining() > 0) {
            mo30180f(this.f11823a);
            ByteBuffer byteBuffer = this.f11823a;
            byteBuffer.position(byteBuffer.limit());
        }
        return mo30177c();
    }

    /* renamed from: c */
    public abstract C6216e mo30177c();

    /* renamed from: d */
    public final void mo30178d() {
        this.f11823a.flip();
        while (this.f11823a.remaining() >= this.f11824b) {
            mo30179e(this.f11823a);
        }
        this.f11823a.compact();
    }

    /* renamed from: e */
    public abstract void mo30179e(ByteBuffer byteBuffer);

    /* renamed from: f */
    public abstract void mo30180f(ByteBuffer byteBuffer);

    public C6211c(int i, int i2) {
        C5850m.m16583d(i2 % i == 0);
        this.f11823a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f11824b = i;
    }
}
