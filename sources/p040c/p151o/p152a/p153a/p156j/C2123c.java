package p040c.p151o.p152a.p153a.p156j;

import androidx.annotation.NonNull;
import com.gigya.android.sdk.network.adapter.RestAdapter;
import java.util.TreeMap;

/* renamed from: c.o.a.a.j.c */
/* compiled from: GigyaApiRequest */
public class C2123c {
    @NonNull

    /* renamed from: a */
    public String f2090a;
    @NonNull

    /* renamed from: b */
    public TreeMap<String, Object> f2091b;

    public C2123c(RestAdapter.HttpMethod httpMethod, @NonNull String str, @NonNull TreeMap<String, Object> treeMap) {
        this.f2090a = str;
        this.f2091b = treeMap;
    }

    @NonNull
    /* renamed from: a */
    public String mo16917a() {
        return this.f2090a;
    }

    @NonNull
    /* renamed from: b */
    public TreeMap<String, Object> mo16918b() {
        return this.f2091b;
    }
}
