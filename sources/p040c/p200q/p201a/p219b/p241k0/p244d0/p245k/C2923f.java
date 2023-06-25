package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* renamed from: c.q.a.b.k0.d0.k.f */
/* compiled from: Period */
public class C2923f {
    @Nullable

    /* renamed from: a */
    public final String f4799a;

    /* renamed from: b */
    public final long f4800b;

    /* renamed from: c */
    public final List<C2917a> f4801c;

    /* renamed from: d */
    public final List<C2922e> f4802d;

    public C2923f(@Nullable String str, long j, List<C2917a> list, List<C2922e> list2) {
        this.f4799a = str;
        this.f4800b = j;
        this.f4801c = Collections.unmodifiableList(list);
        this.f4802d = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    public int mo19280a(int i) {
        int size = this.f4801c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f4801c.get(i2).f4764b == i) {
                return i2;
            }
        }
        return -1;
    }
}
