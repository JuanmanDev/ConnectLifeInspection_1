package p040c.p130j.p131a.p132c;

import android.graphics.Color;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.app.Person;
import androidx.core.net.MailTo;
import com.dexterous.flutterlocalnotifications.BitmapSource;
import com.dexterous.flutterlocalnotifications.NotificationStyle;
import com.dexterous.flutterlocalnotifications.RepeatInterval;
import com.dexterous.flutterlocalnotifications.SoundSource;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p040c.p130j.p131a.p132c.p133f.C2044a;
import p040c.p130j.p131a.p132c.p133f.C2045b;
import p040c.p130j.p131a.p132c.p133f.C2046c;
import p040c.p130j.p131a.p132c.p133f.C2047d;
import p040c.p130j.p131a.p132c.p133f.C2048e;
import p040c.p130j.p131a.p132c.p133f.C2049f;

/* renamed from: c.j.a.c.c */
/* compiled from: NotificationDetails */
public class C2041c {

    /* renamed from: A */
    public Boolean f1807A;

    /* renamed from: B */
    public Integer f1808B;

    /* renamed from: C */
    public Integer f1809C;

    /* renamed from: D */
    public String f1810D;

    /* renamed from: E */
    public BitmapSource f1811E;

    /* renamed from: F */
    public Boolean f1812F;

    /* renamed from: G */
    public Boolean f1813G;

    /* renamed from: H */
    public Integer f1814H;

    /* renamed from: I */
    public Integer f1815I;

    /* renamed from: J */
    public Boolean f1816J;

    /* renamed from: K */
    public NotificationChannelAction f1817K;

    /* renamed from: L */
    public Boolean f1818L;

    /* renamed from: M */
    public Integer f1819M;

    /* renamed from: N */
    public Integer f1820N;

    /* renamed from: O */
    public Integer f1821O;

    /* renamed from: P */
    public String f1822P;

    /* renamed from: Q */
    public Integer f1823Q;

    /* renamed from: R */
    public Boolean f1824R;

    /* renamed from: S */
    public Long f1825S;

    /* renamed from: T */
    public String f1826T;

    /* renamed from: U */
    public int[] f1827U;

    /* renamed from: V */
    public Boolean f1828V;

    /* renamed from: W */
    public Long f1829W;

    /* renamed from: X */
    public Integer f1830X;

    /* renamed from: a */
    public Integer f1831a;

    /* renamed from: b */
    public String f1832b;

    /* renamed from: c */
    public String f1833c;

    /* renamed from: d */
    public String f1834d;

    /* renamed from: e */
    public String f1835e = "Default_Channel_Id";

    /* renamed from: f */
    public String f1836f;

    /* renamed from: g */
    public String f1837g;

    /* renamed from: h */
    public Boolean f1838h;

    /* renamed from: i */
    public Integer f1839i;

    /* renamed from: j */
    public Integer f1840j;

    /* renamed from: k */
    public Boolean f1841k;

    /* renamed from: l */
    public String f1842l;

    /* renamed from: m */
    public SoundSource f1843m;

    /* renamed from: n */
    public Boolean f1844n;

    /* renamed from: o */
    public long[] f1845o;

    /* renamed from: p */
    public NotificationStyle f1846p;

    /* renamed from: q */
    public C2049f f1847q;

    /* renamed from: r */
    public RepeatInterval f1848r;

    /* renamed from: s */
    public C2043e f1849s;

    /* renamed from: t */
    public Long f1850t;

    /* renamed from: u */
    public Long f1851u;

    /* renamed from: v */
    public String f1852v;

    /* renamed from: w */
    public String f1853w;

    /* renamed from: x */
    public Boolean f1854x;

    /* renamed from: y */
    public Integer f1855y;

    /* renamed from: z */
    public Boolean f1856z;

    /* renamed from: a */
    public static C2041c m2833a(Map<String, Object> map) {
        C2041c cVar = new C2041c();
        cVar.f1852v = (String) map.get("payload");
        cVar.f1831a = (Integer) map.get("id");
        cVar.f1832b = (String) map.get(NotificationCompatJellybean.KEY_TITLE);
        cVar.f1833c = (String) map.get(MailTo.BODY);
        if (map.containsKey("millisecondsSinceEpoch")) {
            cVar.f1850t = (Long) map.get("millisecondsSinceEpoch");
        }
        if (map.containsKey("calledAt")) {
            cVar.f1851u = (Long) map.get("calledAt");
        }
        if (map.containsKey("repeatInterval")) {
            cVar.f1848r = RepeatInterval.values()[((Integer) map.get("repeatInterval")).intValue()];
        }
        if (map.containsKey("repeatTime")) {
            cVar.f1849s = C2043e.m2851a((Map) map.get("repeatTime"));
        }
        if (map.containsKey("day")) {
            cVar.f1808B = (Integer) map.get("day");
        }
        m2847o(map, cVar);
        return cVar;
    }

