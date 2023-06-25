package org.junit.internal;

import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9625g;
import p648m.p657c.C9626h;

public class AssumptionViolatedException extends RuntimeException implements C9625g {
    public static final long serialVersionUID = 2;
    public final String fAssumption;
    public final C9623e<?> fMatcher;
    public final Object fValue;
    public final boolean fValueMatcher;

    @Deprecated
    public AssumptionViolatedException(String str, boolean z, Object obj, C9623e<?> eVar) {
        this.fAssumption = str;
        this.fValue = obj;
        this.fMatcher = eVar;
        this.fValueMatcher = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    public void describeTo(C9620c cVar) {
        String str = this.fAssumption;
        if (str != null) {
            cVar.mo50300c(str);
        }
        if (this.fValueMatcher) {
            if (this.fAssumption != null) {
                cVar.mo50300c(": ");
            }
            cVar.mo50300c("got: ");
            cVar.mo50301d(this.fValue);
            if (this.fMatcher != null) {
                cVar.mo50300c(", expected: ");
                cVar.mo50299b(this.fMatcher);
            }
        }
    }

    public String getMessage() {
        return C9626h.m25847l(this);
    }

    @Deprecated
    public AssumptionViolatedException(Object obj, C9623e<?> eVar) {
        this((String) null, true, obj, eVar);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, C9623e<?> eVar) {
        this(str, true, obj, eVar);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, (Object) null, (C9623e<?>) null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th) {
        this(str, false, (Object) null, (C9623e<?>) null);
        initCause(th);
    }
}
