package p553f.p554a.p570e.p573c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p553f.p554a.p556d.p558b.p569i.C8979e;

/* renamed from: f.a.e.c.a */
/* compiled from: LocalizationPlugin */
public class C9044a {
    @NonNull

    /* renamed from: a */
    public final C8979e f17748a;
    @NonNull

    /* renamed from: b */
    public final Context f17749b;

    public C9044a(@NonNull Context context, @NonNull C8979e eVar) {
        this.f17749b = context;
        this.f17748a = eVar;
    }

    /* renamed from: a */
    public Locale mo46648a(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f17749b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale = locales.get(i2);
                arrayList.add(new Locale.LanguageRange(locale.toString().replace("_", AccountManagerConstants$LOCALE.LOCALE_SEPERATOR)));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
            return list.get(0);
        } else if (i >= 24) {
            LocaleList locales2 = this.f17749b.getResources().getConfiguration().getLocales();
            for (int i3 = 0; i3 < locales2.size(); i3++) {
                Locale locale2 = locales2.get(i3);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
            return list.get(0);
        } else {
            Locale locale3 = this.f17749b.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
            return list.get(0);
        }
    }

    /* renamed from: b */
    public void mo46649b(@NonNull Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f17748a.mo46525a(arrayList);
    }
}
