package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.PrintStream;
import java.util.Map;
import p040c.p325e0.p326a.p332c.C4264a;
import p040c.p325e0.p326a.p332c.C4265b;
import p040c.p325e0.p326a.p332c.C4266c;
import p040c.p325e0.p326a.p332c.C4267d;
import p040c.p325e0.p326a.p332c.C4268e;

/* renamed from: com.tencent.bugly.proguard.f */
/* compiled from: BUGLY */
public final class C8820f extends C8822k {

    /* renamed from: k */
    public static byte[] f17128k = null;

    /* renamed from: l */
    public static Map<String, String> f17129l = null;

    /* renamed from: m */
    public static /* synthetic */ boolean f17130m = (!C8820f.class.desiredAssertionStatus());

    /* renamed from: a */
    public short f17131a = 0;

    /* renamed from: b */
    public int f17132b = 0;

    /* renamed from: c */
    public String f17133c = null;

    /* renamed from: d */
    public String f17134d = null;

    /* renamed from: e */
    public byte[] f17135e;

    /* renamed from: f */
    public byte f17136f = 0;

    /* renamed from: g */
    public int f17137g = 0;

    /* renamed from: h */
    public int f17138h = 0;

    /* renamed from: i */
    public Map<String, String> f17139i;

    /* renamed from: j */
    public Map<String, String> f17140j;

    /* renamed from: a */
    public final void mo45954a(C4267d dVar) {
        dVar.mo25751f(this.f17131a, 1);
        throw null;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f17130m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C8820f fVar = (C8820f) obj;
        return C4268e.m11642a(1, fVar.f17131a) && C4268e.m11642a(1, fVar.f17136f) && C4268e.m11642a(1, fVar.f17137g) && C4268e.m11642a(1, fVar.f17132b) && C4268e.m11644c(1, fVar.f17133c) && C4268e.m11644c(1, fVar.f17134d) && C4268e.m11644c(1, fVar.f17135e) && C4268e.m11642a(1, fVar.f17138h) && C4268e.m11644c(1, fVar.f17139i) && C4268e.m11644c(1, fVar.f17140j);
    }

    /* renamed from: a */
    public final void mo45953a(C4266c cVar) {
        try {
            cVar.mo25743e(this.f17131a, 1, true);
            throw null;
        } catch (Exception e) {
            e.printStackTrace();
            PrintStream printStream = System.out;
            printStream.println("RequestPacket decode error " + C4264a.m11615a(this.f17135e));
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo45955a(StringBuilder sb, int i) {
        C4265b bVar = new C4265b(sb, i);
        bVar.mo25734h(this.f17131a, "iVersion");
        bVar.mo25727a(this.f17136f, "cPacketType");
        bVar.mo25728b(this.f17137g, "iMessageType");
        bVar.mo25728b(this.f17132b, "iRequestId");
        bVar.mo25732f(this.f17133c, "sServantName");
        bVar.mo25732f(this.f17134d, "sFuncName");
        bVar.mo25736j(this.f17135e, "sBuffer");
        bVar.mo25728b(this.f17138h, "iTimeout");
        bVar.mo25733g(this.f17139i, "context");
        bVar.mo25733g(this.f17140j, NotificationCompat.CATEGORY_STATUS);
    }
}
