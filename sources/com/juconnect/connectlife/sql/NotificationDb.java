package com.juconnect.connectlife.sql;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.connect_life.hismart.room.NotificationDao;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Database(entities = {Notification.class}, version = 2)
@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/NotificationDb;", "Landroidx/room/RoomDatabase;", "()V", "notificationDao", "Lcom/hisense/connect_life/hismart/room/NotificationDao;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationDb.kt */
public abstract class NotificationDb extends RoomDatabase {
    @NotNull
    public abstract NotificationDao notificationDao();
}
