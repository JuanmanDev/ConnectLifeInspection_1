package com.pichillilorenzo.flutter_inappwebview.InAppBrowser;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.AssetHelper;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.C8770InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.R$id;
import com.pichillilorenzo.flutter_inappwebview.R$layout;
import com.pichillilorenzo.flutter_inappwebview.R$menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2ExchangeCodec;
import p040c.p313b0.p314a.C4221o;
import p040c.p313b0.p314a.p318g.C4166a;
import p040c.p313b0.p314a.p319i.C4176e;
import p040c.p313b0.p314a.p319i.C4202g;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

public class InAppBrowserActivity extends AppCompatActivity implements C9017j.C9021c {

    /* renamed from: e */
    public C9017j f16773e;

    /* renamed from: l */
    public Integer f16774l;

    /* renamed from: m */
    public String f16775m;

    /* renamed from: n */
    public C8770InAppWebView f16776n;

    /* renamed from: o */
    public ActionBar f16777o;

    /* renamed from: p */
    public Menu f16778p;

    /* renamed from: q */
    public SearchView f16779q;

    /* renamed from: r */
    public C4166a f16780r;

    /* renamed from: s */
    public Map<String, String> f16781s;

    /* renamed from: t */
    public ProgressBar f16782t;

    /* renamed from: u */
    public boolean f16783u = false;

    /* renamed from: v */
    public String f16784v;

    /* renamed from: w */
    public List<C8769g> f16785w = new ArrayList();

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$a */
    public class C8763a implements SearchView.OnQueryTextListener {
        public C8763a() {
        }

        public boolean onQueryTextChange(String str) {
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            if (str.isEmpty()) {
                return false;
            }
            InAppBrowserActivity.this.f16776n.loadUrl(str);
            InAppBrowserActivity.this.f16779q.setQuery("", false);
            InAppBrowserActivity.this.f16779q.setIconified(true);
            return true;
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$b */
    public class C8764b implements SearchView.OnCloseListener {
        public C8764b() {
        }

        public boolean onClose() {
            if (InAppBrowserActivity.this.f16779q.getQuery().toString().isEmpty()) {
                InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                inAppBrowserActivity.f16779q.setQuery(inAppBrowserActivity.f16776n.getUrl(), false);
            }
            return false;
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$c */
    public class C8765c implements View.OnFocusChangeListener {
        public C8765c() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z) {
                InAppBrowserActivity.this.f16779q.setQuery("", false);
                InAppBrowserActivity.this.f16779q.setIconified(true);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$d */
    public class C8766d implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f16789a;

        public C8766d(InAppBrowserActivity inAppBrowserActivity, C9017j.C9022d dVar) {
            this.f16789a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f16789a.success(bool);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$e */
    public class C8767e implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f16790a;

        public C8767e(InAppBrowserActivity inAppBrowserActivity, C9017j.C9022d dVar) {
            this.f16790a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f16790a.success(str);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$f */
    public class C8768f extends WebViewClient {
        public C8768f() {
        }

        public void onPageFinished(WebView webView, String str) {
            InAppBrowserActivity.this.f16776n.mo45774a();
            InAppBrowserActivity.this.f16776n.destroy();
            InAppBrowserActivity.this.f16776n = null;
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity$g */
    public interface C8769g {
        /* renamed from: a */
        boolean mo20939a(int i, int i2, Intent intent);
    }

    /* renamed from: A */
    public void mo45685A(Boolean bool, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.findNext(bool.booleanValue());
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.success(Boolean.FALSE);
    }

    /* renamed from: B */
    public Map<String, Object> mo45686B() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.getCertificateMap();
        }
        return null;
    }

    /* renamed from: C */
    public Integer mo45687C() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return Integer.valueOf(inAppWebView.getContentHeight());
        }
        return null;
    }

    /* renamed from: D */
    public HashMap<String, Object> mo45688D() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.getCopyBackForwardList();
        }
        return null;
    }

    /* renamed from: E */
    public Map<String, Object> mo45689E() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView == null) {
            return null;
        }
        WebView.HitTestResult hitTestResult = inAppWebView.getHitTestResult();
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(hitTestResult.getType()));
        hashMap.put("extra", hitTestResult.getExtra());
        return hashMap;
    }

    /* renamed from: F */
    public Map<String, Object> mo45690F() {
        Map<String, Object> options = this.f16776n.getOptions();
        C4166a aVar = this.f16780r;
        if (aVar == null || options == null) {
            return null;
        }
        Map<String, Object> a = aVar.mo25512a(this);
        a.putAll(options);
        return a;
    }

