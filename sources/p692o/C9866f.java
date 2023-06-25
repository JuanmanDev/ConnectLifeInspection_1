package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: o.f */
/* compiled from: Converter */
public interface C9866f<F, T> {

    /* renamed from: o.f$a */
    /* compiled from: Converter */
    public static abstract class C9867a {
        /* renamed from: a */
        public static Type m26462a(int i, ParameterizedType parameterizedType) {
            return C9916u.m26586h(i, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m26463b(Type type) {
            return C9916u.m26587i(type);
        }

        /* renamed from: c */
        public C9866f<?, RequestBody> mo51241c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9910q qVar) {
            return null;
        }

        /* renamed from: d */
        public C9866f<ResponseBody, ?> mo51242d(Type type, Annotation[] annotationArr, C9910q qVar) {
            return null;
        }

        /* renamed from: e */
        public C9866f<?, String> mo51265e(Type type, Annotation[] annotationArr, C9910q qVar) {
            return null;
        }
    }

    /* renamed from: a */
    T mo51243a(F f);
}
