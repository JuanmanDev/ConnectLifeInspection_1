package p040c.p200q.p201a.p264c.p276d;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabx;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3381h;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3391k0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3448b0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3463e0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3557h;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p276d.p291o.C3571a;
import p040c.p200q.p201a.p264c.p294g.p298d.C3635e;

/* renamed from: c.q.a.c.d.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3324b extends C3326c {

    /* renamed from: d */
    public static final Object f6199d = new Object();

    /* renamed from: e */
    public static final C3324b f6200e = new C3324b();
    @GuardedBy("mLock")

    /* renamed from: c */
    public String f6201c;

    @NonNull
    /* renamed from: m */
    public static C3324b m8405m() {
        return f6200e;
    }

    @Nullable
    /* renamed from: b */
    public Intent mo20385b(@Nullable Context context, int i, @Nullable String str) {
        return super.mo20385b(context, i, str);
    }

    @Nullable
    /* renamed from: c */
    public PendingIntent mo20386c(@NonNull Context context, int i, int i2) {
        return super.mo20386c(context, i, i2);
    }

    @NonNull
    /* renamed from: e */
    public final String mo20387e(int i) {
        return super.mo20387e(i);
    }

    /* renamed from: g */
    public int mo20388g(@NonNull Context context) {
        return super.mo20388g(context);
    }

    /* renamed from: h */
    public int mo20389h(@NonNull Context context, int i) {
        return super.mo20389h(context, i);
    }

    /* renamed from: j */
    public final boolean mo20390j(int i) {
        return super.mo20390j(i);
    }

    @Nullable
    /* renamed from: k */
    public Dialog mo20391k(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return mo20395p(activity, i, C3463e0.m8841b(activity, mo20385b(activity, i, "d"), i2), onCancelListener);
    }

    @Nullable
    /* renamed from: l */
    public PendingIntent mo20392l(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        if (connectionResult.mo24486S()) {
            return connectionResult.mo24485R();
        }
        return mo20386c(context, connectionResult.mo24483P(), 0);
    }

    /* renamed from: n */
    public boolean mo20393n(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog k = mo20391k(activity, i, i2, onCancelListener);
        if (k == null) {
            return false;
        }
        mo20398s(activity, k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: o */
    public void mo20394o(@NonNull Context context, int i) {
        mo20399t(context, i, (String) null, mo20404d(context, i, 0, "n"));
    }

    @Nullable
    /* renamed from: p */
    public final Dialog mo20395p(@NonNull Context context, int i, C3463e0 e0Var, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C3448b0.m8745d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C3448b0.m8744c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, e0Var);
        }
        String g = C3448b0.m8748g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)});
        new IllegalArgumentException();
        return builder.create();
    }

    @NonNull
    /* renamed from: q */
    public final Dialog mo20396q(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C3448b0.m8745d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo20398s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    /* renamed from: r */
    public final zabx mo20397r(Context context, C3391k0 k0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(RunnerArgs.ARGUMENT_TEST_PACKAGE);
        zabx zabx = new zabx(k0Var);
        context.registerReceiver(zabx, intentFilter);
        zabx.mo24555a(context);
        if (mo20405i(context, "com.google.android.gms")) {
            return zabx;
        }
        k0Var.mo20568a();
        zabx.mo24556b();
        return null;
    }

    /* renamed from: s */
    public final void mo20398s(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.m10860q(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.m10855a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: t */
    public final void mo20399t(Context context, int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        new IllegalArgumentException();
        if (i == 18) {
            mo20400u(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
            }
        } else {
            String f = C3448b0.m8747f(context, i);
            String e = C3448b0.m8746e(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            C3495o.m8908j(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(f).setStyle(new NotificationCompat.BigTextStyle().bigText(e));
            if (C3557h.m9070c(context)) {
                C3495o.m8911m(C3562m.m9084e());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C3557h.m9071d(context)) {
                    style.addAction(R$drawable.common_full_open_on_phone, resources.getString(R$string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R$string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(e);
            }
            if (C3562m.m9087h()) {
                C3495o.m8911m(C3562m.m9087h());
                synchronized (f6199d) {
                    str2 = this.f6201c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = C3448b0.m8743b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                style.setChannelId(str2);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                C3330e.f6211b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        }
    }

    /* renamed from: u */
    public final void mo20400u(Context context) {
        new C3574p(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: v */
    public final boolean mo20401v(@NonNull Activity activity, @NonNull C3381h hVar, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog p = mo20395p(activity, i, C3463e0.m8842c(hVar, mo20385b(activity, i, "d"), 2), onCancelListener);
        if (p == null) {
            return false;
        }
        mo20398s(activity, p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: w */
    public final boolean mo20402w(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i) {
        PendingIntent l;
        if (C3571a.m9102a(context) || (l = mo20392l(context, connectionResult)) == null) {
            return false;
        }
        mo20399t(context, connectionResult.mo24483P(), (String) null, C3635e.m9181a(context, 0, GoogleApiActivity.m10861a(context, l, i, true), C3635e.f6584a | 134217728));
        return true;
    }
}
