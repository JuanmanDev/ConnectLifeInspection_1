package p040c.p200q.p201a.p202a.p205i.p214x;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.p214x.C2554f;

/* renamed from: c.q.a.a.i.x.a */
/* compiled from: AutoValue_BackendRequest */
public final class C2547a extends C2554f {

    /* renamed from: a */
    public final Iterable<C2527j> f2992a;

    /* renamed from: b */
    public final byte[] f2993b;

    /* renamed from: c.q.a.a.i.x.a$b */
    /* compiled from: AutoValue_BackendRequest */
    public static final class C2549b extends C2554f.C2555a {

        /* renamed from: a */
        public Iterable<C2527j> f2994a;

        /* renamed from: b */
        public byte[] f2995b;

        /* renamed from: a */
        public C2554f mo17994a() {
            String str = "";
            if (this.f2994a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C2547a(this.f2994a, this.f2995b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2554f.C2555a mo17995b(Iterable<C2527j> iterable) {
            if (iterable != null) {
                this.f2994a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C2554f.C2555a mo17996c(@Nullable byte[] bArr) {
            this.f2995b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable<C2527j> mo17989b() {
        return this.f2992a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo17990c() {
        return this.f2993b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2554f)) {
            return false;
        }
        C2554f fVar = (C2554f) obj;
        if (this.f2992a.equals(fVar.mo17989b())) {
            if (Arrays.equals(this.f2993b, fVar instanceof C2547a ? ((C2547a) fVar).f2993b : fVar.mo17990c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2992a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2993b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f2992a + ", extras=" + Arrays.toString(this.f2993b) + "}";
    }

    public C2547a(Iterable<C2527j> iterable, @Nullable byte[] bArr) {
        this.f2992a = iterable;
        this.f2993b = bArr;
    }
}
