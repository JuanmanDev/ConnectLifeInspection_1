package com.juconnect.connectlife.sql.property;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Database(entities = {ProfileEntity.class, PropertyEntity.class, MsgEntity.class}, version = 1)
@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/property/DeviceSettingDb;", "Landroidx/room/RoomDatabase;", "()V", "msgDao", "Lcom/juconnect/connectlife/sql/property/MsgDao;", "profileDao", "Lcom/juconnect/connectlife/sql/property/ProfileDao;", "propertyDao", "Lcom/juconnect/connectlife/sql/property/PropertyDao;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceSettingDb.kt */
public abstract class DeviceSettingDb extends RoomDatabase {
    @NotNull
    public abstract MsgDao msgDao();

    @NotNull
    public abstract ProfileDao profileDao();

    @NotNull
    public abstract PropertyDao propertyDao();
}
