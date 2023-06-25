package p630io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C8996b;
import p553f.p554a.p570e.p571a.C9012e;

/* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel */
public class SettingsChannel {
    @NonNull

    /* renamed from: a */
    public final C8996b<Object> f18533a;

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness */
    public enum PlatformBrightness {
        light("light"),
        dark("dark");
        
        @NonNull
        public String name;

        /* access modifiers changed from: public */
        PlatformBrightness(@NonNull String str) {
            this.name = str;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$a */
    public static class C9423a {
        @NonNull

        /* renamed from: a */
        public final C8996b<Object> f18534a;
        @NonNull

        /* renamed from: b */
        public Map<String, Object> f18535b = new HashMap();

        public C9423a(@NonNull C8996b<Object> bVar) {
            this.f18534a = bVar;
        }

        /* renamed from: a */
        public void mo47530a() {
            C8896b.m24032d("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f18535b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f18535b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f18535b.get("platformBrightness"));
            this.f18534a.mo46553c(this.f18535b);
        }

        @NonNull
        /* renamed from: b */
        public C9423a mo47531b(@NonNull PlatformBrightness platformBrightness) {
            this.f18535b.put("platformBrightness", platformBrightness.name);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C9423a mo47532c(float f) {
            this.f18535b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C9423a mo47533d(boolean z) {
            this.f18535b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    public SettingsChannel(@NonNull C8928a aVar) {
        this.f18533a = new C8996b<>(aVar, "flutter/settings", C9012e.f17685a);
    }

    @NonNull
    /* renamed from: a */
    public C9423a mo47529a() {
        return new C9423a(this.f18533a);
    }
}