    /* renamed from: G */
    public String mo45691G() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.getOriginalUrl();
        }
        return null;
    }

    /* renamed from: H */
    public Integer mo45692H() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return Integer.valueOf(inAppWebView.getProgress());
        }
        return null;
    }

    /* renamed from: I */
    public Float mo45693I() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.getUpdatedScale();
        }
        return null;
    }

    /* renamed from: J */
    public Integer mo45694J() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return Integer.valueOf(inAppWebView.getScrollX());
        }
        return null;
    }

    /* renamed from: K */
    public Integer mo45695K() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return Integer.valueOf(inAppWebView.getScrollY());
        }
        return null;
    }

    @RequiresApi(api = 19)
    /* renamed from: L */
    public void mo45696L(C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45786m(dVar);
        } else {
            dVar.success((Object) null);
        }
    }

    /* renamed from: M */
    public String mo45697M() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.getTitle();
        }
        return null;
    }

    /* renamed from: N */
    public void mo45698N() {
        if (this.f16776n != null && mo45732p()) {
            this.f16776n.goBack();
        }
    }

    /* renamed from: O */
    public void mo45699O(int i) {
        if (this.f16776n != null && mo45734q(i)) {
            this.f16776n.goBackOrForward(i);
        }
    }

    /* renamed from: P */
    public void mo45700P() {
        try {
            this.f16783u = true;
            Intent intent = new Intent(this, Class.forName(this.f16784v));
            intent.setFlags(131072);
            startActivityIfNeeded(intent, 0);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }

    /* renamed from: Q */
    public void mo45701Q(String str) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45788o(str);
        }
    }

    /* renamed from: R */
    public void mo45702R(String str) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45793p(str);
        }
    }

    /* renamed from: S */
    public void mo45703S(String str) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45795r(str);
        }
    }

    /* renamed from: T */
    public boolean mo45704T() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.f16815x;
        }
        return false;
    }

    /* renamed from: U */
    public void mo45705U(String str, String str2, String str3, String str4, String str5, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45803t(str, str2, str3, str4, str5, dVar);
        } else {
            dVar.error("InAppBrowserActivity", "webView is null", (Object) null);
        }
    }

    /* renamed from: V */
    public void mo45706V(String str, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45804u(str, dVar);
        } else {
            dVar.error("InAppBrowserActivity", "webView is null", (Object) null);
        }
    }

    /* renamed from: W */
    public void mo45707W(String str, Map<String, String> map, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45805v(str, map, dVar);
        } else {
            dVar.error("InAppBrowserActivity", "webView is null", (Object) null);
        }
    }

    /* renamed from: X */
    public void mo45708X(String str, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45806w(str, dVar);
        } else {
            dVar.error("InAppBrowserActivity", "webView is null", (Object) null);
        }
    }

    /* renamed from: Y */
    public void mo45709Y(String str, Map<String, String> map, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45807x(str, map, dVar);
        } else {
            dVar.error("InAppBrowserActivity", "webView is null", (Object) null);
        }
    }

    /* renamed from: Z */
    public void mo45710Z() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.onPause();
        }
    }

    /* renamed from: a0 */
    public void mo45711a0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.onResume();
        }
    }

    /* renamed from: b0 */
    public boolean mo45712b0(boolean z) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.pageDown(z);
        }
        return false;
    }

    /* renamed from: c0 */
    public boolean mo45713c0(boolean z) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.pageUp(z);
        }
        return false;
    }

    public void closeButtonClicked(MenuItem menuItem) {
        mo45748w((C9017j.C9022d) null);
    }

    /* renamed from: d0 */
    public void mo45715d0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.pauseTimers();
        }
    }

    /* renamed from: e0 */
    public void mo45716e0(String str, byte[] bArr, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45763B(str, bArr, dVar);
        } else {
            dVar.error("InAppBrowserActivity", "webView is null", (Object) null);
        }
    }

    /* renamed from: f0 */
    public final void mo45717f0() {
        this.f16776n.mo45764C();
        if (this.f16780r.f8780a.booleanValue()) {
            mo45700P();
        } else {
            mo45735q0();
        }
        this.f16782t = (ProgressBar) findViewById(R$id.progressBar);
        if (!this.f16780r.f8787h.booleanValue()) {
            this.f16782t.setMax(0);
        } else {
            this.f16782t.setMax(100);
        }
        this.f16777o.setDisplayShowTitleEnabled(!this.f16780r.f8785f.booleanValue());
        if (!this.f16780r.f8781b.booleanValue()) {
            this.f16777o.hide();
        }
        String str = this.f16780r.f8782c;
        if (str != null && !str.isEmpty()) {
            this.f16777o.setBackgroundDrawable(new ColorDrawable(Color.parseColor(this.f16780r.f8782c)));
        }
        String str2 = this.f16780r.f8783d;
        if (str2 != null && !str2.isEmpty()) {
            this.f16777o.setTitle((CharSequence) this.f16780r.f8783d);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: g0 */
    public void mo45718g0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45765D();
        }
    }

    public String getUrl() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.getUrl();
        }
        return null;
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        mo45698N();
    }

    public void goForward() {
        if (this.f16776n != null && mo45736r()) {
            this.f16776n.goForward();
        }
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    /* renamed from: h0 */
    public void mo45723h0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    /* renamed from: i0 */
    public Map<String, Object> mo45724i0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.mo45767F();
        }
        return null;
    }

    /* renamed from: j0 */
    public Map<String, Object> mo45725j0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.mo45768G();
        }
        return null;
    }

    /* renamed from: k0 */
    public void mo45726k0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.resumeTimers();
        }
    }

    /* renamed from: l0 */
    public void mo45727l0(String str, boolean z, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.saveWebArchive(str, z, new C8767e(this, dVar));
        } else {
            dVar.success((Object) null);
        }
    }

    /* renamed from: m0 */
    public void mo45728m0(Integer num, Integer num2, Boolean bool) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45769H(num, num2, bool);
        }
    }

    /* renamed from: n0 */
    public void mo45729n0(Integer num, Integer num2, Boolean bool) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45770I(num, num2, bool);
        }
    }

    /* renamed from: o0 */
    public void mo45730o0(Map<String, Object> map) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.f16796D = map;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (C8769g a : this.f16785w) {
            if (a.mo20939a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            this.f16775m = extras.getString("uuid");
            this.f16774l = Integer.valueOf(extras.getInt("windowId"));
            C9003c cVar = C4221o.f8995c;
            C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappbrowser_" + this.f16775m);
            this.f16773e = jVar;
            jVar.mo46575e(this);
            setContentView(R$layout.activity_web_view);
            C8770InAppWebView inAppWebView = (C8770InAppWebView) findViewById(R$id.webView);
            this.f16776n = inAppWebView;
            inAppWebView.f16809r = this.f16774l;
            inAppWebView.f16805n = this;
            inAppWebView.f16807p = this.f16773e;
            this.f16784v = extras.getString("fromActivity");
            HashMap hashMap = (HashMap) extras.getSerializable("options");
            C4166a aVar = new C4166a();
            this.f16780r = aVar;
            aVar.mo25513b(hashMap);
            C4202g gVar = new C4202g();
            gVar.mo25610c(hashMap);
            C8770InAppWebView inAppWebView2 = this.f16776n;
            inAppWebView2.f16814w = gVar;
            inAppWebView2.f16796D = (HashMap) extras.getSerializable("contextMenu");
            this.f16777o = getSupportActionBar();
            mo45717f0();
            if (this.f16774l.intValue() != -1) {
                Message message = C4176e.f8800s.get(this.f16774l);
                if (message != null) {
                    ((WebView.WebViewTransport) message.obj).setWebView(this.f16776n);
                    message.sendToTarget();
                }
            } else if (!Boolean.valueOf(extras.getBoolean("isData")).booleanValue()) {
                this.f16781s = (HashMap) extras.getSerializable("headers");
                this.f16776n.loadUrl(extras.getString("url"), this.f16781s);
            } else {
                String string = extras.getString("data");
                String string2 = extras.getString("mimeType");
                String string3 = extras.getString(Http2ExchangeCodec.ENCODING);
                this.f16776n.loadDataWithBaseURL(extras.getString("baseUrl"), string, string2, string3, extras.getString("historyUrl"));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("uuid", this.f16775m);
            this.f16773e.mo46573c("onBrowserCreated", hashMap2);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f16778p = menu;
        getMenuInflater().inflate(R$menu.menu_main, this.f16778p);
        SearchView searchView = (SearchView) this.f16778p.findItem(R$id.menu_search).getActionView();
        this.f16779q = searchView;
        searchView.setFocusable(true);
        if (this.f16780r.f8784e.booleanValue()) {
            this.f16778p.findItem(R$id.menu_search).setVisible(false);
        }
        this.f16779q.setQuery(this.f16776n.getUrl(), false);
        if (this.f16780r.f8783d.isEmpty()) {
            this.f16777o.setTitle((CharSequence) this.f16776n.getTitle());
        }
        this.f16779q.setOnQueryTextListener(new C8763a());
        this.f16779q.setOnCloseListener(new C8764b());
        this.f16779q.setOnQueryTextFocusChangeListener(new C8765c());
        return true;
    }

    public void onDestroy() {
        mo45750x();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (mo45732p()) {
            mo45698N();
            return true;
        } else if (!this.f16780r.f8786g.booleanValue()) {
            return true;
        } else {
            mo45748w((C9017j.C9022d) null);
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r17, p553f.p554a.p570e.p571a.C9017j.C9022d r18) {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            r6 = r18
            java.lang.String r1 = r0.f17687a
            int r2 = r1.hashCode()
            r4 = 19
            r5 = -1
            r8 = 21
            switch(r2) {
                case -1787354268: goto L_0x02bc;
                case -1773179062: goto L_0x02b1;
                case -1624396757: goto L_0x02a6;
                case -1331417355: goto L_0x029b;
                case -1331417354: goto L_0x0290;
                case -1309347773: goto L_0x0285;
                case -1249348039: goto L_0x027b;
                case -1241591313: goto L_0x0270;
                case -1067273523: goto L_0x0265;
                case -995752566: goto L_0x0259;
                case -948122918: goto L_0x024e;
                case -934641255: goto L_0x0242;
                case -934426579: goto L_0x0236;
                case -759238347: goto L_0x022a;
                case -756050293: goto L_0x021e;
                case -696286326: goto L_0x0212;
                case -696286120: goto L_0x0206;
                case -679382964: goto L_0x01fa;
                case -678975813: goto L_0x01ee;
                case -543453324: goto L_0x01e2;
                case -402165756: goto L_0x01d6;
                case -402165208: goto L_0x01ca;
                case -391221073: goto L_0x01bf;
                case -318289731: goto L_0x01b3;
                case -317054497: goto L_0x01a7;
                case -243128142: goto L_0x019b;
                case -212614552: goto L_0x018f;
                case -127960866: goto L_0x0183;
                case -110027141: goto L_0x0177;
                case -53272641: goto L_0x016b;
                case -32598479: goto L_0x015f;
                case -17750794: goto L_0x0153;
                case 3202370: goto L_0x0147;
                case 3529469: goto L_0x013b;
                case 94756344: goto L_0x0130;
                case 106440182: goto L_0x0124;
                case 194959693: goto L_0x0118;
                case 336631465: goto L_0x010d;
                case 492688268: goto L_0x0101;
                case 740366903: goto L_0x00f5;
                case 817048102: goto L_0x00e9;
                case 858987473: goto L_0x00dd;
                case 1042858233: goto L_0x00d1;
                case 1076821923: goto L_0x00c6;
                case 1091267752: goto L_0x00ba;
                case 1246613238: goto L_0x00ae;
                case 1312131169: goto L_0x00a2;
                case 1520566363: goto L_0x0096;
                case 1724190684: goto L_0x008a;
                case 1729408231: goto L_0x007e;
                case 1779894764: goto L_0x0072;
                case 1810715187: goto L_0x0067;
                case 1845118384: goto L_0x005c;
                case 1845185410: goto L_0x0051;
                case 1916929588: goto L_0x0045;
                case 1925083019: goto L_0x0039;
                case 1937913574: goto L_0x002d;
                case 1965076372: goto L_0x0021;
                case 1966196898: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x02c7
        L_0x0016:
            java.lang.String r2 = "getTitle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 1
            goto L_0x02c8
        L_0x0021:
            java.lang.String r2 = "getScale"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 44
            goto L_0x02c8
        L_0x002d:
            java.lang.String r2 = "evaluateJavascript"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 8
            goto L_0x02c8
        L_0x0039:
            java.lang.String r2 = "injectJavascriptFileFromUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 9
            goto L_0x02c8
        L_0x0045:
            java.lang.String r2 = "findAllAsync"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 31
            goto L_0x02c8
        L_0x0051:
            java.lang.String r2 = "loadFile"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 6
            goto L_0x02c8
        L_0x005c:
            java.lang.String r2 = "loadData"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 5
            goto L_0x02c8
        L_0x0067:
            java.lang.String r2 = "goBackOrForward"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = r4
            goto L_0x02c8
        L_0x0072:
            java.lang.String r2 = "setContextMenu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 53
            goto L_0x02c8
        L_0x007e:
            java.lang.String r2 = "requestImageRef"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 55
            goto L_0x02c8
        L_0x008a:
            java.lang.String r2 = "setOptions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 25
            goto L_0x02c8
        L_0x0096:
            java.lang.String r2 = "resumeTimers"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 39
            goto L_0x02c8
        L_0x00a2:
            java.lang.String r2 = "getCertificate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 58
            goto L_0x02c8
        L_0x00ae:
            java.lang.String r2 = "requestFocusNodeHref"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 54
            goto L_0x02c8
        L_0x00ba:
            java.lang.String r2 = "getOriginalUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 43
            goto L_0x02c8
        L_0x00c6:
            java.lang.String r2 = "getProgress"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 2
            goto L_0x02c8
        L_0x00d1:
            java.lang.String r2 = "clearSslPreferences"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 30
            goto L_0x02c8
        L_0x00dd:
            java.lang.String r2 = "pageDown"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 47
            goto L_0x02c8
        L_0x00e9:
            java.lang.String r2 = "clearMatches"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 33
            goto L_0x02c8
        L_0x00f5:
            java.lang.String r2 = "injectCSSFileFromUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 11
            goto L_0x02c8
        L_0x0101:
            java.lang.String r2 = "getHitTestResult"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 46
            goto L_0x02c8
        L_0x010d:
            java.lang.String r2 = "loadUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 3
            goto L_0x02c8
        L_0x0118:
            java.lang.String r2 = "takeScreenshot"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 24
            goto L_0x02c8
        L_0x0124:
            java.lang.String r2 = "pause"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 36
            goto L_0x02c8
        L_0x0130:
            java.lang.String r2 = "close"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 7
            goto L_0x02c8
        L_0x013b:
            java.lang.String r2 = "show"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 12
            goto L_0x02c8
        L_0x0147:
            java.lang.String r2 = "hide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 13
            goto L_0x02c8
        L_0x0153:
            java.lang.String r2 = "startSafeBrowsing"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 28
            goto L_0x02c8
        L_0x015f:
            java.lang.String r2 = "getCopyBackForwardList"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 27
            goto L_0x02c8
        L_0x016b:
            java.lang.String r2 = "injectCSSCode"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 10
            goto L_0x02c8
        L_0x0177:
            java.lang.String r2 = "zoomOut"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 51
            goto L_0x02c8
        L_0x0183:
            java.lang.String r2 = "getSelectedText"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 45
            goto L_0x02c8
        L_0x018f:
            java.lang.String r2 = "getOptions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 26
            goto L_0x02c8
        L_0x019b:
            java.lang.String r2 = "isLoading"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 22
            goto L_0x02c8
        L_0x01a7:
            java.lang.String r2 = "canGoBack"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 16
            goto L_0x02c8
        L_0x01b3:
            java.lang.String r2 = "goForward"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 17
            goto L_0x02c8
        L_0x01bf:
            java.lang.String r2 = "postUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 4
            goto L_0x02c8
        L_0x01ca:
            java.lang.String r2 = "scrollTo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 34
            goto L_0x02c8
        L_0x01d6:
            java.lang.String r2 = "scrollBy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 35
            goto L_0x02c8
        L_0x01e2:
            java.lang.String r2 = "isHidden"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 23
            goto L_0x02c8
        L_0x01ee:
            java.lang.String r2 = "printCurrentPage"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 40
            goto L_0x02c8
        L_0x01fa:
            java.lang.String r2 = "findNext"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 32
            goto L_0x02c8
        L_0x0206:
            java.lang.String r2 = "zoomIn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 50
            goto L_0x02c8
        L_0x0212:
            java.lang.String r2 = "zoomBy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 42
            goto L_0x02c8
        L_0x021e:
            java.lang.String r2 = "clearFocus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 52
            goto L_0x02c8
        L_0x022a:
            java.lang.String r2 = "clearCache"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 29
            goto L_0x02c8
        L_0x0236:
            java.lang.String r2 = "resume"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 37
            goto L_0x02c8
        L_0x0242:
            java.lang.String r2 = "reload"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 14
            goto L_0x02c8
        L_0x024e:
            java.lang.String r2 = "stopLoading"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = r8
            goto L_0x02c8
        L_0x0259:
            java.lang.String r2 = "pageUp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 48
            goto L_0x02c8
        L_0x0265:
            java.lang.String r2 = "canGoForward"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 18
            goto L_0x02c8
        L_0x0270:
            java.lang.String r2 = "goBack"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 15
            goto L_0x02c8
        L_0x027b:
            java.lang.String r2 = "getUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 0
            goto L_0x02c8
        L_0x0285:
            java.lang.String r2 = "canGoBackOrForward"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 20
            goto L_0x02c8
        L_0x0290:
            java.lang.String r2 = "getScrollY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 57
            goto L_0x02c8
        L_0x029b:
            java.lang.String r2 = "getScrollX"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 56
            goto L_0x02c8
        L_0x02a6:
            java.lang.String r2 = "saveWebArchive"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 49
            goto L_0x02c8
        L_0x02b1:
            java.lang.String r2 = "getContentHeight"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 41
            goto L_0x02c8
        L_0x02bc:
            java.lang.String r2 = "pauseTimers"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c7
            r1 = 38
            goto L_0x02c8
        L_0x02c7:
            r1 = r5
        L_0x02c8:
            r2 = 0
            java.lang.String r9 = "animated"
            java.lang.String r10 = "y"
            java.lang.String r11 = "x"
            java.lang.String r12 = "steps"
            java.lang.String r13 = "urlFile"
            java.lang.String r14 = "source"
            java.lang.String r15 = "headers"
            java.lang.String r3 = "url"
            switch(r1) {
                case 0: goto L_0x0648;
                case 1: goto L_0x0640;
                case 2: goto L_0x0638;
                case 3: goto L_0x0622;
                case 4: goto L_0x0610;
                case 5: goto L_0x05df;
                case 6: goto L_0x05c7;
                case 7: goto L_0x05c2;
                case 8: goto L_0x05b7;
                case 9: goto L_0x05a7;
                case 10: goto L_0x0597;
                case 11: goto L_0x0587;
                case 12: goto L_0x057d;
                case 13: goto L_0x0573;
                case 14: goto L_0x0569;
                case 15: goto L_0x055f;
                case 16: goto L_0x0552;
                case 17: goto L_0x0548;
                case 18: goto L_0x053b;
                case 19: goto L_0x0527;
                case 20: goto L_0x0510;
                case 21: goto L_0x0506;
                case 22: goto L_0x04f9;
                case 23: goto L_0x04ee;
                case 24: goto L_0x04e9;
                case 25: goto L_0x0494;
                case 26: goto L_0x048b;
                case 27: goto L_0x0482;
                case 28: goto L_0x047d;
                case 29: goto L_0x0473;
                case 30: goto L_0x0469;
                case 31: goto L_0x0457;
                case 32: goto L_0x044a;
                case 33: goto L_0x0445;
                case 34: goto L_0x0429;
                case 35: goto L_0x040d;
                case 36: goto L_0x0403;
                case 37: goto L_0x03f9;
                case 38: goto L_0x03ef;
                case 39: goto L_0x03e5;
                case 40: goto L_0x03d7;
                case 41: goto L_0x03ce;
                case 42: goto L_0x03b8;
                case 43: goto L_0x03af;
                case 44: goto L_0x03a6;
                case 45: goto L_0x0398;
                case 46: goto L_0x038f;
                case 47: goto L_0x0376;
                case 48: goto L_0x035d;
                case 49: goto L_0x0344;
                case 50: goto L_0x0337;
                case 51: goto L_0x032a;
                case 52: goto L_0x0320;
                case 53: goto L_0x030e;
                case 54: goto L_0x0305;
                case 55: goto L_0x02fc;
                case 56: goto L_0x02f3;
                case 57: goto L_0x02ea;
                case 58: goto L_0x02e1;
                default: goto L_0x02dc;
            }
        L_0x02dc:
            r18.notImplemented()
            goto L_0x064f
        L_0x02e1:
            java.util.Map r0 = r16.mo45686B()
            r6.success(r0)
            goto L_0x064f
        L_0x02ea:
            java.lang.Integer r0 = r16.mo45695K()
            r6.success(r0)
            goto L_0x064f
        L_0x02f3:
            java.lang.Integer r0 = r16.mo45694J()
            r6.success(r0)
            goto L_0x064f
        L_0x02fc:
            java.util.Map r0 = r16.mo45725j0()
            r6.success(r0)
            goto L_0x064f
        L_0x0305:
            java.util.Map r0 = r16.mo45724i0()
            r6.success(r0)
            goto L_0x064f
        L_0x030e:
            java.lang.String r1 = "contextMenu"
            java.lang.Object r0 = r0.mo46571a(r1)
            java.util.Map r0 = (java.util.Map) r0
            r7.mo45730o0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0320:
            r16.mo45742t()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x032a:
            boolean r0 = r16.mo45749w0()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x0337:
            boolean r0 = r16.mo45747v0()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x0344:
            java.lang.String r1 = "basename"
            java.lang.Object r1 = r0.mo46571a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "autoname"
            java.lang.Object r0 = r0.mo46571a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7.mo45727l0(r1, r0, r6)
            goto L_0x064f
        L_0x035d:
            java.lang.String r1 = "top"
            java.lang.Object r0 = r0.mo46571a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = r7.mo45713c0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x0376:
            java.lang.String r1 = "bottom"
            java.lang.Object r0 = r0.mo46571a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = r7.mo45712b0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x038f:
            java.util.Map r0 = r16.mo45689E()
            r6.success(r0)
            goto L_0x064f
        L_0x0398:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x03a1
            r7.mo45696L(r6)
            goto L_0x064f
        L_0x03a1:
            r6.success(r2)
            goto L_0x064f
        L_0x03a6:
            java.lang.Float r0 = r16.mo45693I()
            r6.success(r0)
            goto L_0x064f
        L_0x03af:
            java.lang.String r0 = r16.mo45691G()
            r6.success(r0)
            goto L_0x064f
        L_0x03b8:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r8) goto L_0x03c7
            java.lang.String r1 = "zoomFactor"
            java.lang.Object r0 = r0.mo46571a(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r7.mo45745u0(r0)
        L_0x03c7:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x03ce:
            java.lang.Integer r0 = r16.mo45687C()
            r6.success(r0)
            goto L_0x064f
        L_0x03d7:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r8) goto L_0x03de
            r16.mo45718g0()
        L_0x03de:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x03e5:
            r16.mo45726k0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x03ef:
            r16.mo45715d0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x03f9:
            r16.mo45711a0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0403:
            r16.mo45710Z()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x040d:
            java.lang.Object r1 = r0.mo46571a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r0.mo46571a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r0 = r0.mo46571a(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r7.mo45728m0(r1, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0429:
            java.lang.Object r1 = r0.mo46571a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r0.mo46571a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r0 = r0.mo46571a(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r7.mo45729n0(r1, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0445:
            r7.mo45744u(r6)
            goto L_0x064f
        L_0x044a:
            java.lang.String r1 = "forward"
            java.lang.Object r0 = r0.mo46571a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r7.mo45685A(r0, r6)
            goto L_0x064f
        L_0x0457:
            java.lang.String r1 = "find"
            java.lang.Object r0 = r0.mo46571a(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7.mo45752z(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0469:
            r16.mo45746v()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0473:
            r16.mo45739s()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x047d:
            r7.mo45737r0(r6)
            goto L_0x064f
        L_0x0482:
            java.util.HashMap r0 = r16.mo45688D()
            r6.success(r0)
            goto L_0x064f
        L_0x048b:
            java.util.Map r0 = r16.mo45690F()
            r6.success(r0)
            goto L_0x064f
        L_0x0494:
            java.lang.String r1 = "optionsType"
            java.lang.Object r1 = r0.mo46571a(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.hashCode()
            r4 = 739596306(0x2c155812, float:2.1223062E-12)
            if (r3 == r4) goto L_0x04a6
            goto L_0x04b0
        L_0x04a6:
            java.lang.String r3 = "InAppBrowserOptions"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x04b0
            r3 = 0
            goto L_0x04b1
        L_0x04b0:
            r3 = r5
        L_0x04b1:
            if (r3 == 0) goto L_0x04cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Options "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " not available."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppBrowserActivity"
            r6.error(r1, r0, r2)
            goto L_0x04e2
        L_0x04cf:
            c.b0.a.g.a r1 = new c.b0.a.g.a
            r1.<init>()
            java.lang.String r2 = "options"
            java.lang.Object r0 = r0.mo46571a(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r1.mo25513b(r0)
            r7.mo45733p0(r1, r0)
        L_0x04e2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x04e9:
            r7.mo45743t0(r6)
            goto L_0x064f
        L_0x04ee:
            boolean r0 = r7.f16783u
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x04f9:
            boolean r0 = r16.mo45704T()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x0506:
            r16.mo45740s0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0510:
            java.lang.Object r0 = r0.mo46571a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r0 = r7.mo45734q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x0527:
            java.lang.Object r0 = r0.mo46571a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.mo45699O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x053b:
            boolean r0 = r16.mo45736r()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x0548:
            r16.goForward()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0552:
            boolean r0 = r16.mo45732p()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.success(r0)
            goto L_0x064f
        L_0x055f:
            r16.mo45698N()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0569:
            r16.mo45723h0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0573:
            r16.mo45700P()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x057d:
            r16.mo45735q0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0587:
            java.lang.Object r0 = r0.mo46571a(r13)
            java.lang.String r0 = (java.lang.String) r0
            r7.mo45702R(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x0597:
            java.lang.Object r0 = r0.mo46571a(r14)
            java.lang.String r0 = (java.lang.String) r0
            r7.mo45701Q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x05a7:
            java.lang.Object r0 = r0.mo46571a(r13)
            java.lang.String r0 = (java.lang.String) r0
            r7.mo45703S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.success(r0)
            goto L_0x064f
        L_0x05b7:
            java.lang.Object r0 = r0.mo46571a(r14)
            java.lang.String r0 = (java.lang.String) r0
            r7.mo45751y(r0, r6)
            goto L_0x064f
        L_0x05c2:
            r7.mo45748w(r6)
            goto L_0x064f
        L_0x05c7:
            java.lang.Object r1 = r0.mo46571a(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.mo46571a(r15)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x05da
            r7.mo45707W(r1, r0, r6)
            goto L_0x064f
        L_0x05da:
            r7.mo45706V(r1, r6)
            goto L_0x064f
        L_0x05df:
            java.lang.String r1 = "data"
            java.lang.Object r1 = r0.mo46571a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "mimeType"
            java.lang.Object r2 = r0.mo46571a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "encoding"
            java.lang.Object r3 = r0.mo46571a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "baseUrl"
            java.lang.Object r4 = r0.mo46571a(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "historyUrl"
            java.lang.Object r0 = r0.mo46571a(r5)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r0 = r16
            r6 = r18
            r0.mo45705U(r1, r2, r3, r4, r5, r6)
            goto L_0x064f
        L_0x0610:
            java.lang.Object r1 = r0.mo46571a(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "postData"
            java.lang.Object r0 = r0.mo46571a(r2)
            byte[] r0 = (byte[]) r0
            r7.mo45716e0(r1, r0, r6)
            goto L_0x064f
        L_0x0622:
            java.lang.Object r1 = r0.mo46571a(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.mo46571a(r15)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0634
            r7.mo45709Y(r1, r0, r6)
            goto L_0x064f
        L_0x0634:
            r7.mo45708X(r1, r6)
            goto L_0x064f
        L_0x0638:
            java.lang.Integer r0 = r16.mo45692H()
            r6.success(r0)
            goto L_0x064f
        L_0x0640:
            java.lang.String r0 = r16.mo45697M()
            r6.success(r0)
            goto L_0x064f
        L_0x0648:
            java.lang.String r0 = r16.getUrl()
            r6.success(r0)
        L_0x064f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: p */
    public boolean mo45732p() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    /* renamed from: p0 */
    public void mo45733p0(C4166a aVar, HashMap<String, Object> hashMap) {
        Boolean bool;
        String str;
        String str2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        C4202g gVar = new C4202g();
        gVar.mo25610c(hashMap);
        this.f16776n.mo45772K(gVar, hashMap);
        if (!(hashMap.get("hidden") == null || this.f16780r.f8780a == (bool5 = aVar.f8780a))) {
            if (bool5.booleanValue()) {
                mo45700P();
            } else {
                mo45735q0();
            }
        }
        if (!(hashMap.get("progressBar") == null || this.f16780r.f8787h == (bool4 = aVar.f8787h) || this.f16782t == null)) {
            if (bool4.booleanValue()) {
                this.f16782t.setMax(0);
            } else {
                this.f16782t.setMax(100);
            }
        }
        if (!(hashMap.get("hideTitleBar") == null || this.f16780r.f8785f == (bool3 = aVar.f8785f))) {
            this.f16777o.setDisplayShowTitleEnabled(!bool3.booleanValue());
        }
        if (!(hashMap.get("toolbarTop") == null || this.f16780r.f8781b == (bool2 = aVar.f8781b))) {
            if (!bool2.booleanValue()) {
                this.f16777o.hide();
            } else {
                this.f16777o.show();
            }
        }
        if (!(hashMap.get("toolbarTopBackgroundColor") == null || this.f16780r.f8782c == (str2 = aVar.f8782c) || str2.isEmpty())) {
            this.f16777o.setBackgroundDrawable(new ColorDrawable(Color.parseColor(aVar.f8782c)));
        }
        if (!(hashMap.get("toolbarTopFixedTitle") == null || this.f16780r.f8783d == (str = aVar.f8783d) || str.isEmpty())) {
            this.f16777o.setTitle((CharSequence) aVar.f8783d);
        }
        if (!(hashMap.get("hideUrlBar") == null || this.f16780r.f8784e == (bool = aVar.f8784e))) {
            if (bool.booleanValue()) {
                this.f16778p.findItem(R$id.menu_search).setVisible(false);
            } else {
                this.f16778p.findItem(R$id.menu_search).setVisible(true);
            }
        }
        this.f16780r = aVar;
    }

    /* renamed from: q */
    public boolean mo45734q(int i) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.canGoBackOrForward(i);
        }
        return false;
    }

    /* renamed from: q0 */
    public void mo45735q0() {
        this.f16783u = false;
        Intent intent = new Intent(this, InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }

    /* renamed from: r */
    public boolean mo45736r() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    /* renamed from: r0 */
    public void mo45737r0(C9017j.C9022d dVar) {
        if (this.f16776n == null || Build.VERSION.SDK_INT < 27 || !WebViewFeature.isFeatureSupported(WebViewFeature.START_SAFE_BROWSING)) {
            dVar.success(Boolean.FALSE);
        } else {
            WebViewCompat.startSafeBrowsing(this.f16776n.getContext(), new C8766d(this, dVar));
        }
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        mo45723h0();
    }

    /* renamed from: s */
    public void mo45739s() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45782h();
        }
    }

    /* renamed from: s0 */
    public void mo45740s0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.stopLoading();
        }
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", this.f16776n.getUrl());
        startActivity(Intent.createChooser(intent, "Share"));
    }

    /* renamed from: t */
    public void mo45742t() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.clearFocus();
        }
    }

    /* renamed from: t0 */
    public void mo45743t0(C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45773L(dVar);
        } else {
            dVar.success((Object) null);
        }
    }

    /* renamed from: u */
    public void mo45744u(C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.clearMatches();
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.success(Boolean.FALSE);
    }

    @RequiresApi(api = 21)
    /* renamed from: u0 */
    public void mo45745u0(Float f) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.zoomBy(f.floatValue());
        }
    }

    /* renamed from: v */
    public void mo45746v() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.clearSslPreferences();
        }
    }

    /* renamed from: v0 */
    public boolean mo45747v0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.zoomIn();
        }
        return false;
    }

    /* renamed from: w */
    public void mo45748w(C9017j.C9022d dVar) {
        this.f16773e.mo46573c("onExit", new HashMap());
        mo45750x();
        if (dVar != null) {
            dVar.success(Boolean.TRUE);
        }
    }

    /* renamed from: w0 */
    public boolean mo45749w0() {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            return inAppWebView.zoomOut();
        }
        return false;
    }

    /* renamed from: x */
    public void mo45750x() {
        this.f16773e.mo46575e((C9017j.C9021c) null);
        this.f16785w.clear();
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            C8950c cVar = C4221o.f8997e;
            if (cVar != null) {
                cVar.mo46420e(inAppWebView.f16811t);
            }
            ((ViewGroup) this.f16776n.getParent()).removeView(this.f16776n);
            this.f16776n.setWebChromeClient(new WebChromeClient());
            this.f16776n.setWebViewClient(new C8768f());
            this.f16776n.loadUrl("about:blank");
            finish();
        }
    }

    /* renamed from: y */
    public void mo45751y(String str, C9017j.C9022d dVar) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.mo45784j(str, dVar);
        } else {
            dVar.success("");
        }
    }

    /* renamed from: z */
    public void mo45752z(String str) {
        C8770InAppWebView inAppWebView = this.f16776n;
        if (inAppWebView != null) {
            inAppWebView.findAllAsync(str);
        }
    }
}
