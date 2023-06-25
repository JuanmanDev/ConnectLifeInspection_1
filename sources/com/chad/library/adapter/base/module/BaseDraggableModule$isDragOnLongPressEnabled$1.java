package com.chad.library.adapter.base.module;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: DraggableModule.kt */
public final class BaseDraggableModule$isDragOnLongPressEnabled$1 implements View.OnLongClickListener {
    public final /* synthetic */ BaseDraggableModule this$0;

    public BaseDraggableModule$isDragOnLongPressEnabled$1(BaseDraggableModule baseDraggableModule) {
        this.this$0 = baseDraggableModule;
    }

    public final boolean onLongClick(View view) {
        if (!this.this$0.isDragEnabled()) {
            return true;
        }
        ItemTouchHelper itemTouchHelper = this.this$0.getItemTouchHelper();
        Object tag = view.getTag(R$id.BaseQuickAdapter_viewholder_support);
        if (tag != null) {
            itemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
    }
}
