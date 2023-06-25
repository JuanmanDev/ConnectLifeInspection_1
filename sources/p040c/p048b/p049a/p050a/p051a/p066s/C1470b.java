package p040c.p048b.p049a.p050a.p051a.p066s;

import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import java.util.Date;

/* renamed from: c.b.a.a.a.s.b */
/* compiled from: RefreshAtzToken */
public class C1470b extends AuthorizationToken {
    public C1470b(String str, String str2, String str3, byte[] bArr) {
        this(str, str2, str3, new Date(), bArr);
    }

    public C1470b(String str, String str2, String str3, Date date, byte[] bArr) {
        super(str, str2, str3, date, date, bArr, AuthorizationToken.AUTHZ_TOKEN_TYPE.REFRESH);
    }

    public C1470b() {
        this.f6919r = AuthorizationToken.AUTHZ_TOKEN_TYPE.REFRESH;
    }
}
