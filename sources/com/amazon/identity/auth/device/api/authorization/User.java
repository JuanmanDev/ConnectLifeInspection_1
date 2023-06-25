package com.amazon.identity.auth.device.api.authorization;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.utils.LWAConstants$PROFILE_BUNDLE_KEY;
import java.util.HashMap;
import java.util.Map;
import p040c.p048b.p049a.p050a.p051a.p052h.C1361a;
import p040c.p048b.p049a.p050a.p051a.p056j.C1390h;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new C3803a();

    /* renamed from: l */
    public static final String f6892l = User.class.getName();

    /* renamed from: e */
    public final Map<String, String> f6893e;

    /* renamed from: com.amazon.identity.auth.device.api.authorization.User$a */
    public static class C3803a implements Parcelable.Creator<User> {
        /* renamed from: a */
        public User createFromParcel(Parcel parcel) {
            return new User(parcel, (C3803a) null);
        }

        /* renamed from: b */
        public User[] newArray(int i) {
            return new User[i];
        }
    }

    /* renamed from: com.amazon.identity.auth.device.api.authorization.User$b */
    public static class C3804b implements C1462a {

        /* renamed from: e */
        public final /* synthetic */ C1361a f6894e;

        public C3804b(C1361a aVar) {
            this.f6894e = aVar;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            this.f6894e.mo15065a(authError);
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            this.f6894e.onSuccess(User.m9455c(bundle.getBundle(AuthzConstants$BUNDLE_KEY.PROFILE.val)));
        }
    }

    public /* synthetic */ User(Parcel parcel, C3803a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static void m9453a(Context context, C1361a<User, AuthError> aVar) {
        m9454b(context, C1390h.m398e(context), aVar);
    }

    /* renamed from: b */
    public static void m9454b(Context context, C1390h hVar, C1361a<User, AuthError> aVar) {
        String str = f6892l;
        C1485a.m832e(str, context.getPackageName() + " calling fetch");
        Bundle bundle = new Bundle();
        bundle.putBoolean(LWAConstants$PROFILE_BUNDLE_KEY.FAIL_ON_INSUFFICIENT_SCOPE.val, true);
        hVar.mo15122f(context, bundle, new C3804b(aVar));
    }

    /* renamed from: c */
    public static User m9455c(Bundle bundle) {
        HashMap hashMap = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return new User((Map<String, String>) hashMap);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        Map<String, String> map = this.f6893e;
        if (map == null) {
            if (user.f6893e != null) {
                return false;
            }
        } else if (!map.equals(user.f6893e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map<String, String> map = this.f6893e;
        return 31 + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return String.format("%s={userInfo=%s}", new Object[]{super.toString(), this.f6893e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6893e.size());
        for (Map.Entry next : this.f6893e.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public User(Map<String, String> map) {
        this.f6893e = map;
    }

    public User(Parcel parcel) {
        this.f6893e = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f6893e.put(parcel.readString(), parcel.readString());
        }
    }
}
