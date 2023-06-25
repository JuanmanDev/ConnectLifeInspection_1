package com.internationalwinecooler.p529ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/AddWineSuccessModel;", "", "id", "", "(J)V", "getId", "()J", "setId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.AddWineSuccessModel */
/* compiled from: AddWineSuccessModel.kt */
public final class AddWineSuccessModel {

    /* renamed from: id */
    public long f16457id;

    public AddWineSuccessModel() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public AddWineSuccessModel(long j) {
        this.f16457id = j;
    }

    public static /* synthetic */ AddWineSuccessModel copy$default(AddWineSuccessModel addWineSuccessModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addWineSuccessModel.f16457id;
        }
        return addWineSuccessModel.copy(j);
    }

    public final long component1() {
        return this.f16457id;
    }

    @NotNull
    public final AddWineSuccessModel copy(long j) {
        return new AddWineSuccessModel(j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddWineSuccessModel) && this.f16457id == ((AddWineSuccessModel) obj).f16457id;
    }

    public final long getId() {
        return this.f16457id;
    }

    public int hashCode() {
        return Long.hashCode(this.f16457id);
    }

    public final void setId(long j) {
        this.f16457id = j;
    }

    @NotNull
    public String toString() {
        return "AddWineSuccessModel(id=" + this.f16457id + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddWineSuccessModel(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j);
    }
}
