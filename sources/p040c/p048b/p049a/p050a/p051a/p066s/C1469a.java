package p040c.p048b.p049a.p050a.p051a.p066s;

import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import java.util.Date;

/* renamed from: c.b.a.a.a.s.a */
/* compiled from: AccessAtzToken */
public class C1469a extends AuthorizationToken {
    public C1469a(String str, String str2, String str3, long j, byte[] bArr) {
        this(str, str2, str3, new Date(), j, bArr);
    }

    public C1469a(String str, String str2, String str3, Date date, long j, byte[] bArr) {
        this(str, str2, str3, date, new Date(date.getTime() + j), bArr);
    }

    public C1469a(String str, String str2, String str3, Date date, Date date2, byte[] bArr) {
        super(str, str2, str3, date, date2, bArr, AuthorizationToken.AUTHZ_TOKEN_TYPE.ACCESS);
    }

    public C1469a() {
        this.f6919r = AuthorizationToken.AUTHZ_TOKEN_TYPE.ACCESS;
    }
}
