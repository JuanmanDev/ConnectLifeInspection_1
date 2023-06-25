package p040c.p200q.p201a.p219b.p224f0.p233z;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.f0.z.b */
/* compiled from: WavExtractor */
public final class C2818b implements C2674g {

    /* renamed from: a */
    public C2676i f4367a;

    /* renamed from: b */
    public C2686q f4368b;

    /* renamed from: c */
    public C2819c f4369c;

    /* renamed from: d */
    public int f4370d;

    /* renamed from: e */
    public int f4371e;

    static {
        C2817a aVar = C2817a.f4366a;
    }

    /* renamed from: a */
    public static /* synthetic */ C2674g[] m5975a() {
        return new C2674g[]{new C2818b()};
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        return C2820d.m5992a(hVar) != null;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        C2675h hVar2 = hVar;
        if (this.f4369c == null) {
            C2819c a = C2820d.m5992a(hVar);
            this.f4369c = a;
            if (a != null) {
                this.f4368b.mo18546d(Format.m10237k((String) null, "audio/raw", (String) null, a.mo18868b(), 32768, this.f4369c.mo18872j(), this.f4369c.mo18873k(), this.f4369c.mo18871g(), (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f4370d = this.f4369c.mo18869e();
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.f4369c.mo18874l()) {
            C2820d.m5993b(hVar2, this.f4369c);
            this.f4367a.mo18553c(this.f4369c);
        }
        long f = this.f4369c.mo18870f();
        C3151e.m7759g(f != -1);
        long position = f - hVar.getPosition();
        if (position <= 0) {
            return -1;
        }
        int a2 = this.f4368b.mo18543a(hVar2, (int) Math.min((long) (32768 - this.f4371e), position), true);
        if (a2 != -1) {
            this.f4371e += a2;
        }
        int i = this.f4371e / this.f4370d;
        if (i > 0) {
            long a3 = this.f4369c.mo18867a(hVar.getPosition() - ((long) this.f4371e));
            int i2 = i * this.f4370d;
            int i3 = this.f4371e - i2;
            this.f4371e = i3;
            this.f4368b.mo18545c(a3, 1, i2, i3, (C2686q.C2687a) null);
        }
        if (a2 == -1) {
            return -1;
        }
        return 0;
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f4367a = iVar;
        this.f4368b = iVar.mo18552a(0, 1);
        this.f4369c = null;
        iVar.mo18554o();
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f4371e = 0;
    }

    public void release() {
    }
}
