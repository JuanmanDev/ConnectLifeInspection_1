package com.hisense.connect_life.hismart.sql.account;

import android.content.Context;
import androidx.room.Room;
import androidx.room.migration.Migration;
import com.hisense.connect_life.hismart.sql.winecategory.WineCategoryDao;
import com.hisense.connect_life.hismart.sql.winecategory.WineCategoryProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoRoom;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUserInfoRoom.kt */
public final class LoginUserInfoRoom {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String DATABASE_NAME = "user_login_info_db";
    @NotNull
    public static final Migration MIGRATION_1_2 = new LoginUserInfoRoom$Companion$MIGRATION_1_2$1();
    @NotNull
    public static final Migration MIGRATION_2_6 = new LoginUserInfoRoom$Companion$MIGRATION_2_6$1();
    @NotNull
    public static final Migration MIGRATION_6_7 = new LoginUserInfoRoom$Companion$MIGRATION_6_7$1();
    @Nullable
    public static LoginUserInfoDb mDataBase;

    @Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoRoom$Companion;", "", "()V", "DATABASE_NAME", "", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_6", "getMIGRATION_2_6", "MIGRATION_6_7", "getMIGRATION_6_7", "mDataBase", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoDb;", "init", "", "context", "Landroid/content/Context;", "loginUserInfoDao", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoDao;", "loginUserInfoDao$hismart_account_release", "loginUserInfoProvider", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfoProvider;", "wineCategoryDao", "Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryDao;", "wineCategoryProvider", "Lcom/hisense/connect_life/hismart/sql/winecategory/WineCategoryProvider;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LoginUserInfoRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Migration getMIGRATION_1_2() {
            return LoginUserInfoRoom.MIGRATION_1_2;
        }

        @NotNull
        public final Migration getMIGRATION_2_6() {
            return LoginUserInfoRoom.MIGRATION_2_6;
        }

        @NotNull
        public final Migration getMIGRATION_6_7() {
            return LoginUserInfoRoom.MIGRATION_6_7;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            LoginUserInfoRoom.mDataBase = Room.databaseBuilder(context.getApplicationContext(), LoginUserInfoDb.class, "user_login_info_db").allowMainThreadQueries().addMigrations(getMIGRATION_2_6()).addMigrations(getMIGRATION_6_7()).build();
        }

        @NotNull
        public final LoginUserInfoDao loginUserInfoDao$hismart_account_release() {
            LoginUserInfoDb access$getMDataBase$cp = LoginUserInfoRoom.mDataBase;
            LoginUserInfoDao loginUserInfoDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.loginUserInfoDao();
            if (loginUserInfoDao != null) {
                return loginUserInfoDao;
            }
            throw new Throwable("LoginUserInfoDao isn't exist!");
        }

        @NotNull
        public final LoginUserInfoProvider loginUserInfoProvider() {
            return new LoginUserInfoProvider();
        }

        @NotNull
        public final WineCategoryDao wineCategoryDao() {
            LoginUserInfoDb access$getMDataBase$cp = LoginUserInfoRoom.mDataBase;
            WineCategoryDao wineCategoryDao = access$getMDataBase$cp == null ? null : access$getMDataBase$cp.wineCategoryDao();
            if (wineCategoryDao != null) {
                return wineCategoryDao;
            }
            throw new Throwable("wineCategoryInfoDao isn't exist!");
        }

        @NotNull
        public final WineCategoryProvider wineCategoryProvider() {
            return new WineCategoryProvider();
        }
    }
}
