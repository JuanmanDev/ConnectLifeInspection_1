package com.tencent.bugly.proguard;

import java.io.Serializable;
import p040c.p325e0.p326a.p332c.C4266c;
import p040c.p325e0.p326a.p332c.C4267d;

/* renamed from: com.tencent.bugly.proguard.k */
/* compiled from: BUGLY */
public abstract class C8822k implements Serializable {
    /* renamed from: a */
    public abstract void mo45953a(C4266c cVar);

    /* renamed from: a */
    public abstract void mo45954a(C4267d dVar);

    /* renamed from: a */
    public abstract void mo45955a(StringBuilder sb, int i);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo45955a(sb, 0);
        return sb.toString();
    }
}
