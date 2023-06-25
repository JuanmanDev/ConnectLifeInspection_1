package androidx.test.runner;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.internal.util.AndroidRunnerParams;
import java.lang.reflect.InvocationTargetException;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9750a;
import p648m.p668e.p677l.p678g.C9754b;
import p648m.p668e.p677l.p678g.C9755c;
import p648m.p668e.p677l.p678g.C9756d;
import p648m.p668e.p677l.p679h.C9759b;

@Deprecated
public final class AndroidJUnit4 extends C9749f implements C9754b, C9755c {
    public static final String TAG = "AndroidJUnit4";
    public final C9749f delegate;

    public AndroidJUnit4(Class<?> cls, AndroidRunnerParams androidRunnerParams) {
        this.delegate = new AndroidJUnit4ClassRunner(cls, androidRunnerParams);
    }

    public static C9749f loadRunner(Class<?> cls) {
        return loadRunner(cls, System.getProperty("android.junit.runner", "org.robolectric.RobolectricTestRunner"));
    }

    public void filter(C9750a aVar) {
        ((C9754b) this.delegate).filter(aVar);
    }

    public Description getDescription() {
        return this.delegate.getDescription();
    }

    public void run(C9759b bVar) {
        this.delegate.run(bVar);
    }

    public void sort(C9756d dVar) {
        ((C9755c) this.delegate).sort(dVar);
    }

    public AndroidJUnit4(Class<?> cls) {
        this.delegate = loadRunner(cls);
    }

    public static C9749f loadRunner(Class<?> cls, String str) {
        try {
            return (C9749f) Class.forName(str).getConstructor(new Class[]{Class.class}).newInstance(new Object[]{cls});
        } catch (ClassNotFoundException unused) {
            String.valueOf(str).concat(" could not be loaded");
            throw new InitializationError(String.format("Attempted to use AndroidJUnit4 with standard JUnit runner and delegate runner '%s'could not be loaded. Check your build configuration.", new Object[]{str}));
        } catch (NoSuchMethodException unused2) {
            String.valueOf(str).concat(" could not be loaded");
            throw new InitializationError(String.format("Attempted to use AndroidJUnit4 with standard JUnit runner and delegate runner '%s'could not be loaded. Check your build configuration.", new Object[]{str}));
        } catch (IllegalAccessException unused3) {
            String.valueOf(str).concat(" could not be loaded");
            throw new InitializationError(String.format("Attempted to use AndroidJUnit4 with standard JUnit runner and delegate runner '%s'could not be loaded. Check your build configuration.", new Object[]{str}));
        } catch (InstantiationException unused4) {
            String.valueOf(str).concat(" could not be loaded");
            throw new InitializationError(String.format("Attempted to use AndroidJUnit4 with standard JUnit runner and delegate runner '%s'could not be loaded. Check your build configuration.", new Object[]{str}));
        } catch (InvocationTargetException unused5) {
            String.valueOf(str).concat(" could not be loaded");
            throw new InitializationError(String.format("Attempted to use AndroidJUnit4 with standard JUnit runner and delegate runner '%s'could not be loaded. Check your build configuration.", new Object[]{str}));
        }
    }
}
