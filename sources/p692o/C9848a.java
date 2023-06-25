package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p692o.C9866f;
import p692o.p698x.C9966v;

/* renamed from: o.a */
/* compiled from: BuiltInConverters */
public final class C9848a extends C9866f.C9867a {

    /* renamed from: a */
    public boolean f19111a = true;

    /* renamed from: o.a$a */
    /* compiled from: BuiltInConverters */
    public static final class C9849a implements C9866f<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C9849a f19112a = new C9849a();

        /* renamed from: b */
        public ResponseBody mo51243a(ResponseBody responseBody) {
            try {
                return C9916u.m26579a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: o.a$b */
    /* compiled from: BuiltInConverters */
    public static final class C9850b implements C9866f<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final C9850b f19113a = new C9850b();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo51243a(Object obj) {
            RequestBody requestBody = (RequestBody) obj;
            mo51245b(requestBody);
            return requestBody;
        }

        /* renamed from: b */
        public RequestBody mo51245b(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: o.a$c */
    /* compiled from: BuiltInConverters */
    public static final class C9851c implements C9866f<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C9851c f19114a = new C9851c();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo51243a(Object obj) {
            ResponseBody responseBody = (ResponseBody) obj;
            mo51246b(responseBody);
            return responseBody;
        }

        /* renamed from: b */
        public ResponseBody mo51246b(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: o.a$d */
    /* compiled from: BuiltInConverters */
    public static final class C9852d implements C9866f<Object, String> {

        /* renamed from: a */
        public static final C9852d f19115a = new C9852d();

        /* renamed from: b */
        public String mo51243a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: o.a$e */
    /* compiled from: BuiltInConverters */
    public static final class C9853e implements C9866f<ResponseBody, Unit> {

        /* renamed from: a */
        public static final C9853e f19116a = new C9853e();

        /* renamed from: b */
        public Unit mo51243a(ResponseBody responseBody) {
            responseBody.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: o.a$f */
    /* compiled from: BuiltInConverters */
    public static final class C9854f implements C9866f<ResponseBody, Void> {

        /* renamed from: a */
        public static final C9854f f19117a = new C9854f();

        /* renamed from: b */
        public Void mo51243a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    /* renamed from: c */
    public C9866f<?, RequestBody> mo51241c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9910q qVar) {
        if (RequestBody.class.isAssignableFrom(C9916u.m26587i(type))) {
            return C9850b.f19113a;
        }
        return null;
    }

    /* renamed from: d */
    public C9866f<ResponseBody, ?> mo51242d(Type type, Annotation[] annotationArr, C9910q qVar) {
        if (type == ResponseBody.class) {
            if (C9916u.m26591m(annotationArr, C9966v.class)) {
                return C9851c.f19114a;
            }
            return C9849a.f19112a;
        } else if (type == Void.class) {
            return C9854f.f19117a;
        } else {
            if (!this.f19111a || type != Unit.class) {
                return null;
            }
            try {
                return C9853e.f19116a;
            } catch (NoClassDefFoundError unused) {
                this.f19111a = false;
                return null;
            }
        }
    }
}
