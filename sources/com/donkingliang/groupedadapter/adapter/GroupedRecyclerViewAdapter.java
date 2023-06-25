package com.donkingliang.groupedadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.donkingliang.groupedadapter.R$integer;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import java.util.ArrayList;
import p040c.p135k.p136a.p137a.C2052a;

public abstract class GroupedRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int TYPE_CHILD = R$integer.type_child;
    public static final int TYPE_FOOTER = R$integer.type_footer;
    public static final int TYPE_HEADER = R$integer.type_header;
    public boolean isDataChanged;
    public Context mContext;
    public C3875e mOnChildClickListener;
    public C3876f mOnFooterClickListener;
    public C3877g mOnHeaderClickListener;
    public ArrayList<C2052a> mStructures;
    public int mTempPosition;
    public boolean mUseBinding;

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$a */
    public class C3871a implements View.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.ViewHolder f7151e;

        /* renamed from: l */
        public final /* synthetic */ int f7152l;

        public C3871a(RecyclerView.ViewHolder viewHolder, int i) {
            this.f7151e = viewHolder;
            this.f7152l = i;
        }

        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.mOnHeaderClickListener != null) {
                int groupPositionForPosition = this.f7151e.itemView.getParent() instanceof FrameLayout ? this.f7152l : GroupedRecyclerViewAdapter.this.getGroupPositionForPosition(this.f7151e.getLayoutPosition());
                if (groupPositionForPosition >= 0 && groupPositionForPosition < GroupedRecyclerViewAdapter.this.mStructures.size()) {
                    GroupedRecyclerViewAdapter.this.mOnHeaderClickListener.mo22536a(GroupedRecyclerViewAdapter.this, (BaseViewHolder) this.f7151e, groupPositionForPosition);
                }
            }
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$b */
    public class C3872b implements View.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.ViewHolder f7154e;

        public C3872b(RecyclerView.ViewHolder viewHolder) {
            this.f7154e = viewHolder;
        }

        public void onClick(View view) {
            int groupPositionForPosition;
            if (GroupedRecyclerViewAdapter.this.mOnFooterClickListener != null && (groupPositionForPosition = GroupedRecyclerViewAdapter.this.getGroupPositionForPosition(this.f7154e.getLayoutPosition())) >= 0 && groupPositionForPosition < GroupedRecyclerViewAdapter.this.mStructures.size()) {
                GroupedRecyclerViewAdapter.this.mOnFooterClickListener.mo22535a(GroupedRecyclerViewAdapter.this, (BaseViewHolder) this.f7154e, groupPositionForPosition);
            }
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$c */
    public class C3873c implements View.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.ViewHolder f7156e;

        public C3873c(RecyclerView.ViewHolder viewHolder) {
            this.f7156e = viewHolder;
        }

        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.mOnChildClickListener != null) {
                int groupPositionForPosition = GroupedRecyclerViewAdapter.this.getGroupPositionForPosition(this.f7156e.getLayoutPosition());
                int childPositionForPosition = GroupedRecyclerViewAdapter.this.getChildPositionForPosition(groupPositionForPosition, this.f7156e.getLayoutPosition());
                if (groupPositionForPosition >= 0 && groupPositionForPosition < GroupedRecyclerViewAdapter.this.mStructures.size() && childPositionForPosition >= 0 && childPositionForPosition < GroupedRecyclerViewAdapter.this.mStructures.get(groupPositionForPosition).mo16673a()) {
                    GroupedRecyclerViewAdapter.this.mOnChildClickListener.mo22534a(GroupedRecyclerViewAdapter.this, (BaseViewHolder) this.f7156e, groupPositionForPosition, childPositionForPosition);
                }
            }
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$d */
    public class C3874d extends RecyclerView.AdapterDataObserver {
        public C3874d() {
        }

        public void onChanged() {
            boolean unused = GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        public void onItemRangeChanged(int i, int i2) {
            boolean unused = GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        public void onItemRangeInserted(int i, int i2) {
            boolean unused = GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        public void onItemRangeRemoved(int i, int i2) {
            boolean unused = GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$e */
    public interface C3875e {
        /* renamed from: a */
        void mo22534a(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i, int i2);
    }

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$f */
    public interface C3876f {
        /* renamed from: a */
        void mo22535a(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i);
    }

    /* renamed from: com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter$g */
    public interface C3877g {
        /* renamed from: a */
        void mo22536a(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i);
    }

    public GroupedRecyclerViewAdapter(Context context) {
        this(context, false);
    }

    private int count() {
        return countGroupRangeItem(0, this.mStructures.size());
    }

    private int getLayoutId(int i, int i2) {
        int judgeType = judgeType(i);
        if (judgeType == TYPE_HEADER) {
            return getHeaderLayout(i2);
        }
        if (judgeType == TYPE_FOOTER) {
            return getFooterLayout(i2);
        }
        if (judgeType == TYPE_CHILD) {
            return getChildLayout(i2);
        }
        return 0;
    }

    private void handleLayoutIfStaggeredGridLayout(RecyclerView.ViewHolder viewHolder, int i) {
        if (judgeType(i) == TYPE_HEADER || judgeType(i) == TYPE_FOOTER) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    private boolean isStaggeredGridLayout(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams;
    }

    private void structureChanged() {
        this.mStructures.clear();
        int groupCount = getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.mStructures.add(new C2052a(hasHeader(i), hasFooter(i), getChildrenCount(i)));
        }
        this.isDataChanged = false;
    }

    @Deprecated
    public void changeChild(int i, int i2) {
        notifyChildChanged(i, i2);
    }

    @Deprecated
    public void changeChildren(int i) {
        notifyChildrenChanged(i);
    }

    @Deprecated
    public void changeDataSet() {
        notifyDataChanged();
    }

    @Deprecated
    public void changeFooter(int i) {
        notifyFooterChanged(i);
    }

    @Deprecated
    public void changeGroup(int i) {
        notifyGroupChanged(i);
    }

    @Deprecated
    public void changeHeader(int i) {
        notifyHeaderChanged(i);
    }

    @Deprecated
    public void changeRangeChild(int i, int i2, int i3) {
        notifyChildRangeChanged(i, i2, i3);
    }

    @Deprecated
    public void changeRangeGroup(int i, int i2) {
        notifyGroupRangeChanged(i, i2);
    }

    public int countGroupItem(int i) {
        int i2 = 0;
        if (i < 0 || i >= this.mStructures.size()) {
            return 0;
        }
        C2052a aVar = this.mStructures.get(i);
        if (aVar.mo16675c()) {
            i2 = 1;
        }
        int a = i2 + aVar.mo16673a();
        return aVar.mo16674b() ? a + 1 : a;
    }

    public int countGroupRangeItem(int i, int i2) {
        int size = this.mStructures.size();
        int i3 = 0;
        int i4 = i;
        while (i4 < size && i4 < i + i2) {
            i3 += countGroupItem(i4);
            i4++;
        }
        return i3;
    }

    public abstract int getChildLayout(int i);

    public int getChildPositionForPosition(int i, int i2) {
        if (i < 0 || i >= this.mStructures.size()) {
            return -1;
        }
        int countGroupRangeItem = countGroupRangeItem(0, i + 1);
        C2052a aVar = this.mStructures.get(i);
        int a = (aVar.mo16673a() - (countGroupRangeItem - i2)) + (aVar.mo16674b() ? 1 : 0);
        if (a >= 0) {
            return a;
        }
        return -1;
    }

    public int getChildViewType(int i, int i2) {
        return TYPE_CHILD;
    }

    public abstract int getChildrenCount(int i);

    public abstract int getFooterLayout(int i);

    public int getFooterViewType(int i) {
        return TYPE_FOOTER;
    }

    public abstract int getGroupCount();

    public int getGroupPositionForPosition(int i) {
        int size = this.mStructures.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += countGroupItem(i3);
            if (i < i2) {
                return i3;
            }
        }
        return -1;
    }

    public abstract int getHeaderLayout(int i);

    public int getHeaderViewType(int i) {
        return TYPE_HEADER;
    }

    public int getItemCount() {
        if (this.isDataChanged) {
            structureChanged();
        }
        return count();
    }

    public int getItemViewType(int i) {
        this.mTempPosition = i;
        int groupPositionForPosition = getGroupPositionForPosition(i);
        int judgeType = judgeType(i);
        if (judgeType == TYPE_HEADER) {
            return getHeaderViewType(groupPositionForPosition);
        }
        if (judgeType == TYPE_FOOTER) {
            return getFooterViewType(groupPositionForPosition);
        }
        if (judgeType == TYPE_CHILD) {
            return getChildViewType(groupPositionForPosition, getChildPositionForPosition(groupPositionForPosition, i));
        }
        return super.getItemViewType(i);
    }

    public int getPositionForChild(int i, int i2) {
        if (i < 0 || i >= this.mStructures.size()) {
            return -1;
        }
        C2052a aVar = this.mStructures.get(i);
        if (aVar.mo16673a() > i2) {
            return countGroupRangeItem(0, i) + i2 + (aVar.mo16675c() ? 1 : 0);
        }
        return -1;
    }

    public int getPositionForGroup(int i) {
        if (i < 0 || i >= this.mStructures.size()) {
            return -1;
        }
        return countGroupRangeItem(0, i);
    }

    public int getPositionForGroupFooter(int i) {
        if (i < 0 || i >= this.mStructures.size() || !this.mStructures.get(i).mo16674b()) {
            return -1;
        }
        return countGroupRangeItem(0, i + 1) - 1;
    }

    public int getPositionForGroupHeader(int i) {
        if (i < 0 || i >= this.mStructures.size() || !this.mStructures.get(i).mo16675c()) {
            return -1;
        }
        return countGroupRangeItem(0, i);
    }

    public abstract boolean hasFooter(int i);

    public abstract boolean hasHeader(int i);

    @Deprecated
    public void insertChild(int i, int i2) {
        notifyChildInserted(i, i2);
    }

    @Deprecated
    public void insertChildren(int i) {
        notifyChildrenInserted(i);
    }

    @Deprecated
    public void insertFooter(int i) {
        notifyFooterInserted(i);
    }

    @Deprecated
    public void insertGroup(int i) {
        notifyGroupInserted(i);
    }

    @Deprecated
    public void insertHeader(int i) {
        notifyHeaderInserted(i);
    }

    @Deprecated
    public void insertRangeChild(int i, int i2, int i3) {
        notifyChildRangeInserted(i, i2, i3);
    }

    @Deprecated
    public void insertRangeGroup(int i, int i2) {
        notifyGroupRangeInserted(i, i2);
    }

    public int judgeType(int i) {
        int size = this.mStructures.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C2052a aVar = this.mStructures.get(i3);
            if (aVar.mo16675c() && i < (i2 = i2 + 1)) {
                return TYPE_HEADER;
            }
            i2 += aVar.mo16673a();
            if (i < i2) {
                return TYPE_CHILD;
            }
            if (aVar.mo16674b() && i < (i2 = i2 + 1)) {
                return TYPE_FOOTER;
            }
        }
        throw new IndexOutOfBoundsException("can't determine the item type of the position.position = " + i + ",item count = " + getItemCount());
    }

    public void notifyChildChanged(int i, int i2) {
        int positionForChild = getPositionForChild(i, i2);
        if (positionForChild >= 0) {
            notifyItemChanged(positionForChild);
        }
    }

    public void notifyChildInserted(int i, int i2) {
        if (i < this.mStructures.size()) {
            C2052a aVar = this.mStructures.get(i);
            int positionForChild = getPositionForChild(i, i2);
            if (positionForChild < 0) {
                positionForChild = aVar.mo16673a() + countGroupRangeItem(0, i) + (aVar.mo16675c() ? 1 : 0);
            }
            aVar.mo16676d(aVar.mo16673a() + 1);
            notifyItemInserted(positionForChild);
        }
    }

    public void notifyChildRangeChanged(int i, int i2, int i3) {
        int positionForChild;
        if (i < this.mStructures.size() && (positionForChild = getPositionForChild(i, i2)) >= 0) {
            C2052a aVar = this.mStructures.get(i);
            if (aVar.mo16673a() >= i2 + i3) {
                notifyItemRangeChanged(positionForChild, i3);
            } else {
                notifyItemRangeChanged(positionForChild, aVar.mo16673a() - i2);
            }
        }
    }

    public void notifyChildRangeInserted(int i, int i2, int i3) {
        if (i < this.mStructures.size()) {
            int countGroupRangeItem = countGroupRangeItem(0, i);
            C2052a aVar = this.mStructures.get(i);
            if (aVar.mo16675c()) {
                countGroupRangeItem++;
            }
            if (i2 >= aVar.mo16673a()) {
                i2 = aVar.mo16673a();
            }
            int i4 = countGroupRangeItem + i2;
            if (i3 > 0) {
                aVar.mo16676d(aVar.mo16673a() + i3);
                notifyItemRangeInserted(i4, i3);
            }
        }
    }

    public void notifyChildRangeRemoved(int i, int i2, int i3) {
        int positionForChild;
        if (i < this.mStructures.size() && (positionForChild = getPositionForChild(i, i2)) >= 0) {
            C2052a aVar = this.mStructures.get(i);
            int a = aVar.mo16673a();
            if (a < i2 + i3) {
                i3 = a - i2;
            }
            aVar.mo16676d(a - i3);
            notifyItemRangeRemoved(positionForChild, i3);
        }
    }

    public void notifyChildRemoved(int i, int i2) {
        int positionForChild = getPositionForChild(i, i2);
        if (positionForChild >= 0) {
            C2052a aVar = this.mStructures.get(i);
            aVar.mo16676d(aVar.mo16673a() - 1);
            notifyItemRemoved(positionForChild);
        }
    }

    public void notifyChildrenChanged(int i) {
        int positionForChild;
        if (i >= 0 && i < this.mStructures.size() && (positionForChild = getPositionForChild(i, 0)) >= 0) {
            notifyItemRangeChanged(positionForChild, this.mStructures.get(i).mo16673a());
        }
    }

    public void notifyChildrenInserted(int i) {
        if (i < this.mStructures.size()) {
            int countGroupRangeItem = countGroupRangeItem(0, i);
            C2052a aVar = this.mStructures.get(i);
            if (aVar.mo16675c()) {
                countGroupRangeItem++;
            }
            int childrenCount = getChildrenCount(i);
            if (childrenCount > 0) {
                aVar.mo16676d(childrenCount);
                notifyItemRangeInserted(countGroupRangeItem, childrenCount);
            }
        }
    }

    public void notifyChildrenRemoved(int i) {
        int positionForChild;
        if (i < this.mStructures.size() && (positionForChild = getPositionForChild(i, 0)) >= 0) {
            C2052a aVar = this.mStructures.get(i);
            int a = aVar.mo16673a();
            aVar.mo16676d(0);
            notifyItemRangeRemoved(positionForChild, a);
        }
    }

    public void notifyDataChanged() {
        this.isDataChanged = true;
        notifyDataSetChanged();
    }

    public void notifyDataRemoved() {
        int countGroupRangeItem = countGroupRangeItem(0, this.mStructures.size());
        this.mStructures.clear();
        notifyItemRangeRemoved(0, countGroupRangeItem);
    }

    public void notifyFooterChanged(int i) {
        int positionForGroupFooter = getPositionForGroupFooter(i);
        if (positionForGroupFooter >= 0) {
            notifyItemChanged(positionForGroupFooter);
        }
    }

    public void notifyFooterInserted(int i) {
        if (i < this.mStructures.size() && getPositionForGroupFooter(i) < 0) {
            this.mStructures.get(i).mo16677e(true);
            notifyItemInserted(countGroupRangeItem(0, i + 1));
        }
    }

    public void notifyFooterRemoved(int i) {
        int positionForGroupFooter = getPositionForGroupFooter(i);
        if (positionForGroupFooter >= 0) {
            this.mStructures.get(i).mo16677e(false);
            notifyItemRemoved(positionForGroupFooter);
        }
    }

    public void notifyGroupChanged(int i) {
        int positionForGroup = getPositionForGroup(i);
        int countGroupItem = countGroupItem(i);
        if (positionForGroup >= 0 && countGroupItem > 0) {
            notifyItemRangeChanged(positionForGroup, countGroupItem);
        }
    }

    public void notifyGroupInserted(int i) {
        C2052a aVar = new C2052a(hasHeader(i), hasFooter(i), getChildrenCount(i));
        if (i < this.mStructures.size()) {
            this.mStructures.add(i, aVar);
        } else {
            this.mStructures.add(aVar);
            i = this.mStructures.size() - 1;
        }
        int countGroupRangeItem = countGroupRangeItem(0, i);
        int countGroupItem = countGroupItem(i);
        if (countGroupItem > 0) {
            notifyItemRangeInserted(countGroupRangeItem, countGroupItem);
        }
    }

    public void notifyGroupRangeChanged(int i, int i2) {
        int i3;
        int positionForGroup = getPositionForGroup(i);
        int i4 = i2 + i;
        if (i4 <= this.mStructures.size()) {
            i3 = countGroupRangeItem(i, i4);
        } else {
            i3 = countGroupRangeItem(i, this.mStructures.size());
        }
        if (positionForGroup >= 0 && i3 > 0) {
            notifyItemRangeChanged(positionForGroup, i3);
        }
    }

    public void notifyGroupRangeInserted(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new C2052a(hasHeader(i3), hasFooter(i3), getChildrenCount(i3)));
        }
        if (i < this.mStructures.size()) {
            this.mStructures.addAll(i, arrayList);
        } else {
            this.mStructures.addAll(arrayList);
            i = this.mStructures.size() - arrayList.size();
        }
        int countGroupRangeItem = countGroupRangeItem(0, i);
        int countGroupRangeItem2 = countGroupRangeItem(i, i2);
        if (countGroupRangeItem2 > 0) {
            notifyItemRangeInserted(countGroupRangeItem, countGroupRangeItem2);
        }
    }

    public void notifyGroupRangeRemoved(int i, int i2) {
        int i3;
        int positionForGroup = getPositionForGroup(i);
        int i4 = i2 + i;
        if (i4 <= this.mStructures.size()) {
            i3 = countGroupRangeItem(i, i4);
        } else {
            i3 = countGroupRangeItem(i, this.mStructures.size());
        }
        if (positionForGroup >= 0 && i3 > 0) {
            this.mStructures.remove(i);
            notifyItemRangeRemoved(positionForGroup, i3);
        }
    }

    public void notifyGroupRemoved(int i) {
        int positionForGroup = getPositionForGroup(i);
        int countGroupItem = countGroupItem(i);
        if (positionForGroup >= 0 && countGroupItem > 0) {
            this.mStructures.remove(i);
            notifyItemRangeRemoved(positionForGroup, countGroupItem);
        }
    }

    public void notifyHeaderChanged(int i) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        if (positionForGroupHeader >= 0) {
            notifyItemChanged(positionForGroupHeader);
        }
    }

    public void notifyHeaderInserted(int i) {
        if (i < this.mStructures.size() && getPositionForGroupHeader(i) < 0) {
            this.mStructures.get(i).mo16678f(true);
            notifyItemInserted(countGroupRangeItem(0, i));
        }
    }

    public void notifyHeaderRemoved(int i) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        if (positionForGroupHeader >= 0) {
            this.mStructures.get(i).mo16678f(false);
            notifyItemRemoved(positionForGroupHeader);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        structureChanged();
    }

    public abstract void onBindChildViewHolder(BaseViewHolder baseViewHolder, int i, int i2);

    public abstract void onBindFooterViewHolder(BaseViewHolder baseViewHolder, int i);

    public abstract void onBindHeaderViewHolder(BaseViewHolder baseViewHolder, int i);

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int judgeType = judgeType(i);
        int groupPositionForPosition = getGroupPositionForPosition(i);
        if (judgeType == TYPE_HEADER) {
            if (this.mOnHeaderClickListener != null) {
                viewHolder.itemView.setOnClickListener(new C3871a(viewHolder, groupPositionForPosition));
            }
            onBindHeaderViewHolder((BaseViewHolder) viewHolder, groupPositionForPosition);
        } else if (judgeType == TYPE_FOOTER) {
            if (this.mOnFooterClickListener != null) {
                viewHolder.itemView.setOnClickListener(new C3872b(viewHolder));
            }
            onBindFooterViewHolder((BaseViewHolder) viewHolder, groupPositionForPosition);
        } else if (judgeType == TYPE_CHILD) {
            int childPositionForPosition = getChildPositionForPosition(groupPositionForPosition, i);
            if (this.mOnChildClickListener != null) {
                viewHolder.itemView.setOnClickListener(new C3873c(viewHolder));
            }
            onBindChildViewHolder((BaseViewHolder) viewHolder, groupPositionForPosition, childPositionForPosition);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.mUseBinding) {
            return new BaseViewHolder(DataBindingUtil.inflate(LayoutInflater.from(this.mContext), getLayoutId(this.mTempPosition, i), viewGroup, false).getRoot());
        }
        return new BaseViewHolder(LayoutInflater.from(this.mContext).inflate(getLayoutId(this.mTempPosition, i), viewGroup, false));
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (isStaggeredGridLayout(viewHolder)) {
            handleLayoutIfStaggeredGridLayout(viewHolder, viewHolder.getLayoutPosition());
        }
    }

    @Deprecated
    public void removeAll() {
        notifyDataRemoved();
    }

    @Deprecated
    public void removeChild(int i, int i2) {
        notifyChildRemoved(i, i2);
    }

    @Deprecated
    public void removeChildren(int i) {
        notifyChildrenRemoved(i);
    }

    @Deprecated
    public void removeFooter(int i) {
        notifyFooterRemoved(i);
    }

    @Deprecated
    public void removeGroup(int i) {
        notifyGroupRemoved(i);
    }

    @Deprecated
    public void removeHeader(int i) {
        notifyHeaderRemoved(i);
    }

    @Deprecated
    public void removeRangeChild(int i, int i2, int i3) {
        notifyChildRangeRemoved(i, i2, i3);
    }

    @Deprecated
    public void removeRangeGroup(int i, int i2) {
        notifyGroupRangeRemoved(i, i2);
    }

    public void setOnChildClickListener(C3875e eVar) {
        this.mOnChildClickListener = eVar;
    }

    public void setOnFooterClickListener(C3876f fVar) {
        this.mOnFooterClickListener = fVar;
    }

    public void setOnHeaderClickListener(C3877g gVar) {
        this.mOnHeaderClickListener = gVar;
    }

    public GroupedRecyclerViewAdapter(Context context, boolean z) {
        this.mStructures = new ArrayList<>();
        this.mContext = context;
        this.mUseBinding = z;
        registerAdapterDataObserver(new C3874d());
    }
}
