package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.k */
/* compiled from: LineRadarRenderer */
public abstract class C2325k extends C2326l {
    public C2325k(C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
    }

    /* renamed from: k */
    public final boolean mo17533k() {
        return C2347i.m3971r() >= 18;
    }

    /* renamed from: l */
    public void mo17534l(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
        if (mo17533k()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.f2451c.getStyle();
        int color = this.f2451c.getColor();
        this.f2451c.setStyle(Paint.Style.FILL);
        this.f2451c.setColor(i3);
        canvas.drawPath(path, this.f2451c);
        this.f2451c.setColor(color);
        this.f2451c.setStyle(style);
    }

    /* renamed from: m */
    public void mo17535m(Canvas canvas, Path path, Drawable drawable) {
        if (mo17533k()) {
            int save = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.f2503a.mo17630h(), (int) this.f2503a.mo17632j(), (int) this.f2503a.mo17631i(), (int) this.f2503a.mo17628f());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + C2347i.m3971r() + MAPCookie.DOT);
    }
}
