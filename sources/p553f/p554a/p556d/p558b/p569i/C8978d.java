package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C8996b;
import p553f.p554a.p570e.p571a.C9034o;

/* renamed from: f.a.d.b.i.d */
/* compiled from: LifecycleChannel */
public class C8978d {
    @NonNull

    /* renamed from: a */
    public final C8996b<String> f17620a;

    public C8978d(@NonNull C8928a aVar) {
        this.f17620a = new C8996b<>(aVar, "flutter/lifecycle", C9034o.f17704b);
    }

    /* renamed from: a */
    public void mo46521a() {
        C8896b.m24032d("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f17620a.mo46553c("AppLifecycleState.detached");
    }

    /* renamed from: b */
    public void mo46522b() {
        C8896b.m24032d("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f17620a.mo46553c("AppLifecycleState.inactive");
    }

    /* renamed from: c */
    public void mo46523c() {
        C8896b.m24032d("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f17620a.mo46553c("AppLifecycleState.paused");
    }

    /* renamed from: d */
    public void mo46524d() {
        C8896b.m24032d("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f17620a.mo46553c("AppLifecycleState.resumed");
    }
}
