package p630io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p557a.C8907c;
import p553f.p554a.p556d.p557a.C8910d;
import p553f.p554a.p556d.p557a.C8911e;
import p553f.p554a.p556d.p557a.C8914g;
import p553f.p554a.p556d.p557a.C8915h;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.C8927d;
import p553f.p554a.p556d.p558b.p568h.C8969b;
import p553f.p554a.p570e.p575e.C9052d;

/* renamed from: io.flutter.embedding.android.FlutterFragment */
public class FlutterFragment extends Fragment implements C8907c.C8909b {
    @VisibleForTesting

    /* renamed from: e */
    public C8907c f18429e;

    /* renamed from: io.flutter.embedding.android.FlutterFragment$b */
    public static class C9398b {

        /* renamed from: a */
        public final Class<? extends FlutterFragment> f18430a;

        /* renamed from: b */
        public final String f18431b;

        /* renamed from: c */
        public boolean f18432c;

        /* renamed from: d */
        public RenderMode f18433d;

        /* renamed from: e */
        public TransparencyMode f18434e;

        /* renamed from: f */
        public boolean f18435f;

        @NonNull
        /* renamed from: a */
        public <T extends FlutterFragment> T mo47358a() {
            try {
                T t = (FlutterFragment) this.f18430a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t != null) {
                    t.setArguments(mo47359b());
                    return t;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f18430a.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f18430a.getName() + ")", e);
            }
        }

