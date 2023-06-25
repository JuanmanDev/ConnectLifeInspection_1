package p001a.p022e;

import androidx.arch.core.util.Function;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import java.util.Locale;

/* renamed from: a.e.j */
/* compiled from: lambda */
public final /* synthetic */ class C0099j implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f147a;

    public /* synthetic */ C0099j(Locale locale) {
        this.f147a = locale;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setLocale(this.f147a);
    }
}
