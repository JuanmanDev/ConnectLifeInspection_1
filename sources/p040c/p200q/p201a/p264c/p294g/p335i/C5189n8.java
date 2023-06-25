package p040c.p200q.p201a.p264c.p294g.p335i;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.q.a.c.g.i.n8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5189n8 {

    /* renamed from: a */
    public static final Logger f10013a = Logger.getLogger(C4999b8.class.getName());

    /* renamed from: b */
    public static final String f10014b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static C5079g8 m14537b(Class cls) {
        String str;
        Class<C5189n8> cls2 = C5189n8.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C5079g8.class)) {
            str = f10014b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C5079g8) cls.cast(((C5189n8) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo27460a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C5079g8) cls.cast(((C5189n8) it.next()).mo27460a()));
                } catch (ServiceConfigurationError e5) {
                    f10013a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C5079g8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C5079g8) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    public abstract C5079g8 mo27460a();
}