    /* renamed from: b */
    public static C2046c m2834b(Map<String, Object> map) {
        return new C2046c((Boolean) map.get("htmlFormatTitle"), (Boolean) map.get("htmlFormatContent"));
    }

    /* renamed from: c */
    public static Long m2835c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    /* renamed from: d */
    public static void m2836d(C2041c cVar, Map<String, Object> map, C2046c cVar2) {
        cVar.f1847q = new C2044a(cVar2.f1882a, cVar2.f1883b, (String) map.get("contentTitle"), (Boolean) map.get("htmlFormatContentTitle"), (String) map.get("summaryText"), (Boolean) map.get("htmlFormatSummaryText"), (String) map.get("largeIcon"), map.containsKey("largeIconBitmapSource") ? BitmapSource.values()[((Integer) map.get("largeIconBitmapSource")).intValue()] : null, (String) map.get("bigPicture"), BitmapSource.values()[((Integer) map.get("bigPictureBitmapSource")).intValue()], (Boolean) map.get("hideExpandedLargeIcon"));
    }

    /* renamed from: e */
    public static void m2837e(C2041c cVar, Map<String, Object> map, C2046c cVar2) {
        cVar.f1847q = new C2045b(cVar2.f1882a, cVar2.f1883b, (String) map.get("bigText"), (Boolean) map.get("htmlFormatBigText"), (String) map.get("contentTitle"), (Boolean) map.get("htmlFormatContentTitle"), (String) map.get("summaryText"), (Boolean) map.get("htmlFormatSummaryText"));
    }

