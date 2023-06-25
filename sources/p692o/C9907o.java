package p692o;

import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.stetho.server.http.HttpHeaders;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import p692o.C9886l;
import p692o.p698x.C9945a;
import p692o.p698x.C9946b;
import p692o.p698x.C9947c;
import p692o.p698x.C9948d;
import p692o.p698x.C9949e;
import p692o.p698x.C9950f;
import p692o.p698x.C9951g;
import p692o.p698x.C9952h;
import p692o.p698x.C9953i;
import p692o.p698x.C9954j;
import p692o.p698x.C9955k;
import p692o.p698x.C9956l;
import p692o.p698x.C9957m;
import p692o.p698x.C9958n;
import p692o.p698x.C9959o;
import p692o.p698x.C9960p;
import p692o.p698x.C9961q;
import p692o.p698x.C9962r;
import p692o.p698x.C9963s;
import p692o.p698x.C9964t;
import p692o.p698x.C9965u;
import p692o.p698x.C9967w;

/* renamed from: o.o */
/* compiled from: RequestFactory */
public final class C9907o {

    /* renamed from: a */
    public final Method f19219a;

    /* renamed from: b */
    public final HttpUrl f19220b;

    /* renamed from: c */
    public final String f19221c;

    /* renamed from: d */
    public final String f19222d;

    /* renamed from: e */
    public final Headers f19223e;

    /* renamed from: f */
    public final MediaType f19224f;

    /* renamed from: g */
    public final boolean f19225g;

    /* renamed from: h */
    public final boolean f19226h;

    /* renamed from: i */
    public final boolean f19227i;

    /* renamed from: j */
    public final C9886l<?>[] f19228j;

    /* renamed from: k */
    public final boolean f19229k;

    /* renamed from: o.o$a */
    /* compiled from: RequestFactory */
    public static final class C9908a {

        /* renamed from: x */
        public static final Pattern f19230x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f19231y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C9910q f19232a;

        /* renamed from: b */
        public final Method f19233b;

        /* renamed from: c */
        public final Annotation[] f19234c;

        /* renamed from: d */
        public final Annotation[][] f19235d;

        /* renamed from: e */
        public final Type[] f19236e;

        /* renamed from: f */
        public boolean f19237f;

        /* renamed from: g */
        public boolean f19238g;

        /* renamed from: h */
        public boolean f19239h;

        /* renamed from: i */
        public boolean f19240i;

        /* renamed from: j */
        public boolean f19241j;

        /* renamed from: k */
        public boolean f19242k;

        /* renamed from: l */
        public boolean f19243l;

        /* renamed from: m */
        public boolean f19244m;

        /* renamed from: n */
        public String f19245n;

        /* renamed from: o */
        public boolean f19246o;

        /* renamed from: p */
        public boolean f19247p;

        /* renamed from: q */
        public boolean f19248q;

        /* renamed from: r */
        public String f19249r;

        /* renamed from: s */
        public Headers f19250s;

        /* renamed from: t */
        public MediaType f19251t;

        /* renamed from: u */
        public Set<String> f19252u;

        /* renamed from: v */
        public C9886l<?>[] f19253v;

        /* renamed from: w */
        public boolean f19254w;

