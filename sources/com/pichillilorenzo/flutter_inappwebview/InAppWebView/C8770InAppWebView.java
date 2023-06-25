package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompatJellybean;
import androidx.navigation.NavInflater;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.R$layout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import p040c.p313b0.p314a.C4209l;
import p040c.p313b0.p314a.C4221o;
import p040c.p313b0.p314a.C4222p;
import p040c.p313b0.p314a.p316c.C4151a;
import p040c.p313b0.p314a.p316c.C4152b;
import p040c.p313b0.p314a.p316c.C4153c;
import p040c.p313b0.p314a.p316c.C4157d;
import p040c.p313b0.p314a.p319i.C4168a;
import p040c.p313b0.p314a.p319i.C4171c;
import p040c.p313b0.p314a.p319i.C4176e;
import p040c.p313b0.p314a.p319i.C4195f;
import p040c.p313b0.p314a.p319i.C4202g;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView */
public final class C8770InAppWebView extends InputAwareWebView {

    /* renamed from: M */
    public static Handler f16792M = new Handler();

    /* renamed from: A */
    public Pattern f16793A;

    /* renamed from: B */
    public GestureDetector f16794B = null;

    /* renamed from: C */
    public LinearLayout f16795C = null;

    /* renamed from: D */
    public Map<String, Object> f16796D = null;

    /* renamed from: E */
    public Handler f16797E = new Handler(Looper.getMainLooper());

    /* renamed from: F */
    public Runnable f16798F;

    /* renamed from: G */
    public int f16799G;

    /* renamed from: H */
    public int f16800H = 100;

    /* renamed from: I */
    public Runnable f16801I;

    /* renamed from: J */
    public int f16802J = 100;

    /* renamed from: K */
    public Point f16803K = new Point(0, 0);

    /* renamed from: L */
    public Point f16804L = new Point(0, 0);

    /* renamed from: n */
    public InAppBrowserActivity f16805n;

    /* renamed from: o */
    public C4171c f16806o;

    /* renamed from: p */
    public C9017j f16807p;

    /* renamed from: q */
    public Object f16808q;

    /* renamed from: r */
    public Integer f16809r;

    /* renamed from: s */
    public C4195f f16810s;

    /* renamed from: t */
    public C4176e f16811t;

    /* renamed from: u */
    public InAppWebViewRenderProcessClient f16812u;

    /* renamed from: v */
    public C4209l f16813v;

    /* renamed from: w */
    public C4202g f16814w;

    /* renamed from: x */
    public boolean f16815x = false;

    /* renamed from: y */
    public float f16816y = getResources().getDisplayMetrics().density;

    /* renamed from: z */
    public C4153c f16817z = new C4153c();

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$a */
    public class C8771a implements Runnable {
        public C8771a() {
        }

