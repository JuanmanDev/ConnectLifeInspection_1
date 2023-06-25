package p040c.p072c.p073a.p074a;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.test.internal.runner.RunnerArgs;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import p040c.p072c.p073a.p074a.C1493b0;

/* renamed from: c.c.a.a.m */
/* compiled from: LogUtils */
public final class C1506m {

    /* renamed from: a */
    public static final char[] f685a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* renamed from: b */
    public static final String f686b = System.getProperty("file.separator");

    /* renamed from: c */
    public static final String f687c = System.getProperty("line.separator");

    /* renamed from: d */
    public static final C1510d f688d = new C1510d((C1507a) null);

    /* renamed from: e */
    public static SimpleDateFormat f689e;

    /* renamed from: f */
    public static final ExecutorService f690f = Executors.newSingleThreadExecutor();

    /* renamed from: g */
    public static final SimpleArrayMap<Class, C1512f> f691g = new SimpleArrayMap<>();

    /* renamed from: c.c.a.a.m$a */
    /* compiled from: LogUtils */
    public static class C1507a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f692e;

        /* renamed from: l */
        public final /* synthetic */ C1516j f693l;

        /* renamed from: m */
        public final /* synthetic */ String f694m;

        public C1507a(int i, C1516j jVar, String str) {
            this.f692e = i;
            this.f693l = jVar;
            this.f694m = str;
        }

