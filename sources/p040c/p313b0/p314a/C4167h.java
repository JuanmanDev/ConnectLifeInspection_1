package p040c.p313b0.p314a;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2ExchangeCodec;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.h */
/* compiled from: InAppBrowserManager */
public class C4167h implements C9017j.C9021c {

    /* renamed from: e */
    public C9017j f8788e;

    public C4167h(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappbrowser");
        this.f8788e = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: b */
    public static String m11425b(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    /* renamed from: a */
    public void mo25515a() {
        this.f8788e.mo46575e((C9017j.C9021c) null);
    }

    /* renamed from: c */
    public void mo25516c(Activity activity, String str, HashMap<String, Object> hashMap, String str2, String str3, String str4, String str5, String str6, HashMap<String, Object> hashMap2, Integer num) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isData", true);
        bundle.putString("uuid", str);
        bundle.putSerializable("options", hashMap);
        bundle.putString("data", str2);
        bundle.putString("mimeType", str3);
        bundle.putString(Http2ExchangeCodec.ENCODING, str4);
        bundle.putString("baseUrl", str5);
        bundle.putString("historyUrl", str6);
        bundle.putSerializable("contextMenu", hashMap2);
        bundle.putInt("windowId", num != null ? num.intValue() : -1);
        mo25520g(activity, bundle);
    }

    /* renamed from: d */
    public void mo25517d(Activity activity, Intent intent) {
        String packageName = activity.getPackageName();
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (ResolveInfo next : queryIntentActivities) {
            if (!packageName.equals(next.activityInfo.packageName)) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(next.activityInfo.packageName);
                arrayList.add(intent2);
            } else {
                z = true;
            }
        }
        if (!z || arrayList.size() == 0) {
            activity.startActivity(intent);
        } else if (arrayList.size() == 1) {
            activity.startActivity((Intent) arrayList.get(0));
        } else if (arrayList.size() > 0) {
            Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), (CharSequence) null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            activity.startActivity(createChooser);
        }
    }

    /* renamed from: e */
    public void mo25518e(Activity activity, String str, String str2, HashMap<String, Object> hashMap, Map<String, String> map, HashMap<String, Object> hashMap2, Integer num) {
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putString("url", str2);
        bundle.putBoolean("isData", false);
        bundle.putString("uuid", str);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("headers", (Serializable) map);
        bundle.putSerializable("contextMenu", hashMap2);
        bundle.putInt("windowId", num != null ? num.intValue() : -1);
        mo25520g(activity, bundle);
    }

    /* renamed from: f */
    public void mo25519f(Activity activity, String str, C9017j.C9022d dVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if ("file".equals(parse.getScheme())) {
                intent.setDataAndType(parse, m11425b(str));
            } else {
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            mo25517d(activity, intent);
            dVar.success(Boolean.TRUE);
        } catch (RuntimeException e) {
            str + " cannot be opened: " + e.toString();
            dVar.error("InAppBrowserManager", str + " cannot be opened!", (Object) null);
        }
    }

    /* renamed from: g */
    public void mo25520g(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
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
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -2119567959: goto L_0x0036;
                case -1263203643: goto L_0x002c;
                case -505129708: goto L_0x0022;
                case -505062682: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0040
        L_0x0018:
            java.lang.String r3 = "openFile"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0040
            r0 = r6
            goto L_0x0041
        L_0x0022:
            java.lang.String r3 = "openData"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0040
            r0 = r5
            goto L_0x0041
        L_0x002c:
            java.lang.String r3 = "openUrl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r3 = "openWithSystemBrowser"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0040
            r0 = r4
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            java.lang.String r3 = "headers"
            java.lang.String r7 = "windowId"
            java.lang.String r8 = "contextMenu"
            java.lang.String r9 = "options"
            java.lang.String r10 = "url"
            if (r0 == 0) goto L_0x0102
            if (r0 == r6) goto L_0x00b3
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x0058
            r14.notImplemented()
            goto L_0x0132
        L_0x0058:
            java.lang.Object r13 = r13.mo46571a(r10)
            java.lang.String r13 = (java.lang.String) r13
            r12.mo25519f(r1, r13, r14)
            goto L_0x0132
        L_0x0063:
            java.lang.Object r0 = r13.mo46571a(r9)
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r0 = "data"
            java.lang.Object r0 = r13.mo46571a(r0)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "mimeType"
            java.lang.Object r0 = r13.mo46571a(r0)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "encoding"
            java.lang.Object r0 = r13.mo46571a(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "baseUrl"
            java.lang.Object r0 = r13.mo46571a(r0)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "historyUrl"
            java.lang.Object r0 = r13.mo46571a(r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r13.mo46571a(r8)
            r11 = r0
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r13 = r13.mo46571a(r7)
            java.lang.Integer r13 = (java.lang.Integer) r13
            r0 = r12
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r0.mo25516c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r14.success(r13)
            goto L_0x0132
        L_0x00b3:
            java.lang.Object r0 = r13.mo46571a(r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = p040c.p313b0.p314a.C4222p.m11505c(r0)     // Catch:{ IOException -> 0x00e7 }
            java.lang.Object r0 = r13.mo46571a(r9)
            r5 = r0
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r13.mo46571a(r3)
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r0 = r13.mo46571a(r8)
            r8 = r0
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r13 = r13.mo46571a(r7)
            r7 = r13
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = r12
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r0.mo25518e(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r14.success(r13)
            goto L_0x0132
        L_0x00e7:
            r13 = move-exception
            r13.printStackTrace()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " asset file cannot be found!"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "InAppBrowserManager"
            r14.error(r1, r0, r13)
            return
        L_0x0102:
            java.lang.Object r0 = r13.mo46571a(r10)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r13.mo46571a(r9)
            r5 = r0
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r13.mo46571a(r3)
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r0 = r13.mo46571a(r8)
            r8 = r0
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r13 = r13.mo46571a(r7)
            r7 = r13
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = r12
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r0.mo25518e(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r14.success(r13)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4167h.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
