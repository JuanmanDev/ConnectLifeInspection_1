package p630io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p557a.C8904a;
import p553f.p554a.p556d.p557a.C8906b;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p568h.C8969b;
import p553f.p554a.p556d.p558b.p568h.C8970c;
import p553f.p554a.p570e.p572b.C9038c;
import p553f.p554a.p570e.p573c.C9044a;
import p553f.p554a.p570e.p574d.C9045a;
import p630io.flutter.embedding.android.FlutterImageView;
import p630io.flutter.embedding.engine.systemchannels.SettingsChannel;
import p630io.flutter.view.AccessibilityBridge;

/* renamed from: io.flutter.embedding.android.FlutterView */
public class FlutterView extends FrameLayout implements C9045a.C9048c {

    /* renamed from: A */
    public final AccessibilityBridge.C9447h f18482A;

    /* renamed from: B */
    public final C8969b f18483B;
    @Nullable

    /* renamed from: e */
    public FlutterSurfaceView f18484e;
    @Nullable

    /* renamed from: l */
    public FlutterTextureView f18485l;
    @Nullable

    /* renamed from: m */
    public FlutterImageView f18486m;
    @Nullable

    /* renamed from: n */
    public C8970c f18487n;
    @Nullable

    /* renamed from: o */
    public C8970c f18488o;

    /* renamed from: p */
    public final Set<C8969b> f18489p;

    /* renamed from: q */
    public boolean f18490q;
    @Nullable

    /* renamed from: r */
    public C8916a f18491r;
    @NonNull

    /* renamed from: s */
    public final Set<C9413d> f18492s;
    @Nullable

    /* renamed from: t */
    public C9045a f18493t;
    @Nullable

    /* renamed from: u */
    public C9038c f18494u;
    @Nullable

    /* renamed from: v */
    public C9044a f18495v;
    @Nullable

    /* renamed from: w */
    public C8904a f18496w;
    @Nullable

    /* renamed from: x */
    public C8906b f18497x;
    @Nullable

    /* renamed from: y */
    public AccessibilityBridge f18498y;

    /* renamed from: z */
    public final C8964a.C8968c f18499z;

    @Deprecated
    /* renamed from: io.flutter.embedding.android.FlutterView$RenderMode */
    public enum RenderMode {
        surface,
        texture,
        image
    }

    @Deprecated
    /* renamed from: io.flutter.embedding.android.FlutterView$TransparencyMode */
    public enum TransparencyMode {
        opaque,
        transparent
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$a */
    public class C9410a implements AccessibilityBridge.C9447h {
        public C9410a() {
        }

