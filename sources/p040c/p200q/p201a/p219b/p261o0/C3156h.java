package p040c.p200q.p201a.p219b.p261o0;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c.q.a.b.o0.h */
/* compiled from: ColorParser */
public final class C3156h {

    /* renamed from: a */
    public static final Pattern f5832a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    public static final Pattern f5833b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    public static final Pattern f5834c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    public static final Map<String, Integer> f5835d;

    static {
        HashMap hashMap = new HashMap();
        f5835d = hashMap;
        hashMap.put("aliceblue", -984833);
        f5835d.put("antiquewhite", -332841);
        f5835d.put("aqua", -16711681);
        f5835d.put("aquamarine", -8388652);
        f5835d.put("azure", -983041);
        f5835d.put("beige", -657956);
        f5835d.put("bisque", -6972);
        f5835d.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
        f5835d.put("blanchedalmond", -5171);
        f5835d.put("blue", -16776961);
        f5835d.put("blueviolet", -7722014);
        f5835d.put("brown", -5952982);
        f5835d.put("burlywood", -2180985);
        f5835d.put("cadetblue", -10510688);
        f5835d.put("chartreuse", -8388864);
        f5835d.put("chocolate", -2987746);
        f5835d.put("coral", -32944);
        f5835d.put("cornflowerblue", -10185235);
        f5835d.put("cornsilk", -1828);
        f5835d.put("crimson", -2354116);
        f5835d.put("cyan", -16711681);
        f5835d.put("darkblue", -16777077);
        f5835d.put("darkcyan", -16741493);
        f5835d.put("darkgoldenrod", -4684277);
        f5835d.put("darkgray", -5658199);
        f5835d.put("darkgreen", -16751616);
        f5835d.put("darkgrey", -5658199);
        f5835d.put("darkkhaki", -4343957);
        f5835d.put("darkmagenta", -7667573);
        f5835d.put("darkolivegreen", -11179217);
        f5835d.put("darkorange", -29696);
        f5835d.put("darkorchid", -6737204);
        f5835d.put("darkred", -7667712);
        f5835d.put("darksalmon", -1468806);
        f5835d.put("darkseagreen", -7357297);
        f5835d.put("darkslateblue", -12042869);
        f5835d.put("darkslategray", -13676721);
        f5835d.put("darkslategrey", -13676721);
        f5835d.put("darkturquoise", -16724271);
        f5835d.put("darkviolet", -7077677);
        f5835d.put("deeppink", -60269);
        f5835d.put("deepskyblue", -16728065);
        f5835d.put("dimgray", -9868951);
        f5835d.put("dimgrey", -9868951);
        f5835d.put("dodgerblue", -14774017);
        f5835d.put("firebrick", -5103070);
        f5835d.put("floralwhite", -1296);
        f5835d.put("forestgreen", -14513374);
        f5835d.put("fuchsia", -65281);
        f5835d.put("gainsboro", -2302756);
        f5835d.put("ghostwhite", -460545);
        f5835d.put("gold", -10496);
        f5835d.put("goldenrod", -2448096);
        f5835d.put("gray", -8355712);
        f5835d.put("green", -16744448);
        f5835d.put("greenyellow", -5374161);
        f5835d.put("grey", -8355712);
        f5835d.put("honeydew", -983056);
        f5835d.put("hotpink", -38476);
        f5835d.put("indianred", -3318692);
        f5835d.put("indigo", -11861886);
        f5835d.put("ivory", -16);
        f5835d.put("khaki", -989556);
        f5835d.put("lavender", -1644806);
        f5835d.put("lavenderblush", -3851);
        f5835d.put("lawngreen", -8586240);
        f5835d.put("lemonchiffon", -1331);
        f5835d.put("lightblue", -5383962);
        f5835d.put("lightcoral", -1015680);
        f5835d.put("lightcyan", -2031617);
        f5835d.put("lightgoldenrodyellow", -329006);
        f5835d.put("lightgray", -2894893);
        f5835d.put("lightgreen", -7278960);
        f5835d.put("lightgrey", -2894893);
        f5835d.put("lightpink", -18751);
        f5835d.put("lightsalmon", -24454);
        f5835d.put("lightseagreen", -14634326);
        f5835d.put("lightskyblue", -7876870);
        f5835d.put("lightslategray", -8943463);
        f5835d.put("lightslategrey", -8943463);
        f5835d.put("lightsteelblue", -5192482);
        f5835d.put("lightyellow", -32);
        f5835d.put("lime", -16711936);
        f5835d.put("limegreen", -13447886);
        f5835d.put("linen", -331546);
        f5835d.put("magenta", -65281);
        f5835d.put("maroon", -8388608);
        f5835d.put("mediumaquamarine", -10039894);
        f5835d.put("mediumblue", -16777011);
        f5835d.put("mediumorchid", -4565549);
        f5835d.put("mediumpurple", -7114533);
        f5835d.put("mediumseagreen", -12799119);
        f5835d.put("mediumslateblue", -8689426);
        f5835d.put("mediumspringgreen", -16713062);
        f5835d.put("mediumturquoise", -12004916);
        f5835d.put("mediumvioletred", -3730043);
        f5835d.put("midnightblue", -15132304);
        f5835d.put("mintcream", -655366);
        f5835d.put("mistyrose", -6943);
        f5835d.put("moccasin", -6987);
        f5835d.put("navajowhite", -8531);
        f5835d.put("navy", -16777088);
        f5835d.put("oldlace", -133658);
        f5835d.put("olive", -8355840);
        f5835d.put("olivedrab", -9728477);
        f5835d.put("orange", -23296);
        f5835d.put("orangered", -47872);
        f5835d.put("orchid", -2461482);
        f5835d.put("palegoldenrod", -1120086);
        f5835d.put("palegreen", -6751336);
        f5835d.put("paleturquoise", -5247250);
        f5835d.put("palevioletred", -2396013);
        f5835d.put("papayawhip", -4139);
        f5835d.put("peachpuff", -9543);
        f5835d.put("peru", -3308225);
        f5835d.put("pink", -16181);
        f5835d.put("plum", -2252579);
        f5835d.put("powderblue", -5185306);
        f5835d.put("purple", -8388480);
        f5835d.put("rebeccapurple", -10079335);
        f5835d.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
        f5835d.put("rosybrown", -4419697);
        f5835d.put("royalblue", -12490271);
        f5835d.put("saddlebrown", -7650029);
        f5835d.put("salmon", -360334);
        f5835d.put("sandybrown", -744352);
        f5835d.put("seagreen", -13726889);
        f5835d.put("seashell", -2578);
        f5835d.put("sienna", -6270419);
        f5835d.put("silver", -4144960);
        f5835d.put("skyblue", -7876885);
        f5835d.put("slateblue", -9807155);
        f5835d.put("slategray", -9404272);
        f5835d.put("slategrey", -9404272);
        f5835d.put("snow", -1286);
        f5835d.put("springgreen", -16711809);
        f5835d.put("steelblue", -12156236);
        f5835d.put("tan", -2968436);
        f5835d.put("teal", -16744320);
        f5835d.put("thistle", -2572328);
        f5835d.put("tomato", -40121);
        f5835d.put("transparent", 0);
        f5835d.put("turquoise", -12525360);
        f5835d.put("violet", -1146130);
        f5835d.put("wheat", -663885);
        f5835d.put("white", -1);
        f5835d.put("whitesmoke", -657931);
        f5835d.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
        f5835d.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    public static int m7850a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: b */
    public static int m7851b(String str, boolean z) {
        int i;
        C3151e.m7753a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return -16777216 | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f5834c : f5833b).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    i = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    i = Integer.parseInt(matcher.group(4), 10);
                }
                return m7850a(i, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f5832a.matcher(replace);
            if (matcher2.matches()) {
                return m7854e(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = f5835d.get(C3152e0.m7810l0(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static int m7852c(String str) {
        return m7851b(str, true);
    }

    /* renamed from: d */
    public static int m7853d(String str) {
        return m7851b(str, false);
    }

    /* renamed from: e */
    public static int m7854e(int i, int i2, int i3) {
        return m7850a(255, i, i2, i3);
    }
}
