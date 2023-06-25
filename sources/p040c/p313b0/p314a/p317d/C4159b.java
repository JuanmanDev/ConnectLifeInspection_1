package p040c.p313b0.p314a.p317d;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.b0.a.d.b */
/* compiled from: CredentialDao */
public class C4159b {

    /* renamed from: a */
    public C4161d f8763a;

    /* renamed from: b */
    public String[] f8764b = {"_id", "username", "password", "protection_space_id"};

    public C4159b(C4161d dVar) {
        this.f8763a = dVar;
    }

    /* renamed from: a */
    public long mo25489a(C4158a aVar) {
        return (long) this.f8763a.getWritableDatabase().delete("credential", "_id = ?", new String[]{aVar.f8759a.toString()});
    }

    /* renamed from: b */
    public C4158a mo25490b(String str, String str2, Long l) {
        Cursor query = this.f8763a.getReadableDatabase().query("credential", this.f8764b, "username = ? AND password = ? AND protection_space_id = ?", new String[]{str, str2, l.toString()}, (String) null, (String) null, (String) null);
        C4158a aVar = query.moveToNext() ? new C4158a(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("_id"))), query.getString(query.getColumnIndexOrThrow("username")), query.getString(query.getColumnIndexOrThrow("password")), l) : null;
        query.close();
        return aVar;
    }

    /* renamed from: c */
    public List<C4158a> mo25491c(Long l) {
        Cursor query = this.f8763a.getReadableDatabase().query("credential", this.f8764b, "protection_space_id = ?", new String[]{l.toString()}, (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(new C4158a(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("_id"))), query.getString(query.getColumnIndexOrThrow("username")), query.getString(query.getColumnIndexOrThrow("password")), l));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public long mo25492d(C4158a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", aVar.f8760b);
        contentValues.put("password", aVar.f8761c);
        contentValues.put("protection_space_id", aVar.f8762d);
        return this.f8763a.getWritableDatabase().insert("credential", (String) null, contentValues);
    }

    /* renamed from: e */
    public long mo25493e(C4158a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", aVar.f8760b);
        contentValues.put("password", aVar.f8761c);
        return (long) this.f8763a.getWritableDatabase().update("credential", contentValues, "protection_space_id = ?", new String[]{aVar.f8762d.toString()});
    }
}
