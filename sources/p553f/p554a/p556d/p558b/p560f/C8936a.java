package p553f.p554a.p556d.p558b.p560f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.p703v1.XmlPullParserException;

/* renamed from: f.a.d.b.f.a */
/* compiled from: ApplicationInfoLoader */
public final class C8936a {

    /* renamed from: a */
    public static final String f17531a;

    /* renamed from: b */
    public static final String f17532b;

    /* renamed from: c */
    public static final String f17533c;

    /* renamed from: d */
    public static final String f17534d;

    static {
        Class<C8938c> cls = C8938c.class;
        f17531a = cls.getName() + '.' + "aot-shared-library-name";
        f17532b = cls.getName() + '.' + "vm-snapshot-data";
        f17533c = cls.getName() + '.' + "isolate-snapshot-data";
        f17534d = cls.getName() + '.' + "flutter-assets-dir";
    }

    @NonNull
    /* renamed from: a */
    public static ApplicationInfo m24218a(@NonNull Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static String m24219b(ApplicationInfo applicationInfo, Context context) {
        int i;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && xml.getName().equals("domain-config")) {
                    m24223f(xml, jSONArray, false);
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m24220c(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, (String) null);
    }

    @NonNull
    /* renamed from: d */
    public static C8937b m24221d(@NonNull Context context) {
        ApplicationInfo a = m24218a(context);
        return new C8937b(m24220c(a.metaData, f17531a), m24220c(a.metaData, f17532b), m24220c(a.metaData, f17533c), m24220c(a.metaData, f17534d), m24219b(a, context), a.nativeLibraryDir, Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true);
    }

    /* renamed from: e */
    public static void m24222e(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String trim = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(trim);
            jSONArray2.put(attributeBooleanValue);
            jSONArray2.put(z);
            jSONArray.put(jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() != 3) {
                throw new IllegalStateException("Expected end of domain tag");
            }
            return;
        }
        throw new IllegalStateException("Expected text");
    }

    /* renamed from: f */
    public static void m24223f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m24222e(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m24223f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m24224g(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m24224g(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlResourceParser.getName() != name) {
                eventType = xmlResourceParser.next();
            } else {
                return;
            }
        }
    }
}
