package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.d.r */
/* compiled from: ExtensionSchemaLite */
public final class C6981r extends C6979q<GeneratedMessageLite.C8429d> {

    /* renamed from: c.q.d.r$a */
    /* compiled from: ExtensionSchemaLite */
    public static /* synthetic */ class C6982a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13371a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f13371a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6981r.C6982a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo32328a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C8429d) entry.getKey()).getNumber();
    }

    /* renamed from: b */
    public Object mo32329b(C6975p pVar, C6954m0 m0Var, int i) {
        return pVar.mo32279a(m0Var, i);
    }

    /* renamed from: c */
    public C6988u<GeneratedMessageLite.C8429d> mo32330c(Object obj) {
        return ((GeneratedMessageLite.C8428c) obj).f15533o;
    }

    /* renamed from: d */
    public C6988u<GeneratedMessageLite.C8429d> mo32331d(Object obj) {
        return ((GeneratedMessageLite.C8428c) obj).mo37989H();
    }

    /* renamed from: e */
    public boolean mo32332e(C6954m0 m0Var) {
        return m0Var instanceof GeneratedMessageLite.C8428c;
    }

    /* renamed from: f */
    public void mo32333f(Object obj) {
        mo32330c(obj).mo32369t();
    }

    /* renamed from: g */
    public <UT, UB> UB mo32334g(C6890b1 b1Var, Object obj, C6975p pVar, C6988u<GeneratedMessageLite.C8429d> uVar, UB ub, C6944j1<UT, UB> j1Var) {
        Object i;
        ArrayList arrayList;
        GeneratedMessageLite.C8430e eVar = (GeneratedMessageLite.C8430e) obj;
        int c = eVar.mo37995c();
        if (!eVar.f15540b.mo32374f() || !eVar.f15540b.isPacked()) {
            Object obj2 = null;
            if (eVar.mo37993a() != WireFormat.FieldType.ENUM) {
                switch (C6982a.f13371a[eVar.mo37993a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(b1Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(b1Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(b1Var.mo31791M());
                        break;
                    case 4:
                        obj2 = Long.valueOf(b1Var.mo31795b());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(b1Var.mo31786H());
                        break;
                    case 6:
                        obj2 = Long.valueOf(b1Var.mo31796c());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(b1Var.mo31803i());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(b1Var.mo31804j());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(b1Var.mo31809o());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(b1Var.mo31788J());
                        break;
                    case 11:
                        obj2 = Long.valueOf(b1Var.mo31806l());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(b1Var.mo31818v());
                        break;
                    case 13:
                        obj2 = Long.valueOf(b1Var.mo31819w());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = b1Var.mo31784F();
                        break;
                    case 16:
                        obj2 = b1Var.mo31821y();
                        break;
                    case 17:
                        obj2 = b1Var.mo31822z(eVar.mo37994b().getClass(), pVar);
                        break;
                    case 18:
                        obj2 = b1Var.mo31802h(eVar.mo37994b().getClass(), pVar);
                        break;
                }
            } else {
                int H = b1Var.mo31786H();
                if (eVar.f15540b.mo37992d().mo32428a(H) == null) {
                    return C6915f1.m19829L(c, H, ub, j1Var);
                }
                obj2 = Integer.valueOf(H);
            }
            if (eVar.mo37996d()) {
                uVar.mo32355a(eVar.f15540b, obj2);
            } else {
                int i2 = C6982a.f13371a[eVar.mo37993a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = uVar.mo32361i(eVar.f15540b)) != null) {
                    obj2 = C6999y.m20714h(i, obj2);
                }
                uVar.mo32372x(eVar.f15540b, obj2);
            }
        } else {
            switch (C6982a.f13371a[eVar.mo37993a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    b1Var.mo31790L(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    b1Var.mo31785G(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    b1Var.mo31810p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    b1Var.mo31807m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    b1Var.mo31812r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    b1Var.mo31793O(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    b1Var.mo31817u(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    b1Var.mo31820x(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    b1Var.mo31800g(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    b1Var.mo31797d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    b1Var.mo31811q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    b1Var.mo31794a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    b1Var.mo31798e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    b1Var.mo31815s(arrayList);
                    ub = C6915f1.m19874z(c, arrayList, eVar.f15540b.mo37992d(), ub, j1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f15540b.mo32377l());
            }
            uVar.mo32372x(eVar.f15540b, arrayList);
        }
        return ub;
    }

    /* renamed from: h */
    public void mo32335h(C6890b1 b1Var, Object obj, C6975p pVar, C6988u<GeneratedMessageLite.C8429d> uVar) {
        GeneratedMessageLite.C8430e eVar = (GeneratedMessageLite.C8430e) obj;
        uVar.mo32372x(eVar.f15540b, b1Var.mo31802h(eVar.mo37994b().getClass(), pVar));
    }

    /* renamed from: i */
    public void mo32336i(ByteString byteString, Object obj, C6975p pVar, C6988u<GeneratedMessageLite.C8429d> uVar) {
        GeneratedMessageLite.C8430e eVar = (GeneratedMessageLite.C8430e) obj;
        C6954m0 D = eVar.mo37994b().mo32218h().mo32220D();
        C6909f P = C6909f.m19744P(ByteBuffer.wrap(byteString.toByteArray()), true);
        C7009y0.m20722a().mo32430b(D, P, pVar);
        uVar.mo32372x(eVar.f15540b, D);
        if (P.mo31779A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* renamed from: j */
    public void mo32337j(Writer writer, Map.Entry<?, ?> entry) {
        GeneratedMessageLite.C8429d dVar = (GeneratedMessageLite.C8429d) entry.getKey();
        if (dVar.mo32374f()) {
            switch (C6982a.f13371a[dVar.mo32377l().ordinal()]) {
                case 1:
                    C6915f1.m19833P(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 2:
                    C6915f1.m19837T(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 3:
                    C6915f1.m19840W(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 4:
                    C6915f1.m19853e0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 5:
                    C6915f1.m19839V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 6:
                    C6915f1.m19836S(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 7:
                    C6915f1.m19835R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 8:
                    C6915f1.m19831N(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 9:
                    C6915f1.m19851d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 10:
                    C6915f1.m19842Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 11:
                    C6915f1.m19843Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 12:
                    C6915f1.m19845a0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 13:
                    C6915f1.m19847b0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 14:
                    C6915f1.m19839V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 15:
                    C6915f1.m19832O(dVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    C6915f1.m19849c0(dVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C6915f1.m19838U(dVar.getNumber(), (List) entry.getValue(), writer, C7009y0.m20722a().mo32432d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C6915f1.m19841X(dVar.getNumber(), (List) entry.getValue(), writer, C7009y0.m20722a().mo32432d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C6982a.f13371a[dVar.mo32377l().ordinal()]) {
                case 1:
                    writer.mo32161g(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.mo32140G(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.mo32171q(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.mo32169o(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.mo32177w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.mo32165k(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.mo32160f(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.mo32172r(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.mo32158d(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.mo32174t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.mo32180z(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.mo32147N(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.mo32139F(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.mo32177w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.mo32176v(dVar.getNumber(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.mo32168n(dVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    writer.mo32173s(dVar.getNumber(), entry.getValue(), C7009y0.m20722a().mo32432d(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.mo32164j(dVar.getNumber(), entry.getValue(), C7009y0.m20722a().mo32432d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
