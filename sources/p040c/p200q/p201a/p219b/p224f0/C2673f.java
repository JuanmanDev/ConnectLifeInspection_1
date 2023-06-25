package p040c.p200q.p201a.p219b.p224f0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.f */
/* compiled from: DummyTrackOutput */
public final class C2673f implements C2686q {
    /* renamed from: a */
    public int mo18543a(C2675h hVar, int i, boolean z) {
        int skip = hVar.skip(i);
        if (skip != -1) {
            return skip;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public void mo18544b(C3173t tVar, int i) {
        tVar.mo20007M(i);
    }

    /* renamed from: c */
    public void mo18545c(long j, int i, int i2, int i3, @Nullable C2686q.C2687a aVar) {
    }

    /* renamed from: d */
    public void mo18546d(Format format) {
    }
}
