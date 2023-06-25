package p040c.p200q.p201a.p264c.p294g.p300f;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: c.q.a.c.g.f.s */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3661s extends C3652j {

    /* renamed from: e */
    public final int f6601e;

    /* renamed from: l */
    public int f6602l;

    public C3661s(int i, int i2) {
        C3659q.m9201b(i2, i, "index");
        this.f6601e = i;
        this.f6602l = i2;
    }

    /* renamed from: a */
    public abstract Object mo20914a(int i);

    public final boolean hasNext() {
        return this.f6602l < this.f6601e;
    }

    public final boolean hasPrevious() {
        return this.f6602l > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f6602l;
            this.f6602l = i + 1;
            return mo20914a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f6602l;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f6602l - 1;
            this.f6602l = i;
            return mo20914a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f6602l - 1;
    }
}
