package p553f.p554a.p589h;

import android.view.Choreographer;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import p630io.flutter.embedding.engine.FlutterJNI;

/* renamed from: f.a.h.g */
/* compiled from: VsyncWaiter */
public class C9179g {

    /* renamed from: c */
    public static C9179g f17976c;
    @NonNull

    /* renamed from: a */
    public final WindowManager f17977a;

    /* renamed from: b */
    public final FlutterJNI.C9416b f17978b = new C9180a();

    /* renamed from: f.a.h.g$a */
    /* compiled from: VsyncWaiter */
    public class C9180a implements FlutterJNI.C9416b {

        /* renamed from: f.a.h.g$a$a */
        /* compiled from: VsyncWaiter */
        public class C9181a implements Choreographer.FrameCallback {

            /* renamed from: e */
            public final /* synthetic */ long f17980e;

            public C9181a(long j) {
                this.f17980e = j;
            }

            public void doFrame(long j) {
                FlutterJNI.nativeOnVsync(j, j + ((long) (1.0E9d / ((double) C9179g.this.f17977a.getDefaultDisplay().getRefreshRate()))), this.f17980e);
            }
        }

        public C9180a() {
        }

        /* renamed from: a */
        public void mo46969a(long j) {
            Choreographer.getInstance().postFrameCallback(new C9181a(j));
        }
    }

    public C9179g(@NonNull WindowManager windowManager) {
        this.f17977a = windowManager;
    }

    @NonNull
    /* renamed from: b */
    public static C9179g m24900b(@NonNull WindowManager windowManager) {
        if (f17976c == null) {
            f17976c = new C9179g(windowManager);
        }
        return f17976c;
    }

    /* renamed from: c */
    public void mo46968c() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.f17978b);
        FlutterJNI.setRefreshRateFPS(this.f17977a.getDefaultDisplay().getRefreshRate());
    }
}
