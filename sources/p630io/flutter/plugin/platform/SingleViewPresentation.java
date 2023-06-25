package p630io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p553f.p554a.p570e.p575e.C9051c;
import p553f.p554a.p570e.p575e.C9055e;
import p553f.p554a.p570e.p575e.C9056f;

@TargetApi(17)
@Keep
/* renamed from: io.flutter.plugin.platform.SingleViewPresentation */
public class SingleViewPresentation extends Presentation {
    public final C9051c accessibilityEventsDelegate;
    public FrameLayout container;
    public Object createParams;
    public final View.OnFocusChangeListener focusChangeListener;
    public final Context outerContext;
    public C9430a rootView;
    public boolean startFocused = false;
    public C9434e state;
    public final C9056f viewFactory;
    public int viewId;

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$a */
    public static class C9430a extends FrameLayout {

        /* renamed from: e */
        public final C9051c f18558e;

        /* renamed from: l */
        public final View f18559l;

        public C9430a(Context context, C9051c cVar, View view) {
            super(context);
            this.f18558e = cVar;
            this.f18559l = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f18558e.mo46656a(this.f18559l, view, accessibilityEvent);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$b */
    public static class C9431b extends ViewGroup {

        /* renamed from: e */
        public final Rect f18560e = new Rect();

        /* renamed from: l */
        public final Rect f18561l = new Rect();

        public C9431b(Context context) {
            super(context);
        }

        /* renamed from: a */
        public static int m25520a(int i) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f18560e.set(i, i2, i3, i4);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f18560e, layoutParams.x, layoutParams.y, this.f18561l);
                Rect rect = this.f18561l;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        public void onMeasure(int i, int i2) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).measure(m25520a(i), m25520a(i2));
            }
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$c */
    public static class C9432c extends ContextWrapper {
        @NonNull

        /* renamed from: a */
        public final InputMethodManager f18562a;

        public C9432c(Context context) {
            this(context, (InputMethodManager) null);
        }

        public Context createDisplayContext(Display display) {
            return new C9432c(super.createDisplayContext(display), this.f18562a);
        }

