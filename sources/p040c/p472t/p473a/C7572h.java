package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import androidx.appcompat.widget.ActivityChooserModel;
import com.hisense.connect_life.core.global.PermissionConstKt;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.p703v1.XmlPullParserException;

/* renamed from: c.t.a.h */
/* compiled from: PermissionChecker */
public final class C7572h {
    /* renamed from: a */
    public static boolean m21470a(Activity activity, boolean z) {
        if (activity == null) {
            if (!z) {
                return false;
            }
            throw new IllegalArgumentException("The instance of the context must be an activity object");
        } else if (activity.isFinishing()) {
            if (!z) {
                return false;
            }
            throw new IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
        } else if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        } else {
            if (!z) {
                return false;
            }
            throw new IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
        }
    }

    /* renamed from: b */
    public static void m21471b(List<String> list) {
        if (C7584t.m21534d(list, "android.permission.BODY_SENSORS_BACKGROUND")) {
            if (!C7584t.m21534d(list, "android.permission.BODY_SENSORS_BACKGROUND") || C7584t.m21534d(list, "android.permission.BODY_SENSORS")) {
                for (String next : list) {
                    if (C7584t.m21535e(next, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported");
                    } else if (C7584t.m21535e(next, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Applying for background sensor permissions must contain android.permission.BODY_SENSORS");
        }
    }

    /* renamed from: c */
    public static void m21472c(Context context, List<String> list) {
        if (C7565b.m21444b(context) >= 31 && C7584t.m21534d(list, PermissionConstKt.PERMISSION_LOCATION) && !C7584t.m21534d(list, "android.permission.ACCESS_COARSE_LOCATION")) {
            throw new IllegalArgumentException("If your app targets Android 12 or higher and requests the ACCESS_FINE_LOCATION runtime permission, you must also request the ACCESS_COARSE_LOCATION permission. You must include both permissions in a single runtime request.");
        } else if (C7584t.m21534d(list, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (!C7584t.m21534d(list, "android.permission.ACCESS_COARSE_LOCATION") || C7584t.m21534d(list, PermissionConstKt.PERMISSION_LOCATION)) {
                for (String next : list) {
                    if (!C7584t.m21535e(next, PermissionConstKt.PERMISSION_LOCATION) && !C7584t.m21535e(next, "android.permission.ACCESS_COARSE_LOCATION") && !C7584t.m21535e(next, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        throw new IllegalArgumentException("Because it includes background location permissions, do not apply for permissions unrelated to location");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION");
        }
    }

    /* renamed from: d */
    public static void m21473d(HashMap<String, Integer> hashMap, String str, int i) {
        String str2;
        if (hashMap.containsKey(str)) {
            Integer num = hashMap.get(str);
            if (num != null && num.intValue() < i) {
                StringBuilder sb = new StringBuilder();
                sb.append("The AndroidManifest.xml file <uses-permission android:name=\"");
                sb.append(str);
                sb.append("\" android:maxSdkVersion=\"");
                sb.append(num);
                sb.append("\" /> does not meet the requirements, ");
                if (i != Integer.MAX_VALUE) {
                    str2 = "the minimum requirement for maxSdkVersion is " + i;
                } else {
                    str2 = "please delete the android:maxSdkVersion=\"" + num + "\" attribute";
                }
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new IllegalStateException("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"" + str + "\" />");
    }

    /* renamed from: e */
    public static void m21474e(Context context, List<String> list) {
        HashMap<String, Integer> j = C7584t.m21540j(context);
        if (!j.isEmpty()) {
            int i = Build.VERSION.SDK_INT >= 24 ? context.getApplicationInfo().minSdkVersion : 23;
            for (String next : list) {
                if (!C7584t.m21535e(next, "android.permission.NOTIFICATION_SERVICE") && !C7584t.m21535e(next, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") && !C7584t.m21535e(next, "android.permission.BIND_VPN_SERVICE") && !C7584t.m21535e(next, "android.permission.PICTURE_IN_PICTURE")) {
                    if (C7584t.m21535e(next, "android.permission.BODY_SENSORS_BACKGROUND")) {
                        m21473d(j, "android.permission.BODY_SENSORS", Integer.MAX_VALUE);
                    } else if (!C7584t.m21535e(next, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        if (i < 33) {
                            if (C7584t.m21535e(next, "android.permission.READ_MEDIA_IMAGES") || C7584t.m21535e(next, "android.permission.READ_MEDIA_VIDEO") || C7584t.m21535e(next, "android.permission.READ_MEDIA_AUDIO")) {
                                m21473d(j, "android.permission.READ_EXTERNAL_STORAGE", 32);
                            } else if (C7584t.m21535e(next, "android.permission.NEARBY_WIFI_DEVICES")) {
                                m21473d(j, PermissionConstKt.PERMISSION_LOCATION, 32);
                            } else if (C7584t.m21535e(next, "android.permission.SCHEDULE_EXACT_ALARM")) {
                                if (C7565b.m21444b(context) >= 33) {
                                    m21473d(j, "android.permission.SCHEDULE_EXACT_ALARM", 32);
                                } else {
                                    m21473d(j, "android.permission.SCHEDULE_EXACT_ALARM", Integer.MAX_VALUE);
                                }
                            }
                        }
                        if (i < 31) {
                            if (C7584t.m21535e(next, "android.permission.BLUETOOTH_SCAN")) {
                                m21473d(j, "android.permission.BLUETOOTH_ADMIN", 30);
                                m21473d(j, PermissionConstKt.PERMISSION_LOCATION, 30);
                            } else if (C7584t.m21535e(next, "android.permission.BLUETOOTH_CONNECT")) {
                                m21473d(j, "android.permission.BLUETOOTH", 30);
                            } else if (C7584t.m21535e(next, "android.permission.BLUETOOTH_ADVERTISE")) {
                                m21473d(j, "android.permission.BLUETOOTH_ADMIN", 30);
                            }
                        }
                        if (i < 30 && C7584t.m21535e(next, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                            m21473d(j, "android.permission.READ_EXTERNAL_STORAGE", 29);
                            m21473d(j, "android.permission.WRITE_EXTERNAL_STORAGE", 29);
                        } else if (i >= 26 || !C7584t.m21535e(next, "android.permission.READ_PHONE_NUMBERS")) {
                            m21473d(j, next, Integer.MAX_VALUE);
                        } else {
                            m21473d(j, "android.permission.READ_PHONE_STATE", 25);
                        }
                    } else if (C7565b.m21444b(context) >= 31) {
                        m21473d(j, PermissionConstKt.PERMISSION_LOCATION, 30);
                        m21473d(j, "android.permission.ACCESS_COARSE_LOCATION", Integer.MAX_VALUE);
                    } else {
                        m21473d(j, PermissionConstKt.PERMISSION_LOCATION, Integer.MAX_VALUE);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("No permissions are registered in the AndroidManifest.xml file");
    }

    /* renamed from: f */
    public static void m21475f(Context context, List<String> list) {
        if (C7584t.m21534d(list, "android.permission.ACCESS_MEDIA_LOCATION")) {
            for (String next : list) {
                if (!C7584t.m21535e(next, "android.permission.ACCESS_MEDIA_LOCATION") && !C7584t.m21535e(next, "android.permission.READ_MEDIA_IMAGES") && !C7584t.m21535e(next, "android.permission.READ_EXTERNAL_STORAGE") && !C7584t.m21535e(next, "android.permission.WRITE_EXTERNAL_STORAGE") && !C7584t.m21535e(next, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    throw new IllegalArgumentException("Because it includes access media location permissions, do not apply for permissions unrelated to access media location");
                }
            }
            if (C7565b.m21444b(context) >= 33) {
                if (!C7584t.m21534d(list, "android.permission.READ_MEDIA_IMAGES") && !C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    throw new IllegalArgumentException("You must add android.permission.READ_MEDIA_IMAGES or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
                }
            } else if (!C7584t.m21534d(list, "android.permission.READ_EXTERNAL_STORAGE") && !C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                throw new IllegalArgumentException("You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
            }
        }
    }

    /* renamed from: g */
    public static boolean m21476g(List<String> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            if (Build.VERSION.SDK_INT <= 32 && z) {
                ArrayList arrayList = new ArrayList();
                Field[] declaredFields = C7569f.class.getDeclaredFields();
                if (declaredFields.length == 0) {
                    return true;
                }
                for (Field field : declaredFields) {
                    if (String.class.equals(field.getType())) {
                        try {
                            arrayList.add((String) field.get((Object) null));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
                for (String next : list) {
                    if (!C7584t.m21534d(arrayList, next)) {
                        throw new IllegalArgumentException("The " + next + " is not a dangerous permission or special permission, please do not apply dynamically");
                    }
                }
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            throw new IllegalArgumentException("The requested permission cannot be empty");
        }
    }

    /* renamed from: h */
    public static void m21477h(Context context, List<String> list) {
        XmlResourceParser s;
        if (C7584t.m21534d(list, "android.permission.PICTURE_IN_PICTURE") && (s = C7584t.m21549s(context)) != null) {
            while (true) {
                try {
                    if (s.getEventType() == 2) {
                        if (ActivityChooserModel.ATTRIBUTE_ACTIVITY.equals(s.getName())) {
                            if (s.getAttributeBooleanValue(C7584t.m21538h(), "supportsPictureInPicture", false)) {
                                return;
                            }
                        }
                    }
                    if (s.next() == 1) {
                        throw new IllegalArgumentException("No activity registered supportsPictureInPicture attribute, please register <activity android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml");
                    }
                } catch (IOException | XmlPullParserException e) {
                    e.printStackTrace();
                    return;
                } finally {
                    s.close();
                }
            }
        }
    }

    /* renamed from: i */
    public static void m21478i(Context context, List<String> list) {
        if (!C7584t.m21534d(list, "android.permission.READ_MEDIA_IMAGES") && !C7584t.m21534d(list, "android.permission.READ_MEDIA_VIDEO") && !C7584t.m21534d(list, "android.permission.READ_MEDIA_AUDIO") && !C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && !C7584t.m21534d(list, "android.permission.READ_EXTERNAL_STORAGE") && !C7584t.m21534d(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return;
        }
        if (C7565b.m21444b(context) >= 33 && (C7584t.m21534d(list, "android.permission.READ_EXTERNAL_STORAGE") || C7584t.m21534d(list, "android.permission.WRITE_EXTERNAL_STORAGE"))) {
            throw new IllegalArgumentException("When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO instead of android.permission.READ_EXTERNAL_STORAGE, android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (!C7584t.m21534d(list, "android.permission.READ_MEDIA_IMAGES") && !C7584t.m21534d(list, "android.permission.ACCESS_MEDIA_LOCATION")) {
            boolean o = C7584t.m21545o(context);
            XmlResourceParser s = C7584t.m21549s(context);
            if (s != null) {
                while (true) {
                    try {
                        if (s.getEventType() == 2) {
                            if ("application".equals(s.getName())) {
                                int b = C7565b.m21444b(context);
                                boolean attributeBooleanValue = s.getAttributeBooleanValue(C7584t.m21538h(), "requestLegacyExternalStorage", false);
                                if (b >= 29 && !attributeBooleanValue) {
                                    if (C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE") || !o) {
                                        throw new IllegalStateException("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
                                    }
                                }
                                if (b >= 30 && !C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                    if (!o) {
                                        throw new IllegalArgumentException("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission");
                                    }
                                }
                            }
                        }
                        if (s.next() == 1) {
                            break;
                        }
                    } catch (IOException | XmlPullParserException e) {
                        e.printStackTrace();
                    } catch (Throwable th) {
                        s.close();
                        throw th;
                    }
                }
                s.close();
            }
        }
    }

    /* renamed from: j */
    public static void m21479j(Context context, List<String> list) {
        int i = (C7584t.m21534d(list, "android.permission.POST_NOTIFICATIONS") || C7584t.m21534d(list, "android.permission.NEARBY_WIFI_DEVICES") || C7584t.m21534d(list, "android.permission.BODY_SENSORS_BACKGROUND") || C7584t.m21534d(list, "android.permission.READ_MEDIA_IMAGES") || C7584t.m21534d(list, "android.permission.READ_MEDIA_VIDEO") || C7584t.m21534d(list, "android.permission.READ_MEDIA_AUDIO")) ? 33 : (C7584t.m21534d(list, "android.permission.BLUETOOTH_SCAN") || C7584t.m21534d(list, "android.permission.BLUETOOTH_CONNECT") || C7584t.m21534d(list, "android.permission.BLUETOOTH_ADVERTISE") || C7584t.m21534d(list, "android.permission.SCHEDULE_EXACT_ALARM")) ? 31 : C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE") ? 30 : (C7584t.m21534d(list, "android.permission.ACCESS_BACKGROUND_LOCATION") || C7584t.m21534d(list, "android.permission.ACTIVITY_RECOGNITION") || C7584t.m21534d(list, "android.permission.ACCESS_MEDIA_LOCATION")) ? 29 : C7584t.m21534d(list, "android.permission.ACCEPT_HANDOVER") ? 28 : (C7584t.m21534d(list, "android.permission.REQUEST_INSTALL_PACKAGES") || C7584t.m21534d(list, "android.permission.ANSWER_PHONE_CALLS") || C7584t.m21534d(list, "android.permission.READ_PHONE_NUMBERS") || C7584t.m21534d(list, "android.permission.PICTURE_IN_PICTURE")) ? 26 : 23;
        if (C7565b.m21444b(context) < i) {
            throw new RuntimeException("The targetSdkVersion SDK must be " + i + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permissions");
        }
    }

    /* renamed from: k */
    public static void m21480k(List<String> list) {
        if (!C7565b.m21448f()) {
            if (C7584t.m21534d(list, "android.permission.POST_NOTIFICATIONS") && !C7584t.m21534d(list, "android.permission.NOTIFICATION_SERVICE")) {
                list.add("android.permission.NOTIFICATION_SERVICE");
            }
            if (C7584t.m21534d(list, "android.permission.NEARBY_WIFI_DEVICES") && !C7584t.m21534d(list, PermissionConstKt.PERMISSION_LOCATION)) {
                list.add(PermissionConstKt.PERMISSION_LOCATION);
            }
            if ((C7584t.m21534d(list, "android.permission.READ_MEDIA_IMAGES") || C7584t.m21534d(list, "android.permission.READ_MEDIA_VIDEO") || C7584t.m21534d(list, "android.permission.READ_MEDIA_AUDIO")) && !C7584t.m21534d(list, "android.permission.READ_EXTERNAL_STORAGE")) {
                list.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!C7565b.m21447e() && C7584t.m21534d(list, "android.permission.BLUETOOTH_SCAN") && !C7584t.m21534d(list, PermissionConstKt.PERMISSION_LOCATION)) {
            list.add(PermissionConstKt.PERMISSION_LOCATION);
        }
        if (C7584t.m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            if (C7584t.m21534d(list, "android.permission.READ_EXTERNAL_STORAGE") || C7584t.m21534d(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                throw new IllegalArgumentException("If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
            } else if (!C7565b.m21446d()) {
                list.add("android.permission.READ_EXTERNAL_STORAGE");
                list.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
        if (!C7565b.m21445c() && C7584t.m21534d(list, "android.permission.ACTIVITY_RECOGNITION") && !C7584t.m21534d(list, "android.permission.BODY_SENSORS")) {
            list.add("android.permission.BODY_SENSORS");
        }
        if (!C7565b.m21453k() && C7584t.m21534d(list, "android.permission.READ_PHONE_NUMBERS") && !C7584t.m21534d(list, "android.permission.READ_PHONE_STATE")) {
            list.add("android.permission.READ_PHONE_STATE");
        }
    }
}
