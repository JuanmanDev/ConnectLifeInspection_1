package p040c.p200q.p201a.p202a.p203h.p204f;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p200q.p363c.p385q.C6709c;
import p040c.p200q.p363c.p385q.C6712d;
import p040c.p200q.p363c.p385q.C6713e;
import p040c.p200q.p363c.p385q.p386h.C6716a;
import p040c.p200q.p363c.p385q.p386h.C6717b;

/* renamed from: c.q.a.a.h.f.b */
/* compiled from: AutoBatchedLogRequestEncoder */
public final class C2365b implements C6716a {

    /* renamed from: a */
    public static final C6716a f2611a = new C2365b();

    /* renamed from: c.q.a.a.h.f.b$a */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C2366a implements C6712d<C2363a> {

        /* renamed from: a */
        public static final C2366a f2612a = new C2366a();

        /* renamed from: b */
        public static final C6709c f2613b = C6709c.m18982d("sdkVersion");

        /* renamed from: c */
        public static final C6709c f2614c = C6709c.m18982d("model");

        /* renamed from: d */
        public static final C6709c f2615d = C6709c.m18982d("hardware");

        /* renamed from: e */
        public static final C6709c f2616e = C6709c.m18982d(EventBusConstKt.DEVICE);

        /* renamed from: f */
        public static final C6709c f2617f = C6709c.m18982d("product");

        /* renamed from: g */
        public static final C6709c f2618g = C6709c.m18982d("osBuild");

        /* renamed from: h */
        public static final C6709c f2619h = C6709c.m18982d("manufacturer");

        /* renamed from: i */
        public static final C6709c f2620i = C6709c.m18982d("fingerprint");

        /* renamed from: j */
        public static final C6709c f2621j = C6709c.m18982d("locale");

        /* renamed from: k */
        public static final C6709c f2622k = C6709c.m18982d("country");

        /* renamed from: l */
        public static final C6709c f2623l = C6709c.m18982d("mccMnc");

        /* renamed from: m */
        public static final C6709c f2624m = C6709c.m18982d("applicationBuild");

        /* renamed from: b */
        public void mo17703a(C2363a aVar, C6713e eVar) {
            eVar.mo31346f(f2613b, aVar.mo17688m());
            eVar.mo31346f(f2614c, aVar.mo17685j());
            eVar.mo31346f(f2615d, aVar.mo17681f());
            eVar.mo31346f(f2616e, aVar.mo17679d());
            eVar.mo31346f(f2617f, aVar.mo17687l());
            eVar.mo31346f(f2618g, aVar.mo17686k());
            eVar.mo31346f(f2619h, aVar.mo17683h());
            eVar.mo31346f(f2620i, aVar.mo17680e());
            eVar.mo31346f(f2621j, aVar.mo17682g());
            eVar.mo31346f(f2622k, aVar.mo17678c());
            eVar.mo31346f(f2623l, aVar.mo17684i());
            eVar.mo31346f(f2624m, aVar.mo17677b());
        }
    }

    /* renamed from: c.q.a.a.h.f.b$b */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C2367b implements C6712d<C2389j> {

        /* renamed from: a */
        public static final C2367b f2625a = new C2367b();

        /* renamed from: b */
        public static final C6709c f2626b = C6709c.m18982d("logRequest");

        /* renamed from: b */
        public void mo17703a(C2389j jVar, C6713e eVar) {
            eVar.mo31346f(f2626b, jVar.mo17713c());
        }
    }

    /* renamed from: c.q.a.a.h.f.b$c */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C2368c implements C6712d<ClientInfo> {

        /* renamed from: a */
        public static final C2368c f2627a = new C2368c();

        /* renamed from: b */
        public static final C6709c f2628b = C6709c.m18982d("clientType");

        /* renamed from: c */
        public static final C6709c f2629c = C6709c.m18982d("androidClientInfo");

        /* renamed from: b */
        public void mo17703a(ClientInfo clientInfo, C6713e eVar) {
            eVar.mo31346f(f2628b, clientInfo.mo17718c());
            eVar.mo31346f(f2629c, clientInfo.mo17717b());
        }
    }

