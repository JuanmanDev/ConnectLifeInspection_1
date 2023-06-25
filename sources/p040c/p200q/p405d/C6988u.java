package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040c.p200q.p405d.C6954m0;
import p040c.p200q.p405d.C6988u.C6990b;
import p040c.p200q.p405d.C6999y;
import p040c.p200q.p405d.C7010z;

/* renamed from: c.q.d.u */
/* compiled from: FieldSet */
public final class C6988u<T extends C6990b<T>> {

    /* renamed from: d */
    public static final C6988u f13376d = new C6988u(true);

    /* renamed from: a */
    public final C6919g1<T, Object> f13377a;

    /* renamed from: b */
    public boolean f13378b;

    /* renamed from: c */
    public boolean f13379c;

    /* renamed from: c.q.d.u$a */
    /* compiled from: FieldSet */
    public static /* synthetic */ class C6989a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13380a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f13381b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13381b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13381b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f13381b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f13381b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f13381b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f13381b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f13381b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f13381b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f13381b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f13380a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f13380a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f13380a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6988u.C6989a.<clinit>():void");
        }
    }

    /* renamed from: c.q.d.u$b */
    /* compiled from: FieldSet */
    public interface C6990b<T extends C6990b<T>> extends Comparable<T> {
        /* renamed from: f */
        boolean mo32374f();

        int getNumber();

        boolean isPacked();

        /* renamed from: l */
        WireFormat.FieldType mo32377l();

        /* renamed from: p */
        C6954m0.C6955a mo32378p(C6954m0.C6955a aVar, C6954m0 m0Var);

        /* renamed from: s */
        WireFormat.JavaType mo32379s();
    }

    public C6988u() {
        this.f13377a = C6919g1.m19898q(16);
    }

    /* renamed from: A */
    public static void m20640A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (C6989a.f13381b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo37939p0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo37947x0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo37907F0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo37926Y0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo37905D0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo37945v0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo37943t0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo37933j0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo37902A0((C6954m0) obj);
                return;
            case 10:
                codedOutputStream.mo37909H0((C6954m0) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo37937n0((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo37921T0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo37937n0((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo37934k0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo37924W0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo37913L0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo37915N0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo37917P0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.mo37919R0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C6999y.C7002c) {
                    codedOutputStream.mo37941r0(((C6999y.C7002c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo37941r0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: c */
    public static Object m20641c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m20642d(WireFormat.FieldType fieldType, int i, Object obj) {
        int V = CodedOutputStream.m23113V(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            V *= 2;
        }
        return V + m20643e(fieldType, obj);
    }

    /* renamed from: e */
    public static int m20643e(WireFormat.FieldType fieldType, Object obj) {
        switch (C6989a.f13381b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m23129k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m23137s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m23144z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m23117Z(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m23142x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m23135q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m23133o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m23123f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m23139u((C6954m0) obj);
            case 10:
                if (obj instanceof C7010z) {
                    return CodedOutputStream.m23094C((C7010z) obj);
                }
                return CodedOutputStream.m23099H((C6954m0) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m23127i((ByteString) obj);
                }
                return CodedOutputStream.m23112U((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m23127i((ByteString) obj);
                }
                return CodedOutputStream.m23125g((byte[]) obj);
            case 13:
                return CodedOutputStream.m23115X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m23104M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m23106O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m23108Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m23110S(((Long) obj).longValue());
            case 18:
                if (obj instanceof C6999y.C7002c) {
                    return CodedOutputStream.m23131m(((C6999y.C7002c) obj).getNumber());
                }
                return CodedOutputStream.m23131m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m20644f(C6990b<?> bVar, Object obj) {
        WireFormat.FieldType l = bVar.mo32377l();
        int number = bVar.getNumber();
        if (!bVar.mo32374f()) {
            return m20642d(l, number, obj);
        }
        int i = 0;
        if (bVar.isPacked()) {
            for (Object e : (List) obj) {
                i += m20643e(l, e);
            }
            return CodedOutputStream.m23113V(number) + i + CodedOutputStream.m23102K(i);
        }
        for (Object d : (List) obj) {
            i += m20642d(l, number, d);
        }
        return i;
    }

    /* renamed from: h */
    public static <T extends C6990b<T>> C6988u<T> m20645h() {
        return f13376d;
    }

    /* renamed from: m */
    public static int m20646m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* renamed from: q */
    public static <T extends C6990b<T>> boolean m20647q(Map.Entry<T, Object> entry) {
        C6990b bVar = (C6990b) entry.getKey();
        if (bVar.mo32379s() == WireFormat.JavaType.MESSAGE) {
            if (bVar.mo32374f()) {
                for (C6954m0 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C6954m0) {
                    if (!((C6954m0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C7010z) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m20648r(WireFormat.FieldType fieldType, Object obj) {
        C6999y.m20707a(obj);
        switch (C6989a.f13380a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C6999y.C7002c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof C6954m0) || (obj instanceof C7010z)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: w */
    public static <T extends C6990b<T>> C6988u<T> m20649w() {
        return new C6988u<>();
    }

    /* renamed from: z */
    public static void m20650z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.mo37948y0(i, (C6954m0) obj);
            return;
        }
        codedOutputStream.mo37922U0(i, m20646m(fieldType, false));
        m20640A(codedOutputStream, fieldType, obj);
    }

    /* renamed from: a */
    public void mo32355a(T t, Object obj) {
        List list;
        if (t.mo32374f()) {
            mo32373y(t.mo32377l(), obj);
            Object i = mo32361i(t);
            if (i == null) {
                list = new ArrayList();
                this.f13377a.put(t, list);
            } else {
                list = (List) i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C6988u<T> clone() {
        C6988u<T> w = m20649w();
        for (int i = 0; i < this.f13377a.mo31967k(); i++) {
            Map.Entry<T, Object> j = this.f13377a.mo31966j(i);
            w.mo32372x((C6990b) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f13377a.mo31969m()) {
            w.mo32372x((C6990b) next.getKey(), next.getValue());
        }
        w.f13379c = this.f13379c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6988u)) {
            return false;
        }
        return this.f13377a.equals(((C6988u) obj).f13377a);
    }

    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> mo32359g() {
        if (this.f13379c) {
            return new C7010z.C7013c(this.f13377a.mo31963h().iterator());
        }
        return this.f13377a.mo31963h().iterator();
    }

    public int hashCode() {
        return this.f13377a.hashCode();
    }

    /* renamed from: i */
    public Object mo32361i(T t) {
        Object obj = this.f13377a.get(t);
        return obj instanceof C7010z ? ((C7010z) obj).mo32434f() : obj;
    }

    /* renamed from: j */
    public int mo32362j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13377a.mo31967k(); i2++) {
            i += mo32363k(this.f13377a.mo31966j(i2));
        }
        for (Map.Entry<T, Object> k : this.f13377a.mo31969m()) {
            i += mo32363k(k);
        }
        return i;
    }

    /* renamed from: k */
    public final int mo32363k(Map.Entry<T, Object> entry) {
        C6990b bVar = (C6990b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo32379s() != WireFormat.JavaType.MESSAGE || bVar.mo32374f() || bVar.isPacked()) {
            return m20644f(bVar, value);
        }
        if (value instanceof C7010z) {
            return CodedOutputStream.m23092A(((C6990b) entry.getKey()).getNumber(), (C7010z) value);
        }
        return CodedOutputStream.m23096E(((C6990b) entry.getKey()).getNumber(), (C6954m0) value);
    }

    /* renamed from: l */
    public int mo32364l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13377a.mo31967k(); i2++) {
            Map.Entry<T, Object> j = this.f13377a.mo31966j(i2);
            i += m20644f((C6990b) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f13377a.mo31969m()) {
            i += m20644f((C6990b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: n */
    public boolean mo32365n() {
        return this.f13377a.isEmpty();
    }

    /* renamed from: o */
    public boolean mo32366o() {
        return this.f13378b;
    }

    /* renamed from: p */
    public boolean mo32367p() {
        for (int i = 0; i < this.f13377a.mo31967k(); i++) {
            if (!m20647q(this.f13377a.mo31966j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q : this.f13377a.mo31969m()) {
            if (!m20647q(q)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<T, Object>> mo32368s() {
        if (this.f13379c) {
            return new C7010z.C7013c(this.f13377a.entrySet().iterator());
        }
        return this.f13377a.entrySet().iterator();
    }

    /* renamed from: t */
    public void mo32369t() {
        if (!this.f13378b) {
            this.f13377a.mo31972p();
            this.f13378b = true;
        }
    }

    /* renamed from: u */
    public void mo32370u(C6988u<T> uVar) {
        for (int i = 0; i < uVar.f13377a.mo31967k(); i++) {
            mo32371v(uVar.f13377a.mo31966j(i));
        }
        for (Map.Entry<T, Object> v : uVar.f13377a.mo31969m()) {
            mo32371v(v);
        }
    }

    /* renamed from: v */
    public final void mo32371v(Map.Entry<T, Object> entry) {
        C6990b bVar = (C6990b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C7010z) {
            value = ((C7010z) value).mo32434f();
        }
        if (bVar.mo32374f()) {
            Object i = mo32361i(bVar);
            if (i == null) {
                i = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) i).add(m20641c(c));
            }
            this.f13377a.put(bVar, i);
        } else if (bVar.mo32379s() == WireFormat.JavaType.MESSAGE) {
            Object i2 = mo32361i(bVar);
            if (i2 == null) {
                this.f13377a.put(bVar, m20641c(value));
                return;
            }
            this.f13377a.put(bVar, bVar.mo32378p(((C6954m0) i2).mo32215b(), (C6954m0) value).build());
        } else {
            this.f13377a.put(bVar, m20641c(value));
        }
    }

    /* renamed from: x */
    public void mo32372x(T t, Object obj) {
        if (!t.mo32374f()) {
            mo32373y(t.mo32377l(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object y : arrayList) {
                mo32373y(t.mo32377l(), y);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C7010z) {
            this.f13379c = true;
        }
        this.f13377a.put(t, obj);
    }

    /* renamed from: y */
    public final void mo32373y(WireFormat.FieldType fieldType, Object obj) {
        if (!m20648r(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public C6988u(boolean z) {
        this(C6919g1.m19898q(0));
        mo32369t();
    }

    public C6988u(C6919g1<T, Object> g1Var) {
        this.f13377a = g1Var;
        mo32369t();
    }
}
