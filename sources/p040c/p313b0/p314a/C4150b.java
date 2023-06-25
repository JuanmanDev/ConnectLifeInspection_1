package p040c.p313b0.p314a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ChromeCustomTabsActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p313b0.p314a.p315a.C4146b;
import p040c.p313b0.p314a.p318g.C4166a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.b */
/* compiled from: ChromeSafariBrowserManager */
public class C4150b implements C9017j.C9021c {

    /* renamed from: e */
    public C9017j f8739e;

    public C4150b(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_chromesafaribrowser");
        this.f8739e = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: a */
    public void mo25478a() {
        this.f8739e.mo46575e((C9017j.C9021c) null);
    }

    /* renamed from: b */
    public void mo25479b(Activity activity, String str, String str2, HashMap<String, Object> hashMap, List<HashMap<String, Object>> list, String str3, Map<String, String> map, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num, C9017j.C9022d dVar) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putString("url", str2);
        bundle.putBoolean("isData", false);
        bundle.putString("uuid", str);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("menuItemList", (Serializable) list);
        bundle.putSerializable("headers", (Serializable) map);
        bundle.putSerializable("contextMenu", hashMap3);
        bundle.putInt("windowId", num != null ? num.intValue() : -1);
        if (C4146b.m11373e(activity)) {
            intent = new Intent(activity, ChromeCustomTabsActivity.class);
        } else if (C4146b.m11373e(activity) || str3 == null) {
            intent = null;
        } else {
            bundle.putString("uuid", str3);
            if (hashMap2 != null) {
                bundle.putSerializable("options", hashMap2);
            } else {
                bundle.putSerializable("options", (Serializable) new C4166a().mo25514c());
            }
            intent = new Intent(activity, InAppBrowserActivity.class);
        }
        if (intent != null) {
            intent.putExtras(bundle);
            activity.startActivity(intent);
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.error("ChromeBrowserManager", "No WebView fallback declared.", (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r13, p553f.p554a.p570e.p571a.C9017j.C9022d r14) {
        /*
            r12 = this;
            android.app.Activity r1 = p040c.p313b0.p314a.C4221o.f8998f
            java.lang.String r0 = "uuid"
            java.lang.Object r0 = r13.mo46571a(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = r13.f17687a
            int r3 = r0.hashCode()
            r4 = 3417674(0x34264a, float:4.789181E-39)
            r5 = 1
            if (r3 == r4) goto L_0x0027
            r4 = 444517567(0x1a7eccbf, float:5.269136E-23)
            if (r3 == r4) goto L_0x001d
            goto L_0x0031
        L_0x001d:
            java.lang.String r3 = "isAvailable"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0031
            r0 = r5
            goto L_0x0032
        L_0x0027:
            java.lang.String r3 = "open"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0031
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            if (r0 == 0) goto L_0x0046
            if (r0 == r5) goto L_0x003a
            r14.notImplemented()
            goto L_0x0093
        L_0x003a:
            boolean r13 = p040c.p313b0.p314a.p315a.C4146b.m11373e(r1)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r14.success(r13)
            goto L_0x0093
        L_0x0046:
            java.lang.String r0 = "url"
            java.lang.Object r0 = r13.mo46571a(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "options"
            java.lang.Object r0 = r13.mo46571a(r0)
            r4 = r0
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.String r0 = "menuItemList"
            java.lang.Object r0 = r13.mo46571a(r0)
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            java.lang.String r0 = "uuidFallback"
            java.lang.Object r0 = r13.mo46571a(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "headersFallback"
            java.lang.Object r0 = r13.mo46571a(r0)
            r7 = r0
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = "optionsFallback"
            java.lang.Object r0 = r13.mo46571a(r0)
            r8 = r0
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.String r0 = "contextMenuFallback"
            java.lang.Object r0 = r13.mo46571a(r0)
            r9 = r0
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.String r0 = "windowIdFallback"
            java.lang.Object r13 = r13.mo46571a(r0)
            r10 = r13
            java.lang.Integer r10 = (java.lang.Integer) r10
            r0 = r12
            r11 = r14
            r0.mo25479b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4150b.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
