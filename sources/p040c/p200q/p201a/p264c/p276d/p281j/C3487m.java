package p040c.p200q.p201a.p264c.p276d.p281j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: c.q.a.c.d.j.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3487m {

    /* renamed from: c.q.a.c.d.j.m$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static final class C3488a {

        /* renamed from: a */
        public final List f6477a = new ArrayList();

        /* renamed from: b */
        public final Object f6478b;

        public /* synthetic */ C3488a(Object obj, C3535z0 z0Var) {
            C3495o.m8908j(obj);
            this.f6478b = obj;
        }

        @NonNull
        /* renamed from: a */
        public C3488a mo20747a(@NonNull String str, @Nullable Object obj) {
            List list = this.f6477a;
            C3495o.m8908j(str);
            String valueOf = String.valueOf(obj);
            list.add(str + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + valueOf);
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f6478b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f6477a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f6477a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m8886a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m8887b(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    /* renamed from: c */
    public static C3488a m8888c(@NonNull Object obj) {
        return new C3488a(obj, (C3535z0) null);
    }
}
