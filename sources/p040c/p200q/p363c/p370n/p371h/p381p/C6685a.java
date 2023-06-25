package p040c.p200q.p363c.p370n.p371h.p381p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;

/* renamed from: c.q.c.n.h.p.a */
/* compiled from: CachedSettingsIo */
public class C6685a {

    /* renamed from: a */
    public final File f12792a;

    public C6685a(C6677f fVar) {
        this.f12792a = fVar.mo31284e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    public final File mo31309a() {
        return this.f12792a;
    }

    /* renamed from: b */
    public JSONObject mo31310b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C6479f.m18125f().mo30641b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = mo31309a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(C6513n.m18222C(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C6479f.m18125f().mo30644e("Failed to fetch cached settings", e);
                        C6513n.m18227e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C6513n.m18227e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C6479f.m18125f().mo30647i("Settings file does not exist.");
                jSONObject = null;
            }
            C6513n.m18227e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C6479f.m18125f().mo30644e("Failed to fetch cached settings", e);
            C6513n.m18227e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            C6513n.m18227e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo31311c(long j, JSONObject jSONObject) {
        C6479f.m18125f().mo30647i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(mo31309a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C6513n.m18227e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C6479f.m18125f().mo30644e("Failed to cache settings", e);
                        C6513n.m18227e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C6513n.m18227e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C6513n.m18227e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C6479f.m18125f().mo30644e("Failed to cache settings", e);
                C6513n.m18227e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
