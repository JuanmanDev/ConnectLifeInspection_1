package p040c.p200q.p363c.p385q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.c.q.c */
/* compiled from: FieldDescriptor */
public final class C6709c {

    /* renamed from: a */
    public final String f12840a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f12841b;

    /* renamed from: c.q.c.q.c$b */
    /* compiled from: FieldDescriptor */
    public static final class C6711b {

        /* renamed from: a */
        public final String f12842a;

        /* renamed from: b */
        public Map<Class<?>, Object> f12843b = null;

        public C6711b(String str) {
            this.f12842a = str;
        }

        @NonNull
        /* renamed from: a */
        public C6709c mo31341a() {
            Map map;
            String str = this.f12842a;
            if (this.f12843b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f12843b));
            }
            return new C6709c(str, map);
        }

        @NonNull
        /* renamed from: b */
        public <T extends Annotation> C6711b mo31342b(@NonNull T t) {
            if (this.f12843b == null) {
                this.f12843b = new HashMap();
            }
            this.f12843b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C6711b m18981a(@NonNull String str) {
        return new C6711b(str);
    }

    @NonNull
    /* renamed from: d */
    public static C6709c m18982d(@NonNull String str) {
        return new C6709c(str, Collections.emptyMap());
    }

    @NonNull
    /* renamed from: b */
    public String mo31336b() {
        return this.f12840a;
    }

    @Nullable
    /* renamed from: c */
    public <T extends Annotation> T mo31337c(@NonNull Class<T> cls) {
        return (Annotation) this.f12841b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6709c)) {
            return false;
        }
        C6709c cVar = (C6709c) obj;
        if (!this.f12840a.equals(cVar.f12840a) || !this.f12841b.equals(cVar.f12841b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f12840a.hashCode() * 31) + this.f12841b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f12840a + ", properties=" + this.f12841b.values() + "}";
    }

    public C6709c(String str, Map<Class<?>, Object> map) {
        this.f12840a = str;
        this.f12841b = map;
    }
}
