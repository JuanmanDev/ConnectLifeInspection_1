package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;

/* renamed from: c.q.a.c.i.b.b3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5431b3 extends C5432b4 {

    /* renamed from: c */
    public final C5713z2 f10349c;

    /* renamed from: d */
    public boolean f10350d;

    public C5431b3(C5648t4 t4Var) {
        super(t4Var);
        Context f = this.f10699a.mo28490f();
        this.f10699a.mo28649z();
        this.f10349c = new C5713z2(this, f, "google_app_measurement_local.db");
    }

    /* renamed from: n */
    public final boolean mo28061n() {
        return false;
    }

    @WorkerThread
    /* renamed from: o */
    public final SQLiteDatabase mo28096o() {
        if (this.f10350d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10349c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f10350d = true;
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:70|71|72|73) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:85|86|87|88) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:57|58|59|60|202) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r1.f10699a.mo28487b().mo28339r().mo28259a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.f10699a.mo28487b().mo28339r().mo28259a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r1.f10699a.mo28487b().mo28339r().mo28259a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x010c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0144 */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e0 A[SYNTHETIC, Splitter:B:128:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0205 A[SYNTHETIC, Splitter:B:156:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0252 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo28097p(int r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r22.mo28029h()
            boolean r0 = r1.f10350d
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r22.mo28100s()
            if (r0 == 0) goto L_0x0273
            r6 = 5
            r7 = 0
            r9 = r6
            r8 = r7
        L_0x001e:
            if (r8 >= r6) goto L_0x0263
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r22.mo28096o()     // Catch:{ SQLiteFullException -> 0x0238, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x0200, all -> 0x01fd }
            if (r15 != 0) goto L_0x002a
            r1.f10350d = r10     // Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f4, SQLiteException -> 0x01ef, all -> 0x01ea }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01f8, SQLiteDatabaseLockedException -> 0x01f4, SQLiteException -> 0x01ef, all -> 0x01ea }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ all -> 0x01db }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01db }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r23 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01d7 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01d3 }
            r20 = -1
            if (r0 == 0) goto L_0x005d
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01d3 }
            if (r11 == 0) goto L_0x0078
            r11.close()     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            goto L_0x0078
        L_0x005d:
            if (r11 == 0) goto L_0x0076
            r11.close()     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            goto L_0x0076
        L_0x0063:
            r0 = move-exception
            r14 = r23
            goto L_0x01ec
        L_0x0068:
            r0 = move-exception
            r14 = r23
            goto L_0x01f1
        L_0x006d:
            r14 = r23
            goto L_0x01f5
        L_0x0071:
            r0 = move-exception
            r14 = r23
            goto L_0x01fa
        L_0x0076:
            r12 = r20
        L_0x0078:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            r14 = r0
            r15 = r11
            goto L_0x008b
        L_0x0089:
            r14 = r4
            r15 = r14
        L_0x008b:
            java.lang.String r0 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r13 = new java.lang.String[]{r2, r0, r11}     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            java.lang.String r12 = "messages"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r0 = 100
            java.lang.String r19 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
            r11 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x0071, SQLiteDatabaseLockedException -> 0x006d, SQLiteException -> 0x0068, all -> 0x0063 }
        L_0x00a7:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            if (r0 == 0) goto L_0x0187
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r12 = 2
            byte[] r13 = r11.getBlob(r12)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            if (r0 != 0) goto L_0x00f1
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00da }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00da }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00da }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r0 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ ParseException -> 0x00da }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00da }
            com.google.android.gms.measurement.internal.zzaw r0 = (com.google.android.gms.measurement.internal.zzaw) r0     // Catch:{ ParseException -> 0x00da }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            if (r0 == 0) goto L_0x00a7
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x00d8:
            r0 = move-exception
            goto L_0x00ed
        L_0x00da:
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x00d8 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x00d8 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.mo28259a(r13)     // Catch:{ all -> 0x00d8 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x00ed:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
        L_0x00f1:
            if (r0 != r10) goto L_0x0129
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x010c }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x010c }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x010c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzkw> r0 = com.google.android.gms.measurement.internal.zzkw.CREATOR     // Catch:{ ParseException -> 0x010c }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x010c }
            com.google.android.gms.measurement.internal.zzkw r0 = (com.google.android.gms.measurement.internal.zzkw) r0     // Catch:{ ParseException -> 0x010c }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x011f
        L_0x010a:
            r0 = move-exception
            goto L_0x0125
        L_0x010c:
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x010a }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x010a }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ all -> 0x010a }
            java.lang.String r13 = "Failed to load user property from local database"
            r0.mo28259a(r13)     // Catch:{ all -> 0x010a }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r0 = r4
        L_0x011f:
            if (r0 == 0) goto L_0x00a7
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x0125:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
        L_0x0129:
            if (r0 != r12) goto L_0x0162
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x0144 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x0144 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x0144 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzac> r0 = com.google.android.gms.measurement.internal.zzac.CREATOR     // Catch:{ ParseException -> 0x0144 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x0144 }
            com.google.android.gms.measurement.internal.zzac r0 = (com.google.android.gms.measurement.internal.zzac) r0     // Catch:{ ParseException -> 0x0144 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x0157
        L_0x0142:
            r0 = move-exception
            goto L_0x015e
        L_0x0144:
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0142 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ all -> 0x0142 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ all -> 0x0142 }
            java.lang.String r13 = "Failed to load conditional user property from local database"
            r0.mo28259a(r13)     // Catch:{ all -> 0x0142 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r0 = r4
        L_0x0157:
            if (r0 == 0) goto L_0x00a7
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x015e:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
        L_0x0162:
            r12 = 3
            if (r0 != r12) goto L_0x0176
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = "Skipping app launch break"
            r0.mo28259a(r12)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x0176:
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = "Unknown record type in local database"
            r0.mo28259a(r12)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            goto L_0x00a7
        L_0x0187:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            r0[r7] = r12     // Catch:{ SQLiteFullException -> 0x01cf, SQLiteDatabaseLockedException -> 0x01cc, SQLiteException -> 0x01c8, all -> 0x01c3 }
            java.lang.String r12 = "messages"
            java.lang.String r13 = "rowid <= ?"
            r14 = r23
            int r0 = r14.delete(r12, r13, r0)     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            int r12 = r5.size()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            if (r0 >= r12) goto L_0x01ae
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            java.lang.String r12 = "Fewer entries removed from local database than expected"
            r0.mo28259a(r12)     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
        L_0x01ae:
            r14.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            r14.endTransaction()     // Catch:{ SQLiteFullException -> 0x01c1, SQLiteDatabaseLockedException -> 0x01f6, SQLiteException -> 0x01bf, all -> 0x01bd }
            if (r11 == 0) goto L_0x01b9
            r11.close()
        L_0x01b9:
            r14.close()
            return r5
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c6
        L_0x01bf:
            r0 = move-exception
            goto L_0x01f2
        L_0x01c1:
            r0 = move-exception
            goto L_0x01fb
        L_0x01c3:
            r0 = move-exception
            r14 = r23
        L_0x01c6:
            r4 = r11
            goto L_0x01ec
        L_0x01c8:
            r0 = move-exception
            r14 = r23
            goto L_0x01f2
        L_0x01cc:
            r14 = r23
            goto L_0x01f6
        L_0x01cf:
            r0 = move-exception
            r14 = r23
            goto L_0x01fb
        L_0x01d3:
            r0 = move-exception
            r14 = r23
            goto L_0x01de
        L_0x01d7:
            r0 = move-exception
            r14 = r23
            goto L_0x01dd
        L_0x01db:
            r0 = move-exception
            r14 = r15
        L_0x01dd:
            r11 = r4
        L_0x01de:
            if (r11 == 0) goto L_0x01e3
            r11.close()     // Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01e6, all -> 0x01e4 }
        L_0x01e3:
            throw r0     // Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01f5, SQLiteException -> 0x01e6, all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e6:
            r0 = move-exception
            goto L_0x01f1
        L_0x01e8:
            r0 = move-exception
            goto L_0x01fa
        L_0x01ea:
            r0 = move-exception
            r14 = r15
        L_0x01ec:
            r15 = r14
            goto L_0x0258
        L_0x01ef:
            r0 = move-exception
            r14 = r15
        L_0x01f1:
            r11 = r4
        L_0x01f2:
            r15 = r14
            goto L_0x0203
        L_0x01f4:
            r14 = r15
        L_0x01f5:
            r11 = r4
        L_0x01f6:
            r15 = r14
            goto L_0x0227
        L_0x01f8:
            r0 = move-exception
            r14 = r15
        L_0x01fa:
            r11 = r4
        L_0x01fb:
            r15 = r14
            goto L_0x023b
        L_0x01fd:
            r0 = move-exception
            r15 = r4
            goto L_0x0258
        L_0x0200:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0203:
            if (r15 == 0) goto L_0x020e
            boolean r12 = r15.inTransaction()     // Catch:{ all -> 0x0256 }
            if (r12 == 0) goto L_0x020e
            r15.endTransaction()     // Catch:{ all -> 0x0256 }
        L_0x020e:
            c.q.a.c.i.b.t4 r12 = r1.f10699a     // Catch:{ all -> 0x0256 }
            c.q.a.c.i.b.i3 r12 = r12.mo28487b()     // Catch:{ all -> 0x0256 }
            c.q.a.c.i.b.g3 r12 = r12.mo28339r()     // Catch:{ all -> 0x0256 }
            r12.mo28260b(r3, r0)     // Catch:{ all -> 0x0256 }
            r1.f10350d = r10     // Catch:{ all -> 0x0256 }
            if (r11 == 0) goto L_0x0222
            r11.close()
        L_0x0222:
            if (r15 == 0) goto L_0x0252
            goto L_0x0234
        L_0x0225:
            r11 = r4
            r15 = r11
        L_0x0227:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0256 }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x0232
            r11.close()
        L_0x0232:
            if (r15 == 0) goto L_0x0252
        L_0x0234:
            r15.close()
            goto L_0x0252
        L_0x0238:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x023b:
            c.q.a.c.i.b.t4 r12 = r1.f10699a     // Catch:{ all -> 0x0256 }
            c.q.a.c.i.b.i3 r12 = r12.mo28487b()     // Catch:{ all -> 0x0256 }
            c.q.a.c.i.b.g3 r12 = r12.mo28339r()     // Catch:{ all -> 0x0256 }
            r12.mo28260b(r3, r0)     // Catch:{ all -> 0x0256 }
            r1.f10350d = r10     // Catch:{ all -> 0x0256 }
            if (r11 == 0) goto L_0x024f
            r11.close()
        L_0x024f:
            if (r15 == 0) goto L_0x0252
            goto L_0x0234
        L_0x0252:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0256:
            r0 = move-exception
            r4 = r11
        L_0x0258:
            if (r4 == 0) goto L_0x025d
            r4.close()
        L_0x025d:
            if (r15 == 0) goto L_0x0262
            r15.close()
        L_0x0262:
            throw r0
        L_0x0263:
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo28259a(r2)
            return r4
        L_0x0273:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5431b3.mo28097p(int):java.util.List");
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo28098q() {
        int delete;
        mo28029h();
        try {
            SQLiteDatabase o = mo28096o();
            if (o != null && (delete = o.delete(NotificationCompat.CarExtender.KEY_MESSAGES, (String) null, (String[]) null)) > 0) {
                this.f10699a.mo28487b().mo28343v().mo28260b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    /* renamed from: r */
    public final boolean mo28099r() {
        return mo28105x(3, new byte[0]);
    }

    /* renamed from: s */
    public final boolean mo28100s() {
        Context f = this.f10699a.mo28490f();
        this.f10699a.mo28649z();
        return f.getDatabasePath("google_app_measurement_local.db").exists();
    }

    @WorkerThread
    /* renamed from: t */
    public final boolean mo28101t() {
        mo28029h();
        if (!this.f10350d && mo28100s()) {
            int i = 5;
            int i2 = 0;
            while (i2 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase o = mo28096o();
                    if (o == null) {
                        this.f10350d = true;
                        return false;
                    }
                    o.beginTransaction();
                    o.delete(NotificationCompat.CarExtender.KEY_MESSAGES, "type == ?", new String[]{Integer.toString(3)});
                    o.setTransactionSuccessful();
                    o.endTransaction();
                    o.close();
                    return true;
                } catch (SQLiteFullException e) {
                    this.f10699a.mo28487b().mo28339r().mo28260b("Error deleting app launch break from local database", e);
                    this.f10350d = true;
                    if (sQLiteDatabase == null) {
                        i2++;
                    }
                    sQLiteDatabase.close();
                    i2++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i);
                    i += 20;
                    if (sQLiteDatabase == null) {
                        i2++;
                    }
                    sQLiteDatabase.close();
                    i2++;
                } catch (SQLiteException e2) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f10699a.mo28487b().mo28339r().mo28260b("Error deleting app launch break from local database", e2);
                    this.f10350d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i2++;
                    } else {
                        i2++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f10699a.mo28487b().mo28344w().mo28259a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo28102u(zzac zzac) {
        byte[] c0 = this.f10699a.mo28629N().mo28293c0(zzac);
        if (c0.length <= 131072) {
            return mo28105x(2, c0);
        }
        this.f10699a.mo28487b().mo28341t().mo28259a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: v */
    public final boolean mo28103v(zzaw zzaw) {
        Parcel obtain = Parcel.obtain();
        C5655u.m16139a(zzaw, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return mo28105x(0, marshall);
        }
        this.f10699a.mo28487b().mo28341t().mo28259a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: w */
    public final boolean mo28104w(zzkw zzkw) {
        Parcel obtain = Parcel.obtain();
        C5438ba.m15558a(zzkw, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return mo28105x(1, marshall);
        }
        this.f10699a.mo28487b().mo28341t().mo28259a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28105x(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo28029h()
            boolean r0 = r1.f10350d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            r0.mo28649z()
            r4 = 5
            r5 = r2
            r6 = r4
        L_0x0028:
            if (r5 >= r4) goto L_0x012d
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.mo28096o()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.f10350d = r7     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            r11 = 0
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0054
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            goto L_0x0121
        L_0x0050:
            r0 = move-exception
            goto L_0x00b9
        L_0x0052:
            r0 = move-exception
            goto L_0x00bd
        L_0x0054:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x009f
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r0.mo28259a(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r0[r2] = r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r0 = r9.delete(r15, r4, r0)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r11 = (long) r0     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x009f
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r0.mo28262d(r4, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009f:
            r9.insertOrThrow(r15, r8, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            r9.close()
            r2 = 1
            return r2
        L_0x00b2:
            r8 = r10
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            goto L_0x0122
        L_0x00b7:
            r0 = move-exception
            r10 = r8
        L_0x00b9:
            r8 = r9
            goto L_0x00c4
        L_0x00bb:
            r0 = move-exception
            r10 = r8
        L_0x00bd:
            r8 = r9
            goto L_0x00fd
        L_0x00bf:
            r0 = move-exception
            r9 = r8
            goto L_0x0122
        L_0x00c2:
            r0 = move-exception
            r10 = r8
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00cf
            r8.endTransaction()     // Catch:{ all -> 0x011f }
        L_0x00cf:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x011f }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x011f }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo28260b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f10350d = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x00e6
            r10.close()
        L_0x00e6:
            if (r8 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e9:
            r9 = r8
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b4 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fb:
            r0 = move-exception
            r10 = r8
        L_0x00fd:
            c.q.a.c.i.b.t4 r2 = r1.f10699a     // Catch:{ all -> 0x011f }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ all -> 0x011f }
            c.q.a.c.i.b.g3 r2 = r2.mo28339r()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo28260b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f10350d = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x0114
            r10.close()
        L_0x0114:
            if (r8 == 0) goto L_0x0119
        L_0x0116:
            r8.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r9 = r8
        L_0x0121:
            r8 = r10
        L_0x0122:
            if (r8 == 0) goto L_0x0127
            r8.close()
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()
        L_0x012c:
            throw r0
        L_0x012d:
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo28259a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5431b3.mo28105x(int, byte[]):boolean");
    }
}
