package p040c.p048b.p049a.p050a.p051a.p058k;

import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import p040c.p048b.p049a.p050a.p051a.p066s.C1469a;
import p040c.p048b.p049a.p050a.p051a.p066s.C1470b;

/* renamed from: c.b.a.a.a.k.b */
/* compiled from: AuthorizationTokenFactory */
public final class C1414b {

    /* renamed from: c.b.a.a.a.k.b$a */
    /* compiled from: AuthorizationTokenFactory */
    public static /* synthetic */ class C1415a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f512a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.amazon.identity.auth.device.dataobject.AuthorizationToken$AUTHZ_TOKEN_TYPE[] r0 = com.amazon.identity.auth.device.dataobject.AuthorizationToken.AUTHZ_TOKEN_TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f512a = r0
                com.amazon.identity.auth.device.dataobject.AuthorizationToken$AUTHZ_TOKEN_TYPE r1 = com.amazon.identity.auth.device.dataobject.AuthorizationToken.AUTHZ_TOKEN_TYPE.ACCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f512a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.identity.auth.device.dataobject.AuthorizationToken$AUTHZ_TOKEN_TYPE r1 = com.amazon.identity.auth.device.dataobject.AuthorizationToken.AUTHZ_TOKEN_TYPE.REFRESH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p058k.C1414b.C1415a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AuthorizationToken m502a(AuthorizationToken.AUTHZ_TOKEN_TYPE authz_token_type) {
        int i = C1415a.f512a[authz_token_type.ordinal()];
        if (i == 1) {
            return new C1469a();
        }
        if (i == 2) {
            return new C1470b();
        }
        throw new IllegalArgumentException("Unknown token type for factory " + authz_token_type);
    }
}
