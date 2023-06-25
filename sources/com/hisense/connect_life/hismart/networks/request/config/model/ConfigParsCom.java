package com.hisense.connect_life.hismart.networks.request.config.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/config/model/ConfigParsCom;", "", "CmdArr", "", "", "FileName", "(Ljava/util/List;Ljava/lang/String;)V", "getCmdArr", "()Ljava/util/List;", "getFileName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigParsCom.kt */
public final class ConfigParsCom {
    @NotNull
    public final List<List<String>> CmdArr;
    @NotNull
    public final String FileName;

    public ConfigParsCom(@NotNull List<? extends List<String>> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "CmdArr");
        Intrinsics.checkNotNullParameter(str, "FileName");
        this.CmdArr = list;
        this.FileName = str;
    }

    public static /* synthetic */ ConfigParsCom copy$default(ConfigParsCom configParsCom, List<List<String>> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = configParsCom.CmdArr;
        }
        if ((i & 2) != 0) {
            str = configParsCom.FileName;
        }
        return configParsCom.copy(list, str);
    }

    @NotNull
    public final List<List<String>> component1() {
        return this.CmdArr;
    }

    @NotNull
    public final String component2() {
        return this.FileName;
    }

    @NotNull
    public final ConfigParsCom copy(@NotNull List<? extends List<String>> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "CmdArr");
        Intrinsics.checkNotNullParameter(str, "FileName");
        return new ConfigParsCom(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigParsCom)) {
            return false;
        }
        ConfigParsCom configParsCom = (ConfigParsCom) obj;
        return Intrinsics.areEqual((Object) this.CmdArr, (Object) configParsCom.CmdArr) && Intrinsics.areEqual((Object) this.FileName, (Object) configParsCom.FileName);
    }

    @NotNull
    public final List<List<String>> getCmdArr() {
        return this.CmdArr;
    }

    @NotNull
    public final String getFileName() {
        return this.FileName;
    }

    public int hashCode() {
        return (this.CmdArr.hashCode() * 31) + this.FileName.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigParsCom(CmdArr=" + this.CmdArr + ", FileName='" + this.FileName + "')";
    }
}
