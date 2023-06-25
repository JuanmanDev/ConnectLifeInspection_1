package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p040c.p200q.p201a.p219b.p260n0.C3120f;
import p040c.p200q.p201a.p219b.p260n0.C3125j;

public final class RawResourceDataSource extends C3120f {

    /* renamed from: e */
    public final Resources f7939e;
    @Nullable

    /* renamed from: f */
    public Uri f7940f;
    @Nullable

    /* renamed from: g */
    public AssetFileDescriptor f7941g;
    @Nullable

    /* renamed from: h */
    public InputStream f7942h;

    /* renamed from: i */
    public long f7943i;

    /* renamed from: j */
    public boolean f7944j;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f7939e = context.getResources();
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        try {
            Uri uri = jVar.f5720a;
            this.f7940f = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                int parseInt = Integer.parseInt(this.f7940f.getLastPathSegment());
                mo19882h(jVar);
                this.f7941g = this.f7939e.openRawResourceFd(parseInt);
                FileInputStream fileInputStream = new FileInputStream(this.f7941g.getFileDescriptor());
                this.f7942h = fileInputStream;
                fileInputStream.skip(this.f7941g.getStartOffset());
                if (this.f7942h.skip(jVar.f5724e) >= jVar.f5724e) {
                    long j = -1;
                    if (jVar.f5725f != -1) {
                        this.f7943i = jVar.f5725f;
                    } else {
                        long length = this.f7941g.getLength();
                        if (length != -1) {
                            j = length - jVar.f5724e;
                        }
                        this.f7943i = j;
                    }
                    this.f7944j = true;
                    mo19883i(jVar);
                    return this.f7943i;
                }
                throw new EOFException();
            }
            throw new RawResourceDataSourceException("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.");
        } catch (IOException e) {
            throw new RawResourceDataSourceException(e);
        }
    }

    public void close() {
        this.f7940f = null;
        try {
            if (this.f7942h != null) {
                this.f7942h.close();
            }
            this.f7942h = null;
            try {
                if (this.f7941g != null) {
                    this.f7941g.close();
                }
                this.f7941g = null;
                if (this.f7944j) {
                    this.f7944j = false;
                    mo19881g();
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e);
            } catch (Throwable th) {
                this.f7941g = null;
                if (this.f7944j) {
                    this.f7944j = false;
                    mo19881g();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2);
        } catch (Throwable th2) {
            this.f7942h = null;
            try {
                if (this.f7941g != null) {
                    this.f7941g.close();
                }
                this.f7941g = null;
                if (this.f7944j) {
                    this.f7944j = false;
                    mo19881g();
                }
                throw th2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException(e3);
            } catch (Throwable th3) {
                this.f7941g = null;
                if (this.f7944j) {
                    this.f7944j = false;
                    mo19881g();
                }
                throw th3;
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        return this.f7940f;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7943i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e);
            }
        }
        int read = this.f7942h.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f7943i;
            if (j2 != -1) {
                this.f7943i = j2 - ((long) read);
            }
            mo19880f(read);
            return read;
        } else if (this.f7943i == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException((IOException) new EOFException());
        }
    }
}
