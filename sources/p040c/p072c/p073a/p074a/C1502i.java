package p040c.p072c.p073a.p074a;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.c.a.a.i */
/* compiled from: GsonUtils */
public final class C1502i {

    /* renamed from: a */
    public static final Map<String, Gson> f684a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Gson m921a() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    /* renamed from: b */
    public static <T> T m922b(@NonNull Gson gson, String str, @NonNull Class<T> cls) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (cls != null) {
            return gson.fromJson(str, cls);
        } else {
            throw new NullPointerException("Argument 'type' of type Class<T> (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: c */
    public static <T> T m923c(@NonNull Gson gson, String str, @NonNull Type type) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (type != null) {
            return gson.fromJson(str, type);
        } else {
            throw new NullPointerException("Argument 'type' of type Type (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: d */
    public static <T> T m924d(String str, @NonNull Class<T> cls) {
        if (cls != null) {
            return m922b(m926f(), str, cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: e */
    public static <T> T m925e(String str, @NonNull Type type) {
        if (type != null) {
            return m923c(m926f(), str, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: f */
    public static Gson m926f() {
        Gson gson = f684a.get("delegateGson");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = f684a.get("defaultGson");
        if (gson2 != null) {
            return gson2;
        }
        Gson a = m921a();
        f684a.put("defaultGson", a);
        return a;
    }

    /* renamed from: g */
    public static Gson m927g() {
        Gson gson = f684a.get("logUtilsGson");
        if (gson != null) {
            return gson;
        }
        Gson create = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        f684a.put("logUtilsGson", create);
        return create;
    }

    /* renamed from: h */
    public static String m928h(@NonNull Gson gson, Object obj) {
        if (gson != null) {
            return gson.toJson(obj);
        }
        throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: i */
    public static String m929i(@NonNull Gson gson, Object obj, @NonNull Type type) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        } else if (type != null) {
            return gson.toJson(obj, type);
        } else {
            throw new NullPointerException("Argument 'typeOfSrc' of type Type (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* renamed from: j */
    public static String m930j(Object obj) {
        return m928h(m926f(), obj);
    }

    /* renamed from: k */
    public static String m931k(Object obj, @NonNull Type type) {
        if (type != null) {
            return m929i(m926f(), obj, type);
        }
        throw new NullPointerException("Argument 'typeOfSrc' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
