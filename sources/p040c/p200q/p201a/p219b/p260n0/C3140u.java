package p040c.p200q.p201a.p219b.p260n0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.n0.u */
/* compiled from: StatsDataSource */
public final class C3140u implements C3122h {

    /* renamed from: a */
    public final C3122h f5797a;

    /* renamed from: b */
    public long f5798b;

    /* renamed from: c */
    public Uri f5799c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f5800d = Collections.emptyMap();

    public C3140u(C3122h hVar) {
        C3151e.m7757e(hVar);
        this.f5797a = hVar;
    }

    /* renamed from: b */
    public void mo19308b(C3141v vVar) {
        this.f5797a.mo19308b(vVar);
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        this.f5799c = jVar.f5720a;
        this.f5800d = Collections.emptyMap();
        long c = this.f5797a.mo19309c(jVar);
        Uri e = mo19312e();
        C3151e.m7757e(e);
        this.f5799c = e;
        this.f5800d = mo19311d();
        return c;
    }

    public void close() {
        this.f5797a.close();
    }

    /* renamed from: d */
    public Map<String, List<String>> mo19311d() {
        return this.f5797a.mo19311d();
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        return this.f5797a.mo19312e();
    }

    /* renamed from: f */
    public long mo19929f() {
        return this.f5798b;
    }

    /* renamed from: g */
    public Uri mo19930g() {
        return this.f5799c;
    }

    /* renamed from: h */
    public Map<String, List<String>> mo19931h() {
        return this.f5800d;
    }

    /* renamed from: i */
    public void mo19932i() {
        this.f5798b = 0;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f5797a.read(bArr, i, i2);
        if (read != -1) {
            this.f5798b += (long) read;
        }
        return read;
    }
}
