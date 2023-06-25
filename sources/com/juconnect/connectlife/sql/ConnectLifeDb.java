package com.juconnect.connectlife.sql;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.sql.changes.InvChangeDao;
import com.juconnect.connectlife.sql.changes.InvChangeEntity;
import com.juconnect.connectlife.sql.inventory.WineInventoryDao;
import com.juconnect.connectlife.sql.inventory.WineInventoryEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Database(entities = {WineInventoryEntity.class, InvChangeEntity.class, TicketBean.class}, version = 3)
@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/ConnectLifeDb;", "Landroidx/room/RoomDatabase;", "()V", "invChangeDao", "Lcom/juconnect/connectlife/sql/changes/InvChangeDao;", "wineInventoryDao", "Lcom/juconnect/connectlife/sql/inventory/WineInventoryDao;", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeDb.kt */
public abstract class ConnectLifeDb extends RoomDatabase {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Migration MIGRATION_1_2 = new ConnectLifeDb$Companion$MIGRATION_1_2$1();
    @NotNull
    public static final Migration MIGRATION_2_3 = new ConnectLifeDb$Companion$MIGRATION_2_3$1();

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/ConnectLifeDb$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ConnectLifeDb.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Migration getMIGRATION_1_2() {
            return ConnectLifeDb.MIGRATION_1_2;
        }

        @NotNull
        public final Migration getMIGRATION_2_3() {
            return ConnectLifeDb.MIGRATION_2_3;
        }
    }

    @NotNull
    public abstract InvChangeDao invChangeDao();

    @NotNull
    public abstract WineInventoryDao wineInventoryDao();
}
