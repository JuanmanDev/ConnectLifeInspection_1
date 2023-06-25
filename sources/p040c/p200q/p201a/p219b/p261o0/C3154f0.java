package p040c.p200q.p201a.p219b.p261o0;

import androidx.annotation.Nullable;
import org.xmlpull.p703v1.XmlPullParser;

/* renamed from: c.q.a.b.o0.f0 */
/* compiled from: XmlPullParserUtil */
public final class C3154f0 {
    @Nullable
    /* renamed from: a */
    public static String m7830a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static String m7831b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m7837h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m7832c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m7833d(XmlPullParser xmlPullParser, String str) {
        return m7832c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m7834e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m7835f(XmlPullParser xmlPullParser, String str) {
        return m7834e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m7836g(XmlPullParser xmlPullParser, String str) {
        return m7834e(xmlPullParser) && m7837h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    public static String m7837h(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
