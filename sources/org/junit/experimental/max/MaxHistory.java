package org.junit.experimental.max;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.p679h.C9757a;

public class MaxHistory implements Serializable {
    public static final long serialVersionUID = 1;
    public final Map<String, Long> fDurations = new HashMap();
    public final Map<String, Long> fFailureTimestamps = new HashMap();
    public final File fHistoryStore;

    /* renamed from: org.junit.experimental.max.MaxHistory$b */
    public final class C9981b extends C9757a {

        /* renamed from: a */
        public long f19337a;

        /* renamed from: b */
        public Map<Description, Long> f19338b;

        public C9981b() {
            this.f19337a = System.currentTimeMillis();
            this.f19338b = new HashMap();
        }

        public void testFailure(Failure failure) {
            MaxHistory.this.putTestFailureTimestamp(failure.getDescription(), this.f19337a);
        }

        public void testFinished(Description description) {
            MaxHistory.this.putTestDuration(description, System.nanoTime() - this.f19338b.get(description).longValue());
        }

        public void testRunFinished(Result result) {
            MaxHistory.this.save();
        }

        public void testStarted(Description description) {
            this.f19338b.put(description, Long.valueOf(System.nanoTime()));
        }
    }

    /* renamed from: org.junit.experimental.max.MaxHistory$c */
    public class C9982c implements Comparator<Description> {
        public C9982c() {
        }

        /* renamed from: a */
        public int compare(Description description, Description description2) {
            if (MaxHistory.this.isNewTest(description)) {
                return -1;
            }
            if (MaxHistory.this.isNewTest(description2)) {
                return 1;
            }
            int compareTo = mo53478b(description2).compareTo(mo53478b(description));
            return compareTo != 0 ? compareTo : MaxHistory.this.getTestDuration(description).compareTo(MaxHistory.this.getTestDuration(description2));
        }

        /* renamed from: b */
        public final Long mo53478b(Description description) {
            Long failureTimestamp = MaxHistory.this.getFailureTimestamp(description);
            if (failureTimestamp == null) {
                return 0L;
            }
            return failureTimestamp;
        }
    }

    public MaxHistory(File file) {
        this.fHistoryStore = file;
    }

    public static MaxHistory forFolder(File file) {
        if (file.exists()) {
            try {
                return readHistory(file);
            } catch (CouldNotReadCoreException e) {
                e.printStackTrace();
                file.delete();
            }
        }
        return new MaxHistory(file);
    }

    public static MaxHistory readHistory(File file) {
        ObjectInputStream objectInputStream;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                MaxHistory maxHistory = (MaxHistory) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                return maxHistory;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (Exception e) {
            throw new CouldNotReadCoreException(e);
        }
    }

    /* access modifiers changed from: private */
    public void save() {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.fHistoryStore));
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    public Long getFailureTimestamp(Description description) {
        return this.fFailureTimestamps.get(description.toString());
    }

    public Long getTestDuration(Description description) {
        return this.fDurations.get(description.toString());
    }

    public boolean isNewTest(Description description) {
        return !this.fDurations.containsKey(description.toString());
    }

    public C9757a listener() {
        return new C9981b();
    }

    public void putTestDuration(Description description, long j) {
        this.fDurations.put(description.toString(), Long.valueOf(j));
    }

    public void putTestFailureTimestamp(Description description, long j) {
        this.fFailureTimestamps.put(description.toString(), Long.valueOf(j));
    }

    public Comparator<Description> testComparator() {
        return new C9982c();
    }
}