    /* renamed from: c.q.a.a.h.f.b$d */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C2369d implements C6712d<C2390k> {

        /* renamed from: a */
        public static final C2369d f2630a = new C2369d();

        /* renamed from: b */
        public static final C6709c f2631b = C6709c.m18982d("eventTimeMs");

        /* renamed from: c */
        public static final C6709c f2632c = C6709c.m18982d("eventCode");

        /* renamed from: d */
        public static final C6709c f2633d = C6709c.m18982d("eventUptimeMs");

        /* renamed from: e */
        public static final C6709c f2634e = C6709c.m18982d("sourceExtension");

        /* renamed from: f */
        public static final C6709c f2635f = C6709c.m18982d("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final C6709c f2636g = C6709c.m18982d("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final C6709c f2637h = C6709c.m18982d("networkConnectionInfo");

        /* renamed from: b */
        public void mo17703a(C2390k kVar, C6713e eVar) {
            eVar.mo31344b(f2631b, kVar.mo17726c());
            eVar.mo31346f(f2632c, kVar.mo17725b());
            eVar.mo31344b(f2633d, kVar.mo17727d());
            eVar.mo31346f(f2634e, kVar.mo17730f());
            eVar.mo31346f(f2635f, kVar.mo17731g());
            eVar.mo31344b(f2636g, kVar.mo17732h());
            eVar.mo31346f(f2637h, kVar.mo17728e());
        }
    }

    /* renamed from: c.q.a.a.h.f.b$e */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C2370e implements C6712d<C2392l> {

        /* renamed from: a */
        public static final C2370e f2638a = new C2370e();

        /* renamed from: b */
        public static final C6709c f2639b = C6709c.m18982d("requestTimeMs");

        /* renamed from: c */
        public static final C6709c f2640c = C6709c.m18982d("requestUptimeMs");

        /* renamed from: d */
        public static final C6709c f2641d = C6709c.m18982d("clientInfo");

        /* renamed from: e */
        public static final C6709c f2642e = C6709c.m18982d("logSource");

        /* renamed from: f */
        public static final C6709c f2643f = C6709c.m18982d("logSourceName");

        /* renamed from: g */
        public static final C6709c f2644g = C6709c.m18982d("logEvent");

        /* renamed from: h */
        public static final C6709c f2645h = C6709c.m18982d("qosTier");

        /* renamed from: b */
        public void mo17703a(C2392l lVar, C6713e eVar) {
            eVar.mo31344b(f2639b, lVar.mo17749g());
            eVar.mo31344b(f2640c, lVar.mo17750h());
            eVar.mo31346f(f2641d, lVar.mo17743b());
            eVar.mo31346f(f2642e, lVar.mo17745d());
            eVar.mo31346f(f2643f, lVar.mo17746e());
            eVar.mo31346f(f2644g, lVar.mo17744c());
            eVar.mo31346f(f2645h, lVar.mo17748f());
        }
    }

    /* renamed from: c.q.a.a.h.f.b$f */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C2371f implements C6712d<NetworkConnectionInfo> {

        /* renamed from: a */
        public static final C2371f f2646a = new C2371f();

        /* renamed from: b */
        public static final C6709c f2647b = C6709c.m18982d("networkType");

        /* renamed from: c */
        public static final C6709c f2648c = C6709c.m18982d("mobileSubtype");

        /* renamed from: b */
        public void mo17703a(NetworkConnectionInfo networkConnectionInfo, C6713e eVar) {
            eVar.mo31346f(f2647b, networkConnectionInfo.mo17766c());
            eVar.mo31346f(f2648c, networkConnectionInfo.mo17765b());
        }
    }

    /* renamed from: a */
    public void mo17702a(C6717b<?> bVar) {
        bVar.mo31349a(C2389j.class, C2367b.f2625a);
        bVar.mo31349a(C2375d.class, C2367b.f2625a);
        bVar.mo31349a(C2392l.class, C2370e.f2638a);
        bVar.mo31349a(C2382g.class, C2370e.f2638a);
        bVar.mo31349a(ClientInfo.class, C2368c.f2627a);
        bVar.mo31349a(C2376e.class, C2368c.f2627a);
        bVar.mo31349a(C2363a.class, C2366a.f2612a);
        bVar.mo31349a(C2372c.class, C2366a.f2612a);
        bVar.mo31349a(C2390k.class, C2369d.f2630a);
        bVar.mo31349a(C2379f.class, C2369d.f2630a);
        bVar.mo31349a(NetworkConnectionInfo.class, C2371f.f2646a);
        bVar.mo31349a(C2386i.class, C2371f.f2646a);
    }
}
