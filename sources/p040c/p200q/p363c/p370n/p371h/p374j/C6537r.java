package p040c.p200q.p363c.p370n.p371h.p374j;

import java.io.File;
import java.io.IOException;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;

/* renamed from: c.q.c.n.h.j.r */
/* compiled from: CrashlyticsFileMarker */
public class C6537r {

    /* renamed from: a */
    public final String f12320a;

    /* renamed from: b */
    public final C6677f f12321b;

    public C6537r(String str, C6677f fVar) {
        this.f12320a = str;
        this.f12321b = fVar;
    }

    /* renamed from: a */
    public boolean mo30776a() {
        try {
            return mo30777b().createNewFile();
        } catch (IOException e) {
            C6479f f = C6479f.m18125f();
            f.mo30644e("Error creating marker: " + this.f12320a, e);
            return false;
        }
    }

    /* renamed from: b */
    public final File mo30777b() {
        return this.f12321b.mo31284e(this.f12320a);
    }

    /* renamed from: c */
    public boolean mo30778c() {
        return mo30777b().exists();
    }

    /* renamed from: d */
    public boolean mo30779d() {
        return mo30777b().delete();
    }
}
