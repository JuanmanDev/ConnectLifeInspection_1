package p040c.p072c.p073a.p074a;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p040c.p072c.p073a.p074a.C1535z;

/* renamed from: c.c.a.a.a0 */
/* compiled from: UtilsActivityLifecycleImpl */
public final class C1487a0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q */
    public static final C1487a0 f664q = new C1487a0();

    /* renamed from: r */
    public static final Activity f665r = new Activity();

    /* renamed from: e */
    public final LinkedList<Activity> f666e = new LinkedList<>();

    /* renamed from: l */
    public final List<C1535z.C1537b> f667l = new CopyOnWriteArrayList();

    /* renamed from: m */
    public final Map<Activity, List<C1535z.C1536a>> f668m = new ConcurrentHashMap();

    /* renamed from: n */
    public int f669n = 0;

    /* renamed from: o */
    public int f670o = 0;

    /* renamed from: p */
    public boolean f671p = false;

    /* renamed from: c.c.a.a.a0$a */
    /* compiled from: UtilsActivityLifecycleImpl */
    public class C1488a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Activity f672e;

        /* renamed from: l */
        public final /* synthetic */ C1535z.C1536a f673l;

        public C1488a(Activity activity, C1535z.C1536a aVar) {
            this.f672e = activity;
            this.f673l = aVar;
        }

        public void run() {
            C1487a0.this.mo15355e(this.f672e, this.f673l);
        }
    }

    /* renamed from: c.c.a.a.a0$b */
    /* compiled from: UtilsActivityLifecycleImpl */
    public class C1489b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Activity f675e;

        /* renamed from: l */
        public final /* synthetic */ C1535z.C1536a f676l;

        public C1489b(Activity activity, C1535z.C1536a aVar) {
            this.f675e = activity;
            this.f676l = aVar;
        }

        public void run() {
            C1487a0.this.mo15378t(this.f675e, this.f676l);
        }
    }

    /* renamed from: c.c.a.a.a0$c */
    /* compiled from: UtilsActivityLifecycleImpl */
    public class C1490c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Activity f678e;

        /* renamed from: l */
        public final /* synthetic */ Object f679l;

        public C1490c(C1487a0 a0Var, Activity activity, Object obj) {
            this.f678e = activity;
            this.f679l = obj;
        }

        public void run() {
            try {
                Window window = this.f678e.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.f679l).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    public static void m843u() {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get((Object) null)).floatValue() == 0.0f) {
                    declaredField.set((Object) null, Float.valueOf(1.0f));
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void addOnAppStatusChangedListener(C1535z.C1537b bVar) {
        this.f667l.add(bVar);
    }

    /* renamed from: c */
    public void mo15353c(Activity activity, C1535z.C1536a aVar) {
        if (activity != null && aVar != null) {
            C1493b0.m872B(new C1488a(activity, aVar));
        }
    }

    /* renamed from: d */
    public void mo15354d(C1535z.C1536a aVar) {
        mo15353c(f665r, aVar);
    }

    /* renamed from: e */
    public final void mo15355e(Activity activity, C1535z.C1536a aVar) {
        List list = this.f668m.get(activity);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.f668m.put(activity, list);
        } else if (list.contains(aVar)) {
            return;
        }
        list.add(aVar);
    }

    /* renamed from: f */
    public final void mo15356f(Activity activity, Lifecycle.Event event) {
        mo15357g(activity, event, this.f668m.get(activity));
        mo15357g(activity, event, this.f668m.get(f665r));
    }

    /* renamed from: g */
    public final void mo15357g(Activity activity, Lifecycle.Event event, List<C1535z.C1536a> list) {
        if (list != null) {
            for (C1535z.C1536a next : list) {
                next.mo15442g(activity, event);
                if (event.equals(Lifecycle.Event.ON_CREATE)) {
                    next.mo15436a(activity);
                } else if (event.equals(Lifecycle.Event.ON_START)) {
                    next.mo15440e(activity);
                } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                    next.mo15439d(activity);
                } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                    next.mo15438c(activity);
                } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                    next.mo15441f(activity);
                } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                    next.mo15437b(activity);
                }
            }
            if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                this.f668m.remove(activity);
            }
        }
    }

    /* renamed from: h */
    public final List<Activity> mo15358h() {
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            Object j = mo15360j();
            Field declaredField = j.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(j);
            if (!(obj instanceof Map)) {
                return linkedList;
            }
            for (Object next : ((Map) obj).values()) {
                Class<?> cls = next.getClass();
                Field declaredField2 = cls.getDeclaredField(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                declaredField2.setAccessible(true);
                Activity activity2 = (Activity) declaredField2.get(next);
                if (activity == null) {
                    Field declaredField3 = cls.getDeclaredField("paused");
                    declaredField3.setAccessible(true);
                    if (!declaredField3.getBoolean(next)) {
                        activity = activity2;
                    } else {
                        linkedList.add(activity2);
                    }
                } else {
                    linkedList.add(activity2);
                }
            }
            if (activity != null) {
                linkedList.addFirst(activity);
            }
            return linkedList;
        } catch (Exception e) {
            "getActivitiesByReflect: " + e.getMessage();
        }
    }

    /* renamed from: i */
    public List<Activity> mo15359i() {
        if (!this.f666e.isEmpty()) {
            return new LinkedList(this.f666e);
        }
        this.f666e.addAll(mo15358h());
        return new LinkedList(this.f666e);
    }

    /* renamed from: j */
    public final Object mo15360j() {
        Object k = mo15361k();
        if (k != null) {
            return k;
        }
        return mo15362l();
    }

    /* renamed from: k */
    public final Object mo15361k() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception e) {
            "getActivityThreadInActivityThreadStaticField: " + e.getMessage();
            return null;
        }
    }

    /* renamed from: l */
    public final Object mo15362l() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            "getActivityThreadInActivityThreadStaticMethod: " + e.getMessage();
            return null;
        }
    }

    /* renamed from: m */
    public Application mo15363m() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getApplication", new Class[0]).invoke(mo15360j(), new Object[0]);
            if (invoke == null) {
                return null;
            }
            return (Application) invoke;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public void mo15364n(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: o */
    public boolean mo15365o() {
        return !this.f671p;
    }

    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        if (activity != null) {
            C1505l.m937a(activity);
            m843u();
            mo15379v(activity);
            mo15356f(activity, Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void onActivityDestroyed(@NonNull Activity activity) {
        if (activity != null) {
            this.f666e.remove(activity);
            C1493b0.m881e(activity);
            mo15356f(activity, Lifecycle.Event.ON_DESTROY);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void onActivityPaused(@NonNull Activity activity) {
        if (activity != null) {
            mo15356f(activity, Lifecycle.Event.ON_PAUSE);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void onActivityResumed(@NonNull Activity activity) {
        if (activity != null) {
            mo15379v(activity);
            if (this.f671p) {
                this.f671p = false;
                mo15373p(activity, true);
            }
            mo15374q(activity, false);
            mo15356f(activity, Lifecycle.Event.ON_RESUME);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void onActivitySaveInstanceState(@NonNull Activity activity, Bundle bundle) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    public void onActivityStarted(@NonNull Activity activity) {
        if (activity != null) {
            if (!this.f671p) {
                mo15379v(activity);
            }
            int i = this.f670o;
            if (i < 0) {
                this.f670o = i + 1;
            } else {
                this.f669n++;
            }
            mo15356f(activity, Lifecycle.Event.ON_START);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f670o--;
        } else {
            int i = this.f669n - 1;
            this.f669n = i;
            if (i <= 0) {
                this.f671p = true;
                mo15373p(activity, false);
            }
        }
        mo15374q(activity, true);
        mo15356f(activity, Lifecycle.Event.ON_STOP);
    }

    /* renamed from: p */
    public final void mo15373p(Activity activity, boolean z) {
        if (!this.f667l.isEmpty()) {
            for (C1535z.C1537b next : this.f667l) {
                if (z) {
                    next.mo15443a(activity);
                } else {
                    next.mo15444b(activity);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo15374q(Activity activity, boolean z) {
        if (z) {
            try {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
            } catch (Exception unused) {
            }
        } else {
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                C1493b0.m873C(new C1490c(this, activity, tag), 100);
            }
        }
    }

    /* renamed from: r */
    public void mo15375r(Activity activity, C1535z.C1536a aVar) {
        if (activity != null && aVar != null) {
            C1493b0.m872B(new C1489b(activity, aVar));
        }
    }

    public void removeOnAppStatusChangedListener(C1535z.C1537b bVar) {
        this.f667l.remove(bVar);
    }

    /* renamed from: s */
    public void mo15377s(C1535z.C1536a aVar) {
        mo15375r(f665r, aVar);
    }

    /* renamed from: t */
    public final void mo15378t(Activity activity, C1535z.C1536a aVar) {
        List list = this.f668m.get(activity);
        if (list != null && !list.isEmpty()) {
            list.remove(aVar);
        }
    }

    /* renamed from: v */
    public final void mo15379v(Activity activity) {
        if (!this.f666e.contains(activity)) {
            this.f666e.addFirst(activity);
        } else if (!this.f666e.getFirst().equals(activity)) {
            this.f666e.remove(activity);
            this.f666e.addFirst(activity);
        }
    }

    /* renamed from: w */
    public void mo15380w(Application application) {
        this.f666e.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }
}
