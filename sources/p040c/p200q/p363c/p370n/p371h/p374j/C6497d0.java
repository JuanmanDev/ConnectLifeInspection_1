package p040c.p200q.p363c.p370n.p371h.p374j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: c.q.c.n.h.j.d0 */
/* compiled from: NativeSessionFileGzipper */
public class C6497d0 {
    /* renamed from: a */
    public static void m18160a(@Nullable InputStream inputStream, @NonNull File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            C6513n.m18228f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        C6513n.m18228f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C6513n.m18228f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m18161b(File file, List<C6495c0> list) {
        for (C6495c0 next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo30659e();
                if (inputStream != null) {
                    m18160a(inputStream, new File(file, next.mo30657a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C6513n.m18228f(inputStream);
                throw th;
            }
            C6513n.m18228f(inputStream);
        }
    }
}
