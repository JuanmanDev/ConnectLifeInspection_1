package p648m.p657c.p659k;

import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: m.c.k.a */
/* compiled from: ArrayIterator */
public class C9639a implements Iterator<Object> {

    /* renamed from: e */
    public final Object f18867e;

    /* renamed from: l */
    public int f18868l = 0;

    public C9639a(Object obj) {
        if (obj.getClass().isArray()) {
            this.f18867e = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }

    public boolean hasNext() {
        return this.f18868l < Array.getLength(this.f18867e);
    }

    public Object next() {
        Object obj = this.f18867e;
        int i = this.f18868l;
        this.f18868l = i + 1;
        return Array.get(obj, i);
    }

    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
