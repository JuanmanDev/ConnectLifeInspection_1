package com.juconnect.connectlife.sql.changes;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, mo47991d2 = {"Lcom/juconnect/connectlife/sql/changes/IInvChangeProvider;", "", "deleteInvChange", "", "invChangeEntity", "Lcom/juconnect/connectlife/sql/changes/InvChangeEntity;", "customId", "", "insertInvChange", "queryInvChange", "", "updateInvChange", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IInvChangeProvider.kt */
public interface IInvChangeProvider {
    void deleteInvChange(int i);

    void deleteInvChange(@NotNull InvChangeEntity invChangeEntity);

    void insertInvChange(@NotNull InvChangeEntity invChangeEntity);

    @NotNull
    List<InvChangeEntity> queryInvChange(int i);

    void updateInvChange(@NotNull InvChangeEntity invChangeEntity);
}
