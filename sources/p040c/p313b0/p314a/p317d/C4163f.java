package p040c.p313b0.p314a.p317d;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2ExchangeCodec;

/* renamed from: c.b0.a.d.f */
/* compiled from: ProtectionSpaceDao */
public class C4163f {

    /* renamed from: a */
    public C4161d f8774a;

    /* renamed from: b */
    public String[] f8775b = {"_id", Http2ExchangeCodec.HOST, "protocol", "realm", "port"};

    public C4163f(C4161d dVar) {
        this.f8774a = dVar;
    }

    /* renamed from: a */
    public long mo25504a(C4162e eVar) {
        return (long) this.f8774a.getWritableDatabase().delete("protection_space", "_id = ?", new String[]{eVar.f8769a.toString()});
    }

    /* renamed from: b */
    public C4162e mo25505b(String str, String str2, String str3, Integer num) {
        Cursor query = this.f8774a.getReadableDatabase().query("protection_space", this.f8775b, "host = ? AND protocol = ? AND realm = ? AND port = ?", new String[]{str, str2, str3, num.toString()}, (String) null, (String) null, (String) null);
        C4162e eVar = query.moveToNext() ? new C4162e(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("_id"))), query.getString(query.getColumnIndexOrThrow(Http2ExchangeCodec.HOST)), query.getString(query.getColumnIndexOrThrow("protocol")), query.getString(query.getColumnIndexOrThrow("realm")), Integer.valueOf(query.getInt(query.getColumnIndexOrThrow("port")))) : null;
        query.close();
        return eVar;
    }

    /* renamed from: c */
    public List<C4162e> mo25506c() {
        Cursor query = this.f8774a.getReadableDatabase().query("protection_space", this.f8775b, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(new C4162e(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("_id"))), query.getString(query.getColumnIndexOrThrow(Http2ExchangeCodec.HOST)), query.getString(query.getColumnIndexOrThrow("protocol")), query.getString(query.getColumnIndexOrThrow("realm")), Integer.valueOf(query.getInt(query.getColumnIndexOrThrow("port")))));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public long mo25507d(C4162e eVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Http2ExchangeCodec.HOST, eVar.f8770b);
        contentValues.put("protocol", eVar.f8771c);
        contentValues.put("realm", eVar.f8772d);
        contentValues.put("port", eVar.f8773e);
        return this.f8774a.getWritableDatabase().insert("protection_space", (String) null, contentValues);
    }
}