        public void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) C8770InAppWebView.this.getContext().getSystemService("input_method");
            if (inputMethodManager != null && !inputMethodManager.isAcceptingText()) {
                inputMethodManager.hideSoftInputFromWindow(C8770InAppWebView.this.f16857e.getWindowToken(), 2);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$b */
    public class C8772b implements View.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ ActionMode.Callback f16819e;

        /* renamed from: l */
        public final /* synthetic */ ActionMode f16820l;

        /* renamed from: m */
        public final /* synthetic */ MenuItem f16821m;

        /* renamed from: n */
        public final /* synthetic */ int f16822n;

        /* renamed from: o */
        public final /* synthetic */ String f16823o;

        public C8772b(ActionMode.Callback callback, ActionMode actionMode, MenuItem menuItem, int i, String str) {
            this.f16819e = callback;
            this.f16820l = actionMode;
            this.f16821m = menuItem;
            this.f16822n = i;
            this.f16823o = str;
        }

        public void onClick(View view) {
            C8770InAppWebView.this.mo45787n();
            this.f16819e.onActionItemClicked(this.f16820l, this.f16821m);
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = C8770InAppWebView.this.f16805n;
            if (inAppBrowserActivity != null) {
                hashMap.put("uuid", inAppBrowserActivity.f16775m);
            }
            hashMap.put("androidId", Integer.valueOf(this.f16822n));
            hashMap.put("iosId", (Object) null);
            hashMap.put(NotificationCompatJellybean.KEY_TITLE, this.f16823o);
            C8770InAppWebView.this.f16807p.mo46573c("onContextMenuActionItemClicked", hashMap);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$c */
    public class C8773c implements View.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ int f16825e;

        /* renamed from: l */
        public final /* synthetic */ String f16826l;

        public C8773c(int i, String str) {
            this.f16825e = i;
            this.f16826l = str;
        }

        public void onClick(View view) {
            C8770InAppWebView.this.mo45787n();
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = C8770InAppWebView.this.f16805n;
            if (inAppBrowserActivity != null) {
                hashMap.put("uuid", inAppBrowserActivity.f16775m);
            }
            hashMap.put("androidId", Integer.valueOf(this.f16825e));
            hashMap.put("iosId", (Object) null);
            hashMap.put(NotificationCompatJellybean.KEY_TITLE, this.f16826l);
            C8770InAppWebView.this.f16807p.mo46573c("onContextMenuActionItemClicked", hashMap);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$d */
    public class C8774d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: e */
        public final /* synthetic */ int f16828e;

        /* renamed from: l */
        public final /* synthetic */ int f16829l;

        public C8774d(int i, int i2) {
            this.f16828e = i;
            this.f16829l = i2;
        }

        public void onGlobalLayout() {
            LinearLayout linearLayout = C8770InAppWebView.this.f16795C;
            if (linearLayout != null) {
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (C8770InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                    C8770InAppWebView.this.mo45762A();
                } else {
                    C8770InAppWebView.this.mo45808y(this.f16828e, this.f16829l);
                }
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$e */
    public class C8775e implements Runnable {
        public C8775e() {
        }

        public void run() {
            LinearLayout linearLayout = C8770InAppWebView.this.f16795C;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                C8770InAppWebView.this.f16795C.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$f */
    public class C8776f implements ValueCallback<String> {
        public C8776f() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            C8770InAppWebView inAppWebView = C8770InAppWebView.this;
            LinearLayout linearLayout = inAppWebView.f16795C;
            if (linearLayout == null) {
                return;
            }
            if (str != null) {
                int i = inAppWebView.f16803K.x;
                float parseFloat = Float.parseFloat(str);
                C8770InAppWebView inAppWebView2 = C8770InAppWebView.this;
                int height = (int) (((double) (parseFloat * inAppWebView2.f16816y)) + (((double) inAppWebView2.f16795C.getHeight()) / 3.5d));
                C8770InAppWebView.this.f16803K.y = height;
                C8770InAppWebView.this.mo45808y(i, height);
                return;
            }
            linearLayout.setVisibility(0);
            C8770InAppWebView.this.f16795C.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$g */
    public class C8777g implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f16833a;

        public C8777g(C8770InAppWebView inAppWebView, ValueCallback valueCallback) {
            this.f16833a = valueCallback;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f16833a.onReceiveValue(str != null ? str.substring(1, str.length() - 1) : null);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$h */
    public class C8778h implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f16834a;

        public C8778h(C8770InAppWebView inAppWebView, C9017j.C9022d dVar) {
            this.f16834a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f16834a.success(str);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$i */
    public static /* synthetic */ class C8779i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType[] r0 = com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16835a = r0
                com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType.DESKTOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16835a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType.MOBILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16835a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.InAppWebView.PreferredContentModeOptionType.RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.InAppWebView.C8770InAppWebView.C8779i.<clinit>():void");
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$j */
    public class C8780j implements WebView.FindListener {
        public C8780j() {
        }

        public void onFindResultReceived(int i, int i2, boolean z) {
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = C8770InAppWebView.this.f16805n;
            if (inAppBrowserActivity != null) {
                hashMap.put("uuid", inAppBrowserActivity.f16775m);
            }
            hashMap.put("activeMatchOrdinal", Integer.valueOf(i));
            hashMap.put("numberOfMatches", Integer.valueOf(i2));
            hashMap.put("isDoneCounting", Boolean.valueOf(z));
            C8770InAppWebView.this.f16807p.mo46573c("onFindResultReceived", hashMap);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$k */
    public class C8781k extends GestureDetector.SimpleOnGestureListener {
        public C8781k() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C8770InAppWebView inAppWebView = C8770InAppWebView.this;
            if (inAppWebView.f16795C != null) {
                inAppWebView.mo45787n();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$l */
    public class C8782l implements Runnable {
        public C8782l() {
        }

        public void run() {
            int scrollY = C8770InAppWebView.this.getScrollY();
            C8770InAppWebView inAppWebView = C8770InAppWebView.this;
            if (inAppWebView.f16799G - scrollY == 0) {
                inAppWebView.mo45762A();
                return;
            }
            inAppWebView.f16799G = inAppWebView.getScrollY();
            C8770InAppWebView inAppWebView2 = C8770InAppWebView.this;
            inAppWebView2.f16797E.postDelayed(inAppWebView2.f16798F, (long) inAppWebView2.f16800H);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$m */
    public class C8783m implements Runnable {

        /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$m$a */
        public class C8784a implements ValueCallback<String> {
            public C8784a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
                if (str == null || str.equals("true")) {
                    C8770InAppWebView inAppWebView = C8770InAppWebView.this;
                    if (inAppWebView.f16795C != null) {
                        inAppWebView.mo45787n();
                        return;
                    }
                    return;
                }
                C8770InAppWebView inAppWebView2 = C8770InAppWebView.this;
                inAppWebView2.f16797E.postDelayed(inAppWebView2.f16801I, (long) inAppWebView2.f16802J);
            }
        }

        public C8783m() {
        }

        public void run() {
            C8770InAppWebView inAppWebView = C8770InAppWebView.this;
            if (inAppWebView.f16795C != null) {
                inAppWebView.evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }var activeEl = document.activeElement;var nodeName = (activeEl != null) ? activeEl.nodeName.toLowerCase() : '';var isActiveElementInputEditable = activeEl != null && (activeEl.nodeType == 1 && (nodeName == 'textarea' || (nodeName == 'input' && /^(?:text|email|number|search|tel|url|password)$/i.test(activeEl.type != null ? activeEl.type : 'text')))) && !activeEl.disabled && !activeEl.readOnly;var isActiveElementEditable = isActiveElementInputEditable || (activeEl != null && activeEl.isContentEditable) || document.designMode === 'on';  return txt === '' && !isActiveElementEditable;})();", new C8784a());
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$n */
    public class C8785n implements View.OnTouchListener {

        /* renamed from: e */
        public float f16841e;

        /* renamed from: l */
        public float f16842l;

        public C8785n() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C8770InAppWebView.this.f16794B.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                C8770InAppWebView.this.f16798F.run();
            }
            if (!C8770InAppWebView.this.f16814w.f8947w.booleanValue() || !C8770InAppWebView.this.f16814w.f8945v.booleanValue()) {
                if (C8770InAppWebView.this.f16814w.f8947w.booleanValue() || C8770InAppWebView.this.f16814w.f8945v.booleanValue()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f16841e = motionEvent.getX();
                        this.f16842l = motionEvent.getY();
                    } else if (action == 1 || action == 2 || action == 3) {
                        if (C8770InAppWebView.this.f16814w.f8947w.booleanValue()) {
                            motionEvent.setLocation(this.f16841e, motionEvent.getY());
                        } else {
                            motionEvent.setLocation(motionEvent.getX(), this.f16842l);
                        }
                    }
                }
                return false;
            } else if (motionEvent.getAction() == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$o */
    public class C8786o implements View.OnLongClickListener {
        public C8786o() {
        }

        public boolean onLongClick(View view) {
            WebView.HitTestResult hitTestResult = C8770InAppWebView.this.getHitTestResult();
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(hitTestResult.getType()));
            hashMap.put("extra", hitTestResult.getExtra());
            HashMap hashMap2 = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = C8770InAppWebView.this.f16805n;
            if (inAppBrowserActivity != null) {
                hashMap2.put("uuid", inAppBrowserActivity.f16775m);
            }
            hashMap2.put("hitTestResult", hashMap);
            C8770InAppWebView.this.f16807p.mo46573c("onLongPressHitTestResult", hashMap2);
            return false;
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$p */
    public class C8787p implements ValueCallback<Boolean> {
        public C8787p(C8770InAppWebView inAppWebView) {
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$q */
    public class C8788q implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9017j.C9022d f16845e;

        public C8788q(C9017j.C9022d dVar) {
            this.f16845e = dVar;
        }

        public void run() {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(C8770InAppWebView.this.getWidth(), (int) (((double) (((float) C8770InAppWebView.this.getContentHeight()) * C8770InAppWebView.this.f16816y)) + 0.5d), Bitmap.Config.ARGB_8888);
                C8770InAppWebView.this.draw(new Canvas(createBitmap));
                int scrollY = C8770InAppWebView.this.getScrollY();
                int measuredHeight = C8770InAppWebView.this.getMeasuredHeight();
                int height = createBitmap.getHeight();
                if (scrollY + measuredHeight > height) {
                    scrollY = height - measuredHeight;
                }
                if (scrollY < 0) {
                    scrollY = 0;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, scrollY, createBitmap.getWidth(), measuredHeight);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    String message = e.getMessage();
                }
                createBitmap2.recycle();
                this.f16845e.success(byteArrayOutputStream.toByteArray());
            } catch (IllegalArgumentException e2) {
                String message2 = e2.getMessage();
                this.f16845e.success((Object) null);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$r */
    public class C8789r implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f16847e;

        /* renamed from: l */
        public final /* synthetic */ C9017j.C9022d f16848l;

        /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$r$a */
        public class C8790a implements ValueCallback<String> {
            public C8790a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
                C9017j.C9022d dVar = C8789r.this.f16848l;
                if (dVar != null) {
                    dVar.success(str);
                }
            }
        }

        public C8789r(String str, C9017j.C9022d dVar) {
            this.f16847e = str;
            this.f16848l = dVar;
        }

        public void run() {
            if (Build.VERSION.SDK_INT < 19) {
                C8770InAppWebView inAppWebView = C8770InAppWebView.this;
                inAppWebView.loadUrl("javascript:" + this.f16847e);
                this.f16848l.success("");
                return;
            }
            C8770InAppWebView.this.evaluateJavascript(this.f16847e, new C8790a());
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView$s */
    public class C8791s implements DownloadListener {
        public C8791s() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity = C8770InAppWebView.this.f16805n;
            if (inAppBrowserActivity != null) {
                hashMap.put("uuid", inAppBrowserActivity.f16775m);
            }
            hashMap.put("url", str);
            C8770InAppWebView.this.f16807p.mo46573c("onDownloadStart", hashMap);
        }
    }

    public C8770InAppWebView(Context context) {
        super(context);
    }

    /* renamed from: k */
    public static Map<String, Object> m23623k(SslCertificate sslCertificate) {
        byte[] bArr = null;
        if (sslCertificate == null) {
            return null;
        }
        SslCertificate.DName issuedBy = sslCertificate.getIssuedBy();
        HashMap hashMap = new HashMap();
        hashMap.put("CName", issuedBy.getCName());
        hashMap.put("DName", issuedBy.getDName());
        hashMap.put("OName", issuedBy.getOName());
        hashMap.put("UName", issuedBy.getUName());
        SslCertificate.DName issuedTo = sslCertificate.getIssuedTo();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("CName", issuedTo.getCName());
        hashMap2.put("DName", issuedTo.getDName());
        hashMap2.put("OName", issuedTo.getOName());
        hashMap2.put("UName", issuedTo.getUName());
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                X509Certificate x509Certificate = sslCertificate.getX509Certificate();
                if (x509Certificate != null) {
                    bArr = x509Certificate.getEncoded();
                }
            } catch (CertificateEncodingException e) {
                e.printStackTrace();
            }
        } else {
            try {
                bArr = C4222p.m11506d(sslCertificate).getEncoded();
            } catch (CertificateEncodingException e2) {
                e2.printStackTrace();
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("issuedBy", hashMap);
        hashMap3.put("issuedTo", hashMap2);
        hashMap3.put("validNotAfterDate", Long.valueOf(sslCertificate.getValidNotAfterDate().getTime()));
        hashMap3.put("validNotBeforeDate", Long.valueOf(sslCertificate.getValidNotBeforeDate().getTime()));
        hashMap3.put("x509Certificate", bArr);
        return hashMap3;
    }

    /* renamed from: A */
    public void mo45762A() {
        if (this.f16795C != null && Build.VERSION.SDK_INT >= 19) {
            mo45777g();
        }
    }

    /* renamed from: B */
    public void mo45763B(String str, byte[] bArr, C9017j.C9022d dVar) {
        if (!str.isEmpty()) {
            postUrl(str, bArr);
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.error("InAppWebView", "url is empty", (Object) null);
    }

    /* renamed from: C */
    public void mo45764C() {
        Integer num;
        Integer num2;
        Integer num3;
        boolean z = this.f16805n != null;
        new OkHttpClient().newBuilder().build();
        C4209l lVar = new C4209l(z ? this.f16805n : this.f16806o);
        this.f16813v = lVar;
        addJavascriptInterface(lVar, "flutter_inappwebview");
        C4176e eVar = new C4176e(z ? this.f16805n : this.f16806o);
        this.f16811t = eVar;
        setWebChromeClient(eVar);
        C4195f fVar = new C4195f(z ? this.f16805n : this.f16806o);
        this.f16810s = fVar;
        setWebViewClient(fVar);
        if (Build.VERSION.SDK_INT >= 29 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE)) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = new InAppWebViewRenderProcessClient(z ? this.f16805n : this.f16806o);
            this.f16812u = inAppWebViewRenderProcessClient;
            WebViewCompat.setWebViewRenderProcessClient(this, inAppWebViewRenderProcessClient);
        }
        if (this.f16814w.f8907c.booleanValue()) {
            setDownloadListener(new C8791s());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.f16814w.f8915g.booleanValue());
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(this.f16814w.f8917h.booleanValue());
        }
        settings.setJavaScriptCanOpenWindowsAutomatically(this.f16814w.f8919i.booleanValue());
        settings.setBuiltInZoomControls(this.f16814w.f8878B.booleanValue());
        settings.setDisplayZoomControls(this.f16814w.f8879C.booleanValue());
        settings.setSupportMultipleWindows(this.f16814w.f8928m0.booleanValue());
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(this.f16814w.f8883G.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.f16814w.f8921j.booleanValue());
        settings.setDatabaseEnabled(this.f16814w.f8880D.booleanValue());
        settings.setDomStorageEnabled(this.f16814w.f8881E.booleanValue());
        String str = this.f16814w.f8911e;
        if (str != null && !str.isEmpty()) {
            settings.setUserAgentString(this.f16814w.f8911e);
        } else if (Build.VERSION.SDK_INT >= 17) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        }
        String str2 = this.f16814w.f8913f;
        if (str2 != null && !str2.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String str3 = this.f16814w.f8911e;
            String defaultUserAgent = (str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.f16814w.f8911e;
            settings.setUserAgentString(defaultUserAgent + " " + this.f16814w.f8913f);
        }
        if (this.f16814w.f8909d.booleanValue()) {
            mo45782h();
        } else if (this.f16814w.f8877A.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.f16814w.f8924k0.booleanValue());
        }
        settings.setLoadWithOverviewMode(this.f16814w.f8904a0.booleanValue());
        settings.setUseWideViewPort(this.f16814w.f8882F.booleanValue());
        settings.setSupportZoom(this.f16814w.f8951y.booleanValue());
        settings.setTextZoom(this.f16814w.f8953z.intValue());
        setVerticalScrollBarEnabled(!this.f16814w.f8945v.booleanValue() && this.f16814w.f8925l.booleanValue());
        setHorizontalScrollBarEnabled(!this.f16814w.f8947w.booleanValue() && this.f16814w.f8927m.booleanValue());
        if (this.f16814w.f8943u.booleanValue()) {
            setBackgroundColor(0);
        }
        if (Build.VERSION.SDK_INT >= 21 && (num3 = this.f16814w.f8884H) != null) {
            settings.setMixedContentMode(num3.intValue());
        }
        settings.setAllowContentAccess(this.f16814w.f8885I.booleanValue());
        settings.setAllowFileAccess(this.f16814w.f8886J.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.f16814w.f8887K.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.f16814w.f8888L.booleanValue());
        setCacheEnabled(this.f16814w.f8941t.booleanValue());
        String str4 = this.f16814w.f8889M;
        if (str4 != null && !str4.isEmpty() && this.f16814w.f8941t.booleanValue()) {
            settings.setAppCachePath(this.f16814w.f8889M);
        }
        settings.setBlockNetworkImage(this.f16814w.f8890N.booleanValue());
        settings.setBlockNetworkLoads(this.f16814w.f8891O.booleanValue());
        Integer num4 = this.f16814w.f8892P;
        if (num4 != null) {
            settings.setCacheMode(num4.intValue());
        }
        settings.setCursiveFontFamily(this.f16814w.f8893Q);
        settings.setDefaultFixedFontSize(this.f16814w.f8894R.intValue());
        settings.setDefaultFontSize(this.f16814w.f8895S.intValue());
        settings.setDefaultTextEncodingName(this.f16814w.f8896T);
        if (Build.VERSION.SDK_INT >= 24 && (num2 = this.f16814w.f8897U) != null) {
            settings.setDisabledActionModeMenuItems(num2.intValue());
        }
        settings.setFantasyFontFamily(this.f16814w.f8898V);
        settings.setFixedFontFamily(this.f16814w.f8899W);
        if (Build.VERSION.SDK_INT >= 29 && (num = this.f16814w.f8900X) != null) {
            settings.setForceDark(num.intValue());
        }
        settings.setGeolocationEnabled(this.f16814w.f8901Y.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.f16814w.f8902Z;
        if (layoutAlgorithm != null) {
            if (Build.VERSION.SDK_INT < 19 || !layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(this.f16814w.f8902Z);
            } else {
                settings.setLayoutAlgorithm(this.f16814w.f8902Z);
            }
        }
        settings.setLoadsImagesAutomatically(this.f16814w.f8906b0.booleanValue());
        settings.setMinimumFontSize(this.f16814w.f8923k.intValue());
        settings.setMinimumLogicalFontSize(this.f16814w.f8908c0.intValue());
        setInitialScale(this.f16814w.f8910d0.intValue());
        settings.setNeedInitialFocus(this.f16814w.f8912e0.booleanValue());
        if (Build.VERSION.SDK_INT >= 23) {
            settings.setOffscreenPreRaster(this.f16814w.f8914f0.booleanValue());
        }
        settings.setSansSerifFontFamily(this.f16814w.f8916g0);
        settings.setSerifFontFamily(this.f16814w.f8918h0);
        settings.setStandardFontFamily(this.f16814w.f8920i0);
        Integer num5 = this.f16814w.f8933p;
        if (num5 != null && num5.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.f16814w.f8922j0.booleanValue());
        if (this.f16814w.f8939s.booleanValue()) {
            setIncognito(true);
        }
        if (this.f16814w.f8926l0.booleanValue()) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
        String str5 = this.f16814w.f8930n0;
        if (str5 != null) {
            this.f16793A = Pattern.compile(str5);
        }
        setScrollBarStyle(this.f16814w.f8936q0.intValue());
        C4202g gVar = this.f16814w;
        Integer num6 = gVar.f8940s0;
        if (num6 != null) {
            setScrollBarDefaultDelayBeforeFade(num6.intValue());
        } else {
            gVar.f8940s0 = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.f16814w.f8942t0.booleanValue());
        C4202g gVar2 = this.f16814w;
        Integer num7 = gVar2.f8944u0;
        if (num7 != null) {
            setScrollBarFadeDuration(num7.intValue());
        } else {
            gVar2.f8944u0 = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.f16814w.f8938r0.intValue());
        setOverScrollMode(this.f16814w.f8932o0.intValue());
        Boolean bool = this.f16814w.f8934p0;
        if (bool != null) {
            setNetworkAvailable(bool.booleanValue());
        }
        Map<String, Object> map = this.f16814w.f8946v0;
        if (map == null || map.isEmpty() || Build.VERSION.SDK_INT < 26) {
            Map<String, Object> map2 = this.f16814w.f8946v0;
            if ((map2 == null || (map2 != null && map2.isEmpty())) && Build.VERSION.SDK_INT >= 26) {
                this.f16814w.f8946v0.put("rendererRequestedPriority", Integer.valueOf(getRendererRequestedPriority()));
                this.f16814w.f8946v0.put("waivedWhenNotVisible", Boolean.valueOf(getRendererPriorityWaivedWhenNotVisible()));
            }
        } else {
            setRendererPriorityPolicy(((Integer) this.f16814w.f8946v0.get("rendererRequestedPriority")).intValue(), ((Boolean) this.f16814w.f8946v0.get("waivedWhenNotVisible")).booleanValue());
        }
        this.f16817z.mo25485f().clear();
        for (Map next : this.f16814w.f8931o) {
            this.f16817z.mo25485f().add(new C4151a(C4157d.m11399a((Map) next.get("trigger")), C4152b.m11392a((Map) next.get(NavInflater.TAG_ACTION))));
        }
        setFindListener(new C8780j());
        this.f16794B = new GestureDetector(getContext(), new C8781k());
        this.f16798F = new C8782l();
        if (Build.VERSION.SDK_INT >= 19) {
            this.f16801I = new C8783m();
        }
        setOnTouchListener(new C8785n());
        setOnLongClickListener(new C8786o());
    }

    @RequiresApi(api = 21)
    /* renamed from: D */
    public void mo45765D() {
        PrintManager printManager = (PrintManager) C4221o.f8998f.getSystemService("print");
        if (printManager != null) {
            String str = getTitle() + " Document";
            printManager.print(str, createPrintDocumentAdapter(str), new PrintAttributes.Builder().build());
        }
    }

    /* renamed from: E */
    public ActionMode mo45766E(ActionMode actionMode, ActionMode.Callback callback) {
        boolean z;
        int i = 0;
        if (this.f16795C != null) {
            mo45787n();
            z = true;
        } else {
            z = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (this.f16814w.f8949x.booleanValue()) {
            menu.clear();
            return actionMode;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R$layout.floating_action_mode, this, false);
        this.f16795C = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList = new ArrayList();
        C4168a aVar = new C4168a();
        Map<String, Object> map = this.f16796D;
        if (map != null) {
            arrayList = (List) map.get("menuItems");
            Map map2 = (Map) this.f16796D.get("options");
            if (map2 != null) {
                aVar.mo25521a(map2);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        List<Map> list = arrayList;
        Boolean bool = aVar.f8789a;
        if (bool == null || !bool.booleanValue()) {
            for (int i2 = 0; i2 < menu.size(); i2++) {
                MenuItem item = menu.getItem(i2);
                int itemId = item.getItemId();
                String charSequence = item.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.floating_action_mode_item, this, false);
                textView.setText(charSequence);
                textView.setOnClickListener(new C8772b(callback, actionMode, item, itemId, charSequence));
                if (this.f16795C != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            int intValue = ((Integer) map3.get("androidId")).intValue();
            String str = (String) map3.get(NotificationCompatJellybean.KEY_TITLE);
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.floating_action_mode_item, this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new C8773c(intValue, str));
            if (this.f16795C != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.f16804L;
        int i3 = point != null ? point.x : 0;
        Point point2 = this.f16804L;
        if (point2 != null) {
            i = point2.y;
        }
        this.f16803K = new Point(i3, i);
        LinearLayout linearLayout3 = this.f16795C;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new C8774d(i3, i));
            addView(this.f16795C, new AbsoluteLayout.LayoutParams(-2, -2, i3, i));
            if (z) {
                mo45771J();
            }
            Runnable runnable = this.f16801I;
            if (runnable != null) {
                runnable.run();
            }
        }
        menu.clear();
        return actionMode;
    }

    /* renamed from: F */
    public Map<String, Object> mo45767F() {
        Message obtainMessage = f16792M.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put("url", peekData.getString("url"));
        hashMap.put(NotificationCompatJellybean.KEY_TITLE, peekData.getString(NotificationCompatJellybean.KEY_TITLE));
        return hashMap;
    }

    /* renamed from: G */
    public Map<String, Object> mo45768G() {
        Message obtainMessage = f16792M.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("url", peekData.getString("url"));
        return hashMap;
    }

    /* renamed from: H */
    public void mo45769H(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX() + num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY() + num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollBy(num.intValue(), num2.intValue());
    }

    /* renamed from: I */
    public void mo45770I(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollTo(num.intValue(), num2.intValue());
    }

    /* renamed from: J */
    public final void mo45771J() {
        WebView.HitTestResult hitTestResult = getHitTestResult();
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(hitTestResult.getType()));
        hashMap.put("extra", hitTestResult.getExtra());
        HashMap hashMap2 = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f16805n;
        if (inAppBrowserActivity != null) {
            hashMap2.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap2.put("hitTestResult", hashMap);
        this.f16807p.mo46573c("onCreateContextMenu", hashMap2);
    }

    /* renamed from: K */
    public void mo45772K(C4202g gVar, HashMap<String, Object> hashMap) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        Integer num2;
        String str;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        WebSettings.LayoutAlgorithm layoutAlgorithm;
        Boolean bool11;
        Integer num3;
        Boolean bool12;
        Boolean bool13;
        String str2;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        Integer num4;
        Boolean bool21;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        Boolean bool25;
        Boolean bool26;
        Boolean bool27;
        Boolean bool28;
        Boolean bool29;
        Boolean bool30;
        Boolean bool31;
        Boolean bool32;
        Boolean bool33;
        Boolean bool34;
        String str3;
        Boolean bool35;
        String str4;
        Boolean bool36;
        Boolean bool37;
        WebSettings settings = getSettings();
        if (!(hashMap.get("javaScriptEnabled") == null || this.f16814w.f8915g == (bool37 = gVar.f8915g))) {
            settings.setJavaScriptEnabled(bool37.booleanValue());
        }
        if (!(hashMap.get("debuggingEnabled") == null || this.f16814w.f8917h == (bool36 = gVar.f8917h) || Build.VERSION.SDK_INT < 19)) {
            WebView.setWebContentsDebuggingEnabled(bool36.booleanValue());
        }
        String str5 = "true";
        if (!(hashMap.get("useShouldInterceptAjaxRequest") == null || this.f16814w.f8935q == (bool35 = gVar.f8935q))) {
            if (bool35.booleanValue()) {
                str4 = str5;
            } else {
                str4 = "false";
            }
            String replace = "window._flutter_inappwebview_useShouldInterceptAjaxRequest = $PLACEHOLDER_VALUE;".replace("$PLACEHOLDER_VALUE", str4);
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(replace, (ValueCallback) null);
            } else {
                loadUrl("javascript:" + replace);
            }
        }
        if (!(hashMap.get("useShouldInterceptFetchRequest") == null || this.f16814w.f8937r == (bool34 = gVar.f8937r))) {
            if (bool34.booleanValue()) {
                str3 = str5;
            } else {
                str3 = "false";
            }
            String replace2 = "window._flutter_inappwebview_useShouldInterceptFetchRequest = $PLACEHOLDER_VALUE;".replace("$PLACEHOLDER_VALUE", str3);
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(replace2, (ValueCallback) null);
            } else {
                loadUrl("javascript:" + replace2);
            }
        }
        if (!(hashMap.get("useOnLoadResource") == null || this.f16814w.f8905b == (bool33 = gVar.f8905b))) {
            if (!bool33.booleanValue()) {
                str5 = "false";
            }
            String replace3 = "window._flutter_inappwebview_useOnLoadResource = $PLACEHOLDER_VALUE;".replace("$PLACEHOLDER_VALUE", str5);
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(replace3, (ValueCallback) null);
            } else {
                loadUrl("javascript:" + replace3);
            }
        }
        if (!(hashMap.get("javaScriptCanOpenWindowsAutomatically") == null || this.f16814w.f8919i == (bool32 = gVar.f8919i))) {
            settings.setJavaScriptCanOpenWindowsAutomatically(bool32.booleanValue());
        }
        if (!(hashMap.get("builtInZoomControls") == null || this.f16814w.f8878B == (bool31 = gVar.f8878B))) {
            settings.setBuiltInZoomControls(bool31.booleanValue());
        }
        if (!(hashMap.get("displayZoomControls") == null || this.f16814w.f8879C == (bool30 = gVar.f8879C))) {
            settings.setDisplayZoomControls(bool30.booleanValue());
        }
        if (!(hashMap.get("safeBrowsingEnabled") == null || this.f16814w.f8883G == (bool29 = gVar.f8883G) || Build.VERSION.SDK_INT < 26)) {
            settings.setSafeBrowsingEnabled(bool29.booleanValue());
        }
        if (!(hashMap.get("mediaPlaybackRequiresUserGesture") == null || this.f16814w.f8921j == (bool28 = gVar.f8921j))) {
            settings.setMediaPlaybackRequiresUserGesture(bool28.booleanValue());
        }
        if (!(hashMap.get("databaseEnabled") == null || this.f16814w.f8880D == (bool27 = gVar.f8880D))) {
            settings.setDatabaseEnabled(bool27.booleanValue());
        }
        if (!(hashMap.get("domStorageEnabled") == null || this.f16814w.f8881E == (bool26 = gVar.f8881E))) {
            settings.setDomStorageEnabled(bool26.booleanValue());
        }
        if (hashMap.get("userAgent") != null && !this.f16814w.f8911e.equals(gVar.f8911e) && !gVar.f8911e.isEmpty()) {
            settings.setUserAgentString(gVar.f8911e);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.f16814w.f8913f.equals(gVar.f8913f) && !gVar.f8913f.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String str6 = gVar.f8911e;
            settings.setUserAgentString(((str6 == null || str6.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : gVar.f8911e) + " " + this.f16814w.f8913f);
        }
        if (hashMap.get("clearCache") != null && gVar.f8909d.booleanValue()) {
            mo45782h();
        } else if (hashMap.get("clearSessionCache") != null && gVar.f8877A.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (!(hashMap.get("thirdPartyCookiesEnabled") == null || this.f16814w.f8924k0 == gVar.f8924k0 || Build.VERSION.SDK_INT < 21)) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, gVar.f8924k0.booleanValue());
        }
        if (!(hashMap.get("useWideViewPort") == null || this.f16814w.f8882F == (bool25 = gVar.f8882F))) {
            settings.setUseWideViewPort(bool25.booleanValue());
        }
        if (!(hashMap.get("supportZoom") == null || this.f16814w.f8951y == (bool24 = gVar.f8951y))) {
            settings.setSupportZoom(bool24.booleanValue());
        }
        if (hashMap.get("textZoom") != null && !this.f16814w.f8953z.equals(gVar.f8953z)) {
            settings.setTextZoom(gVar.f8953z.intValue());
        }
        if (!(hashMap.get("verticalScrollBarEnabled") == null || this.f16814w.f8925l == (bool23 = gVar.f8925l))) {
            setVerticalScrollBarEnabled(bool23.booleanValue());
        }
        if (!(hashMap.get("horizontalScrollBarEnabled") == null || this.f16814w.f8927m == (bool22 = gVar.f8927m))) {
            setHorizontalScrollBarEnabled(bool22.booleanValue());
        }
        boolean z = false;
        if (!(hashMap.get("transparentBackground") == null || this.f16814w.f8943u == (bool21 = gVar.f8943u))) {
            if (bool21.booleanValue()) {
                setBackgroundColor(0);
            } else {
                setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }
        if (Build.VERSION.SDK_INT >= 21 && hashMap.get("mixedContentMode") != null && ((num4 = this.f16814w.f8884H) == null || !num4.equals(gVar.f8884H))) {
            settings.setMixedContentMode(gVar.f8884H.intValue());
        }
        if (!(hashMap.get("supportMultipleWindows") == null || this.f16814w.f8928m0 == (bool20 = gVar.f8928m0))) {
            settings.setSupportMultipleWindows(bool20.booleanValue());
        }
        if (!(hashMap.get("useOnDownloadStart") == null || this.f16814w.f8907c == (bool19 = gVar.f8907c))) {
            if (bool19.booleanValue()) {
                setDownloadListener(new C8791s());
            } else {
                setDownloadListener((DownloadListener) null);
            }
        }
        if (!(hashMap.get("allowContentAccess") == null || this.f16814w.f8885I == (bool18 = gVar.f8885I))) {
            settings.setAllowContentAccess(bool18.booleanValue());
        }
        if (!(hashMap.get("allowFileAccess") == null || this.f16814w.f8886J == (bool17 = gVar.f8886J))) {
            settings.setAllowFileAccess(bool17.booleanValue());
        }
        if (!(hashMap.get("allowFileAccessFromFileURLs") == null || this.f16814w.f8887K == (bool16 = gVar.f8887K))) {
            settings.setAllowFileAccessFromFileURLs(bool16.booleanValue());
        }
        if (!(hashMap.get("allowUniversalAccessFromFileURLs") == null || this.f16814w.f8888L == (bool15 = gVar.f8888L))) {
            settings.setAllowUniversalAccessFromFileURLs(bool15.booleanValue());
        }
        if (!(hashMap.get("cacheEnabled") == null || this.f16814w.f8941t == (bool14 = gVar.f8941t))) {
            setCacheEnabled(bool14.booleanValue());
        }
        if (hashMap.get("appCachePath") != null && ((str2 = this.f16814w.f8889M) == null || !str2.equals(gVar.f8889M))) {
            settings.setAppCachePath(gVar.f8889M);
        }
        if (!(hashMap.get("blockNetworkImage") == null || this.f16814w.f8890N == (bool13 = gVar.f8890N))) {
            settings.setBlockNetworkImage(bool13.booleanValue());
        }
        if (!(hashMap.get("blockNetworkLoads") == null || this.f16814w.f8891O == (bool12 = gVar.f8891O))) {
            settings.setBlockNetworkLoads(bool12.booleanValue());
        }
        if (hashMap.get("cacheMode") != null && !this.f16814w.f8892P.equals(gVar.f8892P)) {
            settings.setCacheMode(gVar.f8892P.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.f16814w.f8893Q.equals(gVar.f8893Q)) {
            settings.setCursiveFontFamily(gVar.f8893Q);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.f16814w.f8894R.equals(gVar.f8894R)) {
            settings.setDefaultFixedFontSize(gVar.f8894R.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.f16814w.f8895S.equals(gVar.f8895S)) {
            settings.setDefaultFontSize(gVar.f8895S.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.f16814w.f8896T.equals(gVar.f8896T)) {
            settings.setDefaultTextEncodingName(gVar.f8896T);
        }
        if (Build.VERSION.SDK_INT >= 24 && hashMap.get("disabledActionModeMenuItems") != null && ((num3 = this.f16814w.f8897U) == null || !num3.equals(gVar.f8897U))) {
            settings.setDisabledActionModeMenuItems(gVar.f8897U.intValue());
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.f16814w.f8898V.equals(gVar.f8898V)) {
            settings.setFantasyFontFamily(gVar.f8898V);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.f16814w.f8899W.equals(gVar.f8899W)) {
            settings.setFixedFontFamily(gVar.f8899W);
        }
        if (hashMap.get("forceDark") != null && !this.f16814w.f8900X.equals(gVar.f8900X) && Build.VERSION.SDK_INT >= 29) {
            settings.setForceDark(gVar.f8900X.intValue());
        }
        if (!(hashMap.get("geolocationEnabled") == null || this.f16814w.f8901Y == (bool11 = gVar.f8901Y))) {
            settings.setGeolocationEnabled(bool11.booleanValue());
        }
        if (!(hashMap.get("layoutAlgorithm") == null || this.f16814w.f8902Z == (layoutAlgorithm = gVar.f8902Z))) {
            if (Build.VERSION.SDK_INT < 19 || !layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(gVar.f8902Z);
            } else {
                settings.setLayoutAlgorithm(gVar.f8902Z);
            }
        }
        if (!(hashMap.get("loadWithOverviewMode") == null || this.f16814w.f8904a0 == (bool10 = gVar.f8904a0))) {
            settings.setLoadWithOverviewMode(bool10.booleanValue());
        }
        if (!(hashMap.get("loadsImagesAutomatically") == null || this.f16814w.f8906b0 == (bool9 = gVar.f8906b0))) {
            settings.setLoadsImagesAutomatically(bool9.booleanValue());
        }
        if (hashMap.get("minimumFontSize") != null && !this.f16814w.f8923k.equals(gVar.f8923k)) {
            settings.setMinimumFontSize(gVar.f8923k.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.f16814w.f8908c0.equals(gVar.f8908c0)) {
            settings.setMinimumLogicalFontSize(gVar.f8908c0.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.f16814w.f8910d0.equals(gVar.f8910d0)) {
            setInitialScale(gVar.f8910d0.intValue());
        }
        if (!(hashMap.get("needInitialFocus") == null || this.f16814w.f8912e0 == (bool8 = gVar.f8912e0))) {
            settings.setNeedInitialFocus(bool8.booleanValue());
        }
        if (!(hashMap.get("offscreenPreRaster") == null || this.f16814w.f8914f0 == (bool7 = gVar.f8914f0) || Build.VERSION.SDK_INT < 23)) {
            settings.setOffscreenPreRaster(bool7.booleanValue());
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.f16814w.f8916g0.equals(gVar.f8916g0)) {
            settings.setSansSerifFontFamily(gVar.f8916g0);
        }
        if (hashMap.get("serifFontFamily") != null && !this.f16814w.f8918h0.equals(gVar.f8918h0)) {
            settings.setSerifFontFamily(gVar.f8918h0);
        }
        if (hashMap.get("standardFontFamily") != null && !this.f16814w.f8920i0.equals(gVar.f8920i0)) {
            settings.setStandardFontFamily(gVar.f8920i0);
        }
        if (hashMap.get("preferredContentMode") != null && !this.f16814w.f8933p.equals(gVar.f8933p)) {
            int i = C8779i.f16835a[PreferredContentModeOptionType.fromValue(gVar.f8933p.intValue()).ordinal()];
            if (i == 1) {
                setDesktopMode(true);
            } else if (i == 2 || i == 3) {
                setDesktopMode(false);
            }
        }
        if (!(hashMap.get("saveFormData") == null || this.f16814w.f8922j0 == (bool6 = gVar.f8922j0))) {
            settings.setSaveFormData(bool6.booleanValue());
        }
        if (!(hashMap.get("incognito") == null || this.f16814w.f8939s == (bool5 = gVar.f8939s))) {
            setIncognito(bool5.booleanValue());
        }
        if (!(hashMap.get("hardwareAcceleration") == null || this.f16814w.f8926l0 == (bool4 = gVar.f8926l0))) {
            if (bool4.booleanValue()) {
                setLayerType(2, (Paint) null);
            } else {
                setLayerType(1, (Paint) null);
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && ((str = this.f16814w.f8930n0) == null || !str.equals(gVar.f8930n0))) {
            if (gVar.f8930n0 == null) {
                this.f16793A = null;
            } else {
                this.f16793A = Pattern.compile(this.f16814w.f8930n0);
            }
        }
        if (gVar.f8931o != null) {
            this.f16817z.mo25485f().clear();
            for (Map next : gVar.f8931o) {
                this.f16817z.mo25485f().add(new C4151a(C4157d.m11399a((Map) next.get("trigger")), C4152b.m11392a((Map) next.get(NavInflater.TAG_ACTION))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.f16814w.f8936q0.equals(gVar.f8936q0)) {
            setScrollBarStyle(gVar.f8936q0.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.f16814w.f8940s0) == null || !num2.equals(gVar.f8940s0))) {
            setScrollBarDefaultDelayBeforeFade(gVar.f8940s0.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.f16814w.f8942t0.equals(gVar.f8942t0)) {
            setScrollbarFadingEnabled(gVar.f8942t0.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && ((num = this.f16814w.f8944u0) == null || !num.equals(gVar.f8944u0))) {
            setScrollBarFadeDuration(gVar.f8944u0.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.f16814w.f8938r0.equals(gVar.f8938r0)) {
            setVerticalScrollbarPosition(gVar.f8938r0.intValue());
        }
        if (!(hashMap.get("disableVerticalScroll") == null || this.f16814w.f8945v == (bool3 = gVar.f8945v))) {
            setVerticalScrollBarEnabled(!bool3.booleanValue() && gVar.f8925l.booleanValue());
        }
        if (!(hashMap.get("disableHorizontalScroll") == null || this.f16814w.f8947w == (bool2 = gVar.f8947w))) {
            if (!bool2.booleanValue() && gVar.f8927m.booleanValue()) {
                z = true;
            }
            setHorizontalScrollBarEnabled(z);
        }
        if (hashMap.get("overScrollMode") != null && !this.f16814w.f8932o0.equals(gVar.f8932o0)) {
            setOverScrollMode(gVar.f8932o0.intValue());
        }
        if (!(hashMap.get("networkAvailable") == null || this.f16814w.f8934p0 == (bool = gVar.f8934p0))) {
            setNetworkAvailable(bool.booleanValue());
        }
        if (hashMap.get("rendererPriorityPolicy") != null && (!(this.f16814w.f8946v0.get("rendererRequestedPriority") == gVar.f8946v0.get("rendererRequestedPriority") && this.f16814w.f8946v0.get("waivedWhenNotVisible") == gVar.f8946v0.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) gVar.f8946v0.get("rendererRequestedPriority")).intValue(), ((Boolean) gVar.f8946v0.get("waivedWhenNotVisible")).booleanValue());
        }
        this.f16814w = gVar;
    }

    /* renamed from: L */
    public void mo45773L(C9017j.C9022d dVar) {
        this.f16797E.post(new C8788q(dVar));
    }

    /* renamed from: a */
    public void mo45774a() {
        Integer num = this.f16809r;
        if (num != null && C4176e.f8800s.containsKey(num)) {
            C4176e.f8800s.remove(this.f16809r);
        }
        this.f16797E.removeCallbacksAndMessages((Object) null);
        f16792M.removeCallbacksAndMessages((Object) null);
        removeJavascriptInterface("flutter_inappwebview");
        removeAllViews();
        Runnable runnable = this.f16801I;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f16798F;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        super.mo45774a();
    }

    public void destroy() {
        super.destroy();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @RequiresApi(api = 19)
    /* renamed from: g */
    public void mo45777g() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement) {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new C8776f());
    }

    public Map<String, Object> getCertificateMap() {
        return m23623k(getCertificate());
    }

    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put(NotificationCompatJellybean.KEY_TITLE, itemAtIndex.getTitle());
            hashMap.put("url", itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("history", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    public Map<String, Object> getOptions() {
        C4202g gVar = this.f16814w;
        if (gVar != null) {
            return gVar.mo25609b(this);
        }
        return null;
    }

    public Float getUpdatedScale() {
        return Float.valueOf(this.f16816y);
    }

    /* renamed from: h */
    public void mo45782h() {
        clearCache(true);
        mo45783i();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    /* renamed from: i */
    public final void mo45783i() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new C8787p(this));
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    /* renamed from: j */
    public void mo45784j(String str, C9017j.C9022d dVar) {
        mo45794q(str, (String) null, dVar);
    }

    @RequiresApi(api = 19)
    /* renamed from: l */
    public void mo45785l(ValueCallback<String> valueCallback) {
        evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }  return txt;})();", new C8777g(this, valueCallback));
    }

    @RequiresApi(api = 19)
    /* renamed from: m */
    public void mo45786m(C9017j.C9022d dVar) {
        mo45785l(new C8778h(this, dVar));
    }

    /* renamed from: n */
    public void mo45787n() {
        removeView(this.f16795C);
        this.f16795C = null;
        mo45809z();
    }

    /* renamed from: o */
    public void mo45788o(String str) {
        mo45794q(str, "(function(d) { var c = d.createElement('style'); c.innerHTML = %s; d.body.appendChild(c); })(document);", (C9017j.C9022d) null);
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        mo45771J();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && (view = this.f16857e) != null) {
            view.getHandler().postDelayed(new C8771a(), 128);
        }
        return onCreateInputConnection;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        float f = this.f16816y;
        int i5 = (int) (((float) i) / f);
        int i6 = (int) (((float) i2) / f);
        LinearLayout linearLayout = this.f16795C;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.f16795C.setVisibility(8);
        }
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f16805n;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("x", Integer.valueOf(i5));
        hashMap.put("y", Integer.valueOf(i6));
        this.f16807p.mo46573c("onScrollChanged", hashMap);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f16804L = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo45793p(String str) {
        mo45794q(str, "(function(d) { var c = d.createElement('link'); c.rel='stylesheet'; c.type='text/css'; c.href = %s; d.head.appendChild(c); })(document);", (C9017j.C9022d) null);
    }

    /* renamed from: q */
    public void mo45794q(String str, String str2, C9017j.C9022d dVar) {
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String jSONArray2 = jSONArray.toString();
            str = String.format(str2, new Object[]{jSONArray2.substring(1, jSONArray2.length() - 1)});
        }
        this.f16797E.post(new C8789r(str, dVar));
    }

    /* renamed from: r */
    public void mo45795r(String str) {
        mo45794q(str, "(function(d) { var c = d.createElement('script'); c.src = %s; d.body.appendChild(c); })(document);", (C9017j.C9022d) null);
    }

    public void reload() {
        super.reload();
    }

    /* renamed from: s */
    public boolean mo45797s() {
        return this.f16815x;
    }

    public void setCacheEnabled(boolean z) {
        WebSettings settings = getSettings();
        if (z) {
            Context context = getContext();
            if (context != null) {
                settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                settings.setCacheMode(-1);
                settings.setAppCacheEnabled(true);
                return;
            }
            return;
        }
        settings.setCacheMode(2);
        settings.setAppCacheEnabled(false);
    }

    public void setDesktopMode(boolean z) {
        String str;
        WebSettings settings = getSettings();
        if (z) {
            str = settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA");
        } else {
            str = settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android");
        }
        settings.setUserAgentString(str);
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    public void setIncognito(boolean z) {
        WebSettings settings = getSettings();
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            settings.setCacheMode(2);
            settings.setAppCacheEnabled(false);
            clearHistory();
            clearCache(true);
            clearFormData();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            return;
        }
        settings.setCacheMode(-1);
        settings.setAppCacheEnabled(true);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return mo45766E(super.startActionMode(callback), callback);
    }

    /* renamed from: t */
    public void mo45803t(String str, String str2, String str3, String str4, String str5, C9017j.C9022d dVar) {
        loadDataWithBaseURL(str4, str, str2, str3, str5);
        dVar.success(Boolean.TRUE);
    }

    /* renamed from: u */
    public void mo45804u(String str, C9017j.C9022d dVar) {
        try {
            String c = C4222p.m11505c(str);
            if (!c.isEmpty()) {
                loadUrl(c);
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.error("InAppWebView", "url is empty", (Object) null);
        } catch (IOException e) {
            dVar.error("InAppWebView", str + " asset file cannot be found!", e);
        }
    }

    /* renamed from: v */
    public void mo45805v(String str, Map<String, String> map, C9017j.C9022d dVar) {
        try {
            String c = C4222p.m11505c(str);
            if (!c.isEmpty()) {
                loadUrl(c, map);
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.error("InAppWebView", "url is empty", (Object) null);
        } catch (IOException e) {
            dVar.error("InAppWebView", str + " asset file cannot be found!", e);
        }
    }

    /* renamed from: w */
    public void mo45806w(String str, C9017j.C9022d dVar) {
        if (!str.isEmpty()) {
            loadUrl(str);
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.error("InAppWebView", "url is empty", (Object) null);
    }

    /* renamed from: x */
    public void mo45807x(String str, Map<String, String> map, C9017j.C9022d dVar) {
        if (!str.isEmpty()) {
            loadUrl(str, map);
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.error("InAppWebView", "url is empty", (Object) null);
    }

    /* renamed from: y */
    public void mo45808y(int i, int i2) {
        int width = getWidth();
        getHeight();
        int width2 = this.f16795C.getWidth();
        int height = this.f16795C.getHeight();
        int i3 = i - (width2 / 2);
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 + width2 > width) {
            i3 = width - width2;
        }
        float f = ((float) i2) - (((float) height) * 1.5f);
        if (f < 0.0f) {
            f = (float) (i2 + height);
        }
        updateViewLayout(this.f16795C, new AbsoluteLayout.LayoutParams(-2, -2, i3, ((int) f) + getScrollY()));
        this.f16797E.post(new C8775e());
    }

    /* renamed from: z */
    public void mo45809z() {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f16805n;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        this.f16807p.mo46573c("onHideContextMenu", hashMap);
    }

    @RequiresApi(api = 23)
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return mo45766E(super.startActionMode(callback, i), callback);
    }

    public C8770InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8770InAppWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C8770InAppWebView(Context context, Object obj, Object obj2, Integer num, C4202g gVar, Map<String, Object> map, View view) {
        super(context, view);
        if (obj instanceof InAppBrowserActivity) {
            this.f16805n = (InAppBrowserActivity) obj;
        } else if (obj instanceof C4171c) {
            this.f16806o = (C4171c) obj;
        }
        InAppBrowserActivity inAppBrowserActivity = this.f16805n;
        this.f16807p = inAppBrowserActivity != null ? inAppBrowserActivity.f16773e : this.f16806o.f8794l;
        this.f16808q = obj2;
        this.f16809r = num;
        this.f16814w = gVar;
        this.f16796D = map;
        C4221o.f8998f.registerForContextMenu(this);
    }
}
