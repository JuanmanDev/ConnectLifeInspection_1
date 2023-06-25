package p040c.p429r.p430a.p439c.p456c.p458b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.hisense.connect_life.hismart.networks.request.wine.model.StrListToStrConverter;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.winecategory.WineCategoryDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.r.a.c.c.b.a */
/* compiled from: WineCategoryDao_Impl */
public final class C7474a implements WineCategoryDao {

    /* renamed from: a */
    public final RoomDatabase f14166a;

    /* renamed from: b */
    public final EntityInsertionAdapter<WineCategoryInfo> f14167b;

    /* renamed from: c */
    public final StrListToStrConverter f14168c = new StrListToStrConverter();

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter<WineCategoryInfo> f14169d;

    /* renamed from: e */
    public final EntityDeletionOrUpdateAdapter<WineCategoryInfo> f14170e;

    /* renamed from: f */
    public final SharedSQLiteStatement f14171f;

    /* renamed from: g */
    public final SharedSQLiteStatement f14172g;

    /* renamed from: c.r.a.c.c.b.a$a */
    /* compiled from: WineCategoryDao_Impl */
    public class C7475a extends EntityInsertionAdapter<WineCategoryInfo> {
        public C7475a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineCategoryInfo wineCategoryInfo) {
            supportSQLiteStatement.bindLong(1, wineCategoryInfo.getId());
            if (wineCategoryInfo.getVivinoId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, wineCategoryInfo.getVivinoId());
            }
            supportSQLiteStatement.bindLong(3, (long) wineCategoryInfo.getCategoryId());
            if (wineCategoryInfo.getPhotoUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wineCategoryInfo.getPhotoUrl());
            }
            if (wineCategoryInfo.getWineFactoryName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, wineCategoryInfo.getWineFactoryName());
            }
            if (wineCategoryInfo.getWineName() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wineCategoryInfo.getWineName());
            }
            if (wineCategoryInfo.getProduceYear() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wineCategoryInfo.getProduceYear());
            }
            supportSQLiteStatement.bindLong(8, (long) wineCategoryInfo.getFavorite());
            supportSQLiteStatement.bindLong(9, (long) wineCategoryInfo.getInPosition());
            supportSQLiteStatement.bindLong(10, (long) wineCategoryInfo.getInCell());
            supportSQLiteStatement.bindLong(11, (long) wineCategoryInfo.getWineCount());
            String fromStrList = C7474a.this.f14168c.fromStrList(wineCategoryInfo.getDeviceIdList());
            if (fromStrList == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, fromStrList);
            }
            if (wineCategoryInfo.getWineType() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, wineCategoryInfo.getWineType());
            }
            if (wineCategoryInfo.getArea() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, wineCategoryInfo.getArea());
            }
            if (wineCategoryInfo.getCountry() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, wineCategoryInfo.getCountry());
            }
            String fromStrList2 = C7474a.this.f14168c.fromStrList(wineCategoryInfo.getGrapes());
            if (fromStrList2 == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, fromStrList2);
            }
            if (wineCategoryInfo.getFiltered() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, (long) wineCategoryInfo.getFiltered().intValue());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `wine_category` (`id_id`,`vivino_id`,`categoryId`,`photoUrl`,`wineFactoryName`,`wineName`,`produceYear`,`favorite`,`inPosition`,`inCell`,`wineCount`,`deviceIdList`,`wineType`,`area`,`country`,`grapes`,`filtered`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.r.a.c.c.b.a$b */
    /* compiled from: WineCategoryDao_Impl */
    public class C7476b extends EntityDeletionOrUpdateAdapter<WineCategoryInfo> {
        public C7476b(C7474a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineCategoryInfo wineCategoryInfo) {
            supportSQLiteStatement.bindLong(1, wineCategoryInfo.getId());
        }

        public String createQuery() {
            return "DELETE FROM `wine_category` WHERE `id_id` = ?";
        }
    }

    /* renamed from: c.r.a.c.c.b.a$c */
    /* compiled from: WineCategoryDao_Impl */
    public class C7477c extends EntityDeletionOrUpdateAdapter<WineCategoryInfo> {
        public C7477c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineCategoryInfo wineCategoryInfo) {
            supportSQLiteStatement.bindLong(1, wineCategoryInfo.getId());
            if (wineCategoryInfo.getVivinoId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, wineCategoryInfo.getVivinoId());
            }
            supportSQLiteStatement.bindLong(3, (long) wineCategoryInfo.getCategoryId());
            if (wineCategoryInfo.getPhotoUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wineCategoryInfo.getPhotoUrl());
            }
            if (wineCategoryInfo.getWineFactoryName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, wineCategoryInfo.getWineFactoryName());
            }
            if (wineCategoryInfo.getWineName() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wineCategoryInfo.getWineName());
            }
            if (wineCategoryInfo.getProduceYear() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wineCategoryInfo.getProduceYear());
            }
            supportSQLiteStatement.bindLong(8, (long) wineCategoryInfo.getFavorite());
            supportSQLiteStatement.bindLong(9, (long) wineCategoryInfo.getInPosition());
            supportSQLiteStatement.bindLong(10, (long) wineCategoryInfo.getInCell());
            supportSQLiteStatement.bindLong(11, (long) wineCategoryInfo.getWineCount());
            String fromStrList = C7474a.this.f14168c.fromStrList(wineCategoryInfo.getDeviceIdList());
            if (fromStrList == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, fromStrList);
            }
            if (wineCategoryInfo.getWineType() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, wineCategoryInfo.getWineType());
            }
            if (wineCategoryInfo.getArea() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, wineCategoryInfo.getArea());
            }
            if (wineCategoryInfo.getCountry() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, wineCategoryInfo.getCountry());
            }
            String fromStrList2 = C7474a.this.f14168c.fromStrList(wineCategoryInfo.getGrapes());
            if (fromStrList2 == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, fromStrList2);
            }
            if (wineCategoryInfo.getFiltered() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, (long) wineCategoryInfo.getFiltered().intValue());
            }
            supportSQLiteStatement.bindLong(18, wineCategoryInfo.getId());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `wine_category` SET `id_id` = ?,`vivino_id` = ?,`categoryId` = ?,`photoUrl` = ?,`wineFactoryName` = ?,`wineName` = ?,`produceYear` = ?,`favorite` = ?,`inPosition` = ?,`inCell` = ?,`wineCount` = ?,`deviceIdList` = ?,`wineType` = ?,`area` = ?,`country` = ?,`grapes` = ?,`filtered` = ? WHERE `id_id` = ?";
        }
    }

    /* renamed from: c.r.a.c.c.b.a$d */
    /* compiled from: WineCategoryDao_Impl */
    public class C7478d extends SharedSQLiteStatement {
        public C7478d(C7474a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM wine_category";
        }
    }

    /* renamed from: c.r.a.c.c.b.a$e */
    /* compiled from: WineCategoryDao_Impl */
    public class C7479e extends SharedSQLiteStatement {
        public C7479e(C7474a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE wine_category SET favorite = ? WHERE categoryId = ?";
        }
    }

    public C7474a(RoomDatabase roomDatabase) {
        this.f14166a = roomDatabase;
        this.f14167b = new C7475a(roomDatabase);
        this.f14169d = new C7476b(this, roomDatabase);
        this.f14170e = new C7477c(roomDatabase);
        this.f14171f = new C7478d(this, roomDatabase);
        this.f14172g = new C7479e(this, roomDatabase);
    }

    /* renamed from: b */
    public static List<Class<?>> m21435b() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14166a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14171f.acquire();
        this.f14166a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14166a.setTransactionSuccessful();
        } finally {
            this.f14166a.endTransaction();
            this.f14171f.release(acquire);
        }
    }

    public void deleteByCategoryId(List<String> list) {
        this.f14166a.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM wine_category WHERE categoryId in (");
        StringUtil.appendPlaceholders(newStringBuilder, list.size());
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.f14166a.compileStatement(newStringBuilder.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, next);
            }
            i++;
        }
        this.f14166a.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.f14166a.setTransactionSuccessful();
        } finally {
            this.f14166a.endTransaction();
        }
    }

    public int deleteWineInventories(List<WineCategoryInfo> list) {
        this.f14166a.assertNotSuspendingTransaction();
        this.f14166a.beginTransaction();
        try {
            int handleMultiple = this.f14169d.handleMultiple(list) + 0;
            this.f14166a.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.f14166a.endTransaction();
        }
    }

    public int deleteWineInventory(WineCategoryInfo wineCategoryInfo) {
        this.f14166a.assertNotSuspendingTransaction();
        this.f14166a.beginTransaction();
        try {
            int handle = this.f14169d.handle(wineCategoryInfo) + 0;
            this.f14166a.setTransactionSuccessful();
            return handle;
        } finally {
            this.f14166a.endTransaction();
        }
    }

    public void insertWineInventories(List<WineCategoryInfo> list) {
        this.f14166a.assertNotSuspendingTransaction();
        this.f14166a.beginTransaction();
        try {
            this.f14167b.insert(list);
            this.f14166a.setTransactionSuccessful();
        } finally {
            this.f14166a.endTransaction();
        }
    }

    public void insertWineInventory(WineCategoryInfo wineCategoryInfo) {
        this.f14166a.assertNotSuspendingTransaction();
        this.f14166a.beginTransaction();
        try {
            this.f14167b.insert(wineCategoryInfo);
            this.f14166a.setTransactionSuccessful();
        } finally {
            this.f14166a.endTransaction();
        }
    }

    public List<WineCategoryInfo> loadAllWineInventories() {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        int i2;
        String str8;
        int i3;
        String str9;
        int i4;
        String str10;
        Integer num;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_category", 0);
        this.f14166a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14166a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "inPosition");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "inCell");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wineCount");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceIdList");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int i5 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    int i6 = query.getInt(columnIndexOrThrow3);
                    if (query.isNull(columnIndexOrThrow4)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow4);
                    }
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
                    if (query.isNull(columnIndexOrThrow7)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow7);
                    }
                    int i7 = query.getInt(columnIndexOrThrow8);
                    int i8 = query.getInt(columnIndexOrThrow9);
                    int i9 = query.getInt(columnIndexOrThrow10);
                    int i10 = query.getInt(columnIndexOrThrow11);
                    if (query.isNull(columnIndexOrThrow12)) {
                        i = columnIndexOrThrow;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow12);
                        i = columnIndexOrThrow;
                    }
                    List<String> strList = this.f14168c.toStrList(str6);
                    int i11 = i5;
                    if (query.isNull(i11)) {
                        i2 = columnIndexOrThrow14;
                        str7 = null;
                    } else {
                        str7 = query.getString(i11);
                        i2 = columnIndexOrThrow14;
                    }
                    if (query.isNull(i2)) {
                        i5 = i11;
                        i3 = columnIndexOrThrow15;
                        str8 = null;
                    } else {
                        i5 = i11;
                        str8 = query.getString(i2);
                        i3 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i3)) {
                        columnIndexOrThrow15 = i3;
                        i4 = columnIndexOrThrow16;
                        str9 = null;
                    } else {
                        columnIndexOrThrow15 = i3;
                        str9 = query.getString(i3);
                        i4 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i4)) {
                        columnIndexOrThrow16 = i4;
                        columnIndexOrThrow14 = i2;
                        str10 = null;
                    } else {
                        columnIndexOrThrow16 = i4;
                        str10 = query.getString(i4);
                        columnIndexOrThrow14 = i2;
                    }
                    List<String> strList2 = this.f14168c.toStrList(str10);
                    int i12 = columnIndexOrThrow17;
                    if (query.isNull(i12)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(i12));
                    }
                    arrayList.add(new WineCategoryInfo(j, str, i6, str2, str3, str4, str5, i7, i8, i9, i10, strList, str7, str8, str9, strList2, num));
                    columnIndexOrThrow17 = i12;
                    columnIndexOrThrow = i;
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

    public List<WineCategoryInfo> loadAllWineInventory(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
        int i2;
        String str9;
        int i3;
        String str10;
        int i4;
        String str11;
        Integer num;
        String str12 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_category WHERE categoryId = ?", 1);
        if (str12 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str12);
        }
        this.f14166a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14166a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "inPosition");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "inCell");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wineCount");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceIdList");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int i5 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    int i6 = query.getInt(columnIndexOrThrow3);
                    if (query.isNull(columnIndexOrThrow4)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow4);
                    }
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
                    if (query.isNull(columnIndexOrThrow7)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow7);
                    }
                    int i7 = query.getInt(columnIndexOrThrow8);
                    int i8 = query.getInt(columnIndexOrThrow9);
                    int i9 = query.getInt(columnIndexOrThrow10);
                    int i10 = query.getInt(columnIndexOrThrow11);
                    if (query.isNull(columnIndexOrThrow12)) {
                        i = columnIndexOrThrow;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow12);
                        i = columnIndexOrThrow;
                    }
                    List<String> strList = this.f14168c.toStrList(str7);
                    int i11 = i5;
                    if (query.isNull(i11)) {
                        i2 = columnIndexOrThrow14;
                        str8 = null;
                    } else {
                        str8 = query.getString(i11);
                        i2 = columnIndexOrThrow14;
                    }
                    if (query.isNull(i2)) {
                        i5 = i11;
                        i3 = columnIndexOrThrow15;
                        str9 = null;
                    } else {
                        i5 = i11;
                        str9 = query.getString(i2);
                        i3 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i3)) {
                        columnIndexOrThrow15 = i3;
                        i4 = columnIndexOrThrow16;
                        str10 = null;
                    } else {
                        columnIndexOrThrow15 = i3;
                        str10 = query.getString(i3);
                        i4 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i4)) {
                        columnIndexOrThrow16 = i4;
                        columnIndexOrThrow14 = i2;
                        str11 = null;
                    } else {
                        columnIndexOrThrow16 = i4;
                        str11 = query.getString(i4);
                        columnIndexOrThrow14 = i2;
                    }
                    List<String> strList2 = this.f14168c.toStrList(str11);
                    int i12 = columnIndexOrThrow17;
                    if (query.isNull(i12)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(i12));
                    }
                    arrayList.add(new WineCategoryInfo(j, str2, i6, str3, str4, str5, str6, i7, i8, i9, i10, strList, str8, str9, str10, strList2, num));
                    columnIndexOrThrow17 = i12;
                    columnIndexOrThrow = i;
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

    public WineCategoryInfo queryByCategoryId(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        WineCategoryInfo wineCategoryInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        String str8;
        int i3;
        String str9;
        int i4;
        String str10;
        Integer num;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_category WHERE categoryId  = ?", 1);
        acquire.bindLong(1, (long) i);
        this.f14166a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14166a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "inPosition");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "inCell");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wineCount");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceIdList");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                if (query.moveToFirst()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    int i5 = query.getInt(columnIndexOrThrow3);
                    if (query.isNull(columnIndexOrThrow4)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow4);
                    }
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
                    if (query.isNull(columnIndexOrThrow7)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow7);
                    }
                    int i6 = query.getInt(columnIndexOrThrow8);
                    int i7 = query.getInt(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    if (query.isNull(columnIndexOrThrow12)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow12);
                    }
                    List<String> strList = this.f14168c.toStrList(str6);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i2 = columnIndexOrThrow14;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow13);
                        i2 = columnIndexOrThrow14;
                    }
                    if (query.isNull(i2)) {
                        i3 = columnIndexOrThrow15;
                        str8 = null;
                    } else {
                        str8 = query.getString(i2);
                        i3 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i3)) {
                        i4 = columnIndexOrThrow16;
                        str9 = null;
                    } else {
                        str9 = query.getString(i3);
                        i4 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i4)) {
                        str10 = null;
                    } else {
                        str10 = query.getString(i4);
                    }
                    List<String> strList2 = this.f14168c.toStrList(str10);
                    if (query.isNull(columnIndexOrThrow17)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow17));
                    }
                    wineCategoryInfo = new WineCategoryInfo(j, str, i5, str2, str3, str4, str5, i6, i7, i8, i9, strList, str7, str8, str9, strList2, num);
                } else {
                    wineCategoryInfo = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return wineCategoryInfo;
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

    public void updateCategoryFavorite(String str, int i) {
        this.f14166a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14172g.acquire();
        acquire.bindLong(1, (long) i);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f14166a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14166a.setTransactionSuccessful();
        } finally {
            this.f14166a.endTransaction();
            this.f14172g.release(acquire);
        }
    }

    public int updateWineInventories(List<WineCategoryInfo> list) {
        this.f14166a.assertNotSuspendingTransaction();
        this.f14166a.beginTransaction();
        try {
            int handleMultiple = this.f14170e.handleMultiple(list) + 0;
            this.f14166a.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.f14166a.endTransaction();
        }
    }

    public int updateWineInventory(WineCategoryInfo wineCategoryInfo) {
        this.f14166a.assertNotSuspendingTransaction();
        this.f14166a.beginTransaction();
        try {
            int handle = this.f14170e.handle(wineCategoryInfo) + 0;
            this.f14166a.setTransactionSuccessful();
            return handle;
        } finally {
            this.f14166a.endTransaction();
        }
    }
}
