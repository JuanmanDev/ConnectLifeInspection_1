package p040c.p200q.p201a.p219b.p224f0.p231x;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.x.a */
/* compiled from: RawCcExtractor */
public final class C2768a implements C2674g {

    /* renamed from: i */
    public static final int f4036i = C3152e0.m7764D("RCC\u0001");

    /* renamed from: a */
    public final Format f4037a;

    /* renamed from: b */
    public final C3173t f4038b = new C3173t(9);

    /* renamed from: c */
    public C2686q f4039c;

    /* renamed from: d */
    public int f4040d = 0;

    /* renamed from: e */
    public int f4041e;

    /* renamed from: f */
    public long f4042f;

    /* renamed from: g */
    public int f4043g;

    /* renamed from: h */
    public int f4044h;

    public C2768a(Format format) {
        this.f4037a = format;
    }

    /* renamed from: a */
    public final boolean mo18735a(C2675h hVar) {
        this.f4038b.mo20001G();
        if (!hVar.mo18522a(this.f4038b.f5877a, 0, 8, true)) {
            return false;
        }
        if (this.f4038b.mo20017j() == f4036i) {
            this.f4041e = this.f4038b.mo20032y();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        this.f4038b.mo20001G();
        hVar.mo18531i(this.f4038b.f5877a, 0, 8);
        if (this.f4038b.mo20017j() == f4036i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo18736c(C2675h hVar) {
        while (this.f4043g > 0) {
            this.f4038b.mo20001G();
            hVar.readFully(this.f4038b.f5877a, 0, 3);
            this.f4039c.mo18544b(this.f4038b, 3);
            this.f4044h += 3;
            this.f4043g--;
        }
        int i = this.f4044h;
        if (i > 0) {
            this.f4039c.mo18545c(this.f4042f, 1, i, 0, (C2686q.C2687a) null);
        }
    }

    /* renamed from: d */
    public final boolean mo18737d(C2675h hVar) {
        this.f4038b.mo20001G();
        int i = this.f4041e;
        if (i == 0) {
            if (!hVar.mo18522a(this.f4038b.f5877a, 0, 5, true)) {
                return false;
            }
            this.f4042f = (this.f4038b.mo19995A() * 1000) / 45;
        } else if (i != 1) {
            throw new ParserException("Unsupported version number: " + this.f4041e);
        } else if (!hVar.mo18522a(this.f4038b.f5877a, 0, 9, true)) {
            return false;
        } else {
            this.f4042f = this.f4038b.mo20025r();
        }
        this.f4043g = this.f4038b.mo20032y();
        this.f4044h = 0;
        return true;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        while (true) {
            int i = this.f4040d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        mo18736c(hVar);
                        this.f4040d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (mo18737d(hVar)) {
                    this.f4040d = 2;
                } else {
                    this.f4040d = 0;
                    return -1;
                }
            } else if (!mo18735a(hVar)) {
                return -1;
            } else {
                this.f4040d = 1;
            }
        }
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        iVar.mo18553c(new C2682o.C2684b(-9223372036854775807L));
        this.f4039c = iVar.mo18552a(0, 3);
        iVar.mo18554o();
        this.f4039c.mo18546d(this.f4037a);
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f4040d = 0;
    }

    public void release() {
    }
}
