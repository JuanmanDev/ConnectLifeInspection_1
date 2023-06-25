package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.d */
/* compiled from: AppInfoDataSource */
public final class C1419d extends C1418c<AppInfo> {

    /* renamed from: c */
    public static final String f524c = "c.b.a.a.a.l.d";

    /* renamed from: d */
    public static final String[] f525d = AppInfo.f6902w;

    /* renamed from: e */
    public static C1419d f526e;

    public C1419d(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: s */
    public static synchronized C1419d m537s(Context context) {
        C1419d dVar;
        synchronized (C1419d.class) {
            if (f526e == null) {
                f526e = new C1419d(C1475d.m805c(context));
            }
            dVar = f526e;
        }
        return dVar;
    }

    /* renamed from: k */
    public String[] mo15192k() {
        return f525d;
    }

    /* renamed from: m */
    public String mo15194m() {
        return f524c;
    }

    /* renamed from: n */
    public String mo15195n() {
        return "AppInfo";
    }

    /* renamed from: r */
    public AppInfo mo15182a(Cursor cursor) {
        if (!(cursor == null || cursor.getCount() == 0)) {
            try {
                AppInfo appInfo = new AppInfo();
                appInfo.mo15167h(cursor.getLong(mo15193l(cursor, AppInfo.COL_INDEX.ROW_ID.colId)));
                appInfo.mo21454w(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.APP_FAMILY_ID.colId)));
                appInfo.mo21455x(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.APP_VARIANT_ID.colId)));
                appInfo.mo21437C(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.PACKAGE_NAME.colId)));
                appInfo.mo21453v(C1475d.m809g(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.ALLOWED_SCOPES.colId)), RunnerArgs.CLASS_SEPARATOR));
                appInfo.mo21436B(C1475d.m809g(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.GRANTED_PERMISSIONS.colId)), RunnerArgs.CLASS_SEPARATOR));
                appInfo.mo21457z(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.CLIENT_ID.colId)));
                appInfo.mo21456y(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.AUTHZ_HOST.colId)));
                appInfo.mo21435A(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.EXCHANGE_HOST.colId)));
                appInfo.mo21438D(cursor.getString(mo15193l(cursor, AppInfo.COL_INDEX.PAYLOAD.colId)));
                return appInfo;
            } catch (Exception e) {
                String str = f524c;
                C1485a.m830c(str, "" + e.getMessage(), e);
            }
        }
        return null;
    }
}
