package p040c.p130j.p131a;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.core.app.AlarmManagerCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.MailTo;
import androidx.media.app.NotificationCompat;
import com.dexterous.flutterlocalnotifications.BitmapSource;
import com.dexterous.flutterlocalnotifications.NotificationStyle;
import com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver;
import com.dexterous.flutterlocalnotifications.SoundSource;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.p700ws.RealWebSocket;
import p040c.p130j.p131a.p132c.C2039a;
import p040c.p130j.p131a.p132c.C2040b;
import p040c.p130j.p131a.p132c.C2041c;
import p040c.p130j.p131a.p132c.C2042d;
import p040c.p130j.p131a.p132c.p133f.C2044a;
import p040c.p130j.p131a.p132c.p133f.C2045b;
import p040c.p130j.p131a.p132c.p133f.C2046c;
import p040c.p130j.p131a.p132c.p133f.C2047d;
import p040c.p130j.p131a.p132c.p133f.C2048e;
import p040c.p130j.p131a.p132c.p133f.C2049f;
import p040c.p130j.p131a.p134d.C2050a;
import p040c.p130j.p131a.p134d.C2051b;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p589h.C9172c;

/* renamed from: c.j.a.a */
/* compiled from: FlutterLocalNotificationsPlugin */
public class C2034a implements C9017j.C9021c, C9024l.C9026b, C8944a, C8948a {

    /* renamed from: o */
    public static String f1770o = "notification_id";

    /* renamed from: p */
    public static String f1771p = "notification";

    /* renamed from: q */
    public static String f1772q = "notificationDetails";

    /* renamed from: r */
    public static String f1773r = "repeat";

    /* renamed from: s */
    public static Gson f1774s;

    /* renamed from: e */
    public C9017j f1775e;

    /* renamed from: l */
    public Context f1776l;

    /* renamed from: m */
    public Activity f1777m;

    /* renamed from: n */
    public boolean f1778n;

    /* renamed from: c.j.a.a$a */
    /* compiled from: FlutterLocalNotificationsPlugin */
    public class C2035a extends TypeToken<ArrayList<C2041c>> {
    }

