package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9033n;

/* renamed from: f.a.d.b.i.i */
/* compiled from: RestorationChannel */
public class C8991i {

    /* renamed from: a */
    public final boolean f17657a;

    /* renamed from: b */
    public byte[] f17658b;

    /* renamed from: c */
    public C9017j f17659c;

    /* renamed from: d */
    public C9017j.C9022d f17660d;

    /* renamed from: e */
    public boolean f17661e;

    /* renamed from: f */
    public boolean f17662f;

    /* renamed from: g */
    public final C9017j.C9021c f17663g;

    /* renamed from: f.a.d.b.i.i$a */
    /* compiled from: RestorationChannel */
    public class C8992a implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f17664a;

        public C8992a(byte[] bArr) {
            this.f17664a = bArr;
        }

        public void error(String str, String str2, Object obj) {
            C8896b.m24030b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void notImplemented() {
        }

        public void success(Object obj) {
            byte[] unused = C8991i.this.f17658b = this.f17664a;
        }
    }

    /* renamed from: f.a.d.b.i.i$b */
    /* compiled from: RestorationChannel */
    public class C8993b implements C9017j.C9021c {
        public C8993b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(@androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9016i r5, @androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9017j.C9022d r6) {
            /*
                r4 = this;
                java.lang.String r0 = r5.f17687a
                java.lang.Object r5 = r5.f17688b
                int r1 = r0.hashCode()
                r2 = 102230(0x18f56, float:1.43255E-40)
                r3 = 1
                if (r1 == r2) goto L_0x001e
                r2 = 111375(0x1b30f, float:1.5607E-40)
                if (r1 == r2) goto L_0x0014
                goto L_0x0028
            L_0x0014:
                java.lang.String r1 = "put"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0028
                r0 = 0
                goto L_0x0029
            L_0x001e:
                java.lang.String r1 = "get"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0028
                r0 = r3
                goto L_0x0029
            L_0x0028:
                r0 = -1
            L_0x0029:
                if (r0 == 0) goto L_0x0057
                if (r0 == r3) goto L_0x0031
                r6.notImplemented()
                goto L_0x0062
            L_0x0031:
                f.a.d.b.i.i r5 = p553f.p554a.p556d.p558b.p569i.C8991i.this
                boolean unused = r5.f17662f = r3
                f.a.d.b.i.i r5 = p553f.p554a.p556d.p558b.p569i.C8991i.this
                boolean r5 = r5.f17661e
                if (r5 != 0) goto L_0x0049
                f.a.d.b.i.i r5 = p553f.p554a.p556d.p558b.p569i.C8991i.this
                boolean r0 = r5.f17657a
                if (r0 != 0) goto L_0x0045
                goto L_0x0049
            L_0x0045:
                p553f.p554a.p570e.p571a.C9017j.C9022d unused = r5.f17660d = r6
                goto L_0x0062
            L_0x0049:
                f.a.d.b.i.i r5 = p553f.p554a.p556d.p558b.p569i.C8991i.this
                byte[] r0 = r5.f17658b
                java.util.Map r5 = r5.mo46549i(r0)
                r6.success(r5)
                goto L_0x0062
            L_0x0057:
                f.a.d.b.i.i r0 = p553f.p554a.p556d.p558b.p569i.C8991i.this
                byte[] r5 = (byte[]) r5
                byte[] unused = r0.f17658b = r5
                r5 = 0
                r6.success(r5)
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p556d.p558b.p569i.C8991i.C8993b.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
        }
    }

    public C8991i(@NonNull C8928a aVar, @NonNull boolean z) {
        this(new C9017j(aVar, "flutter/restoration", C9033n.f17701b), z);
    }

    /* renamed from: g */
    public void mo46547g() {
        this.f17658b = null;
    }

    /* renamed from: h */
    public byte[] mo46548h() {
        return this.f17658b;
    }

    /* renamed from: i */
    public final Map<String, Object> mo46549i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    /* renamed from: j */
    public void mo46550j(byte[] bArr) {
        this.f17661e = true;
        C9017j.C9022d dVar = this.f17660d;
        if (dVar != null) {
            dVar.success(mo46549i(bArr));
            this.f17660d = null;
            this.f17658b = bArr;
        } else if (this.f17662f) {
            this.f17659c.mo46574d("push", mo46549i(bArr), new C8992a(bArr));
        } else {
            this.f17658b = bArr;
        }
    }

    public C8991i(C9017j jVar, @NonNull boolean z) {
        this.f17661e = false;
        this.f17662f = false;
        C8993b bVar = new C8993b();
        this.f17663g = bVar;
        this.f17659c = jVar;
        this.f17657a = z;
        jVar.mo46575e(bVar);
    }
}
