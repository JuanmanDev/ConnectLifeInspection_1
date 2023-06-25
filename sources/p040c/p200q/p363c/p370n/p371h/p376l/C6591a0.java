package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c.q.c.n.h.l.a0 */
/* compiled from: ImmutableList */
public final class C6591a0<E> implements List<E>, RandomAccess {

    /* renamed from: e */
    public final List<E> f12523e;

    public C6591a0(List<E> list) {
        this.f12523e = Collections.unmodifiableList(list);
    }

    @NonNull
    /* renamed from: c */
    public static <E> C6591a0<E> m18552c(@NonNull List<E> list) {
        return new C6591a0<>(list);
    }

    @NonNull
    /* renamed from: f */
    public static <E> C6591a0<E> m18553f(E... eArr) {
        return new C6591a0<>(Arrays.asList(eArr));
    }

    public boolean add(@NonNull E e) {
        return this.f12523e.add(e);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f12523e.addAll(collection);
    }

    public void clear() {
        this.f12523e.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f12523e.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f12523e.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f12523e.equals(obj);
    }

    @NonNull
    public E get(int i) {
        return this.f12523e.get(i);
    }

    public int hashCode() {
        return this.f12523e.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f12523e.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f12523e.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f12523e.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f12523e.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f12523e.listIterator();
    }

    public boolean remove(@Nullable Object obj) {
        return this.f12523e.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f12523e.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f12523e.retainAll(collection);
    }

    @NonNull
    public E set(int i, @NonNull E e) {
        return this.f12523e.set(i, e);
    }

    public int size() {
        return this.f12523e.size();
    }

    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f12523e.subList(i, i2);
    }

    @Nullable
    public Object[] toArray() {
        return this.f12523e.toArray();
    }

    public void add(int i, @NonNull E e) {
        this.f12523e.add(i, e);
    }

    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f12523e.addAll(i, collection);
    }

    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f12523e.listIterator(i);
    }

    public E remove(int i) {
        return this.f12523e.remove(i);
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f12523e.toArray(tArr);
    }
}
