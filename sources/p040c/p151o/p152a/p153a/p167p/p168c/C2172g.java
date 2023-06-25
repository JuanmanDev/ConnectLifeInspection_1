package p040c.p151o.p152a.p153a.p167p.p168c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.gigya.android.sdk.p309ui.HostActivity;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.Map;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p174u.C2203d;

/* renamed from: c.o.a.a.p.c.g */
/* compiled from: WeChatProvider */
public class C2172g extends C2168e {

    /* renamed from: g */
    public String f2152g;

    /* renamed from: h */
    public IWXAPI f2153h;

    /* renamed from: i */
    public BaseResp f2154i;

    /* renamed from: c.o.a.a.p.c.g$a */
    /* compiled from: WeChatProvider */
    public class C2173a extends HostActivity.C3954a {

        /* renamed from: a */
        public final /* synthetic */ Map f2155a;

        public C2173a(Map map) {
            this.f2155a = map;
        }

        /* renamed from: b */
        public void mo16987b(AppCompatActivity appCompatActivity, @Nullable Bundle bundle) {
            SendAuth.Req req = new SendAuth.Req();
            req.scope = "snsapi_userinfo";
            req.state = "";
            C2172g.this.f2153h.sendReq(req);
        }

        /* renamed from: d */
        public void mo17007d(AppCompatActivity appCompatActivity) {
            if (C2172g.this.f2154i != null) {
                C2172g gVar = C2172g.this;
                gVar.mo17006n(this.f2155a, gVar.f2154i, appCompatActivity);
            }
        }
    }

    /* renamed from: o */
    public static boolean m3279o(Context context, C2203d dVar) {
        try {
            String b = dVar.mo17059b("wechatAppID");
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, b, false);
            if (b == null || !createWXAPI.isWXAppInstalled()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo16980a() {
        super.mo16980a();
        IWXAPI iwxapi = this.f2153h;
        if (iwxapi != null) {
            iwxapi.detach();
        }
    }

    /* renamed from: c */
    public void mo16981c(Map<String, Object> map, String str) {
        if (!this.f2146c) {
            this.f2146c = true;
            this.f2147d = str;
            HostActivity.m9833q(this.f2144a, new C2173a(map));
        }
    }

    public String getName() {
        return "wechat";
    }

    /* renamed from: m */
    public String mo17005m(String str, long j, String str2) {
        try {
            String jSONObject = new JSONObject().put(getName(), new JSONObject().put("code", str).put("providerUID", str2)).toString();
            C2103f.m3056b("WeChatProvider", "Provider sessions: " + jSONObject);
            return jSONObject;
        } catch (Exception e) {
            this.f2146c = false;
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public final void mo17006n(Map<String, Object> map, BaseResp baseResp, Activity activity) {
        int i = baseResp.errCode;
        if (i == -4) {
            mo17000g("authentication_denied");
        } else if (i == -2) {
            mo16998e();
        } else if (i == 0) {
            try {
                mo17002i(map, mo17005m(((SendAuth.Resp) baseResp).code, -1, this.f2152g), this.f2147d);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (activity != null) {
            this.f2154i = null;
            activity.finish();
        }
    }
}
