package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00020\u0001H\u0001\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u001c\u0010\t\u001a\u00020\u00018\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\u0016\u0010\f\u001a\u00020\u00078\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u0016\u0010\u000e\u001a\u00020\u00078\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003*\n\u0010\u0013\"\u00020\u00142\u00020\u0014*\u001c\u0010\u0015\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u0002H\u00160\u00172\b\u0012\u0004\u0012\u0002H\u00160\u0017*\f\b\u0002\u0010\u0018\"\u00020\u00112\u00020\u0011*\n\u0010\u0019\"\u00020\u001a2\u00020\u001a*\u001c\u0010\u001b\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u0002H\u00160\u001c2\b\u0012\u0004\u0012\u0002H\u00160\u001c¨\u0006\u001d"}, mo47991d2 = {"CONDITION_FALSE", "", "getCONDITION_FALSE$annotations", "()V", "getCONDITION_FALSE", "()Ljava/lang/Object;", "FAILURE", "", "getFAILURE$annotations", "LIST_EMPTY", "getLIST_EMPTY$annotations", "getLIST_EMPTY", "SUCCESS", "getSUCCESS$annotations", "UNDECIDED", "getUNDECIDED$annotations", "unwrap", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "AbstractAtomicDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "AddLastDesc", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Node", "PrepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "RemoveFirstDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "kotlinx-coroutines-core"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LockFreeLinkedList.kt */
public final class LockFreeLinkedListKt {
    @NotNull
    public static final Object CONDITION_FALSE = new Symbol("CONDITION_FALSE");
    public static final int FAILURE = 2;
    @NotNull
    public static final Object LIST_EMPTY = new Symbol("LIST_EMPTY");
    public static final int SUCCESS = 1;
    public static final int UNDECIDED = 0;

    @NotNull
    public static final Object getCONDITION_FALSE() {
        return CONDITION_FALSE;
    }

    @PublishedApi
    public static /* synthetic */ void getCONDITION_FALSE$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getFAILURE$annotations() {
    }

    @NotNull
    public static final Object getLIST_EMPTY() {
        return LIST_EMPTY;
    }

    @PublishedApi
    public static /* synthetic */ void getLIST_EMPTY$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSUCCESS$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getUNDECIDED$annotations() {
    }

    @NotNull
    @PublishedApi
    public static final LockFreeLinkedListNode unwrap(@NotNull Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        return (removed == null || (lockFreeLinkedListNode = removed.ref) == null) ? (LockFreeLinkedListNode) obj : lockFreeLinkedListNode;
    }
}
