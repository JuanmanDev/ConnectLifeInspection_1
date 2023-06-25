package p040c.p200q.p201a.p219b.p241k0.p243c0;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3140u;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.c0.d */
/* compiled from: Chunk */
public abstract class C2872d implements Loader.C4060e {

    /* renamed from: a */
    public final C3125j f4553a;

    /* renamed from: b */
    public final int f4554b;

    /* renamed from: c */
    public final Format f4555c;

    /* renamed from: d */
    public final int f4556d;
    @Nullable

    /* renamed from: e */
    public final Object f4557e;

    /* renamed from: f */
    public final long f4558f;

    /* renamed from: g */
    public final long f4559g;

    /* renamed from: h */
    public final C3140u f4560h;

    public C2872d(C3122h hVar, C3125j jVar, int i, Format format, int i2, @Nullable Object obj, long j, long j2) {
        this.f4560h = new C3140u(hVar);
        C3151e.m7757e(jVar);
        this.f4553a = jVar;
        this.f4554b = i;
        this.f4555c = format;
        this.f4556d = i2;
        this.f4557e = obj;
        this.f4558f = j;
        this.f4559g = j2;
    }

    /* renamed from: b */
    public final long mo19072b() {
        return this.f4560h.mo19929f();
    }

    /* renamed from: c */
    public final long mo19073c() {
        return this.f4559g - this.f4558f;
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo19074d() {
        return this.f4560h.mo19931h();
    }

    /* renamed from: e */
    public final Uri mo19075e() {
        return this.f4560h.mo19930g();
    }
}
