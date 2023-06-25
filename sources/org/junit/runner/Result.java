package org.junit.runner;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.p679h.C9757a;

public class Result implements Serializable {
    public static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(C9985c.class).getFields();
    public static final long serialVersionUID = 1;
    public final AtomicInteger count;
    public final CopyOnWriteArrayList<Failure> failures;
    public final AtomicInteger ignoreCount;
    public final AtomicLong runTime;
    public C9985c serializedForm;
    public final AtomicLong startTime;

    @C9757a.C9758a
    /* renamed from: org.junit.runner.Result$b */
    public class C9984b extends C9757a {
        public C9984b() {
        }

        public void testAssumptionFailure(Failure failure) {
        }

        public void testFailure(Failure failure) {
            Result.this.failures.add(failure);
        }

        public void testFinished(Description description) {
            Result.this.count.getAndIncrement();
        }

        public void testIgnored(Description description) {
            Result.this.ignoreCount.getAndIncrement();
        }

        public void testRunFinished(Result result) {
            Result.this.runTime.addAndGet(System.currentTimeMillis() - Result.this.startTime.get());
        }

        public void testRunStarted(Description description) {
            Result.this.startTime.set(System.currentTimeMillis());
        }
    }

    public Result() {
        this.count = new AtomicInteger();
        this.ignoreCount = new AtomicInteger();
        this.failures = new CopyOnWriteArrayList<>();
        this.runTime = new AtomicLong();
        this.startTime = new AtomicLong();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.serializedForm = C9985c.m26681f(objectInputStream);
    }

    private Object readResolve() {
        return new Result(this.serializedForm);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        new C9985c(this).mo53510g(objectOutputStream);
    }

    public C9757a createListener() {
        return new C9984b();
    }

    public int getFailureCount() {
        return this.failures.size();
    }

    public List<Failure> getFailures() {
        return this.failures;
    }

    public int getIgnoreCount() {
        return this.ignoreCount.get();
    }

    public int getRunCount() {
        return this.count.get();
    }

    public long getRunTime() {
        return this.runTime.get();
    }

    public boolean wasSuccessful() {
        return getFailureCount() == 0;
    }

    /* renamed from: org.junit.runner.Result$c */
    public static class C9985c implements Serializable {
        public static final long serialVersionUID = 1;

        /* renamed from: e */
        public final AtomicInteger f19342e;

        /* renamed from: l */
        public final AtomicInteger f19343l;

        /* renamed from: m */
        public final List<Failure> f19344m;

        /* renamed from: n */
        public final long f19345n;

        /* renamed from: o */
        public final long f19346o;

        public C9985c(Result result) {
            this.f19342e = result.count;
            this.f19343l = result.ignoreCount;
            this.f19344m = Collections.synchronizedList(new ArrayList(result.failures));
            this.f19345n = result.runTime.longValue();
            this.f19346o = result.startTime.longValue();
        }

        /* renamed from: f */
        public static C9985c m26681f(ObjectInputStream objectInputStream) {
            return new C9985c(objectInputStream.readFields());
        }

        /* renamed from: g */
        public void mo53510g(ObjectOutputStream objectOutputStream) {
            ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
            putFields.put("fCount", this.f19342e);
            putFields.put("fIgnoreCount", this.f19343l);
            putFields.put("fFailures", this.f19344m);
            putFields.put("fRunTime", this.f19345n);
            putFields.put("fStartTime", this.f19346o);
            objectOutputStream.writeFields();
        }

        public C9985c(ObjectInputStream.GetField getField) {
            this.f19342e = (AtomicInteger) getField.get("fCount", (Object) null);
            this.f19343l = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.f19344m = (List) getField.get("fFailures", (Object) null);
            this.f19345n = getField.get("fRunTime", 0);
            this.f19346o = getField.get("fStartTime", 0);
        }
    }

    public Result(C9985c cVar) {
        this.count = cVar.f19342e;
        this.ignoreCount = cVar.f19343l;
        this.failures = new CopyOnWriteArrayList<>(cVar.f19344m);
        this.runTime = new AtomicLong(cVar.f19345n);
        this.startTime = new AtomicLong(cVar.f19346o);
    }
}
