package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import p692o.C9866f;

/* renamed from: o.k */
/* compiled from: OptionalConverterFactory */
public final class C9884k extends C9866f.C9867a {

    /* renamed from: a */
    public static final C9866f.C9867a f19161a = new C9884k();

    /* renamed from: o.k$a */
    /* compiled from: OptionalConverterFactory */
    public static final class C9885a<T> implements C9866f<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final C9866f<ResponseBody, T> f19162a;

        public C9885a(C9866f<ResponseBody, T> fVar) {
            this.f19162a = fVar;
        }

        /* renamed from: b */
        public Optional<T> mo51243a(ResponseBody responseBody) {
            return Optional.ofNullable(this.f19162a.mo51243a(responseBody));
        }
    }

    /* renamed from: d */
    public C9866f<ResponseBody, ?> mo51242d(Type type, Annotation[] annotationArr, C9910q qVar) {
        if (C9866f.C9867a.m26463b(type) != Optional.class) {
            return null;
        }
        return new C9885a(qVar.mo51330i(C9866f.C9867a.m26462a(0, (ParameterizedType) type), annotationArr));
    }
}
