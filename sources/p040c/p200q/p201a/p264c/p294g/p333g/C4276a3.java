package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.a3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4276a3 extends C4573l3 {
    public C4276a3(int i) {
        super(i, (C4546k3) null);
    }

    /* renamed from: a */
    public final void mo25779a() {
        if (!mo26243j()) {
            for (int i = 0; i < mo26233b(); i++) {
                Map.Entry g = mo26240g(i);
                if (((C4328c1) g.getKey()).mo25840b()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo26234c()) {
                if (((C4328c1) entry.getKey()).mo25840b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo25779a();
    }
}
