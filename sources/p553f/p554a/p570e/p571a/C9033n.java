package p553f.p554a.p570e.p571a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p553f.p554a.p570e.p571a.C9031m;

/* renamed from: f.a.e.a.n */
/* compiled from: StandardMethodCodec */
public final class C9033n implements C9023k {

    /* renamed from: b */
    public static final C9033n f17701b = new C9033n(C9031m.f17698a);

    /* renamed from: a */
    public final C9031m f17702a;

    public C9033n(C9031m mVar) {
        this.f17702a = mVar;
    }

    /* renamed from: g */
    public static String m24445g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public C9016i mo46564a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = this.f17702a.mo46577f(byteBuffer);
        Object f2 = this.f17702a.mo46577f(byteBuffer);
        if ((f instanceof String) && !byteBuffer.hasRemaining()) {
            return new C9016i((String) f, f2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* renamed from: b */
    public ByteBuffer mo46565b(C9016i iVar) {
        C9031m.C9032a aVar = new C9031m.C9032a();
        this.f17702a.mo46579o(aVar, iVar.f17687a);
        this.f17702a.mo46579o(aVar, iVar.f17688b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo46580a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: c */
    public ByteBuffer mo46566c(Object obj) {
        C9031m.C9032a aVar = new C9031m.C9032a();
        aVar.write(0);
        this.f17702a.mo46579o(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo46580a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: d */
    public ByteBuffer mo46567d(String str, String str2, Object obj, String str3) {
        C9031m.C9032a aVar = new C9031m.C9032a();
        aVar.write(1);
        this.f17702a.mo46579o(aVar, str);
        this.f17702a.mo46579o(aVar, str2);
        if (obj instanceof Throwable) {
            this.f17702a.mo46579o(aVar, m24445g((Throwable) obj));
        } else {
            this.f17702a.mo46579o(aVar, obj);
        }
        this.f17702a.mo46579o(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo46580a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: e */
    public ByteBuffer mo46568e(String str, String str2, Object obj) {
        C9031m.C9032a aVar = new C9031m.C9032a();
        aVar.write(1);
        this.f17702a.mo46579o(aVar, str);
        this.f17702a.mo46579o(aVar, str2);
        if (obj instanceof Throwable) {
            this.f17702a.mo46579o(aVar, m24445g((Throwable) obj));
        } else {
            this.f17702a.mo46579o(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo46580a(), 0, aVar.size());
        return allocateDirect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo46569f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            f.a.e.a.m r0 = r4.f17702a
            java.lang.Object r0 = r0.mo46577f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            f.a.e.a.m r0 = r4.f17702a
            java.lang.Object r0 = r0.mo46577f(r5)
            f.a.e.a.m r1 = r4.f17702a
            java.lang.Object r1 = r1.mo46577f(r5)
            f.a.e.a.m r2 = r4.f17702a
            java.lang.Object r2 = r2.mo46577f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            io.flutter.plugin.common.FlutterException r5 = new io.flutter.plugin.common.FlutterException
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p570e.p571a.C9033n.mo46569f(java.nio.ByteBuffer):java.lang.Object");
    }
}
