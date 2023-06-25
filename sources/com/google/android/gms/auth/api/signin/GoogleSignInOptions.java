package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3282h;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3283i;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3284j;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3258a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C3334a.C3338d, ReflectedParcelable {
    @NonNull

    /* renamed from: A */
    public static final Scope f8104A = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: B */
    public static Comparator<Scope> f8105B = new C3282h();
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C3284j();
    @NonNull

    /* renamed from: u */
    public static final GoogleSignInOptions f8106u;
    @NonNull

    /* renamed from: v */
    public static final GoogleSignInOptions f8107v;
    @NonNull

    /* renamed from: w */
    public static final Scope f8108w = new Scope("profile");
    @NonNull

    /* renamed from: x */
    public static final Scope f8109x = new Scope("email");
    @NonNull

    /* renamed from: y */
    public static final Scope f8110y = new Scope("openid");
    @NonNull

    /* renamed from: z */
    public static final Scope f8111z = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public final int f8112e;

    /* renamed from: l */
    public final ArrayList<Scope> f8113l;
    @Nullable

    /* renamed from: m */
    public Account f8114m;

    /* renamed from: n */
    public boolean f8115n;

    /* renamed from: o */
    public final boolean f8116o;

    /* renamed from: p */
    public final boolean f8117p;
    @Nullable

    /* renamed from: q */
    public String f8118q;
    @Nullable

    /* renamed from: r */
    public String f8119r;

    /* renamed from: s */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f8120s;
    @Nullable

    /* renamed from: t */
    public String f8121t;

    static {
        C4069a aVar = new C4069a();
        aVar.mo24447c();
        aVar.mo24449e();
        f8106u = aVar.mo24445a();
        C4069a aVar2 = new C4069a();
        aVar2.mo24450f(f8111z, new Scope[0]);
        f8107v = aVar2.mo24445a();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, @Nullable String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m10812i0(arrayList2), str3);
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C3283i iVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    @Nullable
    /* renamed from: X */
    public static GoogleSignInOptions m10802X(@Nullable String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, optString2, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap(), (String) null);
    }

    /* renamed from: i0 */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m10812i0(@Nullable List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.mo24458P()), next);
        }
        return hashMap;
    }

    @NonNull
    /* renamed from: P */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo24433P() {
        return this.f8120s;
    }

    @Nullable
    /* renamed from: Q */
    public String mo24434Q() {
        return this.f8121t;
    }

    @NonNull
    /* renamed from: R */
    public ArrayList<Scope> mo24435R() {
        return new ArrayList<>(this.f8113l);
    }

    @Nullable
    /* renamed from: S */
    public String mo24436S() {
        return this.f8118q;
    }

    /* renamed from: T */
    public boolean mo24437T() {
        return this.f8117p;
    }

    /* renamed from: U */
    public boolean mo24438U() {
        return this.f8115n;
    }

    /* renamed from: V */
    public boolean mo24439V() {
        return this.f8116o;
    }

    @NonNull
    /* renamed from: b0 */
    public final String mo24440b0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f8113l, f8105B);
            Iterator<Scope> it = this.f8113l.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo24526P());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f8114m;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f8115n);
            jSONObject.put("forceCodeForRefreshToken", this.f8117p);
            jSONObject.put("serverAuthRequested", this.f8116o);
            if (!TextUtils.isEmpty(this.f8118q)) {
                jSONObject.put("serverClientId", this.f8118q);
            }
            if (!TextUtils.isEmpty(this.f8119r)) {
                jSONObject.put("hostedDomain", this.f8119r);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo24442f()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f8120s     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f8120s     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f8113l     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo24435R()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f8113l     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo24435R()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f8114m     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo24442f()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo24442f()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f8118q     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo24436S()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f8118q     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo24436S()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f8117p     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo24437T()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f8115n     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo24438U()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f8116o     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo24439V()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f8121t     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo24434Q()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* renamed from: f */
    public Account mo24442f() {
        return this.f8114m;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f8113l;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).mo24526P());
        }
        Collections.sort(arrayList);
        C3258a aVar = new C3258a();
        aVar.mo20284a(arrayList);
        aVar.mo20284a(this.f8114m);
        aVar.mo20284a(this.f8118q);
        aVar.mo20286c(this.f8117p);
        aVar.mo20286c(this.f8115n);
        aVar.mo20286c(this.f8116o);
        aVar.mo20284a(this.f8121t);
        return aVar.mo20285b();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8112e);
        C3514a.m8974w(parcel, 2, mo24435R(), false);
        C3514a.m8968q(parcel, 3, mo24442f(), i, false);
        C3514a.m8954c(parcel, 4, mo24438U());
        C3514a.m8954c(parcel, 5, mo24439V());
        C3514a.m8954c(parcel, 6, mo24437T());
        C3514a.m8970s(parcel, 7, mo24436S(), false);
        C3514a.m8970s(parcel, 8, this.f8119r, false);
        C3514a.m8974w(parcel, 9, mo24433P(), false);
        C3514a.m8970s(parcel, 10, mo24434Q(), false);
        C3514a.m8953b(parcel, a);
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C4069a {

        /* renamed from: a */
        public Set<Scope> f8122a = new HashSet();

        /* renamed from: b */
        public boolean f8123b;

        /* renamed from: c */
        public boolean f8124c;

        /* renamed from: d */
        public boolean f8125d;
        @Nullable

        /* renamed from: e */
        public String f8126e;
        @Nullable

        /* renamed from: f */
        public Account f8127f;
        @Nullable

        /* renamed from: g */
        public String f8128g;

        /* renamed from: h */
        public Map<Integer, GoogleSignInOptionsExtensionParcelable> f8129h = new HashMap();
        @Nullable

        /* renamed from: i */
        public String f8130i;

        public C4069a() {
        }

        @NonNull
        /* renamed from: a */
        public GoogleSignInOptions mo24445a() {
            if (this.f8122a.contains(GoogleSignInOptions.f8104A) && this.f8122a.contains(GoogleSignInOptions.f8111z)) {
                this.f8122a.remove(GoogleSignInOptions.f8111z);
            }
            if (this.f8125d && (this.f8127f == null || !this.f8122a.isEmpty())) {
                mo24447c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f8122a), this.f8127f, this.f8125d, this.f8123b, this.f8124c, this.f8126e, this.f8128g, this.f8129h, this.f8130i, (C3283i) null);
        }

        @NonNull
        /* renamed from: b */
        public C4069a mo24446b() {
            this.f8122a.add(GoogleSignInOptions.f8109x);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C4069a mo24447c() {
            this.f8122a.add(GoogleSignInOptions.f8110y);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C4069a mo24448d(@NonNull String str) {
            this.f8125d = true;
            mo24454j(str);
            this.f8126e = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C4069a mo24449e() {
            this.f8122a.add(GoogleSignInOptions.f8108w);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C4069a mo24450f(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f8122a.add(scope);
            this.f8122a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        /* renamed from: g */
        public C4069a mo24451g(@NonNull String str) {
            mo24452h(str, false);
            return this;
        }

        @NonNull
        /* renamed from: h */
        public C4069a mo24452h(@NonNull String str, boolean z) {
            this.f8123b = true;
            mo24454j(str);
            this.f8126e = str;
            this.f8124c = z;
            return this;
        }

        @NonNull
        /* renamed from: i */
        public C4069a mo24453i(@NonNull String str) {
            this.f8130i = str;
            return this;
        }

        /* renamed from: j */
        public final String mo24454j(String str) {
            C3495o.m8904f(str);
            String str2 = this.f8126e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            C3495o.m8900b(z, "two different server client ids provided");
            return str;
        }

        public C4069a(@NonNull GoogleSignInOptions googleSignInOptions) {
            C3495o.m8908j(googleSignInOptions);
            this.f8122a = new HashSet(googleSignInOptions.f8113l);
            this.f8123b = googleSignInOptions.f8116o;
            this.f8124c = googleSignInOptions.f8117p;
            this.f8125d = googleSignInOptions.f8115n;
            this.f8126e = googleSignInOptions.f8118q;
            this.f8127f = googleSignInOptions.f8114m;
            this.f8128g = googleSignInOptions.f8119r;
            this.f8129h = GoogleSignInOptions.m10812i0(googleSignInOptions.f8120s);
            this.f8130i = googleSignInOptions.f8121t;
        }
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, @Nullable String str3) {
        this.f8112e = i;
        this.f8113l = arrayList;
        this.f8114m = account;
        this.f8115n = z;
        this.f8116o = z2;
        this.f8117p = z3;
        this.f8118q = str;
        this.f8119r = str2;
        this.f8120s = new ArrayList<>(map.values());
        this.f8121t = str3;
    }
}
