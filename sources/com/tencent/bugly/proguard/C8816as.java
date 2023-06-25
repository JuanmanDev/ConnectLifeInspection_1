package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
import p040c.p325e0.p326a.p332c.C4265b;
import p040c.p325e0.p326a.p332c.C4266c;
import p040c.p325e0.p326a.p332c.C4267d;
import p040c.p325e0.p326a.p332c.C4268e;

/* renamed from: com.tencent.bugly.proguard.as */
/* compiled from: BUGLY */
public final class C8816as extends C8822k implements Cloneable {

    /* renamed from: m */
    public static C8815ar f17097m = new C8815ar();

    /* renamed from: n */
    public static Map<String, String> f17098n;

    /* renamed from: o */
    public static /* synthetic */ boolean f17099o = (!C8816as.class.desiredAssertionStatus());

    /* renamed from: a */
    public boolean f17100a = true;

    /* renamed from: b */
    public boolean f17101b = true;

    /* renamed from: c */
    public boolean f17102c = true;

    /* renamed from: d */
    public String f17103d = "";

    /* renamed from: e */
    public String f17104e = "";

    /* renamed from: f */
    public C8815ar f17105f = null;

    /* renamed from: g */
    public Map<String, String> f17106g = null;

    /* renamed from: h */
    public long f17107h = 0;

    /* renamed from: i */
    public int f17108i = 0;

    /* renamed from: j */
    public String f17109j = "";

    /* renamed from: k */
    public String f17110k = "";

    /* renamed from: l */
    public int f17111l = 0;

    static {
        HashMap hashMap = new HashMap();
        f17098n = hashMap;
        hashMap.put("", "");
    }

    /* renamed from: a */
    public final void mo45954a(C4267d dVar) {
        dVar.mo25752g(this.f17100a, 0);
        throw null;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f17099o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C8816as asVar = (C8816as) obj;
        if (!C4268e.m11645d(this.f17100a, asVar.f17100a) || !C4268e.m11645d(this.f17101b, asVar.f17101b) || !C4268e.m11645d(this.f17102c, asVar.f17102c) || !C4268e.m11644c(this.f17103d, asVar.f17103d) || !C4268e.m11644c(this.f17104e, asVar.f17104e) || !C4268e.m11644c(this.f17105f, asVar.f17105f) || !C4268e.m11644c(this.f17106g, asVar.f17106g) || !C4268e.m11643b(this.f17107h, asVar.f17107h) || !C4268e.m11644c(this.f17109j, asVar.f17109j) || !C4268e.m11644c(this.f17110k, asVar.f17110k) || !C4268e.m11642a(this.f17111l, asVar.f17111l) || !C4268e.m11642a(this.f17108i, asVar.f17108i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo45953a(C4266c cVar) {
        cVar.mo25744f(0, true);
        throw null;
    }

    /* renamed from: a */
    public final void mo45955a(StringBuilder sb, int i) {
        C4265b bVar = new C4265b(sb, i);
        bVar.mo25735i(this.f17100a, "enable");
        bVar.mo25735i(this.f17101b, "enableUserInfo");
        bVar.mo25735i(this.f17102c, "enableQuery");
        bVar.mo25732f(this.f17103d, "url");
        bVar.mo25732f(this.f17104e, "expUrl");
        bVar.mo25730d(this.f17105f, "security");
        bVar.mo25733g(this.f17106g, "valueMap");
        bVar.mo25729c(this.f17107h, "strategylastUpdateTime");
        bVar.mo25732f(this.f17109j, "httpsUrl");
        bVar.mo25732f(this.f17110k, "httpsExpUrl");
        bVar.mo25728b(this.f17111l, "eventRecordCount");
        bVar.mo25728b(this.f17108i, "eventTimeInterval");
    }
}
