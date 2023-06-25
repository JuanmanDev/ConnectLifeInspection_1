package com.hisense.connect_life.hismart.sql.account;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003Jµ\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0006HÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00108\"\u0004\b>\u0010:¨\u0006V"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "", "login_name", "", "psw", "subscriber_id", "", "customer_id", "customer_id_s", "token", "token_create_time", "", "token_expire_time", "refresh_token", "refresh_token_expired_time", "email", "update_time", "first_name", "last_name", "photo_url", "login_source", "third_platform_id", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomer_id", "()I", "setCustomer_id", "(I)V", "getCustomer_id_s", "()Ljava/lang/String;", "setCustomer_id_s", "(Ljava/lang/String;)V", "getEmail", "setEmail", "getFirst_name", "setFirst_name", "getLast_name", "setLast_name", "getLogin_name", "setLogin_name", "getLogin_source", "setLogin_source", "getPhoto_url", "setPhoto_url", "getPsw", "setPsw", "getRefresh_token", "setRefresh_token", "getRefresh_token_expired_time", "setRefresh_token_expired_time", "getSubscriber_id", "setSubscriber_id", "getThird_platform_id", "setThird_platform_id", "getToken", "setToken", "getToken_create_time", "()J", "setToken_create_time", "(J)V", "getToken_expire_time", "setToken_expire_time", "getUpdate_time", "setUpdate_time", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "login_user_info")
/* compiled from: LoginUserInfo.kt */
public final class LoginUserInfo {
    @ColumnInfo(name = "customer_id")
    public int customer_id;
    @ColumnInfo(name = "customer_id_s")
    @NotNull
    @PrimaryKey(autoGenerate = false)
    public String customer_id_s;
    @ColumnInfo(name = "email")
    @NotNull
    public String email;
    @ColumnInfo(name = "first_name")
    @NotNull
    public String first_name;
    @ColumnInfo(name = "last_name")
    @NotNull
    public String last_name;
    @ColumnInfo(name = "login_name")
    @NotNull
    public String login_name;
    @ColumnInfo(name = "login_source")
    @NotNull
    public String login_source;
    @ColumnInfo(name = "photo_url")
    @Nullable
    public String photo_url;
    @ColumnInfo(name = "psw")
    @NotNull
    public String psw;
    @ColumnInfo(name = "refresh_token")
    @NotNull
    public String refresh_token;
    @ColumnInfo(name = "refresh_token_expired_time")
    public int refresh_token_expired_time;
    @ColumnInfo(name = "subscriber_id")
    public int subscriber_id;
    @ColumnInfo(name = "third_platform_id")
    @NotNull
    public String third_platform_id;
    @ColumnInfo(name = "token")
    @NotNull
    public String token;
    @ColumnInfo(name = "token_create_time")
    public long token_create_time;
    @ColumnInfo(name = "token_expire_time")
    public int token_expire_time;
    @ColumnInfo(name = "update_time")
    public long update_time;

