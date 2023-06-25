package p040c.p048b.p049a.p050a.p051a.p056j;

import com.amazon.identity.auth.device.api.authorization.Region;

/* renamed from: c.b.a.a.a.j.k */
/* compiled from: RegionUtil */
public final class C1399k {
    /* renamed from: a */
    public static Region m434a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("regionString cannot be null or empty");
        } else if ("AUTO".equals(str)) {
            return Region.AUTO;
        } else {
            if ("NA".equals(str)) {
                return Region.NA;
            }
            if ("EU".equals(str)) {
                return Region.EU;
            }
            if ("FE".equals(str)) {
                return Region.FE;
            }
            throw new IllegalArgumentException("Undefined region for string: " + str);
        }
    }
}
