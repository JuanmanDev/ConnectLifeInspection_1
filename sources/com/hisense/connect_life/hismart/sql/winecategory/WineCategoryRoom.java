package com.hisense.connect_life.hismart.sql.winecategory;

import android.content.Context;
import androidx.room.Room;
import androidx.room.migration.Migration;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoDb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryRoom;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryRoom.kt */
public final class WineCategoryRoom {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String DATABASE_NAME = "user_login_info_db";
    @NotNull
    public static final Migration MIGRATION_1_2 = new WineCategoryRoom$Companion$MIGRATION_1_2$1();
    @Nullable
    public static LoginUserInfoDb mDataBase;

    @Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryRoom$Companion;", "", "()V", "DATABASE_NAME", "", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "mDataBase", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoDb;", "init", "", "context", "Landroid/content/Context;", "wineCategoryDao", "Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryDao;", "wineCategoryDao$hismart_account_release", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WineCategoryRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Migration getMIGRATION_1_2() {
            return WineCategoryRoom.MIGRATION_1_2;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WineCategoryRoom.mDataBase = Room.databaseBuilder(context.getApplicationContext(), LoginUserInfoDb.class, "user_login_info_db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }

        @NotNull
        public final WineCategoryDao wineCategoryDao$hismart_account_release() {
            LoginUserInfoDb access$getMDataBase$cp = WineCategoryRoom.mDataBase;
            WineCategoryDao wineCategoryDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.wineCategoryDao();
            if (wineCategoryDao != null) {
                return wineCategoryDao;
            }
            throw new Throwable("wineCategoryDao isn't exist!");
        }
    }
}
