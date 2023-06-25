package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.test.internal.runner.RunnerArgs;
import com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p200q.p363c.p385q.C6709c;
import p040c.p200q.p363c.p385q.C6712d;
import p040c.p200q.p363c.p385q.C6713e;
import p040c.p200q.p363c.p385q.p386h.C6716a;
import p040c.p200q.p363c.p385q.p386h.C6717b;

/* renamed from: c.q.c.n.h.l.a */
/* compiled from: AutoCrashlyticsReportEncoder */
public final class C6569a implements C6716a {

    /* renamed from: a */
    public static final C6716a f12404a = new C6569a();

    /* renamed from: c.q.c.n.h.l.a$a */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6570a implements C6712d<CrashlyticsReport.C8251a> {

        /* renamed from: a */
        public static final C6570a f12405a = new C6570a();

        /* renamed from: b */
        public static final C6709c f12406b = C6709c.m18982d("pid");

        /* renamed from: c */
        public static final C6709c f12407c = C6709c.m18982d("processName");

        /* renamed from: d */
        public static final C6709c f12408d = C6709c.m18982d("reasonCode");

        /* renamed from: e */
        public static final C6709c f12409e = C6709c.m18982d("importance");

        /* renamed from: f */
        public static final C6709c f12410f = C6709c.m18982d("pss");

        /* renamed from: g */
        public static final C6709c f12411g = C6709c.m18982d("rss");

        /* renamed from: h */
        public static final C6709c f12412h = C6709c.m18982d(NotificationCompat.CarExtender.KEY_TIMESTAMP);

        /* renamed from: i */
        public static final C6709c f12413i = C6709c.m18982d("traceFile");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8251a aVar, C6713e eVar) {
            eVar.mo31345c(f12406b, aVar.mo30977c());
            eVar.mo31346f(f12407c, aVar.mo30978d());
            eVar.mo31345c(f12408d, aVar.mo30981f());
            eVar.mo31345c(f12409e, aVar.mo30976b());
            eVar.mo31344b(f12410f, aVar.mo30979e());
            eVar.mo31344b(f12411g, aVar.mo30982g());
            eVar.mo31344b(f12412h, aVar.mo30983h());
            eVar.mo31346f(f12413i, aVar.mo30985i());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$b */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6571b implements C6712d<CrashlyticsReport.C8254c> {

        /* renamed from: a */
        public static final C6571b f12414a = new C6571b();

        /* renamed from: b */
        public static final C6709c f12415b = C6709c.m18982d(Person.KEY_KEY);

        /* renamed from: c */
        public static final C6709c f12416c = C6709c.m18982d("value");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8254c cVar, C6713e eVar) {
            eVar.mo31346f(f12415b, cVar.mo31001b());
            eVar.mo31346f(f12416c, cVar.mo31002c());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$c */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6572c implements C6712d<CrashlyticsReport> {

        /* renamed from: a */
        public static final C6572c f12417a = new C6572c();

        /* renamed from: b */
        public static final C6709c f12418b = C6709c.m18982d("sdkVersion");

        /* renamed from: c */
        public static final C6709c f12419c = C6709c.m18982d("gmpAppId");

        /* renamed from: d */
        public static final C6709c f12420d = C6709c.m18982d("platform");

        /* renamed from: e */
        public static final C6709c f12421e = C6709c.m18982d("installationUuid");

        /* renamed from: f */
        public static final C6709c f12422f = C6709c.m18982d("buildVersion");

        /* renamed from: g */
        public static final C6709c f12423g = C6709c.m18982d("displayVersion");

        /* renamed from: h */
        public static final C6709c f12424h = C6709c.m18982d("session");

        /* renamed from: i */
        public static final C6709c f12425i = C6709c.m18982d("ndkPayload");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport crashlyticsReport, C6713e eVar) {
            eVar.mo31346f(f12418b, crashlyticsReport.mo30942i());
            eVar.mo31346f(f12419c, crashlyticsReport.mo30936e());
            eVar.mo31345c(f12420d, crashlyticsReport.mo30940h());
            eVar.mo31346f(f12421e, crashlyticsReport.mo30938f());
            eVar.mo31346f(f12422f, crashlyticsReport.mo30934c());
            eVar.mo31346f(f12423g, crashlyticsReport.mo30935d());
            eVar.mo31346f(f12424h, crashlyticsReport.mo30943j());
            eVar.mo31346f(f12425i, crashlyticsReport.mo30939g());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$d */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6573d implements C6712d<CrashlyticsReport.C8256d> {

        /* renamed from: a */
        public static final C6573d f12426a = new C6573d();

        /* renamed from: b */
        public static final C6709c f12427b = C6709c.m18982d(FilesDumperPlugin.NAME);

        /* renamed from: c */
        public static final C6709c f12428c = C6709c.m18982d("orgId");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8256d dVar, C6713e eVar) {
            eVar.mo31346f(f12427b, dVar.mo31009b());
            eVar.mo31346f(f12428c, dVar.mo31010c());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$e */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6574e implements C6712d<CrashlyticsReport.C8256d.C8258b> {

        /* renamed from: a */
        public static final C6574e f12429a = new C6574e();

        /* renamed from: b */
        public static final C6709c f12430b = C6709c.m18982d("filename");

        /* renamed from: c */
        public static final C6709c f12431c = C6709c.m18982d("contents");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8256d.C8258b bVar, C6713e eVar) {
            eVar.mo31346f(f12430b, bVar.mo31018c());
            eVar.mo31346f(f12431c, bVar.mo31017b());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$f */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6575f implements C6712d<CrashlyticsReport.C8260e.C8261a> {

        /* renamed from: a */
        public static final C6575f f12432a = new C6575f();

        /* renamed from: b */
        public static final C6709c f12433b = C6709c.m18982d("identifier");

        /* renamed from: c */
        public static final C6709c f12434c = C6709c.m18982d("version");

        /* renamed from: d */
        public static final C6709c f12435d = C6709c.m18982d("displayVersion");

        /* renamed from: e */
        public static final C6709c f12436e = C6709c.m18982d("organization");

        /* renamed from: f */
        public static final C6709c f12437f = C6709c.m18982d("installationUuid");

        /* renamed from: g */
        public static final C6709c f12438g = C6709c.m18982d("developmentPlatform");

        /* renamed from: h */
        public static final C6709c f12439h = C6709c.m18982d("developmentPlatformVersion");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8261a aVar, C6713e eVar) {
            eVar.mo31346f(f12433b, aVar.mo31055e());
            eVar.mo31346f(f12434c, aVar.mo31059h());
            eVar.mo31346f(f12435d, aVar.mo31054d());
            eVar.mo31346f(f12436e, aVar.mo31058g());
            eVar.mo31346f(f12437f, aVar.mo31057f());
            eVar.mo31346f(f12438g, aVar.mo31052b());
            eVar.mo31346f(f12439h, aVar.mo31053c());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$g */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6576g implements C6712d<CrashlyticsReport.C8260e.C8261a.C8263b> {

        /* renamed from: a */
        public static final C6576g f12440a = new C6576g();

        /* renamed from: b */
        public static final C6709c f12441b = C6709c.m18982d("clsId");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8261a.C8263b bVar, C6713e eVar) {
            eVar.mo31346f(f12441b, bVar.mo31069a());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$h */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6577h implements C6712d<CrashlyticsReport.C8260e.C8265c> {

        /* renamed from: a */
        public static final C6577h f12442a = new C6577h();

        /* renamed from: b */
        public static final C6709c f12443b = C6709c.m18982d("arch");

        /* renamed from: c */
        public static final C6709c f12444c = C6709c.m18982d("model");

        /* renamed from: d */
        public static final C6709c f12445d = C6709c.m18982d("cores");

        /* renamed from: e */
        public static final C6709c f12446e = C6709c.m18982d("ram");

        /* renamed from: f */
        public static final C6709c f12447f = C6709c.m18982d("diskSpace");

        /* renamed from: g */
        public static final C6709c f12448g = C6709c.m18982d("simulator");

        /* renamed from: h */
        public static final C6709c f12449h = C6709c.m18982d("state");

        /* renamed from: i */
        public static final C6709c f12450i = C6709c.m18982d("manufacturer");

        /* renamed from: j */
        public static final C6709c f12451j = C6709c.m18982d("modelClass");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8265c cVar, C6713e eVar) {
            eVar.mo31345c(f12443b, cVar.mo31073b());
            eVar.mo31346f(f12444c, cVar.mo31078f());
            eVar.mo31345c(f12445d, cVar.mo31074c());
            eVar.mo31344b(f12446e, cVar.mo31080h());
            eVar.mo31344b(f12447f, cVar.mo31075d());
            eVar.mo31343a(f12448g, cVar.mo31083j());
            eVar.mo31345c(f12449h, cVar.mo31082i());
            eVar.mo31346f(f12450i, cVar.mo31076e());
            eVar.mo31346f(f12451j, cVar.mo31079g());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$i */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6578i implements C6712d<CrashlyticsReport.C8260e> {

        /* renamed from: a */
        public static final C6578i f12452a = new C6578i();

        /* renamed from: b */
        public static final C6709c f12453b = C6709c.m18982d("generator");

        /* renamed from: c */
        public static final C6709c f12454c = C6709c.m18982d("identifier");

        /* renamed from: d */
        public static final C6709c f12455d = C6709c.m18982d("startedAt");

        /* renamed from: e */
        public static final C6709c f12456e = C6709c.m18982d("endedAt");

        /* renamed from: f */
        public static final C6709c f12457f = C6709c.m18982d("crashed");

        /* renamed from: g */
        public static final C6709c f12458g = C6709c.m18982d("app");

        /* renamed from: h */
        public static final C6709c f12459h = C6709c.m18982d("user");

        /* renamed from: i */
        public static final C6709c f12460i = C6709c.m18982d("os");

        /* renamed from: j */
        public static final C6709c f12461j = C6709c.m18982d(EventBusConstKt.DEVICE);

        /* renamed from: k */
        public static final C6709c f12462k = C6709c.m18982d("events");

        /* renamed from: l */
        public static final C6709c f12463l = C6709c.m18982d("generatorType");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e eVar, C6713e eVar2) {
            eVar2.mo31346f(f12453b, eVar.mo31030f());
            eVar2.mo31346f(f12454c, eVar.mo37428i());
            eVar2.mo31344b(f12455d, eVar.mo31035k());
            eVar2.mo31346f(f12456e, eVar.mo31027d());
            eVar2.mo31343a(f12457f, eVar.mo31037m());
            eVar2.mo31346f(f12458g, eVar.mo31025b());
            eVar2.mo31346f(f12459h, eVar.mo31036l());
            eVar2.mo31346f(f12460i, eVar.mo31034j());
            eVar2.mo31346f(f12461j, eVar.mo31026c());
            eVar2.mo31346f(f12462k, eVar.mo31028e());
            eVar2.mo31345c(f12463l, eVar.mo31031g());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$j */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6579j implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a> {

        /* renamed from: a */
        public static final C6579j f12464a = new C6579j();

        /* renamed from: b */
        public static final C6709c f12465b = C6709c.m18982d("execution");

        /* renamed from: c */
        public static final C6709c f12466c = C6709c.m18982d("customAttributes");

        /* renamed from: d */
        public static final C6709c f12467d = C6709c.m18982d("internalKeys");

        /* renamed from: e */
        public static final C6709c f12468e = C6709c.m18982d(NotificationCompat.WearableExtender.KEY_BACKGROUND);

        /* renamed from: f */
        public static final C6709c f12469f = C6709c.m18982d("uiOrientation");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a aVar, C6713e eVar) {
            eVar.mo31346f(f12465b, aVar.mo31112d());
            eVar.mo31346f(f12466c, aVar.mo31111c());
            eVar.mo31346f(f12467d, aVar.mo31113e());
            eVar.mo31346f(f12468e, aVar.mo31110b());
            eVar.mo31345c(f12469f, aVar.mo31115f());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$k */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6580k implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> {

        /* renamed from: a */
        public static final C6580k f12470a = new C6580k();

        /* renamed from: b */
        public static final C6709c f12471b = C6709c.m18982d("baseAddress");

        /* renamed from: c */
        public static final C6709c f12472c = C6709c.m18982d(RunnerArgs.ARGUMENT_TEST_SIZE);

        /* renamed from: d */
        public static final C6709c f12473d = C6709c.m18982d("name");

        /* renamed from: e */
        public static final C6709c f12474e = C6709c.m18982d("uuid");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a aVar, C6713e eVar) {
            eVar.mo31344b(f12471b, aVar.mo31139b());
            eVar.mo31344b(f12472c, aVar.mo31141d());
            eVar.mo31346f(f12473d, aVar.mo31140c());
            eVar.mo31346f(f12474e, aVar.mo37432f());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$l */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6581l implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b> {

        /* renamed from: a */
        public static final C6581l f12475a = new C6581l();

        /* renamed from: b */
        public static final C6709c f12476b = C6709c.m18982d("threads");

        /* renamed from: c */
        public static final C6709c f12477c = C6709c.m18982d("exception");

        /* renamed from: d */
        public static final C6709c f12478d = C6709c.m18982d("appExitInfo");

        /* renamed from: e */
        public static final C6709c f12479e = C6709c.m18982d("signal");

        /* renamed from: f */
        public static final C6709c f12480f = C6709c.m18982d("binaries");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b bVar, C6713e eVar) {
            eVar.mo31346f(f12476b, bVar.mo31130f());
            eVar.mo31346f(f12477c, bVar.mo31127d());
            eVar.mo31346f(f12478d, bVar.mo31125b());
            eVar.mo31346f(f12479e, bVar.mo31128e());
            eVar.mo31346f(f12480f, bVar.mo31126c());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$m */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6582m implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c> {

        /* renamed from: a */
        public static final C6582m f12481a = new C6582m();

        /* renamed from: b */
        public static final C6709c f12482b = C6709c.m18982d("type");

        /* renamed from: c */
        public static final C6709c f12483c = C6709c.m18982d("reason");

        /* renamed from: d */
        public static final C6709c f12484d = C6709c.m18982d("frames");

        /* renamed from: e */
        public static final C6709c f12485e = C6709c.m18982d("causedBy");

        /* renamed from: f */
        public static final C6709c f12486f = C6709c.m18982d("overflowCount");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c cVar, C6713e eVar) {
            eVar.mo31346f(f12482b, cVar.mo31156f());
            eVar.mo31346f(f12483c, cVar.mo31154e());
            eVar.mo31346f(f12484d, cVar.mo31152c());
            eVar.mo31346f(f12485e, cVar.mo31151b());
            eVar.mo31345c(f12486f, cVar.mo31153d());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$n */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6583n implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d> {

        /* renamed from: a */
        public static final C6583n f12487a = new C6583n();

        /* renamed from: b */
        public static final C6709c f12488b = C6709c.m18982d("name");

        /* renamed from: c */
        public static final C6709c f12489c = C6709c.m18982d("code");

        /* renamed from: d */
        public static final C6709c f12490d = C6709c.m18982d("address");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d dVar, C6713e eVar) {
            eVar.mo31346f(f12488b, dVar.mo31167d());
            eVar.mo31346f(f12489c, dVar.mo31166c());
            eVar.mo31344b(f12490d, dVar.mo31165b());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$o */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6584o implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> {

        /* renamed from: a */
        public static final C6584o f12491a = new C6584o();

        /* renamed from: b */
        public static final C6709c f12492b = C6709c.m18982d("name");

        /* renamed from: c */
        public static final C6709c f12493c = C6709c.m18982d("importance");

        /* renamed from: d */
        public static final C6709c f12494d = C6709c.m18982d("frames");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e eVar, C6713e eVar2) {
            eVar2.mo31346f(f12492b, eVar.mo31177d());
            eVar2.mo31345c(f12493c, eVar.mo31176c());
            eVar2.mo31346f(f12494d, eVar.mo31175b());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$p */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6585p implements C6712d<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> {

        /* renamed from: a */
        public static final C6585p f12495a = new C6585p();

        /* renamed from: b */
        public static final C6709c f12496b = C6709c.m18982d("pc");

        /* renamed from: c */
        public static final C6709c f12497c = C6709c.m18982d("symbol");

        /* renamed from: d */
        public static final C6709c f12498d = C6709c.m18982d("file");

        /* renamed from: e */
        public static final C6709c f12499e = C6709c.m18982d("offset");

        /* renamed from: f */
        public static final C6709c f12500f = C6709c.m18982d("importance");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b bVar, C6713e eVar) {
            eVar.mo31344b(f12496b, bVar.mo31188e());
            eVar.mo31346f(f12497c, bVar.mo31190f());
            eVar.mo31346f(f12498d, bVar.mo31185b());
            eVar.mo31344b(f12499e, bVar.mo31187d());
            eVar.mo31345c(f12500f, bVar.mo31186c());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$q */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6586q implements C6712d<CrashlyticsReport.C8260e.C8267d.C8283c> {

        /* renamed from: a */
        public static final C6586q f12501a = new C6586q();

        /* renamed from: b */
        public static final C6709c f12502b = C6709c.m18982d("batteryLevel");

        /* renamed from: c */
        public static final C6709c f12503c = C6709c.m18982d("batteryVelocity");

        /* renamed from: d */
        public static final C6709c f12504d = C6709c.m18982d("proximityOn");

        /* renamed from: e */
        public static final C6709c f12505e = C6709c.m18982d("orientation");

        /* renamed from: f */
        public static final C6709c f12506f = C6709c.m18982d("ramUsed");

        /* renamed from: g */
        public static final C6709c f12507g = C6709c.m18982d("diskUsed");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8283c cVar, C6713e eVar) {
            eVar.mo31346f(f12502b, cVar.mo31199b());
            eVar.mo31345c(f12503c, cVar.mo31200c());
            eVar.mo31343a(f12504d, cVar.mo31205g());
            eVar.mo31345c(f12505e, cVar.mo31202e());
            eVar.mo31344b(f12506f, cVar.mo31204f());
            eVar.mo31344b(f12507g, cVar.mo31201d());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$r */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6587r implements C6712d<CrashlyticsReport.C8260e.C8267d> {

        /* renamed from: a */
        public static final C6587r f12508a = new C6587r();

        /* renamed from: b */
        public static final C6709c f12509b = C6709c.m18982d(NotificationCompat.CarExtender.KEY_TIMESTAMP);

        /* renamed from: c */
        public static final C6709c f12510c = C6709c.m18982d("type");

        /* renamed from: d */
        public static final C6709c f12511d = C6709c.m18982d("app");

        /* renamed from: e */
        public static final C6709c f12512e = C6709c.m18982d(EventBusConstKt.DEVICE);

        /* renamed from: f */
        public static final C6709c f12513f = C6709c.m18982d(RunnerArgs.ARGUMENT_LOG_ONLY);

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d dVar, C6713e eVar) {
            eVar.mo31344b(f12509b, dVar.mo31098e());
            eVar.mo31346f(f12510c, dVar.mo31100f());
            eVar.mo31346f(f12511d, dVar.mo31095b());
            eVar.mo31346f(f12512e, dVar.mo31096c());
            eVar.mo31346f(f12513f, dVar.mo31097d());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$s */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6588s implements C6712d<CrashlyticsReport.C8260e.C8267d.C8285d> {

        /* renamed from: a */
        public static final C6588s f12514a = new C6588s();

        /* renamed from: b */
        public static final C6709c f12515b = C6709c.m18982d(BrowserServiceFileProvider.CONTENT_SCHEME);

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8267d.C8285d dVar, C6713e eVar) {
            eVar.mo31346f(f12515b, dVar.mo31215b());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$t */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6589t implements C6712d<CrashlyticsReport.C8260e.C8287e> {

        /* renamed from: a */
        public static final C6589t f12516a = new C6589t();

        /* renamed from: b */
        public static final C6709c f12517b = C6709c.m18982d("platform");

        /* renamed from: c */
        public static final C6709c f12518c = C6709c.m18982d("version");

        /* renamed from: d */
        public static final C6709c f12519d = C6709c.m18982d("buildVersion");

        /* renamed from: e */
        public static final C6709c f12520e = C6709c.m18982d("jailbroken");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8287e eVar, C6713e eVar2) {
            eVar2.mo31345c(f12517b, eVar.mo31222c());
            eVar2.mo31346f(f12518c, eVar.mo31223d());
            eVar2.mo31346f(f12519d, eVar.mo31221b());
            eVar2.mo31343a(f12520e, eVar.mo31224e());
        }
    }

    /* renamed from: c.q.c.n.h.l.a$u */
    /* compiled from: AutoCrashlyticsReportEncoder */
    public static final class C6590u implements C6712d<CrashlyticsReport.C8260e.C8289f> {

        /* renamed from: a */
        public static final C6590u f12521a = new C6590u();

        /* renamed from: b */
        public static final C6709c f12522b = C6709c.m18982d("identifier");

        /* renamed from: b */
        public void mo17703a(CrashlyticsReport.C8260e.C8289f fVar, C6713e eVar) {
            eVar.mo31346f(f12522b, fVar.mo31233b());
        }
    }

    /* renamed from: a */
    public void mo17702a(C6717b<?> bVar) {
        bVar.mo31349a(CrashlyticsReport.class, C6572c.f12417a);
        bVar.mo31349a(C6592b.class, C6572c.f12417a);
        bVar.mo31349a(CrashlyticsReport.C8260e.class, C6578i.f12452a);
        bVar.mo31349a(C6619g.class, C6578i.f12452a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8261a.class, C6575f.f12432a);
        bVar.mo31349a(C6622h.class, C6575f.f12432a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8261a.C8263b.class, C6576g.f12440a);
        bVar.mo31349a(C6625i.class, C6576g.f12440a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8289f.class, C6590u.f12521a);
        bVar.mo31349a(C6662v.class, C6590u.f12521a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8287e.class, C6589t.f12516a);
        bVar.mo31349a(C6659u.class, C6589t.f12516a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8265c.class, C6577h.f12442a);
        bVar.mo31349a(C6626j.class, C6577h.f12442a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.class, C6587r.f12508a);
        bVar.mo31349a(C6629k.class, C6587r.f12508a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.class, C6579j.f12464a);
        bVar.mo31349a(C6632l.class, C6579j.f12464a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.class, C6581l.f12475a);
        bVar.mo31349a(C6635m.class, C6581l.f12475a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.class, C6584o.f12491a);
        bVar.mo31349a(C6647q.class, C6584o.f12491a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.class, C6585p.f12495a);
        bVar.mo31349a(C6650r.class, C6585p.f12495a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.class, C6582m.f12481a);
        bVar.mo31349a(C6641o.class, C6582m.f12481a);
        bVar.mo31349a(CrashlyticsReport.C8251a.class, C6570a.f12405a);
        bVar.mo31349a(C6599c.class, C6570a.f12405a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.class, C6583n.f12487a);
        bVar.mo31349a(C6644p.class, C6583n.f12487a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.class, C6580k.f12470a);
        bVar.mo31349a(C6638n.class, C6580k.f12470a);
        bVar.mo31349a(CrashlyticsReport.C8254c.class, C6571b.f12414a);
        bVar.mo31349a(C6610d.class, C6571b.f12414a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8283c.class, C6586q.f12501a);
        bVar.mo31349a(C6653s.class, C6586q.f12501a);
        bVar.mo31349a(CrashlyticsReport.C8260e.C8267d.C8285d.class, C6588s.f12514a);
        bVar.mo31349a(C6656t.class, C6588s.f12514a);
        bVar.mo31349a(CrashlyticsReport.C8256d.class, C6573d.f12426a);
        bVar.mo31349a(C6613e.class, C6573d.f12426a);
        bVar.mo31349a(CrashlyticsReport.C8256d.C8258b.class, C6574e.f12429a);
        bVar.mo31349a(C6616f.class, C6574e.f12429a);
    }
}
