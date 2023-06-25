package p040c.p429r.p430a.p439c.p456c.p457a;

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
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceTemperatureInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.Converters;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.r.a.c.c.a.a */
/* compiled from: LoginUserInfoDao_Impl */
public final class C7460a implements LoginUserInfoDao {

    /* renamed from: a */
    public final RoomDatabase f14149a;

    /* renamed from: b */
    public final EntityInsertionAdapter<LoginUserInfo> f14150b;

    /* renamed from: c */
    public final EntityInsertionAdapter<DeviceTemperatureInfo> f14151c;

    /* renamed from: d */
    public final EntityInsertionAdapter<WineBaseInfo> f14152d;

    /* renamed from: e */
    public final Converters f14153e = new Converters();

    /* renamed from: f */
    public final EntityDeletionOrUpdateAdapter<LoginUserInfo> f14154f;

    /* renamed from: g */
    public final EntityDeletionOrUpdateAdapter<DeviceTemperatureInfo> f14155g;

    /* renamed from: h */
    public final EntityDeletionOrUpdateAdapter<WineBaseInfo> f14156h;

    /* renamed from: i */
    public final SharedSQLiteStatement f14157i;

    /* renamed from: j */
    public final SharedSQLiteStatement f14158j;

    /* renamed from: k */
    public final SharedSQLiteStatement f14159k;

    /* renamed from: l */
    public final SharedSQLiteStatement f14160l;

    /* renamed from: m */
    public final SharedSQLiteStatement f14161m;

    /* renamed from: n */
    public final SharedSQLiteStatement f14162n;

    /* renamed from: o */
    public final SharedSQLiteStatement f14163o;

