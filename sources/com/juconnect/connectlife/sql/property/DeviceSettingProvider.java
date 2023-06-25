package com.juconnect.connectlife.sql.property;

import com.hisense.connect_life.core.global.KeyConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n¨\u0006\u0012"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/property/DeviceSettingProvider;", "", "()V", "getMsg", "Lcom/juconnect/connectlife/sql/property/MsgEntity;", "auid", "", "getProfile", "Lcom/juconnect/connectlife/sql/property/ProfileEntity;", "getProperty", "Lcom/juconnect/connectlife/sql/property/PropertyEntity;", "updateMsg", "", "msgEntity", "updateProfile", "profile", "updateProperty", "property", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceSettingProvider.kt */
public final class DeviceSettingProvider {
    @NotNull
    public final MsgEntity getMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return DeviceSettingRoom.Companion.msgDao$connectlife_release().getMsg(str);
    }

    @NotNull
    public final ProfileEntity getProfile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return DeviceSettingRoom.Companion.profileDao$connectlife_release().getProfile(str);
    }

    @NotNull
    public final PropertyEntity getProperty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return DeviceSettingRoom.Companion.propertyDao$connectlife_release().getProperty(str);
    }

    public final void updateMsg(@NotNull MsgEntity msgEntity) {
        Intrinsics.checkNotNullParameter(msgEntity, "msgEntity");
        DeviceSettingRoom.Companion.msgDao$connectlife_release().insert(msgEntity);
    }

    public final void updateProfile(@NotNull ProfileEntity profileEntity) {
        Intrinsics.checkNotNullParameter(profileEntity, "profile");
        DeviceSettingRoom.Companion.profileDao$connectlife_release().insert(profileEntity);
    }

    public final void updateProperty(@NotNull PropertyEntity propertyEntity) {
        Intrinsics.checkNotNullParameter(propertyEntity, "property");
        DeviceSettingRoom.Companion.propertyDao$connectlife_release().insert(propertyEntity);
    }
}
