package p040c.p200q.p201a.p219b.p260n0;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.n0.t */
/* compiled from: ParsingLoadable */
public final class C3138t<T> implements Loader.C4060e {

    /* renamed from: a */
    public final C3125j f5792a;

    /* renamed from: b */
    public final int f5793b;

    /* renamed from: c */
    public final C3140u f5794c;

    /* renamed from: d */
    public final C3139a<? extends T> f5795d;
    @Nullable

    /* renamed from: e */
    public volatile T f5796e;

    /* renamed from: c.q.a.b.n0.t$a */
    /* compiled from: ParsingLoadable */
    public interface C3139a<T> {
        /* renamed from: a */
        T mo18948a(Uri uri, InputStream inputStream);
    }

    public C3138t(C3122h hVar, Uri uri, int i, C3139a<? extends T> aVar) {
        this(hVar, new C3125j(uri, 3), i, aVar);
    }

    /* renamed from: a */
    public final void mo19121a() {
    }

    /* renamed from: b */
    public long mo19925b() {
        return this.f5794c.mo19929f();
    }

    /* renamed from: c */
    public Map<String, List<String>> mo19926c() {
        return this.f5794c.mo19931h();
    }

    @Nullable
    /* renamed from: d */
    public final T mo19927d() {
        return this.f5796e;
    }

    /* renamed from: e */
    public Uri mo19928e() {
        return this.f5794c.mo19930g();
    }

    public final void load() {
        this.f5794c.mo19932i();
        C3124i iVar = new C3124i(this.f5794c, this.f5792a);
        try {
            iVar.mo19886b();
            Uri e = this.f5794c.mo19312e();
            C3151e.m7757e(e);
            this.f5796e = this.f5795d.mo18948a(e, iVar);
        } finally {
            C3152e0.m7807k(iVar);
        }
    }

    public C3138t(C3122h hVar, C3125j jVar, int i, C3139a<? extends T> aVar) {
        this.f5794c = new C3140u(hVar);
        this.f5792a = jVar;
        this.f5793b = i;
        this.f5795d = aVar;
    }
}
