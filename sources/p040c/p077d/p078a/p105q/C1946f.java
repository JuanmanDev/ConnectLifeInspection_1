package p040c.p077d.p078a.p105q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: c.d.a.q.f */
/* compiled from: LruCache */
public class C1946f<T, Y> {

    /* renamed from: a */
    public final Map<T, Y> f1630a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public long f1631b;

    /* renamed from: c */
    public long f1632c;

    public C1946f(long j) {
        this.f1631b = j;
    }

    /* renamed from: b */
    public void mo16432b() {
        mo16438m(0);
    }

    /* renamed from: f */
    public final void mo16433f() {
        mo16438m(this.f1631b);
    }

    @Nullable
    /* renamed from: g */
    public synchronized Y mo16434g(@NonNull T t) {
        return this.f1630a.get(t);
    }

    /* renamed from: h */
    public synchronized long mo16435h() {
        return this.f1631b;
    }

    /* renamed from: i */
    public int mo15706i(@Nullable Y y) {
        return 1;
    }

    /* renamed from: j */
    public void mo15707j(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    /* renamed from: k */
    public synchronized Y mo16436k(@NonNull T t, @Nullable Y y) {
        long i = (long) mo15706i(y);
        if (i >= this.f1631b) {
            mo15707j(t, y);
            return null;
        }
        if (y != null) {
            this.f1632c += i;
        }
        Y put = this.f1630a.put(t, y);
        if (put != null) {
            this.f1632c -= (long) mo15706i(put);
            if (!put.equals(y)) {
                mo15707j(t, put);
            }
        }
        mo16433f();
        return put;
    }

    @Nullable
    /* renamed from: l */
    public synchronized Y mo16437l(@NonNull T t) {
        Y remove;
        remove = this.f1630a.remove(t);
        if (remove != null) {
            this.f1632c -= (long) mo15706i(remove);
        }
        return remove;
    }

    /* renamed from: m */
    public synchronized void mo16438m(long j) {
        while (this.f1632c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f1630a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f1632c -= (long) mo15706i(value);
            Object key = next.getKey();
            it.remove();
            mo15707j(key, value);
        }
    }
}
