package p040c.p140m.p141a;

import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ethanhua.skeleton.R$color;
import com.ethanhua.skeleton.R$layout;
import com.ethanhua.skeleton.SkeletonAdapter;

/* renamed from: c.m.a.a */
/* compiled from: RecyclerViewSkeletonScreen */
public class C2056a implements C2060c {

    /* renamed from: a */
    public final RecyclerView f1900a;

    /* renamed from: b */
    public final RecyclerView.Adapter f1901b;

    /* renamed from: c */
    public final SkeletonAdapter f1902c;

    /* renamed from: d */
    public final boolean f1903d;

    /* renamed from: c.m.a.a$b */
    /* compiled from: RecyclerViewSkeletonScreen */
    public static class C2058b {

        /* renamed from: a */
        public RecyclerView.Adapter f1904a;

        /* renamed from: b */
        public final RecyclerView f1905b;

        /* renamed from: c */
        public boolean f1906c = true;

        /* renamed from: d */
        public int f1907d = 10;

        /* renamed from: e */
        public int f1908e = R$layout.layout_default_item_skeleton;

        /* renamed from: f */
        public int f1909f;

        /* renamed from: g */
        public int f1910g = 1000;

        /* renamed from: h */
        public int f1911h = 20;

        /* renamed from: i */
        public boolean f1912i = true;

        public C2058b(RecyclerView recyclerView) {
            this.f1905b = recyclerView;
            this.f1909f = ContextCompat.getColor(recyclerView.getContext(), R$color.shimmer_color);
        }

        /* renamed from: j */
        public C2058b mo16685j(RecyclerView.Adapter adapter) {
            this.f1904a = adapter;
            return this;
        }

        /* renamed from: k */
        public C2058b mo16686k(@IntRange(from = 0, mo840to = 30) int i) {
            this.f1911h = i;
            return this;
        }

        /* renamed from: l */
        public C2058b mo16687l(@ColorRes int i) {
            this.f1909f = ContextCompat.getColor(this.f1905b.getContext(), i);
            return this;
        }

        /* renamed from: m */
        public C2058b mo16688m(int i) {
            this.f1907d = i;
            return this;
        }

        /* renamed from: n */
        public C2058b mo16689n(int i) {
            this.f1910g = i;
            return this;
        }

        /* renamed from: o */
        public C2058b mo16690o(boolean z) {
            this.f1912i = z;
            return this;
        }

        /* renamed from: p */
        public C2058b mo16691p(@LayoutRes int i) {
            this.f1908e = i;
            return this;
        }

        /* renamed from: q */
        public C2058b mo16692q(boolean z) {
            this.f1906c = z;
            return this;
        }

        /* renamed from: r */
        public C2056a mo16693r() {
            C2056a aVar = new C2056a(this);
            aVar.mo16684b();
            return aVar;
        }
    }

    /* renamed from: a */
    public void mo16683a() {
        this.f1900a.setAdapter(this.f1901b);
    }

    /* renamed from: b */
    public void mo16684b() {
        this.f1900a.setAdapter(this.f1902c);
        if (!this.f1900a.isComputingLayout() && this.f1903d) {
            this.f1900a.setLayoutFrozen(true);
        }
    }

    public C2056a(C2058b bVar) {
        this.f1900a = bVar.f1905b;
        this.f1901b = bVar.f1904a;
        SkeletonAdapter skeletonAdapter = new SkeletonAdapter();
        this.f1902c = skeletonAdapter;
        skeletonAdapter.mo22565a(bVar.f1907d);
        this.f1902c.mo22566b(bVar.f1908e);
        this.f1902c.mo22570f(bVar.f1906c);
        this.f1902c.mo22568d(bVar.f1909f);
        this.f1902c.mo22567c(bVar.f1911h);
        this.f1902c.mo22569e(bVar.f1910g);
        this.f1903d = bVar.f1912i;
    }
}
