package com.juconnect.connectlife.sql;

import com.hisense.connect_life.hismart.room.Notification;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H&J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH&¨\u0006\u001c"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/INotificationProvider;", "", "deleteAll", "", "deleteById", "id", "", "findExist", "", "Lcom/hisense/connect_life/hismart/room/Notification;", "msgId", "getAlarm", "startTime", "", "endTime", "msgType", "", "userName", "getAll", "deviceId", "getByReadStatus", "readStatus", "", "getByTime", "getInventory", "insert", "notification", "update", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: INotificationProvider.kt */
public interface INotificationProvider {
    void deleteAll();

    void deleteById(@NotNull String str);

    @NotNull
    List<Notification> findExist(@NotNull String str);

    @NotNull
    List<Notification> getAlarm(long j, long j2, int i);

    @NotNull
    List<Notification> getAlarm(@NotNull String str, long j, long j2, int i);

    @NotNull
    List<Notification> getAll();

    @NotNull
    List<Notification> getAll(@NotNull String str);

    @NotNull
    List<Notification> getAll(@NotNull String str, @NotNull String str2);

    @NotNull
    List<Notification> getByReadStatus(@NotNull String str, @NotNull String str2, boolean z);

    @NotNull
    List<Notification> getByReadStatus(@NotNull String str, boolean z);

    @NotNull
    List<Notification> getByReadStatus(boolean z);

    @NotNull
    List<Notification> getByTime(long j, long j2);

    @NotNull
    List<Notification> getByTime(@NotNull String str, long j, long j2);

    @NotNull
    List<Notification> getInventory(long j, long j2, int i);

    @NotNull
    List<Notification> getInventory(@NotNull String str, long j, long j2, int i);

    void insert(@NotNull Notification notification);

    void update(@NotNull Notification notification);
}
