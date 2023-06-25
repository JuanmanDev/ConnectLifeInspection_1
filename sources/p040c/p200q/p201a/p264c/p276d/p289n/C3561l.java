package p040c.p200q.p201a.p264c.p276d.p289n;

import androidx.annotation.NonNull;
import androidx.test.internal.runner.RunnerArgs;
import java.util.HashMap;

/* renamed from: c.q.a.c.d.n.l */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3561l {
    /* renamed from: a */
    public static void m9079a(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
