package com.juconnect.connectlife.sql;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/juconnect/connectlife/sql/ConnectLifeRoom$Companion$init$1", "Landroidx/room/RoomDatabase$Callback;", "onDestructiveMigration", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeRoom.kt */
public final class ConnectLifeRoom$Companion$init$1 extends RoomDatabase.Callback {
    public final /* synthetic */ Context $context;

    public ConnectLifeRoom$Companion$init$1(Context context) {
        this.$context = context;
    }

    public void onDestructiveMigration(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "db");
        super.onDestructiveMigration(supportSQLiteDatabase);
        this.$context.getSharedPreferences(AppConfig.SP_LAST_CHAGE_, 0).edit().putString(KeyConst.KEY_INVENTORY_CATEGORY, "").commit();
    }
}