    public LoginUserInfo(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, long j, int i3, @NotNull String str5, int i4, @NotNull String str6, long j2, @NotNull String str7, @NotNull String str8, @Nullable String str9, @NotNull String str10, @NotNull String str11) {
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str10;
        String str19 = str11;
        Intrinsics.checkNotNullParameter(str, "login_name");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.PSW);
        Intrinsics.checkNotNullParameter(str12, "customer_id_s");
        Intrinsics.checkNotNullParameter(str13, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str14, "refresh_token");
        Intrinsics.checkNotNullParameter(str15, "email");
        Intrinsics.checkNotNullParameter(str16, "first_name");
        Intrinsics.checkNotNullParameter(str17, "last_name");
        Intrinsics.checkNotNullParameter(str18, "login_source");
        Intrinsics.checkNotNullParameter(str19, "third_platform_id");
        this.login_name = str;
        this.psw = str2;
        this.subscriber_id = i;
        this.customer_id = i2;
        this.customer_id_s = str12;
        this.token = str13;
        this.token_create_time = j;
        this.token_expire_time = i3;
        this.refresh_token = str14;
        this.refresh_token_expired_time = i4;
        this.email = str15;
        this.update_time = j2;
        this.first_name = str16;
        this.last_name = str17;
        this.photo_url = str9;
        this.login_source = str18;
        this.third_platform_id = str19;
    }

    public static /* synthetic */ LoginUserInfo copy$default(LoginUserInfo loginUserInfo, String str, String str2, int i, int i2, String str3, String str4, long j, int i3, String str5, int i4, String str6, long j2, String str7, String str8, String str9, String str10, String str11, int i5, Object obj) {
        LoginUserInfo loginUserInfo2 = loginUserInfo;
        int i6 = i5;
        return loginUserInfo.copy((i6 & 1) != 0 ? loginUserInfo2.login_name : str, (i6 & 2) != 0 ? loginUserInfo2.psw : str2, (i6 & 4) != 0 ? loginUserInfo2.subscriber_id : i, (i6 & 8) != 0 ? loginUserInfo2.customer_id : i2, (i6 & 16) != 0 ? loginUserInfo2.customer_id_s : str3, (i6 & 32) != 0 ? loginUserInfo2.token : str4, (i6 & 64) != 0 ? loginUserInfo2.token_create_time : j, (i6 & 128) != 0 ? loginUserInfo2.token_expire_time : i3, (i6 & 256) != 0 ? loginUserInfo2.refresh_token : str5, (i6 & 512) != 0 ? loginUserInfo2.refresh_token_expired_time : i4, (i6 & 1024) != 0 ? loginUserInfo2.email : str6, (i6 & 2048) != 0 ? loginUserInfo2.update_time : j2, (i6 & 4096) != 0 ? loginUserInfo2.first_name : str7, (i6 & 8192) != 0 ? loginUserInfo2.last_name : str8, (i6 & 16384) != 0 ? loginUserInfo2.photo_url : str9, (i6 & 32768) != 0 ? loginUserInfo2.login_source : str10, (i6 & 65536) != 0 ? loginUserInfo2.third_platform_id : str11);
    }

    @NotNull
    public final String component1() {
        return this.login_name;
    }

    public final int component10() {
        return this.refresh_token_expired_time;
    }

    @NotNull
    public final String component11() {
        return this.email;
    }

    public final long component12() {
        return this.update_time;
    }

    @NotNull
    public final String component13() {
        return this.first_name;
    }

    @NotNull
    public final String component14() {
        return this.last_name;
    }

    @Nullable
    public final String component15() {
        return this.photo_url;
    }

    @NotNull
    public final String component16() {
        return this.login_source;
    }

    @NotNull
    public final String component17() {
        return this.third_platform_id;
    }

    @NotNull
    public final String component2() {
        return this.psw;
    }

    public final int component3() {
        return this.subscriber_id;
    }

    public final int component4() {
        return this.customer_id;
    }

    @NotNull
    public final String component5() {
        return this.customer_id_s;
    }

    @NotNull
    public final String component6() {
        return this.token;
    }

    public final long component7() {
        return this.token_create_time;
    }

    public final int component8() {
        return this.token_expire_time;
    }

    @NotNull
    public final String component9() {
        return this.refresh_token;
    }

    @NotNull
    public final LoginUserInfo copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, long j, int i3, @NotNull String str5, int i4, @NotNull String str6, long j2, @NotNull String str7, @NotNull String str8, @Nullable String str9, @NotNull String str10, @NotNull String str11) {
        String str12 = str;
        Intrinsics.checkNotNullParameter(str12, "login_name");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.PSW);
        Intrinsics.checkNotNullParameter(str3, "customer_id_s");
        Intrinsics.checkNotNullParameter(str4, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str5, "refresh_token");
        Intrinsics.checkNotNullParameter(str6, "email");
        Intrinsics.checkNotNullParameter(str7, "first_name");
        Intrinsics.checkNotNullParameter(str8, "last_name");
        Intrinsics.checkNotNullParameter(str10, "login_source");
        Intrinsics.checkNotNullParameter(str11, "third_platform_id");
        return new LoginUserInfo(str12, str2, i, i2, str3, str4, j, i3, str5, i4, str6, j2, str7, str8, str9, str10, str11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginUserInfo)) {
            return false;
        }
        LoginUserInfo loginUserInfo = (LoginUserInfo) obj;
        return Intrinsics.areEqual((Object) this.login_name, (Object) loginUserInfo.login_name) && Intrinsics.areEqual((Object) this.psw, (Object) loginUserInfo.psw) && this.subscriber_id == loginUserInfo.subscriber_id && this.customer_id == loginUserInfo.customer_id && Intrinsics.areEqual((Object) this.customer_id_s, (Object) loginUserInfo.customer_id_s) && Intrinsics.areEqual((Object) this.token, (Object) loginUserInfo.token) && this.token_create_time == loginUserInfo.token_create_time && this.token_expire_time == loginUserInfo.token_expire_time && Intrinsics.areEqual((Object) this.refresh_token, (Object) loginUserInfo.refresh_token) && this.refresh_token_expired_time == loginUserInfo.refresh_token_expired_time && Intrinsics.areEqual((Object) this.email, (Object) loginUserInfo.email) && this.update_time == loginUserInfo.update_time && Intrinsics.areEqual((Object) this.first_name, (Object) loginUserInfo.first_name) && Intrinsics.areEqual((Object) this.last_name, (Object) loginUserInfo.last_name) && Intrinsics.areEqual((Object) this.photo_url, (Object) loginUserInfo.photo_url) && Intrinsics.areEqual((Object) this.login_source, (Object) loginUserInfo.login_source) && Intrinsics.areEqual((Object) this.third_platform_id, (Object) loginUserInfo.third_platform_id);
    }

    public final int getCustomer_id() {
        return this.customer_id;
    }

    @NotNull
    public final String getCustomer_id_s() {
        return this.customer_id_s;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getFirst_name() {
        return this.first_name;
    }

    @NotNull
    public final String getLast_name() {
        return this.last_name;
    }

    @NotNull
    public final String getLogin_name() {
        return this.login_name;
    }

    @NotNull
    public final String getLogin_source() {
        return this.login_source;
    }

    @Nullable
    public final String getPhoto_url() {
        return this.photo_url;
    }

    @NotNull
    public final String getPsw() {
        return this.psw;
    }

    @NotNull
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final int getRefresh_token_expired_time() {
        return this.refresh_token_expired_time;
    }

    public final int getSubscriber_id() {
        return this.subscriber_id;
    }

    @NotNull
    public final String getThird_platform_id() {
        return this.third_platform_id;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final long getToken_create_time() {
        return this.token_create_time;
    }

    public final int getToken_expire_time() {
        return this.token_expire_time;
    }

    public final long getUpdate_time() {
        return this.update_time;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((this.login_name.hashCode() * 31) + this.psw.hashCode()) * 31) + Integer.hashCode(this.subscriber_id)) * 31) + Integer.hashCode(this.customer_id)) * 31) + this.customer_id_s.hashCode()) * 31) + this.token.hashCode()) * 31) + Long.hashCode(this.token_create_time)) * 31) + Integer.hashCode(this.token_expire_time)) * 31) + this.refresh_token.hashCode()) * 31) + Integer.hashCode(this.refresh_token_expired_time)) * 31) + this.email.hashCode()) * 31) + Long.hashCode(this.update_time)) * 31) + this.first_name.hashCode()) * 31) + this.last_name.hashCode()) * 31;
        String str = this.photo_url;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.login_source.hashCode()) * 31) + this.third_platform_id.hashCode();
    }

    public final void setCustomer_id(int i) {
        this.customer_id = i;
    }

    public final void setCustomer_id_s(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customer_id_s = str;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setFirst_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.first_name = str;
    }

    public final void setLast_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.last_name = str;
    }

    public final void setLogin_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.login_name = str;
    }

    public final void setLogin_source(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.login_source = str;
    }

    public final void setPhoto_url(@Nullable String str) {
        this.photo_url = str;
    }

    public final void setPsw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.psw = str;
    }

    public final void setRefresh_token(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refresh_token = str;
    }

    public final void setRefresh_token_expired_time(int i) {
        this.refresh_token_expired_time = i;
    }

    public final void setSubscriber_id(int i) {
        this.subscriber_id = i;
    }

    public final void setThird_platform_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.third_platform_id = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setToken_create_time(long j) {
        this.token_create_time = j;
    }

    public final void setToken_expire_time(int i) {
        this.token_expire_time = i;
    }

    public final void setUpdate_time(long j) {
        this.update_time = j;
    }

    @NotNull
    public String toString() {
        return "LoginUserInfo(login_name=" + this.login_name + ", psw=" + this.psw + ", subscriber_id=" + this.subscriber_id + ", customer_id=" + this.customer_id + ", customer_id_s=" + this.customer_id_s + ", token=" + this.token + ", token_create_time=" + this.token_create_time + ", token_expire_time=" + this.token_expire_time + ", refresh_token=" + this.refresh_token + ", refresh_token_expired_time=" + this.refresh_token_expired_time + ", email=" + this.email + ", update_time=" + this.update_time + ", first_name=" + this.first_name + ", last_name=" + this.last_name + ", photo_url=" + this.photo_url + ", login_source=" + this.login_source + ", third_platform_id=" + this.third_platform_id + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LoginUserInfo(java.lang.String r23, java.lang.String r24, int r25, int r26, java.lang.String r27, java.lang.String r28, long r29, int r31, java.lang.String r32, int r33, java.lang.String r34, long r35, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r25
        L_0x000b:
            r1 = r0 & 32
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0013
            r8 = r2
            goto L_0x0015
        L_0x0013:
            r8 = r28
        L_0x0015:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x001b
            r12 = r2
            goto L_0x001d
        L_0x001b:
            r12 = r32
        L_0x001d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0023
            r14 = r2
            goto L_0x0025
        L_0x0023:
            r14 = r34
        L_0x0025:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x002c
            r19 = r2
            goto L_0x002e
        L_0x002c:
            r19 = r39
        L_0x002e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0037
            r20 = r2
            goto L_0x0039
        L_0x0037:
            r20 = r40
        L_0x0039:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0041
            r21 = r2
            goto L_0x0043
        L_0x0041:
            r21 = r41
        L_0x0043:
            r2 = r22
            r3 = r23
            r4 = r24
            r6 = r26
            r7 = r27
            r9 = r29
            r11 = r31
            r13 = r33
            r15 = r35
            r17 = r37
            r18 = r38
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.sql.account.LoginUserInfo.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
