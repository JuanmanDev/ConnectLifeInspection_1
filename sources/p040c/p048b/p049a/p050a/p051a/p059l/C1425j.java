package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.j */
/* compiled from: RequestedScopeDataSource */
public final class C1425j extends C1418c<RequestedScope> {

    /* renamed from: c */
    public static final String f545c = "c.b.a.a.a.l.j";

    /* renamed from: d */
    public static final String[] f546d = RequestedScope.f6939s;

    /* renamed from: e */
    public static C1425j f547e;

    public C1425j(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: u */
    public static synchronized C1425j m574u(Context context) {
        C1425j jVar;
        synchronized (C1425j.class) {
            if (f547e == null) {
                f547e = new C1425j(C1475d.m805c(context));
            }
            jVar = f547e;
        }
        return jVar;
    }

    /* renamed from: k */
    public String[] mo15192k() {
        return f546d;
    }

    /* renamed from: m */
    public String mo15194m() {
        return f545c;
    }

    /* renamed from: n */
    public String mo15195n() {
        return "RequestedScope";
    }

    /* renamed from: r */
    public RequestedScope mo15182a(Cursor cursor) {
        if (!(cursor == null || cursor.getCount() == 0)) {
            try {
                RequestedScope requestedScope = new RequestedScope();
                requestedScope.mo15167h(cursor.getLong(mo15193l(cursor, RequestedScope.COL_INDEX.ROW_ID.colId)));
                requestedScope.mo21514u(cursor.getString(mo15193l(cursor, RequestedScope.COL_INDEX.SCOPE.colId)));
                requestedScope.mo21510q(cursor.getString(mo15193l(cursor, RequestedScope.COL_INDEX.APP_FAMILY_ID.colId)));
                requestedScope.mo21513t(cursor.getString(mo15193l(cursor, RequestedScope.COL_INDEX.DIRECTED_ID.colId)));
                requestedScope.mo21511r(cursor.getLong(mo15193l(cursor, RequestedScope.COL_INDEX.AUTHORIZATION_ACCESS_TOKEN_ID.colId)));
                requestedScope.mo21512s(cursor.getLong(mo15193l(cursor, RequestedScope.COL_INDEX.AUTHORIZATION_REFRESH_TOKEN_ID.colId)));
                return requestedScope;
            } catch (Exception e) {
                String str = f545c;
                C1485a.m830c(str, "" + e.getMessage(), e);
            }
        }
        return null;
    }

    /* renamed from: s */
    public List<RequestedScope> mo15209s(String str) {
        return mo15188g(f546d[RequestedScope.COL_INDEX.APP_FAMILY_ID.colId], str);
    }

    /* renamed from: t */
    public RequestedScope mo15210t(String str, String str2, String str3) {
        return (RequestedScope) mo15190i(new String[]{f546d[RequestedScope.COL_INDEX.SCOPE.colId], f546d[RequestedScope.COL_INDEX.APP_FAMILY_ID.colId], f546d[RequestedScope.COL_INDEX.DIRECTED_ID.colId]}, new String[]{str, str2, str3});
    }
}
