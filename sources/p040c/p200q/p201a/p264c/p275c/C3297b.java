package p040c.p200q.p201a.p264c.p275c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.cloudmessaging.zzd;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p264c.p294g.p299e.C3637a;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* renamed from: c.q.a.c.c.b */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public class C3297b {

    /* renamed from: h */
    public static int f6142h;

    /* renamed from: i */
    public static PendingIntent f6143i;

    /* renamed from: j */
    public static final Executor f6144j = C3296a0.f6141e;

    /* renamed from: k */
    public static final Pattern f6145k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    public final SimpleArrayMap<String, C5773k<Bundle>> f6146a = new SimpleArrayMap<>();

    /* renamed from: b */
    public final Context f6147b;

    /* renamed from: c */
    public final C3316u f6148c;

    /* renamed from: d */
    public final ScheduledExecutorService f6149d;

    /* renamed from: e */
    public Messenger f6150e;

    /* renamed from: f */
    public Messenger f6151f;

    /* renamed from: g */
    public zzd f6152g;

    public C3297b(@NonNull Context context) {
        this.f6147b = context;
        this.f6148c = new C3316u(context);
        this.f6150e = new Messenger(new C3299d(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6149d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static /* synthetic */ C5771j m8364b(Bundle bundle) {
        if (m8368j(bundle)) {
            return C5777m.m16414f(null);
        }
        return C5777m.m16414f(bundle);
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m8365d(C3297b bVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C3301f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        bVar.f6152g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f6151f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            sb.toString();
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                new String("Received InstanceID error ");
                            }
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2 && "ID".equals(split[1])) {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(RunnerArgs.CLASSPATH_SEPARATOR)) {
                                    str2 = str2.substring(1);
                                }
                                bVar.mo20342i(str, intent2.putExtra("error", str2).getExtras());
                            } else if (stringExtra2.length() != 0) {
                                "Unexpected structured response ".concat(stringExtra2);
                            } else {
                                new String("Unexpected structured response ");
                            }
                        } else {
                            synchronized (bVar.f6146a) {
                                for (int i = 0; i < bVar.f6146a.size(); i++) {
                                    bVar.mo20342i(bVar.f6146a.keyAt(i), intent2.getExtras());
                                }
                            }
                        }
                    } else {
                        Matcher matcher = f6145k.matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            if (group != null) {
                                Bundle extras = intent2.getExtras();
                                extras.putString("registration_id", group2);
                                bVar.mo20342i(group, extras);
                            }
                        } else if (!Log.isLoggable("Rpc", 3)) {
                        } else {
                            if (stringExtra.length() != 0) {
                                "Unexpected response string: ".concat(stringExtra);
                            } else {
                                new String("Unexpected response string: ");
                            }
                        }
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        "Unexpected response action: ".concat(valueOf2);
                    } else {
                        new String("Unexpected response action: ");
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static synchronized String m8366g() {
        String num;
        synchronized (C3297b.class) {
            int i = f6142h;
            f6142h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    public static synchronized void m8367h(Context context, Intent intent) {
        synchronized (C3297b.class) {
            if (f6143i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f6143i = C3637a.m9182a(context, 0, intent2, C3637a.f6585a);
            }
            intent.putExtra("app", f6143i);
        }
    }

    /* renamed from: j */
    public static boolean m8368j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    /* renamed from: a */
    public C5771j<Bundle> mo20338a(@NonNull Bundle bundle) {
        if (this.f6148c.mo20375a() >= 12000000) {
            return C3315t.m8391b(this.f6147b).mo20372d(1, bundle).mo28849j(f6144j, C3318w.f6189a);
        }
        if (this.f6148c.mo20376b() != 0) {
            return mo20341f(bundle).mo28850k(f6144j, new C3317v(this, bundle));
        }
        return C5777m.m16413e(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    @NonNull
    /* renamed from: c */
    public final /* synthetic */ C5771j mo20339c(@NonNull Bundle bundle, @NonNull C5771j jVar) {
        if (jVar.mo28856q() && m8368j((Bundle) jVar.mo28852m())) {
            return mo20341f(bundle).mo28858s(f6144j, C3320y.f6193a);
        }
        return jVar;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo20340e(@NonNull String str, @NonNull ScheduledFuture scheduledFuture, @NonNull C5771j jVar) {
        synchronized (this.f6146a) {
            this.f6146a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @AnyThread
    /* renamed from: f */
    public final C5771j<Bundle> mo20341f(Bundle bundle) {
        String g = m8366g();
        C5773k kVar = new C5773k();
        synchronized (this.f6146a) {
            this.f6146a.put(g, kVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f6148c.mo20376b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m8367h(this.f6147b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            sb2.toString();
        }
        intent.putExtra("google.messenger", this.f6150e);
        if (!(this.f6151f == null && this.f6152g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f6151f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f6152g.mo24478b(obtain);
                }
            } catch (RemoteException unused) {
                boolean isLoggable = Log.isLoggable("Rpc", 3);
            }
            kVar.mo28859a().mo28843d(f6144j, new C3319x(this, g, this.f6149d.schedule(new C3321z(kVar), 30, TimeUnit.SECONDS)));
            return kVar.mo28859a();
        }
        if (this.f6148c.mo20376b() == 2) {
            this.f6147b.sendBroadcast(intent);
        } else {
            this.f6147b.startService(intent);
        }
        kVar.mo28859a().mo28843d(f6144j, new C3319x(this, g, this.f6149d.schedule(new C3321z(kVar), 30, TimeUnit.SECONDS)));
        return kVar.mo28859a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20342i(java.lang.String r3, @androidx.annotation.Nullable android.os.Bundle r4) {
        /*
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, c.q.a.c.m.k<android.os.Bundle>> r0 = r2.f6146a
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<java.lang.String, c.q.a.c.m.k<android.os.Bundle>> r1 = r2.f6146a     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            c.q.a.c.m.k r1 = (p040c.p200q.p201a.p264c.p347m.C5773k) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.mo28861c(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p275c.C3297b.mo20342i(java.lang.String, android.os.Bundle):void");
    }
}
