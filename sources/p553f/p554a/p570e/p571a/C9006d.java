package p553f.p554a.p570e.p571a;

import androidx.annotation.UiThread;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p554a.p570e.p571a.C9003c;

/* renamed from: f.a.e.a.d */
/* compiled from: EventChannel */
public final class C9006d {

    /* renamed from: a */
    public final C9003c f17677a;

    /* renamed from: b */
    public final String f17678b;

    /* renamed from: c */
    public final C9023k f17679c;

    /* renamed from: f.a.e.a.d$b */
    /* compiled from: EventChannel */
    public interface C9008b {
        /* renamed from: a */
        void mo46557a();

        void error(String str, String str2, Object obj);

        void success(Object obj);
    }

    /* renamed from: f.a.e.a.d$c */
    /* compiled from: EventChannel */
    public final class C9009c implements C9003c.C9004a {

        /* renamed from: a */
        public final C9011d f17680a;

        /* renamed from: b */
        public final AtomicReference<C9008b> f17681b = new AtomicReference<>((Object) null);

        /* renamed from: f.a.e.a.d$c$a */
        /* compiled from: EventChannel */
        public final class C9010a implements C9008b {

            /* renamed from: a */
            public final AtomicBoolean f17683a;

            public C9010a() {
                this.f17683a = new AtomicBoolean(false);
            }

            @UiThread
            /* renamed from: a */
            public void mo46557a() {
                if (!this.f17683a.getAndSet(true) && C9009c.this.f17681b.get() == this) {
                    C9006d.this.f17677a.mo46435d(C9006d.this.f17678b, (ByteBuffer) null);
                }
            }

            @UiThread
            public void error(String str, String str2, Object obj) {
                if (!this.f17683a.get() && C9009c.this.f17681b.get() == this) {
                    C9006d.this.f17677a.mo46435d(C9006d.this.f17678b, C9006d.this.f17679c.mo46568e(str, str2, obj));
                }
            }

            @UiThread
            public void success(Object obj) {
                if (!this.f17683a.get() && C9009c.this.f17681b.get() == this) {
                    C9006d.this.f17677a.mo46435d(C9006d.this.f17678b, C9006d.this.f17679c.mo46566c(obj));
                }
            }
        }

        public C9009c(C9011d dVar) {
            this.f17680a = dVar;
        }

        /* renamed from: a */
        public void mo46443a(ByteBuffer byteBuffer, C9003c.C9005b bVar) {
            C9016i a = C9006d.this.f17679c.mo46564a(byteBuffer);
            if (a.f17687a.equals("listen")) {
                mo46561d(a.f17688b, bVar);
            } else if (a.f17687a.equals("cancel")) {
                mo46560c(a.f17688b, bVar);
            } else {
                bVar.mo46450a((ByteBuffer) null);
            }
        }

        /* renamed from: c */
        public final void mo46560c(Object obj, C9003c.C9005b bVar) {
            if (this.f17681b.getAndSet((Object) null) != null) {
                try {
                    this.f17680a.onCancel(obj);
                    bVar.mo46450a(C9006d.this.f17679c.mo46566c((Object) null));
                } catch (RuntimeException e) {
                    "EventChannel#" + C9006d.this.f17678b;
                    bVar.mo46450a(C9006d.this.f17679c.mo46568e("error", e.getMessage(), (Object) null));
                }
            } else {
                bVar.mo46450a(C9006d.this.f17679c.mo46568e("error", "No active stream to cancel", (Object) null));
            }
        }

        /* renamed from: d */
        public final void mo46561d(Object obj, C9003c.C9005b bVar) {
            C9010a aVar = new C9010a();
            if (this.f17681b.getAndSet(aVar) != null) {
                try {
                    this.f17680a.onCancel((Object) null);
                } catch (RuntimeException unused) {
                    "EventChannel#" + C9006d.this.f17678b;
                }
            }
            try {
                this.f17680a.onListen(obj, aVar);
                bVar.mo46450a(C9006d.this.f17679c.mo46566c((Object) null));
            } catch (RuntimeException e) {
                this.f17681b.set((Object) null);
                "EventChannel#" + C9006d.this.f17678b;
                bVar.mo46450a(C9006d.this.f17679c.mo46568e("error", e.getMessage(), (Object) null));
            }
        }
    }

    /* renamed from: f.a.e.a.d$d */
    /* compiled from: EventChannel */
    public interface C9011d {
        void onCancel(Object obj);

        void onListen(Object obj, C9008b bVar);
    }

    public C9006d(C9003c cVar, String str) {
        this(cVar, str, C9033n.f17701b);
    }

    @UiThread
    /* renamed from: d */
    public void mo46556d(C9011d dVar) {
        this.f17677a.mo46434b(this.f17678b, dVar == null ? null : new C9009c(dVar));
    }

    public C9006d(C9003c cVar, String str, C9023k kVar) {
        this.f17677a = cVar;
        this.f17678b = str;
        this.f17679c = kVar;
    }
}
