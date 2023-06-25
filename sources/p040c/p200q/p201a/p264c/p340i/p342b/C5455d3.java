package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.d3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5455d3 {

    /* renamed from: b */
    public static final AtomicReference f10380b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f10381c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f10382d = new AtomicReference();

    /* renamed from: a */
    public final C5443c3 f10383a;

    public C5455d3(C5443c3 c3Var) {
        this.f10383a = c3Var;
    }

    /* renamed from: g */
    public static final String m15564g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C3495o.m8908j(strArr);
        C3495o.m8908j(strArr2);
        C3495o.m8908j(atomicReference);
        C3495o.m8899a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String mo28141a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo28142b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo28142b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f10383a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo28145e(str2));
            sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = mo28141a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo28141a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo28141a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo28143c(zzaw zzaw) {
        String str;
        if (!this.f10383a.zza()) {
            return zzaw.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzaw.f14901m);
        sb.append(",name=");
        sb.append(mo28144d(zzaw.f14899e));
        sb.append(",params=");
        zzau zzau = zzaw.f14900l;
        if (zzau == null) {
            str = null;
        } else if (!this.f10383a.zza()) {
            str = zzau.toString();
        } else {
            str = mo28142b(zzau.mo33658R());
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo28144d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10383a.zza()) {
            return str;
        }
        return m15564g(str, C5625r5.f10821c, C5625r5.f10819a, f10380b);
    }

    /* renamed from: e */
    public final String mo28145e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10383a.zza()) {
            return str;
        }
        return m15564g(str, C5637s5.f10849b, C5637s5.f10848a, f10381c);
    }

    /* renamed from: f */
    public final String mo28146f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10383a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m15564g(str, C5649t5.f10924b, C5649t5.f10923a, f10382d);
        }
        return "experiment_id(" + str + ")";
    }
}
