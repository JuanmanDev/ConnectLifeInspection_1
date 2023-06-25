package p040c.p200q.p201a.p219b.p262p0.p263o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import p040c.p200q.p201a.p219b.C2589c;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.p0.o.b */
/* compiled from: CameraMotionRenderer */
public class C3204b extends C2589c {

    /* renamed from: t */
    public final C3030l f6008t = new C3030l();

    /* renamed from: u */
    public final C2634e f6009u = new C2634e(1);

    /* renamed from: v */
    public final C3173t f6010v = new C3173t();

    /* renamed from: w */
    public long f6011w;
    @Nullable

    /* renamed from: x */
    public C3203a f6012x;

    /* renamed from: y */
    public long f6013y;

    public C3204b() {
        super(5);
    }

    /* renamed from: A */
    public void mo18193A() {
        mo20157K();
    }

    /* renamed from: C */
    public void mo18195C(long j, boolean z) {
        mo20157K();
    }

    /* renamed from: F */
    public void mo18198F(Format[] formatArr, long j) {
        this.f6011w = j;
    }

    @Nullable
    /* renamed from: J */
    public final float[] mo20156J(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f6010v.mo20004J(byteBuffer.array(), byteBuffer.limit());
        this.f6010v.mo20006L(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f6010v.mo20020m());
        }
        return fArr;
    }

    /* renamed from: K */
    public final void mo20157K() {
        this.f6013y = 0;
        C3203a aVar = this.f6012x;
        if (aVar != null) {
            aVar.mo20155b();
        }
    }

    /* renamed from: a */
    public int mo18904a(Format format) {
        return "application/x-camera-motion".equals(format.f7566q) ? 4 : 0;
    }

    /* renamed from: b */
    public boolean mo18329b() {
        return mo18205i();
    }

    /* renamed from: c */
    public boolean mo18330c() {
        return true;
    }

    /* renamed from: o */
    public void mo18906o(long j, long j2) {
        float[] J;
        while (!mo18205i() && this.f6013y < 100000 + j) {
            this.f6009u.mo18386i();
            if (mo18199G(this.f6008t, this.f6009u, false) == -4 && !this.f6009u.mo18390n()) {
                this.f6009u.mo18406u();
                C2634e eVar = this.f6009u;
                this.f6013y = eVar.f3308n;
                if (!(this.f6012x == null || (J = mo20156J(eVar.f3307m)) == null)) {
                    C3203a aVar = this.f6012x;
                    C3152e0.m7797f(aVar);
                    aVar.mo20154a(this.f6013y - this.f6011w, J);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public void mo18210p(int i, @Nullable Object obj) {
        if (i == 7) {
            this.f6012x = (C3203a) obj;
        } else {
            super.mo18210p(i, obj);
        }
    }
}
