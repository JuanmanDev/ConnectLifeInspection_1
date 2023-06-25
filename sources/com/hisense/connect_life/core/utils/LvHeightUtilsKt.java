package com.hisense.connect_life.core.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, mo47991d2 = {"setLvHeight", "", "mListView", "Landroid/widget/ListView;", "core_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LvHeightUtils.kt */
public final class LvHeightUtilsKt {
    public static final void setLvHeight(@NotNull ListView listView) {
        Intrinsics.checkNotNullParameter(listView, "mListView");
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            int i = 0;
            int i2 = 0;
            while (i < count) {
                int i3 = i + 1;
                View view = adapter.getView(i, (View) null, listView);
                view.measure(0, 0);
                i2 += view.getMeasuredHeight();
                i = i3;
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i2 + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(layoutParams);
        }
    }
}
