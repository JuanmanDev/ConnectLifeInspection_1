package p040c.p151o.p152a.p153a.p167p.p168c;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.gigya.android.sdk.p309ui.HostActivity;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.api.LineApiClientBuilder;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginApi;
import com.linecorp.linesdk.auth.LineLoginResult;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p174u.C2203d;

/* renamed from: c.o.a.a.p.c.d */
/* compiled from: LineProvider */
public class C2164d extends C2168e {

    /* renamed from: g */
    public C2203d f2138g;

    /* renamed from: c.o.a.a.p.c.d$a */
    /* compiled from: LineProvider */
    public class C2165a extends HostActivity.C3954a {

        /* renamed from: a */
        public final /* synthetic */ Map f2139a;

        /* renamed from: b */
        public final /* synthetic */ String f2140b;

        public C2165a(Map map, String str) {
            this.f2139a = map;
            this.f2140b = str;
        }

        /* renamed from: a */
        public void mo16986a(AppCompatActivity appCompatActivity, int i, int i2, @Nullable Intent intent) {
            if (i == 1) {
                LineLoginResult loginResultFromIntent = LineLoginApi.getLoginResultFromIntent(intent);
                int i3 = C2166b.f2142a[loginResultFromIntent.getResponseCode().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        C2164d.this.mo17000g(loginResultFromIntent.getErrorData().getMessage());
                    } else {
                        C2164d.this.mo16998e();
                    }
                } else if (loginResultFromIntent.getLineCredential() != null) {
                    String tokenString = loginResultFromIntent.getLineCredential().getAccessToken().getTokenString();
                    C2164d dVar = C2164d.this;
                    dVar.mo17002i(this.f2139a, dVar.mo16993k(tokenString, -1, (String) null), this.f2140b);
                } else {
                    return;
                }
                appCompatActivity.finish();
            }
        }

        /* renamed from: b */
        public void mo16987b(AppCompatActivity appCompatActivity, @Nullable Bundle bundle) {
            String b = C2164d.this.f2138g.mo17059b("lineChannelID");
            if (b == null) {
                C2164d.this.mo17000g("Channel Id not available");
                appCompatActivity.finish();
                return;
            }
            appCompatActivity.startActivityForResult(LineLoginApi.getLoginIntent(appCompatActivity, b, new LineAuthenticationParams.Builder().scopes(Arrays.asList(new Scope[]{Scope.PROFILE})).build()), 1);
        }
    }

    /* renamed from: c.o.a.a.p.c.d$b */
    /* compiled from: LineProvider */
    public static /* synthetic */ class C2166b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2142a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.linecorp.linesdk.LineApiResponseCode[] r0 = com.linecorp.linesdk.LineApiResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2142a = r0
                com.linecorp.linesdk.LineApiResponseCode r1 = com.linecorp.linesdk.LineApiResponseCode.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2142a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.linecorp.linesdk.LineApiResponseCode r1 = com.linecorp.linesdk.LineApiResponseCode.CANCEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p151o.p152a.p153a.p167p.p168c.C2164d.C2166b.<clinit>():void");
        }
    }

    /* renamed from: c.o.a.a.p.c.d$c */
    /* compiled from: LineProvider */
    public static class C2167c extends AsyncTask<Void, Void, LineApiResponse> {

        /* renamed from: a */
        public LineApiClient f2143a;

        public C2167c(LineApiClient lineApiClient) {
            this.f2143a = lineApiClient;
        }

        /* renamed from: a */
        public LineApiResponse doInBackground(Void... voidArr) {
            return this.f2143a.logout();
        }

        /* renamed from: b */
        public void onPostExecute(LineApiResponse lineApiResponse) {
            if (lineApiResponse.isSuccess()) {
                C2103f.m3056b("LineLoginProvider", "Line logout success");
            } else {
                C2103f.m3057c("LineLoginProvider", "Line logout error");
            }
            this.f2143a = null;
        }
    }

    /* renamed from: l */
    public static boolean m3256l(C2203d dVar) {
        try {
            String b = dVar.mo17059b("lineChannelID");
            Class.forName("com.linecorp.linesdk.auth.LineLoginApi");
            if (b != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo16980a() {
        super.mo16980a();
        String b = this.f2138g.mo17059b("lineChannelID");
        if (b != null) {
            new C2167c(new LineApiClientBuilder(this.f2144a, b).build()).execute(new Void[0]);
        }
    }

    /* renamed from: c */
    public void mo16981c(Map<String, Object> map, String str) {
        if (!this.f2146c) {
            this.f2146c = true;
            this.f2147d = str;
            HostActivity.m9833q(this.f2144a, new C2165a(map, str));
        }
    }

    public String getName() {
        return "line";
    }

    /* renamed from: k */
    public String mo16993k(String str, long j, String str2) {
        try {
            return new JSONObject().put(getName(), new JSONObject().put("authToken", str)).toString();
        } catch (Exception e) {
            this.f2146c = false;
            e.printStackTrace();
            return null;
        }
    }
}