        public C9908a(C9910q qVar, Method method) {
            this.f19232a = qVar;
            this.f19233b = method;
            this.f19234c = method.getAnnotations();
            this.f19236e = method.getGenericParameterTypes();
            this.f19235d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m26543a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set<String> m26544h(String str) {
            Matcher matcher = f19230x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C9907o mo51309b() {
            for (Annotation e : this.f19234c) {
                mo51312e(e);
            }
            if (this.f19245n != null) {
                if (!this.f19246o) {
                    if (this.f19248q) {
                        throw C9916u.m26592n(this.f19233b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f19247p) {
                        throw C9916u.m26592n(this.f19233b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f19235d.length;
                this.f19253v = new C9886l[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C9886l<?>[] lVarArr = this.f19253v;
                    Type type = this.f19236e[i2];
                    Annotation[] annotationArr = this.f19235d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    lVarArr[i2] = mo51313f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f19249r == null && !this.f19244m) {
                    throw C9916u.m26592n(this.f19233b, "Missing either @%s URL or @Url parameter.", this.f19245n);
                } else if (!this.f19247p && !this.f19248q && !this.f19246o && this.f19239h) {
                    throw C9916u.m26592n(this.f19233b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f19247p && !this.f19237f) {
                    throw C9916u.m26592n(this.f19233b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f19248q || this.f19238g) {
                    return new C9907o(this);
                } else {
                    throw C9916u.m26592n(this.f19233b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw C9916u.m26592n(this.f19233b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: c */
        public final Headers mo51310c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C9916u.m26592n(this.f19233b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    try {
                        this.f19251t = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw C9916u.m26593o(this.f19233b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        public final void mo51311d(String str, String str2, boolean z) {
            String str3 = this.f19245n;
            if (str3 == null) {
                this.f19245n = str;
                this.f19246o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f19230x.matcher(substring).find()) {
                            throw C9916u.m26592n(this.f19233b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f19249r = str2;
                    this.f19252u = m26544h(str2);
                    return;
                }
                return;
            }
            throw C9916u.m26592n(this.f19233b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        public final void mo51312e(Annotation annotation) {
            if (annotation instanceof C9946b) {
                mo51311d("DELETE", ((C9946b) annotation).value(), false);
            } else if (annotation instanceof C9950f) {
                mo51311d(ShareTarget.METHOD_GET, ((C9950f) annotation).value(), false);
            } else if (annotation instanceof C9951g) {
                mo51311d("HEAD", ((C9951g) annotation).value(), false);
            } else if (annotation instanceof C9957m) {
                mo51311d("PATCH", ((C9957m) annotation).value(), true);
            } else if (annotation instanceof C9958n) {
                mo51311d(ShareTarget.METHOD_POST, ((C9958n) annotation).value(), true);
            } else if (annotation instanceof C9959o) {
                mo51311d("PUT", ((C9959o) annotation).value(), true);
            } else if (annotation instanceof C9956l) {
                mo51311d("OPTIONS", ((C9956l) annotation).value(), false);
            } else if (annotation instanceof C9952h) {
                C9952h hVar = (C9952h) annotation;
                mo51311d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof C9954j) {
                String[] value = ((C9954j) annotation).value();
                if (value.length != 0) {
                    this.f19250s = mo51310c(value);
                    return;
                }
                throw C9916u.m26592n(this.f19233b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof C9955k) {
                if (!this.f19247p) {
                    this.f19248q = true;
                    return;
                }
                throw C9916u.m26592n(this.f19233b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof C9949e)) {
            } else {
                if (!this.f19248q) {
                    this.f19247p = true;
                    return;
                }
                throw C9916u.m26592n(this.f19233b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        public final C9886l<?> mo51313f(int i, Type type, Annotation[] annotationArr, boolean z) {
            C9886l<?> lVar;
            if (annotationArr != null) {
                lVar = null;
                for (Annotation g : annotationArr) {
                    C9886l<?> g2 = mo51314g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (lVar == null) {
                            lVar = g2;
                        } else {
                            throw C9916u.m26594p(this.f19233b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                lVar = null;
            }
            if (lVar != null) {
                return lVar;
            }
            if (z) {
                try {
                    if (C9916u.m26587i(type) == Continuation.class) {
                        this.f19254w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C9916u.m26594p(this.f19233b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final C9886l<?> mo51314g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<MultipartBody.Part> cls2 = MultipartBody.Part.class;
            if (annotation instanceof C9967w) {
                mo51316j(i, type);
                if (this.f19244m) {
                    throw C9916u.m26594p(this.f19233b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f19240i) {
                    throw C9916u.m26594p(this.f19233b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f19241j) {
                    throw C9916u.m26594p(this.f19233b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f19242k) {
                    throw C9916u.m26594p(this.f19233b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f19243l) {
                    throw C9916u.m26594p(this.f19233b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f19249r == null) {
                    this.f19244m = true;
                    if (type == HttpUrl.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C9886l.C9900n(this.f19233b, i);
                    }
                    throw C9916u.m26594p(this.f19233b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw C9916u.m26594p(this.f19233b, i, "@Url cannot be used with @%s URL", this.f19245n);
                }
            } else if (annotation instanceof C9962r) {
                mo51316j(i, type);
                if (this.f19241j) {
                    throw C9916u.m26594p(this.f19233b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f19242k) {
                    throw C9916u.m26594p(this.f19233b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f19243l) {
                    throw C9916u.m26594p(this.f19233b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f19244m) {
                    throw C9916u.m26594p(this.f19233b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f19249r != null) {
                    this.f19240i = true;
                    C9962r rVar = (C9962r) annotation;
                    String value = rVar.value();
                    mo51315i(i, value);
                    return new C9886l.C9895i(this.f19233b, i, value, this.f19232a.mo51331j(type, annotationArr), rVar.encoded());
                } else {
                    throw C9916u.m26594p(this.f19233b, i, "@Path can only be used with relative url on @%s", this.f19245n);
                }
            } else if (annotation instanceof C9963s) {
                mo51316j(i, type);
                C9963s sVar = (C9963s) annotation;
                String value2 = sVar.value();
                boolean encoded = sVar.encoded();
                Class<?> i2 = C9916u.m26587i(type);
                this.f19241j = true;
                if (Iterable.class.isAssignableFrom(i2)) {
                    if (type instanceof ParameterizedType) {
                        return new C9886l.C9896j(value2, this.f19232a.mo51331j(C9916u.m26586h(0, (ParameterizedType) type), annotationArr), encoded).mo51286c();
                    }
                    Method method = this.f19233b;
                    throw C9916u.m26594p(method, i, i2.getSimpleName() + " must include generic type (e.g., " + i2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i2.isArray()) {
                    return new C9886l.C9896j(value2, this.f19232a.mo51331j(type, annotationArr), encoded);
                } else {
                    return new C9886l.C9896j(value2, this.f19232a.mo51331j(m26543a(i2.getComponentType()), annotationArr), encoded).mo51285b();
                }
            } else if (annotation instanceof C9965u) {
                mo51316j(i, type);
                boolean encoded2 = ((C9965u) annotation).encoded();
                Class<?> i3 = C9916u.m26587i(type);
                this.f19242k = true;
                if (Iterable.class.isAssignableFrom(i3)) {
                    if (type instanceof ParameterizedType) {
                        return new C9886l.C9898l(this.f19232a.mo51331j(C9916u.m26586h(0, (ParameterizedType) type), annotationArr), encoded2).mo51286c();
                    }
                    Method method2 = this.f19233b;
                    throw C9916u.m26594p(method2, i, i3.getSimpleName() + " must include generic type (e.g., " + i3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i3.isArray()) {
                    return new C9886l.C9898l(this.f19232a.mo51331j(type, annotationArr), encoded2);
                } else {
                    return new C9886l.C9898l(this.f19232a.mo51331j(m26543a(i3.getComponentType()), annotationArr), encoded2).mo51285b();
                }
            } else if (annotation instanceof C9964t) {
                mo51316j(i, type);
                Class<?> i4 = C9916u.m26587i(type);
                this.f19243l = true;
                if (Map.class.isAssignableFrom(i4)) {
                    Type j = C9916u.m26588j(type, i4, Map.class);
                    if (j instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) j;
                        Type h = C9916u.m26586h(0, parameterizedType);
                        if (cls == h) {
                            return new C9886l.C9897k(this.f19233b, i, this.f19232a.mo51331j(C9916u.m26586h(1, parameterizedType), annotationArr), ((C9964t) annotation).encoded());
                        }
                        Method method3 = this.f19233b;
                        throw C9916u.m26594p(method3, i, "@QueryMap keys must be of type String: " + h, new Object[0]);
                    }
                    throw C9916u.m26594p(this.f19233b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C9916u.m26594p(this.f19233b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C9953i) {
                mo51316j(i, type);
                String value3 = ((C9953i) annotation).value();
                Class<?> i5 = C9916u.m26587i(type);
                if (Iterable.class.isAssignableFrom(i5)) {
                    if (type instanceof ParameterizedType) {
                        return new C9886l.C9892f(value3, this.f19232a.mo51331j(C9916u.m26586h(0, (ParameterizedType) type), annotationArr)).mo51286c();
                    }
                    Method method4 = this.f19233b;
                    throw C9916u.m26594p(method4, i, i5.getSimpleName() + " must include generic type (e.g., " + i5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i5.isArray()) {
                    return new C9886l.C9892f(value3, this.f19232a.mo51331j(type, annotationArr));
                } else {
                    return new C9886l.C9892f(value3, this.f19232a.mo51331j(m26543a(i5.getComponentType()), annotationArr)).mo51285b();
                }
            } else if (annotation instanceof C9947c) {
                mo51316j(i, type);
                if (this.f19247p) {
                    C9947c cVar = (C9947c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f19237f = true;
                    Class<?> i6 = C9916u.m26587i(type);
                    if (Iterable.class.isAssignableFrom(i6)) {
                        if (type instanceof ParameterizedType) {
                            return new C9886l.C9890d(value4, this.f19232a.mo51331j(C9916u.m26586h(0, (ParameterizedType) type), annotationArr), encoded3).mo51286c();
                        }
                        Method method5 = this.f19233b;
                        throw C9916u.m26594p(method5, i, i6.getSimpleName() + " must include generic type (e.g., " + i6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!i6.isArray()) {
                        return new C9886l.C9890d(value4, this.f19232a.mo51331j(type, annotationArr), encoded3);
                    } else {
                        return new C9886l.C9890d(value4, this.f19232a.mo51331j(m26543a(i6.getComponentType()), annotationArr), encoded3).mo51285b();
                    }
                } else {
                    throw C9916u.m26594p(this.f19233b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C9948d) {
                mo51316j(i, type);
                if (this.f19247p) {
                    Class<?> i7 = C9916u.m26587i(type);
                    if (Map.class.isAssignableFrom(i7)) {
                        Type j2 = C9916u.m26588j(type, i7, Map.class);
                        if (j2 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) j2;
                            Type h2 = C9916u.m26586h(0, parameterizedType2);
                            if (cls == h2) {
                                C9866f j3 = this.f19232a.mo51331j(C9916u.m26586h(1, parameterizedType2), annotationArr);
                                this.f19237f = true;
                                return new C9886l.C9891e(this.f19233b, i, j3, ((C9948d) annotation).encoded());
                            }
                            Method method6 = this.f19233b;
                            throw C9916u.m26594p(method6, i, "@FieldMap keys must be of type String: " + h2, new Object[0]);
                        }
                        throw C9916u.m26594p(this.f19233b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C9916u.m26594p(this.f19233b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C9916u.m26594p(this.f19233b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C9960p) {
                mo51316j(i, type);
                if (this.f19248q) {
                    C9960p pVar = (C9960p) annotation;
                    this.f19238g = true;
                    String value5 = pVar.value();
                    Class<?> i8 = C9916u.m26587i(type);
                    if (!value5.isEmpty()) {
                        Headers of = Headers.m26647of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", pVar.encoding());
                        if (Iterable.class.isAssignableFrom(i8)) {
                            if (type instanceof ParameterizedType) {
                                Type h3 = C9916u.m26586h(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(C9916u.m26587i(h3))) {
                                    return new C9886l.C9893g(this.f19233b, i, of, this.f19232a.mo51329h(h3, annotationArr, this.f19234c)).mo51286c();
                                }
                                throw C9916u.m26594p(this.f19233b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            Method method7 = this.f19233b;
                            throw C9916u.m26594p(method7, i, i8.getSimpleName() + " must include generic type (e.g., " + i8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (i8.isArray()) {
                            Class<?> a = m26543a(i8.getComponentType());
                            if (!cls2.isAssignableFrom(a)) {
                                return new C9886l.C9893g(this.f19233b, i, of, this.f19232a.mo51329h(a, annotationArr, this.f19234c)).mo51285b();
                            }
                            throw C9916u.m26594p(this.f19233b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(i8)) {
                            return new C9886l.C9893g(this.f19233b, i, of, this.f19232a.mo51329h(type, annotationArr, this.f19234c));
                        } else {
                            throw C9916u.m26594p(this.f19233b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(i8)) {
                        if (!(type instanceof ParameterizedType)) {
                            Method method8 = this.f19233b;
                            throw C9916u.m26594p(method8, i, i8.getSimpleName() + " must include generic type (e.g., " + i8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(C9916u.m26587i(C9916u.m26586h(0, (ParameterizedType) type)))) {
                            return C9886l.C9899m.f19199a.mo51286c();
                        } else {
                            throw C9916u.m26594p(this.f19233b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (i8.isArray()) {
                        if (cls2.isAssignableFrom(i8.getComponentType())) {
                            return C9886l.C9899m.f19199a.mo51285b();
                        }
                        throw C9916u.m26594p(this.f19233b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(i8)) {
                        return C9886l.C9899m.f19199a;
                    } else {
                        throw C9916u.m26594p(this.f19233b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw C9916u.m26594p(this.f19233b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof C9961q) {
                mo51316j(i, type);
                if (this.f19248q) {
                    this.f19238g = true;
                    Class<?> i9 = C9916u.m26587i(type);
                    if (Map.class.isAssignableFrom(i9)) {
                        Type j4 = C9916u.m26588j(type, i9, Map.class);
                        if (j4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) j4;
                            Type h4 = C9916u.m26586h(0, parameterizedType3);
                            if (cls == h4) {
                                Type h5 = C9916u.m26586h(1, parameterizedType3);
                                if (!cls2.isAssignableFrom(C9916u.m26587i(h5))) {
                                    return new C9886l.C9894h(this.f19233b, i, this.f19232a.mo51329h(h5, annotationArr, this.f19234c), ((C9961q) annotation).encoding());
                                }
                                throw C9916u.m26594p(this.f19233b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            Method method9 = this.f19233b;
                            throw C9916u.m26594p(method9, i, "@PartMap keys must be of type String: " + h4, new Object[0]);
                        }
                        throw C9916u.m26594p(this.f19233b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C9916u.m26594p(this.f19233b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C9916u.m26594p(this.f19233b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C9945a)) {
                return null;
            } else {
                mo51316j(i, type);
                if (this.f19247p || this.f19248q) {
                    throw C9916u.m26594p(this.f19233b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f19239h) {
                    try {
                        C9866f h6 = this.f19232a.mo51329h(type, annotationArr, this.f19234c);
                        this.f19239h = true;
                        return new C9886l.C9889c(this.f19233b, i, h6);
                    } catch (RuntimeException e) {
                        throw C9916u.m26595q(this.f19233b, e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw C9916u.m26594p(this.f19233b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: i */
        public final void mo51315i(int i, String str) {
            if (!f19231y.matcher(str).matches()) {
                throw C9916u.m26594p(this.f19233b, i, "@Path parameter name must match %s. Found: %s", f19230x.pattern(), str);
            } else if (!this.f19252u.contains(str)) {
                throw C9916u.m26594p(this.f19233b, i, "URL \"%s\" does not contain \"{%s}\".", this.f19249r, str);
            }
        }

        /* renamed from: j */
        public final void mo51316j(int i, Type type) {
            if (C9916u.m26589k(type)) {
                throw C9916u.m26594p(this.f19233b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C9907o(C9908a aVar) {
        this.f19219a = aVar.f19233b;
        this.f19220b = aVar.f19232a.f19260c;
        this.f19221c = aVar.f19245n;
        this.f19222d = aVar.f19249r;
        this.f19223e = aVar.f19250s;
        this.f19224f = aVar.f19251t;
        this.f19225g = aVar.f19246o;
        this.f19226h = aVar.f19247p;
        this.f19227i = aVar.f19248q;
        this.f19228j = aVar.f19253v;
        this.f19229k = aVar.f19254w;
    }

    /* renamed from: b */
    public static C9907o m26541b(C9910q qVar, Method method) {
        return new C9908a(qVar, method).mo51309b();
    }

    /* renamed from: a */
    public Request mo51308a(Object[] objArr) {
        C9886l<?>[] lVarArr = this.f19228j;
        int length = objArr.length;
        if (length == lVarArr.length) {
            C9905n nVar = new C9905n(this.f19221c, this.f19220b, this.f19222d, this.f19223e, this.f19224f, this.f19225g, this.f19226h, this.f19227i);
            if (this.f19229k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                lVarArr[i].mo51284a(nVar, objArr[i]);
            }
            return nVar.mo51305i().tag(C9878i.class, new C9878i(this.f19219a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + lVarArr.length + ")");
    }
}
