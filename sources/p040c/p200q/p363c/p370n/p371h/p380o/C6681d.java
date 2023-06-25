package p040c.p200q.p363c.p370n.p371h.p380o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.C2352d;
import p040c.p200q.p201a.p202a.p203h.C2358c;
import p040c.p200q.p201a.p202a.p205i.C2543u;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p363c.p370n.p371h.p374j.C6499e0;
import p040c.p200q.p363c.p370n.p371h.p374j.C6539t;
import p040c.p200q.p363c.p370n.p371h.p376l.p377c0.C6608g;
import p040c.p200q.p363c.p370n.p371h.p381p.C6696i;

/* renamed from: c.q.c.n.h.o.d */
/* compiled from: DataTransportCrashlyticsReportSender */
public class C6681d {

    /* renamed from: b */
    public static final C6608g f12774b = new C6608g();

    /* renamed from: c */
    public static final String f12775c = m18910d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f12776d = m18910d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final C2352d<CrashlyticsReport, byte[]> f12777e = C6678a.f12768a;

    /* renamed from: a */
    public final C6682e f12778a;

    public C6681d(C6682e eVar, C2352d<CrashlyticsReport, byte[]> dVar) {
        this.f12778a = eVar;
    }

    /* renamed from: a */
    public static C6681d m18908a(Context context, C6696i iVar, C6499e0 e0Var) {
        C2543u.m4549f(context);
        return new C6681d(new C6682e(C2543u.m4547c().mo17986g(new C2358c(f12775c, f12776d)).mo17662a("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, C2350b.m4027b("json"), f12777e), iVar.mo31323b(), e0Var), f12777e);
    }

    /* renamed from: d */
    public static String m18910d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: b */
    public C5771j<C6539t> mo31297b(@NonNull C6539t tVar, boolean z) {
        return this.f12778a.mo31300g(tVar, z).mo28859a();
    }
}
