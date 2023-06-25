package p553f.p554a.p576f.p586h;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.HashMap;
import p553f.p554a.p570e.p571a.C8996b;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9031m;

/* renamed from: f.a.f.h.c */
/* compiled from: Messages */
public class C9120c {

    /* renamed from: f.a.f.h.c$a */
    /* compiled from: Messages */
    public static class C9121a {

        /* renamed from: a */
        public String f17879a;

        /* renamed from: b */
        public String f17880b;

        /* renamed from: c */
        public String f17881c;

        /* renamed from: d */
        public String f17882d;

        /* renamed from: a */
        public static C9121a m24728a(HashMap hashMap) {
            C9121a aVar = new C9121a();
            aVar.f17879a = (String) hashMap.get("asset");
            aVar.f17880b = (String) hashMap.get("uri");
            aVar.f17881c = (String) hashMap.get("packageName");
            aVar.f17882d = (String) hashMap.get("formatHint");
            return aVar;
        }

        /* renamed from: b */
        public String mo46838b() {
            return this.f17879a;
        }

        /* renamed from: c */
        public String mo46839c() {
            return this.f17882d;
        }

        /* renamed from: d */
        public String mo46840d() {
            return this.f17881c;
        }

        /* renamed from: e */
        public String mo46841e() {
            return this.f17880b;
        }
    }

    /* renamed from: f.a.f.h.c$b */
    /* compiled from: Messages */
    public static class C9122b {

        /* renamed from: a */
        public Long f17883a;

        /* renamed from: b */
        public Boolean f17884b;

        /* renamed from: a */
        public static C9122b m24733a(HashMap hashMap) {
            long j;
            C9122b bVar = new C9122b();
            if (hashMap.get("textureId") instanceof Integer) {
                j = (long) ((Integer) hashMap.get("textureId")).intValue();
            } else {
                j = ((Long) hashMap.get("textureId")).longValue();
            }
            bVar.f17883a = Long.valueOf(j);
            bVar.f17884b = (Boolean) hashMap.get("isLooping");
            return bVar;
        }

        /* renamed from: b */
        public Boolean mo46842b() {
            return this.f17884b;
        }

        /* renamed from: c */
        public Long mo46843c() {
            return this.f17883a;
        }
    }

    /* renamed from: f.a.f.h.c$c */
    /* compiled from: Messages */
    public static class C9123c {

        /* renamed from: a */
        public Boolean f17885a;

        /* renamed from: a */
        public static C9123c m24736a(HashMap hashMap) {
            C9123c cVar = new C9123c();
            cVar.f17885a = (Boolean) hashMap.get("mixWithOthers");
            return cVar;
        }

        /* renamed from: b */
        public Boolean mo46844b() {
            return this.f17885a;
        }
    }

    /* renamed from: f.a.f.h.c$d */
    /* compiled from: Messages */
    public static class C9124d {

        /* renamed from: a */
        public Long f17886a;

        /* renamed from: b */
        public Long f17887b;

        /* renamed from: a */
        public static C9124d m24738a(HashMap hashMap) {
            long j;
            long j2;
            C9124d dVar = new C9124d();
            if (hashMap.get("textureId") instanceof Integer) {
                j = (long) ((Integer) hashMap.get("textureId")).intValue();
            } else {
                j = ((Long) hashMap.get("textureId")).longValue();
            }
            dVar.f17886a = Long.valueOf(j);
            if (hashMap.get("position") instanceof Integer) {
                j2 = (long) ((Integer) hashMap.get("position")).intValue();
            } else {
                j2 = ((Long) hashMap.get("position")).longValue();
            }
            dVar.f17887b = Long.valueOf(j2);
            return dVar;
        }

        /* renamed from: b */
        public Long mo46845b() {
            return this.f17887b;
        }

        /* renamed from: c */
        public Long mo46846c() {
            return this.f17886a;
        }

        /* renamed from: d */
        public void mo46847d(Long l) {
            this.f17887b = l;
        }

