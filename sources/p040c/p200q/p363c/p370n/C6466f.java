package p040c.p200q.p363c.p370n;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p372h.C6482b;

/* renamed from: c.q.c.n.f */
/* compiled from: CrashlyticsAnalyticsListener */
public class C6466f implements C6341a.C6343b {

    /* renamed from: a */
    public C6482b f12169a;

    /* renamed from: b */
    public C6482b f12170b;

    /* renamed from: b */
    public static void m18080b(@Nullable C6482b bVar, @NonNull String str, @NonNull Bundle bundle) {
        if (bVar != null) {
            bVar.onEvent(str, bundle);
        }
    }

    /* renamed from: a */
    public void mo30440a(int i, @Nullable Bundle bundle) {
        String string;
        C6479f.m18125f().mo30647i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            mo30610c(string, bundle2);
        }
    }

    /* renamed from: c */
    public final void mo30610c(@NonNull String str, @NonNull Bundle bundle) {
        C6482b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f12169a;
        } else {
            bVar = this.f12170b;
        }
        m18080b(bVar, str, bundle);
    }

    /* renamed from: d */
    public void mo30611d(@Nullable C6482b bVar) {
        this.f12170b = bVar;
    }

    /* renamed from: e */
    public void mo30612e(@Nullable C6482b bVar) {
        this.f12169a = bVar;
    }
}
