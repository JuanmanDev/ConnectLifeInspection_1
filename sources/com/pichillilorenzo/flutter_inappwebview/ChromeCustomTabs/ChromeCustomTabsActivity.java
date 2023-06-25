package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.app.NotificationCompatJellybean;
import com.pichillilorenzo.flutter_inappwebview.R$layout;
import java.util.HashMap;
import java.util.List;
import p040c.p313b0.p314a.C4221o;
import p040c.p313b0.p314a.p315a.C4145a;
import p040c.p313b0.p314a.p315a.C4146b;
import p040c.p313b0.p314a.p315a.C4148c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

public class ChromeCustomTabsActivity extends Activity implements C9017j.C9021c {

    /* renamed from: e */
    public C9017j f16758e;

    /* renamed from: l */
    public String f16759l;

    /* renamed from: m */
    public CustomTabsIntent.Builder f16760m;

    /* renamed from: n */
    public C4145a f16761n;

    /* renamed from: o */
    public C4146b f16762o;

    /* renamed from: p */
    public CustomTabsSession f16763p;

    /* renamed from: q */
    public boolean f16764q = false;

    /* renamed from: r */
    public boolean f16765r = false;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ChromeCustomTabsActivity$a */
    public class C8761a implements C4146b.C4147a {

        /* renamed from: a */
        public final /* synthetic */ String f16766a;

        /* renamed from: b */
        public final /* synthetic */ List f16767b;

        /* renamed from: c */
        public final /* synthetic */ ChromeCustomTabsActivity f16768c;

        public C8761a(String str, List list, ChromeCustomTabsActivity chromeCustomTabsActivity) {
            this.f16766a = str;
            this.f16767b = list;
            this.f16768c = chromeCustomTabsActivity;
        }

        /* renamed from: a */
        public void mo25476a() {
            this.f16768c.mo45671d();
        }

        /* renamed from: b */
        public void mo25477b() {
            ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
            chromeCustomTabsActivity.f16763p = chromeCustomTabsActivity.f16762o.mo25471d();
            Uri parse = Uri.parse(this.f16766a);
            ChromeCustomTabsActivity.this.f16762o.mo25472f(parse, (Bundle) null, (List<Bundle>) null);
            ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
            chromeCustomTabsActivity2.f16760m = new CustomTabsIntent.Builder(chromeCustomTabsActivity2.f16763p);
            ChromeCustomTabsActivity.this.mo45673f(this.f16767b);
            CustomTabsIntent build = ChromeCustomTabsActivity.this.f16760m.build();
            ChromeCustomTabsActivity.this.mo45674g(build);
            C4146b.m11374g(this.f16768c, build, parse, 100);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ChromeCustomTabsActivity$b */
    public class C8762b extends CustomTabsCallback {
        public C8762b() {
        }

        public void extraCallback(String str, Bundle bundle) {
        }

        public void onMessageChannelReady(Bundle bundle) {
        }

        public void onNavigationEvent(int i, Bundle bundle) {
            if (i == 5) {
                ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                if (!chromeCustomTabsActivity.f16764q) {
                    chromeCustomTabsActivity.f16764q = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("uuid", ChromeCustomTabsActivity.this.f16759l);
                    ChromeCustomTabsActivity.this.f16758e.mo46573c("onChromeSafariBrowserOpened", hashMap);
                }
            }
            if (i == 2) {
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                if (!chromeCustomTabsActivity2.f16765r) {
                    chromeCustomTabsActivity2.f16765r = true;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("uuid", ChromeCustomTabsActivity.this.f16759l);
                    ChromeCustomTabsActivity.this.f16758e.mo46573c("onChromeSafariBrowserCompletedInitialLoad", hashMap2);
                }
            }
        }

        public void onPostMessage(String str, Bundle bundle) {
        }

        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }

    static {
        Class<ChromeCustomTabsActivity> cls = ChromeCustomTabsActivity.class;
    }

    /* renamed from: d */
    public void mo45671d() {
        this.f16763p = null;
        finish();
        HashMap hashMap = new HashMap();
        hashMap.put("uuid", this.f16759l);
        this.f16758e.mo46573c("onChromeSafariBrowserClosed", hashMap);
    }

    /* renamed from: e */
    public final PendingIntent mo45672e(int i) {
        Intent intent = new Intent(this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID", i);
        bundle.putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_UUID", this.f16759l);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, i, intent, 0);
    }

    /* renamed from: f */
    public final void mo45673f(List<HashMap<String, Object>> list) {
        if (this.f16761n.f8726a.booleanValue()) {
            this.f16760m.addDefaultShareMenuItem();
        }
        if (!this.f16761n.f8728c.isEmpty()) {
            this.f16760m.setToolbarColor(Color.parseColor(this.f16761n.f8728c));
        }
        this.f16760m.setShowTitle(this.f16761n.f8727b.booleanValue());
        if (this.f16761n.f8729d.booleanValue()) {
            this.f16760m.enableUrlBarHiding();
        }
        this.f16760m.setInstantAppsEnabled(this.f16761n.f8730e.booleanValue());
        for (HashMap next : list) {
            int intValue = ((Integer) next.get("id")).intValue();
            this.f16760m.addMenuItem((String) next.get(NotificationCompatJellybean.KEY_LABEL), mo45672e(intValue));
        }
    }

    /* renamed from: g */
    public final void mo45674g(CustomTabsIntent customTabsIntent) {
        String str = this.f16761n.f8731f;
        if (str != null) {
            customTabsIntent.intent.setPackage(str);
        } else {
            customTabsIntent.intent.setPackage(C4148c.m11386b(this));
        }
        if (this.f16761n.f8732g.booleanValue()) {
            C4148c.m11385a(this, customTabsIntent.intent);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            mo45671d();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        this.f16759l = extras.getString("uuid");
        C9003c cVar = C4221o.f8995c;
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_chromesafaribrowser_" + this.f16759l);
        this.f16758e = jVar;
        jVar.mo46575e(this);
        String string = extras.getString("url");
        C4145a aVar = new C4145a();
        this.f16761n = aVar;
        aVar.mo25467a((HashMap) extras.getSerializable("options"));
        C4146b bVar = new C4146b();
        this.f16762o = bVar;
        bVar.mo25473h(new C8761a(string, (List) extras.getSerializable("menuItemList"), this));
        this.f16762o.mo25474i(new C8762b());
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        String str = iVar.f17687a;
        if (((str.hashCode() == 94756344 && str.equals("close")) ? (char) 0 : 65535) != 0) {
            dVar.notImplemented();
            return;
        }
        onStop();
        onDestroy();
        mo45671d();
        Activity activity = C4221o.f8998f;
        Intent intent = new Intent(activity, activity.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        C4221o.f8998f.startActivity(intent);
        dVar.success(Boolean.TRUE);
    }

    public void onStart() {
        super.onStart();
        this.f16762o.mo25470c(this);
    }

    public void onStop() {
        super.onStop();
        this.f16762o.mo25475j(this);
    }
}