        /* renamed from: e */
        public HashMap mo46848e() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f17886a);
            hashMap.put("position", this.f17887b);
            return hashMap;
        }
    }

    /* renamed from: f.a.f.h.c$e */
    /* compiled from: Messages */
    public static class C9125e {

        /* renamed from: a */
        public Long f17888a;

        /* renamed from: a */
        public static C9125e m24743a(HashMap hashMap) {
            long j;
            C9125e eVar = new C9125e();
            if (hashMap.get("textureId") instanceof Integer) {
                j = (long) ((Integer) hashMap.get("textureId")).intValue();
            } else {
                j = ((Long) hashMap.get("textureId")).longValue();
            }
            eVar.f17888a = Long.valueOf(j);
            return eVar;
        }

        /* renamed from: b */
        public Long mo46849b() {
            return this.f17888a;
        }

        /* renamed from: c */
        public void mo46850c(Long l) {
            this.f17888a = l;
        }

        /* renamed from: d */
        public HashMap mo46851d() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f17888a);
            return hashMap;
        }
    }

    /* renamed from: f.a.f.h.c$f */
    /* compiled from: Messages */
    public interface C9126f {

        /* renamed from: f.a.f.h.c$f$a */
        /* compiled from: Messages */
        public class C9127a implements C8996b.C9001d<Object> {
            public C9127a() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9123c a = C9123c.m24736a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46858h(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$b */
        /* compiled from: Messages */
        public class C9128b implements C8996b.C9001d<Object> {
            public C9128b() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46852a();
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$c */
        /* compiled from: Messages */
        public class C9129c implements C8996b.C9001d<Object> {
            public C9129c() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9121a a = C9121a.m24728a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, C9126f.this.mo46856f(a).mo46851d());
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$d */
        /* compiled from: Messages */
        public class C9130d implements C8996b.C9001d<Object> {
            public C9130d() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9125e a = C9125e.m24743a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46855d(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$e */
        /* compiled from: Messages */
        public class C9131e implements C8996b.C9001d<Object> {
            public C9131e() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9122b a = C9122b.m24733a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46853b(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$f */
        /* compiled from: Messages */
        public class C9132f implements C8996b.C9001d<Object> {
            public C9132f() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9137g a = C9137g.m24768a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46857g(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$g */
        /* compiled from: Messages */
        public class C9133g implements C8996b.C9001d<Object> {
            public C9133g() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9125e a = C9125e.m24743a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46860j(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$h */
        /* compiled from: Messages */
        public class C9134h implements C8996b.C9001d<Object> {
            public C9134h() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9125e a = C9125e.m24743a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, C9126f.this.mo46854c(a).mo46848e());
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$i */
        /* compiled from: Messages */
        public class C9135i implements C8996b.C9001d<Object> {
            public C9135i() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9124d a = C9124d.m24738a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46859i(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: f.a.f.h.c$f$j */
        /* compiled from: Messages */
        public class C9136j implements C8996b.C9001d<Object> {
            public C9136j() {
            }

            /* renamed from: a */
            public void mo46510a(Object obj, C8996b.C9002e<Object> eVar) {
                C9125e a = C9125e.m24743a((HashMap) obj);
                HashMap hashMap = new HashMap();
                try {
                    C9126f.this.mo46861k(a);
                    hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
                } catch (Exception e) {
                    hashMap.put("error", C9120c.m24727b(e));
                }
                eVar.mo46503a(hashMap);
            }
        }

        /* renamed from: e */
        static void m24747e(C9003c cVar, C9126f fVar) {
            C8996b bVar = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.initialize", new C9031m());
            if (fVar != null) {
                bVar.mo46555e(new C9128b());
            } else {
                bVar.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar2 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.create", new C9031m());
            if (fVar != null) {
                bVar2.mo46555e(new C9129c());
            } else {
                bVar2.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar3 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.dispose", new C9031m());
            if (fVar != null) {
                bVar3.mo46555e(new C9130d());
            } else {
                bVar3.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar4 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.setLooping", new C9031m());
            if (fVar != null) {
                bVar4.mo46555e(new C9131e());
            } else {
                bVar4.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar5 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.setVolume", new C9031m());
            if (fVar != null) {
                bVar5.mo46555e(new C9132f());
            } else {
                bVar5.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar6 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.play", new C9031m());
            if (fVar != null) {
                bVar6.mo46555e(new C9133g());
            } else {
                bVar6.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar7 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.position", new C9031m());
            if (fVar != null) {
                bVar7.mo46555e(new C9134h());
            } else {
                bVar7.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar8 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.seekTo", new C9031m());
            if (fVar != null) {
                bVar8.mo46555e(new C9135i());
            } else {
                bVar8.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar9 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.pause", new C9031m());
            if (fVar != null) {
                bVar9.mo46555e(new C9136j());
            } else {
                bVar9.mo46555e((C8996b.C9001d) null);
            }
            C8996b bVar10 = new C8996b(cVar, "dev.flutter.pigeon.VideoPlayerApi.setMixWithOthers", new C9031m());
            if (fVar != null) {
                bVar10.mo46555e(new C9127a());
            } else {
                bVar10.mo46555e((C8996b.C9001d) null);
            }
        }

        /* renamed from: a */
        void mo46852a();

        /* renamed from: b */
        void mo46853b(C9122b bVar);

        /* renamed from: c */
        C9124d mo46854c(C9125e eVar);

        /* renamed from: d */
        void mo46855d(C9125e eVar);

        /* renamed from: f */
        C9125e mo46856f(C9121a aVar);

        /* renamed from: g */
        void mo46857g(C9137g gVar);

        /* renamed from: h */
        void mo46858h(C9123c cVar);

        /* renamed from: i */
        void mo46859i(C9124d dVar);

        /* renamed from: j */
        void mo46860j(C9125e eVar);

        /* renamed from: k */
        void mo46861k(C9125e eVar);
    }

    /* renamed from: f.a.f.h.c$g */
    /* compiled from: Messages */
    public static class C9137g {

        /* renamed from: a */
        public Long f17899a;

        /* renamed from: b */
        public Double f17900b;

        /* renamed from: a */
        public static C9137g m24768a(HashMap hashMap) {
            long j;
            C9137g gVar = new C9137g();
            if (hashMap.get("textureId") instanceof Integer) {
                j = (long) ((Integer) hashMap.get("textureId")).intValue();
            } else {
                j = ((Long) hashMap.get("textureId")).longValue();
            }
            gVar.f17899a = Long.valueOf(j);
            gVar.f17900b = (Double) hashMap.get("volume");
            return gVar;
        }

        /* renamed from: b */
        public Long mo46862b() {
            return this.f17899a;
        }

        /* renamed from: c */
        public Double mo46863c() {
            return this.f17900b;
        }
    }

    /* renamed from: b */
    public static HashMap m24727b(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", exc.toString());
        hashMap.put("code", (Object) null);
        hashMap.put("details", (Object) null);
        return hashMap;
    }
}
