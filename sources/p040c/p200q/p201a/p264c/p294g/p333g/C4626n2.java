package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.core.app.Person;
import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* renamed from: c.q.a.c.g.g.n2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4626n2 {

    /* renamed from: a */
    public static final char[] f9461a;

    static {
        char[] cArr = new char[80];
        f9461a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m12517a(C4572l2 l2Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m12520d(l2Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m12518b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m12518b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m12518b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m12519c(i, sb);
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
                sb.append(C4627n3.m12521a(zzacc.zzp((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof zzacc) {
                sb.append(": \"");
                sb.append(C4627n3.m12521a((zzacc) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof C4544k1) {
                sb.append(" {");
                m12520d((C4544k1) obj, sb, i + 2);
                sb.append("\n");
                m12519c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m12518b(sb, i3, Person.KEY_KEY, entry.getKey());
                m12518b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m12519c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m12519c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f9461a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m12520d(C4572l2 l2Var, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C4572l2 l2Var2 = l2Var;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = l2Var.getClass().getDeclaredMethods();
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
                m12518b(sb2, i3, substring.substring(0, substring.length() - 4), C4544k1.m12253e(method2, l2Var2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m12518b(sb2, i3, substring.substring(0, substring.length() - 3), C4544k1.m12253e(method, l2Var2, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object e = C4544k1.m12253e(method4, l2Var2, new Object[0]);
                    if (method5 == null) {
                        if (e instanceof Boolean) {
                            if (!((Boolean) e).booleanValue()) {
                            }
                        } else if (e instanceof Integer) {
                            if (((Integer) e).intValue() == 0) {
                            }
                        } else if (e instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) e).floatValue()) == 0) {
                            }
                        } else if (!(e instanceof Double)) {
                            if (e instanceof String) {
                                z = e.equals("");
                            } else if (e instanceof zzacc) {
                                z = e.equals(zzacc.zzb);
                            } else if (e instanceof C4572l2) {
                                if (e == ((C4572l2) e).mo26048a()) {
                                }
                            } else if ((e instanceof Enum) && ((Enum) e).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) e).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C4544k1.m12253e(method5, l2Var2, new Object[0])).booleanValue()) {
                    }
                    m12518b(sb2, i3, substring, e);
                }
            }
            i2 = 3;
        }
        if (!(l2Var2 instanceof C4490i1)) {
            C4681p3 p3Var = ((C4544k1) l2Var2).zzc;
            if (p3Var != null) {
                p3Var.mo26505i(sb2, i3);
                return;
            }
            return;
        }
        C4355d1 d1Var = ((C4490i1) l2Var2).zzb;
        throw null;
    }
}
