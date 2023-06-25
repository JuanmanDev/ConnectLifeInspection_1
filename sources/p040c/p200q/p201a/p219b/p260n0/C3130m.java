package p040c.p200q.p201a.p219b.p260n0;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.n0.m */
/* compiled from: DefaultDataSource */
public final class C3130m implements C3122h {

    /* renamed from: a */
    public final Context f5756a;

    /* renamed from: b */
    public final List<C3141v> f5757b = new ArrayList();

    /* renamed from: c */
    public final C3122h f5758c;
    @Nullable

    /* renamed from: d */
    public C3122h f5759d;
    @Nullable

    /* renamed from: e */
    public C3122h f5760e;
    @Nullable

    /* renamed from: f */
    public C3122h f5761f;
    @Nullable

    /* renamed from: g */
    public C3122h f5762g;
    @Nullable

    /* renamed from: h */
    public C3122h f5763h;
    @Nullable

    /* renamed from: i */
    public C3122h f5764i;
    @Nullable

    /* renamed from: j */
    public C3122h f5765j;

    public C3130m(Context context, C3122h hVar) {
        this.f5756a = context.getApplicationContext();
        C3151e.m7757e(hVar);
        this.f5758c = hVar;
    }

    /* renamed from: b */
    public void mo19308b(C3141v vVar) {
        this.f5758c.mo19308b(vVar);
        this.f5757b.add(vVar);
        mo19912m(this.f5759d, vVar);
        mo19912m(this.f5760e, vVar);
        mo19912m(this.f5761f, vVar);
        mo19912m(this.f5762g, vVar);
        mo19912m(this.f5763h, vVar);
        mo19912m(this.f5764i, vVar);
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        C3151e.m7759g(this.f5765j == null);
        String scheme = jVar.f5720a.getScheme();
        if (C3152e0.m7779S(jVar.f5720a)) {
            if (jVar.f5720a.getPath().startsWith("/android_asset/")) {
                this.f5765j = mo19906g();
            } else {
                this.f5765j = mo19909j();
            }
        } else if ("asset".equals(scheme)) {
            this.f5765j = mo19906g();
        } else if (BrowserServiceFileProvider.CONTENT_SCHEME.equals(scheme)) {
            this.f5765j = mo19907h();
        } else if ("rtmp".equals(scheme)) {
            this.f5765j = mo19911l();
        } else if ("data".equals(scheme)) {
            this.f5765j = mo19908i();
        } else if ("rawresource".equals(scheme)) {
            this.f5765j = mo19910k();
        } else {
            this.f5765j = this.f5758c;
        }
        return this.f5765j.mo19309c(jVar);
    }

    public void close() {
        C3122h hVar = this.f5765j;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f5765j = null;
            }
        }
    }

    /* renamed from: d */
    public Map<String, List<String>> mo19311d() {
        C3122h hVar = this.f5765j;
        return hVar == null ? Collections.emptyMap() : hVar.mo19311d();
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        C3122h hVar = this.f5765j;
        if (hVar == null) {
            return null;
        }
        return hVar.mo19312e();
    }

    /* renamed from: f */
    public final void mo19905f(C3122h hVar) {
        for (int i = 0; i < this.f5757b.size(); i++) {
            hVar.mo19308b(this.f5757b.get(i));
        }
    }

    /* renamed from: g */
    public final C3122h mo19906g() {
        if (this.f5760e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f5756a);
            this.f5760e = assetDataSource;
            mo19905f(assetDataSource);
        }
        return this.f5760e;
    }

    /* renamed from: h */
    public final C3122h mo19907h() {
        if (this.f5761f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f5756a);
            this.f5761f = contentDataSource;
            mo19905f(contentDataSource);
        }
        return this.f5761f;
    }

    /* renamed from: i */
    public final C3122h mo19908i() {
        if (this.f5763h == null) {
            C3121g gVar = new C3121g();
            this.f5763h = gVar;
            mo19905f(gVar);
        }
        return this.f5763h;
    }

    /* renamed from: j */
    public final C3122h mo19909j() {
        if (this.f5759d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f5759d = fileDataSource;
            mo19905f(fileDataSource);
        }
        return this.f5759d;
    }

    /* renamed from: k */
    public final C3122h mo19910k() {
        if (this.f5764i == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f5756a);
            this.f5764i = rawResourceDataSource;
            mo19905f(rawResourceDataSource);
        }
        return this.f5764i;
    }

    /* renamed from: l */
    public final C3122h mo19911l() {
        if (this.f5762g == null) {
            try {
                C3122h hVar = (C3122h) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f5762g = hVar;
                mo19905f(hVar);
            } catch (ClassNotFoundException unused) {
                C3163m.m7880f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f5762g == null) {
                this.f5762g = this.f5758c;
            }
        }
        return this.f5762g;
    }

    /* renamed from: m */
    public final void mo19912m(@Nullable C3122h hVar, C3141v vVar) {
        if (hVar != null) {
            hVar.mo19308b(vVar);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C3122h hVar = this.f5765j;
        C3151e.m7757e(hVar);
        return hVar.read(bArr, i, i2);
    }
}
