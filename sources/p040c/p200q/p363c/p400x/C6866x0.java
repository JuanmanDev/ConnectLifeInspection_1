package p040c.p200q.p363c.p400x;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;

/* renamed from: c.q.c.x.x0 */
/* compiled from: TopicOperation */
public final class C6866x0 {

    /* renamed from: d */
    public static final Pattern f13143d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f13144a;

    /* renamed from: b */
    public final String f13145b;

    /* renamed from: c */
    public final String f13146c;

    public C6866x0(String str, String str2) {
        this.f13144a = m19510d(str2, str);
        this.f13145b = str;
        this.f13146c = str + "!" + str2;
    }

    @Nullable
    /* renamed from: a */
    public static C6866x0 m19509a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C6866x0(split[0], split[1]);
    }

    @NonNull
    /* renamed from: d */
    public static String m19510d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2});
            str = str.substring(8);
        }
        if (str != null && f13143d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: b */
    public String mo31702b() {
        return this.f13145b;
    }

    /* renamed from: c */
    public String mo31703c() {
        return this.f13144a;
    }

    /* renamed from: e */
    public String mo31704e() {
        return this.f13146c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C6866x0)) {
            return false;
        }
        C6866x0 x0Var = (C6866x0) obj;
        if (!this.f13144a.equals(x0Var.f13144a) || !this.f13145b.equals(x0Var.f13145b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f13145b, this.f13144a);
    }
}
