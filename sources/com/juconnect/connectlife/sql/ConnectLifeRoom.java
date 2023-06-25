package com.juconnect.connectlife.sql;

import android.content.Context;
import androidx.room.Room;
import com.juconnect.connectlife.sql.changes.IInvChangeProvider;
import com.juconnect.connectlife.sql.changes.InvChangeDao;
import com.juconnect.connectlife.sql.changes.InvChangeProvider;
import com.juconnect.connectlife.sql.inventory.IWineInventoryProvider;
import com.juconnect.connectlife.sql.inventory.WineInventoryDao;
import com.juconnect.connectlife.sql.inventory.WineInventoryProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/ConnectLifeRoom;", "", "()V", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeRoom.kt */
public final class ConnectLifeRoom {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String DATABASE_NAME = "connect_life_db";
    @Nullable
    public static ConnectLifeDb mDataBase;

    @Metadata(mo47990d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/ConnectLifeRoom$Companion;", "", "()V", "DATABASE_NAME", "", "mDataBase", "Lcom/juconnect/connectlife/sql/ConnectLifeDb;", "init", "", "context", "Landroid/content/Context;", "invChangeDao", "Lcom/juconnect/connectlife/sql/changes/InvChangeDao;", "invChangeDao$connectlife_release", "invChangeProvider", "Lcom/juconnect/connectlife/sql/changes/IInvChangeProvider;", "wineInventoryDao", "Lcom/juconnect/connectlife/sql/inventory/WineInventoryDao;", "wineInventoryDao$connectlife_release", "wineInventoryProvider", "Lcom/juconnect/connectlife/sql/inventory/IWineInventoryProvider;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ConnectLifeRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConnectLifeRoom.mDataBase = Room.databaseBuilder(context.getApplicationContext(), ConnectLifeDb.class, ConnectLifeRoom.DATABASE_NAME).fallbackToDestructiveMigration().addCallback(new ConnectLifeRoom$Companion$init$1(context)).build();
        }

        @NotNull
        public final InvChangeDao invChangeDao$connectlife_release() {
            ConnectLifeDb access$getMDataBase$cp = ConnectLifeRoom.mDataBase;
            InvChangeDao invChangeDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.invChangeDao();
            if (invChangeDao != null) {
                return invChangeDao;
            }
            throw new Throwable("connectLifeDb isn't exist!");
        }

        @NotNull
        public final IInvChangeProvider invChangeProvider() {
            return new InvChangeProvider();
        }

        @NotNull
        public final WineInventoryDao wineInventoryDao$connectlife_release() {
            ConnectLifeDb access$getMDataBase$cp = ConnectLifeRoom.mDataBase;
            WineInventoryDao wineInventoryDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.wineInventoryDao();
            if (wineInventoryDao != null) {
                return wineInventoryDao;
            }
            throw new Throwable("connectLifeDb isn't exist!");
        }

        @NotNull
        public final IWineInventoryProvider wineInventoryProvider() {
            return new WineInventoryProvider();
        }
    }
}
