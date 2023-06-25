package p040c.p200q.p363c.p394v;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: c.q.c.v.g */
/* compiled from: CrossProcessLock */
public class C6766g {

    /* renamed from: a */
    public final FileChannel f12922a;

    /* renamed from: b */
    public final FileLock f12923b;

    public C6766g(FileChannel fileChannel, FileLock fileLock) {
        this.f12922a = fileChannel;
        this.f12923b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[SYNTHETIC, Splitter:B:14:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC, Splitter:B:18:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p363c.p394v.C6766g m19126a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            r1.<init>(r2, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.nio.channels.FileLock r3 = r2.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x001f }
            c.q.c.v.g r1 = new c.q.c.v.g     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            r1.<init>(r2, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            return r1
        L_0x001f:
            r3 = r0
            goto L_0x0023
        L_0x0021:
            r2 = r0
            r3 = r2
        L_0x0023:
            if (r3 == 0) goto L_0x0028
            r3.release()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            if (r2 == 0) goto L_0x002d
            r2.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p394v.C6766g.m19126a(android.content.Context, java.lang.String):c.q.c.v.g");
    }

    /* renamed from: b */
    public void mo31450b() {
        try {
            this.f12923b.release();
            this.f12922a.close();
        } catch (IOException unused) {
        }
    }
}
