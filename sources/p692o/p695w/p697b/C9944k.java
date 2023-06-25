package p692o.p695w.p697b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p692o.C9866f;
import p692o.C9910q;

/* renamed from: o.w.b.k */
/* compiled from: ScalarsConverterFactory */
public final class C9944k extends C9866f.C9867a {
    /* renamed from: f */
    public static C9944k m26643f() {
        return new C9944k();
    }

    /* renamed from: c */
    public C9866f<?, RequestBody> mo51241c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9910q qVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C9934a.f19314a;
        }
        return null;
    }

    /* renamed from: d */
    public C9866f<ResponseBody, ?> mo51242d(Type type, Annotation[] annotationArr, C9910q qVar) {
        if (type == String.class) {
            return C9943j.f19324a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C9935b.f19316a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C9936c.f19317a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C9937d.f19318a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C9938e.f19319a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C9939f.f19320a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C9940g.f19321a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C9941h.f19322a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C9942i.f19323a;
        }
        return null;
    }
}
