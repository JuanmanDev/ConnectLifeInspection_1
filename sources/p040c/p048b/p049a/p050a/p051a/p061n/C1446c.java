package p040c.p048b.p049a.p050a.p051a.p061n;

import android.content.Context;
import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.authorization.Service;
import com.amazon.identity.auth.device.authorization.Stage;
import com.amazon.identity.auth.device.dataobject.AppInfo;

/* renamed from: c.b.a.a.a.n.c */
/* compiled from: ProdEndpointDomainBuilder */
public class C1446c extends C1444a {
    static {
        C1444a.m712a(Service.AUTHORIZATION, Stage.PROD, false, Region.NA, "https://na.account.amazon.com");
        C1444a.m712a(Service.AUTHORIZATION, Stage.PROD, false, Region.EU, "https://eu.account.amazon.com");
        C1444a.m712a(Service.AUTHORIZATION, Stage.PROD, false, Region.FE, "https://apac.account.amazon.com");
        C1444a.m712a(Service.PANDA, Stage.PROD, true, Region.NA, "https://api.sandbox.amazon.com");
        C1444a.m712a(Service.PANDA, Stage.PROD, true, Region.EU, "https://api.sandbox.amazon.co.uk");
        C1444a.m712a(Service.PANDA, Stage.PROD, true, Region.FE, "https://api-sandbox.amazon.co.jp");
        C1444a.m712a(Service.PANDA, Stage.PROD, false, Region.NA, "https://api.amazon.com");
        C1444a.m712a(Service.PANDA, Stage.PROD, false, Region.EU, "https://api.amazon.co.uk");
        C1444a.m712a(Service.PANDA, Stage.PROD, false, Region.FE, "https://api.amazon.co.jp");
    }

    public C1446c(Context context, AppInfo appInfo) {
        super(context, appInfo);
        this.f611a = Stage.PROD;
    }
}
