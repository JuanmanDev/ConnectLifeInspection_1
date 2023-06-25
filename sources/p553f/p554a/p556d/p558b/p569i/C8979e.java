package p553f.p554a.p556d.p558b.p569i;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9013f;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.d.b.i.e */
/* compiled from: LocalizationChannel */
public class C8979e {
    @NonNull

    /* renamed from: a */
    public final C9017j f17621a;

    public C8979e(@NonNull C8928a aVar) {
        this.f17621a = new C9017j(aVar, "flutter/localization", C9013f.f17686a);
    }

    /* renamed from: a */
    public void mo46525a(@NonNull List<Locale> list) {
        C8896b.m24032d("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            C8896b.m24032d("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? next.getScript() : "");
            arrayList.add(next.getVariant());
        }
        this.f17621a.mo46573c("setLocale", arrayList);
    }
}
