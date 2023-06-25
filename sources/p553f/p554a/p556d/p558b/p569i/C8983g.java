package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9013f;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.d.b.i.g */
/* compiled from: NavigationChannel */
public class C8983g {
    @NonNull

    /* renamed from: a */
    public final C9017j f17626a;

    public C8983g(@NonNull C8928a aVar) {
        this.f17626a = new C9017j(aVar, "flutter/navigation", C9013f.f17686a);
    }

    /* renamed from: a */
    public void mo46528a() {
        C8896b.m24032d("NavigationChannel", "Sending message to pop route.");
        this.f17626a.mo46573c("popRoute", (Object) null);
    }

    /* renamed from: b */
    public void mo46529b(@NonNull String str) {
        C8896b.m24032d("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f17626a.mo46573c("setInitialRoute", str);
    }
}
