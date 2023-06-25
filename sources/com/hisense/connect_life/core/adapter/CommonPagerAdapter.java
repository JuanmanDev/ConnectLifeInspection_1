package com.hisense.connect_life.core.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/connect_life/core/adapter/CommonPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "listFragment", "", "Landroidx/fragment/app/Fragment;", "listTitle", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "getCount", "", "getItem", "position", "getPageTitle", "", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CommonPagerAdapter.kt */
public final class CommonPagerAdapter extends FragmentPagerAdapter {
    @NotNull
    public final List<Fragment> listFragment;
    @NotNull
    public final List<String> listTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonPagerAdapter(@NotNull FragmentManager fragmentManager, @NotNull List<? extends Fragment> list, @NotNull List<String> list2) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(list, "listFragment");
        Intrinsics.checkNotNullParameter(list2, "listTitle");
        this.listFragment = list;
        this.listTitle = list2;
    }

    public int getCount() {
        return this.listFragment.size();
    }

    @NotNull
    public Fragment getItem(int i) {
        return this.listFragment.get(i);
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.listTitle.get(i);
    }
}
