package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p040c.p200q.p405d.C6917g0;

/* renamed from: c.q.d.l */
/* compiled from: CodedOutputStreamWriter */
public final class C6949l implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f13316a;

    /* renamed from: c.q.d.l$a */
    /* compiled from: CodedOutputStreamWriter */
    public static /* synthetic */ class C6950a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13317a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13317a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13317a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6949l.C6950a.<clinit>():void");
        }
    }

    public C6949l(CodedOutputStream codedOutputStream) {
        C6999y.m20708b(codedOutputStream, "output");
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        this.f13316a = codedOutputStream2;
        codedOutputStream2.f15510a = this;
    }

    /* renamed from: P */
    public static C6949l m20207P(CodedOutputStream codedOutputStream) {
        C6949l lVar = codedOutputStream.f15510a;
        if (lVar != null) {
            return lVar;
        }
        return new C6949l(codedOutputStream);
    }

    /* renamed from: A */
    public void mo32134A(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23133o(list.get(i4).intValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37943t0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37942s0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public void mo32135B(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23123f(list.get(i4).booleanValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37933j0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37932i0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: C */
    public <K, V> void mo32136C(int i, C6917g0.C6918a<K, V> aVar, Map<K, V> map) {
        if (this.f13316a.mo37929d0()) {
            mo32152T(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f13316a.mo37922U0(i, 2);
            this.f13316a.mo37924W0(C6917g0.m19888b(aVar, next.getKey(), next.getValue()));
            C6917g0.m19890e(this.f13316a, aVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: D */
    public void mo32137D(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23115X(list.get(i4).intValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37924W0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37923V0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo32138E(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23110S(list.get(i4).longValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37919R0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37918Q0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public void mo32139F(int i, long j) {
        this.f13316a.mo37918Q0(i, j);
    }

    /* renamed from: G */
    public void mo32140G(int i, float f) {
        this.f13316a.mo37946w0(i, f);
    }

    /* renamed from: H */
    public void mo32141H(int i) {
        this.f13316a.mo37922U0(i, 4);
    }

    /* renamed from: I */
    public void mo32142I(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23108Q(list.get(i4).intValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37917P0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37916O0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public void mo32143J(int i, int i2) {
        this.f13316a.mo37940q0(i, i2);
    }

    /* renamed from: K */
    public void mo32144K(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23144z(list.get(i4).longValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37907F0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37906E0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo32145L(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23131m(list.get(i4).intValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37941r0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37940q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: M */
    public void mo32146M(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23129k(list.get(i4).doubleValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37939p0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37938o0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: N */
    public void mo32147N(int i, int i2) {
        this.f13316a.mo37916O0(i, i2);
    }

    /* renamed from: O */
    public void mo32148O(int i, List<ByteString> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f13316a.mo37936m0(i, list.get(i2));
        }
    }

    /* renamed from: Q */
    public final <V> void mo32149Q(int i, boolean z, V v, C6917g0.C6918a<Boolean, V> aVar) {
        this.f13316a.mo37922U0(i, 2);
        this.f13316a.mo37924W0(C6917g0.m19888b(aVar, Boolean.valueOf(z), v));
        C6917g0.m19890e(this.f13316a, aVar, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    public final <V> void mo32150R(int i, C6917g0.C6918a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f13316a.mo37922U0(i, 2);
            this.f13316a.mo37924W0(C6917g0.m19888b(aVar, Integer.valueOf(i4), v));
            C6917g0.m19890e(this.f13316a, aVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    public final <V> void mo32151S(int i, C6917g0.C6918a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f13316a.mo37922U0(i, 2);
            this.f13316a.mo37924W0(C6917g0.m19888b(aVar, Long.valueOf(j), v));
            C6917g0.m19890e(this.f13316a, aVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    public final <K, V> void mo32152T(int i, C6917g0.C6918a<K, V> aVar, Map<K, V> map) {
        switch (C6950a.f13317a[aVar.f13237a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    mo32149Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    mo32149Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mo32150R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mo32151S(i, aVar, map);
                return;
            case 12:
                mo32153U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f13237a);
        }
    }

    /* renamed from: U */
    public final <V> void mo32153U(int i, C6917g0.C6918a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f13316a.mo37922U0(i, 2);
            this.f13316a.mo37924W0(C6917g0.m19888b(aVar, str2, v));
            C6917g0.m19890e(this.f13316a, aVar, str2, v);
        }
    }

    /* renamed from: V */
    public final void mo32154V(int i, Object obj) {
        if (obj instanceof String) {
            this.f13316a.mo37920S0(i, (String) obj);
        } else {
            this.f13316a.mo37936m0(i, (ByteString) obj);
        }
    }

    /* renamed from: a */
    public void mo32155a(int i, List<?> list, C6903d1 d1Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo32164j(i, list.get(i2), d1Var);
        }
    }

    /* renamed from: b */
    public void mo32156b(int i, List<?> list, C6903d1 d1Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo32173s(i, list.get(i2), d1Var);
        }
    }

    /* renamed from: c */
    public void mo32157c(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23137s(list.get(i4).floatValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37947x0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37946w0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: d */
    public void mo32158d(int i, int i2) {
        this.f13316a.mo37923V0(i, i2);
    }

    /* renamed from: e */
    public final void mo32159e(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.f13316a.mo37911J0(i, (ByteString) obj);
        } else {
            this.f13316a.mo37910I0(i, (C6954m0) obj);
        }
    }

    /* renamed from: f */
    public void mo32160f(int i, int i2) {
        this.f13316a.mo37942s0(i, i2);
    }

    /* renamed from: g */
    public void mo32161g(int i, double d) {
        this.f13316a.mo37938o0(i, d);
    }

    /* renamed from: h */
    public void mo32162h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23106O(list.get(i4).longValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37915N0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37914M0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo32163i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23117Z(list.get(i4).longValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37926Y0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37925X0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public void mo32164j(int i, Object obj, C6903d1 d1Var) {
        this.f13316a.mo37908G0(i, (C6954m0) obj, d1Var);
    }

    /* renamed from: k */
    public void mo32165k(int i, long j) {
        this.f13316a.mo37944u0(i, j);
    }

    /* renamed from: l */
    public Writer.FieldOrder mo32166l() {
        return Writer.FieldOrder.ASCENDING;
    }

    /* renamed from: m */
    public void mo32167m(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C6892c0) {
            C6892c0 c0Var = (C6892c0) list;
            while (i2 < list.size()) {
                mo32154V(i, c0Var.mo31762K(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37920S0(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: n */
    public void mo32168n(int i, String str) {
        this.f13316a.mo37920S0(i, str);
    }

    /* renamed from: o */
    public void mo32169o(int i, long j) {
        this.f13316a.mo37925X0(i, j);
    }

    /* renamed from: p */
    public void mo32170p(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23142x(list.get(i4).intValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37905D0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37904C0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: q */
    public void mo32171q(int i, long j) {
        this.f13316a.mo37906E0(i, j);
    }

    /* renamed from: r */
    public void mo32172r(int i, boolean z) {
        this.f13316a.mo37932i0(i, z);
    }

    /* renamed from: s */
    public void mo32173s(int i, Object obj, C6903d1 d1Var) {
        this.f13316a.mo37949z0(i, (C6954m0) obj, d1Var);
    }

    /* renamed from: t */
    public void mo32174t(int i, int i2) {
        this.f13316a.mo37912K0(i, i2);
    }

    /* renamed from: u */
    public void mo32175u(int i) {
        this.f13316a.mo37922U0(i, 3);
    }

    /* renamed from: v */
    public void mo32176v(int i, ByteString byteString) {
        this.f13316a.mo37936m0(i, byteString);
    }

    /* renamed from: w */
    public void mo32177w(int i, int i2) {
        this.f13316a.mo37904C0(i, i2);
    }

    /* renamed from: x */
    public void mo32178x(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23135q(list.get(i4).longValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37945v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37944u0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: y */
    public void mo32179y(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13316a.mo37922U0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m23104M(list.get(i4).intValue());
            }
            this.f13316a.mo37924W0(i3);
            while (i2 < list.size()) {
                this.f13316a.mo37913L0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13316a.mo37912K0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public void mo32180z(int i, long j) {
        this.f13316a.mo37914M0(i, j);
    }
}
