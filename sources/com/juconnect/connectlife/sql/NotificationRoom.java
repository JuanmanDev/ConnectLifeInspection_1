package com.juconnect.connectlife.sql;

import android.content.Context;
import androidx.room.Room;
import com.hisense.connect_life.hismart.room.NotificationDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/NotificationRoom;", "", "()V", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationRoom.kt */
public final class NotificationRoom {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String DATABASE_NAME = "notification_db";
    @Nullable
    public static NotificationDb mDataBase;

    @Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/NotificationRoom$Companion;", "", "()V", "DATABASE_NAME", "", "mDataBase", "Lcom/juconnect/connectlife/sql/NotificationDb;", "init", "", "context", "Landroid/content/Context;", "notificationDao", "Lcom/hisense/connect_life/hismart/room/NotificationDao;", "notificationDao$connectlife_release", "notificationProvider", "Lcom/juconnect/connectlife/sql/NotificationProvider;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NotificationRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            NotificationRoom.mDataBase = Room.databaseBuilder(context.getApplicationContext(), NotificationDb.class, NotificationRoom.DATABASE_NAME).fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }

        @NotNull
        public final NotificationDao notificationDao$connectlife_release() {
            NotificationDb access$getMDataBase$cp = NotificationRoom.mDataBase;
            NotificationDao notificationDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.notificationDao();
            if (notificationDao != null) {
                return notificationDao;
            }
            throw new Throwable("NotificationDb isn't exist!");
        }

        @NotNull
        public final NotificationProvider notificationProvider() {
            return new NotificationProvider();
        }
    }
}