        @NonNull
        /* renamed from: b */
        public Bundle mo47359b() {
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_id", this.f18431b);
            bundle.putBoolean("destroy_engine_with_fragment", this.f18432c);
            RenderMode renderMode = this.f18433d;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString("flutterview_render_mode", renderMode.name());
            TransparencyMode transparencyMode = this.f18434e;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.f18435f);
            return bundle;
        }

        @NonNull
        /* renamed from: c */
        public C9398b mo47360c(boolean z) {
            this.f18432c = z;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C9398b mo47361d(@NonNull RenderMode renderMode) {
            this.f18433d = renderMode;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C9398b mo47362e(boolean z) {
            this.f18435f = z;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C9398b mo47363f(@NonNull TransparencyMode transparencyMode) {
            this.f18434e = transparencyMode;
            return this;
        }

        public C9398b(@NonNull String str) {
            this((Class<? extends FlutterFragment>) FlutterFragment.class, str);
        }

        public C9398b(@NonNull Class<? extends FlutterFragment> cls, @NonNull String str) {
            this.f18432c = false;
            this.f18433d = RenderMode.surface;
            this.f18434e = TransparencyMode.transparent;
            this.f18435f = true;
            this.f18430a = cls;
            this.f18431b = str;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragment$c */
    public static class C9399c {

        /* renamed from: a */
        public final Class<? extends FlutterFragment> f18436a = FlutterFragment.class;

        /* renamed from: b */
        public String f18437b = "main";

        /* renamed from: c */
        public String f18438c = "/";

        /* renamed from: d */
        public String f18439d = null;

        /* renamed from: e */
        public C8927d f18440e = null;

        /* renamed from: f */
        public RenderMode f18441f = RenderMode.surface;

        /* renamed from: g */
        public TransparencyMode f18442g = TransparencyMode.transparent;

        /* renamed from: h */
        public boolean f18443h = true;

        @NonNull
        /* renamed from: a */
        public C9399c mo47364a(@NonNull String str) {
            this.f18439d = str;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public <T extends FlutterFragment> T mo47365b() {
            try {
                T t = (FlutterFragment) this.f18436a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t != null) {
                    t.setArguments(mo47366c());
                    return t;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f18436a.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f18436a.getName() + ")", e);
            }
        }

        @NonNull
        /* renamed from: c */
        public Bundle mo47366c() {
            Bundle bundle = new Bundle();
            bundle.putString("initial_route", this.f18438c);
            bundle.putString("app_bundle_path", this.f18439d);
            bundle.putString("dart_entrypoint", this.f18437b);
            C8927d dVar = this.f18440e;
            if (dVar != null) {
                bundle.putStringArray("initialization_args", dVar.mo46432b());
            }
            RenderMode renderMode = this.f18441f;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString("flutterview_render_mode", renderMode.name());
            TransparencyMode transparencyMode = this.f18442g;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.f18443h);
            bundle.putBoolean("destroy_engine_with_fragment", true);
            return bundle;
        }

        @NonNull
        /* renamed from: d */
        public C9399c mo47367d(@NonNull String str) {
            this.f18437b = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C9399c mo47368e(@NonNull C8927d dVar) {
            this.f18440e = dVar;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C9399c mo47369f(@NonNull String str) {
            this.f18438c = str;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public C9399c mo47370g(@NonNull RenderMode renderMode) {
            this.f18441f = renderMode;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public C9399c mo47371h(boolean z) {
            this.f18443h = z;
            return this;
        }

        @NonNull
        /* renamed from: i */
        public C9399c mo47372i(@NonNull TransparencyMode transparencyMode) {
            this.f18442g = transparencyMode;
            return this;
        }
    }

    public FlutterFragment() {
        setArguments(new Bundle());
    }

    @NonNull
    /* renamed from: s */
    public static C9398b m25349s(@NonNull String str) {
        return new C9398b(str);
    }

    @NonNull
    /* renamed from: t */
    public static C9399c m25350t() {
        return new C9399c();
    }

    /* renamed from: a */
    public void mo46344a() {
        FragmentActivity activity = getActivity();
        if (activity instanceof C8969b) {
            ((C8969b) activity).mo46342a();
        }
    }

    /* renamed from: b */
    public void mo46345b() {
        FragmentActivity activity = getActivity();
        if (activity instanceof C8969b) {
            ((C8969b) activity).mo46343b();
        }
    }

    public void cleanUpFlutterEngine(@NonNull C8916a aVar) {
        FragmentActivity activity = getActivity();
        if (activity instanceof C8910d) {
            ((C8910d) activity).cleanUpFlutterEngine(aVar);
        }
    }

    public void configureFlutterEngine(@NonNull C8916a aVar) {
        FragmentActivity activity = getActivity();
        if (activity instanceof C8910d) {
            ((C8910d) activity).configureFlutterEngine(aVar);
        }
    }

    @Nullable
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Activity mo46347d() {
        return super.getActivity();
    }

    /* renamed from: g */
    public boolean mo46348g() {
        if (getArguments().containsKey("enable_state_restoration")) {
            return getArguments().getBoolean("enable_state_restoration");
        }
        return getCachedEngineId() == null;
    }

    @NonNull
    public String getAppBundlePath() {
        return getArguments().getString("app_bundle_path");
    }

    @Nullable
    public String getCachedEngineId() {
        return getArguments().getString("cached_engine_id", (String) null);
    }

    @NonNull
    public String getDartEntrypointFunctionName() {
        return getArguments().getString("dart_entrypoint", "main");
    }

    @Nullable
    public String getInitialRoute() {
        return getArguments().getString("initial_route");
    }

    @NonNull
    public RenderMode getRenderMode() {
        return RenderMode.valueOf(getArguments().getString("flutterview_render_mode", RenderMode.surface.name()));
    }

    @Nullable
    /* renamed from: h */
    public C9052d mo46356h(@Nullable Activity activity, @NonNull C8916a aVar) {
        if (activity != null) {
            return new C9052d(getActivity(), aVar.mo46377n());
        }
        return null;
    }

    /* renamed from: k */
    public void mo46357k(@NonNull FlutterTextureView flutterTextureView) {
    }

    /* renamed from: l */
    public void mo46358l(@NonNull FlutterSurfaceView flutterSurfaceView) {
    }

    @NonNull
    /* renamed from: m */
    public C8927d mo46359m() {
        String[] stringArray = getArguments().getStringArray("initialization_args");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return new C8927d(stringArray);
    }

    @NonNull
    /* renamed from: o */
    public TransparencyMode mo46360o() {
        return TransparencyMode.valueOf(getArguments().getString("flutterview_transparency_mode", TransparencyMode.transparent.name()));
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f18429e.mo46322f(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f18429e.mo46323g(i, i2, intent);
    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        C8907c cVar = new C8907c(this);
        this.f18429e = cVar;
        cVar.mo46324h(context);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f18429e.mo46326j(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f18429e.mo46327k();
    }

    public void onDetach() {
        super.onDetach();
        this.f18429e.mo46328l();
        this.f18429e.mo46340x();
        this.f18429e = null;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f18429e.mo46329m();
    }

    public void onNewIntent(@NonNull Intent intent) {
        this.f18429e.mo46330n(intent);
    }

    public void onPause() {
        super.onPause();
        this.f18429e.mo46331o();
    }

    public void onPostResume() {
        this.f18429e.mo46332p();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f18429e.mo46333q(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f18429e.mo46334r();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f18429e.mo46335s(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f18429e.mo46336t();
    }

    public void onStop() {
        super.onStop();
        this.f18429e.mo46337u();
    }

    public void onTrimMemory(int i) {
        this.f18429e.mo46338v(i);
    }

    public void onUserLeaveHint() {
        this.f18429e.mo46339w();
    }

    @Nullable
    public C8916a provideFlutterEngine(@NonNull Context context) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C8911e)) {
            return null;
        }
        C8896b.m24032d("FlutterFragment", "Deferring to attached Activity to provide a FlutterEngine.");
        return ((C8911e) activity).provideFlutterEngine(getContext());
    }

    @Nullable
    public C8914g provideSplashScreen() {
        FragmentActivity activity = getActivity();
        if (activity instanceof C8915h) {
            return ((C8915h) activity).provideSplashScreen();
        }
        return null;
    }

    @Nullable
    /* renamed from: q */
    public C8916a mo47356q() {
        return this.f18429e.mo46320d();
    }

    /* renamed from: r */
    public void mo47357r() {
        this.f18429e.mo46325i();
    }

    public boolean shouldAttachEngineToActivity() {
        return getArguments().getBoolean("should_attach_engine_to_activity");
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean z = getArguments().getBoolean("destroy_engine_with_fragment", false);
        return (getCachedEngineId() != null || this.f18429e.mo46321e()) ? z : getArguments().getBoolean("destroy_engine_with_fragment", true);
    }
}
