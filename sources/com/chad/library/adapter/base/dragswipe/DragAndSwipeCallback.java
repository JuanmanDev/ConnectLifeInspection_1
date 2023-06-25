package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.module.BaseDraggableModule;

public class DragAndSwipeCallback extends ItemTouchHelper.Callback {

    /* renamed from: a */
    public BaseDraggableModule f7062a;

    /* renamed from: b */
    public float f7063b = 0.1f;

    /* renamed from: c */
    public float f7064c = 0.7f;

    /* renamed from: d */
    public int f7065d = 15;

    /* renamed from: e */
    public int f7066e = 32;

    public DragAndSwipeCallback(BaseDraggableModule baseDraggableModule) {
        this.f7062a = baseDraggableModule;
    }

    /* renamed from: a */
    public final boolean mo21988a(@NonNull RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (!mo21988a(viewHolder)) {
            if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support)).booleanValue()) {
                BaseDraggableModule baseDraggableModule = this.f7062a;
                if (baseDraggableModule != null) {
                    baseDraggableModule.onItemDragEnd(viewHolder);
                }
                viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
            }
            if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support) != null && ((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support)).booleanValue()) {
                BaseDraggableModule baseDraggableModule2 = this.f7062a;
                if (baseDraggableModule2 != null) {
                    baseDraggableModule2.onItemSwipeClear(viewHolder);
                }
                viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
            }
        }
    }

    public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.f7063b;
    }

    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        if (mo21988a(viewHolder)) {
            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(this.f7065d, this.f7066e);
    }

    public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.f7064c;
    }

    public boolean isItemViewSwipeEnabled() {
        BaseDraggableModule baseDraggableModule = this.f7062a;
        if (baseDraggableModule != null) {
            return baseDraggableModule.isSwipeEnabled();
        }
        return false;
    }

    public boolean isLongPressDragEnabled() {
        BaseDraggableModule baseDraggableModule = this.f7062a;
        if (baseDraggableModule == null || !baseDraggableModule.isDragEnabled() || this.f7062a.hasToggleView()) {
            return false;
        }
        return true;
    }

    public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (i == 1 && !mo21988a(viewHolder)) {
            View view = viewHolder.itemView;
            canvas.save();
            if (f > 0.0f) {
                canvas.clipRect((float) view.getLeft(), (float) view.getTop(), ((float) view.getLeft()) + f, (float) view.getBottom());
                canvas.translate((float) view.getLeft(), (float) view.getTop());
            } else {
                canvas.clipRect(((float) view.getRight()) + f, (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
                canvas.translate(((float) view.getRight()) + f, (float) view.getTop());
            }
            BaseDraggableModule baseDraggableModule = this.f7062a;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemSwiping(canvas, viewHolder, f, f2, z);
            }
            canvas.restore();
        }
    }

    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        BaseDraggableModule baseDraggableModule = this.f7062a;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemDragMoving(viewHolder, viewHolder2);
        }
    }

    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2 && !mo21988a(viewHolder)) {
            BaseDraggableModule baseDraggableModule = this.f7062a;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragStart(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i == 1 && !mo21988a(viewHolder)) {
            BaseDraggableModule baseDraggableModule2 = this.f7062a;
            if (baseDraggableModule2 != null) {
                baseDraggableModule2.onItemSwipeStart(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        BaseDraggableModule baseDraggableModule;
        if (!mo21988a(viewHolder) && (baseDraggableModule = this.f7062a) != null) {
            baseDraggableModule.onItemSwiped(viewHolder);
        }
    }
}
