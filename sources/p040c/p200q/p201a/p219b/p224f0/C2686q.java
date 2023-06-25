package p040c.p200q.p201a.p219b.p224f0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.q */
/* compiled from: TrackOutput */
public interface C2686q {

    /* renamed from: c.q.a.b.f0.q$a */
    /* compiled from: TrackOutput */
    public static final class C2687a {

        /* renamed from: a */
        public final int f3451a;

        /* renamed from: b */
        public final byte[] f3452b;

        /* renamed from: c */
        public final int f3453c;

        /* renamed from: d */
        public final int f3454d;

        public C2687a(int i, byte[] bArr, int i2, int i3) {
            this.f3451a = i;
            this.f3452b = bArr;
            this.f3453c = i2;
            this.f3454d = i3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2687a.class != obj.getClass()) {
                return false;
            }
            C2687a aVar = (C2687a) obj;
            if (this.f3451a == aVar.f3451a && this.f3453c == aVar.f3453c && this.f3454d == aVar.f3454d && Arrays.equals(this.f3452b, aVar.f3452b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f3451a * 31) + Arrays.hashCode(this.f3452b)) * 31) + this.f3453c) * 31) + this.f3454d;
        }
    }

    /* renamed from: a */
    int mo18543a(C2675h hVar, int i, boolean z);

    /* renamed from: b */
    void mo18544b(C3173t tVar, int i);

    /* renamed from: c */
    void mo18545c(long j, int i, int i2, int i3, @Nullable C2687a aVar);

    /* renamed from: d */
    void mo18546d(Format format);
}
