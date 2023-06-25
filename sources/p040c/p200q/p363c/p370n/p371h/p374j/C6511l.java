package p040c.p200q.p363c.p370n.p371h.p374j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: c.q.c.n.h.j.l */
/* compiled from: BytesBackedNativeSessionFile */
public class C6511l implements C6495c0 {
    @Nullable

    /* renamed from: a */
    public final byte[] f12228a;
    @NonNull

    /* renamed from: b */
    public final String f12229b;
    @NonNull

    /* renamed from: c */
    public final String f12230c;

    public C6511l(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f12229b = str;
        this.f12230c = str2;
        this.f12228a = bArr;
    }

    @NonNull
    /* renamed from: a */
    public String mo30657a() {
        return this.f12230c;
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C8256d.C8258b mo30658b() {
        byte[] c = mo30692c();
        if (c == null) {
            return null;
        }
        CrashlyticsReport.C8256d.C8258b.C8259a a = CrashlyticsReport.C8256d.C8258b.m22791a();
        a.mo31023b(c);
        a.mo31024c(this.f12229b);
        return a.mo31022a();
    }

    @Nullable
    /* renamed from: c */
    public final byte[] mo30692c() {
        GZIPOutputStream gZIPOutputStream;
        if (mo30693d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f12228a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: d */
    public final boolean mo30693d() {
        byte[] bArr = this.f12228a;
        return bArr == null || bArr.length == 0;
    }

    @Nullable
    /* renamed from: e */
    public InputStream mo30659e() {
        if (mo30693d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f12228a);
    }
}
