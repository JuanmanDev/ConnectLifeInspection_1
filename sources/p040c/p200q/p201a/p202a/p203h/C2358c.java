package p040c.p200q.p201a.p202a.p203h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.p205i.C2525h;

/* renamed from: c.q.a.a.h.c */
/* compiled from: CCTDestination */
public final class C2358c implements C2525h {

    /* renamed from: c */
    public static final String f2591c = C2362e.m4057a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final String f2592d = C2362e.m4057a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    public static final String f2593e = C2362e.m4057a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    public static final Set<C2350b> f2594f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C2350b[]{C2350b.m4027b("proto"), C2350b.m4027b("json")})));

    /* renamed from: g */
    public static final C2358c f2595g = new C2358c(f2592d, f2593e);
    @NonNull

    /* renamed from: a */
    public final String f2596a;
    @Nullable

    /* renamed from: b */
    public final String f2597b;

    public C2358c(@NonNull String str, @Nullable String str2) {
        this.f2596a = str;
        this.f2597b = str2;
    }

    @NonNull
    /* renamed from: c */
    public static C2358c m4039c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C2358c(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C2350b> mo17666a() {
        return f2594f;
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo17667b() {
        if (this.f2597b == null && this.f2596a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f2596a;
        objArr[2] = "\\";
        String str = this.f2597b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    /* renamed from: d */
    public String mo17668d() {
        return this.f2597b;
    }

    @NonNull
    /* renamed from: e */
    public String mo17669e() {
        return this.f2596a;
    }

    @Nullable
    public byte[] getExtras() {
        return mo17667b();
    }

    @NonNull
    public String getName() {
        return "cct";
    }
}
