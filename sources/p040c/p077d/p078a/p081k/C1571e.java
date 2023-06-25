package p040c.p077d.p078a.p081k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: c.d.a.k.e */
/* compiled from: Options */
public final class C1571e implements C1567c {

    /* renamed from: b */
    public final ArrayMap<C1568d<?>, Object> f920b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    public static <T> void m1288f(@NonNull C1568d<T> dVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        dVar.mo15612g(obj, messageDigest);
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f920b.size(); i++) {
            m1288f(this.f920b.keyAt(i), this.f920b.valueAt(i), messageDigest);
        }
    }

    @Nullable
    /* renamed from: c */
    public <T> T mo15616c(@NonNull C1568d<T> dVar) {
        return this.f920b.containsKey(dVar) ? this.f920b.get(dVar) : dVar.mo15609c();
    }

    /* renamed from: d */
    public void mo15617d(@NonNull C1571e eVar) {
        this.f920b.putAll(eVar.f920b);
    }

    @NonNull
    /* renamed from: e */
    public <T> C1571e mo15618e(@NonNull C1568d<T> dVar, @NonNull T t) {
        this.f920b.put(dVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1571e) {
            return this.f920b.equals(((C1571e) obj).f920b);
        }
        return false;
    }

    public int hashCode() {
        return this.f920b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f920b + '}';
    }
}
