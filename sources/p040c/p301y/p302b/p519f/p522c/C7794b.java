package p040c.p301y.p302b.p519f.p522c;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.juconnect.connectlife.sql.property.ProfileDao;
import com.juconnect.connectlife.sql.property.ProfileEntity;
import java.util.Collections;
import java.util.List;

/* renamed from: c.y.b.f.c.b */
/* compiled from: ProfileDao_Impl */
public final class C7794b implements ProfileDao {

    /* renamed from: a */
    public final RoomDatabase f14570a;

    /* renamed from: b */
    public final EntityInsertionAdapter<ProfileEntity> f14571b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter<ProfileEntity> f14572c;

    /* renamed from: d */
    public final SharedSQLiteStatement f14573d;

    /* renamed from: e */
    public final SharedSQLiteStatement f14574e;

    /* renamed from: c.y.b.f.c.b$a */
    /* compiled from: ProfileDao_Impl */
    public class C7795a extends EntityInsertionAdapter<ProfileEntity> {
        public C7795a(C7794b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, ProfileEntity profileEntity) {
            if (profileEntity.getData() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, profileEntity.getData());
            }
            if (profileEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, profileEntity.getAuid());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `profile` (`data`,`auid`) VALUES (?,?)";
        }
    }

    /* renamed from: c.y.b.f.c.b$b */
    /* compiled from: ProfileDao_Impl */
    public class C7796b extends EntityDeletionOrUpdateAdapter<ProfileEntity> {
        public C7796b(C7794b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, ProfileEntity profileEntity) {
            if (profileEntity.getData() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, profileEntity.getData());
            }
            if (profileEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, profileEntity.getAuid());
            }
            if (profileEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, profileEntity.getAuid());
            }
        }

        public String createQuery() {
            return "UPDATE OR ABORT `profile` SET `data` = ?,`auid` = ? WHERE `auid` = ?";
        }
    }

    /* renamed from: c.y.b.f.c.b$c */
    /* compiled from: ProfileDao_Impl */
    public class C7797c extends SharedSQLiteStatement {
        public C7797c(C7794b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE  FROM  profile where auid = ?";
        }
    }

    /* renamed from: c.y.b.f.c.b$d */
    /* compiled from: ProfileDao_Impl */
    public class C7798d extends SharedSQLiteStatement {
        public C7798d(C7794b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM  profile";
        }
    }

    public C7794b(RoomDatabase roomDatabase) {
        this.f14570a = roomDatabase;
        this.f14571b = new C7795a(this, roomDatabase);
        this.f14572c = new C7796b(this, roomDatabase);
        this.f14573d = new C7797c(this, roomDatabase);
        this.f14574e = new C7798d(this, roomDatabase);
    }

    /* renamed from: a */
    public static List<Class<?>> m21841a() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14570a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14574e.acquire();
        this.f14570a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14570a.setTransactionSuccessful();
        } finally {
            this.f14570a.endTransaction();
            this.f14574e.release(acquire);
        }
    }

    public void deleteById(String str) {
        this.f14570a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14573d.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14570a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14570a.setTransactionSuccessful();
        } finally {
            this.f14570a.endTransaction();
            this.f14573d.release(acquire);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.juconnect.connectlife.sql.property.ProfileEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.juconnect.connectlife.sql.property.ProfileEntity getProfile(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM PROFILE a where a.auid = ?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r6 != 0) goto L_0x000d
            r0.bindNull(r1)
            goto L_0x0010
        L_0x000d:
            r0.bindString(r1, r6)
        L_0x0010:
            androidx.room.RoomDatabase r6 = r5.f14570a
            r6.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r6 = r5.f14570a
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
            com.juconnect.connectlife.sql.property.ProfileEntity r3 = new com.juconnect.connectlife.sql.property.ProfileEntity     // Catch:{ all -> 0x0053 }
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p519f.p522c.C7794b.getProfile(java.lang.String):com.juconnect.connectlife.sql.property.ProfileEntity");
    }

    public void insert(ProfileEntity profileEntity) {
        this.f14570a.assertNotSuspendingTransaction();
        this.f14570a.beginTransaction();
        try {
            this.f14571b.insert(profileEntity);
            this.f14570a.setTransactionSuccessful();
        } finally {
            this.f14570a.endTransaction();
        }
    }

    public void update(ProfileEntity profileEntity) {
        this.f14570a.assertNotSuspendingTransaction();
        this.f14570a.beginTransaction();
        try {
            this.f14572c.handle(profileEntity);
            this.f14570a.setTransactionSuccessful();
        } finally {
            this.f14570a.endTransaction();
        }
    }
}