    /* renamed from: f */
    public static void m2838f(C2041c cVar, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.f1835e = (String) map.get("channelId");
            cVar.f1836f = (String) map.get("channelName");
            cVar.f1837g = (String) map.get("channelDescription");
            cVar.f1839i = (Integer) map.get("importance");
            cVar.f1838h = (Boolean) map.get("channelShowBadge");
            cVar.f1817K = NotificationChannelAction.values()[((Integer) map.get("channelAction")).intValue()];
        }
    }

    /* renamed from: g */
    public static void m2839g(C2041c cVar, Map<String, Object> map) {
        Integer num = (Integer) map.get("colorAlpha");
        Integer num2 = (Integer) map.get("colorRed");
        Integer num3 = (Integer) map.get("colorGreen");
        Integer num4 = (Integer) map.get("colorBlue");
        if (num != null && num2 != null && num3 != null && num4 != null) {
            cVar.f1809C = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
    }

    /* renamed from: h */
    public static void m2840h(C2041c cVar, Map<String, Object> map) {
        cVar.f1853w = (String) map.get("groupKey");
        cVar.f1854x = (Boolean) map.get("setAsGroupSummary");
        cVar.f1855y = (Integer) map.get("groupAlertBehavior");
    }

    /* renamed from: i */
    public static void m2841i(C2041c cVar, Map<String, Object> map, C2046c cVar2) {
        cVar.f1847q = new C2047d(cVar2.f1882a, cVar2.f1883b, (String) map.get("contentTitle"), (Boolean) map.get("htmlFormatContentTitle"), (String) map.get("summaryText"), (Boolean) map.get("htmlFormatSummaryText"), (ArrayList) map.get("lines"), (Boolean) map.get("htmlFormatLines"));
    }

    /* renamed from: j */
    public static void m2842j(C2041c cVar, Map<String, Object> map) {
        Integer num;
        cVar.f1810D = (String) map.get("largeIcon");
        if (map.containsKey("largeIconBitmapSource") && (num = (Integer) map.get("largeIconBitmapSource")) != null) {
            cVar.f1811E = BitmapSource.values()[num.intValue()];
        }
    }

    /* renamed from: k */
    public static void m2843k(C2041c cVar, Map<String, Object> map) {
        Integer num = (Integer) map.get("ledColorAlpha");
        Integer num2 = (Integer) map.get("ledColorRed");
        Integer num3 = (Integer) map.get("ledColorGreen");
        Integer num4 = (Integer) map.get("ledColorBlue");
        if (!(num == null || num2 == null || num3 == null || num4 == null)) {
            cVar.f1819M = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        cVar.f1818L = (Boolean) map.get("enableLights");
        cVar.f1820N = (Integer) map.get("ledOnMs");
        cVar.f1821O = (Integer) map.get("ledOffMs");
    }

    /* renamed from: l */
    public static ArrayList<C2039a> m2844l(ArrayList<Map<String, Object>> arrayList) {
        ArrayList<C2039a> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<Map<String, Object>> it = arrayList.iterator();
            while (it.hasNext()) {
                Map next = it.next();
                arrayList2.add(new C2039a((String) next.get("text"), (Long) next.get(NotificationCompat.CarExtender.KEY_TIMESTAMP), m2846n((Map) next.get(NotificationCompat.MessagingStyle.Message.KEY_PERSON)), (String) next.get("dataMimeType"), (String) next.get("dataUri")));
            }
        }
        return arrayList2;
    }

    /* renamed from: m */
    public static void m2845m(C2041c cVar, Map<String, Object> map, C2046c cVar2) {
        cVar.f1847q = new C2048e(m2846n((Map) map.get(NotificationCompat.MessagingStyle.Message.KEY_PERSON)), (String) map.get("conversationTitle"), (Boolean) map.get("groupConversation"), m2844l((ArrayList) map.get(NotificationCompat.CarExtender.KEY_MESSAGES)), cVar2.f1882a, cVar2.f1883b);
    }

    /* renamed from: n */
    public static C2042d m2846n(Map<String, Object> map) {
        IconSource iconSource = null;
        if (map == null) {
            return null;
        }
        Boolean bool = (Boolean) map.get("bot");
        String str = (String) map.get("icon");
        Integer num = (Integer) map.get("iconSource");
        if (num != null) {
            iconSource = IconSource.values()[num.intValue()];
        }
        return new C2042d(bool, str, iconSource, (Boolean) map.get("important"), (String) map.get(Person.KEY_KEY), (String) map.get("name"), (String) map.get("uri"));
    }

    /* renamed from: o */
    public static void m2847o(Map<String, Object> map, C2041c cVar) {
        Map map2 = (Map) map.get("platformSpecifics");
        if (map2 != null) {
            cVar.f1856z = (Boolean) map2.get("autoCancel");
            cVar.f1807A = (Boolean) map2.get("ongoing");
            cVar.f1846p = NotificationStyle.values()[((Integer) map2.get("style")).intValue()];
            m2850r(cVar, map2);
            cVar.f1834d = (String) map2.get("icon");
            cVar.f1840j = (Integer) map2.get("priority");
            m2849q(cVar, map2);
            cVar.f1844n = (Boolean) map2.get("enableVibration");
            cVar.f1845o = (long[]) map2.get("vibrationPattern");
            m2840h(cVar, map2);
            cVar.f1812F = (Boolean) map2.get("onlyAlertOnce");
            cVar.f1828V = (Boolean) map2.get("showWhen");
            cVar.f1829W = m2835c(map2.get("when"));
            m2848p(cVar, map2);
            m2839g(cVar, map2);
            m2838f(cVar, map2);
            m2843k(cVar, map2);
            m2842j(cVar, map2);
            cVar.f1822P = (String) map2.get("ticker");
            cVar.f1823Q = (Integer) map2.get("visibility");
            cVar.f1824R = (Boolean) map2.get("allowWhileIdle");
            cVar.f1825S = m2835c(map2.get("timeoutAfter"));
            cVar.f1826T = (String) map2.get("category");
            cVar.f1827U = (int[]) map2.get("additionalFlags");
        }
    }

    /* renamed from: p */
    public static void m2848p(C2041c cVar, Map<String, Object> map) {
        cVar.f1813G = (Boolean) map.get("showProgress");
        if (map.containsKey("maxProgress")) {
            cVar.f1814H = (Integer) map.get("maxProgress");
        }
        if (map.containsKey(NotificationCompat.CATEGORY_PROGRESS)) {
            cVar.f1815I = (Integer) map.get(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (map.containsKey("indeterminate")) {
            cVar.f1816J = (Boolean) map.get("indeterminate");
        }
    }

    /* renamed from: q */
    public static void m2849q(C2041c cVar, Map<String, Object> map) {
        cVar.f1841k = (Boolean) map.get("playSound");
        cVar.f1842l = (String) map.get("sound");
        Integer num = (Integer) map.get("soundSource");
        if (num != null) {
            cVar.f1843m = SoundSource.values()[num.intValue()];
        }
    }

    /* renamed from: r */
    public static void m2850r(C2041c cVar, Map<String, Object> map) {
        Map map2 = (Map) map.get("styleInformation");
        C2046c b = m2834b(map2);
        NotificationStyle notificationStyle = cVar.f1846p;
        if (notificationStyle == NotificationStyle.Default) {
            cVar.f1847q = b;
        } else if (notificationStyle == NotificationStyle.BigPicture) {
            m2836d(cVar, map2, b);
        } else if (notificationStyle == NotificationStyle.BigText) {
            m2837e(cVar, map2, b);
        } else if (notificationStyle == NotificationStyle.Inbox) {
            m2841i(cVar, map2, b);
        } else if (notificationStyle == NotificationStyle.Messaging) {
            m2845m(cVar, map2, b);
        } else if (notificationStyle == NotificationStyle.Media) {
            cVar.f1847q = b;
        }
    }
}
