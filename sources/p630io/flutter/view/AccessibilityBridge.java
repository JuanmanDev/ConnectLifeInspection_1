package p630io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p553f.p554a.p556d.p558b.p569i.C8972b;
import p553f.p554a.p570e.p575e.C9059i;
import p553f.p554a.p588g.C9169c;
import p553f.p554a.p589h.C9170a;
import p553f.p554a.p589h.C9171b;

/* renamed from: io.flutter.view.AccessibilityBridge */
public class AccessibilityBridge extends AccessibilityNodeProvider {

    /* renamed from: y */
    public static int f18582y = 267386881;
    @NonNull

    /* renamed from: a */
    public final View f18583a;
    @NonNull

    /* renamed from: b */
    public final C8972b f18584b;
    @NonNull

    /* renamed from: c */
    public final AccessibilityManager f18585c;
    @NonNull

    /* renamed from: d */
    public final AccessibilityViewEmbedder f18586d;
    @NonNull

    /* renamed from: e */
    public final C9059i f18587e;
    @NonNull

    /* renamed from: f */
    public final ContentResolver f18588f;
    @NonNull

    /* renamed from: g */
    public final Map<Integer, C9448i> f18589g;
    @NonNull

    /* renamed from: h */
    public final Map<Integer, C9445f> f18590h;
    @Nullable

    /* renamed from: i */
    public C9448i f18591i;

    /* renamed from: j */
    public Integer f18592j;

    /* renamed from: k */
    public Integer f18593k;

    /* renamed from: l */
    public int f18594l;
    @Nullable

    /* renamed from: m */
    public C9448i f18595m;
    @Nullable

    /* renamed from: n */
    public C9448i f18596n;
    @Nullable

    /* renamed from: o */
    public C9448i f18597o;
    @NonNull

    /* renamed from: p */
    public final List<Integer> f18598p;

    /* renamed from: q */
    public int f18599q;
    @NonNull

    /* renamed from: r */
    public Integer f18600r;
    @Nullable

    /* renamed from: s */
    public C9447h f18601s;

    /* renamed from: t */
    public boolean f18602t;

    /* renamed from: u */
    public final C8972b.C8974b f18603u;

    /* renamed from: v */
    public final AccessibilityManager.AccessibilityStateChangeListener f18604v;
    @RequiresApi(19)
    @TargetApi(19)

    /* renamed from: w */
    public final AccessibilityManager.TouchExplorationStateChangeListener f18605w;

    /* renamed from: x */
    public final ContentObserver f18606x;

