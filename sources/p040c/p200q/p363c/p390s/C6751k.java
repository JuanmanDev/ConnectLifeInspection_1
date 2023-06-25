package p040c.p200q.p363c.p390s;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: c.q.c.s.k */
/* compiled from: HeartBeatInfoStorage */
public class C6751k {

    /* renamed from: a */
    public final SharedPreferences f12908a;

    public C6751k(Context context, String str) {
        this.f12908a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void mo31422a() {
        long j = this.f12908a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f12908a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f12908a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f12908a.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: b */
    public synchronized void mo31423b() {
        SharedPreferences.Editor edit = this.f12908a.edit();
        for (Map.Entry next : this.f12908a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<C6752l> mo31424c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f12908a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(C6752l.m19110a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo31433l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String mo31425d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    public final synchronized String mo31426e(String str) {
        for (Map.Entry next : this.f12908a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized boolean mo31427f(long j, long j2) {
        return mo31425d(j).equals(mo31425d(j2));
    }

    /* renamed from: g */
    public synchronized void mo31428g() {
        String d = mo31425d(System.currentTimeMillis());
        this.f12908a.edit().putString("last-used-date", d).commit();
        mo31429h(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31429h(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.mo31426e(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.f12908a     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.f12908a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.f12908a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p390s.C6751k.mo31429h(java.lang.String):void");
    }

    /* renamed from: i */
    public synchronized boolean mo31430i(long j) {
        return mo31431j("fire-global", j);
    }

    /* renamed from: j */
    public synchronized boolean mo31431j(String str, long j) {
        if (!this.f12908a.contains(str)) {
            this.f12908a.edit().putLong(str, j).commit();
            return true;
        } else if (mo31427f(this.f12908a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f12908a.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* renamed from: k */
    public synchronized void mo31432k(long j, String str) {
        String d = mo31425d(j);
        if (!this.f12908a.getString("last-used-date", "").equals(d)) {
            long j2 = this.f12908a.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                mo31422a();
                j2 = this.f12908a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f12908a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.f12908a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        }
    }

    /* renamed from: l */
    public synchronized void mo31433l(long j) {
        this.f12908a.edit().putLong("fire-global", j).commit();
    }
}
