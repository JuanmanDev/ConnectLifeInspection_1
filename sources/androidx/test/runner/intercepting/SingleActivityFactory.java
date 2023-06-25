package androidx.test.runner.intercepting;

import android.app.Activity;
import android.content.Intent;
import androidx.test.internal.util.Checks;

public abstract class SingleActivityFactory<T extends Activity> implements InterceptingActivityFactory {
    public final Class<T> activityClassToIntercept;

    public SingleActivityFactory(Class<T> cls) {
        Checks.checkNotNull(cls);
        this.activityClassToIntercept = (Class) Checks.checkNotNull(cls);
    }

    public abstract T create(Intent intent);

    public final Activity create(ClassLoader classLoader, String str, Intent intent) {
        if (shouldIntercept(classLoader, str, intent)) {
            return create(intent);
        }
        throw new UnsupportedOperationException(String.format("Can't create instance of %s", new Object[]{str}));
    }

    public final Class<T> getActivityClassToIntercept() {
        return this.activityClassToIntercept;
    }

    public final boolean shouldIntercept(ClassLoader classLoader, String str, Intent intent) {
        return this.activityClassToIntercept.getName().equals(str);
    }
}
