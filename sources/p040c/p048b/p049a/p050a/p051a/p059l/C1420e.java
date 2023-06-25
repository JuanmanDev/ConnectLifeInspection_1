package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import p040c.p048b.p049a.p050a.p051a.p058k.C1414b;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.e */
/* compiled from: AuthorizationTokenDataSource */
public final class C1420e extends C1418c<AuthorizationToken> {

    /* renamed from: c */
    public static final String f527c = "c.b.a.a.a.l.e";

    /* renamed from: d */
    public static final String[] f528d = AuthorizationToken.f6913u;

    /* renamed from: e */
    public static C1420e f529e;

    /* renamed from: f */
    public static C1416a f530f;

    public C1420e(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: t */
    public static synchronized C1420e m543t(Context context) {
        C1420e eVar;
        synchronized (C1420e.class) {
            if (f529e == null) {
                C1485a.m828a(f527c, "Creating AuthTokenDataSource Instance");
                f529e = new C1420e(C1475d.m805c(context));
                f530f = new C1416a(context, "AuthTokenDataSource");
            }
            f530f.mo15171i(f529e);
            eVar = f529e;
        }
        return eVar;
    }

    /* renamed from: k */
    public String[] mo15192k() {
        return f528d;
    }

    /* renamed from: m */
    public String mo15194m() {
        return f527c;
    }

    /* renamed from: n */
    public String mo15195n() {
        return "AuthorizationToken";
    }

    /* renamed from: r */
    public AuthorizationToken mo15182a(Cursor cursor) {
        if (!(cursor == null || cursor.getCount() == 0)) {
            try {
                AuthorizationToken a = C1414b.m502a(AuthorizationToken.AUTHZ_TOKEN_TYPE.values()[cursor.getInt(mo15193l(cursor, AuthorizationToken.COL_INDEX.TYPE.colId))]);
                a.mo21471v(cursor.getLong(mo15193l(cursor, AuthorizationToken.COL_INDEX.ID.colId)));
                a.mo21467r(cursor.getString(mo15193l(cursor, AuthorizationToken.COL_INDEX.APP_FAMILY_ID.colId)));
                a.mo21473x(f530f.mo15170g(cursor.getString(mo15193l(cursor, AuthorizationToken.COL_INDEX.TOKEN.colId))));
                a.mo21468s(C1423h.m565d(cursor.getString(mo15193l(cursor, AuthorizationToken.COL_INDEX.CREATION_TIME.colId))));
                a.mo21470u(C1423h.m565d(cursor.getString(mo15193l(cursor, AuthorizationToken.COL_INDEX.EXPIRATION_TIME.colId))));
                a.mo21472w(cursor.getBlob(mo15193l(cursor, AuthorizationToken.COL_INDEX.MISC_DATA.colId)));
                a.mo21469t(cursor.getString(mo15193l(cursor, AuthorizationToken.COL_INDEX.DIRECTED_ID.colId)));
                return a;
            } catch (Exception e) {
                String str = f527c;
                C1485a.m830c(str, "" + e.getMessage(), e);
            }
        }
        return null;
    }

    /* renamed from: s */
    public AuthorizationToken mo15200s(long j) {
        return (AuthorizationToken) mo15189h(j);
    }
}
