package p040c.p200q.p201a.p219b.p224f0.p226s;

import android.util.Pair;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3155g;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.s.b */
/* compiled from: AudioTagPayloadReader */
public final class C2691b extends TagPayloadReader {

    /* renamed from: e */
    public static final int[] f3477e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f3478b;

    /* renamed from: c */
    public boolean f3479c;

    /* renamed from: d */
    public int f3480d;

    public C2691b(C2686q qVar) {
        super(qVar);
    }

    /* renamed from: b */
    public boolean mo18580b(C3173t tVar) {
        if (!this.f3478b) {
            int y = tVar.mo20032y();
            int i = (y >> 4) & 15;
            this.f3480d = i;
            if (i == 2) {
                this.f7665a.mo18546d(Format.m10238l((String) null, "audio/mpeg", (String) null, -1, -1, 1, f3477e[(y >> 2) & 3], (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f3479c = true;
            } else if (i == 7 || i == 8) {
                this.f7665a.mo18546d(Format.m10237k((String) null, this.f3480d == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, (y & 1) == 1 ? 2 : 3, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f3479c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f3480d);
            }
            this.f3478b = true;
        } else {
            tVar.mo20007M(1);
        }
        return true;
    }

    /* renamed from: c */
    public void mo18581c(C3173t tVar, long j) {
        C3173t tVar2 = tVar;
        if (this.f3480d == 2) {
            int a = tVar.mo20008a();
            this.f7665a.mo18544b(tVar2, a);
            this.f7665a.mo18545c(j, 1, a, 0, (C2686q.C2687a) null);
            return;
        }
        int y = tVar.mo20032y();
        if (y == 0 && !this.f3479c) {
            int a2 = tVar.mo20008a();
            byte[] bArr = new byte[a2];
            tVar2.mo20015h(bArr, 0, a2);
            Pair<Integer, Integer> j2 = C3155g.m7847j(bArr);
            this.f7665a.mo18546d(Format.m10238l((String) null, VideoCapture.AUDIO_MIME_TYPE, (String) null, -1, -1, ((Integer) j2.second).intValue(), ((Integer) j2.first).intValue(), Collections.singletonList(bArr), (DrmInitData) null, 0, (String) null));
            this.f3479c = true;
        } else if (this.f3480d != 10 || y == 1) {
            int a3 = tVar.mo20008a();
            this.f7665a.mo18544b(tVar2, a3);
            this.f7665a.mo18545c(j, 1, a3, 0, (C2686q.C2687a) null);
        }
    }
}
