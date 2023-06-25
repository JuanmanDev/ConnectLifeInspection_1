package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C4978a3;
import p040c.p200q.p201a.p264c.p294g.p335i.C4980a5;
import p040c.p200q.p201a.p264c.p294g.p335i.C4996b5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5010c3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5012c5;
import p040c.p200q.p201a.p264c.p294g.p335i.C5043e4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5074g3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5075g4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5079g8;
import p040c.p200q.p201a.p264c.p294g.p335i.C5091h4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5106i3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5107i4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5155l4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5169m3;
import p040c.p200q.p201a.p264c.p294g.p335i.C5170m4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5179md;
import p040c.p200q.p201a.p264c.p294g.p335i.C5245r4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5260s4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5275t4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5280t9;
import p040c.p200q.p201a.p264c.p294g.p335i.C5350y4;

/* renamed from: c.q.a.c.i.b.aa */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5426aa extends C5569m9 {
    public C5426aa(C5709y9 y9Var) {
        super(y9Var);
    }

    /* renamed from: C */
    public static C5280t9 m15490C(C5280t9 t9Var, byte[] bArr) {
        C5079g8 a = C5079g8.m14135a();
        if (a != null) {
            t9Var.mo27148O(bArr, a);
            return t9Var;
        }
        t9Var.mo27147A(bArr);
        return t9Var;
    }

    /* renamed from: H */
    public static List m15491H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m15492L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    public static boolean m15493N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    public static final void m15494P(C5091h4 h4Var, String str, Object obj) {
        List L = h4Var.mo27294L();
        int i = 0;
        while (true) {
            if (i >= L.size()) {
                i = -1;
                break;
            } else if (str.equals(((C5170m4) L.get(i)).mo27418J())) {
                break;
            } else {
                i++;
            }
        }
        C5155l4 H = C5170m4.m14462H();
        H.mo27385F(str);
        if (obj instanceof Long) {
            H.mo27384E(((Long) obj).longValue());
        }
        if (i >= 0) {
            h4Var.mo27288F(i, H);
        } else {
            h4Var.mo27299w(H);
        }
    }

    @WorkerThread
    /* renamed from: m */
    public static final boolean m15495m(zzaw zzaw, zzq zzq) {
        C3495o.m8908j(zzaw);
        C3495o.m8908j(zzq);
        return !TextUtils.isEmpty(zzq.f14919l) || !TextUtils.isEmpty(zzq.f14910A);
    }

    /* renamed from: n */
    public static final C5170m4 m15496n(C5107i4 i4Var, String str) {
        for (C5170m4 m4Var : i4Var.mo27328L()) {
            if (m4Var.mo27418J().equals(str)) {
                return m4Var;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final Object m15497o(C5107i4 i4Var, String str) {
        C5170m4 n = m15496n(i4Var, str);
        if (n == null) {
            return null;
        }
        if (n.mo27425b0()) {
            return n.mo27419K();
        }
        if (n.mo27423Z()) {
            return Long.valueOf(n.mo27417G());
        }
        if (n.mo27421X()) {
            return Double.valueOf(n.mo27414D());
        }
        if (n.mo27416F() <= 0) {
            return null;
        }
        List<C5170m4> L = n.mo27420L();
        ArrayList arrayList = new ArrayList();
        for (C5170m4 m4Var : L) {
            if (m4Var != null) {
                Bundle bundle = new Bundle();
                for (C5170m4 m4Var2 : m4Var.mo27420L()) {
                    if (m4Var2.mo27425b0()) {
                        bundle.putString(m4Var2.mo27418J(), m4Var2.mo27419K());
                    } else if (m4Var2.mo27423Z()) {
                        bundle.putLong(m4Var2.mo27418J(), m4Var2.mo27417G());
                    } else if (m4Var2.mo27421X()) {
                        bundle.putDouble(m4Var2.mo27418J(), m4Var2.mo27414D());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: r */
    public static final void m15498r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: s */
    public static final String m15499s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static final void m15500t(StringBuilder sb, int i, String str, C5350y4 y4Var) {
        if (y4Var != null) {
            m15498r(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (y4Var.mo27951E() != 0) {
                m15498r(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : y4Var.mo27957N()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (y4Var.mo27953G() != 0) {
                m15498r(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : y4Var.mo27959Q()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (y4Var.mo27950D() != 0) {
                m15498r(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C5075g4 g4Var : y4Var.mo27956M()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(g4Var.mo27272K() ? Integer.valueOf(g4Var.mo27269D()) : null);
                    sb.append(RunnerArgs.CLASSPATH_SEPARATOR);
                    sb.append(g4Var.mo27271J() ? Long.valueOf(g4Var.mo27270E()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (y4Var.mo27952F() != 0) {
                m15498r(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C4980a5 a5Var : y4Var.mo27958P()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(a5Var.mo26934L() ? Integer.valueOf(a5Var.mo26931E()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : a5Var.mo26933I()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m15498r(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    public static final void m15501u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m15498r(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    public static final void m15502v(StringBuilder sb, int i, String str, C5074g3 g3Var) {
        if (g3Var != null) {
            m15498r(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (g3Var.mo27263J()) {
                int P = g3Var.mo27268P();
                m15501u(sb, i, "comparison_type", P != 1 ? P != 2 ? P != 3 ? P != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (g3Var.mo27265L()) {
                m15501u(sb, i, "match_as_float", Boolean.valueOf(g3Var.mo27262I()));
            }
            if (g3Var.mo27264K()) {
                m15501u(sb, i, "comparison_value", g3Var.mo27259F());
            }
            if (g3Var.mo27267N()) {
                m15501u(sb, i, "min_comparison_value", g3Var.mo27261H());
            }
            if (g3Var.mo27266M()) {
                m15501u(sb, i, "max_comparison_value", g3Var.mo27260G());
            }
            m15498r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    public static int m15503w(C5260s4 s4Var, String str) {
        for (int i = 0; i < s4Var.mo27615r0(); i++) {
            if (str.equals(s4Var.mo27608l0(i).mo27090I())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaw mo28076A(p040c.p200q.p201a.p264c.p294g.p335i.C4990b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo26958e()
            r1 = 1
            android.os.Bundle r0 = r8.mo28091y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo26957d()
            java.lang.String r1 = p040c.p200q.p201a.p264c.p340i.p342b.C5625r5.m16064b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo26957d()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzaw r1 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau
            r4.<init>(r0)
            long r6 = r9.mo26953a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.mo28076A(c.q.a.c.g.i.b):com.google.android.gms.measurement.internal.zzaw");
    }

    /* renamed from: B */
    public final C5107i4 mo28077B(C5607q qVar) {
        C5091h4 H = C5107i4.m14303H();
        H.mo27290H(qVar.f10758e);
        C5631s sVar = new C5631s(qVar.f10759f);
        while (sVar.hasNext()) {
            String a = sVar.next();
            C5155l4 H2 = C5170m4.m14462H();
            H2.mo27385F(a);
            Object U = qVar.f10759f.mo33661U(a);
            C3495o.m8908j(U);
            mo28083J(H2, U);
            H.mo27299w(H2);
        }
        return (C5107i4) H.mo27520l();
    }

    /* renamed from: D */
    public final String mo28078D(C5245r4 r4Var) {
        if (r4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C5275t4 t4Var : r4Var.mo27541G()) {
            if (t4Var != null) {
                m15498r(sb, 1);
                sb.append("bundle {\n");
                if (t4Var.mo27702p1()) {
                    m15501u(sb, 1, "protocol_version", Integer.valueOf(t4Var.mo27711y1()));
                }
                C5179md.m14505b();
                if (this.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10980i0) && this.f10699a.mo28649z().mo28235B(t4Var.mo27685R1(), C5658u2.f10984k0) && t4Var.mo27705s1()) {
                    m15501u(sb, 1, "session_stitching_token", t4Var.mo27679N());
                }
                m15501u(sb, 1, "platform", t4Var.mo27675L());
                if (t4Var.mo27698l1()) {
                    m15501u(sb, 1, "gmp_version", Long.valueOf(t4Var.mo27666G1()));
                }
                if (t4Var.mo27709w1()) {
                    m15501u(sb, 1, "uploading_gmp_version", Long.valueOf(t4Var.mo27676L1()));
                }
                if (t4Var.mo27696j1()) {
                    m15501u(sb, 1, "dynamite_version", Long.valueOf(t4Var.mo27662E1()));
                }
                if (t4Var.mo27693g1()) {
                    m15501u(sb, 1, "config_version", Long.valueOf(t4Var.mo27657C1()));
                }
                m15501u(sb, 1, "gmp_app_id", t4Var.mo27669I());
                m15501u(sb, 1, "admob_app_id", t4Var.mo27683Q1());
                m15501u(sb, 1, "app_id", t4Var.mo27685R1());
                m15501u(sb, 1, "app_version", t4Var.mo27658D());
                if (t4Var.mo27656C0()) {
                    m15501u(sb, 1, "app_version_major", Integer.valueOf(t4Var.mo27689d0()));
                }
                m15501u(sb, 1, "firebase_instance_id", t4Var.mo27667H());
                if (t4Var.mo27695i1()) {
                    m15501u(sb, 1, "dev_cert_hash", Long.valueOf(t4Var.mo27660D1()));
                }
                m15501u(sb, 1, "app_store", t4Var.mo27688T1());
                if (t4Var.mo27708v1()) {
                    m15501u(sb, 1, "upload_timestamp_millis", Long.valueOf(t4Var.mo27674K1()));
                }
                if (t4Var.mo27706t1()) {
                    m15501u(sb, 1, "start_timestamp_millis", Long.valueOf(t4Var.mo27672J1()));
                }
                if (t4Var.mo27697k1()) {
                    m15501u(sb, 1, "end_timestamp_millis", Long.valueOf(t4Var.mo27664F1()));
                }
                if (t4Var.mo27701o1()) {
                    m15501u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(t4Var.mo27670I1()));
                }
                if (t4Var.mo27700n1()) {
                    m15501u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(t4Var.mo27668H1()));
                }
                m15501u(sb, 1, "app_instance_id", t4Var.mo27687S1());
                m15501u(sb, 1, "resettable_device_id", t4Var.mo27677M());
                m15501u(sb, 1, "ds_id", t4Var.mo27665G());
                if (t4Var.mo27699m1()) {
                    m15501u(sb, 1, "limited_ad_tracking", Boolean.valueOf(t4Var.mo27652A0()));
                }
                m15501u(sb, 1, "os_version", t4Var.mo27673K());
                m15501u(sb, 1, "device_model", t4Var.mo27663F());
                m15501u(sb, 1, "user_default_language", t4Var.mo27680P());
                if (t4Var.mo27707u1()) {
                    m15501u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(t4Var.mo27653A1()));
                }
                if (t4Var.mo27659D0()) {
                    m15501u(sb, 1, "bundle_sequential_index", Integer.valueOf(t4Var.mo27690d1()));
                }
                if (t4Var.mo27704r1()) {
                    m15501u(sb, 1, "service_upload", Boolean.valueOf(t4Var.mo27654B0()));
                }
                m15501u(sb, 1, "health_monitor", t4Var.mo27671J());
                if (t4Var.mo27703q1()) {
                    m15501u(sb, 1, "retry_counter", Integer.valueOf(t4Var.mo27712z1()));
                }
                if (t4Var.mo27694h1()) {
                    m15501u(sb, 1, "consent_signals", t4Var.mo27661E());
                }
                List<C5012c5> S = t4Var.mo27686S();
                if (S != null) {
                    for (C5012c5 c5Var : S) {
                        if (c5Var != null) {
                            m15498r(sb, 2);
                            sb.append("user_property {\n");
                            m15501u(sb, 2, "set_timestamp_millis", c5Var.mo27094V() ? Long.valueOf(c5Var.mo27089F()) : null);
                            m15501u(sb, 2, "name", this.f10699a.mo28620D().mo28146f(c5Var.mo27090I()));
                            m15501u(sb, 2, "string_value", c5Var.mo27091J());
                            m15501u(sb, 2, "int_value", c5Var.mo27093U() ? Long.valueOf(c5Var.mo27088E()) : null);
                            m15501u(sb, 2, "double_value", c5Var.mo27092T() ? Double.valueOf(c5Var.mo27087D()) : null);
                            m15498r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C5043e4> Q = t4Var.mo27682Q();
                if (Q != null) {
                    for (C5043e4 e4Var : Q) {
                        if (e4Var != null) {
                            m15498r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (e4Var.mo27185N()) {
                                m15501u(sb, 2, "audience_id", Integer.valueOf(e4Var.mo27181D()));
                            }
                            if (e4Var.mo27186P()) {
                                m15501u(sb, 2, "new_audience", Boolean.valueOf(e4Var.mo27184M()));
                            }
                            m15500t(sb, 2, "current_data", e4Var.mo27182G());
                            if (e4Var.mo27187Q()) {
                                m15500t(sb, 2, "previous_data", e4Var.mo27183H());
                            }
                            m15498r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C5107i4> R = t4Var.mo27684R();
                if (R != null) {
                    for (C5107i4 i4Var : R) {
                        if (i4Var != null) {
                            m15498r(sb, 2);
                            sb.append("event {\n");
                            m15501u(sb, 2, "name", this.f10699a.mo28620D().mo28144d(i4Var.mo27327K()));
                            if (i4Var.mo27331X()) {
                                m15501u(sb, 2, "timestamp_millis", Long.valueOf(i4Var.mo27325G()));
                            }
                            if (i4Var.mo27330W()) {
                                m15501u(sb, 2, "previous_timestamp_millis", Long.valueOf(i4Var.mo27324F()));
                            }
                            if (i4Var.mo27329V()) {
                                m15501u(sb, 2, "count", Integer.valueOf(i4Var.mo27322D()));
                            }
                            if (i4Var.mo27323E() != 0) {
                                mo28088p(sb, 2, i4Var.mo27328L());
                            }
                            m15498r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m15498r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: E */
    public final String mo28079E(C4978a3 a3Var) {
        if (a3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (a3Var.mo26927S()) {
            m15501u(sb, 0, "filter_id", Integer.valueOf(a3Var.mo26918E()));
        }
        m15501u(sb, 0, "event_name", this.f10699a.mo28620D().mo28144d(a3Var.mo26921J()));
        String s = m15499s(a3Var.mo26923N(), a3Var.mo26924P(), a3Var.mo26925Q());
        if (!s.isEmpty()) {
            m15501u(sb, 0, "filter_type", s);
        }
        if (a3Var.mo26926R()) {
            m15502v(sb, 1, "event_count_filter", a3Var.mo26920I());
        }
        if (a3Var.mo26917D() > 0) {
            sb.append("  filters {\n");
            for (C5010c3 q : a3Var.mo26922K()) {
                mo28089q(sb, 2, q);
            }
        }
        m15498r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: F */
    public final String mo28080F(C5106i3 i3Var) {
        if (i3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (i3Var.mo27320M()) {
            m15501u(sb, 0, "filter_id", Integer.valueOf(i3Var.mo27314D()));
        }
        m15501u(sb, 0, "property_name", this.f10699a.mo28620D().mo28146f(i3Var.mo27316H()));
        String s = m15499s(i3Var.mo27317J(), i3Var.mo27318K(), i3Var.mo27319L());
        if (!s.isEmpty()) {
            m15501u(sb, 0, "filter_type", s);
        }
        mo28089q(sb, 1, i3Var.mo27315E());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: G */
    public final List mo28081G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f10699a.mo28487b().mo28344w().mo28260b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f10699a.mo28487b().mo28344w().mo28261c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: I */
    public final Map mo28082I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo28082I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo28082I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo28082I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public final void mo28083J(C5155l4 l4Var, Object obj) {
        C3495o.m8908j(obj);
        l4Var.mo27393z();
        l4Var.mo27391w();
        l4Var.mo27390v();
        l4Var.mo27392y();
        if (obj instanceof String) {
            l4Var.mo27386G((String) obj);
        } else if (obj instanceof Long) {
            l4Var.mo27384E(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            l4Var.mo27383C(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C5155l4 H = C5170m4.m14462H();
                    for (String str : bundle.keySet()) {
                        C5155l4 H2 = C5170m4.m14462H();
                        H2.mo27385F(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            H2.mo27384E(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            H2.mo27386G((String) obj2);
                        } else if (obj2 instanceof Double) {
                            H2.mo27383C(((Double) obj2).doubleValue());
                        }
                        H.mo27389t(H2);
                    }
                    if (H.mo27387r() > 0) {
                        arrayList.add((C5170m4) H.mo27520l());
                    }
                }
            }
            l4Var.mo27388s(arrayList);
        } else {
            this.f10699a.mo28487b().mo28339r().mo28260b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: K */
    public final void mo28084K(C4996b5 b5Var, Object obj) {
        C3495o.m8908j(obj);
        b5Var.mo26976t();
        b5Var.mo26975s();
        b5Var.mo26974r();
        if (obj instanceof String) {
            b5Var.mo26973C((String) obj);
        } else if (obj instanceof Long) {
            b5Var.mo26978w(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            b5Var.mo26977v(((Double) obj).doubleValue());
        } else {
            this.f10699a.mo28487b().mo28339r().mo28260b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: M */
    public final boolean mo28085M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f10699a.mo28488c().mo20838a() - j) > j2;
    }

    /* renamed from: O */
    public final byte[] mo28086O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: l */
    public final boolean mo28087l() {
        return false;
    }

    /* renamed from: p */
    public final void mo28088p(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5170m4 m4Var = (C5170m4) it.next();
                if (m4Var != null) {
                    m15498r(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m15501u(sb, i2, "name", m4Var.mo27424a0() ? this.f10699a.mo28620D().mo28145e(m4Var.mo27418J()) : null);
                    m15501u(sb, i2, "string_value", m4Var.mo27425b0() ? m4Var.mo27419K() : null);
                    m15501u(sb, i2, "int_value", m4Var.mo27423Z() ? Long.valueOf(m4Var.mo27417G()) : null);
                    if (m4Var.mo27421X()) {
                        d = Double.valueOf(m4Var.mo27414D());
                    }
                    m15501u(sb, i2, "double_value", d);
                    if (m4Var.mo27416F() > 0) {
                        mo28088p(sb, i2, m4Var.mo27420L());
                    }
                    m15498r(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo28089q(StringBuilder sb, int i, C5010c3 c3Var) {
        String str;
        if (c3Var != null) {
            m15498r(sb, i);
            sb.append("filter {\n");
            if (c3Var.mo27083K()) {
                m15501u(sb, i, "complement", Boolean.valueOf(c3Var.mo27082J()));
            }
            if (c3Var.mo27085M()) {
                m15501u(sb, i, "param_name", this.f10699a.mo28620D().mo28145e(c3Var.mo27081H()));
            }
            if (c3Var.mo27086N()) {
                int i2 = i + 1;
                C5169m3 G = c3Var.mo27080G();
                if (G != null) {
                    m15498r(sb, i2);
                    sb.append("string_filter {\n");
                    if (G.mo27412L()) {
                        switch (G.mo27413M()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m15501u(sb, i2, "match_type", str);
                    }
                    if (G.mo27411K()) {
                        m15501u(sb, i2, "expression", G.mo27407G());
                    }
                    if (G.mo27410J()) {
                        m15501u(sb, i2, "case_sensitive", Boolean.valueOf(G.mo27409I()));
                    }
                    if (G.mo27406D() > 0) {
                        m15498r(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : G.mo27408H()) {
                            m15498r(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m15498r(sb, i2);
                    sb.append("}\n");
                }
            }
            if (c3Var.mo27084L()) {
                m15502v(sb, i + 1, "number_filter", c3Var.mo27079F());
            }
            m15498r(sb, i);
            sb.append("}\n");
        }
    }

    @WorkerThread
    /* renamed from: x */
    public final long mo28090x(byte[] bArr) {
        C3495o.m8908j(bArr);
        this.f10699a.mo28629N().mo28029h();
        MessageDigest t = C5498ga.m15695t();
        if (t != null) {
            return C5498ga.m15694q0(t.digest(bArr));
        }
        this.f10699a.mo28487b().mo28339r().mo28259a("Failed to get MD5");
        return 0;
    }

    /* renamed from: y */
    public final Bundle mo28091y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo28091y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f10699a.mo28487b().mo28339r().mo28259a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo28092z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            c.q.a.c.i.b.t4 r5 = r4.f10699a     // Catch:{ all -> 0x001a }
            c.q.a.c.i.b.i3 r5 = r5.mo28487b()     // Catch:{ all -> 0x001a }
            c.q.a.c.i.b.g3 r5 = r5.mo28339r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo28259a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5426aa.mo28092z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
