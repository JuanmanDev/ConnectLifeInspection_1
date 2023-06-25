package p040c.p200q.p363c.p400x;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p400x.C6813d0;

/* renamed from: c.q.c.x.f0 */
/* compiled from: DisplayNotification */
public class C6823f0 {

    /* renamed from: a */
    public final ExecutorService f13064a;

    /* renamed from: b */
    public final Context f13065b;

    /* renamed from: c */
    public final C6843n0 f13066c;

    public C6823f0(Context context, C6843n0 n0Var, ExecutorService executorService) {
        this.f13064a = executorService;
        this.f13065b = context;
        this.f13066c = n0Var;
    }

    /* renamed from: a */
    public boolean mo31601a() {
        if (this.f13066c.mo31645a("gcm.n.noui")) {
            return true;
        }
        if (mo31602b()) {
            return false;
        }
        C6837k0 d = mo31604d();
        C6813d0.C6814a e = C6813d0.m19327e(this.f13065b, this.f13066c);
        mo31605e(e.f13046a, d);
        mo31603c(e);
        return true;
    }

    /* renamed from: b */
    public final boolean mo31602b() {
        if (((KeyguardManager) this.f13065b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C3562m.m9085f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f13065b.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo31603c(C6813d0.C6814a aVar) {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.f13065b.getSystemService("notification")).notify(aVar.f13047b, aVar.f13048c, aVar.f13046a.build());
    }

    @Nullable
    /* renamed from: d */
    public final C6837k0 mo31604d() {
        C6837k0 c = C6837k0.m19393c(this.f13066c.mo31659p("gcm.n.image"));
        if (c != null) {
            c.mo31636f(this.f13064a);
        }
        return c;
    }

    /* renamed from: e */
    public final void mo31605e(NotificationCompat.Builder builder, @Nullable C6837k0 k0Var) {
        if (k0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C5777m.m16410b(k0Var.mo31634d(), 5, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (ExecutionException e) {
                "Failed to download image: " + e.getCause();
            } catch (InterruptedException unused) {
                k0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                k0Var.close();
            }
        }
    }
}
