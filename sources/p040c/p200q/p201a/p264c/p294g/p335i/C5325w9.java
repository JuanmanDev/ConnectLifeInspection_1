package p040c.p200q.p201a.p264c.p294g.p335i;

import androidx.core.app.Person;
import com.google.android.gms.internal.measurement.zzje;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* renamed from: c.q.a.c.g.i.w9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5325w9 {

    /* renamed from: a */
    public static final char[] f10206a;

    static {
        char[] cArr = new char[80];
        f10206a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m15176a(C5295u9 u9Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m15179d(u9Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m15177b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m15177b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m15177b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m15178c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C5311va.m15129a(zzje.zzm((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof zzje) {
                sb.append(": \"");
                sb.append(C5311va.m15129a((zzje) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof C5279t8) {
                sb.append(" {");
                m15179d((C5279t8) obj, sb, i + 2);
                sb.append("\n");
                m15178c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m15177b(sb, i3, Person.KEY_KEY, entry.getKey());
                m15177b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m15178c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m15178c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f10206a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m15179d(C5295u9 u9Var, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C5295u9 u9Var2 = u9Var;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = u9Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m15177b(sb2, i3, substring.substring(0, substring.length() - 4), C5279t8.m14960q(method2, u9Var2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m15177b(sb2, i3, substring.substring(0, substring.length() - 3), C5279t8.m14960q(method, u9Var2, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object q = C5279t8.m14960q(method4, u9Var2, new Object[0]);
                    if (method5 == null) {
                        if (q instanceof Boolean) {
                            if (!((Boolean) q).booleanValue()) {
                            }
                        } else if (q instanceof Integer) {
                            if (((Integer) q).intValue() == 0) {
                            }
                        } else if (q instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) q).floatValue()) == 0) {
                            }
                        } else if (!(q instanceof Double)) {
                            if (q instanceof String) {
                                z = q.equals("");
                            } else if (q instanceof zzje) {
                                z = q.equals(zzje.zzb);
                            } else if (q instanceof C5295u9) {
                                if (q == ((C5295u9) q).mo27517e()) {
                                }
                            } else if ((q instanceof Enum) && ((Enum) q).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) q).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C5279t8.m14960q(method5, u9Var2, new Object[0])).booleanValue()) {
                    }
                    m15177b(sb2, i3, substring, q);
                }
            }
            i2 = 3;
        }
        if (!(u9Var2 instanceof C5249r8)) {
            C5341xa xaVar = ((C5279t8) u9Var2).zzc;
            if (xaVar != null) {
                xaVar.mo27932i(sb2, i3);
                return;
            }
            return;
        }
        C5159l8 l8Var = ((C5249r8) u9Var2).zza;
        throw null;
    }
}
