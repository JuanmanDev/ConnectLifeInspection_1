package p553f.p554a.p570e.p574d;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.PointerIconCompat;
import java.util.HashMap;
import p553f.p554a.p556d.p558b.p569i.C8980f;

@RequiresApi(24)
@TargetApi(24)
/* renamed from: f.a.e.d.a */
/* compiled from: MouseCursorPlugin */
public class C9045a {
    @NonNull

    /* renamed from: c */
    public static HashMap<String, Integer> f17750c;
    @NonNull

    /* renamed from: a */
    public final C9048c f17751a;
    @NonNull

    /* renamed from: b */
    public final C8980f f17752b;

    /* renamed from: f.a.e.d.a$a */
    /* compiled from: MouseCursorPlugin */
    public class C9046a implements C8980f.C8982b {
        public C9046a() {
        }

        /* renamed from: a */
        public void mo46527a(@NonNull String str) {
            C9045a.this.f17751a.setPointerIcon(C9045a.this.mo46651d(str));
        }
    }

    /* renamed from: f.a.e.d.a$b */
    /* compiled from: MouseCursorPlugin */
    public class C9047b extends HashMap<String, Integer> {
        public static final long serialVersionUID = 1;

        public C9047b(C9045a aVar) {
            put("alias", Integer.valueOf(PointerIconCompat.TYPE_ALIAS));
            Integer valueOf = Integer.valueOf(PointerIconCompat.TYPE_ALL_SCROLL);
            put("allScroll", valueOf);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            Integer valueOf2 = Integer.valueOf(PointerIconCompat.TYPE_NO_DROP);
            put("forbidden", valueOf2);
            put("grab", Integer.valueOf(PointerIconCompat.TYPE_GRAB));
            put("grabbing", Integer.valueOf(PointerIconCompat.TYPE_GRABBING));
            put("help", Integer.valueOf(PointerIconCompat.TYPE_HELP));
            put("move", valueOf);
            put("none", 0);
            put("noDrop", valueOf2);
            put("precise", Integer.valueOf(PointerIconCompat.TYPE_CROSSHAIR));
            put("text", Integer.valueOf(PointerIconCompat.TYPE_TEXT));
            Integer valueOf3 = Integer.valueOf(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW);
            put("resizeColumn", valueOf3);
            Integer valueOf4 = Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW);
            put("resizeDown", valueOf4);
            Integer valueOf5 = Integer.valueOf(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
            put("resizeUpLeft", valueOf5);
            Integer valueOf6 = Integer.valueOf(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
            put("resizeDownRight", valueOf6);
            put("resizeLeft", valueOf3);
            put("resizeLeftRight", valueOf3);
            put("resizeRight", valueOf3);
            put("resizeRow", valueOf4);
            put("resizeUp", valueOf4);
            put("resizeUpDown", valueOf4);
            put("resizeUpLeft", valueOf6);
            put("resizeUpRight", valueOf5);
            put("resizeUpLeftDownRight", valueOf6);
            put("resizeUpRightDownLeft", valueOf5);
            put("verticalText", Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT));
            put("wait", Integer.valueOf(PointerIconCompat.TYPE_WAIT));
            put("zoomIn", Integer.valueOf(PointerIconCompat.TYPE_ZOOM_IN));
            put("zoomOut", Integer.valueOf(PointerIconCompat.TYPE_ZOOM_OUT));
        }
    }

    /* renamed from: f.a.e.d.a$c */
    /* compiled from: MouseCursorPlugin */
    public interface C9048c {
        /* renamed from: c */
        PointerIcon mo46652c(int i);

        void setPointerIcon(@NonNull PointerIcon pointerIcon);
    }

    public C9045a(@NonNull C9048c cVar, @NonNull C8980f fVar) {
        this.f17751a = cVar;
        this.f17752b = fVar;
        fVar.mo46526b(new C9046a());
    }

    /* renamed from: c */
    public void mo46650c() {
        this.f17752b.mo46526b((C8980f.C8982b) null);
    }

    /* renamed from: d */
    public final PointerIcon mo46651d(@NonNull String str) {
        if (f17750c == null) {
            f17750c = new C9047b(this);
        }
        return this.f17751a.mo46652c(f17750c.getOrDefault(str, 1000).intValue());
    }
}
