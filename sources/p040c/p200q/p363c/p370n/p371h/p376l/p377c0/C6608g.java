package p040c.p200q.p363c.p370n.p371h.p376l.p377c0;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.test.internal.runner.RunnerArgs;
import com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p040c.p200q.p363c.p370n.p371h.p376l.C6569a;
import p040c.p200q.p363c.p370n.p371h.p376l.C6591a0;
import p040c.p200q.p363c.p385q.C6707a;
import p040c.p200q.p363c.p385q.p387i.C6721d;

/* renamed from: c.q.c.n.h.l.c0.g */
/* compiled from: CrashlyticsReportJsonTransform */
public class C6608g {

    /* renamed from: a */
    public static final C6707a f12562a;

    /* renamed from: c.q.c.n.h.l.c0.g$a */
    /* compiled from: CrashlyticsReportJsonTransform */
    public interface C6609a<T> {
        /* renamed from: a */
        T mo30996a(@NonNull JsonReader jsonReader);
    }

    static {
        C6721d dVar = new C6721d();
        dVar.mo31351g(C6569a.f12404a);
        dVar.mo31352h(true);
        f12562a = dVar.mo31350f();
    }

    @NonNull
    /* renamed from: c */
    public static CrashlyticsReport.C8260e.C8261a m18620c(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8261a.C8262a a = CrashlyticsReport.C8260e.C8261a.m22813a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 4;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 5;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31066e(jsonReader.nextString());
            } else if (c == 1) {
                a.mo31068g(jsonReader.nextString());
            } else if (c == 2) {
                a.mo31065d(jsonReader.nextString());
            } else if (c == 3) {
                a.mo31067f(jsonReader.nextString());
            } else if (c == 4) {
                a.mo31063b(jsonReader.nextString());
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                a.mo31064c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31062a();
    }

