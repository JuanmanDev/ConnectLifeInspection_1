package p040c.p200q.p201a.p219b.p223e0;

import android.annotation.TargetApi;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import p040c.p200q.p201a.p219b.p223e0.C2652k;

@TargetApi(16)
/* renamed from: c.q.a.b.e0.i */
/* compiled from: DrmSessionManager */
public interface C2650i<T extends C2652k> {
    /* renamed from: a */
    DrmSession<T> mo18469a(Looper looper, DrmInitData drmInitData);

    /* renamed from: d */
    boolean mo18470d(DrmInitData drmInitData);

    /* renamed from: f */
    void mo18471f(DrmSession<T> drmSession);
}
