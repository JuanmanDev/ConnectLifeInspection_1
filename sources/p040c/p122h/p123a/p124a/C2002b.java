package p040c.p122h.p123a.p124a;

import androidx.recyclerview.widget.RecyclerView;
import com.daimajia.swipe.util.Attributes$Mode;
import java.util.HashSet;
import p040c.p122h.p123a.p125b.C2004a;

/* renamed from: c.h.a.a.b */
/* compiled from: SwipeItemMangerImpl */
public abstract class C2002b implements C2004a {
    public C2002b(RecyclerView.Adapter adapter) {
        Attributes$Mode attributes$Mode = Attributes$Mode.Single;
        new HashSet();
        new HashSet();
        if (adapter == null) {
            throw new IllegalArgumentException("Adapter can not be null");
        } else if (!(adapter instanceof C2004a)) {
            throw new IllegalArgumentException("adapter should implement the SwipeAdapterInterface");
        }
    }
}
