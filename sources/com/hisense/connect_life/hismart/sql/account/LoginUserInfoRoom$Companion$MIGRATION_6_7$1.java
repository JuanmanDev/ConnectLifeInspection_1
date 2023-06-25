package com.hisense.connect_life.hismart.sql.account;

import androidx.room.migration.Migration;
import androidx.sqlite.p031db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/connect_life/hismart/sql/account/LoginUserInfoRoom$Companion$MIGRATION_6_7$1", "Landroidx/room/migration/Migration;", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUserInfoRoom.kt */
public final class LoginUserInfoRoom$Companion$MIGRATION_6_7$1 extends Migration {
    public LoginUserInfoRoom$Companion$MIGRATION_6_7$1() {
        super(6, 7);
    }

    public void migrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "database");
        supportSQLiteDatabase.execSQL("ALTER TABLE wine_category ADD COLUMN vivino_id TEXT");
    }
}
