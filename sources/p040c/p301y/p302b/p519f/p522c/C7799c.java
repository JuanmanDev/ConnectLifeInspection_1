package p040c.p301y.p302b.p519f.p522c;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.juconnect.connectlife.sql.property.PropertyDao;
import com.juconnect.connectlife.sql.property.PropertyEntity;
import java.util.Collections;
import java.util.List;

/* renamed from: c.y.b.f.c.c */
/* compiled from: PropertyDao_Impl */
public final class C7799c implements PropertyDao {

    /* renamed from: a */
    public final RoomDatabase f14575a;

    /* renamed from: b */
    public final EntityInsertionAdapter<PropertyEntity> f14576b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter<PropertyEntity> f14577c;

    /* renamed from: d */
    public final SharedSQLiteStatement f14578d;

    /* renamed from: e */
    public final SharedSQLiteStatement f14579e;

    /* renamed from: c.y.b.f.c.c$a */
    /* compiled from: PropertyDao_Impl */
    public class C7800a extends EntityInsertionAdapter<PropertyEntity> {
        public C7800a(C7799c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, PropertyEntity propertyEntity) {
            if (propertyEntity.getData() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, propertyEntity.getData());
            }
            if (propertyEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, propertyEntity.getAuid());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `property` (`data`,`auid`) VALUES (?,?)";
        }
    }

    /* renamed from: c.y.b.f.c.c$b */
    /* compiled from: PropertyDao_Impl */
    public class C7801b extends EntityDeletionOrUpdateAdapter<PropertyEntity> {
        public C7801b(C7799c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, PropertyEntity propertyEntity) {
            if (propertyEntity.getData() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, propertyEntity.getData());
            }
            if (propertyEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, propertyEntity.getAuid());
            }
            if (propertyEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, propertyEntity.getAuid());
            }
        }

        public String createQuery() {
            return "UPDATE OR ABORT `property` SET `data` = ?,`auid` = ? WHERE `auid` = ?";
        }
    }

    /* renamed from: c.y.b.f.c.c$c */
    /* compiled from: PropertyDao_Impl */
    public class C7802c extends SharedSQLiteStatement {
        public C7802c(C7799c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE  FROM  property where auid = ?";
        }
    }

    /* renamed from: c.y.b.f.c.c$d */
    /* compiled from: PropertyDao_Impl */
    public class C7803d extends SharedSQLiteStatement {
        public C7803d(C7799c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM  property";
        }
    }

    public C7799c(RoomDatabase roomDatabase) {
        this.f14575a = roomDatabase;
        this.f14576b = new C7800a(this, roomDatabase);
        this.f14577c = new C7801b(this, roomDatabase);
        this.f14578d = new C7802c(this, roomDatabase);
        this.f14579e = new C7803d(this, roomDatabase);
    }

    /* renamed from: a */
    public static List<Class<?>> m21844a() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14575a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14579e.acquire();
        this.f14575a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14575a.setTransactionSuccessful();
        } finally {
            this.f14575a.endTransaction();
            this.f14579e.release(acquire);
        }
    }

    public void deleteById(String str) {
        this.f14575a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14578d.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14575a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14575a.setTransactionSuccessful();
        } finally {
            this.f14575a.endTransaction();
            this.f14578d.release(acquire);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.juconnect.connectlife.sql.property.PropertyEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.juconnect.connectlife.sql.property.PropertyEntity getProperty(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM PROPERTY a where a.auid = ?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r6 != 0) goto L_0x000d
            r0.bindNull(r1)
            goto L_0x0010
        L_0x000d:
            r0.bindString(r1, r6)
        L_0x0010:
            androidx.room.RoomDatabase r6 = r5.f14575a
            r6.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r6 = r5.f14575a
            r1 = 0
            r2 = 0
            android.database.Cursor r6 = androidx.room.util.DBUtil.query(r6, r0, r1, r2)
            java.lang.String r1 = "data"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = "auid"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r3)     // Catch:{ all -> 0x0053 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004c
            boolean r4 = r6.isNull(r1)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x0037
            r1 = r2
            goto L_0x003b
        L_0x0037:
            java.lang.String r1 = r6.getString(r1)     // Catch:{ all -> 0x0053 }
        L_0x003b:
            boolean r4 = r6.isNull(r3)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            java.lang.String r2 = r6.getString(r3)     // Catch:{ all -> 0x0053 }
        L_0x0046:
            com.juconnect.connectlife.sql.property.PropertyEntity r3 = new com.juconnect.connectlife.sql.property.PropertyEntity     // Catch:{ all -> 0x0053 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0053 }
            r2 = r3
        L_0x004c:
            r6.close()
            r0.release()
            return r2
        L_0x0053:
            r1 = move-exception
            r6.close()
            r0.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p519f.p522c.C7799c.getProperty(java.lang.String):com.juconnect.connectlife.sql.property.PropertyEntity");
    }

    public void insert(PropertyEntity propertyEntity) {
        this.f14575a.assertNotSuspendingTransaction();
        this.f14575a.beginTransaction();
        try {
            this.f14576b.insert(propertyEntity);
            this.f14575a.setTransactionSuccessful();
        } finally {
            this.f14575a.endTransaction();
        }
    }

    public void update(PropertyEntity propertyEntity) {
        this.f14575a.assertNotSuspendingTransaction();
        this.f14575a.beginTransaction();
        try {
            this.f14577c.handle(propertyEntity);
            this.f14575a.setTransactionSuccessful();
        } finally {
            this.f14575a.endTransaction();
        }
    }
}
