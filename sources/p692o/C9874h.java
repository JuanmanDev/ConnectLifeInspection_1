package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p692o.C9916u;
import retrofit2.KotlinExtensions;

/* renamed from: o.h */
/* compiled from: HttpServiceMethod */
public abstract class C9874h<ResponseT, ReturnT> extends C9913r<ReturnT> {

    /* renamed from: a */
    public final C9907o f19136a;

    /* renamed from: b */
    public final Call.Factory f19137b;

    /* renamed from: c */
    public final C9866f<ResponseBody, ResponseT> f19138c;

    /* renamed from: o.h$a */
    /* compiled from: HttpServiceMethod */
    public static final class C9875a<ResponseT, ReturnT> extends C9874h<ResponseT, ReturnT> {

        /* renamed from: d */
        public final C9856c<ResponseT, ReturnT> f19139d;

        public C9875a(C9907o oVar, Call.Factory factory, C9866f<ResponseBody, ResponseT> fVar, C9856c<ResponseT, ReturnT> cVar) {
            super(oVar, factory, fVar);
            this.f19139d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [o.b, o.b<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo51270c(p692o.C9855b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                o.c<ResponseT, ReturnT> r2 = r0.f19139d
                java.lang.Object r1 = r2.mo51257b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p692o.C9874h.C9875a.mo51270c(o.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: o.h$b */
    /* compiled from: HttpServiceMethod */
    public static final class C9876b<ResponseT> extends C9874h<ResponseT, Object> {

        /* renamed from: d */
        public final C9856c<ResponseT, C9855b<ResponseT>> f19140d;

        /* renamed from: e */
        public final boolean f19141e;

        public C9876b(C9907o oVar, Call.Factory factory, C9866f<ResponseBody, ResponseT> fVar, C9856c<ResponseT, C9855b<ResponseT>> cVar, boolean z) {
            super(oVar, factory, fVar);
            this.f19140d = cVar;
            this.f19141e = z;
        }

        /* renamed from: c */
        public Object mo51270c(C9855b<ResponseT> bVar, Object[] objArr) {
            C9855b bVar2 = (C9855b) this.f19140d.mo51257b(bVar);
            Continuation continuation = objArr[objArr.length - 1];
            if (this.f19141e) {
                return KotlinExtensions.awaitNullable(bVar2, continuation);
            }
            return KotlinExtensions.await(bVar2, continuation);
        }
    }

    /* renamed from: o.h$c */
    /* compiled from: HttpServiceMethod */
    public static final class C9877c<ResponseT> extends C9874h<ResponseT, Object> {

        /* renamed from: d */
        public final C9856c<ResponseT, C9855b<ResponseT>> f19142d;

        public C9877c(C9907o oVar, Call.Factory factory, C9866f<ResponseBody, ResponseT> fVar, C9856c<ResponseT, C9855b<ResponseT>> cVar) {
            super(oVar, factory, fVar);
            this.f19142d = cVar;
        }

        /* renamed from: c */
        public Object mo51270c(C9855b<ResponseT> bVar, Object[] objArr) {
            return KotlinExtensions.awaitResponse((C9855b) this.f19142d.mo51257b(bVar), objArr[objArr.length - 1]);
        }
    }

    public C9874h(C9907o oVar, Call.Factory factory, C9866f<ResponseBody, ResponseT> fVar) {
        this.f19136a = oVar;
        this.f19137b = factory;
        this.f19138c = fVar;
    }

    /* renamed from: d */
    public static <ResponseT, ReturnT> C9856c<ResponseT, ReturnT> m26472d(C9910q qVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return qVar.mo51322a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C9916u.m26593o(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static <ResponseT> C9866f<ResponseBody, ResponseT> m26473e(C9910q qVar, Method method, Type type) {
        try {
            return qVar.mo51330i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C9916u.m26593o(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static <ResponseT, ReturnT> C9874h<ResponseT, ReturnT> m26474f(C9910q qVar, Method method, C9907o oVar) {
        Type type;
        boolean z;
        Class<C9909p> cls = C9909p.class;
        boolean z2 = oVar.f19229k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type g = C9916u.m26585g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C9916u.m26587i(g) != cls || !(g instanceof ParameterizedType)) {
                z = false;
            } else {
                g = C9916u.m26586h(0, (ParameterizedType) g);
                z = true;
            }
            type = new C9916u.C9918b((Type) null, C9855b.class, g);
            annotations = C9915t.m26578a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C9856c d = m26472d(qVar, method, type, annotations);
        Type a = d.mo51256a();
        if (a == Response.class) {
            throw C9916u.m26592n(method, "'" + C9916u.m26587i(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a == cls) {
            throw C9916u.m26592n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!oVar.f19221c.equals("HEAD") || Void.class.equals(a)) {
            C9866f e = m26473e(qVar, method, a);
            Call.Factory factory = qVar.f19259b;
            if (!z2) {
                return new C9875a(oVar, factory, e, d);
            }
            if (z) {
                return new C9877c(oVar, factory, e, d);
            }
            return new C9876b(oVar, factory, e, d, false);
        } else {
            throw C9916u.m26592n(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final ReturnT mo51269a(Object[] objArr) {
        return mo51270c(new C9879j(this.f19136a, objArr, this.f19137b, this.f19138c), objArr);
    }

    /* renamed from: c */
    public abstract ReturnT mo51270c(C9855b<ResponseT> bVar, Object[] objArr);
}
