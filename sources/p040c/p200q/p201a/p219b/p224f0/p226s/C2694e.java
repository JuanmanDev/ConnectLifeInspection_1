package p040c.p200q.p201a.p219b.p224f0.p226s;

import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;
import p040c.p200q.p201a.p219b.p262p0.C3190h;

/* renamed from: c.q.a.b.f0.s.e */
/* compiled from: VideoTagPayloadReader */
public final class C2694e extends TagPayloadReader {

    /* renamed from: b */
    public final C3173t f3498b = new C3173t(C3168q.f5853a);

    /* renamed from: c */
    public final C3173t f3499c = new C3173t(4);

    /* renamed from: d */
    public int f3500d;

    /* renamed from: e */
    public boolean f3501e;

    /* renamed from: f */
    public int f3502f;

    public C2694e(C2686q qVar) {
        super(qVar);
    }

    /* renamed from: b */
    public boolean mo18580b(C3173t tVar) {
        int y = tVar.mo20032y();
        int i = (y >> 4) & 15;
        int i2 = y & 15;
        if (i2 == 7) {
            this.f3502f = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    /* renamed from: c */
    public void mo18581c(C3173t tVar, long j) {
        int y = tVar.mo20032y();
        long k = j + (((long) tVar.mo20018k()) * 1000);
        if (y == 0 && !this.f3501e) {
            C3173t tVar2 = new C3173t(new byte[tVar.mo20008a()]);
            tVar.mo20015h(tVar2.f5877a, 0, tVar.mo20008a());
            C3190h b = C3190h.m8037b(tVar2);
            this.f3500d = b.f5935b;
            this.f7665a.mo18546d(Format.m10250x((String) null, VideoCapture.VIDEO_MIME_TYPE, (String) null, -1, -1, b.f5936c, b.f5937d, -1.0f, b.f5934a, -1, b.f5938e, (DrmInitData) null));
            this.f3501e = true;
        } else if (y == 1 && this.f3501e) {
            byte[] bArr = this.f3499c.f5877a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f3500d;
            int i2 = 0;
            while (tVar.mo20008a() > 0) {
                tVar.mo20015h(this.f3499c.f5877a, i, this.f3500d);
                this.f3499c.mo20006L(0);
                int C = this.f3499c.mo19997C();
                this.f3498b.mo20006L(0);
                this.f7665a.mo18544b(this.f3498b, 4);
                this.f7665a.mo18544b(tVar, C);
                i2 = i2 + 4 + C;
            }
            this.f7665a.mo18545c(k, this.f3502f == 1 ? 1 : 0, i2, 0, (C2686q.C2687a) null);
        }
    }
}
