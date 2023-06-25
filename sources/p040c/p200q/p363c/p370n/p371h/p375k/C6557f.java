package p040c.p200q.p363c.p370n.p371h.p375k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;

/* renamed from: c.q.c.n.h.k.f */
/* compiled from: MetaDataStore */
public class C6557f {

    /* renamed from: b */
    public static final Charset f12367b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C6677f f12368a;

    /* renamed from: c.q.c.n.h.k.f$a */
    /* compiled from: MetaDataStore */
    public class C6558a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f12369a;

        public C6558a(String str) {
            this.f12369a = str;
            put("userId", this.f12369a);
        }
    }

    public C6557f(C6677f fVar) {
        this.f12368a = fVar;
    }

    /* renamed from: d */
    public static Map<String, String> m18442d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m18446k(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static String m18443f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: i */
    public static void m18444i(File file) {
        if (file.exists() && file.delete()) {
            C6479f f = C6479f.m18125f();
            f.mo30645g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: j */
    public static String m18445j(String str) {
        return new C6558a(str).toString();
    }

    /* renamed from: k */
    public static String m18446k(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public File mo30843a(String str) {
        return this.f12368a.mo31294o(str, "internal-keys");
    }

    @NonNull
    /* renamed from: b */
    public File mo30844b(String str) {
        return this.f12368a.mo31294o(str, SavedStateHandle.KEYS);
    }

    @NonNull
    /* renamed from: c */
    public File mo30845c(String str) {
        return this.f12368a.mo31294o(str, "user-data");
    }

    @Nullable
    /* renamed from: e */
    public final String mo30846e(String str) {
        return m18446k(new JSONObject(str), "userId");
    }

    /* renamed from: g */
    public Map<String, String> mo30847g(String str, boolean z) {
        Exception e;
        FileInputStream fileInputStream;
        File a = z ? mo30843a(str) : mo30844b(str);
        if (!a.exists() || a.length() == 0) {
            m18444i(a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a);
            try {
                Map<String, String> d = m18442d(C6513n.m18222C(fileInputStream));
                C6513n.m18227e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    C6479f.m18125f().mo30650l("Error deserializing user metadata.", e);
                    m18444i(a);
                    C6513n.m18227e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C6513n.m18227e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            C6479f.m18125f().mo30650l("Error deserializing user metadata.", e);
            m18444i(a);
            C6513n.m18227e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            C6513n.m18227e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    @Nullable
    /* renamed from: h */
    public String mo30848h(String str) {
        FileInputStream fileInputStream;
        File c = mo30845c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            C6479f.m18125f().mo30641b("No userId set for session " + str);
            m18444i(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = mo30846e(C6513n.m18222C(fileInputStream));
                C6479f.m18125f().mo30641b("Loaded userId " + e + " for session " + str);
                C6513n.m18227e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    C6479f.m18125f().mo30650l("Error deserializing user metadata.", e);
                    m18444i(c);
                    C6513n.m18227e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C6513n.m18227e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C6479f.m18125f().mo30650l("Error deserializing user metadata.", e);
            m18444i(c);
            C6513n.m18227e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            C6513n.m18227e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: l */
    public void mo30849l(String str, Map<String, String> map, boolean z) {
        File a = z ? mo30843a(str) : mo30844b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String f = m18443f(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f12367b));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                C6513n.m18227e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C6479f.m18125f().mo30650l("Error serializing key/value metadata.", e);
                    m18444i(a);
                    C6513n.m18227e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C6513n.m18227e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C6513n.m18227e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C6479f.m18125f().mo30650l("Error serializing key/value metadata.", e);
            m18444i(a);
            C6513n.m18227e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: m */
    public void mo30850m(String str, String str2) {
        File c = mo30845c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String j = m18445j(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f12367b));
            try {
                bufferedWriter2.write(j);
                bufferedWriter2.flush();
                C6513n.m18227e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C6479f.m18125f().mo30650l("Error serializing user metadata.", e);
                    C6513n.m18227e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C6513n.m18227e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C6513n.m18227e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C6479f.m18125f().mo30650l("Error serializing user metadata.", e);
            C6513n.m18227e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