    /* renamed from: io.flutter.view.AccessibilityBridge$Action */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576);
        
        public final int value;

        /* access modifiers changed from: public */
        Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$a */
    public class C9440a implements C8972b.C8974b {
        public C9440a() {
        }

        /* renamed from: a */
        public void mo47508a(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            AccessibilityBridge.this.mo47592M(byteBuffer, strArr);
        }

        /* renamed from: b */
        public void mo47509b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            AccessibilityBridge.this.mo47593N(byteBuffer, strArr);
        }

        /* renamed from: c */
        public void mo46511c(int i) {
            AccessibilityBridge.this.mo47586G(i, 1);
        }

        /* renamed from: d */
        public void mo46512d(@NonNull String str) {
            AccessibilityBridge.this.f18583a.announceForAccessibility(str);
        }

        /* renamed from: e */
        public void mo46513e(@NonNull String str) {
            AccessibilityEvent g = AccessibilityBridge.this.mo47580A(0, 32);
            g.getText().add(str);
            AccessibilityBridge.this.mo47587H(g);
        }

        /* renamed from: f */
        public void mo46514f(int i) {
            AccessibilityBridge.this.mo47586G(i, 2);
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$b */
    public class C9441b implements AccessibilityManager.AccessibilityStateChangeListener {
        public C9441b() {
        }

        public void onAccessibilityStateChanged(boolean z) {
            if (!AccessibilityBridge.this.f18602t) {
                if (z) {
                    AccessibilityBridge.this.f18584b.mo46509g(AccessibilityBridge.this.f18603u);
                    AccessibilityBridge.this.f18584b.mo46507e();
                } else {
                    AccessibilityBridge.this.f18584b.mo46509g((C8972b.C8974b) null);
                    AccessibilityBridge.this.f18584b.mo46506d();
                }
                if (AccessibilityBridge.this.f18601s != null) {
                    AccessibilityBridge.this.f18601s.mo47458a(z, AccessibilityBridge.this.f18585c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$c */
    public class C9442c extends ContentObserver {
        public C9442c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            onChange(z, (Uri) null);
        }

        public void onChange(boolean z, Uri uri) {
            String str;
            if (!AccessibilityBridge.this.f18602t) {
                if (Build.VERSION.SDK_INT < 17) {
                    str = null;
                } else {
                    str = Settings.Global.getString(AccessibilityBridge.this.f18588f, "transition_animation_scale");
                }
                if (str != null && str.equals("0")) {
                    AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                    int unused = accessibilityBridge.f18594l = accessibilityBridge.f18594l | C9444e.DISABLE_ANIMATIONS.f18616e;
                } else {
                    AccessibilityBridge accessibilityBridge2 = AccessibilityBridge.this;
                    int unused2 = accessibilityBridge2.f18594l = accessibilityBridge2.f18594l & (~C9444e.DISABLE_ANIMATIONS.f18616e);
                }
                AccessibilityBridge.this.mo47588I();
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$d */
    public class C9443d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ AccessibilityManager f18610a;

        public C9443d(AccessibilityManager accessibilityManager) {
            this.f18610a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z) {
            if (!AccessibilityBridge.this.f18602t) {
                if (z) {
                    AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                    int unused = accessibilityBridge.f18594l = accessibilityBridge.f18594l | C9444e.ACCESSIBLE_NAVIGATION.f18616e;
                } else {
                    AccessibilityBridge.this.mo47582C();
                    AccessibilityBridge accessibilityBridge2 = AccessibilityBridge.this;
                    int unused2 = accessibilityBridge2.f18594l = accessibilityBridge2.f18594l & (~C9444e.ACCESSIBLE_NAVIGATION.f18616e);
                }
                AccessibilityBridge.this.mo47588I();
                if (AccessibilityBridge.this.f18601s != null) {
                    AccessibilityBridge.this.f18601s.mo47458a(this.f18610a.isEnabled(), z);
                }
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$e */
    public enum C9444e {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4);
        

        /* renamed from: e */
        public final int f18616e;

        /* access modifiers changed from: public */
        C9444e(int i) {
            this.f18616e = i;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$f */
    public static class C9445f {

        /* renamed from: a */
        public int f18617a = -1;

        /* renamed from: b */
        public int f18618b = -1;

        /* renamed from: c */
        public int f18619c = -1;

        /* renamed from: d */
        public String f18620d;

        /* renamed from: e */
        public String f18621e;
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$g */
    public enum C9446g {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304);
        

        /* renamed from: e */
        public final int f18645e;

        /* access modifiers changed from: public */
        C9446g(int i) {
            this.f18645e = i;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$h */
    public interface C9447h {
        /* renamed from: a */
        void mo47458a(boolean z, boolean z2);
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$i */
    public static class C9448i {

        /* renamed from: A */
        public String f18646A;

        /* renamed from: B */
        public float f18647B;

        /* renamed from: C */
        public float f18648C;

        /* renamed from: D */
        public float f18649D;

        /* renamed from: E */
        public float f18650E;

        /* renamed from: F */
        public float[] f18651F;

        /* renamed from: G */
        public C9448i f18652G;

        /* renamed from: H */
        public List<C9448i> f18653H = new ArrayList();

        /* renamed from: I */
        public List<C9448i> f18654I = new ArrayList();

        /* renamed from: J */
        public List<C9445f> f18655J;

        /* renamed from: K */
        public C9445f f18656K;

        /* renamed from: L */
        public C9445f f18657L;

        /* renamed from: M */
        public boolean f18658M = true;

        /* renamed from: N */
        public float[] f18659N;

        /* renamed from: O */
        public boolean f18660O = true;

        /* renamed from: P */
        public float[] f18661P;

        /* renamed from: Q */
        public Rect f18662Q;

        /* renamed from: a */
        public final AccessibilityBridge f18663a;

        /* renamed from: b */
        public int f18664b = -1;

        /* renamed from: c */
        public int f18665c;

        /* renamed from: d */
        public int f18666d;

        /* renamed from: e */
        public int f18667e;

        /* renamed from: f */
        public int f18668f;

        /* renamed from: g */
        public int f18669g;

        /* renamed from: h */
        public int f18670h;

        /* renamed from: i */
        public int f18671i;

        /* renamed from: j */
        public int f18672j;

        /* renamed from: k */
        public int f18673k;

        /* renamed from: l */
        public float f18674l;

        /* renamed from: m */
        public float f18675m;

        /* renamed from: n */
        public float f18676n;

        /* renamed from: o */
        public String f18677o;

        /* renamed from: p */
        public String f18678p;

        /* renamed from: q */
        public String f18679q;

        /* renamed from: r */
        public String f18680r;

        /* renamed from: s */
        public String f18681s;

        /* renamed from: t */
        public boolean f18682t = false;

        /* renamed from: u */
        public int f18683u;

        /* renamed from: v */
        public int f18684v;

        /* renamed from: w */
        public int f18685w;

        /* renamed from: x */
        public int f18686x;

        /* renamed from: y */
        public float f18687y;

        /* renamed from: z */
        public String f18688z;

        public C9448i(@NonNull AccessibilityBridge accessibilityBridge) {
            this.f18663a = accessibilityBridge;
        }

        /* renamed from: j0 */
        public static boolean m25626j0(C9448i iVar, C9169c<C9448i> cVar) {
            return (iVar == null || iVar.mo47615X(cVar) == null) ? false : true;
        }

        /* renamed from: T */
        public final void mo47611T(List<C9448i> list) {
            if (mo47622e0(C9446g.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (C9448i T : this.f18653H) {
                T.mo47611T(list);
            }
        }

        /* renamed from: U */
        public final boolean mo47612U() {
            String str;
            if (this.f18677o == null && this.f18646A == null) {
                return false;
            }
            String str2 = this.f18677o;
            if (str2 == null || (str = this.f18646A) == null || !str2.equals(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: V */
        public final boolean mo47613V() {
            return !Float.isNaN(this.f18674l) && !Float.isNaN(this.f18687y) && this.f18687y != this.f18674l;
        }

        /* renamed from: W */
        public final void mo47614W() {
            if (this.f18658M) {
                this.f18658M = false;
                if (this.f18659N == null) {
                    this.f18659N = new float[16];
                }
                if (!Matrix.invertM(this.f18659N, 0, this.f18651F, 0)) {
                    Arrays.fill(this.f18659N, 0.0f);
                }
            }
        }

        /* renamed from: X */
        public final C9448i mo47615X(C9169c<C9448i> cVar) {
            for (C9448i iVar = this.f18652G; iVar != null; iVar = iVar.f18652G) {
                if (cVar.test(iVar)) {
                    return iVar;
                }
            }
            return null;
        }

        /* renamed from: Y */
        public final Rect mo47616Y() {
            return this.f18662Q;
        }

        /* renamed from: Z */
        public final String mo47617Z() {
            String str;
            if (mo47622e0(C9446g.NAMES_ROUTE) && (str = this.f18677o) != null && !str.isEmpty()) {
                return this.f18677o;
            }
            for (C9448i Z : this.f18653H) {
                String Z2 = Z.mo47617Z();
                if (Z2 != null && !Z2.isEmpty()) {
                    return Z2;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        public final String mo47618a0() {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {this.f18678p, this.f18677o, this.f18681s};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (str != null && str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }

        /* renamed from: b0 */
        public final boolean mo47619b0(@NonNull Action action) {
            return (action.value & this.f18684v) != 0;
        }

        /* renamed from: c0 */
        public final boolean mo47620c0(@NonNull C9446g gVar) {
            return (gVar.f18645e & this.f18683u) != 0;
        }

        /* renamed from: d0 */
        public final boolean mo47621d0(@NonNull Action action) {
            return (action.value & this.f18666d) != 0;
        }

        /* renamed from: e0 */
        public final boolean mo47622e0(@NonNull C9446g gVar) {
            return (gVar.f18645e & this.f18665c) != 0;
        }

        /* renamed from: f0 */
        public final C9448i mo47623f0(float[] fArr) {
            float f = fArr[3];
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.f18647B || f2 >= this.f18649D || f3 < this.f18648C || f3 >= this.f18650E) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (C9448i next : this.f18654I) {
                if (!next.mo47622e0(C9446g.IS_HIDDEN)) {
                    next.mo47614W();
                    Matrix.multiplyMV(fArr2, 0, next.f18659N, 0, fArr, 0);
                    C9448i f0 = next.mo47623f0(fArr2);
                    if (f0 != null) {
                        return f0;
                    }
                }
            }
            return this;
        }

        /* renamed from: g0 */
        public final boolean mo47624g0() {
            String str;
            String str2;
            String str3;
            if (mo47622e0(C9446g.SCOPES_ROUTE)) {
                return false;
            }
            if (mo47622e0(C9446g.IS_FOCUSABLE)) {
                return true;
            }
            int i = Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value | Action.SCROLL_UP.value | Action.SCROLL_DOWN.value;
            if (((~i) & this.f18666d) == 0 && this.f18665c == 0 && (((str = this.f18677o) == null || str.isEmpty()) && (((str2 = this.f18678p) == null || str2.isEmpty()) && ((str3 = this.f18681s) == null || str3.isEmpty())))) {
                return false;
            }
            return true;
        }

        /* renamed from: h0 */
        public final float mo47625h0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        /* renamed from: i0 */
        public final float mo47626i0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        /* renamed from: k0 */
        public final void mo47627k0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        /* renamed from: l0 */
        public final void mo47628l0(float[] fArr, Set<C9448i> set, boolean z) {
            set.add(this);
            if (this.f18660O) {
                z = true;
            }
            if (z) {
                if (this.f18661P == null) {
                    this.f18661P = new float[16];
                }
                Matrix.multiplyMM(this.f18661P, 0, fArr, 0, this.f18651F, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.f18647B;
                fArr2[1] = this.f18648C;
                mo47627k0(fArr3, this.f18661P, fArr2);
                fArr2[0] = this.f18649D;
                fArr2[1] = this.f18648C;
                mo47627k0(fArr4, this.f18661P, fArr2);
                fArr2[0] = this.f18649D;
                fArr2[1] = this.f18650E;
                mo47627k0(fArr5, this.f18661P, fArr2);
                fArr2[0] = this.f18647B;
                fArr2[1] = this.f18650E;
                mo47627k0(fArr6, this.f18661P, fArr2);
                if (this.f18662Q == null) {
                    this.f18662Q = new Rect();
                }
                this.f18662Q.set(Math.round(mo47626i0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(mo47626i0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(mo47625h0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(mo47625h0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f18660O = false;
            }
            for (C9448i l0 : this.f18653H) {
                l0.mo47628l0(this.f18661P, set, z);
            }
        }

        /* renamed from: m0 */
        public final void mo47629m0(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            this.f18682t = true;
            this.f18688z = this.f18678p;
            this.f18646A = this.f18677o;
            this.f18683u = this.f18665c;
            this.f18684v = this.f18666d;
            this.f18685w = this.f18669g;
            this.f18686x = this.f18670h;
            this.f18687y = this.f18674l;
            this.f18665c = byteBuffer.getInt();
            this.f18666d = byteBuffer.getInt();
            this.f18667e = byteBuffer.getInt();
            this.f18668f = byteBuffer.getInt();
            this.f18669g = byteBuffer.getInt();
            this.f18670h = byteBuffer.getInt();
            this.f18671i = byteBuffer.getInt();
            this.f18672j = byteBuffer.getInt();
            this.f18673k = byteBuffer.getInt();
            this.f18674l = byteBuffer.getFloat();
            this.f18675m = byteBuffer.getFloat();
            this.f18676n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            if (i == -1) {
                str = null;
            } else {
                str = strArr[i];
            }
            this.f18677o = str;
            int i2 = byteBuffer.getInt();
            if (i2 == -1) {
                str2 = null;
            } else {
                str2 = strArr[i2];
            }
            this.f18678p = str2;
            int i3 = byteBuffer.getInt();
            if (i3 == -1) {
                str3 = null;
            } else {
                str3 = strArr[i3];
            }
            this.f18679q = str3;
            int i4 = byteBuffer.getInt();
            if (i4 == -1) {
                str4 = null;
            } else {
                str4 = strArr[i4];
            }
            this.f18680r = str4;
            int i5 = byteBuffer.getInt();
            if (i5 == -1) {
                str5 = null;
            } else {
                str5 = strArr[i5];
            }
            this.f18681s = str5;
            C9449j.m25662c(byteBuffer.getInt());
            this.f18647B = byteBuffer.getFloat();
            this.f18648C = byteBuffer.getFloat();
            this.f18649D = byteBuffer.getFloat();
            this.f18650E = byteBuffer.getFloat();
            if (this.f18651F == null) {
                this.f18651F = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                this.f18651F[i6] = byteBuffer.getFloat();
            }
            this.f18658M = true;
            this.f18660O = true;
            int i7 = byteBuffer.getInt();
            this.f18653H.clear();
            this.f18654I.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                C9448i l = this.f18663a.mo47602t(byteBuffer.getInt());
                l.f18652G = this;
                this.f18653H.add(l);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                C9448i l2 = this.f18663a.mo47602t(byteBuffer.getInt());
                l2.f18652G = this;
                this.f18654I.add(l2);
            }
            int i10 = byteBuffer.getInt();
            if (i10 == 0) {
                this.f18655J = null;
                return;
            }
            List<C9445f> list = this.f18655J;
            if (list == null) {
                this.f18655J = new ArrayList(i10);
            } else {
                list.clear();
            }
            for (int i11 = 0; i11 < i10; i11++) {
                C9445f m = this.f18663a.mo47600s(byteBuffer.getInt());
                if (m.f18619c == Action.TAP.value) {
                    this.f18656K = m;
                } else if (m.f18619c == Action.LONG_PRESS.value) {
                    this.f18657L = m;
                } else {
                    this.f18655J.add(m);
                }
                this.f18655J.add(m);
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$j */
    public enum C9449j {
        UNKNOWN,
        f18690l,
        f18691m;

        /* renamed from: c */
        public static C9449j m25662c(int i) {
            if (i == 1) {
                return f18691m;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return f18690l;
        }
    }

    public AccessibilityBridge(@NonNull View view, @NonNull C8972b bVar, @NonNull AccessibilityManager accessibilityManager, @NonNull ContentResolver contentResolver, C9059i iVar) {
        this(view, bVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), iVar);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m25555y(C9448i iVar, C9448i iVar2) {
        return iVar2 == iVar;
    }

    /* renamed from: A */
    public final AccessibilityEvent mo47580A(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.f18583a.getContext().getPackageName());
        obtain.setSource(this.f18583a, i);
        return obtain;
    }

    /* renamed from: B */
    public boolean mo47581B(MotionEvent motionEvent) {
        if (!this.f18585c.isTouchExplorationEnabled() || this.f18589g.isEmpty()) {
            return false;
        }
        C9448i y = mo47603u().mo47623f0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (y != null && y.f18671i != -1) {
            return this.f18586d.onAccessibilityHoverEvent(y.f18664b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            mo47604v(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 10) {
            mo47582C();
        } else {
            "unexpected accessibility hover event: " + motionEvent;
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final void mo47582C() {
        C9448i iVar = this.f18597o;
        if (iVar != null) {
            mo47586G(iVar.f18664b, 256);
            this.f18597o = null;
        }
    }

    @RequiresApi(18)
    @TargetApi(18)
    /* renamed from: D */
    public final boolean mo47583D(@NonNull C9448i iVar, int i, @NonNull Bundle bundle, boolean z) {
        int i2 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        boolean z2 = bundle.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            if (z && iVar.mo47621d0(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                this.f18584b.mo46505c(i, Action.MOVE_CURSOR_FORWARD_BY_WORD, Boolean.valueOf(z2));
                return true;
            } else if (z || !iVar.mo47621d0(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                return false;
            } else {
                this.f18584b.mo46505c(i, Action.MOVE_CURSOR_BACKWARD_BY_WORD, Boolean.valueOf(z2));
                return true;
            }
        } else if (z && iVar.mo47621d0(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
            this.f18584b.mo46505c(i, Action.MOVE_CURSOR_FORWARD_BY_CHARACTER, Boolean.valueOf(z2));
            return true;
        } else if (z || !iVar.mo47621d0(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
            return false;
        } else {
            this.f18584b.mo46505c(i, Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER, Boolean.valueOf(z2));
            return true;
        }
    }

    /* renamed from: E */
    public void mo47584E() {
        this.f18602t = true;
        C9059i iVar = this.f18587e;
        if (iVar != null) {
            iVar.mo46685b();
        }
        setOnAccessibilityChangeListener((C9447h) null);
        this.f18585c.removeAccessibilityStateChangeListener(this.f18604v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f18585c.removeTouchExplorationStateChangeListener(this.f18605w);
        }
        this.f18588f.unregisterContentObserver(this.f18606x);
        this.f18584b.mo46509g((C8972b.C8974b) null);
    }

    /* renamed from: F */
    public void mo47585F() {
        this.f18589g.clear();
        C9448i iVar = this.f18591i;
        if (iVar != null) {
            mo47586G(iVar.f18664b, 65536);
        }
        this.f18591i = null;
        this.f18597o = null;
        mo47590K(0);
    }

    /* renamed from: G */
    public final void mo47586G(int i, int i2) {
        if (this.f18585c.isEnabled()) {
            mo47587H(mo47580A(i, i2));
        }
    }

    /* renamed from: H */
    public final void mo47587H(@NonNull AccessibilityEvent accessibilityEvent) {
        if (this.f18585c.isEnabled()) {
            this.f18583a.getParent().requestSendAccessibilityEvent(this.f18583a, accessibilityEvent);
        }
    }

    /* renamed from: I */
    public final void mo47588I() {
        this.f18584b.mo46508f(this.f18594l);
    }

    /* renamed from: J */
    public final void mo47589J(@NonNull C9448i iVar) {
        AccessibilityEvent A = mo47580A(iVar.f18664b, 32);
        String S = iVar.mo47617Z();
        if (S == null) {
            S = " ";
        }
        A.getText().add(S);
        mo47587H(A);
    }

    /* renamed from: K */
    public final void mo47590K(int i) {
        AccessibilityEvent A = mo47580A(i, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            A.setContentChangeTypes(1);
        }
        mo47587H(A);
    }

    /* renamed from: L */
    public final boolean mo47591L(C9448i iVar) {
        return iVar.f18672j > 0 && (C9448i.m25626j0(this.f18591i, new C9170a(iVar)) || !C9448i.m25626j0(this.f18591i, C9171b.f17963a));
    }

    /* renamed from: M */
    public void mo47592M(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
        String str;
        while (byteBuffer.hasRemaining()) {
            C9445f s = mo47600s(byteBuffer.getInt());
            int unused = s.f18619c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str2 = null;
            if (i == -1) {
                str = null;
            } else {
                str = strArr[i];
            }
            String unused2 = s.f18620d = str;
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str2 = strArr[i2];
            }
            String unused3 = s.f18621e = str2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: io.flutter.view.AccessibilityBridge$i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo47593N(@androidx.annotation.NonNull java.nio.ByteBuffer r10, @androidx.annotation.NonNull java.lang.String[] r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r10.hasRemaining()
            if (r1 == 0) goto L_0x0033
            int r1 = r10.getInt()
            io.flutter.view.AccessibilityBridge$i r1 = r9.mo47602t(r1)
            r1.mo47629m0(r10, r11)
            io.flutter.view.AccessibilityBridge$g r2 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_HIDDEN
            boolean r2 = r1.mo47622e0(r2)
            if (r2 == 0) goto L_0x001f
            goto L_0x0005
        L_0x001f:
            io.flutter.view.AccessibilityBridge$g r2 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_FOCUSED
            boolean r2 = r1.mo47622e0(r2)
            if (r2 == 0) goto L_0x0029
            r9.f18595m = r1
        L_0x0029:
            boolean r2 = r1.f18682t
            if (r2 == 0) goto L_0x0005
            r0.add(r1)
            goto L_0x0005
        L_0x0033:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            io.flutter.view.AccessibilityBridge$i r11 = r9.mo47603u()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L_0x0089
            r4 = 16
            float[] r4 = new float[r4]
            android.opengl.Matrix.setIdentityM(r4, r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L_0x0083
            android.view.View r5 = r9.f18583a
            android.view.WindowInsets r5 = r5.getRootWindowInsets()
            if (r5 == 0) goto L_0x0083
            java.lang.Integer r6 = r9.f18600r
            int r7 = r5.getSystemWindowInsetLeft()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0070
            boolean unused = r11.f18660O = r2
            boolean unused = r11.f18658M = r2
        L_0x0070:
            int r5 = r5.getSystemWindowInsetLeft()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.f18600r = r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            r6 = 0
            android.opengl.Matrix.translateM(r4, r3, r5, r6, r6)
        L_0x0083:
            r11.mo47628l0(r4, r10, r3)
            r11.mo47611T(r1)
        L_0x0089:
            java.util.Iterator r11 = r1.iterator()
            r4 = 0
            r5 = r4
        L_0x008f:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r6 = r11.next()
            io.flutter.view.AccessibilityBridge$i r6 = (p630io.flutter.view.AccessibilityBridge.C9448i) r6
            java.util.List<java.lang.Integer> r7 = r9.f18598p
            int r8 = r6.f18664b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x008f
            r5 = r6
            goto L_0x008f
        L_0x00ad:
            if (r5 != 0) goto L_0x00c1
            int r11 = r1.size()
            if (r11 <= 0) goto L_0x00c1
            int r11 = r1.size()
            int r11 = r11 - r2
            java.lang.Object r11 = r1.get(r11)
            r5 = r11
            io.flutter.view.AccessibilityBridge$i r5 = (p630io.flutter.view.AccessibilityBridge.C9448i) r5
        L_0x00c1:
            if (r5 == 0) goto L_0x00d4
            int r11 = r5.f18664b
            int r6 = r9.f18599q
            if (r11 == r6) goto L_0x00d4
            int r11 = r5.f18664b
            r9.f18599q = r11
            r9.mo47589J(r5)
        L_0x00d4:
            java.util.List<java.lang.Integer> r11 = r9.f18598p
            r11.clear()
            java.util.Iterator r11 = r1.iterator()
        L_0x00dd:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r1 = r11.next()
            io.flutter.view.AccessibilityBridge$i r1 = (p630io.flutter.view.AccessibilityBridge.C9448i) r1
            java.util.List<java.lang.Integer> r5 = r9.f18598p
            int r1 = r1.f18664b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r1)
            goto L_0x00dd
        L_0x00f7:
            java.util.Map<java.lang.Integer, io.flutter.view.AccessibilityBridge$i> r11 = r9.f18589g
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0101:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            io.flutter.view.AccessibilityBridge$i r1 = (p630io.flutter.view.AccessibilityBridge.C9448i) r1
            boolean r5 = r10.contains(r1)
            if (r5 != 0) goto L_0x0101
            r9.mo47594O(r1)
            r11.remove()
            goto L_0x0101
        L_0x0120:
            r9.mo47590K(r3)
            java.util.Iterator r10 = r0.iterator()
        L_0x0127:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0304
            java.lang.Object r11 = r10.next()
            io.flutter.view.AccessibilityBridge$i r11 = (p630io.flutter.view.AccessibilityBridge.C9448i) r11
            boolean r0 = r11.mo47613V()
            if (r0 == 0) goto L_0x01f2
            int r0 = r11.f18664b
            r1 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r0 = r9.mo47580A(r0, r1)
            float r1 = r11.f18674l
            float r5 = r11.f18675m
            float r6 = r11.f18675m
            boolean r6 = java.lang.Float.isInfinite(r6)
            r7 = 1200142336(0x4788b800, float:70000.0)
            r8 = 1203982336(0x47c35000, float:100000.0)
            if (r6 == 0) goto L_0x0161
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0160
            r1 = r7
        L_0x0160:
            r5 = r8
        L_0x0161:
            float r6 = r11.f18676n
            boolean r6 = java.lang.Float.isInfinite(r6)
            if (r6 == 0) goto L_0x0176
            float r5 = r5 + r8
            r6 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0174
            r1 = r6
        L_0x0174:
            float r1 = r1 + r8
            goto L_0x0180
        L_0x0176:
            float r6 = r11.f18676n
            float r5 = r5 - r6
            float r6 = r11.f18676n
            float r1 = r1 - r6
        L_0x0180:
            io.flutter.view.AccessibilityBridge$Action r6 = p630io.flutter.view.AccessibilityBridge.Action.SCROLL_UP
            boolean r6 = r11.mo47619b0(r6)
            if (r6 != 0) goto L_0x01aa
            io.flutter.view.AccessibilityBridge$Action r6 = p630io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN
            boolean r6 = r11.mo47619b0(r6)
            if (r6 == 0) goto L_0x0191
            goto L_0x01aa
        L_0x0191:
            io.flutter.view.AccessibilityBridge$Action r6 = p630io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT
            boolean r6 = r11.mo47619b0(r6)
            if (r6 != 0) goto L_0x01a1
            io.flutter.view.AccessibilityBridge$Action r6 = p630io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT
            boolean r6 = r11.mo47619b0(r6)
            if (r6 == 0) goto L_0x01b2
        L_0x01a1:
            int r1 = (int) r1
            r0.setScrollX(r1)
            int r1 = (int) r5
            r0.setMaxScrollX(r1)
            goto L_0x01b2
        L_0x01aa:
            int r1 = (int) r1
            r0.setScrollY(r1)
            int r1 = (int) r5
            r0.setMaxScrollY(r1)
        L_0x01b2:
            int r1 = r11.f18672j
            if (r1 <= 0) goto L_0x01ef
            int r1 = r11.f18672j
            r0.setItemCount(r1)
            int r1 = r11.f18673k
            r0.setFromIndex(r1)
            java.util.List r1 = r11.f18654I
            java.util.Iterator r1 = r1.iterator()
            r5 = r3
        L_0x01cf:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x01e6
            java.lang.Object r6 = r1.next()
            io.flutter.view.AccessibilityBridge$i r6 = (p630io.flutter.view.AccessibilityBridge.C9448i) r6
            io.flutter.view.AccessibilityBridge$g r7 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_HIDDEN
            boolean r6 = r6.mo47622e0(r7)
            if (r6 != 0) goto L_0x01cf
            int r5 = r5 + 1
            goto L_0x01cf
        L_0x01e6:
            int r1 = r11.f18673k
            int r1 = r1 + r5
            int r1 = r1 - r2
            r0.setToIndex(r1)
        L_0x01ef:
            r9.mo47587H(r0)
        L_0x01f2:
            io.flutter.view.AccessibilityBridge$g r0 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_LIVE_REGION
            boolean r0 = r11.mo47622e0(r0)
            if (r0 == 0) goto L_0x0207
            boolean r0 = r11.mo47612U()
            if (r0 == 0) goto L_0x0207
            int r0 = r11.f18664b
            r9.mo47590K(r0)
        L_0x0207:
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18591i
            if (r0 == 0) goto L_0x023c
            int r0 = r0.f18664b
            int r1 = r11.f18664b
            if (r0 != r1) goto L_0x023c
            io.flutter.view.AccessibilityBridge$g r0 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_SELECTED
            boolean r0 = r11.mo47620c0(r0)
            if (r0 != 0) goto L_0x023c
            io.flutter.view.AccessibilityBridge$g r0 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_SELECTED
            boolean r0 = r11.mo47622e0(r0)
            if (r0 == 0) goto L_0x023c
            int r0 = r11.f18664b
            r1 = 4
            android.view.accessibility.AccessibilityEvent r0 = r9.mo47580A(r0, r1)
            java.util.List r1 = r0.getText()
            java.lang.String r5 = r11.f18677o
            r1.add(r5)
            r9.mo47587H(r0)
        L_0x023c:
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18595m
            if (r0 == 0) goto L_0x026c
            int r0 = r0.f18664b
            int r1 = r11.f18664b
            if (r0 != r1) goto L_0x026c
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18596n
            if (r0 == 0) goto L_0x025a
            int r0 = r0.f18664b
            io.flutter.view.AccessibilityBridge$i r1 = r9.f18595m
            int r1 = r1.f18664b
            if (r0 == r1) goto L_0x026c
        L_0x025a:
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18595m
            r9.f18596n = r0
            int r0 = r11.f18664b
            r1 = 8
            android.view.accessibility.AccessibilityEvent r0 = r9.mo47580A(r0, r1)
            r9.mo47587H(r0)
            goto L_0x0272
        L_0x026c:
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18595m
            if (r0 != 0) goto L_0x0272
            r9.f18596n = r4
        L_0x0272:
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18595m
            if (r0 == 0) goto L_0x0127
            int r0 = r0.f18664b
            int r1 = r11.f18664b
            if (r0 != r1) goto L_0x0127
            io.flutter.view.AccessibilityBridge$g r0 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_TEXT_FIELD
            boolean r0 = r11.mo47620c0(r0)
            if (r0 == 0) goto L_0x0127
            io.flutter.view.AccessibilityBridge$g r0 = p630io.flutter.view.AccessibilityBridge.C9446g.IS_TEXT_FIELD
            boolean r0 = r11.mo47622e0(r0)
            if (r0 == 0) goto L_0x0127
            io.flutter.view.AccessibilityBridge$i r0 = r9.f18591i
            if (r0 == 0) goto L_0x02a0
            int r0 = r0.f18664b
            io.flutter.view.AccessibilityBridge$i r1 = r9.f18595m
            int r1 = r1.f18664b
            if (r0 != r1) goto L_0x0127
        L_0x02a0:
            java.lang.String r0 = r11.f18688z
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x02ad
            java.lang.String r0 = r11.f18688z
            goto L_0x02ae
        L_0x02ad:
            r0 = r1
        L_0x02ae:
            java.lang.String r5 = r11.f18678p
            if (r5 == 0) goto L_0x02b8
            java.lang.String r1 = r11.f18678p
        L_0x02b8:
            int r5 = r11.f18664b
            android.view.accessibility.AccessibilityEvent r0 = r9.mo47598q(r5, r0, r1)
            if (r0 == 0) goto L_0x02c5
            r9.mo47587H(r0)
        L_0x02c5:
            int r0 = r11.f18685w
            int r5 = r11.f18669g
            if (r0 != r5) goto L_0x02d9
            int r0 = r11.f18686x
            int r5 = r11.f18670h
            if (r0 == r5) goto L_0x0127
        L_0x02d9:
            int r0 = r11.f18664b
            r5 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r0 = r9.mo47580A(r0, r5)
            java.util.List r5 = r0.getText()
            r5.add(r1)
            int r5 = r11.f18669g
            r0.setFromIndex(r5)
            int r11 = r11.f18670h
            r0.setToIndex(r11)
            int r11 = r1.length()
            r0.setItemCount(r11)
            r9.mo47587H(r0)
            goto L_0x0127
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.view.AccessibilityBridge.mo47593N(java.nio.ByteBuffer, java.lang.String[]):void");
    }

    /* renamed from: O */
    public final void mo47594O(C9448i iVar) {
        Integer num;
        C9448i unused = iVar.f18652G = null;
        if (!(iVar.f18671i == -1 || (num = this.f18592j) == null || this.f18586d.platformViewOfNode(num.intValue()) != this.f18587e.mo46686c(Integer.valueOf(iVar.f18671i)))) {
            mo47586G(this.f18592j.intValue(), 65536);
            this.f18592j = null;
        }
        C9448i iVar2 = this.f18591i;
        if (iVar2 == iVar) {
            mo47586G(iVar2.f18664b, 65536);
            this.f18591i = null;
        }
        if (this.f18595m == iVar) {
            this.f18595m = null;
        }
        if (this.f18597o == iVar) {
            this.f18597o = null;
        }
    }

    @SuppressLint({"NewApi"})
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        int i2;
        C9448i iVar;
        if (i >= 65536) {
            return this.f18586d.createAccessibilityNodeInfo(i);
        }
        boolean z = false;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f18583a);
            this.f18583a.onInitializeAccessibilityNodeInfo(obtain);
            if (this.f18589g.containsKey(0)) {
                obtain.addChild(this.f18583a, 0);
            }
            return obtain;
        }
        C9448i iVar2 = this.f18589g.get(Integer.valueOf(i));
        if (iVar2 == null) {
            return null;
        }
        if (iVar2.f18671i != -1) {
            return this.f18586d.getRootNode(this.f18587e.mo46686c(Integer.valueOf(iVar2.f18671i)), iVar2.f18664b, iVar2.mo47616Y());
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(this.f18583a, i);
        if (Build.VERSION.SDK_INT >= 18) {
            obtain2.setViewIdResourceName("");
        }
        obtain2.setPackageName(this.f18583a.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(this.f18583a, i);
        obtain2.setFocusable(iVar2.mo47624g0());
        C9448i iVar3 = this.f18595m;
        if (iVar3 != null) {
            obtain2.setFocused(iVar3.f18664b == i);
        }
        C9448i iVar4 = this.f18591i;
        if (iVar4 != null) {
            obtain2.setAccessibilityFocused(iVar4.f18664b == i);
        }
        if (iVar2.mo47622e0(C9446g.IS_TEXT_FIELD)) {
            obtain2.setPassword(iVar2.mo47622e0(C9446g.IS_OBSCURED));
            if (!iVar2.mo47622e0(C9446g.IS_READ_ONLY)) {
                obtain2.setClassName("android.widget.EditText");
            }
            if (Build.VERSION.SDK_INT >= 18) {
                obtain2.setEditable(!iVar2.mo47622e0(C9446g.IS_READ_ONLY));
                if (!(iVar2.f18669g == -1 || iVar2.f18670h == -1)) {
                    obtain2.setTextSelection(iVar2.f18669g, iVar2.f18670h);
                }
                if (Build.VERSION.SDK_INT > 18 && (iVar = this.f18591i) != null && iVar.f18664b == i) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (iVar2.mo47621d0(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (iVar2.mo47621d0(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i2 |= 1;
            }
            if (iVar2.mo47621d0(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i2 |= 2;
            }
            if (iVar2.mo47621d0(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i2 |= 2;
            }
            obtain2.setMovementGranularities(i2);
            if (Build.VERSION.SDK_INT >= 21 && iVar2.f18667e >= 0) {
                int length = iVar2.f18678p == null ? 0 : iVar2.f18678p.length();
                int unused = iVar2.f18668f;
                int unused2 = iVar2.f18667e;
                obtain2.setMaxTextLength((length - iVar2.f18668f) + iVar2.f18667e);
            }
        }
        if (Build.VERSION.SDK_INT > 18) {
            if (iVar2.mo47621d0(Action.SET_SELECTION)) {
                obtain2.addAction(131072);
            }
            if (iVar2.mo47621d0(Action.COPY)) {
                obtain2.addAction(16384);
            }
            if (iVar2.mo47621d0(Action.CUT)) {
                obtain2.addAction(65536);
            }
            if (iVar2.mo47621d0(Action.PASTE)) {
                obtain2.addAction(32768);
            }
        }
        if (iVar2.mo47622e0(C9446g.IS_BUTTON) || iVar2.mo47622e0(C9446g.IS_LINK)) {
            obtain2.setClassName(Chip.BUTTON_ACCESSIBILITY_CLASS_NAME);
        }
        if (iVar2.mo47622e0(C9446g.IS_IMAGE)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (Build.VERSION.SDK_INT > 18 && iVar2.mo47621d0(Action.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        if (iVar2.f18652G != null) {
            obtain2.setParent(this.f18583a, iVar2.f18652G.f18664b);
        } else {
            obtain2.setParent(this.f18583a);
        }
        Rect d = iVar2.mo47616Y();
        if (iVar2.f18652G != null) {
            Rect d2 = iVar2.f18652G.mo47616Y();
            Rect rect = new Rect(d);
            rect.offset(-d2.left, -d2.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(d);
        }
        obtain2.setBoundsInScreen(d);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!iVar2.mo47622e0(C9446g.HAS_ENABLED_STATE) || iVar2.mo47622e0(C9446g.IS_ENABLED));
        if (iVar2.mo47621d0(Action.TAP)) {
            if (Build.VERSION.SDK_INT < 21 || iVar2.f18656K == null) {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iVar2.f18656K.f18621e));
                obtain2.setClickable(true);
            }
        }
        if (iVar2.mo47621d0(Action.LONG_PRESS)) {
            if (Build.VERSION.SDK_INT < 21 || iVar2.f18657L == null) {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, iVar2.f18657L.f18621e));
                obtain2.setLongClickable(true);
            }
        }
        if (iVar2.mo47621d0(Action.SCROLL_LEFT) || iVar2.mo47621d0(Action.SCROLL_UP) || iVar2.mo47621d0(Action.SCROLL_RIGHT) || iVar2.mo47621d0(Action.SCROLL_DOWN)) {
            obtain2.setScrollable(true);
            if (iVar2.mo47622e0(C9446g.HAS_IMPLICIT_SCROLLING)) {
                if (iVar2.mo47621d0(Action.SCROLL_LEFT) || iVar2.mo47621d0(Action.SCROLL_RIGHT)) {
                    if (Build.VERSION.SDK_INT <= 19 || !mo47591L(iVar2)) {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    } else {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, iVar2.f18672j, false));
                    }
                } else if (Build.VERSION.SDK_INT <= 18 || !mo47591L(iVar2)) {
                    obtain2.setClassName("android.widget.ScrollView");
                } else {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iVar2.f18672j, 0, false));
                }
            }
            if (iVar2.mo47621d0(Action.SCROLL_LEFT) || iVar2.mo47621d0(Action.SCROLL_UP)) {
                obtain2.addAction(4096);
            }
            if (iVar2.mo47621d0(Action.SCROLL_RIGHT) || iVar2.mo47621d0(Action.SCROLL_DOWN)) {
                obtain2.addAction(8192);
            }
        }
        if (iVar2.mo47621d0(Action.INCREASE) || iVar2.mo47621d0(Action.DECREASE)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (iVar2.mo47621d0(Action.INCREASE)) {
                obtain2.addAction(4096);
            }
            if (iVar2.mo47621d0(Action.DECREASE)) {
                obtain2.addAction(8192);
            }
        }
        if (iVar2.mo47622e0(C9446g.IS_LIVE_REGION) && Build.VERSION.SDK_INT > 18) {
            obtain2.setLiveRegion(1);
        }
        if (iVar2.mo47622e0(C9446g.IS_TEXT_FIELD)) {
            obtain2.setText(iVar2.mo47618a0());
        } else if (!iVar2.mo47622e0(C9446g.SCOPES_ROUTE)) {
            obtain2.setContentDescription(iVar2.mo47618a0());
        }
        boolean h = iVar2.mo47622e0(C9446g.HAS_CHECKED_STATE);
        boolean h2 = iVar2.mo47622e0(C9446g.HAS_TOGGLED_STATE);
        if (h || h2) {
            z = true;
        }
        obtain2.setCheckable(z);
        if (h) {
            obtain2.setChecked(iVar2.mo47622e0(C9446g.IS_CHECKED));
            if (iVar2.mo47622e0(C9446g.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (h2) {
            obtain2.setChecked(iVar2.mo47622e0(C9446g.IS_TOGGLED));
            obtain2.setClassName(SwitchCompat.ACCESSIBILITY_EVENT_CLASS_NAME);
        }
        obtain2.setSelected(iVar2.mo47622e0(C9446g.IS_SELECTED));
        if (Build.VERSION.SDK_INT >= 28) {
            obtain2.setHeading(iVar2.mo47622e0(C9446g.IS_HEADER));
        }
        C9448i iVar5 = this.f18591i;
        if (iVar5 == null || iVar5.f18664b != i) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        if (Build.VERSION.SDK_INT >= 21 && iVar2.f18655J != null) {
            for (C9445f fVar : iVar2.f18655J) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f18617a, fVar.f18620d));
            }
        }
        for (C9448i iVar6 : iVar2.f18653H) {
            if (!iVar6.mo47622e0(C9446g.IS_HIDDEN)) {
                obtain2.addChild(this.f18583a, iVar6.f18664b);
            }
        }
        return obtain2;
    }

    public AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            C9448i iVar = this.f18595m;
            if (iVar != null) {
                return createAccessibilityNodeInfo(iVar.f18664b);
            }
            Integer num = this.f18593k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        C9448i iVar2 = this.f18591i;
        if (iVar2 != null) {
            return createAccessibilityNodeInfo(iVar2.f18664b);
        }
        Integer num2 = this.f18592j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean performAction(int i, int i2, @Nullable Bundle bundle) {
        if (i >= 65536) {
            boolean performAction = this.f18586d.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.f18592j = null;
            }
            return performAction;
        }
        C9448i iVar = this.f18589g.get(Integer.valueOf(i));
        boolean z = false;
        if (iVar == null) {
            return false;
        }
        switch (i2) {
            case 16:
                this.f18584b.mo46504b(i, Action.TAP);
                return true;
            case 32:
                this.f18584b.mo46504b(i, Action.LONG_PRESS);
                return true;
            case 64:
                this.f18584b.mo46504b(i, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                mo47586G(i, 32768);
                if (this.f18591i == null) {
                    this.f18583a.invalidate();
                }
                this.f18591i = iVar;
                if (iVar.mo47621d0(Action.INCREASE) || iVar.mo47621d0(Action.DECREASE)) {
                    mo47586G(i, 4);
                }
                return true;
            case 128:
                this.f18584b.mo46504b(i, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                mo47586G(i, 65536);
                this.f18591i = null;
                this.f18592j = null;
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return mo47583D(iVar, i, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return mo47583D(iVar, i, bundle, false);
            case 4096:
                if (iVar.mo47621d0(Action.SCROLL_UP)) {
                    this.f18584b.mo46504b(i, Action.SCROLL_UP);
                } else if (iVar.mo47621d0(Action.SCROLL_LEFT)) {
                    this.f18584b.mo46504b(i, Action.SCROLL_LEFT);
                } else if (!iVar.mo47621d0(Action.INCREASE)) {
                    return false;
                } else {
                    String unused = iVar.f18678p = iVar.f18679q;
                    mo47586G(i, 4);
                    this.f18584b.mo46504b(i, Action.INCREASE);
                }
                return true;
            case 8192:
                if (iVar.mo47621d0(Action.SCROLL_DOWN)) {
                    this.f18584b.mo46504b(i, Action.SCROLL_DOWN);
                } else if (iVar.mo47621d0(Action.SCROLL_RIGHT)) {
                    this.f18584b.mo46504b(i, Action.SCROLL_RIGHT);
                } else if (!iVar.mo47621d0(Action.DECREASE)) {
                    return false;
                } else {
                    String unused2 = iVar.f18678p = iVar.f18680r;
                    mo47586G(i, 4);
                    this.f18584b.mo46504b(i, Action.DECREASE);
                }
                return true;
            case 16384:
                this.f18584b.mo46504b(i, Action.COPY);
                return true;
            case 32768:
                this.f18584b.mo46504b(i, Action.PASTE);
                return true;
            case 65536:
                this.f18584b.mo46504b(i, Action.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT) && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT)) {
                    z = true;
                }
                if (z) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT)));
                    hashMap.put("extent", Integer.valueOf(bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT)));
                } else {
                    hashMap.put("base", Integer.valueOf(iVar.f18670h));
                    hashMap.put("extent", Integer.valueOf(iVar.f18670h));
                }
                this.f18584b.mo46505c(i, Action.SET_SELECTION, hashMap);
                return true;
            case 1048576:
                this.f18584b.mo46504b(i, Action.DISMISS);
                return true;
            case 16908342:
                this.f18584b.mo46504b(i, Action.SHOW_ON_SCREEN);
                return true;
            default:
                C9445f fVar = this.f18590h.get(Integer.valueOf(i2 - f18582y));
                if (fVar == null) {
                    return false;
                }
                this.f18584b.mo46505c(i, Action.CUSTOM_ACTION, Integer.valueOf(fVar.f18618b));
                return true;
        }
    }

    /* renamed from: q */
    public final AccessibilityEvent mo47598q(int i, String str, String str2) {
        AccessibilityEvent A = mo47580A(i, 16);
        A.setBeforeText(str);
        A.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 >= str.length() && i2 >= str2.length()) {
            return null;
        }
        A.setFromIndex(i2);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        A.setRemovedCount((length - i2) + 1);
        A.setAddedCount((length2 - i2) + 1);
        return A;
    }

    /* renamed from: r */
    public boolean mo47599r(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f18586d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f18586d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f18593k = recordFlutterId;
            this.f18595m = null;
            return true;
        } else if (eventType == 128) {
            this.f18597o = null;
            return true;
        } else if (eventType == 32768) {
            this.f18592j = recordFlutterId;
            this.f18591i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f18593k = null;
            this.f18592j = null;
            return true;
        }
    }

    /* renamed from: s */
    public final C9445f mo47600s(int i) {
        C9445f fVar = this.f18590h.get(Integer.valueOf(i));
        if (fVar != null) {
            return fVar;
        }
        C9445f fVar2 = new C9445f();
        int unused = fVar2.f18618b = i;
        int unused2 = fVar2.f18617a = f18582y + i;
        this.f18590h.put(Integer.valueOf(i), fVar2);
        return fVar2;
    }

    public void setOnAccessibilityChangeListener(@Nullable C9447h hVar) {
        this.f18601s = hVar;
    }

    /* renamed from: t */
    public final C9448i mo47602t(int i) {
        C9448i iVar = this.f18589g.get(Integer.valueOf(i));
        if (iVar != null) {
            return iVar;
        }
        C9448i iVar2 = new C9448i(this);
        int unused = iVar2.f18664b = i;
        this.f18589g.put(Integer.valueOf(i), iVar2);
        return iVar2;
    }

    /* renamed from: u */
    public final C9448i mo47603u() {
        return this.f18589g.get(0);
    }

    /* renamed from: v */
    public final void mo47604v(float f, float f2) {
        C9448i y;
        if (!this.f18589g.isEmpty() && (y = mo47603u().mo47623f0(new float[]{f, f2, 0.0f, 1.0f})) != this.f18597o) {
            if (y != null) {
                mo47586G(y.f18664b, 128);
            }
            C9448i iVar = this.f18597o;
            if (iVar != null) {
                mo47586G(iVar.f18664b, 256);
            }
            this.f18597o = y;
        }
    }

    /* renamed from: w */
    public boolean mo47605w() {
        return this.f18585c.isEnabled();
    }

    /* renamed from: x */
    public boolean mo47606x() {
        return this.f18585c.isTouchExplorationEnabled();
    }

    @VisibleForTesting
    public AccessibilityBridge(@NonNull View view, @NonNull C8972b bVar, @NonNull AccessibilityManager accessibilityManager, @NonNull ContentResolver contentResolver, @NonNull AccessibilityViewEmbedder accessibilityViewEmbedder, C9059i iVar) {
        this.f18589g = new HashMap();
        this.f18590h = new HashMap();
        this.f18594l = 0;
        this.f18598p = new ArrayList();
        this.f18599q = 0;
        this.f18600r = 0;
        this.f18602t = false;
        this.f18603u = new C9440a();
        this.f18604v = new C9441b();
        this.f18606x = new C9442c(new Handler());
        this.f18583a = view;
        this.f18584b = bVar;
        this.f18585c = accessibilityManager;
        this.f18588f = contentResolver;
        this.f18586d = accessibilityViewEmbedder;
        this.f18587e = iVar;
        this.f18604v.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        this.f18585c.addAccessibilityStateChangeListener(this.f18604v);
        if (Build.VERSION.SDK_INT >= 19) {
            C9443d dVar = new C9443d(accessibilityManager);
            this.f18605w = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            this.f18585c.addTouchExplorationStateChangeListener(this.f18605w);
        } else {
            this.f18605w = null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f18606x.onChange(false);
            this.f18588f.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.f18606x);
        }
        if (iVar != null) {
            iVar.mo46684a(this);
        }
    }
}
