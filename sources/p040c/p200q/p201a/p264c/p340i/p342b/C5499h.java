package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.gms.measurement.internal.zzah;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import java.util.EnumMap;

/* renamed from: c.q.a.c.i.b.h */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5499h {

    /* renamed from: b */
    public static final C5499h f10511b = new C5499h((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final EnumMap f10512a;

    public C5499h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f10512a = enumMap;
        enumMap.put(zzah.AD_STORAGE, bool);
        this.f10512a.put(zzah.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static C5499h m15748a(Bundle bundle) {
        if (bundle == null) {
            return f10511b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            enumMap.put(zzah, m15753n(bundle.getString(zzah.zzd)));
        }
        return new C5499h(enumMap);
    }

    /* renamed from: b */
    public static C5499h m15749b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahArr = zzah.zzc;
                int length = zzahArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzah = zzahArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzah, bool);
                }
                i++;
            }
        }
        return new C5499h(enumMap);
    }

    /* renamed from: g */
    public static String m15750g(Bundle bundle) {
        String string;
        for (zzah zzah : zzah.values()) {
            if (bundle.containsKey(zzah.zzd) && (string = bundle.getString(zzah.zzd)) != null && m15753n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m15751j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    public static final int m15752m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    public static Boolean m15753n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals(JuDistPlugin.PERMISSION_DENIED)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C5499h mo28319c(C5499h hVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f10512a.get(zzah);
            Boolean bool2 = (Boolean) hVar.f10512a.get(zzah);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(zzah, bool);
        }
        return new C5499h(enumMap);
    }

    /* renamed from: d */
    public final C5499h mo28320d(C5499h hVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f10512a.get(zzah);
            if (bool == null) {
                bool = (Boolean) hVar.f10512a.get(zzah);
            }
            enumMap.put(zzah, bool);
        }
        return new C5499h(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo28321e() {
        return (Boolean) this.f10512a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5499h)) {
            return false;
        }
        C5499h hVar = (C5499h) obj;
        for (zzah zzah : zzah.values()) {
            if (m15752m((Boolean) this.f10512a.get(zzah)) != m15752m((Boolean) hVar.f10512a.get(zzah))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo28323f() {
        return (Boolean) this.f10512a.get(zzah.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo28324h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahArr = zzah.zzc;
        int length = zzahArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f10512a.get(zzahArr[i]);
            if (bool == null) {
                c = '-';
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f10512a.values()) {
            i = (i * 31) + m15752m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo28326i(zzah zzah) {
        Boolean bool = (Boolean) this.f10512a.get(zzah);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo28327k(C5499h hVar) {
        return mo28328l(hVar, (zzah[]) this.f10512a.keySet().toArray(new zzah[0]));
    }

    /* renamed from: l */
    public final boolean mo28328l(C5499h hVar, zzah... zzahArr) {
        for (zzah zzah : zzahArr) {
            Boolean bool = (Boolean) this.f10512a.get(zzah);
            Boolean bool2 = (Boolean) hVar.f10512a.get(zzah);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzah zzah = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzah.name());
            sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
            Boolean bool = (Boolean) this.f10512a.get(zzah);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? JuDistPlugin.PERMISSION_DENIED : "granted");
            }
        }
        return sb.toString();
    }

    public C5499h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f10512a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
