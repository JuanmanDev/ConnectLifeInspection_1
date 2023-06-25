package p553f.p554a.p576f.p585g;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;

/* renamed from: f.a.f.g.c */
/* compiled from: UrlLauncherPlugin */
public final class C9117c implements C8944a, C8948a {
    @Nullable

    /* renamed from: e */
    public C9114a f17875e;
    @Nullable

    /* renamed from: l */
    public C9115b f17876l;

    public void onAttachedToActivity(@NonNull C8950c cVar) {
        if (this.f17875e == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f17876l.mo46835d(cVar.mo46419d());
        }
    }

    public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
        C9115b bVar2 = new C9115b(bVar.mo46464a(), (Activity) null);
        this.f17876l = bVar2;
        C9114a aVar = new C9114a(bVar2);
        this.f17875e = aVar;
        aVar.mo46830e(bVar.mo46465b());
    }

    public void onDetachedFromActivity() {
        if (this.f17875e == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f17876l.mo46835d((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        C9114a aVar = this.f17875e;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.mo46831f();
        this.f17875e = null;
        this.f17876l = null;
    }

    public void onReattachedToActivityForConfigChanges(@NonNull C8950c cVar) {
        onAttachedToActivity(cVar);
    }
}
