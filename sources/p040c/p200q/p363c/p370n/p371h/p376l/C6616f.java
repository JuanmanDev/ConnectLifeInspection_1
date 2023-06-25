package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* renamed from: c.q.c.n.h.l.f */
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
public final class C6616f extends CrashlyticsReport.C8256d.C8258b {

    /* renamed from: a */
    public final String f12571a;

    /* renamed from: b */
    public final byte[] f12572b;

    /* renamed from: c.q.c.n.h.l.f$b */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
    public static final class C6618b extends CrashlyticsReport.C8256d.C8258b.C8259a {

        /* renamed from: a */
        public String f12573a;

        /* renamed from: b */
        public byte[] f12574b;

        /* renamed from: a */
        public CrashlyticsReport.C8256d.C8258b mo31022a() {
            String str = "";
            if (this.f12573a == null) {
                str = str + " filename";
            }
            if (this.f12574b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C6616f(this.f12573a, this.f12574b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8256d.C8258b.C8259a mo31023b(byte[] bArr) {
            if (bArr != null) {
                this.f12574b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        /* renamed from: c */
        public CrashlyticsReport.C8256d.C8258b.C8259a mo31024c(String str) {
            if (str != null) {
                this.f12573a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @NonNull
    /* renamed from: b */
    public byte[] mo31017b() {
        return this.f12572b;
    }

    @NonNull
    /* renamed from: c */
    public String mo31018c() {
        return this.f12571a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8256d.C8258b)) {
            return false;
        }
        CrashlyticsReport.C8256d.C8258b bVar = (CrashlyticsReport.C8256d.C8258b) obj;
        if (this.f12571a.equals(bVar.mo31018c())) {
            if (Arrays.equals(this.f12572b, bVar instanceof C6616f ? ((C6616f) bVar).f12572b : bVar.mo31017b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12571a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12572b);
    }

    public String toString() {
        return "File{filename=" + this.f12571a + ", contents=" + Arrays.toString(this.f12572b) + "}";
    }

    public C6616f(String str, byte[] bArr) {
        this.f12571a = str;
        this.f12572b = bArr;
    }
}
