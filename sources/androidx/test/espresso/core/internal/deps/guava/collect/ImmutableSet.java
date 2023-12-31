package androidx.test.espresso.core.internal.deps.guava.collect;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public transient ImmutableList<E> asList;

    public static class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.checkArgument(z, "collection too large");
        return 1073741824;
    }

    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i == 0) {
            return m158of();
        }
        if (i == 1) {
            return m159of(objArr[0]);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object checkElementNotNull = ObjectArrays.checkElementNotNull(objArr[i5], i5);
            int hashCode = checkElementNotNull.hashCode();
            int smear = Hashing.smear(hashCode);
            while (true) {
                int i6 = smear & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = checkElementNotNull;
                    objArr2[i6] = checkElementNotNull;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj.equals(checkElementNotNull)) {
                    break;
                } else {
                    smear++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new SingletonImmutableSet(objArr[0], i3);
        }
        if (chooseTableSize(i4) < chooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m158of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return m159of(eArr[0]);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m158of() {
        return RegularImmutableSet.EMPTY;
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return Sets.equalsImpl(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract UnmodifiableIterator<E> iterator();

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m159of(E e) {
        return new SingletonImmutableSet(e);
    }

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public int hashCode;
        public Object[] hashTable;

        public Builder() {
            super(4);
        }

        private void addDeduping(E e) {
            int length = this.hashTable.length - 1;
            int hashCode2 = e.hashCode();
            int smear = Hashing.smear(hashCode2);
            while (true) {
                int i = smear & length;
                Object[] objArr = this.hashTable;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.hashCode += hashCode2;
                    super.add(e);
                    return;
                } else if (!obj.equals(e)) {
                    smear = i + 1;
                } else {
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.test.espresso.core.internal.deps.guava.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: androidx.test.espresso.core.internal.deps.guava.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: androidx.test.espresso.core.internal.deps.guava.collect.RegularImmutableSet} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet<E> build() {
            /*
                r8 = this;
                int r0 = r8.size
                if (r0 == 0) goto L_0x0059
                r1 = 1
                if (r0 == r1) goto L_0x004f
                java.lang.Object[] r2 = r8.hashTable
                if (r2 == 0) goto L_0x003b
                int r0 = androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r2 = r8.hashTable
                int r2 = r2.length
                if (r0 != r2) goto L_0x003b
                int r0 = r8.size
                java.lang.Object[] r2 = r8.contents
                int r2 = r2.length
                boolean r0 = androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet.shouldTrim(r0, r2)
                if (r0 == 0) goto L_0x0028
                java.lang.Object[] r0 = r8.contents
                int r2 = r8.size
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L_0x002a
            L_0x0028:
                java.lang.Object[] r0 = r8.contents
            L_0x002a:
                r3 = r0
                androidx.test.espresso.core.internal.deps.guava.collect.RegularImmutableSet r0 = new androidx.test.espresso.core.internal.deps.guava.collect.RegularImmutableSet
                int r4 = r8.hashCode
                java.lang.Object[] r5 = r8.hashTable
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.size
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0049
            L_0x003b:
                int r0 = r8.size
                java.lang.Object[] r2 = r8.contents
                androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet r0 = androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet.construct(r0, r2)
                int r2 = r0.size()
                r8.size = r2
            L_0x0049:
                r8.forceCopy = r1
                r1 = 0
                r8.hashTable = r1
                return r0
            L_0x004f:
                java.lang.Object[] r0 = r8.contents
                r1 = 0
                r0 = r0[r1]
                androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet r0 = androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet.m159of(r0)
                return r0
            L_0x0059:
                androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet r0 = androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet.m158of()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet.Builder.build():androidx.test.espresso.core.internal.deps.guava.collect.ImmutableSet");
        }

        public Builder<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.hashTable == null || ImmutableSet.chooseTableSize(this.size) > this.hashTable.length) {
                this.hashTable = null;
                super.add(e);
                return this;
            }
            addDeduping(e);
            return this;
        }

        public Builder<E> add(E... eArr) {
            if (this.hashTable != null) {
                for (E add : eArr) {
                    add((Object) add);
                }
            } else {
                super.add(eArr);
            }
            return this;
        }
    }
}
