package p648m.p668e.p680m.p681d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p648m.p668e.C9687c;
import p648m.p668e.C9688d;
import p648m.p668e.C9689e;
import p648m.p668e.p669j.C9694a;

/* renamed from: m.e.m.d.h */
/* compiled from: TestClass */
public class C9786h implements C9778a {

    /* renamed from: d */
    public static final C9788b f19052d = new C9788b();

    /* renamed from: e */
    public static final C9789c f19053e = new C9789c();

    /* renamed from: a */
    public final Class<?> f19054a;

    /* renamed from: b */
    public final Map<Class<? extends Annotation>, List<C9781d>> f19055b;

    /* renamed from: c */
    public final Map<Class<? extends Annotation>, List<C9779b>> f19056c;

    /* renamed from: m.e.m.d.h$b */
    /* compiled from: TestClass */
    public static class C9788b implements Comparator<Field> {
        public C9788b() {
        }

        /* renamed from: a */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    /* renamed from: m.e.m.d.h$c */
    /* compiled from: TestClass */
    public static class C9789c implements Comparator<C9781d> {
        public C9789c() {
        }

        /* renamed from: a */
        public int compare(C9781d dVar, C9781d dVar2) {
            return C9694a.f18969b.compare(dVar.mo50654j(), dVar2.mo50654j());
        }
    }

    public C9786h(Class<?> cls) {
        this.f19054a = cls;
        if (cls == null || cls.getConstructors().length <= 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            mo50681s(linkedHashMap, linkedHashMap2);
            this.f19055b = m26298q(linkedHashMap);
            this.f19056c = m26298q(linkedHashMap2);
            return;
        }
        throw new IllegalArgumentException("Test class can only have one constructor");
    }

    /* renamed from: a */
    public static <T extends C9780c<T>> void m26294a(T t, Map<Class<? extends Annotation>, List<T>> map) {
        Annotation[] annotations = t.getAnnotations();
        int length = annotations.length;
        int i = 0;
        while (i < length) {
            Class<? extends Annotation> annotationType = annotations[i].annotationType();
            List<? extends Annotation> f = m26295f(map, annotationType, true);
            if (!t.mo50650f(f)) {
                if (m26299r(annotationType)) {
                    f.add(0, t);
                } else {
                    f.add(t);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static <T> List<T> m26295f(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: m */
    public static Field[] m26296m(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, f19052d);
        return declaredFields;
    }

    /* renamed from: n */
    public static List<Class<?>> m26297n(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            arrayList.add(cls2);
        }
        return arrayList;
    }

    /* renamed from: q */
    public static <T extends C9780c<T>> Map<Class<? extends Annotation>, List<T>> m26298q(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), Collections.unmodifiableList((List) next.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: r */
    public static boolean m26299r(Class<? extends Annotation> cls) {
        return cls.equals(C9688d.class) || cls.equals(C9689e.class);
    }

    /* renamed from: b */
    public final <T> List<T> mo50667b(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List<T> addAll : map.values()) {
            linkedHashSet.addAll(addAll);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: c */
    public <T> List<T> mo50668c(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        for (C9779b i : mo50670e(cls)) {
            try {
                Object i2 = i.mo50645i(obj);
                if (cls2.isInstance(i2)) {
                    arrayList.add(cls2.cast(i2));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C9779b> mo50669d() {
        return mo50667b(this.f19056c);
    }

    /* renamed from: e */
    public List<C9779b> mo50670e(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(m26295f(this.f19056c, cls, false));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9786h.class != obj.getClass()) {
            return false;
        }
        if (this.f19054a == ((C9786h) obj).f19054a) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public <T> List<T> mo50672g(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        for (C9781d next : mo50675i(cls)) {
            try {
                if (cls2.isAssignableFrom(next.mo50656l())) {
                    arrayList.add(cls2.cast(next.mo50657m(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + next.mo50642c(), th);
            }
        }
        return arrayList;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Class<?> cls2 = this.f19054a;
        if (cls2 == null) {
            return null;
        }
        return cls2.getAnnotation(cls);
    }

    public Annotation[] getAnnotations() {
        Class<?> cls = this.f19054a;
        if (cls == null) {
            return new Annotation[0];
        }
        return cls.getAnnotations();
    }

    /* renamed from: h */
    public List<C9781d> mo50673h() {
        List<C9781d> b = mo50667b(this.f19055b);
        Collections.sort(b, f19053e);
        return b;
    }

    public int hashCode() {
        Class<?> cls = this.f19054a;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    /* renamed from: i */
    public List<C9781d> mo50675i(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(m26295f(this.f19055b, cls, false));
    }

    /* renamed from: j */
    public Class<?> mo50676j() {
        return this.f19054a;
    }

    /* renamed from: k */
    public String mo50677k() {
        Class<?> cls = this.f19054a;
        if (cls == null) {
            return "null";
        }
        return cls.getName();
    }

    /* renamed from: l */
    public Constructor<?> mo50678l() {
        Constructor<?>[] constructors = this.f19054a.getConstructors();
        C9687c.m26151a(1, (long) constructors.length);
        return constructors[0];
    }

    /* renamed from: o */
    public boolean mo50679o() {
        return this.f19054a.isMemberClass() && !Modifier.isStatic(this.f19054a.getModifiers());
    }

    /* renamed from: p */
    public boolean mo50680p() {
        return Modifier.isPublic(this.f19054a.getModifiers());
    }

    /* renamed from: s */
    public void mo50681s(Map<Class<? extends Annotation>, List<C9781d>> map, Map<Class<? extends Annotation>, List<C9779b>> map2) {
        for (Class next : m26297n(this.f19054a)) {
            for (Method dVar : C9694a.m26157a(next)) {
                m26294a(new C9781d(dVar), map);
            }
            for (Field bVar : m26296m(next)) {
                m26294a(new C9779b(bVar), map2);
            }
        }
    }
}
