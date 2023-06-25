package p040c.p313b0.p314a.p315a;

import java.util.Map;

/* renamed from: c.b0.a.a.a */
/* compiled from: ChromeCustomTabsOptions */
public class C4145a {

    /* renamed from: a */
    public Boolean f8726a;

    /* renamed from: b */
    public Boolean f8727b;

    /* renamed from: c */
    public String f8728c = "";

    /* renamed from: d */
    public Boolean f8729d;

    /* renamed from: e */
    public Boolean f8730e;

    /* renamed from: f */
    public String f8731f;

    /* renamed from: g */
    public Boolean f8732g;

    public C4145a() {
        Boolean bool = Boolean.TRUE;
        this.f8726a = bool;
        this.f8727b = bool;
        Boolean bool2 = Boolean.FALSE;
        this.f8729d = bool2;
        this.f8730e = bool2;
        this.f8732g = bool2;
    }

    /* renamed from: a */
    public C4145a mo25467a(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -2112880751:
                        if (str.equals("addDefaultShareMenuItem")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1913803429:
                        if (str.equals("showTitle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -227713574:
                        if (str.equals("toolbarBackgroundColor")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 137483238:
                        if (str.equals("enableUrlBarHiding")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 472764366:
                        if (str.equals("instantAppsEnabled")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 908759025:
                        if (str.equals("packageName")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2126240217:
                        if (str.equals("keepAliveEnabled")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f8726a = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 1:
                        this.f8727b = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 2:
                        this.f8728c = (String) value;
                        break;
                    case 3:
                        this.f8729d = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 4:
                        this.f8730e = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 5:
                        this.f8731f = (String) value;
                        break;
                    case 6:
                        this.f8732g = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                }
            }
        }
        return this;
    }
}
