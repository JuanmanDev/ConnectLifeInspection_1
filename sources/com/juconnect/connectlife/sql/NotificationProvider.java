package com.juconnect.connectlife.sql;

import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.hismart.room.Notification;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0016¨\u0006\u001d"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/NotificationProvider;", "Lcom/juconnect/connectlife/sql/INotificationProvider;", "()V", "deleteAll", "", "deleteById", "id", "", "findExist", "", "Lcom/hisense/connect_life/hismart/room/Notification;", "msgId", "getAlarm", "startTime", "", "endTime", "msgType", "", "userName", "getAll", "deviceId", "getByReadStatus", "readStatus", "", "getByTime", "getInventory", "insert", "notification", "update", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationProvider.kt */
public final class NotificationProvider implements INotificationProvider {
    public void deleteAll() {
        NotificationRoom.Companion.notificationDao$connectlife_release().deleteAll();
    }

    public void deleteById(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.stringPlus("删除了数据   id是：  ", str);
        NotificationRoom.Companion.notificationDao$connectlife_release().deleteById(str);
    }

    @NotNull
    public List<Notification> findExist(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "msgId");
        return NotificationRoom.Companion.notificationDao$connectlife_release().findExist(str);
    }

    @NotNull
    public List<Notification> getAlarm(long j, long j2, int i) {
        return NotificationRoom.Companion.notificationDao$connectlife_release().getAlarm(j, j2, i);
    }

    @NotNull
    public List<Notification> getAll() {
        return NotificationRoom.Companion.notificationDao$connectlife_release().getAll();
    }

    @NotNull
    public List<Notification> getByReadStatus(boolean z) {
        return NotificationRoom.Companion.notificationDao$connectlife_release().getByReadStatus(z);
    }

    @NotNull
    public List<Notification> getByTime(long j, long j2) {
        return NotificationRoom.Companion.notificationDao$connectlife_release().getByTime(j, j2);
    }

    @NotNull
    public List<Notification> getInventory(long j, long j2, int i) {
        return NotificationRoom.Companion.notificationDao$connectlife_release().getInventory(j, j2, i);
    }

    public void insert(@NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        NotificationRoom.Companion.notificationDao$connectlife_release().insert(notification);
    }

    public void update(@NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        NotificationRoom.Companion.notificationDao$connectlife_release().update(notification);
    }

    @NotNull
    public List<Notification> getAlarm(@NotNull String str, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        return NotificationRoom.Companion.notificationDao$connectlife_release().getAlarm(str, j, j2, i);
    }

    @NotNull
    public List<Notification> getAll(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        return NotificationRoom.Companion.notificationDao$connectlife_release().getAll(str);
    }

    @NotNull
    public List<Notification> getByReadStatus(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        return NotificationRoom.Companion.notificationDao$connectlife_release().getByReadStatus(str, z);
    }

    @NotNull
    public List<Notification> getByTime(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        return NotificationRoom.Companion.notificationDao$connectlife_release().getByTime(str, j, j2);
    }

    @NotNull
    public List<Notification> getInventory(@NotNull String str, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        return NotificationRoom.Companion.notificationDao$connectlife_release().getInventory(str, j, j2, i);
    }

    @NotNull
    public List<Notification> getAll(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        return NotificationRoom.Companion.notificationDao$connectlife_release().getAll(str, str2);
    }

    @NotNull
    public List<Notification> getByReadStatus(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.USERNAME);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        return NotificationRoom.Companion.notificationDao$connectlife_release().getByReadStatus(str, str2, z);
    }
}
