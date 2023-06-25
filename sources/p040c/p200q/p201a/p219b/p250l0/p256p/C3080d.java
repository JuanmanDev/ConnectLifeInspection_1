package p040c.p200q.p201a.p219b.p250l0.p256p;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: c.q.a.b.l0.p.d */
/* compiled from: TtmlRenderUtil */
public final class C3080d {
    /* renamed from: a */
    public static void m7392a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C3081e eVar) {
        if (eVar.mo19749h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.mo19749h()), i, i2, 33);
        }
        if (eVar.mo19754m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (eVar.mo19755n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (eVar.mo19752k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.mo19744c()), i, i2, 33);
        }
        if (eVar.mo19751j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.mo19743b()), i, i2, 33);
        }
        if (eVar.mo19745d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.mo19745d()), i, i2, 33);
        }
        if (eVar.mo19750i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(eVar.mo19750i()), i, i2, 33);
        }
        int f = eVar.mo19747f();
        if (f == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) eVar.mo19746e(), true), i, i2, 33);
        } else if (f == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.mo19746e()), i, i2, 33);
        } else if (f == 3) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.mo19746e() / 100.0f), i, i2, 33);
        }
    }

    /* renamed from: b */
    public static String m7393b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    public static void m7394c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: d */
    public static C3081e m7395d(C3081e eVar, String[] strArr, Map<String, C3081e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (eVar == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            C3081e eVar2 = new C3081e();
            int length = strArr.length;
            while (i < length) {
                eVar2.mo19742a(map.get(strArr[i]));
                i++;
            }
            return eVar2;
        } else if (eVar == null || strArr == null || strArr.length != 1) {
            if (!(eVar == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    eVar.mo19742a(map.get(strArr[i]));
                    i++;
                }
            }
            return eVar;
        } else {
            eVar.mo19742a(map.get(strArr[0]));
            return eVar;
        }
    }
}
