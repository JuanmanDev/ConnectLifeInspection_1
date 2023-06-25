package p040c.p200q.p201a.p264c.p340i.p342b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.a.c.i.b.p */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5595p extends C5589o5 {

    /* renamed from: c */
    public long f10732c;

    /* renamed from: d */
    public String f10733d;

    /* renamed from: e */
    public AccountManager f10734e;

    /* renamed from: f */
    public Boolean f10735f;

    /* renamed from: g */
    public long f10736g;

    public C5595p(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: j */
    public final boolean mo28227j() {
        Calendar instance = Calendar.getInstance();
        this.f10732c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        this.f10733d = lowerCase + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + lowerCase2;
        return false;
    }

    @WorkerThread
    /* renamed from: o */
    public final long mo28511o() {
        mo28029h();
        return this.f10736g;
    }

    /* renamed from: p */
    public final long mo28512p() {
        mo28502k();
        return this.f10732c;
    }

    /* renamed from: q */
    public final String mo28513q() {
        mo28502k();
        return this.f10733d;
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo28514r() {
        mo28029h();
        this.f10735f = null;
        this.f10736g = 0;
    }

    @WorkerThread
    /* renamed from: s */
    public final boolean mo28515s() {
        mo28029h();
        long a = this.f10699a.mo28488c().mo20838a();
        if (a - this.f10736g > 86400000) {
            this.f10735f = null;
        }
        Boolean bool = this.f10735f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.f10699a.mo28490f(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f10699a.mo28487b().mo28346y().mo28259a("Permission error checking for dasher/unicorn accounts");
            this.f10736g = a;
            this.f10735f = Boolean.FALSE;
            return false;
        }
        if (this.f10734e == null) {
            this.f10734e = AccountManager.get(this.f10699a.mo28490f());
        }
        try {
            Account[] result = this.f10734e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f10734e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f10735f = Boolean.TRUE;
                    this.f10736g = a;
                    return true;
                }
                this.f10736g = a;
                this.f10735f = Boolean.FALSE;
                return false;
            }
            this.f10735f = Boolean.TRUE;
            this.f10736g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f10699a.mo28487b().mo28341t().mo28260b("Exception checking account types", e);
        }
    }
}
