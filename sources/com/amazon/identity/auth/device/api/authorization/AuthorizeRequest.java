package com.amazon.identity.auth.device.api.authorization;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.utils.LWAConstants$AUTHORIZE_BUNDLE_KEY;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1365b;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1369d;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1372f;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;
import p040c.p048b.p049a.p050a.p051a.p062o.C1451e;

public final class AuthorizeRequest extends C1451e<C1365b, AuthorizeResult, AuthCancellation, AuthError> {

    /* renamed from: l */
    public List<C1369d> f6876l = new LinkedList();

    /* renamed from: m */
    public List<C1372f> f6877m = new LinkedList();

    /* renamed from: n */
    public GrantType f6878n = GrantType.ACCESS_TOKEN;

    /* renamed from: o */
    public String f6879o;

    /* renamed from: p */
    public String f6880p;

    /* renamed from: q */
    public boolean f6881q = true;

    /* renamed from: r */
    public boolean f6882r = true;

    public enum GrantType {
        ACCESS_TOKEN,
        AUTHORIZATION_CODE
    }

    /* renamed from: com.amazon.identity.auth.device.api.authorization.AuthorizeRequest$a */
    public static final class C3801a extends C1451e.C1452a<AuthorizeRequest> {

        /* renamed from: b */
        public final AuthorizeRequest f6883b = new AuthorizeRequest(this.f626a);

        public C3801a(C1373a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public C3801a mo21409a(C1369d... dVarArr) {
            this.f6883b.mo21401m(dVarArr);
            return this;
        }

        /* renamed from: b */
        public AuthorizeRequest mo21410b() {
            return this.f6883b;
        }
    }

    public AuthorizeRequest(C1373a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public final String mo15072d() {
        return "com.amazon.identity.auth.device.authorization.request.authorize";
    }

    /* renamed from: i */
    public final Class<C1365b> mo15307i() {
        return C1365b.class;
    }

    /* renamed from: k */
    public final Bundle mo15309k() {
        Bundle bundle = new Bundle();
        String[] strArr = new String[this.f6876l.size()];
        for (int i = 0; i < this.f6876l.size(); i++) {
            strArr[i] = this.f6876l.get(i).getName();
        }
        bundle.putStringArray("requestedScopes", strArr);
        bundle.putBoolean("shouldReturnUserData", mo21407s());
        bundle.putBoolean(LWAConstants$AUTHORIZE_BUNDLE_KEY.SHOW_PROGRESS.val, this.f6881q);
        return bundle;
    }

    /* renamed from: m */
    public void mo21401m(C1369d... dVarArr) {
        Collections.addAll(this.f6876l, dVarArr);
    }

    /* renamed from: n */
    public String mo21402n() {
        return this.f6879o;
    }

    /* renamed from: o */
    public String mo21403o() {
        return this.f6880p;
    }

    /* renamed from: p */
    public GrantType mo21404p() {
        return this.f6878n;
    }

    /* renamed from: q */
    public List<C1369d> mo21405q() {
        return this.f6876l;
    }

    /* renamed from: r */
    public List<C1372f> mo21406r() {
        return this.f6877m;
    }

    /* renamed from: s */
    public boolean mo21407s() {
        return this.f6882r;
    }

    /* renamed from: t */
    public boolean mo21408t() {
        return this.f6881q;
    }
}
