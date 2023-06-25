package p040c.p200q.p201a.p219b.p260n0;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.exoplayer2.ParserException;
import java.net.URLDecoder;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.n0.g */
/* compiled from: DataSchemeDataSource */
public final class C3121g extends C3120f {
    @Nullable

    /* renamed from: e */
    public C3125j f5711e;

    /* renamed from: f */
    public int f5712f;
    @Nullable

    /* renamed from: g */
    public byte[] f5713g;

    public C3121g() {
        super(false);
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        mo19882h(jVar);
        this.f5711e = jVar;
        Uri uri = jVar.f5720a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] f0 = C3152e0.m7798f0(uri.getSchemeSpecificPart(), RunnerArgs.CLASS_SEPARATOR);
            if (f0.length == 2) {
                String str = f0[1];
                if (f0[0].contains(";base64")) {
                    try {
                        this.f5713g = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new ParserException("Error while parsing Base64 encoded string: " + str, e);
                    }
                } else {
                    this.f5713g = C3152e0.m7773M(URLDecoder.decode(str, "US-ASCII"));
                }
                mo19883i(jVar);
                return (long) this.f5713g.length;
            }
            throw new ParserException("Unexpected URI format: " + uri);
        }
        throw new ParserException("Unsupported scheme: " + scheme);
    }

    public void close() {
        if (this.f5713g != null) {
            this.f5713g = null;
            mo19881g();
        }
        this.f5711e = null;
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        C3125j jVar = this.f5711e;
        if (jVar != null) {
            return jVar.f5720a;
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.f5713g.length - this.f5712f;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.f5713g, this.f5712f, bArr, i, min);
        this.f5712f += min;
        mo19880f(min);
        return min;
    }
}
