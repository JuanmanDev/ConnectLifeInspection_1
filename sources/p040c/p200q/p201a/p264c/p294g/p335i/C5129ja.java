package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.ja */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5129ja extends C5281ta {
    public C5129ja(int i) {
        super(i, (C5266sa) null);
    }

    /* renamed from: a */
    public final void mo27352a() {
        if (!mo27738j()) {
            for (int i = 0; i < mo27728b(); i++) {
                Map.Entry g = mo27735g(i);
                if (((C5143k8) g.getKey()).mo27359b()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo27729c()) {
                if (((C5143k8) entry.getKey()).mo27359b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo27352a();
    }
}
