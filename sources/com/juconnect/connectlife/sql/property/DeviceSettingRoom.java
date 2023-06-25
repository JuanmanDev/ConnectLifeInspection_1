package com.juconnect.connectlife.sql.property;

import android.content.Context;
import androidx.room.Room;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/property/DeviceSettingRoom;", "", "()V", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceSettingRoom.kt */
public final class DeviceSettingRoom {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String DATABASE_NAME = "h5_device_db";
    @Nullable
    public static DeviceSettingDb mDataBase;

    @Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/property/DeviceSettingRoom$Companion;", "", "()V", "DATABASE_NAME", "", "mDataBase", "Lcom/juconnect/connectlife/sql/property/DeviceSettingDb;", "deviceSettingProvider", "Lcom/juconnect/connectlife/sql/property/DeviceSettingProvider;", "init", "", "context", "Landroid/content/Context;", "msgDao", "Lcom/juconnect/connectlife/sql/property/MsgDao;", "msgDao$connectlife_release", "profileDao", "Lcom/juconnect/connectlife/sql/property/ProfileDao;", "profileDao$connectlife_release", "propertyDao", "Lcom/juconnect/connectlife/sql/property/PropertyDao;", "propertyDao$connectlife_release", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceSettingRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceSettingProvider deviceSettingProvider() {
            return new DeviceSettingProvider();
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DeviceSettingRoom.mDataBase = Room.databaseBuilder(context.getApplicationContext(), DeviceSettingDb.class, DeviceSettingRoom.DATABASE_NAME).allowMainThreadQueries().build();
        }

        @NotNull
        public final MsgDao msgDao$connectlife_release() {
            DeviceSettingDb access$getMDataBase$cp = DeviceSettingRoom.mDataBase;
            MsgDao msgDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.msgDao();
            if (msgDao != null) {
                return msgDao;
            }
            throw new Throwable("DeviceSetting isn't exist!");
        }

        @NotNull
        public final ProfileDao profileDao$connectlife_release() {
            DeviceSettingDb access$getMDataBase$cp = DeviceSettingRoom.mDataBase;
            ProfileDao profileDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.profileDao();
            if (profileDao != null) {
                return profileDao;
            }
            throw new Throwable("DeviceSetting isn't exist!");
        }

        @NotNull
        public final PropertyDao propertyDao$connectlife_release() {
            DeviceSettingDb access$getMDataBase$cp = DeviceSettingRoom.mDataBase;
            PropertyDao propertyDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.propertyDao();
            if (propertyDao != null) {
                return propertyDao;
            }
            throw new Throwable("DeviceSetting isn't exist!");
        }
    }
}
