package p553f.p554a.p570e.p571a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import p553f.p554a.p570e.p571a.C9003c;
import p630io.flutter.plugin.common.FlutterException;

/* renamed from: f.a.e.a.j */
/* compiled from: MethodChannel */
public class C9017j {

    /* renamed from: a */
    public final C9003c f17689a;

    /* renamed from: b */
    public final String f17690b;

    /* renamed from: c */
    public final C9023k f17691c;

    /* renamed from: f.a.e.a.j$a */
    /* compiled from: MethodChannel */
    public final class C9018a implements C9003c.C9004a {

        /* renamed from: a */
        public final C9021c f17692a;

        /* renamed from: f.a.e.a.j$a$a */
        /* compiled from: MethodChannel */
        public class C9019a implements C9022d {

            /* renamed from: a */
            public final /* synthetic */ C9003c.C9005b f17694a;

            public C9019a(C9003c.C9005b bVar) {
                this.f17694a = bVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f17694a.mo46450a(C9017j.this.f17691c.mo46568e(str, str2, obj));
            }

            public void notImplemented() {
                this.f17694a.mo46450a((ByteBuffer) null);
            }

            public void success(Object obj) {
                this.f17694a.mo46450a(C9017j.this.f17691c.mo46566c(obj));
            }
        }

        public C9018a(C9021c cVar) {
            this.f17692a = cVar;
        }

        @UiThread
        /* renamed from: a */
        public void mo46443a(ByteBuffer byteBuffer, C9003c.C9005b bVar) {
            try {
                this.f17692a.onMethodCall(C9017j.this.f17691c.mo46564a(byteBuffer), new C9019a(bVar));
            } catch (RuntimeException e) {
                "MethodChannel#" + C9017j.this.f17690b;
                bVar.mo46450a(C9017j.this.f17691c.mo46567d("error", e.getMessage(), (Object) null, mo46576b(e)));
            }
        }

        /* renamed from: b */
        public final String mo46576b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    /* renamed from: f.a.e.a.j$b */
    /* compiled from: MethodChannel */
    public final class C9020b implements C9003c.C9005b {

        /* renamed from: a */
        public final C9022d f17696a;

        public C9020b(C9022d dVar) {
            this.f17696a = dVar;
        }

        @UiThread
        /* renamed from: a */
        public void mo46450a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f17696a.notImplemented();
                } catch (RuntimeException unused) {
                    "MethodChannel#" + C9017j.this.f17690b;
                }
            } else {
                try {
                    this.f17696a.success(C9017j.this.f17691c.mo46569f(byteBuffer));
                } catch (FlutterException e) {
                    this.f17696a.error(e.code, e.getMessage(), e.details);
                }
            }
        }
    }

    /* renamed from: f.a.e.a.j$c */
    /* compiled from: MethodChannel */
    public interface C9021c {
        @UiThread
        void onMethodCall(@NonNull C9016i iVar, @NonNull C9022d dVar);
    }

    /* renamed from: f.a.e.a.j$d */
    /* compiled from: MethodChannel */
    public interface C9022d {
        @UiThread
        void error(String str, @Nullable String str2, @Nullable Object obj);

        @UiThread
        void notImplemented();

        @UiThread
        void success(@Nullable Object obj);
    }

    public C9017j(C9003c cVar, String str) {
        this(cVar, str, C9033n.f17701b);
    }

    @UiThread
    /* renamed from: c */
    public void mo46573c(@NonNull String str, @Nullable Object obj) {
        mo46574d(str, obj, (C9022d) null);
    }

    @UiThread
    /* renamed from: d */
    public void mo46574d(String str, @Nullable Object obj, @Nullable C9022d dVar) {
        this.f17689a.mo46433a(this.f17690b, this.f17691c.mo46565b(new C9016i(str, obj)), dVar == null ? null : new C9020b(dVar));
    }

    @UiThread
    /* renamed from: e */
    public void mo46575e(@Nullable C9021c cVar) {
        this.f17689a.mo46434b(this.f17690b, cVar == null ? null : new C9018a(cVar));
    }

    public C9017j(C9003c cVar, String str, C9023k kVar) {
        this.f17689a = cVar;
        this.f17690b = str;
        this.f17691c = kVar;
    }
}
