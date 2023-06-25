package p040c.p200q.p201a.p202a.p205i.p213f0;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* renamed from: c.q.a.a.i.f0.a */
/* compiled from: PriorityMapping */
public final class C2523a {

    /* renamed from: a */
    public static SparseArray<Priority> f2966a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<Priority, Integer> f2967b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f2967b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f2967b.put(Priority.VERY_LOW, 1);
        f2967b.put(Priority.HIGHEST, 2);
        for (Priority next : f2967b.keySet()) {
            f2966a.append(f2967b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m4481a(@NonNull Priority priority) {
        Integer num = f2967b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    /* renamed from: b */
    public static Priority m4482b(int i) {
        Priority priority = f2966a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
