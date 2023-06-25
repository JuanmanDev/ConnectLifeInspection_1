package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import com.internationalwinecooler.model.WineFilterModelKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.h */
/* compiled from: DatabaseHelper */
public final class C1423h extends SQLiteOpenHelper {

    /* renamed from: e */
    public static final String f539e = C1423h.class.getName();

    /* renamed from: l */
    public static final long f540l = TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS);

    public C1423h(Context context) {
        super(context, "MAPDataStore.db", (SQLiteDatabase.CursorFactory) null, 9);
        C1485a.m836i(f539e, "DatabaseHelper created ver=9", "MAP_DB_NAME=MAPDataStore.db");
    }

    /* renamed from: a */
    public static void m562a(Context context) {
        C1485a.m832e(f539e, "Clearing Authorization Locally");
        C1419d.m537s(context).mo15183b();
        C1420e.m543t(context).mo15183b();
        C1425j.m574u(context).mo15183b();
        C1424i.m567s(context).mo15183b();
        C1421f.m550s(context).mo15183b();
    }

    /* renamed from: b */
    public static SimpleDateFormat m563b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* renamed from: c */
    public static SimpleDateFormat m564c() {
        return new SimpleDateFormat(WineFilterModelKt.COMMON_FORMAT, Locale.US);
    }

    /* renamed from: d */
    public static Date m565d(String str) {
        if (str.endsWith("Z")) {
            return m563b().parse(str);
        }
        return m564c().parse(str);
    }

    /* renamed from: e */
    public static Date m566e(Date date) {
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        long j = f540l;
        date.setTime((time / j) * j);
        return date;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1485a.m832e(f539e, "onCreate called");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AppInfo (AppFamilyId TEXT NOT NULL, PackageName TEXT NOT NULL, AllowedScopes TEXT, GrantedPermissions TEXT, ClientId TEXT, AppVariantId TEXT,AuthzHost TEXT, ExchangeHost TEXT, Payload TEXT,UNIQUE (PackageName), PRIMARY KEY (AppVariantId))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS app_info_index_pkg_name ON AppInfo (PackageName)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS app_info_index_app_variant_id ON AppInfo (AppVariantId)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RequestedScope (Scope TEXT NOT NULL, AppId TEXT NOT NULL, DirectedId TEXT, AtzAccessTokenId INTEGER NOT NULL, AtzRefreshTokenId INTEGER NOT NULL, PRIMARY KEY (Scope,AppId,AtzAccessTokenId,AtzRefreshTokenId))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS requested_scope_index_scope ON RequestedScope (Scope)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS requested_scope_index_app_id ON RequestedScope (AppId)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS requested_scope_index_atz_access_token_id ON RequestedScope (AtzAccessTokenId)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS requested_scope_index_directed_id ON RequestedScope (DirectedId)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS requested_scope_index_atz_refresh_token_id ON RequestedScope (AtzRefreshTokenId)");
        sQLiteDatabase.execSQL("CREATE TRIGGER IF NOT EXISTS requested_scope_valid_atz_access_token_id BEFORE INSERT ON RequestedScope FOR EACH ROW BEGIN SELECT CASE WHEN (new.AtzAccessTokenId != " + RequestedScope.OUTCOME.UNKNOWN.longVal + " AND new." + "AtzAccessTokenId" + " != " + RequestedScope.OUTCOME.REJECTED.longVal + " AND new." + "AtzAccessTokenId" + " < " + RequestedScope.OUTCOME.GRANTED_LOCALLY.longVal + ") THEN RAISE(ABORT, 'Invalid authorization token ID') END; END;");
        sQLiteDatabase.execSQL("CREATE TRIGGER IF NOT EXISTS requested_scope_valid_atz_refresh_token_id BEFORE INSERT ON RequestedScope FOR EACH ROW BEGIN SELECT CASE WHEN (new.AtzRefreshTokenId != " + RequestedScope.OUTCOME.UNKNOWN.longVal + " AND new." + "AtzRefreshTokenId" + " != " + RequestedScope.OUTCOME.REJECTED.longVal + " AND new." + "AtzRefreshTokenId" + " < " + RequestedScope.OUTCOME.GRANTED_LOCALLY.longVal + ") THEN RAISE(ABORT, 'Invalid authorization token ID') END; END;");
        C1485a.m828a(f539e, "Attempting to create authorizationTokenTable TABLE");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AuthorizationToken (Id INTEGER PRIMARY KEY AUTOINCREMENT, AppId TEXT NOT NULL, Token TEXT NOT NULL, CreationTime DATETIME NOT NULL, ExpirationTime DATETIME NOT NULL, MiscData BLOB, type INTEGER NOT NULL, directedId TEXT )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS authz_token_index_app_id ON AuthorizationToken (AppId)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS authz_token_index_directed_id ON AuthorizationToken (directedId)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AuthorizationCode (Id INTEGER PRIMARY KEY AUTOINCREMENT, Code TEXT NOT NULL, AppId TEXT NOT NULL, AuthorizationTokenId INTEGER NOT NULL )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS authz_code_index_app_id ON AuthorizationCode (AppId)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS authz_code_index_token_id ON AuthorizationCode (AuthorizationTokenId)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Profile (Id INTEGER PRIMARY KEY AUTOINCREMENT, ExpirationTime DATETIME NOT NULL, AppId TEXT NOT NULL, Data TEXT NOT NULL )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS profile_index_app_id ON Profile (AppId)");
        sQLiteDatabase.compileStatement("CREATE TABLE IF NOT EXISTS CodePair (Id INTEGER PRIMARY KEY AUTOINCREMENT, UserCode TEXT NOT NULL, DeviceCode TEXT NOT NULL, VerificationUri TEXT NOT NULL, Interval INTEGER NOT NULL, CreationTime DATETIME NOT NULL, ExpirationTime DATETIME NOT NULL, AppId TEXT NOT NULL, Scopes TEXT NOT NULL )").execute();
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = f539e;
        C1485a.m832e(str, "onUpgrade called old=" + i + " new=" + i2);
        if (i < 4 && i2 >= 4) {
            C1485a.m832e(f539e, "Doing upgrades for 4");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AuthorizationToken");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RequestedScope");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AppInfo");
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS RequestedScope.requested_scope_index_directed_id");
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS RequestedScope.requested_scope_index_atz_token_id");
            sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS requested_scope_valid_atz_token_id");
        }
        if (i < 5 && i2 >= 5) {
            C1485a.m832e(f539e, "Doing upgrades for 5");
        }
        if (i < 6 && i2 >= 6) {
            C1485a.m832e(f539e, "Doing upgrades for 6");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AppInfo");
        }
        if ((i < 8 && i2 >= 8) || (i < 9 && i2 >= 9)) {
            C1485a.m832e(f539e, "Doing upgrades for 8");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AppInfo");
        }
        if (i2 <= 9) {
            onCreate(sQLiteDatabase);
            return;
        }
        throw new IllegalStateException("Database version was updated, but no upgrade was done ver=8");
    }
}
