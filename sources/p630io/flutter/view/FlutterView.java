package p630io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p553f.p554a.p555c.C8902c;
import p553f.p554a.p556d.p557a.C8904a;
import p553f.p554a.p556d.p557a.C8906b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p569i.C8972b;
import p553f.p554a.p556d.p558b.p569i.C8975c;
import p553f.p554a.p556d.p558b.p569i.C8978d;
import p553f.p554a.p556d.p558b.p569i.C8979e;
import p553f.p554a.p556d.p558b.p569i.C8980f;
import p553f.p554a.p556d.p558b.p569i.C8983g;
import p553f.p554a.p556d.p558b.p569i.C8994j;
import p553f.p554a.p570e.p571a.C8995a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p572b.C9038c;
import p553f.p554a.p570e.p573c.C9044a;
import p553f.p554a.p570e.p574d.C9045a;
import p553f.p554a.p570e.p575e.C9052d;
import p553f.p554a.p570e.p575e.C9060j;
import p553f.p554a.p589h.C9173d;
import p553f.p554a.p589h.C9176e;
import p553f.p554a.p589h.C9177f;
import p630io.flutter.embedding.engine.FlutterJNI;
import p630io.flutter.embedding.engine.systemchannels.PlatformChannel;
import p630io.flutter.embedding.engine.systemchannels.SettingsChannel;
import p630io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p630io.flutter.view.AccessibilityBridge;

/* renamed from: io.flutter.view.FlutterView */
public class FlutterView extends SurfaceView implements C9003c, C9177f, C9045a.C9048c {

    /* renamed from: A */
    public final List<C8995a> f18701A;

    /* renamed from: B */
    public final List<C9456d> f18702B;

    /* renamed from: C */
    public final AtomicLong f18703C;

    /* renamed from: D */
    public C9173d f18704D;

    /* renamed from: E */
    public boolean f18705E;

    /* renamed from: F */
    public final AccessibilityBridge.C9447h f18706F;

    /* renamed from: e */
    public final C8928a f18707e;

    /* renamed from: l */
    public final C8964a f18708l;

    /* renamed from: m */
    public final C8983g f18709m;

    /* renamed from: n */
    public final C8975c f18710n;

    /* renamed from: o */
    public final C8978d f18711o;

    /* renamed from: p */
    public final C8979e f18712p;

    /* renamed from: q */
    public final PlatformChannel f18713q;

    /* renamed from: r */
    public final SettingsChannel f18714r;

    /* renamed from: s */
    public final C8994j f18715s;

    /* renamed from: t */
    public final C9038c f18716t;

    /* renamed from: u */
    public final C9044a f18717u;

    /* renamed from: v */
    public final C8904a f18718v;

    /* renamed from: w */
    public final C8906b f18719w;

    /* renamed from: x */
    public AccessibilityBridge f18720x;

    /* renamed from: y */
    public final SurfaceHolder.Callback f18721y;

    /* renamed from: z */
    public final C9460g f18722z;

    /* renamed from: io.flutter.view.FlutterView$a */
    public class C9453a implements AccessibilityBridge.C9447h {
        public C9453a() {
        }

        /* renamed from: a */
        public void mo47458a(boolean z, boolean z2) {
            FlutterView.this.mo47645C(z, z2);
        }
    }

    /* renamed from: io.flutter.view.FlutterView$b */
    public class C9454b implements SurfaceHolder.Callback {
        public C9454b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            FlutterView.this.mo47660j();
            FlutterView.this.f18704D.mo46963l().onSurfaceChanged(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            FlutterView.this.mo47660j();
            FlutterView.this.f18704D.mo46963l().onSurfaceCreated(surfaceHolder.getSurface());
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            FlutterView.this.mo47660j();
            FlutterView.this.f18704D.mo46963l().onSurfaceDestroyed();
        }
    }

    /* renamed from: io.flutter.view.FlutterView$c */
    public class C9455c implements C8995a {

