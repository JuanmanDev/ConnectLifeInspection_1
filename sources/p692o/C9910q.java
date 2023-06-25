package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p692o.C9848a;
import p692o.C9856c;
import p692o.C9866f;

/* renamed from: o.q */
/* compiled from: Retrofit */
public final class C9910q {

    /* renamed from: a */
    public final Map<Method, C9913r<?>> f19258a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Call.Factory f19259b;

    /* renamed from: c */
    public final HttpUrl f19260c;

    /* renamed from: d */
    public final List<C9866f.C9867a> f19261d;

    /* renamed from: e */
    public final List<C9856c.C9857a> f19262e;

    /* renamed from: f */
    public final boolean f19263f;

    /* renamed from: o.q$a */
    /* compiled from: Retrofit */
    public class C9911a implements InvocationHandler {

        /* renamed from: a */
        public final C9901m f19264a = C9901m.m26513f();

        /* renamed from: b */
        public final Object[] f19265b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f19266c;

        public C9911a(Class cls) {
            this.f19266c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f19264a.mo51297h(method)) {
                return this.f19264a.mo51296g(method, this.f19266c, obj, objArr);
            }
            C9913r<?> d = C9910q.this.mo51325d(method);
            if (objArr == null) {
                objArr = this.f19265b;
            }
            return d.mo51269a(objArr);
        }
    }

    public C9910q(Call.Factory factory, HttpUrl httpUrl, List<C9866f.C9867a> list, List<C9856c.C9857a> list2, Executor executor, boolean z) {
        this.f19259b = factory;
        this.f19260c = httpUrl;
        this.f19261d = list;
        this.f19262e = list2;
        this.f19263f = z;
    }

    /* renamed from: a */
    public C9856c<?, ?> mo51322a(Type type, Annotation[] annotationArr) {
        return mo51326e((C9856c.C9857a) null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T mo51323b(Class<T> cls) {
        C9916u.m26600v(cls);
        if (this.f19263f) {
            mo51324c(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C9911a(cls));
    }

    /* renamed from: c */
    public final void mo51324c(Class<?> cls) {
        C9901m f = C9901m.m26513f();
        for (Method method : cls.getDeclaredMethods()) {
            if (!f.mo51297h(method) && !Modifier.isStatic(method.getModifiers())) {
                mo51325d(method);
            }
        }
    }

    /* renamed from: d */
    public C9913r<?> mo51325d(Method method) {
        C9913r<?> rVar;
        C9913r<?> rVar2 = this.f19258a.get(method);
        if (rVar2 != null) {
            return rVar2;
        }
        synchronized (this.f19258a) {
            rVar = this.f19258a.get(method);
            if (rVar == null) {
                rVar = C9913r.m26576b(this, method);
                this.f19258a.put(method, rVar);
            }
        }
        return rVar;
    }

    /* renamed from: e */
    public C9856c<?, ?> mo51326e(C9856c.C9857a aVar, Type type, Annotation[] annotationArr) {
        C9916u.m26580b(type, "returnType == null");
        C9916u.m26580b(annotationArr, "annotations == null");
        int indexOf = this.f19262e.indexOf(aVar) + 1;
        int size = this.f19262e.size();
        for (int i = indexOf; i < size; i++) {
            C9856c<?, ?> a = this.f19262e.get(i).mo51258a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f19262e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f19262e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f19262e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> C9866f<T, RequestBody> mo51327f(C9866f.C9867a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C9916u.m26580b(type, "type == null");
        C9916u.m26580b(annotationArr, "parameterAnnotations == null");
        C9916u.m26580b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f19261d.indexOf(aVar) + 1;
        int size = this.f19261d.size();
        for (int i = indexOf; i < size; i++) {
            C9866f<?, RequestBody> c = this.f19261d.get(i).mo51241c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f19261d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f19261d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f19261d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public <T> C9866f<ResponseBody, T> mo51328g(C9866f.C9867a aVar, Type type, Annotation[] annotationArr) {
        C9916u.m26580b(type, "type == null");
        C9916u.m26580b(annotationArr, "annotations == null");
        int indexOf = this.f19261d.indexOf(aVar) + 1;
        int size = this.f19261d.size();
        for (int i = indexOf; i < size; i++) {
            C9866f<ResponseBody, ?> d = this.f19261d.get(i).mo51242d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f19261d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f19261d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f19261d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> C9866f<T, RequestBody> mo51329h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo51327f((C9866f.C9867a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: i */
    public <T> C9866f<ResponseBody, T> mo51330i(Type type, Annotation[] annotationArr) {
        return mo51328g((C9866f.C9867a) null, type, annotationArr);
    }

    /* renamed from: j */
    public <T> C9866f<T, String> mo51331j(Type type, Annotation[] annotationArr) {
        C9916u.m26580b(type, "type == null");
        C9916u.m26580b(annotationArr, "annotations == null");
        int size = this.f19261d.size();
        for (int i = 0; i < size; i++) {
            C9866f<?, String> e = this.f19261d.get(i).mo51265e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C9848a.C9852d.f19115a;
    }

    /* renamed from: o.q$b */
    /* compiled from: Retrofit */
    public static final class C9912b {

        /* renamed from: a */
        public final C9901m f19268a;

        /* renamed from: b */
        public Call.Factory f19269b;

        /* renamed from: c */
        public HttpUrl f19270c;

        /* renamed from: d */
        public final List<C9866f.C9867a> f19271d;

        /* renamed from: e */
        public final List<C9856c.C9857a> f19272e;

        /* renamed from: f */
        public Executor f19273f;

        /* renamed from: g */
        public boolean f19274g;

        public C9912b(C9901m mVar) {
            this.f19271d = new ArrayList();
            this.f19272e = new ArrayList();
            this.f19268a = mVar;
        }

        /* renamed from: a */
        public C9912b mo51333a(C9856c.C9857a aVar) {
            List<C9856c.C9857a> list = this.f19272e;
            C9916u.m26580b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C9912b mo51334b(C9866f.C9867a aVar) {
            List<C9866f.C9867a> list = this.f19271d;
            C9916u.m26580b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C9912b mo51335c(String str) {
            C9916u.m26580b(str, "baseUrl == null");
            mo51336d(HttpUrl.get(str));
            return this;
        }

        /* renamed from: d */
        public C9912b mo51336d(HttpUrl httpUrl) {
            C9916u.m26580b(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f19270c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: e */
        public C9910q mo51337e() {
            if (this.f19270c != null) {
                Call.Factory factory = this.f19269b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f19273f;
                if (executor == null) {
                    executor = this.f19268a.mo51293b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f19272e);
                arrayList.addAll(this.f19268a.mo51292a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f19271d.size() + 1 + this.f19268a.mo51295d());
                arrayList2.add(new C9848a());
                arrayList2.addAll(this.f19271d);
                arrayList2.addAll(this.f19268a.mo51294c());
                return new C9910q(factory2, this.f19270c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f19274g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public C9912b mo51338f(Call.Factory factory) {
            C9916u.m26580b(factory, "factory == null");
            this.f19269b = factory;
            return this;
        }

        /* renamed from: g */
        public C9912b mo51339g(OkHttpClient okHttpClient) {
            C9916u.m26580b(okHttpClient, "client == null");
            mo51338f(okHttpClient);
            return this;
        }

        public C9912b() {
            this(C9901m.m26513f());
        }
    }
}
