package org.junit.runners;

import java.lang.reflect.Method;
import java.util.Comparator;
import p648m.p668e.p669j.C9694a;

public enum MethodSorters {
    NAME_ASCENDING(C9694a.f18969b),
    JVM((String) null),
    DEFAULT(C9694a.f18968a);
    
    public final Comparator<Method> comparator;

    /* access modifiers changed from: public */
    MethodSorters(Comparator<Method> comparator2) {
        this.comparator = comparator2;
    }

    public Comparator<Method> getComparator() {
        return this.comparator;
    }
}
