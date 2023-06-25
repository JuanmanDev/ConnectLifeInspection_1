package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p040c.p200q.p201a.p219b.p260n0.C3120f;
import p040c.p200q.p201a.p219b.p260n0.C3125j;

public final class AssetDataSource extends C3120f {

    /* renamed from: e */
    public final AssetManager f7902e;
    @Nullable

    /* renamed from: f */
    public Uri f7903f;
    @Nullable

    /* renamed from: g */
    public InputStream f7904g;

    /* renamed from: h */
    public long f7905h;

    /* renamed from: i */
    public boolean f7906i;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f7902e = context.getAssets();
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        try {
            Uri uri = jVar.f5720a;
            this.f7903f = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo19882h(jVar);
            InputStream open = this.f7902e.open(path, 1);
            this.f7904g = open;
            if (open.skip(jVar.f5724e) >= jVar.f5724e) {
                if (jVar.f5725f != -1) {
                    this.f7905h = jVar.f5725f;
                } else {
                    long available = (long) this.f7904g.available();
                    this.f7905h = available;
                    if (available == 2147483647L) {
                        this.f7905h = -1;
                    }
                }
                this.f7906i = true;
                mo19883i(jVar);
                return this.f7905h;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    public void close() {
        this.f7903f = null;
        try {
            if (this.f7904g != null) {
                this.f7904g.close();
            }
            this.f7904g = null;
            if (this.f7906i) {
                this.f7906i = false;
                mo19881g();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.f7904g = null;
            if (this.f7906i) {
                this.f7906i = false;
                mo19881g();
            }
            throw th;
        }
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        return this.f7903f;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7905h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        }
        int read = this.f7904g.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f7905h;
            if (j2 != -1) {
                this.f7905h = j2 - ((long) read);
            }
            mo19880f(read);
            return read;
        } else if (this.f7905h == -1) {
            return -1;
        } else {
            throw new AssetDataSourceException(new EOFException());
        }
    }
}
