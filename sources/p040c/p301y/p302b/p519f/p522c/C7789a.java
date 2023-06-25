package p040c.p301y.p302b.p519f.p522c;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.juconnect.connectlife.sql.property.MsgDao;
import com.juconnect.connectlife.sql.property.MsgEntity;
import java.util.Collections;
import java.util.List;

/* renamed from: c.y.b.f.c.a */
/* compiled from: MsgDao_Impl */
public final class C7789a implements MsgDao {

    /* renamed from: a */
    public final RoomDatabase f14565a;

    /* renamed from: b */
    public final EntityInsertionAdapter<MsgEntity> f14566b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter<MsgEntity> f14567c;

    /* renamed from: d */
    public final SharedSQLiteStatement f14568d;

    /* renamed from: e */
    public final SharedSQLiteStatement f14569e;

    /* renamed from: c.y.b.f.c.a$a */
    /* compiled from: MsgDao_Impl */
    public class C7790a extends EntityInsertionAdapter<MsgEntity> {
        public C7790a(C7789a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, MsgEntity msgEntity) {
            if (msgEntity.getData() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, msgEntity.getData());
            }
            if (msgEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, msgEntity.getAuid());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `msgswitch` (`data`,`auid`) VALUES (?,?)";
        }
    }

    /* renamed from: c.y.b.f.c.a$b */
    /* compiled from: MsgDao_Impl */
    public class C7791b extends EntityDeletionOrUpdateAdapter<MsgEntity> {
        public C7791b(C7789a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, MsgEntity msgEntity) {
            if (msgEntity.getData() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, msgEntity.getData());
            }
            if (msgEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, msgEntity.getAuid());
            }
            if (msgEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, msgEntity.getAuid());
            }
        }

        public String createQuery() {
            return "UPDATE OR ABORT `msgswitch` SET `data` = ?,`auid` = ? WHERE `auid` = ?";
        }
    }

    /* renamed from: c.y.b.f.c.a$c */
    /* compiled from: MsgDao_Impl */
    public class C7792c extends SharedSQLiteStatement {
        public C7792c(C7789a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE  FROM  msgswitch where auid = ?";
        }
    }

    /* renamed from: c.y.b.f.c.a$d */
    /* compiled from: MsgDao_Impl */
    public class C7793d extends SharedSQLiteStatement {
        public C7793d(C7789a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM  msgswitch";
        }
    }

    public C7789a(RoomDatabase roomDatabase) {
        this.f14565a = roomDatabase;
        this.f14566b = new C7790a(this, roomDatabase);
        this.f14567c = new C7791b(this, roomDatabase);
        this.f14568d = new C7792c(this, roomDatabase);
        this.f14569e = new C7793d(this, roomDatabase);
    }

    /* renamed from: a */
    public static List<Class<?>> m21838a() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14565a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14569e.acquire();
        this.f14565a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14565a.setTransactionSuccessful();
        } finally {
            this.f14565a.endTransaction();
            this.f14569e.release(acquire);
        }
    }

    public void deleteById(String str) {
        this.f14565a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14568d.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14565a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14565a.setTransactionSuccessful();
        } finally {
            this.f14565a.endTransaction();
            this.f14568d.release(acquire);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.juconnect.connectlife.sql.property.MsgEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.juconnect.connectlife.sql.property.MsgEntity getMsg(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM msgswitch a where a.auid = ?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r6 != 0) goto L_0x000d
            r0.bindNull(r1)
            goto L_0x0010
        L_0x000d:
            r0.bindString(r1, r6)
        L_0x0010:
            androidx.room.RoomDatabase r6 = r5.f14565a
            r6.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r6 = r5.f14565a
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
            com.juconnect.connectlife.sql.property.MsgEntity r3 = new com.juconnect.connectlife.sql.property.MsgEntity     // Catch:{ all -> 0x0053 }
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p519f.p522c.C7789a.getMsg(java.lang.String):com.juconnect.connectlife.sql.property.MsgEntity");
    }

    public void insert(MsgEntity msgEntity) {
        this.f14565a.assertNotSuspendingTransaction();
        this.f14565a.beginTransaction();
        try {
            this.f14566b.insert(msgEntity);
            this.f14565a.setTransactionSuccessful();
        } finally {
            this.f14565a.endTransaction();
        }
    }

    public void update(MsgEntity msgEntity) {
        this.f14565a.assertNotSuspendingTransaction();
        this.f14565a.beginTransaction();
        try {
            this.f14567c.handle(msgEntity);
            this.f14565a.setTransactionSuccessful();
        } finally {
            this.f14565a.endTransaction();
        }
    }
}
