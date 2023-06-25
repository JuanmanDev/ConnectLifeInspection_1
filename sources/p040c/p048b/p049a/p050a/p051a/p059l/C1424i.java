package p040c.p048b.p049a.p050a.p051a.p059l;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.identity.auth.device.dataobject.Profile;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.l.i */
/* compiled from: ProfileDataSource */
public class C1424i extends C1418c<Profile> {

    /* renamed from: c */
    public static final String f541c = "c.b.a.a.a.l.i";

    /* renamed from: d */
    public static final String[] f542d = Profile.f6933q;

    /* renamed from: e */
    public static C1424i f543e;

    /* renamed from: f */
    public static C1416a f544f;

    public C1424i(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: s */
    public static synchronized C1424i m567s(Context context) {
        C1424i iVar;
        synchronized (C1424i.class) {
            if (f543e == null) {
                C1485a.m828a(f541c, "Creating new ProfileDataSource");
                f543e = new C1424i(C1475d.m805c(context));
                f544f = new C1416a(context, "ProfileDataSource");
            }
            f544f.mo15171i(f543e);
            iVar = f543e;
        }
        return iVar;
    }

    /* renamed from: k */
    public String[] mo15192k() {
        return f542d;
    }

    /* renamed from: m */
    public String mo15194m() {
        return f541c;
    }

    /* renamed from: n */
    public String mo15195n() {
        return "Profile";
    }

    /* renamed from: r */
    public Profile mo15182a(Cursor cursor) {
        if (!(cursor == null || cursor.getCount() == 0)) {
            try {
                Profile profile = new Profile();
                profile.mo21498v(cursor.getLong(mo15193l(cursor, Profile.COL_INDEX.ID.colId)));
                profile.mo21495s(cursor.getString(mo15193l(cursor, Profile.COL_INDEX.APP_ID.colId)));
                profile.mo21497u(C1423h.m565d(cursor.getString(mo15193l(cursor, Profile.COL_INDEX.EXPIRATION_TIME.colId))));
                profile.mo21496t(f544f.mo15170g(cursor.getString(mo15193l(cursor, Profile.COL_INDEX.DATA.colId))));
                return profile;
            } catch (Exception e) {
                String str = f541c;
                C1485a.m830c(str, "" + e.getMessage(), e);
            }
        }
        return null;
    }

    /* renamed from: t */
    public Profile mo15207t(String str) {
        return (Profile) mo15191j("AppId", str);
    }
}
