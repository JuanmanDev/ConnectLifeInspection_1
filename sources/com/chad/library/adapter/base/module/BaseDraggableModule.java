package com.chad.library.adapter.base.module;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p111f.p112a.p113a.p114a.p116b.C1989e;
import p040c.p111f.p112a.p113a.p114a.p116b.C1991g;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 l:\u0001lB\u0017\u0012\u000e\u00103\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000302¢\u0006\u0004\bj\u0010kJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0019J;\u0010(\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b5\u0010\r\"\u0004\b7\u00108R*\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b:\u00106\u001a\u0004\b:\u0010\r\"\u0004\b;\u00108R\"\u0010<\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b<\u0010\r\"\u0004\b=\u00108R\"\u0010?\u001a\u00020>8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010L\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010-R$\u0010Q\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00101R$\u0010W\u001a\u0004\u0018\u00010V8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010d\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006m"}, mo47991d2 = {"Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "getViewHolderPosition", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I", "", "hasToggleView", "()Z", "position", "inRange", "(I)Z", "initItemTouch", "()V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "initView$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "initView", "onItemDragEnd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "source", "target", "onItemDragMoving", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "onItemDragStart", "onItemSwipeClear", "onItemSwipeStart", "onItemSwiped", "Landroid/graphics/Canvas;", "canvas", "", "dX", "dY", "isCurrentlyActive", "onItemSwiping", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFZ)V", "Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "onItemDragListener", "setOnItemDragListener", "(Lcom/chad/library/adapter/base/listener/OnItemDragListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "onItemSwipeListener", "setOnItemSwipeListener", "(Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "isDragEnabled", "Z", "setDragEnabled", "(Z)V", "value", "isDragOnLongPressEnabled", "setDragOnLongPressEnabled", "isSwipeEnabled", "setSwipeEnabled", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "setItemTouchHelper", "(Landroidx/recyclerview/widget/ItemTouchHelper;)V", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "itemTouchHelperCallback", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "getItemTouchHelperCallback", "()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "setItemTouchHelperCallback", "(Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;)V", "mOnItemDragListener", "Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "getMOnItemDragListener", "()Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "setMOnItemDragListener", "mOnItemSwipeListener", "Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "getMOnItemSwipeListener", "()Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "setMOnItemSwipeListener", "Landroid/view/View$OnLongClickListener;", "mOnToggleViewLongClickListener", "Landroid/view/View$OnLongClickListener;", "getMOnToggleViewLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setMOnToggleViewLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "Landroid/view/View$OnTouchListener;", "mOnToggleViewTouchListener", "Landroid/view/View$OnTouchListener;", "getMOnToggleViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setMOnToggleViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "toggleViewId", "I", "getToggleViewId", "()I", "setToggleViewId", "(I)V", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Companion", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: DraggableModule.kt */
public class BaseDraggableModule {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NO_TOGGLE_VIEW = 0;
    public final BaseQuickAdapter<?, ?> baseQuickAdapter;
    public boolean isDragEnabled;
    public boolean isDragOnLongPressEnabled = true;
    public boolean isSwipeEnabled;
    @NotNull
    public ItemTouchHelper itemTouchHelper;
    @NotNull
    public DragAndSwipeCallback itemTouchHelperCallback;
    @Nullable
    public C1989e mOnItemDragListener;
    @Nullable
    public C1991g mOnItemSwipeListener;
    @Nullable
    public View.OnLongClickListener mOnToggleViewLongClickListener;
    @Nullable
    public View.OnTouchListener mOnToggleViewTouchListener;
    public int toggleViewId;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo47991d2 = {"Lcom/chad/library/adapter/base/module/BaseDraggableModule$Companion;", "", "NO_TOGGLE_VIEW", "I", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: DraggableModule.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BaseDraggableModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter2) {
        this.baseQuickAdapter = baseQuickAdapter2;
        initItemTouch();
    }

    private final boolean inRange(int i) {
        return i >= 0 && i < this.baseQuickAdapter.getData().size();
    }

    private final void initItemTouch() {
        DragAndSwipeCallback dragAndSwipeCallback = new DragAndSwipeCallback(this);
        this.itemTouchHelperCallback = dragAndSwipeCallback;
        if (dragAndSwipeCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelperCallback");
        }
        this.itemTouchHelper = new ItemTouchHelper(dragAndSwipeCallback);
    }

    public final void attachToRecyclerView(@NotNull RecyclerView recyclerView) {
        ItemTouchHelper itemTouchHelper2 = this.itemTouchHelper;
        if (itemTouchHelper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelper");
        }
        itemTouchHelper2.attachToRecyclerView(recyclerView);
    }

    @NotNull
    public final ItemTouchHelper getItemTouchHelper() {
        ItemTouchHelper itemTouchHelper2 = this.itemTouchHelper;
        if (itemTouchHelper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelper");
        }
        return itemTouchHelper2;
    }

    @NotNull
    public final DragAndSwipeCallback getItemTouchHelperCallback() {
        DragAndSwipeCallback dragAndSwipeCallback = this.itemTouchHelperCallback;
        if (dragAndSwipeCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelperCallback");
        }
        return dragAndSwipeCallback;
    }

    @Nullable
    public final C1989e getMOnItemDragListener() {
        return this.mOnItemDragListener;
    }

    @Nullable
    public final C1991g getMOnItemSwipeListener() {
        return this.mOnItemSwipeListener;
    }

    @Nullable
    public final View.OnLongClickListener getMOnToggleViewLongClickListener() {
        return this.mOnToggleViewLongClickListener;
    }

    @Nullable
    public final View.OnTouchListener getMOnToggleViewTouchListener() {
        return this.mOnToggleViewTouchListener;
    }

    public final int getToggleViewId() {
        return this.toggleViewId;
    }

    public final int getViewHolderPosition(@NotNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition() - this.baseQuickAdapter.getHeaderLayoutCount();
    }

    public boolean hasToggleView() {
        return this.toggleViewId != 0;
    }

    public final void initView$com_github_CymChad_brvah(@NotNull BaseViewHolder baseViewHolder) {
        View findViewById;
        if (this.isDragEnabled && hasToggleView() && (findViewById = baseViewHolder.itemView.findViewById(this.toggleViewId)) != null) {
            findViewById.setTag(R$id.BaseQuickAdapter_viewholder_support, baseViewHolder);
            if (isDragOnLongPressEnabled()) {
                findViewById.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                findViewById.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    public final boolean isDragEnabled() {
        return this.isDragEnabled;
    }

    public boolean isDragOnLongPressEnabled() {
        return this.isDragOnLongPressEnabled;
    }

    public final boolean isSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public void onItemDragEnd(@NotNull RecyclerView.ViewHolder viewHolder) {
        C1989e eVar = this.mOnItemDragListener;
        if (eVar != null) {
            eVar.mo16546a(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemDragMoving(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        int viewHolderPosition2 = getViewHolderPosition(viewHolder2);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i = viewHolderPosition;
                while (i < viewHolderPosition2) {
                    int i2 = i + 1;
                    Collections.swap(this.baseQuickAdapter.getData(), i, i2);
                    i = i2;
                }
            } else {
                int i3 = viewHolderPosition2 + 1;
                if (viewHolderPosition >= i3) {
                    int i4 = viewHolderPosition;
                    while (true) {
                        Collections.swap(this.baseQuickAdapter.getData(), i4, i4 - 1);
                        if (i4 == i3) {
                            break;
                        }
                        i4--;
                    }
                }
            }
            this.baseQuickAdapter.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        C1989e eVar = this.mOnItemDragListener;
        if (eVar != null) {
            eVar.mo16547b(viewHolder, viewHolderPosition, viewHolder2, viewHolderPosition2);
        }
    }

    public void onItemDragStart(@NotNull RecyclerView.ViewHolder viewHolder) {
        C1989e eVar = this.mOnItemDragListener;
        if (eVar != null) {
            eVar.mo16548c(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemSwipeClear(@NotNull RecyclerView.ViewHolder viewHolder) {
        C1991g gVar;
        if (this.isSwipeEnabled && (gVar = this.mOnItemSwipeListener) != null) {
            gVar.mo16552c(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemSwipeStart(@NotNull RecyclerView.ViewHolder viewHolder) {
        C1991g gVar;
        if (this.isSwipeEnabled && (gVar = this.mOnItemSwipeListener) != null) {
            gVar.mo16550a(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemSwiped(@NotNull RecyclerView.ViewHolder viewHolder) {
        C1991g gVar;
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            this.baseQuickAdapter.getData().remove(viewHolderPosition);
            this.baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            if (this.isSwipeEnabled && (gVar = this.mOnItemSwipeListener) != null) {
                gVar.mo16551b(viewHolder, viewHolderPosition);
            }
        }
    }

    public void onItemSwiping(@Nullable Canvas canvas, @Nullable RecyclerView.ViewHolder viewHolder, float f, float f2, boolean z) {
        C1991g gVar;
        if (this.isSwipeEnabled && (gVar = this.mOnItemSwipeListener) != null) {
            gVar.mo16553d(canvas, viewHolder, f, f2, z);
        }
    }

    public final void setDragEnabled(boolean z) {
        this.isDragEnabled = z;
    }

    public void setDragOnLongPressEnabled(boolean z) {
        this.isDragOnLongPressEnabled = z;
        if (z) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new BaseDraggableModule$isDragOnLongPressEnabled$1(this);
            return;
        }
        this.mOnToggleViewTouchListener = new BaseDraggableModule$isDragOnLongPressEnabled$2(this);
        this.mOnToggleViewLongClickListener = null;
    }

    public final void setItemTouchHelper(@NotNull ItemTouchHelper itemTouchHelper2) {
        this.itemTouchHelper = itemTouchHelper2;
    }

    public final void setItemTouchHelperCallback(@NotNull DragAndSwipeCallback dragAndSwipeCallback) {
        this.itemTouchHelperCallback = dragAndSwipeCallback;
    }

    public final void setMOnItemDragListener(@Nullable C1989e eVar) {
        this.mOnItemDragListener = eVar;
    }

    public final void setMOnItemSwipeListener(@Nullable C1991g gVar) {
        this.mOnItemSwipeListener = gVar;
    }

    public final void setMOnToggleViewLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    public final void setMOnToggleViewTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    public void setOnItemDragListener(@Nullable C1989e eVar) {
        this.mOnItemDragListener = eVar;
    }

    public void setOnItemSwipeListener(@Nullable C1991g gVar) {
        this.mOnItemSwipeListener = gVar;
    }

    public final void setSwipeEnabled(boolean z) {
        this.isSwipeEnabled = z;
    }

    public final void setToggleViewId(int i) {
        this.toggleViewId = i;
    }
}
