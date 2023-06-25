package p040c.p200q.p201a.p219b.p260n0;

import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import p040c.p200q.p201a.p219b.p261o0.C3175v;

/* renamed from: c.q.a.b.n0.p */
/* compiled from: DefaultHttpDataSourceFactory */
public final class C3133p extends HttpDataSource.C4054a {

    /* renamed from: b */
    public final String f5786b;
    @Nullable

    /* renamed from: c */
    public final C3141v f5787c;

    /* renamed from: d */
    public final int f5788d;

    /* renamed from: e */
    public final int f5789e;

    /* renamed from: f */
    public final boolean f5790f;

    public C3133p(String str, @Nullable C3141v vVar) {
        this(str, vVar, VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, false);
    }

    /* renamed from: d */
    public C3132o mo19920c(HttpDataSource.C4055b bVar) {
        C3132o oVar = new C3132o(this.f5786b, (C3175v<String>) null, this.f5788d, this.f5789e, this.f5790f, bVar);
        C3141v vVar = this.f5787c;
        if (vVar != null) {
            oVar.mo19308b(vVar);
        }
        return oVar;
    }

    public C3133p(String str, @Nullable C3141v vVar, int i, int i2, boolean z) {
        this.f5786b = str;
        this.f5787c = vVar;
        this.f5788d = i;
        this.f5789e = i2;
        this.f5790f = z;
    }
}
