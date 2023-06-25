package p040c.p313b0.p314a.p318g;

import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.b0.a.g.a */
/* compiled from: InAppBrowserOptions */
public class C4166a {

    /* renamed from: a */
    public Boolean f8780a = Boolean.FALSE;

    /* renamed from: b */
    public Boolean f8781b = Boolean.TRUE;

    /* renamed from: c */
    public String f8782c = "";

    /* renamed from: d */
    public String f8783d = "";

    /* renamed from: e */
    public Boolean f8784e;

    /* renamed from: f */
    public Boolean f8785f;

    /* renamed from: g */
    public Boolean f8786g;

    /* renamed from: h */
    public Boolean f8787h;

    public C4166a() {
        Boolean bool = Boolean.FALSE;
        this.f8784e = bool;
        this.f8785f = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f8786g = bool2;
        this.f8787h = bool2;
    }

    /* renamed from: a */
    public Map<String, Object> mo25512a(InAppBrowserActivity inAppBrowserActivity) {
        return mo25514c();
    }

    /* renamed from: b */
    public C4166a mo25513b(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1307803139:
                        if (str.equals("hideTitleBar")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1217487446:
                        if (str.equals("hidden")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -118493506:
                        if (str.equals("toolbarTopFixedTitle")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 58574810:
                        if (str.equals("toolbarTop")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 90270825:
                        if (str.equals("closeOnCannotGoBack")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 406250502:
                        if (str.equals("hideUrlBar")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1131509414:
                        if (str.equals("progressBar")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 2111633307:
                        if (str.equals("toolbarTopBackgroundColor")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f8780a = (Boolean) value;
                        break;
                    case 1:
                        this.f8781b = (Boolean) value;
                        break;
                    case 2:
                        this.f8782c = (String) value;
                        break;
                    case 3:
                        this.f8783d = (String) value;
                        break;
                    case 4:
                        this.f8784e = (Boolean) value;
                        break;
                    case 5:
                        this.f8785f = (Boolean) value;
                        break;
                    case 6:
                        this.f8786g = (Boolean) value;
                        break;
                    case 7:
                        this.f8787h = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }

    /* renamed from: c */
    public Map<String, Object> mo25514c() {
        HashMap hashMap = new HashMap();
        hashMap.put("hidden", this.f8780a);
        hashMap.put("toolbarTop", this.f8781b);
        hashMap.put("toolbarTopBackgroundColor", this.f8782c);
        hashMap.put("toolbarTopFixedTitle", this.f8783d);
        hashMap.put("hideUrlBar", this.f8784e);
        hashMap.put("hideTitleBar", this.f8785f);
        hashMap.put("closeOnCannotGoBack", this.f8786g);
        hashMap.put("progressBar", this.f8787h);
        return hashMap;
    }
}
