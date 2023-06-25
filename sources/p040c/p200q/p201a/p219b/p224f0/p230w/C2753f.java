package p040c.p200q.p201a.p219b.p224f0.p230w;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.f */
/* compiled from: OggPageHeader */
public final class C2753f {

    /* renamed from: i */
    public static final int f3989i = C3152e0.m7764D("OggS");

    /* renamed from: a */
    public int f3990a;

    /* renamed from: b */
    public int f3991b;

    /* renamed from: c */
    public long f3992c;

    /* renamed from: d */
    public int f3993d;

    /* renamed from: e */
    public int f3994e;

    /* renamed from: f */
    public int f3995f;

    /* renamed from: g */
    public final int[] f3996g = new int[255];

    /* renamed from: h */
    public final C3173t f3997h = new C3173t(255);

    /* renamed from: a */
    public boolean mo18717a(C2675h hVar, boolean z) {
        this.f3997h.mo20001G();
        mo18718b();
        if (!(hVar.mo18526e() == -1 || hVar.mo18526e() - hVar.mo18524c() >= 27) || !hVar.mo18523b(this.f3997h.f5877a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f3997h.mo19995A() == ((long) f3989i)) {
            int y = this.f3997h.mo20032y();
            this.f3990a = y;
            if (y == 0) {
                this.f3991b = this.f3997h.mo20032y();
                this.f3992c = this.f3997h.mo20021n();
                this.f3997h.mo20022o();
                this.f3997h.mo20022o();
                this.f3997h.mo20022o();
                int y2 = this.f3997h.mo20032y();
                this.f3993d = y2;
                this.f3994e = y2 + 27;
                this.f3997h.mo20001G();
                hVar.mo18531i(this.f3997h.f5877a, 0, this.f3993d);
                for (int i = 0; i < this.f3993d; i++) {
                    this.f3996g[i] = this.f3997h.mo20032y();
                    this.f3995f += this.f3996g[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
    }

    /* renamed from: b */
    public void mo18718b() {
        this.f3990a = 0;
        this.f3991b = 0;
        this.f3992c = 0;
        this.f3993d = 0;
        this.f3994e = 0;
        this.f3995f = 0;
    }
}
