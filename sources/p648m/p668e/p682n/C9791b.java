package p648m.p668e.p682n;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m.e.n.b */
/* compiled from: AnnotationValidatorFactory */
public class C9791b {

    /* renamed from: a */
    public static final ConcurrentHashMap<C9800f, C9790a> f19058a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public C9790a mo50689a(C9800f fVar) {
        C9790a aVar = f19058a.get(fVar);
        if (aVar != null) {
            return aVar;
        }
        Class<? extends C9790a> value = fVar.value();
        if (value != null) {
            try {
                f19058a.putIfAbsent(fVar, (C9790a) value.newInstance());
                return f19058a.get(fVar);
            } catch (Exception e) {
                throw new RuntimeException("Exception received when creating AnnotationValidator class " + value.getName(), e);
            }
        } else {
            throw new IllegalArgumentException("Can't create validator, value is null in annotation " + fVar.getClass().getName());
        }
    }
}