        /* renamed from: a */
        public final /* synthetic */ C9052d f18725a;

        public C9455c(FlutterView flutterView, C9052d dVar) {
            this.f18725a = dVar;
        }

        public void onPostResume() {
            this.f18725a.mo46668t();
        }
    }

    /* renamed from: io.flutter.view.FlutterView$d */
    public interface C9456d {
        /* renamed from: a */
        void mo46284a();
    }

    /* renamed from: io.flutter.view.FlutterView$e */
    public interface C9457e {
        FlutterView getFlutterView();
    }

    /* renamed from: io.flutter.view.FlutterView$f */
    public final class C9458f implements C9177f.C9178a {

        /* renamed from: a */
        public final long f18726a;

        /* renamed from: b */
        public final SurfaceTexture f18727b;

        /* renamed from: c */
        public boolean f18728c;

        /* renamed from: d */
        public SurfaceTexture.OnFrameAvailableListener f18729d;

        /* renamed from: io.flutter.view.FlutterView$f$a */
        public class C9459a implements SurfaceTexture.OnFrameAvailableListener {
            public C9459a() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!C9458f.this.f18728c && FlutterView.this.f18704D != null) {
                    FlutterView.this.f18704D.mo46963l().markTextureFrameAvailable(C9458f.this.f18726a);
                }
            }
        }

        public C9458f(long j, SurfaceTexture surfaceTexture) {
            C9459a aVar = new C9459a();
            this.f18729d = aVar;
            this.f18726a = j;
            this.f18727b = surfaceTexture;
            if (Build.VERSION.SDK_INT >= 21) {
                surfaceTexture.setOnFrameAvailableListener(aVar, new Handler());
            } else {
                surfaceTexture.setOnFrameAvailableListener(aVar);
            }
        }

        /* renamed from: a */
        public SurfaceTexture mo46495a() {
            return this.f18727b;
        }

        /* renamed from: id */
        public long mo46496id() {
            return this.f18726a;
        }

        public void release() {
            if (!this.f18728c) {
                this.f18728c = true;
                this.f18727b.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                this.f18727b.release();
                FlutterView.this.f18704D.mo46963l().unregisterTexture(this.f18726a);
            }
        }
    }

    /* renamed from: io.flutter.view.FlutterView$g */
    public static final class C9460g {

        /* renamed from: a */
        public float f18732a = 1.0f;

        /* renamed from: b */
        public int f18733b = 0;

        /* renamed from: c */
        public int f18734c = 0;

        /* renamed from: d */
        public int f18735d = 0;

        /* renamed from: e */
        public int f18736e = 0;

        /* renamed from: f */
        public int f18737f = 0;

        /* renamed from: g */
        public int f18738g = 0;

        /* renamed from: h */
        public int f18739h = 0;

        /* renamed from: i */
        public int f18740i = 0;

        /* renamed from: j */
        public int f18741j = 0;

        /* renamed from: k */
        public int f18742k = 0;

        /* renamed from: l */
        public int f18743l = 0;

        /* renamed from: m */
        public int f18744m = 0;

        /* renamed from: n */
        public int f18745n = 0;

        /* renamed from: o */
        public int f18746o = 0;
    }

    /* renamed from: io.flutter.view.FlutterView$h */
    public enum C9461h {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: n */
    public static Activity m25677n(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m25677n(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: A */
    public void mo47643A(C9456d dVar) {
        this.f18702B.remove(dVar);
    }

    /* renamed from: B */
    public void mo47644B() {
        AccessibilityBridge accessibilityBridge = this.f18720x;
        if (accessibilityBridge != null) {
            accessibilityBridge.mo47585F();
        }
    }

    /* renamed from: C */
    public final void mo47645C(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.f18705E) {
            if (!z && !z2) {
                z3 = true;
            }
            setWillNotDraw(z3);
            return;
        }
        setWillNotDraw(false);
    }

    /* renamed from: D */
    public void mo47646D(C9176e eVar) {
        mo47660j();
        mo47687y();
        this.f18704D.mo46967p(eVar);
        mo47686x();
    }

    /* renamed from: E */
    public final void mo47647E() {
        SettingsChannel.PlatformBrightness platformBrightness = (getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        SettingsChannel.C9423a a = this.f18714r.mo47529a();
        a.mo47532c(getResources().getConfiguration().fontScale);
        a.mo47533d(DateFormat.is24HourFormat(getContext()));
        a.mo47531b(platformBrightness);
        a.mo47530a();
    }

    /* renamed from: F */
    public final void mo47648F() {
        if (mo47677p()) {
            FlutterJNI l = this.f18704D.mo46963l();
            C9460g gVar = this.f18722z;
            l.setViewportMetrics(gVar.f18732a, gVar.f18733b, gVar.f18734c, gVar.f18735d, gVar.f18736e, gVar.f18737f, gVar.f18738g, gVar.f18739h, gVar.f18740i, gVar.f18741j, gVar.f18742k, gVar.f18743l, gVar.f18744m, gVar.f18745n, gVar.f18746o);
        }
    }

    @UiThread
    /* renamed from: a */
    public void mo46433a(String str, ByteBuffer byteBuffer, C9003c.C9005b bVar) {
        if (!mo47677p()) {
            "FlutterView.send called on a detached view, channel=" + str;
            return;
        }
        this.f18704D.mo46433a(str, byteBuffer, bVar);
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f18716t.mo46621j(sparseArray);
    }

    @UiThread
    /* renamed from: b */
    public void mo46434b(String str, C9003c.C9004a aVar) {
        this.f18704D.mo46434b(str, aVar);
    }

    @RequiresApi(24)
    @TargetApi(24)
    @NonNull
    /* renamed from: c */
    public PointerIcon mo46652c(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean checkInputConnectionProxy(View view) {
        return this.f18704D.mo46964m().mo46293m().mo46713w(view);
    }

    @UiThread
    /* renamed from: d */
    public void mo46435d(String str, ByteBuffer byteBuffer) {
        mo46433a(str, byteBuffer, (C9003c.C9005b) null);
    }

    /* renamed from: e */
    public C9177f.C9178a mo46480e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        C9458f fVar = new C9458f(this.f18703C.getAndIncrement(), surfaceTexture);
        this.f18704D.mo46963l().registerTexture(fVar.mo46496id(), surfaceTexture);
        return fVar;
    }

    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        C9460g gVar = this.f18722z;
        gVar.f18735d = rect.top;
        gVar.f18736e = rect.right;
        gVar.f18737f = 0;
        gVar.f18738g = rect.left;
        gVar.f18739h = 0;
        gVar.f18740i = 0;
        gVar.f18741j = rect.bottom;
        gVar.f18742k = 0;
        mo47648F();
        return true;
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.f18720x;
        if (accessibilityBridge == null || !accessibilityBridge.mo47605w()) {
            return null;
        }
        return this.f18720x;
    }

    public Bitmap getBitmap() {
        mo47660j();
        return this.f18704D.mo46963l().getBitmap();
    }

    @NonNull
    public C8928a getDartExecutor() {
        return this.f18707e;
    }

    public float getDevicePixelRatio() {
        return this.f18722z.f18732a;
    }

    public C9173d getFlutterNativeView() {
        return this.f18704D;
    }

    public C8902c getPluginRegistry() {
        return this.f18704D.mo46964m();
    }

    /* renamed from: h */
    public void mo47658h(C8995a aVar) {
        this.f18701A.add(aVar);
    }

    /* renamed from: i */
    public void mo47659i(C9456d dVar) {
        this.f18702B.add(dVar);
    }

    /* renamed from: j */
    public void mo47660j() {
        if (!mo47677p()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    /* renamed from: k */
    public final C9461h mo47661k() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return C9461h.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? C9461h.LEFT : C9461h.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return C9461h.BOTH;
            }
        }
        return C9461h.NONE;
    }

    /* renamed from: l */
    public void mo47662l() {
        if (mo47677p()) {
            getHolder().removeCallback(this.f18721y);
            mo47688z();
            this.f18704D.mo46960i();
            this.f18704D = null;
        }
    }

    /* renamed from: m */
    public C9173d mo47663m() {
        if (!mo47677p()) {
            return null;
        }
        getHolder().removeCallback(this.f18721y);
        this.f18704D.mo46961j();
        C9173d dVar = this.f18704D;
        this.f18704D = null;
        return dVar;
    }

    @RequiresApi(20)
    @TargetApi(20)
    /* renamed from: o */
    public final int mo47664o(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    @RequiresApi(20)
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i;
        if (Build.VERSION.SDK_INT == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            C9460g gVar = this.f18722z;
            gVar.f18743l = systemGestureInsets.top;
            gVar.f18744m = systemGestureInsets.right;
            gVar.f18745n = systemGestureInsets.bottom;
            gVar.f18746o = systemGestureInsets.left;
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
            C9460g gVar2 = this.f18722z;
            gVar2.f18735d = insets.top;
            gVar2.f18736e = insets.right;
            gVar2.f18737f = insets.bottom;
            gVar2.f18738g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            C9460g gVar3 = this.f18722z;
            gVar3.f18739h = insets2.top;
            gVar3.f18740i = insets2.right;
            gVar3.f18741j = insets2.bottom;
            gVar3.f18742k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            C9460g gVar4 = this.f18722z;
            gVar4.f18743l = insets3.top;
            gVar4.f18744m = insets3.right;
            gVar4.f18745n = insets3.bottom;
            gVar4.f18746o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                C9460g gVar5 = this.f18722z;
                gVar5.f18735d = Math.max(Math.max(gVar5.f18735d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                C9460g gVar6 = this.f18722z;
                gVar6.f18736e = Math.max(Math.max(gVar6.f18736e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                C9460g gVar7 = this.f18722z;
                gVar7.f18737f = Math.max(Math.max(gVar7.f18737f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                C9460g gVar8 = this.f18722z;
                gVar8.f18738g = Math.max(Math.max(gVar8.f18738g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            C9461h hVar = C9461h.NONE;
            if (!z) {
                hVar = mo47661k();
            }
            this.f18722z.f18735d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f18722z.f18736e = (hVar == C9461h.RIGHT || hVar == C9461h.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            C9460g gVar9 = this.f18722z;
            gVar9.f18737f = 0;
            gVar9.f18738g = (hVar == C9461h.LEFT || hVar == C9461h.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            C9460g gVar10 = this.f18722z;
            gVar10.f18739h = 0;
            gVar10.f18740i = 0;
            if (z) {
                i = windowInsets.getSystemWindowInsetBottom();
            } else {
                i = mo47664o(windowInsets);
            }
            gVar10.f18741j = i;
            this.f18722z.f18742k = 0;
        }
        mo47648F();
        return super.onApplyWindowInsets(windowInsets);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, new C8972b(this.f18707e, getFlutterNativeView().mo46963l()), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), getPluginRegistry().mo46293m());
        this.f18720x = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.f18706F);
        mo47645C(this.f18720x.mo47605w(), this.f18720x.mo47606x());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18717u.mo46649b(configuration);
        mo47647E();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f18716t.mo46624m(this, editorInfo);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo47688z();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (mo47677p() && this.f18719w.mo46315d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!mo47677p()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f18720x.mo47581B(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!mo47677p()) {
            return super.onKeyDown(i, keyEvent);
        }
        return this.f18718v.mo46305c(keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!mo47677p()) {
            return super.onKeyUp(i, keyEvent);
        }
        return this.f18718v.mo46306d(keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f18716t.mo46635y(viewStructure, i);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C9460g gVar = this.f18722z;
        gVar.f18733b = i;
        gVar.f18734c = i2;
        mo47648F();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo47677p()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f18719w.mo46316e(motionEvent);
    }

    /* renamed from: p */
    public final boolean mo47677p() {
        C9173d dVar = this.f18704D;
        return dVar != null && dVar.mo46966o();
    }

    /* renamed from: q */
    public void mo47678q() {
        for (C9456d a : new ArrayList(this.f18702B)) {
            a.mo46284a();
        }
    }

    /* renamed from: r */
    public void mo47679r() {
        this.f18704D.mo46963l().notifyLowMemoryWarning();
        this.f18715s.mo46551a();
    }

    /* renamed from: s */
    public void mo47680s() {
        this.f18711o.mo46522b();
    }

    public void setInitialRoute(String str) {
        this.f18709m.mo46529b(str);
    }

    /* renamed from: t */
    public void mo47682t() {
        for (C8995a onPostResume : this.f18701A) {
            onPostResume.onPostResume();
        }
        this.f18711o.mo46524d();
    }

    /* renamed from: u */
    public void mo47683u() {
        this.f18711o.mo46522b();
    }

    /* renamed from: v */
    public void mo47684v() {
        this.f18711o.mo46523c();
    }

    /* renamed from: w */
    public void mo47685w() {
        this.f18709m.mo46528a();
    }

    /* renamed from: x */
    public final void mo47686x() {
    }

    /* renamed from: y */
    public final void mo47687y() {
        mo47644B();
    }

    /* renamed from: z */
    public final void mo47688z() {
        AccessibilityBridge accessibilityBridge = this.f18720x;
        if (accessibilityBridge != null) {
            accessibilityBridge.mo47584E();
            this.f18720x = null;
        }
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (C9173d) null);
    }

    public FlutterView(Context context, AttributeSet attributeSet, C9173d dVar) {
        super(context, attributeSet);
        this.f18703C = new AtomicLong(0);
        this.f18705E = false;
        this.f18706F = new C9453a();
        Activity n = m25677n(getContext());
        if (n != null) {
            if (dVar == null) {
                this.f18704D = new C9173d(n.getApplicationContext());
            } else {
                this.f18704D = dVar;
            }
            this.f18707e = this.f18704D.mo46962k();
            this.f18708l = new C8964a(this.f18704D.mo46963l());
            this.f18705E = this.f18704D.mo46963l().getIsSoftwareRenderingEnabled();
            C9460g gVar = new C9460g();
            this.f18722z = gVar;
            gVar.f18732a = context.getResources().getDisplayMetrics().density;
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.f18704D.mo46959h(this, n);
            this.f18721y = new C9454b();
            getHolder().addCallback(this.f18721y);
            this.f18701A = new ArrayList();
            this.f18702B = new ArrayList();
            this.f18709m = new C8983g(this.f18707e);
            this.f18710n = new C8975c(this.f18707e);
            this.f18711o = new C8978d(this.f18707e);
            this.f18712p = new C8979e(this.f18707e);
            this.f18713q = new PlatformChannel(this.f18707e);
            this.f18715s = new C8994j(this.f18707e);
            this.f18714r = new SettingsChannel(this.f18707e);
            mo47658h(new C9455c(this, new C9052d(n, this.f18713q)));
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            C9060j m = this.f18704D.mo46964m().mo46293m();
            this.f18716t = new C9038c(this, new TextInputChannel(this.f18707e), m);
            if (Build.VERSION.SDK_INT >= 24) {
                new C9045a(this, new C8980f(this.f18707e));
            }
            this.f18717u = new C9044a(context, this.f18712p);
            this.f18718v = new C8904a(this, this.f18710n, this.f18716t);
            this.f18719w = new C8906b(this.f18708l, false);
            m.mo46711u(this.f18708l);
            this.f18704D.mo46964m().mo46293m().mo46710t(this.f18716t);
            this.f18704D.mo46963l().setLocalizationPlugin(this.f18717u);
            this.f18717u.mo46649b(getResources().getConfiguration());
            mo47647E();
            return;
        }
        throw new IllegalArgumentException("Bad context");
    }
}
