package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.identity.auth.device.dataobject.CodePair;
import java.net.URI;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p051a.p067t.C1479h;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.f */
/* compiled from: CodePairDataSource */
public class C1421f extends C1418c<CodePair> {

    /* renamed from: c */
    public static final String f531c = "c.b.a.a.a.l.f";

    /* renamed from: d */
    public static final String[] f532d = CodePair.f6922u;

    /* renamed from: e */
    public static C1421f f533e;

    /* renamed from: f */
    public static C1416a f534f;

    public C1421f(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: s */
    public static synchronized C1421f m550s(Context context) {
        C1421f fVar;
        synchronized (C1421f.class) {
            if (f533e == null) {
                C1485a.m828a(f531c, "Creating CodePairDataSource instance");
                f533e = new C1421f(C1475d.m805c(context));
                f534f = new C1416a(context, "CodePairDataSource");
            }
            f534f.mo15171i(f533e);
            fVar = f533e;
        }
        return fVar;
    }

    /* renamed from: k */
    public String[] mo15192k() {
        return f532d;
    }

    /* renamed from: m */
    public String mo15194m() {
        return f531c;
    }

    /* renamed from: n */
    public String mo15195n() {
        return "CodePair";
    }

    /* renamed from: r */
    public CodePair mo15182a(Cursor cursor) {
        if (!(cursor == null || cursor.getCount() == 0)) {
            try {
                String string = cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.APP_ID.colId));
                String string2 = cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.USER_CODE.colId));
                String g = f534f.mo15170g(cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.DEVICE_CODE.colId)));
                String string3 = cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.VERIFICATION_URI.colId));
                CodePair codePair = new CodePair(string, string2, g, new URI(string3), cursor.getInt(mo15193l(cursor, CodePair.COL_INDEX.INTERVAL.colId)), C1423h.m565d(cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.CREATION_TIME.colId))), C1423h.m565d(cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.EXPIRATION_TIME.colId))), C1479h.m817b(cursor.getString(mo15193l(cursor, CodePair.COL_INDEX.SCOPES.colId))));
                codePair.mo15167h(cursor.getLong(mo15193l(cursor, CodePair.COL_INDEX.ID.colId)));
                return codePair;
            } catch (Exception e) {
                String str = f531c;
                C1485a.m830c(str, "" + e.getMessage(), e);
            }
        }
        return null;
    }
}
