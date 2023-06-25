package p040c.p200q.p201a.p219b.p250l0.p258r;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p250l0.p258r.C3089e;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.r.g */
/* compiled from: WebvttDecoder */
public final class C3095g extends C3032b {

    /* renamed from: n */
    public final C3092f f5636n = new C3092f();

    /* renamed from: o */
    public final C3173t f5637o = new C3173t();

    /* renamed from: p */
    public final C3089e.C3091b f5638p = new C3089e.C3091b();

    /* renamed from: q */
    public final C3085a f5639q = new C3085a();

    /* renamed from: r */
    public final List<C3088d> f5640r = new ArrayList();

    public C3095g() {
        super("WebvttDecoder");
    }

    /* renamed from: C */
    public static int m7513C(C3173t tVar) {
        int i = 0;
        int i2 = -1;
        while (i2 == -1) {
            i = tVar.mo20010c();
            String l = tVar.mo20019l();
            if (l == null) {
                i2 = 0;
            } else if ("STYLE".equals(l)) {
                i2 = 2;
            } else {
                i2 = l.startsWith("NOTE") ? 1 : 3;
            }
        }
        tVar.mo20006L(i);
        return i2;
    }

    /* renamed from: D */
    public static void m7514D(C3173t tVar) {
        do {
        } while (!TextUtils.isEmpty(tVar.mo20019l()));
    }

    /* renamed from: B */
    public C3097i mo19616y(byte[] bArr, int i, boolean z) {
        this.f5637o.mo20004J(bArr, i);
        this.f5638p.mo19798c();
        this.f5640r.clear();
        try {
            C3096h.m7521e(this.f5637o);
            do {
            } while (!TextUtils.isEmpty(this.f5637o.mo20019l()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int C = m7513C(this.f5637o);
                if (C == 0) {
                    return new C3097i(arrayList);
                }
                if (C == 1) {
                    m7514D(this.f5637o);
                } else if (C == 2) {
                    if (arrayList.isEmpty()) {
                        this.f5637o.mo20019l();
                        C3088d d = this.f5639q.mo19770d(this.f5637o);
                        if (d != null) {
                            this.f5640r.add(d);
                        }
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (C == 3 && this.f5636n.mo19809h(this.f5637o, this.f5638p, this.f5640r)) {
                    arrayList.add(this.f5638p.mo19796a());
                    this.f5638p.mo19798c();
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException((Exception) e);
        }
    }
}
