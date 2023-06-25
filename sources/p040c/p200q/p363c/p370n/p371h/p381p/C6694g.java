package p040c.p200q.p363c.p370n.p371h.p381p;

import org.json.JSONObject;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6542v;

/* renamed from: c.q.c.n.h.p.g */
/* compiled from: SettingsJsonParser */
public class C6694g {

    /* renamed from: a */
    public final C6542v f12820a;

    public C6694g(C6542v vVar) {
        this.f12820a = vVar;
    }

    /* renamed from: a */
    public static C6695h m18961a(int i) {
        if (i == 3) {
            return new C6699l();
        }
        C6479f f = C6479f.m18125f();
        f.mo30643d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new C6686b();
    }

    /* renamed from: b */
    public C6688d mo31332b(JSONObject jSONObject) {
        return m18961a(jSONObject.getInt("settings_version")).mo31312a(this.f12820a, jSONObject);
    }
}
