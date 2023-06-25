package androidx.test.espresso.core.internal.deps.guava.base;

import java.io.IOException;
import java.util.Iterator;

public class Joiner {
    public final String separator;

    public Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    /* renamed from: on */
    public static Joiner m142on(String str) {
        return new Joiner(str);
    }

    public <A extends Appendable> A appendTo(A a, Iterator<?> it) {
        Preconditions.checkNotNull(a);
        if (it.hasNext()) {
            a.append(toString(it.next()));
            while (it.hasNext()) {
                a.append(this.separator);
                a.append(toString(it.next()));
            }
        }
        return a;
    }

    public final String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public CharSequence toString(Object obj) {
        Preconditions.checkNotNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String join(Iterator<?> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterable<?> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterator<?> it) {
        try {
            appendTo(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
