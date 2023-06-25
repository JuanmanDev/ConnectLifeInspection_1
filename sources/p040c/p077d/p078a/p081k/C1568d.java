package p040c.p077d.p078a.p081k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.d */
/* compiled from: Option */
public final class C1568d<T> {

    /* renamed from: e */
    public static final C1570b<Object> f915e = new C1569a();

    /* renamed from: a */
    public final T f916a;

    /* renamed from: b */
    public final C1570b<T> f917b;

    /* renamed from: c */
    public final String f918c;

    /* renamed from: d */
    public volatile byte[] f919d;

    /* renamed from: c.d.a.k.d$a */
    /* compiled from: Option */
    public class C1569a implements C1570b<Object> {
        /* renamed from: a */
        public void mo15615a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* renamed from: c.d.a.k.d$b */
    /* compiled from: Option */
    public interface C1570b<T> {
        /* renamed from: a */
        void mo15615a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public C1568d(@NonNull String str, @Nullable T t, @NonNull C1570b<T> bVar) {
        C1949i.m2561b(str);
        this.f918c = str;
        this.f916a = t;
        C1949i.m2563d(bVar);
        this.f917b = bVar;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C1568d<T> m1279a(@NonNull String str, @Nullable T t, @NonNull C1570b<T> bVar) {
        return new C1568d<>(str, t, bVar);
    }

    @NonNull
    /* renamed from: b */
    public static <T> C1570b<T> m1280b() {
        return f915e;
    }

    @NonNull
    /* renamed from: e */
    public static <T> C1568d<T> m1281e(@NonNull String str) {
        return new C1568d<>(str, (Object) null, m1280b());
    }

    @NonNull
    /* renamed from: f */
    public static <T> C1568d<T> m1282f(@NonNull String str, @NonNull T t) {
        return new C1568d<>(str, t, m1280b());
    }

    @Nullable
    /* renamed from: c */
    public T mo15609c() {
        return this.f916a;
    }

    @NonNull
    /* renamed from: d */
    public final byte[] mo15610d() {
        if (this.f919d == null) {
            this.f919d = this.f918c.getBytes(C1567c.f914a);
        }
        return this.f919d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1568d) {
            return this.f918c.equals(((C1568d) obj).f918c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo15612g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f917b.mo15615a(mo15610d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f918c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f918c + '\'' + '}';
    }
}
