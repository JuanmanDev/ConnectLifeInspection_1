package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffUtil {
    public static final Comparator<Snake> SNAKE_COMPARATOR = new Comparator<Snake>() {
        public int compare(Snake snake, Snake snake2) {
            int i = snake.f263x - snake2.f263x;
            return i == 0 ? snake.f264y - snake2.f264y : i;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class DiffResult {
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_IGNORE = 16;
        public static final int FLAG_MASK = 31;
        public static final int FLAG_MOVED_CHANGED = 4;
        public static final int FLAG_MOVED_NOT_CHANGED = 8;
        public static final int FLAG_NOT_CHANGED = 1;
        public static final int FLAG_OFFSET = 5;
        public static final int NO_POSITION = -1;
        public final Callback mCallback;
        public final boolean mDetectMoves;
        public final int[] mNewItemStatuses;
        public final int mNewListSize;
        public final int[] mOldItemStatuses;
        public final int mOldListSize;
        public final List<Snake> mSnakes;

        public DiffResult(Callback callback, List<Snake> list, int[] iArr, int[] iArr2, boolean z) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.mNewItemStatuses, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addRootSnake();
            findMatchingItems();
        }

        private void addRootSnake() {
            Snake snake = this.mSnakes.isEmpty() ? null : this.mSnakes.get(0);
            if (snake == null || snake.f263x != 0 || snake.f264y != 0) {
                Snake snake2 = new Snake();
                snake2.f263x = 0;
                snake2.f264y = 0;
                snake2.removal = false;
                snake2.size = 0;
                snake2.reverse = false;
                this.mSnakes.add(0, snake2);
            }
        }

        private void dispatchAdditions(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onInserted(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.mNewItemStatuses[i5] & 31;
                if (i6 == 0) {
                    listUpdateCallback.onInserted(i, 1);
                    for (PostponedUpdate postponedUpdate : list) {
                        postponedUpdate.currentPos++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.mNewItemStatuses[i5] >> 5;
                    listUpdateCallback.onMoved(removePostponedUpdate(list, i7, true).currentPos, i);
                    if (i6 == 4) {
                        listUpdateCallback.onChanged(i, 1, this.mCallback.getChangePayload(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new PostponedUpdate(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        private void dispatchRemovals(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onRemoved(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.mOldItemStatuses[i5] & 31;
                if (i6 == 0) {
                    listUpdateCallback.onRemoved(i + i4, 1);
                    for (PostponedUpdate postponedUpdate : list) {
                        postponedUpdate.currentPos--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.mOldItemStatuses[i5] >> 5;
                    PostponedUpdate removePostponedUpdate = removePostponedUpdate(list, i7, false);
                    listUpdateCallback.onMoved(i + i4, removePostponedUpdate.currentPos - 1);
                    if (i6 == 4) {
                        listUpdateCallback.onChanged(removePostponedUpdate.currentPos - 1, 1, this.mCallback.getChangePayload(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new PostponedUpdate(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        private void findAddition(int i, int i2, int i3) {
            if (this.mOldItemStatuses[i - 1] == 0) {
                findMatchingItem(i, i2, i3, false);
            }
        }

        private boolean findMatchingItem(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                Snake snake = this.mSnakes.get(i3);
                int i6 = snake.f263x;
                int i7 = snake.size;
                int i8 = i6 + i7;
                int i9 = snake.f264y + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.mCallback.areItemsTheSame(i11, i5)) {
                            if (!this.mCallback.areContentsTheSame(i11, i5)) {
                                i10 = 4;
                            }
                            this.mNewItemStatuses[i5] = (i11 << 5) | 16;
                            this.mOldItemStatuses[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.mCallback.areItemsTheSame(i5, i12)) {
                            if (!this.mCallback.areContentsTheSame(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.mOldItemStatuses[i13] = (i12 << 5) | 16;
                            this.mNewItemStatuses[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = snake.f263x;
                i2 = snake.f264y;
                i3--;
            }
            return false;
        }

        private void findMatchingItems() {
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i3 = snake.f263x;
                int i4 = snake.size;
                int i5 = i3 + i4;
                int i6 = snake.f264y + i4;
                if (this.mDetectMoves) {
                    while (i > i5) {
                        findAddition(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        findRemoval(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < snake.size; i7++) {
                    int i8 = snake.f263x + i7;
                    int i9 = snake.f264y + i7;
                    int i10 = this.mCallback.areContentsTheSame(i8, i9) ? 1 : 2;
                    this.mOldItemStatuses[i8] = (i9 << 5) | i10;
                    this.mNewItemStatuses[i9] = (i8 << 5) | i10;
                }
                i = snake.f263x;
                i2 = snake.f264y;
            }
        }

        private void findRemoval(int i, int i2, int i3) {
            if (this.mNewItemStatuses[i2 - 1] == 0) {
                findMatchingItem(i, i2, i3, true);
            }
        }

        public static PostponedUpdate removePostponedUpdate(List<PostponedUpdate> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                PostponedUpdate postponedUpdate = list.get(size);
                if (postponedUpdate.posInOwnerList == i && postponedUpdate.removal == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).currentPos += z ? 1 : -1;
                        size++;
                    }
                    return postponedUpdate;
                }
                size--;
            }
            return null;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mNewListSize) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.mNewListSize);
            }
            int i2 = this.mNewItemStatuses[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mOldListSize) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.mOldListSize);
            }
            int i2 = this.mOldItemStatuses[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo((ListUpdateCallback) new AdapterListUpdateCallback(adapter));
        }

        @VisibleForTesting
        public List<Snake> getSnakes() {
            return this.mSnakes;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback;
            if (listUpdateCallback instanceof BatchingListUpdateCallback) {
                batchingListUpdateCallback = (BatchingListUpdateCallback) listUpdateCallback;
            } else {
                batchingListUpdateCallback = new BatchingListUpdateCallback(listUpdateCallback);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i3 = snake.size;
                int i4 = snake.f263x + i3;
                int i5 = snake.f264y + i3;
                if (i4 < i) {
                    dispatchRemovals(arrayList, batchingListUpdateCallback, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    dispatchAdditions(arrayList, batchingListUpdateCallback, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.mOldItemStatuses;
                    int i7 = snake.f263x;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        batchingListUpdateCallback.onChanged(i7 + i6, 1, this.mCallback.getChangePayload(i7 + i6, snake.f264y + i6));
                    }
                }
                i = snake.f263x;
                i2 = snake.f264y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    public static class PostponedUpdate {
        public int currentPos;
        public int posInOwnerList;
        public boolean removal;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.posInOwnerList = i;
            this.currentPos = i2;
            this.removal = z;
        }
    }

    public static class Range {
        public int newListEnd;
        public int newListStart;
        public int oldListEnd;
        public int oldListStart;

        public Range() {
        }

        public Range(int i, int i2, int i3, int i4) {
            this.oldListStart = i;
            this.oldListEnd = i2;
            this.newListStart = i3;
            this.newListEnd = i4;
        }
    }

    public static class Snake {
        public boolean removal;
        public boolean reverse;
        public int size;

        /* renamed from: x */
        public int f263x;

        /* renamed from: y */
        public int f264y;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:10:0x0033->B:33:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.DiffUtil.Snake diffPartial(androidx.recyclerview.widget.DiffUtil.Callback r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = r5
            goto L_0x002e
        L_0x002d:
            r8 = r10
        L_0x002e:
            r9 = r10
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = r5
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = r10
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.areItemsTheSame(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.DiffUtil$Snake r0 = new androidx.recyclerview.widget.DiffUtil$Snake
            r0.<init>()
            r3 = r2[r5]
            r0.f263x = r3
            int r3 = r3 - r12
            r0.f264y = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.size = r1
            r0.removal = r14
            r13 = 0
            r0.reverse = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r10 = r13
            r5 = 1
            goto L_0x0033
        L_0x00a0:
            r13 = r10
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = r15
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = r13
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.areItemsTheSame(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.DiffUtil$Snake r0 = new androidx.recyclerview.widget.DiffUtil$Snake
            r0.<init>()
            r4 = r2[r3]
            r0.f263x = r4
            int r4 = r4 - r10
            r0.f264y = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.size = r1
            r0.removal = r14
            r3 = 1
            r0.reverse = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r5 = r3
            r3 = r18
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.diffPartial(androidx.recyclerview.widget.DiffUtil$Callback, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.DiffUtil$Snake");
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z) {
        Range range;
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int abs = oldListSize + newListSize + Math.abs(oldListSize - newListSize);
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range2 = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake diffPartial = diffPartial(callback, range2.oldListStart, range2.oldListEnd, range2.newListStart, range2.newListEnd, iArr, iArr2, abs);
            if (diffPartial != null) {
                if (diffPartial.size > 0) {
                    arrayList.add(diffPartial);
                }
                diffPartial.f263x += range2.oldListStart;
                diffPartial.f264y += range2.newListStart;
                if (arrayList3.isEmpty()) {
                    range = new Range();
                } else {
                    range = (Range) arrayList3.remove(arrayList3.size() - 1);
                }
                range.oldListStart = range2.oldListStart;
                range.newListStart = range2.newListStart;
                if (diffPartial.reverse) {
                    range.oldListEnd = diffPartial.f263x;
                    range.newListEnd = diffPartial.f264y;
                } else if (diffPartial.removal) {
                    range.oldListEnd = diffPartial.f263x - 1;
                    range.newListEnd = diffPartial.f264y;
                } else {
                    range.oldListEnd = diffPartial.f263x;
                    range.newListEnd = diffPartial.f264y - 1;
                }
                arrayList2.add(range);
                if (!diffPartial.reverse) {
                    int i2 = diffPartial.f263x;
                    int i3 = diffPartial.size;
                    range2.oldListStart = i2 + i3;
                    range2.newListStart = diffPartial.f264y + i3;
                } else if (diffPartial.removal) {
                    int i4 = diffPartial.f263x;
                    int i5 = diffPartial.size;
                    range2.oldListStart = i4 + i5 + 1;
                    range2.newListStart = diffPartial.f264y + i5;
                } else {
                    int i6 = diffPartial.f263x;
                    int i7 = diffPartial.size;
                    range2.oldListStart = i6 + i7;
                    range2.newListStart = diffPartial.f264y + i7 + 1;
                }
                arrayList2.add(range2);
            } else {
                arrayList3.add(range2);
            }
        }
        Collections.sort(arrayList, SNAKE_COMPARATOR);
        return new DiffResult(callback, arrayList, iArr, iArr2, z);
    }
}