    /* renamed from: c.j.a.a$b */
    /* compiled from: FlutterLocalNotificationsPlugin */
    public static /* synthetic */ class C2036b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1779a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1780b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f1781c;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0092 */
        static {
            /*
                com.dexterous.flutterlocalnotifications.NotificationStyle[] r0 = com.dexterous.flutterlocalnotifications.NotificationStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1781c = r0
                r1 = 1
                com.dexterous.flutterlocalnotifications.NotificationStyle r2 = com.dexterous.flutterlocalnotifications.NotificationStyle.BigPicture     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1781c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.dexterous.flutterlocalnotifications.NotificationStyle r3 = com.dexterous.flutterlocalnotifications.NotificationStyle.BigText     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1781c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.dexterous.flutterlocalnotifications.NotificationStyle r4 = com.dexterous.flutterlocalnotifications.NotificationStyle.Inbox     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f1781c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.dexterous.flutterlocalnotifications.NotificationStyle r5 = com.dexterous.flutterlocalnotifications.NotificationStyle.Messaging     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f1781c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.dexterous.flutterlocalnotifications.NotificationStyle r5 = com.dexterous.flutterlocalnotifications.NotificationStyle.Media     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.dexterous.flutterlocalnotifications.models.IconSource[] r4 = com.dexterous.flutterlocalnotifications.models.IconSource.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f1780b = r4
                com.dexterous.flutterlocalnotifications.models.IconSource r5 = com.dexterous.flutterlocalnotifications.models.IconSource.DrawableResource     // Catch:{ NoSuchFieldError -> 0x004f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r4 = f1780b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.dexterous.flutterlocalnotifications.models.IconSource r5 = com.dexterous.flutterlocalnotifications.models.IconSource.BitmapFilePath     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r4 = f1780b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.dexterous.flutterlocalnotifications.models.IconSource r5 = com.dexterous.flutterlocalnotifications.models.IconSource.ContentUri     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r4 = f1780b     // Catch:{ NoSuchFieldError -> 0x006d }
                com.dexterous.flutterlocalnotifications.models.IconSource r5 = com.dexterous.flutterlocalnotifications.models.IconSource.FlutterBitmapAsset     // Catch:{ NoSuchFieldError -> 0x006d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                com.dexterous.flutterlocalnotifications.RepeatInterval[] r4 = com.dexterous.flutterlocalnotifications.RepeatInterval.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f1779a = r4
                com.dexterous.flutterlocalnotifications.RepeatInterval r5 = com.dexterous.flutterlocalnotifications.RepeatInterval.EveryMinute     // Catch:{ NoSuchFieldError -> 0x007e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r1 = f1779a     // Catch:{ NoSuchFieldError -> 0x0088 }
                com.dexterous.flutterlocalnotifications.RepeatInterval r4 = com.dexterous.flutterlocalnotifications.RepeatInterval.Hourly     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = f1779a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.dexterous.flutterlocalnotifications.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.RepeatInterval.Daily     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f1779a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.dexterous.flutterlocalnotifications.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.RepeatInterval.Weekly     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p130j.p131a.C2034a.C2036b.<clinit>():void");
        }
    }

    /* renamed from: A */
    public static boolean m2768A(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    /* renamed from: B */
    public static ArrayList<C2041c> m2769B(Context context) {
        ArrayList<C2041c> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences("scheduled_notifications", 0).getString("scheduled_notifications", (String) null);
        return string != null ? (ArrayList) m2791b().fromJson(string, new C2035a().getType()) : arrayList;
    }

    /* renamed from: E */
    public static void m2770E(Integer num, Context context) {
        ArrayList<C2041c> B = m2769B(context);
        Iterator<C2041c> it = B.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f1831a.equals(num)) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        m2775K(context, B);
    }

    /* renamed from: G */
    public static void m2771G(Context context, C2041c cVar, Boolean bool) {
        String json = m2791b().toJson((Object) cVar);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(f1772q, json);
        intent.putExtra(f1773r, true);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, cVar.f1831a.intValue(), intent, 134217728);
        AlarmManager m = m2799m(context);
        int i = C2036b.f1779a[cVar.f1848r.ordinal()];
        long j = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 604800000 : 86400000 : 3600000 : RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        long longValue = cVar.f1851u.longValue();
        if (cVar.f1849s != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, cVar.f1849s.f1864a.intValue());
            instance.set(12, cVar.f1849s.f1865b.intValue());
            instance.set(13, cVar.f1849s.f1866c.intValue());
            Integer num = cVar.f1808B;
            if (num != null) {
                instance.set(7, num.intValue());
            }
            longValue = instance.getTimeInMillis();
        }
        long j2 = longValue;
        while (j2 < System.currentTimeMillis()) {
            j2 += j;
        }
        m.setInexactRepeating(0, j2, j, broadcast);
        if (bool.booleanValue()) {
            m2774J(context, cVar);
        }
    }

    /* renamed from: H */
    public static void m2772H(Context context) {
        Iterator<C2041c> it = m2769B(context).iterator();
        while (it.hasNext()) {
            C2041c next = it.next();
            if (next.f1848r == null) {
                m2776M(context, next, Boolean.FALSE);
            } else {
                m2771G(context, next, Boolean.FALSE);
            }
        }
    }

    /* renamed from: I */
    public static Uri m2773I(Context context, String str, SoundSource soundSource) {
        if (C2051b.m2853a(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource == null || soundSource == SoundSource.RawResource) {
            int identifier = context.getResources().getIdentifier(str, "raw", context.getPackageName());
            return Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
        } else if (soundSource == SoundSource.Uri) {
            return Uri.parse(str);
        } else {
            return null;
        }
    }

    /* renamed from: J */
    public static void m2774J(Context context, C2041c cVar) {
        ArrayList<C2041c> B = m2769B(context);
        ArrayList arrayList = new ArrayList();
        Iterator<C2041c> it = B.iterator();
        while (it.hasNext()) {
            C2041c next = it.next();
            if (next.f1831a != cVar.f1831a) {
                arrayList.add(next);
            }
        }
        arrayList.add(cVar);
        m2775K(context, arrayList);
    }

    /* renamed from: K */
    public static void m2775K(Context context, ArrayList<C2041c> arrayList) {
        String json = m2791b().toJson((Object) arrayList);
        SharedPreferences.Editor edit = context.getSharedPreferences("scheduled_notifications", 0).edit();
        edit.putString("scheduled_notifications", json);
        edit.commit();
    }

    /* renamed from: M */
    public static void m2776M(Context context, C2041c cVar, Boolean bool) {
        String json = m2791b().toJson((Object) cVar);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(f1772q, json);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, cVar.f1831a.intValue(), intent, 134217728);
        AlarmManager m = m2799m(context);
        if (C2050a.m2852a(cVar.f1824R)) {
            AlarmManagerCompat.setExactAndAllowWhileIdle(m, 0, cVar.f1850t.longValue(), broadcast);
        } else {
            AlarmManagerCompat.setExact(m, 0, cVar.f1850t.longValue(), broadcast);
        }
        if (bool.booleanValue()) {
            m2774J(context, cVar);
        }
    }

    /* renamed from: O */
    public static void m2777O(Context context, C2041c cVar, NotificationCompat.Builder builder) {
        C2044a aVar = (C2044a) cVar.f1847q;
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        if (aVar.f1867c != null) {
            bigPictureStyle.setBigContentTitle(aVar.f1868d.booleanValue() ? m2798l(aVar.f1867c) : aVar.f1867c);
        }
        if (aVar.f1869e != null) {
            bigPictureStyle.setSummaryText(aVar.f1870f.booleanValue() ? m2798l(aVar.f1869e) : aVar.f1869e);
        }
        if (aVar.f1875k.booleanValue()) {
            bigPictureStyle.bigLargeIcon((Bitmap) null);
        } else {
            String str = aVar.f1871g;
            if (str != null) {
                bigPictureStyle.bigLargeIcon(m2800n(context, str, aVar.f1872h));
            }
        }
        bigPictureStyle.bigPicture(m2800n(context, aVar.f1873i, aVar.f1874j));
        builder.setStyle(bigPictureStyle);
    }

    /* renamed from: P */
    public static void m2778P(C2041c cVar, NotificationCompat.Builder builder) {
        C2045b bVar = (C2045b) cVar.f1847q;
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        if (bVar.f1876c != null) {
            bigTextStyle.bigText(bVar.f1877d.booleanValue() ? m2798l(bVar.f1876c) : bVar.f1876c);
        }
        if (bVar.f1878e != null) {
            bigTextStyle.setBigContentTitle(bVar.f1879f.booleanValue() ? m2798l(bVar.f1878e) : bVar.f1878e);
        }
        if (bVar.f1880g != null) {
            boolean booleanValue = bVar.f1881h.booleanValue();
            String str = bVar.f1880g;
            CharSequence charSequence = str;
            if (booleanValue) {
                charSequence = m2798l(str);
            }
            bigTextStyle.setSummaryText(charSequence);
        }
        builder.setStyle(bigTextStyle);
    }

    /* renamed from: Q */
    public static void m2779Q(C2041c cVar, NotificationCompat.Builder builder) {
        String str = cVar.f1826T;
        if (str != null) {
            builder.setCategory(str);
        }
    }

    /* renamed from: R */
    public static void m2780R(C2041c cVar, NotificationCompat.Builder builder) {
        C2047d dVar = (C2047d) cVar.f1847q;
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        if (dVar.f1886e != null) {
            inboxStyle.setBigContentTitle(dVar.f1887f.booleanValue() ? m2798l(dVar.f1886e) : dVar.f1886e);
        }
        if (dVar.f1888g != null) {
            inboxStyle.setSummaryText(dVar.f1889h.booleanValue() ? m2798l(dVar.f1888g) : dVar.f1888g);
        }
        ArrayList<String> arrayList = dVar.f1885d;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                inboxStyle.addLine(dVar.f1884c.booleanValue() ? m2798l(next) : next);
            }
        }
        builder.setStyle(inboxStyle);
    }

    /* renamed from: S */
    public static void m2781S(C2041c cVar, NotificationCompat.Builder builder) {
        if (C2050a.m2852a(cVar.f1818L) && cVar.f1820N != null && cVar.f1821O != null) {
            builder.setLights(cVar.f1819M.intValue(), cVar.f1820N.intValue(), cVar.f1821O.intValue());
        }
    }

    /* renamed from: T */
    public static void m2782T(NotificationCompat.Builder builder) {
        builder.setStyle(new NotificationCompat.MediaStyle());
    }

    /* renamed from: U */
    public static void m2783U(Context context, C2041c cVar, NotificationCompat.Builder builder) {
        C2048e eVar = (C2048e) cVar.f1847q;
        NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(m2793c(context, eVar.f1890c));
        messagingStyle.setGroupConversation(C2050a.m2852a(eVar.f1892e));
        String str = eVar.f1891d;
        if (str != null) {
            messagingStyle.setConversationTitle(str);
        }
        ArrayList<C2039a> arrayList = eVar.f1893f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C2039a> it = eVar.f1893f.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(m2796g(context, it.next()));
            }
        }
        builder.setStyle(messagingStyle);
    }

    /* renamed from: V */
    public static void m2784V(C2041c cVar, NotificationCompat.Builder builder) {
        if (C2050a.m2852a(cVar.f1813G)) {
            builder.setProgress(cVar.f1814H.intValue(), cVar.f1815I.intValue(), cVar.f1816J.booleanValue());
        }
    }

    /* renamed from: W */
    public static void m2785W(Context context, C2041c cVar, NotificationCompat.Builder builder) {
        if (!C2051b.m2853a(cVar.f1834d).booleanValue()) {
            builder.setSmallIcon(m2801o(context, cVar.f1834d));
            return;
        }
        String string = context.getSharedPreferences("notification_plugin_cache", 0).getString("defaultIcon", (String) null);
        if (C2051b.m2853a(string).booleanValue()) {
            builder.setSmallIcon(cVar.f1830X.intValue());
        } else {
            builder.setSmallIcon(m2801o(context, string));
        }
    }

    /* renamed from: X */
    public static void m2786X(Context context, C2041c cVar, NotificationCompat.Builder builder) {
        if (C2050a.m2852a(cVar.f1841k)) {
            builder.setSound(m2773I(context, cVar.f1842l, cVar.f1843m));
        } else {
            builder.setSound((Uri) null);
        }
    }

    /* renamed from: Y */
    public static void m2787Y(Context context, C2041c cVar, NotificationCompat.Builder builder) {
        int i = C2036b.f1781c[cVar.f1846p.ordinal()];
        if (i == 1) {
            m2777O(context, cVar, builder);
        } else if (i == 2) {
            m2778P(cVar, builder);
        } else if (i == 3) {
            m2780R(cVar, builder);
        } else if (i == 4) {
            m2783U(context, cVar, builder);
        } else if (i == 5) {
            m2782T(builder);
        }
    }

    /* renamed from: Z */
    public static void m2788Z(C2041c cVar, NotificationCompat.Builder builder) {
        Long l = cVar.f1825S;
        if (l != null) {
            builder.setTimeoutAfter(l.longValue());
        }
    }

    /* renamed from: a */
    public static void m2789a(C2041c cVar, NotificationCompat.Builder builder) {
        boolean z;
        if (!C2051b.m2853a(cVar.f1853w).booleanValue()) {
            builder.setGroup(cVar.f1853w);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C2050a.m2852a(cVar.f1854x)) {
                builder.setGroupSummary(true);
            }
            builder.setGroupAlertBehavior(cVar.f1855y.intValue());
        }
    }

    /* renamed from: a0 */
    public static void m2790a0(C2041c cVar, NotificationCompat.Builder builder) {
        if (C2050a.m2852a(cVar.f1844n)) {
            long[] jArr = cVar.f1845o;
            if (jArr != null && jArr.length > 0) {
                builder.setVibrate(jArr);
                return;
            }
            return;
        }
        builder.setVibrate(new long[]{0});
    }

    @NonNull
    /* renamed from: b */
    public static Gson m2791b() {
        if (f1774s == null) {
            C2037b<C2049f> d = C2037b.m2828d(C2049f.class);
            d.mo16669e(C2046c.class);
            d.mo16669e(C2045b.class);
            d.mo16669e(C2044a.class);
            d.mo16669e(C2047d.class);
            d.mo16669e(C2048e.class);
            f1774s = new GsonBuilder().registerTypeAdapterFactory(d).create();
        }
        return f1774s;
    }

    /* renamed from: b0 */
    public static void m2792b0(C2041c cVar, NotificationCompat.Builder builder) {
        Integer num = cVar.f1823Q;
        if (num != null) {
            int intValue = num.intValue();
            int i = 1;
            if (intValue == 0) {
                i = 0;
            } else if (intValue != 1) {
                if (intValue == 2) {
                    i = -1;
                } else {
                    throw new IllegalArgumentException("Unknown index: " + cVar.f1823Q);
                }
            }
            builder.setVisibility(i);
        }
    }

    /* renamed from: c */
    public static Person m2793c(Context context, C2042d dVar) {
        IconSource iconSource;
        if (dVar == null) {
            return null;
        }
        Person.Builder builder = new Person.Builder();
        builder.setBot(C2050a.m2852a(dVar.f1857a));
        String str = dVar.f1858b;
        if (!(str == null || (iconSource = dVar.f1859c) == null)) {
            builder.setIcon(m2802p(context, str, iconSource));
        }
        builder.setImportant(C2050a.m2852a(dVar.f1860d));
        String str2 = dVar.f1861e;
        if (str2 != null) {
            builder.setKey(str2);
        }
        String str3 = dVar.f1862f;
        if (str3 != null) {
            builder.setName(str3);
        }
        String str4 = dVar.f1863g;
        if (str4 != null) {
            builder.setUri(str4);
        }
        return builder.build();
    }

    /* renamed from: c0 */
    public static void m2794c0(Context context, C2040b bVar) {
        Integer num;
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(bVar.f1794a);
            if ((notificationChannel == null && ((notificationChannelAction = bVar.f1804k) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && bVar.f1804k == NotificationChannelAction.Update)) {
                NotificationChannel notificationChannel2 = new NotificationChannel(bVar.f1794a, bVar.f1795b, bVar.f1798e.intValue());
                notificationChannel2.setDescription(bVar.f1796c);
                if (bVar.f1799f.booleanValue()) {
                    notificationChannel2.setSound(m2773I(context, bVar.f1800g, bVar.f1801h), new AudioAttributes.Builder().setUsage(5).build());
                } else {
                    notificationChannel2.setSound((Uri) null, (AudioAttributes) null);
                }
                notificationChannel2.enableVibration(C2050a.m2852a(bVar.f1802i));
                long[] jArr = bVar.f1803j;
                if (jArr != null && jArr.length > 0) {
                    notificationChannel2.setVibrationPattern(jArr);
                }
                boolean a = C2050a.m2852a(bVar.f1805l);
                notificationChannel2.enableLights(a);
                if (a && (num = bVar.f1806m) != null) {
                    notificationChannel2.setLightColor(num.intValue());
                }
                notificationChannel2.setShowBadge(C2050a.m2852a(bVar.f1797d));
                notificationManager.createNotificationChannel(notificationChannel2);
            }
        }
    }

    /* renamed from: e0 */
    public static void m2795e0(Context context, C2041c cVar) {
        m2804s(context).notify(cVar.f1831a.intValue(), m2797h(context, cVar));
    }

    /* renamed from: g */
    public static NotificationCompat.MessagingStyle.Message m2796g(Context context, C2039a aVar) {
        String str;
        NotificationCompat.MessagingStyle.Message message = new NotificationCompat.MessagingStyle.Message((CharSequence) aVar.f1789a, aVar.f1790b.longValue(), m2793c(context, aVar.f1791c));
        String str2 = aVar.f1793e;
        if (!(str2 == null || (str = aVar.f1792d) == null)) {
            message.setData(str, Uri.parse(str2));
        }
        return message;
    }

    /* renamed from: h */
    public static Notification m2797h(Context context, C2041c cVar) {
        m2794c0(context, C2040b.m2832b(cVar));
        Intent intent = new Intent(context, m2803q(context));
        intent.setAction("SELECT_NOTIFICATION");
        intent.putExtra("payload", cVar.f1852v);
        PendingIntent activity = PendingIntent.getActivity(context, cVar.f1831a.intValue(), intent, 134217728);
        C2046c cVar2 = (C2046c) cVar.f1847q;
        NotificationCompat.Builder onlyAlertOnce = new NotificationCompat.Builder(context, cVar.f1835e).setContentTitle(cVar2.f1882a.booleanValue() ? m2798l(cVar.f1832b) : cVar.f1832b).setContentText(cVar2.f1883b.booleanValue() ? m2798l(cVar.f1833c) : cVar.f1833c).setTicker(cVar.f1822P).setAutoCancel(C2050a.m2852a(cVar.f1856z)).setContentIntent(activity).setPriority(cVar.f1840j.intValue()).setOngoing(C2050a.m2852a(cVar.f1807A)).setOnlyAlertOnce(C2050a.m2852a(cVar.f1812F));
        m2785W(context, cVar, onlyAlertOnce);
        if (!C2051b.m2853a(cVar.f1810D).booleanValue()) {
            onlyAlertOnce.setLargeIcon(m2800n(context, cVar.f1810D, cVar.f1811E));
        }
        Integer num = cVar.f1809C;
        if (num != null) {
            onlyAlertOnce.setColor(num.intValue());
        }
        Boolean bool = cVar.f1828V;
        if (bool != null) {
            onlyAlertOnce.setShowWhen(C2050a.m2852a(bool));
        }
        Long l = cVar.f1829W;
        if (l != null) {
            onlyAlertOnce.setWhen(l.longValue());
        }
        m2792b0(cVar, onlyAlertOnce);
        m2789a(cVar, onlyAlertOnce);
        m2786X(context, cVar, onlyAlertOnce);
        m2790a0(cVar, onlyAlertOnce);
        m2781S(cVar, onlyAlertOnce);
        m2787Y(context, cVar, onlyAlertOnce);
        m2784V(cVar, onlyAlertOnce);
        m2779Q(cVar, onlyAlertOnce);
        m2788Z(cVar, onlyAlertOnce);
        Notification build = onlyAlertOnce.build();
        int[] iArr = cVar.f1827U;
        if (iArr != null && iArr.length > 0) {
            for (int i : iArr) {
                build.flags = i | build.flags;
            }
        }
        return build;
    }

    /* renamed from: l */
    public static Spanned m2798l(String str) {
        if (str == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: m */
    public static AlarmManager m2799m(Context context) {
        return (AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
    }

    /* renamed from: n */
    public static Bitmap m2800n(Context context, String str, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), m2801o(context, str));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    /* renamed from: o */
    public static int m2801o(Context context, String str) {
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    /* renamed from: p */
    public static IconCompat m2802p(Context context, String str, IconSource iconSource) {
        int i = C2036b.f1780b[iconSource.ordinal()];
        if (i == 1) {
            return IconCompat.createWithResource(context, m2801o(context, str));
        }
        if (i == 2) {
            return IconCompat.createWithBitmap(BitmapFactory.decodeFile(str));
        }
        if (i == 3) {
            return IconCompat.createWithContentUri(str);
        }
        if (i != 4) {
            return null;
        }
        try {
            AssetFileDescriptor openFd = context.getAssets().openFd(C9172c.m24875c(str));
            FileInputStream createInputStream = openFd.createInputStream();
            IconCompat createWithBitmap = IconCompat.createWithBitmap(BitmapFactory.decodeStream(createInputStream));
            createInputStream.close();
            openFd.close();
            return createWithBitmap;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: q */
    public static Class m2803q(Context context) {
        try {
            return Class.forName(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: s */
    public static NotificationManagerCompat m2804s(Context context) {
        return NotificationManagerCompat.from(context);
    }

    /* renamed from: z */
    public static boolean m2805z(Context context, String str, C9017j.C9022d dVar, String str2) {
        if (context.getResources().getIdentifier(str, "drawable", context.getPackageName()) != 0) {
            return true;
        }
        dVar.error(str2, String.format("The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.", new Object[]{str}), (Object) null);
        return false;
    }

    /* renamed from: C */
    public final void mo16644C(Context context, C9003c cVar) {
        this.f1776l = context;
        C9017j jVar = new C9017j(cVar, "dexterous.com/flutter/local_notifications");
        this.f1775e = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: D */
    public final void mo16645D(C9017j.C9022d dVar) {
        ArrayList<C2041c> B = m2769B(this.f1776l);
        ArrayList arrayList = new ArrayList();
        Iterator<C2041c> it = B.iterator();
        while (it.hasNext()) {
            C2041c next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put("id", next.f1831a);
            hashMap.put(NotificationCompatJellybean.KEY_TITLE, next.f1832b);
            hashMap.put(MailTo.BODY, next.f1833c);
            hashMap.put("payload", next.f1852v);
            arrayList.add(hashMap);
        }
        dVar.success(arrayList);
    }

    /* renamed from: F */
    public final void mo16646F(C9016i iVar, C9017j.C9022d dVar) {
        C2041c k = mo16655k(dVar, (Map) iVar.mo46572b());
        if (k != null) {
            m2771G(this.f1776l, k, Boolean.TRUE);
            dVar.success((Object) null);
        }
    }

    /* renamed from: L */
    public final void mo16647L(C9016i iVar, C9017j.C9022d dVar) {
        C2041c k = mo16655k(dVar, (Map) iVar.mo46572b());
        if (k != null) {
            m2776M(this.f1776l, k, Boolean.TRUE);
            dVar.success((Object) null);
        }
    }

    /* renamed from: N */
    public final Boolean mo16648N(Intent intent) {
        if (!"SELECT_NOTIFICATION".equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        this.f1775e.mo46573c("selectNotification", intent.getStringExtra("payload"));
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public final void mo16649d(C9016i iVar, C9017j.C9022d dVar) {
        mo16652f((Integer) iVar.mo46572b());
        dVar.success((Object) null);
    }

    /* renamed from: d0 */
    public final void mo16650d0(C9016i iVar, C9017j.C9022d dVar) {
        C2041c k = mo16655k(dVar, (Map) iVar.mo46572b());
        if (k != null) {
            m2795e0(this.f1776l, k);
            dVar.success((Object) null);
        }
    }

    /* renamed from: e */
    public final void mo16651e(C9017j.C9022d dVar) {
        m2804s(this.f1776l).cancelAll();
        ArrayList<C2041c> B = m2769B(this.f1776l);
        if (B == null || B.isEmpty()) {
            dVar.success((Object) null);
            return;
        }
        Intent intent = new Intent(this.f1776l, ScheduledNotificationReceiver.class);
        Iterator<C2041c> it = B.iterator();
        while (it.hasNext()) {
            m2799m(this.f1776l).cancel(PendingIntent.getBroadcast(this.f1776l, it.next().f1831a.intValue(), intent, 134217728));
        }
        m2775K(this.f1776l, new ArrayList());
        dVar.success((Object) null);
    }

    /* renamed from: f */
    public final void mo16652f(Integer num) {
        m2799m(this.f1776l).cancel(PendingIntent.getBroadcast(this.f1776l, num.intValue(), new Intent(this.f1776l, ScheduledNotificationReceiver.class), 134217728));
        m2804s(this.f1776l).cancel(num.intValue());
        m2770E(num, this.f1776l);
    }

    /* renamed from: i */
    public final void mo16653i(C9016i iVar, C9017j.C9022d dVar) {
        m2794c0(this.f1776l, C2040b.m2831a((Map) iVar.mo46572b()));
        dVar.success((Object) null);
    }

    /* renamed from: j */
    public final void mo16654j(C9016i iVar, C9017j.C9022d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.f1776l.getSystemService("notification")).deleteNotificationChannel((String) iVar.mo46572b());
            dVar.success((Object) null);
        }
    }

    /* renamed from: k */
    public final C2041c mo16655k(C9017j.C9022d dVar, Map<String, Object> map) {
        C2041c a = C2041c.m2833a(map);
        if (mo16663u(dVar, a.f1834d) || mo16664v(dVar, a.f1810D, a.f1811E) || mo16662t(dVar, a) || mo16666x(dVar, a) || mo16665w(dVar, a)) {
            return null;
        }
        return a;
    }

    public void onAttachedToActivity(C8950c cVar) {
        cVar.mo46418c(this);
        this.f1777m = cVar.mo46419d();
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo16644C(bVar.mo46464a(), bVar.mo46465b());
    }

    public void onDetachedFromActivity() {
        this.f1777m = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f1777m = null;
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r3, p553f.p554a.p570e.p571a.C9017j.C9022d r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.f17687a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1889739879: goto L_0x007f;
                case -1367724422: goto L_0x0075;
                case -799130106: goto L_0x006a;
                case -697920873: goto L_0x0060;
                case -208611345: goto L_0x0056;
                case 3529469: goto L_0x004c;
                case 6625712: goto L_0x0042;
                case 476547271: goto L_0x0037;
                case 871091088: goto L_0x002d;
                case 1008472557: goto L_0x0022;
                case 1408864732: goto L_0x0017;
                case 1653467900: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0089
        L_0x000b:
            java.lang.String r1 = "createNotificationChannel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 10
            goto L_0x008a
        L_0x0017:
            java.lang.String r1 = "showDailyAtTime"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 5
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = "deleteNotificationChannel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 11
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = "initialize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 0
            goto L_0x008a
        L_0x0037:
            java.lang.String r1 = "cancelAll"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 8
            goto L_0x008a
        L_0x0042:
            java.lang.String r1 = "periodicallyShow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 4
            goto L_0x008a
        L_0x004c:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 2
            goto L_0x008a
        L_0x0056:
            java.lang.String r1 = "getNotificationAppLaunchDetails"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 1
            goto L_0x008a
        L_0x0060:
            java.lang.String r1 = "schedule"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 3
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = "pendingNotificationRequests"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 9
            goto L_0x008a
        L_0x0075:
            java.lang.String r1 = "cancel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 7
            goto L_0x008a
        L_0x007f:
            java.lang.String r1 = "showWeeklyAtDayAndTime"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 6
            goto L_0x008a
        L_0x0089:
            r0 = -1
        L_0x008a:
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00b1;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00a5;
                case 7: goto L_0x00a1;
                case 8: goto L_0x009d;
                case 9: goto L_0x0099;
                case 10: goto L_0x0095;
                case 11: goto L_0x0091;
                default: goto L_0x008d;
            }
        L_0x008d:
            r4.notImplemented()
            goto L_0x00b8
        L_0x0091:
            r2.mo16654j(r3, r4)
            goto L_0x00b8
        L_0x0095:
            r2.mo16653i(r3, r4)
            goto L_0x00b8
        L_0x0099:
            r2.mo16645D(r4)
            goto L_0x00b8
        L_0x009d:
            r2.mo16651e(r4)
            goto L_0x00b8
        L_0x00a1:
            r2.mo16649d(r3, r4)
            goto L_0x00b8
        L_0x00a5:
            r2.mo16646F(r3, r4)
            goto L_0x00b8
        L_0x00a9:
            r2.mo16647L(r3, r4)
            goto L_0x00b8
        L_0x00ad:
            r2.mo16650d0(r3, r4)
            goto L_0x00b8
        L_0x00b1:
            r2.mo16661r(r4)
            goto L_0x00b8
        L_0x00b5:
            r2.mo16667y(r3, r4)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p130j.p131a.C2034a.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = mo16648N(intent).booleanValue();
        if (booleanValue && (activity = this.f1777m) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    public void onReattachedToActivityForConfigChanges(C8950c cVar) {
        cVar.mo46418c(this);
        this.f1777m = cVar.mo46419d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r3.f1777m;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16661r(p553f.p554a.p570e.p571a.C9017j.C9022d r4) {
        /*
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r3.f1778n
            if (r1 != 0) goto L_0x002b
            android.app.Activity r1 = r3.f1777m
            if (r1 == 0) goto L_0x002b
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r1.getAction()
            java.lang.String r2 = "SELECT_NOTIFICATION"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            android.app.Activity r1 = r3.f1777m
            android.content.Intent r1 = r1.getIntent()
            boolean r1 = m2768A(r1)
            if (r1 != 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "notificationLaunchedApp"
            r0.put(r2, r1)
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "payload"
            if (r1 == 0) goto L_0x0048
            android.app.Activity r1 = r3.f1777m
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r0.put(r2, r1)
            r4.success(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p130j.p131a.C2034a.mo16661r(f.a.e.a.j$d):void");
    }

    /* renamed from: t */
    public final boolean mo16662t(C9017j.C9022d dVar, C2041c cVar) {
        if (cVar.f1846p != NotificationStyle.BigPicture) {
            return false;
        }
        C2044a aVar = (C2044a) cVar.f1847q;
        if (mo16664v(dVar, aVar.f1871g, aVar.f1872h)) {
            return true;
        }
        if (aVar.f1874j != BitmapSource.DrawableResource || m2805z(this.f1776l, aVar.f1873i, dVar, "INVALID_BIG_PICTURE")) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean mo16663u(C9017j.C9022d dVar, String str) {
        return !C2051b.m2853a(str).booleanValue() && !m2805z(this.f1776l, str, dVar, "INVALID_ICON");
    }

    /* renamed from: v */
    public final boolean mo16664v(C9017j.C9022d dVar, String str, BitmapSource bitmapSource) {
        return !C2051b.m2853a(str).booleanValue() && bitmapSource == BitmapSource.DrawableResource && !m2805z(this.f1776l, str, dVar, "INVALID_LARGE_ICON");
    }

    /* renamed from: w */
    public final boolean mo16665w(C9017j.C9022d dVar, C2041c cVar) {
        if (cVar.f1819M == null) {
            return false;
        }
        if (cVar.f1820N != null && cVar.f1821O != null) {
            return false;
        }
        dVar.error("INVALID_LED_DETAILS", "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo", (Object) null);
        return true;
    }

    /* renamed from: x */
    public final boolean mo16666x(C9017j.C9022d dVar, C2041c cVar) {
        if (C2051b.m2853a(cVar.f1842l).booleanValue()) {
            return false;
        }
        SoundSource soundSource = cVar.f1843m;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.f1776l.getResources().getIdentifier(cVar.f1842l, "raw", this.f1776l.getPackageName()) != 0) {
            return false;
        }
        dVar.error("INVALID_SOUND", "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.", (Object) null);
        return true;
    }

    /* renamed from: y */
    public final void mo16667y(C9016i iVar, C9017j.C9022d dVar) {
        String str = (String) ((Map) iVar.mo46572b()).get("defaultIcon");
        if (m2805z(this.f1776l, str, dVar, "INVALID_ICON")) {
            SharedPreferences.Editor edit = this.f1776l.getSharedPreferences("notification_plugin_cache", 0).edit();
            edit.putString("defaultIcon", str);
            edit.commit();
            Activity activity = this.f1777m;
            if (activity != null && !m2768A(activity.getIntent())) {
                mo16648N(this.f1777m.getIntent());
            }
            this.f1778n = true;
            dVar.success(Boolean.TRUE);
        }
    }
}
