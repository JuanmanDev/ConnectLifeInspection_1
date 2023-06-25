package com.juconnect.connectlife.sql.changes;

import com.juconnect.connectlife.sql.ConnectLifeRoom;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/changes/InvChangeProvider;", "Lcom/juconnect/connectlife/sql/changes/IInvChangeProvider;", "()V", "deleteInvChange", "", "invChangeEntity", "Lcom/juconnect/connectlife/sql/changes/InvChangeEntity;", "customId", "", "insertInvChange", "queryInvChange", "", "updateInvChange", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InvChangeProvider.kt */
public final class InvChangeProvider implements IInvChangeProvider {
    public void deleteInvChange(@NotNull InvChangeEntity invChangeEntity) {
        Intrinsics.checkNotNullParameter(invChangeEntity, "invChangeEntity");
        ConnectLifeRoom.Companion.invChangeDao$connectlife_release().deleteInvChange(invChangeEntity);
    }

    public void insertInvChange(@NotNull InvChangeEntity invChangeEntity) {
        Intrinsics.checkNotNullParameter(invChangeEntity, "invChangeEntity");
        ConnectLifeRoom.Companion.invChangeDao$connectlife_release().insertInvChange(invChangeEntity);
    }

    @NotNull
    public List<InvChangeEntity> queryInvChange(int i) {
        return ConnectLifeRoom.Companion.invChangeDao$connectlife_release().queryInvChange(i);
    }

    public void updateInvChange(@NotNull InvChangeEntity invChangeEntity) {
        Intrinsics.checkNotNullParameter(invChangeEntity, "invChangeEntity");
        ConnectLifeRoom.Companion.invChangeDao$connectlife_release().updateInvChange(invChangeEntity);
    }

    public void deleteInvChange(int i) {
        ConnectLifeRoom.Companion.invChangeDao$connectlife_release().deleteInvChange(i);
    }
}
