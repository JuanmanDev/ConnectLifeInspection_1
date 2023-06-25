package p040c.p151o.p152a.p153a.p170r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.gigya.android.sdk.network.adapter.RestAdapter;
import java.util.Map;
import java.util.TreeMap;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.p156j.C2123c;
import p040c.p151o.p152a.p153a.p164n.p165c.C2150a;
import p040c.p151o.p152a.p153a.p164n.p165c.C2151b;

/* renamed from: c.o.a.a.r.d */
/* compiled from: ReportingService */
public class C2182d implements C2180b {

    /* renamed from: a */
    public final C2098a f2162a;

    /* renamed from: b */
    public final C2150a f2163b;

    /* renamed from: c */
    public boolean f2164c;

    /* renamed from: c.o.a.a.r.d$a */
    /* compiled from: ReportingService */
    public class C2183a extends C2151b {
        public C2183a(C2182d dVar) {
        }
    }

    /* renamed from: a */
    public void mo17014a(@NonNull String str, @Nullable String str2, @Nullable Map<String, Object> map) {
        if (!this.f2164c) {
            if (str2 == null) {
                str2 = "Android_5.1.5";
            }
            TreeMap treeMap = new TreeMap();
            treeMap.put("message", str);
            treeMap.put("apiKey", this.f2162a.mo16854c());
            treeMap.put("sdk", str2);
            if (map != null) {
                treeMap.put("details", map);
            }
            this.f2163b.mo16957a(new C2123c(RestAdapter.HttpMethod.POST, "https://accounts." + this.f2162a.mo16853b() + "/sdk.errorReport", treeMap), new C2183a(this));
        }
    }

    public boolean isActive() {
        return !this.f2164c;
    }
}
