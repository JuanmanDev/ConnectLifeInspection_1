package p692o;

import java.lang.annotation.Annotation;

/* renamed from: o.t */
/* compiled from: SkipCallbackExecutorImpl */
public final class C9915t implements C9914s {

    /* renamed from: a */
    public static final C9914s f19275a = new C9915t();

    /* renamed from: a */
    public static Annotation[] m26578a(Annotation[] annotationArr) {
        if (C9916u.m26591m(annotationArr, C9914s.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f19275a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C9914s.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C9914s;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C9914s.class.getName() + "()";
    }
}
