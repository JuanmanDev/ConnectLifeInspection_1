package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;

/* renamed from: c.q.a.c.g.i.va */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5311va {
    /* renamed from: a */
    public static String m15129a(zzje zzje) {
        StringBuilder sb = new StringBuilder(zzje.zzd());
        for (int i = 0; i < zzje.zzd(); i++) {
            byte zza = zzje.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zza >= 32 && zza <= 126) {
                            sb.append((char) zza);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