    /* renamed from: c.r.a.c.c.a.a$a */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7461a extends SharedSQLiteStatement {
        public C7461a(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM wine_inventory_new";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$b */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7462b extends SharedSQLiteStatement {
        public C7462b(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM wine_inventory_new WHERE deviceId = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$c */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7463c extends SharedSQLiteStatement {
        public C7463c(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM wine_inventory_new WHERE inventoryId = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$d */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7464d extends SharedSQLiteStatement {
        public C7464d(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE  wine_inventory_new  SET favorite =?  WHERE categoryId = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$e */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7465e extends EntityInsertionAdapter<LoginUserInfo> {
        public C7465e(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LoginUserInfo loginUserInfo) {
            if (loginUserInfo.getLogin_name() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, loginUserInfo.getLogin_name());
            }
            if (loginUserInfo.getPsw() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, loginUserInfo.getPsw());
            }
            supportSQLiteStatement.bindLong(3, (long) loginUserInfo.getSubscriber_id());
            supportSQLiteStatement.bindLong(4, (long) loginUserInfo.getCustomer_id());
            if (loginUserInfo.getCustomer_id_s() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, loginUserInfo.getCustomer_id_s());
            }
            if (loginUserInfo.getToken() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, loginUserInfo.getToken());
            }
            supportSQLiteStatement.bindLong(7, loginUserInfo.getToken_create_time());
            supportSQLiteStatement.bindLong(8, (long) loginUserInfo.getToken_expire_time());
            if (loginUserInfo.getRefresh_token() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, loginUserInfo.getRefresh_token());
            }
            supportSQLiteStatement.bindLong(10, (long) loginUserInfo.getRefresh_token_expired_time());
            if (loginUserInfo.getEmail() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, loginUserInfo.getEmail());
            }
            supportSQLiteStatement.bindLong(12, loginUserInfo.getUpdate_time());
            if (loginUserInfo.getFirst_name() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, loginUserInfo.getFirst_name());
            }
            if (loginUserInfo.getLast_name() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, loginUserInfo.getLast_name());
            }
            if (loginUserInfo.getPhoto_url() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, loginUserInfo.getPhoto_url());
            }
            if (loginUserInfo.getLogin_source() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, loginUserInfo.getLogin_source());
            }
            if (loginUserInfo.getThird_platform_id() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, loginUserInfo.getThird_platform_id());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `login_user_info` (`login_name`,`psw`,`subscriber_id`,`customer_id`,`customer_id_s`,`token`,`token_create_time`,`token_expire_time`,`refresh_token`,`refresh_token_expired_time`,`email`,`update_time`,`first_name`,`last_name`,`photo_url`,`login_source`,`third_platform_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$f */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7466f extends EntityInsertionAdapter<DeviceTemperatureInfo> {
        public C7466f(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DeviceTemperatureInfo deviceTemperatureInfo) {
            if (deviceTemperatureInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, deviceTemperatureInfo.getDeviceId());
            }
            supportSQLiteStatement.bindLong(2, deviceTemperatureInfo.getOnlineStatus() ? 1 : 0);
            if (deviceTemperatureInfo.getZone1SetTemperature() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, deviceTemperatureInfo.getZone1SetTemperature());
            }
            if (deviceTemperatureInfo.getZone2SetTemperature() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, deviceTemperatureInfo.getZone2SetTemperature());
            }
            if (deviceTemperatureInfo.getZone3SetTemperature() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, deviceTemperatureInfo.getZone3SetTemperature());
            }
            if (deviceTemperatureInfo.getZone1RealHumidity() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, deviceTemperatureInfo.getZone1RealHumidity());
            }
            if (deviceTemperatureInfo.getZone2RealHumidity() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, deviceTemperatureInfo.getZone2RealHumidity());
            }
            if (deviceTemperatureInfo.getZone3RealHumidity() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, deviceTemperatureInfo.getZone3RealHumidity());
            }
            if (deviceTemperatureInfo.getTemperatureUnit() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, deviceTemperatureInfo.getTemperatureUnit());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `device_temperature_info` (`deviceId`,`onlineStatus`,`Zone1SetTemperature`,`Zone2SetTemperature`,`Zone3SetTemperature`,`Zone1RealHumidity`,`Zone2RealHumidity`,`Zone3RealHumidity`,`temperatureUnit`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$g */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7467g extends EntityInsertionAdapter<WineBaseInfo> {
        public C7467g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineBaseInfo wineBaseInfo) {
            supportSQLiteStatement.bindLong(1, wineBaseInfo.getId());
            supportSQLiteStatement.bindLong(2, wineBaseInfo.getInventoryId());
            supportSQLiteStatement.bindLong(3, (long) wineBaseInfo.getPositionNum());
            if (wineBaseInfo.getPhotoUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wineBaseInfo.getPhotoUrl());
            }
            if (wineBaseInfo.getWineFactoryName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, wineBaseInfo.getWineFactoryName());
            }
            if (wineBaseInfo.getWineName() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wineBaseInfo.getWineName());
            }
            if (wineBaseInfo.getWineType() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wineBaseInfo.getWineType());
            }
            supportSQLiteStatement.bindLong(8, (long) wineBaseInfo.getFavorite());
            if (wineBaseInfo.getProduceYear() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, wineBaseInfo.getProduceYear());
            }
            if (wineBaseInfo.getRemindAlarmDate() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindLong(10, wineBaseInfo.getRemindAlarmDate().longValue());
            }
            if (wineBaseInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, wineBaseInfo.getDeviceId());
            }
            if (wineBaseInfo.getZoneName() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, wineBaseInfo.getZoneName());
            }
            supportSQLiteStatement.bindLong(13, (long) wineBaseInfo.getCellNum());
            if (wineBaseInfo.getCategoryId() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, wineBaseInfo.getCategoryId());
            }
            if (wineBaseInfo.getFiltered() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindLong(15, (long) wineBaseInfo.getFiltered().intValue());
            }
            supportSQLiteStatement.bindLong(16, wineBaseInfo.getInventoryDate());
            if (wineBaseInfo.getArea() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, wineBaseInfo.getArea());
            }
            if (wineBaseInfo.getCountry() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, wineBaseInfo.getCountry());
            }
            String objectToStringInfo1 = C7460a.this.f14153e.objectToStringInfo1(wineBaseInfo.getGrapes());
            if (objectToStringInfo1 == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, objectToStringInfo1);
            }
            supportSQLiteStatement.bindLong(20, (long) wineBaseInfo.getAutoAdd());
            if (wineBaseInfo.getVivinoId() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, wineBaseInfo.getVivinoId());
            }
            if (wineBaseInfo.getScore() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, wineBaseInfo.getScore());
            }
            if (wineBaseInfo.getScoreCount() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, wineBaseInfo.getScoreCount());
            }
            String objectToStringInfo12 = C7460a.this.f14153e.objectToStringInfo1(wineBaseInfo.getFoodMatch());
            if (objectToStringInfo12 == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, objectToStringInfo12);
            }
            if (wineBaseInfo.getAlcohol() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindString(25, wineBaseInfo.getAlcohol());
            }
            if (wineBaseInfo.getBestDrinkDate() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindLong(26, wineBaseInfo.getBestDrinkDate().longValue());
            }
            if (wineBaseInfo.getNotes() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, wineBaseInfo.getNotes());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `wine_inventory_new` (`id`,`inventoryId`,`positionNum`,`photoUrl`,`wineFactoryName`,`wineName`,`wineType`,`favorite`,`produceYear`,`remindAlarmDate`,`deviceId`,`zoneName`,`cellNum`,`categoryId`,`filtered`,`inventoryDate`,`area`,`country`,`grapes`,`autoAdd`,`vivinoId`,`score`,`scoreCount`,`foodMatch`,`alcohol`,`bestDrinkDate`,`notes`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$h */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7468h extends EntityDeletionOrUpdateAdapter<LoginUserInfo> {
        public C7468h(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LoginUserInfo loginUserInfo) {
            if (loginUserInfo.getLogin_name() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, loginUserInfo.getLogin_name());
            }
            if (loginUserInfo.getPsw() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, loginUserInfo.getPsw());
            }
            supportSQLiteStatement.bindLong(3, (long) loginUserInfo.getSubscriber_id());
            supportSQLiteStatement.bindLong(4, (long) loginUserInfo.getCustomer_id());
            if (loginUserInfo.getCustomer_id_s() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, loginUserInfo.getCustomer_id_s());
            }
            if (loginUserInfo.getToken() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, loginUserInfo.getToken());
            }
            supportSQLiteStatement.bindLong(7, loginUserInfo.getToken_create_time());
            supportSQLiteStatement.bindLong(8, (long) loginUserInfo.getToken_expire_time());
            if (loginUserInfo.getRefresh_token() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, loginUserInfo.getRefresh_token());
            }
            supportSQLiteStatement.bindLong(10, (long) loginUserInfo.getRefresh_token_expired_time());
            if (loginUserInfo.getEmail() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, loginUserInfo.getEmail());
            }
            supportSQLiteStatement.bindLong(12, loginUserInfo.getUpdate_time());
            if (loginUserInfo.getFirst_name() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, loginUserInfo.getFirst_name());
            }
            if (loginUserInfo.getLast_name() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, loginUserInfo.getLast_name());
            }
            if (loginUserInfo.getPhoto_url() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, loginUserInfo.getPhoto_url());
            }
            if (loginUserInfo.getLogin_source() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, loginUserInfo.getLogin_source());
            }
            if (loginUserInfo.getThird_platform_id() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, loginUserInfo.getThird_platform_id());
            }
            if (loginUserInfo.getCustomer_id_s() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, loginUserInfo.getCustomer_id_s());
            }
        }

        public String createQuery() {
            return "UPDATE OR ABORT `login_user_info` SET `login_name` = ?,`psw` = ?,`subscriber_id` = ?,`customer_id` = ?,`customer_id_s` = ?,`token` = ?,`token_create_time` = ?,`token_expire_time` = ?,`refresh_token` = ?,`refresh_token_expired_time` = ?,`email` = ?,`update_time` = ?,`first_name` = ?,`last_name` = ?,`photo_url` = ?,`login_source` = ?,`third_platform_id` = ? WHERE `customer_id_s` = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$i */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7469i extends EntityDeletionOrUpdateAdapter<DeviceTemperatureInfo> {
        public C7469i(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DeviceTemperatureInfo deviceTemperatureInfo) {
            if (deviceTemperatureInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, deviceTemperatureInfo.getDeviceId());
            }
            supportSQLiteStatement.bindLong(2, deviceTemperatureInfo.getOnlineStatus() ? 1 : 0);
            if (deviceTemperatureInfo.getZone1SetTemperature() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, deviceTemperatureInfo.getZone1SetTemperature());
            }
            if (deviceTemperatureInfo.getZone2SetTemperature() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, deviceTemperatureInfo.getZone2SetTemperature());
            }
            if (deviceTemperatureInfo.getZone3SetTemperature() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, deviceTemperatureInfo.getZone3SetTemperature());
            }
            if (deviceTemperatureInfo.getZone1RealHumidity() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, deviceTemperatureInfo.getZone1RealHumidity());
            }
            if (deviceTemperatureInfo.getZone2RealHumidity() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, deviceTemperatureInfo.getZone2RealHumidity());
            }
            if (deviceTemperatureInfo.getZone3RealHumidity() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, deviceTemperatureInfo.getZone3RealHumidity());
            }
            if (deviceTemperatureInfo.getTemperatureUnit() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, deviceTemperatureInfo.getTemperatureUnit());
            }
            if (deviceTemperatureInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, deviceTemperatureInfo.getDeviceId());
            }
        }

        public String createQuery() {
            return "UPDATE OR ABORT `device_temperature_info` SET `deviceId` = ?,`onlineStatus` = ?,`Zone1SetTemperature` = ?,`Zone2SetTemperature` = ?,`Zone3SetTemperature` = ?,`Zone1RealHumidity` = ?,`Zone2RealHumidity` = ?,`Zone3RealHumidity` = ?,`temperatureUnit` = ? WHERE `deviceId` = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$j */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7470j extends EntityDeletionOrUpdateAdapter<WineBaseInfo> {
        public C7470j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineBaseInfo wineBaseInfo) {
            supportSQLiteStatement.bindLong(1, wineBaseInfo.getId());
            supportSQLiteStatement.bindLong(2, wineBaseInfo.getInventoryId());
            supportSQLiteStatement.bindLong(3, (long) wineBaseInfo.getPositionNum());
            if (wineBaseInfo.getPhotoUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wineBaseInfo.getPhotoUrl());
            }
            if (wineBaseInfo.getWineFactoryName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, wineBaseInfo.getWineFactoryName());
            }
            if (wineBaseInfo.getWineName() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wineBaseInfo.getWineName());
            }
            if (wineBaseInfo.getWineType() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wineBaseInfo.getWineType());
            }
            supportSQLiteStatement.bindLong(8, (long) wineBaseInfo.getFavorite());
            if (wineBaseInfo.getProduceYear() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, wineBaseInfo.getProduceYear());
            }
            if (wineBaseInfo.getRemindAlarmDate() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindLong(10, wineBaseInfo.getRemindAlarmDate().longValue());
            }
            if (wineBaseInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, wineBaseInfo.getDeviceId());
            }
            if (wineBaseInfo.getZoneName() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, wineBaseInfo.getZoneName());
            }
            supportSQLiteStatement.bindLong(13, (long) wineBaseInfo.getCellNum());
            if (wineBaseInfo.getCategoryId() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, wineBaseInfo.getCategoryId());
            }
            if (wineBaseInfo.getFiltered() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindLong(15, (long) wineBaseInfo.getFiltered().intValue());
            }
            supportSQLiteStatement.bindLong(16, wineBaseInfo.getInventoryDate());
            if (wineBaseInfo.getArea() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, wineBaseInfo.getArea());
            }
            if (wineBaseInfo.getCountry() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, wineBaseInfo.getCountry());
            }
            String objectToStringInfo1 = C7460a.this.f14153e.objectToStringInfo1(wineBaseInfo.getGrapes());
            if (objectToStringInfo1 == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, objectToStringInfo1);
            }
            supportSQLiteStatement.bindLong(20, (long) wineBaseInfo.getAutoAdd());
            if (wineBaseInfo.getVivinoId() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, wineBaseInfo.getVivinoId());
            }
            if (wineBaseInfo.getScore() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, wineBaseInfo.getScore());
            }
            if (wineBaseInfo.getScoreCount() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, wineBaseInfo.getScoreCount());
            }
            String objectToStringInfo12 = C7460a.this.f14153e.objectToStringInfo1(wineBaseInfo.getFoodMatch());
            if (objectToStringInfo12 == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, objectToStringInfo12);
            }
            if (wineBaseInfo.getAlcohol() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindString(25, wineBaseInfo.getAlcohol());
            }
            if (wineBaseInfo.getBestDrinkDate() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindLong(26, wineBaseInfo.getBestDrinkDate().longValue());
            }
            if (wineBaseInfo.getNotes() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, wineBaseInfo.getNotes());
            }
            supportSQLiteStatement.bindLong(28, wineBaseInfo.getId());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `wine_inventory_new` SET `id` = ?,`inventoryId` = ?,`positionNum` = ?,`photoUrl` = ?,`wineFactoryName` = ?,`wineName` = ?,`wineType` = ?,`favorite` = ?,`produceYear` = ?,`remindAlarmDate` = ?,`deviceId` = ?,`zoneName` = ?,`cellNum` = ?,`categoryId` = ?,`filtered` = ?,`inventoryDate` = ?,`area` = ?,`country` = ?,`grapes` = ?,`autoAdd` = ?,`vivinoId` = ?,`score` = ?,`scoreCount` = ?,`foodMatch` = ?,`alcohol` = ?,`bestDrinkDate` = ?,`notes` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$k */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7471k extends SharedSQLiteStatement {
        public C7471k(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE  FROM login_user_info where customer_id_s = ?";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$l */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7472l extends SharedSQLiteStatement {
        public C7472l(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM login_user_info";
        }
    }

    /* renamed from: c.r.a.c.c.a.a$m */
    /* compiled from: LoginUserInfoDao_Impl */
    public class C7473m extends SharedSQLiteStatement {
        public C7473m(C7460a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM device_temperature_info";
        }
    }

    public C7460a(RoomDatabase roomDatabase) {
        this.f14149a = roomDatabase;
        this.f14150b = new C7465e(this, roomDatabase);
        this.f14151c = new C7466f(this, roomDatabase);
        this.f14152d = new C7467g(roomDatabase);
        this.f14154f = new C7468h(this, roomDatabase);
        this.f14155g = new C7469i(this, roomDatabase);
        this.f14156h = new C7470j(roomDatabase);
        this.f14157i = new C7471k(this, roomDatabase);
        this.f14158j = new C7472l(this, roomDatabase);
        this.f14159k = new C7473m(this, roomDatabase);
        this.f14160l = new C7461a(this, roomDatabase);
        this.f14161m = new C7462b(this, roomDatabase);
        this.f14162n = new C7463c(this, roomDatabase);
        this.f14163o = new C7464d(this, roomDatabase);
    }

    /* renamed from: b */
    public static List<Class<?>> m21427b() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14158j.acquire();
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14158j.release(acquire);
        }
    }

    public void deleteAllDeviceInfo() {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14159k.acquire();
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14159k.release(acquire);
        }
    }

    public void deleteAllWineInventroyNew() {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14160l.acquire();
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14160l.release(acquire);
        }
    }

    public void deleteById(String str) {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14157i.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14157i.release(acquire);
        }
    }

    public void deleteCategoryId(List<String> list) {
        this.f14149a.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM wine_inventory_new WHERE categoryId in (");
        StringUtil.appendPlaceholders(newStringBuilder, list.size());
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.f14149a.compileStatement(newStringBuilder.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, next);
            }
            i++;
        }
        this.f14149a.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void deleteSingleWineInventroyNew(String str) {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14162n.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14162n.release(acquire);
        }
    }

    public void deleteSingleWineInventroyNewList(List<String> list) {
        this.f14149a.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM wine_inventory_new WHERE inventoryId in (");
        StringUtil.appendPlaceholders(newStringBuilder, list.size());
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.f14149a.compileStatement(newStringBuilder.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, next);
            }
            i++;
        }
        this.f14149a.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void deleteWineByDeviceId(String str) {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14161m.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14161m.release(acquire);
        }
    }

    public List<LoginUserInfo> getAll() {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String string;
        String string2;
        String string3;
        String str8;
        int i2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM login_user_info", 0);
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "login_name");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, EventBusConstKt.PSW);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "subscriber_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "customer_id_s");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseMessagingService.EXTRA_TOKEN);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "token_create_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "token_expire_time");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "refresh_token");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "refresh_token_expired_time");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "email");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "update_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "first_name");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "last_name");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "photo_url");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "login_source");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "third_platform_id");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow);
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    int i4 = query.getInt(columnIndexOrThrow3);
                    int i5 = query.getInt(columnIndexOrThrow4);
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
                    int i6 = query.getInt(columnIndexOrThrow8);
                    if (query.isNull(columnIndexOrThrow9)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow9);
                    }
                    int i7 = query.getInt(columnIndexOrThrow10);
                    if (query.isNull(columnIndexOrThrow11)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow11);
                    }
                    long j2 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i3;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow13);
                        i = i3;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i8 = columnIndexOrThrow15;
                    int i9 = columnIndexOrThrow;
                    int i10 = i8;
                    if (query.isNull(i10)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(i10);
                    }
                    int i11 = columnIndexOrThrow16;
                    int i12 = i10;
                    int i13 = i11;
                    if (query.isNull(i13)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(i13);
                    }
                    int i14 = columnIndexOrThrow17;
                    int i15 = i13;
                    int i16 = i14;
                    if (query.isNull(i16)) {
                        i2 = i16;
                        str8 = null;
                    } else {
                        str8 = query.getString(i16);
                        i2 = i16;
                    }
                    arrayList.add(new LoginUserInfo(str, str2, i4, i5, str3, str4, j, i6, str5, i7, str6, j2, str7, string, string2, string3, str8));
                    columnIndexOrThrow = i9;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow16 = i15;
                    columnIndexOrThrow17 = i2;
                    i3 = i;
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

    public List<DeviceTemperatureInfo> getAllDeviceInfo() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM device_temperature_info", 0);
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "deviceId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "onlineStatus");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "Zone1SetTemperature");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "Zone2SetTemperature");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "Zone3SetTemperature");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "Zone1RealHumidity");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "Zone2RealHumidity");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "Zone3RealHumidity");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "temperatureUnit");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(columnIndexOrThrow)) {
                    str = null;
                } else {
                    str = query.getString(columnIndexOrThrow);
                }
                boolean z = query.getInt(columnIndexOrThrow2) != 0;
                if (query.isNull(columnIndexOrThrow3)) {
                    str2 = null;
                } else {
                    str2 = query.getString(columnIndexOrThrow3);
                }
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
                if (query.isNull(columnIndexOrThrow8)) {
                    str7 = null;
                } else {
                    str7 = query.getString(columnIndexOrThrow8);
                }
                if (query.isNull(columnIndexOrThrow9)) {
                    str8 = null;
                } else {
                    str8 = query.getString(columnIndexOrThrow9);
                }
                arrayList.add(new DeviceTemperatureInfo(str, z, str2, str3, str4, str5, str6, str7, str8));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<WineBaseInfo> getAllWineInventoryByDeviceid(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        String str8;
        String string;
        Integer valueOf;
        String str9;
        int i;
        String str10;
        int i2;
        int i3;
        int i4;
        String string2;
        int i5;
        String str11;
        int i6;
        String str12;
        int i7;
        String str13;
        int i8;
        String str14;
        String str15;
        int i9;
        Long l2;
        int i10;
        String str16;
        String str17 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory_new WHERE deviceId = ?", 1);
        if (str17 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str17);
        }
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "inventoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "positionNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "remindAlarmDate");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceId");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "zoneName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "cellNum");
            roomSQLiteQuery = acquire;
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "inventoryDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "autoAdd");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_VIVINO_ID);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "score");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "scoreCount");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "foodMatch");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "alcohol");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "bestDrinkDate");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                int i11 = columnIndexOrThrow;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow2);
                    long j2 = query.getLong(columnIndexOrThrow3);
                    int i12 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow8);
                    }
                    int i13 = query.getInt(columnIndexOrThrow9);
                    if (query.isNull(columnIndexOrThrow10)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow13);
                    }
                    int i14 = query.getInt(columnIndexOrThrow14);
                    int i15 = i11;
                    if (query.isNull(i15)) {
                        string = null;
                    } else {
                        string = query.getString(i15);
                    }
                    int i16 = columnIndexOrThrow15;
                    int i17 = columnIndexOrThrow2;
                    int i18 = i16;
                    if (query.isNull(i18)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(query.getInt(i18));
                    }
                    int i19 = columnIndexOrThrow16;
                    int i20 = i18;
                    int i21 = i19;
                    long j3 = query.getLong(i21);
                    int i22 = i21;
                    int i23 = columnIndexOrThrow17;
                    if (query.isNull(i23)) {
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                        str9 = null;
                    } else {
                        str9 = query.getString(i23);
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                    }
                    if (query.isNull(i)) {
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                        str10 = null;
                    } else {
                        str10 = query.getString(i);
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i2)) {
                        i3 = i2;
                        i5 = i15;
                        i4 = columnIndexOrThrow14;
                        string2 = null;
                    } else {
                        i3 = i2;
                        i4 = columnIndexOrThrow14;
                        string2 = query.getString(i2);
                        i5 = i15;
                    }
                    try {
                        List<String> stringToObjectInfo1 = this.f14153e.stringToObjectInfo1(string2);
                        int i24 = columnIndexOrThrow20;
                        int i25 = query.getInt(i24);
                        int i26 = columnIndexOrThrow21;
                        if (query.isNull(i26)) {
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                            str11 = null;
                        } else {
                            str11 = query.getString(i26);
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                        }
                        if (query.isNull(i6)) {
                            columnIndexOrThrow22 = i6;
                            i7 = columnIndexOrThrow23;
                            str12 = null;
                        } else {
                            columnIndexOrThrow22 = i6;
                            str12 = query.getString(i6);
                            i7 = columnIndexOrThrow23;
                        }
                        if (query.isNull(i7)) {
                            columnIndexOrThrow23 = i7;
                            i8 = columnIndexOrThrow24;
                            str13 = null;
                        } else {
                            columnIndexOrThrow23 = i7;
                            str13 = query.getString(i7);
                            i8 = columnIndexOrThrow24;
                        }
                        if (query.isNull(i8)) {
                            columnIndexOrThrow24 = i8;
                            columnIndexOrThrow21 = i26;
                            str14 = null;
                        } else {
                            columnIndexOrThrow24 = i8;
                            str14 = query.getString(i8);
                            columnIndexOrThrow21 = i26;
                        }
                        List<String> stringToObjectInfo12 = this.f14153e.stringToObjectInfo1(str14);
                        int i27 = columnIndexOrThrow25;
                        if (query.isNull(i27)) {
                            i9 = columnIndexOrThrow26;
                            str15 = null;
                        } else {
                            str15 = query.getString(i27);
                            i9 = columnIndexOrThrow26;
                        }
                        if (query.isNull(i9)) {
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(query.getLong(i9));
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                        }
                        if (query.isNull(i10)) {
                            columnIndexOrThrow27 = i10;
                            str16 = null;
                        } else {
                            columnIndexOrThrow27 = i10;
                            str16 = query.getString(i10);
                        }
                        arrayList.add(new WineBaseInfo(j, j2, i12, str2, str3, str4, str5, i13, str6, l, str7, str8, i14, string, valueOf, j3, str9, str10, stringToObjectInfo1, i25, str11, str12, str13, stringToObjectInfo12, str15, l2, str16));
                        columnIndexOrThrow26 = i9;
                        columnIndexOrThrow2 = i17;
                        columnIndexOrThrow15 = i20;
                        columnIndexOrThrow16 = i22;
                        columnIndexOrThrow14 = i4;
                        i11 = i5;
                        columnIndexOrThrow19 = i3;
                    } catch (Throwable th2) {
                        th = th2;
                        query.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WineBaseInfo> getAllWineInventoryNew() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        String str6;
        String str7;
        String string;
        Integer valueOf;
        String str8;
        int i;
        String str9;
        int i2;
        int i3;
        int i4;
        String string2;
        int i5;
        String str10;
        int i6;
        String str11;
        int i7;
        String str12;
        int i8;
        String str13;
        String str14;
        int i9;
        Long l2;
        int i10;
        String str15;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory_new", 0);
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "inventoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "positionNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "remindAlarmDate");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceId");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "zoneName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "cellNum");
            roomSQLiteQuery = acquire;
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "inventoryDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "autoAdd");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_VIVINO_ID);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "score");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "scoreCount");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "foodMatch");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "alcohol");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "bestDrinkDate");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                int i11 = columnIndexOrThrow;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow2);
                    long j2 = query.getLong(columnIndexOrThrow3);
                    int i12 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow8);
                    }
                    int i13 = query.getInt(columnIndexOrThrow9);
                    if (query.isNull(columnIndexOrThrow10)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow13);
                    }
                    int i14 = query.getInt(columnIndexOrThrow14);
                    int i15 = i11;
                    if (query.isNull(i15)) {
                        string = null;
                    } else {
                        string = query.getString(i15);
                    }
                    int i16 = columnIndexOrThrow15;
                    int i17 = columnIndexOrThrow2;
                    int i18 = i16;
                    if (query.isNull(i18)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(query.getInt(i18));
                    }
                    int i19 = columnIndexOrThrow16;
                    int i20 = i18;
                    int i21 = i19;
                    long j3 = query.getLong(i21);
                    int i22 = i21;
                    int i23 = columnIndexOrThrow17;
                    if (query.isNull(i23)) {
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                        str8 = null;
                    } else {
                        str8 = query.getString(i23);
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                    }
                    if (query.isNull(i)) {
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                        str9 = null;
                    } else {
                        str9 = query.getString(i);
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i2)) {
                        i3 = i2;
                        i5 = i15;
                        i4 = columnIndexOrThrow14;
                        string2 = null;
                    } else {
                        i3 = i2;
                        i4 = columnIndexOrThrow14;
                        string2 = query.getString(i2);
                        i5 = i15;
                    }
                    try {
                        List<String> stringToObjectInfo1 = this.f14153e.stringToObjectInfo1(string2);
                        int i24 = columnIndexOrThrow20;
                        int i25 = query.getInt(i24);
                        int i26 = columnIndexOrThrow21;
                        if (query.isNull(i26)) {
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                            str10 = null;
                        } else {
                            str10 = query.getString(i26);
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                        }
                        if (query.isNull(i6)) {
                            columnIndexOrThrow22 = i6;
                            i7 = columnIndexOrThrow23;
                            str11 = null;
                        } else {
                            columnIndexOrThrow22 = i6;
                            str11 = query.getString(i6);
                            i7 = columnIndexOrThrow23;
                        }
                        if (query.isNull(i7)) {
                            columnIndexOrThrow23 = i7;
                            i8 = columnIndexOrThrow24;
                            str12 = null;
                        } else {
                            columnIndexOrThrow23 = i7;
                            str12 = query.getString(i7);
                            i8 = columnIndexOrThrow24;
                        }
                        if (query.isNull(i8)) {
                            columnIndexOrThrow24 = i8;
                            columnIndexOrThrow21 = i26;
                            str13 = null;
                        } else {
                            columnIndexOrThrow24 = i8;
                            str13 = query.getString(i8);
                            columnIndexOrThrow21 = i26;
                        }
                        List<String> stringToObjectInfo12 = this.f14153e.stringToObjectInfo1(str13);
                        int i27 = columnIndexOrThrow25;
                        if (query.isNull(i27)) {
                            i9 = columnIndexOrThrow26;
                            str14 = null;
                        } else {
                            str14 = query.getString(i27);
                            i9 = columnIndexOrThrow26;
                        }
                        if (query.isNull(i9)) {
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(query.getLong(i9));
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                        }
                        if (query.isNull(i10)) {
                            columnIndexOrThrow27 = i10;
                            str15 = null;
                        } else {
                            columnIndexOrThrow27 = i10;
                            str15 = query.getString(i10);
                        }
                        arrayList.add(new WineBaseInfo(j, j2, i12, str, str2, str3, str4, i13, str5, l, str6, str7, i14, string, valueOf, j3, str8, str9, stringToObjectInfo1, i25, str10, str11, str12, stringToObjectInfo12, str14, l2, str15));
                        columnIndexOrThrow26 = i9;
                        columnIndexOrThrow2 = i17;
                        columnIndexOrThrow15 = i20;
                        columnIndexOrThrow16 = i22;
                        columnIndexOrThrow14 = i4;
                        i11 = i5;
                        columnIndexOrThrow19 = i3;
                    } catch (Throwable th2) {
                        th = th2;
                        query.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public LoginUserInfo getUserInfoById(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        LoginUserInfo loginUserInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        int i2;
        String str11;
        String str12;
        String str13 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM login_user_info where customer_id_s = ?", 1);
        if (str13 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str13);
        }
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "login_name");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, EventBusConstKt.PSW);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "subscriber_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "customer_id_s");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseMessagingService.EXTRA_TOKEN);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "token_create_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "token_expire_time");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "refresh_token");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "refresh_token_expired_time");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "email");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "update_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "first_name");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "last_name");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "photo_url");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "login_source");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "third_platform_id");
                if (query.moveToFirst()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow);
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow2);
                    }
                    int i3 = query.getInt(columnIndexOrThrow3);
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
                    long j = query.getLong(columnIndexOrThrow7);
                    int i5 = query.getInt(columnIndexOrThrow8);
                    if (query.isNull(columnIndexOrThrow9)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow9);
                    }
                    int i6 = query.getInt(columnIndexOrThrow10);
                    if (query.isNull(columnIndexOrThrow11)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow11);
                    }
                    long j2 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow13);
                    }
                    if (query.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow15;
                        str9 = null;
                    } else {
                        str9 = query.getString(columnIndexOrThrow14);
                        i = columnIndexOrThrow15;
                    }
                    if (query.isNull(i)) {
                        i2 = columnIndexOrThrow16;
                        str10 = null;
                    } else {
                        str10 = query.getString(i);
                        i2 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i2)) {
                        str11 = null;
                    } else {
                        str11 = query.getString(i2);
                    }
                    if (query.isNull(columnIndexOrThrow17)) {
                        str12 = null;
                    } else {
                        str12 = query.getString(columnIndexOrThrow17);
                    }
                    loginUserInfo = new LoginUserInfo(str2, str3, i3, i4, str4, str5, j, i5, str6, i6, str7, j2, str8, str9, str10, str11, str12);
                } else {
                    loginUserInfo = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return loginUserInfo;
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

    public void insert(LoginUserInfo loginUserInfo) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14150b.insert(loginUserInfo);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void insertDeviceInfo(DeviceTemperatureInfo deviceTemperatureInfo) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14151c.insert(deviceTemperatureInfo);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void insertWineInventroyNew(List<WineBaseInfo> list) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14152d.insert(list);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public List<WineBaseInfo> queryByVivinoId(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        String str8;
        String string;
        Integer valueOf;
        String str9;
        int i;
        String str10;
        int i2;
        int i3;
        int i4;
        String string2;
        int i5;
        String str11;
        int i6;
        String str12;
        int i7;
        String str13;
        int i8;
        String str14;
        String str15;
        int i9;
        Long l2;
        int i10;
        String str16;
        String str17 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT *FROM wine_inventory_new WHERE vivinoId = ?", 1);
        if (str17 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str17);
        }
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "inventoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "positionNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "remindAlarmDate");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceId");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "zoneName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "cellNum");
            roomSQLiteQuery = acquire;
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "inventoryDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "autoAdd");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_VIVINO_ID);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "score");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "scoreCount");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "foodMatch");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "alcohol");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "bestDrinkDate");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                int i11 = columnIndexOrThrow;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow2);
                    long j2 = query.getLong(columnIndexOrThrow3);
                    int i12 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow8);
                    }
                    int i13 = query.getInt(columnIndexOrThrow9);
                    if (query.isNull(columnIndexOrThrow10)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow13);
                    }
                    int i14 = query.getInt(columnIndexOrThrow14);
                    int i15 = i11;
                    if (query.isNull(i15)) {
                        string = null;
                    } else {
                        string = query.getString(i15);
                    }
                    int i16 = columnIndexOrThrow15;
                    int i17 = columnIndexOrThrow2;
                    int i18 = i16;
                    if (query.isNull(i18)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(query.getInt(i18));
                    }
                    int i19 = columnIndexOrThrow16;
                    int i20 = i18;
                    int i21 = i19;
                    long j3 = query.getLong(i21);
                    int i22 = i21;
                    int i23 = columnIndexOrThrow17;
                    if (query.isNull(i23)) {
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                        str9 = null;
                    } else {
                        str9 = query.getString(i23);
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                    }
                    if (query.isNull(i)) {
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                        str10 = null;
                    } else {
                        str10 = query.getString(i);
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i2)) {
                        i3 = i2;
                        i5 = i15;
                        i4 = columnIndexOrThrow14;
                        string2 = null;
                    } else {
                        i3 = i2;
                        i4 = columnIndexOrThrow14;
                        string2 = query.getString(i2);
                        i5 = i15;
                    }
                    try {
                        List<String> stringToObjectInfo1 = this.f14153e.stringToObjectInfo1(string2);
                        int i24 = columnIndexOrThrow20;
                        int i25 = query.getInt(i24);
                        int i26 = columnIndexOrThrow21;
                        if (query.isNull(i26)) {
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                            str11 = null;
                        } else {
                            str11 = query.getString(i26);
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                        }
                        if (query.isNull(i6)) {
                            columnIndexOrThrow22 = i6;
                            i7 = columnIndexOrThrow23;
                            str12 = null;
                        } else {
                            columnIndexOrThrow22 = i6;
                            str12 = query.getString(i6);
                            i7 = columnIndexOrThrow23;
                        }
                        if (query.isNull(i7)) {
                            columnIndexOrThrow23 = i7;
                            i8 = columnIndexOrThrow24;
                            str13 = null;
                        } else {
                            columnIndexOrThrow23 = i7;
                            str13 = query.getString(i7);
                            i8 = columnIndexOrThrow24;
                        }
                        if (query.isNull(i8)) {
                            columnIndexOrThrow24 = i8;
                            columnIndexOrThrow21 = i26;
                            str14 = null;
                        } else {
                            columnIndexOrThrow24 = i8;
                            str14 = query.getString(i8);
                            columnIndexOrThrow21 = i26;
                        }
                        List<String> stringToObjectInfo12 = this.f14153e.stringToObjectInfo1(str14);
                        int i27 = columnIndexOrThrow25;
                        if (query.isNull(i27)) {
                            i9 = columnIndexOrThrow26;
                            str15 = null;
                        } else {
                            str15 = query.getString(i27);
                            i9 = columnIndexOrThrow26;
                        }
                        if (query.isNull(i9)) {
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(query.getLong(i9));
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                        }
                        if (query.isNull(i10)) {
                            columnIndexOrThrow27 = i10;
                            str16 = null;
                        } else {
                            columnIndexOrThrow27 = i10;
                            str16 = query.getString(i10);
                        }
                        arrayList.add(new WineBaseInfo(j, j2, i12, str2, str3, str4, str5, i13, str6, l, str7, str8, i14, string, valueOf, j3, str9, str10, stringToObjectInfo1, i25, str11, str12, str13, stringToObjectInfo12, str15, l2, str16));
                        columnIndexOrThrow26 = i9;
                        columnIndexOrThrow2 = i17;
                        columnIndexOrThrow15 = i20;
                        columnIndexOrThrow16 = i22;
                        columnIndexOrThrow14 = i4;
                        i11 = i5;
                        columnIndexOrThrow19 = i3;
                    } catch (Throwable th2) {
                        th = th2;
                        query.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WineBaseInfo> queryCategoryId(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        String str8;
        String string;
        Integer valueOf;
        String str9;
        int i;
        String str10;
        int i2;
        int i3;
        int i4;
        String string2;
        int i5;
        String str11;
        int i6;
        String str12;
        int i7;
        String str13;
        int i8;
        String str14;
        String str15;
        int i9;
        Long l2;
        int i10;
        String str16;
        String str17 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT *FROM wine_inventory_new WHERE categoryId = ?", 1);
        if (str17 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str17);
        }
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "inventoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "positionNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "remindAlarmDate");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceId");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "zoneName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "cellNum");
            roomSQLiteQuery = acquire;
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "inventoryDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "autoAdd");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_VIVINO_ID);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "score");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "scoreCount");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "foodMatch");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "alcohol");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "bestDrinkDate");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                int i11 = columnIndexOrThrow;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow2);
                    long j2 = query.getLong(columnIndexOrThrow3);
                    int i12 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow8);
                    }
                    int i13 = query.getInt(columnIndexOrThrow9);
                    if (query.isNull(columnIndexOrThrow10)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow13);
                    }
                    int i14 = query.getInt(columnIndexOrThrow14);
                    int i15 = i11;
                    if (query.isNull(i15)) {
                        string = null;
                    } else {
                        string = query.getString(i15);
                    }
                    int i16 = columnIndexOrThrow15;
                    int i17 = columnIndexOrThrow2;
                    int i18 = i16;
                    if (query.isNull(i18)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(query.getInt(i18));
                    }
                    int i19 = columnIndexOrThrow16;
                    int i20 = i18;
                    int i21 = i19;
                    long j3 = query.getLong(i21);
                    int i22 = i21;
                    int i23 = columnIndexOrThrow17;
                    if (query.isNull(i23)) {
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                        str9 = null;
                    } else {
                        str9 = query.getString(i23);
                        columnIndexOrThrow17 = i23;
                        i = columnIndexOrThrow18;
                    }
                    if (query.isNull(i)) {
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                        str10 = null;
                    } else {
                        str10 = query.getString(i);
                        columnIndexOrThrow18 = i;
                        i2 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i2)) {
                        i3 = i2;
                        i5 = i15;
                        i4 = columnIndexOrThrow14;
                        string2 = null;
                    } else {
                        i3 = i2;
                        i4 = columnIndexOrThrow14;
                        string2 = query.getString(i2);
                        i5 = i15;
                    }
                    try {
                        List<String> stringToObjectInfo1 = this.f14153e.stringToObjectInfo1(string2);
                        int i24 = columnIndexOrThrow20;
                        int i25 = query.getInt(i24);
                        int i26 = columnIndexOrThrow21;
                        if (query.isNull(i26)) {
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                            str11 = null;
                        } else {
                            str11 = query.getString(i26);
                            columnIndexOrThrow20 = i24;
                            i6 = columnIndexOrThrow22;
                        }
                        if (query.isNull(i6)) {
                            columnIndexOrThrow22 = i6;
                            i7 = columnIndexOrThrow23;
                            str12 = null;
                        } else {
                            columnIndexOrThrow22 = i6;
                            str12 = query.getString(i6);
                            i7 = columnIndexOrThrow23;
                        }
                        if (query.isNull(i7)) {
                            columnIndexOrThrow23 = i7;
                            i8 = columnIndexOrThrow24;
                            str13 = null;
                        } else {
                            columnIndexOrThrow23 = i7;
                            str13 = query.getString(i7);
                            i8 = columnIndexOrThrow24;
                        }
                        if (query.isNull(i8)) {
                            columnIndexOrThrow24 = i8;
                            columnIndexOrThrow21 = i26;
                            str14 = null;
                        } else {
                            columnIndexOrThrow24 = i8;
                            str14 = query.getString(i8);
                            columnIndexOrThrow21 = i26;
                        }
                        List<String> stringToObjectInfo12 = this.f14153e.stringToObjectInfo1(str14);
                        int i27 = columnIndexOrThrow25;
                        if (query.isNull(i27)) {
                            i9 = columnIndexOrThrow26;
                            str15 = null;
                        } else {
                            str15 = query.getString(i27);
                            i9 = columnIndexOrThrow26;
                        }
                        if (query.isNull(i9)) {
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(query.getLong(i9));
                            columnIndexOrThrow25 = i27;
                            i10 = columnIndexOrThrow27;
                        }
                        if (query.isNull(i10)) {
                            columnIndexOrThrow27 = i10;
                            str16 = null;
                        } else {
                            columnIndexOrThrow27 = i10;
                            str16 = query.getString(i10);
                        }
                        arrayList.add(new WineBaseInfo(j, j2, i12, str2, str3, str4, str5, i13, str6, l, str7, str8, i14, string, valueOf, j3, str9, str10, stringToObjectInfo1, i25, str11, str12, str13, stringToObjectInfo12, str15, l2, str16));
                        columnIndexOrThrow26 = i9;
                        columnIndexOrThrow2 = i17;
                        columnIndexOrThrow15 = i20;
                        columnIndexOrThrow16 = i22;
                        columnIndexOrThrow14 = i4;
                        i11 = i5;
                        columnIndexOrThrow19 = i3;
                    } catch (Throwable th2) {
                        th = th2;
                        query.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public WineBaseInfo queryWineInventoryByInventoryId(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        WineBaseInfo wineBaseInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        String str8;
        String str9;
        int i;
        Integer num;
        int i2;
        String str10;
        int i3;
        String str11;
        int i4;
        String string;
        String str12;
        int i5;
        String str13;
        int i6;
        String str14;
        int i7;
        String str15;
        String str16;
        int i8;
        Long l2;
        String str17;
        String str18 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT *FROM wine_inventory_new WHERE inventoryId = ?", 1);
        if (str18 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str18);
        }
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "inventoryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "positionNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "photoUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "wineFactoryName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "wineName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "wineType");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "produceYear");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "remindAlarmDate");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "deviceId");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "zoneName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "cellNum");
            roomSQLiteQuery = acquire;
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "filtered");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "inventoryDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "area");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "country");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "grapes");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "autoAdd");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_VIVINO_ID);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "score");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "scoreCount");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "foodMatch");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "alcohol");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "bestDrinkDate");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                if (query.moveToFirst()) {
                    long j = query.getLong(columnIndexOrThrow2);
                    long j2 = query.getLong(columnIndexOrThrow3);
                    int i9 = query.getInt(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow8);
                    }
                    int i10 = query.getInt(columnIndexOrThrow9);
                    if (query.isNull(columnIndexOrThrow10)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow11));
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow13);
                    }
                    int i11 = query.getInt(columnIndexOrThrow14);
                    if (query.isNull(columnIndexOrThrow)) {
                        i = columnIndexOrThrow15;
                        str9 = null;
                    } else {
                        str9 = query.getString(columnIndexOrThrow);
                        i = columnIndexOrThrow15;
                    }
                    if (query.isNull(i)) {
                        i2 = columnIndexOrThrow16;
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(i));
                        i2 = columnIndexOrThrow16;
                    }
                    long j3 = query.getLong(i2);
                    int i12 = columnIndexOrThrow17;
                    if (query.isNull(i12)) {
                        i3 = columnIndexOrThrow18;
                        str10 = null;
                    } else {
                        str10 = query.getString(i12);
                        i3 = columnIndexOrThrow18;
                    }
                    if (query.isNull(i3)) {
                        i4 = columnIndexOrThrow19;
                        str11 = null;
                    } else {
                        str11 = query.getString(i3);
                        i4 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i4)) {
                        string = null;
                    } else {
                        string = query.getString(i4);
                    }
                    try {
                        List<String> stringToObjectInfo1 = this.f14153e.stringToObjectInfo1(string);
                        int i13 = query.getInt(columnIndexOrThrow20);
                        int i14 = columnIndexOrThrow21;
                        if (query.isNull(i14)) {
                            i5 = columnIndexOrThrow22;
                            str12 = null;
                        } else {
                            str12 = query.getString(i14);
                            i5 = columnIndexOrThrow22;
                        }
                        if (query.isNull(i5)) {
                            i6 = columnIndexOrThrow23;
                            str13 = null;
                        } else {
                            str13 = query.getString(i5);
                            i6 = columnIndexOrThrow23;
                        }
                        if (query.isNull(i6)) {
                            i7 = columnIndexOrThrow24;
                            str14 = null;
                        } else {
                            str14 = query.getString(i6);
                            i7 = columnIndexOrThrow24;
                        }
                        if (query.isNull(i7)) {
                            str15 = null;
                        } else {
                            str15 = query.getString(i7);
                        }
                        List<String> stringToObjectInfo12 = this.f14153e.stringToObjectInfo1(str15);
                        int i15 = columnIndexOrThrow25;
                        if (query.isNull(i15)) {
                            i8 = columnIndexOrThrow26;
                            str16 = null;
                        } else {
                            str16 = query.getString(i15);
                            i8 = columnIndexOrThrow26;
                        }
                        if (query.isNull(i8)) {
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(query.getLong(i8));
                        }
                        if (query.isNull(columnIndexOrThrow27)) {
                            str17 = null;
                        } else {
                            str17 = query.getString(columnIndexOrThrow27);
                        }
                        wineBaseInfo = new WineBaseInfo(j, j2, i9, str2, str3, str4, str5, i10, str6, l, str7, str8, i11, str9, num, j3, str10, str11, stringToObjectInfo1, i13, str12, str13, str14, stringToObjectInfo12, str16, l2, str17);
                    } catch (Throwable th2) {
                        th = th2;
                        query.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } else {
                    wineBaseInfo = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return wineBaseInfo;
            } catch (Throwable th3) {
                th = th3;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<LoginUserInfo> sortAndGetAll() {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String string;
        String string2;
        String string3;
        String str8;
        int i2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM login_user_info ORDER BY update_time DESC", 0);
        this.f14149a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14149a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "login_name");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, EventBusConstKt.PSW);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "subscriber_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "customer_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "customer_id_s");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseMessagingService.EXTRA_TOKEN);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "token_create_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "token_expire_time");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "refresh_token");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "refresh_token_expired_time");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "email");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "update_time");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "first_name");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "last_name");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "photo_url");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "login_source");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "third_platform_id");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow);
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    int i4 = query.getInt(columnIndexOrThrow3);
                    int i5 = query.getInt(columnIndexOrThrow4);
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
                    int i6 = query.getInt(columnIndexOrThrow8);
                    if (query.isNull(columnIndexOrThrow9)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow9);
                    }
                    int i7 = query.getInt(columnIndexOrThrow10);
                    if (query.isNull(columnIndexOrThrow11)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow11);
                    }
                    long j2 = query.getLong(columnIndexOrThrow12);
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = i3;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow13);
                        i = i3;
                    }
                    if (query.isNull(i)) {
                        string = null;
                    } else {
                        string = query.getString(i);
                    }
                    int i8 = columnIndexOrThrow15;
                    int i9 = columnIndexOrThrow;
                    int i10 = i8;
                    if (query.isNull(i10)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(i10);
                    }
                    int i11 = columnIndexOrThrow16;
                    int i12 = i10;
                    int i13 = i11;
                    if (query.isNull(i13)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(i13);
                    }
                    int i14 = columnIndexOrThrow17;
                    int i15 = i13;
                    int i16 = i14;
                    if (query.isNull(i16)) {
                        i2 = i16;
                        str8 = null;
                    } else {
                        str8 = query.getString(i16);
                        i2 = i16;
                    }
                    arrayList.add(new LoginUserInfo(str, str2, i4, i5, str3, str4, j, i6, str5, i7, str6, j2, str7, string, string2, string3, str8));
                    columnIndexOrThrow = i9;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow16 = i15;
                    columnIndexOrThrow17 = i2;
                    i3 = i;
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

    public void upDateWineInventroyNew(WineBaseInfo wineBaseInfo) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14156h.handle(wineBaseInfo);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void update(LoginUserInfo loginUserInfo) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14154f.handle(loginUserInfo);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void updateDeviceInfo(DeviceTemperatureInfo deviceTemperatureInfo) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14155g.handle(deviceTemperatureInfo);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }

    public void updateWineFavorite(String str, int i) {
        this.f14149a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14163o.acquire();
        acquire.bindLong(1, (long) i);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f14149a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
            this.f14163o.release(acquire);
        }
    }

    public void updateWineInventoryNewList(List<WineBaseInfo> list) {
        this.f14149a.assertNotSuspendingTransaction();
        this.f14149a.beginTransaction();
        try {
            this.f14156h.handleMultiple(list);
            this.f14149a.setTransactionSuccessful();
        } finally {
            this.f14149a.endTransaction();
        }
    }
}
