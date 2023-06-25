package p648m.p668e.p677l.p678g;

import java.util.Comparator;
import org.junit.runner.Description;

/* renamed from: m.e.l.g.d */
/* compiled from: Sorter */
public class C9756d implements Comparator<Description> {

    /* renamed from: e */
    public final Comparator<Description> f19025e;

    public C9756d(Comparator<Description> comparator) {
        this.f19025e = comparator;
    }

    /* renamed from: a */
    public void mo50577a(Object obj) {
        if (obj instanceof C9755c) {
            ((C9755c) obj).sort(this);
        }
    }

    /* renamed from: b */
    public int compare(Description description, Description description2) {
        return this.f19025e.compare(description, description2);
    }
}
