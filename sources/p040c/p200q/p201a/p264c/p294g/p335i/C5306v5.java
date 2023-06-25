package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.core.app.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.v5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5306v5 implements C4981a6 {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: h */
    public static final Map f10188h = new ArrayMap();

    /* renamed from: i */
    public static final String[] f10189i = {Person.KEY_KEY, "value"};

    /* renamed from: a */
    public final ContentResolver f10190a;

    /* renamed from: b */
    public final Uri f10191b;

    /* renamed from: c */
    public final Runnable f10192c;

    /* renamed from: d */
    public final ContentObserver f10193d = new C5291u5(this, (Handler) null);

    /* renamed from: e */
    public final Object f10194e = new Object();

    /* renamed from: f */
    public volatile Map f10195f;
    @GuardedBy("this")

    /* renamed from: g */
    public final List f10196g = new ArrayList();

    public C5306v5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        if (contentResolver == null) {
            throw null;
        } else if (uri != null) {
            this.f10190a = contentResolver;
            this.f10191b = uri;
            this.f10192c = runnable;
            contentResolver.registerContentObserver(uri, false, this.f10193d);
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p264c.p294g.p335i.C5306v5 m15121a(android.content.ContentResolver r3, android.net.Uri r4, java.lang.Runnable r5) {
        /*
            java.lang.Class<c.q.a.c.g.i.v5> r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5306v5.class
            monitor-enter(r0)
            java.util.Map r1 = f10188h     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            c.q.a.c.g.i.v5 r1 = (p040c.p200q.p201a.p264c.p294g.p335i.C5306v5) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            c.q.a.c.g.i.v5 r2 = new c.q.a.c.g.i.v5     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4, r5)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map r3 = f10188h     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5306v5.m15121a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):c.q.a.c.g.i.v5");
    }

    /* renamed from: e */
    public static synchronized void m15122e() {
        synchronized (C5306v5.class) {
            for (C5306v5 v5Var : f10188h.values()) {
                v5Var.f10190a.unregisterContentObserver(v5Var.f10193d);
            }
            f10188h.clear();
        }
    }

    /* renamed from: b */
    public final Map mo27817b() {
        Map map;
        Map map2 = this.f10195f;
        if (map2 == null) {
            synchronized (this.f10194e) {
                map2 = this.f10195f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C5351y5.m15362a(new C5276t5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.f10195f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public final /* synthetic */ Map mo27818c() {
        Map map;
        Cursor query = this.f10190a.query(this.f10191b, f10189i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo26935d(String str) {
        return (String) mo27817b().get(str);
    }

    /* renamed from: f */
    public final void mo27819f() {
        synchronized (this.f10194e) {
            this.f10195f = null;
            this.f10192c.run();
        }
        synchronized (this) {
            for (C5321w5 zza : this.f10196g) {
                zza.zza();
            }
        }
    }
}
