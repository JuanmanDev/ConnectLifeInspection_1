package p648m.p660d.p664i;

import java.nio.ByteBuffer;
import org.java_websocket.enums.Opcode;
import p648m.p660d.p667l.C9682b;

/* renamed from: m.d.i.g */
/* compiled from: FramedataImpl1 */
public abstract class C9664g implements C9663f {

    /* renamed from: a */
    public boolean f18932a = true;

    /* renamed from: b */
    public Opcode f18933b;

    /* renamed from: c */
    public ByteBuffer f18934c = C9682b.m26144a();

    /* renamed from: d */
    public boolean f18935d = false;

    /* renamed from: e */
    public boolean f18936e = false;

    /* renamed from: f */
    public boolean f18937f = false;

    /* renamed from: g */
    public boolean f18938g = false;

    /* renamed from: m.d.i.g$a */
    /* compiled from: FramedataImpl1 */
    public static /* synthetic */ class C9665a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18939a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.java_websocket.enums.Opcode[] r0 = org.java_websocket.enums.Opcode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18939a = r0
                org.java_websocket.enums.Opcode r1 = org.java_websocket.enums.Opcode.PING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18939a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.java_websocket.enums.Opcode r1 = org.java_websocket.enums.Opcode.PONG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18939a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.java_websocket.enums.Opcode r1 = org.java_websocket.enums.Opcode.TEXT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18939a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.java_websocket.enums.Opcode r1 = org.java_websocket.enums.Opcode.BINARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18939a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.java_websocket.enums.Opcode r1 = org.java_websocket.enums.Opcode.CLOSING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18939a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.java_websocket.enums.Opcode r1 = org.java_websocket.enums.Opcode.CONTINUOUS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p648m.p660d.p664i.C9664g.C9665a.<clinit>():void");
        }
    }

    public C9664g(Opcode opcode) {
        this.f18933b = opcode;
    }

    /* renamed from: g */
    public static C9664g m26092g(Opcode opcode) {
        if (opcode != null) {
            switch (C9665a.f18939a[opcode.ordinal()]) {
                case 1:
                    return new C9666h();
                case 2:
                    return new C9667i();
                case 3:
                    return new C9668j();
                case 4:
                    return new C9658a();
                case 5:
                    return new C9659b();
                case 6:
                    return new C9660c();
                default:
                    throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        } else {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
    }

    /* renamed from: a */
    public boolean mo50484a() {
        return this.f18936e;
    }

    /* renamed from: b */
    public boolean mo50485b() {
        return this.f18937f;
    }

    /* renamed from: c */
    public Opcode mo50486c() {
        return this.f18933b;
    }

    /* renamed from: d */
    public boolean mo50487d() {
        return this.f18938g;
    }

    /* renamed from: e */
    public boolean mo50488e() {
        return this.f18932a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9664g gVar = (C9664g) obj;
        if (this.f18932a != gVar.f18932a || this.f18935d != gVar.f18935d || this.f18936e != gVar.f18936e || this.f18937f != gVar.f18937f || this.f18938g != gVar.f18938g || this.f18933b != gVar.f18933b) {
            return false;
        }
        ByteBuffer byteBuffer = this.f18934c;
        ByteBuffer byteBuffer2 = gVar.f18934c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        if (byteBuffer2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo50473f() {
        return this.f18934c;
    }

    /* renamed from: h */
    public abstract void mo50474h();

    public int hashCode() {
        int hashCode = (((this.f18932a ? 1 : 0) * true) + this.f18933b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f18934c;
        return ((((((((hashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f18935d ? 1 : 0)) * 31) + (this.f18936e ? 1 : 0)) * 31) + (this.f18937f ? 1 : 0)) * 31) + (this.f18938g ? 1 : 0);
    }

    /* renamed from: i */
    public void mo50489i(boolean z) {
        this.f18932a = z;
    }

    /* renamed from: j */
    public void mo50476j(ByteBuffer byteBuffer) {
        this.f18934c = byteBuffer;
    }

    /* renamed from: k */
    public void mo50490k(boolean z) {
        this.f18936e = z;
    }

    /* renamed from: l */
    public void mo50491l(boolean z) {
        this.f18937f = z;
    }

    /* renamed from: m */
    public void mo50492m(boolean z) {
        this.f18938g = z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ opcode:");
        sb.append(mo50486c());
        sb.append(", fin:");
        sb.append(mo50488e());
        sb.append(", rsv1:");
        sb.append(mo50484a());
        sb.append(", rsv2:");
        sb.append(mo50485b());
        sb.append(", rsv3:");
        sb.append(mo50487d());
        sb.append(", payload length:[pos:");
        sb.append(this.f18934c.position());
        sb.append(", len:");
        sb.append(this.f18934c.remaining());
        sb.append("], payload:");
        if (this.f18934c.remaining() > 1000) {
            str = "(too big to display)";
        } else {
            str = new String(this.f18934c.array());
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
