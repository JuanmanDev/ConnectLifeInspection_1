package p040c.p200q.p363c.p400x;

import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: c.q.c.x.u0 */
/* compiled from: SharedPreferencesQueue */
public final class C6858u0 {

    /* renamed from: a */
    public final SharedPreferences f13125a;

    /* renamed from: b */
    public final String f13126b;

    /* renamed from: c */
    public final String f13127c;
    @VisibleForTesting
    @GuardedBy("internalQueue")

    /* renamed from: d */
    public final ArrayDeque<String> f13128d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f13129e;
    @GuardedBy("internalQueue")

    /* renamed from: f */
    public boolean f13130f = false;

    public C6858u0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f13125a = sharedPreferences;
        this.f13126b = str;
        this.f13127c = str2;
        this.f13129e = executor;
    }

    @WorkerThread
    /* renamed from: b */
    public static C6858u0 m19486b(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C6858u0 u0Var = new C6858u0(sharedPreferences, str, str2, executor);
        u0Var.mo31682c();
        return u0Var;
    }

    @GuardedBy("internalQueue")
    /* renamed from: a */
    public final boolean mo31681a(boolean z) {
        if (z && !this.f13130f) {
            mo31687h();
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31682c() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f13128d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f13128d     // Catch:{ all -> 0x0041 }
            r1.clear()     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences r1 = r6.f13125a     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = r6.f13126b     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0041 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = r6.f13127c     // Catch:{ all -> 0x0041 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            java.lang.String r2 = r6.f13127c     // Catch:{ all -> 0x0041 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0041 }
            int r2 = r1.length     // Catch:{ all -> 0x0041 }
            int r2 = r1.length     // Catch:{ all -> 0x0041 }
            r3 = 0
        L_0x002b:
            if (r3 >= r2) goto L_0x003d
            r4 = r1[r3]     // Catch:{ all -> 0x0041 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0041 }
            if (r5 != 0) goto L_0x003a
            java.util.ArrayDeque<java.lang.String> r5 = r6.f13128d     // Catch:{ all -> 0x0041 }
            r5.add(r4)     // Catch:{ all -> 0x0041 }
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6858u0.mo31682c():void");
    }

    @Nullable
    /* renamed from: d */
    public String mo31683d() {
        String peek;
        synchronized (this.f13128d) {
            peek = this.f13128d.peek();
        }
        return peek;
    }

    /* renamed from: e */
    public boolean mo31684e(@Nullable Object obj) {
        boolean remove;
        synchronized (this.f13128d) {
            remove = this.f13128d.remove(obj);
            mo31681a(remove);
        }
        return remove;
    }

    @GuardedBy("internalQueue")
    @NonNull
    /* renamed from: f */
    public String mo31685f() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f13128d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f13127c);
        }
        return sb.toString();
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo31686g() {
        synchronized (this.f13128d) {
            this.f13125a.edit().putString(this.f13126b, mo31685f()).commit();
        }
    }

    /* renamed from: h */
    public final void mo31687h() {
        this.f13129e.execute(new C6869z(this));
    }
}
