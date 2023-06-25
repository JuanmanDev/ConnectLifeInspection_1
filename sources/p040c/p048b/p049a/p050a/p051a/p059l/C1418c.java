package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.identity.auth.device.datastore.EncryptionException;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.c */
/* compiled from: AbstractDataSource */
public abstract class C1418c<K extends C1413a> {

    /* renamed from: b */
    public static final String f522b = "c.b.a.a.a.l.c";

    /* renamed from: a */
    public SQLiteDatabase f523a;

    public C1418c(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            this.f523a = sQLiteDatabase;
            return;
        }
        throw new IllegalArgumentException("database can't be null!");
    }

    /* renamed from: o */
    public static String m520o(String[] strArr, String[] strArr2) {
        String str;
        String str2;
        if (strArr == null && strArr2 == null) {
            return null;
        }
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException("Both arguments have to be either null or not null!");
        } else if (strArr.length == strArr2.length) {
            String str3 = "";
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(strArr[i]);
                if (strArr2[i] == null) {
                    str = " IS NULL";
                } else {
                    str = " = '" + strArr2[i] + "'";
                }
                sb.append(str);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                if (i != strArr.length - 1) {
                    str2 = " AND ";
                } else {
                    str2 = "";
                }
                sb3.append(str2);
                str3 = sb3.toString();
            }
            return str3;
        } else {
            throw new IllegalArgumentException("selectionFields and selectionValues differ in length!");
        }
    }

    /* renamed from: a */
    public abstract K mo15182a(Cursor cursor);

    /* renamed from: b */
    public int mo15183b() {
        return mo15185d((String[]) null, (String[]) null);
    }

    /* renamed from: c */
    public boolean mo15184c(long j) {
        SQLiteDatabase sQLiteDatabase = this.f523a;
        String n = mo15195n();
        StringBuilder sb = new StringBuilder();
        sb.append("rowid = ");
        sb.append(j);
        return sQLiteDatabase.delete(n, sb.toString(), (String[]) null) == 1;
    }

    /* renamed from: d */
    public int mo15185d(String[] strArr, String[] strArr2) {
        try {
            return this.f523a.delete(mo15195n(), m520o(strArr, strArr2), (String[]) null);
        } catch (Exception e) {
            String m = mo15194m();
            C1485a.m830c(m, "" + e.getMessage(), e);
            return 0;
        }
    }

    /* renamed from: e */
    public List<K> mo15186e() {
        return mo15187f((String[]) null, (String[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r1 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        return r0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<K> mo15187f(java.lang.String[] r11, java.lang.String[] r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r5 = m520o(r11, r12)     // Catch:{ Exception -> 0x0044 }
            android.database.sqlite.SQLiteDatabase r2 = r10.f523a     // Catch:{ Exception -> 0x0044 }
            java.lang.String r3 = r10.mo15195n()     // Catch:{ Exception -> 0x0044 }
            java.lang.String[] r4 = r10.mo15192k()     // Catch:{ Exception -> 0x0044 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0044 }
            if (r1 == 0) goto L_0x003c
            r1.moveToFirst()     // Catch:{ Exception -> 0x0044 }
        L_0x0021:
            boolean r11 = r1.isAfterLast()     // Catch:{ Exception -> 0x0044 }
            if (r11 != 0) goto L_0x003c
            c.b.a.a.a.k.a r11 = r10.mo15182a(r1)     // Catch:{ Exception -> 0x0044 }
            if (r11 == 0) goto L_0x0034
            r0.add(r11)     // Catch:{ Exception -> 0x0044 }
            r1.moveToNext()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0021
        L_0x0034:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0044 }
            java.lang.String r12 = "cursor contains invalid object!"
            r11.<init>(r12)     // Catch:{ Exception -> 0x0044 }
            throw r11     // Catch:{ Exception -> 0x0044 }
        L_0x003c:
            if (r1 == 0) goto L_0x0067
        L_0x003e:
            r1.close()
            goto L_0x0067
        L_0x0042:
            r11 = move-exception
            goto L_0x0068
        L_0x0044:
            r11 = move-exception
            java.lang.String r12 = r10.mo15194m()     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = ""
            r2.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = r11.getMessage()     // Catch:{ all -> 0x0042 }
            r2.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0042 }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r12, r2, r11)     // Catch:{ all -> 0x0042 }
            r0.clear()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0067
            goto L_0x003e
        L_0x0067:
            return r0
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.close()
        L_0x006d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p059l.C1418c.mo15187f(java.lang.String[], java.lang.String[]):java.util.List");
    }

    /* renamed from: g */
    public List<K> mo15188g(String str, String str2) {
        return mo15187f(new String[]{str}, new String[]{str2});
    }

    /* renamed from: h */
    public K mo15189h(long j) {
        return mo15190i(new String[]{"rowid"}, new String[]{"" + j});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r10 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r10 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r10.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public K mo15190i(java.lang.String[] r10, java.lang.String[] r11) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r4 = m520o(r10, r11)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            android.database.sqlite.SQLiteDatabase r1 = r9.f523a     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.String r2 = r9.mo15195n()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.String[] r3 = r9.mo15192k()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            if (r10 == 0) goto L_0x0023
            r10.moveToFirst()     // Catch:{ Exception -> 0x0021 }
            c.b.a.a.a.k.a r0 = r9.mo15182a(r10)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0023
        L_0x0021:
            r11 = move-exception
            goto L_0x002d
        L_0x0023:
            if (r10 == 0) goto L_0x004c
        L_0x0025:
            r10.close()
            goto L_0x004c
        L_0x0029:
            r11 = move-exception
            goto L_0x004f
        L_0x002b:
            r11 = move-exception
            r10 = r0
        L_0x002d:
            java.lang.String r1 = r9.mo15194m()     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r2.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r3 = ""
            r2.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r11.getMessage()     // Catch:{ all -> 0x004d }
            r2.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004d }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r1, r2, r11)     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x004c
            goto L_0x0025
        L_0x004c:
            return r0
        L_0x004d:
            r11 = move-exception
            r0 = r10
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.close()
        L_0x0054:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p059l.C1418c.mo15190i(java.lang.String[], java.lang.String[]):c.b.a.a.a.k.a");
    }

    /* renamed from: j */
    public K mo15191j(String str, String str2) {
        return mo15190i(new String[]{str}, new String[]{str2});
    }

    /* renamed from: k */
    public abstract String[] mo15192k();

    /* renamed from: l */
    public int mo15193l(Cursor cursor, int i) {
        if (i >= 0 && i < mo15192k().length) {
            return cursor.getColumnIndexOrThrow(mo15192k()[i]);
        }
        throw new IllegalArgumentException("colIndex is out of bound!");
    }

    /* renamed from: m */
    public abstract String mo15194m();

    /* renamed from: n */
    public abstract String mo15195n();

    /* renamed from: p */
    public long mo15196p(K k, Context context) {
        if (k == null) {
            return -1;
        }
        try {
            C1485a.m836i(f522b, "Insert Row table=" + mo15195n(), "vals=" + k.mo15164e(context));
            long insert = this.f523a.insert(mo15195n(), (String) null, k.mo15164e(context));
            k.mo15167h(insert);
            return insert;
        } catch (EncryptionException e) {
            C1485a.m830c(f522b, "insertRow failed", e);
            return -1;
        }
    }

    /* renamed from: q */
    public boolean mo15197q(long j, ContentValues contentValues) {
        if (contentValues == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = this.f523a;
        String n = mo15195n();
        StringBuilder sb = new StringBuilder();
        sb.append("rowid = ");
        sb.append(j);
        return sQLiteDatabase.update(n, contentValues, sb.toString(), (String[]) null) == 1;
    }
}