    @NonNull
    /* renamed from: d */
    public static CrashlyticsReport.C8251a m18621d(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8251a.C8252a a = CrashlyticsReport.C8251a.m22752a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 4;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 5;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(NotificationCompat.CarExtender.KEY_TIMESTAMP)) {
                        c = 6;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 2;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo30989c(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo30990d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo30992f(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo30988b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo30991e(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo30993g(jsonReader.nextLong());
                    break;
                case 6:
                    a.mo30994h(jsonReader.nextLong());
                    break;
                case 7:
                    a.mo30995i(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo30987a();
    }

    @NonNull
    /* renamed from: e */
    public static <T> C6591a0<T> m18622e(@NonNull JsonReader jsonReader, @NonNull C6609a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo30996a(jsonReader));
        }
        jsonReader.endArray();
        return C6591a0.m18552c(arrayList);
    }

    @NonNull
    /* renamed from: f */
    public static CrashlyticsReport.C8254c m18623f(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8254c.C8255a a = CrashlyticsReport.C8254c.m22779a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 106079) {
                if (hashCode == 111972721 && nextName.equals("value")) {
                    c = 1;
                }
            } else if (nextName.equals(Person.KEY_KEY)) {
                c = 0;
            }
            if (c == 0) {
                a.mo31007b(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a.mo31008c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31006a();
    }

    @NonNull
    /* renamed from: g */
    public static CrashlyticsReport.C8260e.C8265c m18624g(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8265c.C8266a a = CrashlyticsReport.C8260e.C8265c.m22842a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 7;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo31086b(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo31090f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo31087c(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo31092h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo31088d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo31093i(jsonReader.nextBoolean());
                    break;
                case 6:
                    a.mo31094j(jsonReader.nextInt());
                    break;
                case 7:
                    a.mo31089e(jsonReader.nextString());
                    break;
                case 8:
                    a.mo31091g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo31085a();
    }

    @NonNull
    /* renamed from: h */
    public static CrashlyticsReport.C8260e.C8267d m18625h(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8282b a = CrashlyticsReport.C8260e.C8267d.m22862a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(EventBusConstKt.DEVICE)) {
                        c = 3;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals(RunnerArgs.ARGUMENT_LOG_ONLY)) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 1;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(NotificationCompat.CarExtender.KEY_TIMESTAMP)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31108e(jsonReader.nextLong());
            } else if (c == 1) {
                a.mo31109f(jsonReader.nextString());
            } else if (c == 2) {
                a.mo31105b(m18626i(jsonReader));
            } else if (c == 3) {
                a.mo31106c(m18628k(jsonReader));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo31107d(m18632o(jsonReader));
            }
        }
        jsonReader.endObject();
        return a.mo31104a();
    }

    @NonNull
    /* renamed from: i */
    public static CrashlyticsReport.C8260e.C8267d.C8268a m18626i(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8269a a = CrashlyticsReport.C8260e.C8267d.C8268a.m22869a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals(NotificationCompat.WearableExtender.KEY_BACKGROUND)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 4;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31120b(Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (c == 1) {
                a.mo31124f(jsonReader.nextInt());
            } else if (c == 2) {
                a.mo31122d(m18629l(jsonReader));
            } else if (c == 3) {
                a.mo31121c(m18622e(jsonReader, C6605d.f12559a));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo31123e(m18622e(jsonReader, C6605d.f12559a));
            }
        }
        jsonReader.endObject();
        return a.mo31119a();
    }

    @NonNull
    /* renamed from: j */
    public static CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a m18627j(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.m22888a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals(RunnerArgs.ARGUMENT_TEST_SIZE)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31148c(jsonReader.nextString());
            } else if (c == 1) {
                a.mo31147b(jsonReader.nextLong());
            } else if (c == 2) {
                a.mo31149d(jsonReader.nextLong());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo37433f(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo31146a();
    }

    @NonNull
    /* renamed from: k */
    public static CrashlyticsReport.C8260e.C8267d.C8283c m18628k(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8283c.C8284a a = CrashlyticsReport.C8260e.C8267d.C8283c.m22952a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 4;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 2;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31209b(Double.valueOf(jsonReader.nextDouble()));
            } else if (c == 1) {
                a.mo31210c(jsonReader.nextInt());
            } else if (c == 2) {
                a.mo31211d(jsonReader.nextLong());
            } else if (c == 3) {
                a.mo31213f(jsonReader.nextBoolean());
            } else if (c == 4) {
                a.mo31212e(jsonReader.nextInt());
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                a.mo31214g(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return a.mo31208a();
    }

    @NonNull
    /* renamed from: l */
    public static CrashlyticsReport.C8260e.C8267d.C8268a.C8270b m18629l(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.m22882a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 0;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31138f(m18622e(jsonReader, C6604c.f12558a));
            } else if (c == 1) {
                a.mo31136d(m18630m(jsonReader));
            } else if (c == 2) {
                a.mo31137e(m18633p(jsonReader));
            } else if (c == 3) {
                a.mo31135c(m18622e(jsonReader, C6602a.f12556a));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo31134b(m18621d(jsonReader));
            }
        }
        jsonReader.endObject();
        return a.mo31133a();
    }

    @NonNull
    /* renamed from: m */
    public static CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c m18630m(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.m22906a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 0;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31160b(m18630m(jsonReader));
            } else if (c == 1) {
                a.mo31161c(m18622e(jsonReader, C6607f.f12561a));
            } else if (c == 2) {
                a.mo31162d(jsonReader.nextInt());
            } else if (c == 3) {
                a.mo31164f(jsonReader.nextString());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo31163e(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31159a();
    }

    @NonNull
    /* renamed from: n */
    public static CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b m18631n(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.m22934a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 2;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31195c(jsonReader.nextInt());
            } else if (c == 1) {
                a.mo31194b(jsonReader.nextString());
            } else if (c == 2) {
                a.mo31196d(jsonReader.nextLong());
            } else if (c == 3) {
                a.mo31197e(jsonReader.nextLong());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a.mo31198f(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31193a();
    }

    @NonNull
    /* renamed from: o */
    public static CrashlyticsReport.C8260e.C8267d.C8285d m18632o(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8285d.C8286a a = CrashlyticsReport.C8260e.C8267d.C8285d.m22966a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 951530617 && nextName.equals(BrowserServiceFileProvider.CONTENT_SCHEME)) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                a.mo31220b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31219a();
    }

    @NonNull
    /* renamed from: p */
    public static CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d m18633p(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.C8277a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.m22918a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3059181) {
                    if (hashCode == 3373707 && nextName.equals("name")) {
                        c = 0;
                    }
                } else if (nextName.equals("code")) {
                    c = 1;
                }
            } else if (nextName.equals("address")) {
                c = 2;
            }
            if (c == 0) {
                a.mo31174d(jsonReader.nextString());
            } else if (c == 1) {
                a.mo31173c(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                a.mo31172b(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return a.mo31171a();
    }

    @NonNull
    /* renamed from: q */
    public static CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e m18634q(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8279a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.m22926a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != 3373707) {
                    if (hashCode == 2125650548 && nextName.equals("importance")) {
                        c = 0;
                    }
                } else if (nextName.equals("name")) {
                    c = 1;
                }
            } else if (nextName.equals("frames")) {
                c = 2;
            }
            if (c == 0) {
                a.mo31183c(jsonReader.nextInt());
            } else if (c == 1) {
                a.mo31184d(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                a.mo31182b(m18622e(jsonReader, C6607f.f12561a));
            }
        }
        jsonReader.endObject();
        return a.mo31181a();
    }

    @NonNull
    /* renamed from: r */
    public static CrashlyticsReport.C8256d.C8258b m18635r(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8256d.C8258b.C8259a a = CrashlyticsReport.C8256d.C8258b.m22791a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -734768633) {
                if (hashCode == -567321830 && nextName.equals("contents")) {
                    c = 1;
                }
            } else if (nextName.equals("filename")) {
                c = 0;
            }
            if (c == 0) {
                a.mo31024c(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a.mo31023b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo31022a();
    }

    @NonNull
    /* renamed from: s */
    public static CrashlyticsReport.C8256d m18636s(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8256d.C8257a a = CrashlyticsReport.C8256d.m22785a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 97434231) {
                if (hashCode == 106008351 && nextName.equals("orgId")) {
                    c = 1;
                }
            } else if (nextName.equals(FilesDumperPlugin.NAME)) {
                c = 0;
            }
            if (c == 0) {
                a.mo31015b(m18622e(jsonReader, C6606e.f12560a));
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a.mo31016c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31014a();
    }

    @NonNull
    /* renamed from: t */
    public static CrashlyticsReport.C8260e.C8287e m18637t(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8287e.C8288a a = CrashlyticsReport.C8260e.C8287e.m22970a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a.mo31231d(jsonReader.nextInt());
            } else if (c == 1) {
                a.mo31232e(jsonReader.nextString());
            } else if (c == 2) {
                a.mo31229b(jsonReader.nextString());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a.mo31230c(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
        return a.mo31228a();
    }

    @NonNull
    /* renamed from: u */
    public static CrashlyticsReport m18638u(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8253b b = CrashlyticsReport.m22739b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo30953h(jsonReader.nextString());
                    break;
                case 1:
                    b.mo30949d(jsonReader.nextString());
                    break;
                case 2:
                    b.mo30952g(jsonReader.nextInt());
                    break;
                case 3:
                    b.mo30950e(jsonReader.nextString());
                    break;
                case 4:
                    b.mo30947b(jsonReader.nextString());
                    break;
                case 5:
                    b.mo30948c(jsonReader.nextString());
                    break;
                case 6:
                    b.mo30954i(m18639v(jsonReader));
                    break;
                case 7:
                    b.mo30951f(m18636s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo30946a();
    }

    @NonNull
    /* renamed from: v */
    public static CrashlyticsReport.C8260e m18639v(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8264b a = CrashlyticsReport.C8260e.m22797a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(EventBusConstKt.DEVICE)) {
                        c = 8;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 9;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 7;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 5;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo31046g(jsonReader.nextString());
                    break;
                case 1:
                    a.mo37431j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo31050l(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo31044e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a.mo31042c(jsonReader.nextBoolean());
                    break;
                case 5:
                    a.mo31051m(m18640w(jsonReader));
                    break;
                case 6:
                    a.mo31041b(m18620c(jsonReader));
                    break;
                case 7:
                    a.mo31049k(m18637t(jsonReader));
                    break;
                case 8:
                    a.mo31043d(m18624g(jsonReader));
                    break;
                case 9:
                    a.mo31045f(m18622e(jsonReader, C6603b.f12557a));
                    break;
                case 10:
                    a.mo31047h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo31040a();
    }

    @NonNull
    /* renamed from: w */
    public static CrashlyticsReport.C8260e.C8289f m18640w(@NonNull JsonReader jsonReader) {
        CrashlyticsReport.C8260e.C8289f.C8290a a = CrashlyticsReport.C8260e.C8289f.m22980a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == -1618432855 && nextName.equals("identifier")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                a.mo31238b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo31237a();
    }

    @NonNull
    /* renamed from: a */
    public CrashlyticsReport.C8260e.C8267d mo30997a(@NonNull String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.C8260e.C8267d h = m18625h(jsonReader);
            jsonReader.close();
            return h;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: b */
    public String mo30998b(@NonNull CrashlyticsReport.C8260e.C8267d dVar) {
        return f12562a.mo31335b(dVar);
    }

    @NonNull
    /* renamed from: x */
    public CrashlyticsReport mo30999x(@NonNull String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport u = m18638u(jsonReader);
            jsonReader.close();
            return u;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: y */
    public String mo31000y(@NonNull CrashlyticsReport crashlyticsReport) {
        return f12562a.mo31335b(crashlyticsReport);
    }
}
