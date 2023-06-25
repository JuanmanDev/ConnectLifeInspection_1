package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;
import p001a.p007c.p015f.C0054a;
import p001a.p007c.p015f.C0055b;
import p001a.p007c.p015f.C0056c;
import p001a.p007c.p015f.C0057d;
import p001a.p007c.p015f.C0058e;

@SuppressLint({"UnknownNullness"})
public interface Predicate<T> {
    /* renamed from: c */
    static /* synthetic */ boolean m71c(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    /* renamed from: d */
    static /* synthetic */ boolean m72d(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    /* renamed from: e */
    static /* synthetic */ boolean m73e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) Object obj) {
        if (obj == null) {
            return C0055b.f84a;
        }
        return new C0056c(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    @SuppressLint({"MissingNullability"})
    Predicate<T> and(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new C0057d(this, predicate);
    }

    @SuppressLint({"MissingNullability"})
    Predicate<T> negate() {
        return new C0058e(this);
    }

    @SuppressLint({"MissingNullability"})
    /* renamed from: or */
    Predicate<T> mo6739or(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new C0054a(this, predicate);
    }

    boolean test(T t);
}