        /* renamed from: a */
        public void mo47458a(boolean z, boolean z2) {
            FlutterView.this.mo47454u(z, z2);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$b */
    public class C9411b implements C8969b {
        public C9411b() {
        }

        /* renamed from: a */
        public void mo46342a() {
            boolean unused = FlutterView.this.f18490q = false;
            for (C8969b a : FlutterView.this.f18489p) {
                a.mo46342a();
            }
        }

        /* renamed from: b */
        public void mo46343b() {
            boolean unused = FlutterView.this.f18490q = true;
            for (C8969b b : FlutterView.this.f18489p) {
                b.mo46343b();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$c */
    public class C9412c implements C8969b {

        /* renamed from: a */
        public final /* synthetic */ C8964a f18502a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f18503b;

        public C9412c(C8964a aVar, Runnable runnable) {
            this.f18502a = aVar;
            this.f18503b = runnable;
        }

        /* renamed from: a */
        public void mo46342a() {
        }

        /* renamed from: b */
        public void mo46343b() {
            this.f18502a.mo46487l(this);
            this.f18503b.run();
            FlutterView.this.f18486m.mo46500b();
        }
    }

    @VisibleForTesting
    /* renamed from: io.flutter.embedding.android.FlutterView$d */
    public interface C9413d {
        /* renamed from: a */
        void mo47406a();

        /* renamed from: b */
        void mo47407b(@NonNull C8916a aVar);
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$e */
    public enum C9414e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(@NonNull Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f18494u.mo46621j(sparseArray);
    }

    @RequiresApi(24)
    @TargetApi(24)
    @NonNull
    /* renamed from: c */
    public PointerIcon mo46652c(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean checkInputConnectionProxy(View view) {
        C8916a aVar = this.f18491r;
        if (aVar != null) {
            return aVar.mo46378o().mo46713w(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    /* renamed from: f */
    public boolean mo47426f() {
        FlutterImageView flutterImageView = this.f18486m;
        if (flutterImageView != null) {
            return flutterImageView.mo47386c();
        }
        return false;
    }

    public boolean fitSystemWindows(@NonNull Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        C8964a.C8968c cVar = this.f18499z;
        cVar.f17586d = rect.top;
        cVar.f17587e = rect.right;
        cVar.f17588f = 0;
        cVar.f17589g = rect.left;
        cVar.f17590h = 0;
        cVar.f17591i = 0;
        cVar.f17592j = rect.bottom;
        cVar.f17593k = 0;
        C8896b.m24032d("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f18499z.f17586d + ", Left: " + this.f18499z.f17589g + ", Right: " + this.f18499z.f17587e + "\nKeyboard insets: Bottom: " + this.f18499z.f17592j + ", Left: " + this.f18499z.f17593k + ", Right: " + this.f18499z.f17591i);
        mo47457x();
        return true;
    }

    @VisibleForTesting
    /* renamed from: g */
    public void mo47428g(@NonNull C9413d dVar) {
        this.f18492s.add(dVar);
    }

    @Nullable
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.f18498y;
        if (accessibilityBridge == null || !accessibilityBridge.mo47605w()) {
            return null;
        }
        return this.f18498y;
    }

    @VisibleForTesting
    @Nullable
    public C8916a getAttachedFlutterEngine() {
        return this.f18491r;
    }

    /* renamed from: h */
    public void mo47431h(@NonNull C8969b bVar) {
        this.f18489p.add(bVar);
    }

    /* renamed from: i */
    public void mo47432i(FlutterImageView flutterImageView) {
        C8916a aVar = this.f18491r;
        if (aVar != null) {
            flutterImageView.mo46499a(aVar.mo46380q());
        }
    }

    /* renamed from: j */
    public void mo47433j(@NonNull C8916a aVar) {
        C8896b.m24032d("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (mo47451r()) {
            if (aVar == this.f18491r) {
                C8896b.m24032d("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                C8896b.m24032d("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                mo47437n();
            }
        }
        this.f18491r = aVar;
        C8964a q = aVar.mo46380q();
        this.f18490q = q.mo46483h();
        this.f18487n.mo46499a(q);
        q.mo46481f(this.f18483B);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f18493t = new C9045a(this, this.f18491r.mo46375l());
        }
        this.f18494u = new C9038c(this, this.f18491r.mo46384u(), this.f18491r.mo46378o());
        this.f18495v = this.f18491r.mo46374k();
        this.f18496w = new C8904a(this, this.f18491r.mo46372i(), this.f18494u);
        this.f18497x = new C8906b(this.f18491r.mo46380q(), false);
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, aVar.mo46369f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f18491r.mo46378o());
        this.f18498y = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.f18482A);
        mo47454u(this.f18498y.mo47605w(), this.f18498y.mo47606x());
        this.f18491r.mo46378o().mo46684a(this.f18498y);
        this.f18491r.mo46378o().mo46711u(this.f18491r.mo46380q());
        this.f18494u.mo46626o().restartInput(this);
        mo47456w();
        this.f18495v.mo46649b(getResources().getConfiguration());
        mo47457x();
        aVar.mo46378o().mo46712v(this);
        for (C9413d b : this.f18492s) {
            b.mo47407b(aVar);
        }
        if (this.f18490q) {
            this.f18483B.mo46343b();
        }
    }

    /* renamed from: k */
    public final C9414e mo47434k() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return C9414e.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? C9414e.LEFT : C9414e.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return C9414e.BOTH;
            }
        }
        return C9414e.NONE;
    }

    /* renamed from: l */
    public void mo47435l() {
        this.f18487n.pause();
        FlutterImageView flutterImageView = this.f18486m;
        if (flutterImageView == null) {
            FlutterImageView m = mo47436m();
            this.f18486m = m;
            addView(m);
        } else {
            flutterImageView.mo47388f(getWidth(), getHeight());
        }
        this.f18488o = this.f18487n;
        FlutterImageView flutterImageView2 = this.f18486m;
        this.f18487n = flutterImageView2;
        C8916a aVar = this.f18491r;
        if (aVar != null) {
            flutterImageView2.mo46499a(aVar.mo46380q());
        }
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: m */
    public FlutterImageView mo47436m() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    /* renamed from: n */
    public void mo47437n() {
        C8896b.m24032d("FlutterView", "Detaching from a FlutterEngine: " + this.f18491r);
        if (!mo47451r()) {
            C8896b.m24032d("FlutterView", "Not attached to an engine. Doing nothing.");
            return;
        }
        for (C9413d a : this.f18492s) {
            a.mo47406a();
        }
        this.f18491r.mo46378o().mo46688B();
        this.f18491r.mo46378o().mo46685b();
        this.f18498y.mo47584E();
        this.f18498y = null;
        this.f18494u.mo46626o().restartInput(this);
        this.f18494u.mo46625n();
        this.f18496w.mo46304b();
        C9045a aVar = this.f18493t;
        if (aVar != null) {
            aVar.mo46650c();
        }
        C8964a q = this.f18491r.mo46380q();
        this.f18490q = false;
        q.mo46487l(this.f18483B);
        q.mo46491p();
        q.mo46488m(false);
        this.f18487n.mo46500b();
        this.f18486m = null;
        this.f18488o = null;
        this.f18491r = null;
    }

    @RequiresApi(20)
    @TargetApi(20)
    /* renamed from: o */
    public final int mo47438o(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    @RequiresApi(20)
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    @NonNull
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        int i;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (Build.VERSION.SDK_INT == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            C8964a.C8968c cVar = this.f18499z;
            cVar.f17594l = systemGestureInsets.top;
            cVar.f17595m = systemGestureInsets.right;
            cVar.f17596n = systemGestureInsets.bottom;
            cVar.f17597o = systemGestureInsets.left;
        }
        boolean z = true;
        int i2 = 0;
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (z) {
                i2 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z2) {
                i2 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i2);
            C8964a.C8968c cVar2 = this.f18499z;
            cVar2.f17586d = insets.top;
            cVar2.f17587e = insets.right;
            cVar2.f17588f = insets.bottom;
            cVar2.f17589g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            C8964a.C8968c cVar3 = this.f18499z;
            cVar3.f17590h = insets2.top;
            cVar3.f17591i = insets2.right;
            cVar3.f17592j = insets2.bottom;
            cVar3.f17593k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            C8964a.C8968c cVar4 = this.f18499z;
            cVar4.f17594l = insets3.top;
            cVar4.f17595m = insets3.right;
            cVar4.f17596n = insets3.bottom;
            cVar4.f17597o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                C8964a.C8968c cVar5 = this.f18499z;
                cVar5.f17586d = Math.max(Math.max(cVar5.f17586d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                C8964a.C8968c cVar6 = this.f18499z;
                cVar6.f17587e = Math.max(Math.max(cVar6.f17587e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                C8964a.C8968c cVar7 = this.f18499z;
                cVar7.f17588f = Math.max(Math.max(cVar7.f17588f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                C8964a.C8968c cVar8 = this.f18499z;
                cVar8.f17589g = Math.max(Math.max(cVar8.f17589g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            C9414e eVar = C9414e.NONE;
            if (!z) {
                eVar = mo47434k();
            }
            this.f18499z.f17586d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f18499z.f17587e = (eVar == C9414e.RIGHT || eVar == C9414e.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            C8964a.C8968c cVar9 = this.f18499z;
            cVar9.f17588f = 0;
            cVar9.f17589g = (eVar == C9414e.LEFT || eVar == C9414e.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            C8964a.C8968c cVar10 = this.f18499z;
            cVar10.f17590h = 0;
            cVar10.f17591i = 0;
            if (z) {
                i = windowInsets.getSystemWindowInsetBottom();
            } else {
                i = mo47438o(windowInsets);
            }
            cVar10.f17592j = i;
            this.f18499z.f17593k = 0;
        }
        C8896b.m24032d("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f18499z.f17586d + ", Left: " + this.f18499z.f17589g + ", Right: " + this.f18499z.f17587e + "\nKeyboard insets: Bottom: " + this.f18499z.f17592j + ", Left: " + this.f18499z.f17593k + ", Right: " + this.f18499z.f17591i + "System Gesture Insets - Left: " + this.f18499z.f17597o + ", Top: " + this.f18499z.f17594l + ", Right: " + this.f18499z.f17595m + ", Bottom: " + this.f18499z.f17592j);
        mo47457x();
        return onApplyWindowInsets;
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f18491r != null) {
            C8896b.m24032d("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f18495v.mo46649b(configuration);
            mo47456w();
        }
    }

    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        if (!mo47451r()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.f18494u.mo46624m(this, editorInfo);
    }

    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        if (mo47451r() && this.f18497x.mo46315d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!mo47451r()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f18498y.mo47581B(motionEvent);
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!mo47451r()) {
            return super.onKeyDown(i, keyEvent);
        }
        return this.f18496w.mo46305c(keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        if (!mo47451r()) {
            return super.onKeyUp(i, keyEvent);
        }
        return this.f18496w.mo46306d(keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f18494u.mo46635y(viewStructure, i);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C8896b.m24032d("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        C8964a.C8968c cVar = this.f18499z;
        cVar.f17584b = i;
        cVar.f17585c = i2;
        mo47457x();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!mo47451r()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f18497x.mo46316e(motionEvent);
    }

    /* renamed from: p */
    public boolean mo47449p() {
        return this.f18490q;
    }

    /* renamed from: q */
    public final void mo47450q() {
        C8896b.m24032d("FlutterView", "Initializing FlutterView");
        if (this.f18484e != null) {
            C8896b.m24032d("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f18484e);
        } else if (this.f18485l != null) {
            C8896b.m24032d("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f18485l);
        } else {
            C8896b.m24032d("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f18486m);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    @VisibleForTesting
    /* renamed from: r */
    public boolean mo47451r() {
        C8916a aVar = this.f18491r;
        return aVar != null && aVar.mo46380q() == this.f18487n.getAttachedRenderer();
    }

    @VisibleForTesting
    /* renamed from: s */
    public void mo47452s(@NonNull C9413d dVar) {
        this.f18492s.remove(dVar);
    }

    /* renamed from: t */
    public void mo47453t(@NonNull C8969b bVar) {
        this.f18489p.remove(bVar);
    }

    /* renamed from: u */
    public final void mo47454u(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.f18491r.mo46380q().mo46484i()) {
            if (!z && !z2) {
                z3 = true;
            }
            setWillNotDraw(z3);
            return;
        }
        setWillNotDraw(false);
    }

    /* renamed from: v */
    public void mo47455v(@NonNull Runnable runnable) {
        FlutterImageView flutterImageView = this.f18486m;
        if (flutterImageView == null) {
            C8896b.m24032d("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        C8970c cVar = this.f18488o;
        if (cVar == null) {
            C8896b.m24032d("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f18487n = cVar;
        this.f18488o = null;
        C8916a aVar = this.f18491r;
        if (aVar == null) {
            flutterImageView.mo46500b();
            runnable.run();
            return;
        }
        C8964a q = aVar.mo46380q();
        if (q == null) {
            this.f18486m.mo46500b();
            runnable.run();
            return;
        }
        this.f18487n.mo46499a(q);
        q.mo46481f(new C9412c(q, runnable));
    }

    @VisibleForTesting
    /* renamed from: w */
    public void mo47456w() {
        SettingsChannel.PlatformBrightness platformBrightness = (getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        SettingsChannel.C9423a a = this.f18491r.mo46382s().mo47529a();
        a.mo47532c(getResources().getConfiguration().fontScale);
        a.mo47533d(DateFormat.is24HourFormat(getContext()));
        a.mo47531b(platformBrightness);
        a.mo47530a();
    }

    /* renamed from: x */
    public final void mo47457x() {
        if (!mo47451r()) {
            C8896b.m24033e("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f18499z.f17583a = getResources().getDisplayMetrics().density;
        this.f18491r.mo46380q().mo46489n(this.f18499z);
    }

    public FlutterView(@NonNull Context context, @NonNull FlutterSurfaceView flutterSurfaceView) {
        this(context, (AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(@NonNull Context context, @NonNull FlutterTextureView flutterTextureView) {
        this(context, (AttributeSet) null, flutterTextureView);
    }

    public FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    public FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.f18489p = new HashSet();
        this.f18492s = new HashSet();
        this.f18499z = new C8964a.C8968c();
        this.f18482A = new C9410a();
        this.f18483B = new C9411b();
        this.f18484e = flutterSurfaceView;
        this.f18487n = flutterSurfaceView;
        mo47450q();
    }

    public FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.f18489p = new HashSet();
        this.f18492s = new HashSet();
        this.f18499z = new C8964a.C8968c();
        this.f18482A = new C9410a();
        this.f18483B = new C9411b();
        this.f18485l = flutterTextureView;
        this.f18487n = flutterTextureView;
        mo47450q();
    }
}
