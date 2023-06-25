package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p250l0.p258r.C3096h;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.k0.e0.p */
/* compiled from: WebvttExtractor */
public final class C2963p implements C2674g {

    /* renamed from: g */
    public static final Pattern f4987g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f4988h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    public final String f4989a;

    /* renamed from: b */
    public final C3146b0 f4990b;

    /* renamed from: c */
    public final C3173t f4991c = new C3173t();

    /* renamed from: d */
    public C2676i f4992d;

    /* renamed from: e */
    public byte[] f4993e = new byte[1024];

    /* renamed from: f */
    public int f4994f;

    public C2963p(String str, C3146b0 b0Var) {
        this.f4989a = str;
        this.f4990b = b0Var;
    }

    /* renamed from: a */
    public final C2686q mo19395a(long j) {
        C2686q a = this.f4992d.mo18552a(0, 3);
        a.mo18546d(Format.m10248v((String) null, "text/vtt", (String) null, -1, 0, this.f4989a, (DrmInitData) null, j));
        this.f4992d.mo18554o();
        return a;
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        hVar.mo18523b(this.f4993e, 0, 6, false);
        this.f4991c.mo20004J(this.f4993e, 6);
        if (C3096h.m7518b(this.f4991c)) {
            return true;
        }
        hVar.mo18523b(this.f4993e, 6, 3, false);
        this.f4991c.mo20004J(this.f4993e, 9);
        return C3096h.m7518b(this.f4991c);
    }

    /* renamed from: c */
    public final void mo19396c() {
        C3173t tVar = new C3173t(this.f4993e);
        C3096h.m7521e(tVar);
        long j = 0;
        long j2 = 0;
        while (true) {
            String l = tVar.mo20019l();
            if (TextUtils.isEmpty(l)) {
                Matcher a = C3096h.m7517a(tVar);
                if (a == null) {
                    mo19395a(0);
                    return;
                }
                long d = C3096h.m7520d(a.group(1));
                long b = this.f4990b.mo19944b(C3146b0.m7736i((j + d) - j2));
                C2686q a2 = mo19395a(b - d);
                this.f4991c.mo20004J(this.f4993e, this.f4994f);
                a2.mo18544b(this.f4991c, this.f4994f);
                a2.mo18545c(b, 1, this.f4994f, 0, (C2686q.C2687a) null);
                return;
            } else if (l.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f4987g.matcher(l);
                if (matcher.find()) {
                    Matcher matcher2 = f4988h.matcher(l);
                    if (matcher2.find()) {
                        j2 = C3096h.m7520d(matcher.group(1));
                        j = C3146b0.m7735f(Long.parseLong(matcher2.group(1)));
                    } else {
                        throw new ParserException("X-TIMESTAMP-MAP doesn't contain media timestamp: " + l);
                    }
                } else {
                    throw new ParserException("X-TIMESTAMP-MAP doesn't contain local timestamp: " + l);
                }
            }
        }
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        int i;
        int e = (int) hVar.mo18526e();
        int i2 = this.f4994f;
        byte[] bArr = this.f4993e;
        if (i2 == bArr.length) {
            if (e != -1) {
                i = e;
            } else {
                i = bArr.length;
            }
            this.f4993e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f4993e;
        int i3 = this.f4994f;
        int read = hVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.f4994f + read;
            this.f4994f = i4;
            if (e == -1 || i4 != e) {
                return 0;
            }
        }
        mo19396c();
        return -1;
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f4992d = iVar;
        iVar.mo18553c(new C2682o.C2684b(-9223372036854775807L));
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        throw new IllegalStateException();
    }

    public void release() {
    }
}
