package com.gigya.android.sdk.network.adapter;

import p040c.p151o.p152a.p153a.p156j.C2123c;
import p040c.p151o.p152a.p153a.p164n.p165c.C2150a;
import p040c.p151o.p152a.p153a.p164n.p165c.C2151b;
import p040c.p151o.p152a.p153a.p164n.p165c.C2152c;

public class RestAdapter implements C2150a {

    /* renamed from: b */
    public static final int f7201b = HttpMethod.GET.intValue();

    /* renamed from: c */
    public static final int f7202c = HttpMethod.POST.intValue();

    /* renamed from: a */
    public C2152c f7203a;

    public enum HttpMethod {
        GET(0),
        POST(1);
        
        public final int method;

        /* access modifiers changed from: public */
        HttpMethod(int i) {
            this.method = i;
        }

        public static HttpMethod fromInt(int i) {
            if (i == 1) {
                return POST;
            }
            return GET;
        }

        public int intValue() {
            return this.method;
        }
    }

    /* renamed from: a */
    public void mo16957a(C2123c cVar, C2151b bVar) {
        this.f7203a.mo16960b(cVar, bVar);
    }

    /* renamed from: b */
    public void mo16958b(C2123c cVar, boolean z, C2151b bVar) {
        if (z) {
            mo23411c(cVar, bVar);
        } else {
            this.f7203a.mo16959a(cVar, bVar);
        }
    }

    /* renamed from: c */
    public void mo23411c(C2123c cVar, C2151b bVar) {
        this.f7203a.mo16961c(cVar, bVar);
    }
}
