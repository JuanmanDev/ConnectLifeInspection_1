package p040c.p200q.p363c.p369m;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.m.q */
/* compiled from: ComponentDiscovery */
public final class C6443q<T> {

    /* renamed from: a */
    public final T f12125a;

    /* renamed from: b */
    public final C6446c<T> f12126b;

    /* renamed from: c.q.c.m.q$b */
    /* compiled from: ComponentDiscovery */
    public static class C6445b implements C6446c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f12127a;

        /* renamed from: b */
        public final Bundle mo30561b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f12127a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                this.f12127a + " has no service info.";
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo30560a(Context context) {
            Bundle b = mo30561b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public C6445b(Class<? extends Service> cls) {
            this.f12127a = cls;
        }
    }

    @VisibleForTesting
    /* renamed from: c.q.c.m.q$c */
    /* compiled from: ComponentDiscovery */
    public interface C6446c<T> {
        /* renamed from: a */
        List<String> mo30560a(T t);
    }

    @VisibleForTesting
    public C6443q(T t, C6446c<T> cVar) {
        this.f12125a = t;
        this.f12126b = cVar;
    }

    /* renamed from: b */
    public static C6443q<Context> m17998b(Context context, Class<? extends Service> cls) {
        return new C6443q<>(context, new C6445b(cls));
    }

    @Nullable
    /* renamed from: c */
    public static ComponentRegistrar m17999c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", new Object[]{str});
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: a */
    public List<C6757b<ComponentRegistrar>> mo30559a() {
        ArrayList arrayList = new ArrayList();
        for (String cVar : this.f12126b.mo30560a(this.f12125a)) {
            arrayList.add(new C6427c(cVar));
        }
        return arrayList;
    }
}
