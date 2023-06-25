package p692o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p692o.C9856c;
import p692o.C9866f;

/* renamed from: o.m */
/* compiled from: Platform */
public class C9901m {

    /* renamed from: a */
    public static final C9901m f19202a = m26512e();

    /* renamed from: o.m$a */
    /* compiled from: Platform */
    public static class C9902a extends C9901m {

        /* renamed from: o.m$a$a */
        /* compiled from: Platform */
        public static class C9903a implements Executor {

            /* renamed from: e */
            public final Handler f19203e = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f19203e.post(runnable);
            }
        }

        /* renamed from: a */
        public List<? extends C9856c.C9857a> mo51292a(Executor executor) {
            if (executor != null) {
                C9868g gVar = new C9868g(executor);
                if (Build.VERSION.SDK_INT < 24) {
                    return Collections.singletonList(gVar);
                }
                return Arrays.asList(new C9856c.C9857a[]{C9859e.f19118a, gVar});
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public Executor mo51293b() {
            return new C9903a();
        }

        /* renamed from: c */
        public List<? extends C9866f.C9867a> mo51294c() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Collections.singletonList(C9884k.f19161a);
            }
            return Collections.emptyList();
        }

        /* renamed from: d */
        public int mo51295d() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        /* renamed from: h */
        public boolean mo51297h(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    /* renamed from: o.m$b */
    /* compiled from: Platform */
    public static class C9904b extends C9901m {
        /* renamed from: a */
        public List<? extends C9856c.C9857a> mo51292a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(C9859e.f19118a);
            arrayList.add(new C9868g(executor));
            return Collections.unmodifiableList(arrayList);
        }

        /* renamed from: c */
        public List<? extends C9866f.C9867a> mo51294c() {
            return Collections.singletonList(C9884k.f19161a);
        }

        /* renamed from: d */
        public int mo51295d() {
            return 1;
        }

        /* renamed from: g */
        public Object mo51296g(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* renamed from: h */
        public boolean mo51297h(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: e */
    public static C9901m m26512e() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C9902a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C9904b();
        } catch (ClassNotFoundException unused2) {
            return new C9901m();
        }
    }

    /* renamed from: f */
    public static C9901m m26513f() {
        return f19202a;
    }

    /* renamed from: a */
    public List<? extends C9856c.C9857a> mo51292a(Executor executor) {
        return Collections.singletonList(new C9868g(executor));
    }

    /* renamed from: b */
    public Executor mo51293b() {
        return null;
    }

    /* renamed from: c */
    public List<? extends C9866f.C9867a> mo51294c() {
        return Collections.emptyList();
    }

    /* renamed from: d */
    public int mo51295d() {
        return 0;
    }

    /* renamed from: g */
    public Object mo51296g(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public boolean mo51297h(Method method) {
        return false;
    }
}
