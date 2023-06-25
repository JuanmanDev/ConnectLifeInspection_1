package com.chad.library.adapter.base;

import androidx.annotation.IntRange;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.entity.node.NodeFooterImp;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000101¢\u0006\u0004\bU\u0010MJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\tJ%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u0005\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u0005\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0011J9\u0010\u001c\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\u001c\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ9\u0010 \u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b \u0010\u001dJ9\u0010!\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b!\u0010\u001dJC\u0010!\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\u001fJ9\u0010#\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b#\u0010\u001dJY\u0010(\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b(\u0010)J9\u0010*\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b*\u0010\u001dJ\u0015\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010.J/\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J%\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b8\u0010;J+\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b8\u0010<J\u001d\u0010>\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002¢\u0006\u0004\b>\u00109J\u001d\u0010>\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?J#\u0010@\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bB\u0010;J\u0017\u0010C\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bE\u0010.J\u0017\u0010F\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010.J\u001f\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010\tJ%\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010K\u001a\u00020\u00042\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000101H\u0016¢\u0006\u0004\bK\u0010MJ\u001f\u0010N\u001a\u00020\u00042\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016¢\u0006\u0004\bN\u0010\rJ\u001f\u0010O\u001a\u00020\u00042\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000101H\u0016¢\u0006\u0004\bO\u0010MR&\u0010R\u001a\u0012\u0012\u0004\u0012\u00020\u00070Pj\b\u0012\u0004\u0012\u00020\u0007`Q8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseNodeAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "data", "", "addData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;)V", "", "position", "(ILcom/chad/library/adapter/base/entity/node/BaseNode;)V", "", "newData", "(ILjava/util/Collection;)V", "(Ljava/util/Collection;)V", "Lcom/chad/library/adapter/base/provider/BaseNodeProvider;", "provider", "addFooterNodeProvider", "(Lcom/chad/library/adapter/base/provider/BaseNodeProvider;)V", "addFullSpanNodeProvider", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "addItemProvider", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "addNodeProvider", "", "animate", "notify", "", "parentPayload", "collapse", "(IZZLjava/lang/Object;)I", "isChangeChildCollapse", "(IZZZLjava/lang/Object;)I", "collapseAndChild", "expand", "isChangeChildExpand", "expandAndChild", "isExpandedChild", "isCollapseChild", "expandPayload", "collapsePayload", "expandAndCollapseOther", "(IZZZZLjava/lang/Object;Ljava/lang/Object;)V", "expandOrCollapse", "node", "findParentNode", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;)I", "(I)I", "list", "isExpanded", "", "flatData", "(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;", "type", "isFixedViewType", "(I)Z", "parentNode", "nodeAddData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;Lcom/chad/library/adapter/base/entity/node/BaseNode;)V", "childIndex", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;ILcom/chad/library/adapter/base/entity/node/BaseNode;)V", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;ILjava/util/Collection;)V", "childNode", "nodeRemoveData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;I)V", "nodeReplaceChildData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;Ljava/util/Collection;)V", "nodeSetData", "removeAt", "(I)V", "removeChildAt", "removeNodesAt", "index", "setData", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diffResult", "setDiffNewData", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/util/List;)V", "(Ljava/util/List;)V", "setList", "setNewInstance", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "fullSpanNodeTypeSet", "Ljava/util/HashSet;", "nodeList", "<init>", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseNodeAdapter.kt */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<BaseNode> {
    public final HashSet<Integer> fullSpanNodeTypeSet;

    public BaseNodeAdapter() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseNodeAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    private final int collapse(@IntRange(from = 0) int i, boolean z, boolean z2, boolean z3, Object obj) {
        BaseNode baseNode = (BaseNode) getData().get(i);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (baseExpandNode.isExpanded()) {
                int headerLayoutCount = i + getHeaderLayoutCount();
                baseExpandNode.setExpanded(false);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode == null || childNode.isEmpty()) {
                    notifyItemChanged(headerLayoutCount, obj);
                    return 0;
                }
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 == null) {
                    Intrinsics.throwNpe();
                }
                List<BaseNode> flatData = flatData(childNode2, z ? Boolean.FALSE : null);
                int size = flatData.size();
                getData().removeAll(flatData);
                if (z3) {
                    if (z2) {
                        notifyItemChanged(headerLayoutCount, obj);
                        notifyItemRangeRemoved(headerLayoutCount + 1, size);
                    } else {
                        notifyDataSetChanged();
                    }
                }
                return size;
            }
        }
        return 0;
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            boolean z4 = z;
            boolean z5 = (i2 & 4) != 0 ? true : z2;
            boolean z6 = (i2 & 8) != 0 ? true : z3;
            if ((i2 & 16) != 0) {
                obj = null;
            }
            return baseNodeAdapter.collapse(i, z4, z5, z6, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
    }

    public static /* synthetic */ int collapseAndChild$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.collapseAndChild(i, z, z2, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapseAndChild");
    }

    private final int expand(@IntRange(from = 0) int i, boolean z, boolean z2, boolean z3, Object obj) {
        BaseNode baseNode = (BaseNode) getData().get(i);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (!baseExpandNode.isExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + i;
                baseExpandNode.setExpanded(true);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode == null || childNode.isEmpty()) {
                    notifyItemChanged(headerLayoutCount, obj);
                    return 0;
                }
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 == null) {
                    Intrinsics.throwNpe();
                }
                List<BaseNode> flatData = flatData(childNode2, z ? Boolean.TRUE : null);
                int size = flatData.size();
                getData().addAll(i + 1, flatData);
                if (z3) {
                    if (z2) {
                        notifyItemChanged(headerLayoutCount, obj);
                        notifyItemRangeInserted(headerLayoutCount + 1, size);
                    } else {
                        notifyDataSetChanged();
                    }
                }
                return size;
            }
        }
        return 0;
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            boolean z4 = z;
            boolean z5 = (i2 & 4) != 0 ? true : z2;
            boolean z6 = (i2 & 8) != 0 ? true : z3;
            if ((i2 & 16) != 0) {
                obj = null;
            }
            return baseNodeAdapter.expand(i, z4, z5, z6, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
    }

    public static /* synthetic */ int expandAndChild$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.expandAndChild(i, z, z2, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndChild");
    }

    public static /* synthetic */ void expandAndCollapseOther$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, boolean z3, boolean z4, Object obj, Object obj2, int i2, Object obj3) {
        if (obj3 == null) {
            boolean z5 = (i2 & 2) != 0 ? false : z;
            boolean z6 = true;
            boolean z7 = (i2 & 4) != 0 ? true : z2;
            boolean z8 = (i2 & 8) != 0 ? true : z3;
            if ((i2 & 16) == 0) {
                z6 = z4;
            }
            Object obj4 = null;
            Object obj5 = (i2 & 32) != 0 ? null : obj;
            if ((i2 & 64) == 0) {
                obj4 = obj2;
            }
            baseNodeAdapter.expandAndCollapseOther(i, z5, z7, z8, z6, obj5, obj4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndCollapseOther");
    }

    public static /* synthetic */ int expandOrCollapse$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.expandOrCollapse(i, z, z2, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandOrCollapse");
    }

    private final List<BaseNode> flatData(Collection<? extends BaseNode> collection, Boolean bool) {
        BaseNode footerNode;
        ArrayList arrayList = new ArrayList();
        for (BaseNode baseNode : collection) {
            arrayList.add(baseNode);
            boolean z = false;
            if (baseNode instanceof BaseExpandNode) {
                if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE) || ((BaseExpandNode) baseNode).isExpanded()) {
                    List<BaseNode> childNode = baseNode.getChildNode();
                    if (childNode == null || childNode.isEmpty()) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.addAll(flatData(childNode, bool));
                    }
                }
                if (bool != null) {
                    ((BaseExpandNode) baseNode).setExpanded(bool.booleanValue());
                }
            } else {
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 == null || childNode2.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    arrayList.addAll(flatData(childNode2, bool));
                }
            }
            if ((baseNode instanceof NodeFooterImp) && (footerNode = ((NodeFooterImp) baseNode).getFooterNode()) != null) {
                arrayList.add(footerNode);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List flatData$default(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bool = null;
            }
            return baseNodeAdapter.flatData(collection, bool);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flatData");
    }

    private final int removeChildAt(int i) {
        if (i >= getData().size()) {
            return 0;
        }
        BaseNode baseNode = (BaseNode) getData().get(i);
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(baseNode instanceof BaseExpandNode)) {
            List<BaseNode> childNode2 = baseNode.getChildNode();
            if (childNode2 == null) {
                Intrinsics.throwNpe();
            }
            List flatData$default = flatData$default(this, childNode2, (Boolean) null, 2, (Object) null);
            getData().removeAll(flatData$default);
            return flatData$default.size();
        } else if (!((BaseExpandNode) baseNode).isExpanded()) {
            return 0;
        } else {
            List<BaseNode> childNode3 = baseNode.getChildNode();
            if (childNode3 == null) {
                Intrinsics.throwNpe();
            }
            List flatData$default2 = flatData$default(this, childNode3, (Boolean) null, 2, (Object) null);
            getData().removeAll(flatData$default2);
            return flatData$default2.size();
        }
    }

    private final int removeNodesAt(int i) {
        if (i >= getData().size()) {
            return 0;
        }
        int removeChildAt = removeChildAt(i);
        getData().remove(i);
        int i2 = removeChildAt + 1;
        BaseNode baseNode = (BaseNode) getData().get(i);
        if (!(baseNode instanceof NodeFooterImp) || ((NodeFooterImp) baseNode).getFooterNode() == null) {
            return i2;
        }
        getData().remove(i);
        return i2 + 1;
    }

    public final void addFooterNodeProvider(@NotNull BaseNodeProvider baseNodeProvider) {
        addFullSpanNodeProvider(baseNodeProvider);
    }

    public final void addFullSpanNodeProvider(@NotNull BaseNodeProvider baseNodeProvider) {
        this.fullSpanNodeTypeSet.add(Integer.valueOf(baseNodeProvider.getItemViewType()));
        addItemProvider(baseNodeProvider);
    }

    public void addItemProvider(@NotNull BaseItemProvider<BaseNode> baseItemProvider) {
        if (baseItemProvider instanceof BaseNodeProvider) {
            super.addItemProvider(baseItemProvider);
            return;
        }
        throw new IllegalStateException("Please add BaseNodeProvider, no BaseItemProvider!");
    }

    public final void addNodeProvider(@NotNull BaseNodeProvider baseNodeProvider) {
        addItemProvider(baseNodeProvider);
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i) {
        return collapse$default(this, i, false, false, (Object) null, 14, (Object) null);
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i, boolean z) {
        return collapse$default(this, i, z, false, (Object) null, 12, (Object) null);
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i, boolean z, boolean z2) {
        return collapse$default(this, i, z, z2, (Object) null, 8, (Object) null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i) {
        return collapseAndChild$default(this, i, false, false, (Object) null, 14, (Object) null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i, boolean z) {
        return collapseAndChild$default(this, i, z, false, (Object) null, 12, (Object) null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i, boolean z, boolean z2) {
        return collapseAndChild$default(this, i, z, z2, (Object) null, 8, (Object) null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i, boolean z, boolean z2, @Nullable Object obj) {
        return collapse(i, true, z, z2, obj);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i) {
        return expand$default(this, i, false, false, (Object) null, 14, (Object) null);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i, boolean z) {
        return expand$default(this, i, z, false, (Object) null, 12, (Object) null);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i, boolean z, boolean z2) {
        return expand$default(this, i, z, z2, (Object) null, 8, (Object) null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i) {
        return expandAndChild$default(this, i, false, false, (Object) null, 14, (Object) null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i, boolean z) {
        return expandAndChild$default(this, i, z, false, (Object) null, 12, (Object) null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i, boolean z, boolean z2) {
        return expandAndChild$default(this, i, z, z2, (Object) null, 8, (Object) null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i, boolean z, boolean z2, @Nullable Object obj) {
        return expand(i, true, z, z2, obj);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i) {
        expandAndCollapseOther$default(this, i, false, false, false, false, (Object) null, (Object) null, 126, (Object) null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i, boolean z) {
        expandAndCollapseOther$default(this, i, z, false, false, false, (Object) null, (Object) null, 124, (Object) null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i, boolean z, boolean z2) {
        expandAndCollapseOther$default(this, i, z, z2, false, false, (Object) null, (Object) null, 120, (Object) null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i, boolean z, boolean z2, boolean z3) {
        expandAndCollapseOther$default(this, i, z, z2, z3, false, (Object) null, (Object) null, 112, (Object) null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i, boolean z, boolean z2, boolean z3, boolean z4) {
        expandAndCollapseOther$default(this, i, z, z2, z3, z4, (Object) null, (Object) null, 96, (Object) null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Object obj) {
        expandAndCollapseOther$default(this, i, z, z2, z3, z4, obj, (Object) null, 64, (Object) null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Object obj, @Nullable Object obj2) {
        int i2;
        int i3;
        int expand = expand(i, z, z3, z4, obj);
        if (expand != 0) {
            int findParentNode = findParentNode(i);
            int i4 = 0;
            int i5 = findParentNode == -1 ? 0 : findParentNode + 1;
            if (i - i5 > 0) {
                int i6 = i5;
                i2 = i;
                do {
                    i6++;
                    i2 -= collapse(i6, z2, z3, z4, obj2);
                } while (i6 < i2);
            } else {
                i2 = i;
            }
            if (findParentNode == -1) {
                i3 = getData().size() - 1;
            } else {
                List<BaseNode> childNode = ((BaseNode) getData().get(findParentNode)).getChildNode();
                if (childNode != null) {
                    i4 = childNode.size();
                }
                i3 = findParentNode + i4 + expand;
            }
            int i7 = i2 + expand;
            if (i7 < i3) {
                int i8 = i7 + 1;
                while (i8 <= i3) {
                    i8++;
                    i3 -= collapse(i8, z2, z3, z4, obj2);
                }
            }
        }
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i) {
        return expandOrCollapse$default(this, i, false, false, (Object) null, 14, (Object) null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i, boolean z) {
        return expandOrCollapse$default(this, i, z, false, (Object) null, 12, (Object) null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i, boolean z, boolean z2) {
        return expandOrCollapse$default(this, i, z, z2, (Object) null, 8, (Object) null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i, boolean z, boolean z2, @Nullable Object obj) {
        BaseNode baseNode = (BaseNode) getData().get(i);
        if (!(baseNode instanceof BaseExpandNode)) {
            return 0;
        }
        if (((BaseExpandNode) baseNode).isExpanded()) {
            return collapse(i, false, z, z2, obj);
        }
        return expand(i, false, z, z2, obj);
    }

    public final int findParentNode(@NotNull BaseNode baseNode) {
        int indexOf = getData().indexOf(baseNode);
        if (!(indexOf == -1 || indexOf == 0)) {
            for (int i = indexOf - 1; i >= 0; i--) {
                List<BaseNode> childNode = ((BaseNode) getData().get(i)).getChildNode();
                if (childNode != null && childNode.contains(baseNode)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean isFixedViewType(int i) {
        return super.isFixedViewType(i) || this.fullSpanNodeTypeSet.contains(Integer.valueOf(i));
    }

    public final void nodeAddData(@NotNull BaseNode baseNode, @NotNull BaseNode baseNode2) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode != null) {
            childNode.add(baseNode2);
            if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
                addData(getData().indexOf(baseNode) + childNode.size(), baseNode2);
            }
        }
    }

    public final void nodeRemoveData(@NotNull BaseNode baseNode, int i) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode != null && i < childNode.size()) {
            if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
                remove(getData().indexOf(baseNode) + 1 + i);
                BaseNode remove = childNode.remove(i);
                return;
            }
            childNode.remove(i);
        }
    }

    public final void nodeReplaceChildData(@NotNull BaseNode baseNode, @NotNull Collection<? extends BaseNode> collection) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode == null) {
            return;
        }
        if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
            int indexOf = getData().indexOf(baseNode);
            int removeChildAt = removeChildAt(indexOf);
            childNode.clear();
            childNode.addAll(collection);
            List flatData$default = flatData$default(this, collection, (Boolean) null, 2, (Object) null);
            int i = indexOf + 1;
            getData().addAll(i, flatData$default);
            int headerLayoutCount = i + getHeaderLayoutCount();
            if (removeChildAt == flatData$default.size()) {
                notifyItemRangeChanged(headerLayoutCount, removeChildAt);
                return;
            }
            notifyItemRangeRemoved(headerLayoutCount, removeChildAt);
            notifyItemRangeInserted(headerLayoutCount, flatData$default.size());
            return;
        }
        childNode.clear();
        childNode.addAll(collection);
    }

    public final void nodeSetData(@NotNull BaseNode baseNode, int i, @NotNull BaseNode baseNode2) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode != null && i < childNode.size()) {
            if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
                setData(getData().indexOf(baseNode) + 1 + i, baseNode2);
                childNode.set(i, baseNode2);
                return;
            }
            childNode.set(i, baseNode2);
        }
    }

    public void removeAt(int i) {
        notifyItemRangeRemoved(i + getHeaderLayoutCount(), removeNodesAt(i));
        compatibilityDataSizeChanged(0);
    }

    public void setDiffNewData(@Nullable List<BaseNode> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setDiffNewData(flatData$default(this, list, (Boolean) null, 2, (Object) null));
    }

    public void setList(@Nullable Collection<? extends BaseNode> collection) {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        super.setList(flatData$default(this, collection, (Boolean) null, 2, (Object) null));
    }

    public void setNewInstance(@Nullable List<BaseNode> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setNewInstance(flatData$default(this, list, (Boolean) null, 2, (Object) null));
    }

    public BaseNodeAdapter(@Nullable List<BaseNode> list) {
        super((List) null);
        this.fullSpanNodeTypeSet = new HashSet<>();
        if (!(list == null || list.isEmpty())) {
            getData().addAll(flatData$default(this, list, (Boolean) null, 2, (Object) null));
        }
    }

    public void setData(int i, @NotNull BaseNode baseNode) {
        int removeNodesAt = removeNodesAt(i);
        List flatData$default = flatData$default(this, CollectionsKt__CollectionsKt.arrayListOf(baseNode), (Boolean) null, 2, (Object) null);
        getData().addAll(i, flatData$default);
        if (removeNodesAt == flatData$default.size()) {
            notifyItemRangeChanged(i + getHeaderLayoutCount(), removeNodesAt);
            return;
        }
        notifyItemRangeRemoved(getHeaderLayoutCount() + i, removeNodesAt);
        notifyItemRangeInserted(i + getHeaderLayoutCount(), flatData$default.size());
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.collapse(i, z, z2, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.expand(i, z, z2, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
    }

    public void addData(int i, @NotNull BaseNode baseNode) {
        addData(i, (Collection<? extends BaseNode>) CollectionsKt__CollectionsKt.arrayListOf(baseNode));
    }

    public void addData(@NotNull BaseNode baseNode) {
        addData((Collection<? extends BaseNode>) CollectionsKt__CollectionsKt.arrayListOf(baseNode));
    }

    public final int findParentNode(@IntRange(from = 0) int i) {
        if (i == 0) {
            return -1;
        }
        BaseNode baseNode = (BaseNode) getData().get(i);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            List<BaseNode> childNode = ((BaseNode) getData().get(i2)).getChildNode();
            if (childNode != null && childNode.contains(baseNode)) {
                return i2;
            }
        }
        return -1;
    }

    public void setDiffNewData(@NotNull DiffUtil.DiffResult diffResult, @NotNull List<BaseNode> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, flatData$default(this, list, (Boolean) null, 2, (Object) null));
        }
    }

    public void addData(int i, @NotNull Collection<? extends BaseNode> collection) {
        super.addData(i, flatData$default(this, collection, (Boolean) null, 2, (Object) null));
    }

    public void addData(@NotNull Collection<? extends BaseNode> collection) {
        super.addData(flatData$default(this, collection, (Boolean) null, 2, (Object) null));
    }

    public final void nodeAddData(@NotNull BaseNode baseNode, int i, @NotNull BaseNode baseNode2) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode != null) {
            childNode.add(i, baseNode2);
            if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
                addData(getData().indexOf(baseNode) + 1 + i, baseNode2);
            }
        }
    }

    public final void nodeRemoveData(@NotNull BaseNode baseNode, @NotNull BaseNode baseNode2) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode == null) {
            return;
        }
        if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
            remove(baseNode2);
            childNode.remove(baseNode2);
            return;
        }
        childNode.remove(baseNode2);
    }

    public final void nodeAddData(@NotNull BaseNode baseNode, int i, @NotNull Collection<? extends BaseNode> collection) {
        List<BaseNode> childNode = baseNode.getChildNode();
        if (childNode != null) {
            childNode.addAll(i, collection);
            if (!(baseNode instanceof BaseExpandNode) || ((BaseExpandNode) baseNode).isExpanded()) {
                addData(getData().indexOf(baseNode) + 1 + i, collection);
            }
        }
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i, boolean z, boolean z2, @Nullable Object obj) {
        return collapse(i, false, z, z2, obj);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i, boolean z, boolean z2, @Nullable Object obj) {
        return expand(i, false, z, z2, obj);
    }
}
