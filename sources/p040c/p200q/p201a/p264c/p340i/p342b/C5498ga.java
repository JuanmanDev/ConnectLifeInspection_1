package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.p700ws.RealWebSocket;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p264c.p276d.C3326c;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3554e;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.ga */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5498ga extends C5589o5 {

    /* renamed from: g */
    public static final String[] f10505g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f10506h = {"_err"};

    /* renamed from: c */
    public SecureRandom f10507c;

    /* renamed from: d */
    public final AtomicLong f10508d = new AtomicLong(0);

    /* renamed from: e */
    public int f10509e;

    /* renamed from: f */
    public Integer f10510f = null;

    public C5498ga(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: W */
    public static boolean m15685W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: X */
    public static boolean m15686X(String str) {
        C3495o.m8904f(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public static boolean m15687Y(Context context) {
        ActivityInfo receiverInfo;
        C3495o.m8908j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: Z */
    public static boolean m15688Z(Context context, boolean z) {
        C3495o.m8908j(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m15693i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m15693i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a0 */
    public static boolean m15689a0(String str) {
        return !f10506h[0].equals(str);
    }

    /* renamed from: d0 */
    public static final boolean m15690d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: e0 */
    public static final boolean m15691e0(String str) {
        C3495o.m8908j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: h0 */
    public static boolean m15692h0(String str, String[] strArr) {
        C3495o.m8908j(strArr);
        for (String a : strArr) {
            if (C5462da.m15635a(str, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public static boolean m15693i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: q0 */
    public static long m15694q0(byte[] bArr) {
        C3495o.m8908j(bArr);
        int length = bArr.length;
        int i = 0;
        C3495o.m8911m(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: t */
    public static MessageDigest m15695t() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m15696v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzac = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzac.f14887e);
            bundle.putString(EventBusConstKt.ORIGIN, zzac.f14888l);
            bundle.putLong("creation_timestamp", zzac.f14890n);
            bundle.putString("name", zzac.f14889m.f14904l);
            Object P = zzac.f14889m.mo33668P();
            C3495o.m8908j(P);
            C5613q5.m15999b(bundle, P);
            bundle.putBoolean("active", zzac.f14891o);
            String str = zzac.f14892p;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzaw = zzac.f14893q;
            if (zzaw != null) {
                bundle.putString("timed_out_event_name", zzaw.f14899e);
                zzau zzau = zzaw.f14900l;
                if (zzau != null) {
                    bundle.putBundle("timed_out_event_params", zzau.mo33658R());
                }
            }
            bundle.putLong("trigger_timeout", zzac.f14894r);
            zzaw zzaw2 = zzac.f14895s;
            if (zzaw2 != null) {
                bundle.putString("triggered_event_name", zzaw2.f14899e);
                zzau zzau2 = zzaw2.f14900l;
                if (zzau2 != null) {
                    bundle.putBundle("triggered_event_params", zzau2.mo33658R());
                }
            }
            bundle.putLong("triggered_timestamp", zzac.f14889m.f14905m);
            bundle.putLong("time_to_live", zzac.f14896t);
            zzaw zzaw3 = zzac.f14897u;
            if (zzaw3 != null) {
                bundle.putString("expired_event_name", zzaw3.f14899e);
                zzau zzau3 = zzaw3.f14900l;
                if (zzau3 != null) {
                    bundle.putBundle("expired_event_params", zzau3.mo33658R());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: y */
    public static void m15697y(C5519i7 i7Var, Bundle bundle, boolean z) {
        if (!(bundle == null || i7Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = i7Var.f10560a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = i7Var.f10561b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", i7Var.f10562c);
                return;
            }
            z = false;
        }
        if (bundle != null && i7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void mo28270A(C5527j3 j3Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(j3Var.f10586d.keySet())) {
            if (m15686X(str) && (i2 = i2 + 1) > i) {
                this.f10699a.mo28487b().mo28340s().mo28261c("Event can't contain more than " + i + " params", this.f10699a.mo28620D().mo28144d(j3Var.f10583a), this.f10699a.mo28620D().mo28142b(j3Var.f10586d));
                m15690d0(j3Var.f10586d, 5);
                j3Var.f10586d.remove(str);
            }
        }
    }

    /* renamed from: B */
    public final void mo28271B(C5486fa faVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m15690d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        faVar.mo28233a(str, "_err", bundle);
    }

    /* renamed from: C */
    public final void mo28272C(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f10699a.mo28487b().mo28345x().mo28261c("Not putting event parameter. Invalid value type. name, type", this.f10699a.mo28620D().mo28145e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: D */
    public final void mo28273D(C5088h1 h1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void mo28274E(C5088h1 h1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo28275F(C5088h1 h1Var, Bundle bundle) {
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo28276G(C5088h1 h1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo28277H(C5088h1 h1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo28278I(C5088h1 h1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void mo28279J(C5088h1 h1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: K */
    public final void mo28280K(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            this.f10699a.mo28649z();
            int i3 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    int m0 = !z ? mo28300m0(str6) : 0;
                    if (m0 == 0) {
                        m0 = mo28299l0(str6);
                    }
                    i = m0;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo28317x(bundle, i, str6, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (mo28290U(bundle2.get(str6))) {
                        this.f10699a.mo28487b().mo28345x().mo28262d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i2 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo28284O(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo28317x(bundle, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m15686X(str4) && !m15692h0(str4, C5637s5.f10851d) && (i3 = i3 + 1) > 0) {
                        this.f10699a.mo28487b().mo28340s().mo28261c("Item cannot contain custom parameters", this.f10699a.mo28620D().mo28144d(str5), this.f10699a.mo28620D().mo28142b(bundle2));
                        m15690d0(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public final boolean mo28281L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m15691e0(str)) {
                return true;
            }
            if (this.f10699a.mo28644q()) {
                this.f10699a.mo28487b().mo28340s().mo28260b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C5515i3.m15778z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f10699a.mo28644q()) {
                this.f10699a.mo28487b().mo28340s().mo28259a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m15691e0(str2)) {
            return true;
        } else {
            this.f10699a.mo28487b().mo28340s().mo28260b("Invalid admob_app_id. Analytics disabled.", C5515i3.m15778z(str2));
            return false;
        }
    }

    /* renamed from: M */
    public final boolean mo28282M(String str, int i, String str2) {
        if (str2 == null) {
            this.f10699a.mo28487b().mo28340s().mo28260b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f10699a.mo28487b().mo28340s().mo28262d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: N */
    public final boolean mo28283N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f10699a.mo28487b().mo28340s().mo28260b("Name is required and can't be null. Type", str);
            return false;
        }
        C3495o.m8908j(str2);
        String[] strArr3 = f10505g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f10699a.mo28487b().mo28340s().mo28261c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m15692h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m15692h0(str2, strArr2)) {
            return true;
        }
        this.f10699a.mo28487b().mo28340s().mo28261c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    @androidx.annotation.WorkerThread
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo28284O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.mo28029h()
            boolean r2 = r13.mo28290U(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ac
            if (r21 == 0) goto L_0x00a9
            java.lang.String[] r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5637s5.f10850c
            boolean r2 = m15692h0(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            c.q.a.c.i.b.q8 r2 = r2.mo28627L()
            r2.mo28029h()
            r2.mo28106i()
            boolean r6 = r2.mo28557B()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            c.q.a.c.i.b.t4 r2 = r2.f10699a
            c.q.a.c.i.b.ga r2 = r2.mo28629N()
            int r2 = r2.mo28303o0()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            r2.mo28649z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ac
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ac
            c.q.a.c.i.b.t4 r10 = r7.f10699a
            c.q.a.c.i.b.i3 r10 = r10.mo28487b()
            c.q.a.c.i.b.g3 r10 = r10.mo28345x()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.mo28262d(r11, r3, r8, r6)
            c.q.a.c.i.b.t4 r6 = r7.f10699a
            r6.mo28649z()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = r4
            goto L_0x00ad
        L_0x00a9:
            r0 = 21
            return r0
        L_0x00ac:
            r9 = r5
        L_0x00ad:
            boolean r1 = m15685W(r15)
            if (r1 != 0) goto L_0x00c2
            boolean r1 = m15685W(r16)
            if (r1 == 0) goto L_0x00ba
            goto L_0x00c2
        L_0x00ba:
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            r1.mo28649z()
            r1 = 100
            goto L_0x00c9
        L_0x00c2:
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            r1.mo28649z()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00c9:
            boolean r1 = r13.mo28285P(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d0
            return r9
        L_0x00d0:
            if (r21 == 0) goto L_0x0160
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo28280K(r1, r2, r3, r4, r5, r6)
            goto L_0x015f
        L_0x00e7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011e
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r5
        L_0x00f0:
            if (r12 >= r11) goto L_0x015f
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010c
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.i3 r1 = r1.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28345x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo28261c(r2, r0, r8)
            goto L_0x0160
        L_0x010c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo28280K(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00f0
        L_0x011e:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0160
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = r5
        L_0x012a:
            if (r12 >= r11) goto L_0x015f
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014d
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.i3 r1 = r1.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28345x()
            if (r0 == 0) goto L_0x0145
            java.lang.Class r0 = r0.getClass()
            goto L_0x0147
        L_0x0145:
            java.lang.String r0 = "null"
        L_0x0147:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo28261c(r2, r0, r8)
            goto L_0x0160
        L_0x014d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo28280K(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x012a
        L_0x015f:
            return r9
        L_0x0160:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.mo28284O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: P */
    public final boolean mo28285P(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f10699a.mo28487b().mo28345x().mo28262d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean mo28286Q(String str, String str2) {
        if (str2 == null) {
            this.f10699a.mo28487b().mo28340s().mo28260b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f10699a.mo28487b().mo28340s().mo28260b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f10699a.mo28487b().mo28340s().mo28261c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f10699a.mo28487b().mo28340s().mo28261c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: R */
    public final boolean mo28287R(String str, String str2) {
        if (str2 == null) {
            this.f10699a.mo28487b().mo28340s().mo28260b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f10699a.mo28487b().mo28340s().mo28260b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f10699a.mo28487b().mo28340s().mo28261c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f10699a.mo28487b().mo28340s().mo28261c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    @WorkerThread
    /* renamed from: S */
    public final boolean mo28288S(String str) {
        mo28029h();
        if (C3573c.m9110a(this.f10699a.mo28490f()).mo20843a(str) == 0) {
            return true;
        }
        this.f10699a.mo28487b().mo28338q().mo28260b("Permission not granted", str);
        return false;
    }

    /* renamed from: T */
    public final boolean mo28289T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f10699a.mo28649z().mo28253u();
        this.f10699a.mo28489d();
        return u.equals(str);
    }

    /* renamed from: U */
    public final boolean mo28290U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: V */
    public final boolean mo28291V(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = C3573c.m9110a(context).mo20847e(str, 64);
            if (e == null || e.signatures == null || e.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(e.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Package name not found", e3);
            return true;
        }
    }

    /* renamed from: b0 */
    public final boolean mo28292b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C3495o.m8908j(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* renamed from: c0 */
    public final byte[] mo28293c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: f0 */
    public final int mo28294f0(String str) {
        if ("_ldl".equals(str)) {
            this.f10699a.mo28649z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f10699a.mo28649z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f10699a.mo28649z();
            return 100;
        } else {
            this.f10699a.mo28649z();
            return 36;
        }
    }

    /* renamed from: g0 */
    public final Object mo28295g0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo28307r(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u0 = mo28313u0((Bundle) parcelable);
                    if (!u0.isEmpty()) {
                        arrayList.add(u0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo28296i() {
        mo28029h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f10699a.mo28487b().mo28344w().mo28259a("Utils falling back to Random for random id");
            }
        }
        this.f10508d.set(nextLong);
    }

    /* renamed from: j */
    public final boolean mo28227j() {
        return true;
    }

    /* renamed from: j0 */
    public final int mo28297j0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo28285P("user property referrer", str, mo28294f0(str), obj);
        } else {
            z = mo28285P("user property", str, mo28294f0(str), obj);
        }
        return z ? 0 : 7;
    }

    /* renamed from: k0 */
    public final int mo28298k0(String str) {
        if (!mo28286Q(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!mo28283N(NotificationCompat.CATEGORY_EVENT, C5625r5.f10819a, C5625r5.f10820b, str)) {
            return 13;
        }
        this.f10699a.mo28649z();
        if (!mo28282M(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: l0 */
    public final int mo28299l0(String str) {
        if (!mo28286Q("event param", str)) {
            return 3;
        }
        if (!mo28283N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f10699a.mo28649z();
        if (!mo28282M("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: m0 */
    public final int mo28300m0(String str) {
        if (!mo28287R("event param", str)) {
            return 3;
        }
        if (!mo28283N("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f10699a.mo28649z();
        if (!mo28282M("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: n0 */
    public final int mo28301n0(String str) {
        if (!mo28286Q("user property", str)) {
            return 6;
        }
        if (!mo28283N("user property", C5649t5.f10923a, (String[]) null, str)) {
            return 15;
        }
        this.f10699a.mo28649z();
        if (!mo28282M("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: o */
    public final Object mo28302o(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f10699a.mo28649z();
            return mo28295g0(256, obj, true, true);
        }
        if (m15685W(str)) {
            this.f10699a.mo28649z();
        } else {
            this.f10699a.mo28649z();
            i = 100;
        }
        return mo28295g0(i, obj, false, true);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: o0 */
    public final int mo28303o0() {
        if (this.f10510f == null) {
            this.f10510f = Integer.valueOf(C3326c.m8424f().mo20403a(this.f10699a.mo28490f()) / 1000);
        }
        return this.f10510f.intValue();
    }

    /* renamed from: p */
    public final Object mo28304p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return mo28295g0(mo28294f0(str), obj, true, false);
        }
        return mo28295g0(mo28294f0(str), obj, false, false);
    }

    /* renamed from: p0 */
    public final int mo28305p0(int i) {
        return C3326c.m8424f().mo20389h(this.f10699a.mo28490f(), C3330e.f6210a);
    }

    /* renamed from: q */
    public final String mo28306q() {
        byte[] bArr = new byte[16];
        mo28312u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: r */
    public final String mo28307r(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: r0 */
    public final long mo28308r0() {
        long andIncrement;
        long j;
        if (this.f10508d.get() == 0) {
            synchronized (this.f10508d) {
                long nextLong = new Random(System.nanoTime() ^ this.f10699a.mo28488c().mo20838a()).nextLong();
                int i = this.f10509e + 1;
                this.f10509e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f10508d) {
            this.f10508d.compareAndSet(-1, 1);
            andIncrement = this.f10508d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s */
    public final URL mo28309s(long j, String str, String str2, long j2) {
        try {
            C3495o.m8904f(str2);
            C3495o.m8904f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{74029L, Integer.valueOf(mo28303o0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f10699a.mo28649z().mo28254v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: s0 */
    public final long mo28310s0(long j, long j2) {
        return (j + (j2 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS)) / 86400000;
    }

    /* renamed from: t0 */
    public final Bundle mo28311t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str7 = uri.getQueryParameter("utm_campaign");
                    str6 = uri.getQueryParameter("utm_source");
                    str5 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str3 = uri.getQueryParameter("utm_id");
                    str2 = uri.getQueryParameter("dclid");
                    str = uri.getQueryParameter("srsltid");
                } else {
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("campaign", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("source", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("medium", str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(BrowserServiceFileProvider.CONTENT_SCHEME, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("campaign_id", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("dclid", str2);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("srsltid", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f10699a.mo28487b().mo28344w().mo28260b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    @WorkerThread
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: u */
    public final SecureRandom mo28312u() {
        mo28029h();
        if (this.f10507c == null) {
            this.f10507c = new SecureRandom();
        }
        return this.f10507c;
    }

    /* renamed from: u0 */
    public final Bundle mo28313u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o = mo28302o(str, bundle.get(str));
                if (o == null) {
                    this.f10699a.mo28487b().mo28345x().mo28260b("Param value can't be null", this.f10699a.mo28620D().mo28145e(str));
                } else {
                    mo28272C(bundle2, str, o);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108 A[SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo28314v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5625r5.f10822d
            boolean r13 = m15692h0(r10, r0)
            if (r11 == 0) goto L_0x010d
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            c.q.a.c.i.b.t4 r0 = r9.f10699a
            c.q.a.c.i.b.g r0 = r0.mo28649z()
            int r8 = r0.mo28245m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0049
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r2 = r17
            goto L_0x0059
        L_0x0049:
            if (r25 != 0) goto L_0x0050
            int r0 = r9.mo28300m0(r7)
            goto L_0x0052
        L_0x0050:
            r0 = r17
        L_0x0052:
            if (r0 != 0) goto L_0x0058
            int r0 = r9.mo28299l0(r7)
        L_0x0058:
            r2 = r0
        L_0x0059:
            if (r2 == 0) goto L_0x006f
            r0 = 3
            if (r2 != r0) goto L_0x0060
            r5 = r7
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo28317x(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0108
        L_0x006f:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo28284O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x009a
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo28317x(r1, r2, r3, r4, r5)
            goto L_0x00bc
        L_0x009a:
            if (r2 == 0) goto L_0x00bc
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00be
            r0 = 21
            if (r2 != r0) goto L_0x00ac
            r3 = r10
            goto L_0x00ad
        L_0x00ac:
            r3 = r6
        L_0x00ad:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo28317x(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0108
        L_0x00bc:
            r6 = r19
        L_0x00be:
            boolean r0 = m15686X(r6)
            if (r0 == 0) goto L_0x0108
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            c.q.a.c.i.b.t4 r2 = r9.f10699a
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28340s()
            java.lang.String r1 = r1.toString()
            c.q.a.c.i.b.t4 r3 = r9.f10699a
            c.q.a.c.i.b.d3 r3 = r3.mo28620D()
            java.lang.String r3 = r3.mo28144d(r10)
            c.q.a.c.i.b.t4 r4 = r9.f10699a
            c.q.a.c.i.b.d3 r4 = r4.mo28620D()
            java.lang.String r4 = r4.mo28142b(r11)
            r2.mo28261c(r1, r3, r4)
            r1 = 5
            m15690d0(r15, r1)
            r15.remove(r6)
        L_0x0106:
            r18 = r0
        L_0x0108:
            r8 = r14
            goto L_0x0030
        L_0x010b:
            r14 = r15
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.mo28314v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo28315w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f10699a.mo28487b().mo28344w().mo28260b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: w0 */
    public final zzaw mo28316w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo28298k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v0 = mo28314v0(str, str2, bundle3, C3554e.m9062b("_o"), true);
            if (z) {
                v0 = mo28313u0(v0);
            }
            C3495o.m8908j(v0);
            return new zzaw(str2, new zzau(v0), str3, j);
        }
        this.f10699a.mo28487b().mo28339r().mo28260b("Invalid conditional property event name", this.f10699a.mo28620D().mo28146f(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public final void mo28317x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m15690d0(bundle, i)) {
            this.f10699a.mo28649z();
            bundle.putString("_ev", mo28307r(str, 40, true));
            if (obj != null) {
                C3495o.m8908j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo28318z(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f10699a.mo28629N().mo28272C(bundle, str, bundle2.get(str));
                }
            }
        }
    }
}
