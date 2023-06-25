package p040c.p200q.p363c.p370n.p371h.p374j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: c.q.c.n.h.j.y */
/* compiled from: FileBackedNativeSessionFile */
public class C6548y implements C6495c0 {
    @NonNull

    /* renamed from: a */
    public final File f12348a;
    @NonNull

    /* renamed from: b */
    public final String f12349b;
    @NonNull

    /* renamed from: c */
    public final String f12350c;

    public C6548y(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f12349b = str;
        this.f12350c = str2;
        this.f12348a = file;
    }

    @NonNull
    /* renamed from: a */
    public String mo30657a() {
        return this.f12350c;
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C8256d.C8258b mo30658b() {
        byte[] c = mo30815c();
        if (c == null) {
            return null;
        }
        CrashlyticsReport.C8256d.C8258b.C8259a a = CrashlyticsReport.C8256d.C8258b.m22791a();
        a.mo31023b(c);
        a.mo31024c(this.f12349b);
        return a.mo31022a();
    }

    @Nullable
    /* renamed from: c */
    public final byte[] mo30815c() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream e = mo30659e();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (e == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (e != null) {
                            e.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = e.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        gZIPOutputStream.write(bArr, 0, read);
                    }
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (e != null) {
                        e.close();
                    }
                    return byteArray;
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (e != null) {
                    e.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    @Nullable
    /* renamed from: e */
    public InputStream mo30659e() {
        if (this.f12348a.exists() && this.f12348a.isFile()) {
            try {
                return new FileInputStream(this.f12348a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
