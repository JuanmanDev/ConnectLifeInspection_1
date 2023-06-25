package com.amazon.identity.auth.device.interactive;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import p040c.p048b.p049a.p050a.p051a.p062o.C1448b;
import p040c.p048b.p049a.p050a.p051a.p062o.C1454g;
import p040c.p048b.p049a.p050a.p051a.p062o.C1455h;

@SuppressLint({"NewApi"})
public final class WorkflowFragment extends Fragment implements C1455h {

    /* renamed from: e */
    public C1448b f6948e = new C1448b(this);

    /* renamed from: f */
    public Object mo15313f(Bundle bundle) {
        return getFragmentManager().getFragment(bundle, "wrappedFragment");
    }

    public C1454g getState() {
        return this.f6948e;
    }

    /* renamed from: n */
    public Object mo15315n() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getApplicationContext();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6948e.mo15302f(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f6948e.mo15304h(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p */
    public Object mo15316p() {
        return getActivity();
    }
}
