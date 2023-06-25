package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p040c.p200q.p201a.p219b.p260n0.C3120f;
import p040c.p200q.p201a.p219b.p260n0.C3125j;

public final class FileDataSource extends C3120f {
    @Nullable

    /* renamed from: e */
    public RandomAccessFile f7913e;
    @Nullable

    /* renamed from: f */
    public Uri f7914f;

    /* renamed from: g */
    public long f7915g;

    /* renamed from: h */
    public boolean f7916h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        try {
            this.f7914f = jVar.f5720a;
            mo19882h(jVar);
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.f5720a.getPath(), "r");
            this.f7913e = randomAccessFile;
            randomAccessFile.seek(jVar.f5724e);
            long length = jVar.f5725f == -1 ? this.f7913e.length() - jVar.f5724e : jVar.f5725f;
            this.f7915g = length;
            if (length >= 0) {
                this.f7916h = true;
                mo19883i(jVar);
                return this.f7915g;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    public void close() {
        this.f7914f = null;
        try {
            if (this.f7913e != null) {
                this.f7913e.close();
            }
            this.f7913e = null;
            if (this.f7916h) {
                this.f7916h = false;
                mo19881g();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.f7913e = null;
            if (this.f7916h) {
                this.f7916h = false;
                mo19881g();
            }
            throw th;
        }
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        return this.f7914f;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7915g;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f7913e.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f7915g -= (long) read;
                mo19880f(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }
}
