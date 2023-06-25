package p040c.p200q.p201a.p219b.p259m0;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: c.q.a.b.m0.f */
/* compiled from: TrackSelectionArray */
public final class C3109f {

    /* renamed from: a */
    public final int f5678a;

    /* renamed from: b */
    public final C3107e[] f5679b;

    /* renamed from: c */
    public int f5680c;

    public C3109f(C3107e... eVarArr) {
        this.f5679b = eVarArr;
        this.f5678a = eVarArr.length;
    }

    @Nullable
    /* renamed from: a */
    public C3107e mo19842a(int i) {
        return this.f5679b[i];
    }

    /* renamed from: b */
    public C3107e[] mo19843b() {
        return (C3107e[]) this.f5679b.clone();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3109f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5679b, ((C3109f) obj).f5679b);
    }

    public int hashCode() {
        if (this.f5680c == 0) {
            this.f5680c = 527 + Arrays.hashCode(this.f5679b);
        }
        return this.f5680c;
    }
}
