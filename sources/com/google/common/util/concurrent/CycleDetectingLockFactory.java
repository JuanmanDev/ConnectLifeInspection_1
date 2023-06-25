package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6061o1;

public class CycleDetectingLockFactory {

    /* renamed from: a */
    public static final Logger f15310a = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    public enum Policies {
        THROW {
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN {
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f15310a.log(Level.SEVERE, "Detected potential deadlock", potentialDeadlockException);
            }
        },
        DISABLED {
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        };
    }

    public static final class PotentialDeadlockException extends C8238b {
        public final C8238b conflictingStackTrace;

        public /* synthetic */ PotentialDeadlockException(C8239c cVar, C8239c cVar2, C8238b bVar, C8237a aVar) {
            this(cVar, cVar2, bVar);
        }

        public C8238b getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }

        public PotentialDeadlockException(C8239c cVar, C8239c cVar2, C8238b bVar) {
            super(cVar, cVar2);
            this.conflictingStackTrace = bVar;
            initCause(bVar);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    public static class C8237a extends ThreadLocal<ArrayList<C8239c>> {
        /* renamed from: a */
        public ArrayList<C8239c> initialValue() {
            return C6049n1.m16982j(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    public static class C8238b extends IllegalStateException {
        public static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        public static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m22257of(CycleDetectingLockFactory.class.getName(), C8238b.class.getName(), C8239c.class.getName());

        public C8238b(C8239c cVar, C8239c cVar2) {
            super(cVar.mo37288a() + " -> " + cVar2.mo37288a());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                if (C8240d.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    public static class C8239c {

        /* renamed from: a */
        public final String f15311a;

        /* renamed from: a */
        public String mo37288a() {
            return this.f15311a;
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$d */
    public static final class C8240d<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    static {
        C6061o1 o1Var = new C6061o1();
        o1Var.mo29697l();
        o1Var.mo29694i();
        new C8237a();
    }
}
