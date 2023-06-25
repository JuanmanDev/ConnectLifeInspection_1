package p040c.p301y.p302b.p519f.p520a;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.juconnect.connectlife.sql.changes.InvChangeDao;
import com.juconnect.connectlife.sql.changes.InvChangeEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.y.b.f.a.a */
/* compiled from: InvChangeDao_Impl */
public final class C7775a implements InvChangeDao {

    /* renamed from: a */
    public final RoomDatabase f14548a;

    /* renamed from: b */
    public final EntityInsertionAdapter<InvChangeEntity> f14549b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter<InvChangeEntity> f14550c;

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter<InvChangeEntity> f14551d;

    /* renamed from: e */
    public final SharedSQLiteStatement f14552e;

    /* renamed from: c.y.b.f.a.a$a */
    /* compiled from: InvChangeDao_Impl */
    public class C7776a extends EntityInsertionAdapter<InvChangeEntity> {
        public C7776a(C7775a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, InvChangeEntity invChangeEntity) {
            supportSQLiteStatement.bindLong(1, (long) invChangeEntity.getCustomId());
            if (invChangeEntity.getLastChange() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, invChangeEntity.getLastChange());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `wine_inventory_change` (`custom_id`,`last_change`) VALUES (?,?)";
        }
    }

    /* renamed from: c.y.b.f.a.a$b */
    /* compiled from: InvChangeDao_Impl */
    public class C7777b extends EntityDeletionOrUpdateAdapter<InvChangeEntity> {
        public C7777b(C7775a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, InvChangeEntity invChangeEntity) {
            supportSQLiteStatement.bindLong(1, (long) invChangeEntity.getCustomId());
        }

        public String createQuery() {
            return "DELETE FROM `wine_inventory_change` WHERE `custom_id` = ?";
        }
    }

    /* renamed from: c.y.b.f.a.a$c */
    /* compiled from: InvChangeDao_Impl */
    public class C7778c extends EntityDeletionOrUpdateAdapter<InvChangeEntity> {
        public C7778c(C7775a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, InvChangeEntity invChangeEntity) {
            supportSQLiteStatement.bindLong(1, (long) invChangeEntity.getCustomId());
            if (invChangeEntity.getLastChange() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, invChangeEntity.getLastChange());
            }
            supportSQLiteStatement.bindLong(3, (long) invChangeEntity.getCustomId());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `wine_inventory_change` SET `custom_id` = ?,`last_change` = ? WHERE `custom_id` = ?";
        }
    }

    /* renamed from: c.y.b.f.a.a$d */
    /* compiled from: InvChangeDao_Impl */
    public class C7779d extends SharedSQLiteStatement {
        public C7779d(C7775a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM wine_inventory_change WHERE custom_id=?";
        }
    }

    public C7775a(RoomDatabase roomDatabase) {
        this.f14548a = roomDatabase;
        this.f14549b = new C7776a(this, roomDatabase);
        this.f14550c = new C7777b(this, roomDatabase);
        this.f14551d = new C7778c(this, roomDatabase);
        this.f14552e = new C7779d(this, roomDatabase);
    }

    /* renamed from: a */
    public static List<Class<?>> m21827a() {
        return Collections.emptyList();
    }

    public void deleteInvChange(InvChangeEntity invChangeEntity) {
        this.f14548a.assertNotSuspendingTransaction();
        this.f14548a.beginTransaction();
        try {
            this.f14550c.handle(invChangeEntity);
            this.f14548a.setTransactionSuccessful();
        } finally {
            this.f14548a.endTransaction();
        }
    }

    public void insertInvChange(InvChangeEntity invChangeEntity) {
        this.f14548a.assertNotSuspendingTransaction();
        this.f14548a.beginTransaction();
        try {
            this.f14549b.insert(invChangeEntity);
            this.f14548a.setTransactionSuccessful();
        } finally {
            this.f14548a.endTransaction();
        }
    }

    public List<InvChangeEntity> queryInvChange(int i) {
        String str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory_change where custom_id=? ", 1);
        acquire.bindLong(1, (long) i);
        this.f14548a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14548a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "custom_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "last_change");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i2 = query.getInt(columnIndexOrThrow);
                if (query.isNull(columnIndexOrThrow2)) {
                    str = null;
                } else {
                    str = query.getString(columnIndexOrThrow2);
                }
                arrayList.add(new InvChangeEntity(i2, str));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public void updateInvChange(InvChangeEntity invChangeEntity) {
        this.f14548a.assertNotSuspendingTransaction();
        this.f14548a.beginTransaction();
        try {
            this.f14551d.handle(invChangeEntity);
            this.f14548a.setTransactionSuccessful();
        } finally {
            this.f14548a.endTransaction();
        }
    }

    public void deleteInvChange(int i) {
        this.f14548a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14552e.acquire();
        acquire.bindLong(1, (long) i);
        this.f14548a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14548a.setTransactionSuccessful();
        } finally {
            this.f14548a.endTransaction();
            this.f14552e.release(acquire);
        }
    }
}