        public Object getSystemService(String str) {
            if ("input_method".equals(str)) {
                return this.f18562a;
            }
            return super.getSystemService(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9432c(android.content.Context r1, @androidx.annotation.Nullable android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f18562a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.plugin.platform.SingleViewPresentation.C9432c.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$d */
    public static class C9433d extends ContextWrapper {
        @NonNull

        /* renamed from: a */
        public final C9435f f18563a;
        @Nullable

        /* renamed from: b */
        public WindowManager f18564b;

        /* renamed from: c */
        public final Context f18565c;

        public C9433d(Context context, @NonNull C9435f fVar, Context context2) {
            super(context);
            this.f18563a = fVar;
            this.f18565c = context2;
        }

        /* renamed from: a */
        public final WindowManager mo47561a() {
            if (this.f18564b == null) {
                this.f18564b = this.f18563a.mo47565b();
            }
            return this.f18564b;
        }

        /* renamed from: b */
        public final boolean mo47562b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i = 0;
            while (i < stackTrace.length && i < 11) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
                i++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            if (!"window".equals(str)) {
                return super.getSystemService(str);
            }
            if (mo47562b()) {
                return this.f18565c.getSystemService(str);
            }
            return mo47561a();
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$e */
    public static class C9434e {

        /* renamed from: a */
        public C9055e f18566a;

        /* renamed from: b */
        public C9435f f18567b;

        /* renamed from: c */
        public C9431b f18568c;
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$f */
    public static class C9435f implements InvocationHandler {

        /* renamed from: a */
        public final WindowManager f18569a;

        /* renamed from: b */
        public C9431b f18570b;

        public C9435f(WindowManager windowManager, C9431b bVar) {
            this.f18569a = windowManager;
            this.f18570b = bVar;
        }

        /* renamed from: a */
        public final void mo47564a(Object[] objArr) {
            C9431b bVar = this.f18570b;
            if (bVar != null) {
                bVar.addView(objArr[0], objArr[1]);
            }
        }

        /* renamed from: b */
        public WindowManager mo47565b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        /* renamed from: c */
        public final void mo47566c(Object[] objArr) {
            C9431b bVar = this.f18570b;
            if (bVar != null) {
                bVar.removeView(objArr[0]);
            }
        }

        /* renamed from: d */
        public final void mo47567d(Object[] objArr) {
            if (this.f18570b != null) {
                View view = objArr[0];
                view.clearAnimation();
                this.f18570b.removeView(view);
            }
        }

        /* renamed from: e */
        public final void mo47568e(Object[] objArr) {
            C9431b bVar = this.f18570b;
            if (bVar != null) {
                bVar.updateViewLayout(objArr[0], objArr[1]);
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
            /*
                r4 = this;
                java.lang.String r5 = r6.getName()
                int r0 = r5.hashCode()
                r1 = 3
                r2 = 2
                r3 = 1
                switch(r0) {
                    case -1148522778: goto L_0x002d;
                    case 542766184: goto L_0x0023;
                    case 931413976: goto L_0x0019;
                    case 1098630473: goto L_0x000f;
                    default: goto L_0x000e;
                }
            L_0x000e:
                goto L_0x0037
            L_0x000f:
                java.lang.String r0 = "removeView"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0037
                r5 = r3
                goto L_0x0038
            L_0x0019:
                java.lang.String r0 = "updateViewLayout"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0037
                r5 = r1
                goto L_0x0038
            L_0x0023:
                java.lang.String r0 = "removeViewImmediate"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0037
                r5 = r2
                goto L_0x0038
            L_0x002d:
                java.lang.String r0 = "addView"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0037
                r5 = 0
                goto L_0x0038
            L_0x0037:
                r5 = -1
            L_0x0038:
                r0 = 0
                if (r5 == 0) goto L_0x005a
                if (r5 == r3) goto L_0x0056
                if (r5 == r2) goto L_0x0052
                if (r5 == r1) goto L_0x004e
                android.view.WindowManager r5 = r4.f18569a     // Catch:{ InvocationTargetException -> 0x0048 }
                java.lang.Object r5 = r6.invoke(r5, r7)     // Catch:{ InvocationTargetException -> 0x0048 }
                return r5
            L_0x0048:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x004e:
                r4.mo47568e(r7)
                return r0
            L_0x0052:
                r4.mo47567d(r7)
                return r0
            L_0x0056:
                r4.mo47566c(r7)
                return r0
            L_0x005a:
                r4.mo47564a(r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.plugin.platform.SingleViewPresentation.C9435f.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    public SingleViewPresentation(Context context, Display display, C9056f fVar, C9051c cVar, int i, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        super(new C9432c(context), display);
        this.viewFactory = fVar;
        this.accessibilityEventsDelegate = cVar;
        this.viewId = i;
        this.createParams = obj;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new C9434e();
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public C9434e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public C9055e getView() {
        if (this.state.f18566a == null) {
            return null;
        }
        return this.state.f18566a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f18568c == null) {
            C9431b unused = this.state.f18568c = new C9431b(getContext());
        }
        if (this.state.f18567b == null) {
            C9434e eVar = this.state;
            C9435f unused2 = eVar.f18567b = new C9435f((WindowManager) getContext().getSystemService("window"), eVar.f18568c);
        }
        this.container = new FrameLayout(getContext());
        C9433d dVar = new C9433d(getContext(), this.state.f18567b, this.outerContext);
        if (this.state.f18566a == null) {
            C9055e unused3 = this.state.f18566a = this.viewFactory.create(dVar, this.viewId, this.createParams);
        }
        View view = this.state.f18566a.getView();
        this.container.addView(view);
        C9430a aVar = new C9430a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f18568c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C9051c cVar, C9434e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new C9432c(context), display);
        this.accessibilityEventsDelegate = cVar;
        this.viewFactory = null;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
