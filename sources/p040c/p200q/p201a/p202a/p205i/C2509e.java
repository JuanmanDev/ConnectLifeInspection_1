package p040c.p200q.p201a.p202a.p205i;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import p040c.p200q.p201a.p202a.p205i.C2538q;

/* renamed from: c.q.a.a.i.e */
/* compiled from: AutoValue_TransportContext */
public final class C2509e extends C2538q {

    /* renamed from: a */
    public final String f2944a;

    /* renamed from: b */
    public final byte[] f2945b;

    /* renamed from: c */
    public final Priority f2946c;

    /* renamed from: c.q.a.a.i.e$b */
    /* compiled from: AutoValue_TransportContext */
    public static final class C2511b extends C2538q.C2539a {

        /* renamed from: a */
        public String f2947a;

        /* renamed from: b */
        public byte[] f2948b;

        /* renamed from: c */
        public Priority f2949c;

        /* renamed from: a */
        public C2538q mo17948a() {
            String str = "";
            if (this.f2947a == null) {
                str = str + " backendName";
            }
            if (this.f2949c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C2509e(this.f2947a, this.f2948b, this.f2949c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2538q.C2539a mo17949b(String str) {
            if (str != null) {
                this.f2947a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public C2538q.C2539a mo17950c(@Nullable byte[] bArr) {
            this.f2948b = bArr;
            return this;
        }

        /* renamed from: d */
        public C2538q.C2539a mo17951d(Priority priority) {
            if (priority != null) {
                this.f2949c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    /* renamed from: b */
    public String mo17943b() {
        return this.f2944a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo17944c() {
        return this.f2945b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public Priority mo17945d() {
        return this.f2946c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2538q)) {
            return false;
        }
        C2538q qVar = (C2538q) obj;
        if (this.f2944a.equals(qVar.mo17943b())) {
            if (Arrays.equals(this.f2945b, qVar instanceof C2509e ? ((C2509e) qVar).f2945b : qVar.mo17944c()) && this.f2946c.equals(qVar.mo17945d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2944a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2945b)) * 1000003) ^ this.f2946c.hashCode();
    }

    public C2509e(String str, @Nullable byte[] bArr, Priority priority) {
        this.f2944a = str;
        this.f2945b = bArr;
        this.f2946c = priority;
    }
}
