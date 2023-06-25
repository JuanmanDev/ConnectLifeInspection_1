package p040c.p200q.p201a.p264c.p294g.p335i;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.i */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5102i implements C5225q {

    /* renamed from: e */
    public final Double f9939e;

    public C5102i(Double d) {
        if (d == null) {
            this.f9939e = Double.valueOf(Double.NaN);
        } else {
            this.f9939e = d;
        }
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        return new C5102i(this.f9939e);
    }

    /* renamed from: e */
    public final Double mo27206e() {
        return this.f9939e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5102i)) {
            return false;
        }
        return this.f9939e.equals(((C5102i) obj).f9939e);
    }

    /* renamed from: f */
    public final String mo27208f() {
        int i;
        if (Double.isNaN(this.f9939e.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f9939e.doubleValue())) {
            return this.f9939e.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f9939e.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            i = stripTrailingZeros.precision();
        } else {
            i = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(i - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    public final int hashCode() {
        return this.f9939e.hashCode();
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        boolean z = false;
        if (!Double.isNaN(this.f9939e.doubleValue()) && this.f9939e.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return null;
    }

    /* renamed from: s */
    public final C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        if ("toString".equals(str)) {
            return new C5285u(mo27208f());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo27208f(), str}));
    }

    public final String toString() {
        return mo27208f();
    }
}
