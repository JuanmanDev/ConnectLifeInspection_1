package p040c.p077d.p078a.p081k.p089k;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.d.a.k.k.j */
/* compiled from: LazyHeaders */
public final class C1746j implements C1744h {

    /* renamed from: b */
    public final Map<String, List<C1745i>> f1292b;

    /* renamed from: c */
    public volatile Map<String, String> f1293c;

    /* renamed from: c.d.a.k.k.j$a */
    /* compiled from: LazyHeaders */
    public static final class C1747a {

        /* renamed from: b */
        public static final String f1294b = m1846b();

        /* renamed from: c */
        public static final Map<String, List<C1745i>> f1295c;

        /* renamed from: a */
        public Map<String, List<C1745i>> f1296a = f1295c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f1294b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1748b(f1294b)));
            }
            f1295c = Collections.unmodifiableMap(hashMap);
        }

        @VisibleForTesting
        /* renamed from: b */
        public static String m1846b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C1746j mo16016a() {
            return new C1746j(this.f1296a);
        }
    }

    /* renamed from: c.d.a.k.k.j$b */
    /* compiled from: LazyHeaders */
    public static final class C1748b implements C1745i {
        @NonNull

        /* renamed from: a */
        public final String f1297a;

        public C1748b(@NonNull String str) {
            this.f1297a = str;
        }

        /* renamed from: a */
        public String mo16010a() {
            return this.f1297a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1748b) {
                return this.f1297a.equals(((C1748b) obj).f1297a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1297a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f1297a + '\'' + '}';
        }
    }

    public C1746j(Map<String, List<C1745i>> map) {
        this.f1292b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Map<String, String> mo16009a() {
        if (this.f1293c == null) {
            synchronized (this) {
                if (this.f1293c == null) {
                    this.f1293c = Collections.unmodifiableMap(mo16012c());
                }
            }
        }
        return this.f1293c;
    }

    @NonNull
    /* renamed from: b */
    public final String mo16011b(@NonNull List<C1745i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo16010a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map<String, String> mo16012c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f1292b.entrySet()) {
            String b = mo16011b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1746j) {
            return this.f1292b.equals(((C1746j) obj).f1292b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1292b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f1292b + '}';
    }
}
