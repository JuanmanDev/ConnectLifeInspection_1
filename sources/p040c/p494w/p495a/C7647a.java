package p040c.p494w.p495a;

import android.app.Activity;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9006d;

/* renamed from: c.w.a.a */
/* compiled from: FlutterKeyboardVisibilityPlugin */
public class C7647a implements C8944a, C8948a, C9006d.C9011d {

    /* renamed from: e */
    public C9006d.C9008b f14379e;

    /* renamed from: l */
    public View f14380l;

    /* renamed from: m */
    public boolean f14381m;

    /* renamed from: c.w.a.a$a */
    /* compiled from: FlutterKeyboardVisibilityPlugin */
    public class C7648a implements OnApplyWindowInsetsListener {
        public C7648a() {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            boolean unused = C7647a.this.f14381m = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
            if (C7647a.this.f14379e != null) {
                C7647a.this.f14379e.success(Integer.valueOf(C7647a.this.f14381m ? 1 : 0));
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: d */
    public final void mo33079d(C9003c cVar) {
        new C9006d(cVar, "flutter_keyboard_visibility").mo46556d(this);
    }

    /* renamed from: e */
    public final void mo33080e(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        this.f14380l = findViewById;
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new C7648a());
    }

    /* renamed from: f */
    public final void mo33081f() {
        View view = this.f14380l;
        if (view != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, (OnApplyWindowInsetsListener) null);
            this.f14380l = null;
        }
    }

    public void onAttachedToActivity(C8950c cVar) {
        mo33080e(cVar.mo46419d());
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo33079d(bVar.mo46465b());
    }

    public void onCancel(Object obj) {
        this.f14379e = null;
    }

    public void onDetachedFromActivity() {
        mo33081f();
    }

    public void onDetachedFromActivityForConfigChanges() {
        mo33081f();
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        mo33081f();
    }

    public void onListen(Object obj, C9006d.C9008b bVar) {
        this.f14379e = bVar;
    }

    public void onReattachedToActivityForConfigChanges(C8950c cVar) {
        mo33080e(cVar.mo46419d());
    }
}
