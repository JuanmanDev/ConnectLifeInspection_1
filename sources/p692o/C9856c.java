package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: o.c */
/* compiled from: CallAdapter */
public interface C9856c<R, T> {

    /* renamed from: o.c$a */
    /* compiled from: CallAdapter */
    public static abstract class C9857a {
        /* renamed from: b */
        public static Type m26451b(int i, ParameterizedType parameterizedType) {
            return C9916u.m26586h(i, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m26452c(Type type) {
            return C9916u.m26587i(type);
        }

        /* renamed from: a */
        public abstract C9856c<?, ?> mo51258a(Type type, Annotation[] annotationArr, C9910q qVar);
    }

    /* renamed from: a */
    Type mo51256a();

    /* renamed from: b */
    T mo51257b(C9855b<R> bVar);
}
