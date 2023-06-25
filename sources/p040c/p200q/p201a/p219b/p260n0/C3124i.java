package p040c.p200q.p201a.p219b.p260n0;

import androidx.annotation.NonNull;
import java.io.InputStream;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.n0.i */
/* compiled from: DataSourceInputStream */
public final class C3124i extends InputStream {

    /* renamed from: e */
    public final C3122h f5714e;

    /* renamed from: l */
    public final C3125j f5715l;

    /* renamed from: m */
    public final byte[] f5716m;

    /* renamed from: n */
    public boolean f5717n = false;

    /* renamed from: o */
    public boolean f5718o = false;

    /* renamed from: p */
    public long f5719p;

    public C3124i(C3122h hVar, C3125j jVar) {
        this.f5714e = hVar;
        this.f5715l = jVar;
        this.f5716m = new byte[1];
    }

    /* renamed from: a */
    public final void mo19885a() {
        if (!this.f5717n) {
            this.f5714e.mo19309c(this.f5715l);
            this.f5717n = true;
        }
    }

    /* renamed from: b */
    public void mo19886b() {
        mo19885a();
    }

    public void close() {
        if (!this.f5718o) {
            this.f5714e.close();
            this.f5718o = true;
        }
    }

    public int read() {
        if (read(this.f5716m) == -1) {
            return -1;
        }
        return this.f5716m[0] & 255;
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        C3151e.m7759g(!this.f5718o);
        mo19885a();
        int read = this.f5714e.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f5719p += (long) read;
        return read;
    }
}
