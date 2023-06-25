package androidx.test.internal.runner;

import androidx.test.internal.runner.junit3.AndroidJUnit3Builder;
import androidx.test.internal.runner.junit3.AndroidSuiteBuilder;
import androidx.test.internal.runner.junit4.AndroidAnnotatedBuilder;
import androidx.test.internal.runner.junit4.AndroidJUnit4Builder;
import androidx.test.internal.util.AndroidRunnerParams;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p648m.p668e.p669j.p670d.C9699a;
import p648m.p668e.p669j.p670d.C9700b;
import p648m.p668e.p669j.p670d.C9701c;
import p648m.p668e.p669j.p670d.C9703e;
import p648m.p668e.p669j.p670d.C9704f;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

public class AndroidRunnerBuilder extends C9699a {
    public final AndroidAnnotatedBuilder androidAnnotatedBuilder;
    public final AndroidJUnit3Builder androidJUnit3Builder;
    public final AndroidJUnit4Builder androidJUnit4Builder;
    public final AndroidSuiteBuilder androidSuiteBuilder;
    public final List<C9783e> customRunnerBuilders;
    public final C9701c ignoredBuilder;

    public AndroidRunnerBuilder(AndroidRunnerParams androidRunnerParams) {
        this((C9783e) null, androidRunnerParams, false, Collections.emptyList());
    }

    private List<C9783e> instantiateRunnerBuilders(List<Class<? extends C9783e>> list) {
        ArrayList arrayList = new ArrayList();
        for (Class next : list) {
            try {
                arrayList.add((C9783e) next.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (InstantiationException e) {
                String valueOf = String.valueOf(next);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 113);
                sb.append("Could not create instance of ");
                sb.append(valueOf);
                sb.append(", make sure that it is a public concrete class with a public no-argument constructor");
                throw new IllegalStateException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                String valueOf2 = String.valueOf(next);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 113);
                sb2.append("Could not create instance of ");
                sb2.append(valueOf2);
                sb2.append(", make sure that it is a public concrete class with a public no-argument constructor");
                throw new IllegalStateException(sb2.toString(), e2);
            } catch (NoSuchMethodException e3) {
                String valueOf3 = String.valueOf(next);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 113);
                sb3.append("Could not create instance of ");
                sb3.append(valueOf3);
                sb3.append(", make sure that it is a public concrete class with a public no-argument constructor");
                throw new IllegalStateException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                String valueOf4 = String.valueOf(next);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 74);
                sb4.append("Could not create instance of ");
                sb4.append(valueOf4);
                sb4.append(", the constructor must not throw an exception");
                throw new IllegalStateException(sb4.toString(), e4);
            }
        }
        return arrayList;
    }

    public C9700b annotatedBuilder() {
        return this.androidAnnotatedBuilder;
    }

    public C9701c ignoredBuilder() {
        return this.ignoredBuilder;
    }

    public C9703e junit3Builder() {
        return this.androidJUnit3Builder;
    }

    public C9704f junit4Builder() {
        return this.androidJUnit4Builder;
    }

    public C9749f runnerForClass(Class<?> cls) {
        for (C9783e safeRunnerForClass : this.customRunnerBuilders) {
            C9749f safeRunnerForClass2 = safeRunnerForClass.safeRunnerForClass(cls);
            if (safeRunnerForClass2 != null) {
                return safeRunnerForClass2;
            }
        }
        return super.runnerForClass(cls);
    }

    public C9783e suiteMethodBuilder() {
        return this.androidSuiteBuilder;
    }

    public AndroidRunnerBuilder(AndroidRunnerParams androidRunnerParams, boolean z, List<Class<? extends C9783e>> list) {
        this((C9783e) null, androidRunnerParams, z, list);
    }

    public AndroidRunnerBuilder(C9783e eVar, AndroidRunnerParams androidRunnerParams, boolean z, List<Class<? extends C9783e>> list) {
        super(true);
        this.androidJUnit3Builder = new AndroidJUnit3Builder(androidRunnerParams, z);
        this.androidJUnit4Builder = new AndroidJUnit4Builder(androidRunnerParams, z);
        this.androidSuiteBuilder = new AndroidSuiteBuilder(androidRunnerParams);
        this.androidAnnotatedBuilder = new AndroidAnnotatedBuilder(eVar == null ? this : eVar, androidRunnerParams);
        this.ignoredBuilder = new C9701c();
        this.customRunnerBuilders = instantiateRunnerBuilders(list);
    }
}
