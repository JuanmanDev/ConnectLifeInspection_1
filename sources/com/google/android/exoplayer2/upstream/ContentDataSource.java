package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p040c.p200q.p201a.p219b.p260n0.C3120f;
import p040c.p200q.p201a.p219b.p260n0.C3125j;

public final class ContentDataSource extends C3120f {

    /* renamed from: e */
    public final ContentResolver f7907e;
    @Nullable

    /* renamed from: f */
    public Uri f7908f;
    @Nullable

    /* renamed from: g */
    public AssetFileDescriptor f7909g;
    @Nullable

    /* renamed from: h */
    public FileInputStream f7910h;

    /* renamed from: i */
    public long f7911i;

    /* renamed from: j */
    public boolean f7912j;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f7907e = context.getContentResolver();
    }

    /* renamed from: c */
    public long mo19309c(C3125j jVar) {
        try {
            this.f7908f = jVar.f5720a;
            mo19882h(jVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f7907e.openAssetFileDescriptor(this.f7908f, "r");
            this.f7909g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f7910h = new FileInputStream(this.f7909g.getFileDescriptor());
                long startOffset = this.f7909g.getStartOffset();
                long skip = this.f7910h.skip(jVar.f5724e + startOffset) - startOffset;
                if (skip == jVar.f5724e) {
                    long j = -1;
                    if (jVar.f5725f != -1) {
                        this.f7911i = jVar.f5725f;
                    } else {
                        long length = this.f7909g.getLength();
                        if (length == -1) {
                            FileChannel channel = this.f7910h.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j = size - channel.position();
                            }
                            this.f7911i = j;
                        } else {
                            this.f7911i = length - skip;
                        }
                    }
                    this.f7912j = true;
                    mo19883i(jVar);
                    return this.f7911i;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f7908f);
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    public void close() {
        this.f7908f = null;
        try {
            if (this.f7910h != null) {
                this.f7910h.close();
            }
            this.f7910h = null;
            try {
                if (this.f7909g != null) {
                    this.f7909g.close();
                }
                this.f7909g = null;
                if (this.f7912j) {
                    this.f7912j = false;
                    mo19881g();
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            } catch (Throwable th) {
                this.f7909g = null;
                if (this.f7912j) {
                    this.f7912j = false;
                    mo19881g();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        } catch (Throwable th2) {
            this.f7910h = null;
            try {
                if (this.f7909g != null) {
                    this.f7909g.close();
                }
                this.f7909g = null;
                if (this.f7912j) {
                    this.f7912j = false;
                    mo19881g();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3);
            } catch (Throwable th3) {
                this.f7909g = null;
                if (this.f7912j) {
                    this.f7912j = false;
                    mo19881g();
                }
                throw th3;
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public Uri mo19312e() {
        return this.f7908f;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7911i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            }
        }
        int read = this.f7910h.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f7911i;
            if (j2 != -1) {
                this.f7911i = j2 - ((long) read);
            }
            mo19880f(read);
            return read;
        } else if (this.f7911i == -1) {
            return -1;
        } else {
            throw new ContentDataSourceException(new EOFException());
        }
    }
}
