package p040c.p429r.p430a.p439c.p455b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.NotificationCompatJellybean;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.connect_life.hismart.room.NotificationDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.r.a.c.b.a */
/* compiled from: NotificationDao_Impl */
public final class C7455a implements NotificationDao {

    /* renamed from: a */
    public final RoomDatabase f14144a;

    /* renamed from: b */
    public final EntityInsertionAdapter<Notification> f14145b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter<Notification> f14146c;

    /* renamed from: d */
    public final SharedSQLiteStatement f14147d;

    /* renamed from: e */
    public final SharedSQLiteStatement f14148e;

    /* renamed from: c.r.a.c.b.a$a */
    /* compiled from: NotificationDao_Impl */
    public class C7456a extends EntityInsertionAdapter<Notification> {
        public C7456a(C7455a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Notification notification) {
            if (notification.getSelect() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, (long) notification.getSelect().intValue());
            }
            if (notification.getCustomerId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, notification.getCustomerId());
            }
            if (notification.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, notification.getDeviceId());
            }
            supportSQLiteStatement.bindLong(4, (long) notification.getFormatId());
            if (notification.getTitle() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, notification.getTitle());
            }
            if (notification.getContent() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, notification.getContent());
            }
            supportSQLiteStatement.bindLong(7, notification.getMsgLevel());
            supportSQLiteStatement.bindLong(8, (long) notification.getMsgType());
            supportSQLiteStatement.bindLong(9, notification.getInsertTime());
            supportSQLiteStatement.bindLong(10, notification.getMsgReadStatus() ? 1 : 0);
            supportSQLiteStatement.bindLong(11, notification.getStartTime());
            supportSQLiteStatement.bindLong(12, notification.getExpireTime());
            if (notification.getMsgId() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, notification.getMsgId());
            }
            if (notification.getMsgTypeCode() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, notification.getMsgTypeCode());
            }
            supportSQLiteStatement.bindLong(15, notification.getNoid());
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `notification` (`select`,`customer_id`,`device_id`,`format_id`,`title`,`content`,`msg_level`,`msg_type`,`insert_time`,`msg_read_status`,`start_time`,`expire_time`,`msg_id`,`msg_type_code`,`noid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.r.a.c.b.a$b */
    /* compiled from: NotificationDao_Impl */
    public class C7457b extends EntityDeletionOrUpdateAdapter<Notification> {
        public C7457b(C7455a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Notification notification) {
            if (notification.getSelect() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, (long) notification.getSelect().intValue());
            }
            if (notification.getCustomerId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, notification.getCustomerId());
            }
            if (notification.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, notification.getDeviceId());
            }
            supportSQLiteStatement.bindLong(4, (long) notification.getFormatId());
            if (notification.getTitle() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, notification.getTitle());
            }
            if (notification.getContent() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, notification.getContent());
            }
            supportSQLiteStatement.bindLong(7, notification.getMsgLevel());
            supportSQLiteStatement.bindLong(8, (long) notification.getMsgType());
            supportSQLiteStatement.bindLong(9, notification.getInsertTime());
            supportSQLiteStatement.bindLong(10, notification.getMsgReadStatus() ? 1 : 0);
            supportSQLiteStatement.bindLong(11, notification.getStartTime());
            supportSQLiteStatement.bindLong(12, notification.getExpireTime());
            if (notification.getMsgId() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, notification.getMsgId());
            }
            if (notification.getMsgTypeCode() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, notification.getMsgTypeCode());
            }
            supportSQLiteStatement.bindLong(15, notification.getNoid());
            if (notification.getMsgId() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, notification.getMsgId());
            }
        }

        public String createQuery() {
            return "UPDATE OR ABORT `notification` SET `select` = ?,`customer_id` = ?,`device_id` = ?,`format_id` = ?,`title` = ?,`content` = ?,`msg_level` = ?,`msg_type` = ?,`insert_time` = ?,`msg_read_status` = ?,`start_time` = ?,`expire_time` = ?,`msg_id` = ?,`msg_type_code` = ?,`noid` = ? WHERE `msg_id` = ?";
        }
    }

    /* renamed from: c.r.a.c.b.a$c */
    /* compiled from: NotificationDao_Impl */
    public class C7458c extends SharedSQLiteStatement {
        public C7458c(C7455a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE  FROM notification where msg_id = ?";
        }
    }

    /* renamed from: c.r.a.c.b.a$d */
    /* compiled from: NotificationDao_Impl */
    public class C7459d extends SharedSQLiteStatement {
        public C7459d(C7455a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM notification";
        }
    }

    public C7455a(RoomDatabase roomDatabase) {
        this.f14144a = roomDatabase;
        this.f14145b = new C7456a(this, roomDatabase);
        this.f14146c = new C7457b(this, roomDatabase);
        this.f14147d = new C7458c(this, roomDatabase);
        this.f14148e = new C7459d(this, roomDatabase);
    }

    /* renamed from: a */
    public static List<Class<?>> m21423a() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14144a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14148e.acquire();
        this.f14144a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14144a.setTransactionSuccessful();
        } finally {
            this.f14144a.endTransaction();
            this.f14148e.release(acquire);
        }
    }

    public void deleteById(String str) {
        this.f14144a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14147d.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14144a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14144a.setTransactionSuccessful();
        } finally {
            this.f14144a.endTransaction();
            this.f14147d.release(acquire);
        }
    }

    public List<Notification> findExist(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String string;
        String str7 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification where msg_id = ?", 1);
        if (str7 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str7);
        }
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    int i7 = i5;
                    int i8 = i7;
                    arrayList.add(new Notification(num, str2, str3, i3, str4, str5, j, i4, j2, z, j3, j4, str6, string, query.getLong(i7)));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getAlarm(long j, long j2, int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.insert_time > ? and a.insert_time < ? and a.msg_type = ?", 3);
        acquire.bindLong(1, j);
        acquire.bindLong(2, j2);
        acquire.bindLong(3, (long) i);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    int i4 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    long j3 = query.getLong(columnIndexOrThrow7);
                    int i5 = query.getInt(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j5 = query.getLong(columnIndexOrThrow11);
                    long j6 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i2 = i3;
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow13);
                        i2 = i3;
                    }
                    if (query.isNull(i2)) {
                        string = null;
                    } else {
                        string = query.getString(i2);
                    }
                    int i6 = columnIndexOrThrow11;
                    int i7 = columnIndexOrThrow15;
                    int i8 = i6;
                    int i9 = i7;
                    arrayList.add(new Notification(num, str, str2, i4, str3, str4, j3, i5, j4, z, j5, j6, str5, string, query.getLong(i7)));
                    columnIndexOrThrow11 = i8;
                    columnIndexOrThrow15 = i9;
                    i3 = i2;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getAll() {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification", 0);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    int i7 = i5;
                    int i8 = i7;
                    arrayList.add(new Notification(num, str, str2, i3, str3, str4, j, i4, j2, z, j3, j4, str5, string, query.getLong(i7)));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getByReadStatus(boolean z) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification where msg_read_status = ?", 1);
        acquire.bindLong(1, z ? 1 : 0);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    int i7 = i5;
                    int i8 = i7;
                    arrayList.add(new Notification(num, str, str2, i3, str3, str4, j, i4, j2, z2, j3, j4, str5, string, query.getLong(i7)));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getByTime(long j, long j2) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.insert_time > ? and a.insert_time <?", 2);
        acquire.bindLong(1, j);
        acquire.bindLong(2, j2);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    long j3 = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j5 = query.getLong(columnIndexOrThrow11);
                    long j6 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow11;
                    int i6 = columnIndexOrThrow15;
                    int i7 = i5;
                    int i8 = i6;
                    arrayList.add(new Notification(num, str, str2, i3, str3, str4, j3, i4, j4, z, j5, j6, str5, string, query.getLong(i6)));
                    columnIndexOrThrow11 = i7;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getInventory(long j, long j2, int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.insert_time > ? and a.insert_time < ? and a.msg_type != ?", 3);
        acquire.bindLong(1, j);
        acquire.bindLong(2, j2);
        acquire.bindLong(3, (long) i);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    int i4 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    long j3 = query.getLong(columnIndexOrThrow7);
                    int i5 = query.getInt(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j5 = query.getLong(columnIndexOrThrow11);
                    long j6 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i2 = i3;
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow13);
                        i2 = i3;
                    }
                    if (query.isNull(i2)) {
                        string = null;
                    } else {
                        string = query.getString(i2);
                    }
                    int i6 = columnIndexOrThrow11;
                    int i7 = columnIndexOrThrow15;
                    int i8 = i6;
                    int i9 = i7;
                    arrayList.add(new Notification(num, str, str2, i4, str3, str4, j3, i5, j4, z, j5, j6, str5, string, query.getLong(i7)));
                    columnIndexOrThrow11 = i8;
                    columnIndexOrThrow15 = i9;
                    i3 = i2;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public void insert(Notification notification) {
        this.f14144a.assertNotSuspendingTransaction();
        this.f14144a.beginTransaction();
        try {
            this.f14145b.insert(notification);
            this.f14144a.setTransactionSuccessful();
        } finally {
            this.f14144a.endTransaction();
        }
    }

    public void update(Notification notification) {
        this.f14144a.assertNotSuspendingTransaction();
        this.f14144a.beginTransaction();
        try {
            this.f14146c.handle(notification);
            this.f14144a.setTransactionSuccessful();
        } finally {
            this.f14144a.endTransaction();
        }
    }

    public List<Notification> getAll(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String string;
        String str7 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification where customer_id = ?", 1);
        if (str7 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str7);
        }
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    int i7 = i5;
                    int i8 = i7;
                    arrayList.add(new Notification(num, str2, str3, i3, str4, str5, j, i4, j2, z, j3, j4, str6, string, query.getLong(i7)));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getByReadStatus(String str, boolean z) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String string;
        String str7 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.customer_id = ? and a.msg_read_status = ?", 2);
        if (str7 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str7);
        }
        acquire.bindLong(2, z ? 1 : 0);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    int i7 = i5;
                    int i8 = i7;
                    arrayList.add(new Notification(num, str2, str3, i3, str4, str5, j, i4, j2, z2, j3, j4, str6, string, query.getLong(i7)));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getByTime(String str, long j, long j2) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String string;
        String str7 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.customer_id = ? and a.insert_time > ? and a.insert_time <?", 3);
        if (str7 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str7);
        }
        acquire.bindLong(2, j);
        acquire.bindLong(3, j2);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    long j3 = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j5 = query.getLong(columnIndexOrThrow11);
                    long j6 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    int i7 = i5;
                    int i8 = i6;
                    arrayList.add(new Notification(num, str2, str3, i3, str4, str5, j3, i4, j4, z, j5, j6, str6, string, query.getLong(i6)));
                    columnIndexOrThrow = i7;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getAlarm(String str, long j, long j2, int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        String string;
        String str7 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.customer_id = ? and a.insert_time > ? and a.insert_time < ? and a.msg_type = ?", 4);
        if (str7 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str7);
        }
        acquire.bindLong(2, j);
        acquire.bindLong(3, j2);
        acquire.bindLong(4, (long) i);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    int i4 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    long j3 = query.getLong(columnIndexOrThrow7);
                    int i5 = query.getInt(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j5 = query.getLong(columnIndexOrThrow11);
                    long j6 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i2 = i3;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow13);
                        i2 = i3;
                    }
                    if (query.isNull(i2)) {
                        string = null;
                    } else {
                        string = query.getString(i2);
                    }
                    int i6 = columnIndexOrThrow;
                    int i7 = columnIndexOrThrow15;
                    int i8 = i6;
                    int i9 = i7;
                    arrayList.add(new Notification(num, str2, str3, i4, str4, str5, j3, i5, j4, z, j5, j6, str6, string, query.getLong(i7)));
                    columnIndexOrThrow = i8;
                    columnIndexOrThrow15 = i9;
                    i3 = i2;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getInventory(String str, long j, long j2, int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        String string;
        String str7 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.customer_id = ? and a.insert_time > ? and a.insert_time < ? and a.msg_type != ?", 4);
        if (str7 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str7);
        }
        acquire.bindLong(2, j);
        acquire.bindLong(3, j2);
        acquire.bindLong(4, (long) i);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    int i4 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    long j3 = query.getLong(columnIndexOrThrow7);
                    int i5 = query.getInt(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j5 = query.getLong(columnIndexOrThrow11);
                    long j6 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i2 = i3;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow13);
                        i2 = i3;
                    }
                    if (query.isNull(i2)) {
                        string = null;
                    } else {
                        string = query.getString(i2);
                    }
                    int i6 = columnIndexOrThrow;
                    int i7 = columnIndexOrThrow15;
                    int i8 = i6;
                    int i9 = i7;
                    arrayList.add(new Notification(num, str2, str3, i4, str4, str5, j3, i5, j4, z, j5, j6, str6, string, query.getLong(i7)));
                    columnIndexOrThrow = i8;
                    columnIndexOrThrow15 = i9;
                    i3 = i2;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getAll(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String string;
        String str8 = str;
        String str9 = str2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.customer_id = ? and a.device_id = ?", 2);
        if (str8 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str8);
        }
        if (str9 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str9);
        }
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    int i7 = i5;
                    int i8 = i7;
                    arrayList.add(new Notification(num, str3, str4, i3, str5, str6, j, i4, j2, z, j3, j4, str7, string, query.getLong(i7)));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<Notification> getByReadStatus(String str, String str2, boolean z) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String string;
        String str8 = str;
        String str9 = str2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM notification a where a.customer_id = ? and a.device_id = ? and a.msg_read_status = ?", 3);
        if (str8 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str8);
        }
        if (str9 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str9);
        }
        acquire.bindLong(3, z ? 1 : 0);
        this.f14144a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14144a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "select");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "device_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "format_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompatJellybean.KEY_TITLE);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, BrowserServiceFileProvider.CONTENT_SCHEME);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "msg_level");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "msg_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "insert_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "msg_read_status");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "start_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expire_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "msg_id");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "msg_type_code");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "noid");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow));
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow3);
                    }
                    int i3 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow6);
                    }
                    long j = query.getLong(columnIndexOrThrow7);
                    int i4 = query.getInt(columnIndexOrThrow8);
                    long j2 = query.getLong(columnIndexOrThrow9);
                    boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                    long j3 = query.getLong(columnIndexOrThrow11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    int i7 = i5;
                    int i8 = i6;
                    arrayList.add(new Notification(num, str3, str4, i3, str5, str6, j, i4, j2, z2, j3, j4, str7, string, query.getLong(i6)));
                    columnIndexOrThrow = i7;
                    columnIndexOrThrow15 = i8;
                    i2 = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }
}
