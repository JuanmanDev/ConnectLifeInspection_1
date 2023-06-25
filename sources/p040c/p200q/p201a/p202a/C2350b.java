package p040c.p200q.p201a.p202a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.a.b */
/* compiled from: Encoding */
public final class C2350b {

    /* renamed from: a */
    public final String f2588a;

    public C2350b(@NonNull String str) {
        if (str != null) {
            this.f2588a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C2350b m4027b(@NonNull String str) {
        return new C2350b(str);
    }

    /* renamed from: a */
    public String mo17655a() {
        return this.f2588a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2350b)) {
            return false;
        }
        return this.f2588a.equals(((C2350b) obj).f2588a);
    }

    public int hashCode() {
        return this.f2588a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f2588a + "\"}";
    }
}
