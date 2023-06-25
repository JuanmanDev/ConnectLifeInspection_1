package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import java.util.HashMap;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C8996b;
import p553f.p554a.p570e.p571a.C9012e;

/* renamed from: f.a.d.b.i.j */
/* compiled from: SystemChannel */
public class C8994j {
    @NonNull

    /* renamed from: a */
    public final C8996b<Object> f17667a;

    public C8994j(@NonNull C8928a aVar) {
        this.f17667a = new C8996b<>(aVar, "flutter/system", C9012e.f17685a);
    }

    /* renamed from: a */
    public void mo46551a() {
        C8896b.m24032d("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f17667a.mo46553c(hashMap);
    }
}
