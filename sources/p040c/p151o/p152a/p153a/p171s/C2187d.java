package p040c.p151o.p152a.p153a.p171s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.gigya.android.sdk.encryption.EncryptionException;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.C2102e;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p158l.C2132a;
import p040c.p151o.p152a.p153a.p166o.C2153a;
import p040c.p151o.p152a.p153a.p174u.C2202c;

/* renamed from: c.o.a.a.s.d */
/* compiled from: SessionService */
public class C2187d implements C2184a {

    /* renamed from: a */
    public final Context f2168a;

    /* renamed from: b */
    public final C2153a f2169b;

    /* renamed from: c */
    public final C2132a f2170c;

    /* renamed from: d */
    public C2186c f2171d;

    /* renamed from: e */
    public ArrayMap<String, C2102e> f2172e;

    /* renamed from: f */
    public CountDownTimer f2173f;

    /* renamed from: c.o.a.a.s.d$a */
    /* compiled from: SessionService */
    public class C2188a extends CountDownTimer {
        public C2188a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            C2187d.this.f2169b.mo16966e(0);
            if (C2187d.this.f2171d == null || C2187d.this.f2171d.mo17026d()) {
                C2103f.m3056b("SessionService", "startSessionCountdown: Session expiration countdown done! Session is invalid");
                C2187d.this.mo17019c(true);
                LocalBroadcastManager.getInstance(C2187d.this.f2168a).sendBroadcast(new Intent("intent_action_session_expired"));
            }
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: a */
    public boolean mo17017a() {
        C2186c cVar = this.f2171d;
        boolean z = true;
        boolean z2 = cVar != null && cVar.mo17026d();
        long f = this.f2169b.mo16967f();
        if (!z2 || f <= 0) {
            return z2;
        }
        if (System.currentTimeMillis() >= f) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public C2186c mo17018b() {
        return this.f2171d;
    }

    /* renamed from: c */
    public void mo17019c(boolean z) {
        C2103f.m3056b("SessionService", "clear: ");
        this.f2171d = null;
        if (z) {
            this.f2169b.mo16968g();
            this.f2169b.mo16962a("DEFAULT");
        }
    }

    /* renamed from: d */
    public void mo17020d(C2186c cVar) {
        C2103f.m3056b("SessionService", "setSession: ");
        this.f2171d = cVar;
        mo17029k(cVar);
        mo17027i();
        if (this.f2171d.mo17023a() > 0) {
            this.f2169b.mo16966e(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(this.f2171d.mo17023a()));
            mo17031m();
        }
    }

    /* renamed from: e */
    public void mo17021e() {
        CountDownTimer countDownTimer = this.f2173f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f2173f = null;
        }
    }

    /* renamed from: i */
    public final void mo17027i() {
        if (!this.f2172e.isEmpty()) {
            for (Map.Entry<String, C2102e> value : this.f2172e.entrySet()) {
                C2102e eVar = (C2102e) value.getValue();
                C2103f.m3056b("SessionService", "Apply interception for: " + eVar.mo16864a());
                eVar.mo16865b();
            }
        }
    }

    @SuppressLint({"GetInstance"})
    @Nullable
    /* renamed from: j */
    public String mo17028j(String str, Key key) {
        try {
            Cipher instance = Cipher.getInstance("AES");
            instance.init(1, key);
            return C2202c.m3347a(instance.doFinal(str.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new EncryptionException("encryptSession: exception" + e.getMessage(), e.getCause());
        }
    }

    /* renamed from: k */
    public void mo17029k(C2186c cVar) {
        String str;
        String str2;
        if (this.f2169b.mo16971j().equals("DEFAULT")) {
            try {
                JSONObject jSONObject = new JSONObject();
                Long l = null;
                if (cVar == null) {
                    str = null;
                } else {
                    str = cVar.mo17025c();
                }
                JSONObject put = jSONObject.put("sessionToken", str);
                if (cVar == null) {
                    str2 = null;
                } else {
                    str2 = cVar.mo17024b();
                }
                JSONObject put2 = put.put("sessionSecret", str2);
                if (cVar != null) {
                    l = Long.valueOf(cVar.mo17023a());
                }
                this.f2169b.mo16964c(mo17028j(put2.put("expirationTime", l).toString(), this.f2170c.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: l */
    public final void mo17030l(long j) {
        C2103f.m3056b("SessionService", "startSessionCountdown: Session is set to expire in: " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        mo17021e();
        this.f2173f = new C2188a(j, TimeUnit.SECONDS.toMillis(1)).start();
    }

    /* renamed from: m */
    public void mo17031m() {
        C2103f.m3056b("SessionService", "startSessionCountdownTimerIfNeeded: ");
        long currentTimeMillis = System.currentTimeMillis();
        long f = this.f2169b.mo16967f();
        long j = f - currentTimeMillis;
        C2186c cVar = this.f2171d;
        if (cVar != null && cVar.mo17026d() && f > 0) {
            mo17030l(j);
        }
    }
}
