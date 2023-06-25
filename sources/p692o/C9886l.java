package p692o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: o.l */
/* compiled from: ParameterHandler */
public abstract class C9886l<T> {

    /* renamed from: o.l$a */
    /* compiled from: ParameterHandler */
    public class C9887a extends C9886l<Iterable<T>> {
        public C9887a() {
        }

        /* renamed from: d */
        public void mo51284a(C9905n nVar, Iterable<T> iterable) {
            if (iterable != null) {
                for (T a : iterable) {
                    C9886l.this.mo51284a(nVar, a);
                }
            }
        }
    }

    /* renamed from: o.l$b */
    /* compiled from: ParameterHandler */
    public class C9888b extends C9886l<Object> {
        public C9888b() {
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C9886l.this.mo51284a(nVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: o.l$c */
    /* compiled from: ParameterHandler */
    public static final class C9889c<T> extends C9886l<T> {

        /* renamed from: a */
        public final Method f19165a;

        /* renamed from: b */
        public final int f19166b;

        /* renamed from: c */
        public final C9866f<T, RequestBody> f19167c;

        public C9889c(Method method, int i, C9866f<T, RequestBody> fVar) {
            this.f19165a = method;
            this.f19166b = i;
            this.f19167c = fVar;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            if (t != null) {
                try {
                    nVar.mo51306j(this.f19167c.mo51243a(t));
                } catch (IOException e) {
                    Method method = this.f19165a;
                    int i = this.f19166b;
                    throw C9916u.m26595q(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw C9916u.m26594p(this.f19165a, this.f19166b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: o.l$d */
    /* compiled from: ParameterHandler */
    public static final class C9890d<T> extends C9886l<T> {

        /* renamed from: a */
        public final String f19168a;

        /* renamed from: b */
        public final C9866f<T, String> f19169b;

        /* renamed from: c */
        public final boolean f19170c;

        public C9890d(String str, C9866f<T, String> fVar, boolean z) {
            C9916u.m26580b(str, "name == null");
            this.f19168a = str;
            this.f19169b = fVar;
            this.f19170c = z;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            String a;
            if (t != null && (a = this.f19169b.mo51243a(t)) != null) {
                nVar.mo51299a(this.f19168a, a, this.f19170c);
            }
        }
    }

    /* renamed from: o.l$e */
    /* compiled from: ParameterHandler */
    public static final class C9891e<T> extends C9886l<Map<String, T>> {

        /* renamed from: a */
        public final Method f19171a;

        /* renamed from: b */
        public final int f19172b;

        /* renamed from: c */
        public final C9866f<T, String> f19173c;

        /* renamed from: d */
        public final boolean f19174d;

        public C9891e(Method method, int i, C9866f<T, String> fVar, boolean z) {
            this.f19171a = method;
            this.f19172b = i;
            this.f19173c = fVar;
            this.f19174d = z;
        }

        /* renamed from: d */
        public void mo51284a(C9905n nVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f19173c.mo51243a(value);
                            if (a != null) {
                                nVar.mo51299a(str, a, this.f19174d);
                            } else {
                                Method method = this.f19171a;
                                int i = this.f19172b;
                                throw C9916u.m26594p(method, i, "Field map value '" + value + "' converted to null by " + this.f19173c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f19171a;
                            int i2 = this.f19172b;
                            throw C9916u.m26594p(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C9916u.m26594p(this.f19171a, this.f19172b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C9916u.m26594p(this.f19171a, this.f19172b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: o.l$f */
    /* compiled from: ParameterHandler */
    public static final class C9892f<T> extends C9886l<T> {

        /* renamed from: a */
        public final String f19175a;

        /* renamed from: b */
        public final C9866f<T, String> f19176b;

        public C9892f(String str, C9866f<T, String> fVar) {
            C9916u.m26580b(str, "name == null");
            this.f19175a = str;
            this.f19176b = fVar;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            String a;
            if (t != null && (a = this.f19176b.mo51243a(t)) != null) {
                nVar.mo51300b(this.f19175a, a);
            }
        }
    }

    /* renamed from: o.l$g */
    /* compiled from: ParameterHandler */
    public static final class C9893g<T> extends C9886l<T> {

        /* renamed from: a */
        public final Method f19177a;

        /* renamed from: b */
        public final int f19178b;

        /* renamed from: c */
        public final Headers f19179c;

        /* renamed from: d */
        public final C9866f<T, RequestBody> f19180d;

        public C9893g(Method method, int i, Headers headers, C9866f<T, RequestBody> fVar) {
            this.f19177a = method;
            this.f19178b = i;
            this.f19179c = headers;
            this.f19180d = fVar;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            if (t != null) {
                try {
                    nVar.mo51301c(this.f19179c, this.f19180d.mo51243a(t));
                } catch (IOException e) {
                    Method method = this.f19177a;
                    int i = this.f19178b;
                    throw C9916u.m26594p(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: o.l$h */
    /* compiled from: ParameterHandler */
    public static final class C9894h<T> extends C9886l<Map<String, T>> {

        /* renamed from: a */
        public final Method f19181a;

        /* renamed from: b */
        public final int f19182b;

        /* renamed from: c */
        public final C9866f<T, RequestBody> f19183c;

        /* renamed from: d */
        public final String f19184d;

        public C9894h(Method method, int i, C9866f<T, RequestBody> fVar, String str) {
            this.f19181a = method;
            this.f19182b = i;
            this.f19183c = fVar;
            this.f19184d = str;
        }

        /* renamed from: d */
        public void mo51284a(C9905n nVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            nVar.mo51301c(Headers.m26647of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f19184d), this.f19183c.mo51243a(value));
                        } else {
                            Method method = this.f19181a;
                            int i = this.f19182b;
                            throw C9916u.m26594p(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C9916u.m26594p(this.f19181a, this.f19182b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C9916u.m26594p(this.f19181a, this.f19182b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: o.l$i */
    /* compiled from: ParameterHandler */
    public static final class C9895i<T> extends C9886l<T> {

        /* renamed from: a */
        public final Method f19185a;

        /* renamed from: b */
        public final int f19186b;

        /* renamed from: c */
        public final String f19187c;

        /* renamed from: d */
        public final C9866f<T, String> f19188d;

        /* renamed from: e */
        public final boolean f19189e;

        public C9895i(Method method, int i, String str, C9866f<T, String> fVar, boolean z) {
            this.f19185a = method;
            this.f19186b = i;
            C9916u.m26580b(str, "name == null");
            this.f19187c = str;
            this.f19188d = fVar;
            this.f19189e = z;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            if (t != null) {
                nVar.mo51303e(this.f19187c, this.f19188d.mo51243a(t), this.f19189e);
                return;
            }
            Method method = this.f19185a;
            int i = this.f19186b;
            throw C9916u.m26594p(method, i, "Path parameter \"" + this.f19187c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: o.l$j */
    /* compiled from: ParameterHandler */
    public static final class C9896j<T> extends C9886l<T> {

        /* renamed from: a */
        public final String f19190a;

        /* renamed from: b */
        public final C9866f<T, String> f19191b;

        /* renamed from: c */
        public final boolean f19192c;

        public C9896j(String str, C9866f<T, String> fVar, boolean z) {
            C9916u.m26580b(str, "name == null");
            this.f19190a = str;
            this.f19191b = fVar;
            this.f19192c = z;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            String a;
            if (t != null && (a = this.f19191b.mo51243a(t)) != null) {
                nVar.mo51304f(this.f19190a, a, this.f19192c);
            }
        }
    }

    /* renamed from: o.l$k */
    /* compiled from: ParameterHandler */
    public static final class C9897k<T> extends C9886l<Map<String, T>> {

        /* renamed from: a */
        public final Method f19193a;

        /* renamed from: b */
        public final int f19194b;

        /* renamed from: c */
        public final C9866f<T, String> f19195c;

        /* renamed from: d */
        public final boolean f19196d;

        public C9897k(Method method, int i, C9866f<T, String> fVar, boolean z) {
            this.f19193a = method;
            this.f19194b = i;
            this.f19195c = fVar;
            this.f19196d = z;
        }

        /* renamed from: d */
        public void mo51284a(C9905n nVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f19195c.mo51243a(value);
                            if (a != null) {
                                nVar.mo51304f(str, a, this.f19196d);
                            } else {
                                Method method = this.f19193a;
                                int i = this.f19194b;
                                throw C9916u.m26594p(method, i, "Query map value '" + value + "' converted to null by " + this.f19195c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f19193a;
                            int i2 = this.f19194b;
                            throw C9916u.m26594p(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C9916u.m26594p(this.f19193a, this.f19194b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C9916u.m26594p(this.f19193a, this.f19194b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: o.l$l */
    /* compiled from: ParameterHandler */
    public static final class C9898l<T> extends C9886l<T> {

        /* renamed from: a */
        public final C9866f<T, String> f19197a;

        /* renamed from: b */
        public final boolean f19198b;

        public C9898l(C9866f<T, String> fVar, boolean z) {
            this.f19197a = fVar;
            this.f19198b = z;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, T t) {
            if (t != null) {
                nVar.mo51304f(this.f19197a.mo51243a(t), (String) null, this.f19198b);
            }
        }
    }

    /* renamed from: o.l$m */
    /* compiled from: ParameterHandler */
    public static final class C9899m extends C9886l<MultipartBody.Part> {

        /* renamed from: a */
        public static final C9899m f19199a = new C9899m();

        /* renamed from: d */
        public void mo51284a(C9905n nVar, MultipartBody.Part part) {
            if (part != null) {
                nVar.mo51302d(part);
            }
        }
    }

    /* renamed from: o.l$n */
    /* compiled from: ParameterHandler */
    public static final class C9900n extends C9886l<Object> {

        /* renamed from: a */
        public final Method f19200a;

        /* renamed from: b */
        public final int f19201b;

        public C9900n(Method method, int i) {
            this.f19200a = method;
            this.f19201b = i;
        }

        /* renamed from: a */
        public void mo51284a(C9905n nVar, Object obj) {
            if (obj != null) {
                nVar.mo51307k(obj);
                return;
            }
            throw C9916u.m26594p(this.f19200a, this.f19201b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract void mo51284a(C9905n nVar, T t);

    /* renamed from: b */
    public final C9886l<Object> mo51285b() {
        return new C9888b();
    }

    /* renamed from: c */
    public final C9886l<Iterable<T>> mo51286c() {
        return new C9887a();
    }
}
