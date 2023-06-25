package p040c.p200q.p201a.p219b.p250l0.p258r;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p250l0.p258r.C3089e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.r.b */
/* compiled from: Mp4WebvttDecoder */
public final class C3086b extends C3032b {

    /* renamed from: p */
    public static final int f5591p = C3152e0.m7764D("payl");

    /* renamed from: q */
    public static final int f5592q = C3152e0.m7764D("sttg");

    /* renamed from: r */
    public static final int f5593r = C3152e0.m7764D("vttc");

    /* renamed from: n */
    public final C3173t f5594n = new C3173t();

    /* renamed from: o */
    public final C3089e.C3091b f5595o = new C3089e.C3091b();

    public C3086b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: C */
    public static C3031a m7450C(C3173t tVar, C3089e.C3091b bVar, int i) {
        bVar.mo19798c();
        while (i > 0) {
            if (i >= 8) {
                int j = tVar.mo20017j();
                int j2 = tVar.mo20017j();
                int i2 = j - 8;
                String u = C3152e0.m7821u(tVar.f5877a, tVar.mo20010c(), i2);
                tVar.mo20007M(i2);
                i = (i - 8) - i2;
                if (j2 == f5592q) {
                    C3092f.m7503j(u, bVar);
                } else if (j2 == f5591p) {
                    C3092f.m7504k((String) null, u.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return bVar.mo19796a();
    }

    /* renamed from: B */
    public C3087c mo19616y(byte[] bArr, int i, boolean z) {
        this.f5594n.mo20004J(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f5594n.mo20008a() > 0) {
            if (this.f5594n.mo20008a() >= 8) {
                int j = this.f5594n.mo20017j();
                if (this.f5594n.mo20017j() == f5593r) {
                    arrayList.add(m7450C(this.f5594n, this.f5595o, j - 8));
                } else {
                    this.f5594n.mo20007M(j - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C3087c(arrayList);
    }
}
