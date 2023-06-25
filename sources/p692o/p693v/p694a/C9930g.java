package p692o.p693v.p694a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p553f.p594c.C9183a;
import p553f.p594c.C9185c;
import p553f.p594c.C9187e;
import p553f.p594c.C9190h;
import p553f.p594c.C9194k;
import p553f.p594c.C9197l;
import p692o.C9856c;
import p692o.C9909p;
import p692o.C9910q;

/* renamed from: o.v.a.g */
/* compiled from: RxJava2CallAdapterFactory */
public final class C9930g extends C9856c.C9857a {

    /* renamed from: a */
    public final C9194k f19305a;

    /* renamed from: b */
    public final boolean f19306b;

    public C9930g(C9194k kVar, boolean z) {
        this.f19305a = kVar;
        this.f19306b = z;
    }

    /* renamed from: d */
    public static C9930g m26613d() {
        return new C9930g((C9194k) null, false);
    }

    /* renamed from: a */
    public C9856c<?, ?> mo51258a(Type type, Annotation[] annotationArr, C9910q qVar) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> c = C9856c.C9857a.m26452c(type);
        if (c == C9183a.class) {
            return new C9929f(Void.class, this.f19305a, this.f19306b, false, true, false, false, false, true);
        }
        boolean z3 = c == C9185c.class;
        boolean z4 = c == C9197l.class;
        boolean z5 = c == C9187e.class;
        if (c != C9190h.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type b = C9856c.C9857a.m26451b(0, (ParameterizedType) type);
        Class<?> c2 = C9856c.C9857a.m26452c(b);
        if (c2 == C9909p.class) {
            if (b instanceof ParameterizedType) {
                type2 = C9856c.C9857a.m26451b(0, (ParameterizedType) b);
                z2 = false;
                z = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (c2 != C9926d.class) {
            type2 = b;
            z = true;
            z2 = false;
        } else if (b instanceof ParameterizedType) {
            type2 = C9856c.C9857a.m26451b(0, (ParameterizedType) b);
            z2 = true;
            z = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new C9929f(type2, this.f19305a, this.f19306b, z2, z, z3, z4, z5, false);
    }
}
