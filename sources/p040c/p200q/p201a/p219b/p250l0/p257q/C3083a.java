package p040c.p200q.p201a.p219b.p250l0.p257q;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.core.graphics.TypefaceCompatApi28Impl;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.charset.Charset;
import java.util.List;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.q.a */
/* compiled from: Tx3gDecoder */
public final class C3083a extends C3032b {

    /* renamed from: u */
    public static final int f5577u = C3152e0.m7764D("styl");

    /* renamed from: v */
    public static final int f5578v = C3152e0.m7764D("tbox");

    /* renamed from: n */
    public final C3173t f5579n = new C3173t();

    /* renamed from: o */
    public boolean f5580o;

    /* renamed from: p */
    public int f5581p;

    /* renamed from: q */
    public int f5582q;

    /* renamed from: r */
    public String f5583r;

    /* renamed from: s */
    public float f5584s;

    /* renamed from: t */
    public int f5585t;

    public C3083a(List<byte[]> list) {
        super("Tx3gDecoder");
        mo19768G(list);
    }

    /* renamed from: C */
    public static void m7425C(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* renamed from: D */
    public static void m7426D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: E */
    public static void m7427E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: F */
    public static void m7428F(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: H */
    public static String m7429H(C3173t tVar) {
        char e;
        m7425C(tVar.mo20008a() >= 2);
        int E = tVar.mo19999E();
        if (E == 0) {
            return "";
        }
        if (tVar.mo20008a() < 2 || ((e = tVar.mo20012e()) != 65279 && e != 65534)) {
            return tVar.mo20030w(E, Charset.forName("UTF-8"));
        }
        return tVar.mo20030w(E, Charset.forName("UTF-16"));
    }

    /* renamed from: B */
    public final void mo19767B(C3173t tVar, SpannableStringBuilder spannableStringBuilder) {
        m7425C(tVar.mo20008a() >= 12);
        int E = tVar.mo19999E();
        int E2 = tVar.mo19999E();
        tVar.mo20007M(2);
        int y = tVar.mo20032y();
        tVar.mo20007M(1);
        int j = tVar.mo20017j();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = E;
        int i2 = E2;
        m7427E(spannableStringBuilder2, y, this.f5581p, i, i2, 0);
        m7426D(spannableStringBuilder2, j, this.f5582q, i, i2, 0);
    }

    /* renamed from: G */
    public final void mo19768G(List<byte[]> list) {
        String str = TypefaceCompatApi28Impl.DEFAULT_FAMILY;
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f5581p = bArr[24];
            this.f5582q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(C3152e0.m7821u(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.f5583r = str;
            this.f5585t = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f5580o = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f5585t);
                this.f5584s = f;
                this.f5584s = C3152e0.m7811m(f, 0.0f, 0.95f);
                return;
            }
            this.f5584s = 0.85f;
            return;
        }
        this.f5581p = 0;
        this.f5582q = -1;
        this.f5583r = str;
        this.f5580o = false;
        this.f5584s = 0.85f;
    }

    /* renamed from: y */
    public C3034d mo19616y(byte[] bArr, int i, boolean z) {
        this.f5579n.mo20004J(bArr, i);
        String H = m7429H(this.f5579n);
        if (H.isEmpty()) {
            return C3084b.f5586l;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m7427E(spannableStringBuilder2, this.f5581p, 0, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        m7426D(spannableStringBuilder2, this.f5582q, -1, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        m7428F(spannableStringBuilder2, this.f5583r, TypefaceCompatApi28Impl.DEFAULT_FAMILY, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        float f = this.f5584s;
        while (this.f5579n.mo20008a() >= 8) {
            int c = this.f5579n.mo20010c();
            int j = this.f5579n.mo20017j();
            int j2 = this.f5579n.mo20017j();
            boolean z2 = true;
            if (j2 == f5577u) {
                if (this.f5579n.mo20008a() < 2) {
                    z2 = false;
                }
                m7425C(z2);
                int E = this.f5579n.mo19999E();
                for (int i2 = 0; i2 < E; i2++) {
                    mo19767B(this.f5579n, spannableStringBuilder);
                }
            } else if (j2 == f5578v && this.f5580o) {
                if (this.f5579n.mo20008a() < 2) {
                    z2 = false;
                }
                m7425C(z2);
                f = C3152e0.m7811m(((float) this.f5579n.mo19999E()) / ((float) this.f5585t), 0.0f, 0.95f);
            }
            this.f5579n.mo20006L(c + j);
        }
        return new C3084b(new C3031a(spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
