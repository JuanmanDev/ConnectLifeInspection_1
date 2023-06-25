package p553f.p554a.p556d.p558b.p559e;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.nio.ByteBuffer;
import p553f.p554a.C8896b;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9034o;
import p630io.flutter.embedding.engine.FlutterJNI;

/* renamed from: f.a.d.b.e.a */
/* compiled from: DartExecutor */
public class C8928a implements C9003c {
    @NonNull

    /* renamed from: e */
    public final FlutterJNI f17512e;
    @NonNull

    /* renamed from: l */
    public final AssetManager f17513l;
    @NonNull

    /* renamed from: m */
    public final C8933b f17514m;
    @NonNull

    /* renamed from: n */
    public final C9003c f17515n;

    /* renamed from: o */
    public boolean f17516o = false;
    @Nullable

    /* renamed from: p */
    public String f17517p;
    @Nullable

    /* renamed from: q */
    public C8932d f17518q;

    /* renamed from: r */
    public final C9003c.C9004a f17519r = new C8929a();

    /* renamed from: f.a.d.b.e.a$a */
    /* compiled from: DartExecutor */
    public class C8929a implements C9003c.C9004a {
        public C8929a() {
        }

        /* renamed from: a */
        public void mo46443a(ByteBuffer byteBuffer, C9003c.C9005b bVar) {
            String unused = C8928a.this.f17517p = C9034o.f17704b.mo46563b(byteBuffer);
            if (C8928a.this.f17518q != null) {
                C8928a.this.f17518q.mo46447a(C8928a.this.f17517p);
            }
        }
    }

    /* renamed from: f.a.d.b.e.a$b */
    /* compiled from: DartExecutor */
    public static class C8930b {
        @NonNull

        /* renamed from: a */
        public final String f17521a;
        @NonNull

        /* renamed from: b */
        public final String f17522b;

        public C8930b(@NonNull String str, @NonNull String str2) {
            this.f17521a = str;
            this.f17522b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8930b.class != obj.getClass()) {
                return false;
            }
            C8930b bVar = (C8930b) obj;
            if (!this.f17521a.equals(bVar.f17521a)) {
                return false;
            }
            return this.f17522b.equals(bVar.f17522b);
        }

        public int hashCode() {
            return (this.f17521a.hashCode() * 31) + this.f17522b.hashCode();
        }

        @NonNull
        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f17521a + ", function: " + this.f17522b + " )";
        }
    }

    /* renamed from: f.a.d.b.e.a$c */
    /* compiled from: DartExecutor */
    public static class C8931c implements C9003c {

        /* renamed from: e */
        public final C8933b f17523e;

        public /* synthetic */ C8931c(C8933b bVar, C8929a aVar) {
            this(bVar);
        }

        @UiThread
        /* renamed from: a */
        public void mo46433a(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable C9003c.C9005b bVar) {
            this.f17523e.mo46433a(str, byteBuffer, bVar);
        }

        @UiThread
        /* renamed from: b */
        public void mo46434b(@NonNull String str, @Nullable C9003c.C9004a aVar) {
            this.f17523e.mo46434b(str, aVar);
        }

        @UiThread
        /* renamed from: d */
        public void mo46435d(@NonNull String str, @Nullable ByteBuffer byteBuffer) {
            this.f17523e.mo46433a(str, byteBuffer, (C9003c.C9005b) null);
        }

        public C8931c(@NonNull C8933b bVar) {
            this.f17523e = bVar;
        }
    }

    /* renamed from: f.a.d.b.e.a$d */
    /* compiled from: DartExecutor */
    public interface C8932d {
        /* renamed from: a */
        void mo46447a(@NonNull String str);
    }

    public C8928a(@NonNull FlutterJNI flutterJNI, @NonNull AssetManager assetManager) {
        this.f17512e = flutterJNI;
        this.f17513l = assetManager;
        C8933b bVar = new C8933b(flutterJNI);
        this.f17514m = bVar;
        bVar.mo46434b("flutter/isolate", this.f17519r);
        this.f17515n = new C8931c(this.f17514m, (C8929a) null);
    }

    @UiThread
    @Deprecated
    /* renamed from: a */
    public void mo46433a(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable C9003c.C9005b bVar) {
        this.f17515n.mo46433a(str, byteBuffer, bVar);
    }

    @UiThread
    @Deprecated
    /* renamed from: b */
    public void mo46434b(@NonNull String str, @Nullable C9003c.C9004a aVar) {
        this.f17515n.mo46434b(str, aVar);
    }

    @UiThread
    @Deprecated
    /* renamed from: d */
    public void mo46435d(@NonNull String str, @Nullable ByteBuffer byteBuffer) {
        this.f17515n.mo46435d(str, byteBuffer);
    }

    /* renamed from: g */
    public void mo46436g(@NonNull C8930b bVar) {
        if (this.f17516o) {
            C8896b.m24033e("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C8896b.m24032d("DartExecutor", "Executing Dart entrypoint: " + bVar);
        this.f17512e.runBundleAndSnapshotFromLibrary(bVar.f17521a, bVar.f17522b, (String) null, this.f17513l);
        this.f17516o = true;
    }

    @NonNull
    /* renamed from: h */
    public C9003c mo46437h() {
        return this.f17515n;
    }

    @Nullable
    /* renamed from: i */
    public String mo46438i() {
        return this.f17517p;
    }

    /* renamed from: j */
    public boolean mo46439j() {
        return this.f17516o;
    }

    /* renamed from: k */
    public void mo46440k() {
        if (this.f17512e.isAttached()) {
            this.f17512e.notifyLowMemoryWarning();
        }
    }

    /* renamed from: l */
    public void mo46441l() {
        C8896b.m24032d("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f17512e.setPlatformMessageHandler(this.f17514m);
    }

    /* renamed from: m */
    public void mo46442m() {
        C8896b.m24032d("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f17512e.setPlatformMessageHandler((C8935c) null);
    }
}
