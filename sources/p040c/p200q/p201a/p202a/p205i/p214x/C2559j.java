package p040c.p200q.p201a.p202a.p205i.p214x;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.a.i.x.j */
/* compiled from: MetadataBackendRegistry */
public class C2559j implements C2553e {

    /* renamed from: a */
    public final C2560a f3008a;

    /* renamed from: b */
    public final C2557h f3009b;

    /* renamed from: c */
    public final Map<String, C2562l> f3010c;

    /* renamed from: c.q.a.a.i.x.j$a */
    /* compiled from: MetadataBackendRegistry */
    public static class C2560a {

        /* renamed from: a */
        public final Context f3011a;

        /* renamed from: b */
        public Map<String, String> f3012b = null;

        public C2560a(Context context) {
            this.f3011a = context;
        }

        /* renamed from: d */
        public static Bundle m4586d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> mo18013a(Context context) {
            Bundle d = m4586d(context);
            if (d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(RunnerArgs.CLASS_SEPARATOR, -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        @Nullable
        /* renamed from: b */
        public C2552d mo18014b(String str) {
            String str2 = mo18015c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C2552d) Class.forName(str2).asSubclass(C2552d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", new Object[]{str2});
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> mo18015c() {
            if (this.f3012b == null) {
                this.f3012b = mo18013a(this.f3011a);
            }
            return this.f3012b;
        }
    }

    public C2559j(Context context, C2557h hVar) {
        this(new C2560a(context), hVar);
    }

    @Nullable
    public synchronized C2562l get(String str) {
        if (this.f3010c.containsKey(str)) {
            return this.f3010c.get(str);
        }
        C2552d b = this.f3008a.mo18014b(str);
        if (b == null) {
            return null;
        }
        C2562l create = b.create(this.f3009b.mo18011a(str));
        this.f3010c.put(str, create);
        return create;
    }

    public C2559j(C2560a aVar, C2557h hVar) {
        this.f3010c = new HashMap();
        this.f3008a = aVar;
        this.f3009b = hVar;
    }
}
