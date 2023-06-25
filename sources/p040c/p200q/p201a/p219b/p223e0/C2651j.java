package p040c.p200q.p201a.p219b.p223e0;

import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;
import p040c.p200q.p201a.p219b.p223e0.C2652k;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.e0.j */
/* compiled from: ErrorStateDrmSession */
public final class C2651j<T extends C2652k> implements DrmSession<T> {

    /* renamed from: a */
    public final DrmSession.DrmSessionException f3366a;

    public C2651j(DrmSession.DrmSessionException drmSessionException) {
        C3151e.m7757e(drmSessionException);
        this.f3366a = drmSessionException;
    }

    /* renamed from: a */
    public Map<String, String> mo18439a() {
        return null;
    }

    /* renamed from: b */
    public T mo18440b() {
        return null;
    }

    /* renamed from: c */
    public DrmSession.DrmSessionException mo18441c() {
        return this.f3366a;
    }

    public int getState() {
        return 1;
    }
}
