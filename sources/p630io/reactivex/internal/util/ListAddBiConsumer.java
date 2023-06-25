package p630io.reactivex.internal.util;

import java.util.List;
import p553f.p594c.p601r.C9215c;

/* renamed from: io.reactivex.internal.util.ListAddBiConsumer */
public enum ListAddBiConsumer implements C9215c<List, Object, List> {
    INSTANCE;

    public static <T> C9215c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}
