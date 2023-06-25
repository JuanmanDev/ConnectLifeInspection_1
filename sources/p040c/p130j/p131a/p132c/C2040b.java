package p040c.p130j.p131a.p132c;

import android.graphics.Color;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.dexterous.flutterlocalnotifications.SoundSource;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import java.util.Map;

/* renamed from: c.j.a.c.b */
/* compiled from: NotificationChannelDetails */
public class C2040b {

    /* renamed from: a */
    public String f1794a;

    /* renamed from: b */
    public String f1795b;

    /* renamed from: c */
    public String f1796c;

    /* renamed from: d */
    public Boolean f1797d;

    /* renamed from: e */
    public Integer f1798e;

    /* renamed from: f */
    public Boolean f1799f;

    /* renamed from: g */
    public String f1800g;

    /* renamed from: h */
    public SoundSource f1801h;

    /* renamed from: i */
    public Boolean f1802i;

    /* renamed from: j */
    public long[] f1803j;

    /* renamed from: k */
    public NotificationChannelAction f1804k;

    /* renamed from: l */
    public Boolean f1805l;

    /* renamed from: m */
    public Integer f1806m;

    /* renamed from: a */
    public static C2040b m2831a(Map<String, Object> map) {
        C2040b bVar = new C2040b();
        bVar.f1794a = (String) map.get("id");
        bVar.f1795b = (String) map.get("name");
        bVar.f1796c = (String) map.get(BundleJUnitUtils.KEY_DESCRIPTION);
        bVar.f1798e = (Integer) map.get("importance");
        bVar.f1797d = (Boolean) map.get("showBadge");
        bVar.f1804k = NotificationChannelAction.values()[((Integer) map.get("channelAction")).intValue()];
        bVar.f1802i = (Boolean) map.get("enableVibration");
        bVar.f1803j = (long[]) map.get("vibrationPattern");
        bVar.f1799f = (Boolean) map.get("playSound");
        bVar.f1800g = (String) map.get("sound");
        Integer num = (Integer) map.get("soundSource");
        if (num != null) {
            bVar.f1801h = SoundSource.values()[num.intValue()];
        }
        Integer num2 = (Integer) map.get("ledColorAlpha");
        Integer num3 = (Integer) map.get("ledColorRed");
        Integer num4 = (Integer) map.get("ledColorGreen");
        Integer num5 = (Integer) map.get("ledColorBlue");
        if (!(num2 == null || num3 == null || num4 == null || num5 == null)) {
            bVar.f1806m = Integer.valueOf(Color.argb(num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue()));
        }
        bVar.f1805l = (Boolean) map.get("enableLights");
        return bVar;
    }

    /* renamed from: b */
    public static C2040b m2832b(C2041c cVar) {
        C2040b bVar = new C2040b();
        bVar.f1794a = cVar.f1835e;
        bVar.f1795b = cVar.f1836f;
        bVar.f1796c = cVar.f1837g;
        bVar.f1798e = cVar.f1839i;
        bVar.f1797d = cVar.f1838h;
        NotificationChannelAction notificationChannelAction = cVar.f1817K;
        if (notificationChannelAction == null) {
            bVar.f1804k = NotificationChannelAction.CreateIfNotExists;
        } else {
            bVar.f1804k = notificationChannelAction;
        }
        bVar.f1802i = cVar.f1844n;
        bVar.f1803j = cVar.f1845o;
        bVar.f1799f = cVar.f1841k;
        bVar.f1800g = cVar.f1842l;
        bVar.f1801h = cVar.f1843m;
        bVar.f1806m = cVar.f1819M;
        bVar.f1805l = cVar.f1818L;
        return bVar;
    }
}
