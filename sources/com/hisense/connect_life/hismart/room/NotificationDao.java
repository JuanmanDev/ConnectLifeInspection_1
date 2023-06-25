package com.hisense.connect_life.hismart.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H'J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H'J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u0006H'J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0015\u001a\u00020\u0016H'J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H'J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H'J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH'J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH'J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H'J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH'¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/room/NotificationDao;", "", "deleteAll", "", "deleteById", "id", "", "findExist", "", "Lcom/hisense/connect_life/hismart/room/Notification;", "msgId", "getAlarm", "startTime", "", "endTime", "msgType", "", "customerId", "getAll", "deviceId", "getByReadStatus", "readStatus", "", "getByTime", "getInventory", "insert", "notification", "update", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationDao.kt */
public interface NotificationDao {
    @Query("DELETE FROM notification")
    void deleteAll();

    @Query("DELETE  FROM notification where msg_id = :id")
    void deleteById(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM notification where msg_id = :msgId")
    List<Notification> findExist(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM notification a where a.insert_time > :startTime and a.insert_time < :endTime and a.msg_type = :msgType")
    List<Notification> getAlarm(long j, long j2, int i);

    @NotNull
    @Query("SELECT * FROM notification a where a.customer_id = :customerId and a.insert_time > :startTime and a.insert_time < :endTime and a.msg_type = :msgType")
    List<Notification> getAlarm(@NotNull String str, long j, long j2, int i);

    @NotNull
    @Query("SELECT * FROM notification")
    List<Notification> getAll();

    @NotNull
    @Query("SELECT * FROM notification where customer_id = :customerId")
    List<Notification> getAll(@NotNull String str);

    @NotNull
    @Query("SELECT * FROM notification a where a.customer_id = :customerId and a.device_id = :deviceId")
    List<Notification> getAll(@NotNull String str, @NotNull String str2);

    @NotNull
    @Query("SELECT * FROM notification a where a.customer_id = :customerId and a.device_id = :deviceId and a.msg_read_status = :readStatus")
    List<Notification> getByReadStatus(@NotNull String str, @NotNull String str2, boolean z);

    @NotNull
    @Query("SELECT * FROM notification a where a.customer_id = :customerId and a.msg_read_status = :readStatus")
    List<Notification> getByReadStatus(@NotNull String str, boolean z);

    @NotNull
    @Query("SELECT * FROM notification where msg_read_status = :readStatus")
    List<Notification> getByReadStatus(boolean z);

    @NotNull
    @Query("SELECT * FROM notification a where a.insert_time > :startTime and a.insert_time <:endTime")
    List<Notification> getByTime(long j, long j2);

    @NotNull
    @Query("SELECT * FROM notification a where a.customer_id = :customerId and a.insert_time > :startTime and a.insert_time <:endTime")
    List<Notification> getByTime(@NotNull String str, long j, long j2);

    @NotNull
    @Query("SELECT * FROM notification a where a.insert_time > :startTime and a.insert_time < :endTime and a.msg_type != :msgType")
    List<Notification> getInventory(long j, long j2, int i);

    @NotNull
    @Query("SELECT * FROM notification a where a.customer_id = :customerId and a.insert_time > :startTime and a.insert_time < :endTime and a.msg_type != :msgType")
    List<Notification> getInventory(@NotNull String str, long j, long j2, int i);

    @Insert(onConflict = 1)
    void insert(@NotNull Notification notification);

    @Update
    void update(@NotNull Notification notification);
}
