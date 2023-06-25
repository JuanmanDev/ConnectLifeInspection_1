package org.junit;

import p648m.p657c.C9623e;

public class AssumptionViolatedException extends org.junit.internal.AssumptionViolatedException {
    public static final long serialVersionUID = 1;

    public <T> AssumptionViolatedException(T t, C9623e<T> eVar) {
        super((Object) t, (C9623e<?>) eVar);
    }

    public <T> AssumptionViolatedException(String str, T t, C9623e<T> eVar) {
        super(str, t, eVar);
    }

    public AssumptionViolatedException(String str) {
        super(str);
    }

    public AssumptionViolatedException(String str, Throwable th) {
        super(str, th);
    }
}
