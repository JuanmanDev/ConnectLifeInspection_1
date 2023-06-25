package p040c.p200q.p201a.p219b.p259m0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2885m;
import p040c.p200q.p201a.p219b.p260n0.C3118e;

/* renamed from: c.q.a.b.m0.e */
/* compiled from: TrackSelection */
public interface C3107e {

    /* renamed from: c.q.a.b.m0.e$a */
    /* compiled from: TrackSelection */
    public interface C3108a {
        /* renamed from: a */
        C3107e mo19818a(TrackGroup trackGroup, C3118e eVar, int... iArr);
    }

    /* renamed from: a */
    TrackGroup mo19820a();

    /* renamed from: b */
    int mo19337b();

    /* renamed from: c */
    boolean mo19821c(int i, long j);

    /* renamed from: d */
    void mo19822d();

    /* renamed from: e */
    Format mo19823e(int i);

    /* renamed from: f */
    void mo19813f();

    /* renamed from: g */
    int mo19825g(int i);

    /* renamed from: h */
    int mo19814h(long j, List<? extends C2884l> list);

    /* renamed from: i */
    int mo19827i(Format format);

    /* renamed from: j */
    void mo19338j(long j, long j2, long j3, List<? extends C2884l> list, C2885m[] mVarArr) {
        mo19841o(j, j2, j3);
    }

    /* renamed from: k */
    int mo19828k();

    /* renamed from: l */
    Format mo19829l();

    int length();

    /* renamed from: m */
    int mo19339m();

    /* renamed from: n */
    void mo19815n(float f);

    @Deprecated
    /* renamed from: o */
    void mo19841o(long j, long j2, long j3) {
        throw new UnsupportedOperationException();
    }

    @Nullable
    /* renamed from: p */
    Object mo19340p();

    /* renamed from: q */
    int mo19831q(int i);
}