        public void run() {
            int i = this.f692e;
            String str = this.f693l.f718a;
            C1506m.m974x(i, str, this.f693l.f720c + this.f694m);
        }
    }

    /* renamed from: c.c.a.a.m$b */
    /* compiled from: LogUtils */
    public static class C1508b implements FilenameFilter {
        public boolean accept(File file, String str) {
            return C1506m.m970t(str);
        }
    }

    /* renamed from: c.c.a.a.m$c */
    /* compiled from: LogUtils */
    public static class C1509c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ File f695e;

        public C1509c(File file) {
            this.f695e = file;
        }

        public void run() {
            if (!this.f695e.delete()) {
                "delete " + this.f695e + " failed!";
            }
        }
    }

    /* renamed from: c.c.a.a.m$d */
    /* compiled from: LogUtils */
    public static final class C1510d {

        /* renamed from: a */
        public String f696a;

        /* renamed from: b */
        public String f697b;

        /* renamed from: c */
        public String f698c;

        /* renamed from: d */
        public String f699d;

        /* renamed from: e */
        public boolean f700e;

        /* renamed from: f */
        public boolean f701f;

        /* renamed from: g */
        public String f702g;

        /* renamed from: h */
        public boolean f703h;

        /* renamed from: i */
        public boolean f704i;

        /* renamed from: j */
        public boolean f705j;

        /* renamed from: k */
        public boolean f706k;

        /* renamed from: l */
        public boolean f707l;

        /* renamed from: m */
        public int f708m;

        /* renamed from: n */
        public int f709n;

        /* renamed from: o */
        public int f710o;

        /* renamed from: p */
        public int f711p;

        /* renamed from: q */
        public int f712q;

        /* renamed from: r */
        public String f713r;

        /* renamed from: s */
        public C1511e f714s;

        /* renamed from: t */
        public C1514h f715t;

        /* renamed from: u */
        public C1515i f716u;

        /* renamed from: v */
        public C1493b0.C1494a f717v;

        public /* synthetic */ C1510d(C1507a aVar) {
            this();
        }

        /* renamed from: h */
        public final char mo15392h() {
            return C1506m.f685a[this.f708m - 2];
        }

        /* renamed from: i */
        public final String mo15393i() {
            String str = this.f697b;
            return str == null ? this.f696a : str;
        }

        /* renamed from: j */
        public final String mo15394j() {
            return this.f699d;
        }

        /* renamed from: k */
        public final char mo15395k() {
            return C1506m.f685a[this.f709n - 2];
        }

        /* renamed from: l */
        public final String mo15396l() {
            return this.f698c;
        }

        /* renamed from: m */
        public final String mo15397m() {
            if (C1493b0.m899w(this.f702g)) {
                return "";
            }
            return this.f702g;
        }

        /* renamed from: n */
        public final String mo15398n() {
            String str = this.f713r;
            if (str == null) {
                return "";
            }
            return str.replace(RunnerArgs.CLASSPATH_SEPARATOR, "_");
        }

        /* renamed from: o */
        public final int mo15399o() {
            return this.f712q;
        }

        /* renamed from: p */
        public final int mo15400p() {
            return this.f710o;
        }

        /* renamed from: q */
        public final int mo15401q() {
            return this.f711p;
        }

        /* renamed from: r */
        public final boolean mo15402r() {
            return this.f701f;
        }

        /* renamed from: s */
        public final boolean mo15403s() {
            return this.f705j;
        }

        /* renamed from: t */
        public final boolean mo15404t() {
            return this.f706k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(mo15398n());
            sb.append(C1506m.f687c);
            sb.append("logSwitch: ");
            sb.append(mo15407v());
            sb.append(C1506m.f687c);
            sb.append("consoleSwitch: ");
            sb.append(mo15402r());
            sb.append(C1506m.f687c);
            sb.append("tag: ");
            sb.append(mo15397m().equals("") ? "null" : mo15397m());
            sb.append(C1506m.f687c);
            sb.append("headSwitch: ");
            sb.append(mo15406u());
            sb.append(C1506m.f687c);
            sb.append("fileSwitch: ");
            sb.append(mo15403s());
            sb.append(C1506m.f687c);
            sb.append("dir: ");
            sb.append(mo15393i());
            sb.append(C1506m.f687c);
            sb.append("filePrefix: ");
            sb.append(mo15396l());
            sb.append(C1506m.f687c);
            sb.append("borderSwitch: ");
            sb.append(mo15404t());
            sb.append(C1506m.f687c);
            sb.append("singleTagSwitch: ");
            sb.append(mo15408w());
            sb.append(C1506m.f687c);
            sb.append("consoleFilter: ");
            sb.append(mo15392h());
            sb.append(C1506m.f687c);
            sb.append("fileFilter: ");
            sb.append(mo15395k());
            sb.append(C1506m.f687c);
            sb.append("stackDeep: ");
            sb.append(mo15400p());
            sb.append(C1506m.f687c);
            sb.append("stackOffset: ");
            sb.append(mo15401q());
            sb.append(C1506m.f687c);
            sb.append("saveDays: ");
            sb.append(mo15399o());
            sb.append(C1506m.f687c);
            sb.append("formatter: ");
            sb.append(C1506m.f691g);
            sb.append(C1506m.f687c);
            sb.append("fileWriter: ");
            sb.append(this.f714s);
            sb.append(C1506m.f687c);
            sb.append("onConsoleOutputListener: ");
            sb.append(this.f715t);
            sb.append(C1506m.f687c);
            sb.append("onFileOutputListener: ");
            sb.append(this.f716u);
            sb.append(C1506m.f687c);
            sb.append("fileExtraHeader: ");
            sb.append(this.f717v.mo15387c());
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo15406u() {
            return this.f704i;
        }

        /* renamed from: v */
        public final boolean mo15407v() {
            return this.f700e;
        }

        /* renamed from: w */
        public final boolean mo15408w() {
            return this.f707l;
        }

        public C1510d() {
            this.f698c = "util";
            this.f699d = ".txt";
            this.f700e = true;
            this.f701f = true;
            this.f702g = "";
            this.f703h = true;
            this.f704i = true;
            this.f705j = false;
            this.f706k = true;
            this.f707l = true;
            this.f708m = 2;
            this.f709n = 2;
            this.f710o = 1;
            this.f711p = 0;
            this.f712q = -1;
            this.f713r = C1493b0.m887k();
            this.f717v = new C1493b0.C1494a("Log");
            if (!C1493b0.m898v() || C1535z.m1079a().getExternalFilesDir((String) null) == null) {
                this.f696a = C1535z.m1079a().getFilesDir() + C1506m.f686b + RunnerArgs.ARGUMENT_LOG_ONLY + C1506m.f686b;
                return;
            }
            this.f696a = C1535z.m1079a().getExternalFilesDir((String) null) + C1506m.f686b + RunnerArgs.ARGUMENT_LOG_ONLY + C1506m.f686b;
        }
    }

    /* renamed from: c.c.a.a.m$e */
    /* compiled from: LogUtils */
    public interface C1511e {
        /* renamed from: a */
        void mo15409a(String str, String str2);
    }

    /* renamed from: c.c.a.a.m$f */
    /* compiled from: LogUtils */
    public static abstract class C1512f<T> {
        /* renamed from: a */
        public abstract String mo15410a(T t);
    }

    /* renamed from: c.c.a.a.m$g */
    /* compiled from: LogUtils */
    public static final class C1513g {
        /* renamed from: a */
        public static String m1002a(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        /* renamed from: b */
        public static String m1003b(Bundle bundle) {
            String str;
            Iterator it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String str2 = (String) it.next();
                Object obj = bundle.get(str2);
                sb.append(str2);
                sb.append('=');
                if (obj instanceof Bundle) {
                    if (obj == bundle) {
                        str = "(this Bundle)";
                    } else {
                        str = m1003b((Bundle) obj);
                    }
                    sb.append(str);
                } else {
                    sb.append(C1506m.m963m(obj));
                }
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        @RequiresApi(api = 16)
        /* renamed from: c */
        public static void m1004c(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent != null) {
                sb.append("I:");
                sb.append(m1006e(intent));
                sb.append("}");
                return;
            }
            sb.append("NULL");
            sb.append("}");
        }

        /* renamed from: d */
        public static String m1005d(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                newTransformer.transform(streamSource, streamResult);
                String obj = streamResult.getWriter().toString();
                return obj.replaceFirst(">", ">" + C1506m.f687c);
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }

        /* renamed from: e */
        public static String m1006e(Intent intent) {
            boolean z;
            Intent selector;
            String str;
            ClipData clipData;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z2 = true;
            boolean z3 = false;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z = false;
            } else {
                z = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String next : categories) {
                    if (!z2) {
                        sb.append(',');
                    }
                    sb.append(next);
                    z2 = false;
                }
                sb.append("]");
                z = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z = false;
            }
            if (Build.VERSION.SDK_INT >= 16 && (clipData = intent.getClipData()) != null) {
                if (!z) {
                    sb.append(' ');
                }
                m1004c(clipData, sb);
                z = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(m1003b(extras));
                sb.append('}');
            } else {
                z3 = z;
            }
            if (Build.VERSION.SDK_INT >= 15 && (selector = intent.getSelector()) != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("sel={");
                if (selector == intent) {
                    str = "(this Intent)";
                } else {
                    str = m1006e(selector);
                }
                sb.append(str);
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        /* renamed from: f */
        public static String m1007f(Object obj) {
            if (obj instanceof CharSequence) {
                return C1493b0.m883g(obj.toString());
            }
            try {
                return C1493b0.m890n().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        /* renamed from: g */
        public static String m1008g(Object obj) {
            return m1009h(obj, -1);
        }

        /* renamed from: h */
        public static String m1009h(Object obj, int i) {
            if (obj.getClass().isArray()) {
                return m1002a(obj);
            }
            if (obj instanceof Throwable) {
                return C1493b0.m889m((Throwable) obj);
            }
            if (obj instanceof Bundle) {
                return m1003b((Bundle) obj);
            }
            if (obj instanceof Intent) {
                return m1006e((Intent) obj);
            }
            if (i == 32) {
                return m1007f(obj);
            }
            if (i == 48) {
                return m1005d(obj.toString());
            }
            return obj.toString();
        }
    }

    /* renamed from: c.c.a.a.m$h */
    /* compiled from: LogUtils */
    public interface C1514h {
        /* renamed from: a */
        void mo15411a(int i, String str, String str2);
    }

    /* renamed from: c.c.a.a.m$i */
    /* compiled from: LogUtils */
    public interface C1515i {
        /* renamed from: a */
        void mo15412a(String str, String str2);
    }

    /* renamed from: c.c.a.a.m$j */
    /* compiled from: LogUtils */
    public static final class C1516j {

        /* renamed from: a */
        public String f718a;

        /* renamed from: b */
        public String[] f719b;

        /* renamed from: c */
        public String f720c;

        public C1516j(String str, String[] strArr, String str2) {
            this.f718a = str;
            this.f719b = strArr;
            this.f720c = str2;
        }
    }

    /* renamed from: A */
    public static void m944A(int i, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (f688d.mo15404t()) {
                    str2 = "│ " + str2;
                }
                m972v(i, str, str2);
            }
            if (f688d.mo15404t()) {
                m972v(i, str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            }
        }
    }

    /* renamed from: B */
    public static void m945B(int i, String str, String str2) {
        int length = str2.length();
        int i2 = length / 1100;
        if (i2 > 0) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1100;
                m947D(i, str, str2.substring(i4, i5));
                i3++;
                i4 = i5;
            }
            if (i4 != length) {
                m947D(i, str, str2.substring(i4, length));
                return;
            }
            return;
        }
        m947D(i, str, str2);
    }

    /* renamed from: C */
    public static void m946C(int i, String str, String str2) {
        int length = str2.length();
        int i2 = 1100;
        int i3 = f688d.mo15404t() ? (length - 113) / 1100 : length / 1100;
        if (i3 > 0) {
            int i4 = 1;
            if (f688d.mo15404t()) {
                m972v(i, str, str2.substring(0, 1100) + f687c + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                while (i4 < i3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" ");
                    sb.append(f687c);
                    sb.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    sb.append(f687c);
                    sb.append("│ ");
                    int i5 = i2 + 1100;
                    sb.append(str2.substring(i2, i5));
                    sb.append(f687c);
                    sb.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    m972v(i, str, sb.toString());
                    i4++;
                    i2 = i5;
                }
                if (i2 != length - 113) {
                    m972v(i, str, " " + f687c + "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────" + f687c + "│ " + str2.substring(i2, length));
                    return;
                }
                return;
            }
            m972v(i, str, str2.substring(0, 1100));
            while (i4 < i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" ");
                sb2.append(f687c);
                int i6 = i2 + 1100;
                sb2.append(str2.substring(i2, i6));
                m972v(i, str, sb2.toString());
                i4++;
                i2 = i6;
            }
            if (i2 != length) {
                m972v(i, str, " " + f687c + str2.substring(i2, length));
                return;
            }
            return;
        }
        m972v(i, str, str2);
    }

    /* renamed from: D */
    public static void m947D(int i, String str, String str2) {
        if (!f688d.mo15404t()) {
            m972v(i, str, str2);
            return;
        }
        for (String str3 : str2.split(f687c)) {
            m972v(i, str, "│ " + str3);
        }
    }

    /* renamed from: E */
    public static String m948E(int i, Object... objArr) {
        String str;
        if (objArr != null) {
            if (objArr.length == 1) {
                str = m962l(i, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = objArr[i2];
                    sb.append("args");
                    sb.append("[");
                    sb.append(i2);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(m963m(obj));
                    sb.append(f687c);
                }
                str = sb.toString();
            }
        } else {
            str = "null";
        }
        return str.length() == 0 ? "log nothing" : str;
    }

    /* renamed from: F */
    public static String m949F(int i, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (f688d.mo15404t()) {
            sb.append(" ");
            sb.append(f687c);
            sb.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb.append(f687c);
            if (strArr != null) {
                for (String append : strArr) {
                    sb.append("│ ");
                    sb.append(append);
                    sb.append(f687c);
                }
                sb.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                sb.append(f687c);
            }
            String[] split = str2.split(f687c);
            int length = split.length;
            while (i2 < length) {
                String str3 = split[i2];
                sb.append("│ ");
                sb.append(str3);
                sb.append(f687c);
                i2++;
            }
            sb.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        } else {
            if (strArr != null) {
                sb.append(" ");
                sb.append(f687c);
                int length2 = strArr.length;
                while (i2 < length2) {
                    sb.append(strArr[i2]);
                    sb.append(f687c);
                    i2++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: G */
    public static C1516j m950G(String str) {
        String str2;
        String str3;
        if (f688d.f703h || f688d.mo15406u()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int q = f688d.mo15401q() + 3;
            if (q >= stackTrace.length) {
                String p = m966p(stackTrace[3]);
                if (!f688d.f703h || !C1493b0.m899w(str)) {
                    p = str;
                } else {
                    int indexOf = p.indexOf(46);
                    if (indexOf != -1) {
                        p = p.substring(0, indexOf);
                    }
                }
                return new C1516j(p, (String[]) null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[q];
            String p2 = m966p(stackTraceElement);
            if (!f688d.f703h || !C1493b0.m899w(str)) {
                str3 = str;
            } else {
                int indexOf2 = p2.indexOf(46);
                str3 = indexOf2 == -1 ? p2 : p2.substring(0, indexOf2);
            }
            if (f688d.mo15406u()) {
                String name = Thread.currentThread().getName();
                String formatter = new Formatter().format("%s, %s.%s(%s:%d)", new Object[]{name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), p2, Integer.valueOf(stackTraceElement.getLineNumber())}).toString();
                String str4 = " [" + formatter + "]: ";
                if (f688d.mo15400p() <= 1) {
                    return new C1516j(str3, new String[]{formatter}, str4);
                }
                int min = Math.min(f688d.mo15400p(), stackTrace.length - q);
                String[] strArr = new String[min];
                strArr[0] = formatter;
                String formatter2 = new Formatter().format("%" + (name.length() + 2) + "s", new Object[]{""}).toString();
                for (int i = 1; i < min; i++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i + q];
                    strArr[i] = new Formatter().format("%s%s.%s(%s:%d)", new Object[]{formatter2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), m966p(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())}).toString();
                }
                return new C1516j(str3, strArr, str4);
            }
            str2 = str3;
        } else {
            str2 = f688d.mo15397m();
        }
        return new C1516j(str2, (String[]) null, ": ");
    }

    /* renamed from: h */
    public static boolean m958h(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!C1493b0.m878b(file.getParentFile())) {
            return false;
        }
        try {
            m959i(str, str2);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                m976z(str, str2);
            }
            return createNewFile;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: i */
    public static void m959i(String str, String str2) {
        File[] listFiles;
        if (f688d.mo15399o() > 0 && (listFiles = new File(str).getParentFile().listFiles(new C1508b())) != null && listFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (((long) f688d.mo15399o()) * 86400000);
                for (File file : listFiles) {
                    String name = file.getName();
                    name.length();
                    if (simpleDateFormat.parse(m961k(name)).getTime() <= time) {
                        f690f.execute(new C1509c(file));
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static void m960j(Object... objArr) {
        m971u(6, f688d.mo15397m(), objArr);
    }

    /* renamed from: k */
    public static String m961k(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    /* renamed from: l */
    public static String m962l(int i, Object obj) {
        if (obj == null) {
            return "null";
        }
        if (i == 32) {
            return C1513g.m1009h(obj, 32);
        }
        if (i == 48) {
            return C1513g.m1009h(obj, 48);
        }
        return m963m(obj);
    }

    /* renamed from: m */
    public static String m963m(Object obj) {
        C1512f fVar;
        if (obj == null) {
            return "null";
        }
        if (f691g.isEmpty() || (fVar = f691g.get(m964n(obj))) == null) {
            return C1513g.m1008g(obj);
        }
        return fVar.mo15410a(obj);
    }

    /* renamed from: n */
    public static Class m964n(Object obj) {
        String str;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                Type type = genericInterfaces[0];
                while (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getRawType();
                }
                str = type.toString();
            } else {
                Type genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
                str = genericSuperclass.toString();
            }
            if (str.startsWith("class ")) {
                str = str.substring(6);
            } else if (str.startsWith("interface ")) {
                str = str.substring(10);
            }
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return cls;
    }

    /* renamed from: o */
    public static String m965o(Date date) {
        String substring = m967q().format(date).substring(0, 10);
        return f688d.mo15393i() + f688d.mo15396l() + "_" + substring + "_" + f688d.mo15398n() + f688d.mo15394j();
    }

    /* renamed from: p */
    public static String m966p(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return className + ".java";
    }

    /* renamed from: q */
    public static SimpleDateFormat m967q() {
        if (f689e == null) {
            f689e = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f689e;
    }

    /* renamed from: r */
    public static void m968r(Object... objArr) {
        m971u(4, f688d.mo15397m(), objArr);
    }

    /* renamed from: s */
    public static void m969s(String str, String str2) {
        if (f688d.f714s == null) {
            C1493b0.m876F(str, str2, true);
        } else {
            f688d.f714s.mo15409a(str, str2);
        }
        if (f688d.f716u != null) {
            f688d.f716u.mo15412a(str, str2);
        }
    }

    /* renamed from: t */
    public static boolean m970t(String str) {
        return str.matches("^" + f688d.mo15396l() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    /* renamed from: u */
    public static void m971u(int i, String str, Object... objArr) {
        if (f688d.mo15407v()) {
            int i2 = i & 15;
            int i3 = i & 240;
            if (!f688d.mo15402r() && !f688d.mo15403s() && i3 != 16) {
                return;
            }
            if (i2 >= f688d.f708m || i2 >= f688d.f709n) {
                C1516j G = m950G(str);
                String E = m948E(i3, objArr);
                if (f688d.mo15402r() && i3 != 16 && i2 >= f688d.f708m) {
                    m973w(i2, G.f718a, G.f719b, E);
                }
                if ((f688d.mo15403s() || i3 == 16) && i2 >= f688d.f709n) {
                    f690f.execute(new C1507a(i2, G, E));
                }
            }
        }
    }

    /* renamed from: v */
    public static void m972v(int i, String str, String str2) {
        Log.println(i, str, str2);
        if (f688d.f715t != null) {
            f688d.f715t.mo15411a(i, str, str2);
        }
    }

    /* renamed from: w */
    public static void m973w(int i, String str, String[] strArr, String str2) {
        if (f688d.mo15408w()) {
            m946C(i, str, m949F(i, str, strArr, str2));
            return;
        }
        m975y(i, str, true);
        m944A(i, str, strArr);
        m945B(i, str, str2);
        m975y(i, str, false);
    }

    /* renamed from: x */
    public static void m974x(int i, String str, String str2) {
        Date date = new Date();
        String format = m967q().format(date);
        String substring = format.substring(0, 10);
        String o = m965o(date);
        if (!m958h(o, substring)) {
            "create " + o + " failed!";
            return;
        }
        m969s(o, format.substring(11) + f685a[i - 2] + "/" + str + str2 + f687c);
    }

    /* renamed from: y */
    public static void m975y(int i, String str, boolean z) {
        if (f688d.mo15404t()) {
            m972v(i, str, z ? "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────" : "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    /* renamed from: z */
    public static void m976z(String str, String str2) {
        f688d.f717v.mo15385a("Date of Log", str2);
        m969s(str, f688d.f717v.toString());
    }
}
