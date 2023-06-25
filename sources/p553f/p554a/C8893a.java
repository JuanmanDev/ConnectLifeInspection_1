package p553f.p554a;

import androidx.annotation.NonNull;
import java.io.PrintStream;
import p553f.p554a.p556d.p558b.p560f.C8938c;

/* renamed from: f.a.a */
/* compiled from: FlutterInjector */
public final class C8893a {

    /* renamed from: c */
    public static C8893a f17417c;

    /* renamed from: a */
    public boolean f17418a;

    /* renamed from: b */
    public C8938c f17419b;

    /* renamed from: f.a.a$b */
    /* compiled from: FlutterInjector */
    public static final class C8895b {

        /* renamed from: a */
        public boolean f17420a = true;

        /* renamed from: b */
        public C8938c f17421b;

        /* renamed from: a */
        public C8893a mo46258a() {
            mo46259b();
            PrintStream printStream = System.out;
            printStream.println("should load native is " + this.f17420a);
            return new C8893a(this.f17420a, this.f17421b);
        }

        /* renamed from: b */
        public final void mo46259b() {
            if (this.f17421b == null) {
                this.f17421b = new C8938c();
            }
        }
    }

    /* renamed from: b */
    public static C8893a m24024b() {
        if (f17417c == null) {
            f17417c = new C8895b().mo46258a();
        }
        return f17417c;
    }

    @NonNull
    /* renamed from: a */
    public C8938c mo46256a() {
        return this.f17419b;
    }

    /* renamed from: c */
    public boolean mo46257c() {
        return this.f17418a;
    }

    public C8893a(boolean z, @NonNull C8938c cVar) {
        this.f17418a = z;
        this.f17419b = cVar;
    }
}
