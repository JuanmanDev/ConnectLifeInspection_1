package com.internationalwinecooler.p529ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/RefreshWineFragment;", "", "refresh", "", "(Z)V", "getRefresh", "()Z", "setRefresh", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.RefreshWineFragment */
/* compiled from: RefreshWineFragment.kt */
public final class RefreshWineFragment {
    public boolean refresh;

    public RefreshWineFragment(boolean z) {
        this.refresh = z;
    }

    public static /* synthetic */ RefreshWineFragment copy$default(RefreshWineFragment refreshWineFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = refreshWineFragment.refresh;
        }
        return refreshWineFragment.copy(z);
    }

    public final boolean component1() {
        return this.refresh;
    }

    @NotNull
    public final RefreshWineFragment copy(boolean z) {
        return new RefreshWineFragment(z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshWineFragment) && this.refresh == ((RefreshWineFragment) obj).refresh;
    }

    public final boolean getRefresh() {
        return this.refresh;
    }

    public int hashCode() {
        boolean z = this.refresh;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final void setRefresh(boolean z) {
        this.refresh = z;
    }

    @NotNull
    public String toString() {
        return "RefreshWineFragment(refresh=" + this.refresh + ')';
    }
}
